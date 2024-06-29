package vulkan;

public record VkImageCopy2(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.StructLayout LAYOUT__srcSubresource = vulkan.VkImageSubresourceLayers.gRecordLayout;
    public static final long OFFSET__srcSubresource = 16;
    public static final java.lang.foreign.StructLayout LAYOUT__srcOffset = vulkan.VkOffset3D.gRecordLayout;
    public static final long OFFSET__srcOffset = 32;
    public static final java.lang.foreign.StructLayout LAYOUT__dstSubresource = vulkan.VkImageSubresourceLayers.gRecordLayout;
    public static final long OFFSET__dstSubresource = 44;
    public static final java.lang.foreign.StructLayout LAYOUT__dstOffset = vulkan.VkOffset3D.gRecordLayout;
    public static final long OFFSET__dstOffset = 60;
    public static final java.lang.foreign.StructLayout LAYOUT__extent = vulkan.VkExtent3D.gRecordLayout;
    public static final long OFFSET__extent = 72;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__srcSubresource,
            LAYOUT__srcOffset,
            LAYOUT__dstSubresource,
            LAYOUT__dstOffset,
            LAYOUT__extent,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkImageCopy2");

    public VkImageCopy2(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkImageCopy2 getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkImageCopy2(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkImageCopy2 value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public vulkan.VkImageSubresourceLayers srcSubresource() {return new vulkan.VkImageSubresourceLayers(this.ptr.asSlice(OFFSET__srcSubresource, LAYOUT__srcSubresource));}
    public void srcSubresource(java.util.function.Consumer<vulkan.VkImageSubresourceLayers> consumer) {consumer.accept(this.srcSubresource());}
    public void srcSubresource(vulkan.VkImageSubresourceLayers value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__srcSubresource, LAYOUT__srcSubresource.byteSize());}

    public vulkan.VkOffset3D srcOffset() {return new vulkan.VkOffset3D(this.ptr.asSlice(OFFSET__srcOffset, LAYOUT__srcOffset));}
    public void srcOffset(java.util.function.Consumer<vulkan.VkOffset3D> consumer) {consumer.accept(this.srcOffset());}
    public void srcOffset(vulkan.VkOffset3D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__srcOffset, LAYOUT__srcOffset.byteSize());}

    public vulkan.VkImageSubresourceLayers dstSubresource() {return new vulkan.VkImageSubresourceLayers(this.ptr.asSlice(OFFSET__dstSubresource, LAYOUT__dstSubresource));}
    public void dstSubresource(java.util.function.Consumer<vulkan.VkImageSubresourceLayers> consumer) {consumer.accept(this.dstSubresource());}
    public void dstSubresource(vulkan.VkImageSubresourceLayers value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__dstSubresource, LAYOUT__dstSubresource.byteSize());}

    public vulkan.VkOffset3D dstOffset() {return new vulkan.VkOffset3D(this.ptr.asSlice(OFFSET__dstOffset, LAYOUT__dstOffset));}
    public void dstOffset(java.util.function.Consumer<vulkan.VkOffset3D> consumer) {consumer.accept(this.dstOffset());}
    public void dstOffset(vulkan.VkOffset3D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__dstOffset, LAYOUT__dstOffset.byteSize());}

    public vulkan.VkExtent3D extent() {return new vulkan.VkExtent3D(this.ptr.asSlice(OFFSET__extent, LAYOUT__extent));}
    public void extent(java.util.function.Consumer<vulkan.VkExtent3D> consumer) {consumer.accept(this.extent());}
    public void extent(vulkan.VkExtent3D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__extent, LAYOUT__extent.byteSize());}
}
