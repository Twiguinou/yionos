package nuklear;

public record nk_page_element(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.UnionLayout LAYOUT__data = nuklear.nk_page_data.gRecordLayout.withName("data");
    public static final long OFFSET__data = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__next = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("next");
    public static final long OFFSET__next = 504;
    public static final java.lang.foreign.AddressLayout LAYOUT__prev = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("prev");
    public static final long OFFSET__prev = 512;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__data,
            LAYOUT__next,
            LAYOUT__prev
    ).withByteAlignment(8).withName("nk_page_element");

    public nk_page_element(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static nk_page_element getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new nk_page_element(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, nk_page_element value)
    {
        java.lang.foreign.MemorySegment.copy(value._ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public nuklear.nk_page_data data() {return new nuklear.nk_page_data(this._ptr.asSlice(OFFSET__data, LAYOUT__data));}
    public void data(java.util.function.Consumer<nuklear.nk_page_data> consumer) {consumer.accept(this.data());}
    public void data(nuklear.nk_page_data value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__data, LAYOUT__data.byteSize());}

    public java.lang.foreign.MemorySegment next() {return this._ptr.get(LAYOUT__next, OFFSET__next);}
    public void next(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT__next, OFFSET__next, value);}
    public java.lang.foreign.MemorySegment $next() {return this._ptr.asSlice(OFFSET__next, LAYOUT__next);}

    public java.lang.foreign.MemorySegment prev() {return this._ptr.get(LAYOUT__prev, OFFSET__prev);}
    public void prev(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT__prev, OFFSET__prev, value);}
    public java.lang.foreign.MemorySegment $prev() {return this._ptr.asSlice(OFFSET__prev, LAYOUT__prev);}
}
