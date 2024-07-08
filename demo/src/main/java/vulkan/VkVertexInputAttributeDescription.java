package vulkan;

public record VkVertexInputAttributeDescription(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__location = java.lang.foreign.ValueLayout.JAVA_INT.withName("location");
    public static final long OFFSET__location = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__binding = java.lang.foreign.ValueLayout.JAVA_INT.withName("binding");
    public static final long OFFSET__binding = 4;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__format = java.lang.foreign.ValueLayout.JAVA_INT.withName("format");
    public static final long OFFSET__format = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__offset = java.lang.foreign.ValueLayout.JAVA_INT.withName("offset");
    public static final long OFFSET__offset = 12;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__location,
            LAYOUT__binding,
            LAYOUT__format,
            LAYOUT__offset
    ).withByteAlignment(4).withName("VkVertexInputAttributeDescription");

    public VkVertexInputAttributeDescription(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkVertexInputAttributeDescription getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkVertexInputAttributeDescription(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkVertexInputAttributeDescription value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int location() {return this.ptr.get(LAYOUT__location, OFFSET__location);}
    public void location(int value) {this.ptr.set(LAYOUT__location, OFFSET__location, value);}
    public java.lang.foreign.MemorySegment $location() {return this.ptr.asSlice(OFFSET__location, LAYOUT__location);}

    public int binding() {return this.ptr.get(LAYOUT__binding, OFFSET__binding);}
    public void binding(int value) {this.ptr.set(LAYOUT__binding, OFFSET__binding, value);}
    public java.lang.foreign.MemorySegment $binding() {return this.ptr.asSlice(OFFSET__binding, LAYOUT__binding);}

    public int format() {return this.ptr.get(LAYOUT__format, OFFSET__format);}
    public void format(int value) {this.ptr.set(LAYOUT__format, OFFSET__format, value);}
    public java.lang.foreign.MemorySegment $format() {return this.ptr.asSlice(OFFSET__format, LAYOUT__format);}

    public int offset() {return this.ptr.get(LAYOUT__offset, OFFSET__offset);}
    public void offset(int value) {this.ptr.set(LAYOUT__offset, OFFSET__offset, value);}
    public java.lang.foreign.MemorySegment $offset() {return this.ptr.asSlice(OFFSET__offset, LAYOUT__offset);}
}
