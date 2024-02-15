package assimp;

public record aiVectorKey(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfDouble LAYOUT$mTime = java.lang.foreign.ValueLayout.JAVA_DOUBLE;
    public static final long OFFSET$mTime = 0L;
    public static final java.lang.foreign.GroupLayout LAYOUT$mValue = assimp.aiVector3D.gStructLayout;
    public static final long OFFSET$mValue = 8L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$mTime,
            LAYOUT$mValue,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("aiVectorKey");

    public aiVectorKey(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static aiVectorKey getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new aiVectorKey(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public double mTime() {return this.ptr.get(LAYOUT$mTime, OFFSET$mTime);}
    public void mTime(double value) {this.ptr.set(LAYOUT$mTime, OFFSET$mTime, value);}
    public java.lang.foreign.MemorySegment mTime_ptr() {return this.ptr.asSlice(OFFSET$mTime, LAYOUT$mTime);}

    public assimp.aiVector3D mValue() {return new assimp.aiVector3D(this.ptr.asSlice(OFFSET$mValue, LAYOUT$mValue));}
    public void mValue(java.util.function.Consumer<assimp.aiVector3D> consumer) {consumer.accept(this.mValue());}
    public void mValue(assimp.aiVector3D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$mValue, LAYOUT$mValue.byteSize());}
}
