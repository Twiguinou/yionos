package assimp;

public record aiNode(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT__mName = assimp.aiString.gRecordLayout;
    public static final long OFFSET__mName = 0;
    public static final java.lang.foreign.StructLayout LAYOUT__mTransformation = assimp.aiMatrix4x4.gRecordLayout;
    public static final long OFFSET__mTransformation = 1028;
    public static final java.lang.foreign.AddressLayout LAYOUT__mParent = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__mParent = 1096;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__mNumChildren = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__mNumChildren = 1104;
    public static final java.lang.foreign.AddressLayout LAYOUT__mChildren = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__mChildren = 1112;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__mNumMeshes = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__mNumMeshes = 1120;
    public static final java.lang.foreign.AddressLayout LAYOUT__mMeshes = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__mMeshes = 1128;
    public static final java.lang.foreign.AddressLayout LAYOUT__mMetaData = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__mMetaData = 1136;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__mName,
            LAYOUT__mTransformation,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__mParent,
            LAYOUT__mNumChildren,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__mChildren,
            LAYOUT__mNumMeshes,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__mMeshes,
            LAYOUT__mMetaData
    ).withByteAlignment(8).withName("aiNode");

    public aiNode(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static aiNode getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new aiNode(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, aiNode value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public assimp.aiString mName() {return new assimp.aiString(this.ptr.asSlice(OFFSET__mName, LAYOUT__mName));}
    public void mName(java.util.function.Consumer<assimp.aiString> consumer) {consumer.accept(this.mName());}
    public void mName(assimp.aiString value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__mName, LAYOUT__mName.byteSize());}

    public assimp.aiMatrix4x4 mTransformation() {return new assimp.aiMatrix4x4(this.ptr.asSlice(OFFSET__mTransformation, LAYOUT__mTransformation));}
    public void mTransformation(java.util.function.Consumer<assimp.aiMatrix4x4> consumer) {consumer.accept(this.mTransformation());}
    public void mTransformation(assimp.aiMatrix4x4 value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__mTransformation, LAYOUT__mTransformation.byteSize());}

    public java.lang.foreign.MemorySegment mParent() {return this.ptr.get(LAYOUT__mParent, OFFSET__mParent);}
    public void mParent(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__mParent, OFFSET__mParent, value);}
    public java.lang.foreign.MemorySegment $mParent() {return this.ptr.asSlice(OFFSET__mParent, LAYOUT__mParent);}

    public int mNumChildren() {return this.ptr.get(LAYOUT__mNumChildren, OFFSET__mNumChildren);}
    public void mNumChildren(int value) {this.ptr.set(LAYOUT__mNumChildren, OFFSET__mNumChildren, value);}
    public java.lang.foreign.MemorySegment $mNumChildren() {return this.ptr.asSlice(OFFSET__mNumChildren, LAYOUT__mNumChildren);}

    public java.lang.foreign.MemorySegment mChildren() {return this.ptr.get(LAYOUT__mChildren, OFFSET__mChildren);}
    public void mChildren(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__mChildren, OFFSET__mChildren, value);}
    public java.lang.foreign.MemorySegment $mChildren() {return this.ptr.asSlice(OFFSET__mChildren, LAYOUT__mChildren);}

    public int mNumMeshes() {return this.ptr.get(LAYOUT__mNumMeshes, OFFSET__mNumMeshes);}
    public void mNumMeshes(int value) {this.ptr.set(LAYOUT__mNumMeshes, OFFSET__mNumMeshes, value);}
    public java.lang.foreign.MemorySegment $mNumMeshes() {return this.ptr.asSlice(OFFSET__mNumMeshes, LAYOUT__mNumMeshes);}

    public java.lang.foreign.MemorySegment mMeshes() {return this.ptr.get(LAYOUT__mMeshes, OFFSET__mMeshes);}
    public void mMeshes(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__mMeshes, OFFSET__mMeshes, value);}
    public java.lang.foreign.MemorySegment $mMeshes() {return this.ptr.asSlice(OFFSET__mMeshes, LAYOUT__mMeshes);}

    public java.lang.foreign.MemorySegment mMetaData() {return this.ptr.get(LAYOUT__mMetaData, OFFSET__mMetaData);}
    public void mMetaData(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__mMetaData, OFFSET__mMetaData, value);}
    public java.lang.foreign.MemorySegment $mMetaData() {return this.ptr.asSlice(OFFSET__mMetaData, LAYOUT__mMetaData);}
}
