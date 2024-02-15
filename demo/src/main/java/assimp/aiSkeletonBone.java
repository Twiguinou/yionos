package assimp;

public record aiSkeletonBone(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$mParent = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$mParent = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$mArmature = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$mArmature = 8L;
    public static final java.lang.foreign.AddressLayout LAYOUT$mNode = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$mNode = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$mNumnWeights = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$mNumnWeights = 24L;
    public static final java.lang.foreign.AddressLayout LAYOUT$mMeshId = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$mMeshId = 32L;
    public static final java.lang.foreign.AddressLayout LAYOUT$mWeights = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$mWeights = 40L;
    public static final java.lang.foreign.GroupLayout LAYOUT$mOffsetMatrix = assimp.aiMatrix4x4.gStructLayout;
    public static final long OFFSET$mOffsetMatrix = 48L;
    public static final java.lang.foreign.GroupLayout LAYOUT$mLocalMatrix = assimp.aiMatrix4x4.gStructLayout;
    public static final long OFFSET$mLocalMatrix = 112L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$mParent,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$mArmature,
            LAYOUT$mNode,
            LAYOUT$mNumnWeights,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$mMeshId,
            LAYOUT$mWeights,
            LAYOUT$mOffsetMatrix,
            LAYOUT$mLocalMatrix
    ).withName("aiSkeletonBone");

    public aiSkeletonBone(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static aiSkeletonBone getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new aiSkeletonBone(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int mParent() {return this.ptr.get(LAYOUT$mParent, OFFSET$mParent);}
    public void mParent(int value) {this.ptr.set(LAYOUT$mParent, OFFSET$mParent, value);}
    public java.lang.foreign.MemorySegment mParent_ptr() {return this.ptr.asSlice(OFFSET$mParent, LAYOUT$mParent);}

    public java.lang.foreign.MemorySegment mArmature() {return this.ptr.get(LAYOUT$mArmature, OFFSET$mArmature);}
    public void mArmature(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$mArmature, OFFSET$mArmature, value);}
    public java.lang.foreign.MemorySegment mArmature_ptr() {return this.ptr.asSlice(OFFSET$mArmature, LAYOUT$mArmature);}

    public java.lang.foreign.MemorySegment mNode() {return this.ptr.get(LAYOUT$mNode, OFFSET$mNode);}
    public void mNode(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$mNode, OFFSET$mNode, value);}
    public java.lang.foreign.MemorySegment mNode_ptr() {return this.ptr.asSlice(OFFSET$mNode, LAYOUT$mNode);}

    public int mNumnWeights() {return this.ptr.get(LAYOUT$mNumnWeights, OFFSET$mNumnWeights);}
    public void mNumnWeights(int value) {this.ptr.set(LAYOUT$mNumnWeights, OFFSET$mNumnWeights, value);}
    public java.lang.foreign.MemorySegment mNumnWeights_ptr() {return this.ptr.asSlice(OFFSET$mNumnWeights, LAYOUT$mNumnWeights);}

    public java.lang.foreign.MemorySegment mMeshId() {return this.ptr.get(LAYOUT$mMeshId, OFFSET$mMeshId);}
    public void mMeshId(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$mMeshId, OFFSET$mMeshId, value);}
    public java.lang.foreign.MemorySegment mMeshId_ptr() {return this.ptr.asSlice(OFFSET$mMeshId, LAYOUT$mMeshId);}

    public java.lang.foreign.MemorySegment mWeights() {return this.ptr.get(LAYOUT$mWeights, OFFSET$mWeights);}
    public void mWeights(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$mWeights, OFFSET$mWeights, value);}
    public java.lang.foreign.MemorySegment mWeights_ptr() {return this.ptr.asSlice(OFFSET$mWeights, LAYOUT$mWeights);}

    public assimp.aiMatrix4x4 mOffsetMatrix() {return new assimp.aiMatrix4x4(this.ptr.asSlice(OFFSET$mOffsetMatrix, LAYOUT$mOffsetMatrix));}
    public void mOffsetMatrix(java.util.function.Consumer<assimp.aiMatrix4x4> consumer) {consumer.accept(this.mOffsetMatrix());}
    public void mOffsetMatrix(assimp.aiMatrix4x4 value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$mOffsetMatrix, LAYOUT$mOffsetMatrix.byteSize());}

    public assimp.aiMatrix4x4 mLocalMatrix() {return new assimp.aiMatrix4x4(this.ptr.asSlice(OFFSET$mLocalMatrix, LAYOUT$mLocalMatrix));}
    public void mLocalMatrix(java.util.function.Consumer<assimp.aiMatrix4x4> consumer) {consumer.accept(this.mLocalMatrix());}
    public void mLocalMatrix(assimp.aiMatrix4x4 value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$mLocalMatrix, LAYOUT$mLocalMatrix.byteSize());}
}
