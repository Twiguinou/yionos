package vulkan;

public record VkBufferImageCopy2(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__bufferOffset = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__bufferOffset = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__bufferRowLength = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__bufferRowLength = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__bufferImageHeight = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__bufferImageHeight = 28;
    public static final java.lang.foreign.StructLayout LAYOUT__imageSubresource = vulkan.VkImageSubresourceLayers.gRecordLayout;
    public static final long OFFSET__imageSubresource = 32;
    public static final java.lang.foreign.StructLayout LAYOUT__imageOffset = vulkan.VkOffset3D.gRecordLayout;
    public static final long OFFSET__imageOffset = 48;
    public static final java.lang.foreign.StructLayout LAYOUT__imageExtent = vulkan.VkExtent3D.gRecordLayout;
    public static final long OFFSET__imageExtent = 60;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__bufferOffset,
            LAYOUT__bufferRowLength,
            LAYOUT__bufferImageHeight,
            LAYOUT__imageSubresource,
            LAYOUT__imageOffset,
            LAYOUT__imageExtent
    ).withByteAlignment(8).withName("VkBufferImageCopy2");

    public VkBufferImageCopy2(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkBufferImageCopy2 getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkBufferImageCopy2(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkBufferImageCopy2 value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

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
