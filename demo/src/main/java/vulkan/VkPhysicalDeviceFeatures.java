package vulkan;

public record VkPhysicalDeviceFeatures(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__robustBufferAccess = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__robustBufferAccess = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__fullDrawIndexUint32 = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__fullDrawIndexUint32 = 4;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__imageCubeArray = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__imageCubeArray = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__independentBlend = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__independentBlend = 12;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__geometryShader = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__geometryShader = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__tessellationShader = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__tessellationShader = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sampleRateShading = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sampleRateShading = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__dualSrcBlend = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__dualSrcBlend = 28;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__logicOp = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__logicOp = 32;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__multiDrawIndirect = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__multiDrawIndirect = 36;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__drawIndirectFirstInstance = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__drawIndirectFirstInstance = 40;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__depthClamp = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__depthClamp = 44;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__depthBiasClamp = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__depthBiasClamp = 48;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__fillModeNonSolid = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__fillModeNonSolid = 52;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__depthBounds = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__depthBounds = 56;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__wideLines = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__wideLines = 60;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__largePoints = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__largePoints = 64;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__alphaToOne = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__alphaToOne = 68;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__multiViewport = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__multiViewport = 72;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__samplerAnisotropy = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__samplerAnisotropy = 76;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__textureCompressionETC2 = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__textureCompressionETC2 = 80;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__textureCompressionASTC_LDR = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__textureCompressionASTC_LDR = 84;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__textureCompressionBC = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__textureCompressionBC = 88;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__occlusionQueryPrecise = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__occlusionQueryPrecise = 92;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__pipelineStatisticsQuery = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__pipelineStatisticsQuery = 96;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__vertexPipelineStoresAndAtomics = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__vertexPipelineStoresAndAtomics = 100;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__fragmentStoresAndAtomics = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__fragmentStoresAndAtomics = 104;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderTessellationAndGeometryPointSize = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__shaderTessellationAndGeometryPointSize = 108;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderImageGatherExtended = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__shaderImageGatherExtended = 112;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderStorageImageExtendedFormats = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__shaderStorageImageExtendedFormats = 116;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderStorageImageMultisample = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__shaderStorageImageMultisample = 120;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderStorageImageReadWithoutFormat = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__shaderStorageImageReadWithoutFormat = 124;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderStorageImageWriteWithoutFormat = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__shaderStorageImageWriteWithoutFormat = 128;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderUniformBufferArrayDynamicIndexing = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__shaderUniformBufferArrayDynamicIndexing = 132;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderSampledImageArrayDynamicIndexing = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__shaderSampledImageArrayDynamicIndexing = 136;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderStorageBufferArrayDynamicIndexing = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__shaderStorageBufferArrayDynamicIndexing = 140;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderStorageImageArrayDynamicIndexing = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__shaderStorageImageArrayDynamicIndexing = 144;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderClipDistance = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__shaderClipDistance = 148;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderCullDistance = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__shaderCullDistance = 152;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderFloat64 = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__shaderFloat64 = 156;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderInt64 = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__shaderInt64 = 160;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderInt16 = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__shaderInt16 = 164;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderResourceResidency = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__shaderResourceResidency = 168;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderResourceMinLod = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__shaderResourceMinLod = 172;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sparseBinding = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sparseBinding = 176;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sparseResidencyBuffer = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sparseResidencyBuffer = 180;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sparseResidencyImage2D = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sparseResidencyImage2D = 184;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sparseResidencyImage3D = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sparseResidencyImage3D = 188;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sparseResidency2Samples = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sparseResidency2Samples = 192;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sparseResidency4Samples = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sparseResidency4Samples = 196;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sparseResidency8Samples = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sparseResidency8Samples = 200;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sparseResidency16Samples = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sparseResidency16Samples = 204;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sparseResidencyAliased = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sparseResidencyAliased = 208;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__variableMultisampleRate = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__variableMultisampleRate = 212;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__inheritedQueries = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__inheritedQueries = 216;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__robustBufferAccess,
            LAYOUT__fullDrawIndexUint32,
            LAYOUT__imageCubeArray,
            LAYOUT__independentBlend,
            LAYOUT__geometryShader,
            LAYOUT__tessellationShader,
            LAYOUT__sampleRateShading,
            LAYOUT__dualSrcBlend,
            LAYOUT__logicOp,
            LAYOUT__multiDrawIndirect,
            LAYOUT__drawIndirectFirstInstance,
            LAYOUT__depthClamp,
            LAYOUT__depthBiasClamp,
            LAYOUT__fillModeNonSolid,
            LAYOUT__depthBounds,
            LAYOUT__wideLines,
            LAYOUT__largePoints,
            LAYOUT__alphaToOne,
            LAYOUT__multiViewport,
            LAYOUT__samplerAnisotropy,
            LAYOUT__textureCompressionETC2,
            LAYOUT__textureCompressionASTC_LDR,
            LAYOUT__textureCompressionBC,
            LAYOUT__occlusionQueryPrecise,
            LAYOUT__pipelineStatisticsQuery,
            LAYOUT__vertexPipelineStoresAndAtomics,
            LAYOUT__fragmentStoresAndAtomics,
            LAYOUT__shaderTessellationAndGeometryPointSize,
            LAYOUT__shaderImageGatherExtended,
            LAYOUT__shaderStorageImageExtendedFormats,
            LAYOUT__shaderStorageImageMultisample,
            LAYOUT__shaderStorageImageReadWithoutFormat,
            LAYOUT__shaderStorageImageWriteWithoutFormat,
            LAYOUT__shaderUniformBufferArrayDynamicIndexing,
            LAYOUT__shaderSampledImageArrayDynamicIndexing,
            LAYOUT__shaderStorageBufferArrayDynamicIndexing,
            LAYOUT__shaderStorageImageArrayDynamicIndexing,
            LAYOUT__shaderClipDistance,
            LAYOUT__shaderCullDistance,
            LAYOUT__shaderFloat64,
            LAYOUT__shaderInt64,
            LAYOUT__shaderInt16,
            LAYOUT__shaderResourceResidency,
            LAYOUT__shaderResourceMinLod,
            LAYOUT__sparseBinding,
            LAYOUT__sparseResidencyBuffer,
            LAYOUT__sparseResidencyImage2D,
            LAYOUT__sparseResidencyImage3D,
            LAYOUT__sparseResidency2Samples,
            LAYOUT__sparseResidency4Samples,
            LAYOUT__sparseResidency8Samples,
            LAYOUT__sparseResidency16Samples,
            LAYOUT__sparseResidencyAliased,
            LAYOUT__variableMultisampleRate,
            LAYOUT__inheritedQueries
    ).withByteAlignment(4).withName("VkPhysicalDeviceFeatures");

    public VkPhysicalDeviceFeatures(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceFeatures getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceFeatures(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceFeatures value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int robustBufferAccess() {return this.ptr.get(LAYOUT__robustBufferAccess, OFFSET__robustBufferAccess);}
    public void robustBufferAccess(int value) {this.ptr.set(LAYOUT__robustBufferAccess, OFFSET__robustBufferAccess, value);}
    public java.lang.foreign.MemorySegment $robustBufferAccess() {return this.ptr.asSlice(OFFSET__robustBufferAccess, LAYOUT__robustBufferAccess);}

    public int fullDrawIndexUint32() {return this.ptr.get(LAYOUT__fullDrawIndexUint32, OFFSET__fullDrawIndexUint32);}
    public void fullDrawIndexUint32(int value) {this.ptr.set(LAYOUT__fullDrawIndexUint32, OFFSET__fullDrawIndexUint32, value);}
    public java.lang.foreign.MemorySegment $fullDrawIndexUint32() {return this.ptr.asSlice(OFFSET__fullDrawIndexUint32, LAYOUT__fullDrawIndexUint32);}

    public int imageCubeArray() {return this.ptr.get(LAYOUT__imageCubeArray, OFFSET__imageCubeArray);}
    public void imageCubeArray(int value) {this.ptr.set(LAYOUT__imageCubeArray, OFFSET__imageCubeArray, value);}
    public java.lang.foreign.MemorySegment $imageCubeArray() {return this.ptr.asSlice(OFFSET__imageCubeArray, LAYOUT__imageCubeArray);}

    public int independentBlend() {return this.ptr.get(LAYOUT__independentBlend, OFFSET__independentBlend);}
    public void independentBlend(int value) {this.ptr.set(LAYOUT__independentBlend, OFFSET__independentBlend, value);}
    public java.lang.foreign.MemorySegment $independentBlend() {return this.ptr.asSlice(OFFSET__independentBlend, LAYOUT__independentBlend);}

    public int geometryShader() {return this.ptr.get(LAYOUT__geometryShader, OFFSET__geometryShader);}
    public void geometryShader(int value) {this.ptr.set(LAYOUT__geometryShader, OFFSET__geometryShader, value);}
    public java.lang.foreign.MemorySegment $geometryShader() {return this.ptr.asSlice(OFFSET__geometryShader, LAYOUT__geometryShader);}

    public int tessellationShader() {return this.ptr.get(LAYOUT__tessellationShader, OFFSET__tessellationShader);}
    public void tessellationShader(int value) {this.ptr.set(LAYOUT__tessellationShader, OFFSET__tessellationShader, value);}
    public java.lang.foreign.MemorySegment $tessellationShader() {return this.ptr.asSlice(OFFSET__tessellationShader, LAYOUT__tessellationShader);}

    public int sampleRateShading() {return this.ptr.get(LAYOUT__sampleRateShading, OFFSET__sampleRateShading);}
    public void sampleRateShading(int value) {this.ptr.set(LAYOUT__sampleRateShading, OFFSET__sampleRateShading, value);}
    public java.lang.foreign.MemorySegment $sampleRateShading() {return this.ptr.asSlice(OFFSET__sampleRateShading, LAYOUT__sampleRateShading);}

    public int dualSrcBlend() {return this.ptr.get(LAYOUT__dualSrcBlend, OFFSET__dualSrcBlend);}
    public void dualSrcBlend(int value) {this.ptr.set(LAYOUT__dualSrcBlend, OFFSET__dualSrcBlend, value);}
    public java.lang.foreign.MemorySegment $dualSrcBlend() {return this.ptr.asSlice(OFFSET__dualSrcBlend, LAYOUT__dualSrcBlend);}

    public int logicOp() {return this.ptr.get(LAYOUT__logicOp, OFFSET__logicOp);}
    public void logicOp(int value) {this.ptr.set(LAYOUT__logicOp, OFFSET__logicOp, value);}
    public java.lang.foreign.MemorySegment $logicOp() {return this.ptr.asSlice(OFFSET__logicOp, LAYOUT__logicOp);}

    public int multiDrawIndirect() {return this.ptr.get(LAYOUT__multiDrawIndirect, OFFSET__multiDrawIndirect);}
    public void multiDrawIndirect(int value) {this.ptr.set(LAYOUT__multiDrawIndirect, OFFSET__multiDrawIndirect, value);}
    public java.lang.foreign.MemorySegment $multiDrawIndirect() {return this.ptr.asSlice(OFFSET__multiDrawIndirect, LAYOUT__multiDrawIndirect);}

    public int drawIndirectFirstInstance() {return this.ptr.get(LAYOUT__drawIndirectFirstInstance, OFFSET__drawIndirectFirstInstance);}
    public void drawIndirectFirstInstance(int value) {this.ptr.set(LAYOUT__drawIndirectFirstInstance, OFFSET__drawIndirectFirstInstance, value);}
    public java.lang.foreign.MemorySegment $drawIndirectFirstInstance() {return this.ptr.asSlice(OFFSET__drawIndirectFirstInstance, LAYOUT__drawIndirectFirstInstance);}

    public int depthClamp() {return this.ptr.get(LAYOUT__depthClamp, OFFSET__depthClamp);}
    public void depthClamp(int value) {this.ptr.set(LAYOUT__depthClamp, OFFSET__depthClamp, value);}
    public java.lang.foreign.MemorySegment $depthClamp() {return this.ptr.asSlice(OFFSET__depthClamp, LAYOUT__depthClamp);}

    public int depthBiasClamp() {return this.ptr.get(LAYOUT__depthBiasClamp, OFFSET__depthBiasClamp);}
    public void depthBiasClamp(int value) {this.ptr.set(LAYOUT__depthBiasClamp, OFFSET__depthBiasClamp, value);}
    public java.lang.foreign.MemorySegment $depthBiasClamp() {return this.ptr.asSlice(OFFSET__depthBiasClamp, LAYOUT__depthBiasClamp);}

    public int fillModeNonSolid() {return this.ptr.get(LAYOUT__fillModeNonSolid, OFFSET__fillModeNonSolid);}
    public void fillModeNonSolid(int value) {this.ptr.set(LAYOUT__fillModeNonSolid, OFFSET__fillModeNonSolid, value);}
    public java.lang.foreign.MemorySegment $fillModeNonSolid() {return this.ptr.asSlice(OFFSET__fillModeNonSolid, LAYOUT__fillModeNonSolid);}

    public int depthBounds() {return this.ptr.get(LAYOUT__depthBounds, OFFSET__depthBounds);}
    public void depthBounds(int value) {this.ptr.set(LAYOUT__depthBounds, OFFSET__depthBounds, value);}
    public java.lang.foreign.MemorySegment $depthBounds() {return this.ptr.asSlice(OFFSET__depthBounds, LAYOUT__depthBounds);}

    public int wideLines() {return this.ptr.get(LAYOUT__wideLines, OFFSET__wideLines);}
    public void wideLines(int value) {this.ptr.set(LAYOUT__wideLines, OFFSET__wideLines, value);}
    public java.lang.foreign.MemorySegment $wideLines() {return this.ptr.asSlice(OFFSET__wideLines, LAYOUT__wideLines);}

    public int largePoints() {return this.ptr.get(LAYOUT__largePoints, OFFSET__largePoints);}
    public void largePoints(int value) {this.ptr.set(LAYOUT__largePoints, OFFSET__largePoints, value);}
    public java.lang.foreign.MemorySegment $largePoints() {return this.ptr.asSlice(OFFSET__largePoints, LAYOUT__largePoints);}

    public int alphaToOne() {return this.ptr.get(LAYOUT__alphaToOne, OFFSET__alphaToOne);}
    public void alphaToOne(int value) {this.ptr.set(LAYOUT__alphaToOne, OFFSET__alphaToOne, value);}
    public java.lang.foreign.MemorySegment $alphaToOne() {return this.ptr.asSlice(OFFSET__alphaToOne, LAYOUT__alphaToOne);}

    public int multiViewport() {return this.ptr.get(LAYOUT__multiViewport, OFFSET__multiViewport);}
    public void multiViewport(int value) {this.ptr.set(LAYOUT__multiViewport, OFFSET__multiViewport, value);}
    public java.lang.foreign.MemorySegment $multiViewport() {return this.ptr.asSlice(OFFSET__multiViewport, LAYOUT__multiViewport);}

    public int samplerAnisotropy() {return this.ptr.get(LAYOUT__samplerAnisotropy, OFFSET__samplerAnisotropy);}
    public void samplerAnisotropy(int value) {this.ptr.set(LAYOUT__samplerAnisotropy, OFFSET__samplerAnisotropy, value);}
    public java.lang.foreign.MemorySegment $samplerAnisotropy() {return this.ptr.asSlice(OFFSET__samplerAnisotropy, LAYOUT__samplerAnisotropy);}

    public int textureCompressionETC2() {return this.ptr.get(LAYOUT__textureCompressionETC2, OFFSET__textureCompressionETC2);}
    public void textureCompressionETC2(int value) {this.ptr.set(LAYOUT__textureCompressionETC2, OFFSET__textureCompressionETC2, value);}
    public java.lang.foreign.MemorySegment $textureCompressionETC2() {return this.ptr.asSlice(OFFSET__textureCompressionETC2, LAYOUT__textureCompressionETC2);}

    public int textureCompressionASTC_LDR() {return this.ptr.get(LAYOUT__textureCompressionASTC_LDR, OFFSET__textureCompressionASTC_LDR);}
    public void textureCompressionASTC_LDR(int value) {this.ptr.set(LAYOUT__textureCompressionASTC_LDR, OFFSET__textureCompressionASTC_LDR, value);}
    public java.lang.foreign.MemorySegment $textureCompressionASTC_LDR() {return this.ptr.asSlice(OFFSET__textureCompressionASTC_LDR, LAYOUT__textureCompressionASTC_LDR);}

    public int textureCompressionBC() {return this.ptr.get(LAYOUT__textureCompressionBC, OFFSET__textureCompressionBC);}
    public void textureCompressionBC(int value) {this.ptr.set(LAYOUT__textureCompressionBC, OFFSET__textureCompressionBC, value);}
    public java.lang.foreign.MemorySegment $textureCompressionBC() {return this.ptr.asSlice(OFFSET__textureCompressionBC, LAYOUT__textureCompressionBC);}

    public int occlusionQueryPrecise() {return this.ptr.get(LAYOUT__occlusionQueryPrecise, OFFSET__occlusionQueryPrecise);}
    public void occlusionQueryPrecise(int value) {this.ptr.set(LAYOUT__occlusionQueryPrecise, OFFSET__occlusionQueryPrecise, value);}
    public java.lang.foreign.MemorySegment $occlusionQueryPrecise() {return this.ptr.asSlice(OFFSET__occlusionQueryPrecise, LAYOUT__occlusionQueryPrecise);}

    public int pipelineStatisticsQuery() {return this.ptr.get(LAYOUT__pipelineStatisticsQuery, OFFSET__pipelineStatisticsQuery);}
    public void pipelineStatisticsQuery(int value) {this.ptr.set(LAYOUT__pipelineStatisticsQuery, OFFSET__pipelineStatisticsQuery, value);}
    public java.lang.foreign.MemorySegment $pipelineStatisticsQuery() {return this.ptr.asSlice(OFFSET__pipelineStatisticsQuery, LAYOUT__pipelineStatisticsQuery);}

    public int vertexPipelineStoresAndAtomics() {return this.ptr.get(LAYOUT__vertexPipelineStoresAndAtomics, OFFSET__vertexPipelineStoresAndAtomics);}
    public void vertexPipelineStoresAndAtomics(int value) {this.ptr.set(LAYOUT__vertexPipelineStoresAndAtomics, OFFSET__vertexPipelineStoresAndAtomics, value);}
    public java.lang.foreign.MemorySegment $vertexPipelineStoresAndAtomics() {return this.ptr.asSlice(OFFSET__vertexPipelineStoresAndAtomics, LAYOUT__vertexPipelineStoresAndAtomics);}

    public int fragmentStoresAndAtomics() {return this.ptr.get(LAYOUT__fragmentStoresAndAtomics, OFFSET__fragmentStoresAndAtomics);}
    public void fragmentStoresAndAtomics(int value) {this.ptr.set(LAYOUT__fragmentStoresAndAtomics, OFFSET__fragmentStoresAndAtomics, value);}
    public java.lang.foreign.MemorySegment $fragmentStoresAndAtomics() {return this.ptr.asSlice(OFFSET__fragmentStoresAndAtomics, LAYOUT__fragmentStoresAndAtomics);}

    public int shaderTessellationAndGeometryPointSize() {return this.ptr.get(LAYOUT__shaderTessellationAndGeometryPointSize, OFFSET__shaderTessellationAndGeometryPointSize);}
    public void shaderTessellationAndGeometryPointSize(int value) {this.ptr.set(LAYOUT__shaderTessellationAndGeometryPointSize, OFFSET__shaderTessellationAndGeometryPointSize, value);}
    public java.lang.foreign.MemorySegment $shaderTessellationAndGeometryPointSize() {return this.ptr.asSlice(OFFSET__shaderTessellationAndGeometryPointSize, LAYOUT__shaderTessellationAndGeometryPointSize);}

    public int shaderImageGatherExtended() {return this.ptr.get(LAYOUT__shaderImageGatherExtended, OFFSET__shaderImageGatherExtended);}
    public void shaderImageGatherExtended(int value) {this.ptr.set(LAYOUT__shaderImageGatherExtended, OFFSET__shaderImageGatherExtended, value);}
    public java.lang.foreign.MemorySegment $shaderImageGatherExtended() {return this.ptr.asSlice(OFFSET__shaderImageGatherExtended, LAYOUT__shaderImageGatherExtended);}

    public int shaderStorageImageExtendedFormats() {return this.ptr.get(LAYOUT__shaderStorageImageExtendedFormats, OFFSET__shaderStorageImageExtendedFormats);}
    public void shaderStorageImageExtendedFormats(int value) {this.ptr.set(LAYOUT__shaderStorageImageExtendedFormats, OFFSET__shaderStorageImageExtendedFormats, value);}
    public java.lang.foreign.MemorySegment $shaderStorageImageExtendedFormats() {return this.ptr.asSlice(OFFSET__shaderStorageImageExtendedFormats, LAYOUT__shaderStorageImageExtendedFormats);}

    public int shaderStorageImageMultisample() {return this.ptr.get(LAYOUT__shaderStorageImageMultisample, OFFSET__shaderStorageImageMultisample);}
    public void shaderStorageImageMultisample(int value) {this.ptr.set(LAYOUT__shaderStorageImageMultisample, OFFSET__shaderStorageImageMultisample, value);}
    public java.lang.foreign.MemorySegment $shaderStorageImageMultisample() {return this.ptr.asSlice(OFFSET__shaderStorageImageMultisample, LAYOUT__shaderStorageImageMultisample);}

    public int shaderStorageImageReadWithoutFormat() {return this.ptr.get(LAYOUT__shaderStorageImageReadWithoutFormat, OFFSET__shaderStorageImageReadWithoutFormat);}
    public void shaderStorageImageReadWithoutFormat(int value) {this.ptr.set(LAYOUT__shaderStorageImageReadWithoutFormat, OFFSET__shaderStorageImageReadWithoutFormat, value);}
    public java.lang.foreign.MemorySegment $shaderStorageImageReadWithoutFormat() {return this.ptr.asSlice(OFFSET__shaderStorageImageReadWithoutFormat, LAYOUT__shaderStorageImageReadWithoutFormat);}

    public int shaderStorageImageWriteWithoutFormat() {return this.ptr.get(LAYOUT__shaderStorageImageWriteWithoutFormat, OFFSET__shaderStorageImageWriteWithoutFormat);}
    public void shaderStorageImageWriteWithoutFormat(int value) {this.ptr.set(LAYOUT__shaderStorageImageWriteWithoutFormat, OFFSET__shaderStorageImageWriteWithoutFormat, value);}
    public java.lang.foreign.MemorySegment $shaderStorageImageWriteWithoutFormat() {return this.ptr.asSlice(OFFSET__shaderStorageImageWriteWithoutFormat, LAYOUT__shaderStorageImageWriteWithoutFormat);}

    public int shaderUniformBufferArrayDynamicIndexing() {return this.ptr.get(LAYOUT__shaderUniformBufferArrayDynamicIndexing, OFFSET__shaderUniformBufferArrayDynamicIndexing);}
    public void shaderUniformBufferArrayDynamicIndexing(int value) {this.ptr.set(LAYOUT__shaderUniformBufferArrayDynamicIndexing, OFFSET__shaderUniformBufferArrayDynamicIndexing, value);}
    public java.lang.foreign.MemorySegment $shaderUniformBufferArrayDynamicIndexing() {return this.ptr.asSlice(OFFSET__shaderUniformBufferArrayDynamicIndexing, LAYOUT__shaderUniformBufferArrayDynamicIndexing);}

    public int shaderSampledImageArrayDynamicIndexing() {return this.ptr.get(LAYOUT__shaderSampledImageArrayDynamicIndexing, OFFSET__shaderSampledImageArrayDynamicIndexing);}
    public void shaderSampledImageArrayDynamicIndexing(int value) {this.ptr.set(LAYOUT__shaderSampledImageArrayDynamicIndexing, OFFSET__shaderSampledImageArrayDynamicIndexing, value);}
    public java.lang.foreign.MemorySegment $shaderSampledImageArrayDynamicIndexing() {return this.ptr.asSlice(OFFSET__shaderSampledImageArrayDynamicIndexing, LAYOUT__shaderSampledImageArrayDynamicIndexing);}

    public int shaderStorageBufferArrayDynamicIndexing() {return this.ptr.get(LAYOUT__shaderStorageBufferArrayDynamicIndexing, OFFSET__shaderStorageBufferArrayDynamicIndexing);}
    public void shaderStorageBufferArrayDynamicIndexing(int value) {this.ptr.set(LAYOUT__shaderStorageBufferArrayDynamicIndexing, OFFSET__shaderStorageBufferArrayDynamicIndexing, value);}
    public java.lang.foreign.MemorySegment $shaderStorageBufferArrayDynamicIndexing() {return this.ptr.asSlice(OFFSET__shaderStorageBufferArrayDynamicIndexing, LAYOUT__shaderStorageBufferArrayDynamicIndexing);}

    public int shaderStorageImageArrayDynamicIndexing() {return this.ptr.get(LAYOUT__shaderStorageImageArrayDynamicIndexing, OFFSET__shaderStorageImageArrayDynamicIndexing);}
    public void shaderStorageImageArrayDynamicIndexing(int value) {this.ptr.set(LAYOUT__shaderStorageImageArrayDynamicIndexing, OFFSET__shaderStorageImageArrayDynamicIndexing, value);}
    public java.lang.foreign.MemorySegment $shaderStorageImageArrayDynamicIndexing() {return this.ptr.asSlice(OFFSET__shaderStorageImageArrayDynamicIndexing, LAYOUT__shaderStorageImageArrayDynamicIndexing);}

    public int shaderClipDistance() {return this.ptr.get(LAYOUT__shaderClipDistance, OFFSET__shaderClipDistance);}
    public void shaderClipDistance(int value) {this.ptr.set(LAYOUT__shaderClipDistance, OFFSET__shaderClipDistance, value);}
    public java.lang.foreign.MemorySegment $shaderClipDistance() {return this.ptr.asSlice(OFFSET__shaderClipDistance, LAYOUT__shaderClipDistance);}

    public int shaderCullDistance() {return this.ptr.get(LAYOUT__shaderCullDistance, OFFSET__shaderCullDistance);}
    public void shaderCullDistance(int value) {this.ptr.set(LAYOUT__shaderCullDistance, OFFSET__shaderCullDistance, value);}
    public java.lang.foreign.MemorySegment $shaderCullDistance() {return this.ptr.asSlice(OFFSET__shaderCullDistance, LAYOUT__shaderCullDistance);}

    public int shaderFloat64() {return this.ptr.get(LAYOUT__shaderFloat64, OFFSET__shaderFloat64);}
    public void shaderFloat64(int value) {this.ptr.set(LAYOUT__shaderFloat64, OFFSET__shaderFloat64, value);}
    public java.lang.foreign.MemorySegment $shaderFloat64() {return this.ptr.asSlice(OFFSET__shaderFloat64, LAYOUT__shaderFloat64);}

    public int shaderInt64() {return this.ptr.get(LAYOUT__shaderInt64, OFFSET__shaderInt64);}
    public void shaderInt64(int value) {this.ptr.set(LAYOUT__shaderInt64, OFFSET__shaderInt64, value);}
    public java.lang.foreign.MemorySegment $shaderInt64() {return this.ptr.asSlice(OFFSET__shaderInt64, LAYOUT__shaderInt64);}

    public int shaderInt16() {return this.ptr.get(LAYOUT__shaderInt16, OFFSET__shaderInt16);}
    public void shaderInt16(int value) {this.ptr.set(LAYOUT__shaderInt16, OFFSET__shaderInt16, value);}
    public java.lang.foreign.MemorySegment $shaderInt16() {return this.ptr.asSlice(OFFSET__shaderInt16, LAYOUT__shaderInt16);}

    public int shaderResourceResidency() {return this.ptr.get(LAYOUT__shaderResourceResidency, OFFSET__shaderResourceResidency);}
    public void shaderResourceResidency(int value) {this.ptr.set(LAYOUT__shaderResourceResidency, OFFSET__shaderResourceResidency, value);}
    public java.lang.foreign.MemorySegment $shaderResourceResidency() {return this.ptr.asSlice(OFFSET__shaderResourceResidency, LAYOUT__shaderResourceResidency);}

    public int shaderResourceMinLod() {return this.ptr.get(LAYOUT__shaderResourceMinLod, OFFSET__shaderResourceMinLod);}
    public void shaderResourceMinLod(int value) {this.ptr.set(LAYOUT__shaderResourceMinLod, OFFSET__shaderResourceMinLod, value);}
    public java.lang.foreign.MemorySegment $shaderResourceMinLod() {return this.ptr.asSlice(OFFSET__shaderResourceMinLod, LAYOUT__shaderResourceMinLod);}

    public int sparseBinding() {return this.ptr.get(LAYOUT__sparseBinding, OFFSET__sparseBinding);}
    public void sparseBinding(int value) {this.ptr.set(LAYOUT__sparseBinding, OFFSET__sparseBinding, value);}
    public java.lang.foreign.MemorySegment $sparseBinding() {return this.ptr.asSlice(OFFSET__sparseBinding, LAYOUT__sparseBinding);}

    public int sparseResidencyBuffer() {return this.ptr.get(LAYOUT__sparseResidencyBuffer, OFFSET__sparseResidencyBuffer);}
    public void sparseResidencyBuffer(int value) {this.ptr.set(LAYOUT__sparseResidencyBuffer, OFFSET__sparseResidencyBuffer, value);}
    public java.lang.foreign.MemorySegment $sparseResidencyBuffer() {return this.ptr.asSlice(OFFSET__sparseResidencyBuffer, LAYOUT__sparseResidencyBuffer);}

    public int sparseResidencyImage2D() {return this.ptr.get(LAYOUT__sparseResidencyImage2D, OFFSET__sparseResidencyImage2D);}
    public void sparseResidencyImage2D(int value) {this.ptr.set(LAYOUT__sparseResidencyImage2D, OFFSET__sparseResidencyImage2D, value);}
    public java.lang.foreign.MemorySegment $sparseResidencyImage2D() {return this.ptr.asSlice(OFFSET__sparseResidencyImage2D, LAYOUT__sparseResidencyImage2D);}

    public int sparseResidencyImage3D() {return this.ptr.get(LAYOUT__sparseResidencyImage3D, OFFSET__sparseResidencyImage3D);}
    public void sparseResidencyImage3D(int value) {this.ptr.set(LAYOUT__sparseResidencyImage3D, OFFSET__sparseResidencyImage3D, value);}
    public java.lang.foreign.MemorySegment $sparseResidencyImage3D() {return this.ptr.asSlice(OFFSET__sparseResidencyImage3D, LAYOUT__sparseResidencyImage3D);}

    public int sparseResidency2Samples() {return this.ptr.get(LAYOUT__sparseResidency2Samples, OFFSET__sparseResidency2Samples);}
    public void sparseResidency2Samples(int value) {this.ptr.set(LAYOUT__sparseResidency2Samples, OFFSET__sparseResidency2Samples, value);}
    public java.lang.foreign.MemorySegment $sparseResidency2Samples() {return this.ptr.asSlice(OFFSET__sparseResidency2Samples, LAYOUT__sparseResidency2Samples);}

    public int sparseResidency4Samples() {return this.ptr.get(LAYOUT__sparseResidency4Samples, OFFSET__sparseResidency4Samples);}
    public void sparseResidency4Samples(int value) {this.ptr.set(LAYOUT__sparseResidency4Samples, OFFSET__sparseResidency4Samples, value);}
    public java.lang.foreign.MemorySegment $sparseResidency4Samples() {return this.ptr.asSlice(OFFSET__sparseResidency4Samples, LAYOUT__sparseResidency4Samples);}

    public int sparseResidency8Samples() {return this.ptr.get(LAYOUT__sparseResidency8Samples, OFFSET__sparseResidency8Samples);}
    public void sparseResidency8Samples(int value) {this.ptr.set(LAYOUT__sparseResidency8Samples, OFFSET__sparseResidency8Samples, value);}
    public java.lang.foreign.MemorySegment $sparseResidency8Samples() {return this.ptr.asSlice(OFFSET__sparseResidency8Samples, LAYOUT__sparseResidency8Samples);}

    public int sparseResidency16Samples() {return this.ptr.get(LAYOUT__sparseResidency16Samples, OFFSET__sparseResidency16Samples);}
    public void sparseResidency16Samples(int value) {this.ptr.set(LAYOUT__sparseResidency16Samples, OFFSET__sparseResidency16Samples, value);}
    public java.lang.foreign.MemorySegment $sparseResidency16Samples() {return this.ptr.asSlice(OFFSET__sparseResidency16Samples, LAYOUT__sparseResidency16Samples);}

    public int sparseResidencyAliased() {return this.ptr.get(LAYOUT__sparseResidencyAliased, OFFSET__sparseResidencyAliased);}
    public void sparseResidencyAliased(int value) {this.ptr.set(LAYOUT__sparseResidencyAliased, OFFSET__sparseResidencyAliased, value);}
    public java.lang.foreign.MemorySegment $sparseResidencyAliased() {return this.ptr.asSlice(OFFSET__sparseResidencyAliased, LAYOUT__sparseResidencyAliased);}

    public int variableMultisampleRate() {return this.ptr.get(LAYOUT__variableMultisampleRate, OFFSET__variableMultisampleRate);}
    public void variableMultisampleRate(int value) {this.ptr.set(LAYOUT__variableMultisampleRate, OFFSET__variableMultisampleRate, value);}
    public java.lang.foreign.MemorySegment $variableMultisampleRate() {return this.ptr.asSlice(OFFSET__variableMultisampleRate, LAYOUT__variableMultisampleRate);}

    public int inheritedQueries() {return this.ptr.get(LAYOUT__inheritedQueries, OFFSET__inheritedQueries);}
    public void inheritedQueries(int value) {this.ptr.set(LAYOUT__inheritedQueries, OFFSET__inheritedQueries, value);}
    public java.lang.foreign.MemorySegment $inheritedQueries() {return this.ptr.asSlice(OFFSET__inheritedQueries, LAYOUT__inheritedQueries);}
}
