package assimp;

public record aiFace(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$mNumIndices = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$mNumIndices = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$mIndices = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$mIndices = 8L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$mNumIndices,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$mIndices
    ).withName("aiFace");

    public aiFace(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static aiFace getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new aiFace(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int mNumIndices() {return this.ptr.get(LAYOUT$mNumIndices, OFFSET$mNumIndices);}
    public void mNumIndices(int value) {this.ptr.set(LAYOUT$mNumIndices, OFFSET$mNumIndices, value);}
    public java.lang.foreign.MemorySegment mNumIndices_ptr() {return this.ptr.asSlice(OFFSET$mNumIndices, LAYOUT$mNumIndices);}

    public java.lang.foreign.MemorySegment mIndices() {return this.ptr.get(LAYOUT$mIndices, OFFSET$mIndices);}
    public void mIndices(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$mIndices, OFFSET$mIndices, value);}
    public java.lang.foreign.MemorySegment mIndices_ptr() {return this.ptr.asSlice(OFFSET$mIndices, LAYOUT$mIndices);}
}
