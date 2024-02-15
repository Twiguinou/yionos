package assimp;

public record aiNode(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.GroupLayout LAYOUT$mName = assimp.aiString.gStructLayout;
    public static final long OFFSET$mName = 0L;
    public static final java.lang.foreign.GroupLayout LAYOUT$mTransformation = assimp.aiMatrix4x4.gStructLayout;
    public static final long OFFSET$mTransformation = 1028L;
    public static final java.lang.foreign.AddressLayout LAYOUT$mParent = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$mParent = 1096L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$mNumChildren = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$mNumChildren = 1104L;
    public static final java.lang.foreign.AddressLayout LAYOUT$mChildren = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$mChildren = 1112L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$mNumMeshes = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$mNumMeshes = 1120L;
    public static final java.lang.foreign.AddressLayout LAYOUT$mMeshes = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$mMeshes = 1128L;
    public static final java.lang.foreign.AddressLayout LAYOUT$mMetaData = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$mMetaData = 1136L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$mName,
            LAYOUT$mTransformation,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$mParent,
            LAYOUT$mNumChildren,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$mChildren,
            LAYOUT$mNumMeshes,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$mMeshes,
            LAYOUT$mMetaData
    ).withName("aiNode");

    public aiNode(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static aiNode getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new aiNode(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public assimp.aiString mName() {return new assimp.aiString(this.ptr.asSlice(OFFSET$mName, LAYOUT$mName));}
    public void mName(java.util.function.Consumer<assimp.aiString> consumer) {consumer.accept(this.mName());}
    public void mName(assimp.aiString value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$mName, LAYOUT$mName.byteSize());}

    public assimp.aiMatrix4x4 mTransformation() {return new assimp.aiMatrix4x4(this.ptr.asSlice(OFFSET$mTransformation, LAYOUT$mTransformation));}
    public void mTransformation(java.util.function.Consumer<assimp.aiMatrix4x4> consumer) {consumer.accept(this.mTransformation());}
    public void mTransformation(assimp.aiMatrix4x4 value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$mTransformation, LAYOUT$mTransformation.byteSize());}

    public java.lang.foreign.MemorySegment mParent() {return this.ptr.get(LAYOUT$mParent, OFFSET$mParent);}
    public void mParent(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$mParent, OFFSET$mParent, value);}
    public java.lang.foreign.MemorySegment mParent_ptr() {return this.ptr.asSlice(OFFSET$mParent, LAYOUT$mParent);}

    public int mNumChildren() {return this.ptr.get(LAYOUT$mNumChildren, OFFSET$mNumChildren);}
    public void mNumChildren(int value) {this.ptr.set(LAYOUT$mNumChildren, OFFSET$mNumChildren, value);}
    public java.lang.foreign.MemorySegment mNumChildren_ptr() {return this.ptr.asSlice(OFFSET$mNumChildren, LAYOUT$mNumChildren);}

    public java.lang.foreign.MemorySegment mChildren() {return this.ptr.get(LAYOUT$mChildren, OFFSET$mChildren);}
    public void mChildren(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$mChildren, OFFSET$mChildren, value);}
    public java.lang.foreign.MemorySegment mChildren_ptr() {return this.ptr.asSlice(OFFSET$mChildren, LAYOUT$mChildren);}

    public int mNumMeshes() {return this.ptr.get(LAYOUT$mNumMeshes, OFFSET$mNumMeshes);}
    public void mNumMeshes(int value) {this.ptr.set(LAYOUT$mNumMeshes, OFFSET$mNumMeshes, value);}
    public java.lang.foreign.MemorySegment mNumMeshes_ptr() {return this.ptr.asSlice(OFFSET$mNumMeshes, LAYOUT$mNumMeshes);}

    public java.lang.foreign.MemorySegment mMeshes() {return this.ptr.get(LAYOUT$mMeshes, OFFSET$mMeshes);}
    public void mMeshes(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$mMeshes, OFFSET$mMeshes, value);}
    public java.lang.foreign.MemorySegment mMeshes_ptr() {return this.ptr.asSlice(OFFSET$mMeshes, LAYOUT$mMeshes);}

    public java.lang.foreign.MemorySegment mMetaData() {return this.ptr.get(LAYOUT$mMetaData, OFFSET$mMetaData);}
    public void mMetaData(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$mMetaData, OFFSET$mMetaData, value);}
    public java.lang.foreign.MemorySegment mMetaData_ptr() {return this.ptr.asSlice(OFFSET$mMetaData, LAYOUT$mMetaData);}
}
