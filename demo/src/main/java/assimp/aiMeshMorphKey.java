package assimp;

public record aiMeshMorphKey(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfDouble LAYOUT$mTime = java.lang.foreign.ValueLayout.JAVA_DOUBLE;
    public static final long OFFSET$mTime = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$mValues = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$mValues = 8L;
    public static final java.lang.foreign.AddressLayout LAYOUT$mWeights = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$mWeights = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$mNumValuesAndWeights = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$mNumValuesAndWeights = 24L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$mTime,
            LAYOUT$mValues,
            LAYOUT$mWeights,
            LAYOUT$mNumValuesAndWeights,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("aiMeshMorphKey");

    public aiMeshMorphKey(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static aiMeshMorphKey getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new aiMeshMorphKey(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public double mTime() {return this.ptr.get(LAYOUT$mTime, OFFSET$mTime);}
    public void mTime(double value) {this.ptr.set(LAYOUT$mTime, OFFSET$mTime, value);}
    public java.lang.foreign.MemorySegment mTime_ptr() {return this.ptr.asSlice(OFFSET$mTime, LAYOUT$mTime);}

    public java.lang.foreign.MemorySegment mValues() {return this.ptr.get(LAYOUT$mValues, OFFSET$mValues);}
    public void mValues(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$mValues, OFFSET$mValues, value);}
    public java.lang.foreign.MemorySegment mValues_ptr() {return this.ptr.asSlice(OFFSET$mValues, LAYOUT$mValues);}

    public java.lang.foreign.MemorySegment mWeights() {return this.ptr.get(LAYOUT$mWeights, OFFSET$mWeights);}
    public void mWeights(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$mWeights, OFFSET$mWeights, value);}
    public java.lang.foreign.MemorySegment mWeights_ptr() {return this.ptr.asSlice(OFFSET$mWeights, LAYOUT$mWeights);}

    public int mNumValuesAndWeights() {return this.ptr.get(LAYOUT$mNumValuesAndWeights, OFFSET$mNumValuesAndWeights);}
    public void mNumValuesAndWeights(int value) {this.ptr.set(LAYOUT$mNumValuesAndWeights, OFFSET$mNumValuesAndWeights, value);}
    public java.lang.foreign.MemorySegment mNumValuesAndWeights_ptr() {return this.ptr.asSlice(OFFSET$mNumValuesAndWeights, LAYOUT$mNumValuesAndWeights);}
}
