package vulkan;

public record VkBufferCopy2(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__srcOffset = java.lang.foreign.ValueLayout.JAVA_LONG.withName("srcOffset");
    public static final long OFFSET__srcOffset = 16;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__dstOffset = java.lang.foreign.ValueLayout.JAVA_LONG.withName("dstOffset");
    public static final long OFFSET__dstOffset = 24;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__size = java.lang.foreign.ValueLayout.JAVA_LONG.withName("size");
    public static final long OFFSET__size = 32;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__srcOffset,
            LAYOUT__dstOffset,
            LAYOUT__size
    ).withByteAlignment(8).withName("VkBufferCopy2");

    public VkBufferCopy2(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkBufferCopy2 getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkBufferCopy2(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkBufferCopy2 value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public long srcOffset() {return this.ptr.get(LAYOUT__srcOffset, OFFSET__srcOffset);}
    public void srcOffset(long value) {this.ptr.set(LAYOUT__srcOffset, OFFSET__srcOffset, value);}
    public java.lang.foreign.MemorySegment $srcOffset() {return this.ptr.asSlice(OFFSET__srcOffset, LAYOUT__srcOffset);}

    public long dstOffset() {return this.ptr.get(LAYOUT__dstOffset, OFFSET__dstOffset);}
    public void dstOffset(long value) {this.ptr.set(LAYOUT__dstOffset, OFFSET__dstOffset, value);}
    public java.lang.foreign.MemorySegment $dstOffset() {return this.ptr.asSlice(OFFSET__dstOffset, LAYOUT__dstOffset);}

    public long size() {return this.ptr.get(LAYOUT__size, OFFSET__size);}
    public void size(long value) {this.ptr.set(LAYOUT__size, OFFSET__size, value);}
    public java.lang.foreign.MemorySegment $size() {return this.ptr.asSlice(OFFSET__size, LAYOUT__size);}
}
