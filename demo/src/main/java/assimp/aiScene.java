package assimp;

public record aiScene(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__mFlags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__mFlags = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__mRootNode = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__mRootNode = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__mNumMeshes = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__mNumMeshes = 16;
    public static final java.lang.foreign.AddressLayout LAYOUT__mMeshes = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__mMeshes = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__mNumMaterials = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__mNumMaterials = 32;
    public static final java.lang.foreign.AddressLayout LAYOUT__mMaterials = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__mMaterials = 40;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__mNumAnimations = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__mNumAnimations = 48;
    public static final java.lang.foreign.AddressLayout LAYOUT__mAnimations = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__mAnimations = 56;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__mNumTextures = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__mNumTextures = 64;
    public static final java.lang.foreign.AddressLayout LAYOUT__mTextures = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__mTextures = 72;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__mNumLights = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__mNumLights = 80;
    public static final java.lang.foreign.AddressLayout LAYOUT__mLights = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__mLights = 88;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__mNumCameras = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__mNumCameras = 96;
    public static final java.lang.foreign.AddressLayout LAYOUT__mCameras = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__mCameras = 104;
    public static final java.lang.foreign.AddressLayout LAYOUT__mMetaData = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__mMetaData = 112;
    public static final java.lang.foreign.StructLayout LAYOUT__mName = assimp.aiString.gRecordLayout;
    public static final long OFFSET__mName = 120;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__mNumSkeletons = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__mNumSkeletons = 1148;
    public static final java.lang.foreign.AddressLayout LAYOUT__mSkeletons = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__mSkeletons = 1152;
    public static final java.lang.foreign.AddressLayout LAYOUT__mPrivate = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__mPrivate = 1160;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__mFlags,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__mRootNode,
            LAYOUT__mNumMeshes,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__mMeshes,
            LAYOUT__mNumMaterials,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__mMaterials,
            LAYOUT__mNumAnimations,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__mAnimations,
            LAYOUT__mNumTextures,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__mTextures,
            LAYOUT__mNumLights,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__mLights,
            LAYOUT__mNumCameras,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__mCameras,
            LAYOUT__mMetaData,
            LAYOUT__mName,
            LAYOUT__mNumSkeletons,
            LAYOUT__mSkeletons,
            LAYOUT__mPrivate
    ).withByteAlignment(8).withName("aiScene");

    public aiScene(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static aiScene getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new aiScene(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, aiScene value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int mFlags() {return this.ptr.get(LAYOUT__mFlags, OFFSET__mFlags);}
    public void mFlags(int value) {this.ptr.set(LAYOUT__mFlags, OFFSET__mFlags, value);}
    public java.lang.foreign.MemorySegment $mFlags() {return this.ptr.asSlice(OFFSET__mFlags, LAYOUT__mFlags);}

    public java.lang.foreign.MemorySegment mRootNode() {return this.ptr.get(LAYOUT__mRootNode, OFFSET__mRootNode);}
    public void mRootNode(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__mRootNode, OFFSET__mRootNode, value);}
    public java.lang.foreign.MemorySegment $mRootNode() {return this.ptr.asSlice(OFFSET__mRootNode, LAYOUT__mRootNode);}

    public int mNumMeshes() {return this.ptr.get(LAYOUT__mNumMeshes, OFFSET__mNumMeshes);}
    public void mNumMeshes(int value) {this.ptr.set(LAYOUT__mNumMeshes, OFFSET__mNumMeshes, value);}
    public java.lang.foreign.MemorySegment $mNumMeshes() {return this.ptr.asSlice(OFFSET__mNumMeshes, LAYOUT__mNumMeshes);}

    public java.lang.foreign.MemorySegment mMeshes() {return this.ptr.get(LAYOUT__mMeshes, OFFSET__mMeshes);}
    public void mMeshes(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__mMeshes, OFFSET__mMeshes, value);}
    public java.lang.foreign.MemorySegment $mMeshes() {return this.ptr.asSlice(OFFSET__mMeshes, LAYOUT__mMeshes);}

    public int mNumMaterials() {return this.ptr.get(LAYOUT__mNumMaterials, OFFSET__mNumMaterials);}
    public void mNumMaterials(int value) {this.ptr.set(LAYOUT__mNumMaterials, OFFSET__mNumMaterials, value);}
    public java.lang.foreign.MemorySegment $mNumMaterials() {return this.ptr.asSlice(OFFSET__mNumMaterials, LAYOUT__mNumMaterials);}

    public java.lang.foreign.MemorySegment mMaterials() {return this.ptr.get(LAYOUT__mMaterials, OFFSET__mMaterials);}
    public void mMaterials(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__mMaterials, OFFSET__mMaterials, value);}
    public java.lang.foreign.MemorySegment $mMaterials() {return this.ptr.asSlice(OFFSET__mMaterials, LAYOUT__mMaterials);}

    public int mNumAnimations() {return this.ptr.get(LAYOUT__mNumAnimations, OFFSET__mNumAnimations);}
    public void mNumAnimations(int value) {this.ptr.set(LAYOUT__mNumAnimations, OFFSET__mNumAnimations, value);}
    public java.lang.foreign.MemorySegment $mNumAnimations() {return this.ptr.asSlice(OFFSET__mNumAnimations, LAYOUT__mNumAnimations);}

    public java.lang.foreign.MemorySegment mAnimations() {return this.ptr.get(LAYOUT__mAnimations, OFFSET__mAnimations);}
    public void mAnimations(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__mAnimations, OFFSET__mAnimations, value);}
    public java.lang.foreign.MemorySegment $mAnimations() {return this.ptr.asSlice(OFFSET__mAnimations, LAYOUT__mAnimations);}

    public int mNumTextures() {return this.ptr.get(LAYOUT__mNumTextures, OFFSET__mNumTextures);}
    public void mNumTextures(int value) {this.ptr.set(LAYOUT__mNumTextures, OFFSET__mNumTextures, value);}
    public java.lang.foreign.MemorySegment $mNumTextures() {return this.ptr.asSlice(OFFSET__mNumTextures, LAYOUT__mNumTextures);}

    public java.lang.foreign.MemorySegment mTextures() {return this.ptr.get(LAYOUT__mTextures, OFFSET__mTextures);}
    public void mTextures(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__mTextures, OFFSET__mTextures, value);}
    public java.lang.foreign.MemorySegment $mTextures() {return this.ptr.asSlice(OFFSET__mTextures, LAYOUT__mTextures);}

    public int mNumLights() {return this.ptr.get(LAYOUT__mNumLights, OFFSET__mNumLights);}
    public void mNumLights(int value) {this.ptr.set(LAYOUT__mNumLights, OFFSET__mNumLights, value);}
    public java.lang.foreign.MemorySegment $mNumLights() {return this.ptr.asSlice(OFFSET__mNumLights, LAYOUT__mNumLights);}

    public java.lang.foreign.MemorySegment mLights() {return this.ptr.get(LAYOUT__mLights, OFFSET__mLights);}
    public void mLights(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__mLights, OFFSET__mLights, value);}
    public java.lang.foreign.MemorySegment $mLights() {return this.ptr.asSlice(OFFSET__mLights, LAYOUT__mLights);}

    public int mNumCameras() {return this.ptr.get(LAYOUT__mNumCameras, OFFSET__mNumCameras);}
    public void mNumCameras(int value) {this.ptr.set(LAYOUT__mNumCameras, OFFSET__mNumCameras, value);}
    public java.lang.foreign.MemorySegment $mNumCameras() {return this.ptr.asSlice(OFFSET__mNumCameras, LAYOUT__mNumCameras);}

    public java.lang.foreign.MemorySegment mCameras() {return this.ptr.get(LAYOUT__mCameras, OFFSET__mCameras);}
    public void mCameras(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__mCameras, OFFSET__mCameras, value);}
    public java.lang.foreign.MemorySegment $mCameras() {return this.ptr.asSlice(OFFSET__mCameras, LAYOUT__mCameras);}

    public java.lang.foreign.MemorySegment mMetaData() {return this.ptr.get(LAYOUT__mMetaData, OFFSET__mMetaData);}
    public void mMetaData(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__mMetaData, OFFSET__mMetaData, value);}
    public java.lang.foreign.MemorySegment $mMetaData() {return this.ptr.asSlice(OFFSET__mMetaData, LAYOUT__mMetaData);}

    public assimp.aiString mName() {return new assimp.aiString(this.ptr.asSlice(OFFSET__mName, LAYOUT__mName));}
    public void mName(java.util.function.Consumer<assimp.aiString> consumer) {consumer.accept(this.mName());}
    public void mName(assimp.aiString value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__mName, LAYOUT__mName.byteSize());}

    public int mNumSkeletons() {return this.ptr.get(LAYOUT__mNumSkeletons, OFFSET__mNumSkeletons);}
    public void mNumSkeletons(int value) {this.ptr.set(LAYOUT__mNumSkeletons, OFFSET__mNumSkeletons, value);}
    public java.lang.foreign.MemorySegment $mNumSkeletons() {return this.ptr.asSlice(OFFSET__mNumSkeletons, LAYOUT__mNumSkeletons);}

    public java.lang.foreign.MemorySegment mSkeletons() {return this.ptr.get(LAYOUT__mSkeletons, OFFSET__mSkeletons);}
    public void mSkeletons(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__mSkeletons, OFFSET__mSkeletons, value);}
    public java.lang.foreign.MemorySegment $mSkeletons() {return this.ptr.asSlice(OFFSET__mSkeletons, LAYOUT__mSkeletons);}

    public java.lang.foreign.MemorySegment mPrivate() {return this.ptr.get(LAYOUT__mPrivate, OFFSET__mPrivate);}
    public void mPrivate(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__mPrivate, OFFSET__mPrivate, value);}
    public java.lang.foreign.MemorySegment $mPrivate() {return this.ptr.asSlice(OFFSET__mPrivate, LAYOUT__mPrivate);}
}
