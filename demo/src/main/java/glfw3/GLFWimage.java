package glfw3;

public record GLFWimage(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__width = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__width = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__height = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__height = 4;
    public static final java.lang.foreign.AddressLayout LAYOUT__pixels = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pixels = 8;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__width,
            LAYOUT__height,
            LAYOUT__pixels
    ).withByteAlignment(8).withName("GLFWimage");

    public GLFWimage(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static GLFWimage getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new GLFWimage(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, GLFWimage value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int width() {return this.ptr.get(LAYOUT__width, OFFSET__width);}
    public void width(int value) {this.ptr.set(LAYOUT__width, OFFSET__width, value);}
    public java.lang.foreign.MemorySegment $width() {return this.ptr.asSlice(OFFSET__width, LAYOUT__width);}

    public int height() {return this.ptr.get(LAYOUT__height, OFFSET__height);}
    public void height(int value) {this.ptr.set(LAYOUT__height, OFFSET__height, value);}
    public java.lang.foreign.MemorySegment $height() {return this.ptr.asSlice(OFFSET__height, LAYOUT__height);}

    public java.lang.foreign.MemorySegment pixels() {return this.ptr.get(LAYOUT__pixels, OFFSET__pixels);}
    public void pixels(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pixels, OFFSET__pixels, value);}
    public java.lang.foreign.MemorySegment $pixels() {return this.ptr.asSlice(OFFSET__pixels, LAYOUT__pixels);}
}
