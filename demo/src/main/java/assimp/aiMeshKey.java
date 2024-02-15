package assimp;

public record aiMeshKey(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfDouble LAYOUT$mTime = java.lang.foreign.ValueLayout.JAVA_DOUBLE;
    public static final long OFFSET$mTime = 0L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$mValue = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$mValue = 8L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$mTime,
            LAYOUT$mValue,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("aiMeshKey");

    public aiMeshKey(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static aiMeshKey getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new aiMeshKey(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public double mTime() {return this.ptr.get(LAYOUT$mTime, OFFSET$mTime);}
    public void mTime(double value) {this.ptr.set(LAYOUT$mTime, OFFSET$mTime, value);}
    public java.lang.foreign.MemorySegment mTime_ptr() {return this.ptr.asSlice(OFFSET$mTime, LAYOUT$mTime);}

    public int mValue() {return this.ptr.get(LAYOUT$mValue, OFFSET$mValue);}
    public void mValue(int value) {this.ptr.set(LAYOUT$mValue, OFFSET$mValue, value);}
    public java.lang.foreign.MemorySegment mValue_ptr() {return this.ptr.asSlice(OFFSET$mValue, LAYOUT$mValue);}
}
