package vulkan;

public record VkVideoEncodeH265CapabilitiesKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$flags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$flags = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxLevelIdc = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxLevelIdc = 20L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxSliceSegmentCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxSliceSegmentCount = 24L;
    public static final java.lang.foreign.GroupLayout LAYOUT$maxTiles = vulkan.VkExtent2D.gStructLayout;
    public static final long OFFSET$maxTiles = 28L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$ctbSizes = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$ctbSizes = 36L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$transformBlockSizes = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$transformBlockSizes = 40L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxPPictureL0ReferenceCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxPPictureL0ReferenceCount = 44L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxBPictureL0ReferenceCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxBPictureL0ReferenceCount = 48L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxL1ReferenceCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxL1ReferenceCount = 52L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxSubLayerCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxSubLayerCount = 56L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$expectDyadicTemporalSubLayerPattern = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$expectDyadicTemporalSubLayerPattern = 60L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$minQp = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$minQp = 64L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxQp = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxQp = 68L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$prefersGopRemainingFrames = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$prefersGopRemainingFrames = 72L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$requiresGopRemainingFrames = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$requiresGopRemainingFrames = 76L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$stdSyntaxFlags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$stdSyntaxFlags = 80L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$flags,
            LAYOUT$maxLevelIdc,
            LAYOUT$maxSliceSegmentCount,
            LAYOUT$maxTiles,
            LAYOUT$ctbSizes,
            LAYOUT$transformBlockSizes,
            LAYOUT$maxPPictureL0ReferenceCount,
            LAYOUT$maxBPictureL0ReferenceCount,
            LAYOUT$maxL1ReferenceCount,
            LAYOUT$maxSubLayerCount,
            LAYOUT$expectDyadicTemporalSubLayerPattern,
            LAYOUT$minQp,
            LAYOUT$maxQp,
            LAYOUT$prefersGopRemainingFrames,
            LAYOUT$requiresGopRemainingFrames,
            LAYOUT$stdSyntaxFlags,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("VkVideoEncodeH265CapabilitiesKHR");

    public VkVideoEncodeH265CapabilitiesKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VkVideoEncodeH265CapabilitiesKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VkVideoEncodeH265CapabilitiesKHR(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
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

    public int maxSliceSegmentCount() {return this.ptr.get(LAYOUT$maxSliceSegmentCount, OFFSET$maxSliceSegmentCount);}
    public void maxSliceSegmentCount(int value) {this.ptr.set(LAYOUT$maxSliceSegmentCount, OFFSET$maxSliceSegmentCount, value);}
    public java.lang.foreign.MemorySegment maxSliceSegmentCount_ptr() {return this.ptr.asSlice(OFFSET$maxSliceSegmentCount, LAYOUT$maxSliceSegmentCount);}

    public vulkan.VkExtent2D maxTiles() {return new vulkan.VkExtent2D(this.ptr.asSlice(OFFSET$maxTiles, LAYOUT$maxTiles));}
    public void maxTiles(java.util.function.Consumer<vulkan.VkExtent2D> consumer) {consumer.accept(this.maxTiles());}
    public void maxTiles(vulkan.VkExtent2D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$maxTiles, LAYOUT$maxTiles.byteSize());}

    public int ctbSizes() {return this.ptr.get(LAYOUT$ctbSizes, OFFSET$ctbSizes);}
    public void ctbSizes(int value) {this.ptr.set(LAYOUT$ctbSizes, OFFSET$ctbSizes, value);}
    public java.lang.foreign.MemorySegment ctbSizes_ptr() {return this.ptr.asSlice(OFFSET$ctbSizes, LAYOUT$ctbSizes);}

    public int transformBlockSizes() {return this.ptr.get(LAYOUT$transformBlockSizes, OFFSET$transformBlockSizes);}
    public void transformBlockSizes(int value) {this.ptr.set(LAYOUT$transformBlockSizes, OFFSET$transformBlockSizes, value);}
    public java.lang.foreign.MemorySegment transformBlockSizes_ptr() {return this.ptr.asSlice(OFFSET$transformBlockSizes, LAYOUT$transformBlockSizes);}

    public int maxPPictureL0ReferenceCount() {return this.ptr.get(LAYOUT$maxPPictureL0ReferenceCount, OFFSET$maxPPictureL0ReferenceCount);}
    public void maxPPictureL0ReferenceCount(int value) {this.ptr.set(LAYOUT$maxPPictureL0ReferenceCount, OFFSET$maxPPictureL0ReferenceCount, value);}
    public java.lang.foreign.MemorySegment maxPPictureL0ReferenceCount_ptr() {return this.ptr.asSlice(OFFSET$maxPPictureL0ReferenceCount, LAYOUT$maxPPictureL0ReferenceCount);}

    public int maxBPictureL0ReferenceCount() {return this.ptr.get(LAYOUT$maxBPictureL0ReferenceCount, OFFSET$maxBPictureL0ReferenceCount);}
    public void maxBPictureL0ReferenceCount(int value) {this.ptr.set(LAYOUT$maxBPictureL0ReferenceCount, OFFSET$maxBPictureL0ReferenceCount, value);}
    public java.lang.foreign.MemorySegment maxBPictureL0ReferenceCount_ptr() {return this.ptr.asSlice(OFFSET$maxBPictureL0ReferenceCount, LAYOUT$maxBPictureL0ReferenceCount);}

    public int maxL1ReferenceCount() {return this.ptr.get(LAYOUT$maxL1ReferenceCount, OFFSET$maxL1ReferenceCount);}
    public void maxL1ReferenceCount(int value) {this.ptr.set(LAYOUT$maxL1ReferenceCount, OFFSET$maxL1ReferenceCount, value);}
    public java.lang.foreign.MemorySegment maxL1ReferenceCount_ptr() {return this.ptr.asSlice(OFFSET$maxL1ReferenceCount, LAYOUT$maxL1ReferenceCount);}

    public int maxSubLayerCount() {return this.ptr.get(LAYOUT$maxSubLayerCount, OFFSET$maxSubLayerCount);}
    public void maxSubLayerCount(int value) {this.ptr.set(LAYOUT$maxSubLayerCount, OFFSET$maxSubLayerCount, value);}
    public java.lang.foreign.MemorySegment maxSubLayerCount_ptr() {return this.ptr.asSlice(OFFSET$maxSubLayerCount, LAYOUT$maxSubLayerCount);}

    public int expectDyadicTemporalSubLayerPattern() {return this.ptr.get(LAYOUT$expectDyadicTemporalSubLayerPattern, OFFSET$expectDyadicTemporalSubLayerPattern);}
    public void expectDyadicTemporalSubLayerPattern(int value) {this.ptr.set(LAYOUT$expectDyadicTemporalSubLayerPattern, OFFSET$expectDyadicTemporalSubLayerPattern, value);}
    public java.lang.foreign.MemorySegment expectDyadicTemporalSubLayerPattern_ptr() {return this.ptr.asSlice(OFFSET$expectDyadicTemporalSubLayerPattern, LAYOUT$expectDyadicTemporalSubLayerPattern);}

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
