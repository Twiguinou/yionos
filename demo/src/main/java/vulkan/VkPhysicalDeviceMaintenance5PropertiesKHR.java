package vulkan;

public record VkPhysicalDeviceMaintenance5PropertiesKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__earlyFragmentMultisampleCoverageAfterSampleCounting = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__earlyFragmentMultisampleCoverageAfterSampleCounting = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__earlyFragmentSampleMaskTestBeforeSampleCounting = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__earlyFragmentSampleMaskTestBeforeSampleCounting = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__depthStencilSwizzleOneSupport = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__depthStencilSwizzleOneSupport = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__polygonModePointSize = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__polygonModePointSize = 28;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__nonStrictSinglePixelWideLinesUseParallelogram = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__nonStrictSinglePixelWideLinesUseParallelogram = 32;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__nonStrictWideLinesUseParallelogram = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__nonStrictWideLinesUseParallelogram = 36;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__earlyFragmentMultisampleCoverageAfterSampleCounting,
            LAYOUT__earlyFragmentSampleMaskTestBeforeSampleCounting,
            LAYOUT__depthStencilSwizzleOneSupport,
            LAYOUT__polygonModePointSize,
            LAYOUT__nonStrictSinglePixelWideLinesUseParallelogram,
            LAYOUT__nonStrictWideLinesUseParallelogram
    ).withByteAlignment(8).withName("VkPhysicalDeviceMaintenance5PropertiesKHR");

    public VkPhysicalDeviceMaintenance5PropertiesKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceMaintenance5PropertiesKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceMaintenance5PropertiesKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceMaintenance5PropertiesKHR value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int earlyFragmentMultisampleCoverageAfterSampleCounting() {return this.ptr.get(LAYOUT__earlyFragmentMultisampleCoverageAfterSampleCounting, OFFSET__earlyFragmentMultisampleCoverageAfterSampleCounting);}
    public void earlyFragmentMultisampleCoverageAfterSampleCounting(int value) {this.ptr.set(LAYOUT__earlyFragmentMultisampleCoverageAfterSampleCounting, OFFSET__earlyFragmentMultisampleCoverageAfterSampleCounting, value);}
    public java.lang.foreign.MemorySegment $earlyFragmentMultisampleCoverageAfterSampleCounting() {return this.ptr.asSlice(OFFSET__earlyFragmentMultisampleCoverageAfterSampleCounting, LAYOUT__earlyFragmentMultisampleCoverageAfterSampleCounting);}

    public int earlyFragmentSampleMaskTestBeforeSampleCounting() {return this.ptr.get(LAYOUT__earlyFragmentSampleMaskTestBeforeSampleCounting, OFFSET__earlyFragmentSampleMaskTestBeforeSampleCounting);}
    public void earlyFragmentSampleMaskTestBeforeSampleCounting(int value) {this.ptr.set(LAYOUT__earlyFragmentSampleMaskTestBeforeSampleCounting, OFFSET__earlyFragmentSampleMaskTestBeforeSampleCounting, value);}
    public java.lang.foreign.MemorySegment $earlyFragmentSampleMaskTestBeforeSampleCounting() {return this.ptr.asSlice(OFFSET__earlyFragmentSampleMaskTestBeforeSampleCounting, LAYOUT__earlyFragmentSampleMaskTestBeforeSampleCounting);}

    public int depthStencilSwizzleOneSupport() {return this.ptr.get(LAYOUT__depthStencilSwizzleOneSupport, OFFSET__depthStencilSwizzleOneSupport);}
    public void depthStencilSwizzleOneSupport(int value) {this.ptr.set(LAYOUT__depthStencilSwizzleOneSupport, OFFSET__depthStencilSwizzleOneSupport, value);}
    public java.lang.foreign.MemorySegment $depthStencilSwizzleOneSupport() {return this.ptr.asSlice(OFFSET__depthStencilSwizzleOneSupport, LAYOUT__depthStencilSwizzleOneSupport);}

    public int polygonModePointSize() {return this.ptr.get(LAYOUT__polygonModePointSize, OFFSET__polygonModePointSize);}
    public void polygonModePointSize(int value) {this.ptr.set(LAYOUT__polygonModePointSize, OFFSET__polygonModePointSize, value);}
    public java.lang.foreign.MemorySegment $polygonModePointSize() {return this.ptr.asSlice(OFFSET__polygonModePointSize, LAYOUT__polygonModePointSize);}

    public int nonStrictSinglePixelWideLinesUseParallelogram() {return this.ptr.get(LAYOUT__nonStrictSinglePixelWideLinesUseParallelogram, OFFSET__nonStrictSinglePixelWideLinesUseParallelogram);}
    public void nonStrictSinglePixelWideLinesUseParallelogram(int value) {this.ptr.set(LAYOUT__nonStrictSinglePixelWideLinesUseParallelogram, OFFSET__nonStrictSinglePixelWideLinesUseParallelogram, value);}
    public java.lang.foreign.MemorySegment $nonStrictSinglePixelWideLinesUseParallelogram() {return this.ptr.asSlice(OFFSET__nonStrictSinglePixelWideLinesUseParallelogram, LAYOUT__nonStrictSinglePixelWideLinesUseParallelogram);}

    public int nonStrictWideLinesUseParallelogram() {return this.ptr.get(LAYOUT__nonStrictWideLinesUseParallelogram, OFFSET__nonStrictWideLinesUseParallelogram);}
    public void nonStrictWideLinesUseParallelogram(int value) {this.ptr.set(LAYOUT__nonStrictWideLinesUseParallelogram, OFFSET__nonStrictWideLinesUseParallelogram, value);}
    public java.lang.foreign.MemorySegment $nonStrictWideLinesUseParallelogram() {return this.ptr.asSlice(OFFSET__nonStrictWideLinesUseParallelogram, LAYOUT__nonStrictWideLinesUseParallelogram);}
}
