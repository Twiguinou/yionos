package vulkan;

public record VkRenderPassStripeSubmitInfoARM(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$stripeSemaphoreInfoCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$stripeSemaphoreInfoCount = 16L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pStripeSemaphoreInfos = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pStripeSemaphoreInfos = 24L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$stripeSemaphoreInfoCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pStripeSemaphoreInfos
    ).withName("VkRenderPassStripeSubmitInfoARM");

    public VkRenderPassStripeSubmitInfoARM(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VkRenderPassStripeSubmitInfoARM getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VkRenderPassStripeSubmitInfoARM(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int stripeSemaphoreInfoCount() {return this.ptr.get(LAYOUT$stripeSemaphoreInfoCount, OFFSET$stripeSemaphoreInfoCount);}
    public void stripeSemaphoreInfoCount(int value) {this.ptr.set(LAYOUT$stripeSemaphoreInfoCount, OFFSET$stripeSemaphoreInfoCount, value);}
    public java.lang.foreign.MemorySegment stripeSemaphoreInfoCount_ptr() {return this.ptr.asSlice(OFFSET$stripeSemaphoreInfoCount, LAYOUT$stripeSemaphoreInfoCount);}

    public java.lang.foreign.MemorySegment pStripeSemaphoreInfos() {return this.ptr.get(LAYOUT$pStripeSemaphoreInfos, OFFSET$pStripeSemaphoreInfos);}
    public void pStripeSemaphoreInfos(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pStripeSemaphoreInfos, OFFSET$pStripeSemaphoreInfos, value);}
    public java.lang.foreign.MemorySegment pStripeSemaphoreInfos_ptr() {return this.ptr.asSlice(OFFSET$pStripeSemaphoreInfos, LAYOUT$pStripeSemaphoreInfos);}
}
