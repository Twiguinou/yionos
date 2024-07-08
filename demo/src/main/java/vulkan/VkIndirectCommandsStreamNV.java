package vulkan;

public record VkIndirectCommandsStreamNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.AddressLayout LAYOUT__buffer = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("buffer");
    public static final long OFFSET__buffer = 0;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__offset = java.lang.foreign.ValueLayout.JAVA_LONG.withName("offset");
    public static final long OFFSET__offset = 8;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__buffer,
            LAYOUT__offset
    ).withByteAlignment(8).withName("VkIndirectCommandsStreamNV");

    public VkIndirectCommandsStreamNV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkIndirectCommandsStreamNV getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkIndirectCommandsStreamNV(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkIndirectCommandsStreamNV value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public java.lang.foreign.MemorySegment buffer() {return this.ptr.get(LAYOUT__buffer, OFFSET__buffer);}
    public void buffer(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__buffer, OFFSET__buffer, value);}
    public java.lang.foreign.MemorySegment $buffer() {return this.ptr.asSlice(OFFSET__buffer, LAYOUT__buffer);}

    public long offset() {return this.ptr.get(LAYOUT__offset, OFFSET__offset);}
    public void offset(long value) {this.ptr.set(LAYOUT__offset, OFFSET__offset, value);}
    public java.lang.foreign.MemorySegment $offset() {return this.ptr.asSlice(OFFSET__offset, LAYOUT__offset);}
}
