package vulkan;

public record VkDisplayPlaneCapabilitiesKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__supportedAlpha = java.lang.foreign.ValueLayout.JAVA_INT.withName("supportedAlpha");
    public static final long OFFSET__supportedAlpha = 0;
    public static final java.lang.foreign.StructLayout LAYOUT__minSrcPosition = vulkan.VkOffset2D.gRecordLayout.withName("minSrcPosition");
    public static final long OFFSET__minSrcPosition = 4;
    public static final java.lang.foreign.StructLayout LAYOUT__maxSrcPosition = vulkan.VkOffset2D.gRecordLayout.withName("maxSrcPosition");
    public static final long OFFSET__maxSrcPosition = 12;
    public static final java.lang.foreign.StructLayout LAYOUT__minSrcExtent = vulkan.VkExtent2D.gRecordLayout.withName("minSrcExtent");
    public static final long OFFSET__minSrcExtent = 20;
    public static final java.lang.foreign.StructLayout LAYOUT__maxSrcExtent = vulkan.VkExtent2D.gRecordLayout.withName("maxSrcExtent");
    public static final long OFFSET__maxSrcExtent = 28;
    public static final java.lang.foreign.StructLayout LAYOUT__minDstPosition = vulkan.VkOffset2D.gRecordLayout.withName("minDstPosition");
    public static final long OFFSET__minDstPosition = 36;
    public static final java.lang.foreign.StructLayout LAYOUT__maxDstPosition = vulkan.VkOffset2D.gRecordLayout.withName("maxDstPosition");
    public static final long OFFSET__maxDstPosition = 44;
    public static final java.lang.foreign.StructLayout LAYOUT__minDstExtent = vulkan.VkExtent2D.gRecordLayout.withName("minDstExtent");
    public static final long OFFSET__minDstExtent = 52;
    public static final java.lang.foreign.StructLayout LAYOUT__maxDstExtent = vulkan.VkExtent2D.gRecordLayout.withName("maxDstExtent");
    public static final long OFFSET__maxDstExtent = 60;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__supportedAlpha,
            LAYOUT__minSrcPosition,
            LAYOUT__maxSrcPosition,
            LAYOUT__minSrcExtent,
            LAYOUT__maxSrcExtent,
            LAYOUT__minDstPosition,
            LAYOUT__maxDstPosition,
            LAYOUT__minDstExtent,
            LAYOUT__maxDstExtent
    ).withByteAlignment(4).withName("VkDisplayPlaneCapabilitiesKHR");

    public VkDisplayPlaneCapabilitiesKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkDisplayPlaneCapabilitiesKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkDisplayPlaneCapabilitiesKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkDisplayPlaneCapabilitiesKHR value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int supportedAlpha() {return this.ptr.get(LAYOUT__supportedAlpha, OFFSET__supportedAlpha);}
    public void supportedAlpha(int value) {this.ptr.set(LAYOUT__supportedAlpha, OFFSET__supportedAlpha, value);}
    public java.lang.foreign.MemorySegment $supportedAlpha() {return this.ptr.asSlice(OFFSET__supportedAlpha, LAYOUT__supportedAlpha);}

    public vulkan.VkOffset2D minSrcPosition() {return new vulkan.VkOffset2D(this.ptr.asSlice(OFFSET__minSrcPosition, LAYOUT__minSrcPosition));}
    public void minSrcPosition(java.util.function.Consumer<vulkan.VkOffset2D> consumer) {consumer.accept(this.minSrcPosition());}
    public void minSrcPosition(vulkan.VkOffset2D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__minSrcPosition, LAYOUT__minSrcPosition.byteSize());}

    public vulkan.VkOffset2D maxSrcPosition() {return new vulkan.VkOffset2D(this.ptr.asSlice(OFFSET__maxSrcPosition, LAYOUT__maxSrcPosition));}
    public void maxSrcPosition(java.util.function.Consumer<vulkan.VkOffset2D> consumer) {consumer.accept(this.maxSrcPosition());}
    public void maxSrcPosition(vulkan.VkOffset2D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__maxSrcPosition, LAYOUT__maxSrcPosition.byteSize());}

    public vulkan.VkExtent2D minSrcExtent() {return new vulkan.VkExtent2D(this.ptr.asSlice(OFFSET__minSrcExtent, LAYOUT__minSrcExtent));}
    public void minSrcExtent(java.util.function.Consumer<vulkan.VkExtent2D> consumer) {consumer.accept(this.minSrcExtent());}
    public void minSrcExtent(vulkan.VkExtent2D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__minSrcExtent, LAYOUT__minSrcExtent.byteSize());}

    public vulkan.VkExtent2D maxSrcExtent() {return new vulkan.VkExtent2D(this.ptr.asSlice(OFFSET__maxSrcExtent, LAYOUT__maxSrcExtent));}
    public void maxSrcExtent(java.util.function.Consumer<vulkan.VkExtent2D> consumer) {consumer.accept(this.maxSrcExtent());}
    public void maxSrcExtent(vulkan.VkExtent2D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__maxSrcExtent, LAYOUT__maxSrcExtent.byteSize());}

    public vulkan.VkOffset2D minDstPosition() {return new vulkan.VkOffset2D(this.ptr.asSlice(OFFSET__minDstPosition, LAYOUT__minDstPosition));}
    public void minDstPosition(java.util.function.Consumer<vulkan.VkOffset2D> consumer) {consumer.accept(this.minDstPosition());}
    public void minDstPosition(vulkan.VkOffset2D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__minDstPosition, LAYOUT__minDstPosition.byteSize());}

    public vulkan.VkOffset2D maxDstPosition() {return new vulkan.VkOffset2D(this.ptr.asSlice(OFFSET__maxDstPosition, LAYOUT__maxDstPosition));}
    public void maxDstPosition(java.util.function.Consumer<vulkan.VkOffset2D> consumer) {consumer.accept(this.maxDstPosition());}
    public void maxDstPosition(vulkan.VkOffset2D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__maxDstPosition, LAYOUT__maxDstPosition.byteSize());}

    public vulkan.VkExtent2D minDstExtent() {return new vulkan.VkExtent2D(this.ptr.asSlice(OFFSET__minDstExtent, LAYOUT__minDstExtent));}
    public void minDstExtent(java.util.function.Consumer<vulkan.VkExtent2D> consumer) {consumer.accept(this.minDstExtent());}
    public void minDstExtent(vulkan.VkExtent2D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__minDstExtent, LAYOUT__minDstExtent.byteSize());}

    public vulkan.VkExtent2D maxDstExtent() {return new vulkan.VkExtent2D(this.ptr.asSlice(OFFSET__maxDstExtent, LAYOUT__maxDstExtent));}
    public void maxDstExtent(java.util.function.Consumer<vulkan.VkExtent2D> consumer) {consumer.accept(this.maxDstExtent());}
    public void maxDstExtent(vulkan.VkExtent2D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__maxDstExtent, LAYOUT__maxDstExtent.byteSize());}
}
