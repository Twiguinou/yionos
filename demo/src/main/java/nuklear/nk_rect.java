package nuklear;

public record nk_rect(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$x = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$x = 0L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$y = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$y = 4L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$w = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$w = 8L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$h = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$h = 12L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$x,
            LAYOUT$y,
            LAYOUT$w,
            LAYOUT$h
    ).withName("nk_rect");

    public nk_rect(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static nk_rect getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new nk_rect(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
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
}
