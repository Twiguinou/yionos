package vulkan;

public record VkMultiDrawIndexedInfoEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__firstIndex = java.lang.foreign.ValueLayout.JAVA_INT.withName("firstIndex");
    public static final long OFFSET__firstIndex = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__indexCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("indexCount");
    public static final long OFFSET__indexCount = 4;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__vertexOffset = java.lang.foreign.ValueLayout.JAVA_INT.withName("vertexOffset");
    public static final long OFFSET__vertexOffset = 8;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__firstIndex,
            LAYOUT__indexCount,
            LAYOUT__vertexOffset
    ).withByteAlignment(4).withName("VkMultiDrawIndexedInfoEXT");

    public VkMultiDrawIndexedInfoEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkMultiDrawIndexedInfoEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkMultiDrawIndexedInfoEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkMultiDrawIndexedInfoEXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int firstIndex() {return this.ptr.get(LAYOUT__firstIndex, OFFSET__firstIndex);}
    public void firstIndex(int value) {this.ptr.set(LAYOUT__firstIndex, OFFSET__firstIndex, value);}
    public java.lang.foreign.MemorySegment $firstIndex() {return this.ptr.asSlice(OFFSET__firstIndex, LAYOUT__firstIndex);}

    public int indexCount() {return this.ptr.get(LAYOUT__indexCount, OFFSET__indexCount);}
    public void indexCount(int value) {this.ptr.set(LAYOUT__indexCount, OFFSET__indexCount, value);}
    public java.lang.foreign.MemorySegment $indexCount() {return this.ptr.asSlice(OFFSET__indexCount, LAYOUT__indexCount);}

    public int vertexOffset() {return this.ptr.get(LAYOUT__vertexOffset, OFFSET__vertexOffset);}
    public void vertexOffset(int value) {this.ptr.set(LAYOUT__vertexOffset, OFFSET__vertexOffset, value);}
    public java.lang.foreign.MemorySegment $vertexOffset() {return this.ptr.asSlice(OFFSET__vertexOffset, LAYOUT__vertexOffset);}
}
