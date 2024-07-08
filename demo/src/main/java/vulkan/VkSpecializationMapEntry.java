package vulkan;

public record VkSpecializationMapEntry(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__constantID = java.lang.foreign.ValueLayout.JAVA_INT.withName("constantID");
    public static final long OFFSET__constantID = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__offset = java.lang.foreign.ValueLayout.JAVA_INT.withName("offset");
    public static final long OFFSET__offset = 4;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__size = java.lang.foreign.ValueLayout.JAVA_LONG.withName("size");
    public static final long OFFSET__size = 8;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__constantID,
            LAYOUT__offset,
            LAYOUT__size
    ).withByteAlignment(8).withName("VkSpecializationMapEntry");

    public VkSpecializationMapEntry(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkSpecializationMapEntry getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkSpecializationMapEntry(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkSpecializationMapEntry value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int constantID() {return this.ptr.get(LAYOUT__constantID, OFFSET__constantID);}
    public void constantID(int value) {this.ptr.set(LAYOUT__constantID, OFFSET__constantID, value);}
    public java.lang.foreign.MemorySegment $constantID() {return this.ptr.asSlice(OFFSET__constantID, LAYOUT__constantID);}

    public int offset() {return this.ptr.get(LAYOUT__offset, OFFSET__offset);}
    public void offset(int value) {this.ptr.set(LAYOUT__offset, OFFSET__offset, value);}
    public java.lang.foreign.MemorySegment $offset() {return this.ptr.asSlice(OFFSET__offset, LAYOUT__offset);}

    public long size() {return this.ptr.get(LAYOUT__size, OFFSET__size);}
    public void size(long value) {this.ptr.set(LAYOUT__size, OFFSET__size, value);}
    public java.lang.foreign.MemorySegment $size() {return this.ptr.asSlice(OFFSET__size, LAYOUT__size);}
}
