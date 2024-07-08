package vulkan;

public record VkImageSubresourceLayers(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__aspectMask = java.lang.foreign.ValueLayout.JAVA_INT.withName("aspectMask");
    public static final long OFFSET__aspectMask = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__mipLevel = java.lang.foreign.ValueLayout.JAVA_INT.withName("mipLevel");
    public static final long OFFSET__mipLevel = 4;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__baseArrayLayer = java.lang.foreign.ValueLayout.JAVA_INT.withName("baseArrayLayer");
    public static final long OFFSET__baseArrayLayer = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__layerCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("layerCount");
    public static final long OFFSET__layerCount = 12;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__aspectMask,
            LAYOUT__mipLevel,
            LAYOUT__baseArrayLayer,
            LAYOUT__layerCount
    ).withByteAlignment(4).withName("VkImageSubresourceLayers");

    public VkImageSubresourceLayers(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkImageSubresourceLayers getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkImageSubresourceLayers(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkImageSubresourceLayers value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int aspectMask() {return this.ptr.get(LAYOUT__aspectMask, OFFSET__aspectMask);}
    public void aspectMask(int value) {this.ptr.set(LAYOUT__aspectMask, OFFSET__aspectMask, value);}
    public java.lang.foreign.MemorySegment $aspectMask() {return this.ptr.asSlice(OFFSET__aspectMask, LAYOUT__aspectMask);}

    public int mipLevel() {return this.ptr.get(LAYOUT__mipLevel, OFFSET__mipLevel);}
    public void mipLevel(int value) {this.ptr.set(LAYOUT__mipLevel, OFFSET__mipLevel, value);}
    public java.lang.foreign.MemorySegment $mipLevel() {return this.ptr.asSlice(OFFSET__mipLevel, LAYOUT__mipLevel);}

    public int baseArrayLayer() {return this.ptr.get(LAYOUT__baseArrayLayer, OFFSET__baseArrayLayer);}
    public void baseArrayLayer(int value) {this.ptr.set(LAYOUT__baseArrayLayer, OFFSET__baseArrayLayer, value);}
    public java.lang.foreign.MemorySegment $baseArrayLayer() {return this.ptr.asSlice(OFFSET__baseArrayLayer, LAYOUT__baseArrayLayer);}

    public int layerCount() {return this.ptr.get(LAYOUT__layerCount, OFFSET__layerCount);}
    public void layerCount(int value) {this.ptr.set(LAYOUT__layerCount, OFFSET__layerCount, value);}
    public java.lang.foreign.MemorySegment $layerCount() {return this.ptr.asSlice(OFFSET__layerCount, LAYOUT__layerCount);}
}
