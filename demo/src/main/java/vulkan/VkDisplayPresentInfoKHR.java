package vulkan;

public record VkDisplayPresentInfoKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.StructLayout LAYOUT__srcRect = vulkan.VkRect2D.gRecordLayout.withName("srcRect");
    public static final long OFFSET__srcRect = 16;
    public static final java.lang.foreign.StructLayout LAYOUT__dstRect = vulkan.VkRect2D.gRecordLayout.withName("dstRect");
    public static final long OFFSET__dstRect = 32;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__persistent = java.lang.foreign.ValueLayout.JAVA_INT.withName("persistent");
    public static final long OFFSET__persistent = 48;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__srcRect,
            LAYOUT__dstRect,
            LAYOUT__persistent,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkDisplayPresentInfoKHR");

    public VkDisplayPresentInfoKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkDisplayPresentInfoKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkDisplayPresentInfoKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkDisplayPresentInfoKHR value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public vulkan.VkRect2D srcRect() {return new vulkan.VkRect2D(this.ptr.asSlice(OFFSET__srcRect, LAYOUT__srcRect));}
    public void srcRect(java.util.function.Consumer<vulkan.VkRect2D> consumer) {consumer.accept(this.srcRect());}
    public void srcRect(vulkan.VkRect2D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__srcRect, LAYOUT__srcRect.byteSize());}

    public vulkan.VkRect2D dstRect() {return new vulkan.VkRect2D(this.ptr.asSlice(OFFSET__dstRect, LAYOUT__dstRect));}
    public void dstRect(java.util.function.Consumer<vulkan.VkRect2D> consumer) {consumer.accept(this.dstRect());}
    public void dstRect(vulkan.VkRect2D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__dstRect, LAYOUT__dstRect.byteSize());}

    public int persistent() {return this.ptr.get(LAYOUT__persistent, OFFSET__persistent);}
    public void persistent(int value) {this.ptr.set(LAYOUT__persistent, OFFSET__persistent, value);}
    public java.lang.foreign.MemorySegment $persistent() {return this.ptr.asSlice(OFFSET__persistent, LAYOUT__persistent);}
}
