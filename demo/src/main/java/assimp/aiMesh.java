package assimp;

public record aiMesh(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$mPrimitiveTypes = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$mPrimitiveTypes = 0L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$mNumVertices = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$mNumVertices = 4L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$mNumFaces = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$mNumFaces = 8L;
    public static final java.lang.foreign.AddressLayout LAYOUT$mVertices = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$mVertices = 16L;
    public static final java.lang.foreign.AddressLayout LAYOUT$mNormals = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$mNormals = 24L;
    public static final java.lang.foreign.AddressLayout LAYOUT$mTangents = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$mTangents = 32L;
    public static final java.lang.foreign.AddressLayout LAYOUT$mBitangents = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$mBitangents = 40L;
    public static final java.lang.foreign.SequenceLayout LAYOUT$mColors = java.lang.foreign.MemoryLayout.sequenceLayout(8, java.lang.foreign.ValueLayout.ADDRESS);
    public static final long OFFSET$mColors = 48L;
    public static final java.lang.foreign.SequenceLayout LAYOUT$mTextureCoords = java.lang.foreign.MemoryLayout.sequenceLayout(8, java.lang.foreign.ValueLayout.ADDRESS);
    public static final long OFFSET$mTextureCoords = 112L;
    public static final java.lang.foreign.SequenceLayout LAYOUT$mNumUVComponents = java.lang.foreign.MemoryLayout.sequenceLayout(8, java.lang.foreign.ValueLayout.JAVA_INT);
    public static final long OFFSET$mNumUVComponents = 176L;
    public static final java.lang.foreign.AddressLayout LAYOUT$mFaces = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$mFaces = 208L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$mNumBones = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$mNumBones = 216L;
    public static final java.lang.foreign.AddressLayout LAYOUT$mBones = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$mBones = 224L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$mMaterialIndex = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$mMaterialIndex = 232L;
    public static final java.lang.foreign.GroupLayout LAYOUT$mName = assimp.aiString.gStructLayout;
    public static final long OFFSET$mName = 236L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$mNumAnimMeshes = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$mNumAnimMeshes = 1264L;
    public static final java.lang.foreign.AddressLayout LAYOUT$mAnimMeshes = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$mAnimMeshes = 1272L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$mMethod = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$mMethod = 1280L;
    public static final java.lang.foreign.GroupLayout LAYOUT$mAABB = assimp.aiAABB.gStructLayout;
    public static final long OFFSET$mAABB = 1284L;
    public static final java.lang.foreign.AddressLayout LAYOUT$mTextureCoordsNames = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$mTextureCoordsNames = 1312L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$mPrimitiveTypes,
            LAYOUT$mNumVertices,
            LAYOUT$mNumFaces,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$mVertices,
            LAYOUT$mNormals,
            LAYOUT$mTangents,
            LAYOUT$mBitangents,
            LAYOUT$mColors,
            LAYOUT$mTextureCoords,
            LAYOUT$mNumUVComponents,
            LAYOUT$mFaces,
            LAYOUT$mNumBones,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$mBones,
            LAYOUT$mMaterialIndex,
            LAYOUT$mName,
            LAYOUT$mNumAnimMeshes,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$mAnimMeshes,
            LAYOUT$mMethod,
            LAYOUT$mAABB,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$mTextureCoordsNames
    ).withName("aiMesh");

    public aiMesh(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static aiMesh getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new aiMesh(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int mPrimitiveTypes() {return this.ptr.get(LAYOUT$mPrimitiveTypes, OFFSET$mPrimitiveTypes);}
    public void mPrimitiveTypes(int value) {this.ptr.set(LAYOUT$mPrimitiveTypes, OFFSET$mPrimitiveTypes, value);}
    public java.lang.foreign.MemorySegment mPrimitiveTypes_ptr() {return this.ptr.asSlice(OFFSET$mPrimitiveTypes, LAYOUT$mPrimitiveTypes);}

    public int mNumVertices() {return this.ptr.get(LAYOUT$mNumVertices, OFFSET$mNumVertices);}
    public void mNumVertices(int value) {this.ptr.set(LAYOUT$mNumVertices, OFFSET$mNumVertices, value);}
    public java.lang.foreign.MemorySegment mNumVertices_ptr() {return this.ptr.asSlice(OFFSET$mNumVertices, LAYOUT$mNumVertices);}

    public int mNumFaces() {return this.ptr.get(LAYOUT$mNumFaces, OFFSET$mNumFaces);}
    public void mNumFaces(int value) {this.ptr.set(LAYOUT$mNumFaces, OFFSET$mNumFaces, value);}
    public java.lang.foreign.MemorySegment mNumFaces_ptr() {return this.ptr.asSlice(OFFSET$mNumFaces, LAYOUT$mNumFaces);}

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

    public java.lang.foreign.MemorySegment mNumUVComponents() {return this.ptr.asSlice(OFFSET$mNumUVComponents, LAYOUT$mNumUVComponents);}
    public int mNumUVComponents(int i) {return this.mNumUVComponents().getAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, i);}
    public void mNumUVComponents(int i, int value) {this.mNumUVComponents().setAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, i, value);}

    public java.lang.foreign.MemorySegment mFaces() {return this.ptr.get(LAYOUT$mFaces, OFFSET$mFaces);}
    public void mFaces(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$mFaces, OFFSET$mFaces, value);}
    public java.lang.foreign.MemorySegment mFaces_ptr() {return this.ptr.asSlice(OFFSET$mFaces, LAYOUT$mFaces);}

    public int mNumBones() {return this.ptr.get(LAYOUT$mNumBones, OFFSET$mNumBones);}
    public void mNumBones(int value) {this.ptr.set(LAYOUT$mNumBones, OFFSET$mNumBones, value);}
    public java.lang.foreign.MemorySegment mNumBones_ptr() {return this.ptr.asSlice(OFFSET$mNumBones, LAYOUT$mNumBones);}

    public java.lang.foreign.MemorySegment mBones() {return this.ptr.get(LAYOUT$mBones, OFFSET$mBones);}
    public void mBones(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$mBones, OFFSET$mBones, value);}
    public java.lang.foreign.MemorySegment mBones_ptr() {return this.ptr.asSlice(OFFSET$mBones, LAYOUT$mBones);}

    public int mMaterialIndex() {return this.ptr.get(LAYOUT$mMaterialIndex, OFFSET$mMaterialIndex);}
    public void mMaterialIndex(int value) {this.ptr.set(LAYOUT$mMaterialIndex, OFFSET$mMaterialIndex, value);}
    public java.lang.foreign.MemorySegment mMaterialIndex_ptr() {return this.ptr.asSlice(OFFSET$mMaterialIndex, LAYOUT$mMaterialIndex);}

    public assimp.aiString mName() {return new assimp.aiString(this.ptr.asSlice(OFFSET$mName, LAYOUT$mName));}
    public void mName(java.util.function.Consumer<assimp.aiString> consumer) {consumer.accept(this.mName());}
    public void mName(assimp.aiString value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$mName, LAYOUT$mName.byteSize());}

    public int mNumAnimMeshes() {return this.ptr.get(LAYOUT$mNumAnimMeshes, OFFSET$mNumAnimMeshes);}
    public void mNumAnimMeshes(int value) {this.ptr.set(LAYOUT$mNumAnimMeshes, OFFSET$mNumAnimMeshes, value);}
    public java.lang.foreign.MemorySegment mNumAnimMeshes_ptr() {return this.ptr.asSlice(OFFSET$mNumAnimMeshes, LAYOUT$mNumAnimMeshes);}

    public java.lang.foreign.MemorySegment mAnimMeshes() {return this.ptr.get(LAYOUT$mAnimMeshes, OFFSET$mAnimMeshes);}
    public void mAnimMeshes(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$mAnimMeshes, OFFSET$mAnimMeshes, value);}
    public java.lang.foreign.MemorySegment mAnimMeshes_ptr() {return this.ptr.asSlice(OFFSET$mAnimMeshes, LAYOUT$mAnimMeshes);}

    public int mMethod() {return this.ptr.get(LAYOUT$mMethod, OFFSET$mMethod);}
    public void mMethod(int value) {this.ptr.set(LAYOUT$mMethod, OFFSET$mMethod, value);}
    public java.lang.foreign.MemorySegment mMethod_ptr() {return this.ptr.asSlice(OFFSET$mMethod, LAYOUT$mMethod);}

    public assimp.aiAABB mAABB() {return new assimp.aiAABB(this.ptr.asSlice(OFFSET$mAABB, LAYOUT$mAABB));}
    public void mAABB(java.util.function.Consumer<assimp.aiAABB> consumer) {consumer.accept(this.mAABB());}
    public void mAABB(assimp.aiAABB value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$mAABB, LAYOUT$mAABB.byteSize());}

    public java.lang.foreign.MemorySegment mTextureCoordsNames() {return this.ptr.get(LAYOUT$mTextureCoordsNames, OFFSET$mTextureCoordsNames);}
    public void mTextureCoordsNames(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$mTextureCoordsNames, OFFSET$mTextureCoordsNames, value);}
    public java.lang.foreign.MemorySegment mTextureCoordsNames_ptr() {return this.ptr.asSlice(OFFSET$mTextureCoordsNames, LAYOUT$mTextureCoordsNames);}
}
