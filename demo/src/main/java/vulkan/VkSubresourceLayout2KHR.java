package vulkan;

public record VkSubresourceLayout2KHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.GroupLayout LAYOUT$subresourceLayout = vulkan.VkSubresourceLayout.gStructLayout;
    public static final long OFFSET$subresourceLayout = 16L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$subresourceLayout
    ).withName("VkSubresourceLayout2KHR");

    public VkSubresourceLayout2KHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VkSubresourceLayout2KHR getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VkSubresourceLayout2KHR(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public vulkan.VkSubresourceLayout subresourceLayout() {return new vulkan.VkSubresourceLayout(this.ptr.asSlice(OFFSET$subresourceLayout, LAYOUT$subresourceLayout));}
    public void subresourceLayout(java.util.function.Consumer<vulkan.VkSubresourceLayout> consumer) {consumer.accept(this.subresourceLayout());}
    public void subresourceLayout(vulkan.VkSubresourceLayout value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$subresourceLayout, LAYOUT$subresourceLayout.byteSize());}
}
