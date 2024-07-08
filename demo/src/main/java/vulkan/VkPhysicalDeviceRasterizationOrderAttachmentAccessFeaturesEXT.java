package vulkan;

public record VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__rasterizationOrderColorAttachmentAccess = java.lang.foreign.ValueLayout.JAVA_INT.withName("rasterizationOrderColorAttachmentAccess");
    public static final long OFFSET__rasterizationOrderColorAttachmentAccess = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__rasterizationOrderDepthAttachmentAccess = java.lang.foreign.ValueLayout.JAVA_INT.withName("rasterizationOrderDepthAttachmentAccess");
    public static final long OFFSET__rasterizationOrderDepthAttachmentAccess = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__rasterizationOrderStencilAttachmentAccess = java.lang.foreign.ValueLayout.JAVA_INT.withName("rasterizationOrderStencilAttachmentAccess");
    public static final long OFFSET__rasterizationOrderStencilAttachmentAccess = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__rasterizationOrderColorAttachmentAccess,
            LAYOUT__rasterizationOrderDepthAttachmentAccess,
            LAYOUT__rasterizationOrderStencilAttachmentAccess,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT");

    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int rasterizationOrderColorAttachmentAccess() {return this.ptr.get(LAYOUT__rasterizationOrderColorAttachmentAccess, OFFSET__rasterizationOrderColorAttachmentAccess);}
    public void rasterizationOrderColorAttachmentAccess(int value) {this.ptr.set(LAYOUT__rasterizationOrderColorAttachmentAccess, OFFSET__rasterizationOrderColorAttachmentAccess, value);}
    public java.lang.foreign.MemorySegment $rasterizationOrderColorAttachmentAccess() {return this.ptr.asSlice(OFFSET__rasterizationOrderColorAttachmentAccess, LAYOUT__rasterizationOrderColorAttachmentAccess);}

    public int rasterizationOrderDepthAttachmentAccess() {return this.ptr.get(LAYOUT__rasterizationOrderDepthAttachmentAccess, OFFSET__rasterizationOrderDepthAttachmentAccess);}
    public void rasterizationOrderDepthAttachmentAccess(int value) {this.ptr.set(LAYOUT__rasterizationOrderDepthAttachmentAccess, OFFSET__rasterizationOrderDepthAttachmentAccess, value);}
    public java.lang.foreign.MemorySegment $rasterizationOrderDepthAttachmentAccess() {return this.ptr.asSlice(OFFSET__rasterizationOrderDepthAttachmentAccess, LAYOUT__rasterizationOrderDepthAttachmentAccess);}

    public int rasterizationOrderStencilAttachmentAccess() {return this.ptr.get(LAYOUT__rasterizationOrderStencilAttachmentAccess, OFFSET__rasterizationOrderStencilAttachmentAccess);}
    public void rasterizationOrderStencilAttachmentAccess(int value) {this.ptr.set(LAYOUT__rasterizationOrderStencilAttachmentAccess, OFFSET__rasterizationOrderStencilAttachmentAccess, value);}
    public java.lang.foreign.MemorySegment $rasterizationOrderStencilAttachmentAccess() {return this.ptr.asSlice(OFFSET__rasterizationOrderStencilAttachmentAccess, LAYOUT__rasterizationOrderStencilAttachmentAccess);}
}
