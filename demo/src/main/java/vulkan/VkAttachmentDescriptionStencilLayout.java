package vulkan;

public record VkAttachmentDescriptionStencilLayout(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__stencilInitialLayout = java.lang.foreign.ValueLayout.JAVA_INT.withName("stencilInitialLayout");
    public static final long OFFSET__stencilInitialLayout = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__stencilFinalLayout = java.lang.foreign.ValueLayout.JAVA_INT.withName("stencilFinalLayout");
    public static final long OFFSET__stencilFinalLayout = 20;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__stencilInitialLayout,
            LAYOUT__stencilFinalLayout
    ).withByteAlignment(8).withName("VkAttachmentDescriptionStencilLayout");

    public VkAttachmentDescriptionStencilLayout(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkAttachmentDescriptionStencilLayout getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkAttachmentDescriptionStencilLayout(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkAttachmentDescriptionStencilLayout value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int stencilInitialLayout() {return this.ptr.get(LAYOUT__stencilInitialLayout, OFFSET__stencilInitialLayout);}
    public void stencilInitialLayout(int value) {this.ptr.set(LAYOUT__stencilInitialLayout, OFFSET__stencilInitialLayout, value);}
    public java.lang.foreign.MemorySegment $stencilInitialLayout() {return this.ptr.asSlice(OFFSET__stencilInitialLayout, LAYOUT__stencilInitialLayout);}

    public int stencilFinalLayout() {return this.ptr.get(LAYOUT__stencilFinalLayout, OFFSET__stencilFinalLayout);}
    public void stencilFinalLayout(int value) {this.ptr.set(LAYOUT__stencilFinalLayout, OFFSET__stencilFinalLayout, value);}
    public java.lang.foreign.MemorySegment $stencilFinalLayout() {return this.ptr.asSlice(OFFSET__stencilFinalLayout, LAYOUT__stencilFinalLayout);}
}
