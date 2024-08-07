package yionos.demo.app;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.joml.Matrix4d;
import vulkan.*;
import yionos.demo.Disposable;
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

import javax.annotation.Nullable;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
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
import static vulkan.VkImageType.*;
import static vulkan.VkImageLayout.*;
import static vulkan.VkSharingMode.*;
import static vulkan.VkImageViewType.*;
import static vulkan.VkSampleCountFlagBits.*;
import static vulkan.VkFormat.*;
import static vulkan.VkPipelineStageFlagBits.*;
import static vulkan.VkImageUsageFlagBits.*;
import static vulkan.VkFormatFeatureFlagBits.*;
import static vulkan.VkImageAspectFlagBits.*;
import static vulkan.VkDescriptorPoolCreateFlagBits.*;
import static vulkan.VkComponentSwizzle.*;
import static vulkan.VkPipelineBindPoint.*;
import static vulkan.VkSubpassContents.*;
import static vulkan.VkDescriptorType.*;
import static vulkan.VkAccessFlagBits.*;
import static vma.VmaMemoryUsage.*;
import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemorySegment.NULL;

public class VulkanRenderer implements Disposable
{
    private static final Logger gRendererLogger = LogManager.getLogger("Vulkan Renderer");
    public static final int gFrameCount = 2;

    private final VulkanRenderContext m_context;
    private final LogicalDevice m_logicalDevice;
    private final LogicalDevice.Queue m_graphicsQueue, m_presentQueue;
    private @Nullable VulkanImage m_msaaImage;
    private VulkanImage m_depthImage;
    private final int m_depthFormat;
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
        instanceExtensions.add("VK_KHR_get_physical_device_properties2");
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

        VulkanContext.PhysicalDevice physicalDevice = this.m_context.physicalDevice().orElseThrow();
        gRendererLogger.info("Selected physical device : {}", physicalDevice.name());

        this.m_depthFormat = selectDepthFormat(physicalDevice.handle());

        try (Arena arena = Arena.ofConfined())
        {
            LogicalDevice.QueueDescriptor[] queueDescriptors = selectQueueFamilies(physicalDevice.handle(), this.m_context.surface());

            VkPhysicalDeviceShaderDrawParametersFeatures shaderDrawParametersFeatures = new VkPhysicalDeviceShaderDrawParametersFeatures(arena);
            shaderDrawParametersFeatures.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_DRAW_PARAMETERS_FEATURES);
            shaderDrawParametersFeatures.shaderDrawParameters(VK_TRUE);

            VkPhysicalDeviceFeatures2 features2 = new VkPhysicalDeviceFeatures2(arena);
            features2.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FEATURES_2);
            features2.pNext(shaderDrawParametersFeatures.ptr());
            features2.features(f ->
            {
                f.fillModeNonSolid(physicalDevice.features().fillModeNonSolid());
                f.wideLines(physicalDevice.features().wideLines());
                f.shaderStorageImageMultisample(VK_TRUE);
                f.samplerAnisotropy(VK_TRUE);
                f.sampleRateShading(VK_TRUE);
                f.depthClamp(VK_TRUE);
            });

            this.m_logicalDevice = new LogicalDevice(physicalDevice, queueDescriptors, new String[0], deviceExtensions, features2.ptr(), NULL);

            this.m_graphicsQueue = this.m_logicalDevice.queue(0);
            this.m_presentQueue = this.m_logicalDevice.queue(1);
        }

        int maxMsaaSamples = getMaxUsableSampleCount(this.m_logicalDevice.physicalDevice.properties());
        this.m_sampleCount = Math.min(sampleCount, maxMsaaSamples);
        gRendererLogger.info("MSAA sample count: {} | Device supports: {}", this.m_sampleCount, maxMsaaSamples);

        this.m_swapchain = new Swapchain(this.m_logicalDevice.handle());
        this.initSwapchain();

        this.m_renderPass = new RenderPass(this.m_logicalDevice.handle(), this.m_swapchain.surfaceFormat().orElseThrow().format(), this.m_depthFormat, this.m_sampleCount);
        this.initRenderingResources();

        this.m_renderingCommandBuffers = new CommandBufferFlow(this.m_logicalDevice.handle(), this.m_graphicsQueue.family(), gFrameCount);
        this.m_syncObjects = new VulkanSync(this.m_logicalDevice.handle(), gFrameCount);
        this.m_uploadCommandPool = new CommandPool(this.m_logicalDevice.handle(), 0, this.m_graphicsQueue.family());

        this.m_descriptorPool = new DescriptorPool(this.m_logicalDevice.handle(), VK_DESCRIPTOR_POOL_CREATE_FREE_DESCRIPTOR_SET_BIT, new DescriptorPool.Size[] {
                new DescriptorPool.Size(VK_DESCRIPTOR_TYPE_STORAGE_BUFFER, 10),
                new DescriptorPool.Size(VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER, 10)
        }, 100);

        this.m_shaders = Shaders.create(this.m_logicalDevice.handle());

        this.m_descriptorSetLayouts = DescriptorSetLayouts.create(this.m_logicalDevice.handle());
        this.m_pipelineLayouts = PipelineLayouts.create(this.m_logicalDevice.handle(), this.m_descriptorSetLayouts);
        this.m_pipelines = Pipelines.create(this.m_logicalDevice, this.m_renderPass.handle(), this.m_pipelineLayouts, this.m_shaders, this.m_sampleCount);

        this.m_gridRenderer = new StaticGridRenderer(this);
        this.m_cubeRenderer = new ObjectRenderer(this, ObjectRenderer.Type.CUBE);
        this.m_sphereRenderer = new ObjectRenderer(this, ObjectRenderer.Type.SPHERE);
    }

    private @Nullable VulkanImage createMsaaImage() throws VulkanException
    {
        if (this.m_sampleCount == VK_SAMPLE_COUNT_1_BIT)
        {
            return null;
        }

        try (Arena arena = Arena.ofConfined())
        {
            int swapchainFormat = this.m_swapchain.surfaceFormat().orElseThrow().format();

            VkImageCreateInfo imageCreateInfo = new VkImageCreateInfo(arena);
            imageCreateInfo.sType(VK_STRUCTURE_TYPE_IMAGE_CREATE_INFO);
            imageCreateInfo.imageType(VK_IMAGE_TYPE_2D);
            imageCreateInfo.extent(e ->
            {
                e.width(this.m_swapchain.width());
                e.height(this.m_swapchain.height());
                e.depth(1);
            });
            imageCreateInfo.mipLevels(1);
            imageCreateInfo.format(swapchainFormat);
            imageCreateInfo.tiling(VK_IMAGE_TILING_OPTIMAL);
            imageCreateInfo.initialLayout(VK_IMAGE_LAYOUT_UNDEFINED);
            imageCreateInfo.usage(VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT | VK_IMAGE_USAGE_INPUT_ATTACHMENT_BIT | VK_IMAGE_USAGE_SAMPLED_BIT | VK_IMAGE_USAGE_STORAGE_BIT);
            imageCreateInfo.sharingMode(VK_SHARING_MODE_EXCLUSIVE);
            imageCreateInfo.samples(this.m_sampleCount);
            imageCreateInfo.arrayLayers(1);

            VkImageViewCreateInfo imageViewCreateInfo = new VkImageViewCreateInfo(arena);
            imageViewCreateInfo.sType(VK_STRUCTURE_TYPE_IMAGE_VIEW_CREATE_INFO);
            imageViewCreateInfo.format(swapchainFormat);
            imageViewCreateInfo.components(c ->
            {
                c.r(VK_COMPONENT_SWIZZLE_IDENTITY);
                c.g(VK_COMPONENT_SWIZZLE_IDENTITY);
                c.b(VK_COMPONENT_SWIZZLE_IDENTITY);
                c.a(VK_COMPONENT_SWIZZLE_IDENTITY);
            });
            imageViewCreateInfo.subresourceRange(r ->
            {
                r.aspectMask(VK_IMAGE_ASPECT_COLOR_BIT);
                r.baseMipLevel(0);
                r.levelCount(1);
                r.baseArrayLayer(0);
                r.layerCount(1);
            });
            imageViewCreateInfo.viewType(VK_IMAGE_VIEW_TYPE_2D);

            return VulkanImage.allocate(this.m_logicalDevice.handle(), this.m_logicalDevice.allocator(), imageCreateInfo, imageViewCreateInfo, VMA_MEMORY_USAGE_GPU_ONLY);
        }
    }

    private static int selectDepthFormat(VkPhysicalDevice physicalDevice)
    {
        try (Arena arena = Arena.ofConfined())
        {
            int[] formats = new int[] {
                    VK_FORMAT_D32_SFLOAT_S8_UINT,
                    VK_FORMAT_D24_UNORM_S8_UINT
            };

            VkFormatProperties properties = new VkFormatProperties(arena);
            for (int format : formats)
            {
                vkGetPhysicalDeviceFormatProperties(physicalDevice, format, properties.ptr());
                if ((properties.optimalTilingFeatures() & VK_FORMAT_FEATURE_DEPTH_STENCIL_ATTACHMENT_BIT) != 0)
                {
                    return format;
                }
            }

            gRendererLogger.error("Unable to find suitable depth format.");
            return VK_FORMAT_UNDEFINED;
        }
    }

    private VulkanImage createDepthImage() throws VulkanException
    {
        try (Arena arena = Arena.ofConfined())
        {
            VkImageCreateInfo imageCreateInfo = new VkImageCreateInfo(arena);
            imageCreateInfo.sType(VK_STRUCTURE_TYPE_IMAGE_CREATE_INFO);
            imageCreateInfo.imageType(VK_IMAGE_TYPE_2D);
            imageCreateInfo.extent(e ->
            {
                e.width(this.m_swapchain.width());
                e.height(this.m_swapchain.height());
                e.depth(1);
            });
            imageCreateInfo.mipLevels(1);
            imageCreateInfo.format(this.m_depthFormat);
            imageCreateInfo.tiling(VK_IMAGE_TILING_OPTIMAL);
            imageCreateInfo.initialLayout(VK_IMAGE_LAYOUT_UNDEFINED);
            imageCreateInfo.usage(VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT | VK_IMAGE_USAGE_SAMPLED_BIT);
            imageCreateInfo.sharingMode(VK_SHARING_MODE_EXCLUSIVE);
            imageCreateInfo.samples(this.m_sampleCount);
            imageCreateInfo.arrayLayers(1);

            VkImageViewCreateInfo imageViewCreateInfo = new VkImageViewCreateInfo(arena);
            imageViewCreateInfo.sType(VK_STRUCTURE_TYPE_IMAGE_VIEW_CREATE_INFO);
            imageViewCreateInfo.format(this.m_depthFormat);
            imageViewCreateInfo.components(c ->
            {
                c.r(VK_COMPONENT_SWIZZLE_IDENTITY);
                c.g(VK_COMPONENT_SWIZZLE_IDENTITY);
                c.b(VK_COMPONENT_SWIZZLE_IDENTITY);
                c.a(VK_COMPONENT_SWIZZLE_IDENTITY);
            });
            imageViewCreateInfo.subresourceRange(r ->
            {
                r.aspectMask(VK_IMAGE_ASPECT_DEPTH_BIT | VK_IMAGE_ASPECT_STENCIL_BIT);
                r.baseMipLevel(0);
                r.levelCount(1);
                r.baseArrayLayer(0);
                r.layerCount(1);
            });
            imageViewCreateInfo.viewType(VK_IMAGE_VIEW_TYPE_2D);

            return VulkanImage.allocate(this.m_logicalDevice.handle(), this.m_logicalDevice.allocator(), imageCreateInfo, imageViewCreateInfo, VMA_MEMORY_USAGE_GPU_ONLY);
        }
    }

    private static LogicalDevice.QueueDescriptor[] selectQueueFamilies(VkPhysicalDevice physicalDevice, MemorySegment surface)
    {
        try (Arena arena = Arena.ofConfined())
        {
            MemorySegment pFamilyCount = arena.allocate(JAVA_INT);
            vkGetPhysicalDeviceQueueFamilyProperties(physicalDevice, pFamilyCount, NULL);
            int familyCount = pFamilyCount.get(JAVA_INT, 0);
            MemorySegment pFamilyProperties = arena.allocate(VkQueueFamilyProperties.gRecordLayout, familyCount);
            vkGetPhysicalDeviceQueueFamilyProperties(physicalDevice, pFamilyCount, pFamilyProperties);

            MemorySegment pSupported = arena.allocate(JAVA_INT);
            LogicalDevice.QueueDescriptor graphicsQueueDescriptor = null, presentQueueDescriptor = null;
            int lastPresentQueueFamily = -1;
            for (int i = 0; i < familyCount; i++)
            {
                VkQueueFamilyProperties properties = VkQueueFamilyProperties.getAtIndex(pFamilyProperties, i);
                VulkanException.check(vkGetPhysicalDeviceSurfaceSupportKHR(physicalDevice, i, surface, pSupported));
                boolean presentQueue = pSupported.get(JAVA_INT, 0) != VK_FALSE;
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
            }

            if (presentQueueDescriptor == null)
            {
                presentQueueDescriptor = new LogicalDevice.QueueDescriptor(lastPresentQueueFamily, 1.0f);
            }

            return new LogicalDevice.QueueDescriptor[] {
                    graphicsQueueDescriptor, presentQueueDescriptor
            };
        }
    }

    private void resetSwapchainAndResources()
    {
        this.m_renderPass.destroyFramebuffers();
        this.m_depthImage.dispose();
        if (this.m_msaaImage != null)
        {
            this.m_msaaImage.dispose();
        }

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
        this.m_msaaImage = this.createMsaaImage();
        this.m_depthImage = this.createDepthImage();

        try (Arena arena = Arena.ofConfined())
        {
            MemorySegment pImageViews = arena.allocate(ADDRESS, this.m_swapchain.images().length);
            for (int i = 0; i < this.m_swapchain.images().length; i++)
            {
                pImageViews.setAtIndex(ADDRESS, i, this.m_swapchain.images()[i].view());
            }

            MemorySegment msaaImageView = this.m_msaaImage == null ? NULL : this.m_msaaImage.view();

            this.m_renderPass.createFramebuffers(this.m_swapchain.images().length, pImageViews, this.m_swapchain.width(), this.m_swapchain.height(), msaaImageView, this.m_depthImage.view());
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
        try (Arena arena = Arena.ofConfined())
        {
            MemorySegment pFrameIndex = arena.allocate(JAVA_INT);
            int swapchainMessage = this.m_swapchain.acquireNextImage(this.m_syncObjects.imageAcquiredSemaphore(this.m_currentFrame), pFrameIndex);
            if (swapchainMessage == VK_ERROR_OUT_OF_DATE_KHR || swapchainMessage == VK_SUBOPTIMAL_KHR)
            {
                this.resetSwapchainAndResources();
            }
            else
            {
                VulkanException.check(swapchainMessage);
            }

            this.m_vkFrameIndex = pFrameIndex.get(JAVA_INT, 0);

            this.m_renderingCommandBuffers.reset(this.m_currentFrame);

            this.m_frameCommandBuffer = this.m_renderingCommandBuffers.pool(this.m_currentFrame);
            beginCommandBuffer(arena, this.m_frameCommandBuffer, 0);

            MemorySegment pClearValues = arena.allocate(VkClearValue.gRecordLayout, 2);
            VkClearValue.getAtIndex(pClearValues, 0).color(value ->
            {
                value.float32(0, 0.1f);
                value.float32(1, 0.859f);
                value.float32(2, 0.859f);
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
            renderPassBeginInfo.clearValueCount(3);
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
        try (Arena arena = Arena.ofConfined())
        {
            vkCmdEndRenderPass(this.m_frameCommandBuffer);

            VkImageMemoryBarrier memoryBarrier = new VkImageMemoryBarrier(arena);
            memoryBarrier.sType(VK_STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER);
            memoryBarrier.srcQueueFamilyIndex(VK_QUEUE_FAMILY_IGNORED);
            memoryBarrier.dstQueueFamilyIndex(VK_QUEUE_FAMILY_IGNORED);
            memoryBarrier.image(this.m_swapchain.images()[this.m_vkFrameIndex].handle());
            memoryBarrier.subresourceRange(r ->
            {
                r.aspectMask(VK_IMAGE_ASPECT_COLOR_BIT);
                r.baseMipLevel(0);
                r.levelCount(1);
                r.baseArrayLayer(0);
                r.layerCount(1);
            });
            memoryBarrier.oldLayout(VK_IMAGE_LAYOUT_GENERAL);
            memoryBarrier.newLayout(VK_IMAGE_LAYOUT_PRESENT_SRC_KHR);
            memoryBarrier.srcAccessMask(VK_ACCESS_COLOR_ATTACHMENT_WRITE_BIT);
            memoryBarrier.dstAccessMask(0);

            vkCmdPipelineBarrier(this.m_frameCommandBuffer, VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT, VK_PIPELINE_STAGE_BOTTOM_OF_PIPE_BIT, 0, 0, NULL, 0, NULL, 1, memoryBarrier.ptr());

            VulkanException.check(vkEndCommandBuffer(this.m_frameCommandBuffer));

            MemorySegment commandBufferFence = this.m_syncObjects.fence(this.m_currentFrame);

            MemorySegment pImageAcquiredSemaphore = arena.allocateFrom(ADDRESS, this.m_syncObjects.imageAcquiredSemaphore(this.m_currentFrame));
            MemorySegment pRenderCompleteSemaphore = arena.allocateFrom(ADDRESS, this.m_syncObjects.renderCompleteSemaphore(this.m_currentFrame));

            VkSubmitInfo submitInfo = new VkSubmitInfo(arena);
            submitInfo.sType(VK_STRUCTURE_TYPE_SUBMIT_INFO);
            submitInfo.waitSemaphoreCount(1);
            submitInfo.pWaitSemaphores(pImageAcquiredSemaphore);
            submitInfo.pWaitDstStageMask(arena.allocateFrom(JAVA_INT, VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT));
            submitInfo.commandBufferCount(1);
            submitInfo.pCommandBuffers(arena.allocateFrom(ADDRESS, this.m_frameCommandBuffer.handle()));
            submitInfo.signalSemaphoreCount(1);
            submitInfo.pSignalSemaphores(pRenderCompleteSemaphore);

            VulkanException.check(vkQueueSubmit(this.m_graphicsQueue.handle(), 1, submitInfo.ptr(), commandBufferFence));

            this.m_renderingCommandBuffers.offer(this.m_currentFrame, this.m_frameCommandBuffer);
            MemorySegment pCommandBufferFence = arena.allocateFrom(ADDRESS, commandBufferFence);

            VulkanException.check(vkWaitForFences(this.m_logicalDevice.handle(), 1, pCommandBufferFence, VK_TRUE, -1));
            VulkanException.check(vkResetFences(this.m_logicalDevice.handle(), 1, pCommandBufferFence));

            VkPresentInfoKHR presentInfo = new VkPresentInfoKHR(arena);
            presentInfo.sType(VK_STRUCTURE_TYPE_PRESENT_INFO_KHR);
            presentInfo.waitSemaphoreCount(1);
            presentInfo.pWaitSemaphores(pRenderCompleteSemaphore);
            presentInfo.swapchainCount(1);
            presentInfo.pSwapchains(arena.allocateFrom(ADDRESS, this.m_swapchain.handle()));
            presentInfo.pImageIndices(arena.allocateFrom(JAVA_INT, this.m_vkFrameIndex));

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
        this.assertRenderContext();
        vkCmdBindDescriptorSets(this.m_frameCommandBuffer, VK_PIPELINE_BIND_POINT_GRAPHICS, layout, firstSet, descriptorSetCount, pDescriptorSets, dynamicOffsetCount, pDynamicOffsets);
    }

    public void setLineWidth(float lineWidth)
    {
        this.assertRenderContext();
        if (this.m_logicalDevice.physicalDevice.features().wideLines() != VK_FALSE)
        {
            vkCmdSetLineWidth(this.m_frameCommandBuffer, lineWidth);
        }
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

    public void renderObject(Camera camera, Matrix4d transform, ObjectRenderer.MeshColors colors, ObjectRenderer.Type type)
    {
        this.assertRenderContext();
        switch (type)
        {
            case CUBE -> this.m_cubeRenderer.render(this.m_frameCommandBuffer, camera, transform, colors);
            case SPHERE -> this.m_sphereRenderer.render(this.m_frameCommandBuffer, camera, transform, colors);
            default -> throw new IllegalArgumentException(String.format("Unsupported object type: %s", type.name()));
        }
    }

    public void renderObjectsInstanced(Camera camera, int count, ObjectRenderer.Type type)
    {
        this.assertRenderContext();
        switch (type)
        {
            case CUBE -> this.m_cubeRenderer.renderInstanced(this.m_frameCommandBuffer, camera, count);
            case SPHERE -> this.m_sphereRenderer.renderInstanced(this.m_frameCommandBuffer, camera, count);
            default -> throw new IllegalArgumentException(String.format("Unsupported object type: %s", type.name()));
        }
    }

    public VkCommandBuffer frameCommandBuffer()
    {
        return this.m_frameCommandBuffer;
    }

    public void deviceWaitIdle() throws VulkanException
    {
        VulkanException.check(vkDeviceWaitIdle(this.m_logicalDevice.handle()));
    }

    @Override
    public void dispose()
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
        if (this.m_msaaImage != null)
        {
            this.m_msaaImage.dispose();
        }

        this.m_depthImage.dispose();
        this.m_swapchain.dispose();

        this.m_logicalDevice.dispose();
        this.m_context.dispose();
    }
}
