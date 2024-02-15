package assimp;

public record aiBone(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.GroupLayout LAYOUT$mName = assimp.aiString.gStructLayout;
    public static final long OFFSET$mName = 0L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$mNumWeights = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$mNumWeights = 1028L;
    public static final java.lang.foreign.AddressLayout LAYOUT$mArmature = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$mArmature = 1032L;
    public static final java.lang.foreign.AddressLayout LAYOUT$mNode = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$mNode = 1040L;
    public static final java.lang.foreign.AddressLayout LAYOUT$mWeights = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$mWeights = 1048L;
    public static final java.lang.foreign.GroupLayout LAYOUT$mOffsetMatrix = assimp.aiMatrix4x4.gStructLayout;
    public static final long OFFSET$mOffsetMatrix = 1056L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$mName,
            LAYOUT$mNumWeights,
            LAYOUT$mArmature,
            LAYOUT$mNode,
            LAYOUT$mWeights,
            LAYOUT$mOffsetMatrix
    ).withName("aiBone");

    public aiBone(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static aiBone getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new aiBone(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public assimp.aiString mName() {return new assimp.aiString(this.ptr.asSlice(OFFSET$mName, LAYOUT$mName));}
    public void mName(java.util.function.Consumer<assimp.aiString> consumer) {consumer.accept(this.mName());}
    public void mName(assimp.aiString value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$mName, LAYOUT$mName.byteSize());}

    public int mNumWeights() {return this.ptr.get(LAYOUT$mNumWeights, OFFSET$mNumWeights);}
    public void mNumWeights(int value) {this.ptr.set(LAYOUT$mNumWeights, OFFSET$mNumWeights, value);}
    public java.lang.foreign.MemorySegment mNumWeights_ptr() {return this.ptr.asSlice(OFFSET$mNumWeights, LAYOUT$mNumWeights);}

    public java.lang.foreign.MemorySegment mArmature() {return this.ptr.get(LAYOUT$mArmature, OFFSET$mArmature);}
    public void mArmature(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$mArmature, OFFSET$mArmature, value);}
    public java.lang.foreign.MemorySegment mArmature_ptr() {return this.ptr.asSlice(OFFSET$mArmature, LAYOUT$mArmature);}

    public java.lang.foreign.MemorySegment mNode() {return this.ptr.get(LAYOUT$mNode, OFFSET$mNode);}
    public void mNode(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$mNode, OFFSET$mNode, value);}
    public java.lang.foreign.MemorySegment mNode_ptr() {return this.ptr.asSlice(OFFSET$mNode, LAYOUT$mNode);}

    public java.lang.foreign.MemorySegment mWeights() {return this.ptr.get(LAYOUT$mWeights, OFFSET$mWeights);}
    public void mWeights(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$mWeights, OFFSET$mWeights, value);}
    public java.lang.foreign.MemorySegment mWeights_ptr() {return this.ptr.asSlice(OFFSET$mWeights, LAYOUT$mWeights);}

    public assimp.aiMatrix4x4 mOffsetMatrix() {return new assimp.aiMatrix4x4(this.ptr.asSlice(OFFSET$mOffsetMatrix, LAYOUT$mOffsetMatrix));}
    public void mOffsetMatrix(java.util.function.Consumer<assimp.aiMatrix4x4> consumer) {consumer.accept(this.mOffsetMatrix());}
    public void mOffsetMatrix(assimp.aiMatrix4x4 value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$mOffsetMatrix, LAYOUT$mOffsetMatrix.byteSize());}
}
