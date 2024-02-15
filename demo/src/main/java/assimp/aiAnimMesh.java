package assimp;

public record aiAnimMesh(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.GroupLayout LAYOUT$mName = assimp.aiString.gStructLayout;
    public static final long OFFSET$mName = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$mVertices = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$mVertices = 1032L;
    public static final java.lang.foreign.AddressLayout LAYOUT$mNormals = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$mNormals = 1040L;
    public static final java.lang.foreign.AddressLayout LAYOUT$mTangents = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$mTangents = 1048L;
    public static final java.lang.foreign.AddressLayout LAYOUT$mBitangents = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$mBitangents = 1056L;
    public static final java.lang.foreign.SequenceLayout LAYOUT$mColors = java.lang.foreign.MemoryLayout.sequenceLayout(8, java.lang.foreign.ValueLayout.ADDRESS);
    public static final long OFFSET$mColors = 1064L;
    public static final java.lang.foreign.SequenceLayout LAYOUT$mTextureCoords = java.lang.foreign.MemoryLayout.sequenceLayout(8, java.lang.foreign.ValueLayout.ADDRESS);
    public static final long OFFSET$mTextureCoords = 1128L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$mNumVertices = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$mNumVertices = 1192L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$mWeight = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$mWeight = 1196L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$mName,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$mVertices,
            LAYOUT$mNormals,
            LAYOUT$mTangents,
            LAYOUT$mBitangents,
            LAYOUT$mColors,
            LAYOUT$mTextureCoords,
            LAYOUT$mNumVertices,
            LAYOUT$mWeight
    ).withName("aiAnimMesh");

    public aiAnimMesh(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static aiAnimMesh getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new aiAnimMesh(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public assimp.aiString mName() {return new assimp.aiString(this.ptr.asSlice(OFFSET$mName, LAYOUT$mName));}
    public void mName(java.util.function.Consumer<assimp.aiString> consumer) {consumer.accept(this.mName());}
    public void mName(assimp.aiString value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$mName, LAYOUT$mName.byteSize());}

    public java.lang.foreign.MemorySegment mVertices() {return this.ptr.get(LAYOUT$mVertices, OFFSET$mVertices);}
    public void mVertices(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$mVertices, OFFSET$mVertices, value);}
    public java.lang.foreign.MemorySegment mVertices_ptr() {return this.ptr.asSlice(OFFSET$mVertices, LAYOUT$mVertices);}

    public java.lang.foreign.MemorySegment mNormals() {return this.ptr.get(LAYOUT$mNormals, OFFSET$mNormals);}
    public void mNormals(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$mNormals, OFFSET$mNormals, value);}
    public java.lang.foreign.MemorySegment mNormals_ptr() {return this.ptr.asSlice(OFFSET$mNormals, LAYOUT$mNormals);}

    public java.lang.foreign.MemorySegment mTangents() {return this.ptr.get(LAYOUT$mTangents, OFFSET$mTangents);}
    public void mTangents(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$mTangents, OFFSET$mTangents, value);}
    public java.lang.foreign.MemorySegment mTangents_ptr() {return this.ptr.asSlice(OFFSET$mTangents, LAYOUT$mTangents);}

    public java.lang.foreign.MemorySegment mBitangents() {return this.ptr.get(LAYOUT$mBitangents, OFFSET$mBitangents);}
    public void mBitangents(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$mBitangents, OFFSET$mBitangents, value);}
    public java.lang.foreign.MemorySegment mBitangents_ptr() {return this.ptr.asSlice(OFFSET$mBitangents, LAYOUT$mBitangents);}

    public java.lang.foreign.MemorySegment mColors() {return this.ptr.asSlice(OFFSET$mColors, LAYOUT$mColors);}
    public java.lang.foreign.MemorySegment mColors(int i) {return this.mColors().getAtIndex(java.lang.foreign.ValueLayout.ADDRESS, i);}
    public void mColors(int i, java.lang.foreign.MemorySegment value) {this.mColors().setAtIndex(java.lang.foreign.ValueLayout.ADDRESS, i, value);}

    public java.lang.foreign.MemorySegment mTextureCoords() {return this.ptr.asSlice(OFFSET$mTextureCoords, LAYOUT$mTextureCoords);}
    public java.lang.foreign.MemorySegment mTextureCoords(int i) {return this.mTextureCoords().getAtIndex(java.lang.foreign.ValueLayout.ADDRESS, i);}
    public void mTextureCoords(int i, java.lang.foreign.MemorySegment value) {this.mTextureCoords().setAtIndex(java.lang.foreign.ValueLayout.ADDRESS, i, value);}

    public int mNumVertices() {return this.ptr.get(LAYOUT$mNumVertices, OFFSET$mNumVertices);}
    public void mNumVertices(int value) {this.ptr.set(LAYOUT$mNumVertices, OFFSET$mNumVertices, value);}
    public java.lang.foreign.MemorySegment mNumVertices_ptr() {return this.ptr.asSlice(OFFSET$mNumVertices, LAYOUT$mNumVertices);}

    public float mWeight() {return this.ptr.get(LAYOUT$mWeight, OFFSET$mWeight);}
    public void mWeight(float value) {this.ptr.set(LAYOUT$mWeight, OFFSET$mWeight, value);}
    public java.lang.foreign.MemorySegment mWeight_ptr() {return this.ptr.asSlice(OFFSET$mWeight, LAYOUT$mWeight);}
}
