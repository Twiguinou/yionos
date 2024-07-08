package vulkan;

public record VkMultisampledRenderToSingleSampledInfoEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__multisampledRenderToSingleSampledEnable = java.lang.foreign.ValueLayout.JAVA_INT.withName("multisampledRenderToSingleSampledEnable");
    public static final long OFFSET__multisampledRenderToSingleSampledEnable = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__rasterizationSamples = java.lang.foreign.ValueLayout.JAVA_INT.withName("rasterizationSamples");
    public static final long OFFSET__rasterizationSamples = 20;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__multisampledRenderToSingleSampledEnable,
            LAYOUT__rasterizationSamples
    ).withByteAlignment(8).withName("VkMultisampledRenderToSingleSampledInfoEXT");

    public VkMultisampledRenderToSingleSampledInfoEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkMultisampledRenderToSingleSampledInfoEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkMultisampledRenderToSingleSampledInfoEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkMultisampledRenderToSingleSampledInfoEXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int multisampledRenderToSingleSampledEnable() {return this.ptr.get(LAYOUT__multisampledRenderToSingleSampledEnable, OFFSET__multisampledRenderToSingleSampledEnable);}
    public void multisampledRenderToSingleSampledEnable(int value) {this.ptr.set(LAYOUT__multisampledRenderToSingleSampledEnable, OFFSET__multisampledRenderToSingleSampledEnable, value);}
    public java.lang.foreign.MemorySegment $multisampledRenderToSingleSampledEnable() {return this.ptr.asSlice(OFFSET__multisampledRenderToSingleSampledEnable, LAYOUT__multisampledRenderToSingleSampledEnable);}

    public int rasterizationSamples() {return this.ptr.get(LAYOUT__rasterizationSamples, OFFSET__rasterizationSamples);}
    public void rasterizationSamples(int value) {this.ptr.set(LAYOUT__rasterizationSamples, OFFSET__rasterizationSamples, value);}
    public java.lang.foreign.MemorySegment $rasterizationSamples() {return this.ptr.asSlice(OFFSET__rasterizationSamples, LAYOUT__rasterizationSamples);}
}
