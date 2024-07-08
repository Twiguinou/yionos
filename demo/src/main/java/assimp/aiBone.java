package assimp;

public record aiBone(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT__mName = assimp.aiString.gRecordLayout.withName("mName");
    public static final long OFFSET__mName = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__mNumWeights = java.lang.foreign.ValueLayout.JAVA_INT.withName("mNumWeights");
    public static final long OFFSET__mNumWeights = 1028;
    public static final java.lang.foreign.AddressLayout LAYOUT__mArmature = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("mArmature");
    public static final long OFFSET__mArmature = 1032;
    public static final java.lang.foreign.AddressLayout LAYOUT__mNode = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("mNode");
    public static final long OFFSET__mNode = 1040;
    public static final java.lang.foreign.AddressLayout LAYOUT__mWeights = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("mWeights");
    public static final long OFFSET__mWeights = 1048;
    public static final java.lang.foreign.StructLayout LAYOUT__mOffsetMatrix = assimp.aiMatrix4x4.gRecordLayout.withName("mOffsetMatrix");
    public static final long OFFSET__mOffsetMatrix = 1056;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__mName,
            LAYOUT__mNumWeights,
            LAYOUT__mArmature,
            LAYOUT__mNode,
            LAYOUT__mWeights,
            LAYOUT__mOffsetMatrix
    ).withByteAlignment(8).withName("aiBone");

    public aiBone(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static aiBone getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new aiBone(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, aiBone value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public assimp.aiString mName() {return new assimp.aiString(this.ptr.asSlice(OFFSET__mName, LAYOUT__mName));}
    public void mName(java.util.function.Consumer<assimp.aiString> consumer) {consumer.accept(this.mName());}
    public void mName(assimp.aiString value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__mName, LAYOUT__mName.byteSize());}

    public int mNumWeights() {return this.ptr.get(LAYOUT__mNumWeights, OFFSET__mNumWeights);}
    public void mNumWeights(int value) {this.ptr.set(LAYOUT__mNumWeights, OFFSET__mNumWeights, value);}
    public java.lang.foreign.MemorySegment $mNumWeights() {return this.ptr.asSlice(OFFSET__mNumWeights, LAYOUT__mNumWeights);}

    public java.lang.foreign.MemorySegment mArmature() {return this.ptr.get(LAYOUT__mArmature, OFFSET__mArmature);}
    public void mArmature(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__mArmature, OFFSET__mArmature, value);}
    public java.lang.foreign.MemorySegment $mArmature() {return this.ptr.asSlice(OFFSET__mArmature, LAYOUT__mArmature);}

    public java.lang.foreign.MemorySegment mNode() {return this.ptr.get(LAYOUT__mNode, OFFSET__mNode);}
    public void mNode(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__mNode, OFFSET__mNode, value);}
    public java.lang.foreign.MemorySegment $mNode() {return this.ptr.asSlice(OFFSET__mNode, LAYOUT__mNode);}

    public java.lang.foreign.MemorySegment mWeights() {return this.ptr.get(LAYOUT__mWeights, OFFSET__mWeights);}
    public void mWeights(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__mWeights, OFFSET__mWeights, value);}
    public java.lang.foreign.MemorySegment $mWeights() {return this.ptr.asSlice(OFFSET__mWeights, LAYOUT__mWeights);}

    public assimp.aiMatrix4x4 mOffsetMatrix() {return new assimp.aiMatrix4x4(this.ptr.asSlice(OFFSET__mOffsetMatrix, LAYOUT__mOffsetMatrix));}
    public void mOffsetMatrix(java.util.function.Consumer<assimp.aiMatrix4x4> consumer) {consumer.accept(this.mOffsetMatrix());}
    public void mOffsetMatrix(assimp.aiMatrix4x4 value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__mOffsetMatrix, LAYOUT__mOffsetMatrix.byteSize());}
}
