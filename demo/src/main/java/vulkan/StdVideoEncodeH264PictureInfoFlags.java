package vulkan;

public record StdVideoEncodeH264PictureInfoFlags(java.lang.foreign.MemorySegment ptr)
{

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(4).withName("StdVideoEncodeH264PictureInfoFlags");

    public StdVideoEncodeH264PictureInfoFlags(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static StdVideoEncodeH264PictureInfoFlags getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new StdVideoEncodeH264PictureInfoFlags(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, StdVideoEncodeH264PictureInfoFlags value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }
}
