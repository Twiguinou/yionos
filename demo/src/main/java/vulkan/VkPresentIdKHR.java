package vulkan;

public record VkPresentIdKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__swapchainCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__swapchainCount = 16;
    public static final java.lang.foreign.AddressLayout LAYOUT__pPresentIds = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pPresentIds = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__swapchainCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pPresentIds
    ).withByteAlignment(8).withName("VkPresentIdKHR");

    public VkPresentIdKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPresentIdKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPresentIdKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPresentIdKHR value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int swapchainCount() {return this.ptr.get(LAYOUT__swapchainCount, OFFSET__swapchainCount);}
    public void swapchainCount(int value) {this.ptr.set(LAYOUT__swapchainCount, OFFSET__swapchainCount, value);}
    public java.lang.foreign.MemorySegment $swapchainCount() {return this.ptr.asSlice(OFFSET__swapchainCount, LAYOUT__swapchainCount);}

    public java.lang.foreign.MemorySegment pPresentIds() {return this.ptr.get(LAYOUT__pPresentIds, OFFSET__pPresentIds);}
    public void pPresentIds(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pPresentIds, OFFSET__pPresentIds, value);}
    public java.lang.foreign.MemorySegment $pPresentIds() {return this.ptr.asSlice(OFFSET__pPresentIds, LAYOUT__pPresentIds);}
}
