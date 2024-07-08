package vulkan;

public record VkSurfaceFormatKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__format = java.lang.foreign.ValueLayout.JAVA_INT.withName("format");
    public static final long OFFSET__format = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__colorSpace = java.lang.foreign.ValueLayout.JAVA_INT.withName("colorSpace");
    public static final long OFFSET__colorSpace = 4;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__format,
            LAYOUT__colorSpace
    ).withByteAlignment(4).withName("VkSurfaceFormatKHR");

    public VkSurfaceFormatKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkSurfaceFormatKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkSurfaceFormatKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkSurfaceFormatKHR value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int format() {return this.ptr.get(LAYOUT__format, OFFSET__format);}
    public void format(int value) {this.ptr.set(LAYOUT__format, OFFSET__format, value);}
    public java.lang.foreign.MemorySegment $format() {return this.ptr.asSlice(OFFSET__format, LAYOUT__format);}

    public int colorSpace() {return this.ptr.get(LAYOUT__colorSpace, OFFSET__colorSpace);}
    public void colorSpace(int value) {this.ptr.set(LAYOUT__colorSpace, OFFSET__colorSpace, value);}
    public java.lang.foreign.MemorySegment $colorSpace() {return this.ptr.asSlice(OFFSET__colorSpace, LAYOUT__colorSpace);}
}
