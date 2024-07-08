package vulkan;

public record VkVideoEncodeH264QualityLevelPropertiesKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__preferredRateControlFlags = java.lang.foreign.ValueLayout.JAVA_INT.withName("preferredRateControlFlags");
    public static final long OFFSET__preferredRateControlFlags = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__preferredGopFrameCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("preferredGopFrameCount");
    public static final long OFFSET__preferredGopFrameCount = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__preferredIdrPeriod = java.lang.foreign.ValueLayout.JAVA_INT.withName("preferredIdrPeriod");
    public static final long OFFSET__preferredIdrPeriod = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__preferredConsecutiveBFrameCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("preferredConsecutiveBFrameCount");
    public static final long OFFSET__preferredConsecutiveBFrameCount = 28;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__preferredTemporalLayerCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("preferredTemporalLayerCount");
    public static final long OFFSET__preferredTemporalLayerCount = 32;
    public static final java.lang.foreign.StructLayout LAYOUT__preferredConstantQp = vulkan.VkVideoEncodeH264QpKHR.gRecordLayout.withName("preferredConstantQp");
    public static final long OFFSET__preferredConstantQp = 36;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__preferredMaxL0ReferenceCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("preferredMaxL0ReferenceCount");
    public static final long OFFSET__preferredMaxL0ReferenceCount = 48;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__preferredMaxL1ReferenceCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("preferredMaxL1ReferenceCount");
    public static final long OFFSET__preferredMaxL1ReferenceCount = 52;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__preferredStdEntropyCodingModeFlag = java.lang.foreign.ValueLayout.JAVA_INT.withName("preferredStdEntropyCodingModeFlag");
    public static final long OFFSET__preferredStdEntropyCodingModeFlag = 56;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__preferredRateControlFlags,
            LAYOUT__preferredGopFrameCount,
            LAYOUT__preferredIdrPeriod,
            LAYOUT__preferredConsecutiveBFrameCount,
            LAYOUT__preferredTemporalLayerCount,
            LAYOUT__preferredConstantQp,
            LAYOUT__preferredMaxL0ReferenceCount,
            LAYOUT__preferredMaxL1ReferenceCount,
            LAYOUT__preferredStdEntropyCodingModeFlag,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkVideoEncodeH264QualityLevelPropertiesKHR");

    public VkVideoEncodeH264QualityLevelPropertiesKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkVideoEncodeH264QualityLevelPropertiesKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkVideoEncodeH264QualityLevelPropertiesKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkVideoEncodeH264QualityLevelPropertiesKHR value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int preferredRateControlFlags() {return this.ptr.get(LAYOUT__preferredRateControlFlags, OFFSET__preferredRateControlFlags);}
    public void preferredRateControlFlags(int value) {this.ptr.set(LAYOUT__preferredRateControlFlags, OFFSET__preferredRateControlFlags, value);}
    public java.lang.foreign.MemorySegment $preferredRateControlFlags() {return this.ptr.asSlice(OFFSET__preferredRateControlFlags, LAYOUT__preferredRateControlFlags);}

    public int preferredGopFrameCount() {return this.ptr.get(LAYOUT__preferredGopFrameCount, OFFSET__preferredGopFrameCount);}
    public void preferredGopFrameCount(int value) {this.ptr.set(LAYOUT__preferredGopFrameCount, OFFSET__preferredGopFrameCount, value);}
    public java.lang.foreign.MemorySegment $preferredGopFrameCount() {return this.ptr.asSlice(OFFSET__preferredGopFrameCount, LAYOUT__preferredGopFrameCount);}

    public int preferredIdrPeriod() {return this.ptr.get(LAYOUT__preferredIdrPeriod, OFFSET__preferredIdrPeriod);}
    public void preferredIdrPeriod(int value) {this.ptr.set(LAYOUT__preferredIdrPeriod, OFFSET__preferredIdrPeriod, value);}
    public java.lang.foreign.MemorySegment $preferredIdrPeriod() {return this.ptr.asSlice(OFFSET__preferredIdrPeriod, LAYOUT__preferredIdrPeriod);}

    public int preferredConsecutiveBFrameCount() {return this.ptr.get(LAYOUT__preferredConsecutiveBFrameCount, OFFSET__preferredConsecutiveBFrameCount);}
    public void preferredConsecutiveBFrameCount(int value) {this.ptr.set(LAYOUT__preferredConsecutiveBFrameCount, OFFSET__preferredConsecutiveBFrameCount, value);}
    public java.lang.foreign.MemorySegment $preferredConsecutiveBFrameCount() {return this.ptr.asSlice(OFFSET__preferredConsecutiveBFrameCount, LAYOUT__preferredConsecutiveBFrameCount);}

    public int preferredTemporalLayerCount() {return this.ptr.get(LAYOUT__preferredTemporalLayerCount, OFFSET__preferredTemporalLayerCount);}
    public void preferredTemporalLayerCount(int value) {this.ptr.set(LAYOUT__preferredTemporalLayerCount, OFFSET__preferredTemporalLayerCount, value);}
    public java.lang.foreign.MemorySegment $preferredTemporalLayerCount() {return this.ptr.asSlice(OFFSET__preferredTemporalLayerCount, LAYOUT__preferredTemporalLayerCount);}

    public vulkan.VkVideoEncodeH264QpKHR preferredConstantQp() {return new vulkan.VkVideoEncodeH264QpKHR(this.ptr.asSlice(OFFSET__preferredConstantQp, LAYOUT__preferredConstantQp));}
    public void preferredConstantQp(java.util.function.Consumer<vulkan.VkVideoEncodeH264QpKHR> consumer) {consumer.accept(this.preferredConstantQp());}
    public void preferredConstantQp(vulkan.VkVideoEncodeH264QpKHR value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__preferredConstantQp, LAYOUT__preferredConstantQp.byteSize());}

    public int preferredMaxL0ReferenceCount() {return this.ptr.get(LAYOUT__preferredMaxL0ReferenceCount, OFFSET__preferredMaxL0ReferenceCount);}
    public void preferredMaxL0ReferenceCount(int value) {this.ptr.set(LAYOUT__preferredMaxL0ReferenceCount, OFFSET__preferredMaxL0ReferenceCount, value);}
    public java.lang.foreign.MemorySegment $preferredMaxL0ReferenceCount() {return this.ptr.asSlice(OFFSET__preferredMaxL0ReferenceCount, LAYOUT__preferredMaxL0ReferenceCount);}

    public int preferredMaxL1ReferenceCount() {return this.ptr.get(LAYOUT__preferredMaxL1ReferenceCount, OFFSET__preferredMaxL1ReferenceCount);}
    public void preferredMaxL1ReferenceCount(int value) {this.ptr.set(LAYOUT__preferredMaxL1ReferenceCount, OFFSET__preferredMaxL1ReferenceCount, value);}
    public java.lang.foreign.MemorySegment $preferredMaxL1ReferenceCount() {return this.ptr.asSlice(OFFSET__preferredMaxL1ReferenceCount, LAYOUT__preferredMaxL1ReferenceCount);}

    public int preferredStdEntropyCodingModeFlag() {return this.ptr.get(LAYOUT__preferredStdEntropyCodingModeFlag, OFFSET__preferredStdEntropyCodingModeFlag);}
    public void preferredStdEntropyCodingModeFlag(int value) {this.ptr.set(LAYOUT__preferredStdEntropyCodingModeFlag, OFFSET__preferredStdEntropyCodingModeFlag, value);}
    public java.lang.foreign.MemorySegment $preferredStdEntropyCodingModeFlag() {return this.ptr.asSlice(OFFSET__preferredStdEntropyCodingModeFlag, LAYOUT__preferredStdEntropyCodingModeFlag);}
}
