package assimp;

public record aiNodeAnim(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.GroupLayout LAYOUT$mNodeName = assimp.aiString.gStructLayout;
    public static final long OFFSET$mNodeName = 0L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$mNumPositionKeys = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$mNumPositionKeys = 1028L;
    public static final java.lang.foreign.AddressLayout LAYOUT$mPositionKeys = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$mPositionKeys = 1032L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$mNumRotationKeys = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$mNumRotationKeys = 1040L;
    public static final java.lang.foreign.AddressLayout LAYOUT$mRotationKeys = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$mRotationKeys = 1048L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$mNumScalingKeys = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$mNumScalingKeys = 1056L;
    public static final java.lang.foreign.AddressLayout LAYOUT$mScalingKeys = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$mScalingKeys = 1064L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$mPreState = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$mPreState = 1072L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$mPostState = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$mPostState = 1076L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$mNodeName,
            LAYOUT$mNumPositionKeys,
            LAYOUT$mPositionKeys,
            LAYOUT$mNumRotationKeys,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$mRotationKeys,
            LAYOUT$mNumScalingKeys,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$mScalingKeys,
            LAYOUT$mPreState,
            LAYOUT$mPostState
    ).withName("aiNodeAnim");

    public aiNodeAnim(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static aiNodeAnim getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new aiNodeAnim(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public assimp.aiString mNodeName() {return new assimp.aiString(this.ptr.asSlice(OFFSET$mNodeName, LAYOUT$mNodeName));}
    public void mNodeName(java.util.function.Consumer<assimp.aiString> consumer) {consumer.accept(this.mNodeName());}
    public void mNodeName(assimp.aiString value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$mNodeName, LAYOUT$mNodeName.byteSize());}

    public int mNumPositionKeys() {return this.ptr.get(LAYOUT$mNumPositionKeys, OFFSET$mNumPositionKeys);}
    public void mNumPositionKeys(int value) {this.ptr.set(LAYOUT$mNumPositionKeys, OFFSET$mNumPositionKeys, value);}
    public java.lang.foreign.MemorySegment mNumPositionKeys_ptr() {return this.ptr.asSlice(OFFSET$mNumPositionKeys, LAYOUT$mNumPositionKeys);}

    public java.lang.foreign.MemorySegment mPositionKeys() {return this.ptr.get(LAYOUT$mPositionKeys, OFFSET$mPositionKeys);}
    public void mPositionKeys(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$mPositionKeys, OFFSET$mPositionKeys, value);}
    public java.lang.foreign.MemorySegment mPositionKeys_ptr() {return this.ptr.asSlice(OFFSET$mPositionKeys, LAYOUT$mPositionKeys);}

    public int mNumRotationKeys() {return this.ptr.get(LAYOUT$mNumRotationKeys, OFFSET$mNumRotationKeys);}
    public void mNumRotationKeys(int value) {this.ptr.set(LAYOUT$mNumRotationKeys, OFFSET$mNumRotationKeys, value);}
    public java.lang.foreign.MemorySegment mNumRotationKeys_ptr() {return this.ptr.asSlice(OFFSET$mNumRotationKeys, LAYOUT$mNumRotationKeys);}

    public java.lang.foreign.MemorySegment mRotationKeys() {return this.ptr.get(LAYOUT$mRotationKeys, OFFSET$mRotationKeys);}
    public void mRotationKeys(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$mRotationKeys, OFFSET$mRotationKeys, value);}
    public java.lang.foreign.MemorySegment mRotationKeys_ptr() {return this.ptr.asSlice(OFFSET$mRotationKeys, LAYOUT$mRotationKeys);}

    public int mNumScalingKeys() {return this.ptr.get(LAYOUT$mNumScalingKeys, OFFSET$mNumScalingKeys);}
    public void mNumScalingKeys(int value) {this.ptr.set(LAYOUT$mNumScalingKeys, OFFSET$mNumScalingKeys, value);}
    public java.lang.foreign.MemorySegment mNumScalingKeys_ptr() {return this.ptr.asSlice(OFFSET$mNumScalingKeys, LAYOUT$mNumScalingKeys);}

    public java.lang.foreign.MemorySegment mScalingKeys() {return this.ptr.get(LAYOUT$mScalingKeys, OFFSET$mScalingKeys);}
    public void mScalingKeys(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$mScalingKeys, OFFSET$mScalingKeys, value);}
    public java.lang.foreign.MemorySegment mScalingKeys_ptr() {return this.ptr.asSlice(OFFSET$mScalingKeys, LAYOUT$mScalingKeys);}

    public int mPreState() {return this.ptr.get(LAYOUT$mPreState, OFFSET$mPreState);}
    public void mPreState(int value) {this.ptr.set(LAYOUT$mPreState, OFFSET$mPreState, value);}
    public java.lang.foreign.MemorySegment mPreState_ptr() {return this.ptr.asSlice(OFFSET$mPreState, LAYOUT$mPreState);}

    public int mPostState() {return this.ptr.get(LAYOUT$mPostState, OFFSET$mPostState);}
    public void mPostState(int value) {this.ptr.set(LAYOUT$mPostState, OFFSET$mPostState, value);}
    public java.lang.foreign.MemorySegment mPostState_ptr() {return this.ptr.asSlice(OFFSET$mPostState, LAYOUT$mPostState);}
}
