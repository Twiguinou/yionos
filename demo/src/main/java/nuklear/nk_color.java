package nuklear;

public record nk_color(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__r = java.lang.foreign.ValueLayout.JAVA_BYTE.withName("r");
    public static final long OFFSET__r = 0;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__g = java.lang.foreign.ValueLayout.JAVA_BYTE.withName("g");
    public static final long OFFSET__g = 1;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__b = java.lang.foreign.ValueLayout.JAVA_BYTE.withName("b");
    public static final long OFFSET__b = 2;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__a = java.lang.foreign.ValueLayout.JAVA_BYTE.withName("a");
    public static final long OFFSET__a = 3;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__r,
            LAYOUT__g,
            LAYOUT__b,
            LAYOUT__a
    ).withByteAlignment(1).withName("nk_color");

    public nk_color(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static nk_color getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new nk_color(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, nk_color value)
    {
        java.lang.foreign.MemorySegment.copy(value._ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public byte r() {return this._ptr.get(LAYOUT__r, OFFSET__r);}
    public void r(byte value) {this._ptr.set(LAYOUT__r, OFFSET__r, value);}
    public java.lang.foreign.MemorySegment $r() {return this._ptr.asSlice(OFFSET__r, LAYOUT__r);}

    public byte g() {return this._ptr.get(LAYOUT__g, OFFSET__g);}
    public void g(byte value) {this._ptr.set(LAYOUT__g, OFFSET__g, value);}
    public java.lang.foreign.MemorySegment $g() {return this._ptr.asSlice(OFFSET__g, LAYOUT__g);}

    public byte b() {return this._ptr.get(LAYOUT__b, OFFSET__b);}
    public void b(byte value) {this._ptr.set(LAYOUT__b, OFFSET__b, value);}
    public java.lang.foreign.MemorySegment $b() {return this._ptr.asSlice(OFFSET__b, LAYOUT__b);}

    public byte a() {return this._ptr.get(LAYOUT__a, OFFSET__a);}
    public void a(byte value) {this._ptr.set(LAYOUT__a, OFFSET__a, value);}
    public java.lang.foreign.MemorySegment $a() {return this._ptr.asSlice(OFFSET__a, LAYOUT__a);}
}
