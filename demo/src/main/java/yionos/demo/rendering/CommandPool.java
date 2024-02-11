package yionos.demo.rendering;

import vulkan.VkCommandBuffer;
import vulkan.VkCommandBufferAllocateInfo;
import vulkan.VkCommandPoolCreateInfo;
import vulkan.VkDevice;
import yionos.demo.Disposable;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

import static vulkan.VulkanCore.*;
import static vulkan.VkStructureType.*;
import static java.lang.foreign.MemorySegment.NULL;

public class CommandPool implements Disposable
{
    private final MemorySegment m_handle;
    public final VkDevice device;

    public CommandPool(VkDevice device, int flags, int queueFamily) throws VulkanException
    {
        try (Arena arena = Arena.ofConfined())
        {
            VkCommandPoolCreateInfo commandPoolCreateInfo = new VkCommandPoolCreateInfo(arena);
            commandPoolCreateInfo.sType(VK_STRUCTURE_TYPE_COMMAND_POOL_CREATE_INFO);
            commandPoolCreateInfo.pNext(NULL);
            commandPoolCreateInfo.flags(flags);
            commandPoolCreateInfo.queueFamilyIndex(queueFamily);

            MemorySegment pCommandPool = arena.allocate(ValueLayout.ADDRESS);
            VulkanException.check(vkCreateCommandPool(device, commandPoolCreateInfo.ptr(), NULL, pCommandPool), "Vulkan command pool creation failed");
            this.m_handle = pCommandPool.get(ValueLayout.ADDRESS, 0);

            this.device = device;
        }
    }

    public MemorySegment handle()
    {
        return this.m_handle;
    }

    public void reset() throws VulkanException
    {
        VulkanException.check(vkResetCommandPool(this.device, this.m_handle, 0), "Could not reset command pool");
    }

    public VkCommandBuffer[] allocate(int level, int commandBufferCount) throws VulkanException
    {
        try (Arena arena = Arena.ofConfined())
        {
            MemorySegment pCommandBuffers = arena.allocateArray(ValueLayout.ADDRESS, commandBufferCount);

            VkCommandBufferAllocateInfo commandBufferAllocateInfo = new VkCommandBufferAllocateInfo(arena);
            commandBufferAllocateInfo.sType(VK_STRUCTURE_TYPE_COMMAND_BUFFER_ALLOCATE_INFO);
            commandBufferAllocateInfo.pNext(NULL);
            commandBufferAllocateInfo.commandPool(this.m_handle);
            commandBufferAllocateInfo.level(level);
            commandBufferAllocateInfo.commandBufferCount(commandBufferCount);

            VulkanException.check(vkAllocateCommandBuffers(this.device, commandBufferAllocateInfo.ptr(), pCommandBuffers), "Failed to allocate command buffers");

            VkCommandBuffer[] commandBuffers = new VkCommandBuffer[commandBufferCount];
            for (int i = 0; i < commandBufferCount; i++)
            {
                commandBuffers[i] = new VkCommandBuffer(pCommandBuffers.getAtIndex(ValueLayout.ADDRESS, i), this.device);
            }

            return commandBuffers;
        }
    }

    public void free(VkCommandBuffer[] commandBuffers) throws VulkanException
    {
        try (Arena arena = Arena.ofConfined())
        {
            MemorySegment pCommandBuffers = arena.allocateArray(ValueLayout.ADDRESS, commandBuffers.length);
            for (int i = 0; i < commandBuffers.length; i++)
            {
                pCommandBuffers.setAtIndex(ValueLayout.ADDRESS, i, commandBuffers[i].handle());
            }


            vkFreeCommandBuffers(this.device, this.m_handle, commandBuffers.length, pCommandBuffers);
        }
    }

    @Override
    public void dispose()
    {
        vkDestroyCommandPool(this.device, this.m_handle, NULL);
    }
}
