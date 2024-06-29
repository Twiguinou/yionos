package vulkan;

public record VkPhysicalDeviceGroupProperties(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__physicalDeviceCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__physicalDeviceCount = 16;
    public static final java.lang.foreign.SequenceLayout LAYOUT__physicalDevices = java.lang.foreign.MemoryLayout.sequenceLayout(32, jpgen.NativeTypes.UNBOUNDED_POINTER);
    public static final long OFFSET__physicalDevices = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__subsetAllocation = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__subsetAllocation = 280;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__physicalDeviceCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__physicalDevices,
            LAYOUT__subsetAllocation,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkPhysicalDeviceGroupProperties");

    public VkPhysicalDeviceGroupProperties(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceGroupProperties getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceGroupProperties(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceGroupProperties value)
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

    public java.lang.foreign.MemorySegment physicalDevices() {return this.ptr.asSlice(OFFSET__physicalDevices, LAYOUT__physicalDevices);}
    public java.lang.foreign.MemorySegment physicalDevices(int index) {return this.physicalDevices().getAtIndex(jpgen.NativeTypes.UNBOUNDED_POINTER, index);}
    public void physicalDevices(int index, java.lang.foreign.MemorySegment value) {this.physicalDevices().setAtIndex(jpgen.NativeTypes.UNBOUNDED_POINTER, index, value);}

    public int subsetAllocation() {return this.ptr.get(LAYOUT__subsetAllocation, OFFSET__subsetAllocation);}
    public void subsetAllocation(int value) {this.ptr.set(LAYOUT__subsetAllocation, OFFSET__subsetAllocation, value);}
    public java.lang.foreign.MemorySegment $subsetAllocation() {return this.ptr.asSlice(OFFSET__subsetAllocation, LAYOUT__subsetAllocation);}
}
