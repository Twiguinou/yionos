package assimp;

public record aiSkeletonBone(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__mParent = java.lang.foreign.ValueLayout.JAVA_INT.withName("mParent");
    public static final long OFFSET__mParent = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__mArmature = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("mArmature");
    public static final long OFFSET__mArmature = 8;
    public static final java.lang.foreign.AddressLayout LAYOUT__mNode = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("mNode");
    public static final long OFFSET__mNode = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__mNumnWeights = java.lang.foreign.ValueLayout.JAVA_INT.withName("mNumnWeights");
    public static final long OFFSET__mNumnWeights = 24;
    public static final java.lang.foreign.AddressLayout LAYOUT__mMeshId = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("mMeshId");
    public static final long OFFSET__mMeshId = 32;
    public static final java.lang.foreign.AddressLayout LAYOUT__mWeights = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("mWeights");
    public static final long OFFSET__mWeights = 40;
    public static final java.lang.foreign.StructLayout LAYOUT__mOffsetMatrix = assimp.aiMatrix4x4.gRecordLayout.withName("mOffsetMatrix");
    public static final long OFFSET__mOffsetMatrix = 48;
    public static final java.lang.foreign.StructLayout LAYOUT__mLocalMatrix = assimp.aiMatrix4x4.gRecordLayout.withName("mLocalMatrix");
    public static final long OFFSET__mLocalMatrix = 112;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__mParent,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__mArmature,
            LAYOUT__mNode,
            LAYOUT__mNumnWeights,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__mMeshId,
            LAYOUT__mWeights,
            LAYOUT__mOffsetMatrix,
            LAYOUT__mLocalMatrix
    ).withByteAlignment(8).withName("aiSkeletonBone");

    public aiSkeletonBone(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static aiSkeletonBone getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new aiSkeletonBone(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, aiSkeletonBone value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int mParent() {return this.ptr.get(LAYOUT__mParent, OFFSET__mParent);}
    public void mParent(int value) {this.ptr.set(LAYOUT__mParent, OFFSET__mParent, value);}
    public java.lang.foreign.MemorySegment $mParent() {return this.ptr.asSlice(OFFSET__mParent, LAYOUT__mParent);}

    public java.lang.foreign.MemorySegment mArmature() {return this.ptr.get(LAYOUT__mArmature, OFFSET__mArmature);}
    public void mArmature(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__mArmature, OFFSET__mArmature, value);}
    public java.lang.foreign.MemorySegment $mArmature() {return this.ptr.asSlice(OFFSET__mArmature, LAYOUT__mArmature);}

    public java.lang.foreign.MemorySegment mNode() {return this.ptr.get(LAYOUT__mNode, OFFSET__mNode);}
    public void mNode(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__mNode, OFFSET__mNode, value);}
    public java.lang.foreign.MemorySegment $mNode() {return this.ptr.asSlice(OFFSET__mNode, LAYOUT__mNode);}

    public int mNumnWeights() {return this.ptr.get(LAYOUT__mNumnWeights, OFFSET__mNumnWeights);}
    public void mNumnWeights(int value) {this.ptr.set(LAYOUT__mNumnWeights, OFFSET__mNumnWeights, value);}
    public java.lang.foreign.MemorySegment $mNumnWeights() {return this.ptr.asSlice(OFFSET__mNumnWeights, LAYOUT__mNumnWeights);}

    public java.lang.foreign.MemorySegment mMeshId() {return this.ptr.get(LAYOUT__mMeshId, OFFSET__mMeshId);}
    public void mMeshId(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__mMeshId, OFFSET__mMeshId, value);}
    public java.lang.foreign.MemorySegment $mMeshId() {return this.ptr.asSlice(OFFSET__mMeshId, LAYOUT__mMeshId);}

    public java.lang.foreign.MemorySegment mWeights() {return this.ptr.get(LAYOUT__mWeights, OFFSET__mWeights);}
    public void mWeights(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__mWeights, OFFSET__mWeights, value);}
    public java.lang.foreign.MemorySegment $mWeights() {return this.ptr.asSlice(OFFSET__mWeights, LAYOUT__mWeights);}

    public assimp.aiMatrix4x4 mOffsetMatrix() {return new assimp.aiMatrix4x4(this.ptr.asSlice(OFFSET__mOffsetMatrix, LAYOUT__mOffsetMatrix));}
    public void mOffsetMatrix(java.util.function.Consumer<assimp.aiMatrix4x4> consumer) {consumer.accept(this.mOffsetMatrix());}
    public void mOffsetMatrix(assimp.aiMatrix4x4 value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__mOffsetMatrix, LAYOUT__mOffsetMatrix.byteSize());}

    public assimp.aiMatrix4x4 mLocalMatrix() {return new assimp.aiMatrix4x4(this.ptr.asSlice(OFFSET__mLocalMatrix, LAYOUT__mLocalMatrix));}
    public void mLocalMatrix(java.util.function.Consumer<assimp.aiMatrix4x4> consumer) {consumer.accept(this.mLocalMatrix());}
    public void mLocalMatrix(assimp.aiMatrix4x4 value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__mLocalMatrix, LAYOUT__mLocalMatrix.byteSize());}
}
