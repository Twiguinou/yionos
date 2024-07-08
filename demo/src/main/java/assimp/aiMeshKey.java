package assimp;

public record aiMeshKey(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfDouble LAYOUT__mTime = java.lang.foreign.ValueLayout.JAVA_DOUBLE.withName("mTime");
    public static final long OFFSET__mTime = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__mValue = java.lang.foreign.ValueLayout.JAVA_INT.withName("mValue");
    public static final long OFFSET__mValue = 8;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__mTime,
            LAYOUT__mValue,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("aiMeshKey");

    public aiMeshKey(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static aiMeshKey getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new aiMeshKey(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, aiMeshKey value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public double mTime() {return this.ptr.get(LAYOUT__mTime, OFFSET__mTime);}
    public void mTime(double value) {this.ptr.set(LAYOUT__mTime, OFFSET__mTime, value);}
    public java.lang.foreign.MemorySegment $mTime() {return this.ptr.asSlice(OFFSET__mTime, LAYOUT__mTime);}

    public int mValue() {return this.ptr.get(LAYOUT__mValue, OFFSET__mValue);}
    public void mValue(int value) {this.ptr.set(LAYOUT__mValue, OFFSET__mValue, value);}
    public java.lang.foreign.MemorySegment $mValue() {return this.ptr.asSlice(OFFSET__mValue, LAYOUT__mValue);}
}
