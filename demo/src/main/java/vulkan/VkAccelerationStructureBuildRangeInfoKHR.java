package vulkan;

public record VkAccelerationStructureBuildRangeInfoKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__primitiveCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__primitiveCount = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__primitiveOffset = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__primitiveOffset = 4;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__firstVertex = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__firstVertex = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__transformOffset = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__transformOffset = 12;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__primitiveCount,
            LAYOUT__primitiveOffset,
            LAYOUT__firstVertex,
            LAYOUT__transformOffset
    ).withByteAlignment(4).withName("VkAccelerationStructureBuildRangeInfoKHR");

    public VkAccelerationStructureBuildRangeInfoKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkAccelerationStructureBuildRangeInfoKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkAccelerationStructureBuildRangeInfoKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkAccelerationStructureBuildRangeInfoKHR value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int primitiveCount() {return this.ptr.get(LAYOUT__primitiveCount, OFFSET__primitiveCount);}
    public void primitiveCount(int value) {this.ptr.set(LAYOUT__primitiveCount, OFFSET__primitiveCount, value);}
    public java.lang.foreign.MemorySegment $primitiveCount() {return this.ptr.asSlice(OFFSET__primitiveCount, LAYOUT__primitiveCount);}

    public int primitiveOffset() {return this.ptr.get(LAYOUT__primitiveOffset, OFFSET__primitiveOffset);}
    public void primitiveOffset(int value) {this.ptr.set(LAYOUT__primitiveOffset, OFFSET__primitiveOffset, value);}
    public java.lang.foreign.MemorySegment $primitiveOffset() {return this.ptr.asSlice(OFFSET__primitiveOffset, LAYOUT__primitiveOffset);}

    public int firstVertex() {return this.ptr.get(LAYOUT__firstVertex, OFFSET__firstVertex);}
    public void firstVertex(int value) {this.ptr.set(LAYOUT__firstVertex, OFFSET__firstVertex, value);}
    public java.lang.foreign.MemorySegment $firstVertex() {return this.ptr.asSlice(OFFSET__firstVertex, LAYOUT__firstVertex);}

    public int transformOffset() {return this.ptr.get(LAYOUT__transformOffset, OFFSET__transformOffset);}
    public void transformOffset(int value) {this.ptr.set(LAYOUT__transformOffset, OFFSET__transformOffset, value);}
    public java.lang.foreign.MemorySegment $transformOffset() {return this.ptr.asSlice(OFFSET__transformOffset, LAYOUT__transformOffset);}
}
