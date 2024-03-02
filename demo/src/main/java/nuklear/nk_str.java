package nuklear;

public record nk_str(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.GroupLayout LAYOUT$buffer = nuklear.nk_buffer.gStructLayout;
    public static final long OFFSET$buffer = 0L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$len = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$len = 120L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$buffer,
            LAYOUT$len,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("nk_str");

    public nk_str(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static nk_str getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new nk_str(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public nuklear.nk_buffer buffer() {return new nuklear.nk_buffer(this._ptr.asSlice(OFFSET$buffer, LAYOUT$buffer));}
    public void buffer(java.util.function.Consumer<nuklear.nk_buffer> consumer) {consumer.accept(this.buffer());}
    public void buffer(nuklear.nk_buffer value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$buffer, LAYOUT$buffer.byteSize());}

    public int len() {return this._ptr.get(LAYOUT$len, OFFSET$len);}
    public void len(int value) {this._ptr.set(LAYOUT$len, OFFSET$len, value);}
    public java.lang.foreign.MemorySegment len_ptr() {return this._ptr.asSlice(OFFSET$len, LAYOUT$len);}
}
