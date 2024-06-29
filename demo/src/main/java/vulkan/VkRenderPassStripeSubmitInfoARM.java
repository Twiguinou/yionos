package vulkan;

public record VkRenderPassStripeSubmitInfoARM(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__stripeSemaphoreInfoCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__stripeSemaphoreInfoCount = 16;
    public static final java.lang.foreign.AddressLayout LAYOUT__pStripeSemaphoreInfos = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pStripeSemaphoreInfos = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__stripeSemaphoreInfoCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pStripeSemaphoreInfos
    ).withByteAlignment(8).withName("VkRenderPassStripeSubmitInfoARM");

    public VkRenderPassStripeSubmitInfoARM(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkRenderPassStripeSubmitInfoARM getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkRenderPassStripeSubmitInfoARM(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkRenderPassStripeSubmitInfoARM value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int stripeSemaphoreInfoCount() {return this.ptr.get(LAYOUT__stripeSemaphoreInfoCount, OFFSET__stripeSemaphoreInfoCount);}
    public void stripeSemaphoreInfoCount(int value) {this.ptr.set(LAYOUT__stripeSemaphoreInfoCount, OFFSET__stripeSemaphoreInfoCount, value);}
    public java.lang.foreign.MemorySegment $stripeSemaphoreInfoCount() {return this.ptr.asSlice(OFFSET__stripeSemaphoreInfoCount, LAYOUT__stripeSemaphoreInfoCount);}

    public java.lang.foreign.MemorySegment pStripeSemaphoreInfos() {return this.ptr.get(LAYOUT__pStripeSemaphoreInfos, OFFSET__pStripeSemaphoreInfos);}
    public void pStripeSemaphoreInfos(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pStripeSemaphoreInfos, OFFSET__pStripeSemaphoreInfos, value);}
    public java.lang.foreign.MemorySegment $pStripeSemaphoreInfos() {return this.ptr.asSlice(OFFSET__pStripeSemaphoreInfos, LAYOUT__pStripeSemaphoreInfos);}
}
