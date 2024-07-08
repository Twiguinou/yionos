package vulkan;

public record VkMemoryBarrier2(java.lang.foreign.MemorySegment ptr)
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

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__srcStageMask,
            LAYOUT__srcAccessMask,
            LAYOUT__dstStageMask,
            LAYOUT__dstAccessMask
    ).withByteAlignment(8).withName("VkMemoryBarrier2");

    public VkMemoryBarrier2(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkMemoryBarrier2 getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkMemoryBarrier2(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkMemoryBarrier2 value)
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
}
