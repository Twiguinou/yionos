package vulkan;

public record VkDrawIndirectCommand(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__vertexCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("vertexCount");
    public static final long OFFSET__vertexCount = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__instanceCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("instanceCount");
    public static final long OFFSET__instanceCount = 4;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__firstVertex = java.lang.foreign.ValueLayout.JAVA_INT.withName("firstVertex");
    public static final long OFFSET__firstVertex = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__firstInstance = java.lang.foreign.ValueLayout.JAVA_INT.withName("firstInstance");
    public static final long OFFSET__firstInstance = 12;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__vertexCount,
            LAYOUT__instanceCount,
            LAYOUT__firstVertex,
            LAYOUT__firstInstance
    ).withByteAlignment(4).withName("VkDrawIndirectCommand");

    public VkDrawIndirectCommand(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkDrawIndirectCommand getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkDrawIndirectCommand(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkDrawIndirectCommand value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int vertexCount() {return this.ptr.get(LAYOUT__vertexCount, OFFSET__vertexCount);}
    public void vertexCount(int value) {this.ptr.set(LAYOUT__vertexCount, OFFSET__vertexCount, value);}
    public java.lang.foreign.MemorySegment $vertexCount() {return this.ptr.asSlice(OFFSET__vertexCount, LAYOUT__vertexCount);}

    public int instanceCount() {return this.ptr.get(LAYOUT__instanceCount, OFFSET__instanceCount);}
    public void instanceCount(int value) {this.ptr.set(LAYOUT__instanceCount, OFFSET__instanceCount, value);}
    public java.lang.foreign.MemorySegment $instanceCount() {return this.ptr.asSlice(OFFSET__instanceCount, LAYOUT__instanceCount);}

    public int firstVertex() {return this.ptr.get(LAYOUT__firstVertex, OFFSET__firstVertex);}
    public void firstVertex(int value) {this.ptr.set(LAYOUT__firstVertex, OFFSET__firstVertex, value);}
    public java.lang.foreign.MemorySegment $firstVertex() {return this.ptr.asSlice(OFFSET__firstVertex, LAYOUT__firstVertex);}

    public int firstInstance() {return this.ptr.get(LAYOUT__firstInstance, OFFSET__firstInstance);}
    public void firstInstance(int value) {this.ptr.set(LAYOUT__firstInstance, OFFSET__firstInstance, value);}
    public java.lang.foreign.MemorySegment $firstInstance() {return this.ptr.asSlice(OFFSET__firstInstance, LAYOUT__firstInstance);}
}
