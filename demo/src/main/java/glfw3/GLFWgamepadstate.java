package glfw3;

public record GLFWgamepadstate(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.SequenceLayout LAYOUT__buttons = java.lang.foreign.MemoryLayout.sequenceLayout(15, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET__buttons = 0;
    public static final java.lang.foreign.SequenceLayout LAYOUT__axes = java.lang.foreign.MemoryLayout.sequenceLayout(6, java.lang.foreign.ValueLayout.JAVA_FLOAT);
    public static final long OFFSET__axes = 16;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__buttons,
            java.lang.foreign.MemoryLayout.paddingLayout(1),
            LAYOUT__axes
    ).withByteAlignment(4).withName("GLFWgamepadstate");

    public GLFWgamepadstate(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static GLFWgamepadstate getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new GLFWgamepadstate(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, GLFWgamepadstate value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public java.lang.foreign.MemorySegment buttons() {return this.ptr.asSlice(OFFSET__buttons, LAYOUT__buttons);}
    public byte buttons(int index) {return this.buttons().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index);}
    public void buttons(int index, byte value) {this.buttons().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index, value);}

    public java.lang.foreign.MemorySegment axes() {return this.ptr.asSlice(OFFSET__axes, LAYOUT__axes);}
    public float axes(int index) {return this.axes().getAtIndex(java.lang.foreign.ValueLayout.JAVA_FLOAT, index);}
    public void axes(int index, float value) {this.axes().setAtIndex(java.lang.foreign.ValueLayout.JAVA_FLOAT, index, value);}
}
