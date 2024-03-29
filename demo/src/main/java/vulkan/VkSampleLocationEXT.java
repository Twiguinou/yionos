package vulkan;

public record VkSampleLocationEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$x = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$x = 0L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$y = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$y = 4L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$x,
            LAYOUT$y
    ).withName("VkSampleLocationEXT");

    public VkSampleLocationEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VkSampleLocationEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VkSampleLocationEXT(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public float x() {return this.ptr.get(LAYOUT$x, OFFSET$x);}
    public void x(float value) {this.ptr.set(LAYOUT$x, OFFSET$x, value);}
    public java.lang.foreign.MemorySegment x_ptr() {return this.ptr.asSlice(OFFSET$x, LAYOUT$x);}

    public float y() {return this.ptr.get(LAYOUT$y, OFFSET$y);}
    public void y(float value) {this.ptr.set(LAYOUT$y, OFFSET$y, value);}
    public java.lang.foreign.MemorySegment y_ptr() {return this.ptr.asSlice(OFFSET$y, LAYOUT$y);}
}
