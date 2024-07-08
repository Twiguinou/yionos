package vma;

public record VmaBudget(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT__statistics = vma.VmaStatistics.gRecordLayout.withName("statistics");
    public static final long OFFSET__statistics = 0;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__usage = java.lang.foreign.ValueLayout.JAVA_LONG.withName("usage");
    public static final long OFFSET__usage = 24;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__budget = java.lang.foreign.ValueLayout.JAVA_LONG.withName("budget");
    public static final long OFFSET__budget = 32;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__statistics,
            LAYOUT__usage,
            LAYOUT__budget
    ).withByteAlignment(8).withName("VmaBudget");

    public VmaBudget(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VmaBudget getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VmaBudget(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VmaBudget value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public vma.VmaStatistics statistics() {return new vma.VmaStatistics(this.ptr.asSlice(OFFSET__statistics, LAYOUT__statistics));}
    public void statistics(java.util.function.Consumer<vma.VmaStatistics> consumer) {consumer.accept(this.statistics());}
    public void statistics(vma.VmaStatistics value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__statistics, LAYOUT__statistics.byteSize());}

    public long usage() {return this.ptr.get(LAYOUT__usage, OFFSET__usage);}
    public void usage(long value) {this.ptr.set(LAYOUT__usage, OFFSET__usage, value);}
    public java.lang.foreign.MemorySegment $usage() {return this.ptr.asSlice(OFFSET__usage, LAYOUT__usage);}

    public long budget() {return this.ptr.get(LAYOUT__budget, OFFSET__budget);}
    public void budget(long value) {this.ptr.set(LAYOUT__budget, OFFSET__budget, value);}
    public java.lang.foreign.MemorySegment $budget() {return this.ptr.asSlice(OFFSET__budget, LAYOUT__budget);}
}
