package assimp;

public record aiTexel(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__b = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__b = 0;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__g = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__g = 1;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__r = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__r = 2;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__a = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__a = 3;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__b,
            LAYOUT__g,
            LAYOUT__r,
            LAYOUT__a
    ).withByteAlignment(1).withName("aiTexel");

    public aiTexel(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static aiTexel getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new aiTexel(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, aiTexel value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public byte b() {return this.ptr.get(LAYOUT__b, OFFSET__b);}
    public void b(byte value) {this.ptr.set(LAYOUT__b, OFFSET__b, value);}
    public java.lang.foreign.MemorySegment $b() {return this.ptr.asSlice(OFFSET__b, LAYOUT__b);}

    public byte g() {return this.ptr.get(LAYOUT__g, OFFSET__g);}
    public void g(byte value) {this.ptr.set(LAYOUT__g, OFFSET__g, value);}
    public java.lang.foreign.MemorySegment $g() {return this.ptr.asSlice(OFFSET__g, LAYOUT__g);}

    public byte r() {return this.ptr.get(LAYOUT__r, OFFSET__r);}
    public void r(byte value) {this.ptr.set(LAYOUT__r, OFFSET__r, value);}
    public java.lang.foreign.MemorySegment $r() {return this.ptr.asSlice(OFFSET__r, LAYOUT__r);}

    public byte a() {return this.ptr.get(LAYOUT__a, OFFSET__a);}
    public void a(byte value) {this.ptr.set(LAYOUT__a, OFFSET__a, value);}
    public java.lang.foreign.MemorySegment $a() {return this.ptr.asSlice(OFFSET__a, LAYOUT__a);}
}
