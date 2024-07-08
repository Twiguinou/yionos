package vulkan;

public record VkVideoEncodeH264CapabilitiesKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__flags = java.lang.foreign.ValueLayout.JAVA_INT.withName("flags");
    public static final long OFFSET__flags = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxLevelIdc = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxLevelIdc");
    public static final long OFFSET__maxLevelIdc = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxSliceCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxSliceCount");
    public static final long OFFSET__maxSliceCount = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxPPictureL0ReferenceCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxPPictureL0ReferenceCount");
    public static final long OFFSET__maxPPictureL0ReferenceCount = 28;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxBPictureL0ReferenceCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxBPictureL0ReferenceCount");
    public static final long OFFSET__maxBPictureL0ReferenceCount = 32;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxL1ReferenceCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxL1ReferenceCount");
    public static final long OFFSET__maxL1ReferenceCount = 36;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxTemporalLayerCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxTemporalLayerCount");
    public static final long OFFSET__maxTemporalLayerCount = 40;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__expectDyadicTemporalLayerPattern = java.lang.foreign.ValueLayout.JAVA_INT.withName("expectDyadicTemporalLayerPattern");
    public static final long OFFSET__expectDyadicTemporalLayerPattern = 44;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__minQp = java.lang.foreign.ValueLayout.JAVA_INT.withName("minQp");
    public static final long OFFSET__minQp = 48;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxQp = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxQp");
    public static final long OFFSET__maxQp = 52;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__prefersGopRemainingFrames = java.lang.foreign.ValueLayout.JAVA_INT.withName("prefersGopRemainingFrames");
    public static final long OFFSET__prefersGopRemainingFrames = 56;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__requiresGopRemainingFrames = java.lang.foreign.ValueLayout.JAVA_INT.withName("requiresGopRemainingFrames");
    public static final long OFFSET__requiresGopRemainingFrames = 60;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__stdSyntaxFlags = java.lang.foreign.ValueLayout.JAVA_INT.withName("stdSyntaxFlags");
    public static final long OFFSET__stdSyntaxFlags = 64;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__flags,
            LAYOUT__maxLevelIdc,
            LAYOUT__maxSliceCount,
            LAYOUT__maxPPictureL0ReferenceCount,
            LAYOUT__maxBPictureL0ReferenceCount,
            LAYOUT__maxL1ReferenceCount,
            LAYOUT__maxTemporalLayerCount,
            LAYOUT__expectDyadicTemporalLayerPattern,
            LAYOUT__minQp,
            LAYOUT__maxQp,
            LAYOUT__prefersGopRemainingFrames,
            LAYOUT__requiresGopRemainingFrames,
            LAYOUT__stdSyntaxFlags,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkVideoEncodeH264CapabilitiesKHR");

    public VkVideoEncodeH264CapabilitiesKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkVideoEncodeH264CapabilitiesKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkVideoEncodeH264CapabilitiesKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkVideoEncodeH264CapabilitiesKHR value)
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

    public int maxLevelIdc() {return this.ptr.get(LAYOUT__maxLevelIdc, OFFSET__maxLevelIdc);}
    public void maxLevelIdc(int value) {this.ptr.set(LAYOUT__maxLevelIdc, OFFSET__maxLevelIdc, value);}
    public java.lang.foreign.MemorySegment $maxLevelIdc() {return this.ptr.asSlice(OFFSET__maxLevelIdc, LAYOUT__maxLevelIdc);}

    public int maxSliceCount() {return this.ptr.get(LAYOUT__maxSliceCount, OFFSET__maxSliceCount);}
    public void maxSliceCount(int value) {this.ptr.set(LAYOUT__maxSliceCount, OFFSET__maxSliceCount, value);}
    public java.lang.foreign.MemorySegment $maxSliceCount() {return this.ptr.asSlice(OFFSET__maxSliceCount, LAYOUT__maxSliceCount);}

    public int maxPPictureL0ReferenceCount() {return this.ptr.get(LAYOUT__maxPPictureL0ReferenceCount, OFFSET__maxPPictureL0ReferenceCount);}
    public void maxPPictureL0ReferenceCount(int value) {this.ptr.set(LAYOUT__maxPPictureL0ReferenceCount, OFFSET__maxPPictureL0ReferenceCount, value);}
    public java.lang.foreign.MemorySegment $maxPPictureL0ReferenceCount() {return this.ptr.asSlice(OFFSET__maxPPictureL0ReferenceCount, LAYOUT__maxPPictureL0ReferenceCount);}

    public int maxBPictureL0ReferenceCount() {return this.ptr.get(LAYOUT__maxBPictureL0ReferenceCount, OFFSET__maxBPictureL0ReferenceCount);}
    public void maxBPictureL0ReferenceCount(int value) {this.ptr.set(LAYOUT__maxBPictureL0ReferenceCount, OFFSET__maxBPictureL0ReferenceCount, value);}
    public java.lang.foreign.MemorySegment $maxBPictureL0ReferenceCount() {return this.ptr.asSlice(OFFSET__maxBPictureL0ReferenceCount, LAYOUT__maxBPictureL0ReferenceCount);}

    public int maxL1ReferenceCount() {return this.ptr.get(LAYOUT__maxL1ReferenceCount, OFFSET__maxL1ReferenceCount);}
    public void maxL1ReferenceCount(int value) {this.ptr.set(LAYOUT__maxL1ReferenceCount, OFFSET__maxL1ReferenceCount, value);}
    public java.lang.foreign.MemorySegment $maxL1ReferenceCount() {return this.ptr.asSlice(OFFSET__maxL1ReferenceCount, LAYOUT__maxL1ReferenceCount);}

    public int maxTemporalLayerCount() {return this.ptr.get(LAYOUT__maxTemporalLayerCount, OFFSET__maxTemporalLayerCount);}
    public void maxTemporalLayerCount(int value) {this.ptr.set(LAYOUT__maxTemporalLayerCount, OFFSET__maxTemporalLayerCount, value);}
    public java.lang.foreign.MemorySegment $maxTemporalLayerCount() {return this.ptr.asSlice(OFFSET__maxTemporalLayerCount, LAYOUT__maxTemporalLayerCount);}

    public int expectDyadicTemporalLayerPattern() {return this.ptr.get(LAYOUT__expectDyadicTemporalLayerPattern, OFFSET__expectDyadicTemporalLayerPattern);}
    public void expectDyadicTemporalLayerPattern(int value) {this.ptr.set(LAYOUT__expectDyadicTemporalLayerPattern, OFFSET__expectDyadicTemporalLayerPattern, value);}
    public java.lang.foreign.MemorySegment $expectDyadicTemporalLayerPattern() {return this.ptr.asSlice(OFFSET__expectDyadicTemporalLayerPattern, LAYOUT__expectDyadicTemporalLayerPattern);}

    public int minQp() {return this.ptr.get(LAYOUT__minQp, OFFSET__minQp);}
    public void minQp(int value) {this.ptr.set(LAYOUT__minQp, OFFSET__minQp, value);}
    public java.lang.foreign.MemorySegment $minQp() {return this.ptr.asSlice(OFFSET__minQp, LAYOUT__minQp);}

    public int maxQp() {return this.ptr.get(LAYOUT__maxQp, OFFSET__maxQp);}
    public void maxQp(int value) {this.ptr.set(LAYOUT__maxQp, OFFSET__maxQp, value);}
    public java.lang.foreign.MemorySegment $maxQp() {return this.ptr.asSlice(OFFSET__maxQp, LAYOUT__maxQp);}

    public int prefersGopRemainingFrames() {return this.ptr.get(LAYOUT__prefersGopRemainingFrames, OFFSET__prefersGopRemainingFrames);}
    public void prefersGopRemainingFrames(int value) {this.ptr.set(LAYOUT__prefersGopRemainingFrames, OFFSET__prefersGopRemainingFrames, value);}
    public java.lang.foreign.MemorySegment $prefersGopRemainingFrames() {return this.ptr.asSlice(OFFSET__prefersGopRemainingFrames, LAYOUT__prefersGopRemainingFrames);}

    public int requiresGopRemainingFrames() {return this.ptr.get(LAYOUT__requiresGopRemainingFrames, OFFSET__requiresGopRemainingFrames);}
    public void requiresGopRemainingFrames(int value) {this.ptr.set(LAYOUT__requiresGopRemainingFrames, OFFSET__requiresGopRemainingFrames, value);}
    public java.lang.foreign.MemorySegment $requiresGopRemainingFrames() {return this.ptr.asSlice(OFFSET__requiresGopRemainingFrames, LAYOUT__requiresGopRemainingFrames);}

    public int stdSyntaxFlags() {return this.ptr.get(LAYOUT__stdSyntaxFlags, OFFSET__stdSyntaxFlags);}
    public void stdSyntaxFlags(int value) {this.ptr.set(LAYOUT__stdSyntaxFlags, OFFSET__stdSyntaxFlags, value);}
    public java.lang.foreign.MemorySegment $stdSyntaxFlags() {return this.ptr.asSlice(OFFSET__stdSyntaxFlags, LAYOUT__stdSyntaxFlags);}
}
