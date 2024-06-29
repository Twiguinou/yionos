package vulkan;

public record VkDeviceDeviceMemoryReportCreateInfoEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__flags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__flags = 16;
    public static final java.lang.foreign.AddressLayout LAYOUT__pfnUserCallback = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pfnUserCallback = 24;
    public static final java.lang.foreign.AddressLayout LAYOUT__pUserData = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pUserData = 32;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__flags,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pfnUserCallback,
            LAYOUT__pUserData
    ).withByteAlignment(8).withName("VkDeviceDeviceMemoryReportCreateInfoEXT");

    public VkDeviceDeviceMemoryReportCreateInfoEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkDeviceDeviceMemoryReportCreateInfoEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkDeviceDeviceMemoryReportCreateInfoEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkDeviceDeviceMemoryReportCreateInfoEXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int flags() {return this.ptr.get(LAYOUT__flags, OFFSET__flags);}
    public void flags(int value) {this.ptr.set(LAYOUT__flags, OFFSET__flags, value);}
    public java.lang.foreign.MemorySegment $flags() {return this.ptr.asSlice(OFFSET__flags, LAYOUT__flags);}

    public java.lang.foreign.MemorySegment pfnUserCallback() {return this.ptr.get(LAYOUT__pfnUserCallback, OFFSET__pfnUserCallback);}
    public void pfnUserCallback(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pfnUserCallback, OFFSET__pfnUserCallback, value);}
    public java.lang.foreign.MemorySegment $pfnUserCallback() {return this.ptr.asSlice(OFFSET__pfnUserCallback, LAYOUT__pfnUserCallback);}

    public java.lang.foreign.MemorySegment pUserData() {return this.ptr.get(LAYOUT__pUserData, OFFSET__pUserData);}
    public void pUserData(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pUserData, OFFSET__pUserData, value);}
    public java.lang.foreign.MemorySegment $pUserData() {return this.ptr.asSlice(OFFSET__pUserData, LAYOUT__pUserData);}
}
