package vulkan;

public record VkPhysicalDeviceDescriptorIndexingProperties(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxUpdateAfterBindDescriptorsInAllPools = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__maxUpdateAfterBindDescriptorsInAllPools = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderUniformBufferArrayNonUniformIndexingNative = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__shaderUniformBufferArrayNonUniformIndexingNative = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderSampledImageArrayNonUniformIndexingNative = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__shaderSampledImageArrayNonUniformIndexingNative = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderStorageBufferArrayNonUniformIndexingNative = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__shaderStorageBufferArrayNonUniformIndexingNative = 28;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderStorageImageArrayNonUniformIndexingNative = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__shaderStorageImageArrayNonUniformIndexingNative = 32;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderInputAttachmentArrayNonUniformIndexingNative = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__shaderInputAttachmentArrayNonUniformIndexingNative = 36;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__robustBufferAccessUpdateAfterBind = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__robustBufferAccessUpdateAfterBind = 40;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__quadDivergentImplicitLod = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__quadDivergentImplicitLod = 44;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxPerStageDescriptorUpdateAfterBindSamplers = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__maxPerStageDescriptorUpdateAfterBindSamplers = 48;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxPerStageDescriptorUpdateAfterBindUniformBuffers = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__maxPerStageDescriptorUpdateAfterBindUniformBuffers = 52;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxPerStageDescriptorUpdateAfterBindStorageBuffers = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__maxPerStageDescriptorUpdateAfterBindStorageBuffers = 56;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxPerStageDescriptorUpdateAfterBindSampledImages = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__maxPerStageDescriptorUpdateAfterBindSampledImages = 60;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxPerStageDescriptorUpdateAfterBindStorageImages = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__maxPerStageDescriptorUpdateAfterBindStorageImages = 64;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxPerStageDescriptorUpdateAfterBindInputAttachments = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__maxPerStageDescriptorUpdateAfterBindInputAttachments = 68;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxPerStageUpdateAfterBindResources = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__maxPerStageUpdateAfterBindResources = 72;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxDescriptorSetUpdateAfterBindSamplers = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__maxDescriptorSetUpdateAfterBindSamplers = 76;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxDescriptorSetUpdateAfterBindUniformBuffers = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__maxDescriptorSetUpdateAfterBindUniformBuffers = 80;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxDescriptorSetUpdateAfterBindUniformBuffersDynamic = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__maxDescriptorSetUpdateAfterBindUniformBuffersDynamic = 84;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxDescriptorSetUpdateAfterBindStorageBuffers = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__maxDescriptorSetUpdateAfterBindStorageBuffers = 88;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxDescriptorSetUpdateAfterBindStorageBuffersDynamic = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__maxDescriptorSetUpdateAfterBindStorageBuffersDynamic = 92;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxDescriptorSetUpdateAfterBindSampledImages = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__maxDescriptorSetUpdateAfterBindSampledImages = 96;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxDescriptorSetUpdateAfterBindStorageImages = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__maxDescriptorSetUpdateAfterBindStorageImages = 100;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxDescriptorSetUpdateAfterBindInputAttachments = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__maxDescriptorSetUpdateAfterBindInputAttachments = 104;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
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
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkPhysicalDeviceDescriptorIndexingProperties");

    public VkPhysicalDeviceDescriptorIndexingProperties(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceDescriptorIndexingProperties getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceDescriptorIndexingProperties(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceDescriptorIndexingProperties value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

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
}
