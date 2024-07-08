package vma;

public record VmaTotalStatistics(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.SequenceLayout LAYOUT__memoryType = java.lang.foreign.MemoryLayout.sequenceLayout(32, vma.VmaDetailedStatistics.gRecordLayout).withName("memoryType");
    public static final long OFFSET__memoryType = 0;
    public static final java.lang.foreign.SequenceLayout LAYOUT__memoryHeap = java.lang.foreign.MemoryLayout.sequenceLayout(16, vma.VmaDetailedStatistics.gRecordLayout).withName("memoryHeap");
    public static final long OFFSET__memoryHeap = 2048;
    public static final java.lang.foreign.StructLayout LAYOUT__total = vma.VmaDetailedStatistics.gRecordLayout.withName("total");
    public static final long OFFSET__total = 3072;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__memoryType,
            LAYOUT__memoryHeap,
            LAYOUT__total
    ).withByteAlignment(8).withName("VmaTotalStatistics");

    public VmaTotalStatistics(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VmaTotalStatistics getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VmaTotalStatistics(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VmaTotalStatistics value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public java.lang.foreign.MemorySegment memoryType() {return this.ptr.asSlice(OFFSET__memoryType, LAYOUT__memoryType);}
    public vma.VmaDetailedStatistics memoryType(int index) {return vma.VmaDetailedStatistics.getAtIndex(this.memoryType(), index);}
    public void memoryType(int index, java.util.function.Consumer<vma.VmaDetailedStatistics> consumer) {consumer.accept(this.memoryType(index));}
    public void memoryType(int index, vma.VmaDetailedStatistics value) {vma.VmaDetailedStatistics.setAtIndex(this.memoryType(), index, value);}

    public java.lang.foreign.MemorySegment memoryHeap() {return this.ptr.asSlice(OFFSET__memoryHeap, LAYOUT__memoryHeap);}
    public vma.VmaDetailedStatistics memoryHeap(int index) {return vma.VmaDetailedStatistics.getAtIndex(this.memoryHeap(), index);}
    public void memoryHeap(int index, java.util.function.Consumer<vma.VmaDetailedStatistics> consumer) {consumer.accept(this.memoryHeap(index));}
    public void memoryHeap(int index, vma.VmaDetailedStatistics value) {vma.VmaDetailedStatistics.setAtIndex(this.memoryHeap(), index, value);}

    public vma.VmaDetailedStatistics total() {return new vma.VmaDetailedStatistics(this.ptr.asSlice(OFFSET__total, LAYOUT__total));}
    public void total(java.util.function.Consumer<vma.VmaDetailedStatistics> consumer) {consumer.accept(this.total());}
    public void total(vma.VmaDetailedStatistics value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__total, LAYOUT__total.byteSize());}
}
