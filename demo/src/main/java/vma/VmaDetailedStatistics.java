package vma;

public record VmaDetailedStatistics(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.GroupLayout LAYOUT$statistics = vma.VmaStatistics.gStructLayout;
    public static final long OFFSET$statistics = 0L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$unusedRangeCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$unusedRangeCount = 24L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$allocationSizeMin = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$allocationSizeMin = 32L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$allocationSizeMax = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$allocationSizeMax = 40L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$unusedRangeSizeMin = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$unusedRangeSizeMin = 48L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$unusedRangeSizeMax = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$unusedRangeSizeMax = 56L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$statistics,
            LAYOUT$unusedRangeCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$allocationSizeMin,
            LAYOUT$allocationSizeMax,
            LAYOUT$unusedRangeSizeMin,
            LAYOUT$unusedRangeSizeMax
    ).withName("VmaDetailedStatistics");

    public VmaDetailedStatistics(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VmaDetailedStatistics getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VmaDetailedStatistics(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public vma.VmaStatistics statistics() {return new vma.VmaStatistics(this.ptr.asSlice(OFFSET$statistics, LAYOUT$statistics));}
    public void statistics(java.util.function.Consumer<vma.VmaStatistics> consumer) {consumer.accept(this.statistics());}
    public void statistics(vma.VmaStatistics value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$statistics, LAYOUT$statistics.byteSize());}

    public int unusedRangeCount() {return this.ptr.get(LAYOUT$unusedRangeCount, OFFSET$unusedRangeCount);}
    public void unusedRangeCount(int value) {this.ptr.set(LAYOUT$unusedRangeCount, OFFSET$unusedRangeCount, value);}
    public java.lang.foreign.MemorySegment unusedRangeCount_ptr() {return this.ptr.asSlice(OFFSET$unusedRangeCount, LAYOUT$unusedRangeCount);}

    public long allocationSizeMin() {return this.ptr.get(LAYOUT$allocationSizeMin, OFFSET$allocationSizeMin);}
    public void allocationSizeMin(long value) {this.ptr.set(LAYOUT$allocationSizeMin, OFFSET$allocationSizeMin, value);}
    public java.lang.foreign.MemorySegment allocationSizeMin_ptr() {return this.ptr.asSlice(OFFSET$allocationSizeMin, LAYOUT$allocationSizeMin);}

    public long allocationSizeMax() {return this.ptr.get(LAYOUT$allocationSizeMax, OFFSET$allocationSizeMax);}
    public void allocationSizeMax(long value) {this.ptr.set(LAYOUT$allocationSizeMax, OFFSET$allocationSizeMax, value);}
    public java.lang.foreign.MemorySegment allocationSizeMax_ptr() {return this.ptr.asSlice(OFFSET$allocationSizeMax, LAYOUT$allocationSizeMax);}

    public long unusedRangeSizeMin() {return this.ptr.get(LAYOUT$unusedRangeSizeMin, OFFSET$unusedRangeSizeMin);}
    public void unusedRangeSizeMin(long value) {this.ptr.set(LAYOUT$unusedRangeSizeMin, OFFSET$unusedRangeSizeMin, value);}
    public java.lang.foreign.MemorySegment unusedRangeSizeMin_ptr() {return this.ptr.asSlice(OFFSET$unusedRangeSizeMin, LAYOUT$unusedRangeSizeMin);}

    public long unusedRangeSizeMax() {return this.ptr.get(LAYOUT$unusedRangeSizeMax, OFFSET$unusedRangeSizeMax);}
    public void unusedRangeSizeMax(long value) {this.ptr.set(LAYOUT$unusedRangeSizeMax, OFFSET$unusedRangeSizeMax, value);}
    public java.lang.foreign.MemorySegment unusedRangeSizeMax_ptr() {return this.ptr.asSlice(OFFSET$unusedRangeSizeMax, LAYOUT$unusedRangeSizeMax);}
}
