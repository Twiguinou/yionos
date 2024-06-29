package vulkan;

public record VkOffset2D(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__x = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__x = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__y = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__y = 4;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__x,
            LAYOUT__y
    ).withByteAlignment(4).withName("VkOffset2D");

    public VkOffset2D(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkOffset2D getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkOffset2D(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkOffset2D value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int x() {return this.ptr.get(LAYOUT__x, OFFSET__x);}
    public void x(int value) {this.ptr.set(LAYOUT__x, OFFSET__x, value);}
    public java.lang.foreign.MemorySegment $x() {return this.ptr.asSlice(OFFSET__x, LAYOUT__x);}

    public int y() {return this.ptr.get(LAYOUT__y, OFFSET__y);}
    public void y(int value) {this.ptr.set(LAYOUT__y, OFFSET__y, value);}
    public java.lang.foreign.MemorySegment $y() {return this.ptr.asSlice(OFFSET__y, LAYOUT__y);}
}
