package vulkan;

public record StdVideoDecodeAV1PictureInfoFlags(java.lang.foreign.MemorySegment ptr)
{

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(4).withName("StdVideoDecodeAV1PictureInfoFlags");

    public StdVideoDecodeAV1PictureInfoFlags(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static StdVideoDecodeAV1PictureInfoFlags getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new StdVideoDecodeAV1PictureInfoFlags(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, StdVideoDecodeAV1PictureInfoFlags value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }
}
