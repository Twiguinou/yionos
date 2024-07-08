package vulkan;

public record VkPresentRegionKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__rectangleCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("rectangleCount");
    public static final long OFFSET__rectangleCount = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pRectangles = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pRectangles");
    public static final long OFFSET__pRectangles = 8;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__rectangleCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pRectangles
    ).withByteAlignment(8).withName("VkPresentRegionKHR");

    public VkPresentRegionKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPresentRegionKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPresentRegionKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPresentRegionKHR value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int rectangleCount() {return this.ptr.get(LAYOUT__rectangleCount, OFFSET__rectangleCount);}
    public void rectangleCount(int value) {this.ptr.set(LAYOUT__rectangleCount, OFFSET__rectangleCount, value);}
    public java.lang.foreign.MemorySegment $rectangleCount() {return this.ptr.asSlice(OFFSET__rectangleCount, LAYOUT__rectangleCount);}

    public java.lang.foreign.MemorySegment pRectangles() {return this.ptr.get(LAYOUT__pRectangles, OFFSET__pRectangles);}
    public void pRectangles(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pRectangles, OFFSET__pRectangles, value);}
    public java.lang.foreign.MemorySegment $pRectangles() {return this.ptr.asSlice(OFFSET__pRectangles, LAYOUT__pRectangles);}
}
