package assimp;

public record aiVertexWeight(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$mVertexId = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$mVertexId = 0L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$mWeight = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$mWeight = 4L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$mVertexId,
            LAYOUT$mWeight
    ).withName("aiVertexWeight");

    public aiVertexWeight(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static aiVertexWeight getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new aiVertexWeight(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int mVertexId() {return this.ptr.get(LAYOUT$mVertexId, OFFSET$mVertexId);}
    public void mVertexId(int value) {this.ptr.set(LAYOUT$mVertexId, OFFSET$mVertexId, value);}
    public java.lang.foreign.MemorySegment mVertexId_ptr() {return this.ptr.asSlice(OFFSET$mVertexId, LAYOUT$mVertexId);}

    public float mWeight() {return this.ptr.get(LAYOUT$mWeight, OFFSET$mWeight);}
    public void mWeight(float value) {this.ptr.set(LAYOUT$mWeight, OFFSET$mWeight, value);}
    public java.lang.foreign.MemorySegment mWeight_ptr() {return this.ptr.asSlice(OFFSET$mWeight, LAYOUT$mWeight);}
}
