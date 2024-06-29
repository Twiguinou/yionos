package assimp;

public record aiNodeAnim(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT__mNodeName = assimp.aiString.gRecordLayout;
    public static final long OFFSET__mNodeName = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__mNumPositionKeys = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__mNumPositionKeys = 1028;
    public static final java.lang.foreign.AddressLayout LAYOUT__mPositionKeys = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__mPositionKeys = 1032;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__mNumRotationKeys = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__mNumRotationKeys = 1040;
    public static final java.lang.foreign.AddressLayout LAYOUT__mRotationKeys = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__mRotationKeys = 1048;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__mNumScalingKeys = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__mNumScalingKeys = 1056;
    public static final java.lang.foreign.AddressLayout LAYOUT__mScalingKeys = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__mScalingKeys = 1064;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__mPreState = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__mPreState = 1072;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__mPostState = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__mPostState = 1076;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__mNodeName,
            LAYOUT__mNumPositionKeys,
            LAYOUT__mPositionKeys,
            LAYOUT__mNumRotationKeys,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__mRotationKeys,
            LAYOUT__mNumScalingKeys,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__mScalingKeys,
            LAYOUT__mPreState,
            LAYOUT__mPostState
    ).withByteAlignment(8).withName("aiNodeAnim");

    public aiNodeAnim(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static aiNodeAnim getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new aiNodeAnim(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, aiNodeAnim value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public assimp.aiString mNodeName() {return new assimp.aiString(this.ptr.asSlice(OFFSET__mNodeName, LAYOUT__mNodeName));}
    public void mNodeName(java.util.function.Consumer<assimp.aiString> consumer) {consumer.accept(this.mNodeName());}
    public void mNodeName(assimp.aiString value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__mNodeName, LAYOUT__mNodeName.byteSize());}

    public int mNumPositionKeys() {return this.ptr.get(LAYOUT__mNumPositionKeys, OFFSET__mNumPositionKeys);}
    public void mNumPositionKeys(int value) {this.ptr.set(LAYOUT__mNumPositionKeys, OFFSET__mNumPositionKeys, value);}
    public java.lang.foreign.MemorySegment $mNumPositionKeys() {return this.ptr.asSlice(OFFSET__mNumPositionKeys, LAYOUT__mNumPositionKeys);}

    public java.lang.foreign.MemorySegment mPositionKeys() {return this.ptr.get(LAYOUT__mPositionKeys, OFFSET__mPositionKeys);}
    public void mPositionKeys(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__mPositionKeys, OFFSET__mPositionKeys, value);}
    public java.lang.foreign.MemorySegment $mPositionKeys() {return this.ptr.asSlice(OFFSET__mPositionKeys, LAYOUT__mPositionKeys);}

    public int mNumRotationKeys() {return this.ptr.get(LAYOUT__mNumRotationKeys, OFFSET__mNumRotationKeys);}
    public void mNumRotationKeys(int value) {this.ptr.set(LAYOUT__mNumRotationKeys, OFFSET__mNumRotationKeys, value);}
    public java.lang.foreign.MemorySegment $mNumRotationKeys() {return this.ptr.asSlice(OFFSET__mNumRotationKeys, LAYOUT__mNumRotationKeys);}

    public java.lang.foreign.MemorySegment mRotationKeys() {return this.ptr.get(LAYOUT__mRotationKeys, OFFSET__mRotationKeys);}
    public void mRotationKeys(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__mRotationKeys, OFFSET__mRotationKeys, value);}
    public java.lang.foreign.MemorySegment $mRotationKeys() {return this.ptr.asSlice(OFFSET__mRotationKeys, LAYOUT__mRotationKeys);}

    public int mNumScalingKeys() {return this.ptr.get(LAYOUT__mNumScalingKeys, OFFSET__mNumScalingKeys);}
    public void mNumScalingKeys(int value) {this.ptr.set(LAYOUT__mNumScalingKeys, OFFSET__mNumScalingKeys, value);}
    public java.lang.foreign.MemorySegment $mNumScalingKeys() {return this.ptr.asSlice(OFFSET__mNumScalingKeys, LAYOUT__mNumScalingKeys);}

    public java.lang.foreign.MemorySegment mScalingKeys() {return this.ptr.get(LAYOUT__mScalingKeys, OFFSET__mScalingKeys);}
    public void mScalingKeys(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__mScalingKeys, OFFSET__mScalingKeys, value);}
    public java.lang.foreign.MemorySegment $mScalingKeys() {return this.ptr.asSlice(OFFSET__mScalingKeys, LAYOUT__mScalingKeys);}

    public int mPreState() {return this.ptr.get(LAYOUT__mPreState, OFFSET__mPreState);}
    public void mPreState(int value) {this.ptr.set(LAYOUT__mPreState, OFFSET__mPreState, value);}
    public java.lang.foreign.MemorySegment $mPreState() {return this.ptr.asSlice(OFFSET__mPreState, LAYOUT__mPreState);}

    public int mPostState() {return this.ptr.get(LAYOUT__mPostState, OFFSET__mPostState);}
    public void mPostState(int value) {this.ptr.set(LAYOUT__mPostState, OFFSET__mPostState, value);}
    public java.lang.foreign.MemorySegment $mPostState() {return this.ptr.asSlice(OFFSET__mPostState, LAYOUT__mPostState);}
}
