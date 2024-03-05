package yionos.demo.rendering;

import jpgen.ForeignUtils;
import vma.VmaAllocatorCreateInfo;
import vma.VmaVulkanFunctions;
import vulkan.*;
import yionos.demo.Disposable;
import yionos.demo.SequenceInitializer;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.util.*;

import static vulkan.VulkanCore.*;
import static vulkan.VkStructureType.*;
import static vma.VMA.*;
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
            deviceCreateInfo.flags(0);
            deviceCreateInfo.queueCreateInfoCount(arrangedDescriptors.size());
            deviceCreateInfo.pQueueCreateInfos(queueCreateInfos);
            deviceCreateInfo.enabledLayerCount(enabledLayers.length);
            deviceCreateInfo.ppEnabledLayerNames(ForeignUtils.allocateUtf8Array(arena, enabledLayers));
            deviceCreateInfo.enabledExtensionCount(enabledExtensions.length);
            deviceCreateInfo.ppEnabledExtensionNames(ForeignUtils.allocateUtf8Array(arena, enabledExtensions));
            deviceCreateInfo.pEnabledFeatures(pEnabledFeatures);

            MemorySegment pDevice = arena.allocate(ValueLayout.ADDRESS);
            VulkanException.check(vkCreateDevice(physicalDevice.handle(), deviceCreateInfo.ptr(), NULL, pDevice), "Unable to create vulkan device", initializer);
            this.m_device = new VkDevice(pDevice.get(ValueLayout.ADDRESS, 0));
            initializer.push(this::destroyHandle);

            MemorySegment pAllocator = arena.allocate(ValueLayout.ADDRESS);
            VulkanException.check(createVmaAllocator(physicalDevice.handle(), this.m_device, pAllocator), "Unable to create VMA allocator.", initializer);
            this.m_allocator = pAllocator.get(ValueLayout.ADDRESS, 0);
            initializer.push(this::destroyAllocator);

            this.m_queues = new Queue[queueDescriptors.length];
            MemorySegment pQueue = arena.allocate(ValueLayout.ADDRESS);
            for (int i = 0; i < this.m_queues.length; i++)
            {
                int family = queueDescriptors[i].family;
                int index = arrangedDescriptors.get(family).indexOf(i);
                vkGetDeviceQueue(this.m_device, family, index, pQueue);
                this.m_queues[i] = new Queue(new VkQueue(pQueue.get(ValueLayout.ADDRESS, 0), this.m_device), family, index);
            }

            this.physicalDevice = physicalDevice;
        }
    }

    private static String[] filterDeviceLayers(VkPhysicalDevice physicalDevice, String[] layers) throws VulkanException
    {
        try (Arena arena = Arena.ofConfined())
        {
            MemorySegment pLayerCount = arena.allocate(ValueLayout.JAVA_INT, 0);
            VulkanException.check(vkEnumerateDeviceLayerProperties(physicalDevice, pLayerCount, NULL));
            int layerCount = pLayerCount.get(ValueLayout.JAVA_INT, 0);
            MemorySegment pAvailableLayers = arena.allocateArray(VkLayerProperties.gStructLayout, layerCount);
            VulkanException.check(vkEnumerateDeviceLayerProperties(physicalDevice, pLayerCount, pAvailableLayers));

            return Arrays.stream(layers).filter(candidate ->
            {
                for (int i = 0; i < layerCount; i++)
                {
                    VkLayerProperties properties = VkLayerProperties.getAtIndex(pAvailableLayers, i);
                    String name = properties.layerName().getUtf8String(0);

                    if (name.equals(candidate))
                    {
                        return true;
                    }
                }

                gVulkanLogger.warn(STR."Device layer not present: \{candidate}");
                return false;
            }).toArray(String[]::new);
        }
    }

    private static String[] filterDeviceExtensions(VkPhysicalDevice physicalDevice, String[] extensions) throws VulkanException
    {
        try (Arena arena = Arena.ofConfined())
        {
            MemorySegment pExtensionCount = arena.allocate(ValueLayout.JAVA_INT, 0);
            VulkanException.check(vkEnumerateDeviceExtensionProperties(physicalDevice, NULL, pExtensionCount, NULL));
            int extensionCount = pExtensionCount.get(ValueLayout.JAVA_INT, 0);
            MemorySegment pAvailableExtensions = arena.allocateArray(VkExtensionProperties.gStructLayout, extensionCount);
            VulkanException.check(vkEnumerateDeviceExtensionProperties(physicalDevice, NULL, pExtensionCount, pAvailableExtensions));

            return Arrays.stream(extensions).filter(candidate ->
            {
                for (int i = 0; i < extensionCount; i++)
                {
                    VkExtensionProperties properties = VkExtensionProperties.getAtIndex(pAvailableExtensions, i);
                    String name = properties.extensionName().getUtf8String(0);

                    if (name.equals(candidate))
                    {
                        return true;
                    }
                }

                gVulkanLogger.warn(STR."Device extension not present: \{candidate}");
                return false;
            }).toArray(String[]::new);
        }
    }

    private static MemorySegment createQueueCreateInfos(Arena arena, Map<Integer, List<Integer>> arrangedDescriptors, QueueDescriptor[] queueDescriptors)
    {
        MemorySegment queueCreateInfos  = arena.allocateArray(VkDeviceQueueCreateInfo.gStructLayout, arrangedDescriptors.size());
        int structIndex = 0;
        for (Map.Entry<Integer, List<Integer>> entry : arrangedDescriptors.entrySet())
        {
            int numQueues = entry.getValue().size();
            MemorySegment priorities = arena.allocateArray(ValueLayout.JAVA_FLOAT, numQueues);
            for (int i = 0; i < numQueues; i++)
            {
                priorities.setAtIndex(ValueLayout.JAVA_FLOAT, i, queueDescriptors[entry.getValue().get(i)].priority);
            }

            VkDeviceQueueCreateInfo queueCreateInfo = VkDeviceQueueCreateInfo.getAtIndex(queueCreateInfos, structIndex);
            queueCreateInfo.sType(VK_STRUCTURE_TYPE_DEVICE_QUEUE_CREATE_INFO);
            queueCreateInfo.pNext(NULL);
            queueCreateInfo.flags(0);
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
            vulkanFunctions.vkGetInstanceProcAddr(MTD_ADDRESS$vkGetInstanceProcAddr);
            vulkanFunctions.vkGetDeviceProcAddr(MTD_ADDRESS$vkGetDeviceProcAddr);
            vulkanFunctions.vkGetPhysicalDeviceProperties(physicalDevice.instance().funcAddress__vkGetPhysicalDeviceProperties);
            vulkanFunctions.vkGetPhysicalDeviceMemoryProperties(physicalDevice.instance().funcAddress__vkGetPhysicalDeviceMemoryProperties);
            vulkanFunctions.vkAllocateMemory(device.funcAddress__vkAllocateMemory);
            vulkanFunctions.vkFreeMemory(device.funcAddress__vkFreeMemory);
            vulkanFunctions.vkMapMemory(device.funcAddress__vkMapMemory);
            vulkanFunctions.vkUnmapMemory(device.funcAddress__vkUnmapMemory);
            vulkanFunctions.vkFlushMappedMemoryRanges(device.funcAddress__vkFlushMappedMemoryRanges);
            vulkanFunctions.vkInvalidateMappedMemoryRanges(device.funcAddress__vkInvalidateMappedMemoryRanges);
            vulkanFunctions.vkBindBufferMemory(device.funcAddress__vkBindBufferMemory);
            vulkanFunctions.vkBindImageMemory(device.funcAddress__vkBindImageMemory);
            vulkanFunctions.vkGetBufferMemoryRequirements(device.funcAddress__vkGetBufferMemoryRequirements);
            vulkanFunctions.vkGetImageMemoryRequirements(device.funcAddress__vkGetImageMemoryRequirements);
            vulkanFunctions.vkCreateBuffer(device.funcAddress__vkCreateBuffer);
            vulkanFunctions.vkDestroyBuffer(device.funcAddress__vkDestroyBuffer);
            vulkanFunctions.vkCreateImage(device.funcAddress__vkCreateImage);
            vulkanFunctions.vkDestroyImage(device.funcAddress__vkDestroyImage);
            vulkanFunctions.vkCmdCopyBuffer(device.funcAddress__vkCmdCopyBuffer);
            vulkanFunctions.vkGetBufferMemoryRequirements2KHR(device.funcAddress__vkGetBufferMemoryRequirements2KHR);
            vulkanFunctions.vkGetImageMemoryRequirements2KHR(device.funcAddress__vkGetImageMemoryRequirements2KHR);
            vulkanFunctions.vkBindBufferMemory2KHR(device.funcAddress__vkBindBufferMemory2KHR);
            vulkanFunctions.vkBindImageMemory2KHR(device.funcAddress__vkBindImageMemory2KHR);
            vulkanFunctions.vkGetPhysicalDeviceMemoryProperties2KHR(physicalDevice.instance().funcAddress__vkGetPhysicalDeviceMemoryProperties2KHR);

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
