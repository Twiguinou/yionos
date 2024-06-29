package vulkan;

public record VkViewportSwizzleNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__x = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__x = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__y = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__y = 4;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__z = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__z = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__w = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__w = 12;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__x,
            LAYOUT__y,
            LAYOUT__z,
            LAYOUT__w
    ).withByteAlignment(4).withName("VkViewportSwizzleNV");

    public VkViewportSwizzleNV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkViewportSwizzleNV getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkViewportSwizzleNV(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkViewportSwizzleNV value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int x() {return this.ptr.get(LAYOUT__x, OFFSET__x);}
    public void x(int value) {this.ptr.set(LAYOUT__x, OFFSET__x, value);}
    public java.lang.foreign.MemorySegment $x() {return this.ptr.asSlice(OFFSET__x, LAYOUT__x);}

    public int y() {return this.ptr.get(LAYOUT__y, OFFSET__y);}
    public void y(int value) {this.ptr.set(LAYOUT__y, OFFSET__y, value);}
    public java.lang.foreign.MemorySegment $y() {return this.ptr.asSlice(OFFSET__y, LAYOUT__y);}

    public int z() {return this.ptr.get(LAYOUT__z, OFFSET__z);}
    public void z(int value) {this.ptr.set(LAYOUT__z, OFFSET__z, value);}
    public java.lang.foreign.MemorySegment $z() {return this.ptr.asSlice(OFFSET__z, LAYOUT__z);}

    public int w() {return this.ptr.get(LAYOUT__w, OFFSET__w);}
    public void w(int value) {this.ptr.set(LAYOUT__w, OFFSET__w, value);}
    public java.lang.foreign.MemorySegment $w() {return this.ptr.asSlice(OFFSET__w, LAYOUT__w);}
}
