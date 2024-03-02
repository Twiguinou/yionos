package nuklear;

public record nk_buffer_marker(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$active = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$active = 0L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$offset = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$offset = 8L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$active,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$offset
    ).withName("nk_buffer_marker");

    public nk_buffer_marker(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static nk_buffer_marker getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new nk_buffer_marker(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int active() {return this._ptr.get(LAYOUT$active, OFFSET$active);}
    public void active(int value) {this._ptr.set(LAYOUT$active, OFFSET$active, value);}
    public java.lang.foreign.MemorySegment active_ptr() {return this._ptr.asSlice(OFFSET$active, LAYOUT$active);}

    public long offset() {return this._ptr.get(LAYOUT$offset, OFFSET$offset);}
    public void offset(long value) {this._ptr.set(LAYOUT$offset, OFFSET$offset, value);}
    public java.lang.foreign.MemorySegment offset_ptr() {return this._ptr.asSlice(OFFSET$offset, LAYOUT$offset);}
}
