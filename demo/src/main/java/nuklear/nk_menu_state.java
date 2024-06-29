package nuklear;

public record nk_menu_state(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__x = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET__x = 0;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__y = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET__y = 4;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__w = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET__w = 8;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__h = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET__h = 12;
    public static final java.lang.foreign.StructLayout LAYOUT__offset = nuklear.nk_scroll.gRecordLayout;
    public static final long OFFSET__offset = 16;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__x,
            LAYOUT__y,
            LAYOUT__w,
            LAYOUT__h,
            LAYOUT__offset
    ).withByteAlignment(4).withName("nk_menu_state");

    public nk_menu_state(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static nk_menu_state getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new nk_menu_state(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, nk_menu_state value)
    {
        java.lang.foreign.MemorySegment.copy(value._ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public float x() {return this._ptr.get(LAYOUT__x, OFFSET__x);}
    public void x(float value) {this._ptr.set(LAYOUT__x, OFFSET__x, value);}
    public java.lang.foreign.MemorySegment $x() {return this._ptr.asSlice(OFFSET__x, LAYOUT__x);}

    public float y() {return this._ptr.get(LAYOUT__y, OFFSET__y);}
    public void y(float value) {this._ptr.set(LAYOUT__y, OFFSET__y, value);}
    public java.lang.foreign.MemorySegment $y() {return this._ptr.asSlice(OFFSET__y, LAYOUT__y);}

    public float w() {return this._ptr.get(LAYOUT__w, OFFSET__w);}
    public void w(float value) {this._ptr.set(LAYOUT__w, OFFSET__w, value);}
    public java.lang.foreign.MemorySegment $w() {return this._ptr.asSlice(OFFSET__w, LAYOUT__w);}

    public float h() {return this._ptr.get(LAYOUT__h, OFFSET__h);}
    public void h(float value) {this._ptr.set(LAYOUT__h, OFFSET__h, value);}
    public java.lang.foreign.MemorySegment $h() {return this._ptr.asSlice(OFFSET__h, LAYOUT__h);}

    public nuklear.nk_scroll offset() {return new nuklear.nk_scroll(this._ptr.asSlice(OFFSET__offset, LAYOUT__offset));}
    public void offset(java.util.function.Consumer<nuklear.nk_scroll> consumer) {consumer.accept(this.offset());}
    public void offset(nuklear.nk_scroll value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__offset, LAYOUT__offset.byteSize());}
}
