package assimp;

public record aiAnimation(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT__mName = assimp.aiString.gRecordLayout.withName("mName");
    public static final long OFFSET__mName = 0;
    public static final java.lang.foreign.ValueLayout.OfDouble LAYOUT__mDuration = java.lang.foreign.ValueLayout.JAVA_DOUBLE.withName("mDuration");
    public static final long OFFSET__mDuration = 1032;
    public static final java.lang.foreign.ValueLayout.OfDouble LAYOUT__mTicksPerSecond = java.lang.foreign.ValueLayout.JAVA_DOUBLE.withName("mTicksPerSecond");
    public static final long OFFSET__mTicksPerSecond = 1040;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__mNumChannels = java.lang.foreign.ValueLayout.JAVA_INT.withName("mNumChannels");
    public static final long OFFSET__mNumChannels = 1048;
    public static final java.lang.foreign.AddressLayout LAYOUT__mChannels = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("mChannels");
    public static final long OFFSET__mChannels = 1056;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__mNumMeshChannels = java.lang.foreign.ValueLayout.JAVA_INT.withName("mNumMeshChannels");
    public static final long OFFSET__mNumMeshChannels = 1064;
    public static final java.lang.foreign.AddressLayout LAYOUT__mMeshChannels = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("mMeshChannels");
    public static final long OFFSET__mMeshChannels = 1072;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__mNumMorphMeshChannels = java.lang.foreign.ValueLayout.JAVA_INT.withName("mNumMorphMeshChannels");
    public static final long OFFSET__mNumMorphMeshChannels = 1080;
    public static final java.lang.foreign.AddressLayout LAYOUT__mMorphMeshChannels = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("mMorphMeshChannels");
    public static final long OFFSET__mMorphMeshChannels = 1088;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__mName,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__mDuration,
            LAYOUT__mTicksPerSecond,
            LAYOUT__mNumChannels,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__mChannels,
            LAYOUT__mNumMeshChannels,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__mMeshChannels,
            LAYOUT__mNumMorphMeshChannels,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__mMorphMeshChannels
    ).withByteAlignment(8).withName("aiAnimation");

    public aiAnimation(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static aiAnimation getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new aiAnimation(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, aiAnimation value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public assimp.aiString mName() {return new assimp.aiString(this.ptr.asSlice(OFFSET__mName, LAYOUT__mName));}
    public void mName(java.util.function.Consumer<assimp.aiString> consumer) {consumer.accept(this.mName());}
    public void mName(assimp.aiString value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__mName, LAYOUT__mName.byteSize());}

    public double mDuration() {return this.ptr.get(LAYOUT__mDuration, OFFSET__mDuration);}
    public void mDuration(double value) {this.ptr.set(LAYOUT__mDuration, OFFSET__mDuration, value);}
    public java.lang.foreign.MemorySegment $mDuration() {return this.ptr.asSlice(OFFSET__mDuration, LAYOUT__mDuration);}

    public double mTicksPerSecond() {return this.ptr.get(LAYOUT__mTicksPerSecond, OFFSET__mTicksPerSecond);}
    public void mTicksPerSecond(double value) {this.ptr.set(LAYOUT__mTicksPerSecond, OFFSET__mTicksPerSecond, value);}
    public java.lang.foreign.MemorySegment $mTicksPerSecond() {return this.ptr.asSlice(OFFSET__mTicksPerSecond, LAYOUT__mTicksPerSecond);}

    public int mNumChannels() {return this.ptr.get(LAYOUT__mNumChannels, OFFSET__mNumChannels);}
    public void mNumChannels(int value) {this.ptr.set(LAYOUT__mNumChannels, OFFSET__mNumChannels, value);}
    public java.lang.foreign.MemorySegment $mNumChannels() {return this.ptr.asSlice(OFFSET__mNumChannels, LAYOUT__mNumChannels);}

    public java.lang.foreign.MemorySegment mChannels() {return this.ptr.get(LAYOUT__mChannels, OFFSET__mChannels);}
    public void mChannels(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__mChannels, OFFSET__mChannels, value);}
    public java.lang.foreign.MemorySegment $mChannels() {return this.ptr.asSlice(OFFSET__mChannels, LAYOUT__mChannels);}

    public int mNumMeshChannels() {return this.ptr.get(LAYOUT__mNumMeshChannels, OFFSET__mNumMeshChannels);}
    public void mNumMeshChannels(int value) {this.ptr.set(LAYOUT__mNumMeshChannels, OFFSET__mNumMeshChannels, value);}
    public java.lang.foreign.MemorySegment $mNumMeshChannels() {return this.ptr.asSlice(OFFSET__mNumMeshChannels, LAYOUT__mNumMeshChannels);}

    public java.lang.foreign.MemorySegment mMeshChannels() {return this.ptr.get(LAYOUT__mMeshChannels, OFFSET__mMeshChannels);}
    public void mMeshChannels(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__mMeshChannels, OFFSET__mMeshChannels, value);}
    public java.lang.foreign.MemorySegment $mMeshChannels() {return this.ptr.asSlice(OFFSET__mMeshChannels, LAYOUT__mMeshChannels);}

    public int mNumMorphMeshChannels() {return this.ptr.get(LAYOUT__mNumMorphMeshChannels, OFFSET__mNumMorphMeshChannels);}
    public void mNumMorphMeshChannels(int value) {this.ptr.set(LAYOUT__mNumMorphMeshChannels, OFFSET__mNumMorphMeshChannels, value);}
    public java.lang.foreign.MemorySegment $mNumMorphMeshChannels() {return this.ptr.asSlice(OFFSET__mNumMorphMeshChannels, LAYOUT__mNumMorphMeshChannels);}

    public java.lang.foreign.MemorySegment mMorphMeshChannels() {return this.ptr.get(LAYOUT__mMorphMeshChannels, OFFSET__mMorphMeshChannels);}
    public void mMorphMeshChannels(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__mMorphMeshChannels, OFFSET__mMorphMeshChannels, value);}
    public java.lang.foreign.MemorySegment $mMorphMeshChannels() {return this.ptr.asSlice(OFFSET__mMorphMeshChannels, LAYOUT__mMorphMeshChannels);}
}
