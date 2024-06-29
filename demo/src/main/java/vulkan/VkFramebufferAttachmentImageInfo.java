package vulkan;

public record VkFramebufferAttachmentImageInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__flags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__flags = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__usage = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__usage = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__width = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__width = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__height = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__height = 28;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__layerCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__layerCount = 32;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__viewFormatCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__viewFormatCount = 36;
    public static final java.lang.foreign.AddressLayout LAYOUT__pViewFormats = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pViewFormats = 40;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__flags,
            LAYOUT__usage,
            LAYOUT__width,
            LAYOUT__height,
            LAYOUT__layerCount,
            LAYOUT__viewFormatCount,
            LAYOUT__pViewFormats
    ).withByteAlignment(8).withName("VkFramebufferAttachmentImageInfo");

    public VkFramebufferAttachmentImageInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkFramebufferAttachmentImageInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkFramebufferAttachmentImageInfo(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkFramebufferAttachmentImageInfo value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int flags() {return this.ptr.get(LAYOUT__flags, OFFSET__flags);}
    public void flags(int value) {this.ptr.set(LAYOUT__flags, OFFSET__flags, value);}
    public java.lang.foreign.MemorySegment $flags() {return this.ptr.asSlice(OFFSET__flags, LAYOUT__flags);}

    public int usage() {return this.ptr.get(LAYOUT__usage, OFFSET__usage);}
    public void usage(int value) {this.ptr.set(LAYOUT__usage, OFFSET__usage, value);}
    public java.lang.foreign.MemorySegment $usage() {return this.ptr.asSlice(OFFSET__usage, LAYOUT__usage);}

    public int width() {return this.ptr.get(LAYOUT__width, OFFSET__width);}
    public void width(int value) {this.ptr.set(LAYOUT__width, OFFSET__width, value);}
    public java.lang.foreign.MemorySegment $width() {return this.ptr.asSlice(OFFSET__width, LAYOUT__width);}

    public int height() {return this.ptr.get(LAYOUT__height, OFFSET__height);}
    public void height(int value) {this.ptr.set(LAYOUT__height, OFFSET__height, value);}
    public java.lang.foreign.MemorySegment $height() {return this.ptr.asSlice(OFFSET__height, LAYOUT__height);}

    public int layerCount() {return this.ptr.get(LAYOUT__layerCount, OFFSET__layerCount);}
    public void layerCount(int value) {this.ptr.set(LAYOUT__layerCount, OFFSET__layerCount, value);}
    public java.lang.foreign.MemorySegment $layerCount() {return this.ptr.asSlice(OFFSET__layerCount, LAYOUT__layerCount);}

    public int viewFormatCount() {return this.ptr.get(LAYOUT__viewFormatCount, OFFSET__viewFormatCount);}
    public void viewFormatCount(int value) {this.ptr.set(LAYOUT__viewFormatCount, OFFSET__viewFormatCount, value);}
    public java.lang.foreign.MemorySegment $viewFormatCount() {return this.ptr.asSlice(OFFSET__viewFormatCount, LAYOUT__viewFormatCount);}

    public java.lang.foreign.MemorySegment pViewFormats() {return this.ptr.get(LAYOUT__pViewFormats, OFFSET__pViewFormats);}
    public void pViewFormats(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pViewFormats, OFFSET__pViewFormats, value);}
    public java.lang.foreign.MemorySegment $pViewFormats() {return this.ptr.asSlice(OFFSET__pViewFormats, LAYOUT__pViewFormats);}
}
