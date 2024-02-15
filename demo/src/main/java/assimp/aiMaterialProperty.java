package assimp;

public record aiMaterialProperty(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.GroupLayout LAYOUT$mKey = assimp.aiString.gStructLayout;
    public static final long OFFSET$mKey = 0L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$mSemantic = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$mSemantic = 1028L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$mIndex = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$mIndex = 1032L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$mDataLength = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$mDataLength = 1036L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$mType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$mType = 1040L;
    public static final java.lang.foreign.AddressLayout LAYOUT$mData = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$mData = 1048L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$mKey,
            LAYOUT$mSemantic,
            LAYOUT$mIndex,
            LAYOUT$mDataLength,
            LAYOUT$mType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$mData
    ).withName("aiMaterialProperty");

    public aiMaterialProperty(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static aiMaterialProperty getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new aiMaterialProperty(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public assimp.aiString mKey() {return new assimp.aiString(this.ptr.asSlice(OFFSET$mKey, LAYOUT$mKey));}
    public void mKey(java.util.function.Consumer<assimp.aiString> consumer) {consumer.accept(this.mKey());}
    public void mKey(assimp.aiString value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$mKey, LAYOUT$mKey.byteSize());}

    public int mSemantic() {return this.ptr.get(LAYOUT$mSemantic, OFFSET$mSemantic);}
    public void mSemantic(int value) {this.ptr.set(LAYOUT$mSemantic, OFFSET$mSemantic, value);}
    public java.lang.foreign.MemorySegment mSemantic_ptr() {return this.ptr.asSlice(OFFSET$mSemantic, LAYOUT$mSemantic);}

    public int mIndex() {return this.ptr.get(LAYOUT$mIndex, OFFSET$mIndex);}
    public void mIndex(int value) {this.ptr.set(LAYOUT$mIndex, OFFSET$mIndex, value);}
    public java.lang.foreign.MemorySegment mIndex_ptr() {return this.ptr.asSlice(OFFSET$mIndex, LAYOUT$mIndex);}

    public int mDataLength() {return this.ptr.get(LAYOUT$mDataLength, OFFSET$mDataLength);}
    public void mDataLength(int value) {this.ptr.set(LAYOUT$mDataLength, OFFSET$mDataLength, value);}
    public java.lang.foreign.MemorySegment mDataLength_ptr() {return this.ptr.asSlice(OFFSET$mDataLength, LAYOUT$mDataLength);}

    public int mType() {return this.ptr.get(LAYOUT$mType, OFFSET$mType);}
    public void mType(int value) {this.ptr.set(LAYOUT$mType, OFFSET$mType, value);}
    public java.lang.foreign.MemorySegment mType_ptr() {return this.ptr.asSlice(OFFSET$mType, LAYOUT$mType);}

    public java.lang.foreign.MemorySegment mData() {return this.ptr.get(LAYOUT$mData, OFFSET$mData);}
    public void mData(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$mData, OFFSET$mData, value);}
    public java.lang.foreign.MemorySegment mData_ptr() {return this.ptr.asSlice(OFFSET$mData, LAYOUT$mData);}
}
