package assimp;

public record aiMetadata(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__mNumProperties = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__mNumProperties = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__mKeys = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__mKeys = 8;
    public static final java.lang.foreign.AddressLayout LAYOUT__mValues = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__mValues = 16;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__mNumProperties,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__mKeys,
            LAYOUT__mValues
    ).withByteAlignment(8).withName("aiMetadata");

    public aiMetadata(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static aiMetadata getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new aiMetadata(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, aiMetadata value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int mNumProperties() {return this.ptr.get(LAYOUT__mNumProperties, OFFSET__mNumProperties);}
    public void mNumProperties(int value) {this.ptr.set(LAYOUT__mNumProperties, OFFSET__mNumProperties, value);}
    public java.lang.foreign.MemorySegment $mNumProperties() {return this.ptr.asSlice(OFFSET__mNumProperties, LAYOUT__mNumProperties);}

    public java.lang.foreign.MemorySegment mKeys() {return this.ptr.get(LAYOUT__mKeys, OFFSET__mKeys);}
    public void mKeys(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__mKeys, OFFSET__mKeys, value);}
    public java.lang.foreign.MemorySegment $mKeys() {return this.ptr.asSlice(OFFSET__mKeys, LAYOUT__mKeys);}

    public java.lang.foreign.MemorySegment mValues() {return this.ptr.get(LAYOUT__mValues, OFFSET__mValues);}
    public void mValues(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__mValues, OFFSET__mValues, value);}
    public java.lang.foreign.MemorySegment $mValues() {return this.ptr.asSlice(OFFSET__mValues, LAYOUT__mValues);}
}
