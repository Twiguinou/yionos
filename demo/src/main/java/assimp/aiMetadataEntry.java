package assimp;

public record aiMetadataEntry(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__mType = java.lang.foreign.ValueLayout.JAVA_INT.withName("mType");
    public static final long OFFSET__mType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__mData = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("mData");
    public static final long OFFSET__mData = 8;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__mType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__mData
    ).withByteAlignment(8).withName("aiMetadataEntry");

    public aiMetadataEntry(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static aiMetadataEntry getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new aiMetadataEntry(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, aiMetadataEntry value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int mType() {return this.ptr.get(LAYOUT__mType, OFFSET__mType);}
    public void mType(int value) {this.ptr.set(LAYOUT__mType, OFFSET__mType, value);}
    public java.lang.foreign.MemorySegment $mType() {return this.ptr.asSlice(OFFSET__mType, LAYOUT__mType);}

    public java.lang.foreign.MemorySegment mData() {return this.ptr.get(LAYOUT__mData, OFFSET__mData);}
    public void mData(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__mData, OFFSET__mData, value);}
    public java.lang.foreign.MemorySegment $mData() {return this.ptr.asSlice(OFFSET__mData, LAYOUT__mData);}
}
