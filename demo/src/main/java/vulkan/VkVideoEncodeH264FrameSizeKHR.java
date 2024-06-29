package vulkan;

public record VkVideoEncodeH264FrameSizeKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__frameISize = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__frameISize = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__framePSize = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__framePSize = 4;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__frameBSize = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__frameBSize = 8;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__frameISize,
            LAYOUT__framePSize,
            LAYOUT__frameBSize
    ).withByteAlignment(4).withName("VkVideoEncodeH264FrameSizeKHR");

    public VkVideoEncodeH264FrameSizeKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkVideoEncodeH264FrameSizeKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkVideoEncodeH264FrameSizeKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkVideoEncodeH264FrameSizeKHR value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int frameISize() {return this.ptr.get(LAYOUT__frameISize, OFFSET__frameISize);}
    public void frameISize(int value) {this.ptr.set(LAYOUT__frameISize, OFFSET__frameISize, value);}
    public java.lang.foreign.MemorySegment $frameISize() {return this.ptr.asSlice(OFFSET__frameISize, LAYOUT__frameISize);}

    public int framePSize() {return this.ptr.get(LAYOUT__framePSize, OFFSET__framePSize);}
    public void framePSize(int value) {this.ptr.set(LAYOUT__framePSize, OFFSET__framePSize, value);}
    public java.lang.foreign.MemorySegment $framePSize() {return this.ptr.asSlice(OFFSET__framePSize, LAYOUT__framePSize);}

    public int frameBSize() {return this.ptr.get(LAYOUT__frameBSize, OFFSET__frameBSize);}
    public void frameBSize(int value) {this.ptr.set(LAYOUT__frameBSize, OFFSET__frameBSize, value);}
    public java.lang.foreign.MemorySegment $frameBSize() {return this.ptr.asSlice(OFFSET__frameBSize, LAYOUT__frameBSize);}
}
