package yionos.demo.rendering;

import vulkan.VkPhysicalDeviceLimits;
import vulkan.VkPhysicalDeviceProperties;

public final class VulkanHelpers
{private VulkanHelpers() {}

    public static final int VK_API_VERSION_1_0 = VK_MAKE_API_VERSION(0, 1, 0, 0);
    public static final int VK_API_VERSION_1_1 = VK_MAKE_API_VERSION(0, 1, 1, 0);
    public static final int VK_API_VERSION_1_2 = VK_MAKE_API_VERSION(0, 1, 2, 0);
    public static final int VK_API_VERSION_1_3 = VK_MAKE_API_VERSION(0, 1, 3, 0);

    public static int VK_MAKE_API_VERSION(int variant, int major, int minor, int patch)
    {
        return (variant << 29) | (major << 22) | (minor << 12) | (patch);
    }

    public static int getMaxUsableSampleCount(VkPhysicalDeviceProperties properties)
    {
        VkPhysicalDeviceLimits limits = properties.limits();
        int counts = limits.framebufferColorSampleCounts() & limits.framebufferDepthSampleCounts();
        return Integer.highestOneBit(counts);
    }
}
