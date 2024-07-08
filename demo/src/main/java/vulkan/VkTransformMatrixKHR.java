package vulkan;

public record VkTransformMatrixKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.SequenceLayout LAYOUT__matrix = java.lang.foreign.MemoryLayout.sequenceLayout(3, java.lang.foreign.MemoryLayout.sequenceLayout(4, java.lang.foreign.ValueLayout.JAVA_FLOAT)).withName("matrix");
    public static final long OFFSET__matrix = 0;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__matrix
    ).withByteAlignment(4).withName("VkTransformMatrixKHR");

    public VkTransformMatrixKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkTransformMatrixKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkTransformMatrixKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkTransformMatrixKHR value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public java.lang.foreign.MemorySegment matrix() {return this.ptr.asSlice(OFFSET__matrix, LAYOUT__matrix);}
}
