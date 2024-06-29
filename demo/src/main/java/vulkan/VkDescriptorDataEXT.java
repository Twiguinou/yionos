package vulkan;

public record VkDescriptorDataEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.AddressLayout LAYOUT__pSampler = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final java.lang.foreign.AddressLayout LAYOUT__pCombinedImageSampler = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final java.lang.foreign.AddressLayout LAYOUT__pInputAttachmentImage = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final java.lang.foreign.AddressLayout LAYOUT__pSampledImage = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final java.lang.foreign.AddressLayout LAYOUT__pStorageImage = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final java.lang.foreign.AddressLayout LAYOUT__pUniformTexelBuffer = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final java.lang.foreign.AddressLayout LAYOUT__pStorageTexelBuffer = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final java.lang.foreign.AddressLayout LAYOUT__pUniformBuffer = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final java.lang.foreign.AddressLayout LAYOUT__pStorageBuffer = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__accelerationStructure = java.lang.foreign.ValueLayout.JAVA_LONG;

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

    public java.lang.foreign.MemorySegment pSampler() {return this.ptr.get(LAYOUT__pSampler, 0);}
    public void pSampler(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pSampler, 0, value);}
    public java.lang.foreign.MemorySegment $pSampler() {return this.ptr.asSlice(0, LAYOUT__pSampler);}

    public java.lang.foreign.MemorySegment pCombinedImageSampler() {return this.ptr.get(LAYOUT__pCombinedImageSampler, 0);}
    public void pCombinedImageSampler(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pCombinedImageSampler, 0, value);}
    public java.lang.foreign.MemorySegment $pCombinedImageSampler() {return this.ptr.asSlice(0, LAYOUT__pCombinedImageSampler);}

    public java.lang.foreign.MemorySegment pInputAttachmentImage() {return this.ptr.get(LAYOUT__pInputAttachmentImage, 0);}
    public void pInputAttachmentImage(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pInputAttachmentImage, 0, value);}
    public java.lang.foreign.MemorySegment $pInputAttachmentImage() {return this.ptr.asSlice(0, LAYOUT__pInputAttachmentImage);}

    public java.lang.foreign.MemorySegment pSampledImage() {return this.ptr.get(LAYOUT__pSampledImage, 0);}
    public void pSampledImage(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pSampledImage, 0, value);}
    public java.lang.foreign.MemorySegment $pSampledImage() {return this.ptr.asSlice(0, LAYOUT__pSampledImage);}

    public java.lang.foreign.MemorySegment pStorageImage() {return this.ptr.get(LAYOUT__pStorageImage, 0);}
    public void pStorageImage(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pStorageImage, 0, value);}
    public java.lang.foreign.MemorySegment $pStorageImage() {return this.ptr.asSlice(0, LAYOUT__pStorageImage);}

    public java.lang.foreign.MemorySegment pUniformTexelBuffer() {return this.ptr.get(LAYOUT__pUniformTexelBuffer, 0);}
    public void pUniformTexelBuffer(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pUniformTexelBuffer, 0, value);}
    public java.lang.foreign.MemorySegment $pUniformTexelBuffer() {return this.ptr.asSlice(0, LAYOUT__pUniformTexelBuffer);}

    public java.lang.foreign.MemorySegment pStorageTexelBuffer() {return this.ptr.get(LAYOUT__pStorageTexelBuffer, 0);}
    public void pStorageTexelBuffer(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pStorageTexelBuffer, 0, value);}
    public java.lang.foreign.MemorySegment $pStorageTexelBuffer() {return this.ptr.asSlice(0, LAYOUT__pStorageTexelBuffer);}

    public java.lang.foreign.MemorySegment pUniformBuffer() {return this.ptr.get(LAYOUT__pUniformBuffer, 0);}
    public void pUniformBuffer(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pUniformBuffer, 0, value);}
    public java.lang.foreign.MemorySegment $pUniformBuffer() {return this.ptr.asSlice(0, LAYOUT__pUniformBuffer);}

    public java.lang.foreign.MemorySegment pStorageBuffer() {return this.ptr.get(LAYOUT__pStorageBuffer, 0);}
    public void pStorageBuffer(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pStorageBuffer, 0, value);}
    public java.lang.foreign.MemorySegment $pStorageBuffer() {return this.ptr.asSlice(0, LAYOUT__pStorageBuffer);}

    public long accelerationStructure() {return this.ptr.get(LAYOUT__accelerationStructure, 0);}
    public void accelerationStructure(long value) {this.ptr.set(LAYOUT__accelerationStructure, 0, value);}
    public java.lang.foreign.MemorySegment $accelerationStructure() {return this.ptr.asSlice(0, LAYOUT__accelerationStructure);}
}
