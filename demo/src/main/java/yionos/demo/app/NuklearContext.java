package yionos.demo.app;

import nuklear.*;
import org.joml.Matrix4d;
import vulkan.*;
import yionos.demo.Disposable;
import yionos.demo.StackAllocator;
import yionos.demo.rendering.VulkanBuffer;
import yionos.demo.rendering.VulkanException;
import yionos.demo.rendering.VulkanImage;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.ValueLayout;

import static vulkan.VulkanCore.*;
import static vulkan.VkFormat.*;
import static vulkan.VkImageType.*;
import static vulkan.VkShaderStageFlagBits.*;
import static vulkan.VkImageTiling.*;
import static vulkan.VkSampleCountFlagBits.*;
import static vulkan.VkImageUsageFlagBits.*;
import static vulkan.VkStructureType.*;
import static vulkan.VkSharingMode.*;
import static vulkan.VkImageViewType.*;
import static vulkan.VkAccessFlagBits.*;
import static vulkan.VkCommandBufferLevel.*;
import static vulkan.VkCommandBufferUsageFlagBits.*;
import static vulkan.VkPipelineStageFlagBits.*;
import static vulkan.VkImageAspectFlagBits.*;
import static vulkan.VkImageLayout.*;
import static vulkan.VkBufferUsageFlagBits.*;
import static vulkan.VkFilter.*;
import static vulkan.VkSamplerMipmapMode.*;
import static vulkan.VkSamplerAddressMode.*;
import static vulkan.VkCompareOp.*;
import static vulkan.VkIndexType.*;
import static vulkan.VkBorderColor.*;
import static vulkan.VkDescriptorType.*;
import static vma.VmaMemoryUsage.*;
import static nuklear.Nuklear.*;
import static nuklear.nk_font_atlas_format.*;
import static nuklear.nk_draw_vertex_layout_attribute.*;
import static nuklear.nk_draw_vertex_layout_format.*;
import static nuklear.nk_anti_aliasing.*;
import static nuklear.nk_keys.*;
import static nuklear.nk_buttons.*;
import static glfw3.GLFW3.*;
import static yionos.demo.rendering.VulkanHelpers.*;
import static java.lang.foreign.MemorySegment.NULL;

public class NuklearContext implements Disposable
{
    private static final long MAX_VERTEX_BUFFER = 512 * 1024;
    private static final long MAX_INDEX_BUFFER = 128 * 1024;

    private final nk_context m_ctx;
    private final nk_font_atlas m_atlas;
    private final VulkanImage m_atlasImage;
    public final VulkanRenderer renderer;
    private final nk_draw_null_texture m_texNull;
    private final MemorySegment m_uniformDescriptorSets;
    private final nk_buffer m_cmds;

    private final VulkanBuffer m_vertexBuffer;
    private final VulkanBuffer m_indexBuffer;
    private final MemorySegment m_sampler;

    public NuklearContext(VulkanRenderer renderer)
    {
        Arena contextArena = Arena.ofAuto();

        this.m_ctx = new nk_context(contextArena);
        this.m_atlas = new nk_font_atlas(contextArena);
        this.m_cmds = new nk_buffer(contextArena);
        this.m_texNull = new nk_draw_null_texture(contextArena);

        this.m_sampler = createSampler(renderer.logicalDevice().handle());

        nk_init_default(this.m_ctx._ptr(), NULL);
        nk_buffer_init_default(this.m_cmds._ptr());

        try (Arena arena = Arena.ofConfined())
        {
            nk_font_atlas_init_default(this.m_atlas._ptr());
            nk_font_atlas_begin(this.m_atlas._ptr());

            MemorySegment width = arena.allocate(ValueLayout.JAVA_INT), height = arena.allocate(ValueLayout.JAVA_INT);
            MemorySegment imageData = nk_font_atlas_bake(this.m_atlas._ptr(), width, height, NK_FONT_ATLAS_RGBA32);

            this.m_atlasImage = createAtlas(renderer, imageData, width.get(ValueLayout.JAVA_INT, 0), height.get(ValueLayout.JAVA_INT, 0));

            nk_font_atlas_end(this.m_atlas._ptr(), nk_handle_ptr(arena, this.m_atlasImage.view()), this.m_texNull._ptr());

            nk_font defaultFont = new nk_font(this.m_atlas.default_font().reinterpret(nk_font.gStructLayout.byteSize()));
            if (!defaultFont._ptr().equals(NULL))
            {
                nk_style_set_font(this.m_ctx._ptr(), defaultFont.handle()._ptr());
            }

            MemorySegment pSetLayouts = arena.allocateArray(ValueLayout.ADDRESS, VulkanRenderer.gFrameCount);
            pSetLayouts.setAtIndex(ValueLayout.ADDRESS, 0, renderer.descriptorSetLayouts().singleSampler());
            pSetLayouts.setAtIndex(ValueLayout.ADDRESS, 1, renderer.descriptorSetLayouts().singleSampler());

            this.m_uniformDescriptorSets = contextArena.allocateArray(ValueLayout.ADDRESS, VulkanRenderer.gFrameCount);
            renderer.descriptorPool().allocateDescriptorSets(VulkanRenderer.gFrameCount, pSetLayouts, this.m_uniformDescriptorSets);

            this.renderer = renderer;
        }

        this.m_vertexBuffer = new VulkanBuffer(renderer.logicalDevice().allocator(), MAX_VERTEX_BUFFER, VK_BUFFER_USAGE_VERTEX_BUFFER_BIT, new int[] {renderer.graphicsQueue().family()}, VMA_MEMORY_USAGE_CPU_TO_GPU);
        this.m_indexBuffer = new VulkanBuffer(renderer.logicalDevice().allocator(), MAX_INDEX_BUFFER, VK_BUFFER_USAGE_INDEX_BUFFER_BIT, new int[] {renderer.graphicsQueue().family()}, VMA_MEMORY_USAGE_CPU_TO_GPU);
    }

    private static VulkanImage createAtlas(VulkanRenderer renderer, MemorySegment imageData, int width, int height)
    {
        try (Arena arena = Arena.ofConfined())
        {
            VkImageCreateInfo imageCreateInfo = new VkImageCreateInfo(arena);
            imageCreateInfo.sType(VK_STRUCTURE_TYPE_IMAGE_CREATE_INFO);
            imageCreateInfo.imageType(VK_IMAGE_TYPE_2D);
            imageCreateInfo.format(VK_FORMAT_R8G8B8A8_UNORM);
            imageCreateInfo.extent(e ->
            {
                e.width(width);
                e.height(height);
                e.depth(1);
            });
            imageCreateInfo.mipLevels(1);
            imageCreateInfo.arrayLayers(1);
            imageCreateInfo.samples(VK_SAMPLE_COUNT_1_BIT);
            imageCreateInfo.tiling(VK_IMAGE_TILING_OPTIMAL);
            imageCreateInfo.usage(VK_IMAGE_USAGE_TRANSFER_DST_BIT | VK_IMAGE_USAGE_SAMPLED_BIT);
            imageCreateInfo.sharingMode(VK_SHARING_MODE_EXCLUSIVE);
            imageCreateInfo.initialLayout(VK_IMAGE_LAYOUT_UNDEFINED);

            VkImageViewCreateInfo imageViewCreateInfo = new VkImageViewCreateInfo(arena);
            imageViewCreateInfo.sType(VK_STRUCTURE_TYPE_IMAGE_VIEW_CREATE_INFO);
            imageViewCreateInfo.viewType(VK_IMAGE_VIEW_TYPE_2D);
            imageViewCreateInfo.format(VK_FORMAT_R8G8B8A8_UNORM);
            imageViewCreateInfo.subresourceRange(r ->
            {
                r.aspectMask(VK_IMAGE_ASPECT_COLOR_BIT);
                r.layerCount(1);
                r.levelCount(1);
            });

            VulkanImage image = VulkanImage.allocate(renderer.logicalDevice().handle(), renderer.logicalDevice().allocator(), imageCreateInfo, imageViewCreateInfo, VMA_MEMORY_USAGE_GPU_ONLY);

            VkMemoryRequirements memoryRequirements = new VkMemoryRequirements(arena);
            vkGetImageMemoryRequirements(renderer.logicalDevice().handle(), image.handle(), memoryRequirements.ptr());

            VulkanBuffer buffer = new VulkanBuffer(renderer.logicalDevice().allocator(), memoryRequirements.size(), VK_BUFFER_USAGE_TRANSFER_SRC_BIT, new int[] {renderer.graphicsQueue().family()}, VMA_MEMORY_USAGE_CPU_TO_GPU);
            buffer.put(imageData.reinterpret((long) width * height * 4));

            VkCommandBuffer commandBuffer = renderer.uploadCommandPool().allocate(VK_COMMAND_BUFFER_LEVEL_PRIMARY, 1)[0];
            beginCommandBuffer(arena, commandBuffer, VK_COMMAND_BUFFER_USAGE_ONE_TIME_SUBMIT_BIT);

            VkImageMemoryBarrier memoryBarrier = new VkImageMemoryBarrier(arena);
            memoryBarrier.sType(VK_STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER);
            memoryBarrier.image(image.handle());
            memoryBarrier.srcQueueFamilyIndex(VK_QUEUE_FAMILY_IGNORED);
            memoryBarrier.dstQueueFamilyIndex(VK_QUEUE_FAMILY_IGNORED);
            memoryBarrier.oldLayout(VK_IMAGE_LAYOUT_UNDEFINED);
            memoryBarrier.newLayout(VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL);
            memoryBarrier.subresourceRange(r ->
            {
                r.aspectMask(VK_IMAGE_ASPECT_COLOR_BIT);
                r.levelCount(1);
                r.layerCount(1);
            });
            memoryBarrier.dstAccessMask(VK_ACCESS_TRANSFER_WRITE_BIT);

            vkCmdPipelineBarrier(commandBuffer, VK_PIPELINE_STAGE_TOP_OF_PIPE_BIT, VK_PIPELINE_STAGE_TRANSFER_BIT, 0, 0, NULL, 0, NULL, 1, memoryBarrier.ptr());

            VkBufferImageCopy bufferImageCopy = new VkBufferImageCopy(arena);
            bufferImageCopy.imageSubresource(s ->
            {
                s.aspectMask(VK_IMAGE_ASPECT_COLOR_BIT);
                s.layerCount(1);
            });
            bufferImageCopy.imageExtent(e ->
            {
                e.width(width);
                e.height(height);
                e.depth(1);
            });

            vkCmdCopyBufferToImage(commandBuffer, buffer.handle(), image.handle(), VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL, 1, bufferImageCopy.ptr());

            VkImageMemoryBarrier shaderMemoryBarrier = new VkImageMemoryBarrier(arena);
            shaderMemoryBarrier.sType(VK_STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER);
            shaderMemoryBarrier.image(image.handle());
            shaderMemoryBarrier.srcQueueFamilyIndex(VK_QUEUE_FAMILY_IGNORED);
            shaderMemoryBarrier.dstQueueFamilyIndex(VK_QUEUE_FAMILY_IGNORED);
            shaderMemoryBarrier.oldLayout(VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL);
            shaderMemoryBarrier.newLayout(VK_IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL);
            shaderMemoryBarrier.subresourceRange(r ->
            {
                r.aspectMask(VK_IMAGE_ASPECT_COLOR_BIT);
                r.levelCount(1);
                r.layerCount(1);
            });
            shaderMemoryBarrier.srcAccessMask(VK_ACCESS_TRANSFER_WRITE_BIT);
            shaderMemoryBarrier.dstAccessMask(VK_ACCESS_SHADER_READ_BIT);

            vkCmdPipelineBarrier(commandBuffer, VK_PIPELINE_STAGE_TRANSFER_BIT, VK_PIPELINE_STAGE_FRAGMENT_SHADER_BIT, 0, 0, NULL, 0, NULL, 1, shaderMemoryBarrier.ptr());

            vkEndCommandBuffer(commandBuffer);

            VkSubmitInfo submitInfo = new VkSubmitInfo(arena);
            submitInfo.sType(VK_STRUCTURE_TYPE_SUBMIT_INFO);
            submitInfo.commandBufferCount(1);
            submitInfo.pCommandBuffers(arena.allocate(ValueLayout.ADDRESS, commandBuffer.handle()));

            VulkanException.check(vkQueueSubmit(renderer.graphicsQueue().handle(), 1, submitInfo.ptr(), NULL));
            VulkanException.check(vkQueueWaitIdle(renderer.graphicsQueue().handle()));

            renderer.uploadCommandPool().free(new VkCommandBuffer[] {commandBuffer});
            buffer.dispose();

            return image;
        }
    }

    private static MemorySegment createSampler(VkDevice device)
    {
        try (Arena arena = Arena.ofConfined())
        {
            VkSamplerCreateInfo samplerCreateInfo = new VkSamplerCreateInfo(arena);
            samplerCreateInfo.sType(VK_STRUCTURE_TYPE_SAMPLER_CREATE_INFO);
            samplerCreateInfo.maxAnisotropy(1.0f);
            samplerCreateInfo.magFilter(VK_FILTER_LINEAR);
            samplerCreateInfo.minFilter(VK_FILTER_LINEAR);
            samplerCreateInfo.mipmapMode(VK_SAMPLER_MIPMAP_MODE_LINEAR);
            samplerCreateInfo.addressModeU(VK_SAMPLER_ADDRESS_MODE_REPEAT);
            samplerCreateInfo.addressModeV(VK_SAMPLER_ADDRESS_MODE_REPEAT);
            samplerCreateInfo.addressModeW(VK_SAMPLER_ADDRESS_MODE_REPEAT);
            samplerCreateInfo.mipLodBias(0.0f);
            samplerCreateInfo.compareEnable(VK_FALSE);
            samplerCreateInfo.compareOp(VK_COMPARE_OP_ALWAYS);
            samplerCreateInfo.minLod(0.0f);
            samplerCreateInfo.maxLod(0.0f);
            samplerCreateInfo.borderColor(VK_BORDER_COLOR_FLOAT_OPAQUE_BLACK);

            MemorySegment pSampler = arena.allocate(ValueLayout.ADDRESS);
            VulkanException.check(vkCreateSampler(device, samplerCreateInfo.ptr(), NULL, pSampler));

            return pSampler.get(ValueLayout.ADDRESS, 0);
        }
    }

    private nk_convert_config createConfig(SegmentAllocator allocator)
    {
        MemorySegment vertexLayout = allocator.allocateArray(nk_draw_vertex_layout_element.gStructLayout, 4);
        nk_draw_vertex_layout_element layout;

        layout = nk_draw_vertex_layout_element.getAtIndex(vertexLayout, 0);
        layout.attribute(NK_VERTEX_POSITION);
        layout.format(NK_FORMAT_FLOAT);
        layout.offset(0);

        layout = nk_draw_vertex_layout_element.getAtIndex(vertexLayout, 1);
        layout.attribute(NK_VERTEX_TEXCOORD);
        layout.format(NK_FORMAT_FLOAT);
        layout.offset(2 * Float.BYTES);

        layout = nk_draw_vertex_layout_element.getAtIndex(vertexLayout, 2);
        layout.attribute(NK_VERTEX_COLOR);
        layout.format(NK_FORMAT_R8G8B8A8);
        layout.offset(4 * Float.BYTES);

        layout = nk_draw_vertex_layout_element.getAtIndex(vertexLayout, 3);
        layout.attribute(NK_VERTEX_ATTRIBUTE_COUNT);
        layout.format(NK_FORMAT_COUNT);
        layout.offset(0);

        nk_convert_config config = new nk_convert_config(allocator);
        config.vertex_layout(vertexLayout);
        config.vertex_size(4 * Float.BYTES + 4);
        config.vertex_alignment(1);
        config.tex_null(this.m_texNull);
        config.circle_segment_count(22);
        config.curve_segment_count(22);
        config.arc_segment_count(22);
        config.global_alpha(1.0f);
        config.shape_AA(NK_ANTI_ALIASING_ON);
        config.line_AA(NK_ANTI_ALIASING_ON);

        return config;
    }

    private void updateTexture(MemorySegment descriptorSet)
    {
        try (Arena arena = StackAllocator.stackPush())
        {
            VkDescriptorImageInfo descriptorImageInfo = new VkDescriptorImageInfo(arena);
            descriptorImageInfo.sampler(this.m_sampler);
            descriptorImageInfo.imageView(this.m_atlasImage.view());
            descriptorImageInfo.imageLayout(VK_IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL);

            VkWriteDescriptorSet writeDescriptorSet = new VkWriteDescriptorSet(arena);
            writeDescriptorSet.sType(VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET);
            writeDescriptorSet.dstSet(descriptorSet);
            writeDescriptorSet.dstBinding(0);
            writeDescriptorSet.dstArrayElement(0);
            writeDescriptorSet.descriptorType(VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER);
            writeDescriptorSet.descriptorCount(1);
            writeDescriptorSet.pImageInfo(descriptorImageInfo.ptr());

            vkUpdateDescriptorSets(this.renderer.logicalDevice().handle(), 1, writeDescriptorSet.ptr(), 0, NULL);
        }
    }

    public MemorySegment pContext()
    {
        return this.m_ctx._ptr();
    }

    public void render(int windowWidth, int windowHeight)
    {
        try (Arena arena = StackAllocator.stackPush())
        {
            MemorySegment ppVertexData = arena.allocate(ValueLayout.ADDRESS);
            this.m_vertexBuffer.map(ppVertexData);
            MemorySegment pVertexData = ppVertexData.get(ValueLayout.ADDRESS, 0);

            MemorySegment ppIndexData = arena.allocate(ValueLayout.ADDRESS);
            this.m_indexBuffer.map(ppIndexData);
            MemorySegment pIndexData = ppIndexData.get(ValueLayout.ADDRESS, 0);

            nk_buffer nkVertexBuffer = new nk_buffer(arena), nkIndexBuffer = new nk_buffer(arena);

            nk_convert_config config = this.createConfig(arena);

            nk_buffer_init_fixed(nkVertexBuffer._ptr(), pVertexData, MAX_VERTEX_BUFFER);
            nk_buffer_init_fixed(nkIndexBuffer._ptr(), pIndexData, MAX_INDEX_BUFFER);
            nk_convert(this.m_ctx._ptr(), this.m_cmds._ptr(), nkVertexBuffer._ptr(), nkIndexBuffer._ptr(), config._ptr());

            this.m_vertexBuffer.unmap();
            this.m_indexBuffer.unmap();

            this.renderer.bindGraphicsPipeline(this.renderer.pipelines().nuklearOverlay());

            MemorySegment pUniformDescriptorSet = this.m_uniformDescriptorSets.asSlice(this.renderer.currentFrame() * ValueLayout.ADDRESS.byteSize(), ValueLayout.ADDRESS);
            this.renderer.bindGraphicsDescriptorSets(this.renderer.pipelineLayouts().nuklearOverlay(), 0, 1, pUniformDescriptorSet, 0, NULL);

            this.updateTexture(pUniformDescriptorSet.get(ValueLayout.ADDRESS, 0));

            double widthExtent = windowWidth / 2.0, heightExtent = windowHeight / 2.0;
            Matrix4d projectionMatrix = new Matrix4d()
                    .setOrtho2D(-widthExtent, widthExtent, heightExtent, -heightExtent)
                    .translate(-widthExtent, -heightExtent, 0.0);

            MemorySegment pushConstants = arena.allocateArray(ValueLayout.JAVA_FLOAT, 16);
            projectionMatrix.get(pushConstants.asByteBuffer().asFloatBuffer());
            vkCmdPushConstants(this.renderer.frameCommandBuffer(), this.renderer.pipelineLayouts().nuklearOverlay(), VK_SHADER_STAGE_VERTEX_BIT, 0, (int) pushConstants.byteSize(), pushConstants);

            vkCmdBindVertexBuffers(this.renderer.frameCommandBuffer(), 0, 1, arena.allocate(ValueLayout.ADDRESS, this.m_vertexBuffer.handle()), arena.allocate(ValueLayout.JAVA_LONG, 0));
            vkCmdBindIndexBuffer(this.renderer.frameCommandBuffer(), this.m_indexBuffer.handle(), 0, VK_INDEX_TYPE_UINT16);

            VkRect2D scissor = new VkRect2D(arena);

            int indexOffset = 0;
            for (MemorySegment cmd = nk__draw_begin(this.m_ctx._ptr(), this.m_cmds._ptr()); !cmd.equals(NULL); cmd = nk__draw_next(cmd, this.m_cmds._ptr(), this.m_ctx._ptr()))
            {
                nk_draw_command command = new nk_draw_command(cmd.reinterpret(nk_draw_command.gStructLayout.byteSize()));

                if (command.elem_count() == 0)
                {
                    continue;
                }

                command.clip_rect(rect ->
                {
                    scissor.offset(o ->
                    {

                        o.x((int) Math.max(rect.x(), 0.0f));
                        o.y((int) Math.max(rect.y(), 0.0f));
                    });
                    scissor.extent(e ->
                    {
                        e.width((int) rect.w());
                        e.height((int) rect.h());
                    });
                });

                vkCmdSetScissor(this.renderer.frameCommandBuffer(), 0, 1, scissor.ptr());
                vkCmdDrawIndexed(this.renderer.frameCommandBuffer(), command.elem_count(), 1, indexOffset, 0, 0);

                indexOffset += command.elem_count();
            }

            nk_clear(this.m_ctx._ptr());
        }
    }

    public void updateInputs(WindowInputMap inputs)
    {
        nk_input_begin(this.m_ctx._ptr());

        nk_input_key(this.m_ctx._ptr(), NK_KEY_DEL, inputs.keyAction(GLFW_KEY_DELETE) == GLFW_PRESS ? 1 : 0);
        nk_input_key(this.m_ctx._ptr(), NK_KEY_ENTER, inputs.keyAction(GLFW_KEY_ENTER) == GLFW_PRESS ? 1 : 0);
        nk_input_key(this.m_ctx._ptr(), NK_KEY_TAB, inputs.keyAction(GLFW_KEY_TAB) == GLFW_PRESS ? 1 : 0);
        nk_input_key(this.m_ctx._ptr(), NK_KEY_BACKSPACE, inputs.keyAction(GLFW_KEY_BACKSPACE) == GLFW_PRESS ? 1 : 0);
        nk_input_key(this.m_ctx._ptr(), NK_KEY_UP, inputs.keyAction(GLFW_KEY_UP) == GLFW_PRESS ? 1 : 0);
        nk_input_key(this.m_ctx._ptr(), NK_KEY_DOWN, inputs.keyAction(GLFW_KEY_DOWN) == GLFW_PRESS ? 1 : 0);
        nk_input_key(this.m_ctx._ptr(), NK_KEY_LEFT, inputs.keyAction(GLFW_KEY_LEFT) == GLFW_PRESS ? 1 : 0);
        nk_input_key(this.m_ctx._ptr(), NK_KEY_RIGHT, inputs.keyAction(GLFW_KEY_RIGHT) == GLFW_PRESS ? 1 : 0);
        nk_input_key(this.m_ctx._ptr(), NK_KEY_TEXT_START, inputs.keyAction(GLFW_KEY_HOME) == GLFW_PRESS ? 1 : 0);
        nk_input_key(this.m_ctx._ptr(), NK_KEY_TEXT_END, inputs.keyAction(GLFW_KEY_END) == GLFW_PRESS ? 1 : 0);
        nk_input_key(this.m_ctx._ptr(), NK_KEY_SCROLL_START, inputs.keyAction(GLFW_KEY_HOME) == GLFW_PRESS ? 1 : 0);
        nk_input_key(this.m_ctx._ptr(), NK_KEY_SCROLL_END, inputs.keyAction(GLFW_KEY_END) == GLFW_PRESS ? 1 : 0);
        nk_input_key(this.m_ctx._ptr(), NK_KEY_SCROLL_DOWN, inputs.keyAction(GLFW_KEY_PAGE_DOWN) == GLFW_PRESS ? 1 : 0);
        nk_input_key(this.m_ctx._ptr(), NK_KEY_SCROLL_UP, inputs.keyAction(GLFW_KEY_PAGE_UP) == GLFW_PRESS ? 1 : 0);

        nk_input_motion(this.m_ctx._ptr(), (int)inputs.mouseX(), (int)inputs.mouseY());

        nk_input_button(this.m_ctx._ptr(), NK_BUTTON_LEFT, (int)inputs.mouseX(), (int)inputs.mouseY(), inputs.mouseAction(GLFW_MOUSE_BUTTON_1) == GLFW_PRESS ? 1 : 0);
        nk_input_button(this.m_ctx._ptr(), NK_BUTTON_RIGHT, (int)inputs.mouseX(), (int)inputs.mouseY(), inputs.mouseAction(GLFW_MOUSE_BUTTON_2) == GLFW_PRESS ? 1 : 0);
        nk_input_button(this.m_ctx._ptr(), NK_BUTTON_MIDDLE, (int)inputs.mouseX(), (int)inputs.mouseY(), inputs.mouseAction(GLFW_MOUSE_BUTTON_3) == GLFW_PRESS ? 1 : 0);

        nk_input_end(this.m_ctx._ptr());
    }

    @Override
    public void dispose()
    {
        this.m_atlasImage.dispose();
        nk_buffer_free(this.m_cmds._ptr());

        this.m_vertexBuffer.dispose();
        this.m_indexBuffer.dispose();

        vkDestroySampler(this.renderer.logicalDevice().handle(), this.m_sampler, NULL);
    }
}
