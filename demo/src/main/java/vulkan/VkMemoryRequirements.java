package vulkan;

public record VkMemoryRequirements(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__size = java.lang.foreign.ValueLayout.JAVA_LONG.withName("size");
    public static final long OFFSET__size = 0;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__alignment = java.lang.foreign.ValueLayout.JAVA_LONG.withName("alignment");
    public static final long OFFSET__alignment = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__memoryTypeBits = java.lang.foreign.ValueLayout.JAVA_INT.withName("memoryTypeBits");
    public static final long OFFSET__memoryTypeBits = 16;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__size,
            LAYOUT__alignment,
            LAYOUT__memoryTypeBits,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkMemoryRequirements");

    public VkMemoryRequirements(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkMemoryRequirements getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkMemoryRequirements(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkMemoryRequirements value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public long size() {return this.ptr.get(LAYOUT__size, OFFSET__size);}
    public void size(long value) {this.ptr.set(LAYOUT__size, OFFSET__size, value);}
    public java.lang.foreign.MemorySegment $size() {return this.ptr.asSlice(OFFSET__size, LAYOUT__size);}

    public long alignment() {return this.ptr.get(LAYOUT__alignment, OFFSET__alignment);}
    public void alignment(long value) {this.ptr.set(LAYOUT__alignment, OFFSET__alignment, value);}
    public java.lang.foreign.MemorySegment $alignment() {return this.ptr.asSlice(OFFSET__alignment, LAYOUT__alignment);}

    public int memoryTypeBits() {return this.ptr.get(LAYOUT__memoryTypeBits, OFFSET__memoryTypeBits);}
    public void memoryTypeBits(int value) {this.ptr.set(LAYOUT__memoryTypeBits, OFFSET__memoryTypeBits, value);}
    public java.lang.foreign.MemorySegment $memoryTypeBits() {return this.ptr.asSlice(OFFSET__memoryTypeBits, LAYOUT__memoryTypeBits);}
}
