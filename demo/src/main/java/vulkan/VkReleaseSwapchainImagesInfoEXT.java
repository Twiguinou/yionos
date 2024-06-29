package vulkan;

public record VkReleaseSwapchainImagesInfoEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.AddressLayout LAYOUT__swapchain = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__swapchain = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__imageIndexCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__imageIndexCount = 24;
    public static final java.lang.foreign.AddressLayout LAYOUT__pImageIndices = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pImageIndices = 32;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__swapchain,
            LAYOUT__imageIndexCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pImageIndices
    ).withByteAlignment(8).withName("VkReleaseSwapchainImagesInfoEXT");

    public VkReleaseSwapchainImagesInfoEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkReleaseSwapchainImagesInfoEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkReleaseSwapchainImagesInfoEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkReleaseSwapchainImagesInfoEXT value)
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

    public int imageIndexCount() {return this.ptr.get(LAYOUT__imageIndexCount, OFFSET__imageIndexCount);}
    public void imageIndexCount(int value) {this.ptr.set(LAYOUT__imageIndexCount, OFFSET__imageIndexCount, value);}
    public java.lang.foreign.MemorySegment $imageIndexCount() {return this.ptr.asSlice(OFFSET__imageIndexCount, LAYOUT__imageIndexCount);}

    public java.lang.foreign.MemorySegment pImageIndices() {return this.ptr.get(LAYOUT__pImageIndices, OFFSET__pImageIndices);}
    public void pImageIndices(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pImageIndices, OFFSET__pImageIndices, value);}
    public java.lang.foreign.MemorySegment $pImageIndices() {return this.ptr.asSlice(OFFSET__pImageIndices, LAYOUT__pImageIndices);}
}
