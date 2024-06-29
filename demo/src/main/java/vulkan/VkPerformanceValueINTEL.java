package vulkan;

public record VkPerformanceValueINTEL(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__type = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__type = 0;
    public static final java.lang.foreign.UnionLayout LAYOUT__data = vulkan.VkPerformanceValueDataINTEL.gRecordLayout;
    public static final long OFFSET__data = 8;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__type,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__data
    ).withByteAlignment(8).withName("VkPerformanceValueINTEL");

    public VkPerformanceValueINTEL(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPerformanceValueINTEL getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPerformanceValueINTEL(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPerformanceValueINTEL value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int type() {return this.ptr.get(LAYOUT__type, OFFSET__type);}
    public void type(int value) {this.ptr.set(LAYOUT__type, OFFSET__type, value);}
    public java.lang.foreign.MemorySegment $type() {return this.ptr.asSlice(OFFSET__type, LAYOUT__type);}

    public vulkan.VkPerformanceValueDataINTEL data() {return new vulkan.VkPerformanceValueDataINTEL(this.ptr.asSlice(OFFSET__data, LAYOUT__data));}
    public void data(java.util.function.Consumer<vulkan.VkPerformanceValueDataINTEL> consumer) {consumer.accept(this.data());}
    public void data(vulkan.VkPerformanceValueDataINTEL value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__data, LAYOUT__data.byteSize());}
}
