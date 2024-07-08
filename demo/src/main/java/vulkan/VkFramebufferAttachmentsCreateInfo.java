package vulkan;

public record VkFramebufferAttachmentsCreateInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__attachmentImageInfoCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("attachmentImageInfoCount");
    public static final long OFFSET__attachmentImageInfoCount = 16;
    public static final java.lang.foreign.AddressLayout LAYOUT__pAttachmentImageInfos = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pAttachmentImageInfos");
    public static final long OFFSET__pAttachmentImageInfos = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__attachmentImageInfoCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pAttachmentImageInfos
    ).withByteAlignment(8).withName("VkFramebufferAttachmentsCreateInfo");

    public VkFramebufferAttachmentsCreateInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkFramebufferAttachmentsCreateInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkFramebufferAttachmentsCreateInfo(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkFramebufferAttachmentsCreateInfo value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int attachmentImageInfoCount() {return this.ptr.get(LAYOUT__attachmentImageInfoCount, OFFSET__attachmentImageInfoCount);}
    public void attachmentImageInfoCount(int value) {this.ptr.set(LAYOUT__attachmentImageInfoCount, OFFSET__attachmentImageInfoCount, value);}
    public java.lang.foreign.MemorySegment $attachmentImageInfoCount() {return this.ptr.asSlice(OFFSET__attachmentImageInfoCount, LAYOUT__attachmentImageInfoCount);}

    public java.lang.foreign.MemorySegment pAttachmentImageInfos() {return this.ptr.get(LAYOUT__pAttachmentImageInfos, OFFSET__pAttachmentImageInfos);}
    public void pAttachmentImageInfos(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pAttachmentImageInfos, OFFSET__pAttachmentImageInfos, value);}
    public java.lang.foreign.MemorySegment $pAttachmentImageInfos() {return this.ptr.asSlice(OFFSET__pAttachmentImageInfos, LAYOUT__pAttachmentImageInfos);}
}
