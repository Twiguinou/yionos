package yionos.demo.rendering;

import vma.VmaAllocationCreateInfo;
import vulkan.VkBufferCopy;
import vulkan.VkBufferCreateInfo;
import vulkan.VkCommandBuffer;
import vulkan.VkSubmitInfo;
import yionos.demo.Disposable;
import yionos.demo.SequenceInitializer;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;

import static vulkan.VulkanCore.*;
import static vulkan.VkStructureType.*;
import static vulkan.VkSharingMode.*;
import static vulkan.VkImageUsageFlagBits.*;
import static vulkan.VkCommandBufferUsageFlagBits.*;
import static vulkan.VkCommandBufferLevel.*;
import static vma.VMA.*;
import static vma.VmaMemoryUsage.*;
import static yionos.demo.rendering.VulkanHelpers.*;
import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemorySegment.NULL;

public class VulkanBuffer implements Disposable
{
    private final MemorySegment m_handle;
    public final MemorySegment allocator;
    private final long m_size;
    private final MemorySegment m_allocation;

    public VulkanBuffer(MemorySegment allocator, long size, int usage, int[] queueFamilies, int memoryUsage) throws VulkanException
    {
        try (Arena arena = Arena.ofConfined())
        {
            VkBufferCreateInfo bufferCreateInfo = new VkBufferCreateInfo(arena);
            bufferCreateInfo.sType(VK_STRUCTURE_TYPE_BUFFER_CREATE_INFO);
            bufferCreateInfo.size(size);
            bufferCreateInfo.usage(usage);

            if (queueFamilies.length > 1)
            {
                bufferCreateInfo.sharingMode(VK_SHARING_MODE_CONCURRENT);
                bufferCreateInfo.queueFamilyIndexCount(queueFamilies.length);
                bufferCreateInfo.pQueueFamilyIndices(arena.allocateFrom(JAVA_INT, queueFamilies));
            }
            else
            {
                bufferCreateInfo.sharingMode(VK_SHARING_MODE_EXCLUSIVE);
            }

            VmaAllocationCreateInfo allocationCreateInfo = new VmaAllocationCreateInfo(arena);
            allocationCreateInfo.usage(memoryUsage);

            MemorySegment pBuffer = arena.allocate(ADDRESS);
            MemorySegment pAllocation = arena.allocate(ADDRESS);
            VulkanException.check(vmaCreateBuffer(allocator, bufferCreateInfo.ptr(), allocationCreateInfo.ptr(), pBuffer, pAllocation, NULL), "Vma buffer allocation failed");
            this.m_handle = pBuffer.get(ADDRESS, 0);
            this.m_allocation = pAllocation.get(ADDRESS, 0);

            this.allocator = allocator;
            this.m_size = size;
        }
    }

    public MemorySegment handle()
    {
        return this.m_handle;
    }

    public long size()
    {
        return this.m_size;
    }

    public void map(MemorySegment ppData) throws VulkanException
    {
        VulkanException.check(vmaMapMemory(this.allocator, this.m_allocation, ppData), "Failed to map vma buffer memory");
    }

    public void unmap()
    {
        vmaUnmapMemory(this.allocator, this.m_allocation);
    }

    public void put(MemorySegment data) throws VulkanException
    {
        try (Arena arena = Arena.ofConfined())
        {
            MemorySegment ppData = arena.allocate(ADDRESS);
            this.map(ppData);

            MemorySegment pData = ppData.get(ADDRESS, 0).reinterpret(data.byteSize());
            pData.copyFrom(data);

            this.unmap();
        }
    }

    public void upload(CommandPool commandPool, LogicalDevice.Queue queue, MemorySegment data) throws VulkanException
    {
        SequenceInitializer initializer = new SequenceInitializer();
        try (Arena arena = Arena.ofConfined())
        {
            VulkanBuffer stagingBuffer = new VulkanBuffer(this.allocator, data.byteSize(), VK_IMAGE_USAGE_TRANSFER_SRC_BIT, new int[] {queue.family()}, VMA_MEMORY_USAGE_CPU_TO_GPU);
            initializer.push(stagingBuffer);
            stagingBuffer.put(data);

            VkBufferCopy region = new VkBufferCopy(arena);
            region.size(data.byteSize());

            VkCommandBuffer commandBuffer = commandPool.allocate(VK_COMMAND_BUFFER_LEVEL_PRIMARY, 1)[0];
            initializer.push(() -> commandPool.free(new VkCommandBuffer[] {commandBuffer}));
            beginCommandBuffer(arena, commandBuffer, VK_COMMAND_BUFFER_USAGE_ONE_TIME_SUBMIT_BIT);

            vkCmdCopyBuffer(commandBuffer, stagingBuffer.m_handle, this.m_handle, 1, region.ptr());

            VulkanException.check(vkEndCommandBuffer(commandBuffer));

            VkSubmitInfo submitInfo = new VkSubmitInfo(arena);
            submitInfo.sType(VK_STRUCTURE_TYPE_SUBMIT_INFO);
            submitInfo.commandBufferCount(1);
            submitInfo.pCommandBuffers(arena.allocateFrom(ADDRESS, commandBuffer.handle()));

            VulkanException.check(vkQueueSubmit(queue.handle(), 1, submitInfo.ptr(), NULL));
            VulkanException.check(vkQueueWaitIdle(queue.handle()));
        }
        finally
        {
            initializer.empty();
        }
    }

    @Override
    public void dispose()
    {
        vmaDestroyBuffer(this.allocator, this.m_handle, this.m_allocation);
    }
}
