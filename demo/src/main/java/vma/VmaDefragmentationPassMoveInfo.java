package vma;

public record VmaDefragmentationPassMoveInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__moveCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__moveCount = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pMoves = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pMoves = 8;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__moveCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pMoves
    ).withByteAlignment(8).withName("VmaDefragmentationPassMoveInfo");

    public VmaDefragmentationPassMoveInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VmaDefragmentationPassMoveInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VmaDefragmentationPassMoveInfo(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VmaDefragmentationPassMoveInfo value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int moveCount() {return this.ptr.get(LAYOUT__moveCount, OFFSET__moveCount);}
    public void moveCount(int value) {this.ptr.set(LAYOUT__moveCount, OFFSET__moveCount, value);}
    public java.lang.foreign.MemorySegment $moveCount() {return this.ptr.asSlice(OFFSET__moveCount, LAYOUT__moveCount);}

    public java.lang.foreign.MemorySegment pMoves() {return this.ptr.get(LAYOUT__pMoves, OFFSET__pMoves);}
    public void pMoves(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pMoves, OFFSET__pMoves, value);}
    public java.lang.foreign.MemorySegment $pMoves() {return this.ptr.asSlice(OFFSET__pMoves, LAYOUT__pMoves);}
}
