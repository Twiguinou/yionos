package vulkan;

public record VkRenderingFragmentShadingRateAttachmentInfoKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.AddressLayout LAYOUT$imageView = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$imageView = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$imageLayout = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$imageLayout = 24L;
    public static final java.lang.foreign.GroupLayout LAYOUT$shadingRateAttachmentTexelSize = vulkan.VkExtent2D.gStructLayout;
    public static final long OFFSET$shadingRateAttachmentTexelSize = 28L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$imageView,
            LAYOUT$imageLayout,
            LAYOUT$shadingRateAttachmentTexelSize,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("VkRenderingFragmentShadingRateAttachmentInfoKHR");

    public VkRenderingFragmentShadingRateAttachmentInfoKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VkRenderingFragmentShadingRateAttachmentInfoKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VkRenderingFragmentShadingRateAttachmentInfoKHR(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public java.lang.foreign.MemorySegment imageView() {return this.ptr.get(LAYOUT$imageView, OFFSET$imageView);}
    public void imageView(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$imageView, OFFSET$imageView, value);}
    public java.lang.foreign.MemorySegment imageView_ptr() {return this.ptr.asSlice(OFFSET$imageView, LAYOUT$imageView);}

    public int imageLayout() {return this.ptr.get(LAYOUT$imageLayout, OFFSET$imageLayout);}
    public void imageLayout(int value) {this.ptr.set(LAYOUT$imageLayout, OFFSET$imageLayout, value);}
    public java.lang.foreign.MemorySegment imageLayout_ptr() {return this.ptr.asSlice(OFFSET$imageLayout, LAYOUT$imageLayout);}

    public vulkan.VkExtent2D shadingRateAttachmentTexelSize() {return new vulkan.VkExtent2D(this.ptr.asSlice(OFFSET$shadingRateAttachmentTexelSize, LAYOUT$shadingRateAttachmentTexelSize));}
    public void shadingRateAttachmentTexelSize(java.util.function.Consumer<vulkan.VkExtent2D> consumer) {consumer.accept(this.shadingRateAttachmentTexelSize());}
    public void shadingRateAttachmentTexelSize(vulkan.VkExtent2D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$shadingRateAttachmentTexelSize, LAYOUT$shadingRateAttachmentTexelSize.byteSize());}
}
