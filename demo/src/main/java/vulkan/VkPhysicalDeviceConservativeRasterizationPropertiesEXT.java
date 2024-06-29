package vulkan;

public record VkPhysicalDeviceConservativeRasterizationPropertiesEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__primitiveOverestimationSize = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET__primitiveOverestimationSize = 16;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__maxExtraPrimitiveOverestimationSize = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET__maxExtraPrimitiveOverestimationSize = 20;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__extraPrimitiveOverestimationSizeGranularity = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET__extraPrimitiveOverestimationSizeGranularity = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__primitiveUnderestimation = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__primitiveUnderestimation = 28;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__conservativePointAndLineRasterization = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__conservativePointAndLineRasterization = 32;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__degenerateTrianglesRasterized = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__degenerateTrianglesRasterized = 36;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__degenerateLinesRasterized = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__degenerateLinesRasterized = 40;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__fullyCoveredFragmentShaderInputVariable = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__fullyCoveredFragmentShaderInputVariable = 44;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__conservativeRasterizationPostDepthCoverage = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__conservativeRasterizationPostDepthCoverage = 48;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__primitiveOverestimationSize,
            LAYOUT__maxExtraPrimitiveOverestimationSize,
            LAYOUT__extraPrimitiveOverestimationSizeGranularity,
            LAYOUT__primitiveUnderestimation,
            LAYOUT__conservativePointAndLineRasterization,
            LAYOUT__degenerateTrianglesRasterized,
            LAYOUT__degenerateLinesRasterized,
            LAYOUT__fullyCoveredFragmentShaderInputVariable,
            LAYOUT__conservativeRasterizationPostDepthCoverage,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkPhysicalDeviceConservativeRasterizationPropertiesEXT");

    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceConservativeRasterizationPropertiesEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceConservativeRasterizationPropertiesEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceConservativeRasterizationPropertiesEXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public float primitiveOverestimationSize() {return this.ptr.get(LAYOUT__primitiveOverestimationSize, OFFSET__primitiveOverestimationSize);}
    public void primitiveOverestimationSize(float value) {this.ptr.set(LAYOUT__primitiveOverestimationSize, OFFSET__primitiveOverestimationSize, value);}
    public java.lang.foreign.MemorySegment $primitiveOverestimationSize() {return this.ptr.asSlice(OFFSET__primitiveOverestimationSize, LAYOUT__primitiveOverestimationSize);}

    public float maxExtraPrimitiveOverestimationSize() {return this.ptr.get(LAYOUT__maxExtraPrimitiveOverestimationSize, OFFSET__maxExtraPrimitiveOverestimationSize);}
    public void maxExtraPrimitiveOverestimationSize(float value) {this.ptr.set(LAYOUT__maxExtraPrimitiveOverestimationSize, OFFSET__maxExtraPrimitiveOverestimationSize, value);}
    public java.lang.foreign.MemorySegment $maxExtraPrimitiveOverestimationSize() {return this.ptr.asSlice(OFFSET__maxExtraPrimitiveOverestimationSize, LAYOUT__maxExtraPrimitiveOverestimationSize);}

    public float extraPrimitiveOverestimationSizeGranularity() {return this.ptr.get(LAYOUT__extraPrimitiveOverestimationSizeGranularity, OFFSET__extraPrimitiveOverestimationSizeGranularity);}
    public void extraPrimitiveOverestimationSizeGranularity(float value) {this.ptr.set(LAYOUT__extraPrimitiveOverestimationSizeGranularity, OFFSET__extraPrimitiveOverestimationSizeGranularity, value);}
    public java.lang.foreign.MemorySegment $extraPrimitiveOverestimationSizeGranularity() {return this.ptr.asSlice(OFFSET__extraPrimitiveOverestimationSizeGranularity, LAYOUT__extraPrimitiveOverestimationSizeGranularity);}

    public int primitiveUnderestimation() {return this.ptr.get(LAYOUT__primitiveUnderestimation, OFFSET__primitiveUnderestimation);}
    public void primitiveUnderestimation(int value) {this.ptr.set(LAYOUT__primitiveUnderestimation, OFFSET__primitiveUnderestimation, value);}
    public java.lang.foreign.MemorySegment $primitiveUnderestimation() {return this.ptr.asSlice(OFFSET__primitiveUnderestimation, LAYOUT__primitiveUnderestimation);}

    public int conservativePointAndLineRasterization() {return this.ptr.get(LAYOUT__conservativePointAndLineRasterization, OFFSET__conservativePointAndLineRasterization);}
    public void conservativePointAndLineRasterization(int value) {this.ptr.set(LAYOUT__conservativePointAndLineRasterization, OFFSET__conservativePointAndLineRasterization, value);}
    public java.lang.foreign.MemorySegment $conservativePointAndLineRasterization() {return this.ptr.asSlice(OFFSET__conservativePointAndLineRasterization, LAYOUT__conservativePointAndLineRasterization);}

    public int degenerateTrianglesRasterized() {return this.ptr.get(LAYOUT__degenerateTrianglesRasterized, OFFSET__degenerateTrianglesRasterized);}
    public void degenerateTrianglesRasterized(int value) {this.ptr.set(LAYOUT__degenerateTrianglesRasterized, OFFSET__degenerateTrianglesRasterized, value);}
    public java.lang.foreign.MemorySegment $degenerateTrianglesRasterized() {return this.ptr.asSlice(OFFSET__degenerateTrianglesRasterized, LAYOUT__degenerateTrianglesRasterized);}

    public int degenerateLinesRasterized() {return this.ptr.get(LAYOUT__degenerateLinesRasterized, OFFSET__degenerateLinesRasterized);}
    public void degenerateLinesRasterized(int value) {this.ptr.set(LAYOUT__degenerateLinesRasterized, OFFSET__degenerateLinesRasterized, value);}
    public java.lang.foreign.MemorySegment $degenerateLinesRasterized() {return this.ptr.asSlice(OFFSET__degenerateLinesRasterized, LAYOUT__degenerateLinesRasterized);}

    public int fullyCoveredFragmentShaderInputVariable() {return this.ptr.get(LAYOUT__fullyCoveredFragmentShaderInputVariable, OFFSET__fullyCoveredFragmentShaderInputVariable);}
    public void fullyCoveredFragmentShaderInputVariable(int value) {this.ptr.set(LAYOUT__fullyCoveredFragmentShaderInputVariable, OFFSET__fullyCoveredFragmentShaderInputVariable, value);}
    public java.lang.foreign.MemorySegment $fullyCoveredFragmentShaderInputVariable() {return this.ptr.asSlice(OFFSET__fullyCoveredFragmentShaderInputVariable, LAYOUT__fullyCoveredFragmentShaderInputVariable);}

    public int conservativeRasterizationPostDepthCoverage() {return this.ptr.get(LAYOUT__conservativeRasterizationPostDepthCoverage, OFFSET__conservativeRasterizationPostDepthCoverage);}
    public void conservativeRasterizationPostDepthCoverage(int value) {this.ptr.set(LAYOUT__conservativeRasterizationPostDepthCoverage, OFFSET__conservativeRasterizationPostDepthCoverage, value);}
    public java.lang.foreign.MemorySegment $conservativeRasterizationPostDepthCoverage() {return this.ptr.asSlice(OFFSET__conservativeRasterizationPostDepthCoverage, LAYOUT__conservativeRasterizationPostDepthCoverage);}
}
