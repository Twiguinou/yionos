package assimp;

public record aiQuatKey(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfDouble LAYOUT$mTime = java.lang.foreign.ValueLayout.JAVA_DOUBLE;
    public static final long OFFSET$mTime = 0L;
    public static final java.lang.foreign.GroupLayout LAYOUT$mValue = assimp.aiQuaternion.gStructLayout;
    public static final long OFFSET$mValue = 8L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$mTime,
            LAYOUT$mValue
    ).withName("aiQuatKey");

    public aiQuatKey(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static aiQuatKey getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new aiQuatKey(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public double mTime() {return this.ptr.get(LAYOUT$mTime, OFFSET$mTime);}
    public void mTime(double value) {this.ptr.set(LAYOUT$mTime, OFFSET$mTime, value);}
    public java.lang.foreign.MemorySegment mTime_ptr() {return this.ptr.asSlice(OFFSET$mTime, LAYOUT$mTime);}

    public assimp.aiQuaternion mValue() {return new assimp.aiQuaternion(this.ptr.asSlice(OFFSET$mValue, LAYOUT$mValue));}
    public void mValue(java.util.function.Consumer<assimp.aiQuaternion> consumer) {consumer.accept(this.mValue());}
    public void mValue(assimp.aiQuaternion value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$mValue, LAYOUT$mValue.byteSize());}
}
