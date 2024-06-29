package vma;

public record VmaAllocatorCreateInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__flags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__flags = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__physicalDevice = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__physicalDevice = 8;
    public static final java.lang.foreign.AddressLayout LAYOUT__device = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__device = 16;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__preferredLargeHeapBlockSize = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__preferredLargeHeapBlockSize = 24;
    public static final java.lang.foreign.AddressLayout LAYOUT__pAllocationCallbacks = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pAllocationCallbacks = 32;
    public static final java.lang.foreign.AddressLayout LAYOUT__pDeviceMemoryCallbacks = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pDeviceMemoryCallbacks = 40;
    public static final java.lang.foreign.AddressLayout LAYOUT__pHeapSizeLimit = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pHeapSizeLimit = 48;
    public static final java.lang.foreign.AddressLayout LAYOUT__pVulkanFunctions = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pVulkanFunctions = 56;
    public static final java.lang.foreign.AddressLayout LAYOUT__instance = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__instance = 64;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__vulkanApiVersion = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__vulkanApiVersion = 72;
    public static final java.lang.foreign.AddressLayout LAYOUT__pTypeExternalMemoryHandleTypes = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pTypeExternalMemoryHandleTypes = 80;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__flags,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__physicalDevice,
            LAYOUT__device,
            LAYOUT__preferredLargeHeapBlockSize,
            LAYOUT__pAllocationCallbacks,
            LAYOUT__pDeviceMemoryCallbacks,
            LAYOUT__pHeapSizeLimit,
            LAYOUT__pVulkanFunctions,
            LAYOUT__instance,
            LAYOUT__vulkanApiVersion,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pTypeExternalMemoryHandleTypes
    ).withByteAlignment(8).withName("VmaAllocatorCreateInfo");

    public VmaAllocatorCreateInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VmaAllocatorCreateInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VmaAllocatorCreateInfo(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VmaAllocatorCreateInfo value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int flags() {return this.ptr.get(LAYOUT__flags, OFFSET__flags);}
    public void flags(int value) {this.ptr.set(LAYOUT__flags, OFFSET__flags, value);}
    public java.lang.foreign.MemorySegment $flags() {return this.ptr.asSlice(OFFSET__flags, LAYOUT__flags);}

    public java.lang.foreign.MemorySegment physicalDevice() {return this.ptr.get(LAYOUT__physicalDevice, OFFSET__physicalDevice);}
    public void physicalDevice(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__physicalDevice, OFFSET__physicalDevice, value);}
    public java.lang.foreign.MemorySegment $physicalDevice() {return this.ptr.asSlice(OFFSET__physicalDevice, LAYOUT__physicalDevice);}

    public java.lang.foreign.MemorySegment device() {return this.ptr.get(LAYOUT__device, OFFSET__device);}
    public void device(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__device, OFFSET__device, value);}
    public java.lang.foreign.MemorySegment $device() {return this.ptr.asSlice(OFFSET__device, LAYOUT__device);}

    public long preferredLargeHeapBlockSize() {return this.ptr.get(LAYOUT__preferredLargeHeapBlockSize, OFFSET__preferredLargeHeapBlockSize);}
    public void preferredLargeHeapBlockSize(long value) {this.ptr.set(LAYOUT__preferredLargeHeapBlockSize, OFFSET__preferredLargeHeapBlockSize, value);}
    public java.lang.foreign.MemorySegment $preferredLargeHeapBlockSize() {return this.ptr.asSlice(OFFSET__preferredLargeHeapBlockSize, LAYOUT__preferredLargeHeapBlockSize);}

    public java.lang.foreign.MemorySegment pAllocationCallbacks() {return this.ptr.get(LAYOUT__pAllocationCallbacks, OFFSET__pAllocationCallbacks);}
    public void pAllocationCallbacks(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pAllocationCallbacks, OFFSET__pAllocationCallbacks, value);}
    public java.lang.foreign.MemorySegment $pAllocationCallbacks() {return this.ptr.asSlice(OFFSET__pAllocationCallbacks, LAYOUT__pAllocationCallbacks);}

    public java.lang.foreign.MemorySegment pDeviceMemoryCallbacks() {return this.ptr.get(LAYOUT__pDeviceMemoryCallbacks, OFFSET__pDeviceMemoryCallbacks);}
    public void pDeviceMemoryCallbacks(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pDeviceMemoryCallbacks, OFFSET__pDeviceMemoryCallbacks, value);}
    public java.lang.foreign.MemorySegment $pDeviceMemoryCallbacks() {return this.ptr.asSlice(OFFSET__pDeviceMemoryCallbacks, LAYOUT__pDeviceMemoryCallbacks);}

    public java.lang.foreign.MemorySegment pHeapSizeLimit() {return this.ptr.get(LAYOUT__pHeapSizeLimit, OFFSET__pHeapSizeLimit);}
    public void pHeapSizeLimit(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pHeapSizeLimit, OFFSET__pHeapSizeLimit, value);}
    public java.lang.foreign.MemorySegment $pHeapSizeLimit() {return this.ptr.asSlice(OFFSET__pHeapSizeLimit, LAYOUT__pHeapSizeLimit);}

    public java.lang.foreign.MemorySegment pVulkanFunctions() {return this.ptr.get(LAYOUT__pVulkanFunctions, OFFSET__pVulkanFunctions);}
    public void pVulkanFunctions(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pVulkanFunctions, OFFSET__pVulkanFunctions, value);}
    public java.lang.foreign.MemorySegment $pVulkanFunctions() {return this.ptr.asSlice(OFFSET__pVulkanFunctions, LAYOUT__pVulkanFunctions);}

    public java.lang.foreign.MemorySegment instance() {return this.ptr.get(LAYOUT__instance, OFFSET__instance);}
    public void instance(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__instance, OFFSET__instance, value);}
    public java.lang.foreign.MemorySegment $instance() {return this.ptr.asSlice(OFFSET__instance, LAYOUT__instance);}

    public int vulkanApiVersion() {return this.ptr.get(LAYOUT__vulkanApiVersion, OFFSET__vulkanApiVersion);}
    public void vulkanApiVersion(int value) {this.ptr.set(LAYOUT__vulkanApiVersion, OFFSET__vulkanApiVersion, value);}
    public java.lang.foreign.MemorySegment $vulkanApiVersion() {return this.ptr.asSlice(OFFSET__vulkanApiVersion, LAYOUT__vulkanApiVersion);}

    public java.lang.foreign.MemorySegment pTypeExternalMemoryHandleTypes() {return this.ptr.get(LAYOUT__pTypeExternalMemoryHandleTypes, OFFSET__pTypeExternalMemoryHandleTypes);}
    public void pTypeExternalMemoryHandleTypes(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pTypeExternalMemoryHandleTypes, OFFSET__pTypeExternalMemoryHandleTypes, value);}
    public java.lang.foreign.MemorySegment $pTypeExternalMemoryHandleTypes() {return this.ptr.asSlice(OFFSET__pTypeExternalMemoryHandleTypes, LAYOUT__pTypeExternalMemoryHandleTypes);}
}
