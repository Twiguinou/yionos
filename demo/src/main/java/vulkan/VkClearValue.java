package vulkan;

public record VkClearValue(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.GroupLayout LAYOUT$color = vulkan.VkClearColorValue.gStructLayout;
    public static final long OFFSET$color = 0L;
    public static final java.lang.foreign.GroupLayout LAYOUT$depthStencil = vulkan.VkClearDepthStencilValue.gStructLayout;
    public static final long OFFSET$depthStencil = 0L;

    public static final java.lang.foreign.UnionLayout gStructLayout = java.lang.foreign.MemoryLayout.unionLayout(
            LAYOUT$color,
            LAYOUT$depthStencil
    ).withName("VkClearValue");

    public VkClearValue(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VkClearValue getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VkClearValue(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public vulkan.VkClearColorValue color() {return new vulkan.VkClearColorValue(this.ptr.asSlice(OFFSET$color, LAYOUT$color));}
    public void color(java.util.function.Consumer<vulkan.VkClearColorValue> consumer) {consumer.accept(this.color());}
    public void color(vulkan.VkClearColorValue value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$color, LAYOUT$color.byteSize());}

    public vulkan.VkClearDepthStencilValue depthStencil() {return new vulkan.VkClearDepthStencilValue(this.ptr.asSlice(OFFSET$depthStencil, LAYOUT$depthStencil));}
    public void depthStencil(java.util.function.Consumer<vulkan.VkClearDepthStencilValue> consumer) {consumer.accept(this.depthStencil());}
    public void depthStencil(vulkan.VkClearDepthStencilValue value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$depthStencil, LAYOUT$depthStencil.byteSize());}
}
