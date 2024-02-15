package yionos.demo.app;

import vulkan.VkDevice;
import yionos.demo.Disposable;
import yionos.demo.rendering.PipelineLayoutBuilder;

import java.lang.foreign.MemorySegment;

import static vulkan.VulkanCore.*;
import static vulkan.VkShaderStageFlagBits.*;
import static java.lang.foreign.MemorySegment.NULL;

public record PipelineLayouts(VkDevice device, MemorySegment staticGrid) implements Disposable
{
    public static PipelineLayouts create(VkDevice device)
    {
        MemorySegment staticGridLayout = new PipelineLayoutBuilder(0)
                .addPushConstant(VK_SHADER_STAGE_VERTEX_BIT, 0, Float.BYTES * 20)
                .build(device);

        return new PipelineLayouts(device, staticGridLayout);
    }

    @Override
    public void dispose()
    {
        vkDestroyPipelineLayout(this.device, this.staticGrid, NULL);
    }
}
