package nuklear;

public record nk_color(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$r = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET$r = 0L;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$g = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET$g = 1L;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$b = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET$b = 2L;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$a = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET$a = 3L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$r,
            LAYOUT$g,
            LAYOUT$b,
            LAYOUT$a
    ).withName("nk_color");

    public nk_color(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static nk_color getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new nk_color(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public char r() {return (char)this._ptr.get(LAYOUT$r, OFFSET$r);}
    public void r(char value) {this._ptr.set(LAYOUT$r, OFFSET$r, (byte)value);}
    public java.lang.foreign.MemorySegment r_ptr() {return this._ptr.asSlice(OFFSET$r, LAYOUT$r);}

    public char g() {return (char)this._ptr.get(LAYOUT$g, OFFSET$g);}
    public void g(char value) {this._ptr.set(LAYOUT$g, OFFSET$g, (byte)value);}
    public java.lang.foreign.MemorySegment g_ptr() {return this._ptr.asSlice(OFFSET$g, LAYOUT$g);}

    public char b() {return (char)this._ptr.get(LAYOUT$b, OFFSET$b);}
    public void b(char value) {this._ptr.set(LAYOUT$b, OFFSET$b, (byte)value);}
    public java.lang.foreign.MemorySegment b_ptr() {return this._ptr.asSlice(OFFSET$b, LAYOUT$b);}

    public char a() {return (char)this._ptr.get(LAYOUT$a, OFFSET$a);}
    public void a(char value) {this._ptr.set(LAYOUT$a, OFFSET$a, (byte)value);}
    public java.lang.foreign.MemorySegment a_ptr() {return this._ptr.asSlice(OFFSET$a, LAYOUT$a);}
}
