package glfw3;

public record GLFWgamepadstate(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.SequenceLayout LAYOUT$buttons = java.lang.foreign.MemoryLayout.sequenceLayout(15, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET$buttons = 0L;
    public static final java.lang.foreign.SequenceLayout LAYOUT$axes = java.lang.foreign.MemoryLayout.sequenceLayout(6, java.lang.foreign.ValueLayout.JAVA_FLOAT);
    public static final long OFFSET$axes = 16L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$buttons,
            java.lang.foreign.MemoryLayout.paddingLayout(1),
            LAYOUT$axes
    ).withName("GLFWgamepadstate");

    public GLFWgamepadstate(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static GLFWgamepadstate getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new GLFWgamepadstate(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public java.lang.foreign.MemorySegment buttons() {return this.ptr.asSlice(OFFSET$buttons, LAYOUT$buttons);}
    public char buttons(int i) {return (char)this.buttons().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i);}
    public void buttons(int i, char value) {this.buttons().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i, (byte)value);}

    public java.lang.foreign.MemorySegment axes() {return this.ptr.asSlice(OFFSET$axes, LAYOUT$axes);}
    public float axes(int i) {return this.axes().getAtIndex(java.lang.foreign.ValueLayout.JAVA_FLOAT, i);}
    public void axes(int i, float value) {this.axes().setAtIndex(java.lang.foreign.ValueLayout.JAVA_FLOAT, i, value);}
}
