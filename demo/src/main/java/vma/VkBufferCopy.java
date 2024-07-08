package vma;

public record VkBufferCopy(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__srcOffset = java.lang.foreign.ValueLayout.JAVA_LONG.withName("srcOffset");
    public static final long OFFSET__srcOffset = 0;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__dstOffset = java.lang.foreign.ValueLayout.JAVA_LONG.withName("dstOffset");
    public static final long OFFSET__dstOffset = 8;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__size = java.lang.foreign.ValueLayout.JAVA_LONG.withName("size");
    public static final long OFFSET__size = 16;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__srcOffset,
            LAYOUT__dstOffset,
            LAYOUT__size
    ).withByteAlignment(8).withName("VkBufferCopy");

    public VkBufferCopy(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkBufferCopy getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkBufferCopy(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkBufferCopy value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public long srcOffset() {return this.ptr.get(LAYOUT__srcOffset, OFFSET__srcOffset);}
    public void srcOffset(long value) {this.ptr.set(LAYOUT__srcOffset, OFFSET__srcOffset, value);}
    public java.lang.foreign.MemorySegment $srcOffset() {return this.ptr.asSlice(OFFSET__srcOffset, LAYOUT__srcOffset);}

    public long dstOffset() {return this.ptr.get(LAYOUT__dstOffset, OFFSET__dstOffset);}
    public void dstOffset(long value) {this.ptr.set(LAYOUT__dstOffset, OFFSET__dstOffset, value);}
    public java.lang.foreign.MemorySegment $dstOffset() {return this.ptr.asSlice(OFFSET__dstOffset, LAYOUT__dstOffset);}

    public long size() {return this.ptr.get(LAYOUT__size, OFFSET__size);}
    public void size(long value) {this.ptr.set(LAYOUT__size, OFFSET__size, value);}
    public java.lang.foreign.MemorySegment $size() {return this.ptr.asSlice(OFFSET__size, LAYOUT__size);}
}
