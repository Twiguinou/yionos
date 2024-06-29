package vulkan;

public record VkSparseImageMemoryBind(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT__subresource = vulkan.VkImageSubresource.gRecordLayout;
    public static final long OFFSET__subresource = 0;
    public static final java.lang.foreign.StructLayout LAYOUT__offset = vulkan.VkOffset3D.gRecordLayout;
    public static final long OFFSET__offset = 12;
    public static final java.lang.foreign.StructLayout LAYOUT__extent = vulkan.VkExtent3D.gRecordLayout;
    public static final long OFFSET__extent = 24;
    public static final java.lang.foreign.AddressLayout LAYOUT__memory = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__memory = 40;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__memoryOffset = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__memoryOffset = 48;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__flags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__flags = 56;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__subresource,
            LAYOUT__offset,
            LAYOUT__extent,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__memory,
            LAYOUT__memoryOffset,
            LAYOUT__flags,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkSparseImageMemoryBind");

    public VkSparseImageMemoryBind(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkSparseImageMemoryBind getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkSparseImageMemoryBind(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkSparseImageMemoryBind value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public vulkan.VkImageSubresource subresource() {return new vulkan.VkImageSubresource(this.ptr.asSlice(OFFSET__subresource, LAYOUT__subresource));}
    public void subresource(java.util.function.Consumer<vulkan.VkImageSubresource> consumer) {consumer.accept(this.subresource());}
    public void subresource(vulkan.VkImageSubresource value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__subresource, LAYOUT__subresource.byteSize());}

    public vulkan.VkOffset3D offset() {return new vulkan.VkOffset3D(this.ptr.asSlice(OFFSET__offset, LAYOUT__offset));}
    public void offset(java.util.function.Consumer<vulkan.VkOffset3D> consumer) {consumer.accept(this.offset());}
    public void offset(vulkan.VkOffset3D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__offset, LAYOUT__offset.byteSize());}

    public vulkan.VkExtent3D extent() {return new vulkan.VkExtent3D(this.ptr.asSlice(OFFSET__extent, LAYOUT__extent));}
    public void extent(java.util.function.Consumer<vulkan.VkExtent3D> consumer) {consumer.accept(this.extent());}
    public void extent(vulkan.VkExtent3D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__extent, LAYOUT__extent.byteSize());}

    public java.lang.foreign.MemorySegment memory() {return this.ptr.get(LAYOUT__memory, OFFSET__memory);}
    public void memory(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__memory, OFFSET__memory, value);}
    public java.lang.foreign.MemorySegment $memory() {return this.ptr.asSlice(OFFSET__memory, LAYOUT__memory);}

    public long memoryOffset() {return this.ptr.get(LAYOUT__memoryOffset, OFFSET__memoryOffset);}
    public void memoryOffset(long value) {this.ptr.set(LAYOUT__memoryOffset, OFFSET__memoryOffset, value);}
    public java.lang.foreign.MemorySegment $memoryOffset() {return this.ptr.asSlice(OFFSET__memoryOffset, LAYOUT__memoryOffset);}

    public int flags() {return this.ptr.get(LAYOUT__flags, OFFSET__flags);}
    public void flags(int value) {this.ptr.set(LAYOUT__flags, OFFSET__flags, value);}
    public java.lang.foreign.MemorySegment $flags() {return this.ptr.asSlice(OFFSET__flags, LAYOUT__flags);}
}
