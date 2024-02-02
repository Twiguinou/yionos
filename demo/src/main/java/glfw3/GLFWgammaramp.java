package glfw3;

public record GLFWgammaramp(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.AddressLayout LAYOUT$red = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$red = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$green = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$green = 8L;
    public static final java.lang.foreign.AddressLayout LAYOUT$blue = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$blue = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$size = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$size = 24L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$red,
            LAYOUT$green,
            LAYOUT$blue,
            LAYOUT$size,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("GLFWgammaramp");

    public GLFWgammaramp(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static GLFWgammaramp getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new GLFWgammaramp(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public java.lang.foreign.MemorySegment red() {return this.ptr.get(LAYOUT$red, OFFSET$red);}
    public void red(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$red, OFFSET$red, value);}
    public java.lang.foreign.MemorySegment red_ptr() {return this.ptr.asSlice(OFFSET$red, LAYOUT$red);}

    public java.lang.foreign.MemorySegment green() {return this.ptr.get(LAYOUT$green, OFFSET$green);}
    public void green(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$green, OFFSET$green, value);}
    public java.lang.foreign.MemorySegment green_ptr() {return this.ptr.asSlice(OFFSET$green, LAYOUT$green);}

    public java.lang.foreign.MemorySegment blue() {return this.ptr.get(LAYOUT$blue, OFFSET$blue);}
    public void blue(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$blue, OFFSET$blue, value);}
    public java.lang.foreign.MemorySegment blue_ptr() {return this.ptr.asSlice(OFFSET$blue, LAYOUT$blue);}

    public int size() {return this.ptr.get(LAYOUT$size, OFFSET$size);}
    public void size(int value) {this.ptr.set(LAYOUT$size, OFFSET$size, value);}
    public java.lang.foreign.MemorySegment size_ptr() {return this.ptr.asSlice(OFFSET$size, LAYOUT$size);}
}
