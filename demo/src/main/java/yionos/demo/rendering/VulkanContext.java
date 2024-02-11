package yionos.demo.rendering;

import jpgen.ForeignUtils;
import jpgen.NativeTypes;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import vulkan.*;
import yionos.demo.Disposable;

import javax.annotation.Nullable;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;

import static vulkan.VulkanCore.*;
import static vulkan.VkStructureType.*;
import static vulkan.VkPhysicalDeviceType.*;
import static vulkan.VkDebugUtilsMessageSeverityFlagBitsEXT.*;
import static vulkan.VkDebugUtilsMessageTypeFlagBitsEXT.*;
import static java.lang.foreign.MemorySegment.NULL;

public class VulkanContext implements Disposable
{
    public static final Logger gVulkanLogger = LogManager.getLogger("Vulkan Renderer");

    public record AppInfo(String appName, int appVersion, String engineName, int engineVersion, int apiVersion) {}

    public record PhysicalDevice(VkPhysicalDevice handle, VkPhysicalDeviceFeatures features, VkPhysicalDeviceProperties properties, VkPhysicalDeviceMemoryProperties memoryProperties)
    {
        public boolean isDedicated()
        {
            return this.properties.deviceType() == VK_PHYSICAL_DEVICE_TYPE_DISCRETE_GPU;
        }

        public String name()
        {
            return this.properties.deviceName().getUtf8String(0);
        }
    }

    private record DebugMessenger(MemorySegment handle, Arena arena) {}

    private final VkInstance m_instance;
    private @Nullable DebugMessenger m_debugMessenger = null;
    private @Nullable PhysicalDevice m_physicalDevice = null;

    public VulkanContext(AppInfo appInfo, String[] enabledLayers, String[] enabledExtensions, int[] validationFeatures) throws VulkanException
    {
        try (Arena arena = Arena.ofConfined())
        {
            VkApplicationInfo applicationInfo = new VkApplicationInfo(arena);
            applicationInfo.sType(VK_STRUCTURE_TYPE_APPLICATION_INFO);
            applicationInfo.pNext(NULL);
            applicationInfo.pApplicationName(arena.allocateUtf8String(appInfo.appName));
            applicationInfo.applicationVersion(appInfo.appVersion);
            applicationInfo.pEngineName(arena.allocateUtf8String(appInfo.engineName));
            applicationInfo.engineVersion(appInfo.engineVersion);
            applicationInfo.applicationVersion(appInfo.apiVersion);

            VkInstanceCreateInfo instanceCreateInfo = new VkInstanceCreateInfo(arena);
            instanceCreateInfo.sType(VK_STRUCTURE_TYPE_INSTANCE_CREATE_INFO);
            if (validationFeatures.length == 0)
            {
                instanceCreateInfo.pNext(NULL);
            }
            else
            {
                VkValidationFeaturesEXT features = new VkValidationFeaturesEXT(arena);
                features.sType(VK_STRUCTURE_TYPE_VALIDATION_FEATURES_EXT);
                features.pNext(NULL);
                features.enabledValidationFeatureCount(validationFeatures.length);
                features.pEnabledValidationFeatures(arena.allocateArray(ValueLayout.JAVA_INT, validationFeatures));
                features.disabledValidationFeatureCount(0);
                features.pDisabledValidationFeatures(NULL);
            }

            instanceCreateInfo.flags(0);
            instanceCreateInfo.pApplicationInfo(applicationInfo.ptr());
            instanceCreateInfo.enabledLayerCount(enabledLayers.length);
            instanceCreateInfo.ppEnabledLayerNames(ForeignUtils.allocateUtf8Array(arena, enabledLayers));
            instanceCreateInfo.enabledExtensionCount(enabledExtensions.length);
            instanceCreateInfo.ppEnabledExtensionNames(ForeignUtils.allocateUtf8Array(arena, enabledExtensions));

            MemorySegment pInstance = arena.allocate(ValueLayout.ADDRESS);
            VulkanException.check(vkCreateInstance(instanceCreateInfo.ptr(), NULL, pInstance), "Unable to create vulkan instance");
            this.m_instance = new VkInstance(pInstance.get(ValueLayout.ADDRESS, 0));
        }
    }

    public static int defaultDebugMessenger(int messageSeverity, int messageTypes, MemorySegment pCallbackData, MemorySegment pUserData)
    {
        pCallbackData = pCallbackData.reinterpret(VkDebugUtilsMessengerCallbackDataEXT.gStructLayout.byteSize());
        VkDebugUtilsMessengerCallbackDataEXT callbackData = new VkDebugUtilsMessengerCallbackDataEXT(pCallbackData);

        if (messageSeverity >= VK_DEBUG_UTILS_MESSAGE_SEVERITY_ERROR_BIT_EXT)
        {
            gVulkanLogger.error(callbackData.pMessage().reinterpret(NativeTypes.UNCHECKED_CHAR_PTR.byteSize()).getUtf8String(0));
        }
        else if (messageSeverity >= VK_DEBUG_UTILS_MESSAGE_SEVERITY_WARNING_BIT_EXT)
        {
            gVulkanLogger.warn(callbackData.pMessage().reinterpret(NativeTypes.UNCHECKED_CHAR_PTR.byteSize()).getUtf8String(0));
        }
        else if ((messageTypes & VK_DEBUG_UTILS_MESSAGE_TYPE_GENERAL_BIT_EXT) == 0)
        {
            gVulkanLogger.info(callbackData.pMessage().reinterpret(NativeTypes.UNCHECKED_CHAR_PTR.byteSize()).getUtf8String(0));
        }

        return VK_FALSE;
    }

    public VkInstance instance()
    {
        return this.m_instance;
    }

    public void findSuitableDevice(BinaryOperator<PhysicalDevice> comparator) throws VulkanException
    {
        this.m_physicalDevice = null;
        try (Arena arena = Arena.ofConfined())
        {
            MemorySegment pDeviceCount = arena.allocate(ValueLayout.JAVA_INT);
            VulkanException.check(vkEnumeratePhysicalDevices(this.m_instance, pDeviceCount, NULL));
            int deviceCount = pDeviceCount.get(ValueLayout.JAVA_INT, 0);
            if (deviceCount == 0)
            {
                return;
            }

            MemorySegment pPhysicalDevices = arena.allocateArray(ValueLayout.ADDRESS, deviceCount);
            VulkanException.check(vkEnumeratePhysicalDevices(this.m_instance, pDeviceCount, pPhysicalDevices));
            List<PhysicalDevice> physicalDevices = new ArrayList<>(deviceCount);
            for (int i = 0; i < deviceCount; i++)
            {
                Arena physicalDeviceArena = Arena.ofAuto();

                VkPhysicalDevice physicalDevice = new VkPhysicalDevice(pPhysicalDevices.getAtIndex(ValueLayout.ADDRESS, i), this.m_instance);
                VkPhysicalDeviceProperties properties = new VkPhysicalDeviceProperties(physicalDeviceArena);
                VkPhysicalDeviceFeatures features = new VkPhysicalDeviceFeatures(physicalDeviceArena);
                VkPhysicalDeviceMemoryProperties memoryProperties = new VkPhysicalDeviceMemoryProperties(physicalDeviceArena);

                vkGetPhysicalDeviceProperties(physicalDevice, properties.ptr());
                vkGetPhysicalDeviceFeatures(physicalDevice, features.ptr());
                vkGetPhysicalDeviceMemoryProperties(physicalDevice, memoryProperties.ptr());

                physicalDevices.add(new PhysicalDevice(physicalDevice, features, properties, memoryProperties));
            }

            this.m_physicalDevice = physicalDevices.stream().reduce(comparator).orElse(null);
        }
    }

    public @Nullable PhysicalDevice physicalDevice()
    {
        return this.m_physicalDevice;
    }

    public void disposeMessenger()
    {
        if (this.m_debugMessenger != null)
        {
            vkDestroyDebugUtilsMessengerEXT(this.m_instance, this.m_debugMessenger.handle, NULL);
            this.m_debugMessenger = null;
        }
    }

    public void attachDebugMessenger(PFN_vkDebugUtilsMessengerCallbackEXT callback) throws VulkanException
    {
        this.disposeMessenger();
        try (Arena arena = Arena.ofConfined())
        {
            Arena stubArena = Arena.ofAuto();

            VkDebugUtilsMessengerCreateInfoEXT messengerCreateInfo = new VkDebugUtilsMessengerCreateInfoEXT(arena);
            messengerCreateInfo.sType(VK_STRUCTURE_TYPE_DEBUG_UTILS_MESSENGER_CREATE_INFO_EXT);
            messengerCreateInfo.messageSeverity(VK_DEBUG_UTILS_MESSAGE_SEVERITY_VERBOSE_BIT_EXT | VK_DEBUG_UTILS_MESSAGE_SEVERITY_WARNING_BIT_EXT | VK_DEBUG_UTILS_MESSAGE_SEVERITY_ERROR_BIT_EXT | VK_DEBUG_UTILS_MESSAGE_SEVERITY_INFO_BIT_EXT);
            messengerCreateInfo.messageType(VK_DEBUG_UTILS_MESSAGE_TYPE_GENERAL_BIT_EXT | VK_DEBUG_UTILS_MESSAGE_TYPE_VALIDATION_BIT_EXT | VK_DEBUG_UTILS_MESSAGE_TYPE_PERFORMANCE_BIT_EXT);
            messengerCreateInfo.pfnUserCallback(callback.makeHandle(stubArena));

            MemorySegment pMessenger = arena.allocate(ValueLayout.ADDRESS);
            VulkanException.check(vkCreateDebugUtilsMessengerEXT(this.m_instance, messengerCreateInfo.ptr(), NULL, pMessenger), "Unable to create debug messenger");
            this.m_debugMessenger = new DebugMessenger(pMessenger.get(ValueLayout.ADDRESS, 0), stubArena);
        }
    }

    @Override
    public void dispose()
    {
        this.m_physicalDevice = null;
        this.disposeMessenger();
        vkDestroyInstance(this.m_instance, NULL);
    }
}
