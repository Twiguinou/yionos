package vma;

public record VmaAllocatorCreateInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$flags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$flags = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$physicalDevice = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$physicalDevice = 8L;
    public static final java.lang.foreign.AddressLayout LAYOUT$device = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$device = 16L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$preferredLargeHeapBlockSize = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$preferredLargeHeapBlockSize = 24L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pAllocationCallbacks = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pAllocationCallbacks = 32L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pDeviceMemoryCallbacks = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pDeviceMemoryCallbacks = 40L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pHeapSizeLimit = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pHeapSizeLimit = 48L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pVulkanFunctions = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pVulkanFunctions = 56L;
    public static final java.lang.foreign.AddressLayout LAYOUT$instance = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$instance = 64L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$vulkanApiVersion = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$vulkanApiVersion = 72L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pTypeExternalMemoryHandleTypes = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pTypeExternalMemoryHandleTypes = 80L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$flags,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$physicalDevice,
            LAYOUT$device,
            LAYOUT$preferredLargeHeapBlockSize,
            LAYOUT$pAllocationCallbacks,
            LAYOUT$pDeviceMemoryCallbacks,
            LAYOUT$pHeapSizeLimit,
            LAYOUT$pVulkanFunctions,
            LAYOUT$instance,
            LAYOUT$vulkanApiVersion,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pTypeExternalMemoryHandleTypes
    ).withName("VmaAllocatorCreateInfo");

    public VmaAllocatorCreateInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VmaAllocatorCreateInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VmaAllocatorCreateInfo(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int flags() {return this.ptr.get(LAYOUT$flags, OFFSET$flags);}
    public void flags(int value) {this.ptr.set(LAYOUT$flags, OFFSET$flags, value);}
    public java.lang.foreign.MemorySegment flags_ptr() {return this.ptr.asSlice(OFFSET$flags, LAYOUT$flags);}

    public java.lang.foreign.MemorySegment physicalDevice() {return this.ptr.get(LAYOUT$physicalDevice, OFFSET$physicalDevice);}
    public void physicalDevice(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$physicalDevice, OFFSET$physicalDevice, value);}
    public java.lang.foreign.MemorySegment physicalDevice_ptr() {return this.ptr.asSlice(OFFSET$physicalDevice, LAYOUT$physicalDevice);}

    public java.lang.foreign.MemorySegment device() {return this.ptr.get(LAYOUT$device, OFFSET$device);}
    public void device(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$device, OFFSET$device, value);}
    public java.lang.foreign.MemorySegment device_ptr() {return this.ptr.asSlice(OFFSET$device, LAYOUT$device);}

    public long preferredLargeHeapBlockSize() {return this.ptr.get(LAYOUT$preferredLargeHeapBlockSize, OFFSET$preferredLargeHeapBlockSize);}
    public void preferredLargeHeapBlockSize(long value) {this.ptr.set(LAYOUT$preferredLargeHeapBlockSize, OFFSET$preferredLargeHeapBlockSize, value);}
    public java.lang.foreign.MemorySegment preferredLargeHeapBlockSize_ptr() {return this.ptr.asSlice(OFFSET$preferredLargeHeapBlockSize, LAYOUT$preferredLargeHeapBlockSize);}

    public java.lang.foreign.MemorySegment pAllocationCallbacks() {return this.ptr.get(LAYOUT$pAllocationCallbacks, OFFSET$pAllocationCallbacks);}
    public void pAllocationCallbacks(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pAllocationCallbacks, OFFSET$pAllocationCallbacks, value);}
    public java.lang.foreign.MemorySegment pAllocationCallbacks_ptr() {return this.ptr.asSlice(OFFSET$pAllocationCallbacks, LAYOUT$pAllocationCallbacks);}

    public java.lang.foreign.MemorySegment pDeviceMemoryCallbacks() {return this.ptr.get(LAYOUT$pDeviceMemoryCallbacks, OFFSET$pDeviceMemoryCallbacks);}
    public void pDeviceMemoryCallbacks(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pDeviceMemoryCallbacks, OFFSET$pDeviceMemoryCallbacks, value);}
    public java.lang.foreign.MemorySegment pDeviceMemoryCallbacks_ptr() {return this.ptr.asSlice(OFFSET$pDeviceMemoryCallbacks, LAYOUT$pDeviceMemoryCallbacks);}

    public java.lang.foreign.MemorySegment pHeapSizeLimit() {return this.ptr.get(LAYOUT$pHeapSizeLimit, OFFSET$pHeapSizeLimit);}
    public void pHeapSizeLimit(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pHeapSizeLimit, OFFSET$pHeapSizeLimit, value);}
    public java.lang.foreign.MemorySegment pHeapSizeLimit_ptr() {return this.ptr.asSlice(OFFSET$pHeapSizeLimit, LAYOUT$pHeapSizeLimit);}

    public java.lang.foreign.MemorySegment pVulkanFunctions() {return this.ptr.get(LAYOUT$pVulkanFunctions, OFFSET$pVulkanFunctions);}
    public void pVulkanFunctions(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pVulkanFunctions, OFFSET$pVulkanFunctions, value);}
    public java.lang.foreign.MemorySegment pVulkanFunctions_ptr() {return this.ptr.asSlice(OFFSET$pVulkanFunctions, LAYOUT$pVulkanFunctions);}

    public java.lang.foreign.MemorySegment instance() {return this.ptr.get(LAYOUT$instance, OFFSET$instance);}
    public void instance(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$instance, OFFSET$instance, value);}
    public java.lang.foreign.MemorySegment instance_ptr() {return this.ptr.asSlice(OFFSET$instance, LAYOUT$instance);}

    public int vulkanApiVersion() {return this.ptr.get(LAYOUT$vulkanApiVersion, OFFSET$vulkanApiVersion);}
    public void vulkanApiVersion(int value) {this.ptr.set(LAYOUT$vulkanApiVersion, OFFSET$vulkanApiVersion, value);}
    public java.lang.foreign.MemorySegment vulkanApiVersion_ptr() {return this.ptr.asSlice(OFFSET$vulkanApiVersion, LAYOUT$vulkanApiVersion);}

    public java.lang.foreign.MemorySegment pTypeExternalMemoryHandleTypes() {return this.ptr.get(LAYOUT$pTypeExternalMemoryHandleTypes, OFFSET$pTypeExternalMemoryHandleTypes);}
    public void pTypeExternalMemoryHandleTypes(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pTypeExternalMemoryHandleTypes, OFFSET$pTypeExternalMemoryHandleTypes, value);}
    public java.lang.foreign.MemorySegment pTypeExternalMemoryHandleTypes_ptr() {return this.ptr.asSlice(OFFSET$pTypeExternalMemoryHandleTypes, LAYOUT$pTypeExternalMemoryHandleTypes);}
}
