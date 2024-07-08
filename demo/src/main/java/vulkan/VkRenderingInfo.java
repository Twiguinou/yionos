package vulkan;

public record VkRenderingInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__flags = java.lang.foreign.ValueLayout.JAVA_INT.withName("flags");
    public static final long OFFSET__flags = 16;
    public static final java.lang.foreign.StructLayout LAYOUT__renderArea = vulkan.VkRect2D.gRecordLayout.withName("renderArea");
    public static final long OFFSET__renderArea = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__layerCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("layerCount");
    public static final long OFFSET__layerCount = 36;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__viewMask = java.lang.foreign.ValueLayout.JAVA_INT.withName("viewMask");
    public static final long OFFSET__viewMask = 40;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__colorAttachmentCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("colorAttachmentCount");
    public static final long OFFSET__colorAttachmentCount = 44;
    public static final java.lang.foreign.AddressLayout LAYOUT__pColorAttachments = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pColorAttachments");
    public static final long OFFSET__pColorAttachments = 48;
    public static final java.lang.foreign.AddressLayout LAYOUT__pDepthAttachment = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pDepthAttachment");
    public static final long OFFSET__pDepthAttachment = 56;
    public static final java.lang.foreign.AddressLayout LAYOUT__pStencilAttachment = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pStencilAttachment");
    public static final long OFFSET__pStencilAttachment = 64;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__flags,
            LAYOUT__renderArea,
            LAYOUT__layerCount,
            LAYOUT__viewMask,
            LAYOUT__colorAttachmentCount,
            LAYOUT__pColorAttachments,
            LAYOUT__pDepthAttachment,
            LAYOUT__pStencilAttachment
    ).withByteAlignment(8).withName("VkRenderingInfo");

    public VkRenderingInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkRenderingInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkRenderingInfo(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkRenderingInfo value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int flags() {return this.ptr.get(LAYOUT__flags, OFFSET__flags);}
    public void flags(int value) {this.ptr.set(LAYOUT__flags, OFFSET__flags, value);}
    public java.lang.foreign.MemorySegment $flags() {return this.ptr.asSlice(OFFSET__flags, LAYOUT__flags);}

    public vulkan.VkRect2D renderArea() {return new vulkan.VkRect2D(this.ptr.asSlice(OFFSET__renderArea, LAYOUT__renderArea));}
    public void renderArea(java.util.function.Consumer<vulkan.VkRect2D> consumer) {consumer.accept(this.renderArea());}
    public void renderArea(vulkan.VkRect2D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__renderArea, LAYOUT__renderArea.byteSize());}

    public int layerCount() {return this.ptr.get(LAYOUT__layerCount, OFFSET__layerCount);}
    public void layerCount(int value) {this.ptr.set(LAYOUT__layerCount, OFFSET__layerCount, value);}
    public java.lang.foreign.MemorySegment $layerCount() {return this.ptr.asSlice(OFFSET__layerCount, LAYOUT__layerCount);}

    public int viewMask() {return this.ptr.get(LAYOUT__viewMask, OFFSET__viewMask);}
    public void viewMask(int value) {this.ptr.set(LAYOUT__viewMask, OFFSET__viewMask, value);}
    public java.lang.foreign.MemorySegment $viewMask() {return this.ptr.asSlice(OFFSET__viewMask, LAYOUT__viewMask);}

    public int colorAttachmentCount() {return this.ptr.get(LAYOUT__colorAttachmentCount, OFFSET__colorAttachmentCount);}
    public void colorAttachmentCount(int value) {this.ptr.set(LAYOUT__colorAttachmentCount, OFFSET__colorAttachmentCount, value);}
    public java.lang.foreign.MemorySegment $colorAttachmentCount() {return this.ptr.asSlice(OFFSET__colorAttachmentCount, LAYOUT__colorAttachmentCount);}

    public java.lang.foreign.MemorySegment pColorAttachments() {return this.ptr.get(LAYOUT__pColorAttachments, OFFSET__pColorAttachments);}
    public void pColorAttachments(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pColorAttachments, OFFSET__pColorAttachments, value);}
    public java.lang.foreign.MemorySegment $pColorAttachments() {return this.ptr.asSlice(OFFSET__pColorAttachments, LAYOUT__pColorAttachments);}

    public java.lang.foreign.MemorySegment pDepthAttachment() {return this.ptr.get(LAYOUT__pDepthAttachment, OFFSET__pDepthAttachment);}
    public void pDepthAttachment(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pDepthAttachment, OFFSET__pDepthAttachment, value);}
    public java.lang.foreign.MemorySegment $pDepthAttachment() {return this.ptr.asSlice(OFFSET__pDepthAttachment, LAYOUT__pDepthAttachment);}

    public java.lang.foreign.MemorySegment pStencilAttachment() {return this.ptr.get(LAYOUT__pStencilAttachment, OFFSET__pStencilAttachment);}
    public void pStencilAttachment(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pStencilAttachment, OFFSET__pStencilAttachment, value);}
    public java.lang.foreign.MemorySegment $pStencilAttachment() {return this.ptr.asSlice(OFFSET__pStencilAttachment, LAYOUT__pStencilAttachment);}
}
