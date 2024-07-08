package vulkan;

public record VkImageFormatListCreateInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__viewFormatCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("viewFormatCount");
    public static final long OFFSET__viewFormatCount = 16;
    public static final java.lang.foreign.AddressLayout LAYOUT__pViewFormats = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pViewFormats");
    public static final long OFFSET__pViewFormats = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__viewFormatCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pViewFormats
    ).withByteAlignment(8).withName("VkImageFormatListCreateInfo");

    public VkImageFormatListCreateInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkImageFormatListCreateInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkImageFormatListCreateInfo(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkImageFormatListCreateInfo value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int viewFormatCount() {return this.ptr.get(LAYOUT__viewFormatCount, OFFSET__viewFormatCount);}
    public void viewFormatCount(int value) {this.ptr.set(LAYOUT__viewFormatCount, OFFSET__viewFormatCount, value);}
    public java.lang.foreign.MemorySegment $viewFormatCount() {return this.ptr.asSlice(OFFSET__viewFormatCount, LAYOUT__viewFormatCount);}

    public java.lang.foreign.MemorySegment pViewFormats() {return this.ptr.get(LAYOUT__pViewFormats, OFFSET__pViewFormats);}
    public void pViewFormats(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pViewFormats, OFFSET__pViewFormats, value);}
    public java.lang.foreign.MemorySegment $pViewFormats() {return this.ptr.asSlice(OFFSET__pViewFormats, LAYOUT__pViewFormats);}
}
