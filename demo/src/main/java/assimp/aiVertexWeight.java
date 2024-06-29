package assimp;

public record aiVertexWeight(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__mVertexId = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__mVertexId = 0;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__mWeight = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET__mWeight = 4;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__mVertexId,
            LAYOUT__mWeight
    ).withByteAlignment(4).withName("aiVertexWeight");

    public aiVertexWeight(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static aiVertexWeight getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new aiVertexWeight(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, aiVertexWeight value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int mVertexId() {return this.ptr.get(LAYOUT__mVertexId, OFFSET__mVertexId);}
    public void mVertexId(int value) {this.ptr.set(LAYOUT__mVertexId, OFFSET__mVertexId, value);}
    public java.lang.foreign.MemorySegment $mVertexId() {return this.ptr.asSlice(OFFSET__mVertexId, LAYOUT__mVertexId);}

    public float mWeight() {return this.ptr.get(LAYOUT__mWeight, OFFSET__mWeight);}
    public void mWeight(float value) {this.ptr.set(LAYOUT__mWeight, OFFSET__mWeight, value);}
    public java.lang.foreign.MemorySegment $mWeight() {return this.ptr.asSlice(OFFSET__mWeight, LAYOUT__mWeight);}
}
