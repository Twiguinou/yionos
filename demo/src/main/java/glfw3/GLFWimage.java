package glfw3;

public record GLFWimage(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$width = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$width = 0L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$height = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$height = 4L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pixels = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pixels = 8L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$width,
            LAYOUT$height,
            LAYOUT$pixels
    ).withName("GLFWimage");

    public GLFWimage(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static GLFWimage getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new GLFWimage(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int width() {return this.ptr.get(LAYOUT$width, OFFSET$width);}
    public void width(int value) {this.ptr.set(LAYOUT$width, OFFSET$width, value);}
    public java.lang.foreign.MemorySegment width_ptr() {return this.ptr.asSlice(OFFSET$width, LAYOUT$width);}

    public int height() {return this.ptr.get(LAYOUT$height, OFFSET$height);}
    public void height(int value) {this.ptr.set(LAYOUT$height, OFFSET$height, value);}
    public java.lang.foreign.MemorySegment height_ptr() {return this.ptr.asSlice(OFFSET$height, LAYOUT$height);}

    public java.lang.foreign.MemorySegment pixels() {return this.ptr.get(LAYOUT$pixels, OFFSET$pixels);}
    public void pixels(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pixels, OFFSET$pixels, value);}
    public java.lang.foreign.MemorySegment pixels_ptr() {return this.ptr.asSlice(OFFSET$pixels, LAYOUT$pixels);}
}
