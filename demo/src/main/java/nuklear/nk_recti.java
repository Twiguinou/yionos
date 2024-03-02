package nuklear;

public record nk_recti(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT$x = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET$x = 0L;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT$y = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET$y = 2L;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT$w = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET$w = 4L;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT$h = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET$h = 6L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$x,
            LAYOUT$y,
            LAYOUT$w,
            LAYOUT$h
    ).withName("nk_recti");

    public nk_recti(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static nk_recti getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new nk_recti(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public short x() {return this._ptr.get(LAYOUT$x, OFFSET$x);}
    public void x(short value) {this._ptr.set(LAYOUT$x, OFFSET$x, value);}
    public java.lang.foreign.MemorySegment x_ptr() {return this._ptr.asSlice(OFFSET$x, LAYOUT$x);}

    public short y() {return this._ptr.get(LAYOUT$y, OFFSET$y);}
    public void y(short value) {this._ptr.set(LAYOUT$y, OFFSET$y, value);}
    public java.lang.foreign.MemorySegment y_ptr() {return this._ptr.asSlice(OFFSET$y, LAYOUT$y);}

    public short w() {return this._ptr.get(LAYOUT$w, OFFSET$w);}
    public void w(short value) {this._ptr.set(LAYOUT$w, OFFSET$w, value);}
    public java.lang.foreign.MemorySegment w_ptr() {return this._ptr.asSlice(OFFSET$w, LAYOUT$w);}

    public short h() {return this._ptr.get(LAYOUT$h, OFFSET$h);}
    public void h(short value) {this._ptr.set(LAYOUT$h, OFFSET$h, value);}
    public java.lang.foreign.MemorySegment h_ptr() {return this._ptr.asSlice(OFFSET$h, LAYOUT$h);}
}
