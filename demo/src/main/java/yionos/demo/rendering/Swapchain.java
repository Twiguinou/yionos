package yionos.demo.rendering;

import vulkan.VkDevice;
import vulkan.VkExtent2D;
import vulkan.VkImageViewCreateInfo;
import vulkan.VkSurfaceCapabilitiesKHR;
import vulkan.VkSurfaceFormatKHR;
import vulkan.VkSwapchainCreateInfoKHR;
import yionos.demo.Disposable;
import yionos.demo.SequencedDisposer;

import javax.annotation.Nullable;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.util.Optional;

import static vulkan.VulkanCore.*;
import static vulkan.VkFormat.*;
import static vulkan.VkColorSpaceKHR.*;
import static vulkan.VkPresentModeKHR.*;
import static vulkan.VkStructureType.*;
import static vulkan.VkImageUsageFlagBits.*;
import static vulkan.VkCompositeAlphaFlagBitsKHR.*;
import static vulkan.VkSharingMode.*;
import static vulkan.VkImageViewType.*;
import static vulkan.VkSurfaceTransformFlagBitsKHR.*;
import static vulkan.VkComponentSwizzle.*;
import static vulkan.VkImageAspectFlagBits.*;
import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemorySegment.NULL;

public class Swapchain implements Disposable
{
    public record SurfaceFormat(int format, int colorSpace)
    {
        public SurfaceFormat(VkSurfaceFormatKHR surfaceFormat)
        {
            this(surfaceFormat.format(), surfaceFormat.colorSpace());
        }
    }

    private MemorySegment m_handle = NULL;
    public final VkDevice device;
    private VulkanImage[] m_images = new VulkanImage[0];
    private @Nullable SurfaceFormat m_surfaceFormat = null;
    private int m_width = 0, m_height = 0;

    public Swapchain(VkDevice device)
    {
        this.device = device;
    }

    public static SurfaceFormat selectSurfaceFormat(VkSurfaceFormatKHR[] surfaceFormats)
    {
        assert surfaceFormats.length > 0;

        for (VkSurfaceFormatKHR surfaceFormat : surfaceFormats)
        {
            if (surfaceFormat.format() == VK_FORMAT_B8G8R8A8_UNORM && surfaceFormat.colorSpace() == VK_COLORSPACE_SRGB_NONLINEAR_KHR)
            {
                return new SurfaceFormat(surfaceFormat);
            }
        }

        if (surfaceFormats[0].format() == VK_FORMAT_UNDEFINED)
        {
            return new SurfaceFormat(VK_FORMAT_B8G8R8A8_UNORM, VK_COLORSPACE_SRGB_NONLINEAR_KHR);
        }

        return new SurfaceFormat(surfaceFormats[0]);
    }

    private static int selectPresentMode(int[] presentModes, boolean vsync)
    {
        int selection = VK_PRESENT_MODE_FIFO_KHR;
        if (!vsync)
        {
            for (int presentMode : presentModes)
            {
                if (presentMode == VK_PRESENT_MODE_MAILBOX_KHR)
                {
                    selection = VK_PRESENT_MODE_MAILBOX_KHR;
                    break;
                }

                if (presentMode == VK_PRESENT_MODE_IMMEDIATE_KHR)
                {
                    selection = presentMode;
                }
            }
        }

        return selection;
    }

    private static VkExtent2D selectExtent(Arena arena, VkSurfaceCapabilitiesKHR capabilities, int width, int height)
    {
        VkExtent2D extent = capabilities.currentExtent();
        if (extent.width() == -1)
        {
            extent = new VkExtent2D(arena);
            VkExtent2D min = capabilities.minImageExtent(), max = capabilities.maxImageExtent();
            extent.width(Math.max(min.width(), Math.min(max.width(), width)));
            extent.height(Math.max(min.height(), Math.min(max.height(), height)));
        }

        return extent;
    }

    private void createImages(SegmentAllocator allocator) throws VulkanException
    {
        SequencedDisposer.wrap(disposer ->
        {
            MemorySegment pImageCount = allocator.allocate(JAVA_INT);
            VulkanException.check(vkGetSwapchainImagesKHR(this.device, this.m_handle, pImageCount, NULL));
            int swapchainImageCount = pImageCount.get(JAVA_INT, 0);
            MemorySegment pImages = allocator.allocate(ADDRESS, swapchainImageCount);
            VulkanException.check(vkGetSwapchainImagesKHR(this.device, this.m_handle, pImageCount, pImages));

            VkImageViewCreateInfo imageViewCreateInfo = new VkImageViewCreateInfo(allocator);
            imageViewCreateInfo.sType(VK_STRUCTURE_TYPE_IMAGE_VIEW_CREATE_INFO);
            imageViewCreateInfo.pNext(NULL);
            imageViewCreateInfo.flags(0);
            imageViewCreateInfo.viewType(VK_IMAGE_VIEW_TYPE_2D);
            imageViewCreateInfo.format(this.surfaceFormat().orElseThrow().format);
            imageViewCreateInfo.components(components ->
            {
                components.r(VK_COMPONENT_SWIZZLE_R);
                components.g(VK_COMPONENT_SWIZZLE_G);
                components.b(VK_COMPONENT_SWIZZLE_B);
                components.a(VK_COMPONENT_SWIZZLE_A);
            });
            imageViewCreateInfo.subresourceRange(range ->
            {
                range.aspectMask(VK_IMAGE_ASPECT_COLOR_BIT);
                range.baseMipLevel(0);
                range.levelCount(1);
                range.baseArrayLayer(0);
                range.layerCount(1);
            });

            MemorySegment pImageView = allocator.allocate(ADDRESS);
            this.m_images = new VulkanImage[swapchainImageCount];
            for (int i = 0; i < this.m_images.length; i++)
            {
                MemorySegment image = pImages.getAtIndex(ADDRESS, i);
                imageViewCreateInfo.image(image);
                VulkanException.check(vkCreateImageView(this.device, imageViewCreateInfo.ptr(), NULL, pImageView), "Unable to create image view");
                MemorySegment imageView = pImageView.get(ADDRESS, 0);
                this.m_images[i] = new VulkanImage()
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
                        vkDestroyImageView(Swapchain.this.device, this.view(), NULL);
                    }
                };
                disposer.push(this.m_images[i]);
            }
        });
    }

    public void initialize(VulkanRenderContext context, int graphicsQueueFamily, int presentQueueFamily, boolean vsync) throws VulkanException
    {
        SequencedDisposer.wrap(disposer ->
        {
            try (Arena arena = Arena.ofConfined())
            {
                VulkanRenderContext.PhysicalDeviceSurfaceProperties surfaceProperties = context.surfaceProperties().orElseThrow();

                this.m_surfaceFormat = selectSurfaceFormat(surfaceProperties.formats());
                int minImageCount = Math.max(surfaceProperties.capabilities().minImageCount() + 1, surfaceProperties.capabilities().maxImageCount());
                int presentMode = selectPresentMode(surfaceProperties.presentModes(), vsync);
                VkExtent2D extent = selectExtent(arena, surfaceProperties.capabilities(), context.window.width(), context.window.height());

                VkSwapchainCreateInfoKHR swapchainCreateInfo = new VkSwapchainCreateInfoKHR(arena);
                swapchainCreateInfo.sType(VK_STRUCTURE_TYPE_SWAPCHAIN_CREATE_INFO_KHR);
                swapchainCreateInfo.surface(context.surface());
                swapchainCreateInfo.minImageCount(minImageCount);
                swapchainCreateInfo.imageFormat(this.m_surfaceFormat.format);
                swapchainCreateInfo.imageColorSpace(this.m_surfaceFormat.colorSpace);
                swapchainCreateInfo.imageExtent(extent);
                swapchainCreateInfo.imageArrayLayers(1);
                swapchainCreateInfo.imageUsage(VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT | VK_IMAGE_USAGE_TRANSFER_SRC_BIT);
                swapchainCreateInfo.preTransform(VK_SURFACE_TRANSFORM_IDENTITY_BIT_KHR);
                swapchainCreateInfo.compositeAlpha(VK_COMPOSITE_ALPHA_OPAQUE_BIT_KHR);
                swapchainCreateInfo.presentMode(presentMode);
                swapchainCreateInfo.clipped(VK_TRUE);
                swapchainCreateInfo.oldSwapchain(this.m_handle);

                if (graphicsQueueFamily == presentQueueFamily)
                {
                    swapchainCreateInfo.imageSharingMode(VK_SHARING_MODE_EXCLUSIVE);
                }
                else
                {
                    swapchainCreateInfo.imageSharingMode(VK_SHARING_MODE_CONCURRENT);
                    swapchainCreateInfo.queueFamilyIndexCount(2);
                    swapchainCreateInfo.pQueueFamilyIndices(arena.allocateFrom(JAVA_INT, graphicsQueueFamily, presentMode));
                }

                MemorySegment pSwapchain = arena.allocate(ADDRESS);
                VulkanException.check(vkCreateSwapchainKHR(this.device, swapchainCreateInfo.ptr(), NULL, pSwapchain), "Unable to create Vulkan swapchain");
                this.dispose();
                this.m_handle = pSwapchain.get(ADDRESS, 0);
                disposer.push(this::destroyHandle);

                this.createImages(arena);

                this.m_width = extent.width();
                this.m_height = extent.height();
            }
        });
    }

    public MemorySegment handle()
    {
        return this.m_handle;
    }

    public VulkanImage[] images()
    {
        return this.m_images;
    }

    public Optional<SurfaceFormat> surfaceFormat()
    {
        return Optional.ofNullable(this.m_surfaceFormat);
    }

    public int width()
    {
        return this.m_width;
    }

    public int height()
    {
        return this.m_height;
    }

    public int acquireNextImage(MemorySegment semaphore, MemorySegment pImageIndex)
    {
        return vkAcquireNextImageKHR(this.device, this.m_handle, -1, semaphore, NULL, pImageIndex);
    }

    private void destroyHandle()
    {
        vkDestroySwapchainKHR(this.device, this.m_handle, NULL);
        this.m_handle = NULL;
    }

    @Override
    public void dispose()
    {
        for (VulkanImage image : this.m_images)
        {
            image.dispose();
        }

        this.m_images = new VulkanImage[0];
        this.destroyHandle();
    }
}
