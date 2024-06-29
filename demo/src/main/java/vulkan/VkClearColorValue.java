package vulkan;

public record VkClearColorValue(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.SequenceLayout LAYOUT__float32 = java.lang.foreign.MemoryLayout.sequenceLayout(4, java.lang.foreign.ValueLayout.JAVA_FLOAT);
    public static final java.lang.foreign.SequenceLayout LAYOUT__int32 = java.lang.foreign.MemoryLayout.sequenceLayout(4, java.lang.foreign.ValueLayout.JAVA_INT);
    public static final java.lang.foreign.SequenceLayout LAYOUT__uint32 = java.lang.foreign.MemoryLayout.sequenceLayout(4, java.lang.foreign.ValueLayout.JAVA_INT);

    public static final java.lang.foreign.UnionLayout gRecordLayout = java.lang.foreign.MemoryLayout.unionLayout(
            LAYOUT__float32,
            LAYOUT__int32,
            LAYOUT__uint32
    ).withByteAlignment(4).withName("VkClearColorValue");

    public VkClearColorValue(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkClearColorValue getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkClearColorValue(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkClearColorValue value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public java.lang.foreign.MemorySegment float32() {return this.ptr.asSlice(0, LAYOUT__float32);}
    public float float32(int index) {return this.float32().getAtIndex(java.lang.foreign.ValueLayout.JAVA_FLOAT, index);}
    public void float32(int index, float value) {this.float32().setAtIndex(java.lang.foreign.ValueLayout.JAVA_FLOAT, index, value);}

    public java.lang.foreign.MemorySegment int32() {return this.ptr.asSlice(0, LAYOUT__int32);}
    public int int32(int index) {return this.int32().getAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, index);}
    public void int32(int index, int value) {this.int32().setAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, index, value);}

    public java.lang.foreign.MemorySegment uint32() {return this.ptr.asSlice(0, LAYOUT__uint32);}
    public int uint32(int index) {return this.uint32().getAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, index);}
    public void uint32(int index, int value) {this.uint32().setAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, index, value);}
}
