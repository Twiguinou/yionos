package yionos.demo.rendering;

import vulkan.VkDescriptorPoolCreateInfo;
import vulkan.VkDescriptorPoolSize;
import vulkan.VkDescriptorSetAllocateInfo;
import vulkan.VkDevice;
import yionos.demo.Disposable;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

import static vulkan.VulkanCore.*;
import static vulkan.VkStructureType.*;
import static java.lang.foreign.MemorySegment.NULL;

public class DescriptorPool implements Disposable
{
    public record Size(int type, int count) {}

    private final MemorySegment m_handle;
    public final VkDevice device;
    private final int m_capacity;

    public DescriptorPool(VkDevice device, DescriptorPool.Size[] sizes, int capacity) throws VulkanException
    {
        try (Arena arena = Arena.ofConfined())
        {
            MemorySegment poolSizes = arena.allocateArray(VkDescriptorPoolSize.gStructLayout, sizes.length);
            for (int i = 0; i < sizes.length; i++)
            {
                VkDescriptorPoolSize descriptorPoolSize = VkDescriptorPoolSize.getAtIndex(poolSizes, i);
                descriptorPoolSize.type(sizes[i].type);
                descriptorPoolSize.descriptorCount(sizes[i].count);
            }

            VkDescriptorPoolCreateInfo descriptorPoolCreateInfo = new VkDescriptorPoolCreateInfo(arena);
            descriptorPoolCreateInfo.sType(VK_STRUCTURE_TYPE_DESCRIPTOR_POOL_CREATE_INFO);
            descriptorPoolCreateInfo.pPoolSizes(poolSizes);
            descriptorPoolCreateInfo.maxSets(capacity);

            MemorySegment pDescriptorPool = arena.allocate(ValueLayout.ADDRESS);
            VulkanException.check(vkCreateDescriptorPool(device, descriptorPoolCreateInfo.ptr(), NULL, pDescriptorPool), "Unable to create descriptor pool");
            this.m_handle = pDescriptorPool.get(ValueLayout.ADDRESS, 0);

            this.device = device;
            this.m_capacity = capacity;
        }
    }

    public MemorySegment handle()
    {
        return this.m_handle;
    }

    public int capacity()
    {
        return this.m_capacity;
    }

    public MemorySegment allocateDescriptorSets(MemorySegment pSetLayouts, int count) throws VulkanException
    {
        try (Arena arena = Arena.ofConfined())
        {
            VkDescriptorSetAllocateInfo descriptorSetAllocateInfo = new VkDescriptorSetAllocateInfo(arena);
            descriptorSetAllocateInfo.sType(VK_STRUCTURE_TYPE_DESCRIPTOR_SET_ALLOCATE_INFO);
            descriptorSetAllocateInfo.descriptorPool(this.m_handle);
            descriptorSetAllocateInfo.descriptorSetCount(count);
            descriptorSetAllocateInfo.pSetLayouts(pSetLayouts);

            MemorySegment pDescriptorSets = arena.allocateArray(ValueLayout.ADDRESS, count);
            VulkanException.check(vkAllocateDescriptorSets(this.device, descriptorSetAllocateInfo.ptr(), pDescriptorSets), "Failed to allocate descriptor sets");
            return pDescriptorSets;
        }
    }

    @Override
    public void dispose()
    {
        vkDestroyDescriptorPool(this.device, this.m_handle, NULL);
    }
}
