package vulkan;

public record VkFormatProperties3(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__linearTilingFeatures = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__linearTilingFeatures = 16;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__optimalTilingFeatures = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__optimalTilingFeatures = 24;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__bufferFeatures = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__bufferFeatures = 32;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__linearTilingFeatures,
            LAYOUT__optimalTilingFeatures,
            LAYOUT__bufferFeatures
    ).withByteAlignment(8).withName("VkFormatProperties3");

    public VkFormatProperties3(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkFormatProperties3 getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkFormatProperties3(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkFormatProperties3 value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public long linearTilingFeatures() {return this.ptr.get(LAYOUT__linearTilingFeatures, OFFSET__linearTilingFeatures);}
    public void linearTilingFeatures(long value) {this.ptr.set(LAYOUT__linearTilingFeatures, OFFSET__linearTilingFeatures, value);}
    public java.lang.foreign.MemorySegment $linearTilingFeatures() {return this.ptr.asSlice(OFFSET__linearTilingFeatures, LAYOUT__linearTilingFeatures);}

    public long optimalTilingFeatures() {return this.ptr.get(LAYOUT__optimalTilingFeatures, OFFSET__optimalTilingFeatures);}
    public void optimalTilingFeatures(long value) {this.ptr.set(LAYOUT__optimalTilingFeatures, OFFSET__optimalTilingFeatures, value);}
    public java.lang.foreign.MemorySegment $optimalTilingFeatures() {return this.ptr.asSlice(OFFSET__optimalTilingFeatures, LAYOUT__optimalTilingFeatures);}

    public long bufferFeatures() {return this.ptr.get(LAYOUT__bufferFeatures, OFFSET__bufferFeatures);}
    public void bufferFeatures(long value) {this.ptr.set(LAYOUT__bufferFeatures, OFFSET__bufferFeatures, value);}
    public java.lang.foreign.MemorySegment $bufferFeatures() {return this.ptr.asSlice(OFFSET__bufferFeatures, LAYOUT__bufferFeatures);}
}
