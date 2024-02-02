package vulkan;

public record VkVideoEncodeRateControlLayerInfoKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$averageBitrate = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$averageBitrate = 16L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$maxBitrate = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$maxBitrate = 24L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$frameRateNumerator = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$frameRateNumerator = 32L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$frameRateDenominator = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$frameRateDenominator = 36L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$averageBitrate,
            LAYOUT$maxBitrate,
            LAYOUT$frameRateNumerator,
            LAYOUT$frameRateDenominator
    ).withName("VkVideoEncodeRateControlLayerInfoKHR");

    public VkVideoEncodeRateControlLayerInfoKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VkVideoEncodeRateControlLayerInfoKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VkVideoEncodeRateControlLayerInfoKHR(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public long averageBitrate() {return this.ptr.get(LAYOUT$averageBitrate, OFFSET$averageBitrate);}
    public void averageBitrate(long value) {this.ptr.set(LAYOUT$averageBitrate, OFFSET$averageBitrate, value);}
    public java.lang.foreign.MemorySegment averageBitrate_ptr() {return this.ptr.asSlice(OFFSET$averageBitrate, LAYOUT$averageBitrate);}

    public long maxBitrate() {return this.ptr.get(LAYOUT$maxBitrate, OFFSET$maxBitrate);}
    public void maxBitrate(long value) {this.ptr.set(LAYOUT$maxBitrate, OFFSET$maxBitrate, value);}
    public java.lang.foreign.MemorySegment maxBitrate_ptr() {return this.ptr.asSlice(OFFSET$maxBitrate, LAYOUT$maxBitrate);}

    public int frameRateNumerator() {return this.ptr.get(LAYOUT$frameRateNumerator, OFFSET$frameRateNumerator);}
    public void frameRateNumerator(int value) {this.ptr.set(LAYOUT$frameRateNumerator, OFFSET$frameRateNumerator, value);}
    public java.lang.foreign.MemorySegment frameRateNumerator_ptr() {return this.ptr.asSlice(OFFSET$frameRateNumerator, LAYOUT$frameRateNumerator);}

    public int frameRateDenominator() {return this.ptr.get(LAYOUT$frameRateDenominator, OFFSET$frameRateDenominator);}
    public void frameRateDenominator(int value) {this.ptr.set(LAYOUT$frameRateDenominator, OFFSET$frameRateDenominator, value);}
    public java.lang.foreign.MemorySegment frameRateDenominator_ptr() {return this.ptr.asSlice(OFFSET$frameRateDenominator, LAYOUT$frameRateDenominator);}
}
