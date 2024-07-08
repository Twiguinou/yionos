package vulkan;

public record VkClearValue(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.UnionLayout LAYOUT__color = vulkan.VkClearColorValue.gRecordLayout.withName("color");
    public static final long OFFSET__color = 0;
    public static final java.lang.foreign.StructLayout LAYOUT__depthStencil = vulkan.VkClearDepthStencilValue.gRecordLayout.withName("depthStencil");
    public static final long OFFSET__depthStencil = 0;

    public static final java.lang.foreign.UnionLayout gRecordLayout = java.lang.foreign.MemoryLayout.unionLayout(
            LAYOUT__color,
            LAYOUT__depthStencil
    ).withByteAlignment(4).withName("VkClearValue");

    public VkClearValue(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkClearValue getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkClearValue(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkClearValue value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public vulkan.VkClearColorValue color() {return new vulkan.VkClearColorValue(this.ptr.asSlice(OFFSET__color, LAYOUT__color));}
    public void color(java.util.function.Consumer<vulkan.VkClearColorValue> consumer) {consumer.accept(this.color());}
    public void color(vulkan.VkClearColorValue value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__color, LAYOUT__color.byteSize());}

    public vulkan.VkClearDepthStencilValue depthStencil() {return new vulkan.VkClearDepthStencilValue(this.ptr.asSlice(OFFSET__depthStencil, LAYOUT__depthStencil));}
    public void depthStencil(java.util.function.Consumer<vulkan.VkClearDepthStencilValue> consumer) {consumer.accept(this.depthStencil());}
    public void depthStencil(vulkan.VkClearDepthStencilValue value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__depthStencil, LAYOUT__depthStencil.byteSize());}
}
