package vulkan;

public record StdVideoDecodeH264PictureInfoFlags(java.lang.foreign.MemorySegment ptr)
{

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("StdVideoDecodeH264PictureInfoFlags");

    public StdVideoDecodeH264PictureInfoFlags(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static StdVideoDecodeH264PictureInfoFlags getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new StdVideoDecodeH264PictureInfoFlags(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }
}
