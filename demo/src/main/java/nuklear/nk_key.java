package nuklear;

public record nk_key(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$down = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$down = 0L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$clicked = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$clicked = 4L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$down,
            LAYOUT$clicked
    ).withName("nk_key");

    public nk_key(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static nk_key getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new nk_key(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int down() {return this._ptr.get(LAYOUT$down, OFFSET$down);}
    public void down(int value) {this._ptr.set(LAYOUT$down, OFFSET$down, value);}
    public java.lang.foreign.MemorySegment down_ptr() {return this._ptr.asSlice(OFFSET$down, LAYOUT$down);}

    public int clicked() {return this._ptr.get(LAYOUT$clicked, OFFSET$clicked);}
    public void clicked(int value) {this._ptr.set(LAYOUT$clicked, OFFSET$clicked, value);}
    public java.lang.foreign.MemorySegment clicked_ptr() {return this._ptr.asSlice(OFFSET$clicked, LAYOUT$clicked);}
}
