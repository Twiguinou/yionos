package assimp;

public record aiMatrix3x3(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$a1 = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$a1 = 0L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$a2 = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$a2 = 4L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$a3 = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$a3 = 8L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$b1 = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$b1 = 12L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$b2 = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$b2 = 16L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$b3 = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$b3 = 20L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$c1 = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$c1 = 24L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$c2 = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$c2 = 28L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$c3 = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$c3 = 32L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$a1,
            LAYOUT$a2,
            LAYOUT$a3,
            LAYOUT$b1,
            LAYOUT$b2,
            LAYOUT$b3,
            LAYOUT$c1,
            LAYOUT$c2,
            LAYOUT$c3
    ).withName("aiMatrix3x3");

    public aiMatrix3x3(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static aiMatrix3x3 getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new aiMatrix3x3(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public float a1() {return this.ptr.get(LAYOUT$a1, OFFSET$a1);}
    public void a1(float value) {this.ptr.set(LAYOUT$a1, OFFSET$a1, value);}
    public java.lang.foreign.MemorySegment a1_ptr() {return this.ptr.asSlice(OFFSET$a1, LAYOUT$a1);}

    public float a2() {return this.ptr.get(LAYOUT$a2, OFFSET$a2);}
    public void a2(float value) {this.ptr.set(LAYOUT$a2, OFFSET$a2, value);}
    public java.lang.foreign.MemorySegment a2_ptr() {return this.ptr.asSlice(OFFSET$a2, LAYOUT$a2);}

    public float a3() {return this.ptr.get(LAYOUT$a3, OFFSET$a3);}
    public void a3(float value) {this.ptr.set(LAYOUT$a3, OFFSET$a3, value);}
    public java.lang.foreign.MemorySegment a3_ptr() {return this.ptr.asSlice(OFFSET$a3, LAYOUT$a3);}

    public float b1() {return this.ptr.get(LAYOUT$b1, OFFSET$b1);}
    public void b1(float value) {this.ptr.set(LAYOUT$b1, OFFSET$b1, value);}
    public java.lang.foreign.MemorySegment b1_ptr() {return this.ptr.asSlice(OFFSET$b1, LAYOUT$b1);}

    public float b2() {return this.ptr.get(LAYOUT$b2, OFFSET$b2);}
    public void b2(float value) {this.ptr.set(LAYOUT$b2, OFFSET$b2, value);}
    public java.lang.foreign.MemorySegment b2_ptr() {return this.ptr.asSlice(OFFSET$b2, LAYOUT$b2);}

    public float b3() {return this.ptr.get(LAYOUT$b3, OFFSET$b3);}
    public void b3(float value) {this.ptr.set(LAYOUT$b3, OFFSET$b3, value);}
    public java.lang.foreign.MemorySegment b3_ptr() {return this.ptr.asSlice(OFFSET$b3, LAYOUT$b3);}

    public float c1() {return this.ptr.get(LAYOUT$c1, OFFSET$c1);}
    public void c1(float value) {this.ptr.set(LAYOUT$c1, OFFSET$c1, value);}
    public java.lang.foreign.MemorySegment c1_ptr() {return this.ptr.asSlice(OFFSET$c1, LAYOUT$c1);}

    public float c2() {return this.ptr.get(LAYOUT$c2, OFFSET$c2);}
    public void c2(float value) {this.ptr.set(LAYOUT$c2, OFFSET$c2, value);}
    public java.lang.foreign.MemorySegment c2_ptr() {return this.ptr.asSlice(OFFSET$c2, LAYOUT$c2);}

    public float c3() {return this.ptr.get(LAYOUT$c3, OFFSET$c3);}
    public void c3(float value) {this.ptr.set(LAYOUT$c3, OFFSET$c3, value);}
    public java.lang.foreign.MemorySegment c3_ptr() {return this.ptr.asSlice(OFFSET$c3, LAYOUT$c3);}
}
