package assimp;

public record aiAnimation(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.GroupLayout LAYOUT$mName = assimp.aiString.gStructLayout;
    public static final long OFFSET$mName = 0L;
    public static final java.lang.foreign.ValueLayout.OfDouble LAYOUT$mDuration = java.lang.foreign.ValueLayout.JAVA_DOUBLE;
    public static final long OFFSET$mDuration = 1032L;
    public static final java.lang.foreign.ValueLayout.OfDouble LAYOUT$mTicksPerSecond = java.lang.foreign.ValueLayout.JAVA_DOUBLE;
    public static final long OFFSET$mTicksPerSecond = 1040L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$mNumChannels = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$mNumChannels = 1048L;
    public static final java.lang.foreign.AddressLayout LAYOUT$mChannels = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$mChannels = 1056L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$mNumMeshChannels = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$mNumMeshChannels = 1064L;
    public static final java.lang.foreign.AddressLayout LAYOUT$mMeshChannels = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$mMeshChannels = 1072L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$mNumMorphMeshChannels = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$mNumMorphMeshChannels = 1080L;
    public static final java.lang.foreign.AddressLayout LAYOUT$mMorphMeshChannels = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$mMorphMeshChannels = 1088L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$mName,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$mDuration,
            LAYOUT$mTicksPerSecond,
            LAYOUT$mNumChannels,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$mChannels,
            LAYOUT$mNumMeshChannels,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$mMeshChannels,
            LAYOUT$mNumMorphMeshChannels,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$mMorphMeshChannels
    ).withName("aiAnimation");

    public aiAnimation(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static aiAnimation getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new aiAnimation(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public assimp.aiString mName() {return new assimp.aiString(this.ptr.asSlice(OFFSET$mName, LAYOUT$mName));}
    public void mName(java.util.function.Consumer<assimp.aiString> consumer) {consumer.accept(this.mName());}
    public void mName(assimp.aiString value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$mName, LAYOUT$mName.byteSize());}

    public double mDuration() {return this.ptr.get(LAYOUT$mDuration, OFFSET$mDuration);}
    public void mDuration(double value) {this.ptr.set(LAYOUT$mDuration, OFFSET$mDuration, value);}
    public java.lang.foreign.MemorySegment mDuration_ptr() {return this.ptr.asSlice(OFFSET$mDuration, LAYOUT$mDuration);}

    public double mTicksPerSecond() {return this.ptr.get(LAYOUT$mTicksPerSecond, OFFSET$mTicksPerSecond);}
    public void mTicksPerSecond(double value) {this.ptr.set(LAYOUT$mTicksPerSecond, OFFSET$mTicksPerSecond, value);}
    public java.lang.foreign.MemorySegment mTicksPerSecond_ptr() {return this.ptr.asSlice(OFFSET$mTicksPerSecond, LAYOUT$mTicksPerSecond);}

    public int mNumChannels() {return this.ptr.get(LAYOUT$mNumChannels, OFFSET$mNumChannels);}
    public void mNumChannels(int value) {this.ptr.set(LAYOUT$mNumChannels, OFFSET$mNumChannels, value);}
    public java.lang.foreign.MemorySegment mNumChannels_ptr() {return this.ptr.asSlice(OFFSET$mNumChannels, LAYOUT$mNumChannels);}

    public java.lang.foreign.MemorySegment mChannels() {return this.ptr.get(LAYOUT$mChannels, OFFSET$mChannels);}
    public void mChannels(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$mChannels, OFFSET$mChannels, value);}
    public java.lang.foreign.MemorySegment mChannels_ptr() {return this.ptr.asSlice(OFFSET$mChannels, LAYOUT$mChannels);}

    public int mNumMeshChannels() {return this.ptr.get(LAYOUT$mNumMeshChannels, OFFSET$mNumMeshChannels);}
    public void mNumMeshChannels(int value) {this.ptr.set(LAYOUT$mNumMeshChannels, OFFSET$mNumMeshChannels, value);}
    public java.lang.foreign.MemorySegment mNumMeshChannels_ptr() {return this.ptr.asSlice(OFFSET$mNumMeshChannels, LAYOUT$mNumMeshChannels);}

    public java.lang.foreign.MemorySegment mMeshChannels() {return this.ptr.get(LAYOUT$mMeshChannels, OFFSET$mMeshChannels);}
    public void mMeshChannels(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$mMeshChannels, OFFSET$mMeshChannels, value);}
    public java.lang.foreign.MemorySegment mMeshChannels_ptr() {return this.ptr.asSlice(OFFSET$mMeshChannels, LAYOUT$mMeshChannels);}

    public int mNumMorphMeshChannels() {return this.ptr.get(LAYOUT$mNumMorphMeshChannels, OFFSET$mNumMorphMeshChannels);}
    public void mNumMorphMeshChannels(int value) {this.ptr.set(LAYOUT$mNumMorphMeshChannels, OFFSET$mNumMorphMeshChannels, value);}
    public java.lang.foreign.MemorySegment mNumMorphMeshChannels_ptr() {return this.ptr.asSlice(OFFSET$mNumMorphMeshChannels, LAYOUT$mNumMorphMeshChannels);}

    public java.lang.foreign.MemorySegment mMorphMeshChannels() {return this.ptr.get(LAYOUT$mMorphMeshChannels, OFFSET$mMorphMeshChannels);}
    public void mMorphMeshChannels(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$mMorphMeshChannels, OFFSET$mMorphMeshChannels, value);}
    public java.lang.foreign.MemorySegment mMorphMeshChannels_ptr() {return this.ptr.asSlice(OFFSET$mMorphMeshChannels, LAYOUT$mMorphMeshChannels);}
}
