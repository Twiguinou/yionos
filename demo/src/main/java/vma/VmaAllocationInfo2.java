package vma;

public record VmaAllocationInfo2(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.GroupLayout LAYOUT$allocationInfo = vma.VmaAllocationInfo.gStructLayout;
    public static final long OFFSET$allocationInfo = 0L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$blockSize = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$blockSize = 56L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$dedicatedMemory = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$dedicatedMemory = 64L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$allocationInfo,
            LAYOUT$blockSize,
            LAYOUT$dedicatedMemory,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("VmaAllocationInfo2");

    public VmaAllocationInfo2(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VmaAllocationInfo2 getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VmaAllocationInfo2(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public vma.VmaAllocationInfo allocationInfo() {return new vma.VmaAllocationInfo(this.ptr.asSlice(OFFSET$allocationInfo, LAYOUT$allocationInfo));}
    public void allocationInfo(java.util.function.Consumer<vma.VmaAllocationInfo> consumer) {consumer.accept(this.allocationInfo());}
    public void allocationInfo(vma.VmaAllocationInfo value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$allocationInfo, LAYOUT$allocationInfo.byteSize());}

    public long blockSize() {return this.ptr.get(LAYOUT$blockSize, OFFSET$blockSize);}
    public void blockSize(long value) {this.ptr.set(LAYOUT$blockSize, OFFSET$blockSize, value);}
    public java.lang.foreign.MemorySegment blockSize_ptr() {return this.ptr.asSlice(OFFSET$blockSize, LAYOUT$blockSize);}

    public int dedicatedMemory() {return this.ptr.get(LAYOUT$dedicatedMemory, OFFSET$dedicatedMemory);}
    public void dedicatedMemory(int value) {this.ptr.set(LAYOUT$dedicatedMemory, OFFSET$dedicatedMemory, value);}
    public java.lang.foreign.MemorySegment dedicatedMemory_ptr() {return this.ptr.asSlice(OFFSET$dedicatedMemory, LAYOUT$dedicatedMemory);}
}
