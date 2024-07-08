package vulkan;

public record VkSubresourceLayout(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__offset = java.lang.foreign.ValueLayout.JAVA_LONG.withName("offset");
    public static final long OFFSET__offset = 0;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__size = java.lang.foreign.ValueLayout.JAVA_LONG.withName("size");
    public static final long OFFSET__size = 8;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__rowPitch = java.lang.foreign.ValueLayout.JAVA_LONG.withName("rowPitch");
    public static final long OFFSET__rowPitch = 16;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__arrayPitch = java.lang.foreign.ValueLayout.JAVA_LONG.withName("arrayPitch");
    public static final long OFFSET__arrayPitch = 24;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__depthPitch = java.lang.foreign.ValueLayout.JAVA_LONG.withName("depthPitch");
    public static final long OFFSET__depthPitch = 32;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__offset,
            LAYOUT__size,
            LAYOUT__rowPitch,
            LAYOUT__arrayPitch,
            LAYOUT__depthPitch
    ).withByteAlignment(8).withName("VkSubresourceLayout");

    public VkSubresourceLayout(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkSubresourceLayout getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkSubresourceLayout(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkSubresourceLayout value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public long offset() {return this.ptr.get(LAYOUT__offset, OFFSET__offset);}
    public void offset(long value) {this.ptr.set(LAYOUT__offset, OFFSET__offset, value);}
    public java.lang.foreign.MemorySegment $offset() {return this.ptr.asSlice(OFFSET__offset, LAYOUT__offset);}

    public long size() {return this.ptr.get(LAYOUT__size, OFFSET__size);}
    public void size(long value) {this.ptr.set(LAYOUT__size, OFFSET__size, value);}
    public java.lang.foreign.MemorySegment $size() {return this.ptr.asSlice(OFFSET__size, LAYOUT__size);}

    public long rowPitch() {return this.ptr.get(LAYOUT__rowPitch, OFFSET__rowPitch);}
    public void rowPitch(long value) {this.ptr.set(LAYOUT__rowPitch, OFFSET__rowPitch, value);}
    public java.lang.foreign.MemorySegment $rowPitch() {return this.ptr.asSlice(OFFSET__rowPitch, LAYOUT__rowPitch);}

    public long arrayPitch() {return this.ptr.get(LAYOUT__arrayPitch, OFFSET__arrayPitch);}
    public void arrayPitch(long value) {this.ptr.set(LAYOUT__arrayPitch, OFFSET__arrayPitch, value);}
    public java.lang.foreign.MemorySegment $arrayPitch() {return this.ptr.asSlice(OFFSET__arrayPitch, LAYOUT__arrayPitch);}

    public long depthPitch() {return this.ptr.get(LAYOUT__depthPitch, OFFSET__depthPitch);}
    public void depthPitch(long value) {this.ptr.set(LAYOUT__depthPitch, OFFSET__depthPitch, value);}
    public java.lang.foreign.MemorySegment $depthPitch() {return this.ptr.asSlice(OFFSET__depthPitch, LAYOUT__depthPitch);}
}
