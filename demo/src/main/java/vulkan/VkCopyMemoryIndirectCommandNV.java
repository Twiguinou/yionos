package vulkan;

public record VkCopyMemoryIndirectCommandNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__srcAddress = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__srcAddress = 0;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__dstAddress = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__dstAddress = 8;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__size = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__size = 16;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__srcAddress,
            LAYOUT__dstAddress,
            LAYOUT__size
    ).withByteAlignment(8).withName("VkCopyMemoryIndirectCommandNV");

    public VkCopyMemoryIndirectCommandNV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkCopyMemoryIndirectCommandNV getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkCopyMemoryIndirectCommandNV(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkCopyMemoryIndirectCommandNV value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public long srcAddress() {return this.ptr.get(LAYOUT__srcAddress, OFFSET__srcAddress);}
    public void srcAddress(long value) {this.ptr.set(LAYOUT__srcAddress, OFFSET__srcAddress, value);}
    public java.lang.foreign.MemorySegment $srcAddress() {return this.ptr.asSlice(OFFSET__srcAddress, LAYOUT__srcAddress);}

    public long dstAddress() {return this.ptr.get(LAYOUT__dstAddress, OFFSET__dstAddress);}
    public void dstAddress(long value) {this.ptr.set(LAYOUT__dstAddress, OFFSET__dstAddress, value);}
    public java.lang.foreign.MemorySegment $dstAddress() {return this.ptr.asSlice(OFFSET__dstAddress, LAYOUT__dstAddress);}

    public long size() {return this.ptr.get(LAYOUT__size, OFFSET__size);}
    public void size(long value) {this.ptr.set(LAYOUT__size, OFFSET__size, value);}
    public java.lang.foreign.MemorySegment $size() {return this.ptr.asSlice(OFFSET__size, LAYOUT__size);}
}
