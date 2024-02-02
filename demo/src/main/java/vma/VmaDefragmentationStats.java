package vma;

public record VmaDefragmentationStats(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$bytesMoved = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$bytesMoved = 0L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$bytesFreed = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$bytesFreed = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$allocationsMoved = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$allocationsMoved = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$deviceMemoryBlocksFreed = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$deviceMemoryBlocksFreed = 20L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$bytesMoved,
            LAYOUT$bytesFreed,
            LAYOUT$allocationsMoved,
            LAYOUT$deviceMemoryBlocksFreed
    ).withName("VmaDefragmentationStats");

    public VmaDefragmentationStats(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VmaDefragmentationStats getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VmaDefragmentationStats(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public long bytesMoved() {return this.ptr.get(LAYOUT$bytesMoved, OFFSET$bytesMoved);}
    public void bytesMoved(long value) {this.ptr.set(LAYOUT$bytesMoved, OFFSET$bytesMoved, value);}
    public java.lang.foreign.MemorySegment bytesMoved_ptr() {return this.ptr.asSlice(OFFSET$bytesMoved, LAYOUT$bytesMoved);}

    public long bytesFreed() {return this.ptr.get(LAYOUT$bytesFreed, OFFSET$bytesFreed);}
    public void bytesFreed(long value) {this.ptr.set(LAYOUT$bytesFreed, OFFSET$bytesFreed, value);}
    public java.lang.foreign.MemorySegment bytesFreed_ptr() {return this.ptr.asSlice(OFFSET$bytesFreed, LAYOUT$bytesFreed);}

    public int allocationsMoved() {return this.ptr.get(LAYOUT$allocationsMoved, OFFSET$allocationsMoved);}
    public void allocationsMoved(int value) {this.ptr.set(LAYOUT$allocationsMoved, OFFSET$allocationsMoved, value);}
    public java.lang.foreign.MemorySegment allocationsMoved_ptr() {return this.ptr.asSlice(OFFSET$allocationsMoved, LAYOUT$allocationsMoved);}

    public int deviceMemoryBlocksFreed() {return this.ptr.get(LAYOUT$deviceMemoryBlocksFreed, OFFSET$deviceMemoryBlocksFreed);}
    public void deviceMemoryBlocksFreed(int value) {this.ptr.set(LAYOUT$deviceMemoryBlocksFreed, OFFSET$deviceMemoryBlocksFreed, value);}
    public java.lang.foreign.MemorySegment deviceMemoryBlocksFreed_ptr() {return this.ptr.asSlice(OFFSET$deviceMemoryBlocksFreed, LAYOUT$deviceMemoryBlocksFreed);}
}
