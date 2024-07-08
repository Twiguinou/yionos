package vulkan;

public record VkDeviceGroupDeviceCreateInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__physicalDeviceCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("physicalDeviceCount");
    public static final long OFFSET__physicalDeviceCount = 16;
    public static final java.lang.foreign.AddressLayout LAYOUT__pPhysicalDevices = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pPhysicalDevices");
    public static final long OFFSET__pPhysicalDevices = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__physicalDeviceCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pPhysicalDevices
    ).withByteAlignment(8).withName("VkDeviceGroupDeviceCreateInfo");

    public VkDeviceGroupDeviceCreateInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkDeviceGroupDeviceCreateInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkDeviceGroupDeviceCreateInfo(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkDeviceGroupDeviceCreateInfo value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int physicalDeviceCount() {return this.ptr.get(LAYOUT__physicalDeviceCount, OFFSET__physicalDeviceCount);}
    public void physicalDeviceCount(int value) {this.ptr.set(LAYOUT__physicalDeviceCount, OFFSET__physicalDeviceCount, value);}
    public java.lang.foreign.MemorySegment $physicalDeviceCount() {return this.ptr.asSlice(OFFSET__physicalDeviceCount, LAYOUT__physicalDeviceCount);}

    public java.lang.foreign.MemorySegment pPhysicalDevices() {return this.ptr.get(LAYOUT__pPhysicalDevices, OFFSET__pPhysicalDevices);}
    public void pPhysicalDevices(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pPhysicalDevices, OFFSET__pPhysicalDevices, value);}
    public java.lang.foreign.MemorySegment $pPhysicalDevices() {return this.ptr.asSlice(OFFSET__pPhysicalDevices, LAYOUT__pPhysicalDevices);}
}
