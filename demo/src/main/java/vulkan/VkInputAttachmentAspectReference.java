package vulkan;

public record VkInputAttachmentAspectReference(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__subpass = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__subpass = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__inputAttachmentIndex = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__inputAttachmentIndex = 4;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__aspectMask = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__aspectMask = 8;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__subpass,
            LAYOUT__inputAttachmentIndex,
            LAYOUT__aspectMask
    ).withByteAlignment(4).withName("VkInputAttachmentAspectReference");

    public VkInputAttachmentAspectReference(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkInputAttachmentAspectReference getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkInputAttachmentAspectReference(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkInputAttachmentAspectReference value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int subpass() {return this.ptr.get(LAYOUT__subpass, OFFSET__subpass);}
    public void subpass(int value) {this.ptr.set(LAYOUT__subpass, OFFSET__subpass, value);}
    public java.lang.foreign.MemorySegment $subpass() {return this.ptr.asSlice(OFFSET__subpass, LAYOUT__subpass);}

    public int inputAttachmentIndex() {return this.ptr.get(LAYOUT__inputAttachmentIndex, OFFSET__inputAttachmentIndex);}
    public void inputAttachmentIndex(int value) {this.ptr.set(LAYOUT__inputAttachmentIndex, OFFSET__inputAttachmentIndex, value);}
    public java.lang.foreign.MemorySegment $inputAttachmentIndex() {return this.ptr.asSlice(OFFSET__inputAttachmentIndex, LAYOUT__inputAttachmentIndex);}

    public int aspectMask() {return this.ptr.get(LAYOUT__aspectMask, OFFSET__aspectMask);}
    public void aspectMask(int value) {this.ptr.set(LAYOUT__aspectMask, OFFSET__aspectMask, value);}
    public java.lang.foreign.MemorySegment $aspectMask() {return this.ptr.asSlice(OFFSET__aspectMask, LAYOUT__aspectMask);}
}
