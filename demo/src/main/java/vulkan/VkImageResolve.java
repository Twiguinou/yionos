package vulkan;

public record VkImageResolve(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.GroupLayout LAYOUT$srcSubresource = vulkan.VkImageSubresourceLayers.gStructLayout;
    public static final long OFFSET$srcSubresource = 0L;
    public static final java.lang.foreign.GroupLayout LAYOUT$srcOffset = vulkan.VkOffset3D.gStructLayout;
    public static final long OFFSET$srcOffset = 16L;
    public static final java.lang.foreign.GroupLayout LAYOUT$dstSubresource = vulkan.VkImageSubresourceLayers.gStructLayout;
    public static final long OFFSET$dstSubresource = 28L;
    public static final java.lang.foreign.GroupLayout LAYOUT$dstOffset = vulkan.VkOffset3D.gStructLayout;
    public static final long OFFSET$dstOffset = 44L;
    public static final java.lang.foreign.GroupLayout LAYOUT$extent = vulkan.VkExtent3D.gStructLayout;
    public static final long OFFSET$extent = 56L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$srcSubresource,
            LAYOUT$srcOffset,
            LAYOUT$dstSubresource,
            LAYOUT$dstOffset,
            LAYOUT$extent
    ).withName("VkImageResolve");

    public VkImageResolve(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VkImageResolve getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VkImageResolve(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public vulkan.VkImageSubresourceLayers srcSubresource() {return new vulkan.VkImageSubresourceLayers(this.ptr.asSlice(OFFSET$srcSubresource, LAYOUT$srcSubresource));}
    public void srcSubresource(java.util.function.Consumer<vulkan.VkImageSubresourceLayers> consumer) {consumer.accept(this.srcSubresource());}
    public void srcSubresource(vulkan.VkImageSubresourceLayers value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$srcSubresource, LAYOUT$srcSubresource.byteSize());}

    public vulkan.VkOffset3D srcOffset() {return new vulkan.VkOffset3D(this.ptr.asSlice(OFFSET$srcOffset, LAYOUT$srcOffset));}
    public void srcOffset(java.util.function.Consumer<vulkan.VkOffset3D> consumer) {consumer.accept(this.srcOffset());}
    public void srcOffset(vulkan.VkOffset3D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$srcOffset, LAYOUT$srcOffset.byteSize());}

    public vulkan.VkImageSubresourceLayers dstSubresource() {return new vulkan.VkImageSubresourceLayers(this.ptr.asSlice(OFFSET$dstSubresource, LAYOUT$dstSubresource));}
    public void dstSubresource(java.util.function.Consumer<vulkan.VkImageSubresourceLayers> consumer) {consumer.accept(this.dstSubresource());}
    public void dstSubresource(vulkan.VkImageSubresourceLayers value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$dstSubresource, LAYOUT$dstSubresource.byteSize());}

    public vulkan.VkOffset3D dstOffset() {return new vulkan.VkOffset3D(this.ptr.asSlice(OFFSET$dstOffset, LAYOUT$dstOffset));}
    public void dstOffset(java.util.function.Consumer<vulkan.VkOffset3D> consumer) {consumer.accept(this.dstOffset());}
    public void dstOffset(vulkan.VkOffset3D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$dstOffset, LAYOUT$dstOffset.byteSize());}

    public vulkan.VkExtent3D extent() {return new vulkan.VkExtent3D(this.ptr.asSlice(OFFSET$extent, LAYOUT$extent));}
    public void extent(java.util.function.Consumer<vulkan.VkExtent3D> consumer) {consumer.accept(this.extent());}
    public void extent(vulkan.VkExtent3D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$extent, LAYOUT$extent.byteSize());}
}
