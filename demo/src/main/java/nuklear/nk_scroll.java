package nuklear;

public record nk_scroll(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$x = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$x = 0L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$y = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$y = 4L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$x,
            LAYOUT$y
    ).withName("nk_scroll");

    public nk_scroll(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static nk_scroll getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new nk_scroll(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int x() {return this._ptr.get(LAYOUT$x, OFFSET$x);}
    public void x(int value) {this._ptr.set(LAYOUT$x, OFFSET$x, value);}
    public java.lang.foreign.MemorySegment x_ptr() {return this._ptr.asSlice(OFFSET$x, LAYOUT$x);}

    public int y() {return this._ptr.get(LAYOUT$y, OFFSET$y);}
    public void y(int value) {this._ptr.set(LAYOUT$y, OFFSET$y, value);}
    public java.lang.foreign.MemorySegment y_ptr() {return this._ptr.asSlice(OFFSET$y, LAYOUT$y);}
}
