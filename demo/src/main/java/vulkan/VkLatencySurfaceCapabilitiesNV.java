package vulkan;

public record VkLatencySurfaceCapabilitiesNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__presentModeCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("presentModeCount");
    public static final long OFFSET__presentModeCount = 16;
    public static final java.lang.foreign.AddressLayout LAYOUT__pPresentModes = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pPresentModes");
    public static final long OFFSET__pPresentModes = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__presentModeCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pPresentModes
    ).withByteAlignment(8).withName("VkLatencySurfaceCapabilitiesNV");

    public VkLatencySurfaceCapabilitiesNV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkLatencySurfaceCapabilitiesNV getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkLatencySurfaceCapabilitiesNV(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkLatencySurfaceCapabilitiesNV value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int presentModeCount() {return this.ptr.get(LAYOUT__presentModeCount, OFFSET__presentModeCount);}
    public void presentModeCount(int value) {this.ptr.set(LAYOUT__presentModeCount, OFFSET__presentModeCount, value);}
    public java.lang.foreign.MemorySegment $presentModeCount() {return this.ptr.asSlice(OFFSET__presentModeCount, LAYOUT__presentModeCount);}

    public java.lang.foreign.MemorySegment pPresentModes() {return this.ptr.get(LAYOUT__pPresentModes, OFFSET__pPresentModes);}
    public void pPresentModes(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pPresentModes, OFFSET__pPresentModes, value);}
    public java.lang.foreign.MemorySegment $pPresentModes() {return this.ptr.asSlice(OFFSET__pPresentModes, LAYOUT__pPresentModes);}
}
