package vulkan;

public record VkMicromapUsageEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__count = java.lang.foreign.ValueLayout.JAVA_INT.withName("count");
    public static final long OFFSET__count = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__subdivisionLevel = java.lang.foreign.ValueLayout.JAVA_INT.withName("subdivisionLevel");
    public static final long OFFSET__subdivisionLevel = 4;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__format = java.lang.foreign.ValueLayout.JAVA_INT.withName("format");
    public static final long OFFSET__format = 8;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__count,
            LAYOUT__subdivisionLevel,
            LAYOUT__format
    ).withByteAlignment(4).withName("VkMicromapUsageEXT");

    public VkMicromapUsageEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkMicromapUsageEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkMicromapUsageEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkMicromapUsageEXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int count() {return this.ptr.get(LAYOUT__count, OFFSET__count);}
    public void count(int value) {this.ptr.set(LAYOUT__count, OFFSET__count, value);}
    public java.lang.foreign.MemorySegment $count() {return this.ptr.asSlice(OFFSET__count, LAYOUT__count);}

    public int subdivisionLevel() {return this.ptr.get(LAYOUT__subdivisionLevel, OFFSET__subdivisionLevel);}
    public void subdivisionLevel(int value) {this.ptr.set(LAYOUT__subdivisionLevel, OFFSET__subdivisionLevel, value);}
    public java.lang.foreign.MemorySegment $subdivisionLevel() {return this.ptr.asSlice(OFFSET__subdivisionLevel, LAYOUT__subdivisionLevel);}

    public int format() {return this.ptr.get(LAYOUT__format, OFFSET__format);}
    public void format(int value) {this.ptr.set(LAYOUT__format, OFFSET__format, value);}
    public java.lang.foreign.MemorySegment $format() {return this.ptr.asSlice(OFFSET__format, LAYOUT__format);}
}
