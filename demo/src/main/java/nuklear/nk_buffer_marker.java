package nuklear;

public record nk_buffer_marker(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__active = java.lang.foreign.ValueLayout.JAVA_INT.withName("active");
    public static final long OFFSET__active = 0;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__offset = java.lang.foreign.ValueLayout.JAVA_LONG.withName("offset");
    public static final long OFFSET__offset = 8;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__active,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__offset
    ).withByteAlignment(8).withName("nk_buffer_marker");

    public nk_buffer_marker(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static nk_buffer_marker getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new nk_buffer_marker(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, nk_buffer_marker value)
    {
        java.lang.foreign.MemorySegment.copy(value._ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int active() {return this._ptr.get(LAYOUT__active, OFFSET__active);}
    public void active(int value) {this._ptr.set(LAYOUT__active, OFFSET__active, value);}
    public java.lang.foreign.MemorySegment $active() {return this._ptr.asSlice(OFFSET__active, LAYOUT__active);}

    public long offset() {return this._ptr.get(LAYOUT__offset, OFFSET__offset);}
    public void offset(long value) {this._ptr.set(LAYOUT__offset, OFFSET__offset, value);}
    public java.lang.foreign.MemorySegment $offset() {return this._ptr.asSlice(OFFSET__offset, LAYOUT__offset);}
}
