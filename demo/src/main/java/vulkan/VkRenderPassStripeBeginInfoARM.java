package vulkan;

public record VkRenderPassStripeBeginInfoARM(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__stripeInfoCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__stripeInfoCount = 16;
    public static final java.lang.foreign.AddressLayout LAYOUT__pStripeInfos = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pStripeInfos = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__stripeInfoCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pStripeInfos
    ).withByteAlignment(8).withName("VkRenderPassStripeBeginInfoARM");

    public VkRenderPassStripeBeginInfoARM(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkRenderPassStripeBeginInfoARM getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkRenderPassStripeBeginInfoARM(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkRenderPassStripeBeginInfoARM value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int stripeInfoCount() {return this.ptr.get(LAYOUT__stripeInfoCount, OFFSET__stripeInfoCount);}
    public void stripeInfoCount(int value) {this.ptr.set(LAYOUT__stripeInfoCount, OFFSET__stripeInfoCount, value);}
    public java.lang.foreign.MemorySegment $stripeInfoCount() {return this.ptr.asSlice(OFFSET__stripeInfoCount, LAYOUT__stripeInfoCount);}

    public java.lang.foreign.MemorySegment pStripeInfos() {return this.ptr.get(LAYOUT__pStripeInfos, OFFSET__pStripeInfos);}
    public void pStripeInfos(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pStripeInfos, OFFSET__pStripeInfos, value);}
    public java.lang.foreign.MemorySegment $pStripeInfos() {return this.ptr.asSlice(OFFSET__pStripeInfos, LAYOUT__pStripeInfos);}
}
