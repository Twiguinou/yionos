package vulkan;

public record StdVideoEncodeH264PictureInfoFlags(java.lang.foreign.MemorySegment ptr)
{

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("StdVideoEncodeH264PictureInfoFlags");

    public StdVideoEncodeH264PictureInfoFlags(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static StdVideoEncodeH264PictureInfoFlags getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new StdVideoEncodeH264PictureInfoFlags(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }
}
