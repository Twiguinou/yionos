package vulkan;

public record VkSwapchainDisplayNativeHdrCreateInfoAMD(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__localDimmingEnable = java.lang.foreign.ValueLayout.JAVA_INT.withName("localDimmingEnable");
    public static final long OFFSET__localDimmingEnable = 16;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__localDimmingEnable,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkSwapchainDisplayNativeHdrCreateInfoAMD");

    public VkSwapchainDisplayNativeHdrCreateInfoAMD(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkSwapchainDisplayNativeHdrCreateInfoAMD getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkSwapchainDisplayNativeHdrCreateInfoAMD(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkSwapchainDisplayNativeHdrCreateInfoAMD value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int localDimmingEnable() {return this.ptr.get(LAYOUT__localDimmingEnable, OFFSET__localDimmingEnable);}
    public void localDimmingEnable(int value) {this.ptr.set(LAYOUT__localDimmingEnable, OFFSET__localDimmingEnable, value);}
    public java.lang.foreign.MemorySegment $localDimmingEnable() {return this.ptr.asSlice(OFFSET__localDimmingEnable, LAYOUT__localDimmingEnable);}
}
