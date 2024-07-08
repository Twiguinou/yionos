package vulkan;

public record VkVideoEncodeH264RateControlLayerInfoKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__useMinQp = java.lang.foreign.ValueLayout.JAVA_INT.withName("useMinQp");
    public static final long OFFSET__useMinQp = 16;
    public static final java.lang.foreign.StructLayout LAYOUT__minQp = vulkan.VkVideoEncodeH264QpKHR.gRecordLayout.withName("minQp");
    public static final long OFFSET__minQp = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__useMaxQp = java.lang.foreign.ValueLayout.JAVA_INT.withName("useMaxQp");
    public static final long OFFSET__useMaxQp = 32;
    public static final java.lang.foreign.StructLayout LAYOUT__maxQp = vulkan.VkVideoEncodeH264QpKHR.gRecordLayout.withName("maxQp");
    public static final long OFFSET__maxQp = 36;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__useMaxFrameSize = java.lang.foreign.ValueLayout.JAVA_INT.withName("useMaxFrameSize");
    public static final long OFFSET__useMaxFrameSize = 48;
    public static final java.lang.foreign.StructLayout LAYOUT__maxFrameSize = vulkan.VkVideoEncodeH264FrameSizeKHR.gRecordLayout.withName("maxFrameSize");
    public static final long OFFSET__maxFrameSize = 52;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__useMinQp,
            LAYOUT__minQp,
            LAYOUT__useMaxQp,
            LAYOUT__maxQp,
            LAYOUT__useMaxFrameSize,
            LAYOUT__maxFrameSize
    ).withByteAlignment(8).withName("VkVideoEncodeH264RateControlLayerInfoKHR");

    public VkVideoEncodeH264RateControlLayerInfoKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkVideoEncodeH264RateControlLayerInfoKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkVideoEncodeH264RateControlLayerInfoKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkVideoEncodeH264RateControlLayerInfoKHR value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int useMinQp() {return this.ptr.get(LAYOUT__useMinQp, OFFSET__useMinQp);}
    public void useMinQp(int value) {this.ptr.set(LAYOUT__useMinQp, OFFSET__useMinQp, value);}
    public java.lang.foreign.MemorySegment $useMinQp() {return this.ptr.asSlice(OFFSET__useMinQp, LAYOUT__useMinQp);}

    public vulkan.VkVideoEncodeH264QpKHR minQp() {return new vulkan.VkVideoEncodeH264QpKHR(this.ptr.asSlice(OFFSET__minQp, LAYOUT__minQp));}
    public void minQp(java.util.function.Consumer<vulkan.VkVideoEncodeH264QpKHR> consumer) {consumer.accept(this.minQp());}
    public void minQp(vulkan.VkVideoEncodeH264QpKHR value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__minQp, LAYOUT__minQp.byteSize());}

    public int useMaxQp() {return this.ptr.get(LAYOUT__useMaxQp, OFFSET__useMaxQp);}
    public void useMaxQp(int value) {this.ptr.set(LAYOUT__useMaxQp, OFFSET__useMaxQp, value);}
    public java.lang.foreign.MemorySegment $useMaxQp() {return this.ptr.asSlice(OFFSET__useMaxQp, LAYOUT__useMaxQp);}

    public vulkan.VkVideoEncodeH264QpKHR maxQp() {return new vulkan.VkVideoEncodeH264QpKHR(this.ptr.asSlice(OFFSET__maxQp, LAYOUT__maxQp));}
    public void maxQp(java.util.function.Consumer<vulkan.VkVideoEncodeH264QpKHR> consumer) {consumer.accept(this.maxQp());}
    public void maxQp(vulkan.VkVideoEncodeH264QpKHR value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__maxQp, LAYOUT__maxQp.byteSize());}

    public int useMaxFrameSize() {return this.ptr.get(LAYOUT__useMaxFrameSize, OFFSET__useMaxFrameSize);}
    public void useMaxFrameSize(int value) {this.ptr.set(LAYOUT__useMaxFrameSize, OFFSET__useMaxFrameSize, value);}
    public java.lang.foreign.MemorySegment $useMaxFrameSize() {return this.ptr.asSlice(OFFSET__useMaxFrameSize, LAYOUT__useMaxFrameSize);}

    public vulkan.VkVideoEncodeH264FrameSizeKHR maxFrameSize() {return new vulkan.VkVideoEncodeH264FrameSizeKHR(this.ptr.asSlice(OFFSET__maxFrameSize, LAYOUT__maxFrameSize));}
    public void maxFrameSize(java.util.function.Consumer<vulkan.VkVideoEncodeH264FrameSizeKHR> consumer) {consumer.accept(this.maxFrameSize());}
    public void maxFrameSize(vulkan.VkVideoEncodeH264FrameSizeKHR value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__maxFrameSize, LAYOUT__maxFrameSize.byteSize());}
}
