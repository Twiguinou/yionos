package vulkan;

public record VkImageSubresourceRange(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__aspectMask = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__aspectMask = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__baseMipLevel = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__baseMipLevel = 4;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__levelCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__levelCount = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__baseArrayLayer = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__baseArrayLayer = 12;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__layerCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__layerCount = 16;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__aspectMask,
            LAYOUT__baseMipLevel,
            LAYOUT__levelCount,
            LAYOUT__baseArrayLayer,
            LAYOUT__layerCount
    ).withByteAlignment(4).withName("VkImageSubresourceRange");

    public VkImageSubresourceRange(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkImageSubresourceRange getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkImageSubresourceRange(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkImageSubresourceRange value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int aspectMask() {return this.ptr.get(LAYOUT__aspectMask, OFFSET__aspectMask);}
    public void aspectMask(int value) {this.ptr.set(LAYOUT__aspectMask, OFFSET__aspectMask, value);}
    public java.lang.foreign.MemorySegment $aspectMask() {return this.ptr.asSlice(OFFSET__aspectMask, LAYOUT__aspectMask);}

    public int baseMipLevel() {return this.ptr.get(LAYOUT__baseMipLevel, OFFSET__baseMipLevel);}
    public void baseMipLevel(int value) {this.ptr.set(LAYOUT__baseMipLevel, OFFSET__baseMipLevel, value);}
    public java.lang.foreign.MemorySegment $baseMipLevel() {return this.ptr.asSlice(OFFSET__baseMipLevel, LAYOUT__baseMipLevel);}

    public int levelCount() {return this.ptr.get(LAYOUT__levelCount, OFFSET__levelCount);}
    public void levelCount(int value) {this.ptr.set(LAYOUT__levelCount, OFFSET__levelCount, value);}
    public java.lang.foreign.MemorySegment $levelCount() {return this.ptr.asSlice(OFFSET__levelCount, LAYOUT__levelCount);}

    public int baseArrayLayer() {return this.ptr.get(LAYOUT__baseArrayLayer, OFFSET__baseArrayLayer);}
    public void baseArrayLayer(int value) {this.ptr.set(LAYOUT__baseArrayLayer, OFFSET__baseArrayLayer, value);}
    public java.lang.foreign.MemorySegment $baseArrayLayer() {return this.ptr.asSlice(OFFSET__baseArrayLayer, LAYOUT__baseArrayLayer);}

    public int layerCount() {return this.ptr.get(LAYOUT__layerCount, OFFSET__layerCount);}
    public void layerCount(int value) {this.ptr.set(LAYOUT__layerCount, OFFSET__layerCount, value);}
    public java.lang.foreign.MemorySegment $layerCount() {return this.ptr.asSlice(OFFSET__layerCount, LAYOUT__layerCount);}
}
