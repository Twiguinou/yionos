package vulkan;

public record VkPipelineMultisampleStateCreateInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__flags = java.lang.foreign.ValueLayout.JAVA_INT.withName("flags");
    public static final long OFFSET__flags = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__rasterizationSamples = java.lang.foreign.ValueLayout.JAVA_INT.withName("rasterizationSamples");
    public static final long OFFSET__rasterizationSamples = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sampleShadingEnable = java.lang.foreign.ValueLayout.JAVA_INT.withName("sampleShadingEnable");
    public static final long OFFSET__sampleShadingEnable = 24;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__minSampleShading = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("minSampleShading");
    public static final long OFFSET__minSampleShading = 28;
    public static final java.lang.foreign.AddressLayout LAYOUT__pSampleMask = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pSampleMask");
    public static final long OFFSET__pSampleMask = 32;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__alphaToCoverageEnable = java.lang.foreign.ValueLayout.JAVA_INT.withName("alphaToCoverageEnable");
    public static final long OFFSET__alphaToCoverageEnable = 40;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__alphaToOneEnable = java.lang.foreign.ValueLayout.JAVA_INT.withName("alphaToOneEnable");
    public static final long OFFSET__alphaToOneEnable = 44;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__flags,
            LAYOUT__rasterizationSamples,
            LAYOUT__sampleShadingEnable,
            LAYOUT__minSampleShading,
            LAYOUT__pSampleMask,
            LAYOUT__alphaToCoverageEnable,
            LAYOUT__alphaToOneEnable
    ).withByteAlignment(8).withName("VkPipelineMultisampleStateCreateInfo");

    public VkPipelineMultisampleStateCreateInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPipelineMultisampleStateCreateInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPipelineMultisampleStateCreateInfo(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPipelineMultisampleStateCreateInfo value)
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

    public int rasterizationSamples() {return this.ptr.get(LAYOUT__rasterizationSamples, OFFSET__rasterizationSamples);}
    public void rasterizationSamples(int value) {this.ptr.set(LAYOUT__rasterizationSamples, OFFSET__rasterizationSamples, value);}
    public java.lang.foreign.MemorySegment $rasterizationSamples() {return this.ptr.asSlice(OFFSET__rasterizationSamples, LAYOUT__rasterizationSamples);}

    public int sampleShadingEnable() {return this.ptr.get(LAYOUT__sampleShadingEnable, OFFSET__sampleShadingEnable);}
    public void sampleShadingEnable(int value) {this.ptr.set(LAYOUT__sampleShadingEnable, OFFSET__sampleShadingEnable, value);}
    public java.lang.foreign.MemorySegment $sampleShadingEnable() {return this.ptr.asSlice(OFFSET__sampleShadingEnable, LAYOUT__sampleShadingEnable);}

    public float minSampleShading() {return this.ptr.get(LAYOUT__minSampleShading, OFFSET__minSampleShading);}
    public void minSampleShading(float value) {this.ptr.set(LAYOUT__minSampleShading, OFFSET__minSampleShading, value);}
    public java.lang.foreign.MemorySegment $minSampleShading() {return this.ptr.asSlice(OFFSET__minSampleShading, LAYOUT__minSampleShading);}

    public java.lang.foreign.MemorySegment pSampleMask() {return this.ptr.get(LAYOUT__pSampleMask, OFFSET__pSampleMask);}
    public void pSampleMask(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pSampleMask, OFFSET__pSampleMask, value);}
    public java.lang.foreign.MemorySegment $pSampleMask() {return this.ptr.asSlice(OFFSET__pSampleMask, LAYOUT__pSampleMask);}

    public int alphaToCoverageEnable() {return this.ptr.get(LAYOUT__alphaToCoverageEnable, OFFSET__alphaToCoverageEnable);}
    public void alphaToCoverageEnable(int value) {this.ptr.set(LAYOUT__alphaToCoverageEnable, OFFSET__alphaToCoverageEnable, value);}
    public java.lang.foreign.MemorySegment $alphaToCoverageEnable() {return this.ptr.asSlice(OFFSET__alphaToCoverageEnable, LAYOUT__alphaToCoverageEnable);}

    public int alphaToOneEnable() {return this.ptr.get(LAYOUT__alphaToOneEnable, OFFSET__alphaToOneEnable);}
    public void alphaToOneEnable(int value) {this.ptr.set(LAYOUT__alphaToOneEnable, OFFSET__alphaToOneEnable, value);}
    public java.lang.foreign.MemorySegment $alphaToOneEnable() {return this.ptr.asSlice(OFFSET__alphaToOneEnable, LAYOUT__alphaToOneEnable);}
}
