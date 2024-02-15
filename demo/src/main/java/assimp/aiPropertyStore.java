package assimp;

public record aiPropertyStore(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$sentinel = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET$sentinel = 0L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sentinel
    ).withName("aiPropertyStore");

    public aiPropertyStore(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static aiPropertyStore getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new aiPropertyStore(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public char sentinel() {return (char)this.ptr.get(LAYOUT$sentinel, OFFSET$sentinel);}
    public void sentinel(char value) {this.ptr.set(LAYOUT$sentinel, OFFSET$sentinel, (byte)value);}
    public java.lang.foreign.MemorySegment sentinel_ptr() {return this.ptr.asSlice(OFFSET$sentinel, LAYOUT$sentinel);}
}
