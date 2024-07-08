package vulkan;

public record VkRenderPassStripeInfoARM(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.StructLayout LAYOUT__stripeArea = vulkan.VkRect2D.gRecordLayout.withName("stripeArea");
    public static final long OFFSET__stripeArea = 16;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__stripeArea
    ).withByteAlignment(8).withName("VkRenderPassStripeInfoARM");

    public VkRenderPassStripeInfoARM(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkRenderPassStripeInfoARM getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkRenderPassStripeInfoARM(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkRenderPassStripeInfoARM value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public vulkan.VkRect2D stripeArea() {return new vulkan.VkRect2D(this.ptr.asSlice(OFFSET__stripeArea, LAYOUT__stripeArea));}
    public void stripeArea(java.util.function.Consumer<vulkan.VkRect2D> consumer) {consumer.accept(this.stripeArea());}
    public void stripeArea(vulkan.VkRect2D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__stripeArea, LAYOUT__stripeArea.byteSize());}
}
