package vulkan;

public record VkMultiDrawInfoEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__firstVertex = java.lang.foreign.ValueLayout.JAVA_INT.withName("firstVertex");
    public static final long OFFSET__firstVertex = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__vertexCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("vertexCount");
    public static final long OFFSET__vertexCount = 4;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__firstVertex,
            LAYOUT__vertexCount
    ).withByteAlignment(4).withName("VkMultiDrawInfoEXT");

    public VkMultiDrawInfoEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkMultiDrawInfoEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkMultiDrawInfoEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkMultiDrawInfoEXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int firstVertex() {return this.ptr.get(LAYOUT__firstVertex, OFFSET__firstVertex);}
    public void firstVertex(int value) {this.ptr.set(LAYOUT__firstVertex, OFFSET__firstVertex, value);}
    public java.lang.foreign.MemorySegment $firstVertex() {return this.ptr.asSlice(OFFSET__firstVertex, LAYOUT__firstVertex);}

    public int vertexCount() {return this.ptr.get(LAYOUT__vertexCount, OFFSET__vertexCount);}
    public void vertexCount(int value) {this.ptr.set(LAYOUT__vertexCount, OFFSET__vertexCount, value);}
    public java.lang.foreign.MemorySegment $vertexCount() {return this.ptr.asSlice(OFFSET__vertexCount, LAYOUT__vertexCount);}
}
