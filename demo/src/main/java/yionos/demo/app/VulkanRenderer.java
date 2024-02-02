package yionos.demo.app;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import vulkan.VkPhysicalDevice;
import vulkan.VkQueueFamilyProperties;
import yionos.demo.WindowProcessor;
import yionos.demo.rendering.LogicalDevice;
import yionos.demo.rendering.VulkanContext;
import yionos.demo.rendering.VulkanException;
import yionos.demo.rendering.VulkanRenderContext;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static vulkan.VulkanCore.*;
import static vulkan.VkValidationFeatureEnableEXT.*;
import static yionos.demo.rendering.VulkanHelpers.*;
import static vulkan.VkQueueFlagBits.*;
import static java.lang.foreign.MemorySegment.NULL;

public class VulkanRenderer
{
    private static final Logger gRendererLogger = LogManager.getLogger("Vulkan Renderer");

    private final VulkanRenderContext m_context;
    private final LogicalDevice m_logicalDevice;
    private final LogicalDevice.Queue m_graphicsQueue, m_presentQueue, m_transferQueue;

    public VulkanRenderer(WindowProcessor windowProc)
    {
        List<String> instanceExtensions = new ArrayList<>();
        instanceExtensions.add("VK_EXT_debug_utils");
        instanceExtensions.addAll(Arrays.asList(WindowProcessor.getVulkanExtensions()));

        VulkanContext.AppInfo appInfo = new VulkanContext.AppInfo("yionos", VK_MAKE_API_VERSION(0, 1, 0, 0), "yionos-eng", VK_MAKE_API_VERSION(0, 1, 0, 0), VK_API_VERSION_1_3);
        this.m_context = new VulkanRenderContext(appInfo, new String[] {
                "VK_LAYER_KHRONOS_validation"
        }, instanceExtensions.toArray(String[]::new), new int[] {
                VK_VALIDATION_FEATURE_ENABLE_BEST_PRACTICES_EXT,
                VK_VALIDATION_FEATURE_ENABLE_SYNCHRONIZATION_VALIDATION_EXT,
                VK_VALIDATION_FEATURE_ENABLE_GPU_ASSISTED_EXT
        }, windowProc);
        this.m_context.attachDebugMessenger(VulkanContext::defaultDebugMessenger);
        this.m_context.findSuitableDevice((first, second) ->
        {
            int i = 0;
            if (first.isDedicated()) ++i;
            if (second.isDedicated()) --i;
            if (first.features().samplerAnisotropy() != VK_FALSE) ++i;
            if (second.features().samplerAnisotropy() != VK_FALSE) --i;
            i += Math.clamp(getMaxUsableSampleCount(first.properties()) - getMaxUsableSampleCount(second.properties()), -1, 1);

            return i > 0 ? first : second;
        });
        gRendererLogger.info(STR."Selected physical device : \{this.m_context.physicalDevice().name()}");

        try (Arena arena = Arena.ofConfined())
        {
            LogicalDevice.QueueDescriptor[] queueDescriptors = new LogicalDevice.QueueDescriptor[] {
                    new LogicalDevice.QueueDescriptor()
            };
        }
    }

    private static LogicalDevice.QueueDescriptor[] selectQueueFamilies(VkPhysicalDevice physicalDevice, MemorySegment surface)
    {
        try (Arena arena = Arena.ofConfined())
        {
            MemorySegment pFamilyCount = arena.allocate(ValueLayout.JAVA_INT);
            vkGetPhysicalDeviceQueueFamilyProperties(physicalDevice, pFamilyCount, NULL);
            int familyCount = pFamilyCount.get(ValueLayout.JAVA_INT, 0);
            MemorySegment pFamilyProperties = arena.allocateArray(VkQueueFamilyProperties.gStructLayout, familyCount);
            vkGetPhysicalDeviceQueueFamilyProperties(physicalDevice, pFamilyCount, pFamilyProperties);

            MemorySegment pSupported = arena.allocate(ValueLayout.JAVA_INT);
            LogicalDevice.QueueDescriptor graphicsQueueDescriptor = null, presentQueueDescriptor = null, transferQueueDescriptor = null;
            for (int i = 0; i < familyCount; i++)
            {
                VkQueueFamilyProperties properties = VkQueueFamilyProperties.getAtIndex(pFamilyProperties, i);
                VulkanException.check(vkGetPhysicalDeviceSurfaceSupportKHR(physicalDevice, i, surface, pSupported));
                boolean presentQueue = pSupported.get(ValueLayout.JAVA_INT, 0) != VK_FALSE;

                if ((properties.queueFlags() & VK_QUEUE_GRAPHICS_BIT) != 0)
                {
                    if (presentQueue)
                    {
                        graphicsQueueDescriptor = new LogicalDevice.QueueDescriptor(i, 1.f);
                        presentQueueDescriptor = graphicsQueueDescriptor;
                    }
                    else if (graphicsQueueDescriptor == null)
                    {
                        graphicsQueueDescriptor = new LogicalDevice.QueueDescriptor(i, 1.f);
                    }
                }
            }
        }
    }
}
