package vma;

public record VkPhysicalDeviceLimits(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxImageDimension1D = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxImageDimension1D");
    public static final long OFFSET__maxImageDimension1D = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxImageDimension2D = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxImageDimension2D");
    public static final long OFFSET__maxImageDimension2D = 4;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxImageDimension3D = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxImageDimension3D");
    public static final long OFFSET__maxImageDimension3D = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxImageDimensionCube = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxImageDimensionCube");
    public static final long OFFSET__maxImageDimensionCube = 12;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxImageArrayLayers = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxImageArrayLayers");
    public static final long OFFSET__maxImageArrayLayers = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxTexelBufferElements = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxTexelBufferElements");
    public static final long OFFSET__maxTexelBufferElements = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxUniformBufferRange = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxUniformBufferRange");
    public static final long OFFSET__maxUniformBufferRange = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxStorageBufferRange = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxStorageBufferRange");
    public static final long OFFSET__maxStorageBufferRange = 28;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxPushConstantsSize = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxPushConstantsSize");
    public static final long OFFSET__maxPushConstantsSize = 32;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxMemoryAllocationCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxMemoryAllocationCount");
    public static final long OFFSET__maxMemoryAllocationCount = 36;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxSamplerAllocationCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxSamplerAllocationCount");
    public static final long OFFSET__maxSamplerAllocationCount = 40;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__bufferImageGranularity = java.lang.foreign.ValueLayout.JAVA_LONG.withName("bufferImageGranularity");
    public static final long OFFSET__bufferImageGranularity = 48;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__sparseAddressSpaceSize = java.lang.foreign.ValueLayout.JAVA_LONG.withName("sparseAddressSpaceSize");
    public static final long OFFSET__sparseAddressSpaceSize = 56;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxBoundDescriptorSets = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxBoundDescriptorSets");
    public static final long OFFSET__maxBoundDescriptorSets = 64;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxPerStageDescriptorSamplers = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxPerStageDescriptorSamplers");
    public static final long OFFSET__maxPerStageDescriptorSamplers = 68;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxPerStageDescriptorUniformBuffers = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxPerStageDescriptorUniformBuffers");
    public static final long OFFSET__maxPerStageDescriptorUniformBuffers = 72;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxPerStageDescriptorStorageBuffers = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxPerStageDescriptorStorageBuffers");
    public static final long OFFSET__maxPerStageDescriptorStorageBuffers = 76;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxPerStageDescriptorSampledImages = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxPerStageDescriptorSampledImages");
    public static final long OFFSET__maxPerStageDescriptorSampledImages = 80;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxPerStageDescriptorStorageImages = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxPerStageDescriptorStorageImages");
    public static final long OFFSET__maxPerStageDescriptorStorageImages = 84;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxPerStageDescriptorInputAttachments = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxPerStageDescriptorInputAttachments");
    public static final long OFFSET__maxPerStageDescriptorInputAttachments = 88;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxPerStageResources = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxPerStageResources");
    public static final long OFFSET__maxPerStageResources = 92;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxDescriptorSetSamplers = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxDescriptorSetSamplers");
    public static final long OFFSET__maxDescriptorSetSamplers = 96;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxDescriptorSetUniformBuffers = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxDescriptorSetUniformBuffers");
    public static final long OFFSET__maxDescriptorSetUniformBuffers = 100;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxDescriptorSetUniformBuffersDynamic = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxDescriptorSetUniformBuffersDynamic");
    public static final long OFFSET__maxDescriptorSetUniformBuffersDynamic = 104;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxDescriptorSetStorageBuffers = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxDescriptorSetStorageBuffers");
    public static final long OFFSET__maxDescriptorSetStorageBuffers = 108;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxDescriptorSetStorageBuffersDynamic = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxDescriptorSetStorageBuffersDynamic");
    public static final long OFFSET__maxDescriptorSetStorageBuffersDynamic = 112;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxDescriptorSetSampledImages = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxDescriptorSetSampledImages");
    public static final long OFFSET__maxDescriptorSetSampledImages = 116;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxDescriptorSetStorageImages = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxDescriptorSetStorageImages");
    public static final long OFFSET__maxDescriptorSetStorageImages = 120;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxDescriptorSetInputAttachments = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxDescriptorSetInputAttachments");
    public static final long OFFSET__maxDescriptorSetInputAttachments = 124;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxVertexInputAttributes = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxVertexInputAttributes");
    public static final long OFFSET__maxVertexInputAttributes = 128;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxVertexInputBindings = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxVertexInputBindings");
    public static final long OFFSET__maxVertexInputBindings = 132;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxVertexInputAttributeOffset = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxVertexInputAttributeOffset");
    public static final long OFFSET__maxVertexInputAttributeOffset = 136;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxVertexInputBindingStride = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxVertexInputBindingStride");
    public static final long OFFSET__maxVertexInputBindingStride = 140;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxVertexOutputComponents = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxVertexOutputComponents");
    public static final long OFFSET__maxVertexOutputComponents = 144;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxTessellationGenerationLevel = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxTessellationGenerationLevel");
    public static final long OFFSET__maxTessellationGenerationLevel = 148;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxTessellationPatchSize = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxTessellationPatchSize");
    public static final long OFFSET__maxTessellationPatchSize = 152;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxTessellationControlPerVertexInputComponents = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxTessellationControlPerVertexInputComponents");
    public static final long OFFSET__maxTessellationControlPerVertexInputComponents = 156;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxTessellationControlPerVertexOutputComponents = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxTessellationControlPerVertexOutputComponents");
    public static final long OFFSET__maxTessellationControlPerVertexOutputComponents = 160;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxTessellationControlPerPatchOutputComponents = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxTessellationControlPerPatchOutputComponents");
    public static final long OFFSET__maxTessellationControlPerPatchOutputComponents = 164;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxTessellationControlTotalOutputComponents = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxTessellationControlTotalOutputComponents");
    public static final long OFFSET__maxTessellationControlTotalOutputComponents = 168;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxTessellationEvaluationInputComponents = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxTessellationEvaluationInputComponents");
    public static final long OFFSET__maxTessellationEvaluationInputComponents = 172;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxTessellationEvaluationOutputComponents = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxTessellationEvaluationOutputComponents");
    public static final long OFFSET__maxTessellationEvaluationOutputComponents = 176;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxGeometryShaderInvocations = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxGeometryShaderInvocations");
    public static final long OFFSET__maxGeometryShaderInvocations = 180;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxGeometryInputComponents = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxGeometryInputComponents");
    public static final long OFFSET__maxGeometryInputComponents = 184;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxGeometryOutputComponents = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxGeometryOutputComponents");
    public static final long OFFSET__maxGeometryOutputComponents = 188;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxGeometryOutputVertices = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxGeometryOutputVertices");
    public static final long OFFSET__maxGeometryOutputVertices = 192;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxGeometryTotalOutputComponents = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxGeometryTotalOutputComponents");
    public static final long OFFSET__maxGeometryTotalOutputComponents = 196;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxFragmentInputComponents = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxFragmentInputComponents");
    public static final long OFFSET__maxFragmentInputComponents = 200;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxFragmentOutputAttachments = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxFragmentOutputAttachments");
    public static final long OFFSET__maxFragmentOutputAttachments = 204;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxFragmentDualSrcAttachments = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxFragmentDualSrcAttachments");
    public static final long OFFSET__maxFragmentDualSrcAttachments = 208;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxFragmentCombinedOutputResources = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxFragmentCombinedOutputResources");
    public static final long OFFSET__maxFragmentCombinedOutputResources = 212;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxComputeSharedMemorySize = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxComputeSharedMemorySize");
    public static final long OFFSET__maxComputeSharedMemorySize = 216;
    public static final java.lang.foreign.SequenceLayout LAYOUT__maxComputeWorkGroupCount = java.lang.foreign.MemoryLayout.sequenceLayout(3, java.lang.foreign.ValueLayout.JAVA_INT).withName("maxComputeWorkGroupCount");
    public static final long OFFSET__maxComputeWorkGroupCount = 220;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxComputeWorkGroupInvocations = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxComputeWorkGroupInvocations");
    public static final long OFFSET__maxComputeWorkGroupInvocations = 232;
    public static final java.lang.foreign.SequenceLayout LAYOUT__maxComputeWorkGroupSize = java.lang.foreign.MemoryLayout.sequenceLayout(3, java.lang.foreign.ValueLayout.JAVA_INT).withName("maxComputeWorkGroupSize");
    public static final long OFFSET__maxComputeWorkGroupSize = 236;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__subPixelPrecisionBits = java.lang.foreign.ValueLayout.JAVA_INT.withName("subPixelPrecisionBits");
    public static final long OFFSET__subPixelPrecisionBits = 248;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__subTexelPrecisionBits = java.lang.foreign.ValueLayout.JAVA_INT.withName("subTexelPrecisionBits");
    public static final long OFFSET__subTexelPrecisionBits = 252;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__mipmapPrecisionBits = java.lang.foreign.ValueLayout.JAVA_INT.withName("mipmapPrecisionBits");
    public static final long OFFSET__mipmapPrecisionBits = 256;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxDrawIndexedIndexValue = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxDrawIndexedIndexValue");
    public static final long OFFSET__maxDrawIndexedIndexValue = 260;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxDrawIndirectCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxDrawIndirectCount");
    public static final long OFFSET__maxDrawIndirectCount = 264;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__maxSamplerLodBias = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("maxSamplerLodBias");
    public static final long OFFSET__maxSamplerLodBias = 268;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__maxSamplerAnisotropy = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("maxSamplerAnisotropy");
    public static final long OFFSET__maxSamplerAnisotropy = 272;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxViewports = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxViewports");
    public static final long OFFSET__maxViewports = 276;
    public static final java.lang.foreign.SequenceLayout LAYOUT__maxViewportDimensions = java.lang.foreign.MemoryLayout.sequenceLayout(2, java.lang.foreign.ValueLayout.JAVA_INT).withName("maxViewportDimensions");
    public static final long OFFSET__maxViewportDimensions = 280;
    public static final java.lang.foreign.SequenceLayout LAYOUT__viewportBoundsRange = java.lang.foreign.MemoryLayout.sequenceLayout(2, java.lang.foreign.ValueLayout.JAVA_FLOAT).withName("viewportBoundsRange");
    public static final long OFFSET__viewportBoundsRange = 288;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__viewportSubPixelBits = java.lang.foreign.ValueLayout.JAVA_INT.withName("viewportSubPixelBits");
    public static final long OFFSET__viewportSubPixelBits = 296;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__minMemoryMapAlignment = java.lang.foreign.ValueLayout.JAVA_LONG.withName("minMemoryMapAlignment");
    public static final long OFFSET__minMemoryMapAlignment = 304;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__minTexelBufferOffsetAlignment = java.lang.foreign.ValueLayout.JAVA_LONG.withName("minTexelBufferOffsetAlignment");
    public static final long OFFSET__minTexelBufferOffsetAlignment = 312;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__minUniformBufferOffsetAlignment = java.lang.foreign.ValueLayout.JAVA_LONG.withName("minUniformBufferOffsetAlignment");
    public static final long OFFSET__minUniformBufferOffsetAlignment = 320;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__minStorageBufferOffsetAlignment = java.lang.foreign.ValueLayout.JAVA_LONG.withName("minStorageBufferOffsetAlignment");
    public static final long OFFSET__minStorageBufferOffsetAlignment = 328;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__minTexelOffset = java.lang.foreign.ValueLayout.JAVA_INT.withName("minTexelOffset");
    public static final long OFFSET__minTexelOffset = 336;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxTexelOffset = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxTexelOffset");
    public static final long OFFSET__maxTexelOffset = 340;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__minTexelGatherOffset = java.lang.foreign.ValueLayout.JAVA_INT.withName("minTexelGatherOffset");
    public static final long OFFSET__minTexelGatherOffset = 344;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxTexelGatherOffset = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxTexelGatherOffset");
    public static final long OFFSET__maxTexelGatherOffset = 348;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__minInterpolationOffset = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("minInterpolationOffset");
    public static final long OFFSET__minInterpolationOffset = 352;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__maxInterpolationOffset = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("maxInterpolationOffset");
    public static final long OFFSET__maxInterpolationOffset = 356;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__subPixelInterpolationOffsetBits = java.lang.foreign.ValueLayout.JAVA_INT.withName("subPixelInterpolationOffsetBits");
    public static final long OFFSET__subPixelInterpolationOffsetBits = 360;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxFramebufferWidth = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxFramebufferWidth");
    public static final long OFFSET__maxFramebufferWidth = 364;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxFramebufferHeight = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxFramebufferHeight");
    public static final long OFFSET__maxFramebufferHeight = 368;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxFramebufferLayers = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxFramebufferLayers");
    public static final long OFFSET__maxFramebufferLayers = 372;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__framebufferColorSampleCounts = java.lang.foreign.ValueLayout.JAVA_INT.withName("framebufferColorSampleCounts");
    public static final long OFFSET__framebufferColorSampleCounts = 376;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__framebufferDepthSampleCounts = java.lang.foreign.ValueLayout.JAVA_INT.withName("framebufferDepthSampleCounts");
    public static final long OFFSET__framebufferDepthSampleCounts = 380;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__framebufferStencilSampleCounts = java.lang.foreign.ValueLayout.JAVA_INT.withName("framebufferStencilSampleCounts");
    public static final long OFFSET__framebufferStencilSampleCounts = 384;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__framebufferNoAttachmentsSampleCounts = java.lang.foreign.ValueLayout.JAVA_INT.withName("framebufferNoAttachmentsSampleCounts");
    public static final long OFFSET__framebufferNoAttachmentsSampleCounts = 388;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxColorAttachments = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxColorAttachments");
    public static final long OFFSET__maxColorAttachments = 392;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sampledImageColorSampleCounts = java.lang.foreign.ValueLayout.JAVA_INT.withName("sampledImageColorSampleCounts");
    public static final long OFFSET__sampledImageColorSampleCounts = 396;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sampledImageIntegerSampleCounts = java.lang.foreign.ValueLayout.JAVA_INT.withName("sampledImageIntegerSampleCounts");
    public static final long OFFSET__sampledImageIntegerSampleCounts = 400;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sampledImageDepthSampleCounts = java.lang.foreign.ValueLayout.JAVA_INT.withName("sampledImageDepthSampleCounts");
    public static final long OFFSET__sampledImageDepthSampleCounts = 404;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sampledImageStencilSampleCounts = java.lang.foreign.ValueLayout.JAVA_INT.withName("sampledImageStencilSampleCounts");
    public static final long OFFSET__sampledImageStencilSampleCounts = 408;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__storageImageSampleCounts = java.lang.foreign.ValueLayout.JAVA_INT.withName("storageImageSampleCounts");
    public static final long OFFSET__storageImageSampleCounts = 412;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxSampleMaskWords = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxSampleMaskWords");
    public static final long OFFSET__maxSampleMaskWords = 416;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__timestampComputeAndGraphics = java.lang.foreign.ValueLayout.JAVA_INT.withName("timestampComputeAndGraphics");
    public static final long OFFSET__timestampComputeAndGraphics = 420;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__timestampPeriod = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("timestampPeriod");
    public static final long OFFSET__timestampPeriod = 424;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxClipDistances = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxClipDistances");
    public static final long OFFSET__maxClipDistances = 428;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxCullDistances = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxCullDistances");
    public static final long OFFSET__maxCullDistances = 432;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxCombinedClipAndCullDistances = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxCombinedClipAndCullDistances");
    public static final long OFFSET__maxCombinedClipAndCullDistances = 436;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__discreteQueuePriorities = java.lang.foreign.ValueLayout.JAVA_INT.withName("discreteQueuePriorities");
    public static final long OFFSET__discreteQueuePriorities = 440;
    public static final java.lang.foreign.SequenceLayout LAYOUT__pointSizeRange = java.lang.foreign.MemoryLayout.sequenceLayout(2, java.lang.foreign.ValueLayout.JAVA_FLOAT).withName("pointSizeRange");
    public static final long OFFSET__pointSizeRange = 444;
    public static final java.lang.foreign.SequenceLayout LAYOUT__lineWidthRange = java.lang.foreign.MemoryLayout.sequenceLayout(2, java.lang.foreign.ValueLayout.JAVA_FLOAT).withName("lineWidthRange");
    public static final long OFFSET__lineWidthRange = 452;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__pointSizeGranularity = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("pointSizeGranularity");
    public static final long OFFSET__pointSizeGranularity = 460;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__lineWidthGranularity = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("lineWidthGranularity");
    public static final long OFFSET__lineWidthGranularity = 464;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__strictLines = java.lang.foreign.ValueLayout.JAVA_INT.withName("strictLines");
    public static final long OFFSET__strictLines = 468;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__standardSampleLocations = java.lang.foreign.ValueLayout.JAVA_INT.withName("standardSampleLocations");
    public static final long OFFSET__standardSampleLocations = 472;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__optimalBufferCopyOffsetAlignment = java.lang.foreign.ValueLayout.JAVA_LONG.withName("optimalBufferCopyOffsetAlignment");
    public static final long OFFSET__optimalBufferCopyOffsetAlignment = 480;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__optimalBufferCopyRowPitchAlignment = java.lang.foreign.ValueLayout.JAVA_LONG.withName("optimalBufferCopyRowPitchAlignment");
    public static final long OFFSET__optimalBufferCopyRowPitchAlignment = 488;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__nonCoherentAtomSize = java.lang.foreign.ValueLayout.JAVA_LONG.withName("nonCoherentAtomSize");
    public static final long OFFSET__nonCoherentAtomSize = 496;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__maxImageDimension1D,
            LAYOUT__maxImageDimension2D,
            LAYOUT__maxImageDimension3D,
            LAYOUT__maxImageDimensionCube,
            LAYOUT__maxImageArrayLayers,
            LAYOUT__maxTexelBufferElements,
            LAYOUT__maxUniformBufferRange,
            LAYOUT__maxStorageBufferRange,
            LAYOUT__maxPushConstantsSize,
            LAYOUT__maxMemoryAllocationCount,
            LAYOUT__maxSamplerAllocationCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__bufferImageGranularity,
            LAYOUT__sparseAddressSpaceSize,
            LAYOUT__maxBoundDescriptorSets,
            LAYOUT__maxPerStageDescriptorSamplers,
            LAYOUT__maxPerStageDescriptorUniformBuffers,
            LAYOUT__maxPerStageDescriptorStorageBuffers,
            LAYOUT__maxPerStageDescriptorSampledImages,
            LAYOUT__maxPerStageDescriptorStorageImages,
            LAYOUT__maxPerStageDescriptorInputAttachments,
            LAYOUT__maxPerStageResources,
            LAYOUT__maxDescriptorSetSamplers,
            LAYOUT__maxDescriptorSetUniformBuffers,
            LAYOUT__maxDescriptorSetUniformBuffersDynamic,
            LAYOUT__maxDescriptorSetStorageBuffers,
            LAYOUT__maxDescriptorSetStorageBuffersDynamic,
            LAYOUT__maxDescriptorSetSampledImages,
            LAYOUT__maxDescriptorSetStorageImages,
            LAYOUT__maxDescriptorSetInputAttachments,
            LAYOUT__maxVertexInputAttributes,
            LAYOUT__maxVertexInputBindings,
            LAYOUT__maxVertexInputAttributeOffset,
            LAYOUT__maxVertexInputBindingStride,
            LAYOUT__maxVertexOutputComponents,
            LAYOUT__maxTessellationGenerationLevel,
            LAYOUT__maxTessellationPatchSize,
            LAYOUT__maxTessellationControlPerVertexInputComponents,
            LAYOUT__maxTessellationControlPerVertexOutputComponents,
            LAYOUT__maxTessellationControlPerPatchOutputComponents,
            LAYOUT__maxTessellationControlTotalOutputComponents,
            LAYOUT__maxTessellationEvaluationInputComponents,
            LAYOUT__maxTessellationEvaluationOutputComponents,
            LAYOUT__maxGeometryShaderInvocations,
            LAYOUT__maxGeometryInputComponents,
            LAYOUT__maxGeometryOutputComponents,
            LAYOUT__maxGeometryOutputVertices,
            LAYOUT__maxGeometryTotalOutputComponents,
            LAYOUT__maxFragmentInputComponents,
            LAYOUT__maxFragmentOutputAttachments,
            LAYOUT__maxFragmentDualSrcAttachments,
            LAYOUT__maxFragmentCombinedOutputResources,
            LAYOUT__maxComputeSharedMemorySize,
            LAYOUT__maxComputeWorkGroupCount,
            LAYOUT__maxComputeWorkGroupInvocations,
            LAYOUT__maxComputeWorkGroupSize,
            LAYOUT__subPixelPrecisionBits,
            LAYOUT__subTexelPrecisionBits,
            LAYOUT__mipmapPrecisionBits,
            LAYOUT__maxDrawIndexedIndexValue,
            LAYOUT__maxDrawIndirectCount,
            LAYOUT__maxSamplerLodBias,
            LAYOUT__maxSamplerAnisotropy,
            LAYOUT__maxViewports,
            LAYOUT__maxViewportDimensions,
            LAYOUT__viewportBoundsRange,
            LAYOUT__viewportSubPixelBits,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__minMemoryMapAlignment,
            LAYOUT__minTexelBufferOffsetAlignment,
            LAYOUT__minUniformBufferOffsetAlignment,
            LAYOUT__minStorageBufferOffsetAlignment,
            LAYOUT__minTexelOffset,
            LAYOUT__maxTexelOffset,
            LAYOUT__minTexelGatherOffset,
            LAYOUT__maxTexelGatherOffset,
            LAYOUT__minInterpolationOffset,
            LAYOUT__maxInterpolationOffset,
            LAYOUT__subPixelInterpolationOffsetBits,
            LAYOUT__maxFramebufferWidth,
            LAYOUT__maxFramebufferHeight,
            LAYOUT__maxFramebufferLayers,
            LAYOUT__framebufferColorSampleCounts,
            LAYOUT__framebufferDepthSampleCounts,
            LAYOUT__framebufferStencilSampleCounts,
            LAYOUT__framebufferNoAttachmentsSampleCounts,
            LAYOUT__maxColorAttachments,
            LAYOUT__sampledImageColorSampleCounts,
            LAYOUT__sampledImageIntegerSampleCounts,
            LAYOUT__sampledImageDepthSampleCounts,
            LAYOUT__sampledImageStencilSampleCounts,
            LAYOUT__storageImageSampleCounts,
            LAYOUT__maxSampleMaskWords,
            LAYOUT__timestampComputeAndGraphics,
            LAYOUT__timestampPeriod,
            LAYOUT__maxClipDistances,
            LAYOUT__maxCullDistances,
            LAYOUT__maxCombinedClipAndCullDistances,
            LAYOUT__discreteQueuePriorities,
            LAYOUT__pointSizeRange,
            LAYOUT__lineWidthRange,
            LAYOUT__pointSizeGranularity,
            LAYOUT__lineWidthGranularity,
            LAYOUT__strictLines,
            LAYOUT__standardSampleLocations,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__optimalBufferCopyOffsetAlignment,
            LAYOUT__optimalBufferCopyRowPitchAlignment,
            LAYOUT__nonCoherentAtomSize
    ).withByteAlignment(8).withName("VkPhysicalDeviceLimits");

    public VkPhysicalDeviceLimits(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceLimits getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceLimits(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceLimits value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int maxImageDimension1D() {return this.ptr.get(LAYOUT__maxImageDimension1D, OFFSET__maxImageDimension1D);}
    public void maxImageDimension1D(int value) {this.ptr.set(LAYOUT__maxImageDimension1D, OFFSET__maxImageDimension1D, value);}
    public java.lang.foreign.MemorySegment $maxImageDimension1D() {return this.ptr.asSlice(OFFSET__maxImageDimension1D, LAYOUT__maxImageDimension1D);}

    public int maxImageDimension2D() {return this.ptr.get(LAYOUT__maxImageDimension2D, OFFSET__maxImageDimension2D);}
    public void maxImageDimension2D(int value) {this.ptr.set(LAYOUT__maxImageDimension2D, OFFSET__maxImageDimension2D, value);}
    public java.lang.foreign.MemorySegment $maxImageDimension2D() {return this.ptr.asSlice(OFFSET__maxImageDimension2D, LAYOUT__maxImageDimension2D);}

    public int maxImageDimension3D() {return this.ptr.get(LAYOUT__maxImageDimension3D, OFFSET__maxImageDimension3D);}
    public void maxImageDimension3D(int value) {this.ptr.set(LAYOUT__maxImageDimension3D, OFFSET__maxImageDimension3D, value);}
    public java.lang.foreign.MemorySegment $maxImageDimension3D() {return this.ptr.asSlice(OFFSET__maxImageDimension3D, LAYOUT__maxImageDimension3D);}

    public int maxImageDimensionCube() {return this.ptr.get(LAYOUT__maxImageDimensionCube, OFFSET__maxImageDimensionCube);}
    public void maxImageDimensionCube(int value) {this.ptr.set(LAYOUT__maxImageDimensionCube, OFFSET__maxImageDimensionCube, value);}
    public java.lang.foreign.MemorySegment $maxImageDimensionCube() {return this.ptr.asSlice(OFFSET__maxImageDimensionCube, LAYOUT__maxImageDimensionCube);}

    public int maxImageArrayLayers() {return this.ptr.get(LAYOUT__maxImageArrayLayers, OFFSET__maxImageArrayLayers);}
    public void maxImageArrayLayers(int value) {this.ptr.set(LAYOUT__maxImageArrayLayers, OFFSET__maxImageArrayLayers, value);}
    public java.lang.foreign.MemorySegment $maxImageArrayLayers() {return this.ptr.asSlice(OFFSET__maxImageArrayLayers, LAYOUT__maxImageArrayLayers);}

    public int maxTexelBufferElements() {return this.ptr.get(LAYOUT__maxTexelBufferElements, OFFSET__maxTexelBufferElements);}
    public void maxTexelBufferElements(int value) {this.ptr.set(LAYOUT__maxTexelBufferElements, OFFSET__maxTexelBufferElements, value);}
    public java.lang.foreign.MemorySegment $maxTexelBufferElements() {return this.ptr.asSlice(OFFSET__maxTexelBufferElements, LAYOUT__maxTexelBufferElements);}

    public int maxUniformBufferRange() {return this.ptr.get(LAYOUT__maxUniformBufferRange, OFFSET__maxUniformBufferRange);}
    public void maxUniformBufferRange(int value) {this.ptr.set(LAYOUT__maxUniformBufferRange, OFFSET__maxUniformBufferRange, value);}
    public java.lang.foreign.MemorySegment $maxUniformBufferRange() {return this.ptr.asSlice(OFFSET__maxUniformBufferRange, LAYOUT__maxUniformBufferRange);}

    public int maxStorageBufferRange() {return this.ptr.get(LAYOUT__maxStorageBufferRange, OFFSET__maxStorageBufferRange);}
    public void maxStorageBufferRange(int value) {this.ptr.set(LAYOUT__maxStorageBufferRange, OFFSET__maxStorageBufferRange, value);}
    public java.lang.foreign.MemorySegment $maxStorageBufferRange() {return this.ptr.asSlice(OFFSET__maxStorageBufferRange, LAYOUT__maxStorageBufferRange);}

    public int maxPushConstantsSize() {return this.ptr.get(LAYOUT__maxPushConstantsSize, OFFSET__maxPushConstantsSize);}
    public void maxPushConstantsSize(int value) {this.ptr.set(LAYOUT__maxPushConstantsSize, OFFSET__maxPushConstantsSize, value);}
    public java.lang.foreign.MemorySegment $maxPushConstantsSize() {return this.ptr.asSlice(OFFSET__maxPushConstantsSize, LAYOUT__maxPushConstantsSize);}

    public int maxMemoryAllocationCount() {return this.ptr.get(LAYOUT__maxMemoryAllocationCount, OFFSET__maxMemoryAllocationCount);}
    public void maxMemoryAllocationCount(int value) {this.ptr.set(LAYOUT__maxMemoryAllocationCount, OFFSET__maxMemoryAllocationCount, value);}
    public java.lang.foreign.MemorySegment $maxMemoryAllocationCount() {return this.ptr.asSlice(OFFSET__maxMemoryAllocationCount, LAYOUT__maxMemoryAllocationCount);}

    public int maxSamplerAllocationCount() {return this.ptr.get(LAYOUT__maxSamplerAllocationCount, OFFSET__maxSamplerAllocationCount);}
    public void maxSamplerAllocationCount(int value) {this.ptr.set(LAYOUT__maxSamplerAllocationCount, OFFSET__maxSamplerAllocationCount, value);}
    public java.lang.foreign.MemorySegment $maxSamplerAllocationCount() {return this.ptr.asSlice(OFFSET__maxSamplerAllocationCount, LAYOUT__maxSamplerAllocationCount);}

    public long bufferImageGranularity() {return this.ptr.get(LAYOUT__bufferImageGranularity, OFFSET__bufferImageGranularity);}
    public void bufferImageGranularity(long value) {this.ptr.set(LAYOUT__bufferImageGranularity, OFFSET__bufferImageGranularity, value);}
    public java.lang.foreign.MemorySegment $bufferImageGranularity() {return this.ptr.asSlice(OFFSET__bufferImageGranularity, LAYOUT__bufferImageGranularity);}

    public long sparseAddressSpaceSize() {return this.ptr.get(LAYOUT__sparseAddressSpaceSize, OFFSET__sparseAddressSpaceSize);}
    public void sparseAddressSpaceSize(long value) {this.ptr.set(LAYOUT__sparseAddressSpaceSize, OFFSET__sparseAddressSpaceSize, value);}
    public java.lang.foreign.MemorySegment $sparseAddressSpaceSize() {return this.ptr.asSlice(OFFSET__sparseAddressSpaceSize, LAYOUT__sparseAddressSpaceSize);}

    public int maxBoundDescriptorSets() {return this.ptr.get(LAYOUT__maxBoundDescriptorSets, OFFSET__maxBoundDescriptorSets);}
    public void maxBoundDescriptorSets(int value) {this.ptr.set(LAYOUT__maxBoundDescriptorSets, OFFSET__maxBoundDescriptorSets, value);}
    public java.lang.foreign.MemorySegment $maxBoundDescriptorSets() {return this.ptr.asSlice(OFFSET__maxBoundDescriptorSets, LAYOUT__maxBoundDescriptorSets);}

    public int maxPerStageDescriptorSamplers() {return this.ptr.get(LAYOUT__maxPerStageDescriptorSamplers, OFFSET__maxPerStageDescriptorSamplers);}
    public void maxPerStageDescriptorSamplers(int value) {this.ptr.set(LAYOUT__maxPerStageDescriptorSamplers, OFFSET__maxPerStageDescriptorSamplers, value);}
    public java.lang.foreign.MemorySegment $maxPerStageDescriptorSamplers() {return this.ptr.asSlice(OFFSET__maxPerStageDescriptorSamplers, LAYOUT__maxPerStageDescriptorSamplers);}

    public int maxPerStageDescriptorUniformBuffers() {return this.ptr.get(LAYOUT__maxPerStageDescriptorUniformBuffers, OFFSET__maxPerStageDescriptorUniformBuffers);}
    public void maxPerStageDescriptorUniformBuffers(int value) {this.ptr.set(LAYOUT__maxPerStageDescriptorUniformBuffers, OFFSET__maxPerStageDescriptorUniformBuffers, value);}
    public java.lang.foreign.MemorySegment $maxPerStageDescriptorUniformBuffers() {return this.ptr.asSlice(OFFSET__maxPerStageDescriptorUniformBuffers, LAYOUT__maxPerStageDescriptorUniformBuffers);}

    public int maxPerStageDescriptorStorageBuffers() {return this.ptr.get(LAYOUT__maxPerStageDescriptorStorageBuffers, OFFSET__maxPerStageDescriptorStorageBuffers);}
    public void maxPerStageDescriptorStorageBuffers(int value) {this.ptr.set(LAYOUT__maxPerStageDescriptorStorageBuffers, OFFSET__maxPerStageDescriptorStorageBuffers, value);}
    public java.lang.foreign.MemorySegment $maxPerStageDescriptorStorageBuffers() {return this.ptr.asSlice(OFFSET__maxPerStageDescriptorStorageBuffers, LAYOUT__maxPerStageDescriptorStorageBuffers);}

    public int maxPerStageDescriptorSampledImages() {return this.ptr.get(LAYOUT__maxPerStageDescriptorSampledImages, OFFSET__maxPerStageDescriptorSampledImages);}
    public void maxPerStageDescriptorSampledImages(int value) {this.ptr.set(LAYOUT__maxPerStageDescriptorSampledImages, OFFSET__maxPerStageDescriptorSampledImages, value);}
    public java.lang.foreign.MemorySegment $maxPerStageDescriptorSampledImages() {return this.ptr.asSlice(OFFSET__maxPerStageDescriptorSampledImages, LAYOUT__maxPerStageDescriptorSampledImages);}

    public int maxPerStageDescriptorStorageImages() {return this.ptr.get(LAYOUT__maxPerStageDescriptorStorageImages, OFFSET__maxPerStageDescriptorStorageImages);}
    public void maxPerStageDescriptorStorageImages(int value) {this.ptr.set(LAYOUT__maxPerStageDescriptorStorageImages, OFFSET__maxPerStageDescriptorStorageImages, value);}
    public java.lang.foreign.MemorySegment $maxPerStageDescriptorStorageImages() {return this.ptr.asSlice(OFFSET__maxPerStageDescriptorStorageImages, LAYOUT__maxPerStageDescriptorStorageImages);}

    public int maxPerStageDescriptorInputAttachments() {return this.ptr.get(LAYOUT__maxPerStageDescriptorInputAttachments, OFFSET__maxPerStageDescriptorInputAttachments);}
    public void maxPerStageDescriptorInputAttachments(int value) {this.ptr.set(LAYOUT__maxPerStageDescriptorInputAttachments, OFFSET__maxPerStageDescriptorInputAttachments, value);}
    public java.lang.foreign.MemorySegment $maxPerStageDescriptorInputAttachments() {return this.ptr.asSlice(OFFSET__maxPerStageDescriptorInputAttachments, LAYOUT__maxPerStageDescriptorInputAttachments);}

    public int maxPerStageResources() {return this.ptr.get(LAYOUT__maxPerStageResources, OFFSET__maxPerStageResources);}
    public void maxPerStageResources(int value) {this.ptr.set(LAYOUT__maxPerStageResources, OFFSET__maxPerStageResources, value);}
    public java.lang.foreign.MemorySegment $maxPerStageResources() {return this.ptr.asSlice(OFFSET__maxPerStageResources, LAYOUT__maxPerStageResources);}

    public int maxDescriptorSetSamplers() {return this.ptr.get(LAYOUT__maxDescriptorSetSamplers, OFFSET__maxDescriptorSetSamplers);}
    public void maxDescriptorSetSamplers(int value) {this.ptr.set(LAYOUT__maxDescriptorSetSamplers, OFFSET__maxDescriptorSetSamplers, value);}
    public java.lang.foreign.MemorySegment $maxDescriptorSetSamplers() {return this.ptr.asSlice(OFFSET__maxDescriptorSetSamplers, LAYOUT__maxDescriptorSetSamplers);}

    public int maxDescriptorSetUniformBuffers() {return this.ptr.get(LAYOUT__maxDescriptorSetUniformBuffers, OFFSET__maxDescriptorSetUniformBuffers);}
    public void maxDescriptorSetUniformBuffers(int value) {this.ptr.set(LAYOUT__maxDescriptorSetUniformBuffers, OFFSET__maxDescriptorSetUniformBuffers, value);}
    public java.lang.foreign.MemorySegment $maxDescriptorSetUniformBuffers() {return this.ptr.asSlice(OFFSET__maxDescriptorSetUniformBuffers, LAYOUT__maxDescriptorSetUniformBuffers);}

    public int maxDescriptorSetUniformBuffersDynamic() {return this.ptr.get(LAYOUT__maxDescriptorSetUniformBuffersDynamic, OFFSET__maxDescriptorSetUniformBuffersDynamic);}
    public void maxDescriptorSetUniformBuffersDynamic(int value) {this.ptr.set(LAYOUT__maxDescriptorSetUniformBuffersDynamic, OFFSET__maxDescriptorSetUniformBuffersDynamic, value);}
    public java.lang.foreign.MemorySegment $maxDescriptorSetUniformBuffersDynamic() {return this.ptr.asSlice(OFFSET__maxDescriptorSetUniformBuffersDynamic, LAYOUT__maxDescriptorSetUniformBuffersDynamic);}

    public int maxDescriptorSetStorageBuffers() {return this.ptr.get(LAYOUT__maxDescriptorSetStorageBuffers, OFFSET__maxDescriptorSetStorageBuffers);}
    public void maxDescriptorSetStorageBuffers(int value) {this.ptr.set(LAYOUT__maxDescriptorSetStorageBuffers, OFFSET__maxDescriptorSetStorageBuffers, value);}
    public java.lang.foreign.MemorySegment $maxDescriptorSetStorageBuffers() {return this.ptr.asSlice(OFFSET__maxDescriptorSetStorageBuffers, LAYOUT__maxDescriptorSetStorageBuffers);}

    public int maxDescriptorSetStorageBuffersDynamic() {return this.ptr.get(LAYOUT__maxDescriptorSetStorageBuffersDynamic, OFFSET__maxDescriptorSetStorageBuffersDynamic);}
    public void maxDescriptorSetStorageBuffersDynamic(int value) {this.ptr.set(LAYOUT__maxDescriptorSetStorageBuffersDynamic, OFFSET__maxDescriptorSetStorageBuffersDynamic, value);}
    public java.lang.foreign.MemorySegment $maxDescriptorSetStorageBuffersDynamic() {return this.ptr.asSlice(OFFSET__maxDescriptorSetStorageBuffersDynamic, LAYOUT__maxDescriptorSetStorageBuffersDynamic);}

    public int maxDescriptorSetSampledImages() {return this.ptr.get(LAYOUT__maxDescriptorSetSampledImages, OFFSET__maxDescriptorSetSampledImages);}
    public void maxDescriptorSetSampledImages(int value) {this.ptr.set(LAYOUT__maxDescriptorSetSampledImages, OFFSET__maxDescriptorSetSampledImages, value);}
    public java.lang.foreign.MemorySegment $maxDescriptorSetSampledImages() {return this.ptr.asSlice(OFFSET__maxDescriptorSetSampledImages, LAYOUT__maxDescriptorSetSampledImages);}

    public int maxDescriptorSetStorageImages() {return this.ptr.get(LAYOUT__maxDescriptorSetStorageImages, OFFSET__maxDescriptorSetStorageImages);}
    public void maxDescriptorSetStorageImages(int value) {this.ptr.set(LAYOUT__maxDescriptorSetStorageImages, OFFSET__maxDescriptorSetStorageImages, value);}
    public java.lang.foreign.MemorySegment $maxDescriptorSetStorageImages() {return this.ptr.asSlice(OFFSET__maxDescriptorSetStorageImages, LAYOUT__maxDescriptorSetStorageImages);}

    public int maxDescriptorSetInputAttachments() {return this.ptr.get(LAYOUT__maxDescriptorSetInputAttachments, OFFSET__maxDescriptorSetInputAttachments);}
    public void maxDescriptorSetInputAttachments(int value) {this.ptr.set(LAYOUT__maxDescriptorSetInputAttachments, OFFSET__maxDescriptorSetInputAttachments, value);}
    public java.lang.foreign.MemorySegment $maxDescriptorSetInputAttachments() {return this.ptr.asSlice(OFFSET__maxDescriptorSetInputAttachments, LAYOUT__maxDescriptorSetInputAttachments);}

    public int maxVertexInputAttributes() {return this.ptr.get(LAYOUT__maxVertexInputAttributes, OFFSET__maxVertexInputAttributes);}
    public void maxVertexInputAttributes(int value) {this.ptr.set(LAYOUT__maxVertexInputAttributes, OFFSET__maxVertexInputAttributes, value);}
    public java.lang.foreign.MemorySegment $maxVertexInputAttributes() {return this.ptr.asSlice(OFFSET__maxVertexInputAttributes, LAYOUT__maxVertexInputAttributes);}

    public int maxVertexInputBindings() {return this.ptr.get(LAYOUT__maxVertexInputBindings, OFFSET__maxVertexInputBindings);}
    public void maxVertexInputBindings(int value) {this.ptr.set(LAYOUT__maxVertexInputBindings, OFFSET__maxVertexInputBindings, value);}
    public java.lang.foreign.MemorySegment $maxVertexInputBindings() {return this.ptr.asSlice(OFFSET__maxVertexInputBindings, LAYOUT__maxVertexInputBindings);}

    public int maxVertexInputAttributeOffset() {return this.ptr.get(LAYOUT__maxVertexInputAttributeOffset, OFFSET__maxVertexInputAttributeOffset);}
    public void maxVertexInputAttributeOffset(int value) {this.ptr.set(LAYOUT__maxVertexInputAttributeOffset, OFFSET__maxVertexInputAttributeOffset, value);}
    public java.lang.foreign.MemorySegment $maxVertexInputAttributeOffset() {return this.ptr.asSlice(OFFSET__maxVertexInputAttributeOffset, LAYOUT__maxVertexInputAttributeOffset);}

    public int maxVertexInputBindingStride() {return this.ptr.get(LAYOUT__maxVertexInputBindingStride, OFFSET__maxVertexInputBindingStride);}
    public void maxVertexInputBindingStride(int value) {this.ptr.set(LAYOUT__maxVertexInputBindingStride, OFFSET__maxVertexInputBindingStride, value);}
    public java.lang.foreign.MemorySegment $maxVertexInputBindingStride() {return this.ptr.asSlice(OFFSET__maxVertexInputBindingStride, LAYOUT__maxVertexInputBindingStride);}

    public int maxVertexOutputComponents() {return this.ptr.get(LAYOUT__maxVertexOutputComponents, OFFSET__maxVertexOutputComponents);}
    public void maxVertexOutputComponents(int value) {this.ptr.set(LAYOUT__maxVertexOutputComponents, OFFSET__maxVertexOutputComponents, value);}
    public java.lang.foreign.MemorySegment $maxVertexOutputComponents() {return this.ptr.asSlice(OFFSET__maxVertexOutputComponents, LAYOUT__maxVertexOutputComponents);}

    public int maxTessellationGenerationLevel() {return this.ptr.get(LAYOUT__maxTessellationGenerationLevel, OFFSET__maxTessellationGenerationLevel);}
    public void maxTessellationGenerationLevel(int value) {this.ptr.set(LAYOUT__maxTessellationGenerationLevel, OFFSET__maxTessellationGenerationLevel, value);}
    public java.lang.foreign.MemorySegment $maxTessellationGenerationLevel() {return this.ptr.asSlice(OFFSET__maxTessellationGenerationLevel, LAYOUT__maxTessellationGenerationLevel);}

    public int maxTessellationPatchSize() {return this.ptr.get(LAYOUT__maxTessellationPatchSize, OFFSET__maxTessellationPatchSize);}
    public void maxTessellationPatchSize(int value) {this.ptr.set(LAYOUT__maxTessellationPatchSize, OFFSET__maxTessellationPatchSize, value);}
    public java.lang.foreign.MemorySegment $maxTessellationPatchSize() {return this.ptr.asSlice(OFFSET__maxTessellationPatchSize, LAYOUT__maxTessellationPatchSize);}

    public int maxTessellationControlPerVertexInputComponents() {return this.ptr.get(LAYOUT__maxTessellationControlPerVertexInputComponents, OFFSET__maxTessellationControlPerVertexInputComponents);}
    public void maxTessellationControlPerVertexInputComponents(int value) {this.ptr.set(LAYOUT__maxTessellationControlPerVertexInputComponents, OFFSET__maxTessellationControlPerVertexInputComponents, value);}
    public java.lang.foreign.MemorySegment $maxTessellationControlPerVertexInputComponents() {return this.ptr.asSlice(OFFSET__maxTessellationControlPerVertexInputComponents, LAYOUT__maxTessellationControlPerVertexInputComponents);}

    public int maxTessellationControlPerVertexOutputComponents() {return this.ptr.get(LAYOUT__maxTessellationControlPerVertexOutputComponents, OFFSET__maxTessellationControlPerVertexOutputComponents);}
    public void maxTessellationControlPerVertexOutputComponents(int value) {this.ptr.set(LAYOUT__maxTessellationControlPerVertexOutputComponents, OFFSET__maxTessellationControlPerVertexOutputComponents, value);}
    public java.lang.foreign.MemorySegment $maxTessellationControlPerVertexOutputComponents() {return this.ptr.asSlice(OFFSET__maxTessellationControlPerVertexOutputComponents, LAYOUT__maxTessellationControlPerVertexOutputComponents);}

    public int maxTessellationControlPerPatchOutputComponents() {return this.ptr.get(LAYOUT__maxTessellationControlPerPatchOutputComponents, OFFSET__maxTessellationControlPerPatchOutputComponents);}
    public void maxTessellationControlPerPatchOutputComponents(int value) {this.ptr.set(LAYOUT__maxTessellationControlPerPatchOutputComponents, OFFSET__maxTessellationControlPerPatchOutputComponents, value);}
    public java.lang.foreign.MemorySegment $maxTessellationControlPerPatchOutputComponents() {return this.ptr.asSlice(OFFSET__maxTessellationControlPerPatchOutputComponents, LAYOUT__maxTessellationControlPerPatchOutputComponents);}

    public int maxTessellationControlTotalOutputComponents() {return this.ptr.get(LAYOUT__maxTessellationControlTotalOutputComponents, OFFSET__maxTessellationControlTotalOutputComponents);}
    public void maxTessellationControlTotalOutputComponents(int value) {this.ptr.set(LAYOUT__maxTessellationControlTotalOutputComponents, OFFSET__maxTessellationControlTotalOutputComponents, value);}
    public java.lang.foreign.MemorySegment $maxTessellationControlTotalOutputComponents() {return this.ptr.asSlice(OFFSET__maxTessellationControlTotalOutputComponents, LAYOUT__maxTessellationControlTotalOutputComponents);}

    public int maxTessellationEvaluationInputComponents() {return this.ptr.get(LAYOUT__maxTessellationEvaluationInputComponents, OFFSET__maxTessellationEvaluationInputComponents);}
    public void maxTessellationEvaluationInputComponents(int value) {this.ptr.set(LAYOUT__maxTessellationEvaluationInputComponents, OFFSET__maxTessellationEvaluationInputComponents, value);}
    public java.lang.foreign.MemorySegment $maxTessellationEvaluationInputComponents() {return this.ptr.asSlice(OFFSET__maxTessellationEvaluationInputComponents, LAYOUT__maxTessellationEvaluationInputComponents);}

    public int maxTessellationEvaluationOutputComponents() {return this.ptr.get(LAYOUT__maxTessellationEvaluationOutputComponents, OFFSET__maxTessellationEvaluationOutputComponents);}
    public void maxTessellationEvaluationOutputComponents(int value) {this.ptr.set(LAYOUT__maxTessellationEvaluationOutputComponents, OFFSET__maxTessellationEvaluationOutputComponents, value);}
    public java.lang.foreign.MemorySegment $maxTessellationEvaluationOutputComponents() {return this.ptr.asSlice(OFFSET__maxTessellationEvaluationOutputComponents, LAYOUT__maxTessellationEvaluationOutputComponents);}

    public int maxGeometryShaderInvocations() {return this.ptr.get(LAYOUT__maxGeometryShaderInvocations, OFFSET__maxGeometryShaderInvocations);}
    public void maxGeometryShaderInvocations(int value) {this.ptr.set(LAYOUT__maxGeometryShaderInvocations, OFFSET__maxGeometryShaderInvocations, value);}
    public java.lang.foreign.MemorySegment $maxGeometryShaderInvocations() {return this.ptr.asSlice(OFFSET__maxGeometryShaderInvocations, LAYOUT__maxGeometryShaderInvocations);}

    public int maxGeometryInputComponents() {return this.ptr.get(LAYOUT__maxGeometryInputComponents, OFFSET__maxGeometryInputComponents);}
    public void maxGeometryInputComponents(int value) {this.ptr.set(LAYOUT__maxGeometryInputComponents, OFFSET__maxGeometryInputComponents, value);}
    public java.lang.foreign.MemorySegment $maxGeometryInputComponents() {return this.ptr.asSlice(OFFSET__maxGeometryInputComponents, LAYOUT__maxGeometryInputComponents);}

    public int maxGeometryOutputComponents() {return this.ptr.get(LAYOUT__maxGeometryOutputComponents, OFFSET__maxGeometryOutputComponents);}
    public void maxGeometryOutputComponents(int value) {this.ptr.set(LAYOUT__maxGeometryOutputComponents, OFFSET__maxGeometryOutputComponents, value);}
    public java.lang.foreign.MemorySegment $maxGeometryOutputComponents() {return this.ptr.asSlice(OFFSET__maxGeometryOutputComponents, LAYOUT__maxGeometryOutputComponents);}

    public int maxGeometryOutputVertices() {return this.ptr.get(LAYOUT__maxGeometryOutputVertices, OFFSET__maxGeometryOutputVertices);}
    public void maxGeometryOutputVertices(int value) {this.ptr.set(LAYOUT__maxGeometryOutputVertices, OFFSET__maxGeometryOutputVertices, value);}
    public java.lang.foreign.MemorySegment $maxGeometryOutputVertices() {return this.ptr.asSlice(OFFSET__maxGeometryOutputVertices, LAYOUT__maxGeometryOutputVertices);}

    public int maxGeometryTotalOutputComponents() {return this.ptr.get(LAYOUT__maxGeometryTotalOutputComponents, OFFSET__maxGeometryTotalOutputComponents);}
    public void maxGeometryTotalOutputComponents(int value) {this.ptr.set(LAYOUT__maxGeometryTotalOutputComponents, OFFSET__maxGeometryTotalOutputComponents, value);}
    public java.lang.foreign.MemorySegment $maxGeometryTotalOutputComponents() {return this.ptr.asSlice(OFFSET__maxGeometryTotalOutputComponents, LAYOUT__maxGeometryTotalOutputComponents);}

    public int maxFragmentInputComponents() {return this.ptr.get(LAYOUT__maxFragmentInputComponents, OFFSET__maxFragmentInputComponents);}
    public void maxFragmentInputComponents(int value) {this.ptr.set(LAYOUT__maxFragmentInputComponents, OFFSET__maxFragmentInputComponents, value);}
    public java.lang.foreign.MemorySegment $maxFragmentInputComponents() {return this.ptr.asSlice(OFFSET__maxFragmentInputComponents, LAYOUT__maxFragmentInputComponents);}

    public int maxFragmentOutputAttachments() {return this.ptr.get(LAYOUT__maxFragmentOutputAttachments, OFFSET__maxFragmentOutputAttachments);}
    public void maxFragmentOutputAttachments(int value) {this.ptr.set(LAYOUT__maxFragmentOutputAttachments, OFFSET__maxFragmentOutputAttachments, value);}
    public java.lang.foreign.MemorySegment $maxFragmentOutputAttachments() {return this.ptr.asSlice(OFFSET__maxFragmentOutputAttachments, LAYOUT__maxFragmentOutputAttachments);}

    public int maxFragmentDualSrcAttachments() {return this.ptr.get(LAYOUT__maxFragmentDualSrcAttachments, OFFSET__maxFragmentDualSrcAttachments);}
    public void maxFragmentDualSrcAttachments(int value) {this.ptr.set(LAYOUT__maxFragmentDualSrcAttachments, OFFSET__maxFragmentDualSrcAttachments, value);}
    public java.lang.foreign.MemorySegment $maxFragmentDualSrcAttachments() {return this.ptr.asSlice(OFFSET__maxFragmentDualSrcAttachments, LAYOUT__maxFragmentDualSrcAttachments);}

    public int maxFragmentCombinedOutputResources() {return this.ptr.get(LAYOUT__maxFragmentCombinedOutputResources, OFFSET__maxFragmentCombinedOutputResources);}
    public void maxFragmentCombinedOutputResources(int value) {this.ptr.set(LAYOUT__maxFragmentCombinedOutputResources, OFFSET__maxFragmentCombinedOutputResources, value);}
    public java.lang.foreign.MemorySegment $maxFragmentCombinedOutputResources() {return this.ptr.asSlice(OFFSET__maxFragmentCombinedOutputResources, LAYOUT__maxFragmentCombinedOutputResources);}

    public int maxComputeSharedMemorySize() {return this.ptr.get(LAYOUT__maxComputeSharedMemorySize, OFFSET__maxComputeSharedMemorySize);}
    public void maxComputeSharedMemorySize(int value) {this.ptr.set(LAYOUT__maxComputeSharedMemorySize, OFFSET__maxComputeSharedMemorySize, value);}
    public java.lang.foreign.MemorySegment $maxComputeSharedMemorySize() {return this.ptr.asSlice(OFFSET__maxComputeSharedMemorySize, LAYOUT__maxComputeSharedMemorySize);}

    public java.lang.foreign.MemorySegment maxComputeWorkGroupCount() {return this.ptr.asSlice(OFFSET__maxComputeWorkGroupCount, LAYOUT__maxComputeWorkGroupCount);}
    public int maxComputeWorkGroupCount(int index) {return this.maxComputeWorkGroupCount().getAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, index);}
    public void maxComputeWorkGroupCount(int index, int value) {this.maxComputeWorkGroupCount().setAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, index, value);}

    public int maxComputeWorkGroupInvocations() {return this.ptr.get(LAYOUT__maxComputeWorkGroupInvocations, OFFSET__maxComputeWorkGroupInvocations);}
    public void maxComputeWorkGroupInvocations(int value) {this.ptr.set(LAYOUT__maxComputeWorkGroupInvocations, OFFSET__maxComputeWorkGroupInvocations, value);}
    public java.lang.foreign.MemorySegment $maxComputeWorkGroupInvocations() {return this.ptr.asSlice(OFFSET__maxComputeWorkGroupInvocations, LAYOUT__maxComputeWorkGroupInvocations);}

    public java.lang.foreign.MemorySegment maxComputeWorkGroupSize() {return this.ptr.asSlice(OFFSET__maxComputeWorkGroupSize, LAYOUT__maxComputeWorkGroupSize);}
    public int maxComputeWorkGroupSize(int index) {return this.maxComputeWorkGroupSize().getAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, index);}
    public void maxComputeWorkGroupSize(int index, int value) {this.maxComputeWorkGroupSize().setAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, index, value);}

    public int subPixelPrecisionBits() {return this.ptr.get(LAYOUT__subPixelPrecisionBits, OFFSET__subPixelPrecisionBits);}
    public void subPixelPrecisionBits(int value) {this.ptr.set(LAYOUT__subPixelPrecisionBits, OFFSET__subPixelPrecisionBits, value);}
    public java.lang.foreign.MemorySegment $subPixelPrecisionBits() {return this.ptr.asSlice(OFFSET__subPixelPrecisionBits, LAYOUT__subPixelPrecisionBits);}

    public int subTexelPrecisionBits() {return this.ptr.get(LAYOUT__subTexelPrecisionBits, OFFSET__subTexelPrecisionBits);}
    public void subTexelPrecisionBits(int value) {this.ptr.set(LAYOUT__subTexelPrecisionBits, OFFSET__subTexelPrecisionBits, value);}
    public java.lang.foreign.MemorySegment $subTexelPrecisionBits() {return this.ptr.asSlice(OFFSET__subTexelPrecisionBits, LAYOUT__subTexelPrecisionBits);}

    public int mipmapPrecisionBits() {return this.ptr.get(LAYOUT__mipmapPrecisionBits, OFFSET__mipmapPrecisionBits);}
    public void mipmapPrecisionBits(int value) {this.ptr.set(LAYOUT__mipmapPrecisionBits, OFFSET__mipmapPrecisionBits, value);}
    public java.lang.foreign.MemorySegment $mipmapPrecisionBits() {return this.ptr.asSlice(OFFSET__mipmapPrecisionBits, LAYOUT__mipmapPrecisionBits);}

    public int maxDrawIndexedIndexValue() {return this.ptr.get(LAYOUT__maxDrawIndexedIndexValue, OFFSET__maxDrawIndexedIndexValue);}
    public void maxDrawIndexedIndexValue(int value) {this.ptr.set(LAYOUT__maxDrawIndexedIndexValue, OFFSET__maxDrawIndexedIndexValue, value);}
    public java.lang.foreign.MemorySegment $maxDrawIndexedIndexValue() {return this.ptr.asSlice(OFFSET__maxDrawIndexedIndexValue, LAYOUT__maxDrawIndexedIndexValue);}

    public int maxDrawIndirectCount() {return this.ptr.get(LAYOUT__maxDrawIndirectCount, OFFSET__maxDrawIndirectCount);}
    public void maxDrawIndirectCount(int value) {this.ptr.set(LAYOUT__maxDrawIndirectCount, OFFSET__maxDrawIndirectCount, value);}
    public java.lang.foreign.MemorySegment $maxDrawIndirectCount() {return this.ptr.asSlice(OFFSET__maxDrawIndirectCount, LAYOUT__maxDrawIndirectCount);}

    public float maxSamplerLodBias() {return this.ptr.get(LAYOUT__maxSamplerLodBias, OFFSET__maxSamplerLodBias);}
    public void maxSamplerLodBias(float value) {this.ptr.set(LAYOUT__maxSamplerLodBias, OFFSET__maxSamplerLodBias, value);}
    public java.lang.foreign.MemorySegment $maxSamplerLodBias() {return this.ptr.asSlice(OFFSET__maxSamplerLodBias, LAYOUT__maxSamplerLodBias);}

    public float maxSamplerAnisotropy() {return this.ptr.get(LAYOUT__maxSamplerAnisotropy, OFFSET__maxSamplerAnisotropy);}
    public void maxSamplerAnisotropy(float value) {this.ptr.set(LAYOUT__maxSamplerAnisotropy, OFFSET__maxSamplerAnisotropy, value);}
    public java.lang.foreign.MemorySegment $maxSamplerAnisotropy() {return this.ptr.asSlice(OFFSET__maxSamplerAnisotropy, LAYOUT__maxSamplerAnisotropy);}

    public int maxViewports() {return this.ptr.get(LAYOUT__maxViewports, OFFSET__maxViewports);}
    public void maxViewports(int value) {this.ptr.set(LAYOUT__maxViewports, OFFSET__maxViewports, value);}
    public java.lang.foreign.MemorySegment $maxViewports() {return this.ptr.asSlice(OFFSET__maxViewports, LAYOUT__maxViewports);}

    public java.lang.foreign.MemorySegment maxViewportDimensions() {return this.ptr.asSlice(OFFSET__maxViewportDimensions, LAYOUT__maxViewportDimensions);}
    public int maxViewportDimensions(int index) {return this.maxViewportDimensions().getAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, index);}
    public void maxViewportDimensions(int index, int value) {this.maxViewportDimensions().setAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, index, value);}

    public java.lang.foreign.MemorySegment viewportBoundsRange() {return this.ptr.asSlice(OFFSET__viewportBoundsRange, LAYOUT__viewportBoundsRange);}
    public float viewportBoundsRange(int index) {return this.viewportBoundsRange().getAtIndex(java.lang.foreign.ValueLayout.JAVA_FLOAT, index);}
    public void viewportBoundsRange(int index, float value) {this.viewportBoundsRange().setAtIndex(java.lang.foreign.ValueLayout.JAVA_FLOAT, index, value);}

    public int viewportSubPixelBits() {return this.ptr.get(LAYOUT__viewportSubPixelBits, OFFSET__viewportSubPixelBits);}
    public void viewportSubPixelBits(int value) {this.ptr.set(LAYOUT__viewportSubPixelBits, OFFSET__viewportSubPixelBits, value);}
    public java.lang.foreign.MemorySegment $viewportSubPixelBits() {return this.ptr.asSlice(OFFSET__viewportSubPixelBits, LAYOUT__viewportSubPixelBits);}

    public long minMemoryMapAlignment() {return this.ptr.get(LAYOUT__minMemoryMapAlignment, OFFSET__minMemoryMapAlignment);}
    public void minMemoryMapAlignment(long value) {this.ptr.set(LAYOUT__minMemoryMapAlignment, OFFSET__minMemoryMapAlignment, value);}
    public java.lang.foreign.MemorySegment $minMemoryMapAlignment() {return this.ptr.asSlice(OFFSET__minMemoryMapAlignment, LAYOUT__minMemoryMapAlignment);}

    public long minTexelBufferOffsetAlignment() {return this.ptr.get(LAYOUT__minTexelBufferOffsetAlignment, OFFSET__minTexelBufferOffsetAlignment);}
    public void minTexelBufferOffsetAlignment(long value) {this.ptr.set(LAYOUT__minTexelBufferOffsetAlignment, OFFSET__minTexelBufferOffsetAlignment, value);}
    public java.lang.foreign.MemorySegment $minTexelBufferOffsetAlignment() {return this.ptr.asSlice(OFFSET__minTexelBufferOffsetAlignment, LAYOUT__minTexelBufferOffsetAlignment);}

    public long minUniformBufferOffsetAlignment() {return this.ptr.get(LAYOUT__minUniformBufferOffsetAlignment, OFFSET__minUniformBufferOffsetAlignment);}
    public void minUniformBufferOffsetAlignment(long value) {this.ptr.set(LAYOUT__minUniformBufferOffsetAlignment, OFFSET__minUniformBufferOffsetAlignment, value);}
    public java.lang.foreign.MemorySegment $minUniformBufferOffsetAlignment() {return this.ptr.asSlice(OFFSET__minUniformBufferOffsetAlignment, LAYOUT__minUniformBufferOffsetAlignment);}

    public long minStorageBufferOffsetAlignment() {return this.ptr.get(LAYOUT__minStorageBufferOffsetAlignment, OFFSET__minStorageBufferOffsetAlignment);}
    public void minStorageBufferOffsetAlignment(long value) {this.ptr.set(LAYOUT__minStorageBufferOffsetAlignment, OFFSET__minStorageBufferOffsetAlignment, value);}
    public java.lang.foreign.MemorySegment $minStorageBufferOffsetAlignment() {return this.ptr.asSlice(OFFSET__minStorageBufferOffsetAlignment, LAYOUT__minStorageBufferOffsetAlignment);}

    public int minTexelOffset() {return this.ptr.get(LAYOUT__minTexelOffset, OFFSET__minTexelOffset);}
    public void minTexelOffset(int value) {this.ptr.set(LAYOUT__minTexelOffset, OFFSET__minTexelOffset, value);}
    public java.lang.foreign.MemorySegment $minTexelOffset() {return this.ptr.asSlice(OFFSET__minTexelOffset, LAYOUT__minTexelOffset);}

    public int maxTexelOffset() {return this.ptr.get(LAYOUT__maxTexelOffset, OFFSET__maxTexelOffset);}
    public void maxTexelOffset(int value) {this.ptr.set(LAYOUT__maxTexelOffset, OFFSET__maxTexelOffset, value);}
    public java.lang.foreign.MemorySegment $maxTexelOffset() {return this.ptr.asSlice(OFFSET__maxTexelOffset, LAYOUT__maxTexelOffset);}

    public int minTexelGatherOffset() {return this.ptr.get(LAYOUT__minTexelGatherOffset, OFFSET__minTexelGatherOffset);}
    public void minTexelGatherOffset(int value) {this.ptr.set(LAYOUT__minTexelGatherOffset, OFFSET__minTexelGatherOffset, value);}
    public java.lang.foreign.MemorySegment $minTexelGatherOffset() {return this.ptr.asSlice(OFFSET__minTexelGatherOffset, LAYOUT__minTexelGatherOffset);}

    public int maxTexelGatherOffset() {return this.ptr.get(LAYOUT__maxTexelGatherOffset, OFFSET__maxTexelGatherOffset);}
    public void maxTexelGatherOffset(int value) {this.ptr.set(LAYOUT__maxTexelGatherOffset, OFFSET__maxTexelGatherOffset, value);}
    public java.lang.foreign.MemorySegment $maxTexelGatherOffset() {return this.ptr.asSlice(OFFSET__maxTexelGatherOffset, LAYOUT__maxTexelGatherOffset);}

    public float minInterpolationOffset() {return this.ptr.get(LAYOUT__minInterpolationOffset, OFFSET__minInterpolationOffset);}
    public void minInterpolationOffset(float value) {this.ptr.set(LAYOUT__minInterpolationOffset, OFFSET__minInterpolationOffset, value);}
    public java.lang.foreign.MemorySegment $minInterpolationOffset() {return this.ptr.asSlice(OFFSET__minInterpolationOffset, LAYOUT__minInterpolationOffset);}

    public float maxInterpolationOffset() {return this.ptr.get(LAYOUT__maxInterpolationOffset, OFFSET__maxInterpolationOffset);}
    public void maxInterpolationOffset(float value) {this.ptr.set(LAYOUT__maxInterpolationOffset, OFFSET__maxInterpolationOffset, value);}
    public java.lang.foreign.MemorySegment $maxInterpolationOffset() {return this.ptr.asSlice(OFFSET__maxInterpolationOffset, LAYOUT__maxInterpolationOffset);}

    public int subPixelInterpolationOffsetBits() {return this.ptr.get(LAYOUT__subPixelInterpolationOffsetBits, OFFSET__subPixelInterpolationOffsetBits);}
    public void subPixelInterpolationOffsetBits(int value) {this.ptr.set(LAYOUT__subPixelInterpolationOffsetBits, OFFSET__subPixelInterpolationOffsetBits, value);}
    public java.lang.foreign.MemorySegment $subPixelInterpolationOffsetBits() {return this.ptr.asSlice(OFFSET__subPixelInterpolationOffsetBits, LAYOUT__subPixelInterpolationOffsetBits);}

    public int maxFramebufferWidth() {return this.ptr.get(LAYOUT__maxFramebufferWidth, OFFSET__maxFramebufferWidth);}
    public void maxFramebufferWidth(int value) {this.ptr.set(LAYOUT__maxFramebufferWidth, OFFSET__maxFramebufferWidth, value);}
    public java.lang.foreign.MemorySegment $maxFramebufferWidth() {return this.ptr.asSlice(OFFSET__maxFramebufferWidth, LAYOUT__maxFramebufferWidth);}

    public int maxFramebufferHeight() {return this.ptr.get(LAYOUT__maxFramebufferHeight, OFFSET__maxFramebufferHeight);}
    public void maxFramebufferHeight(int value) {this.ptr.set(LAYOUT__maxFramebufferHeight, OFFSET__maxFramebufferHeight, value);}
    public java.lang.foreign.MemorySegment $maxFramebufferHeight() {return this.ptr.asSlice(OFFSET__maxFramebufferHeight, LAYOUT__maxFramebufferHeight);}

    public int maxFramebufferLayers() {return this.ptr.get(LAYOUT__maxFramebufferLayers, OFFSET__maxFramebufferLayers);}
    public void maxFramebufferLayers(int value) {this.ptr.set(LAYOUT__maxFramebufferLayers, OFFSET__maxFramebufferLayers, value);}
    public java.lang.foreign.MemorySegment $maxFramebufferLayers() {return this.ptr.asSlice(OFFSET__maxFramebufferLayers, LAYOUT__maxFramebufferLayers);}

    public int framebufferColorSampleCounts() {return this.ptr.get(LAYOUT__framebufferColorSampleCounts, OFFSET__framebufferColorSampleCounts);}
    public void framebufferColorSampleCounts(int value) {this.ptr.set(LAYOUT__framebufferColorSampleCounts, OFFSET__framebufferColorSampleCounts, value);}
    public java.lang.foreign.MemorySegment $framebufferColorSampleCounts() {return this.ptr.asSlice(OFFSET__framebufferColorSampleCounts, LAYOUT__framebufferColorSampleCounts);}

    public int framebufferDepthSampleCounts() {return this.ptr.get(LAYOUT__framebufferDepthSampleCounts, OFFSET__framebufferDepthSampleCounts);}
    public void framebufferDepthSampleCounts(int value) {this.ptr.set(LAYOUT__framebufferDepthSampleCounts, OFFSET__framebufferDepthSampleCounts, value);}
    public java.lang.foreign.MemorySegment $framebufferDepthSampleCounts() {return this.ptr.asSlice(OFFSET__framebufferDepthSampleCounts, LAYOUT__framebufferDepthSampleCounts);}

    public int framebufferStencilSampleCounts() {return this.ptr.get(LAYOUT__framebufferStencilSampleCounts, OFFSET__framebufferStencilSampleCounts);}
    public void framebufferStencilSampleCounts(int value) {this.ptr.set(LAYOUT__framebufferStencilSampleCounts, OFFSET__framebufferStencilSampleCounts, value);}
    public java.lang.foreign.MemorySegment $framebufferStencilSampleCounts() {return this.ptr.asSlice(OFFSET__framebufferStencilSampleCounts, LAYOUT__framebufferStencilSampleCounts);}

    public int framebufferNoAttachmentsSampleCounts() {return this.ptr.get(LAYOUT__framebufferNoAttachmentsSampleCounts, OFFSET__framebufferNoAttachmentsSampleCounts);}
    public void framebufferNoAttachmentsSampleCounts(int value) {this.ptr.set(LAYOUT__framebufferNoAttachmentsSampleCounts, OFFSET__framebufferNoAttachmentsSampleCounts, value);}
    public java.lang.foreign.MemorySegment $framebufferNoAttachmentsSampleCounts() {return this.ptr.asSlice(OFFSET__framebufferNoAttachmentsSampleCounts, LAYOUT__framebufferNoAttachmentsSampleCounts);}

    public int maxColorAttachments() {return this.ptr.get(LAYOUT__maxColorAttachments, OFFSET__maxColorAttachments);}
    public void maxColorAttachments(int value) {this.ptr.set(LAYOUT__maxColorAttachments, OFFSET__maxColorAttachments, value);}
    public java.lang.foreign.MemorySegment $maxColorAttachments() {return this.ptr.asSlice(OFFSET__maxColorAttachments, LAYOUT__maxColorAttachments);}

    public int sampledImageColorSampleCounts() {return this.ptr.get(LAYOUT__sampledImageColorSampleCounts, OFFSET__sampledImageColorSampleCounts);}
    public void sampledImageColorSampleCounts(int value) {this.ptr.set(LAYOUT__sampledImageColorSampleCounts, OFFSET__sampledImageColorSampleCounts, value);}
    public java.lang.foreign.MemorySegment $sampledImageColorSampleCounts() {return this.ptr.asSlice(OFFSET__sampledImageColorSampleCounts, LAYOUT__sampledImageColorSampleCounts);}

    public int sampledImageIntegerSampleCounts() {return this.ptr.get(LAYOUT__sampledImageIntegerSampleCounts, OFFSET__sampledImageIntegerSampleCounts);}
    public void sampledImageIntegerSampleCounts(int value) {this.ptr.set(LAYOUT__sampledImageIntegerSampleCounts, OFFSET__sampledImageIntegerSampleCounts, value);}
    public java.lang.foreign.MemorySegment $sampledImageIntegerSampleCounts() {return this.ptr.asSlice(OFFSET__sampledImageIntegerSampleCounts, LAYOUT__sampledImageIntegerSampleCounts);}

    public int sampledImageDepthSampleCounts() {return this.ptr.get(LAYOUT__sampledImageDepthSampleCounts, OFFSET__sampledImageDepthSampleCounts);}
    public void sampledImageDepthSampleCounts(int value) {this.ptr.set(LAYOUT__sampledImageDepthSampleCounts, OFFSET__sampledImageDepthSampleCounts, value);}
    public java.lang.foreign.MemorySegment $sampledImageDepthSampleCounts() {return this.ptr.asSlice(OFFSET__sampledImageDepthSampleCounts, LAYOUT__sampledImageDepthSampleCounts);}

    public int sampledImageStencilSampleCounts() {return this.ptr.get(LAYOUT__sampledImageStencilSampleCounts, OFFSET__sampledImageStencilSampleCounts);}
    public void sampledImageStencilSampleCounts(int value) {this.ptr.set(LAYOUT__sampledImageStencilSampleCounts, OFFSET__sampledImageStencilSampleCounts, value);}
    public java.lang.foreign.MemorySegment $sampledImageStencilSampleCounts() {return this.ptr.asSlice(OFFSET__sampledImageStencilSampleCounts, LAYOUT__sampledImageStencilSampleCounts);}

    public int storageImageSampleCounts() {return this.ptr.get(LAYOUT__storageImageSampleCounts, OFFSET__storageImageSampleCounts);}
    public void storageImageSampleCounts(int value) {this.ptr.set(LAYOUT__storageImageSampleCounts, OFFSET__storageImageSampleCounts, value);}
    public java.lang.foreign.MemorySegment $storageImageSampleCounts() {return this.ptr.asSlice(OFFSET__storageImageSampleCounts, LAYOUT__storageImageSampleCounts);}

    public int maxSampleMaskWords() {return this.ptr.get(LAYOUT__maxSampleMaskWords, OFFSET__maxSampleMaskWords);}
    public void maxSampleMaskWords(int value) {this.ptr.set(LAYOUT__maxSampleMaskWords, OFFSET__maxSampleMaskWords, value);}
    public java.lang.foreign.MemorySegment $maxSampleMaskWords() {return this.ptr.asSlice(OFFSET__maxSampleMaskWords, LAYOUT__maxSampleMaskWords);}

    public int timestampComputeAndGraphics() {return this.ptr.get(LAYOUT__timestampComputeAndGraphics, OFFSET__timestampComputeAndGraphics);}
    public void timestampComputeAndGraphics(int value) {this.ptr.set(LAYOUT__timestampComputeAndGraphics, OFFSET__timestampComputeAndGraphics, value);}
    public java.lang.foreign.MemorySegment $timestampComputeAndGraphics() {return this.ptr.asSlice(OFFSET__timestampComputeAndGraphics, LAYOUT__timestampComputeAndGraphics);}

    public float timestampPeriod() {return this.ptr.get(LAYOUT__timestampPeriod, OFFSET__timestampPeriod);}
    public void timestampPeriod(float value) {this.ptr.set(LAYOUT__timestampPeriod, OFFSET__timestampPeriod, value);}
    public java.lang.foreign.MemorySegment $timestampPeriod() {return this.ptr.asSlice(OFFSET__timestampPeriod, LAYOUT__timestampPeriod);}

    public int maxClipDistances() {return this.ptr.get(LAYOUT__maxClipDistances, OFFSET__maxClipDistances);}
    public void maxClipDistances(int value) {this.ptr.set(LAYOUT__maxClipDistances, OFFSET__maxClipDistances, value);}
    public java.lang.foreign.MemorySegment $maxClipDistances() {return this.ptr.asSlice(OFFSET__maxClipDistances, LAYOUT__maxClipDistances);}

    public int maxCullDistances() {return this.ptr.get(LAYOUT__maxCullDistances, OFFSET__maxCullDistances);}
    public void maxCullDistances(int value) {this.ptr.set(LAYOUT__maxCullDistances, OFFSET__maxCullDistances, value);}
    public java.lang.foreign.MemorySegment $maxCullDistances() {return this.ptr.asSlice(OFFSET__maxCullDistances, LAYOUT__maxCullDistances);}

    public int maxCombinedClipAndCullDistances() {return this.ptr.get(LAYOUT__maxCombinedClipAndCullDistances, OFFSET__maxCombinedClipAndCullDistances);}
    public void maxCombinedClipAndCullDistances(int value) {this.ptr.set(LAYOUT__maxCombinedClipAndCullDistances, OFFSET__maxCombinedClipAndCullDistances, value);}
    public java.lang.foreign.MemorySegment $maxCombinedClipAndCullDistances() {return this.ptr.asSlice(OFFSET__maxCombinedClipAndCullDistances, LAYOUT__maxCombinedClipAndCullDistances);}

    public int discreteQueuePriorities() {return this.ptr.get(LAYOUT__discreteQueuePriorities, OFFSET__discreteQueuePriorities);}
    public void discreteQueuePriorities(int value) {this.ptr.set(LAYOUT__discreteQueuePriorities, OFFSET__discreteQueuePriorities, value);}
    public java.lang.foreign.MemorySegment $discreteQueuePriorities() {return this.ptr.asSlice(OFFSET__discreteQueuePriorities, LAYOUT__discreteQueuePriorities);}

    public java.lang.foreign.MemorySegment pointSizeRange() {return this.ptr.asSlice(OFFSET__pointSizeRange, LAYOUT__pointSizeRange);}
    public float pointSizeRange(int index) {return this.pointSizeRange().getAtIndex(java.lang.foreign.ValueLayout.JAVA_FLOAT, index);}
    public void pointSizeRange(int index, float value) {this.pointSizeRange().setAtIndex(java.lang.foreign.ValueLayout.JAVA_FLOAT, index, value);}

    public java.lang.foreign.MemorySegment lineWidthRange() {return this.ptr.asSlice(OFFSET__lineWidthRange, LAYOUT__lineWidthRange);}
    public float lineWidthRange(int index) {return this.lineWidthRange().getAtIndex(java.lang.foreign.ValueLayout.JAVA_FLOAT, index);}
    public void lineWidthRange(int index, float value) {this.lineWidthRange().setAtIndex(java.lang.foreign.ValueLayout.JAVA_FLOAT, index, value);}

    public float pointSizeGranularity() {return this.ptr.get(LAYOUT__pointSizeGranularity, OFFSET__pointSizeGranularity);}
    public void pointSizeGranularity(float value) {this.ptr.set(LAYOUT__pointSizeGranularity, OFFSET__pointSizeGranularity, value);}
    public java.lang.foreign.MemorySegment $pointSizeGranularity() {return this.ptr.asSlice(OFFSET__pointSizeGranularity, LAYOUT__pointSizeGranularity);}

    public float lineWidthGranularity() {return this.ptr.get(LAYOUT__lineWidthGranularity, OFFSET__lineWidthGranularity);}
    public void lineWidthGranularity(float value) {this.ptr.set(LAYOUT__lineWidthGranularity, OFFSET__lineWidthGranularity, value);}
    public java.lang.foreign.MemorySegment $lineWidthGranularity() {return this.ptr.asSlice(OFFSET__lineWidthGranularity, LAYOUT__lineWidthGranularity);}

    public int strictLines() {return this.ptr.get(LAYOUT__strictLines, OFFSET__strictLines);}
    public void strictLines(int value) {this.ptr.set(LAYOUT__strictLines, OFFSET__strictLines, value);}
    public java.lang.foreign.MemorySegment $strictLines() {return this.ptr.asSlice(OFFSET__strictLines, LAYOUT__strictLines);}

    public int standardSampleLocations() {return this.ptr.get(LAYOUT__standardSampleLocations, OFFSET__standardSampleLocations);}
    public void standardSampleLocations(int value) {this.ptr.set(LAYOUT__standardSampleLocations, OFFSET__standardSampleLocations, value);}
    public java.lang.foreign.MemorySegment $standardSampleLocations() {return this.ptr.asSlice(OFFSET__standardSampleLocations, LAYOUT__standardSampleLocations);}

    public long optimalBufferCopyOffsetAlignment() {return this.ptr.get(LAYOUT__optimalBufferCopyOffsetAlignment, OFFSET__optimalBufferCopyOffsetAlignment);}
    public void optimalBufferCopyOffsetAlignment(long value) {this.ptr.set(LAYOUT__optimalBufferCopyOffsetAlignment, OFFSET__optimalBufferCopyOffsetAlignment, value);}
    public java.lang.foreign.MemorySegment $optimalBufferCopyOffsetAlignment() {return this.ptr.asSlice(OFFSET__optimalBufferCopyOffsetAlignment, LAYOUT__optimalBufferCopyOffsetAlignment);}

    public long optimalBufferCopyRowPitchAlignment() {return this.ptr.get(LAYOUT__optimalBufferCopyRowPitchAlignment, OFFSET__optimalBufferCopyRowPitchAlignment);}
    public void optimalBufferCopyRowPitchAlignment(long value) {this.ptr.set(LAYOUT__optimalBufferCopyRowPitchAlignment, OFFSET__optimalBufferCopyRowPitchAlignment, value);}
    public java.lang.foreign.MemorySegment $optimalBufferCopyRowPitchAlignment() {return this.ptr.asSlice(OFFSET__optimalBufferCopyRowPitchAlignment, LAYOUT__optimalBufferCopyRowPitchAlignment);}

    public long nonCoherentAtomSize() {return this.ptr.get(LAYOUT__nonCoherentAtomSize, OFFSET__nonCoherentAtomSize);}
    public void nonCoherentAtomSize(long value) {this.ptr.set(LAYOUT__nonCoherentAtomSize, OFFSET__nonCoherentAtomSize, value);}
    public java.lang.foreign.MemorySegment $nonCoherentAtomSize() {return this.ptr.asSlice(OFFSET__nonCoherentAtomSize, LAYOUT__nonCoherentAtomSize);}
}
