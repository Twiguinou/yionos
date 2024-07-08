package vulkan;

public record VkMemoryType(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__propertyFlags = java.lang.foreign.ValueLayout.JAVA_INT.withName("propertyFlags");
    public static final long OFFSET__propertyFlags = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__heapIndex = java.lang.foreign.ValueLayout.JAVA_INT.withName("heapIndex");
    public static final long OFFSET__heapIndex = 4;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__propertyFlags,
            LAYOUT__heapIndex
    ).withByteAlignment(4).withName("VkMemoryType");

    public VkMemoryType(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkMemoryType getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkMemoryType(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkMemoryType value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int propertyFlags() {return this.ptr.get(LAYOUT__propertyFlags, OFFSET__propertyFlags);}
    public void propertyFlags(int value) {this.ptr.set(LAYOUT__propertyFlags, OFFSET__propertyFlags, value);}
    public java.lang.foreign.MemorySegment $propertyFlags() {return this.ptr.asSlice(OFFSET__propertyFlags, LAYOUT__propertyFlags);}

    public int heapIndex() {return this.ptr.get(LAYOUT__heapIndex, OFFSET__heapIndex);}
    public void heapIndex(int value) {this.ptr.set(LAYOUT__heapIndex, OFFSET__heapIndex, value);}
    public java.lang.foreign.MemorySegment $heapIndex() {return this.ptr.asSlice(OFFSET__heapIndex, LAYOUT__heapIndex);}
}
