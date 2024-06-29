package vulkan;

public record VkClearRect(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT__rect = vulkan.VkRect2D.gRecordLayout;
    public static final long OFFSET__rect = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__baseArrayLayer = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__baseArrayLayer = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__layerCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__layerCount = 20;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__rect,
            LAYOUT__baseArrayLayer,
            LAYOUT__layerCount
    ).withByteAlignment(4).withName("VkClearRect");

    public VkClearRect(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkClearRect getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkClearRect(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkClearRect value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public vulkan.VkRect2D rect() {return new vulkan.VkRect2D(this.ptr.asSlice(OFFSET__rect, LAYOUT__rect));}
    public void rect(java.util.function.Consumer<vulkan.VkRect2D> consumer) {consumer.accept(this.rect());}
    public void rect(vulkan.VkRect2D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__rect, LAYOUT__rect.byteSize());}

    public int baseArrayLayer() {return this.ptr.get(LAYOUT__baseArrayLayer, OFFSET__baseArrayLayer);}
    public void baseArrayLayer(int value) {this.ptr.set(LAYOUT__baseArrayLayer, OFFSET__baseArrayLayer, value);}
    public java.lang.foreign.MemorySegment $baseArrayLayer() {return this.ptr.asSlice(OFFSET__baseArrayLayer, LAYOUT__baseArrayLayer);}

    public int layerCount() {return this.ptr.get(LAYOUT__layerCount, OFFSET__layerCount);}
    public void layerCount(int value) {this.ptr.set(LAYOUT__layerCount, OFFSET__layerCount, value);}
    public java.lang.foreign.MemorySegment $layerCount() {return this.ptr.asSlice(OFFSET__layerCount, LAYOUT__layerCount);}
}
