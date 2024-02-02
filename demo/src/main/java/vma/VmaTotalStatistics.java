package vma;

public record VmaTotalStatistics(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.SequenceLayout LAYOUT$memoryType = java.lang.foreign.MemoryLayout.sequenceLayout(32, vma.VmaDetailedStatistics.gStructLayout);
    public static final long OFFSET$memoryType = 0L;
    public static final java.lang.foreign.SequenceLayout LAYOUT$memoryHeap = java.lang.foreign.MemoryLayout.sequenceLayout(16, vma.VmaDetailedStatistics.gStructLayout);
    public static final long OFFSET$memoryHeap = 2048L;
    public static final java.lang.foreign.GroupLayout LAYOUT$total = vma.VmaDetailedStatistics.gStructLayout;
    public static final long OFFSET$total = 3072L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$memoryType,
            LAYOUT$memoryHeap,
            LAYOUT$total
    ).withName("VmaTotalStatistics");

    public VmaTotalStatistics(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VmaTotalStatistics getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VmaTotalStatistics(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public java.lang.foreign.MemorySegment memoryType() {return this.ptr.asSlice(OFFSET$memoryType, LAYOUT$memoryType);}
    public vma.VmaDetailedStatistics memoryType(int i) {return new vma.VmaDetailedStatistics(this.ptr.asSlice(OFFSET$memoryType + i * LAYOUT$memoryType.byteSize(), LAYOUT$memoryType));}
    public void memoryType(int i, java.util.function.Consumer<vma.VmaDetailedStatistics> consumer) {consumer.accept(this.memoryType(i));}
    public void memoryType(int i, vma.VmaDetailedStatistics value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$memoryType + i * LAYOUT$memoryType.byteSize(), LAYOUT$memoryType.byteSize());}

    public java.lang.foreign.MemorySegment memoryHeap() {return this.ptr.asSlice(OFFSET$memoryHeap, LAYOUT$memoryHeap);}
    public vma.VmaDetailedStatistics memoryHeap(int i) {return new vma.VmaDetailedStatistics(this.ptr.asSlice(OFFSET$memoryHeap + i * LAYOUT$memoryHeap.byteSize(), LAYOUT$memoryHeap));}
    public void memoryHeap(int i, java.util.function.Consumer<vma.VmaDetailedStatistics> consumer) {consumer.accept(this.memoryHeap(i));}
    public void memoryHeap(int i, vma.VmaDetailedStatistics value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$memoryHeap + i * LAYOUT$memoryHeap.byteSize(), LAYOUT$memoryHeap.byteSize());}

    public vma.VmaDetailedStatistics total() {return new vma.VmaDetailedStatistics(this.ptr.asSlice(OFFSET$total, LAYOUT$total));}
    public void total(java.util.function.Consumer<vma.VmaDetailedStatistics> consumer) {consumer.accept(this.total());}
    public void total(vma.VmaDetailedStatistics value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$total, LAYOUT$total.byteSize());}
}
