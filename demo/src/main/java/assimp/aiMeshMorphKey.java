package assimp;

public record aiMeshMorphKey(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfDouble LAYOUT__mTime = java.lang.foreign.ValueLayout.JAVA_DOUBLE.withName("mTime");
    public static final long OFFSET__mTime = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__mValues = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("mValues");
    public static final long OFFSET__mValues = 8;
    public static final java.lang.foreign.AddressLayout LAYOUT__mWeights = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("mWeights");
    public static final long OFFSET__mWeights = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__mNumValuesAndWeights = java.lang.foreign.ValueLayout.JAVA_INT.withName("mNumValuesAndWeights");
    public static final long OFFSET__mNumValuesAndWeights = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__mTime,
            LAYOUT__mValues,
            LAYOUT__mWeights,
            LAYOUT__mNumValuesAndWeights,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("aiMeshMorphKey");

    public aiMeshMorphKey(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static aiMeshMorphKey getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new aiMeshMorphKey(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, aiMeshMorphKey value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public double mTime() {return this.ptr.get(LAYOUT__mTime, OFFSET__mTime);}
    public void mTime(double value) {this.ptr.set(LAYOUT__mTime, OFFSET__mTime, value);}
    public java.lang.foreign.MemorySegment $mTime() {return this.ptr.asSlice(OFFSET__mTime, LAYOUT__mTime);}

    public java.lang.foreign.MemorySegment mValues() {return this.ptr.get(LAYOUT__mValues, OFFSET__mValues);}
    public void mValues(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__mValues, OFFSET__mValues, value);}
    public java.lang.foreign.MemorySegment $mValues() {return this.ptr.asSlice(OFFSET__mValues, LAYOUT__mValues);}

    public java.lang.foreign.MemorySegment mWeights() {return this.ptr.get(LAYOUT__mWeights, OFFSET__mWeights);}
    public void mWeights(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__mWeights, OFFSET__mWeights, value);}
    public java.lang.foreign.MemorySegment $mWeights() {return this.ptr.asSlice(OFFSET__mWeights, LAYOUT__mWeights);}

    public int mNumValuesAndWeights() {return this.ptr.get(LAYOUT__mNumValuesAndWeights, OFFSET__mNumValuesAndWeights);}
    public void mNumValuesAndWeights(int value) {this.ptr.set(LAYOUT__mNumValuesAndWeights, OFFSET__mNumValuesAndWeights, value);}
    public java.lang.foreign.MemorySegment $mNumValuesAndWeights() {return this.ptr.asSlice(OFFSET__mNumValuesAndWeights, LAYOUT__mNumValuesAndWeights);}
}
