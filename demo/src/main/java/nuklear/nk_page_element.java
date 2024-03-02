package nuklear;

public record nk_page_element(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.GroupLayout LAYOUT$data = nuklear.nk_page_data.gStructLayout;
    public static final long OFFSET$data = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$next = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$next = 504L;
    public static final java.lang.foreign.AddressLayout LAYOUT$prev = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$prev = 512L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$data,
            LAYOUT$next,
            LAYOUT$prev
    ).withName("nk_page_element");

    public nk_page_element(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static nk_page_element getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new nk_page_element(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public nuklear.nk_page_data data() {return new nuklear.nk_page_data(this._ptr.asSlice(OFFSET$data, LAYOUT$data));}
    public void data(java.util.function.Consumer<nuklear.nk_page_data> consumer) {consumer.accept(this.data());}
    public void data(nuklear.nk_page_data value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$data, LAYOUT$data.byteSize());}

    public java.lang.foreign.MemorySegment next() {return this._ptr.get(LAYOUT$next, OFFSET$next);}
    public void next(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT$next, OFFSET$next, value);}
    public java.lang.foreign.MemorySegment next_ptr() {return this._ptr.asSlice(OFFSET$next, LAYOUT$next);}

    public java.lang.foreign.MemorySegment prev() {return this._ptr.get(LAYOUT$prev, OFFSET$prev);}
    public void prev(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT$prev, OFFSET$prev, value);}
    public java.lang.foreign.MemorySegment prev_ptr() {return this._ptr.asSlice(OFFSET$prev, LAYOUT$prev);}
}
