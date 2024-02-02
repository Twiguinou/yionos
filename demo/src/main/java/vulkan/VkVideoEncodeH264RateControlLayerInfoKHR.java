package vulkan;

public record VkVideoEncodeH264RateControlLayerInfoKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$useMinQp = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$useMinQp = 16L;
    public static final java.lang.foreign.GroupLayout LAYOUT$minQp = vulkan.VkVideoEncodeH264QpKHR.gStructLayout;
    public static final long OFFSET$minQp = 20L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$useMaxQp = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$useMaxQp = 32L;
    public static final java.lang.foreign.GroupLayout LAYOUT$maxQp = vulkan.VkVideoEncodeH264QpKHR.gStructLayout;
    public static final long OFFSET$maxQp = 36L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$useMaxFrameSize = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$useMaxFrameSize = 48L;
    public static final java.lang.foreign.GroupLayout LAYOUT$maxFrameSize = vulkan.VkVideoEncodeH264FrameSizeKHR.gStructLayout;
    public static final long OFFSET$maxFrameSize = 52L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$useMinQp,
            LAYOUT$minQp,
            LAYOUT$useMaxQp,
            LAYOUT$maxQp,
            LAYOUT$useMaxFrameSize,
            LAYOUT$maxFrameSize
    ).withName("VkVideoEncodeH264RateControlLayerInfoKHR");

    public VkVideoEncodeH264RateControlLayerInfoKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VkVideoEncodeH264RateControlLayerInfoKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VkVideoEncodeH264RateControlLayerInfoKHR(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int useMinQp() {return this.ptr.get(LAYOUT$useMinQp, OFFSET$useMinQp);}
    public void useMinQp(int value) {this.ptr.set(LAYOUT$useMinQp, OFFSET$useMinQp, value);}
    public java.lang.foreign.MemorySegment useMinQp_ptr() {return this.ptr.asSlice(OFFSET$useMinQp, LAYOUT$useMinQp);}

    public vulkan.VkVideoEncodeH264QpKHR minQp() {return new vulkan.VkVideoEncodeH264QpKHR(this.ptr.asSlice(OFFSET$minQp, LAYOUT$minQp));}
    public void minQp(java.util.function.Consumer<vulkan.VkVideoEncodeH264QpKHR> consumer) {consumer.accept(this.minQp());}
    public void minQp(vulkan.VkVideoEncodeH264QpKHR value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$minQp, LAYOUT$minQp.byteSize());}

    public int useMaxQp() {return this.ptr.get(LAYOUT$useMaxQp, OFFSET$useMaxQp);}
    public void useMaxQp(int value) {this.ptr.set(LAYOUT$useMaxQp, OFFSET$useMaxQp, value);}
    public java.lang.foreign.MemorySegment useMaxQp_ptr() {return this.ptr.asSlice(OFFSET$useMaxQp, LAYOUT$useMaxQp);}

    public vulkan.VkVideoEncodeH264QpKHR maxQp() {return new vulkan.VkVideoEncodeH264QpKHR(this.ptr.asSlice(OFFSET$maxQp, LAYOUT$maxQp));}
    public void maxQp(java.util.function.Consumer<vulkan.VkVideoEncodeH264QpKHR> consumer) {consumer.accept(this.maxQp());}
    public void maxQp(vulkan.VkVideoEncodeH264QpKHR value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$maxQp, LAYOUT$maxQp.byteSize());}

    public int useMaxFrameSize() {return this.ptr.get(LAYOUT$useMaxFrameSize, OFFSET$useMaxFrameSize);}
    public void useMaxFrameSize(int value) {this.ptr.set(LAYOUT$useMaxFrameSize, OFFSET$useMaxFrameSize, value);}
    public java.lang.foreign.MemorySegment useMaxFrameSize_ptr() {return this.ptr.asSlice(OFFSET$useMaxFrameSize, LAYOUT$useMaxFrameSize);}

    public vulkan.VkVideoEncodeH264FrameSizeKHR maxFrameSize() {return new vulkan.VkVideoEncodeH264FrameSizeKHR(this.ptr.asSlice(OFFSET$maxFrameSize, LAYOUT$maxFrameSize));}
    public void maxFrameSize(java.util.function.Consumer<vulkan.VkVideoEncodeH264FrameSizeKHR> consumer) {consumer.accept(this.maxFrameSize());}
    public void maxFrameSize(vulkan.VkVideoEncodeH264FrameSizeKHR value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$maxFrameSize, LAYOUT$maxFrameSize.byteSize());}
}
