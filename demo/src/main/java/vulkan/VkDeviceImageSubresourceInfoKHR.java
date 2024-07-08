package vulkan;

public record VkDeviceImageSubresourceInfoKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.AddressLayout LAYOUT__pCreateInfo = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pCreateInfo");
    public static final long OFFSET__pCreateInfo = 16;
    public static final java.lang.foreign.AddressLayout LAYOUT__pSubresource = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pSubresource");
    public static final long OFFSET__pSubresource = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__pCreateInfo,
            LAYOUT__pSubresource
    ).withByteAlignment(8).withName("VkDeviceImageSubresourceInfoKHR");

    public VkDeviceImageSubresourceInfoKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkDeviceImageSubresourceInfoKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkDeviceImageSubresourceInfoKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkDeviceImageSubresourceInfoKHR value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public java.lang.foreign.MemorySegment pCreateInfo() {return this.ptr.get(LAYOUT__pCreateInfo, OFFSET__pCreateInfo);}
    public void pCreateInfo(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pCreateInfo, OFFSET__pCreateInfo, value);}
    public java.lang.foreign.MemorySegment $pCreateInfo() {return this.ptr.asSlice(OFFSET__pCreateInfo, LAYOUT__pCreateInfo);}

    public java.lang.foreign.MemorySegment pSubresource() {return this.ptr.get(LAYOUT__pSubresource, OFFSET__pSubresource);}
    public void pSubresource(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pSubresource, OFFSET__pSubresource, value);}
    public java.lang.foreign.MemorySegment $pSubresource() {return this.ptr.asSlice(OFFSET__pSubresource, LAYOUT__pSubresource);}
}
