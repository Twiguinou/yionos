package vma;

public record VmaStatistics(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$blockCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$blockCount = 0L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$allocationCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$allocationCount = 4L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$blockBytes = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$blockBytes = 8L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$allocationBytes = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$allocationBytes = 16L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$blockCount,
            LAYOUT$allocationCount,
            LAYOUT$blockBytes,
            LAYOUT$allocationBytes
    ).withName("VmaStatistics");

    public VmaStatistics(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VmaStatistics getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VmaStatistics(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int blockCount() {return this.ptr.get(LAYOUT$blockCount, OFFSET$blockCount);}
    public void blockCount(int value) {this.ptr.set(LAYOUT$blockCount, OFFSET$blockCount, value);}
    public java.lang.foreign.MemorySegment blockCount_ptr() {return this.ptr.asSlice(OFFSET$blockCount, LAYOUT$blockCount);}

    public int allocationCount() {return this.ptr.get(LAYOUT$allocationCount, OFFSET$allocationCount);}
    public void allocationCount(int value) {this.ptr.set(LAYOUT$allocationCount, OFFSET$allocationCount, value);}
    public java.lang.foreign.MemorySegment allocationCount_ptr() {return this.ptr.asSlice(OFFSET$allocationCount, LAYOUT$allocationCount);}

    public long blockBytes() {return this.ptr.get(LAYOUT$blockBytes, OFFSET$blockBytes);}
    public void blockBytes(long value) {this.ptr.set(LAYOUT$blockBytes, OFFSET$blockBytes, value);}
    public java.lang.foreign.MemorySegment blockBytes_ptr() {return this.ptr.asSlice(OFFSET$blockBytes, LAYOUT$blockBytes);}

    public long allocationBytes() {return this.ptr.get(LAYOUT$allocationBytes, OFFSET$allocationBytes);}
    public void allocationBytes(long value) {this.ptr.set(LAYOUT$allocationBytes, OFFSET$allocationBytes, value);}
    public java.lang.foreign.MemorySegment allocationBytes_ptr() {return this.ptr.asSlice(OFFSET$allocationBytes, LAYOUT$allocationBytes);}
}
