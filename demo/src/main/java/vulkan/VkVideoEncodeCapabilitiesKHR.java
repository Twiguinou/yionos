package vulkan;

public record VkVideoEncodeCapabilitiesKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__flags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__flags = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__rateControlModes = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__rateControlModes = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxRateControlLayers = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__maxRateControlLayers = 24;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__maxBitrate = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__maxBitrate = 32;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxQualityLevels = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__maxQualityLevels = 40;
    public static final java.lang.foreign.StructLayout LAYOUT__encodeInputPictureGranularity = vulkan.VkExtent2D.gRecordLayout;
    public static final long OFFSET__encodeInputPictureGranularity = 44;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__supportedEncodeFeedbackFlags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__supportedEncodeFeedbackFlags = 52;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__flags,
            LAYOUT__rateControlModes,
            LAYOUT__maxRateControlLayers,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__maxBitrate,
            LAYOUT__maxQualityLevels,
            LAYOUT__encodeInputPictureGranularity,
            LAYOUT__supportedEncodeFeedbackFlags
    ).withByteAlignment(8).withName("VkVideoEncodeCapabilitiesKHR");

    public VkVideoEncodeCapabilitiesKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkVideoEncodeCapabilitiesKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkVideoEncodeCapabilitiesKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkVideoEncodeCapabilitiesKHR value)
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

    public int rateControlModes() {return this.ptr.get(LAYOUT__rateControlModes, OFFSET__rateControlModes);}
    public void rateControlModes(int value) {this.ptr.set(LAYOUT__rateControlModes, OFFSET__rateControlModes, value);}
    public java.lang.foreign.MemorySegment $rateControlModes() {return this.ptr.asSlice(OFFSET__rateControlModes, LAYOUT__rateControlModes);}

    public int maxRateControlLayers() {return this.ptr.get(LAYOUT__maxRateControlLayers, OFFSET__maxRateControlLayers);}
    public void maxRateControlLayers(int value) {this.ptr.set(LAYOUT__maxRateControlLayers, OFFSET__maxRateControlLayers, value);}
    public java.lang.foreign.MemorySegment $maxRateControlLayers() {return this.ptr.asSlice(OFFSET__maxRateControlLayers, LAYOUT__maxRateControlLayers);}

    public long maxBitrate() {return this.ptr.get(LAYOUT__maxBitrate, OFFSET__maxBitrate);}
    public void maxBitrate(long value) {this.ptr.set(LAYOUT__maxBitrate, OFFSET__maxBitrate, value);}
    public java.lang.foreign.MemorySegment $maxBitrate() {return this.ptr.asSlice(OFFSET__maxBitrate, LAYOUT__maxBitrate);}

    public int maxQualityLevels() {return this.ptr.get(LAYOUT__maxQualityLevels, OFFSET__maxQualityLevels);}
    public void maxQualityLevels(int value) {this.ptr.set(LAYOUT__maxQualityLevels, OFFSET__maxQualityLevels, value);}
    public java.lang.foreign.MemorySegment $maxQualityLevels() {return this.ptr.asSlice(OFFSET__maxQualityLevels, LAYOUT__maxQualityLevels);}

    public vulkan.VkExtent2D encodeInputPictureGranularity() {return new vulkan.VkExtent2D(this.ptr.asSlice(OFFSET__encodeInputPictureGranularity, LAYOUT__encodeInputPictureGranularity));}
    public void encodeInputPictureGranularity(java.util.function.Consumer<vulkan.VkExtent2D> consumer) {consumer.accept(this.encodeInputPictureGranularity());}
    public void encodeInputPictureGranularity(vulkan.VkExtent2D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__encodeInputPictureGranularity, LAYOUT__encodeInputPictureGranularity.byteSize());}

    public int supportedEncodeFeedbackFlags() {return this.ptr.get(LAYOUT__supportedEncodeFeedbackFlags, OFFSET__supportedEncodeFeedbackFlags);}
    public void supportedEncodeFeedbackFlags(int value) {this.ptr.set(LAYOUT__supportedEncodeFeedbackFlags, OFFSET__supportedEncodeFeedbackFlags, value);}
    public java.lang.foreign.MemorySegment $supportedEncodeFeedbackFlags() {return this.ptr.asSlice(OFFSET__supportedEncodeFeedbackFlags, LAYOUT__supportedEncodeFeedbackFlags);}
}
