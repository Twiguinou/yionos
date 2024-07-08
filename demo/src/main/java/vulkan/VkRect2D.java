package vulkan;

public record VkRect2D(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT__offset = vulkan.VkOffset2D.gRecordLayout.withName("offset");
    public static final long OFFSET__offset = 0;
    public static final java.lang.foreign.StructLayout LAYOUT__extent = vulkan.VkExtent2D.gRecordLayout.withName("extent");
    public static final long OFFSET__extent = 8;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__offset,
            LAYOUT__extent
    ).withByteAlignment(4).withName("VkRect2D");

    public VkRect2D(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkRect2D getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkRect2D(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkRect2D value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public vulkan.VkOffset2D offset() {return new vulkan.VkOffset2D(this.ptr.asSlice(OFFSET__offset, LAYOUT__offset));}
    public void offset(java.util.function.Consumer<vulkan.VkOffset2D> consumer) {consumer.accept(this.offset());}
    public void offset(vulkan.VkOffset2D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__offset, LAYOUT__offset.byteSize());}

    public vulkan.VkExtent2D extent() {return new vulkan.VkExtent2D(this.ptr.asSlice(OFFSET__extent, LAYOUT__extent));}
    public void extent(java.util.function.Consumer<vulkan.VkExtent2D> consumer) {consumer.accept(this.extent());}
    public void extent(vulkan.VkExtent2D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__extent, LAYOUT__extent.byteSize());}
}
