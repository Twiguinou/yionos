package yionos.demo.rendering;

import vma.VmaAllocationCreateInfo;
import vulkan.VkDevice;
import vulkan.VkImageCreateInfo;
import vulkan.VkImageViewCreateInfo;
import yionos.demo.Disposable;
import yionos.demo.SequenceInitializer;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;

import static vulkan.VulkanCore.*;
import static vma.VMA.*;
import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemorySegment.NULL;

public interface VulkanImage extends Disposable
{
    MemorySegment handle();

    MemorySegment view();

    static VulkanImage allocate(VkDevice device, MemorySegment vmaAllocator, VkImageCreateInfo imageCreateInfo, VkImageViewCreateInfo imageViewCreateInfo, int memoryUsage) throws VulkanException
    {
        try (Arena arena = Arena.ofConfined())
        {
            SequenceInitializer initializer = new SequenceInitializer();

            VmaAllocationCreateInfo allocationCreateInfo = new VmaAllocationCreateInfo(arena);
            allocationCreateInfo.usage(memoryUsage);

            MemorySegment pImage = arena.allocate(ADDRESS);
            MemorySegment pAllocation = arena.allocate(ADDRESS);
            VulkanException.check(vmaCreateImage(vmaAllocator, imageCreateInfo.ptr(), allocationCreateInfo.ptr(), pImage, pAllocation, NULL), "Vma image creation/allocation failed", initializer);

            MemorySegment image = pImage.get(ADDRESS, 0);
            MemorySegment allocation = pAllocation.get(ADDRESS, 0);
            initializer.push(() -> vmaDestroyImage(vmaAllocator, image, allocation));

            imageViewCreateInfo.image(image);

            MemorySegment pImageView = arena.allocate(ADDRESS);
            VulkanException.check(vkCreateImageView(device, imageViewCreateInfo.ptr(), NULL, pImageView), "Unable to create image view", initializer);
            MemorySegment imageView = pImageView.get(ADDRESS, 0);
            initializer.push(() -> vkDestroyImageView(device, imageView, NULL));

            return new VulkanImage()
            {
                @Override
                public MemorySegment handle()
                {
                    return image;
                }

                @Override
                public MemorySegment view()
                {
                    return imageView;
                }

                @Override
                public void dispose()
                {
                    vkDestroyImageView(device, imageView, NULL);
                    vmaDestroyImage(vmaAllocator, image, allocation);
                }
            };
        }
    }
}
