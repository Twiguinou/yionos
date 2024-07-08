package glfw3;

public record GLFWgammaramp(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.AddressLayout LAYOUT__red = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("red");
    public static final long OFFSET__red = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__green = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("green");
    public static final long OFFSET__green = 8;
    public static final java.lang.foreign.AddressLayout LAYOUT__blue = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("blue");
    public static final long OFFSET__blue = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__size = java.lang.foreign.ValueLayout.JAVA_INT.withName("size");
    public static final long OFFSET__size = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__red,
            LAYOUT__green,
            LAYOUT__blue,
            LAYOUT__size,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("GLFWgammaramp");

    public GLFWgammaramp(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static GLFWgammaramp getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new GLFWgammaramp(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, GLFWgammaramp value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public java.lang.foreign.MemorySegment red() {return this.ptr.get(LAYOUT__red, OFFSET__red);}
    public void red(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__red, OFFSET__red, value);}
    public java.lang.foreign.MemorySegment $red() {return this.ptr.asSlice(OFFSET__red, LAYOUT__red);}

    public java.lang.foreign.MemorySegment green() {return this.ptr.get(LAYOUT__green, OFFSET__green);}
    public void green(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__green, OFFSET__green, value);}
    public java.lang.foreign.MemorySegment $green() {return this.ptr.asSlice(OFFSET__green, LAYOUT__green);}

    public java.lang.foreign.MemorySegment blue() {return this.ptr.get(LAYOUT__blue, OFFSET__blue);}
    public void blue(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__blue, OFFSET__blue, value);}
    public java.lang.foreign.MemorySegment $blue() {return this.ptr.asSlice(OFFSET__blue, LAYOUT__blue);}

    public int size() {return this.ptr.get(LAYOUT__size, OFFSET__size);}
    public void size(int value) {this.ptr.set(LAYOUT__size, OFFSET__size, value);}
    public java.lang.foreign.MemorySegment $size() {return this.ptr.asSlice(OFFSET__size, LAYOUT__size);}
}
