package vma;

public record VmaDefragmentationMove(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__operation = java.lang.foreign.ValueLayout.JAVA_INT.withName("operation");
    public static final long OFFSET__operation = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__srcAllocation = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("srcAllocation");
    public static final long OFFSET__srcAllocation = 8;
    public static final java.lang.foreign.AddressLayout LAYOUT__dstTmpAllocation = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("dstTmpAllocation");
    public static final long OFFSET__dstTmpAllocation = 16;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__operation,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__srcAllocation,
            LAYOUT__dstTmpAllocation
    ).withByteAlignment(8).withName("VmaDefragmentationMove");

    public VmaDefragmentationMove(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VmaDefragmentationMove getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VmaDefragmentationMove(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VmaDefragmentationMove value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int operation() {return this.ptr.get(LAYOUT__operation, OFFSET__operation);}
    public void operation(int value) {this.ptr.set(LAYOUT__operation, OFFSET__operation, value);}
    public java.lang.foreign.MemorySegment $operation() {return this.ptr.asSlice(OFFSET__operation, LAYOUT__operation);}

    public java.lang.foreign.MemorySegment srcAllocation() {return this.ptr.get(LAYOUT__srcAllocation, OFFSET__srcAllocation);}
    public void srcAllocation(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__srcAllocation, OFFSET__srcAllocation, value);}
    public java.lang.foreign.MemorySegment $srcAllocation() {return this.ptr.asSlice(OFFSET__srcAllocation, LAYOUT__srcAllocation);}

    public java.lang.foreign.MemorySegment dstTmpAllocation() {return this.ptr.get(LAYOUT__dstTmpAllocation, OFFSET__dstTmpAllocation);}
    public void dstTmpAllocation(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__dstTmpAllocation, OFFSET__dstTmpAllocation, value);}
    public java.lang.foreign.MemorySegment $dstTmpAllocation() {return this.ptr.asSlice(OFFSET__dstTmpAllocation, LAYOUT__dstTmpAllocation);}
}
