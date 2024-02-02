package vulkan;

public record VkVideoEncodeH264CapabilitiesKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$flags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$flags = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxLevelIdc = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxLevelIdc = 20L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxSliceCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxSliceCount = 24L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxPPictureL0ReferenceCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxPPictureL0ReferenceCount = 28L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxBPictureL0ReferenceCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxBPictureL0ReferenceCount = 32L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxL1ReferenceCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxL1ReferenceCount = 36L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxTemporalLayerCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxTemporalLayerCount = 40L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$expectDyadicTemporalLayerPattern = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$expectDyadicTemporalLayerPattern = 44L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$minQp = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$minQp = 48L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxQp = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxQp = 52L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$prefersGopRemainingFrames = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$prefersGopRemainingFrames = 56L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$requiresGopRemainingFrames = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$requiresGopRemainingFrames = 60L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$stdSyntaxFlags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$stdSyntaxFlags = 64L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$flags,
            LAYOUT$maxLevelIdc,
            LAYOUT$maxSliceCount,
            LAYOUT$maxPPictureL0ReferenceCount,
            LAYOUT$maxBPictureL0ReferenceCount,
            LAYOUT$maxL1ReferenceCount,
            LAYOUT$maxTemporalLayerCount,
            LAYOUT$expectDyadicTemporalLayerPattern,
            LAYOUT$minQp,
            LAYOUT$maxQp,
            LAYOUT$prefersGopRemainingFrames,
            LAYOUT$requiresGopRemainingFrames,
            LAYOUT$stdSyntaxFlags,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("VkVideoEncodeH264CapabilitiesKHR");

    public VkVideoEncodeH264CapabilitiesKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VkVideoEncodeH264CapabilitiesKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VkVideoEncodeH264CapabilitiesKHR(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
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

    public int maxLevelIdc() {return this.ptr.get(LAYOUT$maxLevelIdc, OFFSET$maxLevelIdc);}
    public void maxLevelIdc(int value) {this.ptr.set(LAYOUT$maxLevelIdc, OFFSET$maxLevelIdc, value);}
    public java.lang.foreign.MemorySegment maxLevelIdc_ptr() {return this.ptr.asSlice(OFFSET$maxLevelIdc, LAYOUT$maxLevelIdc);}

    public int maxSliceCount() {return this.ptr.get(LAYOUT$maxSliceCount, OFFSET$maxSliceCount);}
    public void maxSliceCount(int value) {this.ptr.set(LAYOUT$maxSliceCount, OFFSET$maxSliceCount, value);}
    public java.lang.foreign.MemorySegment maxSliceCount_ptr() {return this.ptr.asSlice(OFFSET$maxSliceCount, LAYOUT$maxSliceCount);}

    public int maxPPictureL0ReferenceCount() {return this.ptr.get(LAYOUT$maxPPictureL0ReferenceCount, OFFSET$maxPPictureL0ReferenceCount);}
    public void maxPPictureL0ReferenceCount(int value) {this.ptr.set(LAYOUT$maxPPictureL0ReferenceCount, OFFSET$maxPPictureL0ReferenceCount, value);}
    public java.lang.foreign.MemorySegment maxPPictureL0ReferenceCount_ptr() {return this.ptr.asSlice(OFFSET$maxPPictureL0ReferenceCount, LAYOUT$maxPPictureL0ReferenceCount);}

    public int maxBPictureL0ReferenceCount() {return this.ptr.get(LAYOUT$maxBPictureL0ReferenceCount, OFFSET$maxBPictureL0ReferenceCount);}
    public void maxBPictureL0ReferenceCount(int value) {this.ptr.set(LAYOUT$maxBPictureL0ReferenceCount, OFFSET$maxBPictureL0ReferenceCount, value);}
    public java.lang.foreign.MemorySegment maxBPictureL0ReferenceCount_ptr() {return this.ptr.asSlice(OFFSET$maxBPictureL0ReferenceCount, LAYOUT$maxBPictureL0ReferenceCount);}

    public int maxL1ReferenceCount() {return this.ptr.get(LAYOUT$maxL1ReferenceCount, OFFSET$maxL1ReferenceCount);}
    public void maxL1ReferenceCount(int value) {this.ptr.set(LAYOUT$maxL1ReferenceCount, OFFSET$maxL1ReferenceCount, value);}
    public java.lang.foreign.MemorySegment maxL1ReferenceCount_ptr() {return this.ptr.asSlice(OFFSET$maxL1ReferenceCount, LAYOUT$maxL1ReferenceCount);}

    public int maxTemporalLayerCount() {return this.ptr.get(LAYOUT$maxTemporalLayerCount, OFFSET$maxTemporalLayerCount);}
    public void maxTemporalLayerCount(int value) {this.ptr.set(LAYOUT$maxTemporalLayerCount, OFFSET$maxTemporalLayerCount, value);}
    public java.lang.foreign.MemorySegment maxTemporalLayerCount_ptr() {return this.ptr.asSlice(OFFSET$maxTemporalLayerCount, LAYOUT$maxTemporalLayerCount);}

    public int expectDyadicTemporalLayerPattern() {return this.ptr.get(LAYOUT$expectDyadicTemporalLayerPattern, OFFSET$expectDyadicTemporalLayerPattern);}
    public void expectDyadicTemporalLayerPattern(int value) {this.ptr.set(LAYOUT$expectDyadicTemporalLayerPattern, OFFSET$expectDyadicTemporalLayerPattern, value);}
    public java.lang.foreign.MemorySegment expectDyadicTemporalLayerPattern_ptr() {return this.ptr.asSlice(OFFSET$expectDyadicTemporalLayerPattern, LAYOUT$expectDyadicTemporalLayerPattern);}

    public int minQp() {return this.ptr.get(LAYOUT$minQp, OFFSET$minQp);}
    public void minQp(int value) {this.ptr.set(LAYOUT$minQp, OFFSET$minQp, value);}
    public java.lang.foreign.MemorySegment minQp_ptr() {return this.ptr.asSlice(OFFSET$minQp, LAYOUT$minQp);}

    public int maxQp() {return this.ptr.get(LAYOUT$maxQp, OFFSET$maxQp);}
    public void maxQp(int value) {this.ptr.set(LAYOUT$maxQp, OFFSET$maxQp, value);}
    public java.lang.foreign.MemorySegment maxQp_ptr() {return this.ptr.asSlice(OFFSET$maxQp, LAYOUT$maxQp);}

    public int prefersGopRemainingFrames() {return this.ptr.get(LAYOUT$prefersGopRemainingFrames, OFFSET$prefersGopRemainingFrames);}
    public void prefersGopRemainingFrames(int value) {this.ptr.set(LAYOUT$prefersGopRemainingFrames, OFFSET$prefersGopRemainingFrames, value);}
    public java.lang.foreign.MemorySegment prefersGopRemainingFrames_ptr() {return this.ptr.asSlice(OFFSET$prefersGopRemainingFrames, LAYOUT$prefersGopRemainingFrames);}

    public int requiresGopRemainingFrames() {return this.ptr.get(LAYOUT$requiresGopRemainingFrames, OFFSET$requiresGopRemainingFrames);}
    public void requiresGopRemainingFrames(int value) {this.ptr.set(LAYOUT$requiresGopRemainingFrames, OFFSET$requiresGopRemainingFrames, value);}
    public java.lang.foreign.MemorySegment requiresGopRemainingFrames_ptr() {return this.ptr.asSlice(OFFSET$requiresGopRemainingFrames, LAYOUT$requiresGopRemainingFrames);}

    public int stdSyntaxFlags() {return this.ptr.get(LAYOUT$stdSyntaxFlags, OFFSET$stdSyntaxFlags);}
    public void stdSyntaxFlags(int value) {this.ptr.set(LAYOUT$stdSyntaxFlags, OFFSET$stdSyntaxFlags, value);}
    public java.lang.foreign.MemorySegment stdSyntaxFlags_ptr() {return this.ptr.asSlice(OFFSET$stdSyntaxFlags, LAYOUT$stdSyntaxFlags);}
}
