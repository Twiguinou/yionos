package vulkan;

public record VkPastPresentationTimingGOOGLE(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__presentID = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__presentID = 0;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__desiredPresentTime = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__desiredPresentTime = 8;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__actualPresentTime = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__actualPresentTime = 16;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__earliestPresentTime = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__earliestPresentTime = 24;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__presentMargin = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__presentMargin = 32;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__presentID,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__desiredPresentTime,
            LAYOUT__actualPresentTime,
            LAYOUT__earliestPresentTime,
            LAYOUT__presentMargin
    ).withByteAlignment(8).withName("VkPastPresentationTimingGOOGLE");

    public VkPastPresentationTimingGOOGLE(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPastPresentationTimingGOOGLE getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPastPresentationTimingGOOGLE(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPastPresentationTimingGOOGLE value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int presentID() {return this.ptr.get(LAYOUT__presentID, OFFSET__presentID);}
    public void presentID(int value) {this.ptr.set(LAYOUT__presentID, OFFSET__presentID, value);}
    public java.lang.foreign.MemorySegment $presentID() {return this.ptr.asSlice(OFFSET__presentID, LAYOUT__presentID);}

    public long desiredPresentTime() {return this.ptr.get(LAYOUT__desiredPresentTime, OFFSET__desiredPresentTime);}
    public void desiredPresentTime(long value) {this.ptr.set(LAYOUT__desiredPresentTime, OFFSET__desiredPresentTime, value);}
    public java.lang.foreign.MemorySegment $desiredPresentTime() {return this.ptr.asSlice(OFFSET__desiredPresentTime, LAYOUT__desiredPresentTime);}

    public long actualPresentTime() {return this.ptr.get(LAYOUT__actualPresentTime, OFFSET__actualPresentTime);}
    public void actualPresentTime(long value) {this.ptr.set(LAYOUT__actualPresentTime, OFFSET__actualPresentTime, value);}
    public java.lang.foreign.MemorySegment $actualPresentTime() {return this.ptr.asSlice(OFFSET__actualPresentTime, LAYOUT__actualPresentTime);}

    public long earliestPresentTime() {return this.ptr.get(LAYOUT__earliestPresentTime, OFFSET__earliestPresentTime);}
    public void earliestPresentTime(long value) {this.ptr.set(LAYOUT__earliestPresentTime, OFFSET__earliestPresentTime, value);}
    public java.lang.foreign.MemorySegment $earliestPresentTime() {return this.ptr.asSlice(OFFSET__earliestPresentTime, LAYOUT__earliestPresentTime);}

    public long presentMargin() {return this.ptr.get(LAYOUT__presentMargin, OFFSET__presentMargin);}
    public void presentMargin(long value) {this.ptr.set(LAYOUT__presentMargin, OFFSET__presentMargin, value);}
    public java.lang.foreign.MemorySegment $presentMargin() {return this.ptr.asSlice(OFFSET__presentMargin, LAYOUT__presentMargin);}
}
