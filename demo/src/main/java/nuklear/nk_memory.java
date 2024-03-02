package nuklear;

public record nk_memory(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.AddressLayout LAYOUT$ptr = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$ptr = 0L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$size = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$size = 8L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$ptr,
            LAYOUT$size
    ).withName("nk_memory");

    public nk_memory(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static nk_memory getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new nk_memory(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public java.lang.foreign.MemorySegment ptr() {return this._ptr.get(LAYOUT$ptr, OFFSET$ptr);}
    public void ptr(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT$ptr, OFFSET$ptr, value);}
    public java.lang.foreign.MemorySegment ptr_ptr() {return this._ptr.asSlice(OFFSET$ptr, LAYOUT$ptr);}

    public long size() {return this._ptr.get(LAYOUT$size, OFFSET$size);}
    public void size(long value) {this._ptr.set(LAYOUT$size, OFFSET$size, value);}
    public java.lang.foreign.MemorySegment size_ptr() {return this._ptr.asSlice(OFFSET$size, LAYOUT$size);}
}
