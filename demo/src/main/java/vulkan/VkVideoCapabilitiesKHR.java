package vulkan;

public record VkVideoCapabilitiesKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__flags = java.lang.foreign.ValueLayout.JAVA_INT.withName("flags");
    public static final long OFFSET__flags = 16;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__minBitstreamBufferOffsetAlignment = java.lang.foreign.ValueLayout.JAVA_LONG.withName("minBitstreamBufferOffsetAlignment");
    public static final long OFFSET__minBitstreamBufferOffsetAlignment = 24;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__minBitstreamBufferSizeAlignment = java.lang.foreign.ValueLayout.JAVA_LONG.withName("minBitstreamBufferSizeAlignment");
    public static final long OFFSET__minBitstreamBufferSizeAlignment = 32;
    public static final java.lang.foreign.StructLayout LAYOUT__pictureAccessGranularity = vulkan.VkExtent2D.gRecordLayout.withName("pictureAccessGranularity");
    public static final long OFFSET__pictureAccessGranularity = 40;
    public static final java.lang.foreign.StructLayout LAYOUT__minCodedExtent = vulkan.VkExtent2D.gRecordLayout.withName("minCodedExtent");
    public static final long OFFSET__minCodedExtent = 48;
    public static final java.lang.foreign.StructLayout LAYOUT__maxCodedExtent = vulkan.VkExtent2D.gRecordLayout.withName("maxCodedExtent");
    public static final long OFFSET__maxCodedExtent = 56;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxDpbSlots = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxDpbSlots");
    public static final long OFFSET__maxDpbSlots = 64;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxActiveReferencePictures = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxActiveReferencePictures");
    public static final long OFFSET__maxActiveReferencePictures = 68;
    public static final java.lang.foreign.StructLayout LAYOUT__stdHeaderVersion = vulkan.VkExtensionProperties.gRecordLayout.withName("stdHeaderVersion");
    public static final long OFFSET__stdHeaderVersion = 72;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__flags,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__minBitstreamBufferOffsetAlignment,
            LAYOUT__minBitstreamBufferSizeAlignment,
            LAYOUT__pictureAccessGranularity,
            LAYOUT__minCodedExtent,
            LAYOUT__maxCodedExtent,
            LAYOUT__maxDpbSlots,
            LAYOUT__maxActiveReferencePictures,
            LAYOUT__stdHeaderVersion,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkVideoCapabilitiesKHR");

    public VkVideoCapabilitiesKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkVideoCapabilitiesKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkVideoCapabilitiesKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkVideoCapabilitiesKHR value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int flags() {return this.ptr.get(LAYOUT__flags, OFFSET__flags);}
    public void flags(int value) {this.ptr.set(LAYOUT__flags, OFFSET__flags, value);}
    public java.lang.foreign.MemorySegment $flags() {return this.ptr.asSlice(OFFSET__flags, LAYOUT__flags);}

    public long minBitstreamBufferOffsetAlignment() {return this.ptr.get(LAYOUT__minBitstreamBufferOffsetAlignment, OFFSET__minBitstreamBufferOffsetAlignment);}
    public void minBitstreamBufferOffsetAlignment(long value) {this.ptr.set(LAYOUT__minBitstreamBufferOffsetAlignment, OFFSET__minBitstreamBufferOffsetAlignment, value);}
    public java.lang.foreign.MemorySegment $minBitstreamBufferOffsetAlignment() {return this.ptr.asSlice(OFFSET__minBitstreamBufferOffsetAlignment, LAYOUT__minBitstreamBufferOffsetAlignment);}

    public long minBitstreamBufferSizeAlignment() {return this.ptr.get(LAYOUT__minBitstreamBufferSizeAlignment, OFFSET__minBitstreamBufferSizeAlignment);}
    public void minBitstreamBufferSizeAlignment(long value) {this.ptr.set(LAYOUT__minBitstreamBufferSizeAlignment, OFFSET__minBitstreamBufferSizeAlignment, value);}
    public java.lang.foreign.MemorySegment $minBitstreamBufferSizeAlignment() {return this.ptr.asSlice(OFFSET__minBitstreamBufferSizeAlignment, LAYOUT__minBitstreamBufferSizeAlignment);}

    public vulkan.VkExtent2D pictureAccessGranularity() {return new vulkan.VkExtent2D(this.ptr.asSlice(OFFSET__pictureAccessGranularity, LAYOUT__pictureAccessGranularity));}
    public void pictureAccessGranularity(java.util.function.Consumer<vulkan.VkExtent2D> consumer) {consumer.accept(this.pictureAccessGranularity());}
    public void pictureAccessGranularity(vulkan.VkExtent2D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__pictureAccessGranularity, LAYOUT__pictureAccessGranularity.byteSize());}

    public vulkan.VkExtent2D minCodedExtent() {return new vulkan.VkExtent2D(this.ptr.asSlice(OFFSET__minCodedExtent, LAYOUT__minCodedExtent));}
    public void minCodedExtent(java.util.function.Consumer<vulkan.VkExtent2D> consumer) {consumer.accept(this.minCodedExtent());}
    public void minCodedExtent(vulkan.VkExtent2D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__minCodedExtent, LAYOUT__minCodedExtent.byteSize());}

    public vulkan.VkExtent2D maxCodedExtent() {return new vulkan.VkExtent2D(this.ptr.asSlice(OFFSET__maxCodedExtent, LAYOUT__maxCodedExtent));}
    public void maxCodedExtent(java.util.function.Consumer<vulkan.VkExtent2D> consumer) {consumer.accept(this.maxCodedExtent());}
    public void maxCodedExtent(vulkan.VkExtent2D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__maxCodedExtent, LAYOUT__maxCodedExtent.byteSize());}

    public int maxDpbSlots() {return this.ptr.get(LAYOUT__maxDpbSlots, OFFSET__maxDpbSlots);}
    public void maxDpbSlots(int value) {this.ptr.set(LAYOUT__maxDpbSlots, OFFSET__maxDpbSlots, value);}
    public java.lang.foreign.MemorySegment $maxDpbSlots() {return this.ptr.asSlice(OFFSET__maxDpbSlots, LAYOUT__maxDpbSlots);}

    public int maxActiveReferencePictures() {return this.ptr.get(LAYOUT__maxActiveReferencePictures, OFFSET__maxActiveReferencePictures);}
    public void maxActiveReferencePictures(int value) {this.ptr.set(LAYOUT__maxActiveReferencePictures, OFFSET__maxActiveReferencePictures, value);}
    public java.lang.foreign.MemorySegment $maxActiveReferencePictures() {return this.ptr.asSlice(OFFSET__maxActiveReferencePictures, LAYOUT__maxActiveReferencePictures);}

    public vulkan.VkExtensionProperties stdHeaderVersion() {return new vulkan.VkExtensionProperties(this.ptr.asSlice(OFFSET__stdHeaderVersion, LAYOUT__stdHeaderVersion));}
    public void stdHeaderVersion(java.util.function.Consumer<vulkan.VkExtensionProperties> consumer) {consumer.accept(this.stdHeaderVersion());}
    public void stdHeaderVersion(vulkan.VkExtensionProperties value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__stdHeaderVersion, LAYOUT__stdHeaderVersion.byteSize());}
}
