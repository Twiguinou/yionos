package nuklear;

public record nk_popup_buffer(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$begin = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$begin = 0L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$parent = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$parent = 8L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$last = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$last = 16L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$end = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$end = 24L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$active = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$active = 32L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$begin,
            LAYOUT$parent,
            LAYOUT$last,
            LAYOUT$end,
            LAYOUT$active,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("nk_popup_buffer");

    public nk_popup_buffer(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static nk_popup_buffer getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new nk_popup_buffer(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public long begin() {return this._ptr.get(LAYOUT$begin, OFFSET$begin);}
    public void begin(long value) {this._ptr.set(LAYOUT$begin, OFFSET$begin, value);}
    public java.lang.foreign.MemorySegment begin_ptr() {return this._ptr.asSlice(OFFSET$begin, LAYOUT$begin);}

    public long parent() {return this._ptr.get(LAYOUT$parent, OFFSET$parent);}
    public void parent(long value) {this._ptr.set(LAYOUT$parent, OFFSET$parent, value);}
    public java.lang.foreign.MemorySegment parent_ptr() {return this._ptr.asSlice(OFFSET$parent, LAYOUT$parent);}

    public long last() {return this._ptr.get(LAYOUT$last, OFFSET$last);}
    public void last(long value) {this._ptr.set(LAYOUT$last, OFFSET$last, value);}
    public java.lang.foreign.MemorySegment last_ptr() {return this._ptr.asSlice(OFFSET$last, LAYOUT$last);}

    public long end() {return this._ptr.get(LAYOUT$end, OFFSET$end);}
    public void end(long value) {this._ptr.set(LAYOUT$end, OFFSET$end, value);}
    public java.lang.foreign.MemorySegment end_ptr() {return this._ptr.asSlice(OFFSET$end, LAYOUT$end);}

    public int active() {return this._ptr.get(LAYOUT$active, OFFSET$active);}
    public void active(int value) {this._ptr.set(LAYOUT$active, OFFSET$active, value);}
    public java.lang.foreign.MemorySegment active_ptr() {return this._ptr.asSlice(OFFSET$active, LAYOUT$active);}
}
