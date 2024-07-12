package yionos.demo.rendering;

import vma.VmaAllocationCreateInfo;
import vulkan.VkDevice;
import vulkan.VkImageCreateInfo;
import vulkan.VkImageViewCreateInfo;
import yionos.demo.Disposable;
import yionos.demo.SequencedDisposer;

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
        return SequencedDisposer.wrap(disposer ->
        {
            try (Arena arena = Arena.ofConfined())
            {
                VmaAllocationCreateInfo allocationCreateInfo = new VmaAllocationCreateInfo(arena);
                allocationCreateInfo.usage(memoryUsage);

                MemorySegment pImage = arena.allocate(ADDRESS);
                MemorySegment pAllocation = arena.allocate(ADDRESS);
                VulkanException.check(vmaCreateImage(vmaAllocator, imageCreateInfo.ptr(), allocationCreateInfo.ptr(), pImage, pAllocation, NULL), "Vma image creation/allocation failed");

                MemorySegment image = pImage.get(ADDRESS, 0);
                MemorySegment allocation = pAllocation.get(ADDRESS, 0);
                disposer.push(() -> vmaDestroyImage(vmaAllocator, image, allocation));

                imageViewCreateInfo.image(image);

                MemorySegment pImageView = arena.allocate(ADDRESS);
                VulkanException.check(vkCreateImageView(device, imageViewCreateInfo.ptr(), NULL, pImageView), "Unable to create image view");
                MemorySegment imageView = pImageView.get(ADDRESS, 0);
                disposer.push(() -> vkDestroyImageView(device, imageView, NULL));

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
        });
    }
}
