package yionos.demo.rendering;

import jpgen.ForeignUtils;
import vma.VmaAllocatorCreateInfo;
import vma.VmaVulkanFunctions;
import vulkan.*;
import yionos.demo.Disposable;
import yionos.demo.SequenceInitializer;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.util.*;

import static vulkan.VulkanCore.*;
import static vulkan.VkStructureType.*;
import static vma.VMA.*;
import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemorySegment.NULL;
import static yionos.demo.rendering.VulkanContext.gVulkanLogger;

public class LogicalDevice implements Disposable
{
    public record QueueDescriptor(int family, float priority) {}

    public record Queue(VkQueue handle, int family, int index) {}

    private final VkDevice m_device;
    public final VulkanContext.PhysicalDevice physicalDevice;
    private final MemorySegment m_allocator;
    private final Queue[] m_queues;

    public LogicalDevice(VulkanContext.PhysicalDevice physicalDevice, QueueDescriptor[] queueDescriptors, String[] enabledLayers, String[] enabledExtensions, MemorySegment pNext, MemorySegment pEnabledFeatures) throws VulkanException
    {
        try (Arena arena = Arena.ofConfined())
        {
            enabledLayers = filterDeviceLayers(physicalDevice.handle(), enabledLayers);
            enabledExtensions = filterDeviceExtensions(physicalDevice.handle(), enabledExtensions);

            SequenceInitializer initializer = new SequenceInitializer();

            Map<Integer, List<Integer>> arrangedDescriptors = new HashMap<>();
            for (int i = 0; i < queueDescriptors.length; i++)
            {
                arrangedDescriptors.computeIfAbsent(queueDescriptors[i].family, _ -> new ArrayList<>()).add(i);
            }

            MemorySegment queueCreateInfos  = createQueueCreateInfos(arena, arrangedDescriptors, queueDescriptors);

            VkDeviceCreateInfo deviceCreateInfo = new VkDeviceCreateInfo(arena);
            deviceCreateInfo.sType(VK_STRUCTURE_TYPE_DEVICE_CREATE_INFO);
            deviceCreateInfo.pNext(pNext);
            deviceCreateInfo.queueCreateInfoCount(arrangedDescriptors.size());
            deviceCreateInfo.pQueueCreateInfos(queueCreateInfos);
            deviceCreateInfo.enabledLayerCount(enabledLayers.length);
            deviceCreateInfo.ppEnabledLayerNames(ForeignUtils.allocateStringArray(arena, enabledLayers));
            deviceCreateInfo.enabledExtensionCount(enabledExtensions.length);
            deviceCreateInfo.ppEnabledExtensionNames(ForeignUtils.allocateStringArray(arena, enabledExtensions));
            deviceCreateInfo.pEnabledFeatures(pEnabledFeatures);

            MemorySegment pDevice = arena.allocate(ADDRESS);
            VulkanException.check(vkCreateDevice(physicalDevice.handle(), deviceCreateInfo.ptr(), NULL, pDevice), "Unable to create vulkan device", initializer);
            this.m_device = new VkDevice(pDevice.get(ADDRESS, 0));
            initializer.push(this::destroyHandle);

            MemorySegment pAllocator = arena.allocate(ADDRESS);
            VulkanException.check(createVmaAllocator(physicalDevice.handle(), this.m_device, pAllocator), "Unable to create VMA allocator.", initializer);
            this.m_allocator = pAllocator.get(ADDRESS, 0);
            initializer.push(this::destroyAllocator);

            this.m_queues = new Queue[queueDescriptors.length];
            MemorySegment pQueue = arena.allocate(ADDRESS);
            for (int i = 0; i < this.m_queues.length; i++)
            {
                int family = queueDescriptors[i].family;
                int index = arrangedDescriptors.get(family).indexOf(i);
                vkGetDeviceQueue(this.m_device, family, index, pQueue);
                this.m_queues[i] = new Queue(new VkQueue(pQueue.get(ADDRESS, 0), this.m_device), family, index);
            }

            this.physicalDevice = physicalDevice;
        }
    }

    private static String[] filterDeviceLayers(VkPhysicalDevice physicalDevice, String[] layers) throws VulkanException
    {
        try (Arena arena = Arena.ofConfined())
        {
            MemorySegment pLayerCount = arena.allocate(JAVA_INT);
            VulkanException.check(vkEnumerateDeviceLayerProperties(physicalDevice, pLayerCount, NULL));
            int layerCount = pLayerCount.get(JAVA_INT, 0);
            MemorySegment pAvailableLayers = arena.allocate(VkLayerProperties.gRecordLayout, layerCount);
            VulkanException.check(vkEnumerateDeviceLayerProperties(physicalDevice, pLayerCount, pAvailableLayers));

            return Arrays.stream(layers).filter(candidate ->
            {
                for (int i = 0; i < layerCount; i++)
                {
                    VkLayerProperties properties = VkLayerProperties.getAtIndex(pAvailableLayers, i);
                    String name = properties.layerName().getString(0);

                    if (name.equals(candidate))
                    {
                        return true;
                    }
                }

                gVulkanLogger.warn("Device layer not present: {}", candidate);
                return false;
            }).toArray(String[]::new);
        }
    }

    private static String[] filterDeviceExtensions(VkPhysicalDevice physicalDevice, String[] extensions) throws VulkanException
    {
        try (Arena arena = Arena.ofConfined())
        {
            MemorySegment pExtensionCount = arena.allocate(JAVA_INT);
            VulkanException.check(vkEnumerateDeviceExtensionProperties(physicalDevice, NULL, pExtensionCount, NULL));
            int extensionCount = pExtensionCount.get(JAVA_INT, 0);
            MemorySegment pAvailableExtensions = arena.allocate(VkExtensionProperties.gRecordLayout, extensionCount);
            VulkanException.check(vkEnumerateDeviceExtensionProperties(physicalDevice, NULL, pExtensionCount, pAvailableExtensions));

            return Arrays.stream(extensions).filter(candidate ->
            {
                for (int i = 0; i < extensionCount; i++)
                {
                    VkExtensionProperties properties = VkExtensionProperties.getAtIndex(pAvailableExtensions, i);
                    String name = properties.extensionName().getString(0);

                    if (name.equals(candidate))
                    {
                        return true;
                    }
                }

                gVulkanLogger.warn("Device extension not present: {}", candidate);
                return false;
            }).toArray(String[]::new);
        }
    }

    private static MemorySegment createQueueCreateInfos(Arena arena, Map<Integer, List<Integer>> arrangedDescriptors, QueueDescriptor[] queueDescriptors)
    {
        MemorySegment queueCreateInfos  = arena.allocate(VkDeviceQueueCreateInfo.gRecordLayout, arrangedDescriptors.size());
        int structIndex = 0;
        for (Map.Entry<Integer, List<Integer>> entry : arrangedDescriptors.entrySet())
        {
            int numQueues = entry.getValue().size();
            MemorySegment priorities = arena.allocate(JAVA_FLOAT, numQueues);
            for (int i = 0; i < numQueues; i++)
            {
                priorities.setAtIndex(JAVA_FLOAT, i, queueDescriptors[entry.getValue().get(i)].priority);
            }

            VkDeviceQueueCreateInfo queueCreateInfo = VkDeviceQueueCreateInfo.getAtIndex(queueCreateInfos, structIndex);
            queueCreateInfo.sType(VK_STRUCTURE_TYPE_DEVICE_QUEUE_CREATE_INFO);
            queueCreateInfo.queueFamilyIndex(entry.getKey());
            queueCreateInfo.queueCount(numQueues);
            queueCreateInfo.pQueuePriorities(priorities);
            ++structIndex;
        }

        return queueCreateInfos;
    }

    private static int createVmaAllocator(VkPhysicalDevice physicalDevice, VkDevice device, MemorySegment pAllocator) throws VulkanException
    {
        try (Arena arena = Arena.ofConfined())
        {
            VmaVulkanFunctions vulkanFunctions = new VmaVulkanFunctions(arena);
            // These two are unnecessary as VMA_DYNAMIC_VULKAN_FUNCTIONS is not set
            vulkanFunctions.vkGetInstanceProcAddr(MTD_ADDRESS__vkGetInstanceProcAddr);
            vulkanFunctions.vkGetDeviceProcAddr(MTD_ADDRESS__vkGetDeviceProcAddr);
            vulkanFunctions.vkGetPhysicalDeviceProperties(physicalDevice.instance().MTD_ADDRESS__vkGetPhysicalDeviceProperties);
            vulkanFunctions.vkGetPhysicalDeviceMemoryProperties(physicalDevice.instance().MTD_ADDRESS__vkGetPhysicalDeviceMemoryProperties);
            vulkanFunctions.vkAllocateMemory(device.MTD_ADDRESS__vkAllocateMemory);
            vulkanFunctions.vkFreeMemory(device.MTD_ADDRESS__vkFreeMemory);
            vulkanFunctions.vkMapMemory(device.MTD_ADDRESS__vkMapMemory);
            vulkanFunctions.vkUnmapMemory(device.MTD_ADDRESS__vkUnmapMemory);
            vulkanFunctions.vkFlushMappedMemoryRanges(device.MTD_ADDRESS__vkFlushMappedMemoryRanges);
            vulkanFunctions.vkInvalidateMappedMemoryRanges(device.MTD_ADDRESS__vkInvalidateMappedMemoryRanges);
            vulkanFunctions.vkBindBufferMemory(device.MTD_ADDRESS__vkBindBufferMemory);
            vulkanFunctions.vkBindImageMemory(device.MTD_ADDRESS__vkBindImageMemory);
            vulkanFunctions.vkGetBufferMemoryRequirements(device.MTD_ADDRESS__vkGetBufferMemoryRequirements);
            vulkanFunctions.vkGetImageMemoryRequirements(device.MTD_ADDRESS__vkGetImageMemoryRequirements);
            vulkanFunctions.vkCreateBuffer(device.MTD_ADDRESS__vkCreateBuffer);
            vulkanFunctions.vkDestroyBuffer(device.MTD_ADDRESS__vkDestroyBuffer);
            vulkanFunctions.vkCreateImage(device.MTD_ADDRESS__vkCreateImage);
            vulkanFunctions.vkDestroyImage(device.MTD_ADDRESS__vkDestroyImage);
            vulkanFunctions.vkCmdCopyBuffer(device.MTD_ADDRESS__vkCmdCopyBuffer);
            vulkanFunctions.vkGetBufferMemoryRequirements2KHR(device.MTD_ADDRESS__vkGetBufferMemoryRequirements2KHR);
            vulkanFunctions.vkGetImageMemoryRequirements2KHR(device.MTD_ADDRESS__vkGetImageMemoryRequirements2KHR);
            vulkanFunctions.vkBindBufferMemory2KHR(device.MTD_ADDRESS__vkBindBufferMemory2KHR);
            vulkanFunctions.vkBindImageMemory2KHR(device.MTD_ADDRESS__vkBindImageMemory2KHR);
            vulkanFunctions.vkGetPhysicalDeviceMemoryProperties2KHR(physicalDevice.instance().MTD_ADDRESS__vkGetPhysicalDeviceMemoryProperties2KHR);

            VmaAllocatorCreateInfo allocatorCreateInfo = new VmaAllocatorCreateInfo(arena);
            allocatorCreateInfo.flags(0);
            allocatorCreateInfo.physicalDevice(physicalDevice.handle());
            allocatorCreateInfo.device(device.handle());
            allocatorCreateInfo.preferredLargeHeapBlockSize(0);
            allocatorCreateInfo.pAllocationCallbacks(NULL);
            allocatorCreateInfo.pHeapSizeLimit(NULL);
            allocatorCreateInfo.pVulkanFunctions(vulkanFunctions.ptr());
            allocatorCreateInfo.instance(physicalDevice.instance().handle);
            allocatorCreateInfo.vulkanApiVersion(0);
            allocatorCreateInfo.pTypeExternalMemoryHandleTypes(NULL);

            return vmaCreateAllocator(allocatorCreateInfo.ptr(), pAllocator);
        }
    }

    public VkDevice handle()
    {
        return this.m_device;
    }

    public MemorySegment allocator()
    {
        return this.m_allocator;
    }

    public Queue queue(int i)
    {
        return this.m_queues[i];
    }

    private void destroyAllocator()
    {
        vmaDestroyAllocator(this.m_allocator);
    }

    private void destroyHandle()
    {
        vkDestroyDevice(this.m_device, NULL);
    }

    @Override
    public void dispose()
    {
        this.destroyAllocator();
        this.destroyHandle();
    }
}
