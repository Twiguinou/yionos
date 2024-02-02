package vulkan;

public record VkRect2D(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.GroupLayout LAYOUT$offset = vulkan.VkOffset2D.gStructLayout;
    public static final long OFFSET$offset = 0L;
    public static final java.lang.foreign.GroupLayout LAYOUT$extent = vulkan.VkExtent2D.gStructLayout;
    public static final long OFFSET$extent = 8L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$offset,
            LAYOUT$extent
    ).withName("VkRect2D");

    public VkRect2D(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VkRect2D getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VkRect2D(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public vulkan.VkOffset2D offset() {return new vulkan.VkOffset2D(this.ptr.asSlice(OFFSET$offset, LAYOUT$offset));}
    public void offset(java.util.function.Consumer<vulkan.VkOffset2D> consumer) {consumer.accept(this.offset());}
    public void offset(vulkan.VkOffset2D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$offset, LAYOUT$offset.byteSize());}

    public vulkan.VkExtent2D extent() {return new vulkan.VkExtent2D(this.ptr.asSlice(OFFSET$extent, LAYOUT$extent));}
    public void extent(java.util.function.Consumer<vulkan.VkExtent2D> consumer) {consumer.accept(this.extent());}
    public void extent(vulkan.VkExtent2D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$extent, LAYOUT$extent.byteSize());}
}
