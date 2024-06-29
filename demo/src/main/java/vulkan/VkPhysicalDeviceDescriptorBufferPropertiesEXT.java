package vulkan;

public record VkPhysicalDeviceDescriptorBufferPropertiesEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__combinedImageSamplerDescriptorSingleArray = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__combinedImageSamplerDescriptorSingleArray = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__bufferlessPushDescriptors = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__bufferlessPushDescriptors = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__allowSamplerImageViewPostSubmitCreation = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__allowSamplerImageViewPostSubmitCreation = 24;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__descriptorBufferOffsetAlignment = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__descriptorBufferOffsetAlignment = 32;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxDescriptorBufferBindings = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__maxDescriptorBufferBindings = 40;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxResourceDescriptorBufferBindings = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__maxResourceDescriptorBufferBindings = 44;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxSamplerDescriptorBufferBindings = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__maxSamplerDescriptorBufferBindings = 48;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxEmbeddedImmutableSamplerBindings = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__maxEmbeddedImmutableSamplerBindings = 52;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxEmbeddedImmutableSamplers = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__maxEmbeddedImmutableSamplers = 56;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__bufferCaptureReplayDescriptorDataSize = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__bufferCaptureReplayDescriptorDataSize = 64;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__imageCaptureReplayDescriptorDataSize = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__imageCaptureReplayDescriptorDataSize = 72;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__imageViewCaptureReplayDescriptorDataSize = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__imageViewCaptureReplayDescriptorDataSize = 80;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__samplerCaptureReplayDescriptorDataSize = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__samplerCaptureReplayDescriptorDataSize = 88;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__accelerationStructureCaptureReplayDescriptorDataSize = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__accelerationStructureCaptureReplayDescriptorDataSize = 96;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__samplerDescriptorSize = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__samplerDescriptorSize = 104;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__combinedImageSamplerDescriptorSize = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__combinedImageSamplerDescriptorSize = 112;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__sampledImageDescriptorSize = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__sampledImageDescriptorSize = 120;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__storageImageDescriptorSize = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__storageImageDescriptorSize = 128;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__uniformTexelBufferDescriptorSize = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__uniformTexelBufferDescriptorSize = 136;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__robustUniformTexelBufferDescriptorSize = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__robustUniformTexelBufferDescriptorSize = 144;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__storageTexelBufferDescriptorSize = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__storageTexelBufferDescriptorSize = 152;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__robustStorageTexelBufferDescriptorSize = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__robustStorageTexelBufferDescriptorSize = 160;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__uniformBufferDescriptorSize = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__uniformBufferDescriptorSize = 168;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__robustUniformBufferDescriptorSize = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__robustUniformBufferDescriptorSize = 176;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__storageBufferDescriptorSize = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__storageBufferDescriptorSize = 184;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__robustStorageBufferDescriptorSize = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__robustStorageBufferDescriptorSize = 192;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__inputAttachmentDescriptorSize = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__inputAttachmentDescriptorSize = 200;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__accelerationStructureDescriptorSize = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__accelerationStructureDescriptorSize = 208;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__maxSamplerDescriptorBufferRange = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__maxSamplerDescriptorBufferRange = 216;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__maxResourceDescriptorBufferRange = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__maxResourceDescriptorBufferRange = 224;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__samplerDescriptorBufferAddressSpaceSize = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__samplerDescriptorBufferAddressSpaceSize = 232;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__resourceDescriptorBufferAddressSpaceSize = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__resourceDescriptorBufferAddressSpaceSize = 240;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__descriptorBufferAddressSpaceSize = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__descriptorBufferAddressSpaceSize = 248;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__combinedImageSamplerDescriptorSingleArray,
            LAYOUT__bufferlessPushDescriptors,
            LAYOUT__allowSamplerImageViewPostSubmitCreation,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__descriptorBufferOffsetAlignment,
            LAYOUT__maxDescriptorBufferBindings,
            LAYOUT__maxResourceDescriptorBufferBindings,
            LAYOUT__maxSamplerDescriptorBufferBindings,
            LAYOUT__maxEmbeddedImmutableSamplerBindings,
            LAYOUT__maxEmbeddedImmutableSamplers,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__bufferCaptureReplayDescriptorDataSize,
            LAYOUT__imageCaptureReplayDescriptorDataSize,
            LAYOUT__imageViewCaptureReplayDescriptorDataSize,
            LAYOUT__samplerCaptureReplayDescriptorDataSize,
            LAYOUT__accelerationStructureCaptureReplayDescriptorDataSize,
            LAYOUT__samplerDescriptorSize,
            LAYOUT__combinedImageSamplerDescriptorSize,
            LAYOUT__sampledImageDescriptorSize,
            LAYOUT__storageImageDescriptorSize,
            LAYOUT__uniformTexelBufferDescriptorSize,
            LAYOUT__robustUniformTexelBufferDescriptorSize,
            LAYOUT__storageTexelBufferDescriptorSize,
            LAYOUT__robustStorageTexelBufferDescriptorSize,
            LAYOUT__uniformBufferDescriptorSize,
            LAYOUT__robustUniformBufferDescriptorSize,
            LAYOUT__storageBufferDescriptorSize,
            LAYOUT__robustStorageBufferDescriptorSize,
            LAYOUT__inputAttachmentDescriptorSize,
            LAYOUT__accelerationStructureDescriptorSize,
            LAYOUT__maxSamplerDescriptorBufferRange,
            LAYOUT__maxResourceDescriptorBufferRange,
            LAYOUT__samplerDescriptorBufferAddressSpaceSize,
            LAYOUT__resourceDescriptorBufferAddressSpaceSize,
            LAYOUT__descriptorBufferAddressSpaceSize
    ).withByteAlignment(8).withName("VkPhysicalDeviceDescriptorBufferPropertiesEXT");

    public VkPhysicalDeviceDescriptorBufferPropertiesEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceDescriptorBufferPropertiesEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceDescriptorBufferPropertiesEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceDescriptorBufferPropertiesEXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int combinedImageSamplerDescriptorSingleArray() {return this.ptr.get(LAYOUT__combinedImageSamplerDescriptorSingleArray, OFFSET__combinedImageSamplerDescriptorSingleArray);}
    public void combinedImageSamplerDescriptorSingleArray(int value) {this.ptr.set(LAYOUT__combinedImageSamplerDescriptorSingleArray, OFFSET__combinedImageSamplerDescriptorSingleArray, value);}
    public java.lang.foreign.MemorySegment $combinedImageSamplerDescriptorSingleArray() {return this.ptr.asSlice(OFFSET__combinedImageSamplerDescriptorSingleArray, LAYOUT__combinedImageSamplerDescriptorSingleArray);}

    public int bufferlessPushDescriptors() {return this.ptr.get(LAYOUT__bufferlessPushDescriptors, OFFSET__bufferlessPushDescriptors);}
    public void bufferlessPushDescriptors(int value) {this.ptr.set(LAYOUT__bufferlessPushDescriptors, OFFSET__bufferlessPushDescriptors, value);}
    public java.lang.foreign.MemorySegment $bufferlessPushDescriptors() {return this.ptr.asSlice(OFFSET__bufferlessPushDescriptors, LAYOUT__bufferlessPushDescriptors);}

    public int allowSamplerImageViewPostSubmitCreation() {return this.ptr.get(LAYOUT__allowSamplerImageViewPostSubmitCreation, OFFSET__allowSamplerImageViewPostSubmitCreation);}
    public void allowSamplerImageViewPostSubmitCreation(int value) {this.ptr.set(LAYOUT__allowSamplerImageViewPostSubmitCreation, OFFSET__allowSamplerImageViewPostSubmitCreation, value);}
    public java.lang.foreign.MemorySegment $allowSamplerImageViewPostSubmitCreation() {return this.ptr.asSlice(OFFSET__allowSamplerImageViewPostSubmitCreation, LAYOUT__allowSamplerImageViewPostSubmitCreation);}

    public long descriptorBufferOffsetAlignment() {return this.ptr.get(LAYOUT__descriptorBufferOffsetAlignment, OFFSET__descriptorBufferOffsetAlignment);}
    public void descriptorBufferOffsetAlignment(long value) {this.ptr.set(LAYOUT__descriptorBufferOffsetAlignment, OFFSET__descriptorBufferOffsetAlignment, value);}
    public java.lang.foreign.MemorySegment $descriptorBufferOffsetAlignment() {return this.ptr.asSlice(OFFSET__descriptorBufferOffsetAlignment, LAYOUT__descriptorBufferOffsetAlignment);}

    public int maxDescriptorBufferBindings() {return this.ptr.get(LAYOUT__maxDescriptorBufferBindings, OFFSET__maxDescriptorBufferBindings);}
    public void maxDescriptorBufferBindings(int value) {this.ptr.set(LAYOUT__maxDescriptorBufferBindings, OFFSET__maxDescriptorBufferBindings, value);}
    public java.lang.foreign.MemorySegment $maxDescriptorBufferBindings() {return this.ptr.asSlice(OFFSET__maxDescriptorBufferBindings, LAYOUT__maxDescriptorBufferBindings);}

    public int maxResourceDescriptorBufferBindings() {return this.ptr.get(LAYOUT__maxResourceDescriptorBufferBindings, OFFSET__maxResourceDescriptorBufferBindings);}
    public void maxResourceDescriptorBufferBindings(int value) {this.ptr.set(LAYOUT__maxResourceDescriptorBufferBindings, OFFSET__maxResourceDescriptorBufferBindings, value);}
    public java.lang.foreign.MemorySegment $maxResourceDescriptorBufferBindings() {return this.ptr.asSlice(OFFSET__maxResourceDescriptorBufferBindings, LAYOUT__maxResourceDescriptorBufferBindings);}

    public int maxSamplerDescriptorBufferBindings() {return this.ptr.get(LAYOUT__maxSamplerDescriptorBufferBindings, OFFSET__maxSamplerDescriptorBufferBindings);}
    public void maxSamplerDescriptorBufferBindings(int value) {this.ptr.set(LAYOUT__maxSamplerDescriptorBufferBindings, OFFSET__maxSamplerDescriptorBufferBindings, value);}
    public java.lang.foreign.MemorySegment $maxSamplerDescriptorBufferBindings() {return this.ptr.asSlice(OFFSET__maxSamplerDescriptorBufferBindings, LAYOUT__maxSamplerDescriptorBufferBindings);}

    public int maxEmbeddedImmutableSamplerBindings() {return this.ptr.get(LAYOUT__maxEmbeddedImmutableSamplerBindings, OFFSET__maxEmbeddedImmutableSamplerBindings);}
    public void maxEmbeddedImmutableSamplerBindings(int value) {this.ptr.set(LAYOUT__maxEmbeddedImmutableSamplerBindings, OFFSET__maxEmbeddedImmutableSamplerBindings, value);}
    public java.lang.foreign.MemorySegment $maxEmbeddedImmutableSamplerBindings() {return this.ptr.asSlice(OFFSET__maxEmbeddedImmutableSamplerBindings, LAYOUT__maxEmbeddedImmutableSamplerBindings);}

    public int maxEmbeddedImmutableSamplers() {return this.ptr.get(LAYOUT__maxEmbeddedImmutableSamplers, OFFSET__maxEmbeddedImmutableSamplers);}
    public void maxEmbeddedImmutableSamplers(int value) {this.ptr.set(LAYOUT__maxEmbeddedImmutableSamplers, OFFSET__maxEmbeddedImmutableSamplers, value);}
    public java.lang.foreign.MemorySegment $maxEmbeddedImmutableSamplers() {return this.ptr.asSlice(OFFSET__maxEmbeddedImmutableSamplers, LAYOUT__maxEmbeddedImmutableSamplers);}

    public long bufferCaptureReplayDescriptorDataSize() {return this.ptr.get(LAYOUT__bufferCaptureReplayDescriptorDataSize, OFFSET__bufferCaptureReplayDescriptorDataSize);}
    public void bufferCaptureReplayDescriptorDataSize(long value) {this.ptr.set(LAYOUT__bufferCaptureReplayDescriptorDataSize, OFFSET__bufferCaptureReplayDescriptorDataSize, value);}
    public java.lang.foreign.MemorySegment $bufferCaptureReplayDescriptorDataSize() {return this.ptr.asSlice(OFFSET__bufferCaptureReplayDescriptorDataSize, LAYOUT__bufferCaptureReplayDescriptorDataSize);}

    public long imageCaptureReplayDescriptorDataSize() {return this.ptr.get(LAYOUT__imageCaptureReplayDescriptorDataSize, OFFSET__imageCaptureReplayDescriptorDataSize);}
    public void imageCaptureReplayDescriptorDataSize(long value) {this.ptr.set(LAYOUT__imageCaptureReplayDescriptorDataSize, OFFSET__imageCaptureReplayDescriptorDataSize, value);}
    public java.lang.foreign.MemorySegment $imageCaptureReplayDescriptorDataSize() {return this.ptr.asSlice(OFFSET__imageCaptureReplayDescriptorDataSize, LAYOUT__imageCaptureReplayDescriptorDataSize);}

    public long imageViewCaptureReplayDescriptorDataSize() {return this.ptr.get(LAYOUT__imageViewCaptureReplayDescriptorDataSize, OFFSET__imageViewCaptureReplayDescriptorDataSize);}
    public void imageViewCaptureReplayDescriptorDataSize(long value) {this.ptr.set(LAYOUT__imageViewCaptureReplayDescriptorDataSize, OFFSET__imageViewCaptureReplayDescriptorDataSize, value);}
    public java.lang.foreign.MemorySegment $imageViewCaptureReplayDescriptorDataSize() {return this.ptr.asSlice(OFFSET__imageViewCaptureReplayDescriptorDataSize, LAYOUT__imageViewCaptureReplayDescriptorDataSize);}

    public long samplerCaptureReplayDescriptorDataSize() {return this.ptr.get(LAYOUT__samplerCaptureReplayDescriptorDataSize, OFFSET__samplerCaptureReplayDescriptorDataSize);}
    public void samplerCaptureReplayDescriptorDataSize(long value) {this.ptr.set(LAYOUT__samplerCaptureReplayDescriptorDataSize, OFFSET__samplerCaptureReplayDescriptorDataSize, value);}
    public java.lang.foreign.MemorySegment $samplerCaptureReplayDescriptorDataSize() {return this.ptr.asSlice(OFFSET__samplerCaptureReplayDescriptorDataSize, LAYOUT__samplerCaptureReplayDescriptorDataSize);}

    public long accelerationStructureCaptureReplayDescriptorDataSize() {return this.ptr.get(LAYOUT__accelerationStructureCaptureReplayDescriptorDataSize, OFFSET__accelerationStructureCaptureReplayDescriptorDataSize);}
    public void accelerationStructureCaptureReplayDescriptorDataSize(long value) {this.ptr.set(LAYOUT__accelerationStructureCaptureReplayDescriptorDataSize, OFFSET__accelerationStructureCaptureReplayDescriptorDataSize, value);}
    public java.lang.foreign.MemorySegment $accelerationStructureCaptureReplayDescriptorDataSize() {return this.ptr.asSlice(OFFSET__accelerationStructureCaptureReplayDescriptorDataSize, LAYOUT__accelerationStructureCaptureReplayDescriptorDataSize);}

    public long samplerDescriptorSize() {return this.ptr.get(LAYOUT__samplerDescriptorSize, OFFSET__samplerDescriptorSize);}
    public void samplerDescriptorSize(long value) {this.ptr.set(LAYOUT__samplerDescriptorSize, OFFSET__samplerDescriptorSize, value);}
    public java.lang.foreign.MemorySegment $samplerDescriptorSize() {return this.ptr.asSlice(OFFSET__samplerDescriptorSize, LAYOUT__samplerDescriptorSize);}

    public long combinedImageSamplerDescriptorSize() {return this.ptr.get(LAYOUT__combinedImageSamplerDescriptorSize, OFFSET__combinedImageSamplerDescriptorSize);}
    public void combinedImageSamplerDescriptorSize(long value) {this.ptr.set(LAYOUT__combinedImageSamplerDescriptorSize, OFFSET__combinedImageSamplerDescriptorSize, value);}
    public java.lang.foreign.MemorySegment $combinedImageSamplerDescriptorSize() {return this.ptr.asSlice(OFFSET__combinedImageSamplerDescriptorSize, LAYOUT__combinedImageSamplerDescriptorSize);}

    public long sampledImageDescriptorSize() {return this.ptr.get(LAYOUT__sampledImageDescriptorSize, OFFSET__sampledImageDescriptorSize);}
    public void sampledImageDescriptorSize(long value) {this.ptr.set(LAYOUT__sampledImageDescriptorSize, OFFSET__sampledImageDescriptorSize, value);}
    public java.lang.foreign.MemorySegment $sampledImageDescriptorSize() {return this.ptr.asSlice(OFFSET__sampledImageDescriptorSize, LAYOUT__sampledImageDescriptorSize);}

    public long storageImageDescriptorSize() {return this.ptr.get(LAYOUT__storageImageDescriptorSize, OFFSET__storageImageDescriptorSize);}
    public void storageImageDescriptorSize(long value) {this.ptr.set(LAYOUT__storageImageDescriptorSize, OFFSET__storageImageDescriptorSize, value);}
    public java.lang.foreign.MemorySegment $storageImageDescriptorSize() {return this.ptr.asSlice(OFFSET__storageImageDescriptorSize, LAYOUT__storageImageDescriptorSize);}

    public long uniformTexelBufferDescriptorSize() {return this.ptr.get(LAYOUT__uniformTexelBufferDescriptorSize, OFFSET__uniformTexelBufferDescriptorSize);}
    public void uniformTexelBufferDescriptorSize(long value) {this.ptr.set(LAYOUT__uniformTexelBufferDescriptorSize, OFFSET__uniformTexelBufferDescriptorSize, value);}
    public java.lang.foreign.MemorySegment $uniformTexelBufferDescriptorSize() {return this.ptr.asSlice(OFFSET__uniformTexelBufferDescriptorSize, LAYOUT__uniformTexelBufferDescriptorSize);}

    public long robustUniformTexelBufferDescriptorSize() {return this.ptr.get(LAYOUT__robustUniformTexelBufferDescriptorSize, OFFSET__robustUniformTexelBufferDescriptorSize);}
    public void robustUniformTexelBufferDescriptorSize(long value) {this.ptr.set(LAYOUT__robustUniformTexelBufferDescriptorSize, OFFSET__robustUniformTexelBufferDescriptorSize, value);}
    public java.lang.foreign.MemorySegment $robustUniformTexelBufferDescriptorSize() {return this.ptr.asSlice(OFFSET__robustUniformTexelBufferDescriptorSize, LAYOUT__robustUniformTexelBufferDescriptorSize);}

    public long storageTexelBufferDescriptorSize() {return this.ptr.get(LAYOUT__storageTexelBufferDescriptorSize, OFFSET__storageTexelBufferDescriptorSize);}
    public void storageTexelBufferDescriptorSize(long value) {this.ptr.set(LAYOUT__storageTexelBufferDescriptorSize, OFFSET__storageTexelBufferDescriptorSize, value);}
    public java.lang.foreign.MemorySegment $storageTexelBufferDescriptorSize() {return this.ptr.asSlice(OFFSET__storageTexelBufferDescriptorSize, LAYOUT__storageTexelBufferDescriptorSize);}

    public long robustStorageTexelBufferDescriptorSize() {return this.ptr.get(LAYOUT__robustStorageTexelBufferDescriptorSize, OFFSET__robustStorageTexelBufferDescriptorSize);}
    public void robustStorageTexelBufferDescriptorSize(long value) {this.ptr.set(LAYOUT__robustStorageTexelBufferDescriptorSize, OFFSET__robustStorageTexelBufferDescriptorSize, value);}
    public java.lang.foreign.MemorySegment $robustStorageTexelBufferDescriptorSize() {return this.ptr.asSlice(OFFSET__robustStorageTexelBufferDescriptorSize, LAYOUT__robustStorageTexelBufferDescriptorSize);}

    public long uniformBufferDescriptorSize() {return this.ptr.get(LAYOUT__uniformBufferDescriptorSize, OFFSET__uniformBufferDescriptorSize);}
    public void uniformBufferDescriptorSize(long value) {this.ptr.set(LAYOUT__uniformBufferDescriptorSize, OFFSET__uniformBufferDescriptorSize, value);}
    public java.lang.foreign.MemorySegment $uniformBufferDescriptorSize() {return this.ptr.asSlice(OFFSET__uniformBufferDescriptorSize, LAYOUT__uniformBufferDescriptorSize);}

    public long robustUniformBufferDescriptorSize() {return this.ptr.get(LAYOUT__robustUniformBufferDescriptorSize, OFFSET__robustUniformBufferDescriptorSize);}
    public void robustUniformBufferDescriptorSize(long value) {this.ptr.set(LAYOUT__robustUniformBufferDescriptorSize, OFFSET__robustUniformBufferDescriptorSize, value);}
    public java.lang.foreign.MemorySegment $robustUniformBufferDescriptorSize() {return this.ptr.asSlice(OFFSET__robustUniformBufferDescriptorSize, LAYOUT__robustUniformBufferDescriptorSize);}

    public long storageBufferDescriptorSize() {return this.ptr.get(LAYOUT__storageBufferDescriptorSize, OFFSET__storageBufferDescriptorSize);}
    public void storageBufferDescriptorSize(long value) {this.ptr.set(LAYOUT__storageBufferDescriptorSize, OFFSET__storageBufferDescriptorSize, value);}
    public java.lang.foreign.MemorySegment $storageBufferDescriptorSize() {return this.ptr.asSlice(OFFSET__storageBufferDescriptorSize, LAYOUT__storageBufferDescriptorSize);}

    public long robustStorageBufferDescriptorSize() {return this.ptr.get(LAYOUT__robustStorageBufferDescriptorSize, OFFSET__robustStorageBufferDescriptorSize);}
    public void robustStorageBufferDescriptorSize(long value) {this.ptr.set(LAYOUT__robustStorageBufferDescriptorSize, OFFSET__robustStorageBufferDescriptorSize, value);}
    public java.lang.foreign.MemorySegment $robustStorageBufferDescriptorSize() {return this.ptr.asSlice(OFFSET__robustStorageBufferDescriptorSize, LAYOUT__robustStorageBufferDescriptorSize);}

    public long inputAttachmentDescriptorSize() {return this.ptr.get(LAYOUT__inputAttachmentDescriptorSize, OFFSET__inputAttachmentDescriptorSize);}
    public void inputAttachmentDescriptorSize(long value) {this.ptr.set(LAYOUT__inputAttachmentDescriptorSize, OFFSET__inputAttachmentDescriptorSize, value);}
    public java.lang.foreign.MemorySegment $inputAttachmentDescriptorSize() {return this.ptr.asSlice(OFFSET__inputAttachmentDescriptorSize, LAYOUT__inputAttachmentDescriptorSize);}

    public long accelerationStructureDescriptorSize() {return this.ptr.get(LAYOUT__accelerationStructureDescriptorSize, OFFSET__accelerationStructureDescriptorSize);}
    public void accelerationStructureDescriptorSize(long value) {this.ptr.set(LAYOUT__accelerationStructureDescriptorSize, OFFSET__accelerationStructureDescriptorSize, value);}
    public java.lang.foreign.MemorySegment $accelerationStructureDescriptorSize() {return this.ptr.asSlice(OFFSET__accelerationStructureDescriptorSize, LAYOUT__accelerationStructureDescriptorSize);}

    public long maxSamplerDescriptorBufferRange() {return this.ptr.get(LAYOUT__maxSamplerDescriptorBufferRange, OFFSET__maxSamplerDescriptorBufferRange);}
    public void maxSamplerDescriptorBufferRange(long value) {this.ptr.set(LAYOUT__maxSamplerDescriptorBufferRange, OFFSET__maxSamplerDescriptorBufferRange, value);}
    public java.lang.foreign.MemorySegment $maxSamplerDescriptorBufferRange() {return this.ptr.asSlice(OFFSET__maxSamplerDescriptorBufferRange, LAYOUT__maxSamplerDescriptorBufferRange);}

    public long maxResourceDescriptorBufferRange() {return this.ptr.get(LAYOUT__maxResourceDescriptorBufferRange, OFFSET__maxResourceDescriptorBufferRange);}
    public void maxResourceDescriptorBufferRange(long value) {this.ptr.set(LAYOUT__maxResourceDescriptorBufferRange, OFFSET__maxResourceDescriptorBufferRange, value);}
    public java.lang.foreign.MemorySegment $maxResourceDescriptorBufferRange() {return this.ptr.asSlice(OFFSET__maxResourceDescriptorBufferRange, LAYOUT__maxResourceDescriptorBufferRange);}

    public long samplerDescriptorBufferAddressSpaceSize() {return this.ptr.get(LAYOUT__samplerDescriptorBufferAddressSpaceSize, OFFSET__samplerDescriptorBufferAddressSpaceSize);}
    public void samplerDescriptorBufferAddressSpaceSize(long value) {this.ptr.set(LAYOUT__samplerDescriptorBufferAddressSpaceSize, OFFSET__samplerDescriptorBufferAddressSpaceSize, value);}
    public java.lang.foreign.MemorySegment $samplerDescriptorBufferAddressSpaceSize() {return this.ptr.asSlice(OFFSET__samplerDescriptorBufferAddressSpaceSize, LAYOUT__samplerDescriptorBufferAddressSpaceSize);}

    public long resourceDescriptorBufferAddressSpaceSize() {return this.ptr.get(LAYOUT__resourceDescriptorBufferAddressSpaceSize, OFFSET__resourceDescriptorBufferAddressSpaceSize);}
    public void resourceDescriptorBufferAddressSpaceSize(long value) {this.ptr.set(LAYOUT__resourceDescriptorBufferAddressSpaceSize, OFFSET__resourceDescriptorBufferAddressSpaceSize, value);}
    public java.lang.foreign.MemorySegment $resourceDescriptorBufferAddressSpaceSize() {return this.ptr.asSlice(OFFSET__resourceDescriptorBufferAddressSpaceSize, LAYOUT__resourceDescriptorBufferAddressSpaceSize);}

    public long descriptorBufferAddressSpaceSize() {return this.ptr.get(LAYOUT__descriptorBufferAddressSpaceSize, OFFSET__descriptorBufferAddressSpaceSize);}
    public void descriptorBufferAddressSpaceSize(long value) {this.ptr.set(LAYOUT__descriptorBufferAddressSpaceSize, OFFSET__descriptorBufferAddressSpaceSize, value);}
    public java.lang.foreign.MemorySegment $descriptorBufferAddressSpaceSize() {return this.ptr.asSlice(OFFSET__descriptorBufferAddressSpaceSize, LAYOUT__descriptorBufferAddressSpaceSize);}
}
