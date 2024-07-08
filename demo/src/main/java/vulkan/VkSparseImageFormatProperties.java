package vulkan;

public record VkSparseImageFormatProperties(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__aspectMask = java.lang.foreign.ValueLayout.JAVA_INT.withName("aspectMask");
    public static final long OFFSET__aspectMask = 0;
    public static final java.lang.foreign.StructLayout LAYOUT__imageGranularity = vulkan.VkExtent3D.gRecordLayout.withName("imageGranularity");
    public static final long OFFSET__imageGranularity = 4;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__flags = java.lang.foreign.ValueLayout.JAVA_INT.withName("flags");
    public static final long OFFSET__flags = 16;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__aspectMask,
            LAYOUT__imageGranularity,
            LAYOUT__flags
    ).withByteAlignment(4).withName("VkSparseImageFormatProperties");

    public VkSparseImageFormatProperties(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkSparseImageFormatProperties getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkSparseImageFormatProperties(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkSparseImageFormatProperties value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int aspectMask() {return this.ptr.get(LAYOUT__aspectMask, OFFSET__aspectMask);}
    public void aspectMask(int value) {this.ptr.set(LAYOUT__aspectMask, OFFSET__aspectMask, value);}
    public java.lang.foreign.MemorySegment $aspectMask() {return this.ptr.asSlice(OFFSET__aspectMask, LAYOUT__aspectMask);}

    public vulkan.VkExtent3D imageGranularity() {return new vulkan.VkExtent3D(this.ptr.asSlice(OFFSET__imageGranularity, LAYOUT__imageGranularity));}
    public void imageGranularity(java.util.function.Consumer<vulkan.VkExtent3D> consumer) {consumer.accept(this.imageGranularity());}
    public void imageGranularity(vulkan.VkExtent3D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__imageGranularity, LAYOUT__imageGranularity.byteSize());}

    public int flags() {return this.ptr.get(LAYOUT__flags, OFFSET__flags);}
    public void flags(int value) {this.ptr.set(LAYOUT__flags, OFFSET__flags, value);}
    public java.lang.foreign.MemorySegment $flags() {return this.ptr.asSlice(OFFSET__flags, LAYOUT__flags);}
}
