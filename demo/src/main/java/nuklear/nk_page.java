package nuklear;

public record nk_page(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__size = java.lang.foreign.ValueLayout.JAVA_INT.withName("size");
    public static final long OFFSET__size = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__next = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("next");
    public static final long OFFSET__next = 8;
    public static final java.lang.foreign.SequenceLayout LAYOUT__win = java.lang.foreign.MemoryLayout.sequenceLayout(1, nuklear.nk_page_element.gRecordLayout).withName("win");
    public static final long OFFSET__win = 16;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__size,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__next,
            LAYOUT__win
    ).withByteAlignment(8).withName("nk_page");

    public nk_page(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static nk_page getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new nk_page(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, nk_page value)
    {
        java.lang.foreign.MemorySegment.copy(value._ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int size() {return this._ptr.get(LAYOUT__size, OFFSET__size);}
    public void size(int value) {this._ptr.set(LAYOUT__size, OFFSET__size, value);}
    public java.lang.foreign.MemorySegment $size() {return this._ptr.asSlice(OFFSET__size, LAYOUT__size);}

    public java.lang.foreign.MemorySegment next() {return this._ptr.get(LAYOUT__next, OFFSET__next);}
    public void next(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT__next, OFFSET__next, value);}
    public java.lang.foreign.MemorySegment $next() {return this._ptr.asSlice(OFFSET__next, LAYOUT__next);}

    public java.lang.foreign.MemorySegment win() {return this._ptr.asSlice(OFFSET__win, LAYOUT__win);}
    public nuklear.nk_page_element win(int index) {return nuklear.nk_page_element.getAtIndex(this.win(), index);}
    public void win(int index, java.util.function.Consumer<nuklear.nk_page_element> consumer) {consumer.accept(this.win(index));}
    public void win(int index, nuklear.nk_page_element value) {nuklear.nk_page_element.setAtIndex(this.win(), index, value);}
}
