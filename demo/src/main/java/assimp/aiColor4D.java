package assimp;

public record aiColor4D(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__r = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("r");
    public static final long OFFSET__r = 0;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__g = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("g");
    public static final long OFFSET__g = 4;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__b = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("b");
    public static final long OFFSET__b = 8;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__a = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("a");
    public static final long OFFSET__a = 12;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__r,
            LAYOUT__g,
            LAYOUT__b,
            LAYOUT__a
    ).withByteAlignment(4).withName("aiColor4D");

    public aiColor4D(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static aiColor4D getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new aiColor4D(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, aiColor4D value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public float r() {return this.ptr.get(LAYOUT__r, OFFSET__r);}
    public void r(float value) {this.ptr.set(LAYOUT__r, OFFSET__r, value);}
    public java.lang.foreign.MemorySegment $r() {return this.ptr.asSlice(OFFSET__r, LAYOUT__r);}

    public float g() {return this.ptr.get(LAYOUT__g, OFFSET__g);}
    public void g(float value) {this.ptr.set(LAYOUT__g, OFFSET__g, value);}
    public java.lang.foreign.MemorySegment $g() {return this.ptr.asSlice(OFFSET__g, LAYOUT__g);}

    public float b() {return this.ptr.get(LAYOUT__b, OFFSET__b);}
    public void b(float value) {this.ptr.set(LAYOUT__b, OFFSET__b, value);}
    public java.lang.foreign.MemorySegment $b() {return this.ptr.asSlice(OFFSET__b, LAYOUT__b);}

    public float a() {return this.ptr.get(LAYOUT__a, OFFSET__a);}
    public void a(float value) {this.ptr.set(LAYOUT__a, OFFSET__a, value);}
    public java.lang.foreign.MemorySegment $a() {return this.ptr.asSlice(OFFSET__a, LAYOUT__a);}
}
