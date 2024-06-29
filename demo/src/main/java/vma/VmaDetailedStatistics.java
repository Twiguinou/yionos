package vma;

public record VmaDetailedStatistics(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT__statistics = vma.VmaStatistics.gRecordLayout;
    public static final long OFFSET__statistics = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__unusedRangeCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__unusedRangeCount = 24;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__allocationSizeMin = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__allocationSizeMin = 32;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__allocationSizeMax = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__allocationSizeMax = 40;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__unusedRangeSizeMin = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__unusedRangeSizeMin = 48;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__unusedRangeSizeMax = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__unusedRangeSizeMax = 56;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__statistics,
            LAYOUT__unusedRangeCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__allocationSizeMin,
            LAYOUT__allocationSizeMax,
            LAYOUT__unusedRangeSizeMin,
            LAYOUT__unusedRangeSizeMax
    ).withByteAlignment(8).withName("VmaDetailedStatistics");

    public VmaDetailedStatistics(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VmaDetailedStatistics getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VmaDetailedStatistics(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VmaDetailedStatistics value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public vma.VmaStatistics statistics() {return new vma.VmaStatistics(this.ptr.asSlice(OFFSET__statistics, LAYOUT__statistics));}
    public void statistics(java.util.function.Consumer<vma.VmaStatistics> consumer) {consumer.accept(this.statistics());}
    public void statistics(vma.VmaStatistics value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__statistics, LAYOUT__statistics.byteSize());}

    public int unusedRangeCount() {return this.ptr.get(LAYOUT__unusedRangeCount, OFFSET__unusedRangeCount);}
    public void unusedRangeCount(int value) {this.ptr.set(LAYOUT__unusedRangeCount, OFFSET__unusedRangeCount, value);}
    public java.lang.foreign.MemorySegment $unusedRangeCount() {return this.ptr.asSlice(OFFSET__unusedRangeCount, LAYOUT__unusedRangeCount);}

    public long allocationSizeMin() {return this.ptr.get(LAYOUT__allocationSizeMin, OFFSET__allocationSizeMin);}
    public void allocationSizeMin(long value) {this.ptr.set(LAYOUT__allocationSizeMin, OFFSET__allocationSizeMin, value);}
    public java.lang.foreign.MemorySegment $allocationSizeMin() {return this.ptr.asSlice(OFFSET__allocationSizeMin, LAYOUT__allocationSizeMin);}

    public long allocationSizeMax() {return this.ptr.get(LAYOUT__allocationSizeMax, OFFSET__allocationSizeMax);}
    public void allocationSizeMax(long value) {this.ptr.set(LAYOUT__allocationSizeMax, OFFSET__allocationSizeMax, value);}
    public java.lang.foreign.MemorySegment $allocationSizeMax() {return this.ptr.asSlice(OFFSET__allocationSizeMax, LAYOUT__allocationSizeMax);}

    public long unusedRangeSizeMin() {return this.ptr.get(LAYOUT__unusedRangeSizeMin, OFFSET__unusedRangeSizeMin);}
    public void unusedRangeSizeMin(long value) {this.ptr.set(LAYOUT__unusedRangeSizeMin, OFFSET__unusedRangeSizeMin, value);}
    public java.lang.foreign.MemorySegment $unusedRangeSizeMin() {return this.ptr.asSlice(OFFSET__unusedRangeSizeMin, LAYOUT__unusedRangeSizeMin);}

    public long unusedRangeSizeMax() {return this.ptr.get(LAYOUT__unusedRangeSizeMax, OFFSET__unusedRangeSizeMax);}
    public void unusedRangeSizeMax(long value) {this.ptr.set(LAYOUT__unusedRangeSizeMax, OFFSET__unusedRangeSizeMax, value);}
    public java.lang.foreign.MemorySegment $unusedRangeSizeMax() {return this.ptr.asSlice(OFFSET__unusedRangeSizeMax, LAYOUT__unusedRangeSizeMax);}
}
