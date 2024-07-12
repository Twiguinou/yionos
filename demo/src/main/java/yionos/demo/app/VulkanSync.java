package yionos.demo.app;

import vulkan.VkDevice;
import vulkan.VkFenceCreateInfo;
import vulkan.VkSemaphoreCreateInfo;
import yionos.demo.Disposable;
import yionos.demo.SequencedDisposer;
import yionos.demo.rendering.VulkanException;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.util.stream.IntStream;

import static vulkan.VulkanCore.*;
import static vulkan.VkStructureType.*;
import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemorySegment.NULL;

public class VulkanSync implements Disposable
{
    public final VkDevice device;
    private final MemorySegment m_fences;
    private final MemorySegment m_imageAcquiredSemaphores;
    private final MemorySegment m_renderCompleteSemaphores;
    public final int m_frameCount;
    private final Arena m_objectsArena = Arena.ofShared();

    public VulkanSync(VkDevice device, int frameCount)
    {
        SequencedDisposer disposer = new SequencedDisposer();
        try (Arena arena = Arena.ofConfined())
        {
            this.m_fences = this.m_objectsArena.allocate(ADDRESS, frameCount);
            this.m_imageAcquiredSemaphores = this.m_objectsArena.allocate(ADDRESS, frameCount);
            this.m_renderCompleteSemaphores = this.m_objectsArena.allocate(ADDRESS, frameCount);

            VkSemaphoreCreateInfo semaphoreCreateInfo = new VkSemaphoreCreateInfo(arena);
            semaphoreCreateInfo.sType(VK_STRUCTURE_TYPE_SEMAPHORE_CREATE_INFO);

            VkFenceCreateInfo fenceCreateInfo = new VkFenceCreateInfo(arena);
            fenceCreateInfo.sType(VK_STRUCTURE_TYPE_FENCE_CREATE_INFO);
            //fenceCreateInfo.flags(VK_FENCE_CREATE_SIGNALED_BIT);

            IntStream.range(0, frameCount).forEach(i ->
            {
                long offset = ADDRESS.byteSize() * i;

                VulkanException.check(vkCreateFence(device, fenceCreateInfo.ptr(), NULL, this.m_fences.asSlice(offset, ADDRESS)), "Unable to create fence");
                disposer.push(() -> vkDestroyFence(device, this.fence(i), NULL));
                VulkanException.check(vkCreateSemaphore(device, semaphoreCreateInfo.ptr(), NULL, this.m_imageAcquiredSemaphores.asSlice(offset, ADDRESS)), "Unable to create semaphore");
                disposer.push(() -> vkDestroyFence(device, this.imageAcquiredSemaphore(i), NULL));
                VulkanException.check(vkCreateSemaphore(device, semaphoreCreateInfo.ptr(), NULL, this.m_renderCompleteSemaphores.asSlice(offset, ADDRESS)), "Unable to create semaphore");
                disposer.push(() -> vkDestroyFence(device, this.renderCompleteSemaphore(i), NULL));
            });

            this.device = device;
            this.m_frameCount = frameCount;
        }
        catch (Throwable t)
        {
            disposer.close();
            throw t;
        }
    }

    public MemorySegment fence(int index)
    {
        return this.m_fences.getAtIndex(ADDRESS, index);
    }

    public MemorySegment imageAcquiredSemaphore(int index)
    {
        return this.m_imageAcquiredSemaphores.getAtIndex(ADDRESS, index);
    }

    public MemorySegment renderCompleteSemaphore(int index)
    {
        return this.m_renderCompleteSemaphores.getAtIndex(ADDRESS, index);
    }

    @Override
    public void dispose()
    {
        for (int i = 0; i < this.m_frameCount; i++)
        {
            vkDestroyFence(this.device, this.m_fences.getAtIndex(ADDRESS, i), NULL);
            vkDestroySemaphore(this.device, this.m_imageAcquiredSemaphores.getAtIndex(ADDRESS, i), NULL);
            vkDestroySemaphore(this.device, this.m_renderCompleteSemaphores.getAtIndex(ADDRESS, i), NULL);
        }

        this.m_objectsArena.close();
    }
}
