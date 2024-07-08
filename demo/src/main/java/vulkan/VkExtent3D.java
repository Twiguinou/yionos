package vulkan;

public record VkExtent3D(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__width = java.lang.foreign.ValueLayout.JAVA_INT.withName("width");
    public static final long OFFSET__width = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__height = java.lang.foreign.ValueLayout.JAVA_INT.withName("height");
    public static final long OFFSET__height = 4;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__depth = java.lang.foreign.ValueLayout.JAVA_INT.withName("depth");
    public static final long OFFSET__depth = 8;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__width,
            LAYOUT__height,
            LAYOUT__depth
    ).withByteAlignment(4).withName("VkExtent3D");

    public VkExtent3D(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkExtent3D getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkExtent3D(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkExtent3D value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int width() {return this.ptr.get(LAYOUT__width, OFFSET__width);}
    public void width(int value) {this.ptr.set(LAYOUT__width, OFFSET__width, value);}
    public java.lang.foreign.MemorySegment $width() {return this.ptr.asSlice(OFFSET__width, LAYOUT__width);}

    public int height() {return this.ptr.get(LAYOUT__height, OFFSET__height);}
    public void height(int value) {this.ptr.set(LAYOUT__height, OFFSET__height, value);}
    public java.lang.foreign.MemorySegment $height() {return this.ptr.asSlice(OFFSET__height, LAYOUT__height);}

    public int depth() {return this.ptr.get(LAYOUT__depth, OFFSET__depth);}
    public void depth(int value) {this.ptr.set(LAYOUT__depth, OFFSET__depth, value);}
    public java.lang.foreign.MemorySegment $depth() {return this.ptr.asSlice(OFFSET__depth, LAYOUT__depth);}
}
