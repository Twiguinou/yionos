package vulkan;

public record VkPhysicalDeviceFragmentShadingRatePropertiesKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.StructLayout LAYOUT__minFragmentShadingRateAttachmentTexelSize = vulkan.VkExtent2D.gRecordLayout.withName("minFragmentShadingRateAttachmentTexelSize");
    public static final long OFFSET__minFragmentShadingRateAttachmentTexelSize = 16;
    public static final java.lang.foreign.StructLayout LAYOUT__maxFragmentShadingRateAttachmentTexelSize = vulkan.VkExtent2D.gRecordLayout.withName("maxFragmentShadingRateAttachmentTexelSize");
    public static final long OFFSET__maxFragmentShadingRateAttachmentTexelSize = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxFragmentShadingRateAttachmentTexelSizeAspectRatio = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxFragmentShadingRateAttachmentTexelSizeAspectRatio");
    public static final long OFFSET__maxFragmentShadingRateAttachmentTexelSizeAspectRatio = 32;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__primitiveFragmentShadingRateWithMultipleViewports = java.lang.foreign.ValueLayout.JAVA_INT.withName("primitiveFragmentShadingRateWithMultipleViewports");
    public static final long OFFSET__primitiveFragmentShadingRateWithMultipleViewports = 36;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__layeredShadingRateAttachments = java.lang.foreign.ValueLayout.JAVA_INT.withName("layeredShadingRateAttachments");
    public static final long OFFSET__layeredShadingRateAttachments = 40;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__fragmentShadingRateNonTrivialCombinerOps = java.lang.foreign.ValueLayout.JAVA_INT.withName("fragmentShadingRateNonTrivialCombinerOps");
    public static final long OFFSET__fragmentShadingRateNonTrivialCombinerOps = 44;
    public static final java.lang.foreign.StructLayout LAYOUT__maxFragmentSize = vulkan.VkExtent2D.gRecordLayout.withName("maxFragmentSize");
    public static final long OFFSET__maxFragmentSize = 48;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxFragmentSizeAspectRatio = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxFragmentSizeAspectRatio");
    public static final long OFFSET__maxFragmentSizeAspectRatio = 56;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxFragmentShadingRateCoverageSamples = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxFragmentShadingRateCoverageSamples");
    public static final long OFFSET__maxFragmentShadingRateCoverageSamples = 60;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxFragmentShadingRateRasterizationSamples = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxFragmentShadingRateRasterizationSamples");
    public static final long OFFSET__maxFragmentShadingRateRasterizationSamples = 64;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__fragmentShadingRateWithShaderDepthStencilWrites = java.lang.foreign.ValueLayout.JAVA_INT.withName("fragmentShadingRateWithShaderDepthStencilWrites");
    public static final long OFFSET__fragmentShadingRateWithShaderDepthStencilWrites = 68;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__fragmentShadingRateWithSampleMask = java.lang.foreign.ValueLayout.JAVA_INT.withName("fragmentShadingRateWithSampleMask");
    public static final long OFFSET__fragmentShadingRateWithSampleMask = 72;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__fragmentShadingRateWithShaderSampleMask = java.lang.foreign.ValueLayout.JAVA_INT.withName("fragmentShadingRateWithShaderSampleMask");
    public static final long OFFSET__fragmentShadingRateWithShaderSampleMask = 76;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__fragmentShadingRateWithConservativeRasterization = java.lang.foreign.ValueLayout.JAVA_INT.withName("fragmentShadingRateWithConservativeRasterization");
    public static final long OFFSET__fragmentShadingRateWithConservativeRasterization = 80;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__fragmentShadingRateWithFragmentShaderInterlock = java.lang.foreign.ValueLayout.JAVA_INT.withName("fragmentShadingRateWithFragmentShaderInterlock");
    public static final long OFFSET__fragmentShadingRateWithFragmentShaderInterlock = 84;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__fragmentShadingRateWithCustomSampleLocations = java.lang.foreign.ValueLayout.JAVA_INT.withName("fragmentShadingRateWithCustomSampleLocations");
    public static final long OFFSET__fragmentShadingRateWithCustomSampleLocations = 88;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__fragmentShadingRateStrictMultiplyCombiner = java.lang.foreign.ValueLayout.JAVA_INT.withName("fragmentShadingRateStrictMultiplyCombiner");
    public static final long OFFSET__fragmentShadingRateStrictMultiplyCombiner = 92;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__minFragmentShadingRateAttachmentTexelSize,
            LAYOUT__maxFragmentShadingRateAttachmentTexelSize,
            LAYOUT__maxFragmentShadingRateAttachmentTexelSizeAspectRatio,
            LAYOUT__primitiveFragmentShadingRateWithMultipleViewports,
            LAYOUT__layeredShadingRateAttachments,
            LAYOUT__fragmentShadingRateNonTrivialCombinerOps,
            LAYOUT__maxFragmentSize,
            LAYOUT__maxFragmentSizeAspectRatio,
            LAYOUT__maxFragmentShadingRateCoverageSamples,
            LAYOUT__maxFragmentShadingRateRasterizationSamples,
            LAYOUT__fragmentShadingRateWithShaderDepthStencilWrites,
            LAYOUT__fragmentShadingRateWithSampleMask,
            LAYOUT__fragmentShadingRateWithShaderSampleMask,
            LAYOUT__fragmentShadingRateWithConservativeRasterization,
            LAYOUT__fragmentShadingRateWithFragmentShaderInterlock,
            LAYOUT__fragmentShadingRateWithCustomSampleLocations,
            LAYOUT__fragmentShadingRateStrictMultiplyCombiner
    ).withByteAlignment(8).withName("VkPhysicalDeviceFragmentShadingRatePropertiesKHR");

    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceFragmentShadingRatePropertiesKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceFragmentShadingRatePropertiesKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceFragmentShadingRatePropertiesKHR value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public vulkan.VkExtent2D minFragmentShadingRateAttachmentTexelSize() {return new vulkan.VkExtent2D(this.ptr.asSlice(OFFSET__minFragmentShadingRateAttachmentTexelSize, LAYOUT__minFragmentShadingRateAttachmentTexelSize));}
    public void minFragmentShadingRateAttachmentTexelSize(java.util.function.Consumer<vulkan.VkExtent2D> consumer) {consumer.accept(this.minFragmentShadingRateAttachmentTexelSize());}
    public void minFragmentShadingRateAttachmentTexelSize(vulkan.VkExtent2D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__minFragmentShadingRateAttachmentTexelSize, LAYOUT__minFragmentShadingRateAttachmentTexelSize.byteSize());}

    public vulkan.VkExtent2D maxFragmentShadingRateAttachmentTexelSize() {return new vulkan.VkExtent2D(this.ptr.asSlice(OFFSET__maxFragmentShadingRateAttachmentTexelSize, LAYOUT__maxFragmentShadingRateAttachmentTexelSize));}
    public void maxFragmentShadingRateAttachmentTexelSize(java.util.function.Consumer<vulkan.VkExtent2D> consumer) {consumer.accept(this.maxFragmentShadingRateAttachmentTexelSize());}
    public void maxFragmentShadingRateAttachmentTexelSize(vulkan.VkExtent2D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__maxFragmentShadingRateAttachmentTexelSize, LAYOUT__maxFragmentShadingRateAttachmentTexelSize.byteSize());}

    public int maxFragmentShadingRateAttachmentTexelSizeAspectRatio() {return this.ptr.get(LAYOUT__maxFragmentShadingRateAttachmentTexelSizeAspectRatio, OFFSET__maxFragmentShadingRateAttachmentTexelSizeAspectRatio);}
    public void maxFragmentShadingRateAttachmentTexelSizeAspectRatio(int value) {this.ptr.set(LAYOUT__maxFragmentShadingRateAttachmentTexelSizeAspectRatio, OFFSET__maxFragmentShadingRateAttachmentTexelSizeAspectRatio, value);}
    public java.lang.foreign.MemorySegment $maxFragmentShadingRateAttachmentTexelSizeAspectRatio() {return this.ptr.asSlice(OFFSET__maxFragmentShadingRateAttachmentTexelSizeAspectRatio, LAYOUT__maxFragmentShadingRateAttachmentTexelSizeAspectRatio);}

    public int primitiveFragmentShadingRateWithMultipleViewports() {return this.ptr.get(LAYOUT__primitiveFragmentShadingRateWithMultipleViewports, OFFSET__primitiveFragmentShadingRateWithMultipleViewports);}
    public void primitiveFragmentShadingRateWithMultipleViewports(int value) {this.ptr.set(LAYOUT__primitiveFragmentShadingRateWithMultipleViewports, OFFSET__primitiveFragmentShadingRateWithMultipleViewports, value);}
    public java.lang.foreign.MemorySegment $primitiveFragmentShadingRateWithMultipleViewports() {return this.ptr.asSlice(OFFSET__primitiveFragmentShadingRateWithMultipleViewports, LAYOUT__primitiveFragmentShadingRateWithMultipleViewports);}

    public int layeredShadingRateAttachments() {return this.ptr.get(LAYOUT__layeredShadingRateAttachments, OFFSET__layeredShadingRateAttachments);}
    public void layeredShadingRateAttachments(int value) {this.ptr.set(LAYOUT__layeredShadingRateAttachments, OFFSET__layeredShadingRateAttachments, value);}
    public java.lang.foreign.MemorySegment $layeredShadingRateAttachments() {return this.ptr.asSlice(OFFSET__layeredShadingRateAttachments, LAYOUT__layeredShadingRateAttachments);}

    public int fragmentShadingRateNonTrivialCombinerOps() {return this.ptr.get(LAYOUT__fragmentShadingRateNonTrivialCombinerOps, OFFSET__fragmentShadingRateNonTrivialCombinerOps);}
    public void fragmentShadingRateNonTrivialCombinerOps(int value) {this.ptr.set(LAYOUT__fragmentShadingRateNonTrivialCombinerOps, OFFSET__fragmentShadingRateNonTrivialCombinerOps, value);}
    public java.lang.foreign.MemorySegment $fragmentShadingRateNonTrivialCombinerOps() {return this.ptr.asSlice(OFFSET__fragmentShadingRateNonTrivialCombinerOps, LAYOUT__fragmentShadingRateNonTrivialCombinerOps);}

    public vulkan.VkExtent2D maxFragmentSize() {return new vulkan.VkExtent2D(this.ptr.asSlice(OFFSET__maxFragmentSize, LAYOUT__maxFragmentSize));}
    public void maxFragmentSize(java.util.function.Consumer<vulkan.VkExtent2D> consumer) {consumer.accept(this.maxFragmentSize());}
    public void maxFragmentSize(vulkan.VkExtent2D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__maxFragmentSize, LAYOUT__maxFragmentSize.byteSize());}

    public int maxFragmentSizeAspectRatio() {return this.ptr.get(LAYOUT__maxFragmentSizeAspectRatio, OFFSET__maxFragmentSizeAspectRatio);}
    public void maxFragmentSizeAspectRatio(int value) {this.ptr.set(LAYOUT__maxFragmentSizeAspectRatio, OFFSET__maxFragmentSizeAspectRatio, value);}
    public java.lang.foreign.MemorySegment $maxFragmentSizeAspectRatio() {return this.ptr.asSlice(OFFSET__maxFragmentSizeAspectRatio, LAYOUT__maxFragmentSizeAspectRatio);}

    public int maxFragmentShadingRateCoverageSamples() {return this.ptr.get(LAYOUT__maxFragmentShadingRateCoverageSamples, OFFSET__maxFragmentShadingRateCoverageSamples);}
    public void maxFragmentShadingRateCoverageSamples(int value) {this.ptr.set(LAYOUT__maxFragmentShadingRateCoverageSamples, OFFSET__maxFragmentShadingRateCoverageSamples, value);}
    public java.lang.foreign.MemorySegment $maxFragmentShadingRateCoverageSamples() {return this.ptr.asSlice(OFFSET__maxFragmentShadingRateCoverageSamples, LAYOUT__maxFragmentShadingRateCoverageSamples);}

    public int maxFragmentShadingRateRasterizationSamples() {return this.ptr.get(LAYOUT__maxFragmentShadingRateRasterizationSamples, OFFSET__maxFragmentShadingRateRasterizationSamples);}
    public void maxFragmentShadingRateRasterizationSamples(int value) {this.ptr.set(LAYOUT__maxFragmentShadingRateRasterizationSamples, OFFSET__maxFragmentShadingRateRasterizationSamples, value);}
    public java.lang.foreign.MemorySegment $maxFragmentShadingRateRasterizationSamples() {return this.ptr.asSlice(OFFSET__maxFragmentShadingRateRasterizationSamples, LAYOUT__maxFragmentShadingRateRasterizationSamples);}

    public int fragmentShadingRateWithShaderDepthStencilWrites() {return this.ptr.get(LAYOUT__fragmentShadingRateWithShaderDepthStencilWrites, OFFSET__fragmentShadingRateWithShaderDepthStencilWrites);}
    public void fragmentShadingRateWithShaderDepthStencilWrites(int value) {this.ptr.set(LAYOUT__fragmentShadingRateWithShaderDepthStencilWrites, OFFSET__fragmentShadingRateWithShaderDepthStencilWrites, value);}
    public java.lang.foreign.MemorySegment $fragmentShadingRateWithShaderDepthStencilWrites() {return this.ptr.asSlice(OFFSET__fragmentShadingRateWithShaderDepthStencilWrites, LAYOUT__fragmentShadingRateWithShaderDepthStencilWrites);}

    public int fragmentShadingRateWithSampleMask() {return this.ptr.get(LAYOUT__fragmentShadingRateWithSampleMask, OFFSET__fragmentShadingRateWithSampleMask);}
    public void fragmentShadingRateWithSampleMask(int value) {this.ptr.set(LAYOUT__fragmentShadingRateWithSampleMask, OFFSET__fragmentShadingRateWithSampleMask, value);}
    public java.lang.foreign.MemorySegment $fragmentShadingRateWithSampleMask() {return this.ptr.asSlice(OFFSET__fragmentShadingRateWithSampleMask, LAYOUT__fragmentShadingRateWithSampleMask);}

    public int fragmentShadingRateWithShaderSampleMask() {return this.ptr.get(LAYOUT__fragmentShadingRateWithShaderSampleMask, OFFSET__fragmentShadingRateWithShaderSampleMask);}
    public void fragmentShadingRateWithShaderSampleMask(int value) {this.ptr.set(LAYOUT__fragmentShadingRateWithShaderSampleMask, OFFSET__fragmentShadingRateWithShaderSampleMask, value);}
    public java.lang.foreign.MemorySegment $fragmentShadingRateWithShaderSampleMask() {return this.ptr.asSlice(OFFSET__fragmentShadingRateWithShaderSampleMask, LAYOUT__fragmentShadingRateWithShaderSampleMask);}

    public int fragmentShadingRateWithConservativeRasterization() {return this.ptr.get(LAYOUT__fragmentShadingRateWithConservativeRasterization, OFFSET__fragmentShadingRateWithConservativeRasterization);}
    public void fragmentShadingRateWithConservativeRasterization(int value) {this.ptr.set(LAYOUT__fragmentShadingRateWithConservativeRasterization, OFFSET__fragmentShadingRateWithConservativeRasterization, value);}
    public java.lang.foreign.MemorySegment $fragmentShadingRateWithConservativeRasterization() {return this.ptr.asSlice(OFFSET__fragmentShadingRateWithConservativeRasterization, LAYOUT__fragmentShadingRateWithConservativeRasterization);}

    public int fragmentShadingRateWithFragmentShaderInterlock() {return this.ptr.get(LAYOUT__fragmentShadingRateWithFragmentShaderInterlock, OFFSET__fragmentShadingRateWithFragmentShaderInterlock);}
    public void fragmentShadingRateWithFragmentShaderInterlock(int value) {this.ptr.set(LAYOUT__fragmentShadingRateWithFragmentShaderInterlock, OFFSET__fragmentShadingRateWithFragmentShaderInterlock, value);}
    public java.lang.foreign.MemorySegment $fragmentShadingRateWithFragmentShaderInterlock() {return this.ptr.asSlice(OFFSET__fragmentShadingRateWithFragmentShaderInterlock, LAYOUT__fragmentShadingRateWithFragmentShaderInterlock);}

    public int fragmentShadingRateWithCustomSampleLocations() {return this.ptr.get(LAYOUT__fragmentShadingRateWithCustomSampleLocations, OFFSET__fragmentShadingRateWithCustomSampleLocations);}
    public void fragmentShadingRateWithCustomSampleLocations(int value) {this.ptr.set(LAYOUT__fragmentShadingRateWithCustomSampleLocations, OFFSET__fragmentShadingRateWithCustomSampleLocations, value);}
    public java.lang.foreign.MemorySegment $fragmentShadingRateWithCustomSampleLocations() {return this.ptr.asSlice(OFFSET__fragmentShadingRateWithCustomSampleLocations, LAYOUT__fragmentShadingRateWithCustomSampleLocations);}

    public int fragmentShadingRateStrictMultiplyCombiner() {return this.ptr.get(LAYOUT__fragmentShadingRateStrictMultiplyCombiner, OFFSET__fragmentShadingRateStrictMultiplyCombiner);}
    public void fragmentShadingRateStrictMultiplyCombiner(int value) {this.ptr.set(LAYOUT__fragmentShadingRateStrictMultiplyCombiner, OFFSET__fragmentShadingRateStrictMultiplyCombiner, value);}
    public java.lang.foreign.MemorySegment $fragmentShadingRateStrictMultiplyCombiner() {return this.ptr.asSlice(OFFSET__fragmentShadingRateStrictMultiplyCombiner, LAYOUT__fragmentShadingRateStrictMultiplyCombiner);}
}
