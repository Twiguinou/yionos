package vulkan;

public record VkClearAttachment(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__aspectMask = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__aspectMask = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__colorAttachment = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__colorAttachment = 4;
    public static final java.lang.foreign.UnionLayout LAYOUT__clearValue = vulkan.VkClearValue.gRecordLayout;
    public static final long OFFSET__clearValue = 8;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__aspectMask,
            LAYOUT__colorAttachment,
            LAYOUT__clearValue
    ).withByteAlignment(4).withName("VkClearAttachment");

    public VkClearAttachment(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkClearAttachment getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkClearAttachment(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkClearAttachment value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int aspectMask() {return this.ptr.get(LAYOUT__aspectMask, OFFSET__aspectMask);}
    public void aspectMask(int value) {this.ptr.set(LAYOUT__aspectMask, OFFSET__aspectMask, value);}
    public java.lang.foreign.MemorySegment $aspectMask() {return this.ptr.asSlice(OFFSET__aspectMask, LAYOUT__aspectMask);}

    public int colorAttachment() {return this.ptr.get(LAYOUT__colorAttachment, OFFSET__colorAttachment);}
    public void colorAttachment(int value) {this.ptr.set(LAYOUT__colorAttachment, OFFSET__colorAttachment, value);}
    public java.lang.foreign.MemorySegment $colorAttachment() {return this.ptr.asSlice(OFFSET__colorAttachment, LAYOUT__colorAttachment);}

    public vulkan.VkClearValue clearValue() {return new vulkan.VkClearValue(this.ptr.asSlice(OFFSET__clearValue, LAYOUT__clearValue));}
    public void clearValue(java.util.function.Consumer<vulkan.VkClearValue> consumer) {consumer.accept(this.clearValue());}
    public void clearValue(vulkan.VkClearValue value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__clearValue, LAYOUT__clearValue.byteSize());}
}
