package vulkan;

public record VkPhysicalDeviceSamplerFilterMinmaxProperties(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__filterMinmaxSingleComponentFormats = java.lang.foreign.ValueLayout.JAVA_INT.withName("filterMinmaxSingleComponentFormats");
    public static final long OFFSET__filterMinmaxSingleComponentFormats = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__filterMinmaxImageComponentMapping = java.lang.foreign.ValueLayout.JAVA_INT.withName("filterMinmaxImageComponentMapping");
    public static final long OFFSET__filterMinmaxImageComponentMapping = 20;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__filterMinmaxSingleComponentFormats,
            LAYOUT__filterMinmaxImageComponentMapping
    ).withByteAlignment(8).withName("VkPhysicalDeviceSamplerFilterMinmaxProperties");

    public VkPhysicalDeviceSamplerFilterMinmaxProperties(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceSamplerFilterMinmaxProperties getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceSamplerFilterMinmaxProperties(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceSamplerFilterMinmaxProperties value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int filterMinmaxSingleComponentFormats() {return this.ptr.get(LAYOUT__filterMinmaxSingleComponentFormats, OFFSET__filterMinmaxSingleComponentFormats);}
    public void filterMinmaxSingleComponentFormats(int value) {this.ptr.set(LAYOUT__filterMinmaxSingleComponentFormats, OFFSET__filterMinmaxSingleComponentFormats, value);}
    public java.lang.foreign.MemorySegment $filterMinmaxSingleComponentFormats() {return this.ptr.asSlice(OFFSET__filterMinmaxSingleComponentFormats, LAYOUT__filterMinmaxSingleComponentFormats);}

    public int filterMinmaxImageComponentMapping() {return this.ptr.get(LAYOUT__filterMinmaxImageComponentMapping, OFFSET__filterMinmaxImageComponentMapping);}
    public void filterMinmaxImageComponentMapping(int value) {this.ptr.set(LAYOUT__filterMinmaxImageComponentMapping, OFFSET__filterMinmaxImageComponentMapping, value);}
    public java.lang.foreign.MemorySegment $filterMinmaxImageComponentMapping() {return this.ptr.asSlice(OFFSET__filterMinmaxImageComponentMapping, LAYOUT__filterMinmaxImageComponentMapping);}
}
