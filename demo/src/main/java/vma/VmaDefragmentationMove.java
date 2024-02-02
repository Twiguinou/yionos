package vma;

public record VmaDefragmentationMove(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$operation = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$operation = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$srcAllocation = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$srcAllocation = 8L;
    public static final java.lang.foreign.AddressLayout LAYOUT$dstTmpAllocation = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$dstTmpAllocation = 16L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$operation,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$srcAllocation,
            LAYOUT$dstTmpAllocation
    ).withName("VmaDefragmentationMove");

    public VmaDefragmentationMove(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VmaDefragmentationMove getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VmaDefragmentationMove(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int operation() {return this.ptr.get(LAYOUT$operation, OFFSET$operation);}
    public void operation(int value) {this.ptr.set(LAYOUT$operation, OFFSET$operation, value);}
    public java.lang.foreign.MemorySegment operation_ptr() {return this.ptr.asSlice(OFFSET$operation, LAYOUT$operation);}

    public java.lang.foreign.MemorySegment srcAllocation() {return this.ptr.get(LAYOUT$srcAllocation, OFFSET$srcAllocation);}
    public void srcAllocation(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$srcAllocation, OFFSET$srcAllocation, value);}
    public java.lang.foreign.MemorySegment srcAllocation_ptr() {return this.ptr.asSlice(OFFSET$srcAllocation, LAYOUT$srcAllocation);}

    public java.lang.foreign.MemorySegment dstTmpAllocation() {return this.ptr.get(LAYOUT$dstTmpAllocation, OFFSET$dstTmpAllocation);}
    public void dstTmpAllocation(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$dstTmpAllocation, OFFSET$dstTmpAllocation, value);}
    public java.lang.foreign.MemorySegment dstTmpAllocation_ptr() {return this.ptr.asSlice(OFFSET$dstTmpAllocation, LAYOUT$dstTmpAllocation);}
}
