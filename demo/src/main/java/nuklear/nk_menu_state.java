package nuklear;

public record nk_menu_state(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$x = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$x = 0L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$y = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$y = 4L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$w = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$w = 8L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$h = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$h = 12L;
    public static final java.lang.foreign.GroupLayout LAYOUT$offset = nuklear.nk_scroll.gStructLayout;
    public static final long OFFSET$offset = 16L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$x,
            LAYOUT$y,
            LAYOUT$w,
            LAYOUT$h,
            LAYOUT$offset
    ).withName("nk_menu_state");

    public nk_menu_state(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static nk_menu_state getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new nk_menu_state(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public float x() {return this._ptr.get(LAYOUT$x, OFFSET$x);}
    public void x(float value) {this._ptr.set(LAYOUT$x, OFFSET$x, value);}
    public java.lang.foreign.MemorySegment x_ptr() {return this._ptr.asSlice(OFFSET$x, LAYOUT$x);}

    public float y() {return this._ptr.get(LAYOUT$y, OFFSET$y);}
    public void y(float value) {this._ptr.set(LAYOUT$y, OFFSET$y, value);}
    public java.lang.foreign.MemorySegment y_ptr() {return this._ptr.asSlice(OFFSET$y, LAYOUT$y);}

    public float w() {return this._ptr.get(LAYOUT$w, OFFSET$w);}
    public void w(float value) {this._ptr.set(LAYOUT$w, OFFSET$w, value);}
    public java.lang.foreign.MemorySegment w_ptr() {return this._ptr.asSlice(OFFSET$w, LAYOUT$w);}

    public float h() {return this._ptr.get(LAYOUT$h, OFFSET$h);}
    public void h(float value) {this._ptr.set(LAYOUT$h, OFFSET$h, value);}
    public java.lang.foreign.MemorySegment h_ptr() {return this._ptr.asSlice(OFFSET$h, LAYOUT$h);}

    public nuklear.nk_scroll offset() {return new nuklear.nk_scroll(this._ptr.asSlice(OFFSET$offset, LAYOUT$offset));}
    public void offset(java.util.function.Consumer<nuklear.nk_scroll> consumer) {consumer.accept(this.offset());}
    public void offset(nuklear.nk_scroll value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$offset, LAYOUT$offset.byteSize());}
}
