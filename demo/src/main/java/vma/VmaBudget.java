package vma;

public record VmaBudget(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.GroupLayout LAYOUT$statistics = vma.VmaStatistics.gStructLayout;
    public static final long OFFSET$statistics = 0L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$usage = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$usage = 24L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$budget = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$budget = 32L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$statistics,
            LAYOUT$usage,
            LAYOUT$budget
    ).withName("VmaBudget");

    public VmaBudget(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VmaBudget getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VmaBudget(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public vma.VmaStatistics statistics() {return new vma.VmaStatistics(this.ptr.asSlice(OFFSET$statistics, LAYOUT$statistics));}
    public void statistics(java.util.function.Consumer<vma.VmaStatistics> consumer) {consumer.accept(this.statistics());}
    public void statistics(vma.VmaStatistics value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$statistics, LAYOUT$statistics.byteSize());}

    public long usage() {return this.ptr.get(LAYOUT$usage, OFFSET$usage);}
    public void usage(long value) {this.ptr.set(LAYOUT$usage, OFFSET$usage, value);}
    public java.lang.foreign.MemorySegment usage_ptr() {return this.ptr.asSlice(OFFSET$usage, LAYOUT$usage);}

    public long budget() {return this.ptr.get(LAYOUT$budget, OFFSET$budget);}
    public void budget(long value) {this.ptr.set(LAYOUT$budget, OFFSET$budget, value);}
    public java.lang.foreign.MemorySegment budget_ptr() {return this.ptr.asSlice(OFFSET$budget, LAYOUT$budget);}
}
