package vulkan;

public record VkImageSubresource(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__aspectMask = java.lang.foreign.ValueLayout.JAVA_INT.withName("aspectMask");
    public static final long OFFSET__aspectMask = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__mipLevel = java.lang.foreign.ValueLayout.JAVA_INT.withName("mipLevel");
    public static final long OFFSET__mipLevel = 4;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__arrayLayer = java.lang.foreign.ValueLayout.JAVA_INT.withName("arrayLayer");
    public static final long OFFSET__arrayLayer = 8;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__aspectMask,
            LAYOUT__mipLevel,
            LAYOUT__arrayLayer
    ).withByteAlignment(4).withName("VkImageSubresource");

    public VkImageSubresource(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkImageSubresource getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkImageSubresource(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkImageSubresource value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int aspectMask() {return this.ptr.get(LAYOUT__aspectMask, OFFSET__aspectMask);}
    public void aspectMask(int value) {this.ptr.set(LAYOUT__aspectMask, OFFSET__aspectMask, value);}
    public java.lang.foreign.MemorySegment $aspectMask() {return this.ptr.asSlice(OFFSET__aspectMask, LAYOUT__aspectMask);}

    public int mipLevel() {return this.ptr.get(LAYOUT__mipLevel, OFFSET__mipLevel);}
    public void mipLevel(int value) {this.ptr.set(LAYOUT__mipLevel, OFFSET__mipLevel, value);}
    public java.lang.foreign.MemorySegment $mipLevel() {return this.ptr.asSlice(OFFSET__mipLevel, LAYOUT__mipLevel);}

    public int arrayLayer() {return this.ptr.get(LAYOUT__arrayLayer, OFFSET__arrayLayer);}
    public void arrayLayer(int value) {this.ptr.set(LAYOUT__arrayLayer, OFFSET__arrayLayer, value);}
    public java.lang.foreign.MemorySegment $arrayLayer() {return this.ptr.asSlice(OFFSET__arrayLayer, LAYOUT__arrayLayer);}
}
