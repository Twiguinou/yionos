package vulkan;

public record VkVideoEncodeRateControlLayerInfoKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__averageBitrate = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__averageBitrate = 16;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__maxBitrate = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__maxBitrate = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__frameRateNumerator = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__frameRateNumerator = 32;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__frameRateDenominator = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__frameRateDenominator = 36;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__averageBitrate,
            LAYOUT__maxBitrate,
            LAYOUT__frameRateNumerator,
            LAYOUT__frameRateDenominator
    ).withByteAlignment(8).withName("VkVideoEncodeRateControlLayerInfoKHR");

    public VkVideoEncodeRateControlLayerInfoKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkVideoEncodeRateControlLayerInfoKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkVideoEncodeRateControlLayerInfoKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkVideoEncodeRateControlLayerInfoKHR value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public long averageBitrate() {return this.ptr.get(LAYOUT__averageBitrate, OFFSET__averageBitrate);}
    public void averageBitrate(long value) {this.ptr.set(LAYOUT__averageBitrate, OFFSET__averageBitrate, value);}
    public java.lang.foreign.MemorySegment $averageBitrate() {return this.ptr.asSlice(OFFSET__averageBitrate, LAYOUT__averageBitrate);}

    public long maxBitrate() {return this.ptr.get(LAYOUT__maxBitrate, OFFSET__maxBitrate);}
    public void maxBitrate(long value) {this.ptr.set(LAYOUT__maxBitrate, OFFSET__maxBitrate, value);}
    public java.lang.foreign.MemorySegment $maxBitrate() {return this.ptr.asSlice(OFFSET__maxBitrate, LAYOUT__maxBitrate);}

    public int frameRateNumerator() {return this.ptr.get(LAYOUT__frameRateNumerator, OFFSET__frameRateNumerator);}
    public void frameRateNumerator(int value) {this.ptr.set(LAYOUT__frameRateNumerator, OFFSET__frameRateNumerator, value);}
    public java.lang.foreign.MemorySegment $frameRateNumerator() {return this.ptr.asSlice(OFFSET__frameRateNumerator, LAYOUT__frameRateNumerator);}

    public int frameRateDenominator() {return this.ptr.get(LAYOUT__frameRateDenominator, OFFSET__frameRateDenominator);}
    public void frameRateDenominator(int value) {this.ptr.set(LAYOUT__frameRateDenominator, OFFSET__frameRateDenominator, value);}
    public java.lang.foreign.MemorySegment $frameRateDenominator() {return this.ptr.asSlice(OFFSET__frameRateDenominator, LAYOUT__frameRateDenominator);}
}
