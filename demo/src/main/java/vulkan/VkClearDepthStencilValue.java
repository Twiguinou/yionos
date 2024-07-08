package vulkan;

public record VkClearDepthStencilValue(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__depth = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("depth");
    public static final long OFFSET__depth = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__stencil = java.lang.foreign.ValueLayout.JAVA_INT.withName("stencil");
    public static final long OFFSET__stencil = 4;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__depth,
            LAYOUT__stencil
    ).withByteAlignment(4).withName("VkClearDepthStencilValue");

    public VkClearDepthStencilValue(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkClearDepthStencilValue getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkClearDepthStencilValue(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkClearDepthStencilValue value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public float depth() {return this.ptr.get(LAYOUT__depth, OFFSET__depth);}
    public void depth(float value) {this.ptr.set(LAYOUT__depth, OFFSET__depth, value);}
    public java.lang.foreign.MemorySegment $depth() {return this.ptr.asSlice(OFFSET__depth, LAYOUT__depth);}

    public int stencil() {return this.ptr.get(LAYOUT__stencil, OFFSET__stencil);}
    public void stencil(int value) {this.ptr.set(LAYOUT__stencil, OFFSET__stencil, value);}
    public java.lang.foreign.MemorySegment $stencil() {return this.ptr.asSlice(OFFSET__stencil, LAYOUT__stencil);}
}
