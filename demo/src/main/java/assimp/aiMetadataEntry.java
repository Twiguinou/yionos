package assimp;

public record aiMetadataEntry(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$mType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$mType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$mData = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$mData = 8L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$mType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$mData
    ).withName("aiMetadataEntry");

    public aiMetadataEntry(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static aiMetadataEntry getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new aiMetadataEntry(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int mType() {return this.ptr.get(LAYOUT$mType, OFFSET$mType);}
    public void mType(int value) {this.ptr.set(LAYOUT$mType, OFFSET$mType, value);}
    public java.lang.foreign.MemorySegment mType_ptr() {return this.ptr.asSlice(OFFSET$mType, LAYOUT$mType);}

    public java.lang.foreign.MemorySegment mData() {return this.ptr.get(LAYOUT$mData, OFFSET$mData);}
    public void mData(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$mData, OFFSET$mData, value);}
    public java.lang.foreign.MemorySegment mData_ptr() {return this.ptr.asSlice(OFFSET$mData, LAYOUT$mData);}
}
