package yionos.demo.app;

import vulkan.VkDevice;
import vulkan.VkFenceCreateInfo;
import vulkan.VkSemaphoreCreateInfo;
import yionos.demo.Disposable;
import yionos.demo.rendering.VulkanException;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;

import static vulkan.VulkanCore.*;
import static vulkan.VkStructureType.*;
import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemorySegment.NULL;

public record VulkanSync(MemorySegment fences, MemorySegment imageAcquiredSemaphores, MemorySegment renderCompleteSemaphores, VkDevice device, int frameCount) implements Disposable
{
    public static VulkanSync create(VkDevice device, int frameCount)
    {
        try (Arena arena = Arena.ofConfined())
        {
            Arena globalArena = Arena.ofAuto();
            MemorySegment fences = globalArena.allocate(ADDRESS, frameCount);
            MemorySegment imageAcquiredSemaphores = globalArena.allocate(ADDRESS, frameCount);
            MemorySegment renderCompleteSemaphores = globalArena.allocate(ADDRESS, frameCount);

            VkSemaphoreCreateInfo semaphoreCreateInfo = new VkSemaphoreCreateInfo(arena);
            semaphoreCreateInfo.sType(VK_STRUCTURE_TYPE_SEMAPHORE_CREATE_INFO);

            VkFenceCreateInfo fenceCreateInfo = new VkFenceCreateInfo(arena);
            fenceCreateInfo.sType(VK_STRUCTURE_TYPE_FENCE_CREATE_INFO);
            //fenceCreateInfo.flags(VK_FENCE_CREATE_SIGNALED_BIT);

            for (int i = 0; i < frameCount; i++)
            {
                long offset = ADDRESS.byteSize() * i;

                VulkanException.check(vkCreateFence(device, fenceCreateInfo.ptr(), NULL, fences.asSlice(offset, ADDRESS)), "Unable to create fence");
                VulkanException.check(vkCreateSemaphore(device, semaphoreCreateInfo.ptr(), NULL, imageAcquiredSemaphores.asSlice(offset, ADDRESS)), "Unable to create semaphore");
                VulkanException.check(vkCreateSemaphore(device, semaphoreCreateInfo.ptr(), NULL, renderCompleteSemaphores.asSlice(offset, ADDRESS)), "Unable to create semaphore");
            }

            return new VulkanSync(fences, imageAcquiredSemaphores, renderCompleteSemaphores, device, frameCount);
        }
    }

    public MemorySegment fence(int index)
    {
        return this.fences.getAtIndex(ADDRESS, index);
    }

    public MemorySegment imageAcquiredSemaphore(int index)
    {
        return this.imageAcquiredSemaphores.getAtIndex(ADDRESS, index);
    }

    public MemorySegment renderCompleteSemaphore(int index)
    {
        return this.renderCompleteSemaphores.getAtIndex(ADDRESS, index);
    }

    @Override
    public void dispose()
    {
        for (int i = 0; i < this.frameCount; i++)
        {
            vkDestroyFence(this.device, this.fences.getAtIndex(ADDRESS, i), NULL);
            vkDestroySemaphore(this.device, this.imageAcquiredSemaphores.getAtIndex(ADDRESS, i), NULL);
            vkDestroySemaphore(this.device, this.renderCompleteSemaphores.getAtIndex(ADDRESS, i), NULL);
        }
    }
}
