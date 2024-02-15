package assimp;

public record aiColor3D(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$r = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$r = 0L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$g = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$g = 4L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$b = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$b = 8L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$r,
            LAYOUT$g,
            LAYOUT$b
    ).withName("aiColor3D");

    public aiColor3D(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static aiColor3D getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new aiColor3D(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public float r() {return this.ptr.get(LAYOUT$r, OFFSET$r);}
    public void r(float value) {this.ptr.set(LAYOUT$r, OFFSET$r, value);}
    public java.lang.foreign.MemorySegment r_ptr() {return this.ptr.asSlice(OFFSET$r, LAYOUT$r);}

    public float g() {return this.ptr.get(LAYOUT$g, OFFSET$g);}
    public void g(float value) {this.ptr.set(LAYOUT$g, OFFSET$g, value);}
    public java.lang.foreign.MemorySegment g_ptr() {return this.ptr.asSlice(OFFSET$g, LAYOUT$g);}

    public float b() {return this.ptr.get(LAYOUT$b, OFFSET$b);}
    public void b(float value) {this.ptr.set(LAYOUT$b, OFFSET$b, value);}
    public java.lang.foreign.MemorySegment b_ptr() {return this.ptr.asSlice(OFFSET$b, LAYOUT$b);}
}
