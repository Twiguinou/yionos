package nuklear;

public record nk_handle(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.AddressLayout LAYOUT$ptr = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$ptr = 0L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$id = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$id = 0L;

    public static final java.lang.foreign.UnionLayout gStructLayout = java.lang.foreign.MemoryLayout.unionLayout(
            LAYOUT$ptr,
            LAYOUT$id
    ).withName("nk_handle");

    public nk_handle(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static nk_handle getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new nk_handle(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public java.lang.foreign.MemorySegment ptr() {return this._ptr.get(LAYOUT$ptr, OFFSET$ptr);}
    public void ptr(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT$ptr, OFFSET$ptr, value);}
    public java.lang.foreign.MemorySegment ptr_ptr() {return this._ptr.asSlice(OFFSET$ptr, LAYOUT$ptr);}

    public int id() {return this._ptr.get(LAYOUT$id, OFFSET$id);}
    public void id(int value) {this._ptr.set(LAYOUT$id, OFFSET$id, value);}
    public java.lang.foreign.MemorySegment id_ptr() {return this._ptr.asSlice(OFFSET$id, LAYOUT$id);}
}
