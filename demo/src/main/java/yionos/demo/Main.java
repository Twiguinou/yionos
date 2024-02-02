package yionos.demo;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.core.appender.ConsoleAppender;
import org.apache.logging.log4j.core.config.Configurator;
import org.apache.logging.log4j.core.config.builder.api.ConfigurationBuilder;
import org.apache.logging.log4j.core.config.builder.api.ConfigurationBuilderFactory;
import org.apache.logging.log4j.core.config.builder.impl.BuiltConfiguration;
import vulkan.VkPhysicalDeviceDynamicRenderingFeatures;
import yionos.demo.rendering.LogicalDevice;
import yionos.demo.rendering.VulkanContext;
import yionos.demo.rendering.VulkanRenderContext;

import java.lang.foreign.Arena;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static vulkan.VulkanCore.*;
import static vulkan.VkStructureType.*;
import static yionos.demo.rendering.VulkanHelpers.*;
import static vulkan.VkValidationFeatureEnableEXT.*;

public class Main
{
    private static final int gApplicationVersion = VK_MAKE_API_VERSION(0, 1, 0, 0);
    private static final int gEngineVersion = VK_MAKE_API_VERSION(0, 1, 0, 0);

    public static void configureLog4j()
    {
        ConfigurationBuilder<BuiltConfiguration> builder = ConfigurationBuilderFactory.newConfigurationBuilder();

        builder.setConfigurationName("jpgen-log4j-logger");
        builder.setStatusLevel(Level.WARN);

        builder.add(builder.newAppender("Console", "CONSOLE")
                .addAttribute("target", ConsoleAppender.Target.SYSTEM_OUT)
                .add(builder.newLayout("PatternLayout")
                        .addAttribute("disableAnsi", false)
                        .addAttribute("pattern", "%highlight{[%d] - %msg%n}{FATAL=red blink, ERROR=red, WARN=yellow bold, INFO=green, DEBUG=green bold, TRACE=blue}")));

        builder.add(builder.newRootLogger(Level.ALL)
                .add(builder.newAppenderRef("Console")));

        Configurator.reconfigure(builder.build());
    }

    public static void main(String... args)
    {
        configureLog4j();

        WindowProcessor window = new WindowProcessor("hello", 1280, 960);

        VulkanContext.AppInfo appInfo = new VulkanContext.AppInfo("yionos-demo", gApplicationVersion, "yionos", gEngineVersion, VK_API_VERSION_1_3);
        List<String> extensions = new ArrayList<>();
        extensions.add("VK_EXT_debug_utils");
        extensions.addAll(Arrays.asList(WindowProcessor.getVulkanExtensions()));

        VulkanContext context = new VulkanRenderContext(appInfo, new String[] {
                "VK_LAYER_KHRONOS_validation"
        }, extensions.toArray(String[]::new), new int[] {
                VK_VALIDATION_FEATURE_ENABLE_BEST_PRACTICES_EXT,
                VK_VALIDATION_FEATURE_ENABLE_SYNCHRONIZATION_VALIDATION_EXT,
                VK_VALIDATION_FEATURE_ENABLE_GPU_ASSISTED_EXT
        }, window);
        context.attachDebugMessenger(VulkanContext::defaultDebugMessenger);
        context.findSuitableDevice((physicalDevice1, physicalDevice2) ->
        {
            int i = 0;
            if (physicalDevice1.isDedicated()) ++i;
            if (physicalDevice2.isDedicated()) --i;
            if (physicalDevice1.features().samplerAnisotropy() == VK_TRUE) ++i;
            if (physicalDevice2.features().samplerAnisotropy() == VK_TRUE) --i;
            return i > 0 ? physicalDevice1 : physicalDevice2;
        });

        try (Arena arena = Arena.ofConfined())
        {
            VkPhysicalDeviceDynamicRenderingFeatures dynamicRenderingFeatures = new VkPhysicalDeviceDynamicRenderingFeatures(arena);
            dynamicRenderingFeatures.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DYNAMIC_RENDERING_FEATURES);
            dynamicRenderingFeatures.dynamicRendering(VK_TRUE);

            LogicalDevice logicalDevice = new LogicalDevice(context.physicalDevice(), new LogicalDevice.QueueDescriptor[0], new String[0], new String[] {
                    "VK_KHR_dynamic_rendering",
                    "VK_KHR_swapchain"
            }, dynamicRenderingFeatures.ptr());
        }

        window.show();

        while (!window.shouldClose())
        {
            window.beginRenderStage();
            window.endRenderStage();
        }

        window.dispose();
        context.dispose();
        WindowProcessor.terminateGlfw();
    }
}
