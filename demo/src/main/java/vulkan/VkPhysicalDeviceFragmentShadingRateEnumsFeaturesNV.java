package vulkan;

public record VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__fragmentShadingRateEnums = java.lang.foreign.ValueLayout.JAVA_INT.withName("fragmentShadingRateEnums");
    public static final long OFFSET__fragmentShadingRateEnums = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__supersampleFragmentShadingRates = java.lang.foreign.ValueLayout.JAVA_INT.withName("supersampleFragmentShadingRates");
    public static final long OFFSET__supersampleFragmentShadingRates = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__noInvocationFragmentShadingRates = java.lang.foreign.ValueLayout.JAVA_INT.withName("noInvocationFragmentShadingRates");
    public static final long OFFSET__noInvocationFragmentShadingRates = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__fragmentShadingRateEnums,
            LAYOUT__supersampleFragmentShadingRates,
            LAYOUT__noInvocationFragmentShadingRates,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV");

    public VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int fragmentShadingRateEnums() {return this.ptr.get(LAYOUT__fragmentShadingRateEnums, OFFSET__fragmentShadingRateEnums);}
    public void fragmentShadingRateEnums(int value) {this.ptr.set(LAYOUT__fragmentShadingRateEnums, OFFSET__fragmentShadingRateEnums, value);}
    public java.lang.foreign.MemorySegment $fragmentShadingRateEnums() {return this.ptr.asSlice(OFFSET__fragmentShadingRateEnums, LAYOUT__fragmentShadingRateEnums);}

    public int supersampleFragmentShadingRates() {return this.ptr.get(LAYOUT__supersampleFragmentShadingRates, OFFSET__supersampleFragmentShadingRates);}
    public void supersampleFragmentShadingRates(int value) {this.ptr.set(LAYOUT__supersampleFragmentShadingRates, OFFSET__supersampleFragmentShadingRates, value);}
    public java.lang.foreign.MemorySegment $supersampleFragmentShadingRates() {return this.ptr.asSlice(OFFSET__supersampleFragmentShadingRates, LAYOUT__supersampleFragmentShadingRates);}

    public int noInvocationFragmentShadingRates() {return this.ptr.get(LAYOUT__noInvocationFragmentShadingRates, OFFSET__noInvocationFragmentShadingRates);}
    public void noInvocationFragmentShadingRates(int value) {this.ptr.set(LAYOUT__noInvocationFragmentShadingRates, OFFSET__noInvocationFragmentShadingRates, value);}
    public java.lang.foreign.MemorySegment $noInvocationFragmentShadingRates() {return this.ptr.asSlice(OFFSET__noInvocationFragmentShadingRates, LAYOUT__noInvocationFragmentShadingRates);}
}
