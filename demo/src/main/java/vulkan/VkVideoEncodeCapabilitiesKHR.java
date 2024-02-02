package vulkan;

public record VkVideoEncodeCapabilitiesKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$flags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$flags = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$rateControlModes = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$rateControlModes = 20L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxRateControlLayers = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxRateControlLayers = 24L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$maxBitrate = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$maxBitrate = 32L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxQualityLevels = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxQualityLevels = 40L;
    public static final java.lang.foreign.GroupLayout LAYOUT$encodeInputPictureGranularity = vulkan.VkExtent2D.gStructLayout;
    public static final long OFFSET$encodeInputPictureGranularity = 44L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$supportedEncodeFeedbackFlags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$supportedEncodeFeedbackFlags = 52L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$flags,
            LAYOUT$rateControlModes,
            LAYOUT$maxRateControlLayers,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$maxBitrate,
            LAYOUT$maxQualityLevels,
            LAYOUT$encodeInputPictureGranularity,
            LAYOUT$supportedEncodeFeedbackFlags
    ).withName("VkVideoEncodeCapabilitiesKHR");

    public VkVideoEncodeCapabilitiesKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VkVideoEncodeCapabilitiesKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VkVideoEncodeCapabilitiesKHR(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int flags() {return this.ptr.get(LAYOUT$flags, OFFSET$flags);}
    public void flags(int value) {this.ptr.set(LAYOUT$flags, OFFSET$flags, value);}
    public java.lang.foreign.MemorySegment flags_ptr() {return this.ptr.asSlice(OFFSET$flags, LAYOUT$flags);}

    public int rateControlModes() {return this.ptr.get(LAYOUT$rateControlModes, OFFSET$rateControlModes);}
    public void rateControlModes(int value) {this.ptr.set(LAYOUT$rateControlModes, OFFSET$rateControlModes, value);}
    public java.lang.foreign.MemorySegment rateControlModes_ptr() {return this.ptr.asSlice(OFFSET$rateControlModes, LAYOUT$rateControlModes);}

    public int maxRateControlLayers() {return this.ptr.get(LAYOUT$maxRateControlLayers, OFFSET$maxRateControlLayers);}
    public void maxRateControlLayers(int value) {this.ptr.set(LAYOUT$maxRateControlLayers, OFFSET$maxRateControlLayers, value);}
    public java.lang.foreign.MemorySegment maxRateControlLayers_ptr() {return this.ptr.asSlice(OFFSET$maxRateControlLayers, LAYOUT$maxRateControlLayers);}

    public long maxBitrate() {return this.ptr.get(LAYOUT$maxBitrate, OFFSET$maxBitrate);}
    public void maxBitrate(long value) {this.ptr.set(LAYOUT$maxBitrate, OFFSET$maxBitrate, value);}
    public java.lang.foreign.MemorySegment maxBitrate_ptr() {return this.ptr.asSlice(OFFSET$maxBitrate, LAYOUT$maxBitrate);}

    public int maxQualityLevels() {return this.ptr.get(LAYOUT$maxQualityLevels, OFFSET$maxQualityLevels);}
    public void maxQualityLevels(int value) {this.ptr.set(LAYOUT$maxQualityLevels, OFFSET$maxQualityLevels, value);}
    public java.lang.foreign.MemorySegment maxQualityLevels_ptr() {return this.ptr.asSlice(OFFSET$maxQualityLevels, LAYOUT$maxQualityLevels);}

    public vulkan.VkExtent2D encodeInputPictureGranularity() {return new vulkan.VkExtent2D(this.ptr.asSlice(OFFSET$encodeInputPictureGranularity, LAYOUT$encodeInputPictureGranularity));}
    public void encodeInputPictureGranularity(java.util.function.Consumer<vulkan.VkExtent2D> consumer) {consumer.accept(this.encodeInputPictureGranularity());}
    public void encodeInputPictureGranularity(vulkan.VkExtent2D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$encodeInputPictureGranularity, LAYOUT$encodeInputPictureGranularity.byteSize());}

    public int supportedEncodeFeedbackFlags() {return this.ptr.get(LAYOUT$supportedEncodeFeedbackFlags, OFFSET$supportedEncodeFeedbackFlags);}
    public void supportedEncodeFeedbackFlags(int value) {this.ptr.set(LAYOUT$supportedEncodeFeedbackFlags, OFFSET$supportedEncodeFeedbackFlags, value);}
    public java.lang.foreign.MemorySegment supportedEncodeFeedbackFlags_ptr() {return this.ptr.asSlice(OFFSET$supportedEncodeFeedbackFlags, LAYOUT$supportedEncodeFeedbackFlags);}
}
