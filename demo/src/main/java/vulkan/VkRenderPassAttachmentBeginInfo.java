package vulkan;

public record VkRenderPassAttachmentBeginInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__attachmentCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__attachmentCount = 16;
    public static final java.lang.foreign.AddressLayout LAYOUT__pAttachments = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pAttachments = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__attachmentCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pAttachments
    ).withByteAlignment(8).withName("VkRenderPassAttachmentBeginInfo");

    public VkRenderPassAttachmentBeginInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkRenderPassAttachmentBeginInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkRenderPassAttachmentBeginInfo(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkRenderPassAttachmentBeginInfo value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int attachmentCount() {return this.ptr.get(LAYOUT__attachmentCount, OFFSET__attachmentCount);}
    public void attachmentCount(int value) {this.ptr.set(LAYOUT__attachmentCount, OFFSET__attachmentCount, value);}
    public java.lang.foreign.MemorySegment $attachmentCount() {return this.ptr.asSlice(OFFSET__attachmentCount, LAYOUT__attachmentCount);}

    public java.lang.foreign.MemorySegment pAttachments() {return this.ptr.get(LAYOUT__pAttachments, OFFSET__pAttachments);}
    public void pAttachments(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pAttachments, OFFSET__pAttachments, value);}
    public java.lang.foreign.MemorySegment $pAttachments() {return this.ptr.asSlice(OFFSET__pAttachments, LAYOUT__pAttachments);}
}
