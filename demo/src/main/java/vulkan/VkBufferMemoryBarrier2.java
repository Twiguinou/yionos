package vulkan;

public record VkBufferMemoryBarrier2(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__srcStageMask = java.lang.foreign.ValueLayout.JAVA_LONG.withName("srcStageMask");
    public static final long OFFSET__srcStageMask = 16;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__srcAccessMask = java.lang.foreign.ValueLayout.JAVA_LONG.withName("srcAccessMask");
    public static final long OFFSET__srcAccessMask = 24;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__dstStageMask = java.lang.foreign.ValueLayout.JAVA_LONG.withName("dstStageMask");
    public static final long OFFSET__dstStageMask = 32;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__dstAccessMask = java.lang.foreign.ValueLayout.JAVA_LONG.withName("dstAccessMask");
    public static final long OFFSET__dstAccessMask = 40;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__srcQueueFamilyIndex = java.lang.foreign.ValueLayout.JAVA_INT.withName("srcQueueFamilyIndex");
    public static final long OFFSET__srcQueueFamilyIndex = 48;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__dstQueueFamilyIndex = java.lang.foreign.ValueLayout.JAVA_INT.withName("dstQueueFamilyIndex");
    public static final long OFFSET__dstQueueFamilyIndex = 52;
    public static final java.lang.foreign.AddressLayout LAYOUT__buffer = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("buffer");
    public static final long OFFSET__buffer = 56;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__offset = java.lang.foreign.ValueLayout.JAVA_LONG.withName("offset");
    public static final long OFFSET__offset = 64;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__size = java.lang.foreign.ValueLayout.JAVA_LONG.withName("size");
    public static final long OFFSET__size = 72;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__srcStageMask,
            LAYOUT__srcAccessMask,
            LAYOUT__dstStageMask,
            LAYOUT__dstAccessMask,
            LAYOUT__srcQueueFamilyIndex,
            LAYOUT__dstQueueFamilyIndex,
            LAYOUT__buffer,
            LAYOUT__offset,
            LAYOUT__size
    ).withByteAlignment(8).withName("VkBufferMemoryBarrier2");

    public VkBufferMemoryBarrier2(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkBufferMemoryBarrier2 getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkBufferMemoryBarrier2(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkBufferMemoryBarrier2 value)
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

    public int srcQueueFamilyIndex() {return this.ptr.get(LAYOUT__srcQueueFamilyIndex, OFFSET__srcQueueFamilyIndex);}
    public void srcQueueFamilyIndex(int value) {this.ptr.set(LAYOUT__srcQueueFamilyIndex, OFFSET__srcQueueFamilyIndex, value);}
    public java.lang.foreign.MemorySegment $srcQueueFamilyIndex() {return this.ptr.asSlice(OFFSET__srcQueueFamilyIndex, LAYOUT__srcQueueFamilyIndex);}

    public int dstQueueFamilyIndex() {return this.ptr.get(LAYOUT__dstQueueFamilyIndex, OFFSET__dstQueueFamilyIndex);}
    public void dstQueueFamilyIndex(int value) {this.ptr.set(LAYOUT__dstQueueFamilyIndex, OFFSET__dstQueueFamilyIndex, value);}
    public java.lang.foreign.MemorySegment $dstQueueFamilyIndex() {return this.ptr.asSlice(OFFSET__dstQueueFamilyIndex, LAYOUT__dstQueueFamilyIndex);}

    public java.lang.foreign.MemorySegment buffer() {return this.ptr.get(LAYOUT__buffer, OFFSET__buffer);}
    public void buffer(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__buffer, OFFSET__buffer, value);}
    public java.lang.foreign.MemorySegment $buffer() {return this.ptr.asSlice(OFFSET__buffer, LAYOUT__buffer);}

    public long offset() {return this.ptr.get(LAYOUT__offset, OFFSET__offset);}
    public void offset(long value) {this.ptr.set(LAYOUT__offset, OFFSET__offset, value);}
    public java.lang.foreign.MemorySegment $offset() {return this.ptr.asSlice(OFFSET__offset, LAYOUT__offset);}

    public long size() {return this.ptr.get(LAYOUT__size, OFFSET__size);}
    public void size(long value) {this.ptr.set(LAYOUT__size, OFFSET__size, value);}
    public java.lang.foreign.MemorySegment $size() {return this.ptr.asSlice(OFFSET__size, LAYOUT__size);}
}
