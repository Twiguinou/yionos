package vulkan;

public record VkPipelineRenderingCreateInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__viewMask = java.lang.foreign.ValueLayout.JAVA_INT.withName("viewMask");
    public static final long OFFSET__viewMask = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__colorAttachmentCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("colorAttachmentCount");
    public static final long OFFSET__colorAttachmentCount = 20;
    public static final java.lang.foreign.AddressLayout LAYOUT__pColorAttachmentFormats = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pColorAttachmentFormats");
    public static final long OFFSET__pColorAttachmentFormats = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__depthAttachmentFormat = java.lang.foreign.ValueLayout.JAVA_INT.withName("depthAttachmentFormat");
    public static final long OFFSET__depthAttachmentFormat = 32;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__stencilAttachmentFormat = java.lang.foreign.ValueLayout.JAVA_INT.withName("stencilAttachmentFormat");
    public static final long OFFSET__stencilAttachmentFormat = 36;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__viewMask,
            LAYOUT__colorAttachmentCount,
            LAYOUT__pColorAttachmentFormats,
            LAYOUT__depthAttachmentFormat,
            LAYOUT__stencilAttachmentFormat
    ).withByteAlignment(8).withName("VkPipelineRenderingCreateInfo");

    public VkPipelineRenderingCreateInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPipelineRenderingCreateInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPipelineRenderingCreateInfo(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPipelineRenderingCreateInfo value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int viewMask() {return this.ptr.get(LAYOUT__viewMask, OFFSET__viewMask);}
    public void viewMask(int value) {this.ptr.set(LAYOUT__viewMask, OFFSET__viewMask, value);}
    public java.lang.foreign.MemorySegment $viewMask() {return this.ptr.asSlice(OFFSET__viewMask, LAYOUT__viewMask);}

    public int colorAttachmentCount() {return this.ptr.get(LAYOUT__colorAttachmentCount, OFFSET__colorAttachmentCount);}
    public void colorAttachmentCount(int value) {this.ptr.set(LAYOUT__colorAttachmentCount, OFFSET__colorAttachmentCount, value);}
    public java.lang.foreign.MemorySegment $colorAttachmentCount() {return this.ptr.asSlice(OFFSET__colorAttachmentCount, LAYOUT__colorAttachmentCount);}

    public java.lang.foreign.MemorySegment pColorAttachmentFormats() {return this.ptr.get(LAYOUT__pColorAttachmentFormats, OFFSET__pColorAttachmentFormats);}
    public void pColorAttachmentFormats(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pColorAttachmentFormats, OFFSET__pColorAttachmentFormats, value);}
    public java.lang.foreign.MemorySegment $pColorAttachmentFormats() {return this.ptr.asSlice(OFFSET__pColorAttachmentFormats, LAYOUT__pColorAttachmentFormats);}

    public int depthAttachmentFormat() {return this.ptr.get(LAYOUT__depthAttachmentFormat, OFFSET__depthAttachmentFormat);}
    public void depthAttachmentFormat(int value) {this.ptr.set(LAYOUT__depthAttachmentFormat, OFFSET__depthAttachmentFormat, value);}
    public java.lang.foreign.MemorySegment $depthAttachmentFormat() {return this.ptr.asSlice(OFFSET__depthAttachmentFormat, LAYOUT__depthAttachmentFormat);}

    public int stencilAttachmentFormat() {return this.ptr.get(LAYOUT__stencilAttachmentFormat, OFFSET__stencilAttachmentFormat);}
    public void stencilAttachmentFormat(int value) {this.ptr.set(LAYOUT__stencilAttachmentFormat, OFFSET__stencilAttachmentFormat, value);}
    public java.lang.foreign.MemorySegment $stencilAttachmentFormat() {return this.ptr.asSlice(OFFSET__stencilAttachmentFormat, LAYOUT__stencilAttachmentFormat);}
}
