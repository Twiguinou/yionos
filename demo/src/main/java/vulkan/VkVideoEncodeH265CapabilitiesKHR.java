package vulkan;

public record VkVideoEncodeH265CapabilitiesKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__flags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__flags = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxLevelIdc = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__maxLevelIdc = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxSliceSegmentCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__maxSliceSegmentCount = 24;
    public static final java.lang.foreign.StructLayout LAYOUT__maxTiles = vulkan.VkExtent2D.gRecordLayout;
    public static final long OFFSET__maxTiles = 28;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__ctbSizes = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__ctbSizes = 36;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__transformBlockSizes = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__transformBlockSizes = 40;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxPPictureL0ReferenceCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__maxPPictureL0ReferenceCount = 44;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxBPictureL0ReferenceCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__maxBPictureL0ReferenceCount = 48;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxL1ReferenceCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__maxL1ReferenceCount = 52;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxSubLayerCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__maxSubLayerCount = 56;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__expectDyadicTemporalSubLayerPattern = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__expectDyadicTemporalSubLayerPattern = 60;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__minQp = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__minQp = 64;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxQp = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__maxQp = 68;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__prefersGopRemainingFrames = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__prefersGopRemainingFrames = 72;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__requiresGopRemainingFrames = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__requiresGopRemainingFrames = 76;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__stdSyntaxFlags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__stdSyntaxFlags = 80;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__flags,
            LAYOUT__maxLevelIdc,
            LAYOUT__maxSliceSegmentCount,
            LAYOUT__maxTiles,
            LAYOUT__ctbSizes,
            LAYOUT__transformBlockSizes,
            LAYOUT__maxPPictureL0ReferenceCount,
            LAYOUT__maxBPictureL0ReferenceCount,
            LAYOUT__maxL1ReferenceCount,
            LAYOUT__maxSubLayerCount,
            LAYOUT__expectDyadicTemporalSubLayerPattern,
            LAYOUT__minQp,
            LAYOUT__maxQp,
            LAYOUT__prefersGopRemainingFrames,
            LAYOUT__requiresGopRemainingFrames,
            LAYOUT__stdSyntaxFlags,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkVideoEncodeH265CapabilitiesKHR");

    public VkVideoEncodeH265CapabilitiesKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkVideoEncodeH265CapabilitiesKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkVideoEncodeH265CapabilitiesKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkVideoEncodeH265CapabilitiesKHR value)
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

    public int maxSliceSegmentCount() {return this.ptr.get(LAYOUT__maxSliceSegmentCount, OFFSET__maxSliceSegmentCount);}
    public void maxSliceSegmentCount(int value) {this.ptr.set(LAYOUT__maxSliceSegmentCount, OFFSET__maxSliceSegmentCount, value);}
    public java.lang.foreign.MemorySegment $maxSliceSegmentCount() {return this.ptr.asSlice(OFFSET__maxSliceSegmentCount, LAYOUT__maxSliceSegmentCount);}

    public vulkan.VkExtent2D maxTiles() {return new vulkan.VkExtent2D(this.ptr.asSlice(OFFSET__maxTiles, LAYOUT__maxTiles));}
    public void maxTiles(java.util.function.Consumer<vulkan.VkExtent2D> consumer) {consumer.accept(this.maxTiles());}
    public void maxTiles(vulkan.VkExtent2D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__maxTiles, LAYOUT__maxTiles.byteSize());}

    public int ctbSizes() {return this.ptr.get(LAYOUT__ctbSizes, OFFSET__ctbSizes);}
    public void ctbSizes(int value) {this.ptr.set(LAYOUT__ctbSizes, OFFSET__ctbSizes, value);}
    public java.lang.foreign.MemorySegment $ctbSizes() {return this.ptr.asSlice(OFFSET__ctbSizes, LAYOUT__ctbSizes);}

    public int transformBlockSizes() {return this.ptr.get(LAYOUT__transformBlockSizes, OFFSET__transformBlockSizes);}
    public void transformBlockSizes(int value) {this.ptr.set(LAYOUT__transformBlockSizes, OFFSET__transformBlockSizes, value);}
    public java.lang.foreign.MemorySegment $transformBlockSizes() {return this.ptr.asSlice(OFFSET__transformBlockSizes, LAYOUT__transformBlockSizes);}

    public int maxPPictureL0ReferenceCount() {return this.ptr.get(LAYOUT__maxPPictureL0ReferenceCount, OFFSET__maxPPictureL0ReferenceCount);}
    public void maxPPictureL0ReferenceCount(int value) {this.ptr.set(LAYOUT__maxPPictureL0ReferenceCount, OFFSET__maxPPictureL0ReferenceCount, value);}
    public java.lang.foreign.MemorySegment $maxPPictureL0ReferenceCount() {return this.ptr.asSlice(OFFSET__maxPPictureL0ReferenceCount, LAYOUT__maxPPictureL0ReferenceCount);}

    public int maxBPictureL0ReferenceCount() {return this.ptr.get(LAYOUT__maxBPictureL0ReferenceCount, OFFSET__maxBPictureL0ReferenceCount);}
    public void maxBPictureL0ReferenceCount(int value) {this.ptr.set(LAYOUT__maxBPictureL0ReferenceCount, OFFSET__maxBPictureL0ReferenceCount, value);}
    public java.lang.foreign.MemorySegment $maxBPictureL0ReferenceCount() {return this.ptr.asSlice(OFFSET__maxBPictureL0ReferenceCount, LAYOUT__maxBPictureL0ReferenceCount);}

    public int maxL1ReferenceCount() {return this.ptr.get(LAYOUT__maxL1ReferenceCount, OFFSET__maxL1ReferenceCount);}
    public void maxL1ReferenceCount(int value) {this.ptr.set(LAYOUT__maxL1ReferenceCount, OFFSET__maxL1ReferenceCount, value);}
    public java.lang.foreign.MemorySegment $maxL1ReferenceCount() {return this.ptr.asSlice(OFFSET__maxL1ReferenceCount, LAYOUT__maxL1ReferenceCount);}

    public int maxSubLayerCount() {return this.ptr.get(LAYOUT__maxSubLayerCount, OFFSET__maxSubLayerCount);}
    public void maxSubLayerCount(int value) {this.ptr.set(LAYOUT__maxSubLayerCount, OFFSET__maxSubLayerCount, value);}
    public java.lang.foreign.MemorySegment $maxSubLayerCount() {return this.ptr.asSlice(OFFSET__maxSubLayerCount, LAYOUT__maxSubLayerCount);}

    public int expectDyadicTemporalSubLayerPattern() {return this.ptr.get(LAYOUT__expectDyadicTemporalSubLayerPattern, OFFSET__expectDyadicTemporalSubLayerPattern);}
    public void expectDyadicTemporalSubLayerPattern(int value) {this.ptr.set(LAYOUT__expectDyadicTemporalSubLayerPattern, OFFSET__expectDyadicTemporalSubLayerPattern, value);}
    public java.lang.foreign.MemorySegment $expectDyadicTemporalSubLayerPattern() {return this.ptr.asSlice(OFFSET__expectDyadicTemporalSubLayerPattern, LAYOUT__expectDyadicTemporalSubLayerPattern);}

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
