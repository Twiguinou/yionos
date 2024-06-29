package assimp;

public record aiQuatKey(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfDouble LAYOUT__mTime = java.lang.foreign.ValueLayout.JAVA_DOUBLE;
    public static final long OFFSET__mTime = 0;
    public static final java.lang.foreign.StructLayout LAYOUT__mValue = assimp.aiQuaternion.gRecordLayout;
    public static final long OFFSET__mValue = 8;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__mTime,
            LAYOUT__mValue
    ).withByteAlignment(8).withName("aiQuatKey");

    public aiQuatKey(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static aiQuatKey getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new aiQuatKey(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, aiQuatKey value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public double mTime() {return this.ptr.get(LAYOUT__mTime, OFFSET__mTime);}
    public void mTime(double value) {this.ptr.set(LAYOUT__mTime, OFFSET__mTime, value);}
    public java.lang.foreign.MemorySegment $mTime() {return this.ptr.asSlice(OFFSET__mTime, LAYOUT__mTime);}

    public assimp.aiQuaternion mValue() {return new assimp.aiQuaternion(this.ptr.asSlice(OFFSET__mValue, LAYOUT__mValue));}
    public void mValue(java.util.function.Consumer<assimp.aiQuaternion> consumer) {consumer.accept(this.mValue());}
    public void mValue(assimp.aiQuaternion value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__mValue, LAYOUT__mValue.byteSize());}
}
