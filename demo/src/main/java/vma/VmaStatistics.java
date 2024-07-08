package vma;

public record VmaStatistics(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__blockCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("blockCount");
    public static final long OFFSET__blockCount = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__allocationCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("allocationCount");
    public static final long OFFSET__allocationCount = 4;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__blockBytes = java.lang.foreign.ValueLayout.JAVA_LONG.withName("blockBytes");
    public static final long OFFSET__blockBytes = 8;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__allocationBytes = java.lang.foreign.ValueLayout.JAVA_LONG.withName("allocationBytes");
    public static final long OFFSET__allocationBytes = 16;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__blockCount,
            LAYOUT__allocationCount,
            LAYOUT__blockBytes,
            LAYOUT__allocationBytes
    ).withByteAlignment(8).withName("VmaStatistics");

    public VmaStatistics(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VmaStatistics getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VmaStatistics(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VmaStatistics value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int blockCount() {return this.ptr.get(LAYOUT__blockCount, OFFSET__blockCount);}
    public void blockCount(int value) {this.ptr.set(LAYOUT__blockCount, OFFSET__blockCount, value);}
    public java.lang.foreign.MemorySegment $blockCount() {return this.ptr.asSlice(OFFSET__blockCount, LAYOUT__blockCount);}

    public int allocationCount() {return this.ptr.get(LAYOUT__allocationCount, OFFSET__allocationCount);}
    public void allocationCount(int value) {this.ptr.set(LAYOUT__allocationCount, OFFSET__allocationCount, value);}
    public java.lang.foreign.MemorySegment $allocationCount() {return this.ptr.asSlice(OFFSET__allocationCount, LAYOUT__allocationCount);}

    public long blockBytes() {return this.ptr.get(LAYOUT__blockBytes, OFFSET__blockBytes);}
    public void blockBytes(long value) {this.ptr.set(LAYOUT__blockBytes, OFFSET__blockBytes, value);}
    public java.lang.foreign.MemorySegment $blockBytes() {return this.ptr.asSlice(OFFSET__blockBytes, LAYOUT__blockBytes);}

    public long allocationBytes() {return this.ptr.get(LAYOUT__allocationBytes, OFFSET__allocationBytes);}
    public void allocationBytes(long value) {this.ptr.set(LAYOUT__allocationBytes, OFFSET__allocationBytes, value);}
    public java.lang.foreign.MemorySegment $allocationBytes() {return this.ptr.asSlice(OFFSET__allocationBytes, LAYOUT__allocationBytes);}
}
