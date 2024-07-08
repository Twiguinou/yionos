package vulkan;

public record VkFramebufferMixedSamplesCombinationNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__coverageReductionMode = java.lang.foreign.ValueLayout.JAVA_INT.withName("coverageReductionMode");
    public static final long OFFSET__coverageReductionMode = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__rasterizationSamples = java.lang.foreign.ValueLayout.JAVA_INT.withName("rasterizationSamples");
    public static final long OFFSET__rasterizationSamples = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__depthStencilSamples = java.lang.foreign.ValueLayout.JAVA_INT.withName("depthStencilSamples");
    public static final long OFFSET__depthStencilSamples = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__colorSamples = java.lang.foreign.ValueLayout.JAVA_INT.withName("colorSamples");
    public static final long OFFSET__colorSamples = 28;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__coverageReductionMode,
            LAYOUT__rasterizationSamples,
            LAYOUT__depthStencilSamples,
            LAYOUT__colorSamples
    ).withByteAlignment(8).withName("VkFramebufferMixedSamplesCombinationNV");

    public VkFramebufferMixedSamplesCombinationNV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkFramebufferMixedSamplesCombinationNV getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkFramebufferMixedSamplesCombinationNV(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkFramebufferMixedSamplesCombinationNV value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int coverageReductionMode() {return this.ptr.get(LAYOUT__coverageReductionMode, OFFSET__coverageReductionMode);}
    public void coverageReductionMode(int value) {this.ptr.set(LAYOUT__coverageReductionMode, OFFSET__coverageReductionMode, value);}
    public java.lang.foreign.MemorySegment $coverageReductionMode() {return this.ptr.asSlice(OFFSET__coverageReductionMode, LAYOUT__coverageReductionMode);}

    public int rasterizationSamples() {return this.ptr.get(LAYOUT__rasterizationSamples, OFFSET__rasterizationSamples);}
    public void rasterizationSamples(int value) {this.ptr.set(LAYOUT__rasterizationSamples, OFFSET__rasterizationSamples, value);}
    public java.lang.foreign.MemorySegment $rasterizationSamples() {return this.ptr.asSlice(OFFSET__rasterizationSamples, LAYOUT__rasterizationSamples);}

    public int depthStencilSamples() {return this.ptr.get(LAYOUT__depthStencilSamples, OFFSET__depthStencilSamples);}
    public void depthStencilSamples(int value) {this.ptr.set(LAYOUT__depthStencilSamples, OFFSET__depthStencilSamples, value);}
    public java.lang.foreign.MemorySegment $depthStencilSamples() {return this.ptr.asSlice(OFFSET__depthStencilSamples, LAYOUT__depthStencilSamples);}

    public int colorSamples() {return this.ptr.get(LAYOUT__colorSamples, OFFSET__colorSamples);}
    public void colorSamples(int value) {this.ptr.set(LAYOUT__colorSamples, OFFSET__colorSamples, value);}
    public java.lang.foreign.MemorySegment $colorSamples() {return this.ptr.asSlice(OFFSET__colorSamples, LAYOUT__colorSamples);}
}
