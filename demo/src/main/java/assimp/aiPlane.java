package assimp;

public record aiPlane(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$a = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$a = 0L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$b = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$b = 4L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$c = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$c = 8L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$d = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$d = 12L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$a,
            LAYOUT$b,
            LAYOUT$c,
            LAYOUT$d
    ).withName("aiPlane");

    public aiPlane(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static aiPlane getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new aiPlane(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public float a() {return this.ptr.get(LAYOUT$a, OFFSET$a);}
    public void a(float value) {this.ptr.set(LAYOUT$a, OFFSET$a, value);}
    public java.lang.foreign.MemorySegment a_ptr() {return this.ptr.asSlice(OFFSET$a, LAYOUT$a);}

    public float b() {return this.ptr.get(LAYOUT$b, OFFSET$b);}
    public void b(float value) {this.ptr.set(LAYOUT$b, OFFSET$b, value);}
    public java.lang.foreign.MemorySegment b_ptr() {return this.ptr.asSlice(OFFSET$b, LAYOUT$b);}

    public float c() {return this.ptr.get(LAYOUT$c, OFFSET$c);}
    public void c(float value) {this.ptr.set(LAYOUT$c, OFFSET$c, value);}
    public java.lang.foreign.MemorySegment c_ptr() {return this.ptr.asSlice(OFFSET$c, LAYOUT$c);}

    public float d() {return this.ptr.get(LAYOUT$d, OFFSET$d);}
    public void d(float value) {this.ptr.set(LAYOUT$d, OFFSET$d, value);}
    public java.lang.foreign.MemorySegment d_ptr() {return this.ptr.asSlice(OFFSET$d, LAYOUT$d);}
}
