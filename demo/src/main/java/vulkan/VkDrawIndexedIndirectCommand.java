package vulkan;

public record VkDrawIndexedIndirectCommand(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__indexCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__indexCount = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__instanceCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__instanceCount = 4;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__firstIndex = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__firstIndex = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__vertexOffset = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__vertexOffset = 12;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__firstInstance = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__firstInstance = 16;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__indexCount,
            LAYOUT__instanceCount,
            LAYOUT__firstIndex,
            LAYOUT__vertexOffset,
            LAYOUT__firstInstance
    ).withByteAlignment(4).withName("VkDrawIndexedIndirectCommand");

    public VkDrawIndexedIndirectCommand(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkDrawIndexedIndirectCommand getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkDrawIndexedIndirectCommand(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkDrawIndexedIndirectCommand value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int indexCount() {return this.ptr.get(LAYOUT__indexCount, OFFSET__indexCount);}
    public void indexCount(int value) {this.ptr.set(LAYOUT__indexCount, OFFSET__indexCount, value);}
    public java.lang.foreign.MemorySegment $indexCount() {return this.ptr.asSlice(OFFSET__indexCount, LAYOUT__indexCount);}

    public int instanceCount() {return this.ptr.get(LAYOUT__instanceCount, OFFSET__instanceCount);}
    public void instanceCount(int value) {this.ptr.set(LAYOUT__instanceCount, OFFSET__instanceCount, value);}
    public java.lang.foreign.MemorySegment $instanceCount() {return this.ptr.asSlice(OFFSET__instanceCount, LAYOUT__instanceCount);}

    public int firstIndex() {return this.ptr.get(LAYOUT__firstIndex, OFFSET__firstIndex);}
    public void firstIndex(int value) {this.ptr.set(LAYOUT__firstIndex, OFFSET__firstIndex, value);}
    public java.lang.foreign.MemorySegment $firstIndex() {return this.ptr.asSlice(OFFSET__firstIndex, LAYOUT__firstIndex);}

    public int vertexOffset() {return this.ptr.get(LAYOUT__vertexOffset, OFFSET__vertexOffset);}
    public void vertexOffset(int value) {this.ptr.set(LAYOUT__vertexOffset, OFFSET__vertexOffset, value);}
    public java.lang.foreign.MemorySegment $vertexOffset() {return this.ptr.asSlice(OFFSET__vertexOffset, LAYOUT__vertexOffset);}

    public int firstInstance() {return this.ptr.get(LAYOUT__firstInstance, OFFSET__firstInstance);}
    public void firstInstance(int value) {this.ptr.set(LAYOUT__firstInstance, OFFSET__firstInstance, value);}
    public java.lang.foreign.MemorySegment $firstInstance() {return this.ptr.asSlice(OFFSET__firstInstance, LAYOUT__firstInstance);}
}
