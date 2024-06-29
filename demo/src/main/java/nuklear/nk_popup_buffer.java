package nuklear;

public record nk_popup_buffer(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__begin = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__begin = 0;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__parent = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__parent = 8;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__last = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__last = 16;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__end = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__end = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__active = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__active = 32;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__begin,
            LAYOUT__parent,
            LAYOUT__last,
            LAYOUT__end,
            LAYOUT__active,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("nk_popup_buffer");

    public nk_popup_buffer(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static nk_popup_buffer getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new nk_popup_buffer(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, nk_popup_buffer value)
    {
        java.lang.foreign.MemorySegment.copy(value._ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public long begin() {return this._ptr.get(LAYOUT__begin, OFFSET__begin);}
    public void begin(long value) {this._ptr.set(LAYOUT__begin, OFFSET__begin, value);}
    public java.lang.foreign.MemorySegment $begin() {return this._ptr.asSlice(OFFSET__begin, LAYOUT__begin);}

    public long parent() {return this._ptr.get(LAYOUT__parent, OFFSET__parent);}
    public void parent(long value) {this._ptr.set(LAYOUT__parent, OFFSET__parent, value);}
    public java.lang.foreign.MemorySegment $parent() {return this._ptr.asSlice(OFFSET__parent, LAYOUT__parent);}

    public long last() {return this._ptr.get(LAYOUT__last, OFFSET__last);}
    public void last(long value) {this._ptr.set(LAYOUT__last, OFFSET__last, value);}
    public java.lang.foreign.MemorySegment $last() {return this._ptr.asSlice(OFFSET__last, LAYOUT__last);}

    public long end() {return this._ptr.get(LAYOUT__end, OFFSET__end);}
    public void end(long value) {this._ptr.set(LAYOUT__end, OFFSET__end, value);}
    public java.lang.foreign.MemorySegment $end() {return this._ptr.asSlice(OFFSET__end, LAYOUT__end);}

    public int active() {return this._ptr.get(LAYOUT__active, OFFSET__active);}
    public void active(int value) {this._ptr.set(LAYOUT__active, OFFSET__active, value);}
    public java.lang.foreign.MemorySegment $active() {return this._ptr.asSlice(OFFSET__active, LAYOUT__active);}
}
