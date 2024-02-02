package vulkan;

public record VkRenderPassStripeInfoARM(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.GroupLayout LAYOUT$stripeArea = vulkan.VkRect2D.gStructLayout;
    public static final long OFFSET$stripeArea = 16L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$stripeArea
    ).withName("VkRenderPassStripeInfoARM");

    public VkRenderPassStripeInfoARM(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VkRenderPassStripeInfoARM getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VkRenderPassStripeInfoARM(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public vulkan.VkRect2D stripeArea() {return new vulkan.VkRect2D(this.ptr.asSlice(OFFSET$stripeArea, LAYOUT$stripeArea));}
    public void stripeArea(java.util.function.Consumer<vulkan.VkRect2D> consumer) {consumer.accept(this.stripeArea());}
    public void stripeArea(vulkan.VkRect2D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$stripeArea, LAYOUT$stripeArea.byteSize());}
}
