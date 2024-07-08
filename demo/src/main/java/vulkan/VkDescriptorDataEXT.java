package vulkan;

public record VkDescriptorDataEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.AddressLayout LAYOUT__pSampler = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pSampler");
    public static final long OFFSET__pSampler = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pCombinedImageSampler = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pCombinedImageSampler");
    public static final long OFFSET__pCombinedImageSampler = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pInputAttachmentImage = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pInputAttachmentImage");
    public static final long OFFSET__pInputAttachmentImage = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pSampledImage = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pSampledImage");
    public static final long OFFSET__pSampledImage = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pStorageImage = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pStorageImage");
    public static final long OFFSET__pStorageImage = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pUniformTexelBuffer = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pUniformTexelBuffer");
    public static final long OFFSET__pUniformTexelBuffer = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pStorageTexelBuffer = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pStorageTexelBuffer");
    public static final long OFFSET__pStorageTexelBuffer = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pUniformBuffer = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pUniformBuffer");
    public static final long OFFSET__pUniformBuffer = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pStorageBuffer = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pStorageBuffer");
    public static final long OFFSET__pStorageBuffer = 0;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__accelerationStructure = java.lang.foreign.ValueLayout.JAVA_LONG.withName("accelerationStructure");
    public static final long OFFSET__accelerationStructure = 0;

    public static final java.lang.foreign.UnionLayout gRecordLayout = java.lang.foreign.MemoryLayout.unionLayout(
            LAYOUT__pSampler,
            LAYOUT__pCombinedImageSampler,
            LAYOUT__pInputAttachmentImage,
            LAYOUT__pSampledImage,
            LAYOUT__pStorageImage,
            LAYOUT__pUniformTexelBuffer,
            LAYOUT__pStorageTexelBuffer,
            LAYOUT__pUniformBuffer,
            LAYOUT__pStorageBuffer,
            LAYOUT__accelerationStructure
    ).withByteAlignment(8).withName("VkDescriptorDataEXT");

    public VkDescriptorDataEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkDescriptorDataEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkDescriptorDataEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkDescriptorDataEXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public java.lang.foreign.MemorySegment pSampler() {return this.ptr.get(LAYOUT__pSampler, OFFSET__pSampler);}
    public void pSampler(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pSampler, OFFSET__pSampler, value);}
    public java.lang.foreign.MemorySegment $pSampler() {return this.ptr.asSlice(OFFSET__pSampler, LAYOUT__pSampler);}

    public java.lang.foreign.MemorySegment pCombinedImageSampler() {return this.ptr.get(LAYOUT__pCombinedImageSampler, OFFSET__pCombinedImageSampler);}
    public void pCombinedImageSampler(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pCombinedImageSampler, OFFSET__pCombinedImageSampler, value);}
    public java.lang.foreign.MemorySegment $pCombinedImageSampler() {return this.ptr.asSlice(OFFSET__pCombinedImageSampler, LAYOUT__pCombinedImageSampler);}

    public java.lang.foreign.MemorySegment pInputAttachmentImage() {return this.ptr.get(LAYOUT__pInputAttachmentImage, OFFSET__pInputAttachmentImage);}
    public void pInputAttachmentImage(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pInputAttachmentImage, OFFSET__pInputAttachmentImage, value);}
    public java.lang.foreign.MemorySegment $pInputAttachmentImage() {return this.ptr.asSlice(OFFSET__pInputAttachmentImage, LAYOUT__pInputAttachmentImage);}

    public java.lang.foreign.MemorySegment pSampledImage() {return this.ptr.get(LAYOUT__pSampledImage, OFFSET__pSampledImage);}
    public void pSampledImage(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pSampledImage, OFFSET__pSampledImage, value);}
    public java.lang.foreign.MemorySegment $pSampledImage() {return this.ptr.asSlice(OFFSET__pSampledImage, LAYOUT__pSampledImage);}

    public java.lang.foreign.MemorySegment pStorageImage() {return this.ptr.get(LAYOUT__pStorageImage, OFFSET__pStorageImage);}
    public void pStorageImage(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pStorageImage, OFFSET__pStorageImage, value);}
    public java.lang.foreign.MemorySegment $pStorageImage() {return this.ptr.asSlice(OFFSET__pStorageImage, LAYOUT__pStorageImage);}

    public java.lang.foreign.MemorySegment pUniformTexelBuffer() {return this.ptr.get(LAYOUT__pUniformTexelBuffer, OFFSET__pUniformTexelBuffer);}
    public void pUniformTexelBuffer(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pUniformTexelBuffer, OFFSET__pUniformTexelBuffer, value);}
    public java.lang.foreign.MemorySegment $pUniformTexelBuffer() {return this.ptr.asSlice(OFFSET__pUniformTexelBuffer, LAYOUT__pUniformTexelBuffer);}

    public java.lang.foreign.MemorySegment pStorageTexelBuffer() {return this.ptr.get(LAYOUT__pStorageTexelBuffer, OFFSET__pStorageTexelBuffer);}
    public void pStorageTexelBuffer(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pStorageTexelBuffer, OFFSET__pStorageTexelBuffer, value);}
    public java.lang.foreign.MemorySegment $pStorageTexelBuffer() {return this.ptr.asSlice(OFFSET__pStorageTexelBuffer, LAYOUT__pStorageTexelBuffer);}

    public java.lang.foreign.MemorySegment pUniformBuffer() {return this.ptr.get(LAYOUT__pUniformBuffer, OFFSET__pUniformBuffer);}
    public void pUniformBuffer(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pUniformBuffer, OFFSET__pUniformBuffer, value);}
    public java.lang.foreign.MemorySegment $pUniformBuffer() {return this.ptr.asSlice(OFFSET__pUniformBuffer, LAYOUT__pUniformBuffer);}

    public java.lang.foreign.MemorySegment pStorageBuffer() {return this.ptr.get(LAYOUT__pStorageBuffer, OFFSET__pStorageBuffer);}
    public void pStorageBuffer(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pStorageBuffer, OFFSET__pStorageBuffer, value);}
    public java.lang.foreign.MemorySegment $pStorageBuffer() {return this.ptr.asSlice(OFFSET__pStorageBuffer, LAYOUT__pStorageBuffer);}

    public long accelerationStructure() {return this.ptr.get(LAYOUT__accelerationStructure, OFFSET__accelerationStructure);}
    public void accelerationStructure(long value) {this.ptr.set(LAYOUT__accelerationStructure, OFFSET__accelerationStructure, value);}
    public java.lang.foreign.MemorySegment $accelerationStructure() {return this.ptr.asSlice(OFFSET__accelerationStructure, LAYOUT__accelerationStructure);}
}
