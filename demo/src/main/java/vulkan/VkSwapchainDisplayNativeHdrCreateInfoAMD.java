package vulkan;

public record VkSwapchainDisplayNativeHdrCreateInfoAMD(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$localDimmingEnable = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$localDimmingEnable = 16L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$localDimmingEnable,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("VkSwapchainDisplayNativeHdrCreateInfoAMD");

    public VkSwapchainDisplayNativeHdrCreateInfoAMD(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VkSwapchainDisplayNativeHdrCreateInfoAMD getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VkSwapchainDisplayNativeHdrCreateInfoAMD(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int localDimmingEnable() {return this.ptr.get(LAYOUT$localDimmingEnable, OFFSET$localDimmingEnable);}
    public void localDimmingEnable(int value) {this.ptr.set(LAYOUT$localDimmingEnable, OFFSET$localDimmingEnable, value);}
    public java.lang.foreign.MemorySegment localDimmingEnable_ptr() {return this.ptr.asSlice(OFFSET$localDimmingEnable, LAYOUT$localDimmingEnable);}
}
