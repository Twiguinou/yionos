package vulkan;

public record VkAttachmentSampleCountInfoAMD(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__colorAttachmentCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__colorAttachmentCount = 16;
    public static final java.lang.foreign.AddressLayout LAYOUT__pColorAttachmentSamples = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pColorAttachmentSamples = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__depthStencilAttachmentSamples = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__depthStencilAttachmentSamples = 32;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__colorAttachmentCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pColorAttachmentSamples,
            LAYOUT__depthStencilAttachmentSamples,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkAttachmentSampleCountInfoAMD");

    public VkAttachmentSampleCountInfoAMD(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkAttachmentSampleCountInfoAMD getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkAttachmentSampleCountInfoAMD(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkAttachmentSampleCountInfoAMD value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int colorAttachmentCount() {return this.ptr.get(LAYOUT__colorAttachmentCount, OFFSET__colorAttachmentCount);}
    public void colorAttachmentCount(int value) {this.ptr.set(LAYOUT__colorAttachmentCount, OFFSET__colorAttachmentCount, value);}
    public java.lang.foreign.MemorySegment $colorAttachmentCount() {return this.ptr.asSlice(OFFSET__colorAttachmentCount, LAYOUT__colorAttachmentCount);}

    public java.lang.foreign.MemorySegment pColorAttachmentSamples() {return this.ptr.get(LAYOUT__pColorAttachmentSamples, OFFSET__pColorAttachmentSamples);}
    public void pColorAttachmentSamples(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pColorAttachmentSamples, OFFSET__pColorAttachmentSamples, value);}
    public java.lang.foreign.MemorySegment $pColorAttachmentSamples() {return this.ptr.asSlice(OFFSET__pColorAttachmentSamples, LAYOUT__pColorAttachmentSamples);}

    public int depthStencilAttachmentSamples() {return this.ptr.get(LAYOUT__depthStencilAttachmentSamples, OFFSET__depthStencilAttachmentSamples);}
    public void depthStencilAttachmentSamples(int value) {this.ptr.set(LAYOUT__depthStencilAttachmentSamples, OFFSET__depthStencilAttachmentSamples, value);}
    public java.lang.foreign.MemorySegment $depthStencilAttachmentSamples() {return this.ptr.asSlice(OFFSET__depthStencilAttachmentSamples, LAYOUT__depthStencilAttachmentSamples);}
}
