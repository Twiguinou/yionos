package yionos.demo.app;

import vulkan.VkDevice;
import yionos.demo.Disposable;
import yionos.demo.rendering.DescriptorSetLayoutBuilder;

import java.lang.foreign.MemorySegment;

import static vulkan.VulkanCore.*;
import static vulkan.VkDescriptorType.*;
import static vulkan.VkShaderStageFlagBits.*;
import static java.lang.foreign.MemorySegment.NULL;

public record DescriptorSetLayouts(VkDevice device, MemorySegment objectBuffer) implements Disposable
{
    public static DescriptorSetLayouts create(VkDevice device)
    {
        MemorySegment objectBufferLayout = new DescriptorSetLayoutBuilder(0)
                .addBinding(new DescriptorSetLayoutBuilder.Binding(0, VK_DESCRIPTOR_TYPE_STORAGE_BUFFER, 1, VK_SHADER_STAGE_VERTEX_BIT, NULL))
                .build(device);

        return new DescriptorSetLayouts(device, objectBufferLayout);
    }

    @Override
    public void dispose()
    {
        vkDestroyDescriptorSetLayout(this.device, this.objectBuffer, NULL);
    }
}
