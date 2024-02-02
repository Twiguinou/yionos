package vulkan;

public record VkVideoEncodeH264RateControlInfoKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$flags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$flags = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$gopFrameCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$gopFrameCount = 20L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$idrPeriod = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$idrPeriod = 24L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$consecutiveBFrameCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$consecutiveBFrameCount = 28L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$temporalLayerCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$temporalLayerCount = 32L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$flags,
            LAYOUT$gopFrameCount,
            LAYOUT$idrPeriod,
            LAYOUT$consecutiveBFrameCount,
            LAYOUT$temporalLayerCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("VkVideoEncodeH264RateControlInfoKHR");

    public VkVideoEncodeH264RateControlInfoKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VkVideoEncodeH264RateControlInfoKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VkVideoEncodeH264RateControlInfoKHR(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
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

    public int gopFrameCount() {return this.ptr.get(LAYOUT$gopFrameCount, OFFSET$gopFrameCount);}
    public void gopFrameCount(int value) {this.ptr.set(LAYOUT$gopFrameCount, OFFSET$gopFrameCount, value);}
    public java.lang.foreign.MemorySegment gopFrameCount_ptr() {return this.ptr.asSlice(OFFSET$gopFrameCount, LAYOUT$gopFrameCount);}

    public int idrPeriod() {return this.ptr.get(LAYOUT$idrPeriod, OFFSET$idrPeriod);}
    public void idrPeriod(int value) {this.ptr.set(LAYOUT$idrPeriod, OFFSET$idrPeriod, value);}
    public java.lang.foreign.MemorySegment idrPeriod_ptr() {return this.ptr.asSlice(OFFSET$idrPeriod, LAYOUT$idrPeriod);}

    public int consecutiveBFrameCount() {return this.ptr.get(LAYOUT$consecutiveBFrameCount, OFFSET$consecutiveBFrameCount);}
    public void consecutiveBFrameCount(int value) {this.ptr.set(LAYOUT$consecutiveBFrameCount, OFFSET$consecutiveBFrameCount, value);}
    public java.lang.foreign.MemorySegment consecutiveBFrameCount_ptr() {return this.ptr.asSlice(OFFSET$consecutiveBFrameCount, LAYOUT$consecutiveBFrameCount);}

    public int temporalLayerCount() {return this.ptr.get(LAYOUT$temporalLayerCount, OFFSET$temporalLayerCount);}
    public void temporalLayerCount(int value) {this.ptr.set(LAYOUT$temporalLayerCount, OFFSET$temporalLayerCount, value);}
    public java.lang.foreign.MemorySegment temporalLayerCount_ptr() {return this.ptr.asSlice(OFFSET$temporalLayerCount, LAYOUT$temporalLayerCount);}
}
