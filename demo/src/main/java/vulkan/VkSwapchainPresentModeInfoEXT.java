package vulkan;

public record VkSwapchainPresentModeInfoEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$swapchainCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$swapchainCount = 16L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pPresentModes = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pPresentModes = 24L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$swapchainCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pPresentModes
    ).withName("VkSwapchainPresentModeInfoEXT");

    public VkSwapchainPresentModeInfoEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VkSwapchainPresentModeInfoEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VkSwapchainPresentModeInfoEXT(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int swapchainCount() {return this.ptr.get(LAYOUT$swapchainCount, OFFSET$swapchainCount);}
    public void swapchainCount(int value) {this.ptr.set(LAYOUT$swapchainCount, OFFSET$swapchainCount, value);}
    public java.lang.foreign.MemorySegment swapchainCount_ptr() {return this.ptr.asSlice(OFFSET$swapchainCount, LAYOUT$swapchainCount);}

    public java.lang.foreign.MemorySegment pPresentModes() {return this.ptr.get(LAYOUT$pPresentModes, OFFSET$pPresentModes);}
    public void pPresentModes(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pPresentModes, OFFSET$pPresentModes, value);}
    public java.lang.foreign.MemorySegment pPresentModes_ptr() {return this.ptr.asSlice(OFFSET$pPresentModes, LAYOUT$pPresentModes);}
}
