package vulkan;

public record VkViewport(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__x = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("x");
    public static final long OFFSET__x = 0;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__y = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("y");
    public static final long OFFSET__y = 4;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__width = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("width");
    public static final long OFFSET__width = 8;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__height = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("height");
    public static final long OFFSET__height = 12;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__minDepth = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("minDepth");
    public static final long OFFSET__minDepth = 16;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__maxDepth = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("maxDepth");
    public static final long OFFSET__maxDepth = 20;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__x,
            LAYOUT__y,
            LAYOUT__width,
            LAYOUT__height,
            LAYOUT__minDepth,
            LAYOUT__maxDepth
    ).withByteAlignment(4).withName("VkViewport");

    public VkViewport(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkViewport getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkViewport(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkViewport value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public float x() {return this.ptr.get(LAYOUT__x, OFFSET__x);}
    public void x(float value) {this.ptr.set(LAYOUT__x, OFFSET__x, value);}
    public java.lang.foreign.MemorySegment $x() {return this.ptr.asSlice(OFFSET__x, LAYOUT__x);}

    public float y() {return this.ptr.get(LAYOUT__y, OFFSET__y);}
    public void y(float value) {this.ptr.set(LAYOUT__y, OFFSET__y, value);}
    public java.lang.foreign.MemorySegment $y() {return this.ptr.asSlice(OFFSET__y, LAYOUT__y);}

    public float width() {return this.ptr.get(LAYOUT__width, OFFSET__width);}
    public void width(float value) {this.ptr.set(LAYOUT__width, OFFSET__width, value);}
    public java.lang.foreign.MemorySegment $width() {return this.ptr.asSlice(OFFSET__width, LAYOUT__width);}

    public float height() {return this.ptr.get(LAYOUT__height, OFFSET__height);}
    public void height(float value) {this.ptr.set(LAYOUT__height, OFFSET__height, value);}
    public java.lang.foreign.MemorySegment $height() {return this.ptr.asSlice(OFFSET__height, LAYOUT__height);}

    public float minDepth() {return this.ptr.get(LAYOUT__minDepth, OFFSET__minDepth);}
    public void minDepth(float value) {this.ptr.set(LAYOUT__minDepth, OFFSET__minDepth, value);}
    public java.lang.foreign.MemorySegment $minDepth() {return this.ptr.asSlice(OFFSET__minDepth, LAYOUT__minDepth);}

    public float maxDepth() {return this.ptr.get(LAYOUT__maxDepth, OFFSET__maxDepth);}
    public void maxDepth(float value) {this.ptr.set(LAYOUT__maxDepth, OFFSET__maxDepth, value);}
    public java.lang.foreign.MemorySegment $maxDepth() {return this.ptr.asSlice(OFFSET__maxDepth, LAYOUT__maxDepth);}
}
