package nuklear;

public record nk_allocator(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.GroupLayout LAYOUT$userdata = nuklear.nk_handle.gStructLayout;
    public static final long OFFSET$userdata = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$alloc = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$alloc = 8L;
    public static final java.lang.foreign.AddressLayout LAYOUT$free = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$free = 16L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$userdata,
            LAYOUT$alloc,
            LAYOUT$free
    ).withName("nk_allocator");

    public nk_allocator(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static nk_allocator getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new nk_allocator(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public nuklear.nk_handle userdata() {return new nuklear.nk_handle(this._ptr.asSlice(OFFSET$userdata, LAYOUT$userdata));}
    public void userdata(java.util.function.Consumer<nuklear.nk_handle> consumer) {consumer.accept(this.userdata());}
    public void userdata(nuklear.nk_handle value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$userdata, LAYOUT$userdata.byteSize());}

    public java.lang.foreign.MemorySegment alloc() {return this._ptr.get(LAYOUT$alloc, OFFSET$alloc);}
    public void alloc(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT$alloc, OFFSET$alloc, value);}
    public java.lang.foreign.MemorySegment alloc_ptr() {return this._ptr.asSlice(OFFSET$alloc, LAYOUT$alloc);}

    public java.lang.foreign.MemorySegment free() {return this._ptr.get(LAYOUT$free, OFFSET$free);}
    public void free(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT$free, OFFSET$free, value);}
    public java.lang.foreign.MemorySegment free_ptr() {return this._ptr.asSlice(OFFSET$free, LAYOUT$free);}
}
