package vulkan;

public record VkDisplayPlaneCapabilitiesKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$supportedAlpha = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$supportedAlpha = 0L;
    public static final java.lang.foreign.GroupLayout LAYOUT$minSrcPosition = vulkan.VkOffset2D.gStructLayout;
    public static final long OFFSET$minSrcPosition = 4L;
    public static final java.lang.foreign.GroupLayout LAYOUT$maxSrcPosition = vulkan.VkOffset2D.gStructLayout;
    public static final long OFFSET$maxSrcPosition = 12L;
    public static final java.lang.foreign.GroupLayout LAYOUT$minSrcExtent = vulkan.VkExtent2D.gStructLayout;
    public static final long OFFSET$minSrcExtent = 20L;
    public static final java.lang.foreign.GroupLayout LAYOUT$maxSrcExtent = vulkan.VkExtent2D.gStructLayout;
    public static final long OFFSET$maxSrcExtent = 28L;
    public static final java.lang.foreign.GroupLayout LAYOUT$minDstPosition = vulkan.VkOffset2D.gStructLayout;
    public static final long OFFSET$minDstPosition = 36L;
    public static final java.lang.foreign.GroupLayout LAYOUT$maxDstPosition = vulkan.VkOffset2D.gStructLayout;
    public static final long OFFSET$maxDstPosition = 44L;
    public static final java.lang.foreign.GroupLayout LAYOUT$minDstExtent = vulkan.VkExtent2D.gStructLayout;
    public static final long OFFSET$minDstExtent = 52L;
    public static final java.lang.foreign.GroupLayout LAYOUT$maxDstExtent = vulkan.VkExtent2D.gStructLayout;
    public static final long OFFSET$maxDstExtent = 60L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$supportedAlpha,
            LAYOUT$minSrcPosition,
            LAYOUT$maxSrcPosition,
            LAYOUT$minSrcExtent,
            LAYOUT$maxSrcExtent,
            LAYOUT$minDstPosition,
            LAYOUT$maxDstPosition,
            LAYOUT$minDstExtent,
            LAYOUT$maxDstExtent
    ).withName("VkDisplayPlaneCapabilitiesKHR");

    public VkDisplayPlaneCapabilitiesKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VkDisplayPlaneCapabilitiesKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VkDisplayPlaneCapabilitiesKHR(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int supportedAlpha() {return this.ptr.get(LAYOUT$supportedAlpha, OFFSET$supportedAlpha);}
    public void supportedAlpha(int value) {this.ptr.set(LAYOUT$supportedAlpha, OFFSET$supportedAlpha, value);}
    public java.lang.foreign.MemorySegment supportedAlpha_ptr() {return this.ptr.asSlice(OFFSET$supportedAlpha, LAYOUT$supportedAlpha);}

    public vulkan.VkOffset2D minSrcPosition() {return new vulkan.VkOffset2D(this.ptr.asSlice(OFFSET$minSrcPosition, LAYOUT$minSrcPosition));}
    public void minSrcPosition(java.util.function.Consumer<vulkan.VkOffset2D> consumer) {consumer.accept(this.minSrcPosition());}
    public void minSrcPosition(vulkan.VkOffset2D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$minSrcPosition, LAYOUT$minSrcPosition.byteSize());}

    public vulkan.VkOffset2D maxSrcPosition() {return new vulkan.VkOffset2D(this.ptr.asSlice(OFFSET$maxSrcPosition, LAYOUT$maxSrcPosition));}
    public void maxSrcPosition(java.util.function.Consumer<vulkan.VkOffset2D> consumer) {consumer.accept(this.maxSrcPosition());}
    public void maxSrcPosition(vulkan.VkOffset2D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$maxSrcPosition, LAYOUT$maxSrcPosition.byteSize());}

    public vulkan.VkExtent2D minSrcExtent() {return new vulkan.VkExtent2D(this.ptr.asSlice(OFFSET$minSrcExtent, LAYOUT$minSrcExtent));}
    public void minSrcExtent(java.util.function.Consumer<vulkan.VkExtent2D> consumer) {consumer.accept(this.minSrcExtent());}
    public void minSrcExtent(vulkan.VkExtent2D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$minSrcExtent, LAYOUT$minSrcExtent.byteSize());}

    public vulkan.VkExtent2D maxSrcExtent() {return new vulkan.VkExtent2D(this.ptr.asSlice(OFFSET$maxSrcExtent, LAYOUT$maxSrcExtent));}
    public void maxSrcExtent(java.util.function.Consumer<vulkan.VkExtent2D> consumer) {consumer.accept(this.maxSrcExtent());}
    public void maxSrcExtent(vulkan.VkExtent2D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$maxSrcExtent, LAYOUT$maxSrcExtent.byteSize());}

    public vulkan.VkOffset2D minDstPosition() {return new vulkan.VkOffset2D(this.ptr.asSlice(OFFSET$minDstPosition, LAYOUT$minDstPosition));}
    public void minDstPosition(java.util.function.Consumer<vulkan.VkOffset2D> consumer) {consumer.accept(this.minDstPosition());}
    public void minDstPosition(vulkan.VkOffset2D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$minDstPosition, LAYOUT$minDstPosition.byteSize());}

    public vulkan.VkOffset2D maxDstPosition() {return new vulkan.VkOffset2D(this.ptr.asSlice(OFFSET$maxDstPosition, LAYOUT$maxDstPosition));}
    public void maxDstPosition(java.util.function.Consumer<vulkan.VkOffset2D> consumer) {consumer.accept(this.maxDstPosition());}
    public void maxDstPosition(vulkan.VkOffset2D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$maxDstPosition, LAYOUT$maxDstPosition.byteSize());}

    public vulkan.VkExtent2D minDstExtent() {return new vulkan.VkExtent2D(this.ptr.asSlice(OFFSET$minDstExtent, LAYOUT$minDstExtent));}
    public void minDstExtent(java.util.function.Consumer<vulkan.VkExtent2D> consumer) {consumer.accept(this.minDstExtent());}
    public void minDstExtent(vulkan.VkExtent2D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$minDstExtent, LAYOUT$minDstExtent.byteSize());}

    public vulkan.VkExtent2D maxDstExtent() {return new vulkan.VkExtent2D(this.ptr.asSlice(OFFSET$maxDstExtent, LAYOUT$maxDstExtent));}
    public void maxDstExtent(java.util.function.Consumer<vulkan.VkExtent2D> consumer) {consumer.accept(this.maxDstExtent());}
    public void maxDstExtent(vulkan.VkExtent2D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$maxDstExtent, LAYOUT$maxDstExtent.byteSize());}
}
