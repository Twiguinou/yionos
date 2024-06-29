package assimp;

public record aiMaterialProperty(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT__mKey = assimp.aiString.gRecordLayout;
    public static final long OFFSET__mKey = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__mSemantic = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__mSemantic = 1028;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__mIndex = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__mIndex = 1032;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__mDataLength = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__mDataLength = 1036;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__mType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__mType = 1040;
    public static final java.lang.foreign.AddressLayout LAYOUT__mData = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__mData = 1048;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__mKey,
            LAYOUT__mSemantic,
            LAYOUT__mIndex,
            LAYOUT__mDataLength,
            LAYOUT__mType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__mData
    ).withByteAlignment(8).withName("aiMaterialProperty");

    public aiMaterialProperty(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static aiMaterialProperty getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new aiMaterialProperty(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, aiMaterialProperty value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public assimp.aiString mKey() {return new assimp.aiString(this.ptr.asSlice(OFFSET__mKey, LAYOUT__mKey));}
    public void mKey(java.util.function.Consumer<assimp.aiString> consumer) {consumer.accept(this.mKey());}
    public void mKey(assimp.aiString value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__mKey, LAYOUT__mKey.byteSize());}

    public int mSemantic() {return this.ptr.get(LAYOUT__mSemantic, OFFSET__mSemantic);}
    public void mSemantic(int value) {this.ptr.set(LAYOUT__mSemantic, OFFSET__mSemantic, value);}
    public java.lang.foreign.MemorySegment $mSemantic() {return this.ptr.asSlice(OFFSET__mSemantic, LAYOUT__mSemantic);}

    public int mIndex() {return this.ptr.get(LAYOUT__mIndex, OFFSET__mIndex);}
    public void mIndex(int value) {this.ptr.set(LAYOUT__mIndex, OFFSET__mIndex, value);}
    public java.lang.foreign.MemorySegment $mIndex() {return this.ptr.asSlice(OFFSET__mIndex, LAYOUT__mIndex);}

    public int mDataLength() {return this.ptr.get(LAYOUT__mDataLength, OFFSET__mDataLength);}
    public void mDataLength(int value) {this.ptr.set(LAYOUT__mDataLength, OFFSET__mDataLength, value);}
    public java.lang.foreign.MemorySegment $mDataLength() {return this.ptr.asSlice(OFFSET__mDataLength, LAYOUT__mDataLength);}

    public int mType() {return this.ptr.get(LAYOUT__mType, OFFSET__mType);}
    public void mType(int value) {this.ptr.set(LAYOUT__mType, OFFSET__mType, value);}
    public java.lang.foreign.MemorySegment $mType() {return this.ptr.asSlice(OFFSET__mType, LAYOUT__mType);}

    public java.lang.foreign.MemorySegment mData() {return this.ptr.get(LAYOUT__mData, OFFSET__mData);}
    public void mData(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__mData, OFFSET__mData, value);}
    public java.lang.foreign.MemorySegment $mData() {return this.ptr.asSlice(OFFSET__mData, LAYOUT__mData);}
}
