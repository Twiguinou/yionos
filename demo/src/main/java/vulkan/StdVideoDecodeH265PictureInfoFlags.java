package vulkan;

public record StdVideoDecodeH265PictureInfoFlags(java.lang.foreign.MemorySegment ptr)
{

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("StdVideoDecodeH265PictureInfoFlags");

    public StdVideoDecodeH265PictureInfoFlags(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static StdVideoDecodeH265PictureInfoFlags getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new StdVideoDecodeH265PictureInfoFlags(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }
}
