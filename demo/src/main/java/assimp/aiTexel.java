package assimp;

public record aiTexel(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$b = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET$b = 0L;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$g = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET$g = 1L;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$r = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET$r = 2L;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$a = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET$a = 3L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$b,
            LAYOUT$g,
            LAYOUT$r,
            LAYOUT$a
    ).withName("aiTexel");

    public aiTexel(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static aiTexel getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new aiTexel(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public char b() {return (char)this.ptr.get(LAYOUT$b, OFFSET$b);}
    public void b(char value) {this.ptr.set(LAYOUT$b, OFFSET$b, (byte)value);}
    public java.lang.foreign.MemorySegment b_ptr() {return this.ptr.asSlice(OFFSET$b, LAYOUT$b);}

    public char g() {return (char)this.ptr.get(LAYOUT$g, OFFSET$g);}
    public void g(char value) {this.ptr.set(LAYOUT$g, OFFSET$g, (byte)value);}
    public java.lang.foreign.MemorySegment g_ptr() {return this.ptr.asSlice(OFFSET$g, LAYOUT$g);}

    public char r() {return (char)this.ptr.get(LAYOUT$r, OFFSET$r);}
    public void r(char value) {this.ptr.set(LAYOUT$r, OFFSET$r, (byte)value);}
    public java.lang.foreign.MemorySegment r_ptr() {return this.ptr.asSlice(OFFSET$r, LAYOUT$r);}

    public char a() {return (char)this.ptr.get(LAYOUT$a, OFFSET$a);}
    public void a(char value) {this.ptr.set(LAYOUT$a, OFFSET$a, (byte)value);}
    public java.lang.foreign.MemorySegment a_ptr() {return this.ptr.asSlice(OFFSET$a, LAYOUT$a);}
}
