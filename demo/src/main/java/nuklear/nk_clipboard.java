package nuklear;

public record nk_clipboard(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.GroupLayout LAYOUT$userdata = nuklear.nk_handle.gStructLayout;
    public static final long OFFSET$userdata = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$paste = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$paste = 8L;
    public static final java.lang.foreign.AddressLayout LAYOUT$copy = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$copy = 16L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$userdata,
            LAYOUT$paste,
            LAYOUT$copy
    ).withName("nk_clipboard");

    public nk_clipboard(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static nk_clipboard getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new nk_clipboard(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public nuklear.nk_handle userdata() {return new nuklear.nk_handle(this._ptr.asSlice(OFFSET$userdata, LAYOUT$userdata));}
    public void userdata(java.util.function.Consumer<nuklear.nk_handle> consumer) {consumer.accept(this.userdata());}
    public void userdata(nuklear.nk_handle value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$userdata, LAYOUT$userdata.byteSize());}

    public java.lang.foreign.MemorySegment paste() {return this._ptr.get(LAYOUT$paste, OFFSET$paste);}
    public void paste(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT$paste, OFFSET$paste, value);}
    public java.lang.foreign.MemorySegment paste_ptr() {return this._ptr.asSlice(OFFSET$paste, LAYOUT$paste);}

    public java.lang.foreign.MemorySegment copy() {return this._ptr.get(LAYOUT$copy, OFFSET$copy);}
    public void copy(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT$copy, OFFSET$copy, value);}
    public java.lang.foreign.MemorySegment copy_ptr() {return this._ptr.asSlice(OFFSET$copy, LAYOUT$copy);}
}
