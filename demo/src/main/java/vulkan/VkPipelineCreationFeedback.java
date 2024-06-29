package vulkan;

public record VkPipelineCreationFeedback(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__flags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__flags = 0;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__duration = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__duration = 8;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__flags,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__duration
    ).withByteAlignment(8).withName("VkPipelineCreationFeedback");

    public VkPipelineCreationFeedback(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPipelineCreationFeedback getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPipelineCreationFeedback(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPipelineCreationFeedback value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int flags() {return this.ptr.get(LAYOUT__flags, OFFSET__flags);}
    public void flags(int value) {this.ptr.set(LAYOUT__flags, OFFSET__flags, value);}
    public java.lang.foreign.MemorySegment $flags() {return this.ptr.asSlice(OFFSET__flags, LAYOUT__flags);}

    public long duration() {return this.ptr.get(LAYOUT__duration, OFFSET__duration);}
    public void duration(long value) {this.ptr.set(LAYOUT__duration, OFFSET__duration, value);}
    public java.lang.foreign.MemorySegment $duration() {return this.ptr.asSlice(OFFSET__duration, LAYOUT__duration);}
}
