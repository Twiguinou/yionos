package nuklear;

public record nk_page(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$size = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$size = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$next = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$next = 8L;
    public static final java.lang.foreign.SequenceLayout LAYOUT$win = java.lang.foreign.MemoryLayout.sequenceLayout(1, nuklear.nk_page_element.gStructLayout);
    public static final long OFFSET$win = 16L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$size,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$next,
            LAYOUT$win
    ).withName("nk_page");

    public nk_page(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static nk_page getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new nk_page(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int size() {return this._ptr.get(LAYOUT$size, OFFSET$size);}
    public void size(int value) {this._ptr.set(LAYOUT$size, OFFSET$size, value);}
    public java.lang.foreign.MemorySegment size_ptr() {return this._ptr.asSlice(OFFSET$size, LAYOUT$size);}

    public java.lang.foreign.MemorySegment next() {return this._ptr.get(LAYOUT$next, OFFSET$next);}
    public void next(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT$next, OFFSET$next, value);}
    public java.lang.foreign.MemorySegment next_ptr() {return this._ptr.asSlice(OFFSET$next, LAYOUT$next);}

    public java.lang.foreign.MemorySegment win() {return this._ptr.asSlice(OFFSET$win, LAYOUT$win);}
    public nuklear.nk_page_element win(int i) {return new nuklear.nk_page_element(this._ptr.asSlice(OFFSET$win + i * LAYOUT$win.byteSize(), LAYOUT$win));}
    public void win(int i, java.util.function.Consumer<nuklear.nk_page_element> consumer) {consumer.accept(this.win(i));}
    public void win(int i, nuklear.nk_page_element value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$win + i * LAYOUT$win.byteSize(), LAYOUT$win.byteSize());}
}
