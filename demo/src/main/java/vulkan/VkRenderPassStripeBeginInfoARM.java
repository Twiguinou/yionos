package vulkan;

public record VkRenderPassStripeBeginInfoARM(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$stripeInfoCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$stripeInfoCount = 16L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pStripeInfos = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pStripeInfos = 24L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$stripeInfoCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pStripeInfos
    ).withName("VkRenderPassStripeBeginInfoARM");

    public VkRenderPassStripeBeginInfoARM(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VkRenderPassStripeBeginInfoARM getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VkRenderPassStripeBeginInfoARM(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int stripeInfoCount() {return this.ptr.get(LAYOUT$stripeInfoCount, OFFSET$stripeInfoCount);}
    public void stripeInfoCount(int value) {this.ptr.set(LAYOUT$stripeInfoCount, OFFSET$stripeInfoCount, value);}
    public java.lang.foreign.MemorySegment stripeInfoCount_ptr() {return this.ptr.asSlice(OFFSET$stripeInfoCount, LAYOUT$stripeInfoCount);}

    public java.lang.foreign.MemorySegment pStripeInfos() {return this.ptr.get(LAYOUT$pStripeInfos, OFFSET$pStripeInfos);}
    public void pStripeInfos(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pStripeInfos, OFFSET$pStripeInfos, value);}
    public java.lang.foreign.MemorySegment pStripeInfos_ptr() {return this.ptr.asSlice(OFFSET$pStripeInfos, LAYOUT$pStripeInfos);}
}
