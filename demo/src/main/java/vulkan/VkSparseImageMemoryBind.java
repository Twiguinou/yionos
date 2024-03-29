package vulkan;

public record VkSparseImageMemoryBind(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.GroupLayout LAYOUT$subresource = vulkan.VkImageSubresource.gStructLayout;
    public static final long OFFSET$subresource = 0L;
    public static final java.lang.foreign.GroupLayout LAYOUT$offset = vulkan.VkOffset3D.gStructLayout;
    public static final long OFFSET$offset = 12L;
    public static final java.lang.foreign.GroupLayout LAYOUT$extent = vulkan.VkExtent3D.gStructLayout;
    public static final long OFFSET$extent = 24L;
    public static final java.lang.foreign.AddressLayout LAYOUT$memory = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$memory = 40L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$memoryOffset = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$memoryOffset = 48L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$flags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$flags = 56L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$subresource,
            LAYOUT$offset,
            LAYOUT$extent,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$memory,
            LAYOUT$memoryOffset,
            LAYOUT$flags,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("VkSparseImageMemoryBind");

    public VkSparseImageMemoryBind(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VkSparseImageMemoryBind getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VkSparseImageMemoryBind(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public vulkan.VkImageSubresource subresource() {return new vulkan.VkImageSubresource(this.ptr.asSlice(OFFSET$subresource, LAYOUT$subresource));}
    public void subresource(java.util.function.Consumer<vulkan.VkImageSubresource> consumer) {consumer.accept(this.subresource());}
    public void subresource(vulkan.VkImageSubresource value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$subresource, LAYOUT$subresource.byteSize());}

    public vulkan.VkOffset3D offset() {return new vulkan.VkOffset3D(this.ptr.asSlice(OFFSET$offset, LAYOUT$offset));}
    public void offset(java.util.function.Consumer<vulkan.VkOffset3D> consumer) {consumer.accept(this.offset());}
    public void offset(vulkan.VkOffset3D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$offset, LAYOUT$offset.byteSize());}

    public vulkan.VkExtent3D extent() {return new vulkan.VkExtent3D(this.ptr.asSlice(OFFSET$extent, LAYOUT$extent));}
    public void extent(java.util.function.Consumer<vulkan.VkExtent3D> consumer) {consumer.accept(this.extent());}
    public void extent(vulkan.VkExtent3D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$extent, LAYOUT$extent.byteSize());}

    public java.lang.foreign.MemorySegment memory() {return this.ptr.get(LAYOUT$memory, OFFSET$memory);}
    public void memory(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$memory, OFFSET$memory, value);}
    public java.lang.foreign.MemorySegment memory_ptr() {return this.ptr.asSlice(OFFSET$memory, LAYOUT$memory);}

    public long memoryOffset() {return this.ptr.get(LAYOUT$memoryOffset, OFFSET$memoryOffset);}
    public void memoryOffset(long value) {this.ptr.set(LAYOUT$memoryOffset, OFFSET$memoryOffset, value);}
    public java.lang.foreign.MemorySegment memoryOffset_ptr() {return this.ptr.asSlice(OFFSET$memoryOffset, LAYOUT$memoryOffset);}

    public int flags() {return this.ptr.get(LAYOUT$flags, OFFSET$flags);}
    public void flags(int value) {this.ptr.set(LAYOUT$flags, OFFSET$flags, value);}
    public java.lang.foreign.MemorySegment flags_ptr() {return this.ptr.asSlice(OFFSET$flags, LAYOUT$flags);}
}
