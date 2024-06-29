package vulkan;

public record VkBindImageMemorySwapchainInfoKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.AddressLayout LAYOUT__swapchain = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__swapchain = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__imageIndex = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__imageIndex = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__swapchain,
            LAYOUT__imageIndex,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkBindImageMemorySwapchainInfoKHR");

    public VkBindImageMemorySwapchainInfoKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkBindImageMemorySwapchainInfoKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkBindImageMemorySwapchainInfoKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkBindImageMemorySwapchainInfoKHR value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public java.lang.foreign.MemorySegment swapchain() {return this.ptr.get(LAYOUT__swapchain, OFFSET__swapchain);}
    public void swapchain(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__swapchain, OFFSET__swapchain, value);}
    public java.lang.foreign.MemorySegment $swapchain() {return this.ptr.asSlice(OFFSET__swapchain, LAYOUT__swapchain);}

    public int imageIndex() {return this.ptr.get(LAYOUT__imageIndex, OFFSET__imageIndex);}
    public void imageIndex(int value) {this.ptr.set(LAYOUT__imageIndex, OFFSET__imageIndex, value);}
    public java.lang.foreign.MemorySegment $imageIndex() {return this.ptr.asSlice(OFFSET__imageIndex, LAYOUT__imageIndex);}
}
