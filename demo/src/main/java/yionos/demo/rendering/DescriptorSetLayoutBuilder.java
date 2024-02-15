package yionos.demo.rendering;

import vulkan.VkDescriptorSetLayoutBinding;
import vulkan.VkDescriptorSetLayoutCreateInfo;
import vulkan.VkDevice;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.util.ArrayList;
import java.util.List;

import static vulkan.VulkanCore.*;
import static vulkan.VkStructureType.*;
import static vulkan.VkDescriptorType.*;
import static java.lang.foreign.MemorySegment.NULL;

public class DescriptorSetLayoutBuilder
{
    public record Binding(int value, int descriptorType, int descriptorCount, int stageFlags, MemorySegment pImmutableSamplers)
    {
        public void write(VkDescriptorSetLayoutBinding binding)
        {
            binding.binding(this.value);
            binding.descriptorType(this.descriptorType);
            binding.descriptorCount(this.descriptorCount);
            binding.stageFlags(this.stageFlags);
            binding.pImmutableSamplers(this.pImmutableSamplers);
        }
    }

    private final int m_flags;
    private final List<Binding> m_bindings = new ArrayList<>();

    public DescriptorSetLayoutBuilder(int flags)
    {
        this.m_flags = flags;
    }

    public DescriptorSetLayoutBuilder addBinding(Binding binding)
    {
        if (binding.descriptorType == VK_DESCRIPTOR_TYPE_MUTABLE_EXT)
        {
            throw new IllegalArgumentException("Mutable descriptor types are not supported.");
        }

        this.m_bindings.add(binding);
        return this;
    }

    public MemorySegment build(VkDevice device) throws VulkanException
    {
        try (Arena arena = Arena.ofConfined())
        {
            MemorySegment pBindings = arena.allocateArray(VkDescriptorSetLayoutBinding.gStructLayout, this.m_bindings.size());
            for (int i = 0; i < this.m_bindings.size(); i++)
            {
                this.m_bindings.get(i).write(VkDescriptorSetLayoutBinding.getAtIndex(pBindings, i));
            }

            VkDescriptorSetLayoutCreateInfo layoutCreateInfo = new VkDescriptorSetLayoutCreateInfo(arena);
            layoutCreateInfo.sType(VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_CREATE_INFO);
            layoutCreateInfo.flags(this.m_flags);
            layoutCreateInfo.bindingCount(this.m_bindings.size());
            layoutCreateInfo.pBindings(pBindings);

            MemorySegment pLayout = arena.allocate(ValueLayout.ADDRESS);
            VulkanException.check(vkCreateDescriptorSetLayout(device, layoutCreateInfo.ptr(), NULL, pLayout), "Unable to create descriptor set layout");
            return pLayout.get(ValueLayout.ADDRESS, 0);
        }
    }
}
