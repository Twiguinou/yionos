package vma;

public record VmaDefragmentationStats(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__bytesMoved = java.lang.foreign.ValueLayout.JAVA_LONG.withName("bytesMoved");
    public static final long OFFSET__bytesMoved = 0;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__bytesFreed = java.lang.foreign.ValueLayout.JAVA_LONG.withName("bytesFreed");
    public static final long OFFSET__bytesFreed = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__allocationsMoved = java.lang.foreign.ValueLayout.JAVA_INT.withName("allocationsMoved");
    public static final long OFFSET__allocationsMoved = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__deviceMemoryBlocksFreed = java.lang.foreign.ValueLayout.JAVA_INT.withName("deviceMemoryBlocksFreed");
    public static final long OFFSET__deviceMemoryBlocksFreed = 20;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__bytesMoved,
            LAYOUT__bytesFreed,
            LAYOUT__allocationsMoved,
            LAYOUT__deviceMemoryBlocksFreed
    ).withByteAlignment(8).withName("VmaDefragmentationStats");

    public VmaDefragmentationStats(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VmaDefragmentationStats getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VmaDefragmentationStats(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VmaDefragmentationStats value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public long bytesMoved() {return this.ptr.get(LAYOUT__bytesMoved, OFFSET__bytesMoved);}
    public void bytesMoved(long value) {this.ptr.set(LAYOUT__bytesMoved, OFFSET__bytesMoved, value);}
    public java.lang.foreign.MemorySegment $bytesMoved() {return this.ptr.asSlice(OFFSET__bytesMoved, LAYOUT__bytesMoved);}

    public long bytesFreed() {return this.ptr.get(LAYOUT__bytesFreed, OFFSET__bytesFreed);}
    public void bytesFreed(long value) {this.ptr.set(LAYOUT__bytesFreed, OFFSET__bytesFreed, value);}
    public java.lang.foreign.MemorySegment $bytesFreed() {return this.ptr.asSlice(OFFSET__bytesFreed, LAYOUT__bytesFreed);}

    public int allocationsMoved() {return this.ptr.get(LAYOUT__allocationsMoved, OFFSET__allocationsMoved);}
    public void allocationsMoved(int value) {this.ptr.set(LAYOUT__allocationsMoved, OFFSET__allocationsMoved, value);}
    public java.lang.foreign.MemorySegment $allocationsMoved() {return this.ptr.asSlice(OFFSET__allocationsMoved, LAYOUT__allocationsMoved);}

    public int deviceMemoryBlocksFreed() {return this.ptr.get(LAYOUT__deviceMemoryBlocksFreed, OFFSET__deviceMemoryBlocksFreed);}
    public void deviceMemoryBlocksFreed(int value) {this.ptr.set(LAYOUT__deviceMemoryBlocksFreed, OFFSET__deviceMemoryBlocksFreed, value);}
    public java.lang.foreign.MemorySegment $deviceMemoryBlocksFreed() {return this.ptr.asSlice(OFFSET__deviceMemoryBlocksFreed, LAYOUT__deviceMemoryBlocksFreed);}
}
