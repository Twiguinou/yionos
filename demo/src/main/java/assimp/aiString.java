package assimp;

public record aiString(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$length = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$length = 0L;
    public static final java.lang.foreign.SequenceLayout LAYOUT$data = java.lang.foreign.MemoryLayout.sequenceLayout(1024, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET$data = 4L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$length,
            LAYOUT$data
    ).withName("aiString");

    public aiString(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static aiString getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new aiString(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int length() {return this.ptr.get(LAYOUT$length, OFFSET$length);}
    public void length(int value) {this.ptr.set(LAYOUT$length, OFFSET$length, value);}
    public java.lang.foreign.MemorySegment length_ptr() {return this.ptr.asSlice(OFFSET$length, LAYOUT$length);}

    public java.lang.foreign.MemorySegment data() {return this.ptr.asSlice(OFFSET$data, LAYOUT$data);}
    public char data(int i) {return (char)this.data().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i);}
    public void data(int i, char value) {this.data().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i, (byte)value);}
}
