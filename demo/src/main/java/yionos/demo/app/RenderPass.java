package yionos.demo.app;

import vulkan.VkAttachmentDescription;
import vulkan.VkAttachmentReference;
import vulkan.VkDevice;
import vulkan.VkFramebufferCreateInfo;
import vulkan.VkRenderPassCreateInfo;
import vulkan.VkSubpassDependency;
import vulkan.VkSubpassDescription;
import yionos.demo.Disposable;
import yionos.demo.SequenceInitializer;
import yionos.demo.rendering.VulkanException;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

import static vulkan.VulkanCore.*;
import static vulkan.VkAttachmentLoadOp.*;
import static vulkan.VkAttachmentStoreOp.*;
import static vulkan.VkImageLayout.*;
import static vulkan.VkFormat.*;
import static vulkan.VkSampleCountFlagBits.*;
import static vulkan.VkPipelineBindPoint.*;
import static vulkan.VkPipelineStageFlagBits.*;
import static vulkan.VkAccessFlagBits.*;
import static vulkan.VkStructureType.*;
import static java.lang.foreign.MemorySegment.NULL;

public class RenderPass implements Disposable
{
    private final MemorySegment m_handle;
    private int m_framebufferCount = 0;
    private MemorySegment m_framebuffers = NULL;
    public final VkDevice device;

    public RenderPass(VkDevice device, int format, int sampleCount) throws VulkanException
    {
        try (Arena arena = Arena.ofConfined())
        {
            MemorySegment pAttachments = arena.allocateArray(VkAttachmentDescription.gStructLayout, 3);
            VkAttachmentDescription description;

            description = VkAttachmentDescription.getAtIndex(pAttachments, 0);
            description.format(format);
            description.samples(sampleCount);
            description.loadOp(VK_ATTACHMENT_LOAD_OP_CLEAR);
            description.storeOp(VK_ATTACHMENT_STORE_OP_DONT_CARE);
            description.stencilLoadOp(VK_ATTACHMENT_LOAD_OP_LOAD);
            description.stencilStoreOp(VK_ATTACHMENT_STORE_OP_STORE);
            description.initialLayout(VK_IMAGE_LAYOUT_UNDEFINED);
            description.finalLayout(VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL);

            description = VkAttachmentDescription.getAtIndex(pAttachments, 1);
            description.format(VK_FORMAT_D32_SFLOAT);
            description.samples(sampleCount);
            description.loadOp(VK_ATTACHMENT_LOAD_OP_CLEAR);
            description.storeOp(VK_ATTACHMENT_STORE_OP_DONT_CARE);
            description.stencilLoadOp(VK_ATTACHMENT_LOAD_OP_DONT_CARE);
            description.stencilStoreOp(VK_ATTACHMENT_STORE_OP_DONT_CARE);
            description.initialLayout(VK_IMAGE_LAYOUT_UNDEFINED);
            description.finalLayout(VK_IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL);

            description = VkAttachmentDescription.getAtIndex(pAttachments, 2);
            description.format(format);
            description.samples(VK_SAMPLE_COUNT_1_BIT);
            description.loadOp(VK_ATTACHMENT_LOAD_OP_DONT_CARE);
            description.storeOp(VK_ATTACHMENT_STORE_OP_STORE);
            description.stencilLoadOp(VK_ATTACHMENT_LOAD_OP_DONT_CARE);
            description.stencilStoreOp(VK_ATTACHMENT_STORE_OP_DONT_CARE);
            description.initialLayout(VK_IMAGE_LAYOUT_UNDEFINED);
            description.finalLayout(VK_IMAGE_LAYOUT_PRESENT_SRC_KHR);

            VkAttachmentReference colorAttachmentReference = new VkAttachmentReference(arena);
            colorAttachmentReference.attachment(0);
            colorAttachmentReference.layout(VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL);

            VkAttachmentReference depthAttachmentReference = new VkAttachmentReference(arena);
            depthAttachmentReference.attachment(1);
            depthAttachmentReference.layout(VK_IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL);

            VkAttachmentReference resolveAttachmentReference = new VkAttachmentReference(arena);
            resolveAttachmentReference.attachment(2);
            resolveAttachmentReference.layout(VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL);

            VkSubpassDescription subpass = new VkSubpassDescription(arena);
            subpass.pipelineBindPoint(VK_PIPELINE_BIND_POINT_GRAPHICS);
            subpass.colorAttachmentCount(1);
            subpass.pColorAttachments(colorAttachmentReference.ptr());
            subpass.pDepthStencilAttachment(depthAttachmentReference.ptr());
            subpass.pResolveAttachments(resolveAttachmentReference.ptr());

            VkSubpassDependency dependency = new VkSubpassDependency(arena);
            dependency.srcSubpass(VK_SUBPASS_EXTERNAL);
            dependency.srcStageMask(VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT | VK_PIPELINE_STAGE_EARLY_FRAGMENT_TESTS_BIT);
            dependency.srcAccessMask(0);
            dependency.dstSubpass(0);
            dependency.dstStageMask(VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT | VK_PIPELINE_STAGE_EARLY_FRAGMENT_TESTS_BIT);
            dependency.dstAccessMask(VK_ACCESS_COLOR_ATTACHMENT_WRITE_BIT | VK_ACCESS_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT);
            dependency.dependencyFlags(0);

            VkRenderPassCreateInfo renderPassCreateInfo = new VkRenderPassCreateInfo(arena);
            renderPassCreateInfo.sType(VK_STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO);
            renderPassCreateInfo.attachmentCount(3);
            renderPassCreateInfo.pAttachments(pAttachments);
            renderPassCreateInfo.subpassCount(1);
            renderPassCreateInfo.pSubpasses(subpass.ptr());
            renderPassCreateInfo.dependencyCount(1);
            renderPassCreateInfo.pDependencies(dependency.ptr());

            MemorySegment pRenderPass = arena.allocate(ValueLayout.ADDRESS);
            VulkanException.check(vkCreateRenderPass(device, renderPassCreateInfo.ptr(), NULL, pRenderPass), "Unable to create render pass");
            this.m_handle = pRenderPass.get(ValueLayout.ADDRESS, 0);

            this.device = device;
        }
    }

    public void createFramebuffers(int imageViewCount, MemorySegment pImageViews, int width, int height, MemorySegment msaaImageView, MemorySegment depthImageView) throws VulkanException
    {
        try (Arena arena = Arena.ofConfined())
        {
            SequenceInitializer initializer = new SequenceInitializer();

            MemorySegment pFramebufferAttachments = arena.allocateArray(ValueLayout.ADDRESS, 3);
            pFramebufferAttachments.setAtIndex(ValueLayout.ADDRESS, 0, msaaImageView);
            pFramebufferAttachments.setAtIndex(ValueLayout.ADDRESS, 1, depthImageView);

            VkFramebufferCreateInfo framebufferCreateInfo = new VkFramebufferCreateInfo(arena);
            framebufferCreateInfo.sType(VK_STRUCTURE_TYPE_FRAMEBUFFER_CREATE_INFO);
            framebufferCreateInfo.renderPass(this.m_handle);
            framebufferCreateInfo.attachmentCount(3);
            framebufferCreateInfo.pAttachments(pFramebufferAttachments);
            framebufferCreateInfo.width(width);
            framebufferCreateInfo.height(height);
            framebufferCreateInfo.layers(1);

            MemorySegment pFramebuffers = Arena.ofAuto().allocateArray(ValueLayout.ADDRESS, imageViewCount);
            for (int i = 0; i < imageViewCount; i++)
            {
                pFramebufferAttachments.setAtIndex(ValueLayout.ADDRESS, 2, pImageViews.getAtIndex(ValueLayout.ADDRESS, i));
                MemorySegment pFramebuffer = pFramebuffers.asSlice(ValueLayout.ADDRESS.byteSize() * i, ValueLayout.ADDRESS);

                VulkanException.check(vkCreateFramebuffer(this.device, framebufferCreateInfo.ptr(), NULL, pFramebuffer), "Unable to create framebuffer", initializer);
                MemorySegment framebuffer = pFramebuffer.get(ValueLayout.ADDRESS, 0);
                initializer.push(() -> vkDestroyFramebuffer(this.device, framebuffer, NULL));
            }

            this.m_framebufferCount = imageViewCount;
            this.m_framebuffers = pFramebuffers;
        }
    }

    public MemorySegment handle()
    {
        return this.m_handle;
    }

    public int framebufferCount()
    {
        return this.m_framebufferCount;
    }

    public MemorySegment framebuffers()
    {
        return this.m_framebuffers;
    }

    public MemorySegment framebuffer(int index)
    {
        return this.m_framebuffers.getAtIndex(ValueLayout.ADDRESS, index);
    }

    public void destroyFramebuffers()
    {
        for (int i = 0; i < this.m_framebufferCount; i++)
        {
            vkDestroyFramebuffer(this.device, this.m_framebuffers.getAtIndex(ValueLayout.ADDRESS, i), NULL);
        }

        this.m_framebufferCount = 0;
        this.m_framebuffers = NULL;
    }

    @Override
    public void dispose()
    {
        this.destroyFramebuffers();
        vkDestroyRenderPass(this.device, this.m_handle, NULL);
    }
}
