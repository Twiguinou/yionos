package nuklear;

public record nk_command(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$type = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$type = 0L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$next = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$next = 8L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$type,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$next
    ).withName("nk_command");

    public nk_command(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static nk_command getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new nk_command(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int type() {return this._ptr.get(LAYOUT$type, OFFSET$type);}
    public void type(int value) {this._ptr.set(LAYOUT$type, OFFSET$type, value);}
    public java.lang.foreign.MemorySegment type_ptr() {return this._ptr.asSlice(OFFSET$type, LAYOUT$type);}

    public long next() {return this._ptr.get(LAYOUT$next, OFFSET$next);}
    public void next(long value) {this._ptr.set(LAYOUT$next, OFFSET$next, value);}
    public java.lang.foreign.MemorySegment next_ptr() {return this._ptr.asSlice(OFFSET$next, LAYOUT$next);}
}
