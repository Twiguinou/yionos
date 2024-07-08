package vulkan;

public record VkBufferImageCopy(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__bufferOffset = java.lang.foreign.ValueLayout.JAVA_LONG.withName("bufferOffset");
    public static final long OFFSET__bufferOffset = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__bufferRowLength = java.lang.foreign.ValueLayout.JAVA_INT.withName("bufferRowLength");
    public static final long OFFSET__bufferRowLength = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__bufferImageHeight = java.lang.foreign.ValueLayout.JAVA_INT.withName("bufferImageHeight");
    public static final long OFFSET__bufferImageHeight = 12;
    public static final java.lang.foreign.StructLayout LAYOUT__imageSubresource = vulkan.VkImageSubresourceLayers.gRecordLayout.withName("imageSubresource");
    public static final long OFFSET__imageSubresource = 16;
    public static final java.lang.foreign.StructLayout LAYOUT__imageOffset = vulkan.VkOffset3D.gRecordLayout.withName("imageOffset");
    public static final long OFFSET__imageOffset = 32;
    public static final java.lang.foreign.StructLayout LAYOUT__imageExtent = vulkan.VkExtent3D.gRecordLayout.withName("imageExtent");
    public static final long OFFSET__imageExtent = 44;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__bufferOffset,
            LAYOUT__bufferRowLength,
            LAYOUT__bufferImageHeight,
            LAYOUT__imageSubresource,
            LAYOUT__imageOffset,
            LAYOUT__imageExtent
    ).withByteAlignment(8).withName("VkBufferImageCopy");

    public VkBufferImageCopy(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkBufferImageCopy getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkBufferImageCopy(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkBufferImageCopy value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public long bufferOffset() {return this.ptr.get(LAYOUT__bufferOffset, OFFSET__bufferOffset);}
    public void bufferOffset(long value) {this.ptr.set(LAYOUT__bufferOffset, OFFSET__bufferOffset, value);}
    public java.lang.foreign.MemorySegment $bufferOffset() {return this.ptr.asSlice(OFFSET__bufferOffset, LAYOUT__bufferOffset);}

    public int bufferRowLength() {return this.ptr.get(LAYOUT__bufferRowLength, OFFSET__bufferRowLength);}
    public void bufferRowLength(int value) {this.ptr.set(LAYOUT__bufferRowLength, OFFSET__bufferRowLength, value);}
    public java.lang.foreign.MemorySegment $bufferRowLength() {return this.ptr.asSlice(OFFSET__bufferRowLength, LAYOUT__bufferRowLength);}

    public int bufferImageHeight() {return this.ptr.get(LAYOUT__bufferImageHeight, OFFSET__bufferImageHeight);}
    public void bufferImageHeight(int value) {this.ptr.set(LAYOUT__bufferImageHeight, OFFSET__bufferImageHeight, value);}
    public java.lang.foreign.MemorySegment $bufferImageHeight() {return this.ptr.asSlice(OFFSET__bufferImageHeight, LAYOUT__bufferImageHeight);}

    public vulkan.VkImageSubresourceLayers imageSubresource() {return new vulkan.VkImageSubresourceLayers(this.ptr.asSlice(OFFSET__imageSubresource, LAYOUT__imageSubresource));}
    public void imageSubresource(java.util.function.Consumer<vulkan.VkImageSubresourceLayers> consumer) {consumer.accept(this.imageSubresource());}
    public void imageSubresource(vulkan.VkImageSubresourceLayers value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__imageSubresource, LAYOUT__imageSubresource.byteSize());}

    public vulkan.VkOffset3D imageOffset() {return new vulkan.VkOffset3D(this.ptr.asSlice(OFFSET__imageOffset, LAYOUT__imageOffset));}
    public void imageOffset(java.util.function.Consumer<vulkan.VkOffset3D> consumer) {consumer.accept(this.imageOffset());}
    public void imageOffset(vulkan.VkOffset3D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__imageOffset, LAYOUT__imageOffset.byteSize());}

    public vulkan.VkExtent3D imageExtent() {return new vulkan.VkExtent3D(this.ptr.asSlice(OFFSET__imageExtent, LAYOUT__imageExtent));}
    public void imageExtent(java.util.function.Consumer<vulkan.VkExtent3D> consumer) {consumer.accept(this.imageExtent());}
    public void imageExtent(vulkan.VkExtent3D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__imageExtent, LAYOUT__imageExtent.byteSize());}
}
