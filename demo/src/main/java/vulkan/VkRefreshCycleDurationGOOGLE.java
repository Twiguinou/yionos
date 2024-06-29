package vulkan;

public record VkRefreshCycleDurationGOOGLE(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__refreshDuration = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__refreshDuration = 0;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__refreshDuration
    ).withByteAlignment(8).withName("VkRefreshCycleDurationGOOGLE");

    public VkRefreshCycleDurationGOOGLE(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkRefreshCycleDurationGOOGLE getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkRefreshCycleDurationGOOGLE(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkRefreshCycleDurationGOOGLE value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public long refreshDuration() {return this.ptr.get(LAYOUT__refreshDuration, OFFSET__refreshDuration);}
    public void refreshDuration(long value) {this.ptr.set(LAYOUT__refreshDuration, OFFSET__refreshDuration, value);}
    public java.lang.foreign.MemorySegment $refreshDuration() {return this.ptr.asSlice(OFFSET__refreshDuration, LAYOUT__refreshDuration);}
}
