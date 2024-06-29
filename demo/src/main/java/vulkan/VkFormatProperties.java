package vulkan;

public record VkFormatProperties(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__linearTilingFeatures = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__linearTilingFeatures = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__optimalTilingFeatures = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__optimalTilingFeatures = 4;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__bufferFeatures = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__bufferFeatures = 8;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__linearTilingFeatures,
            LAYOUT__optimalTilingFeatures,
            LAYOUT__bufferFeatures
    ).withByteAlignment(4).withName("VkFormatProperties");

    public VkFormatProperties(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkFormatProperties getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkFormatProperties(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkFormatProperties value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int linearTilingFeatures() {return this.ptr.get(LAYOUT__linearTilingFeatures, OFFSET__linearTilingFeatures);}
    public void linearTilingFeatures(int value) {this.ptr.set(LAYOUT__linearTilingFeatures, OFFSET__linearTilingFeatures, value);}
    public java.lang.foreign.MemorySegment $linearTilingFeatures() {return this.ptr.asSlice(OFFSET__linearTilingFeatures, LAYOUT__linearTilingFeatures);}

    public int optimalTilingFeatures() {return this.ptr.get(LAYOUT__optimalTilingFeatures, OFFSET__optimalTilingFeatures);}
    public void optimalTilingFeatures(int value) {this.ptr.set(LAYOUT__optimalTilingFeatures, OFFSET__optimalTilingFeatures, value);}
    public java.lang.foreign.MemorySegment $optimalTilingFeatures() {return this.ptr.asSlice(OFFSET__optimalTilingFeatures, LAYOUT__optimalTilingFeatures);}

    public int bufferFeatures() {return this.ptr.get(LAYOUT__bufferFeatures, OFFSET__bufferFeatures);}
    public void bufferFeatures(int value) {this.ptr.set(LAYOUT__bufferFeatures, OFFSET__bufferFeatures, value);}
    public java.lang.foreign.MemorySegment $bufferFeatures() {return this.ptr.asSlice(OFFSET__bufferFeatures, LAYOUT__bufferFeatures);}
}
