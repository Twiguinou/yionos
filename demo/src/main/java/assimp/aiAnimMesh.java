package assimp;

public record aiAnimMesh(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT__mName = assimp.aiString.gRecordLayout.withName("mName");
    public static final long OFFSET__mName = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__mVertices = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("mVertices");
    public static final long OFFSET__mVertices = 1032;
    public static final java.lang.foreign.AddressLayout LAYOUT__mNormals = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("mNormals");
    public static final long OFFSET__mNormals = 1040;
    public static final java.lang.foreign.AddressLayout LAYOUT__mTangents = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("mTangents");
    public static final long OFFSET__mTangents = 1048;
    public static final java.lang.foreign.AddressLayout LAYOUT__mBitangents = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("mBitangents");
    public static final long OFFSET__mBitangents = 1056;
    public static final java.lang.foreign.SequenceLayout LAYOUT__mColors = java.lang.foreign.MemoryLayout.sequenceLayout(8, jpgen.NativeTypes.UNBOUNDED_POINTER).withName("mColors");
    public static final long OFFSET__mColors = 1064;
    public static final java.lang.foreign.SequenceLayout LAYOUT__mTextureCoords = java.lang.foreign.MemoryLayout.sequenceLayout(8, jpgen.NativeTypes.UNBOUNDED_POINTER).withName("mTextureCoords");
    public static final long OFFSET__mTextureCoords = 1128;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__mNumVertices = java.lang.foreign.ValueLayout.JAVA_INT.withName("mNumVertices");
    public static final long OFFSET__mNumVertices = 1192;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__mWeight = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("mWeight");
    public static final long OFFSET__mWeight = 1196;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__mName,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__mVertices,
            LAYOUT__mNormals,
            LAYOUT__mTangents,
            LAYOUT__mBitangents,
            LAYOUT__mColors,
            LAYOUT__mTextureCoords,
            LAYOUT__mNumVertices,
            LAYOUT__mWeight
    ).withByteAlignment(8).withName("aiAnimMesh");

    public aiAnimMesh(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static aiAnimMesh getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new aiAnimMesh(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, aiAnimMesh value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public assimp.aiString mName() {return new assimp.aiString(this.ptr.asSlice(OFFSET__mName, LAYOUT__mName));}
    public void mName(java.util.function.Consumer<assimp.aiString> consumer) {consumer.accept(this.mName());}
    public void mName(assimp.aiString value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__mName, LAYOUT__mName.byteSize());}

    public java.lang.foreign.MemorySegment mVertices() {return this.ptr.get(LAYOUT__mVertices, OFFSET__mVertices);}
    public void mVertices(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__mVertices, OFFSET__mVertices, value);}
    public java.lang.foreign.MemorySegment $mVertices() {return this.ptr.asSlice(OFFSET__mVertices, LAYOUT__mVertices);}

    public java.lang.foreign.MemorySegment mNormals() {return this.ptr.get(LAYOUT__mNormals, OFFSET__mNormals);}
    public void mNormals(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__mNormals, OFFSET__mNormals, value);}
    public java.lang.foreign.MemorySegment $mNormals() {return this.ptr.asSlice(OFFSET__mNormals, LAYOUT__mNormals);}

    public java.lang.foreign.MemorySegment mTangents() {return this.ptr.get(LAYOUT__mTangents, OFFSET__mTangents);}
    public void mTangents(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__mTangents, OFFSET__mTangents, value);}
    public java.lang.foreign.MemorySegment $mTangents() {return this.ptr.asSlice(OFFSET__mTangents, LAYOUT__mTangents);}

    public java.lang.foreign.MemorySegment mBitangents() {return this.ptr.get(LAYOUT__mBitangents, OFFSET__mBitangents);}
    public void mBitangents(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__mBitangents, OFFSET__mBitangents, value);}
    public java.lang.foreign.MemorySegment $mBitangents() {return this.ptr.asSlice(OFFSET__mBitangents, LAYOUT__mBitangents);}

    public java.lang.foreign.MemorySegment mColors() {return this.ptr.asSlice(OFFSET__mColors, LAYOUT__mColors);}
    public java.lang.foreign.MemorySegment mColors(int index) {return this.mColors().getAtIndex(jpgen.NativeTypes.UNBOUNDED_POINTER, index);}
    public void mColors(int index, java.lang.foreign.MemorySegment value) {this.mColors().setAtIndex(jpgen.NativeTypes.UNBOUNDED_POINTER, index, value);}

    public java.lang.foreign.MemorySegment mTextureCoords() {return this.ptr.asSlice(OFFSET__mTextureCoords, LAYOUT__mTextureCoords);}
    public java.lang.foreign.MemorySegment mTextureCoords(int index) {return this.mTextureCoords().getAtIndex(jpgen.NativeTypes.UNBOUNDED_POINTER, index);}
    public void mTextureCoords(int index, java.lang.foreign.MemorySegment value) {this.mTextureCoords().setAtIndex(jpgen.NativeTypes.UNBOUNDED_POINTER, index, value);}

    public int mNumVertices() {return this.ptr.get(LAYOUT__mNumVertices, OFFSET__mNumVertices);}
    public void mNumVertices(int value) {this.ptr.set(LAYOUT__mNumVertices, OFFSET__mNumVertices, value);}
    public java.lang.foreign.MemorySegment $mNumVertices() {return this.ptr.asSlice(OFFSET__mNumVertices, LAYOUT__mNumVertices);}

    public float mWeight() {return this.ptr.get(LAYOUT__mWeight, OFFSET__mWeight);}
    public void mWeight(float value) {this.ptr.set(LAYOUT__mWeight, OFFSET__mWeight, value);}
    public java.lang.foreign.MemorySegment $mWeight() {return this.ptr.asSlice(OFFSET__mWeight, LAYOUT__mWeight);}
}
