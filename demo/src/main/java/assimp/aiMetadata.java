package assimp;

public record aiMetadata(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$mNumProperties = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$mNumProperties = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$mKeys = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$mKeys = 8L;
    public static final java.lang.foreign.AddressLayout LAYOUT$mValues = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$mValues = 16L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$mNumProperties,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$mKeys,
            LAYOUT$mValues
    ).withName("aiMetadata");

    public aiMetadata(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static aiMetadata getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new aiMetadata(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int mNumProperties() {return this.ptr.get(LAYOUT$mNumProperties, OFFSET$mNumProperties);}
    public void mNumProperties(int value) {this.ptr.set(LAYOUT$mNumProperties, OFFSET$mNumProperties, value);}
    public java.lang.foreign.MemorySegment mNumProperties_ptr() {return this.ptr.asSlice(OFFSET$mNumProperties, LAYOUT$mNumProperties);}

    public java.lang.foreign.MemorySegment mKeys() {return this.ptr.get(LAYOUT$mKeys, OFFSET$mKeys);}
    public void mKeys(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$mKeys, OFFSET$mKeys, value);}
    public java.lang.foreign.MemorySegment mKeys_ptr() {return this.ptr.asSlice(OFFSET$mKeys, LAYOUT$mKeys);}

    public java.lang.foreign.MemorySegment mValues() {return this.ptr.get(LAYOUT$mValues, OFFSET$mValues);}
    public void mValues(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$mValues, OFFSET$mValues, value);}
    public java.lang.foreign.MemorySegment mValues_ptr() {return this.ptr.asSlice(OFFSET$mValues, LAYOUT$mValues);}
}
