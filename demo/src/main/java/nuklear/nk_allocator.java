package nuklear;

public record nk_allocator(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.UnionLayout LAYOUT__userdata = nuklear.nk_handle.gRecordLayout;
    public static final long OFFSET__userdata = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__alloc = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__alloc = 8;
    public static final java.lang.foreign.AddressLayout LAYOUT__free = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__free = 16;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__userdata,
            LAYOUT__alloc,
            LAYOUT__free
    ).withByteAlignment(8).withName("nk_allocator");

    public nk_allocator(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static nk_allocator getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new nk_allocator(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, nk_allocator value)
    {
        java.lang.foreign.MemorySegment.copy(value._ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public nuklear.nk_handle userdata() {return new nuklear.nk_handle(this._ptr.asSlice(OFFSET__userdata, LAYOUT__userdata));}
    public void userdata(java.util.function.Consumer<nuklear.nk_handle> consumer) {consumer.accept(this.userdata());}
    public void userdata(nuklear.nk_handle value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__userdata, LAYOUT__userdata.byteSize());}

    public java.lang.foreign.MemorySegment alloc() {return this._ptr.get(LAYOUT__alloc, OFFSET__alloc);}
    public void alloc(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT__alloc, OFFSET__alloc, value);}
    public java.lang.foreign.MemorySegment $alloc() {return this._ptr.asSlice(OFFSET__alloc, LAYOUT__alloc);}

    public java.lang.foreign.MemorySegment free() {return this._ptr.get(LAYOUT__free, OFFSET__free);}
    public void free(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT__free, OFFSET__free, value);}
    public java.lang.foreign.MemorySegment $free() {return this._ptr.asSlice(OFFSET__free, LAYOUT__free);}
}
