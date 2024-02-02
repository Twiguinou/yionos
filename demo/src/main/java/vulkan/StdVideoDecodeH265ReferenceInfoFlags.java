package vulkan;

public record StdVideoDecodeH265ReferenceInfoFlags(java.lang.foreign.MemorySegment ptr)
{

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("StdVideoDecodeH265ReferenceInfoFlags");

    public StdVideoDecodeH265ReferenceInfoFlags(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static StdVideoDecodeH265ReferenceInfoFlags getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new StdVideoDecodeH265ReferenceInfoFlags(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }
}
