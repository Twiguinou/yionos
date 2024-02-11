package yionos.demo.rendering;

import vma.VmaAllocationCreateInfo;
import vulkan.VkImageCreateInfo;
import vulkan.VkImageViewCreateInfo;
import yionos.demo.Disposable;
import yionos.demo.SequenceInitializer;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

import static vulkan.VulkanCore.*;
import static vma.VMA.*;
import static vulkan.VkStructureType.*;
import static vulkan.VkImageType.*;
import static vulkan.VkImageLayout.*;
import static vulkan.VkSharingMode.*;
import static vulkan.VkImageViewType.*;
import static vulkan.VkImageCreateFlagBits.*;
import static java.lang.foreign.MemorySegment.NULL;

public interface VulkanImage
{
    MemorySegment handle();

    MemorySegment view();

    class Allocated implements VulkanImage, Disposable
    {
        private final MemorySegment m_image;
        private final MemorySegment m_imageView;
        public final LogicalDevice logicalDevice;
        private final MemorySegment m_allocation;

        public Allocated(LogicalDevice logicalDevice, int width, int height, int format, int tiling, int usage, boolean cubemap, int mipLevels, int sampleCount, int aspectFlags,
                         int componentSwizzleR, int componentSwizzleG, int componentSwizzleB, int componentSwizzleA, int memoryUsage) throws VulkanException
        {
            try (Arena arena = Arena.ofConfined())
            {
                SequenceInitializer initializer = new SequenceInitializer();

                VkImageCreateInfo imageCreateInfo = new VkImageCreateInfo(arena);
                imageCreateInfo.sType(VK_STRUCTURE_TYPE_IMAGE_CREATE_INFO);
                imageCreateInfo.imageType(VK_IMAGE_TYPE_2D);
                imageCreateInfo.extent(e ->
                {
                    e.width(width);
                    e.height(height);
                    e.depth(1);
                });
                imageCreateInfo.mipLevels(mipLevels);
                imageCreateInfo.format(format);
                imageCreateInfo.tiling(tiling);
                imageCreateInfo.initialLayout(VK_IMAGE_LAYOUT_UNDEFINED);
                imageCreateInfo.usage(usage);
                imageCreateInfo.sharingMode(VK_SHARING_MODE_EXCLUSIVE);
                imageCreateInfo.samples(sampleCount);

                if (cubemap)
                {
                    imageCreateInfo.flags(VK_IMAGE_CREATE_CUBE_COMPATIBLE_BIT);
                    imageCreateInfo.arrayLayers(6);
                }
                else
                {
                    imageCreateInfo.arrayLayers(1);
                }

                VmaAllocationCreateInfo allocationCreateInfo = new VmaAllocationCreateInfo(arena);
                allocationCreateInfo.usage(memoryUsage);

                MemorySegment pImage = arena.allocate(ValueLayout.ADDRESS);
                MemorySegment pAllocation = arena.allocate(ValueLayout.ADDRESS);
                VulkanException.check(vmaCreateImage(logicalDevice.allocator(), imageCreateInfo.ptr(), allocationCreateInfo.ptr(), pImage, pAllocation, NULL), "Vma image creation/allocation failed", initializer);
                this.m_image = pImage.get(ValueLayout.ADDRESS, 0);
                this.m_allocation = pAllocation.get(ValueLayout.ADDRESS, 0);
                initializer.push(this::destroyImage);

                VkImageViewCreateInfo imageViewCreateInfo = new VkImageViewCreateInfo(arena);
                imageViewCreateInfo.sType(VK_STRUCTURE_TYPE_IMAGE_VIEW_CREATE_INFO);
                imageViewCreateInfo.image(this.m_image);
                imageViewCreateInfo.format(format);
                imageViewCreateInfo.components(c ->
                {
                    c.r(componentSwizzleR);
                    c.g(componentSwizzleG);
                    c.b(componentSwizzleB);
                    c.a(componentSwizzleA);
                });
                imageViewCreateInfo.subresourceRange(r ->
                {
                    r.aspectMask(aspectFlags);
                    r.baseMipLevel(0);
                    r.levelCount(mipLevels);
                    r.baseArrayLayer(0);
                });

                if (cubemap)
                {
                    imageViewCreateInfo.viewType(VK_IMAGE_VIEW_TYPE_CUBE);
                    imageViewCreateInfo.subresourceRange().layerCount(6);
                }
                else
                {
                    imageViewCreateInfo.viewType(VK_IMAGE_VIEW_TYPE_2D);
                    imageViewCreateInfo.subresourceRange().layerCount(1);
                }

                MemorySegment pImageView = arena.allocate(ValueLayout.ADDRESS);
                VulkanException.check(vkCreateImageView(logicalDevice.handle(), imageViewCreateInfo.ptr(), NULL, pImageView), "Unable to create image view", initializer);
                this.m_imageView = pImageView.get(ValueLayout.ADDRESS, 0);
                initializer.push(this::destroyImageView);

                this.logicalDevice = logicalDevice;
            }
        }

        @Override
        public MemorySegment handle()
        {
            return this.m_image;
        }

        @Override
        public MemorySegment view()
        {
            return this.m_imageView;
        }

        private void destroyImage()
        {
            vmaDestroyImage(this.logicalDevice.allocator(), this.m_image, this.m_allocation);
        }

        private void destroyImageView()
        {
            vkDestroyImageView(this.logicalDevice.handle(), this.m_imageView, NULL);
        }

        @Override
        public void dispose()
        {
            this.destroyImageView();
            this.destroyImage();
        }
    }
}
