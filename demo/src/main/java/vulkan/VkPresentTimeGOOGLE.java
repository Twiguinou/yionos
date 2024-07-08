package vulkan;

public record VkPresentTimeGOOGLE(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__presentID = java.lang.foreign.ValueLayout.JAVA_INT.withName("presentID");
    public static final long OFFSET__presentID = 0;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__desiredPresentTime = java.lang.foreign.ValueLayout.JAVA_LONG.withName("desiredPresentTime");
    public static final long OFFSET__desiredPresentTime = 8;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__presentID,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__desiredPresentTime
    ).withByteAlignment(8).withName("VkPresentTimeGOOGLE");

    public VkPresentTimeGOOGLE(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPresentTimeGOOGLE getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPresentTimeGOOGLE(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPresentTimeGOOGLE value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int presentID() {return this.ptr.get(LAYOUT__presentID, OFFSET__presentID);}
    public void presentID(int value) {this.ptr.set(LAYOUT__presentID, OFFSET__presentID, value);}
    public java.lang.foreign.MemorySegment $presentID() {return this.ptr.asSlice(OFFSET__presentID, LAYOUT__presentID);}

    public long desiredPresentTime() {return this.ptr.get(LAYOUT__desiredPresentTime, OFFSET__desiredPresentTime);}
    public void desiredPresentTime(long value) {this.ptr.set(LAYOUT__desiredPresentTime, OFFSET__desiredPresentTime, value);}
    public java.lang.foreign.MemorySegment $desiredPresentTime() {return this.ptr.asSlice(OFFSET__desiredPresentTime, LAYOUT__desiredPresentTime);}
}
