package vulkan;

public record VkVideoEncodeH264RateControlInfoKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__flags = java.lang.foreign.ValueLayout.JAVA_INT.withName("flags");
    public static final long OFFSET__flags = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__gopFrameCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("gopFrameCount");
    public static final long OFFSET__gopFrameCount = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__idrPeriod = java.lang.foreign.ValueLayout.JAVA_INT.withName("idrPeriod");
    public static final long OFFSET__idrPeriod = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__consecutiveBFrameCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("consecutiveBFrameCount");
    public static final long OFFSET__consecutiveBFrameCount = 28;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__temporalLayerCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("temporalLayerCount");
    public static final long OFFSET__temporalLayerCount = 32;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__flags,
            LAYOUT__gopFrameCount,
            LAYOUT__idrPeriod,
            LAYOUT__consecutiveBFrameCount,
            LAYOUT__temporalLayerCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkVideoEncodeH264RateControlInfoKHR");

    public VkVideoEncodeH264RateControlInfoKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkVideoEncodeH264RateControlInfoKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkVideoEncodeH264RateControlInfoKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkVideoEncodeH264RateControlInfoKHR value)
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

    public int gopFrameCount() {return this.ptr.get(LAYOUT__gopFrameCount, OFFSET__gopFrameCount);}
    public void gopFrameCount(int value) {this.ptr.set(LAYOUT__gopFrameCount, OFFSET__gopFrameCount, value);}
    public java.lang.foreign.MemorySegment $gopFrameCount() {return this.ptr.asSlice(OFFSET__gopFrameCount, LAYOUT__gopFrameCount);}

    public int idrPeriod() {return this.ptr.get(LAYOUT__idrPeriod, OFFSET__idrPeriod);}
    public void idrPeriod(int value) {this.ptr.set(LAYOUT__idrPeriod, OFFSET__idrPeriod, value);}
    public java.lang.foreign.MemorySegment $idrPeriod() {return this.ptr.asSlice(OFFSET__idrPeriod, LAYOUT__idrPeriod);}

    public int consecutiveBFrameCount() {return this.ptr.get(LAYOUT__consecutiveBFrameCount, OFFSET__consecutiveBFrameCount);}
    public void consecutiveBFrameCount(int value) {this.ptr.set(LAYOUT__consecutiveBFrameCount, OFFSET__consecutiveBFrameCount, value);}
    public java.lang.foreign.MemorySegment $consecutiveBFrameCount() {return this.ptr.asSlice(OFFSET__consecutiveBFrameCount, LAYOUT__consecutiveBFrameCount);}

    public int temporalLayerCount() {return this.ptr.get(LAYOUT__temporalLayerCount, OFFSET__temporalLayerCount);}
    public void temporalLayerCount(int value) {this.ptr.set(LAYOUT__temporalLayerCount, OFFSET__temporalLayerCount, value);}
    public java.lang.foreign.MemorySegment $temporalLayerCount() {return this.ptr.asSlice(OFFSET__temporalLayerCount, LAYOUT__temporalLayerCount);}
}
