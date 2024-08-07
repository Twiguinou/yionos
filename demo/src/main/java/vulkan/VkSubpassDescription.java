package vulkan;

public record VkSubpassDescription(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__flags = java.lang.foreign.ValueLayout.JAVA_INT.withName("flags");
    public static final long OFFSET__flags = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__pipelineBindPoint = java.lang.foreign.ValueLayout.JAVA_INT.withName("pipelineBindPoint");
    public static final long OFFSET__pipelineBindPoint = 4;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__inputAttachmentCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("inputAttachmentCount");
    public static final long OFFSET__inputAttachmentCount = 8;
    public static final java.lang.foreign.AddressLayout LAYOUT__pInputAttachments = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pInputAttachments");
    public static final long OFFSET__pInputAttachments = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__colorAttachmentCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("colorAttachmentCount");
    public static final long OFFSET__colorAttachmentCount = 24;
    public static final java.lang.foreign.AddressLayout LAYOUT__pColorAttachments = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pColorAttachments");
    public static final long OFFSET__pColorAttachments = 32;
    public static final java.lang.foreign.AddressLayout LAYOUT__pResolveAttachments = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pResolveAttachments");
    public static final long OFFSET__pResolveAttachments = 40;
    public static final java.lang.foreign.AddressLayout LAYOUT__pDepthStencilAttachment = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pDepthStencilAttachment");
    public static final long OFFSET__pDepthStencilAttachment = 48;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__preserveAttachmentCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("preserveAttachmentCount");
    public static final long OFFSET__preserveAttachmentCount = 56;
    public static final java.lang.foreign.AddressLayout LAYOUT__pPreserveAttachments = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pPreserveAttachments");
    public static final long OFFSET__pPreserveAttachments = 64;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__flags,
            LAYOUT__pipelineBindPoint,
            LAYOUT__inputAttachmentCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pInputAttachments,
            LAYOUT__colorAttachmentCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pColorAttachments,
            LAYOUT__pResolveAttachments,
            LAYOUT__pDepthStencilAttachment,
            LAYOUT__preserveAttachmentCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pPreserveAttachments
    ).withByteAlignment(8).withName("VkSubpassDescription");

    public VkSubpassDescription(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkSubpassDescription getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkSubpassDescription(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkSubpassDescription value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int flags() {return this.ptr.get(LAYOUT__flags, OFFSET__flags);}
    public void flags(int value) {this.ptr.set(LAYOUT__flags, OFFSET__flags, value);}
    public java.lang.foreign.MemorySegment $flags() {return this.ptr.asSlice(OFFSET__flags, LAYOUT__flags);}

    public int pipelineBindPoint() {return this.ptr.get(LAYOUT__pipelineBindPoint, OFFSET__pipelineBindPoint);}
    public void pipelineBindPoint(int value) {this.ptr.set(LAYOUT__pipelineBindPoint, OFFSET__pipelineBindPoint, value);}
    public java.lang.foreign.MemorySegment $pipelineBindPoint() {return this.ptr.asSlice(OFFSET__pipelineBindPoint, LAYOUT__pipelineBindPoint);}

    public int inputAttachmentCount() {return this.ptr.get(LAYOUT__inputAttachmentCount, OFFSET__inputAttachmentCount);}
    public void inputAttachmentCount(int value) {this.ptr.set(LAYOUT__inputAttachmentCount, OFFSET__inputAttachmentCount, value);}
    public java.lang.foreign.MemorySegment $inputAttachmentCount() {return this.ptr.asSlice(OFFSET__inputAttachmentCount, LAYOUT__inputAttachmentCount);}

    public java.lang.foreign.MemorySegment pInputAttachments() {return this.ptr.get(LAYOUT__pInputAttachments, OFFSET__pInputAttachments);}
    public void pInputAttachments(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pInputAttachments, OFFSET__pInputAttachments, value);}
    public java.lang.foreign.MemorySegment $pInputAttachments() {return this.ptr.asSlice(OFFSET__pInputAttachments, LAYOUT__pInputAttachments);}

    public int colorAttachmentCount() {return this.ptr.get(LAYOUT__colorAttachmentCount, OFFSET__colorAttachmentCount);}
    public void colorAttachmentCount(int value) {this.ptr.set(LAYOUT__colorAttachmentCount, OFFSET__colorAttachmentCount, value);}
    public java.lang.foreign.MemorySegment $colorAttachmentCount() {return this.ptr.asSlice(OFFSET__colorAttachmentCount, LAYOUT__colorAttachmentCount);}

    public java.lang.foreign.MemorySegment pColorAttachments() {return this.ptr.get(LAYOUT__pColorAttachments, OFFSET__pColorAttachments);}
    public void pColorAttachments(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pColorAttachments, OFFSET__pColorAttachments, value);}
    public java.lang.foreign.MemorySegment $pColorAttachments() {return this.ptr.asSlice(OFFSET__pColorAttachments, LAYOUT__pColorAttachments);}

    public java.lang.foreign.MemorySegment pResolveAttachments() {return this.ptr.get(LAYOUT__pResolveAttachments, OFFSET__pResolveAttachments);}
    public void pResolveAttachments(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pResolveAttachments, OFFSET__pResolveAttachments, value);}
    public java.lang.foreign.MemorySegment $pResolveAttachments() {return this.ptr.asSlice(OFFSET__pResolveAttachments, LAYOUT__pResolveAttachments);}

    public java.lang.foreign.MemorySegment pDepthStencilAttachment() {return this.ptr.get(LAYOUT__pDepthStencilAttachment, OFFSET__pDepthStencilAttachment);}
    public void pDepthStencilAttachment(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pDepthStencilAttachment, OFFSET__pDepthStencilAttachment, value);}
    public java.lang.foreign.MemorySegment $pDepthStencilAttachment() {return this.ptr.asSlice(OFFSET__pDepthStencilAttachment, LAYOUT__pDepthStencilAttachment);}

    public int preserveAttachmentCount() {return this.ptr.get(LAYOUT__preserveAttachmentCount, OFFSET__preserveAttachmentCount);}
    public void preserveAttachmentCount(int value) {this.ptr.set(LAYOUT__preserveAttachmentCount, OFFSET__preserveAttachmentCount, value);}
    public java.lang.foreign.MemorySegment $preserveAttachmentCount() {return this.ptr.asSlice(OFFSET__preserveAttachmentCount, LAYOUT__preserveAttachmentCount);}

    public java.lang.foreign.MemorySegment pPreserveAttachments() {return this.ptr.get(LAYOUT__pPreserveAttachments, OFFSET__pPreserveAttachments);}
    public void pPreserveAttachments(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pPreserveAttachments, OFFSET__pPreserveAttachments, value);}
    public java.lang.foreign.MemorySegment $pPreserveAttachments() {return this.ptr.asSlice(OFFSET__pPreserveAttachments, LAYOUT__pPreserveAttachments);}
}
