package nuklear;

public record nk_clipboard(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.UnionLayout LAYOUT__userdata = nuklear.nk_handle.gRecordLayout.withName("userdata");
    public static final long OFFSET__userdata = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__paste = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("paste");
    public static final long OFFSET__paste = 8;
    public static final java.lang.foreign.AddressLayout LAYOUT__copy = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("copy");
    public static final long OFFSET__copy = 16;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__userdata,
            LAYOUT__paste,
            LAYOUT__copy
    ).withByteAlignment(8).withName("nk_clipboard");

    public nk_clipboard(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static nk_clipboard getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new nk_clipboard(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, nk_clipboard value)
    {
        java.lang.foreign.MemorySegment.copy(value._ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public nuklear.nk_handle userdata() {return new nuklear.nk_handle(this._ptr.asSlice(OFFSET__userdata, LAYOUT__userdata));}
    public void userdata(java.util.function.Consumer<nuklear.nk_handle> consumer) {consumer.accept(this.userdata());}
    public void userdata(nuklear.nk_handle value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__userdata, LAYOUT__userdata.byteSize());}

    public java.lang.foreign.MemorySegment paste() {return this._ptr.get(LAYOUT__paste, OFFSET__paste);}
    public void paste(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT__paste, OFFSET__paste, value);}
    public java.lang.foreign.MemorySegment $paste() {return this._ptr.asSlice(OFFSET__paste, LAYOUT__paste);}

    public java.lang.foreign.MemorySegment copy() {return this._ptr.get(LAYOUT__copy, OFFSET__copy);}
    public void copy(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT__copy, OFFSET__copy, value);}
    public java.lang.foreign.MemorySegment $copy() {return this._ptr.asSlice(OFFSET__copy, LAYOUT__copy);}
}
