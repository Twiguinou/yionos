package vulkan;

public record VkVideoEncodeH264FrameSizeKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$frameISize = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$frameISize = 0L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$framePSize = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$framePSize = 4L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$frameBSize = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$frameBSize = 8L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$frameISize,
            LAYOUT$framePSize,
            LAYOUT$frameBSize
    ).withName("VkVideoEncodeH264FrameSizeKHR");

    public VkVideoEncodeH264FrameSizeKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VkVideoEncodeH264FrameSizeKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VkVideoEncodeH264FrameSizeKHR(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int frameISize() {return this.ptr.get(LAYOUT$frameISize, OFFSET$frameISize);}
    public void frameISize(int value) {this.ptr.set(LAYOUT$frameISize, OFFSET$frameISize, value);}
    public java.lang.foreign.MemorySegment frameISize_ptr() {return this.ptr.asSlice(OFFSET$frameISize, LAYOUT$frameISize);}

    public int framePSize() {return this.ptr.get(LAYOUT$framePSize, OFFSET$framePSize);}
    public void framePSize(int value) {this.ptr.set(LAYOUT$framePSize, OFFSET$framePSize, value);}
    public java.lang.foreign.MemorySegment framePSize_ptr() {return this.ptr.asSlice(OFFSET$framePSize, LAYOUT$framePSize);}

    public int frameBSize() {return this.ptr.get(LAYOUT$frameBSize, OFFSET$frameBSize);}
    public void frameBSize(int value) {this.ptr.set(LAYOUT$frameBSize, OFFSET$frameBSize, value);}
    public java.lang.foreign.MemorySegment frameBSize_ptr() {return this.ptr.asSlice(OFFSET$frameBSize, LAYOUT$frameBSize);}
}
