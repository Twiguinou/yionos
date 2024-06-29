package vulkan;

public record VkAttachmentReference(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__attachment = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__attachment = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__layout = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__layout = 4;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__attachment,
            LAYOUT__layout
    ).withByteAlignment(4).withName("VkAttachmentReference");

    public VkAttachmentReference(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkAttachmentReference getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkAttachmentReference(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkAttachmentReference value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int attachment() {return this.ptr.get(LAYOUT__attachment, OFFSET__attachment);}
    public void attachment(int value) {this.ptr.set(LAYOUT__attachment, OFFSET__attachment, value);}
    public java.lang.foreign.MemorySegment $attachment() {return this.ptr.asSlice(OFFSET__attachment, LAYOUT__attachment);}

    public int layout() {return this.ptr.get(LAYOUT__layout, OFFSET__layout);}
    public void layout(int value) {this.ptr.set(LAYOUT__layout, OFFSET__layout, value);}
    public java.lang.foreign.MemorySegment $layout() {return this.ptr.asSlice(OFFSET__layout, LAYOUT__layout);}
}
