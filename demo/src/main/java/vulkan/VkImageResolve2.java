package vulkan;

public record VkImageResolve2(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.GroupLayout LAYOUT$srcSubresource = vulkan.VkImageSubresourceLayers.gStructLayout;
    public static final long OFFSET$srcSubresource = 16L;
    public static final java.lang.foreign.GroupLayout LAYOUT$srcOffset = vulkan.VkOffset3D.gStructLayout;
    public static final long OFFSET$srcOffset = 32L;
    public static final java.lang.foreign.GroupLayout LAYOUT$dstSubresource = vulkan.VkImageSubresourceLayers.gStructLayout;
    public static final long OFFSET$dstSubresource = 44L;
    public static final java.lang.foreign.GroupLayout LAYOUT$dstOffset = vulkan.VkOffset3D.gStructLayout;
    public static final long OFFSET$dstOffset = 60L;
    public static final java.lang.foreign.GroupLayout LAYOUT$extent = vulkan.VkExtent3D.gStructLayout;
    public static final long OFFSET$extent = 72L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$srcSubresource,
            LAYOUT$srcOffset,
            LAYOUT$dstSubresource,
            LAYOUT$dstOffset,
            LAYOUT$extent,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("VkImageResolve2");

    public VkImageResolve2(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VkImageResolve2 getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VkImageResolve2(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

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
