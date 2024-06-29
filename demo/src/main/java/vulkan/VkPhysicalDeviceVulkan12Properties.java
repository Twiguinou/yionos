package vulkan;

public record VkPhysicalDeviceVulkan12Properties(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__driverID = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__driverID = 16;
    public static final java.lang.foreign.SequenceLayout LAYOUT__driverName = java.lang.foreign.MemoryLayout.sequenceLayout(256, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET__driverName = 20;
    public static final java.lang.foreign.SequenceLayout LAYOUT__driverInfo = java.lang.foreign.MemoryLayout.sequenceLayout(256, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET__driverInfo = 276;
    public static final java.lang.foreign.StructLayout LAYOUT__conformanceVersion = vulkan.VkConformanceVersion.gRecordLayout;
    public static final long OFFSET__conformanceVersion = 532;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__denormBehaviorIndependence = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__denormBehaviorIndependence = 536;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__roundingModeIndependence = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__roundingModeIndependence = 540;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderSignedZeroInfNanPreserveFloat16 = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__shaderSignedZeroInfNanPreserveFloat16 = 544;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderSignedZeroInfNanPreserveFloat32 = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__shaderSignedZeroInfNanPreserveFloat32 = 548;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderSignedZeroInfNanPreserveFloat64 = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__shaderSignedZeroInfNanPreserveFloat64 = 552;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderDenormPreserveFloat16 = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__shaderDenormPreserveFloat16 = 556;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderDenormPreserveFloat32 = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__shaderDenormPreserveFloat32 = 560;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderDenormPreserveFloat64 = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__shaderDenormPreserveFloat64 = 564;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderDenormFlushToZeroFloat16 = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__shaderDenormFlushToZeroFloat16 = 568;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderDenormFlushToZeroFloat32 = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__shaderDenormFlushToZeroFloat32 = 572;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderDenormFlushToZeroFloat64 = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__shaderDenormFlushToZeroFloat64 = 576;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderRoundingModeRTEFloat16 = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__shaderRoundingModeRTEFloat16 = 580;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderRoundingModeRTEFloat32 = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__shaderRoundingModeRTEFloat32 = 584;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderRoundingModeRTEFloat64 = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__shaderRoundingModeRTEFloat64 = 588;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderRoundingModeRTZFloat16 = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__shaderRoundingModeRTZFloat16 = 592;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderRoundingModeRTZFloat32 = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__shaderRoundingModeRTZFloat32 = 596;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderRoundingModeRTZFloat64 = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__shaderRoundingModeRTZFloat64 = 600;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxUpdateAfterBindDescriptorsInAllPools = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__maxUpdateAfterBindDescriptorsInAllPools = 604;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderUniformBufferArrayNonUniformIndexingNative = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__shaderUniformBufferArrayNonUniformIndexingNative = 608;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderSampledImageArrayNonUniformIndexingNative = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__shaderSampledImageArrayNonUniformIndexingNative = 612;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderStorageBufferArrayNonUniformIndexingNative = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__shaderStorageBufferArrayNonUniformIndexingNative = 616;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderStorageImageArrayNonUniformIndexingNative = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__shaderStorageImageArrayNonUniformIndexingNative = 620;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderInputAttachmentArrayNonUniformIndexingNative = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__shaderInputAttachmentArrayNonUniformIndexingNative = 624;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__robustBufferAccessUpdateAfterBind = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__robustBufferAccessUpdateAfterBind = 628;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__quadDivergentImplicitLod = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__quadDivergentImplicitLod = 632;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxPerStageDescriptorUpdateAfterBindSamplers = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__maxPerStageDescriptorUpdateAfterBindSamplers = 636;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxPerStageDescriptorUpdateAfterBindUniformBuffers = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__maxPerStageDescriptorUpdateAfterBindUniformBuffers = 640;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxPerStageDescriptorUpdateAfterBindStorageBuffers = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__maxPerStageDescriptorUpdateAfterBindStorageBuffers = 644;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxPerStageDescriptorUpdateAfterBindSampledImages = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__maxPerStageDescriptorUpdateAfterBindSampledImages = 648;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxPerStageDescriptorUpdateAfterBindStorageImages = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__maxPerStageDescriptorUpdateAfterBindStorageImages = 652;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxPerStageDescriptorUpdateAfterBindInputAttachments = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__maxPerStageDescriptorUpdateAfterBindInputAttachments = 656;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxPerStageUpdateAfterBindResources = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__maxPerStageUpdateAfterBindResources = 660;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxDescriptorSetUpdateAfterBindSamplers = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__maxDescriptorSetUpdateAfterBindSamplers = 664;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxDescriptorSetUpdateAfterBindUniformBuffers = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__maxDescriptorSetUpdateAfterBindUniformBuffers = 668;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxDescriptorSetUpdateAfterBindUniformBuffersDynamic = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__maxDescriptorSetUpdateAfterBindUniformBuffersDynamic = 672;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxDescriptorSetUpdateAfterBindStorageBuffers = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__maxDescriptorSetUpdateAfterBindStorageBuffers = 676;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxDescriptorSetUpdateAfterBindStorageBuffersDynamic = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__maxDescriptorSetUpdateAfterBindStorageBuffersDynamic = 680;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxDescriptorSetUpdateAfterBindSampledImages = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__maxDescriptorSetUpdateAfterBindSampledImages = 684;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxDescriptorSetUpdateAfterBindStorageImages = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__maxDescriptorSetUpdateAfterBindStorageImages = 688;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxDescriptorSetUpdateAfterBindInputAttachments = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__maxDescriptorSetUpdateAfterBindInputAttachments = 692;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__supportedDepthResolveModes = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__supportedDepthResolveModes = 696;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__supportedStencilResolveModes = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__supportedStencilResolveModes = 700;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__independentResolveNone = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__independentResolveNone = 704;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__independentResolve = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__independentResolve = 708;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__filterMinmaxSingleComponentFormats = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__filterMinmaxSingleComponentFormats = 712;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__filterMinmaxImageComponentMapping = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__filterMinmaxImageComponentMapping = 716;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__maxTimelineSemaphoreValueDifference = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__maxTimelineSemaphoreValueDifference = 720;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__framebufferIntegerColorSampleCounts = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__framebufferIntegerColorSampleCounts = 728;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__driverID,
            LAYOUT__driverName,
            LAYOUT__driverInfo,
            LAYOUT__conformanceVersion,
            LAYOUT__denormBehaviorIndependence,
            LAYOUT__roundingModeIndependence,
            LAYOUT__shaderSignedZeroInfNanPreserveFloat16,
            LAYOUT__shaderSignedZeroInfNanPreserveFloat32,
            LAYOUT__shaderSignedZeroInfNanPreserveFloat64,
            LAYOUT__shaderDenormPreserveFloat16,
            LAYOUT__shaderDenormPreserveFloat32,
            LAYOUT__shaderDenormPreserveFloat64,
            LAYOUT__shaderDenormFlushToZeroFloat16,
            LAYOUT__shaderDenormFlushToZeroFloat32,
            LAYOUT__shaderDenormFlushToZeroFloat64,
            LAYOUT__shaderRoundingModeRTEFloat16,
            LAYOUT__shaderRoundingModeRTEFloat32,
            LAYOUT__shaderRoundingModeRTEFloat64,
            LAYOUT__shaderRoundingModeRTZFloat16,
            LAYOUT__shaderRoundingModeRTZFloat32,
            LAYOUT__shaderRoundingModeRTZFloat64,
            LAYOUT__maxUpdateAfterBindDescriptorsInAllPools,
            LAYOUT__shaderUniformBufferArrayNonUniformIndexingNative,
            LAYOUT__shaderSampledImageArrayNonUniformIndexingNative,
            LAYOUT__shaderStorageBufferArrayNonUniformIndexingNative,
            LAYOUT__shaderStorageImageArrayNonUniformIndexingNative,
            LAYOUT__shaderInputAttachmentArrayNonUniformIndexingNative,
            LAYOUT__robustBufferAccessUpdateAfterBind,
            LAYOUT__quadDivergentImplicitLod,
            LAYOUT__maxPerStageDescriptorUpdateAfterBindSamplers,
            LAYOUT__maxPerStageDescriptorUpdateAfterBindUniformBuffers,
            LAYOUT__maxPerStageDescriptorUpdateAfterBindStorageBuffers,
            LAYOUT__maxPerStageDescriptorUpdateAfterBindSampledImages,
            LAYOUT__maxPerStageDescriptorUpdateAfterBindStorageImages,
            LAYOUT__maxPerStageDescriptorUpdateAfterBindInputAttachments,
            LAYOUT__maxPerStageUpdateAfterBindResources,
            LAYOUT__maxDescriptorSetUpdateAfterBindSamplers,
            LAYOUT__maxDescriptorSetUpdateAfterBindUniformBuffers,
            LAYOUT__maxDescriptorSetUpdateAfterBindUniformBuffersDynamic,
            LAYOUT__maxDescriptorSetUpdateAfterBindStorageBuffers,
            LAYOUT__maxDescriptorSetUpdateAfterBindStorageBuffersDynamic,
            LAYOUT__maxDescriptorSetUpdateAfterBindSampledImages,
            LAYOUT__maxDescriptorSetUpdateAfterBindStorageImages,
            LAYOUT__maxDescriptorSetUpdateAfterBindInputAttachments,
            LAYOUT__supportedDepthResolveModes,
            LAYOUT__supportedStencilResolveModes,
            LAYOUT__independentResolveNone,
            LAYOUT__independentResolve,
            LAYOUT__filterMinmaxSingleComponentFormats,
            LAYOUT__filterMinmaxImageComponentMapping,
            LAYOUT__maxTimelineSemaphoreValueDifference,
            LAYOUT__framebufferIntegerColorSampleCounts,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkPhysicalDeviceVulkan12Properties");

    public VkPhysicalDeviceVulkan12Properties(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceVulkan12Properties getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceVulkan12Properties(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceVulkan12Properties value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int driverID() {return this.ptr.get(LAYOUT__driverID, OFFSET__driverID);}
    public void driverID(int value) {this.ptr.set(LAYOUT__driverID, OFFSET__driverID, value);}
    public java.lang.foreign.MemorySegment $driverID() {return this.ptr.asSlice(OFFSET__driverID, LAYOUT__driverID);}

    public java.lang.foreign.MemorySegment driverName() {return this.ptr.asSlice(OFFSET__driverName, LAYOUT__driverName);}
    public byte driverName(int index) {return this.driverName().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index);}
    public void driverName(int index, byte value) {this.driverName().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index, value);}

    public java.lang.foreign.MemorySegment driverInfo() {return this.ptr.asSlice(OFFSET__driverInfo, LAYOUT__driverInfo);}
    public byte driverInfo(int index) {return this.driverInfo().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index);}
    public void driverInfo(int index, byte value) {this.driverInfo().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index, value);}

    public vulkan.VkConformanceVersion conformanceVersion() {return new vulkan.VkConformanceVersion(this.ptr.asSlice(OFFSET__conformanceVersion, LAYOUT__conformanceVersion));}
    public void conformanceVersion(java.util.function.Consumer<vulkan.VkConformanceVersion> consumer) {consumer.accept(this.conformanceVersion());}
    public void conformanceVersion(vulkan.VkConformanceVersion value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__conformanceVersion, LAYOUT__conformanceVersion.byteSize());}

    public int denormBehaviorIndependence() {return this.ptr.get(LAYOUT__denormBehaviorIndependence, OFFSET__denormBehaviorIndependence);}
    public void denormBehaviorIndependence(int value) {this.ptr.set(LAYOUT__denormBehaviorIndependence, OFFSET__denormBehaviorIndependence, value);}
    public java.lang.foreign.MemorySegment $denormBehaviorIndependence() {return this.ptr.asSlice(OFFSET__denormBehaviorIndependence, LAYOUT__denormBehaviorIndependence);}

    public int roundingModeIndependence() {return this.ptr.get(LAYOUT__roundingModeIndependence, OFFSET__roundingModeIndependence);}
    public void roundingModeIndependence(int value) {this.ptr.set(LAYOUT__roundingModeIndependence, OFFSET__roundingModeIndependence, value);}
    public java.lang.foreign.MemorySegment $roundingModeIndependence() {return this.ptr.asSlice(OFFSET__roundingModeIndependence, LAYOUT__roundingModeIndependence);}

    public int shaderSignedZeroInfNanPreserveFloat16() {return this.ptr.get(LAYOUT__shaderSignedZeroInfNanPreserveFloat16, OFFSET__shaderSignedZeroInfNanPreserveFloat16);}
    public void shaderSignedZeroInfNanPreserveFloat16(int value) {this.ptr.set(LAYOUT__shaderSignedZeroInfNanPreserveFloat16, OFFSET__shaderSignedZeroInfNanPreserveFloat16, value);}
    public java.lang.foreign.MemorySegment $shaderSignedZeroInfNanPreserveFloat16() {return this.ptr.asSlice(OFFSET__shaderSignedZeroInfNanPreserveFloat16, LAYOUT__shaderSignedZeroInfNanPreserveFloat16);}

    public int shaderSignedZeroInfNanPreserveFloat32() {return this.ptr.get(LAYOUT__shaderSignedZeroInfNanPreserveFloat32, OFFSET__shaderSignedZeroInfNanPreserveFloat32);}
    public void shaderSignedZeroInfNanPreserveFloat32(int value) {this.ptr.set(LAYOUT__shaderSignedZeroInfNanPreserveFloat32, OFFSET__shaderSignedZeroInfNanPreserveFloat32, value);}
    public java.lang.foreign.MemorySegment $shaderSignedZeroInfNanPreserveFloat32() {return this.ptr.asSlice(OFFSET__shaderSignedZeroInfNanPreserveFloat32, LAYOUT__shaderSignedZeroInfNanPreserveFloat32);}

    public int shaderSignedZeroInfNanPreserveFloat64() {return this.ptr.get(LAYOUT__shaderSignedZeroInfNanPreserveFloat64, OFFSET__shaderSignedZeroInfNanPreserveFloat64);}
    public void shaderSignedZeroInfNanPreserveFloat64(int value) {this.ptr.set(LAYOUT__shaderSignedZeroInfNanPreserveFloat64, OFFSET__shaderSignedZeroInfNanPreserveFloat64, value);}
    public java.lang.foreign.MemorySegment $shaderSignedZeroInfNanPreserveFloat64() {return this.ptr.asSlice(OFFSET__shaderSignedZeroInfNanPreserveFloat64, LAYOUT__shaderSignedZeroInfNanPreserveFloat64);}

    public int shaderDenormPreserveFloat16() {return this.ptr.get(LAYOUT__shaderDenormPreserveFloat16, OFFSET__shaderDenormPreserveFloat16);}
    public void shaderDenormPreserveFloat16(int value) {this.ptr.set(LAYOUT__shaderDenormPreserveFloat16, OFFSET__shaderDenormPreserveFloat16, value);}
    public java.lang.foreign.MemorySegment $shaderDenormPreserveFloat16() {return this.ptr.asSlice(OFFSET__shaderDenormPreserveFloat16, LAYOUT__shaderDenormPreserveFloat16);}

    public int shaderDenormPreserveFloat32() {return this.ptr.get(LAYOUT__shaderDenormPreserveFloat32, OFFSET__shaderDenormPreserveFloat32);}
    public void shaderDenormPreserveFloat32(int value) {this.ptr.set(LAYOUT__shaderDenormPreserveFloat32, OFFSET__shaderDenormPreserveFloat32, value);}
    public java.lang.foreign.MemorySegment $shaderDenormPreserveFloat32() {return this.ptr.asSlice(OFFSET__shaderDenormPreserveFloat32, LAYOUT__shaderDenormPreserveFloat32);}

    public int shaderDenormPreserveFloat64() {return this.ptr.get(LAYOUT__shaderDenormPreserveFloat64, OFFSET__shaderDenormPreserveFloat64);}
    public void shaderDenormPreserveFloat64(int value) {this.ptr.set(LAYOUT__shaderDenormPreserveFloat64, OFFSET__shaderDenormPreserveFloat64, value);}
    public java.lang.foreign.MemorySegment $shaderDenormPreserveFloat64() {return this.ptr.asSlice(OFFSET__shaderDenormPreserveFloat64, LAYOUT__shaderDenormPreserveFloat64);}

    public int shaderDenormFlushToZeroFloat16() {return this.ptr.get(LAYOUT__shaderDenormFlushToZeroFloat16, OFFSET__shaderDenormFlushToZeroFloat16);}
    public void shaderDenormFlushToZeroFloat16(int value) {this.ptr.set(LAYOUT__shaderDenormFlushToZeroFloat16, OFFSET__shaderDenormFlushToZeroFloat16, value);}
    public java.lang.foreign.MemorySegment $shaderDenormFlushToZeroFloat16() {return this.ptr.asSlice(OFFSET__shaderDenormFlushToZeroFloat16, LAYOUT__shaderDenormFlushToZeroFloat16);}

    public int shaderDenormFlushToZeroFloat32() {return this.ptr.get(LAYOUT__shaderDenormFlushToZeroFloat32, OFFSET__shaderDenormFlushToZeroFloat32);}
    public void shaderDenormFlushToZeroFloat32(int value) {this.ptr.set(LAYOUT__shaderDenormFlushToZeroFloat32, OFFSET__shaderDenormFlushToZeroFloat32, value);}
    public java.lang.foreign.MemorySegment $shaderDenormFlushToZeroFloat32() {return this.ptr.asSlice(OFFSET__shaderDenormFlushToZeroFloat32, LAYOUT__shaderDenormFlushToZeroFloat32);}

    public int shaderDenormFlushToZeroFloat64() {return this.ptr.get(LAYOUT__shaderDenormFlushToZeroFloat64, OFFSET__shaderDenormFlushToZeroFloat64);}
    public void shaderDenormFlushToZeroFloat64(int value) {this.ptr.set(LAYOUT__shaderDenormFlushToZeroFloat64, OFFSET__shaderDenormFlushToZeroFloat64, value);}
    public java.lang.foreign.MemorySegment $shaderDenormFlushToZeroFloat64() {return this.ptr.asSlice(OFFSET__shaderDenormFlushToZeroFloat64, LAYOUT__shaderDenormFlushToZeroFloat64);}

    public int shaderRoundingModeRTEFloat16() {return this.ptr.get(LAYOUT__shaderRoundingModeRTEFloat16, OFFSET__shaderRoundingModeRTEFloat16);}
    public void shaderRoundingModeRTEFloat16(int value) {this.ptr.set(LAYOUT__shaderRoundingModeRTEFloat16, OFFSET__shaderRoundingModeRTEFloat16, value);}
    public java.lang.foreign.MemorySegment $shaderRoundingModeRTEFloat16() {return this.ptr.asSlice(OFFSET__shaderRoundingModeRTEFloat16, LAYOUT__shaderRoundingModeRTEFloat16);}

    public int shaderRoundingModeRTEFloat32() {return this.ptr.get(LAYOUT__shaderRoundingModeRTEFloat32, OFFSET__shaderRoundingModeRTEFloat32);}
    public void shaderRoundingModeRTEFloat32(int value) {this.ptr.set(LAYOUT__shaderRoundingModeRTEFloat32, OFFSET__shaderRoundingModeRTEFloat32, value);}
    public java.lang.foreign.MemorySegment $shaderRoundingModeRTEFloat32() {return this.ptr.asSlice(OFFSET__shaderRoundingModeRTEFloat32, LAYOUT__shaderRoundingModeRTEFloat32);}

    public int shaderRoundingModeRTEFloat64() {return this.ptr.get(LAYOUT__shaderRoundingModeRTEFloat64, OFFSET__shaderRoundingModeRTEFloat64);}
    public void shaderRoundingModeRTEFloat64(int value) {this.ptr.set(LAYOUT__shaderRoundingModeRTEFloat64, OFFSET__shaderRoundingModeRTEFloat64, value);}
    public java.lang.foreign.MemorySegment $shaderRoundingModeRTEFloat64() {return this.ptr.asSlice(OFFSET__shaderRoundingModeRTEFloat64, LAYOUT__shaderRoundingModeRTEFloat64);}

    public int shaderRoundingModeRTZFloat16() {return this.ptr.get(LAYOUT__shaderRoundingModeRTZFloat16, OFFSET__shaderRoundingModeRTZFloat16);}
    public void shaderRoundingModeRTZFloat16(int value) {this.ptr.set(LAYOUT__shaderRoundingModeRTZFloat16, OFFSET__shaderRoundingModeRTZFloat16, value);}
    public java.lang.foreign.MemorySegment $shaderRoundingModeRTZFloat16() {return this.ptr.asSlice(OFFSET__shaderRoundingModeRTZFloat16, LAYOUT__shaderRoundingModeRTZFloat16);}

    public int shaderRoundingModeRTZFloat32() {return this.ptr.get(LAYOUT__shaderRoundingModeRTZFloat32, OFFSET__shaderRoundingModeRTZFloat32);}
    public void shaderRoundingModeRTZFloat32(int value) {this.ptr.set(LAYOUT__shaderRoundingModeRTZFloat32, OFFSET__shaderRoundingModeRTZFloat32, value);}
    public java.lang.foreign.MemorySegment $shaderRoundingModeRTZFloat32() {return this.ptr.asSlice(OFFSET__shaderRoundingModeRTZFloat32, LAYOUT__shaderRoundingModeRTZFloat32);}

    public int shaderRoundingModeRTZFloat64() {return this.ptr.get(LAYOUT__shaderRoundingModeRTZFloat64, OFFSET__shaderRoundingModeRTZFloat64);}
    public void shaderRoundingModeRTZFloat64(int value) {this.ptr.set(LAYOUT__shaderRoundingModeRTZFloat64, OFFSET__shaderRoundingModeRTZFloat64, value);}
    public java.lang.foreign.MemorySegment $shaderRoundingModeRTZFloat64() {return this.ptr.asSlice(OFFSET__shaderRoundingModeRTZFloat64, LAYOUT__shaderRoundingModeRTZFloat64);}

    public int maxUpdateAfterBindDescriptorsInAllPools() {return this.ptr.get(LAYOUT__maxUpdateAfterBindDescriptorsInAllPools, OFFSET__maxUpdateAfterBindDescriptorsInAllPools);}
    public void maxUpdateAfterBindDescriptorsInAllPools(int value) {this.ptr.set(LAYOUT__maxUpdateAfterBindDescriptorsInAllPools, OFFSET__maxUpdateAfterBindDescriptorsInAllPools, value);}
    public java.lang.foreign.MemorySegment $maxUpdateAfterBindDescriptorsInAllPools() {return this.ptr.asSlice(OFFSET__maxUpdateAfterBindDescriptorsInAllPools, LAYOUT__maxUpdateAfterBindDescriptorsInAllPools);}

    public int shaderUniformBufferArrayNonUniformIndexingNative() {return this.ptr.get(LAYOUT__shaderUniformBufferArrayNonUniformIndexingNative, OFFSET__shaderUniformBufferArrayNonUniformIndexingNative);}
    public void shaderUniformBufferArrayNonUniformIndexingNative(int value) {this.ptr.set(LAYOUT__shaderUniformBufferArrayNonUniformIndexingNative, OFFSET__shaderUniformBufferArrayNonUniformIndexingNative, value);}
    public java.lang.foreign.MemorySegment $shaderUniformBufferArrayNonUniformIndexingNative() {return this.ptr.asSlice(OFFSET__shaderUniformBufferArrayNonUniformIndexingNative, LAYOUT__shaderUniformBufferArrayNonUniformIndexingNative);}

    public int shaderSampledImageArrayNonUniformIndexingNative() {return this.ptr.get(LAYOUT__shaderSampledImageArrayNonUniformIndexingNative, OFFSET__shaderSampledImageArrayNonUniformIndexingNative);}
    public void shaderSampledImageArrayNonUniformIndexingNative(int value) {this.ptr.set(LAYOUT__shaderSampledImageArrayNonUniformIndexingNative, OFFSET__shaderSampledImageArrayNonUniformIndexingNative, value);}
    public java.lang.foreign.MemorySegment $shaderSampledImageArrayNonUniformIndexingNative() {return this.ptr.asSlice(OFFSET__shaderSampledImageArrayNonUniformIndexingNative, LAYOUT__shaderSampledImageArrayNonUniformIndexingNative);}

    public int shaderStorageBufferArrayNonUniformIndexingNative() {return this.ptr.get(LAYOUT__shaderStorageBufferArrayNonUniformIndexingNative, OFFSET__shaderStorageBufferArrayNonUniformIndexingNative);}
    public void shaderStorageBufferArrayNonUniformIndexingNative(int value) {this.ptr.set(LAYOUT__shaderStorageBufferArrayNonUniformIndexingNative, OFFSET__shaderStorageBufferArrayNonUniformIndexingNative, value);}
    public java.lang.foreign.MemorySegment $shaderStorageBufferArrayNonUniformIndexingNative() {return this.ptr.asSlice(OFFSET__shaderStorageBufferArrayNonUniformIndexingNative, LAYOUT__shaderStorageBufferArrayNonUniformIndexingNative);}

    public int shaderStorageImageArrayNonUniformIndexingNative() {return this.ptr.get(LAYOUT__shaderStorageImageArrayNonUniformIndexingNative, OFFSET__shaderStorageImageArrayNonUniformIndexingNative);}
    public void shaderStorageImageArrayNonUniformIndexingNative(int value) {this.ptr.set(LAYOUT__shaderStorageImageArrayNonUniformIndexingNative, OFFSET__shaderStorageImageArrayNonUniformIndexingNative, value);}
    public java.lang.foreign.MemorySegment $shaderStorageImageArrayNonUniformIndexingNative() {return this.ptr.asSlice(OFFSET__shaderStorageImageArrayNonUniformIndexingNative, LAYOUT__shaderStorageImageArrayNonUniformIndexingNative);}

    public int shaderInputAttachmentArrayNonUniformIndexingNative() {return this.ptr.get(LAYOUT__shaderInputAttachmentArrayNonUniformIndexingNative, OFFSET__shaderInputAttachmentArrayNonUniformIndexingNative);}
    public void shaderInputAttachmentArrayNonUniformIndexingNative(int value) {this.ptr.set(LAYOUT__shaderInputAttachmentArrayNonUniformIndexingNative, OFFSET__shaderInputAttachmentArrayNonUniformIndexingNative, value);}
    public java.lang.foreign.MemorySegment $shaderInputAttachmentArrayNonUniformIndexingNative() {return this.ptr.asSlice(OFFSET__shaderInputAttachmentArrayNonUniformIndexingNative, LAYOUT__shaderInputAttachmentArrayNonUniformIndexingNative);}

    public int robustBufferAccessUpdateAfterBind() {return this.ptr.get(LAYOUT__robustBufferAccessUpdateAfterBind, OFFSET__robustBufferAccessUpdateAfterBind);}
    public void robustBufferAccessUpdateAfterBind(int value) {this.ptr.set(LAYOUT__robustBufferAccessUpdateAfterBind, OFFSET__robustBufferAccessUpdateAfterBind, value);}
    public java.lang.foreign.MemorySegment $robustBufferAccessUpdateAfterBind() {return this.ptr.asSlice(OFFSET__robustBufferAccessUpdateAfterBind, LAYOUT__robustBufferAccessUpdateAfterBind);}

    public int quadDivergentImplicitLod() {return this.ptr.get(LAYOUT__quadDivergentImplicitLod, OFFSET__quadDivergentImplicitLod);}
    public void quadDivergentImplicitLod(int value) {this.ptr.set(LAYOUT__quadDivergentImplicitLod, OFFSET__quadDivergentImplicitLod, value);}
    public java.lang.foreign.MemorySegment $quadDivergentImplicitLod() {return this.ptr.asSlice(OFFSET__quadDivergentImplicitLod, LAYOUT__quadDivergentImplicitLod);}

    public int maxPerStageDescriptorUpdateAfterBindSamplers() {return this.ptr.get(LAYOUT__maxPerStageDescriptorUpdateAfterBindSamplers, OFFSET__maxPerStageDescriptorUpdateAfterBindSamplers);}
    public void maxPerStageDescriptorUpdateAfterBindSamplers(int value) {this.ptr.set(LAYOUT__maxPerStageDescriptorUpdateAfterBindSamplers, OFFSET__maxPerStageDescriptorUpdateAfterBindSamplers, value);}
    public java.lang.foreign.MemorySegment $maxPerStageDescriptorUpdateAfterBindSamplers() {return this.ptr.asSlice(OFFSET__maxPerStageDescriptorUpdateAfterBindSamplers, LAYOUT__maxPerStageDescriptorUpdateAfterBindSamplers);}

    public int maxPerStageDescriptorUpdateAfterBindUniformBuffers() {return this.ptr.get(LAYOUT__maxPerStageDescriptorUpdateAfterBindUniformBuffers, OFFSET__maxPerStageDescriptorUpdateAfterBindUniformBuffers);}
    public void maxPerStageDescriptorUpdateAfterBindUniformBuffers(int value) {this.ptr.set(LAYOUT__maxPerStageDescriptorUpdateAfterBindUniformBuffers, OFFSET__maxPerStageDescriptorUpdateAfterBindUniformBuffers, value);}
    public java.lang.foreign.MemorySegment $maxPerStageDescriptorUpdateAfterBindUniformBuffers() {return this.ptr.asSlice(OFFSET__maxPerStageDescriptorUpdateAfterBindUniformBuffers, LAYOUT__maxPerStageDescriptorUpdateAfterBindUniformBuffers);}

    public int maxPerStageDescriptorUpdateAfterBindStorageBuffers() {return this.ptr.get(LAYOUT__maxPerStageDescriptorUpdateAfterBindStorageBuffers, OFFSET__maxPerStageDescriptorUpdateAfterBindStorageBuffers);}
    public void maxPerStageDescriptorUpdateAfterBindStorageBuffers(int value) {this.ptr.set(LAYOUT__maxPerStageDescriptorUpdateAfterBindStorageBuffers, OFFSET__maxPerStageDescriptorUpdateAfterBindStorageBuffers, value);}
    public java.lang.foreign.MemorySegment $maxPerStageDescriptorUpdateAfterBindStorageBuffers() {return this.ptr.asSlice(OFFSET__maxPerStageDescriptorUpdateAfterBindStorageBuffers, LAYOUT__maxPerStageDescriptorUpdateAfterBindStorageBuffers);}

    public int maxPerStageDescriptorUpdateAfterBindSampledImages() {return this.ptr.get(LAYOUT__maxPerStageDescriptorUpdateAfterBindSampledImages, OFFSET__maxPerStageDescriptorUpdateAfterBindSampledImages);}
    public void maxPerStageDescriptorUpdateAfterBindSampledImages(int value) {this.ptr.set(LAYOUT__maxPerStageDescriptorUpdateAfterBindSampledImages, OFFSET__maxPerStageDescriptorUpdateAfterBindSampledImages, value);}
    public java.lang.foreign.MemorySegment $maxPerStageDescriptorUpdateAfterBindSampledImages() {return this.ptr.asSlice(OFFSET__maxPerStageDescriptorUpdateAfterBindSampledImages, LAYOUT__maxPerStageDescriptorUpdateAfterBindSampledImages);}

    public int maxPerStageDescriptorUpdateAfterBindStorageImages() {return this.ptr.get(LAYOUT__maxPerStageDescriptorUpdateAfterBindStorageImages, OFFSET__maxPerStageDescriptorUpdateAfterBindStorageImages);}
    public void maxPerStageDescriptorUpdateAfterBindStorageImages(int value) {this.ptr.set(LAYOUT__maxPerStageDescriptorUpdateAfterBindStorageImages, OFFSET__maxPerStageDescriptorUpdateAfterBindStorageImages, value);}
    public java.lang.foreign.MemorySegment $maxPerStageDescriptorUpdateAfterBindStorageImages() {return this.ptr.asSlice(OFFSET__maxPerStageDescriptorUpdateAfterBindStorageImages, LAYOUT__maxPerStageDescriptorUpdateAfterBindStorageImages);}

    public int maxPerStageDescriptorUpdateAfterBindInputAttachments() {return this.ptr.get(LAYOUT__maxPerStageDescriptorUpdateAfterBindInputAttachments, OFFSET__maxPerStageDescriptorUpdateAfterBindInputAttachments);}
    public void maxPerStageDescriptorUpdateAfterBindInputAttachments(int value) {this.ptr.set(LAYOUT__maxPerStageDescriptorUpdateAfterBindInputAttachments, OFFSET__maxPerStageDescriptorUpdateAfterBindInputAttachments, value);}
    public java.lang.foreign.MemorySegment $maxPerStageDescriptorUpdateAfterBindInputAttachments() {return this.ptr.asSlice(OFFSET__maxPerStageDescriptorUpdateAfterBindInputAttachments, LAYOUT__maxPerStageDescriptorUpdateAfterBindInputAttachments);}

    public int maxPerStageUpdateAfterBindResources() {return this.ptr.get(LAYOUT__maxPerStageUpdateAfterBindResources, OFFSET__maxPerStageUpdateAfterBindResources);}
    public void maxPerStageUpdateAfterBindResources(int value) {this.ptr.set(LAYOUT__maxPerStageUpdateAfterBindResources, OFFSET__maxPerStageUpdateAfterBindResources, value);}
    public java.lang.foreign.MemorySegment $maxPerStageUpdateAfterBindResources() {return this.ptr.asSlice(OFFSET__maxPerStageUpdateAfterBindResources, LAYOUT__maxPerStageUpdateAfterBindResources);}

    public int maxDescriptorSetUpdateAfterBindSamplers() {return this.ptr.get(LAYOUT__maxDescriptorSetUpdateAfterBindSamplers, OFFSET__maxDescriptorSetUpdateAfterBindSamplers);}
    public void maxDescriptorSetUpdateAfterBindSamplers(int value) {this.ptr.set(LAYOUT__maxDescriptorSetUpdateAfterBindSamplers, OFFSET__maxDescriptorSetUpdateAfterBindSamplers, value);}
    public java.lang.foreign.MemorySegment $maxDescriptorSetUpdateAfterBindSamplers() {return this.ptr.asSlice(OFFSET__maxDescriptorSetUpdateAfterBindSamplers, LAYOUT__maxDescriptorSetUpdateAfterBindSamplers);}

    public int maxDescriptorSetUpdateAfterBindUniformBuffers() {return this.ptr.get(LAYOUT__maxDescriptorSetUpdateAfterBindUniformBuffers, OFFSET__maxDescriptorSetUpdateAfterBindUniformBuffers);}
    public void maxDescriptorSetUpdateAfterBindUniformBuffers(int value) {this.ptr.set(LAYOUT__maxDescriptorSetUpdateAfterBindUniformBuffers, OFFSET__maxDescriptorSetUpdateAfterBindUniformBuffers, value);}
    public java.lang.foreign.MemorySegment $maxDescriptorSetUpdateAfterBindUniformBuffers() {return this.ptr.asSlice(OFFSET__maxDescriptorSetUpdateAfterBindUniformBuffers, LAYOUT__maxDescriptorSetUpdateAfterBindUniformBuffers);}

    public int maxDescriptorSetUpdateAfterBindUniformBuffersDynamic() {return this.ptr.get(LAYOUT__maxDescriptorSetUpdateAfterBindUniformBuffersDynamic, OFFSET__maxDescriptorSetUpdateAfterBindUniformBuffersDynamic);}
    public void maxDescriptorSetUpdateAfterBindUniformBuffersDynamic(int value) {this.ptr.set(LAYOUT__maxDescriptorSetUpdateAfterBindUniformBuffersDynamic, OFFSET__maxDescriptorSetUpdateAfterBindUniformBuffersDynamic, value);}
    public java.lang.foreign.MemorySegment $maxDescriptorSetUpdateAfterBindUniformBuffersDynamic() {return this.ptr.asSlice(OFFSET__maxDescriptorSetUpdateAfterBindUniformBuffersDynamic, LAYOUT__maxDescriptorSetUpdateAfterBindUniformBuffersDynamic);}

    public int maxDescriptorSetUpdateAfterBindStorageBuffers() {return this.ptr.get(LAYOUT__maxDescriptorSetUpdateAfterBindStorageBuffers, OFFSET__maxDescriptorSetUpdateAfterBindStorageBuffers);}
    public void maxDescriptorSetUpdateAfterBindStorageBuffers(int value) {this.ptr.set(LAYOUT__maxDescriptorSetUpdateAfterBindStorageBuffers, OFFSET__maxDescriptorSetUpdateAfterBindStorageBuffers, value);}
    public java.lang.foreign.MemorySegment $maxDescriptorSetUpdateAfterBindStorageBuffers() {return this.ptr.asSlice(OFFSET__maxDescriptorSetUpdateAfterBindStorageBuffers, LAYOUT__maxDescriptorSetUpdateAfterBindStorageBuffers);}

    public int maxDescriptorSetUpdateAfterBindStorageBuffersDynamic() {return this.ptr.get(LAYOUT__maxDescriptorSetUpdateAfterBindStorageBuffersDynamic, OFFSET__maxDescriptorSetUpdateAfterBindStorageBuffersDynamic);}
    public void maxDescriptorSetUpdateAfterBindStorageBuffersDynamic(int value) {this.ptr.set(LAYOUT__maxDescriptorSetUpdateAfterBindStorageBuffersDynamic, OFFSET__maxDescriptorSetUpdateAfterBindStorageBuffersDynamic, value);}
    public java.lang.foreign.MemorySegment $maxDescriptorSetUpdateAfterBindStorageBuffersDynamic() {return this.ptr.asSlice(OFFSET__maxDescriptorSetUpdateAfterBindStorageBuffersDynamic, LAYOUT__maxDescriptorSetUpdateAfterBindStorageBuffersDynamic);}

    public int maxDescriptorSetUpdateAfterBindSampledImages() {return this.ptr.get(LAYOUT__maxDescriptorSetUpdateAfterBindSampledImages, OFFSET__maxDescriptorSetUpdateAfterBindSampledImages);}
    public void maxDescriptorSetUpdateAfterBindSampledImages(int value) {this.ptr.set(LAYOUT__maxDescriptorSetUpdateAfterBindSampledImages, OFFSET__maxDescriptorSetUpdateAfterBindSampledImages, value);}
    public java.lang.foreign.MemorySegment $maxDescriptorSetUpdateAfterBindSampledImages() {return this.ptr.asSlice(OFFSET__maxDescriptorSetUpdateAfterBindSampledImages, LAYOUT__maxDescriptorSetUpdateAfterBindSampledImages);}

    public int maxDescriptorSetUpdateAfterBindStorageImages() {return this.ptr.get(LAYOUT__maxDescriptorSetUpdateAfterBindStorageImages, OFFSET__maxDescriptorSetUpdateAfterBindStorageImages);}
    public void maxDescriptorSetUpdateAfterBindStorageImages(int value) {this.ptr.set(LAYOUT__maxDescriptorSetUpdateAfterBindStorageImages, OFFSET__maxDescriptorSetUpdateAfterBindStorageImages, value);}
    public java.lang.foreign.MemorySegment $maxDescriptorSetUpdateAfterBindStorageImages() {return this.ptr.asSlice(OFFSET__maxDescriptorSetUpdateAfterBindStorageImages, LAYOUT__maxDescriptorSetUpdateAfterBindStorageImages);}

    public int maxDescriptorSetUpdateAfterBindInputAttachments() {return this.ptr.get(LAYOUT__maxDescriptorSetUpdateAfterBindInputAttachments, OFFSET__maxDescriptorSetUpdateAfterBindInputAttachments);}
    public void maxDescriptorSetUpdateAfterBindInputAttachments(int value) {this.ptr.set(LAYOUT__maxDescriptorSetUpdateAfterBindInputAttachments, OFFSET__maxDescriptorSetUpdateAfterBindInputAttachments, value);}
    public java.lang.foreign.MemorySegment $maxDescriptorSetUpdateAfterBindInputAttachments() {return this.ptr.asSlice(OFFSET__maxDescriptorSetUpdateAfterBindInputAttachments, LAYOUT__maxDescriptorSetUpdateAfterBindInputAttachments);}

    public int supportedDepthResolveModes() {return this.ptr.get(LAYOUT__supportedDepthResolveModes, OFFSET__supportedDepthResolveModes);}
    public void supportedDepthResolveModes(int value) {this.ptr.set(LAYOUT__supportedDepthResolveModes, OFFSET__supportedDepthResolveModes, value);}
    public java.lang.foreign.MemorySegment $supportedDepthResolveModes() {return this.ptr.asSlice(OFFSET__supportedDepthResolveModes, LAYOUT__supportedDepthResolveModes);}

    public int supportedStencilResolveModes() {return this.ptr.get(LAYOUT__supportedStencilResolveModes, OFFSET__supportedStencilResolveModes);}
    public void supportedStencilResolveModes(int value) {this.ptr.set(LAYOUT__supportedStencilResolveModes, OFFSET__supportedStencilResolveModes, value);}
    public java.lang.foreign.MemorySegment $supportedStencilResolveModes() {return this.ptr.asSlice(OFFSET__supportedStencilResolveModes, LAYOUT__supportedStencilResolveModes);}

    public int independentResolveNone() {return this.ptr.get(LAYOUT__independentResolveNone, OFFSET__independentResolveNone);}
    public void independentResolveNone(int value) {this.ptr.set(LAYOUT__independentResolveNone, OFFSET__independentResolveNone, value);}
    public java.lang.foreign.MemorySegment $independentResolveNone() {return this.ptr.asSlice(OFFSET__independentResolveNone, LAYOUT__independentResolveNone);}

    public int independentResolve() {return this.ptr.get(LAYOUT__independentResolve, OFFSET__independentResolve);}
    public void independentResolve(int value) {this.ptr.set(LAYOUT__independentResolve, OFFSET__independentResolve, value);}
    public java.lang.foreign.MemorySegment $independentResolve() {return this.ptr.asSlice(OFFSET__independentResolve, LAYOUT__independentResolve);}

    public int filterMinmaxSingleComponentFormats() {return this.ptr.get(LAYOUT__filterMinmaxSingleComponentFormats, OFFSET__filterMinmaxSingleComponentFormats);}
    public void filterMinmaxSingleComponentFormats(int value) {this.ptr.set(LAYOUT__filterMinmaxSingleComponentFormats, OFFSET__filterMinmaxSingleComponentFormats, value);}
    public java.lang.foreign.MemorySegment $filterMinmaxSingleComponentFormats() {return this.ptr.asSlice(OFFSET__filterMinmaxSingleComponentFormats, LAYOUT__filterMinmaxSingleComponentFormats);}

    public int filterMinmaxImageComponentMapping() {return this.ptr.get(LAYOUT__filterMinmaxImageComponentMapping, OFFSET__filterMinmaxImageComponentMapping);}
    public void filterMinmaxImageComponentMapping(int value) {this.ptr.set(LAYOUT__filterMinmaxImageComponentMapping, OFFSET__filterMinmaxImageComponentMapping, value);}
    public java.lang.foreign.MemorySegment $filterMinmaxImageComponentMapping() {return this.ptr.asSlice(OFFSET__filterMinmaxImageComponentMapping, LAYOUT__filterMinmaxImageComponentMapping);}

    public long maxTimelineSemaphoreValueDifference() {return this.ptr.get(LAYOUT__maxTimelineSemaphoreValueDifference, OFFSET__maxTimelineSemaphoreValueDifference);}
    public void maxTimelineSemaphoreValueDifference(long value) {this.ptr.set(LAYOUT__maxTimelineSemaphoreValueDifference, OFFSET__maxTimelineSemaphoreValueDifference, value);}
    public java.lang.foreign.MemorySegment $maxTimelineSemaphoreValueDifference() {return this.ptr.asSlice(OFFSET__maxTimelineSemaphoreValueDifference, LAYOUT__maxTimelineSemaphoreValueDifference);}

    public int framebufferIntegerColorSampleCounts() {return this.ptr.get(LAYOUT__framebufferIntegerColorSampleCounts, OFFSET__framebufferIntegerColorSampleCounts);}
    public void framebufferIntegerColorSampleCounts(int value) {this.ptr.set(LAYOUT__framebufferIntegerColorSampleCounts, OFFSET__framebufferIntegerColorSampleCounts, value);}
    public java.lang.foreign.MemorySegment $framebufferIntegerColorSampleCounts() {return this.ptr.asSlice(OFFSET__framebufferIntegerColorSampleCounts, LAYOUT__framebufferIntegerColorSampleCounts);}
}
