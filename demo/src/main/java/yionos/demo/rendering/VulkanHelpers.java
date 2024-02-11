package yionos.demo.rendering;

import vulkan.VkCommandBuffer;
import vulkan.VkCommandBufferBeginInfo;
import vulkan.VkDevice;
import vulkan.VkPhysicalDeviceLimits;
import vulkan.VkPhysicalDeviceProperties;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

import static vulkan.VulkanCore.*;
import static vulkan.VkStructureType.*;

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

    public static ShaderModule loadShaderFromFile(VkDevice device, File file, int stage) throws VulkanException
    {
        try (Arena arena = Arena.ofConfined(); InputStream input = new FileInputStream(file))
        {
            byte[] bytes = input.readAllBytes();
            MemorySegment data = arena.allocateArray(ValueLayout.JAVA_BYTE, bytes);
            return new ShaderModule(device, stage, data, new ShaderModule.CompilationTask(file.getName(), "main", true));
        }
        catch (IOException e)
        {
            throw new VulkanException(e.toString());
        }
    }


    public static void beginCommandBuffer(Arena arena, VkCommandBuffer commandBuffer, int flags) throws VulkanException
    {
        VkCommandBufferBeginInfo commandBufferBeginInfo = new VkCommandBufferBeginInfo(arena);
        commandBufferBeginInfo.sType(VK_STRUCTURE_TYPE_COMMAND_BUFFER_BEGIN_INFO);
        commandBufferBeginInfo.flags(flags);

        VulkanException.check(vkBeginCommandBuffer(commandBuffer, commandBufferBeginInfo.ptr()));
    }
}
