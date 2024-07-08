package vulkan;

public record VkSparseBufferMemoryBindInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.AddressLayout LAYOUT__buffer = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("buffer");
    public static final long OFFSET__buffer = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__bindCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("bindCount");
    public static final long OFFSET__bindCount = 8;
    public static final java.lang.foreign.AddressLayout LAYOUT__pBinds = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pBinds");
    public static final long OFFSET__pBinds = 16;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__buffer,
            LAYOUT__bindCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pBinds
    ).withByteAlignment(8).withName("VkSparseBufferMemoryBindInfo");

    public VkSparseBufferMemoryBindInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkSparseBufferMemoryBindInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkSparseBufferMemoryBindInfo(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkSparseBufferMemoryBindInfo value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public java.lang.foreign.MemorySegment buffer() {return this.ptr.get(LAYOUT__buffer, OFFSET__buffer);}
    public void buffer(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__buffer, OFFSET__buffer, value);}
    public java.lang.foreign.MemorySegment $buffer() {return this.ptr.asSlice(OFFSET__buffer, LAYOUT__buffer);}

    public int bindCount() {return this.ptr.get(LAYOUT__bindCount, OFFSET__bindCount);}
    public void bindCount(int value) {this.ptr.set(LAYOUT__bindCount, OFFSET__bindCount, value);}
    public java.lang.foreign.MemorySegment $bindCount() {return this.ptr.asSlice(OFFSET__bindCount, LAYOUT__bindCount);}

    public java.lang.foreign.MemorySegment pBinds() {return this.ptr.get(LAYOUT__pBinds, OFFSET__pBinds);}
    public void pBinds(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pBinds, OFFSET__pBinds, value);}
    public java.lang.foreign.MemorySegment $pBinds() {return this.ptr.asSlice(OFFSET__pBinds, LAYOUT__pBinds);}
}
