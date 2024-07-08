package assimp;

public record aiFace(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__mNumIndices = java.lang.foreign.ValueLayout.JAVA_INT.withName("mNumIndices");
    public static final long OFFSET__mNumIndices = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__mIndices = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("mIndices");
    public static final long OFFSET__mIndices = 8;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__mNumIndices,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__mIndices
    ).withByteAlignment(8).withName("aiFace");

    public aiFace(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static aiFace getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new aiFace(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, aiFace value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int mNumIndices() {return this.ptr.get(LAYOUT__mNumIndices, OFFSET__mNumIndices);}
    public void mNumIndices(int value) {this.ptr.set(LAYOUT__mNumIndices, OFFSET__mNumIndices, value);}
    public java.lang.foreign.MemorySegment $mNumIndices() {return this.ptr.asSlice(OFFSET__mNumIndices, LAYOUT__mNumIndices);}

    public java.lang.foreign.MemorySegment mIndices() {return this.ptr.get(LAYOUT__mIndices, OFFSET__mIndices);}
    public void mIndices(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__mIndices, OFFSET__mIndices, value);}
    public java.lang.foreign.MemorySegment $mIndices() {return this.ptr.asSlice(OFFSET__mIndices, LAYOUT__mIndices);}
}
