package vulkan;

public record VkRenderingFragmentShadingRateAttachmentInfoKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.AddressLayout LAYOUT__imageView = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("imageView");
    public static final long OFFSET__imageView = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__imageLayout = java.lang.foreign.ValueLayout.JAVA_INT.withName("imageLayout");
    public static final long OFFSET__imageLayout = 24;
    public static final java.lang.foreign.StructLayout LAYOUT__shadingRateAttachmentTexelSize = vulkan.VkExtent2D.gRecordLayout.withName("shadingRateAttachmentTexelSize");
    public static final long OFFSET__shadingRateAttachmentTexelSize = 28;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__imageView,
            LAYOUT__imageLayout,
            LAYOUT__shadingRateAttachmentTexelSize,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkRenderingFragmentShadingRateAttachmentInfoKHR");

    public VkRenderingFragmentShadingRateAttachmentInfoKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkRenderingFragmentShadingRateAttachmentInfoKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkRenderingFragmentShadingRateAttachmentInfoKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkRenderingFragmentShadingRateAttachmentInfoKHR value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public java.lang.foreign.MemorySegment imageView() {return this.ptr.get(LAYOUT__imageView, OFFSET__imageView);}
    public void imageView(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__imageView, OFFSET__imageView, value);}
    public java.lang.foreign.MemorySegment $imageView() {return this.ptr.asSlice(OFFSET__imageView, LAYOUT__imageView);}

    public int imageLayout() {return this.ptr.get(LAYOUT__imageLayout, OFFSET__imageLayout);}
    public void imageLayout(int value) {this.ptr.set(LAYOUT__imageLayout, OFFSET__imageLayout, value);}
    public java.lang.foreign.MemorySegment $imageLayout() {return this.ptr.asSlice(OFFSET__imageLayout, LAYOUT__imageLayout);}

    public vulkan.VkExtent2D shadingRateAttachmentTexelSize() {return new vulkan.VkExtent2D(this.ptr.asSlice(OFFSET__shadingRateAttachmentTexelSize, LAYOUT__shadingRateAttachmentTexelSize));}
    public void shadingRateAttachmentTexelSize(java.util.function.Consumer<vulkan.VkExtent2D> consumer) {consumer.accept(this.shadingRateAttachmentTexelSize());}
    public void shadingRateAttachmentTexelSize(vulkan.VkExtent2D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__shadingRateAttachmentTexelSize, LAYOUT__shadingRateAttachmentTexelSize.byteSize());}
}
