package vulkan;

public record VkImageMemoryBarrier2(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__srcStageMask = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__srcStageMask = 16;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__srcAccessMask = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__srcAccessMask = 24;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__dstStageMask = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__dstStageMask = 32;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__dstAccessMask = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__dstAccessMask = 40;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__oldLayout = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__oldLayout = 48;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__newLayout = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__newLayout = 52;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__srcQueueFamilyIndex = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__srcQueueFamilyIndex = 56;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__dstQueueFamilyIndex = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__dstQueueFamilyIndex = 60;
    public static final java.lang.foreign.AddressLayout LAYOUT__image = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__image = 64;
    public static final java.lang.foreign.StructLayout LAYOUT__subresourceRange = vulkan.VkImageSubresourceRange.gRecordLayout;
    public static final long OFFSET__subresourceRange = 72;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__srcStageMask,
            LAYOUT__srcAccessMask,
            LAYOUT__dstStageMask,
            LAYOUT__dstAccessMask,
            LAYOUT__oldLayout,
            LAYOUT__newLayout,
            LAYOUT__srcQueueFamilyIndex,
            LAYOUT__dstQueueFamilyIndex,
            LAYOUT__image,
            LAYOUT__subresourceRange,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkImageMemoryBarrier2");

    public VkImageMemoryBarrier2(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkImageMemoryBarrier2 getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkImageMemoryBarrier2(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkImageMemoryBarrier2 value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public long srcStageMask() {return this.ptr.get(LAYOUT__srcStageMask, OFFSET__srcStageMask);}
    public void srcStageMask(long value) {this.ptr.set(LAYOUT__srcStageMask, OFFSET__srcStageMask, value);}
    public java.lang.foreign.MemorySegment $srcStageMask() {return this.ptr.asSlice(OFFSET__srcStageMask, LAYOUT__srcStageMask);}

    public long srcAccessMask() {return this.ptr.get(LAYOUT__srcAccessMask, OFFSET__srcAccessMask);}
    public void srcAccessMask(long value) {this.ptr.set(LAYOUT__srcAccessMask, OFFSET__srcAccessMask, value);}
    public java.lang.foreign.MemorySegment $srcAccessMask() {return this.ptr.asSlice(OFFSET__srcAccessMask, LAYOUT__srcAccessMask);}

    public long dstStageMask() {return this.ptr.get(LAYOUT__dstStageMask, OFFSET__dstStageMask);}
    public void dstStageMask(long value) {this.ptr.set(LAYOUT__dstStageMask, OFFSET__dstStageMask, value);}
    public java.lang.foreign.MemorySegment $dstStageMask() {return this.ptr.asSlice(OFFSET__dstStageMask, LAYOUT__dstStageMask);}

    public long dstAccessMask() {return this.ptr.get(LAYOUT__dstAccessMask, OFFSET__dstAccessMask);}
    public void dstAccessMask(long value) {this.ptr.set(LAYOUT__dstAccessMask, OFFSET__dstAccessMask, value);}
    public java.lang.foreign.MemorySegment $dstAccessMask() {return this.ptr.asSlice(OFFSET__dstAccessMask, LAYOUT__dstAccessMask);}

    public int oldLayout() {return this.ptr.get(LAYOUT__oldLayout, OFFSET__oldLayout);}
    public void oldLayout(int value) {this.ptr.set(LAYOUT__oldLayout, OFFSET__oldLayout, value);}
    public java.lang.foreign.MemorySegment $oldLayout() {return this.ptr.asSlice(OFFSET__oldLayout, LAYOUT__oldLayout);}

    public int newLayout() {return this.ptr.get(LAYOUT__newLayout, OFFSET__newLayout);}
    public void newLayout(int value) {this.ptr.set(LAYOUT__newLayout, OFFSET__newLayout, value);}
    public java.lang.foreign.MemorySegment $newLayout() {return this.ptr.asSlice(OFFSET__newLayout, LAYOUT__newLayout);}

    public int srcQueueFamilyIndex() {return this.ptr.get(LAYOUT__srcQueueFamilyIndex, OFFSET__srcQueueFamilyIndex);}
    public void srcQueueFamilyIndex(int value) {this.ptr.set(LAYOUT__srcQueueFamilyIndex, OFFSET__srcQueueFamilyIndex, value);}
    public java.lang.foreign.MemorySegment $srcQueueFamilyIndex() {return this.ptr.asSlice(OFFSET__srcQueueFamilyIndex, LAYOUT__srcQueueFamilyIndex);}

    public int dstQueueFamilyIndex() {return this.ptr.get(LAYOUT__dstQueueFamilyIndex, OFFSET__dstQueueFamilyIndex);}
    public void dstQueueFamilyIndex(int value) {this.ptr.set(LAYOUT__dstQueueFamilyIndex, OFFSET__dstQueueFamilyIndex, value);}
    public java.lang.foreign.MemorySegment $dstQueueFamilyIndex() {return this.ptr.asSlice(OFFSET__dstQueueFamilyIndex, LAYOUT__dstQueueFamilyIndex);}

    public java.lang.foreign.MemorySegment image() {return this.ptr.get(LAYOUT__image, OFFSET__image);}
    public void image(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__image, OFFSET__image, value);}
    public java.lang.foreign.MemorySegment $image() {return this.ptr.asSlice(OFFSET__image, LAYOUT__image);}

    public vulkan.VkImageSubresourceRange subresourceRange() {return new vulkan.VkImageSubresourceRange(this.ptr.asSlice(OFFSET__subresourceRange, LAYOUT__subresourceRange));}
    public void subresourceRange(java.util.function.Consumer<vulkan.VkImageSubresourceRange> consumer) {consumer.accept(this.subresourceRange());}
    public void subresourceRange(vulkan.VkImageSubresourceRange value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__subresourceRange, LAYOUT__subresourceRange.byteSize());}
}
