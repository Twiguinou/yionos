package assimp;

public record aiScene(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$mFlags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$mFlags = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$mRootNode = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$mRootNode = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$mNumMeshes = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$mNumMeshes = 16L;
    public static final java.lang.foreign.AddressLayout LAYOUT$mMeshes = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$mMeshes = 24L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$mNumMaterials = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$mNumMaterials = 32L;
    public static final java.lang.foreign.AddressLayout LAYOUT$mMaterials = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$mMaterials = 40L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$mNumAnimations = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$mNumAnimations = 48L;
    public static final java.lang.foreign.AddressLayout LAYOUT$mAnimations = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$mAnimations = 56L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$mNumTextures = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$mNumTextures = 64L;
    public static final java.lang.foreign.AddressLayout LAYOUT$mTextures = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$mTextures = 72L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$mNumLights = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$mNumLights = 80L;
    public static final java.lang.foreign.AddressLayout LAYOUT$mLights = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$mLights = 88L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$mNumCameras = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$mNumCameras = 96L;
    public static final java.lang.foreign.AddressLayout LAYOUT$mCameras = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$mCameras = 104L;
    public static final java.lang.foreign.AddressLayout LAYOUT$mMetaData = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$mMetaData = 112L;
    public static final java.lang.foreign.GroupLayout LAYOUT$mName = assimp.aiString.gStructLayout;
    public static final long OFFSET$mName = 120L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$mNumSkeletons = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$mNumSkeletons = 1148L;
    public static final java.lang.foreign.AddressLayout LAYOUT$mSkeletons = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$mSkeletons = 1152L;
    public static final java.lang.foreign.AddressLayout LAYOUT$mPrivate = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$mPrivate = 1160L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$mFlags,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$mRootNode,
            LAYOUT$mNumMeshes,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$mMeshes,
            LAYOUT$mNumMaterials,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$mMaterials,
            LAYOUT$mNumAnimations,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$mAnimations,
            LAYOUT$mNumTextures,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$mTextures,
            LAYOUT$mNumLights,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$mLights,
            LAYOUT$mNumCameras,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$mCameras,
            LAYOUT$mMetaData,
            LAYOUT$mName,
            LAYOUT$mNumSkeletons,
            LAYOUT$mSkeletons,
            LAYOUT$mPrivate
    ).withName("aiScene");

    public aiScene(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static aiScene getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new aiScene(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int mFlags() {return this.ptr.get(LAYOUT$mFlags, OFFSET$mFlags);}
    public void mFlags(int value) {this.ptr.set(LAYOUT$mFlags, OFFSET$mFlags, value);}
    public java.lang.foreign.MemorySegment mFlags_ptr() {return this.ptr.asSlice(OFFSET$mFlags, LAYOUT$mFlags);}

    public java.lang.foreign.MemorySegment mRootNode() {return this.ptr.get(LAYOUT$mRootNode, OFFSET$mRootNode);}
    public void mRootNode(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$mRootNode, OFFSET$mRootNode, value);}
    public java.lang.foreign.MemorySegment mRootNode_ptr() {return this.ptr.asSlice(OFFSET$mRootNode, LAYOUT$mRootNode);}

    public int mNumMeshes() {return this.ptr.get(LAYOUT$mNumMeshes, OFFSET$mNumMeshes);}
    public void mNumMeshes(int value) {this.ptr.set(LAYOUT$mNumMeshes, OFFSET$mNumMeshes, value);}
    public java.lang.foreign.MemorySegment mNumMeshes_ptr() {return this.ptr.asSlice(OFFSET$mNumMeshes, LAYOUT$mNumMeshes);}

    public java.lang.foreign.MemorySegment mMeshes() {return this.ptr.get(LAYOUT$mMeshes, OFFSET$mMeshes);}
    public void mMeshes(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$mMeshes, OFFSET$mMeshes, value);}
    public java.lang.foreign.MemorySegment mMeshes_ptr() {return this.ptr.asSlice(OFFSET$mMeshes, LAYOUT$mMeshes);}

    public int mNumMaterials() {return this.ptr.get(LAYOUT$mNumMaterials, OFFSET$mNumMaterials);}
    public void mNumMaterials(int value) {this.ptr.set(LAYOUT$mNumMaterials, OFFSET$mNumMaterials, value);}
    public java.lang.foreign.MemorySegment mNumMaterials_ptr() {return this.ptr.asSlice(OFFSET$mNumMaterials, LAYOUT$mNumMaterials);}

    public java.lang.foreign.MemorySegment mMaterials() {return this.ptr.get(LAYOUT$mMaterials, OFFSET$mMaterials);}
    public void mMaterials(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$mMaterials, OFFSET$mMaterials, value);}
    public java.lang.foreign.MemorySegment mMaterials_ptr() {return this.ptr.asSlice(OFFSET$mMaterials, LAYOUT$mMaterials);}

    public int mNumAnimations() {return this.ptr.get(LAYOUT$mNumAnimations, OFFSET$mNumAnimations);}
    public void mNumAnimations(int value) {this.ptr.set(LAYOUT$mNumAnimations, OFFSET$mNumAnimations, value);}
    public java.lang.foreign.MemorySegment mNumAnimations_ptr() {return this.ptr.asSlice(OFFSET$mNumAnimations, LAYOUT$mNumAnimations);}

    public java.lang.foreign.MemorySegment mAnimations() {return this.ptr.get(LAYOUT$mAnimations, OFFSET$mAnimations);}
    public void mAnimations(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$mAnimations, OFFSET$mAnimations, value);}
    public java.lang.foreign.MemorySegment mAnimations_ptr() {return this.ptr.asSlice(OFFSET$mAnimations, LAYOUT$mAnimations);}

    public int mNumTextures() {return this.ptr.get(LAYOUT$mNumTextures, OFFSET$mNumTextures);}
    public void mNumTextures(int value) {this.ptr.set(LAYOUT$mNumTextures, OFFSET$mNumTextures, value);}
    public java.lang.foreign.MemorySegment mNumTextures_ptr() {return this.ptr.asSlice(OFFSET$mNumTextures, LAYOUT$mNumTextures);}

    public java.lang.foreign.MemorySegment mTextures() {return this.ptr.get(LAYOUT$mTextures, OFFSET$mTextures);}
    public void mTextures(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$mTextures, OFFSET$mTextures, value);}
    public java.lang.foreign.MemorySegment mTextures_ptr() {return this.ptr.asSlice(OFFSET$mTextures, LAYOUT$mTextures);}

    public int mNumLights() {return this.ptr.get(LAYOUT$mNumLights, OFFSET$mNumLights);}
    public void mNumLights(int value) {this.ptr.set(LAYOUT$mNumLights, OFFSET$mNumLights, value);}
    public java.lang.foreign.MemorySegment mNumLights_ptr() {return this.ptr.asSlice(OFFSET$mNumLights, LAYOUT$mNumLights);}

    public java.lang.foreign.MemorySegment mLights() {return this.ptr.get(LAYOUT$mLights, OFFSET$mLights);}
    public void mLights(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$mLights, OFFSET$mLights, value);}
    public java.lang.foreign.MemorySegment mLights_ptr() {return this.ptr.asSlice(OFFSET$mLights, LAYOUT$mLights);}

    public int mNumCameras() {return this.ptr.get(LAYOUT$mNumCameras, OFFSET$mNumCameras);}
    public void mNumCameras(int value) {this.ptr.set(LAYOUT$mNumCameras, OFFSET$mNumCameras, value);}
    public java.lang.foreign.MemorySegment mNumCameras_ptr() {return this.ptr.asSlice(OFFSET$mNumCameras, LAYOUT$mNumCameras);}

    public java.lang.foreign.MemorySegment mCameras() {return this.ptr.get(LAYOUT$mCameras, OFFSET$mCameras);}
    public void mCameras(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$mCameras, OFFSET$mCameras, value);}
    public java.lang.foreign.MemorySegment mCameras_ptr() {return this.ptr.asSlice(OFFSET$mCameras, LAYOUT$mCameras);}

    public java.lang.foreign.MemorySegment mMetaData() {return this.ptr.get(LAYOUT$mMetaData, OFFSET$mMetaData);}
    public void mMetaData(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$mMetaData, OFFSET$mMetaData, value);}
    public java.lang.foreign.MemorySegment mMetaData_ptr() {return this.ptr.asSlice(OFFSET$mMetaData, LAYOUT$mMetaData);}

    public assimp.aiString mName() {return new assimp.aiString(this.ptr.asSlice(OFFSET$mName, LAYOUT$mName));}
    public void mName(java.util.function.Consumer<assimp.aiString> consumer) {consumer.accept(this.mName());}
    public void mName(assimp.aiString value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$mName, LAYOUT$mName.byteSize());}

    public int mNumSkeletons() {return this.ptr.get(LAYOUT$mNumSkeletons, OFFSET$mNumSkeletons);}
    public void mNumSkeletons(int value) {this.ptr.set(LAYOUT$mNumSkeletons, OFFSET$mNumSkeletons, value);}
    public java.lang.foreign.MemorySegment mNumSkeletons_ptr() {return this.ptr.asSlice(OFFSET$mNumSkeletons, LAYOUT$mNumSkeletons);}

    public java.lang.foreign.MemorySegment mSkeletons() {return this.ptr.get(LAYOUT$mSkeletons, OFFSET$mSkeletons);}
    public void mSkeletons(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$mSkeletons, OFFSET$mSkeletons, value);}
    public java.lang.foreign.MemorySegment mSkeletons_ptr() {return this.ptr.asSlice(OFFSET$mSkeletons, LAYOUT$mSkeletons);}

    public java.lang.foreign.MemorySegment mPrivate() {return this.ptr.get(LAYOUT$mPrivate, OFFSET$mPrivate);}
    public void mPrivate(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$mPrivate, OFFSET$mPrivate, value);}
    public java.lang.foreign.MemorySegment mPrivate_ptr() {return this.ptr.asSlice(OFFSET$mPrivate, LAYOUT$mPrivate);}
}
