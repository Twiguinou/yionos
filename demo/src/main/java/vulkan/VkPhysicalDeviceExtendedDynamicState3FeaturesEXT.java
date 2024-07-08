package vulkan;

public record VkPhysicalDeviceExtendedDynamicState3FeaturesEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__extendedDynamicState3TessellationDomainOrigin = java.lang.foreign.ValueLayout.JAVA_INT.withName("extendedDynamicState3TessellationDomainOrigin");
    public static final long OFFSET__extendedDynamicState3TessellationDomainOrigin = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__extendedDynamicState3DepthClampEnable = java.lang.foreign.ValueLayout.JAVA_INT.withName("extendedDynamicState3DepthClampEnable");
    public static final long OFFSET__extendedDynamicState3DepthClampEnable = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__extendedDynamicState3PolygonMode = java.lang.foreign.ValueLayout.JAVA_INT.withName("extendedDynamicState3PolygonMode");
    public static final long OFFSET__extendedDynamicState3PolygonMode = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__extendedDynamicState3RasterizationSamples = java.lang.foreign.ValueLayout.JAVA_INT.withName("extendedDynamicState3RasterizationSamples");
    public static final long OFFSET__extendedDynamicState3RasterizationSamples = 28;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__extendedDynamicState3SampleMask = java.lang.foreign.ValueLayout.JAVA_INT.withName("extendedDynamicState3SampleMask");
    public static final long OFFSET__extendedDynamicState3SampleMask = 32;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__extendedDynamicState3AlphaToCoverageEnable = java.lang.foreign.ValueLayout.JAVA_INT.withName("extendedDynamicState3AlphaToCoverageEnable");
    public static final long OFFSET__extendedDynamicState3AlphaToCoverageEnable = 36;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__extendedDynamicState3AlphaToOneEnable = java.lang.foreign.ValueLayout.JAVA_INT.withName("extendedDynamicState3AlphaToOneEnable");
    public static final long OFFSET__extendedDynamicState3AlphaToOneEnable = 40;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__extendedDynamicState3LogicOpEnable = java.lang.foreign.ValueLayout.JAVA_INT.withName("extendedDynamicState3LogicOpEnable");
    public static final long OFFSET__extendedDynamicState3LogicOpEnable = 44;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__extendedDynamicState3ColorBlendEnable = java.lang.foreign.ValueLayout.JAVA_INT.withName("extendedDynamicState3ColorBlendEnable");
    public static final long OFFSET__extendedDynamicState3ColorBlendEnable = 48;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__extendedDynamicState3ColorBlendEquation = java.lang.foreign.ValueLayout.JAVA_INT.withName("extendedDynamicState3ColorBlendEquation");
    public static final long OFFSET__extendedDynamicState3ColorBlendEquation = 52;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__extendedDynamicState3ColorWriteMask = java.lang.foreign.ValueLayout.JAVA_INT.withName("extendedDynamicState3ColorWriteMask");
    public static final long OFFSET__extendedDynamicState3ColorWriteMask = 56;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__extendedDynamicState3RasterizationStream = java.lang.foreign.ValueLayout.JAVA_INT.withName("extendedDynamicState3RasterizationStream");
    public static final long OFFSET__extendedDynamicState3RasterizationStream = 60;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__extendedDynamicState3ConservativeRasterizationMode = java.lang.foreign.ValueLayout.JAVA_INT.withName("extendedDynamicState3ConservativeRasterizationMode");
    public static final long OFFSET__extendedDynamicState3ConservativeRasterizationMode = 64;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__extendedDynamicState3ExtraPrimitiveOverestimationSize = java.lang.foreign.ValueLayout.JAVA_INT.withName("extendedDynamicState3ExtraPrimitiveOverestimationSize");
    public static final long OFFSET__extendedDynamicState3ExtraPrimitiveOverestimationSize = 68;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__extendedDynamicState3DepthClipEnable = java.lang.foreign.ValueLayout.JAVA_INT.withName("extendedDynamicState3DepthClipEnable");
    public static final long OFFSET__extendedDynamicState3DepthClipEnable = 72;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__extendedDynamicState3SampleLocationsEnable = java.lang.foreign.ValueLayout.JAVA_INT.withName("extendedDynamicState3SampleLocationsEnable");
    public static final long OFFSET__extendedDynamicState3SampleLocationsEnable = 76;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__extendedDynamicState3ColorBlendAdvanced = java.lang.foreign.ValueLayout.JAVA_INT.withName("extendedDynamicState3ColorBlendAdvanced");
    public static final long OFFSET__extendedDynamicState3ColorBlendAdvanced = 80;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__extendedDynamicState3ProvokingVertexMode = java.lang.foreign.ValueLayout.JAVA_INT.withName("extendedDynamicState3ProvokingVertexMode");
    public static final long OFFSET__extendedDynamicState3ProvokingVertexMode = 84;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__extendedDynamicState3LineRasterizationMode = java.lang.foreign.ValueLayout.JAVA_INT.withName("extendedDynamicState3LineRasterizationMode");
    public static final long OFFSET__extendedDynamicState3LineRasterizationMode = 88;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__extendedDynamicState3LineStippleEnable = java.lang.foreign.ValueLayout.JAVA_INT.withName("extendedDynamicState3LineStippleEnable");
    public static final long OFFSET__extendedDynamicState3LineStippleEnable = 92;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__extendedDynamicState3DepthClipNegativeOneToOne = java.lang.foreign.ValueLayout.JAVA_INT.withName("extendedDynamicState3DepthClipNegativeOneToOne");
    public static final long OFFSET__extendedDynamicState3DepthClipNegativeOneToOne = 96;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__extendedDynamicState3ViewportWScalingEnable = java.lang.foreign.ValueLayout.JAVA_INT.withName("extendedDynamicState3ViewportWScalingEnable");
    public static final long OFFSET__extendedDynamicState3ViewportWScalingEnable = 100;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__extendedDynamicState3ViewportSwizzle = java.lang.foreign.ValueLayout.JAVA_INT.withName("extendedDynamicState3ViewportSwizzle");
    public static final long OFFSET__extendedDynamicState3ViewportSwizzle = 104;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__extendedDynamicState3CoverageToColorEnable = java.lang.foreign.ValueLayout.JAVA_INT.withName("extendedDynamicState3CoverageToColorEnable");
    public static final long OFFSET__extendedDynamicState3CoverageToColorEnable = 108;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__extendedDynamicState3CoverageToColorLocation = java.lang.foreign.ValueLayout.JAVA_INT.withName("extendedDynamicState3CoverageToColorLocation");
    public static final long OFFSET__extendedDynamicState3CoverageToColorLocation = 112;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__extendedDynamicState3CoverageModulationMode = java.lang.foreign.ValueLayout.JAVA_INT.withName("extendedDynamicState3CoverageModulationMode");
    public static final long OFFSET__extendedDynamicState3CoverageModulationMode = 116;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__extendedDynamicState3CoverageModulationTableEnable = java.lang.foreign.ValueLayout.JAVA_INT.withName("extendedDynamicState3CoverageModulationTableEnable");
    public static final long OFFSET__extendedDynamicState3CoverageModulationTableEnable = 120;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__extendedDynamicState3CoverageModulationTable = java.lang.foreign.ValueLayout.JAVA_INT.withName("extendedDynamicState3CoverageModulationTable");
    public static final long OFFSET__extendedDynamicState3CoverageModulationTable = 124;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__extendedDynamicState3CoverageReductionMode = java.lang.foreign.ValueLayout.JAVA_INT.withName("extendedDynamicState3CoverageReductionMode");
    public static final long OFFSET__extendedDynamicState3CoverageReductionMode = 128;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__extendedDynamicState3RepresentativeFragmentTestEnable = java.lang.foreign.ValueLayout.JAVA_INT.withName("extendedDynamicState3RepresentativeFragmentTestEnable");
    public static final long OFFSET__extendedDynamicState3RepresentativeFragmentTestEnable = 132;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__extendedDynamicState3ShadingRateImageEnable = java.lang.foreign.ValueLayout.JAVA_INT.withName("extendedDynamicState3ShadingRateImageEnable");
    public static final long OFFSET__extendedDynamicState3ShadingRateImageEnable = 136;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__extendedDynamicState3TessellationDomainOrigin,
            LAYOUT__extendedDynamicState3DepthClampEnable,
            LAYOUT__extendedDynamicState3PolygonMode,
            LAYOUT__extendedDynamicState3RasterizationSamples,
            LAYOUT__extendedDynamicState3SampleMask,
            LAYOUT__extendedDynamicState3AlphaToCoverageEnable,
            LAYOUT__extendedDynamicState3AlphaToOneEnable,
            LAYOUT__extendedDynamicState3LogicOpEnable,
            LAYOUT__extendedDynamicState3ColorBlendEnable,
            LAYOUT__extendedDynamicState3ColorBlendEquation,
            LAYOUT__extendedDynamicState3ColorWriteMask,
            LAYOUT__extendedDynamicState3RasterizationStream,
            LAYOUT__extendedDynamicState3ConservativeRasterizationMode,
            LAYOUT__extendedDynamicState3ExtraPrimitiveOverestimationSize,
            LAYOUT__extendedDynamicState3DepthClipEnable,
            LAYOUT__extendedDynamicState3SampleLocationsEnable,
            LAYOUT__extendedDynamicState3ColorBlendAdvanced,
            LAYOUT__extendedDynamicState3ProvokingVertexMode,
            LAYOUT__extendedDynamicState3LineRasterizationMode,
            LAYOUT__extendedDynamicState3LineStippleEnable,
            LAYOUT__extendedDynamicState3DepthClipNegativeOneToOne,
            LAYOUT__extendedDynamicState3ViewportWScalingEnable,
            LAYOUT__extendedDynamicState3ViewportSwizzle,
            LAYOUT__extendedDynamicState3CoverageToColorEnable,
            LAYOUT__extendedDynamicState3CoverageToColorLocation,
            LAYOUT__extendedDynamicState3CoverageModulationMode,
            LAYOUT__extendedDynamicState3CoverageModulationTableEnable,
            LAYOUT__extendedDynamicState3CoverageModulationTable,
            LAYOUT__extendedDynamicState3CoverageReductionMode,
            LAYOUT__extendedDynamicState3RepresentativeFragmentTestEnable,
            LAYOUT__extendedDynamicState3ShadingRateImageEnable,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkPhysicalDeviceExtendedDynamicState3FeaturesEXT");

    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceExtendedDynamicState3FeaturesEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceExtendedDynamicState3FeaturesEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceExtendedDynamicState3FeaturesEXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int extendedDynamicState3TessellationDomainOrigin() {return this.ptr.get(LAYOUT__extendedDynamicState3TessellationDomainOrigin, OFFSET__extendedDynamicState3TessellationDomainOrigin);}
    public void extendedDynamicState3TessellationDomainOrigin(int value) {this.ptr.set(LAYOUT__extendedDynamicState3TessellationDomainOrigin, OFFSET__extendedDynamicState3TessellationDomainOrigin, value);}
    public java.lang.foreign.MemorySegment $extendedDynamicState3TessellationDomainOrigin() {return this.ptr.asSlice(OFFSET__extendedDynamicState3TessellationDomainOrigin, LAYOUT__extendedDynamicState3TessellationDomainOrigin);}

    public int extendedDynamicState3DepthClampEnable() {return this.ptr.get(LAYOUT__extendedDynamicState3DepthClampEnable, OFFSET__extendedDynamicState3DepthClampEnable);}
    public void extendedDynamicState3DepthClampEnable(int value) {this.ptr.set(LAYOUT__extendedDynamicState3DepthClampEnable, OFFSET__extendedDynamicState3DepthClampEnable, value);}
    public java.lang.foreign.MemorySegment $extendedDynamicState3DepthClampEnable() {return this.ptr.asSlice(OFFSET__extendedDynamicState3DepthClampEnable, LAYOUT__extendedDynamicState3DepthClampEnable);}

    public int extendedDynamicState3PolygonMode() {return this.ptr.get(LAYOUT__extendedDynamicState3PolygonMode, OFFSET__extendedDynamicState3PolygonMode);}
    public void extendedDynamicState3PolygonMode(int value) {this.ptr.set(LAYOUT__extendedDynamicState3PolygonMode, OFFSET__extendedDynamicState3PolygonMode, value);}
    public java.lang.foreign.MemorySegment $extendedDynamicState3PolygonMode() {return this.ptr.asSlice(OFFSET__extendedDynamicState3PolygonMode, LAYOUT__extendedDynamicState3PolygonMode);}

    public int extendedDynamicState3RasterizationSamples() {return this.ptr.get(LAYOUT__extendedDynamicState3RasterizationSamples, OFFSET__extendedDynamicState3RasterizationSamples);}
    public void extendedDynamicState3RasterizationSamples(int value) {this.ptr.set(LAYOUT__extendedDynamicState3RasterizationSamples, OFFSET__extendedDynamicState3RasterizationSamples, value);}
    public java.lang.foreign.MemorySegment $extendedDynamicState3RasterizationSamples() {return this.ptr.asSlice(OFFSET__extendedDynamicState3RasterizationSamples, LAYOUT__extendedDynamicState3RasterizationSamples);}

    public int extendedDynamicState3SampleMask() {return this.ptr.get(LAYOUT__extendedDynamicState3SampleMask, OFFSET__extendedDynamicState3SampleMask);}
    public void extendedDynamicState3SampleMask(int value) {this.ptr.set(LAYOUT__extendedDynamicState3SampleMask, OFFSET__extendedDynamicState3SampleMask, value);}
    public java.lang.foreign.MemorySegment $extendedDynamicState3SampleMask() {return this.ptr.asSlice(OFFSET__extendedDynamicState3SampleMask, LAYOUT__extendedDynamicState3SampleMask);}

    public int extendedDynamicState3AlphaToCoverageEnable() {return this.ptr.get(LAYOUT__extendedDynamicState3AlphaToCoverageEnable, OFFSET__extendedDynamicState3AlphaToCoverageEnable);}
    public void extendedDynamicState3AlphaToCoverageEnable(int value) {this.ptr.set(LAYOUT__extendedDynamicState3AlphaToCoverageEnable, OFFSET__extendedDynamicState3AlphaToCoverageEnable, value);}
    public java.lang.foreign.MemorySegment $extendedDynamicState3AlphaToCoverageEnable() {return this.ptr.asSlice(OFFSET__extendedDynamicState3AlphaToCoverageEnable, LAYOUT__extendedDynamicState3AlphaToCoverageEnable);}

    public int extendedDynamicState3AlphaToOneEnable() {return this.ptr.get(LAYOUT__extendedDynamicState3AlphaToOneEnable, OFFSET__extendedDynamicState3AlphaToOneEnable);}
    public void extendedDynamicState3AlphaToOneEnable(int value) {this.ptr.set(LAYOUT__extendedDynamicState3AlphaToOneEnable, OFFSET__extendedDynamicState3AlphaToOneEnable, value);}
    public java.lang.foreign.MemorySegment $extendedDynamicState3AlphaToOneEnable() {return this.ptr.asSlice(OFFSET__extendedDynamicState3AlphaToOneEnable, LAYOUT__extendedDynamicState3AlphaToOneEnable);}

    public int extendedDynamicState3LogicOpEnable() {return this.ptr.get(LAYOUT__extendedDynamicState3LogicOpEnable, OFFSET__extendedDynamicState3LogicOpEnable);}
    public void extendedDynamicState3LogicOpEnable(int value) {this.ptr.set(LAYOUT__extendedDynamicState3LogicOpEnable, OFFSET__extendedDynamicState3LogicOpEnable, value);}
    public java.lang.foreign.MemorySegment $extendedDynamicState3LogicOpEnable() {return this.ptr.asSlice(OFFSET__extendedDynamicState3LogicOpEnable, LAYOUT__extendedDynamicState3LogicOpEnable);}

    public int extendedDynamicState3ColorBlendEnable() {return this.ptr.get(LAYOUT__extendedDynamicState3ColorBlendEnable, OFFSET__extendedDynamicState3ColorBlendEnable);}
    public void extendedDynamicState3ColorBlendEnable(int value) {this.ptr.set(LAYOUT__extendedDynamicState3ColorBlendEnable, OFFSET__extendedDynamicState3ColorBlendEnable, value);}
    public java.lang.foreign.MemorySegment $extendedDynamicState3ColorBlendEnable() {return this.ptr.asSlice(OFFSET__extendedDynamicState3ColorBlendEnable, LAYOUT__extendedDynamicState3ColorBlendEnable);}

    public int extendedDynamicState3ColorBlendEquation() {return this.ptr.get(LAYOUT__extendedDynamicState3ColorBlendEquation, OFFSET__extendedDynamicState3ColorBlendEquation);}
    public void extendedDynamicState3ColorBlendEquation(int value) {this.ptr.set(LAYOUT__extendedDynamicState3ColorBlendEquation, OFFSET__extendedDynamicState3ColorBlendEquation, value);}
    public java.lang.foreign.MemorySegment $extendedDynamicState3ColorBlendEquation() {return this.ptr.asSlice(OFFSET__extendedDynamicState3ColorBlendEquation, LAYOUT__extendedDynamicState3ColorBlendEquation);}

    public int extendedDynamicState3ColorWriteMask() {return this.ptr.get(LAYOUT__extendedDynamicState3ColorWriteMask, OFFSET__extendedDynamicState3ColorWriteMask);}
    public void extendedDynamicState3ColorWriteMask(int value) {this.ptr.set(LAYOUT__extendedDynamicState3ColorWriteMask, OFFSET__extendedDynamicState3ColorWriteMask, value);}
    public java.lang.foreign.MemorySegment $extendedDynamicState3ColorWriteMask() {return this.ptr.asSlice(OFFSET__extendedDynamicState3ColorWriteMask, LAYOUT__extendedDynamicState3ColorWriteMask);}

    public int extendedDynamicState3RasterizationStream() {return this.ptr.get(LAYOUT__extendedDynamicState3RasterizationStream, OFFSET__extendedDynamicState3RasterizationStream);}
    public void extendedDynamicState3RasterizationStream(int value) {this.ptr.set(LAYOUT__extendedDynamicState3RasterizationStream, OFFSET__extendedDynamicState3RasterizationStream, value);}
    public java.lang.foreign.MemorySegment $extendedDynamicState3RasterizationStream() {return this.ptr.asSlice(OFFSET__extendedDynamicState3RasterizationStream, LAYOUT__extendedDynamicState3RasterizationStream);}

    public int extendedDynamicState3ConservativeRasterizationMode() {return this.ptr.get(LAYOUT__extendedDynamicState3ConservativeRasterizationMode, OFFSET__extendedDynamicState3ConservativeRasterizationMode);}
    public void extendedDynamicState3ConservativeRasterizationMode(int value) {this.ptr.set(LAYOUT__extendedDynamicState3ConservativeRasterizationMode, OFFSET__extendedDynamicState3ConservativeRasterizationMode, value);}
    public java.lang.foreign.MemorySegment $extendedDynamicState3ConservativeRasterizationMode() {return this.ptr.asSlice(OFFSET__extendedDynamicState3ConservativeRasterizationMode, LAYOUT__extendedDynamicState3ConservativeRasterizationMode);}

    public int extendedDynamicState3ExtraPrimitiveOverestimationSize() {return this.ptr.get(LAYOUT__extendedDynamicState3ExtraPrimitiveOverestimationSize, OFFSET__extendedDynamicState3ExtraPrimitiveOverestimationSize);}
    public void extendedDynamicState3ExtraPrimitiveOverestimationSize(int value) {this.ptr.set(LAYOUT__extendedDynamicState3ExtraPrimitiveOverestimationSize, OFFSET__extendedDynamicState3ExtraPrimitiveOverestimationSize, value);}
    public java.lang.foreign.MemorySegment $extendedDynamicState3ExtraPrimitiveOverestimationSize() {return this.ptr.asSlice(OFFSET__extendedDynamicState3ExtraPrimitiveOverestimationSize, LAYOUT__extendedDynamicState3ExtraPrimitiveOverestimationSize);}

    public int extendedDynamicState3DepthClipEnable() {return this.ptr.get(LAYOUT__extendedDynamicState3DepthClipEnable, OFFSET__extendedDynamicState3DepthClipEnable);}
    public void extendedDynamicState3DepthClipEnable(int value) {this.ptr.set(LAYOUT__extendedDynamicState3DepthClipEnable, OFFSET__extendedDynamicState3DepthClipEnable, value);}
    public java.lang.foreign.MemorySegment $extendedDynamicState3DepthClipEnable() {return this.ptr.asSlice(OFFSET__extendedDynamicState3DepthClipEnable, LAYOUT__extendedDynamicState3DepthClipEnable);}

    public int extendedDynamicState3SampleLocationsEnable() {return this.ptr.get(LAYOUT__extendedDynamicState3SampleLocationsEnable, OFFSET__extendedDynamicState3SampleLocationsEnable);}
    public void extendedDynamicState3SampleLocationsEnable(int value) {this.ptr.set(LAYOUT__extendedDynamicState3SampleLocationsEnable, OFFSET__extendedDynamicState3SampleLocationsEnable, value);}
    public java.lang.foreign.MemorySegment $extendedDynamicState3SampleLocationsEnable() {return this.ptr.asSlice(OFFSET__extendedDynamicState3SampleLocationsEnable, LAYOUT__extendedDynamicState3SampleLocationsEnable);}

    public int extendedDynamicState3ColorBlendAdvanced() {return this.ptr.get(LAYOUT__extendedDynamicState3ColorBlendAdvanced, OFFSET__extendedDynamicState3ColorBlendAdvanced);}
    public void extendedDynamicState3ColorBlendAdvanced(int value) {this.ptr.set(LAYOUT__extendedDynamicState3ColorBlendAdvanced, OFFSET__extendedDynamicState3ColorBlendAdvanced, value);}
    public java.lang.foreign.MemorySegment $extendedDynamicState3ColorBlendAdvanced() {return this.ptr.asSlice(OFFSET__extendedDynamicState3ColorBlendAdvanced, LAYOUT__extendedDynamicState3ColorBlendAdvanced);}

    public int extendedDynamicState3ProvokingVertexMode() {return this.ptr.get(LAYOUT__extendedDynamicState3ProvokingVertexMode, OFFSET__extendedDynamicState3ProvokingVertexMode);}
    public void extendedDynamicState3ProvokingVertexMode(int value) {this.ptr.set(LAYOUT__extendedDynamicState3ProvokingVertexMode, OFFSET__extendedDynamicState3ProvokingVertexMode, value);}
    public java.lang.foreign.MemorySegment $extendedDynamicState3ProvokingVertexMode() {return this.ptr.asSlice(OFFSET__extendedDynamicState3ProvokingVertexMode, LAYOUT__extendedDynamicState3ProvokingVertexMode);}

    public int extendedDynamicState3LineRasterizationMode() {return this.ptr.get(LAYOUT__extendedDynamicState3LineRasterizationMode, OFFSET__extendedDynamicState3LineRasterizationMode);}
    public void extendedDynamicState3LineRasterizationMode(int value) {this.ptr.set(LAYOUT__extendedDynamicState3LineRasterizationMode, OFFSET__extendedDynamicState3LineRasterizationMode, value);}
    public java.lang.foreign.MemorySegment $extendedDynamicState3LineRasterizationMode() {return this.ptr.asSlice(OFFSET__extendedDynamicState3LineRasterizationMode, LAYOUT__extendedDynamicState3LineRasterizationMode);}

    public int extendedDynamicState3LineStippleEnable() {return this.ptr.get(LAYOUT__extendedDynamicState3LineStippleEnable, OFFSET__extendedDynamicState3LineStippleEnable);}
    public void extendedDynamicState3LineStippleEnable(int value) {this.ptr.set(LAYOUT__extendedDynamicState3LineStippleEnable, OFFSET__extendedDynamicState3LineStippleEnable, value);}
    public java.lang.foreign.MemorySegment $extendedDynamicState3LineStippleEnable() {return this.ptr.asSlice(OFFSET__extendedDynamicState3LineStippleEnable, LAYOUT__extendedDynamicState3LineStippleEnable);}

    public int extendedDynamicState3DepthClipNegativeOneToOne() {return this.ptr.get(LAYOUT__extendedDynamicState3DepthClipNegativeOneToOne, OFFSET__extendedDynamicState3DepthClipNegativeOneToOne);}
    public void extendedDynamicState3DepthClipNegativeOneToOne(int value) {this.ptr.set(LAYOUT__extendedDynamicState3DepthClipNegativeOneToOne, OFFSET__extendedDynamicState3DepthClipNegativeOneToOne, value);}
    public java.lang.foreign.MemorySegment $extendedDynamicState3DepthClipNegativeOneToOne() {return this.ptr.asSlice(OFFSET__extendedDynamicState3DepthClipNegativeOneToOne, LAYOUT__extendedDynamicState3DepthClipNegativeOneToOne);}

    public int extendedDynamicState3ViewportWScalingEnable() {return this.ptr.get(LAYOUT__extendedDynamicState3ViewportWScalingEnable, OFFSET__extendedDynamicState3ViewportWScalingEnable);}
    public void extendedDynamicState3ViewportWScalingEnable(int value) {this.ptr.set(LAYOUT__extendedDynamicState3ViewportWScalingEnable, OFFSET__extendedDynamicState3ViewportWScalingEnable, value);}
    public java.lang.foreign.MemorySegment $extendedDynamicState3ViewportWScalingEnable() {return this.ptr.asSlice(OFFSET__extendedDynamicState3ViewportWScalingEnable, LAYOUT__extendedDynamicState3ViewportWScalingEnable);}

    public int extendedDynamicState3ViewportSwizzle() {return this.ptr.get(LAYOUT__extendedDynamicState3ViewportSwizzle, OFFSET__extendedDynamicState3ViewportSwizzle);}
    public void extendedDynamicState3ViewportSwizzle(int value) {this.ptr.set(LAYOUT__extendedDynamicState3ViewportSwizzle, OFFSET__extendedDynamicState3ViewportSwizzle, value);}
    public java.lang.foreign.MemorySegment $extendedDynamicState3ViewportSwizzle() {return this.ptr.asSlice(OFFSET__extendedDynamicState3ViewportSwizzle, LAYOUT__extendedDynamicState3ViewportSwizzle);}

    public int extendedDynamicState3CoverageToColorEnable() {return this.ptr.get(LAYOUT__extendedDynamicState3CoverageToColorEnable, OFFSET__extendedDynamicState3CoverageToColorEnable);}
    public void extendedDynamicState3CoverageToColorEnable(int value) {this.ptr.set(LAYOUT__extendedDynamicState3CoverageToColorEnable, OFFSET__extendedDynamicState3CoverageToColorEnable, value);}
    public java.lang.foreign.MemorySegment $extendedDynamicState3CoverageToColorEnable() {return this.ptr.asSlice(OFFSET__extendedDynamicState3CoverageToColorEnable, LAYOUT__extendedDynamicState3CoverageToColorEnable);}

    public int extendedDynamicState3CoverageToColorLocation() {return this.ptr.get(LAYOUT__extendedDynamicState3CoverageToColorLocation, OFFSET__extendedDynamicState3CoverageToColorLocation);}
    public void extendedDynamicState3CoverageToColorLocation(int value) {this.ptr.set(LAYOUT__extendedDynamicState3CoverageToColorLocation, OFFSET__extendedDynamicState3CoverageToColorLocation, value);}
    public java.lang.foreign.MemorySegment $extendedDynamicState3CoverageToColorLocation() {return this.ptr.asSlice(OFFSET__extendedDynamicState3CoverageToColorLocation, LAYOUT__extendedDynamicState3CoverageToColorLocation);}

    public int extendedDynamicState3CoverageModulationMode() {return this.ptr.get(LAYOUT__extendedDynamicState3CoverageModulationMode, OFFSET__extendedDynamicState3CoverageModulationMode);}
    public void extendedDynamicState3CoverageModulationMode(int value) {this.ptr.set(LAYOUT__extendedDynamicState3CoverageModulationMode, OFFSET__extendedDynamicState3CoverageModulationMode, value);}
    public java.lang.foreign.MemorySegment $extendedDynamicState3CoverageModulationMode() {return this.ptr.asSlice(OFFSET__extendedDynamicState3CoverageModulationMode, LAYOUT__extendedDynamicState3CoverageModulationMode);}

    public int extendedDynamicState3CoverageModulationTableEnable() {return this.ptr.get(LAYOUT__extendedDynamicState3CoverageModulationTableEnable, OFFSET__extendedDynamicState3CoverageModulationTableEnable);}
    public void extendedDynamicState3CoverageModulationTableEnable(int value) {this.ptr.set(LAYOUT__extendedDynamicState3CoverageModulationTableEnable, OFFSET__extendedDynamicState3CoverageModulationTableEnable, value);}
    public java.lang.foreign.MemorySegment $extendedDynamicState3CoverageModulationTableEnable() {return this.ptr.asSlice(OFFSET__extendedDynamicState3CoverageModulationTableEnable, LAYOUT__extendedDynamicState3CoverageModulationTableEnable);}

    public int extendedDynamicState3CoverageModulationTable() {return this.ptr.get(LAYOUT__extendedDynamicState3CoverageModulationTable, OFFSET__extendedDynamicState3CoverageModulationTable);}
    public void extendedDynamicState3CoverageModulationTable(int value) {this.ptr.set(LAYOUT__extendedDynamicState3CoverageModulationTable, OFFSET__extendedDynamicState3CoverageModulationTable, value);}
    public java.lang.foreign.MemorySegment $extendedDynamicState3CoverageModulationTable() {return this.ptr.asSlice(OFFSET__extendedDynamicState3CoverageModulationTable, LAYOUT__extendedDynamicState3CoverageModulationTable);}

    public int extendedDynamicState3CoverageReductionMode() {return this.ptr.get(LAYOUT__extendedDynamicState3CoverageReductionMode, OFFSET__extendedDynamicState3CoverageReductionMode);}
    public void extendedDynamicState3CoverageReductionMode(int value) {this.ptr.set(LAYOUT__extendedDynamicState3CoverageReductionMode, OFFSET__extendedDynamicState3CoverageReductionMode, value);}
    public java.lang.foreign.MemorySegment $extendedDynamicState3CoverageReductionMode() {return this.ptr.asSlice(OFFSET__extendedDynamicState3CoverageReductionMode, LAYOUT__extendedDynamicState3CoverageReductionMode);}

    public int extendedDynamicState3RepresentativeFragmentTestEnable() {return this.ptr.get(LAYOUT__extendedDynamicState3RepresentativeFragmentTestEnable, OFFSET__extendedDynamicState3RepresentativeFragmentTestEnable);}
    public void extendedDynamicState3RepresentativeFragmentTestEnable(int value) {this.ptr.set(LAYOUT__extendedDynamicState3RepresentativeFragmentTestEnable, OFFSET__extendedDynamicState3RepresentativeFragmentTestEnable, value);}
    public java.lang.foreign.MemorySegment $extendedDynamicState3RepresentativeFragmentTestEnable() {return this.ptr.asSlice(OFFSET__extendedDynamicState3RepresentativeFragmentTestEnable, LAYOUT__extendedDynamicState3RepresentativeFragmentTestEnable);}

    public int extendedDynamicState3ShadingRateImageEnable() {return this.ptr.get(LAYOUT__extendedDynamicState3ShadingRateImageEnable, OFFSET__extendedDynamicState3ShadingRateImageEnable);}
    public void extendedDynamicState3ShadingRateImageEnable(int value) {this.ptr.set(LAYOUT__extendedDynamicState3ShadingRateImageEnable, OFFSET__extendedDynamicState3ShadingRateImageEnable, value);}
    public java.lang.foreign.MemorySegment $extendedDynamicState3ShadingRateImageEnable() {return this.ptr.asSlice(OFFSET__extendedDynamicState3ShadingRateImageEnable, LAYOUT__extendedDynamicState3ShadingRateImageEnable);}
}
