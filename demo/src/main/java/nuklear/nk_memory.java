package nuklear;

public record nk_memory(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.AddressLayout LAYOUT__ptr = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__ptr = 0;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__size = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__size = 8;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__ptr,
            LAYOUT__size
    ).withByteAlignment(8).withName("nk_memory");

    public nk_memory(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static nk_memory getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new nk_memory(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, nk_memory value)
    {
        java.lang.foreign.MemorySegment.copy(value._ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public java.lang.foreign.MemorySegment ptr() {return this._ptr.get(LAYOUT__ptr, OFFSET__ptr);}
    public void ptr(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT__ptr, OFFSET__ptr, value);}
    public java.lang.foreign.MemorySegment $ptr() {return this._ptr.asSlice(OFFSET__ptr, LAYOUT__ptr);}

    public long size() {return this._ptr.get(LAYOUT__size, OFFSET__size);}
    public void size(long value) {this._ptr.set(LAYOUT__size, OFFSET__size, value);}
    public java.lang.foreign.MemorySegment $size() {return this._ptr.asSlice(OFFSET__size, LAYOUT__size);}
}
