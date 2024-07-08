package vulkan;

public record VkImageSubresource2KHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.StructLayout LAYOUT__imageSubresource = vulkan.VkImageSubresource.gRecordLayout.withName("imageSubresource");
    public static final long OFFSET__imageSubresource = 16;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__imageSubresource,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkImageSubresource2KHR");

    public VkImageSubresource2KHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkImageSubresource2KHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkImageSubresource2KHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkImageSubresource2KHR value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public vulkan.VkImageSubresource imageSubresource() {return new vulkan.VkImageSubresource(this.ptr.asSlice(OFFSET__imageSubresource, LAYOUT__imageSubresource));}
    public void imageSubresource(java.util.function.Consumer<vulkan.VkImageSubresource> consumer) {consumer.accept(this.imageSubresource());}
    public void imageSubresource(vulkan.VkImageSubresource value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__imageSubresource, LAYOUT__imageSubresource.byteSize());}
}
