package vulkan;

public record VkImageBlit(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT__srcSubresource = vulkan.VkImageSubresourceLayers.gRecordLayout.withName("srcSubresource");
    public static final long OFFSET__srcSubresource = 0;
    public static final java.lang.foreign.SequenceLayout LAYOUT__srcOffsets = java.lang.foreign.MemoryLayout.sequenceLayout(2, vulkan.VkOffset3D.gRecordLayout).withName("srcOffsets");
    public static final long OFFSET__srcOffsets = 16;
    public static final java.lang.foreign.StructLayout LAYOUT__dstSubresource = vulkan.VkImageSubresourceLayers.gRecordLayout.withName("dstSubresource");
    public static final long OFFSET__dstSubresource = 40;
    public static final java.lang.foreign.SequenceLayout LAYOUT__dstOffsets = java.lang.foreign.MemoryLayout.sequenceLayout(2, vulkan.VkOffset3D.gRecordLayout).withName("dstOffsets");
    public static final long OFFSET__dstOffsets = 56;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__srcSubresource,
            LAYOUT__srcOffsets,
            LAYOUT__dstSubresource,
            LAYOUT__dstOffsets
    ).withByteAlignment(4).withName("VkImageBlit");

    public VkImageBlit(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkImageBlit getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkImageBlit(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkImageBlit value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public vulkan.VkImageSubresourceLayers srcSubresource() {return new vulkan.VkImageSubresourceLayers(this.ptr.asSlice(OFFSET__srcSubresource, LAYOUT__srcSubresource));}
    public void srcSubresource(java.util.function.Consumer<vulkan.VkImageSubresourceLayers> consumer) {consumer.accept(this.srcSubresource());}
    public void srcSubresource(vulkan.VkImageSubresourceLayers value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__srcSubresource, LAYOUT__srcSubresource.byteSize());}

    public java.lang.foreign.MemorySegment srcOffsets() {return this.ptr.asSlice(OFFSET__srcOffsets, LAYOUT__srcOffsets);}
    public vulkan.VkOffset3D srcOffsets(int index) {return vulkan.VkOffset3D.getAtIndex(this.srcOffsets(), index);}
    public void srcOffsets(int index, java.util.function.Consumer<vulkan.VkOffset3D> consumer) {consumer.accept(this.srcOffsets(index));}
    public void srcOffsets(int index, vulkan.VkOffset3D value) {vulkan.VkOffset3D.setAtIndex(this.srcOffsets(), index, value);}

    public vulkan.VkImageSubresourceLayers dstSubresource() {return new vulkan.VkImageSubresourceLayers(this.ptr.asSlice(OFFSET__dstSubresource, LAYOUT__dstSubresource));}
    public void dstSubresource(java.util.function.Consumer<vulkan.VkImageSubresourceLayers> consumer) {consumer.accept(this.dstSubresource());}
    public void dstSubresource(vulkan.VkImageSubresourceLayers value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__dstSubresource, LAYOUT__dstSubresource.byteSize());}

    public java.lang.foreign.MemorySegment dstOffsets() {return this.ptr.asSlice(OFFSET__dstOffsets, LAYOUT__dstOffsets);}
    public vulkan.VkOffset3D dstOffsets(int index) {return vulkan.VkOffset3D.getAtIndex(this.dstOffsets(), index);}
    public void dstOffsets(int index, java.util.function.Consumer<vulkan.VkOffset3D> consumer) {consumer.accept(this.dstOffsets(index));}
    public void dstOffsets(int index, vulkan.VkOffset3D value) {vulkan.VkOffset3D.setAtIndex(this.dstOffsets(), index, value);}
}
