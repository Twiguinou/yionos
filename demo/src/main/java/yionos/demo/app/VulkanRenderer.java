package yionos.demo.app;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.joml.Matrix4d;
import vulkan.*;
import yionos.demo.StackAllocator;
import yionos.demo.WindowProcessor;
import yionos.demo.app.scene.ObjectRenderer;
import yionos.demo.app.scene.StaticGridRenderer;
import yionos.demo.rendering.CommandPool;
import yionos.demo.rendering.DescriptorPool;
import yionos.demo.rendering.LogicalDevice;
import yionos.demo.rendering.Swapchain;
import yionos.demo.rendering.VulkanContext;
import yionos.demo.rendering.VulkanException;
import yionos.demo.rendering.VulkanImage;
import yionos.demo.rendering.VulkanRenderContext;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static vulkan.VulkanCore.*;
import static vulkan.VkStructureType.*;
import static vulkan.VkValidationFeatureEnableEXT.*;
import static yionos.demo.rendering.VulkanHelpers.*;
import static vulkan.VkQueueFlagBits.*;
import static vulkan.VkImageTiling.*;
import static vulkan.VkResult.*;
import static vulkan.VkFormat.*;
import static vulkan.VkPipelineStageFlagBits.*;
import static vulkan.VkImageUsageFlagBits.*;
import static vulkan.VkImageAspectFlagBits.*;
import static vulkan.VkComponentSwizzle.*;
import static vulkan.VkPipelineBindPoint.*;
import static vulkan.VkSubpassContents.*;
import static vulkan.VkDescriptorType.*;
import static vma.VmaMemoryUsage.*;
import static java.lang.foreign.MemorySegment.NULL;

public class VulkanRenderer
{
    private static final Logger gRendererLogger = LogManager.getLogger("Vulkan Renderer");
    public static final int gFrameCount = 2;

    private final VulkanRenderContext m_context;
    private final LogicalDevice m_logicalDevice;
    private final LogicalDevice.Queue m_graphicsQueue, m_presentQueue, m_transferQueue;
    private VulkanImage.Allocated m_colorImage, m_depthImage;
    private final Swapchain m_swapchain;
    private final int m_sampleCount;
    private final RenderPass m_renderPass;
    private final VulkanSync m_syncObjects;
    private final CommandBufferFlow m_renderingCommandBuffers;
    private int m_currentFrame = 0, m_vkFrameIndex = -1;
    private VkCommandBuffer m_frameCommandBuffer;
    private final CommandPool m_uploadCommandPool;
    private final DescriptorPool m_descriptorPool;

    private final Shaders m_shaders;
    private final PipelineLayouts m_pipelineLayouts;
    private final Pipelines m_pipelines;
    private final DescriptorSetLayouts m_descriptorSetLayouts;

    private final StaticGridRenderer m_gridRenderer;
    private final ObjectRenderer m_cubeRenderer;
    private final ObjectRenderer m_sphereRenderer;

    public VulkanRenderer(WindowProcessor windowProc, int sampleCount, boolean debug)
    {
        Set<String> instanceExtensions = new HashSet<>(Arrays.asList(WindowProcessor.getVulkanExtensions()));
        if (debug) instanceExtensions.add("VK_EXT_debug_utils");

        String[] instanceLayers = debug ? new String[] {
                "VK_LAYER_KHRONOS_validation"
        } : new String[0];

        int[] validationFeatures = debug ? new int[] {
                VK_VALIDATION_FEATURE_ENABLE_BEST_PRACTICES_EXT,
                VK_VALIDATION_FEATURE_ENABLE_SYNCHRONIZATION_VALIDATION_EXT,
                VK_VALIDATION_FEATURE_ENABLE_GPU_ASSISTED_EXT
        } : new int[0];

        String[] deviceExtensions = new String[] {
                "VK_KHR_swapchain",
                "VK_KHR_maintenance1"
        };

        VulkanContext.AppInfo appInfo = new VulkanContext.AppInfo("yionos", VK_MAKE_API_VERSION(0, 1, 0, 0), "yionos-eng", VK_MAKE_API_VERSION(0, 1, 0, 0), VK_API_VERSION_1_3);
        this.m_context = new VulkanRenderContext(appInfo, instanceLayers, instanceExtensions.toArray(String[]::new), validationFeatures, windowProc);
        if (debug) this.m_context.attachDebugMessenger(VulkanContext::defaultDebugMessenger);
        this.m_context.findSuitableDevice((first, second) -> first.isDedicated() ? first : second);
        gRendererLogger.info(STR."Selected physical device : \{this.m_context.physicalDevice().name()}");

        try (Arena arena = Arena.ofConfined())
        {
            LogicalDevice.QueueDescriptor[] queueDescriptors = selectQueueFamilies(this.m_context.physicalDevice().handle(), this.m_context.surface());

            VkPhysicalDeviceShaderDrawParametersFeatures shaderDrawParametersFeatures = new VkPhysicalDeviceShaderDrawParametersFeatures(arena);
            shaderDrawParametersFeatures.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_DRAW_PARAMETERS_FEATURES);
            shaderDrawParametersFeatures.shaderDrawParameters(VK_TRUE);

            VkPhysicalDeviceFeatures2 features2 = new VkPhysicalDeviceFeatures2(arena);
            features2.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FEATURES_2);
            features2.pNext(shaderDrawParametersFeatures.ptr());
            features2.features(f ->
            {
                f.samplerAnisotropy(VK_TRUE);
                f.sampleRateShading(VK_TRUE);
                f.depthClamp(VK_TRUE);
            });

            this.m_logicalDevice = new LogicalDevice(this.m_context.physicalDevice(), queueDescriptors, new String[0], deviceExtensions, features2.ptr(), NULL);

            this.m_graphicsQueue = this.m_logicalDevice.queue(0);
            this.m_presentQueue = this.m_logicalDevice.queue(1);
            this.m_transferQueue = this.m_logicalDevice.queue(2);
        }

        int maxMsaaSamples = getMaxUsableSampleCount(this.m_logicalDevice.physicalDevice.properties());
        this.m_sampleCount = Math.min(sampleCount, maxMsaaSamples);
        gRendererLogger.info(STR."MSAA sample count: \{this.m_sampleCount} | Device supports: \{maxMsaaSamples}");

        this.m_swapchain = new Swapchain(this.m_logicalDevice.handle());
        this.initSwapchain();

        this.m_renderPass = new RenderPass(this.m_logicalDevice.handle(), this.m_swapchain.surfaceFormat().format(), this.m_sampleCount);
        this.initRenderingResources();

        this.m_renderingCommandBuffers = new CommandBufferFlow(this.m_logicalDevice.handle(), this.m_graphicsQueue.family(), gFrameCount);
        this.m_syncObjects = VulkanSync.create(this.m_logicalDevice.handle(), gFrameCount);
        this.m_uploadCommandPool = new CommandPool(this.m_logicalDevice.handle(), 0, this.m_transferQueue.family());

        this.m_descriptorPool = new DescriptorPool(this.m_logicalDevice.handle(), 0, new DescriptorPool.Size[] {
                new DescriptorPool.Size(VK_DESCRIPTOR_TYPE_STORAGE_BUFFER, 10)
        }, gFrameCount);

        this.m_shaders = Shaders.create(this.m_logicalDevice.handle());

        this.m_descriptorSetLayouts = DescriptorSetLayouts.create(this.m_logicalDevice.handle());
        this.m_pipelineLayouts = PipelineLayouts.create(this.m_logicalDevice.handle(), this.m_descriptorSetLayouts);
        this.m_pipelines = Pipelines.create(this.m_logicalDevice.handle(), this.m_renderPass.handle(), this.m_pipelineLayouts, this.m_shaders, this.m_sampleCount);

        this.m_gridRenderer = new StaticGridRenderer(this);
        this.m_cubeRenderer = new ObjectRenderer(this, ObjectRenderer.Type.CUBE);
        this.m_sphereRenderer = new ObjectRenderer(this, ObjectRenderer.Type.SPHERE);
    }

    private static LogicalDevice.QueueDescriptor[] selectQueueFamilies(VkPhysicalDevice physicalDevice, MemorySegment surface)
    {
        try (Arena arena = Arena.ofConfined())
        {
            MemorySegment pFamilyCount = arena.allocate(ValueLayout.JAVA_INT);
            vkGetPhysicalDeviceQueueFamilyProperties(physicalDevice, pFamilyCount, NULL);
            int familyCount = pFamilyCount.get(ValueLayout.JAVA_INT, 0);
            MemorySegment pFamilyProperties = arena.allocateArray(VkQueueFamilyProperties.gStructLayout, familyCount);
            vkGetPhysicalDeviceQueueFamilyProperties(physicalDevice, pFamilyCount, pFamilyProperties);

            MemorySegment pSupported = arena.allocate(ValueLayout.JAVA_INT);
            LogicalDevice.QueueDescriptor graphicsQueueDescriptor = null, presentQueueDescriptor = null, transferQueueDescriptor = null;
            int lastPresentQueueFamily = -1;
            for (int i = 0; i < familyCount; i++)
            {
                VkQueueFamilyProperties properties = VkQueueFamilyProperties.getAtIndex(pFamilyProperties, i);
                VulkanException.check(vkGetPhysicalDeviceSurfaceSupportKHR(physicalDevice, i, surface, pSupported));
                boolean presentQueue = pSupported.get(ValueLayout.JAVA_INT, 0) != VK_FALSE;
                if (presentQueue)
                {
                    lastPresentQueueFamily = i;
                }

                if ((properties.queueFlags() & VK_QUEUE_GRAPHICS_BIT) != 0)
                {
                    if (presentQueueDescriptor != null)
                    {
                        continue;
                    }

                    if (presentQueue)
                    {
                        graphicsQueueDescriptor = new LogicalDevice.QueueDescriptor(i, 1.0f);
                        presentQueueDescriptor = graphicsQueueDescriptor;
                    }
                    else if (graphicsQueueDescriptor == null)
                    {
                        graphicsQueueDescriptor = new LogicalDevice.QueueDescriptor(i, 1.0f);
                    }
                }
                else if ((properties.queueFlags() & VK_QUEUE_TRANSFER_BIT) != 0 && transferQueueDescriptor == null)
                {
                    transferQueueDescriptor = new LogicalDevice.QueueDescriptor(i, 1.0f);
                }
            }

            if (presentQueueDescriptor == null)
            {
                presentQueueDescriptor = new LogicalDevice.QueueDescriptor(lastPresentQueueFamily, 1.0f);
            }

            return new LogicalDevice.QueueDescriptor[] {
                    graphicsQueueDescriptor, presentQueueDescriptor, transferQueueDescriptor
            };
        }
    }

    private void resetSwapchainAndResources()
    {
        VulkanException.check(vkWaitForFences(this.m_logicalDevice.handle(), gFrameCount, this.m_syncObjects.fences(), VK_TRUE, Long.MAX_VALUE));

        this.m_renderPass.destroyFramebuffers();
        this.m_depthImage.dispose();
        this.m_colorImage.dispose();

        this.initSwapchain();
        this.initRenderingResources();
    }

    private void initSwapchain()
    {
        this.m_context.querySurfaceProperties();
        this.m_swapchain.initialize(this.m_context, this.m_graphicsQueue.family(), this.m_presentQueue.family(), true);
    }

    private void initRenderingResources()
    {
        this.m_colorImage = new VulkanImage.Allocated(this.m_logicalDevice, this.m_swapchain.width(), this.m_swapchain.height(), this.m_swapchain.surfaceFormat().format(), VK_IMAGE_TILING_OPTIMAL,
                VK_IMAGE_USAGE_TRANSIENT_ATTACHMENT_BIT | VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT, false, 1, this.m_sampleCount, VK_IMAGE_ASPECT_COLOR_BIT,
                VK_COMPONENT_SWIZZLE_IDENTITY, VK_COMPONENT_SWIZZLE_IDENTITY, VK_COMPONENT_SWIZZLE_IDENTITY, VK_COMPONENT_SWIZZLE_IDENTITY, VMA_MEMORY_USAGE_GPU_ONLY);
        this.m_depthImage = new VulkanImage.Allocated(this.m_logicalDevice, this.m_swapchain.width(), this.m_swapchain.height(), VK_FORMAT_D32_SFLOAT, VK_IMAGE_TILING_OPTIMAL, VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT, false, 1, this.m_sampleCount, VK_IMAGE_ASPECT_DEPTH_BIT,
                VK_COMPONENT_SWIZZLE_IDENTITY, VK_COMPONENT_SWIZZLE_IDENTITY, VK_COMPONENT_SWIZZLE_IDENTITY, VK_COMPONENT_SWIZZLE_IDENTITY, VMA_MEMORY_USAGE_GPU_ONLY);

        try (Arena arena = StackAllocator.stackPush())
        {
            MemorySegment pImageViews = arena.allocateArray(ValueLayout.ADDRESS, this.m_swapchain.images().length);
            for (int i = 0; i < this.m_swapchain.images().length; i++)
            {
                pImageViews.setAtIndex(ValueLayout.ADDRESS, i, this.m_swapchain.images()[i].view());
            }

            this.m_renderPass.createFramebuffers(this.m_swapchain.images().length, pImageViews, this.m_swapchain.width(), this.m_swapchain.height(), this.m_colorImage.view(), this.m_depthImage.view());
        }
    }

    private void assertRenderContext()
    {
        if (this.m_vkFrameIndex == -1)
        {
            throw new IllegalStateException("Vulkan render frame is not open.");
        }
    }

    public LogicalDevice logicalDevice()
    {
        return this.m_logicalDevice;
    }

    public LogicalDevice.Queue graphicsQueue()
    {
        return this.m_graphicsQueue;
    }

    public LogicalDevice.Queue transferQueue()
    {
        return this.m_transferQueue;
    }

    public CommandPool uploadCommandPool()
    {
        return this.m_uploadCommandPool;
    }

    public PipelineLayouts pipelineLayouts()
    {
        return this.m_pipelineLayouts;
    }

    public Pipelines pipelines()
    {
        return this.m_pipelines;
    }

    public DescriptorSetLayouts descriptorSetLayouts()
    {
        return this.m_descriptorSetLayouts;
    }

    public DescriptorPool descriptorPool()
    {
        return this.m_descriptorPool;
    }

    public int currentFrame()
    {
        return this.m_currentFrame;
    }

    public void beginRenderFrame()
    {
        try (Arena arena = StackAllocator.stackPush())
        {
            MemorySegment pCurrentFence = arena.allocate(ValueLayout.ADDRESS, this.m_syncObjects.fence(this.m_currentFrame));
            VulkanException.check(vkWaitForFences(this.m_logicalDevice.handle(), 1, pCurrentFence, VK_TRUE, Long.MAX_VALUE));
            VulkanException.check(vkResetFences(this.m_logicalDevice.handle(), 1, pCurrentFence));

            MemorySegment pFrameIndex = arena.allocate(ValueLayout.JAVA_INT);
            int swapchainMessage = this.m_swapchain.acquireNextImage(this.m_syncObjects.imageAcquiredSemaphore(this.m_currentFrame), pFrameIndex);
            if (swapchainMessage == VK_ERROR_OUT_OF_DATE_KHR || swapchainMessage == VK_SUBOPTIMAL_KHR)
            {
                this.resetSwapchainAndResources();
            }
            else
            {
                VulkanException.check(swapchainMessage);
            }

            this.m_vkFrameIndex = pFrameIndex.get(ValueLayout.JAVA_INT, 0);

            this.m_renderingCommandBuffers.reset(this.m_currentFrame);

            this.m_frameCommandBuffer = this.m_renderingCommandBuffers.pool(this.m_currentFrame);
            beginCommandBuffer(this.m_frameCommandBuffer, 0);

            MemorySegment pClearValues = arena.allocateArray(VkClearValue.gStructLayout, 2);
            VkClearValue.getAtIndex(pClearValues, 0).color(value ->
            {
                value.float32(0, 0.0f);
                value.float32(1, 0.0f);
                value.float32(2, 0.0f);
                value.float32(3, 1.0f);
            });
            VkClearValue.getAtIndex(pClearValues, 1).depthStencil(value ->
            {
                value.depth(1.0f);
                value.stencil(0);
            });

            VkRenderPassBeginInfo renderPassBeginInfo = new VkRenderPassBeginInfo(arena);
            renderPassBeginInfo.sType(VK_STRUCTURE_TYPE_RENDER_PASS_BEGIN_INFO);
            renderPassBeginInfo.renderPass(this.m_renderPass.handle());
            renderPassBeginInfo.renderArea().extent(extent ->
            {
                extent.width(this.m_swapchain.width());
                extent.height(this.m_swapchain.height());
            });
            renderPassBeginInfo.clearValueCount(2);
            renderPassBeginInfo.pClearValues(pClearValues);
            renderPassBeginInfo.framebuffer(this.m_renderPass.framebuffer(this.m_vkFrameIndex));

            vkCmdBeginRenderPass(this.m_frameCommandBuffer, renderPassBeginInfo.ptr(), VK_SUBPASS_CONTENTS_INLINE);

            VkViewport viewport = new VkViewport(arena);
            viewport.x(0.0f);
            viewport.y((float)this.m_swapchain.height());
            viewport.width((float)this.m_swapchain.width());
            viewport.height((float)-this.m_swapchain.height());
            viewport.minDepth(0.0f);
            viewport.maxDepth(1.0f);

            VkRect2D scissor = new VkRect2D(arena);
            scissor.extent(extent ->
            {
                extent.width(this.m_swapchain.width());
                extent.height(this.m_swapchain.height());
            });

            vkCmdSetViewport(this.m_frameCommandBuffer, 0, 1, viewport.ptr());
            vkCmdSetScissor(this.m_frameCommandBuffer, 0, 1, scissor.ptr());
        }
    }

    public void endRenderFrame()
    {
        this.assertRenderContext();
        try (Arena arena = StackAllocator.stackPush())
        {
            vkCmdEndRenderPass(this.m_frameCommandBuffer);
            VulkanException.check(vkEndCommandBuffer(this.m_frameCommandBuffer));

            MemorySegment pRenderCompleteSemaphore = arena.allocate(ValueLayout.ADDRESS, this.m_syncObjects.renderCompleteSemaphore(this.m_currentFrame));

            VkSubmitInfo submitInfo = new VkSubmitInfo(arena);
            submitInfo.sType(VK_STRUCTURE_TYPE_SUBMIT_INFO);
            submitInfo.waitSemaphoreCount(1);
            submitInfo.pWaitSemaphores(arena.allocate(ValueLayout.ADDRESS, this.m_syncObjects.imageAcquiredSemaphore(this.m_currentFrame)));
            submitInfo.pWaitDstStageMask(arena.allocate(ValueLayout.JAVA_INT, VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT));
            submitInfo.commandBufferCount(1);
            submitInfo.pCommandBuffers(arena.allocate(ValueLayout.ADDRESS, this.m_frameCommandBuffer.handle()));
            submitInfo.signalSemaphoreCount(1);
            submitInfo.pSignalSemaphores(pRenderCompleteSemaphore);

            VulkanException.check(vkQueueSubmit(this.m_graphicsQueue.handle(), 1, submitInfo.ptr(), this.m_syncObjects.fence(this.m_currentFrame)));
            this.m_renderingCommandBuffers.offer(this.m_currentFrame, this.m_frameCommandBuffer);

            VkPresentInfoKHR presentInfo = new VkPresentInfoKHR(arena);
            presentInfo.sType(VK_STRUCTURE_TYPE_PRESENT_INFO_KHR);
            presentInfo.waitSemaphoreCount(1);
            presentInfo.pWaitSemaphores(pRenderCompleteSemaphore);
            presentInfo.swapchainCount(1);
            presentInfo.pSwapchains(arena.allocate(ValueLayout.ADDRESS, this.m_swapchain.handle()));
            presentInfo.pImageIndices(arena.allocate(ValueLayout.JAVA_INT, this.m_vkFrameIndex));

            int swapchainMessage = vkQueuePresentKHR(this.m_presentQueue.handle(), presentInfo.ptr());
            if (swapchainMessage == VK_ERROR_OUT_OF_DATE_KHR)
            {
                this.resetSwapchainAndResources();
            }
            else
            {
                VulkanException.check(swapchainMessage);
            }
        }

        this.m_currentFrame = (this.m_currentFrame + 1) % gFrameCount;
        this.m_vkFrameIndex = -1;
    }

    public void bindGraphicsDescriptorSets(MemorySegment layout, int firstSet, int descriptorSetCount, MemorySegment pDescriptorSets, int dynamicOffsetCount, MemorySegment pDynamicOffsets)
    {
        vkCmdBindDescriptorSets(this.m_frameCommandBuffer, VK_PIPELINE_BIND_POINT_GRAPHICS, layout, firstSet, descriptorSetCount, pDescriptorSets, dynamicOffsetCount, pDynamicOffsets);
    }

    public void bindGraphicsPipeline(MemorySegment pipeline)
    {
        this.assertRenderContext();
        vkCmdBindPipeline(this.m_frameCommandBuffer, VK_PIPELINE_BIND_POINT_GRAPHICS, pipeline);
    }

    public void renderStaticGrid(Camera camera, Matrix4d transform)
    {
        this.assertRenderContext();
        this.m_gridRenderer.render(this.m_frameCommandBuffer, camera, transform);
    }

    public void renderObject(Camera camera, Matrix4d transform, ObjectRenderer.Type type)
    {
        this.assertRenderContext();
        switch (type)
        {
            case CUBE -> this.m_cubeRenderer.render(this.m_frameCommandBuffer, camera, transform);
            case SPHERE -> this.m_sphereRenderer.render(this.m_frameCommandBuffer, camera, transform);
            default -> throw new IllegalArgumentException(STR."Unsupported object type: \{type.name()}");
        }
    }

    public void renderObjectsInstanced(Camera camera, int count, ObjectRenderer.Type type)
    {
        this.assertRenderContext();
        switch (type)
        {
            case CUBE -> this.m_cubeRenderer.renderInstanced(this.m_frameCommandBuffer, camera, count);
            case SPHERE -> this.m_sphereRenderer.renderInstanced(this.m_frameCommandBuffer, camera, count);
            default -> throw new IllegalArgumentException(STR."Unsupported object type: \{type.name()}");
        }
    }

    public void deviceWaitIdle() throws VulkanException
    {
        VulkanException.check(vkDeviceWaitIdle(this.m_logicalDevice.handle()));
    }

    public void destroy()
    {
        this.deviceWaitIdle();

        this.m_gridRenderer.dispose();
        this.m_cubeRenderer.dispose();
        this.m_sphereRenderer.dispose();

        this.m_pipelines.dispose();
        this.m_pipelineLayouts.dispose();
        this.m_descriptorSetLayouts.dispose();

        this.m_descriptorPool.dispose();

        this.m_uploadCommandPool.dispose();
        this.m_renderingCommandBuffers.dispose();
        this.m_syncObjects.dispose();

        this.m_shaders.dispose();

        this.m_renderPass.dispose();
        this.m_colorImage.dispose();
        this.m_depthImage.dispose();
        this.m_swapchain.dispose();

        this.m_logicalDevice.dispose();
        this.m_context.dispose();
    }
}
