package vulkan;

public record VkDescriptorBufferInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.AddressLayout LAYOUT__buffer = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__buffer = 0;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__offset = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__offset = 8;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__range = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__range = 16;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__buffer,
            LAYOUT__offset,
            LAYOUT__range
    ).withByteAlignment(8).withName("VkDescriptorBufferInfo");

    public VkDescriptorBufferInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkDescriptorBufferInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkDescriptorBufferInfo(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkDescriptorBufferInfo value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public java.lang.foreign.MemorySegment buffer() {return this.ptr.get(LAYOUT__buffer, OFFSET__buffer);}
    public void buffer(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__buffer, OFFSET__buffer, value);}
    public java.lang.foreign.MemorySegment $buffer() {return this.ptr.asSlice(OFFSET__buffer, LAYOUT__buffer);}

    public long offset() {return this.ptr.get(LAYOUT__offset, OFFSET__offset);}
    public void offset(long value) {this.ptr.set(LAYOUT__offset, OFFSET__offset, value);}
    public java.lang.foreign.MemorySegment $offset() {return this.ptr.asSlice(OFFSET__offset, LAYOUT__offset);}

    public long range() {return this.ptr.get(LAYOUT__range, OFFSET__range);}
    public void range(long value) {this.ptr.set(LAYOUT__range, OFFSET__range, value);}
    public java.lang.foreign.MemorySegment $range() {return this.ptr.asSlice(OFFSET__range, LAYOUT__range);}
}
