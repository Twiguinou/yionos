package stbimage;

public record stbi_io_callbacks(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.AddressLayout LAYOUT$read = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$read = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$skip = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$skip = 8L;
    public static final java.lang.foreign.AddressLayout LAYOUT$eof = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$eof = 16L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$read,
            LAYOUT$skip,
            LAYOUT$eof
    ).withName("stbi_io_callbacks");

    public stbi_io_callbacks(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static stbi_io_callbacks getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new stbi_io_callbacks(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public java.lang.foreign.MemorySegment read() {return this.ptr.get(LAYOUT$read, OFFSET$read);}
    public void read(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$read, OFFSET$read, value);}
    public java.lang.foreign.MemorySegment read_ptr() {return this.ptr.asSlice(OFFSET$read, LAYOUT$read);}

    public java.lang.foreign.MemorySegment skip() {return this.ptr.get(LAYOUT$skip, OFFSET$skip);}
    public void skip(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$skip, OFFSET$skip, value);}
    public java.lang.foreign.MemorySegment skip_ptr() {return this.ptr.asSlice(OFFSET$skip, LAYOUT$skip);}

    public java.lang.foreign.MemorySegment eof() {return this.ptr.get(LAYOUT$eof, OFFSET$eof);}
    public void eof(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$eof, OFFSET$eof, value);}
    public java.lang.foreign.MemorySegment eof_ptr() {return this.ptr.asSlice(OFFSET$eof, LAYOUT$eof);}
}
