package assimp;

public record aiMesh(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__mPrimitiveTypes = java.lang.foreign.ValueLayout.JAVA_INT.withName("mPrimitiveTypes");
    public static final long OFFSET__mPrimitiveTypes = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__mNumVertices = java.lang.foreign.ValueLayout.JAVA_INT.withName("mNumVertices");
    public static final long OFFSET__mNumVertices = 4;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__mNumFaces = java.lang.foreign.ValueLayout.JAVA_INT.withName("mNumFaces");
    public static final long OFFSET__mNumFaces = 8;
    public static final java.lang.foreign.AddressLayout LAYOUT__mVertices = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("mVertices");
    public static final long OFFSET__mVertices = 16;
    public static final java.lang.foreign.AddressLayout LAYOUT__mNormals = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("mNormals");
    public static final long OFFSET__mNormals = 24;
    public static final java.lang.foreign.AddressLayout LAYOUT__mTangents = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("mTangents");
    public static final long OFFSET__mTangents = 32;
    public static final java.lang.foreign.AddressLayout LAYOUT__mBitangents = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("mBitangents");
    public static final long OFFSET__mBitangents = 40;
    public static final java.lang.foreign.SequenceLayout LAYOUT__mColors = java.lang.foreign.MemoryLayout.sequenceLayout(8, jpgen.NativeTypes.UNBOUNDED_POINTER).withName("mColors");
    public static final long OFFSET__mColors = 48;
    public static final java.lang.foreign.SequenceLayout LAYOUT__mTextureCoords = java.lang.foreign.MemoryLayout.sequenceLayout(8, jpgen.NativeTypes.UNBOUNDED_POINTER).withName("mTextureCoords");
    public static final long OFFSET__mTextureCoords = 112;
    public static final java.lang.foreign.SequenceLayout LAYOUT__mNumUVComponents = java.lang.foreign.MemoryLayout.sequenceLayout(8, java.lang.foreign.ValueLayout.JAVA_INT).withName("mNumUVComponents");
    public static final long OFFSET__mNumUVComponents = 176;
    public static final java.lang.foreign.AddressLayout LAYOUT__mFaces = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("mFaces");
    public static final long OFFSET__mFaces = 208;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__mNumBones = java.lang.foreign.ValueLayout.JAVA_INT.withName("mNumBones");
    public static final long OFFSET__mNumBones = 216;
    public static final java.lang.foreign.AddressLayout LAYOUT__mBones = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("mBones");
    public static final long OFFSET__mBones = 224;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__mMaterialIndex = java.lang.foreign.ValueLayout.JAVA_INT.withName("mMaterialIndex");
    public static final long OFFSET__mMaterialIndex = 232;
    public static final java.lang.foreign.StructLayout LAYOUT__mName = assimp.aiString.gRecordLayout.withName("mName");
    public static final long OFFSET__mName = 236;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__mNumAnimMeshes = java.lang.foreign.ValueLayout.JAVA_INT.withName("mNumAnimMeshes");
    public static final long OFFSET__mNumAnimMeshes = 1264;
    public static final java.lang.foreign.AddressLayout LAYOUT__mAnimMeshes = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("mAnimMeshes");
    public static final long OFFSET__mAnimMeshes = 1272;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__mMethod = java.lang.foreign.ValueLayout.JAVA_INT.withName("mMethod");
    public static final long OFFSET__mMethod = 1280;
    public static final java.lang.foreign.StructLayout LAYOUT__mAABB = assimp.aiAABB.gRecordLayout.withName("mAABB");
    public static final long OFFSET__mAABB = 1284;
    public static final java.lang.foreign.AddressLayout LAYOUT__mTextureCoordsNames = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("mTextureCoordsNames");
    public static final long OFFSET__mTextureCoordsNames = 1312;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__mPrimitiveTypes,
            LAYOUT__mNumVertices,
            LAYOUT__mNumFaces,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__mVertices,
            LAYOUT__mNormals,
            LAYOUT__mTangents,
            LAYOUT__mBitangents,
            LAYOUT__mColors,
            LAYOUT__mTextureCoords,
            LAYOUT__mNumUVComponents,
            LAYOUT__mFaces,
            LAYOUT__mNumBones,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__mBones,
            LAYOUT__mMaterialIndex,
            LAYOUT__mName,
            LAYOUT__mNumAnimMeshes,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__mAnimMeshes,
            LAYOUT__mMethod,
            LAYOUT__mAABB,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__mTextureCoordsNames
    ).withByteAlignment(8).withName("aiMesh");

    public aiMesh(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static aiMesh getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new aiMesh(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, aiMesh value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int mPrimitiveTypes() {return this.ptr.get(LAYOUT__mPrimitiveTypes, OFFSET__mPrimitiveTypes);}
    public void mPrimitiveTypes(int value) {this.ptr.set(LAYOUT__mPrimitiveTypes, OFFSET__mPrimitiveTypes, value);}
    public java.lang.foreign.MemorySegment $mPrimitiveTypes() {return this.ptr.asSlice(OFFSET__mPrimitiveTypes, LAYOUT__mPrimitiveTypes);}

    public int mNumVertices() {return this.ptr.get(LAYOUT__mNumVertices, OFFSET__mNumVertices);}
    public void mNumVertices(int value) {this.ptr.set(LAYOUT__mNumVertices, OFFSET__mNumVertices, value);}
    public java.lang.foreign.MemorySegment $mNumVertices() {return this.ptr.asSlice(OFFSET__mNumVertices, LAYOUT__mNumVertices);}

    public int mNumFaces() {return this.ptr.get(LAYOUT__mNumFaces, OFFSET__mNumFaces);}
    public void mNumFaces(int value) {this.ptr.set(LAYOUT__mNumFaces, OFFSET__mNumFaces, value);}
    public java.lang.foreign.MemorySegment $mNumFaces() {return this.ptr.asSlice(OFFSET__mNumFaces, LAYOUT__mNumFaces);}

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

    public java.lang.foreign.MemorySegment mNumUVComponents() {return this.ptr.asSlice(OFFSET__mNumUVComponents, LAYOUT__mNumUVComponents);}
    public int mNumUVComponents(int index) {return this.mNumUVComponents().getAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, index);}
    public void mNumUVComponents(int index, int value) {this.mNumUVComponents().setAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, index, value);}

    public java.lang.foreign.MemorySegment mFaces() {return this.ptr.get(LAYOUT__mFaces, OFFSET__mFaces);}
    public void mFaces(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__mFaces, OFFSET__mFaces, value);}
    public java.lang.foreign.MemorySegment $mFaces() {return this.ptr.asSlice(OFFSET__mFaces, LAYOUT__mFaces);}

    public int mNumBones() {return this.ptr.get(LAYOUT__mNumBones, OFFSET__mNumBones);}
    public void mNumBones(int value) {this.ptr.set(LAYOUT__mNumBones, OFFSET__mNumBones, value);}
    public java.lang.foreign.MemorySegment $mNumBones() {return this.ptr.asSlice(OFFSET__mNumBones, LAYOUT__mNumBones);}

    public java.lang.foreign.MemorySegment mBones() {return this.ptr.get(LAYOUT__mBones, OFFSET__mBones);}
    public void mBones(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__mBones, OFFSET__mBones, value);}
    public java.lang.foreign.MemorySegment $mBones() {return this.ptr.asSlice(OFFSET__mBones, LAYOUT__mBones);}

    public int mMaterialIndex() {return this.ptr.get(LAYOUT__mMaterialIndex, OFFSET__mMaterialIndex);}
    public void mMaterialIndex(int value) {this.ptr.set(LAYOUT__mMaterialIndex, OFFSET__mMaterialIndex, value);}
    public java.lang.foreign.MemorySegment $mMaterialIndex() {return this.ptr.asSlice(OFFSET__mMaterialIndex, LAYOUT__mMaterialIndex);}

    public assimp.aiString mName() {return new assimp.aiString(this.ptr.asSlice(OFFSET__mName, LAYOUT__mName));}
    public void mName(java.util.function.Consumer<assimp.aiString> consumer) {consumer.accept(this.mName());}
    public void mName(assimp.aiString value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__mName, LAYOUT__mName.byteSize());}

    public int mNumAnimMeshes() {return this.ptr.get(LAYOUT__mNumAnimMeshes, OFFSET__mNumAnimMeshes);}
    public void mNumAnimMeshes(int value) {this.ptr.set(LAYOUT__mNumAnimMeshes, OFFSET__mNumAnimMeshes, value);}
    public java.lang.foreign.MemorySegment $mNumAnimMeshes() {return this.ptr.asSlice(OFFSET__mNumAnimMeshes, LAYOUT__mNumAnimMeshes);}

    public java.lang.foreign.MemorySegment mAnimMeshes() {return this.ptr.get(LAYOUT__mAnimMeshes, OFFSET__mAnimMeshes);}
    public void mAnimMeshes(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__mAnimMeshes, OFFSET__mAnimMeshes, value);}
    public java.lang.foreign.MemorySegment $mAnimMeshes() {return this.ptr.asSlice(OFFSET__mAnimMeshes, LAYOUT__mAnimMeshes);}

    public int mMethod() {return this.ptr.get(LAYOUT__mMethod, OFFSET__mMethod);}
    public void mMethod(int value) {this.ptr.set(LAYOUT__mMethod, OFFSET__mMethod, value);}
    public java.lang.foreign.MemorySegment $mMethod() {return this.ptr.asSlice(OFFSET__mMethod, LAYOUT__mMethod);}

    public assimp.aiAABB mAABB() {return new assimp.aiAABB(this.ptr.asSlice(OFFSET__mAABB, LAYOUT__mAABB));}
    public void mAABB(java.util.function.Consumer<assimp.aiAABB> consumer) {consumer.accept(this.mAABB());}
    public void mAABB(assimp.aiAABB value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__mAABB, LAYOUT__mAABB.byteSize());}

    public java.lang.foreign.MemorySegment mTextureCoordsNames() {return this.ptr.get(LAYOUT__mTextureCoordsNames, OFFSET__mTextureCoordsNames);}
    public void mTextureCoordsNames(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__mTextureCoordsNames, OFFSET__mTextureCoordsNames, value);}
    public java.lang.foreign.MemorySegment $mTextureCoordsNames() {return this.ptr.asSlice(OFFSET__mTextureCoordsNames, LAYOUT__mTextureCoordsNames);}
}
