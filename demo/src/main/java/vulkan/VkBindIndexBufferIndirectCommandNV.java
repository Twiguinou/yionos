package vulkan;

public record VkBindIndexBufferIndirectCommandNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__bufferAddress = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__bufferAddress = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__size = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__size = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__indexType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__indexType = 12;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__bufferAddress,
            LAYOUT__size,
            LAYOUT__indexType
    ).withByteAlignment(8).withName("VkBindIndexBufferIndirectCommandNV");

    public VkBindIndexBufferIndirectCommandNV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkBindIndexBufferIndirectCommandNV getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkBindIndexBufferIndirectCommandNV(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkBindIndexBufferIndirectCommandNV value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public long bufferAddress() {return this.ptr.get(LAYOUT__bufferAddress, OFFSET__bufferAddress);}
    public void bufferAddress(long value) {this.ptr.set(LAYOUT__bufferAddress, OFFSET__bufferAddress, value);}
    public java.lang.foreign.MemorySegment $bufferAddress() {return this.ptr.asSlice(OFFSET__bufferAddress, LAYOUT__bufferAddress);}

    public int size() {return this.ptr.get(LAYOUT__size, OFFSET__size);}
    public void size(int value) {this.ptr.set(LAYOUT__size, OFFSET__size, value);}
    public java.lang.foreign.MemorySegment $size() {return this.ptr.asSlice(OFFSET__size, LAYOUT__size);}

    public int indexType() {return this.ptr.get(LAYOUT__indexType, OFFSET__indexType);}
    public void indexType(int value) {this.ptr.set(LAYOUT__indexType, OFFSET__indexType, value);}
    public java.lang.foreign.MemorySegment $indexType() {return this.ptr.asSlice(OFFSET__indexType, LAYOUT__indexType);}
}
