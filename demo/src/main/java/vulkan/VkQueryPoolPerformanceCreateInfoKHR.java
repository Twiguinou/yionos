package vulkan;

public record VkQueryPoolPerformanceCreateInfoKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__queueFamilyIndex = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__queueFamilyIndex = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__counterIndexCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__counterIndexCount = 20;
    public static final java.lang.foreign.AddressLayout LAYOUT__pCounterIndices = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pCounterIndices = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__queueFamilyIndex,
            LAYOUT__counterIndexCount,
            LAYOUT__pCounterIndices
    ).withByteAlignment(8).withName("VkQueryPoolPerformanceCreateInfoKHR");

    public VkQueryPoolPerformanceCreateInfoKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkQueryPoolPerformanceCreateInfoKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkQueryPoolPerformanceCreateInfoKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkQueryPoolPerformanceCreateInfoKHR value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int queueFamilyIndex() {return this.ptr.get(LAYOUT__queueFamilyIndex, OFFSET__queueFamilyIndex);}
    public void queueFamilyIndex(int value) {this.ptr.set(LAYOUT__queueFamilyIndex, OFFSET__queueFamilyIndex, value);}
    public java.lang.foreign.MemorySegment $queueFamilyIndex() {return this.ptr.asSlice(OFFSET__queueFamilyIndex, LAYOUT__queueFamilyIndex);}

    public int counterIndexCount() {return this.ptr.get(LAYOUT__counterIndexCount, OFFSET__counterIndexCount);}
    public void counterIndexCount(int value) {this.ptr.set(LAYOUT__counterIndexCount, OFFSET__counterIndexCount, value);}
    public java.lang.foreign.MemorySegment $counterIndexCount() {return this.ptr.asSlice(OFFSET__counterIndexCount, LAYOUT__counterIndexCount);}

    public java.lang.foreign.MemorySegment pCounterIndices() {return this.ptr.get(LAYOUT__pCounterIndices, OFFSET__pCounterIndices);}
    public void pCounterIndices(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pCounterIndices, OFFSET__pCounterIndices, value);}
    public java.lang.foreign.MemorySegment $pCounterIndices() {return this.ptr.asSlice(OFFSET__pCounterIndices, LAYOUT__pCounterIndices);}
}
