package vma;

public record VmaDefragmentationPassMoveInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$moveCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$moveCount = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pMoves = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pMoves = 8L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$moveCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pMoves
    ).withName("VmaDefragmentationPassMoveInfo");

    public VmaDefragmentationPassMoveInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VmaDefragmentationPassMoveInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VmaDefragmentationPassMoveInfo(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int moveCount() {return this.ptr.get(LAYOUT$moveCount, OFFSET$moveCount);}
    public void moveCount(int value) {this.ptr.set(LAYOUT$moveCount, OFFSET$moveCount, value);}
    public java.lang.foreign.MemorySegment moveCount_ptr() {return this.ptr.asSlice(OFFSET$moveCount, LAYOUT$moveCount);}

    public java.lang.foreign.MemorySegment pMoves() {return this.ptr.get(LAYOUT$pMoves, OFFSET$pMoves);}
    public void pMoves(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pMoves, OFFSET$pMoves, value);}
    public java.lang.foreign.MemorySegment pMoves_ptr() {return this.ptr.asSlice(OFFSET$pMoves, LAYOUT$pMoves);}
}
