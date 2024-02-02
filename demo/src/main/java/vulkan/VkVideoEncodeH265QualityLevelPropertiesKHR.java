package vulkan;

public record VkVideoEncodeH265QualityLevelPropertiesKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$preferredRateControlFlags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$preferredRateControlFlags = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$preferredGopFrameCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$preferredGopFrameCount = 20L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$preferredIdrPeriod = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$preferredIdrPeriod = 24L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$preferredConsecutiveBFrameCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$preferredConsecutiveBFrameCount = 28L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$preferredSubLayerCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$preferredSubLayerCount = 32L;
    public static final java.lang.foreign.GroupLayout LAYOUT$preferredConstantQp = vulkan.VkVideoEncodeH265QpKHR.gStructLayout;
    public static final long OFFSET$preferredConstantQp = 36L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$preferredMaxL0ReferenceCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$preferredMaxL0ReferenceCount = 48L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$preferredMaxL1ReferenceCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$preferredMaxL1ReferenceCount = 52L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$preferredRateControlFlags,
            LAYOUT$preferredGopFrameCount,
            LAYOUT$preferredIdrPeriod,
            LAYOUT$preferredConsecutiveBFrameCount,
            LAYOUT$preferredSubLayerCount,
            LAYOUT$preferredConstantQp,
            LAYOUT$preferredMaxL0ReferenceCount,
            LAYOUT$preferredMaxL1ReferenceCount
    ).withName("VkVideoEncodeH265QualityLevelPropertiesKHR");

    public VkVideoEncodeH265QualityLevelPropertiesKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VkVideoEncodeH265QualityLevelPropertiesKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VkVideoEncodeH265QualityLevelPropertiesKHR(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int preferredRateControlFlags() {return this.ptr.get(LAYOUT$preferredRateControlFlags, OFFSET$preferredRateControlFlags);}
    public void preferredRateControlFlags(int value) {this.ptr.set(LAYOUT$preferredRateControlFlags, OFFSET$preferredRateControlFlags, value);}
    public java.lang.foreign.MemorySegment preferredRateControlFlags_ptr() {return this.ptr.asSlice(OFFSET$preferredRateControlFlags, LAYOUT$preferredRateControlFlags);}

    public int preferredGopFrameCount() {return this.ptr.get(LAYOUT$preferredGopFrameCount, OFFSET$preferredGopFrameCount);}
    public void preferredGopFrameCount(int value) {this.ptr.set(LAYOUT$preferredGopFrameCount, OFFSET$preferredGopFrameCount, value);}
    public java.lang.foreign.MemorySegment preferredGopFrameCount_ptr() {return this.ptr.asSlice(OFFSET$preferredGopFrameCount, LAYOUT$preferredGopFrameCount);}

    public int preferredIdrPeriod() {return this.ptr.get(LAYOUT$preferredIdrPeriod, OFFSET$preferredIdrPeriod);}
    public void preferredIdrPeriod(int value) {this.ptr.set(LAYOUT$preferredIdrPeriod, OFFSET$preferredIdrPeriod, value);}
    public java.lang.foreign.MemorySegment preferredIdrPeriod_ptr() {return this.ptr.asSlice(OFFSET$preferredIdrPeriod, LAYOUT$preferredIdrPeriod);}

    public int preferredConsecutiveBFrameCount() {return this.ptr.get(LAYOUT$preferredConsecutiveBFrameCount, OFFSET$preferredConsecutiveBFrameCount);}
    public void preferredConsecutiveBFrameCount(int value) {this.ptr.set(LAYOUT$preferredConsecutiveBFrameCount, OFFSET$preferredConsecutiveBFrameCount, value);}
    public java.lang.foreign.MemorySegment preferredConsecutiveBFrameCount_ptr() {return this.ptr.asSlice(OFFSET$preferredConsecutiveBFrameCount, LAYOUT$preferredConsecutiveBFrameCount);}

    public int preferredSubLayerCount() {return this.ptr.get(LAYOUT$preferredSubLayerCount, OFFSET$preferredSubLayerCount);}
    public void preferredSubLayerCount(int value) {this.ptr.set(LAYOUT$preferredSubLayerCount, OFFSET$preferredSubLayerCount, value);}
    public java.lang.foreign.MemorySegment preferredSubLayerCount_ptr() {return this.ptr.asSlice(OFFSET$preferredSubLayerCount, LAYOUT$preferredSubLayerCount);}

    public vulkan.VkVideoEncodeH265QpKHR preferredConstantQp() {return new vulkan.VkVideoEncodeH265QpKHR(this.ptr.asSlice(OFFSET$preferredConstantQp, LAYOUT$preferredConstantQp));}
    public void preferredConstantQp(java.util.function.Consumer<vulkan.VkVideoEncodeH265QpKHR> consumer) {consumer.accept(this.preferredConstantQp());}
    public void preferredConstantQp(vulkan.VkVideoEncodeH265QpKHR value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$preferredConstantQp, LAYOUT$preferredConstantQp.byteSize());}

    public int preferredMaxL0ReferenceCount() {return this.ptr.get(LAYOUT$preferredMaxL0ReferenceCount, OFFSET$preferredMaxL0ReferenceCount);}
    public void preferredMaxL0ReferenceCount(int value) {this.ptr.set(LAYOUT$preferredMaxL0ReferenceCount, OFFSET$preferredMaxL0ReferenceCount, value);}
    public java.lang.foreign.MemorySegment preferredMaxL0ReferenceCount_ptr() {return this.ptr.asSlice(OFFSET$preferredMaxL0ReferenceCount, LAYOUT$preferredMaxL0ReferenceCount);}

    public int preferredMaxL1ReferenceCount() {return this.ptr.get(LAYOUT$preferredMaxL1ReferenceCount, OFFSET$preferredMaxL1ReferenceCount);}
    public void preferredMaxL1ReferenceCount(int value) {this.ptr.set(LAYOUT$preferredMaxL1ReferenceCount, OFFSET$preferredMaxL1ReferenceCount, value);}
    public java.lang.foreign.MemorySegment preferredMaxL1ReferenceCount_ptr() {return this.ptr.asSlice(OFFSET$preferredMaxL1ReferenceCount, LAYOUT$preferredMaxL1ReferenceCount);}
}
