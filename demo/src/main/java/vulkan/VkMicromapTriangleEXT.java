package vulkan;

public record VkMicromapTriangleEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__dataOffset = java.lang.foreign.ValueLayout.JAVA_INT.withName("dataOffset");
    public static final long OFFSET__dataOffset = 0;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT__subdivisionLevel = java.lang.foreign.ValueLayout.JAVA_SHORT.withName("subdivisionLevel");
    public static final long OFFSET__subdivisionLevel = 4;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT__format = java.lang.foreign.ValueLayout.JAVA_SHORT.withName("format");
    public static final long OFFSET__format = 6;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__dataOffset,
            LAYOUT__subdivisionLevel,
            LAYOUT__format
    ).withByteAlignment(4).withName("VkMicromapTriangleEXT");

    public VkMicromapTriangleEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkMicromapTriangleEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkMicromapTriangleEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkMicromapTriangleEXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int dataOffset() {return this.ptr.get(LAYOUT__dataOffset, OFFSET__dataOffset);}
    public void dataOffset(int value) {this.ptr.set(LAYOUT__dataOffset, OFFSET__dataOffset, value);}
    public java.lang.foreign.MemorySegment $dataOffset() {return this.ptr.asSlice(OFFSET__dataOffset, LAYOUT__dataOffset);}

    public short subdivisionLevel() {return this.ptr.get(LAYOUT__subdivisionLevel, OFFSET__subdivisionLevel);}
    public void subdivisionLevel(short value) {this.ptr.set(LAYOUT__subdivisionLevel, OFFSET__subdivisionLevel, value);}
    public java.lang.foreign.MemorySegment $subdivisionLevel() {return this.ptr.asSlice(OFFSET__subdivisionLevel, LAYOUT__subdivisionLevel);}

    public short format() {return this.ptr.get(LAYOUT__format, OFFSET__format);}
    public void format(short value) {this.ptr.set(LAYOUT__format, OFFSET__format, value);}
    public java.lang.foreign.MemorySegment $format() {return this.ptr.asSlice(OFFSET__format, LAYOUT__format);}
}
