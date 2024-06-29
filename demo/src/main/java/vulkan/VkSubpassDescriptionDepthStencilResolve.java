package vulkan;

public record VkSubpassDescriptionDepthStencilResolve(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__depthResolveMode = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__depthResolveMode = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__stencilResolveMode = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__stencilResolveMode = 20;
    public static final java.lang.foreign.AddressLayout LAYOUT__pDepthStencilResolveAttachment = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pDepthStencilResolveAttachment = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__depthResolveMode,
            LAYOUT__stencilResolveMode,
            LAYOUT__pDepthStencilResolveAttachment
    ).withByteAlignment(8).withName("VkSubpassDescriptionDepthStencilResolve");

    public VkSubpassDescriptionDepthStencilResolve(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkSubpassDescriptionDepthStencilResolve getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkSubpassDescriptionDepthStencilResolve(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkSubpassDescriptionDepthStencilResolve value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int depthResolveMode() {return this.ptr.get(LAYOUT__depthResolveMode, OFFSET__depthResolveMode);}
    public void depthResolveMode(int value) {this.ptr.set(LAYOUT__depthResolveMode, OFFSET__depthResolveMode, value);}
    public java.lang.foreign.MemorySegment $depthResolveMode() {return this.ptr.asSlice(OFFSET__depthResolveMode, LAYOUT__depthResolveMode);}

    public int stencilResolveMode() {return this.ptr.get(LAYOUT__stencilResolveMode, OFFSET__stencilResolveMode);}
    public void stencilResolveMode(int value) {this.ptr.set(LAYOUT__stencilResolveMode, OFFSET__stencilResolveMode, value);}
    public java.lang.foreign.MemorySegment $stencilResolveMode() {return this.ptr.asSlice(OFFSET__stencilResolveMode, LAYOUT__stencilResolveMode);}

    public java.lang.foreign.MemorySegment pDepthStencilResolveAttachment() {return this.ptr.get(LAYOUT__pDepthStencilResolveAttachment, OFFSET__pDepthStencilResolveAttachment);}
    public void pDepthStencilResolveAttachment(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pDepthStencilResolveAttachment, OFFSET__pDepthStencilResolveAttachment, value);}
    public java.lang.foreign.MemorySegment $pDepthStencilResolveAttachment() {return this.ptr.asSlice(OFFSET__pDepthStencilResolveAttachment, LAYOUT__pDepthStencilResolveAttachment);}
}
