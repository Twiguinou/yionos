package vulkan;

public record VkPhysicalDeviceVulkan13Properties(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__minSubgroupSize = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__minSubgroupSize = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxSubgroupSize = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__maxSubgroupSize = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxComputeWorkgroupSubgroups = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__maxComputeWorkgroupSubgroups = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__requiredSubgroupSizeStages = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__requiredSubgroupSizeStages = 28;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxInlineUniformBlockSize = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__maxInlineUniformBlockSize = 32;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxPerStageDescriptorInlineUniformBlocks = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__maxPerStageDescriptorInlineUniformBlocks = 36;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks = 40;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxDescriptorSetInlineUniformBlocks = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__maxDescriptorSetInlineUniformBlocks = 44;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxDescriptorSetUpdateAfterBindInlineUniformBlocks = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__maxDescriptorSetUpdateAfterBindInlineUniformBlocks = 48;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxInlineUniformTotalSize = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__maxInlineUniformTotalSize = 52;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__integerDotProduct8BitUnsignedAccelerated = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__integerDotProduct8BitUnsignedAccelerated = 56;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__integerDotProduct8BitSignedAccelerated = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__integerDotProduct8BitSignedAccelerated = 60;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__integerDotProduct8BitMixedSignednessAccelerated = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__integerDotProduct8BitMixedSignednessAccelerated = 64;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__integerDotProduct4x8BitPackedUnsignedAccelerated = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__integerDotProduct4x8BitPackedUnsignedAccelerated = 68;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__integerDotProduct4x8BitPackedSignedAccelerated = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__integerDotProduct4x8BitPackedSignedAccelerated = 72;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__integerDotProduct4x8BitPackedMixedSignednessAccelerated = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__integerDotProduct4x8BitPackedMixedSignednessAccelerated = 76;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__integerDotProduct16BitUnsignedAccelerated = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__integerDotProduct16BitUnsignedAccelerated = 80;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__integerDotProduct16BitSignedAccelerated = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__integerDotProduct16BitSignedAccelerated = 84;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__integerDotProduct16BitMixedSignednessAccelerated = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__integerDotProduct16BitMixedSignednessAccelerated = 88;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__integerDotProduct32BitUnsignedAccelerated = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__integerDotProduct32BitUnsignedAccelerated = 92;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__integerDotProduct32BitSignedAccelerated = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__integerDotProduct32BitSignedAccelerated = 96;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__integerDotProduct32BitMixedSignednessAccelerated = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__integerDotProduct32BitMixedSignednessAccelerated = 100;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__integerDotProduct64BitUnsignedAccelerated = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__integerDotProduct64BitUnsignedAccelerated = 104;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__integerDotProduct64BitSignedAccelerated = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__integerDotProduct64BitSignedAccelerated = 108;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__integerDotProduct64BitMixedSignednessAccelerated = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__integerDotProduct64BitMixedSignednessAccelerated = 112;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__integerDotProductAccumulatingSaturating8BitUnsignedAccelerated = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__integerDotProductAccumulatingSaturating8BitUnsignedAccelerated = 116;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__integerDotProductAccumulatingSaturating8BitSignedAccelerated = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__integerDotProductAccumulatingSaturating8BitSignedAccelerated = 120;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated = 124;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated = 128;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated = 132;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated = 136;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__integerDotProductAccumulatingSaturating16BitUnsignedAccelerated = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__integerDotProductAccumulatingSaturating16BitUnsignedAccelerated = 140;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__integerDotProductAccumulatingSaturating16BitSignedAccelerated = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__integerDotProductAccumulatingSaturating16BitSignedAccelerated = 144;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated = 148;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__integerDotProductAccumulatingSaturating32BitUnsignedAccelerated = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__integerDotProductAccumulatingSaturating32BitUnsignedAccelerated = 152;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__integerDotProductAccumulatingSaturating32BitSignedAccelerated = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__integerDotProductAccumulatingSaturating32BitSignedAccelerated = 156;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated = 160;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__integerDotProductAccumulatingSaturating64BitUnsignedAccelerated = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__integerDotProductAccumulatingSaturating64BitUnsignedAccelerated = 164;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__integerDotProductAccumulatingSaturating64BitSignedAccelerated = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__integerDotProductAccumulatingSaturating64BitSignedAccelerated = 168;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated = 172;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__storageTexelBufferOffsetAlignmentBytes = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__storageTexelBufferOffsetAlignmentBytes = 176;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__storageTexelBufferOffsetSingleTexelAlignment = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__storageTexelBufferOffsetSingleTexelAlignment = 184;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__uniformTexelBufferOffsetAlignmentBytes = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__uniformTexelBufferOffsetAlignmentBytes = 192;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__uniformTexelBufferOffsetSingleTexelAlignment = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__uniformTexelBufferOffsetSingleTexelAlignment = 200;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__maxBufferSize = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__maxBufferSize = 208;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__minSubgroupSize,
            LAYOUT__maxSubgroupSize,
            LAYOUT__maxComputeWorkgroupSubgroups,
            LAYOUT__requiredSubgroupSizeStages,
            LAYOUT__maxInlineUniformBlockSize,
            LAYOUT__maxPerStageDescriptorInlineUniformBlocks,
            LAYOUT__maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks,
            LAYOUT__maxDescriptorSetInlineUniformBlocks,
            LAYOUT__maxDescriptorSetUpdateAfterBindInlineUniformBlocks,
            LAYOUT__maxInlineUniformTotalSize,
            LAYOUT__integerDotProduct8BitUnsignedAccelerated,
            LAYOUT__integerDotProduct8BitSignedAccelerated,
            LAYOUT__integerDotProduct8BitMixedSignednessAccelerated,
            LAYOUT__integerDotProduct4x8BitPackedUnsignedAccelerated,
            LAYOUT__integerDotProduct4x8BitPackedSignedAccelerated,
            LAYOUT__integerDotProduct4x8BitPackedMixedSignednessAccelerated,
            LAYOUT__integerDotProduct16BitUnsignedAccelerated,
            LAYOUT__integerDotProduct16BitSignedAccelerated,
            LAYOUT__integerDotProduct16BitMixedSignednessAccelerated,
            LAYOUT__integerDotProduct32BitUnsignedAccelerated,
            LAYOUT__integerDotProduct32BitSignedAccelerated,
            LAYOUT__integerDotProduct32BitMixedSignednessAccelerated,
            LAYOUT__integerDotProduct64BitUnsignedAccelerated,
            LAYOUT__integerDotProduct64BitSignedAccelerated,
            LAYOUT__integerDotProduct64BitMixedSignednessAccelerated,
            LAYOUT__integerDotProductAccumulatingSaturating8BitUnsignedAccelerated,
            LAYOUT__integerDotProductAccumulatingSaturating8BitSignedAccelerated,
            LAYOUT__integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated,
            LAYOUT__integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated,
            LAYOUT__integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated,
            LAYOUT__integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated,
            LAYOUT__integerDotProductAccumulatingSaturating16BitUnsignedAccelerated,
            LAYOUT__integerDotProductAccumulatingSaturating16BitSignedAccelerated,
            LAYOUT__integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated,
            LAYOUT__integerDotProductAccumulatingSaturating32BitUnsignedAccelerated,
            LAYOUT__integerDotProductAccumulatingSaturating32BitSignedAccelerated,
            LAYOUT__integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated,
            LAYOUT__integerDotProductAccumulatingSaturating64BitUnsignedAccelerated,
            LAYOUT__integerDotProductAccumulatingSaturating64BitSignedAccelerated,
            LAYOUT__integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated,
            LAYOUT__storageTexelBufferOffsetAlignmentBytes,
            LAYOUT__storageTexelBufferOffsetSingleTexelAlignment,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__uniformTexelBufferOffsetAlignmentBytes,
            LAYOUT__uniformTexelBufferOffsetSingleTexelAlignment,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__maxBufferSize
    ).withByteAlignment(8).withName("VkPhysicalDeviceVulkan13Properties");

    public VkPhysicalDeviceVulkan13Properties(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceVulkan13Properties getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceVulkan13Properties(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceVulkan13Properties value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int minSubgroupSize() {return this.ptr.get(LAYOUT__minSubgroupSize, OFFSET__minSubgroupSize);}
    public void minSubgroupSize(int value) {this.ptr.set(LAYOUT__minSubgroupSize, OFFSET__minSubgroupSize, value);}
    public java.lang.foreign.MemorySegment $minSubgroupSize() {return this.ptr.asSlice(OFFSET__minSubgroupSize, LAYOUT__minSubgroupSize);}

    public int maxSubgroupSize() {return this.ptr.get(LAYOUT__maxSubgroupSize, OFFSET__maxSubgroupSize);}
    public void maxSubgroupSize(int value) {this.ptr.set(LAYOUT__maxSubgroupSize, OFFSET__maxSubgroupSize, value);}
    public java.lang.foreign.MemorySegment $maxSubgroupSize() {return this.ptr.asSlice(OFFSET__maxSubgroupSize, LAYOUT__maxSubgroupSize);}

    public int maxComputeWorkgroupSubgroups() {return this.ptr.get(LAYOUT__maxComputeWorkgroupSubgroups, OFFSET__maxComputeWorkgroupSubgroups);}
    public void maxComputeWorkgroupSubgroups(int value) {this.ptr.set(LAYOUT__maxComputeWorkgroupSubgroups, OFFSET__maxComputeWorkgroupSubgroups, value);}
    public java.lang.foreign.MemorySegment $maxComputeWorkgroupSubgroups() {return this.ptr.asSlice(OFFSET__maxComputeWorkgroupSubgroups, LAYOUT__maxComputeWorkgroupSubgroups);}

    public int requiredSubgroupSizeStages() {return this.ptr.get(LAYOUT__requiredSubgroupSizeStages, OFFSET__requiredSubgroupSizeStages);}
    public void requiredSubgroupSizeStages(int value) {this.ptr.set(LAYOUT__requiredSubgroupSizeStages, OFFSET__requiredSubgroupSizeStages, value);}
    public java.lang.foreign.MemorySegment $requiredSubgroupSizeStages() {return this.ptr.asSlice(OFFSET__requiredSubgroupSizeStages, LAYOUT__requiredSubgroupSizeStages);}

    public int maxInlineUniformBlockSize() {return this.ptr.get(LAYOUT__maxInlineUniformBlockSize, OFFSET__maxInlineUniformBlockSize);}
    public void maxInlineUniformBlockSize(int value) {this.ptr.set(LAYOUT__maxInlineUniformBlockSize, OFFSET__maxInlineUniformBlockSize, value);}
    public java.lang.foreign.MemorySegment $maxInlineUniformBlockSize() {return this.ptr.asSlice(OFFSET__maxInlineUniformBlockSize, LAYOUT__maxInlineUniformBlockSize);}

    public int maxPerStageDescriptorInlineUniformBlocks() {return this.ptr.get(LAYOUT__maxPerStageDescriptorInlineUniformBlocks, OFFSET__maxPerStageDescriptorInlineUniformBlocks);}
    public void maxPerStageDescriptorInlineUniformBlocks(int value) {this.ptr.set(LAYOUT__maxPerStageDescriptorInlineUniformBlocks, OFFSET__maxPerStageDescriptorInlineUniformBlocks, value);}
    public java.lang.foreign.MemorySegment $maxPerStageDescriptorInlineUniformBlocks() {return this.ptr.asSlice(OFFSET__maxPerStageDescriptorInlineUniformBlocks, LAYOUT__maxPerStageDescriptorInlineUniformBlocks);}

    public int maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks() {return this.ptr.get(LAYOUT__maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks, OFFSET__maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks);}
    public void maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks(int value) {this.ptr.set(LAYOUT__maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks, OFFSET__maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks, value);}
    public java.lang.foreign.MemorySegment $maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks() {return this.ptr.asSlice(OFFSET__maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks, LAYOUT__maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks);}

    public int maxDescriptorSetInlineUniformBlocks() {return this.ptr.get(LAYOUT__maxDescriptorSetInlineUniformBlocks, OFFSET__maxDescriptorSetInlineUniformBlocks);}
    public void maxDescriptorSetInlineUniformBlocks(int value) {this.ptr.set(LAYOUT__maxDescriptorSetInlineUniformBlocks, OFFSET__maxDescriptorSetInlineUniformBlocks, value);}
    public java.lang.foreign.MemorySegment $maxDescriptorSetInlineUniformBlocks() {return this.ptr.asSlice(OFFSET__maxDescriptorSetInlineUniformBlocks, LAYOUT__maxDescriptorSetInlineUniformBlocks);}

    public int maxDescriptorSetUpdateAfterBindInlineUniformBlocks() {return this.ptr.get(LAYOUT__maxDescriptorSetUpdateAfterBindInlineUniformBlocks, OFFSET__maxDescriptorSetUpdateAfterBindInlineUniformBlocks);}
    public void maxDescriptorSetUpdateAfterBindInlineUniformBlocks(int value) {this.ptr.set(LAYOUT__maxDescriptorSetUpdateAfterBindInlineUniformBlocks, OFFSET__maxDescriptorSetUpdateAfterBindInlineUniformBlocks, value);}
    public java.lang.foreign.MemorySegment $maxDescriptorSetUpdateAfterBindInlineUniformBlocks() {return this.ptr.asSlice(OFFSET__maxDescriptorSetUpdateAfterBindInlineUniformBlocks, LAYOUT__maxDescriptorSetUpdateAfterBindInlineUniformBlocks);}

    public int maxInlineUniformTotalSize() {return this.ptr.get(LAYOUT__maxInlineUniformTotalSize, OFFSET__maxInlineUniformTotalSize);}
    public void maxInlineUniformTotalSize(int value) {this.ptr.set(LAYOUT__maxInlineUniformTotalSize, OFFSET__maxInlineUniformTotalSize, value);}
    public java.lang.foreign.MemorySegment $maxInlineUniformTotalSize() {return this.ptr.asSlice(OFFSET__maxInlineUniformTotalSize, LAYOUT__maxInlineUniformTotalSize);}

    public int integerDotProduct8BitUnsignedAccelerated() {return this.ptr.get(LAYOUT__integerDotProduct8BitUnsignedAccelerated, OFFSET__integerDotProduct8BitUnsignedAccelerated);}
    public void integerDotProduct8BitUnsignedAccelerated(int value) {this.ptr.set(LAYOUT__integerDotProduct8BitUnsignedAccelerated, OFFSET__integerDotProduct8BitUnsignedAccelerated, value);}
    public java.lang.foreign.MemorySegment $integerDotProduct8BitUnsignedAccelerated() {return this.ptr.asSlice(OFFSET__integerDotProduct8BitUnsignedAccelerated, LAYOUT__integerDotProduct8BitUnsignedAccelerated);}

    public int integerDotProduct8BitSignedAccelerated() {return this.ptr.get(LAYOUT__integerDotProduct8BitSignedAccelerated, OFFSET__integerDotProduct8BitSignedAccelerated);}
    public void integerDotProduct8BitSignedAccelerated(int value) {this.ptr.set(LAYOUT__integerDotProduct8BitSignedAccelerated, OFFSET__integerDotProduct8BitSignedAccelerated, value);}
    public java.lang.foreign.MemorySegment $integerDotProduct8BitSignedAccelerated() {return this.ptr.asSlice(OFFSET__integerDotProduct8BitSignedAccelerated, LAYOUT__integerDotProduct8BitSignedAccelerated);}

    public int integerDotProduct8BitMixedSignednessAccelerated() {return this.ptr.get(LAYOUT__integerDotProduct8BitMixedSignednessAccelerated, OFFSET__integerDotProduct8BitMixedSignednessAccelerated);}
    public void integerDotProduct8BitMixedSignednessAccelerated(int value) {this.ptr.set(LAYOUT__integerDotProduct8BitMixedSignednessAccelerated, OFFSET__integerDotProduct8BitMixedSignednessAccelerated, value);}
    public java.lang.foreign.MemorySegment $integerDotProduct8BitMixedSignednessAccelerated() {return this.ptr.asSlice(OFFSET__integerDotProduct8BitMixedSignednessAccelerated, LAYOUT__integerDotProduct8BitMixedSignednessAccelerated);}

    public int integerDotProduct4x8BitPackedUnsignedAccelerated() {return this.ptr.get(LAYOUT__integerDotProduct4x8BitPackedUnsignedAccelerated, OFFSET__integerDotProduct4x8BitPackedUnsignedAccelerated);}
    public void integerDotProduct4x8BitPackedUnsignedAccelerated(int value) {this.ptr.set(LAYOUT__integerDotProduct4x8BitPackedUnsignedAccelerated, OFFSET__integerDotProduct4x8BitPackedUnsignedAccelerated, value);}
    public java.lang.foreign.MemorySegment $integerDotProduct4x8BitPackedUnsignedAccelerated() {return this.ptr.asSlice(OFFSET__integerDotProduct4x8BitPackedUnsignedAccelerated, LAYOUT__integerDotProduct4x8BitPackedUnsignedAccelerated);}

    public int integerDotProduct4x8BitPackedSignedAccelerated() {return this.ptr.get(LAYOUT__integerDotProduct4x8BitPackedSignedAccelerated, OFFSET__integerDotProduct4x8BitPackedSignedAccelerated);}
    public void integerDotProduct4x8BitPackedSignedAccelerated(int value) {this.ptr.set(LAYOUT__integerDotProduct4x8BitPackedSignedAccelerated, OFFSET__integerDotProduct4x8BitPackedSignedAccelerated, value);}
    public java.lang.foreign.MemorySegment $integerDotProduct4x8BitPackedSignedAccelerated() {return this.ptr.asSlice(OFFSET__integerDotProduct4x8BitPackedSignedAccelerated, LAYOUT__integerDotProduct4x8BitPackedSignedAccelerated);}

    public int integerDotProduct4x8BitPackedMixedSignednessAccelerated() {return this.ptr.get(LAYOUT__integerDotProduct4x8BitPackedMixedSignednessAccelerated, OFFSET__integerDotProduct4x8BitPackedMixedSignednessAccelerated);}
    public void integerDotProduct4x8BitPackedMixedSignednessAccelerated(int value) {this.ptr.set(LAYOUT__integerDotProduct4x8BitPackedMixedSignednessAccelerated, OFFSET__integerDotProduct4x8BitPackedMixedSignednessAccelerated, value);}
    public java.lang.foreign.MemorySegment $integerDotProduct4x8BitPackedMixedSignednessAccelerated() {return this.ptr.asSlice(OFFSET__integerDotProduct4x8BitPackedMixedSignednessAccelerated, LAYOUT__integerDotProduct4x8BitPackedMixedSignednessAccelerated);}

    public int integerDotProduct16BitUnsignedAccelerated() {return this.ptr.get(LAYOUT__integerDotProduct16BitUnsignedAccelerated, OFFSET__integerDotProduct16BitUnsignedAccelerated);}
    public void integerDotProduct16BitUnsignedAccelerated(int value) {this.ptr.set(LAYOUT__integerDotProduct16BitUnsignedAccelerated, OFFSET__integerDotProduct16BitUnsignedAccelerated, value);}
    public java.lang.foreign.MemorySegment $integerDotProduct16BitUnsignedAccelerated() {return this.ptr.asSlice(OFFSET__integerDotProduct16BitUnsignedAccelerated, LAYOUT__integerDotProduct16BitUnsignedAccelerated);}

    public int integerDotProduct16BitSignedAccelerated() {return this.ptr.get(LAYOUT__integerDotProduct16BitSignedAccelerated, OFFSET__integerDotProduct16BitSignedAccelerated);}
    public void integerDotProduct16BitSignedAccelerated(int value) {this.ptr.set(LAYOUT__integerDotProduct16BitSignedAccelerated, OFFSET__integerDotProduct16BitSignedAccelerated, value);}
    public java.lang.foreign.MemorySegment $integerDotProduct16BitSignedAccelerated() {return this.ptr.asSlice(OFFSET__integerDotProduct16BitSignedAccelerated, LAYOUT__integerDotProduct16BitSignedAccelerated);}

    public int integerDotProduct16BitMixedSignednessAccelerated() {return this.ptr.get(LAYOUT__integerDotProduct16BitMixedSignednessAccelerated, OFFSET__integerDotProduct16BitMixedSignednessAccelerated);}
    public void integerDotProduct16BitMixedSignednessAccelerated(int value) {this.ptr.set(LAYOUT__integerDotProduct16BitMixedSignednessAccelerated, OFFSET__integerDotProduct16BitMixedSignednessAccelerated, value);}
    public java.lang.foreign.MemorySegment $integerDotProduct16BitMixedSignednessAccelerated() {return this.ptr.asSlice(OFFSET__integerDotProduct16BitMixedSignednessAccelerated, LAYOUT__integerDotProduct16BitMixedSignednessAccelerated);}

    public int integerDotProduct32BitUnsignedAccelerated() {return this.ptr.get(LAYOUT__integerDotProduct32BitUnsignedAccelerated, OFFSET__integerDotProduct32BitUnsignedAccelerated);}
    public void integerDotProduct32BitUnsignedAccelerated(int value) {this.ptr.set(LAYOUT__integerDotProduct32BitUnsignedAccelerated, OFFSET__integerDotProduct32BitUnsignedAccelerated, value);}
    public java.lang.foreign.MemorySegment $integerDotProduct32BitUnsignedAccelerated() {return this.ptr.asSlice(OFFSET__integerDotProduct32BitUnsignedAccelerated, LAYOUT__integerDotProduct32BitUnsignedAccelerated);}

    public int integerDotProduct32BitSignedAccelerated() {return this.ptr.get(LAYOUT__integerDotProduct32BitSignedAccelerated, OFFSET__integerDotProduct32BitSignedAccelerated);}
    public void integerDotProduct32BitSignedAccelerated(int value) {this.ptr.set(LAYOUT__integerDotProduct32BitSignedAccelerated, OFFSET__integerDotProduct32BitSignedAccelerated, value);}
    public java.lang.foreign.MemorySegment $integerDotProduct32BitSignedAccelerated() {return this.ptr.asSlice(OFFSET__integerDotProduct32BitSignedAccelerated, LAYOUT__integerDotProduct32BitSignedAccelerated);}

    public int integerDotProduct32BitMixedSignednessAccelerated() {return this.ptr.get(LAYOUT__integerDotProduct32BitMixedSignednessAccelerated, OFFSET__integerDotProduct32BitMixedSignednessAccelerated);}
    public void integerDotProduct32BitMixedSignednessAccelerated(int value) {this.ptr.set(LAYOUT__integerDotProduct32BitMixedSignednessAccelerated, OFFSET__integerDotProduct32BitMixedSignednessAccelerated, value);}
    public java.lang.foreign.MemorySegment $integerDotProduct32BitMixedSignednessAccelerated() {return this.ptr.asSlice(OFFSET__integerDotProduct32BitMixedSignednessAccelerated, LAYOUT__integerDotProduct32BitMixedSignednessAccelerated);}

    public int integerDotProduct64BitUnsignedAccelerated() {return this.ptr.get(LAYOUT__integerDotProduct64BitUnsignedAccelerated, OFFSET__integerDotProduct64BitUnsignedAccelerated);}
    public void integerDotProduct64BitUnsignedAccelerated(int value) {this.ptr.set(LAYOUT__integerDotProduct64BitUnsignedAccelerated, OFFSET__integerDotProduct64BitUnsignedAccelerated, value);}
    public java.lang.foreign.MemorySegment $integerDotProduct64BitUnsignedAccelerated() {return this.ptr.asSlice(OFFSET__integerDotProduct64BitUnsignedAccelerated, LAYOUT__integerDotProduct64BitUnsignedAccelerated);}

    public int integerDotProduct64BitSignedAccelerated() {return this.ptr.get(LAYOUT__integerDotProduct64BitSignedAccelerated, OFFSET__integerDotProduct64BitSignedAccelerated);}
    public void integerDotProduct64BitSignedAccelerated(int value) {this.ptr.set(LAYOUT__integerDotProduct64BitSignedAccelerated, OFFSET__integerDotProduct64BitSignedAccelerated, value);}
    public java.lang.foreign.MemorySegment $integerDotProduct64BitSignedAccelerated() {return this.ptr.asSlice(OFFSET__integerDotProduct64BitSignedAccelerated, LAYOUT__integerDotProduct64BitSignedAccelerated);}

    public int integerDotProduct64BitMixedSignednessAccelerated() {return this.ptr.get(LAYOUT__integerDotProduct64BitMixedSignednessAccelerated, OFFSET__integerDotProduct64BitMixedSignednessAccelerated);}
    public void integerDotProduct64BitMixedSignednessAccelerated(int value) {this.ptr.set(LAYOUT__integerDotProduct64BitMixedSignednessAccelerated, OFFSET__integerDotProduct64BitMixedSignednessAccelerated, value);}
    public java.lang.foreign.MemorySegment $integerDotProduct64BitMixedSignednessAccelerated() {return this.ptr.asSlice(OFFSET__integerDotProduct64BitMixedSignednessAccelerated, LAYOUT__integerDotProduct64BitMixedSignednessAccelerated);}

    public int integerDotProductAccumulatingSaturating8BitUnsignedAccelerated() {return this.ptr.get(LAYOUT__integerDotProductAccumulatingSaturating8BitUnsignedAccelerated, OFFSET__integerDotProductAccumulatingSaturating8BitUnsignedAccelerated);}
    public void integerDotProductAccumulatingSaturating8BitUnsignedAccelerated(int value) {this.ptr.set(LAYOUT__integerDotProductAccumulatingSaturating8BitUnsignedAccelerated, OFFSET__integerDotProductAccumulatingSaturating8BitUnsignedAccelerated, value);}
    public java.lang.foreign.MemorySegment $integerDotProductAccumulatingSaturating8BitUnsignedAccelerated() {return this.ptr.asSlice(OFFSET__integerDotProductAccumulatingSaturating8BitUnsignedAccelerated, LAYOUT__integerDotProductAccumulatingSaturating8BitUnsignedAccelerated);}

    public int integerDotProductAccumulatingSaturating8BitSignedAccelerated() {return this.ptr.get(LAYOUT__integerDotProductAccumulatingSaturating8BitSignedAccelerated, OFFSET__integerDotProductAccumulatingSaturating8BitSignedAccelerated);}
    public void integerDotProductAccumulatingSaturating8BitSignedAccelerated(int value) {this.ptr.set(LAYOUT__integerDotProductAccumulatingSaturating8BitSignedAccelerated, OFFSET__integerDotProductAccumulatingSaturating8BitSignedAccelerated, value);}
    public java.lang.foreign.MemorySegment $integerDotProductAccumulatingSaturating8BitSignedAccelerated() {return this.ptr.asSlice(OFFSET__integerDotProductAccumulatingSaturating8BitSignedAccelerated, LAYOUT__integerDotProductAccumulatingSaturating8BitSignedAccelerated);}

    public int integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated() {return this.ptr.get(LAYOUT__integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated, OFFSET__integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated);}
    public void integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated(int value) {this.ptr.set(LAYOUT__integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated, OFFSET__integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated, value);}
    public java.lang.foreign.MemorySegment $integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated() {return this.ptr.asSlice(OFFSET__integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated, LAYOUT__integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated);}

    public int integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated() {return this.ptr.get(LAYOUT__integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated, OFFSET__integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated);}
    public void integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated(int value) {this.ptr.set(LAYOUT__integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated, OFFSET__integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated, value);}
    public java.lang.foreign.MemorySegment $integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated() {return this.ptr.asSlice(OFFSET__integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated, LAYOUT__integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated);}

    public int integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated() {return this.ptr.get(LAYOUT__integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated, OFFSET__integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated);}
    public void integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated(int value) {this.ptr.set(LAYOUT__integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated, OFFSET__integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated, value);}
    public java.lang.foreign.MemorySegment $integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated() {return this.ptr.asSlice(OFFSET__integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated, LAYOUT__integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated);}

    public int integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated() {return this.ptr.get(LAYOUT__integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated, OFFSET__integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated);}
    public void integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated(int value) {this.ptr.set(LAYOUT__integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated, OFFSET__integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated, value);}
    public java.lang.foreign.MemorySegment $integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated() {return this.ptr.asSlice(OFFSET__integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated, LAYOUT__integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated);}

    public int integerDotProductAccumulatingSaturating16BitUnsignedAccelerated() {return this.ptr.get(LAYOUT__integerDotProductAccumulatingSaturating16BitUnsignedAccelerated, OFFSET__integerDotProductAccumulatingSaturating16BitUnsignedAccelerated);}
    public void integerDotProductAccumulatingSaturating16BitUnsignedAccelerated(int value) {this.ptr.set(LAYOUT__integerDotProductAccumulatingSaturating16BitUnsignedAccelerated, OFFSET__integerDotProductAccumulatingSaturating16BitUnsignedAccelerated, value);}
    public java.lang.foreign.MemorySegment $integerDotProductAccumulatingSaturating16BitUnsignedAccelerated() {return this.ptr.asSlice(OFFSET__integerDotProductAccumulatingSaturating16BitUnsignedAccelerated, LAYOUT__integerDotProductAccumulatingSaturating16BitUnsignedAccelerated);}

    public int integerDotProductAccumulatingSaturating16BitSignedAccelerated() {return this.ptr.get(LAYOUT__integerDotProductAccumulatingSaturating16BitSignedAccelerated, OFFSET__integerDotProductAccumulatingSaturating16BitSignedAccelerated);}
    public void integerDotProductAccumulatingSaturating16BitSignedAccelerated(int value) {this.ptr.set(LAYOUT__integerDotProductAccumulatingSaturating16BitSignedAccelerated, OFFSET__integerDotProductAccumulatingSaturating16BitSignedAccelerated, value);}
    public java.lang.foreign.MemorySegment $integerDotProductAccumulatingSaturating16BitSignedAccelerated() {return this.ptr.asSlice(OFFSET__integerDotProductAccumulatingSaturating16BitSignedAccelerated, LAYOUT__integerDotProductAccumulatingSaturating16BitSignedAccelerated);}

    public int integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated() {return this.ptr.get(LAYOUT__integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated, OFFSET__integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated);}
    public void integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated(int value) {this.ptr.set(LAYOUT__integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated, OFFSET__integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated, value);}
    public java.lang.foreign.MemorySegment $integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated() {return this.ptr.asSlice(OFFSET__integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated, LAYOUT__integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated);}

    public int integerDotProductAccumulatingSaturating32BitUnsignedAccelerated() {return this.ptr.get(LAYOUT__integerDotProductAccumulatingSaturating32BitUnsignedAccelerated, OFFSET__integerDotProductAccumulatingSaturating32BitUnsignedAccelerated);}
    public void integerDotProductAccumulatingSaturating32BitUnsignedAccelerated(int value) {this.ptr.set(LAYOUT__integerDotProductAccumulatingSaturating32BitUnsignedAccelerated, OFFSET__integerDotProductAccumulatingSaturating32BitUnsignedAccelerated, value);}
    public java.lang.foreign.MemorySegment $integerDotProductAccumulatingSaturating32BitUnsignedAccelerated() {return this.ptr.asSlice(OFFSET__integerDotProductAccumulatingSaturating32BitUnsignedAccelerated, LAYOUT__integerDotProductAccumulatingSaturating32BitUnsignedAccelerated);}

    public int integerDotProductAccumulatingSaturating32BitSignedAccelerated() {return this.ptr.get(LAYOUT__integerDotProductAccumulatingSaturating32BitSignedAccelerated, OFFSET__integerDotProductAccumulatingSaturating32BitSignedAccelerated);}
    public void integerDotProductAccumulatingSaturating32BitSignedAccelerated(int value) {this.ptr.set(LAYOUT__integerDotProductAccumulatingSaturating32BitSignedAccelerated, OFFSET__integerDotProductAccumulatingSaturating32BitSignedAccelerated, value);}
    public java.lang.foreign.MemorySegment $integerDotProductAccumulatingSaturating32BitSignedAccelerated() {return this.ptr.asSlice(OFFSET__integerDotProductAccumulatingSaturating32BitSignedAccelerated, LAYOUT__integerDotProductAccumulatingSaturating32BitSignedAccelerated);}

    public int integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated() {return this.ptr.get(LAYOUT__integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated, OFFSET__integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated);}
    public void integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated(int value) {this.ptr.set(LAYOUT__integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated, OFFSET__integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated, value);}
    public java.lang.foreign.MemorySegment $integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated() {return this.ptr.asSlice(OFFSET__integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated, LAYOUT__integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated);}

    public int integerDotProductAccumulatingSaturating64BitUnsignedAccelerated() {return this.ptr.get(LAYOUT__integerDotProductAccumulatingSaturating64BitUnsignedAccelerated, OFFSET__integerDotProductAccumulatingSaturating64BitUnsignedAccelerated);}
    public void integerDotProductAccumulatingSaturating64BitUnsignedAccelerated(int value) {this.ptr.set(LAYOUT__integerDotProductAccumulatingSaturating64BitUnsignedAccelerated, OFFSET__integerDotProductAccumulatingSaturating64BitUnsignedAccelerated, value);}
    public java.lang.foreign.MemorySegment $integerDotProductAccumulatingSaturating64BitUnsignedAccelerated() {return this.ptr.asSlice(OFFSET__integerDotProductAccumulatingSaturating64BitUnsignedAccelerated, LAYOUT__integerDotProductAccumulatingSaturating64BitUnsignedAccelerated);}

    public int integerDotProductAccumulatingSaturating64BitSignedAccelerated() {return this.ptr.get(LAYOUT__integerDotProductAccumulatingSaturating64BitSignedAccelerated, OFFSET__integerDotProductAccumulatingSaturating64BitSignedAccelerated);}
    public void integerDotProductAccumulatingSaturating64BitSignedAccelerated(int value) {this.ptr.set(LAYOUT__integerDotProductAccumulatingSaturating64BitSignedAccelerated, OFFSET__integerDotProductAccumulatingSaturating64BitSignedAccelerated, value);}
    public java.lang.foreign.MemorySegment $integerDotProductAccumulatingSaturating64BitSignedAccelerated() {return this.ptr.asSlice(OFFSET__integerDotProductAccumulatingSaturating64BitSignedAccelerated, LAYOUT__integerDotProductAccumulatingSaturating64BitSignedAccelerated);}

    public int integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated() {return this.ptr.get(LAYOUT__integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated, OFFSET__integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated);}
    public void integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated(int value) {this.ptr.set(LAYOUT__integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated, OFFSET__integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated, value);}
    public java.lang.foreign.MemorySegment $integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated() {return this.ptr.asSlice(OFFSET__integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated, LAYOUT__integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated);}

    public long storageTexelBufferOffsetAlignmentBytes() {return this.ptr.get(LAYOUT__storageTexelBufferOffsetAlignmentBytes, OFFSET__storageTexelBufferOffsetAlignmentBytes);}
    public void storageTexelBufferOffsetAlignmentBytes(long value) {this.ptr.set(LAYOUT__storageTexelBufferOffsetAlignmentBytes, OFFSET__storageTexelBufferOffsetAlignmentBytes, value);}
    public java.lang.foreign.MemorySegment $storageTexelBufferOffsetAlignmentBytes() {return this.ptr.asSlice(OFFSET__storageTexelBufferOffsetAlignmentBytes, LAYOUT__storageTexelBufferOffsetAlignmentBytes);}

    public int storageTexelBufferOffsetSingleTexelAlignment() {return this.ptr.get(LAYOUT__storageTexelBufferOffsetSingleTexelAlignment, OFFSET__storageTexelBufferOffsetSingleTexelAlignment);}
    public void storageTexelBufferOffsetSingleTexelAlignment(int value) {this.ptr.set(LAYOUT__storageTexelBufferOffsetSingleTexelAlignment, OFFSET__storageTexelBufferOffsetSingleTexelAlignment, value);}
    public java.lang.foreign.MemorySegment $storageTexelBufferOffsetSingleTexelAlignment() {return this.ptr.asSlice(OFFSET__storageTexelBufferOffsetSingleTexelAlignment, LAYOUT__storageTexelBufferOffsetSingleTexelAlignment);}

    public long uniformTexelBufferOffsetAlignmentBytes() {return this.ptr.get(LAYOUT__uniformTexelBufferOffsetAlignmentBytes, OFFSET__uniformTexelBufferOffsetAlignmentBytes);}
    public void uniformTexelBufferOffsetAlignmentBytes(long value) {this.ptr.set(LAYOUT__uniformTexelBufferOffsetAlignmentBytes, OFFSET__uniformTexelBufferOffsetAlignmentBytes, value);}
    public java.lang.foreign.MemorySegment $uniformTexelBufferOffsetAlignmentBytes() {return this.ptr.asSlice(OFFSET__uniformTexelBufferOffsetAlignmentBytes, LAYOUT__uniformTexelBufferOffsetAlignmentBytes);}

    public int uniformTexelBufferOffsetSingleTexelAlignment() {return this.ptr.get(LAYOUT__uniformTexelBufferOffsetSingleTexelAlignment, OFFSET__uniformTexelBufferOffsetSingleTexelAlignment);}
    public void uniformTexelBufferOffsetSingleTexelAlignment(int value) {this.ptr.set(LAYOUT__uniformTexelBufferOffsetSingleTexelAlignment, OFFSET__uniformTexelBufferOffsetSingleTexelAlignment, value);}
    public java.lang.foreign.MemorySegment $uniformTexelBufferOffsetSingleTexelAlignment() {return this.ptr.asSlice(OFFSET__uniformTexelBufferOffsetSingleTexelAlignment, LAYOUT__uniformTexelBufferOffsetSingleTexelAlignment);}

    public long maxBufferSize() {return this.ptr.get(LAYOUT__maxBufferSize, OFFSET__maxBufferSize);}
    public void maxBufferSize(long value) {this.ptr.set(LAYOUT__maxBufferSize, OFFSET__maxBufferSize, value);}
    public java.lang.foreign.MemorySegment $maxBufferSize() {return this.ptr.asSlice(OFFSET__maxBufferSize, LAYOUT__maxBufferSize);}
}
