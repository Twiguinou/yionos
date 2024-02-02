package vulkan;

public record VkImageBlit(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.GroupLayout LAYOUT$srcSubresource = vulkan.VkImageSubresourceLayers.gStructLayout;
    public static final long OFFSET$srcSubresource = 0L;
    public static final java.lang.foreign.SequenceLayout LAYOUT$srcOffsets = java.lang.foreign.MemoryLayout.sequenceLayout(2, vulkan.VkOffset3D.gStructLayout);
    public static final long OFFSET$srcOffsets = 16L;
    public static final java.lang.foreign.GroupLayout LAYOUT$dstSubresource = vulkan.VkImageSubresourceLayers.gStructLayout;
    public static final long OFFSET$dstSubresource = 40L;
    public static final java.lang.foreign.SequenceLayout LAYOUT$dstOffsets = java.lang.foreign.MemoryLayout.sequenceLayout(2, vulkan.VkOffset3D.gStructLayout);
    public static final long OFFSET$dstOffsets = 56L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$srcSubresource,
            LAYOUT$srcOffsets,
            LAYOUT$dstSubresource,
            LAYOUT$dstOffsets
    ).withName("VkImageBlit");

    public VkImageBlit(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VkImageBlit getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VkImageBlit(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public vulkan.VkImageSubresourceLayers srcSubresource() {return new vulkan.VkImageSubresourceLayers(this.ptr.asSlice(OFFSET$srcSubresource, LAYOUT$srcSubresource));}
    public void srcSubresource(java.util.function.Consumer<vulkan.VkImageSubresourceLayers> consumer) {consumer.accept(this.srcSubresource());}
    public void srcSubresource(vulkan.VkImageSubresourceLayers value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$srcSubresource, LAYOUT$srcSubresource.byteSize());}

    public java.lang.foreign.MemorySegment srcOffsets() {return this.ptr.asSlice(OFFSET$srcOffsets, LAYOUT$srcOffsets);}
    public vulkan.VkOffset3D srcOffsets(int i) {return new vulkan.VkOffset3D(this.ptr.asSlice(OFFSET$srcOffsets + i * LAYOUT$srcOffsets.byteSize(), LAYOUT$srcOffsets));}
    public void srcOffsets(int i, java.util.function.Consumer<vulkan.VkOffset3D> consumer) {consumer.accept(this.srcOffsets(i));}
    public void srcOffsets(int i, vulkan.VkOffset3D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$srcOffsets + i * LAYOUT$srcOffsets.byteSize(), LAYOUT$srcOffsets.byteSize());}

    public vulkan.VkImageSubresourceLayers dstSubresource() {return new vulkan.VkImageSubresourceLayers(this.ptr.asSlice(OFFSET$dstSubresource, LAYOUT$dstSubresource));}
    public void dstSubresource(java.util.function.Consumer<vulkan.VkImageSubresourceLayers> consumer) {consumer.accept(this.dstSubresource());}
    public void dstSubresource(vulkan.VkImageSubresourceLayers value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$dstSubresource, LAYOUT$dstSubresource.byteSize());}

    public java.lang.foreign.MemorySegment dstOffsets() {return this.ptr.asSlice(OFFSET$dstOffsets, LAYOUT$dstOffsets);}
    public vulkan.VkOffset3D dstOffsets(int i) {return new vulkan.VkOffset3D(this.ptr.asSlice(OFFSET$dstOffsets + i * LAYOUT$dstOffsets.byteSize(), LAYOUT$dstOffsets));}
    public void dstOffsets(int i, java.util.function.Consumer<vulkan.VkOffset3D> consumer) {consumer.accept(this.dstOffsets(i));}
    public void dstOffsets(int i, vulkan.VkOffset3D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$dstOffsets + i * LAYOUT$dstOffsets.byteSize(), LAYOUT$dstOffsets.byteSize());}
}
