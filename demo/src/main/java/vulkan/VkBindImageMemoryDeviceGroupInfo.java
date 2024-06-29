package vulkan;

public record VkBindImageMemoryDeviceGroupInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__deviceIndexCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__deviceIndexCount = 16;
    public static final java.lang.foreign.AddressLayout LAYOUT__pDeviceIndices = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pDeviceIndices = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__splitInstanceBindRegionCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__splitInstanceBindRegionCount = 32;
    public static final java.lang.foreign.AddressLayout LAYOUT__pSplitInstanceBindRegions = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pSplitInstanceBindRegions = 40;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__deviceIndexCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pDeviceIndices,
            LAYOUT__splitInstanceBindRegionCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pSplitInstanceBindRegions
    ).withByteAlignment(8).withName("VkBindImageMemoryDeviceGroupInfo");

    public VkBindImageMemoryDeviceGroupInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkBindImageMemoryDeviceGroupInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkBindImageMemoryDeviceGroupInfo(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkBindImageMemoryDeviceGroupInfo value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int deviceIndexCount() {return this.ptr.get(LAYOUT__deviceIndexCount, OFFSET__deviceIndexCount);}
    public void deviceIndexCount(int value) {this.ptr.set(LAYOUT__deviceIndexCount, OFFSET__deviceIndexCount, value);}
    public java.lang.foreign.MemorySegment $deviceIndexCount() {return this.ptr.asSlice(OFFSET__deviceIndexCount, LAYOUT__deviceIndexCount);}

    public java.lang.foreign.MemorySegment pDeviceIndices() {return this.ptr.get(LAYOUT__pDeviceIndices, OFFSET__pDeviceIndices);}
    public void pDeviceIndices(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pDeviceIndices, OFFSET__pDeviceIndices, value);}
    public java.lang.foreign.MemorySegment $pDeviceIndices() {return this.ptr.asSlice(OFFSET__pDeviceIndices, LAYOUT__pDeviceIndices);}

    public int splitInstanceBindRegionCount() {return this.ptr.get(LAYOUT__splitInstanceBindRegionCount, OFFSET__splitInstanceBindRegionCount);}
    public void splitInstanceBindRegionCount(int value) {this.ptr.set(LAYOUT__splitInstanceBindRegionCount, OFFSET__splitInstanceBindRegionCount, value);}
    public java.lang.foreign.MemorySegment $splitInstanceBindRegionCount() {return this.ptr.asSlice(OFFSET__splitInstanceBindRegionCount, LAYOUT__splitInstanceBindRegionCount);}

    public java.lang.foreign.MemorySegment pSplitInstanceBindRegions() {return this.ptr.get(LAYOUT__pSplitInstanceBindRegions, OFFSET__pSplitInstanceBindRegions);}
    public void pSplitInstanceBindRegions(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pSplitInstanceBindRegions, OFFSET__pSplitInstanceBindRegions, value);}
    public java.lang.foreign.MemorySegment $pSplitInstanceBindRegions() {return this.ptr.asSlice(OFFSET__pSplitInstanceBindRegions, LAYOUT__pSplitInstanceBindRegions);}
}
