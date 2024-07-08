package vulkan;

public record VkPhysicalDevicePerformanceQueryFeaturesKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__performanceCounterQueryPools = java.lang.foreign.ValueLayout.JAVA_INT.withName("performanceCounterQueryPools");
    public static final long OFFSET__performanceCounterQueryPools = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__performanceCounterMultipleQueryPools = java.lang.foreign.ValueLayout.JAVA_INT.withName("performanceCounterMultipleQueryPools");
    public static final long OFFSET__performanceCounterMultipleQueryPools = 20;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__performanceCounterQueryPools,
            LAYOUT__performanceCounterMultipleQueryPools
    ).withByteAlignment(8).withName("VkPhysicalDevicePerformanceQueryFeaturesKHR");

    public VkPhysicalDevicePerformanceQueryFeaturesKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDevicePerformanceQueryFeaturesKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDevicePerformanceQueryFeaturesKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDevicePerformanceQueryFeaturesKHR value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int performanceCounterQueryPools() {return this.ptr.get(LAYOUT__performanceCounterQueryPools, OFFSET__performanceCounterQueryPools);}
    public void performanceCounterQueryPools(int value) {this.ptr.set(LAYOUT__performanceCounterQueryPools, OFFSET__performanceCounterQueryPools, value);}
    public java.lang.foreign.MemorySegment $performanceCounterQueryPools() {return this.ptr.asSlice(OFFSET__performanceCounterQueryPools, LAYOUT__performanceCounterQueryPools);}

    public int performanceCounterMultipleQueryPools() {return this.ptr.get(LAYOUT__performanceCounterMultipleQueryPools, OFFSET__performanceCounterMultipleQueryPools);}
    public void performanceCounterMultipleQueryPools(int value) {this.ptr.set(LAYOUT__performanceCounterMultipleQueryPools, OFFSET__performanceCounterMultipleQueryPools, value);}
    public java.lang.foreign.MemorySegment $performanceCounterMultipleQueryPools() {return this.ptr.asSlice(OFFSET__performanceCounterMultipleQueryPools, LAYOUT__performanceCounterMultipleQueryPools);}
}
