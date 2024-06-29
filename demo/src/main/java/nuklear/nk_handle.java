package nuklear;

public record nk_handle(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.AddressLayout LAYOUT__ptr = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__id = java.lang.foreign.ValueLayout.JAVA_INT;

    public static final java.lang.foreign.UnionLayout gRecordLayout = java.lang.foreign.MemoryLayout.unionLayout(
            LAYOUT__ptr,
            LAYOUT__id
    ).withByteAlignment(8).withName("nk_handle");

    public nk_handle(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static nk_handle getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new nk_handle(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, nk_handle value)
    {
        java.lang.foreign.MemorySegment.copy(value._ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public java.lang.foreign.MemorySegment ptr() {return this._ptr.get(LAYOUT__ptr, 0);}
    public void ptr(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT__ptr, 0, value);}
    public java.lang.foreign.MemorySegment $ptr() {return this._ptr.asSlice(0, LAYOUT__ptr);}

    public int id() {return this._ptr.get(LAYOUT__id, 0);}
    public void id(int value) {this._ptr.set(LAYOUT__id, 0, value);}
    public java.lang.foreign.MemorySegment $id() {return this._ptr.asSlice(0, LAYOUT__id);}
}
