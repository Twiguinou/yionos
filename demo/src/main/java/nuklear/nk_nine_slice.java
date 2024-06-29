package nuklear;

public record nk_nine_slice(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT__img = nuklear.nk_image.gRecordLayout;
    public static final long OFFSET__img = 0;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT__l = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET__l = 24;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT__t = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET__t = 26;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT__r = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET__r = 28;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT__b = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET__b = 30;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__img,
            LAYOUT__l,
            LAYOUT__t,
            LAYOUT__r,
            LAYOUT__b
    ).withByteAlignment(8).withName("nk_nine_slice");

    public nk_nine_slice(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static nk_nine_slice getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new nk_nine_slice(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, nk_nine_slice value)
    {
        java.lang.foreign.MemorySegment.copy(value._ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public nuklear.nk_image img() {return new nuklear.nk_image(this._ptr.asSlice(OFFSET__img, LAYOUT__img));}
    public void img(java.util.function.Consumer<nuklear.nk_image> consumer) {consumer.accept(this.img());}
    public void img(nuklear.nk_image value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__img, LAYOUT__img.byteSize());}

    public short l() {return this._ptr.get(LAYOUT__l, OFFSET__l);}
    public void l(short value) {this._ptr.set(LAYOUT__l, OFFSET__l, value);}
    public java.lang.foreign.MemorySegment $l() {return this._ptr.asSlice(OFFSET__l, LAYOUT__l);}

    public short t() {return this._ptr.get(LAYOUT__t, OFFSET__t);}
    public void t(short value) {this._ptr.set(LAYOUT__t, OFFSET__t, value);}
    public java.lang.foreign.MemorySegment $t() {return this._ptr.asSlice(OFFSET__t, LAYOUT__t);}

    public short r() {return this._ptr.get(LAYOUT__r, OFFSET__r);}
    public void r(short value) {this._ptr.set(LAYOUT__r, OFFSET__r, value);}
    public java.lang.foreign.MemorySegment $r() {return this._ptr.asSlice(OFFSET__r, LAYOUT__r);}

    public short b() {return this._ptr.get(LAYOUT__b, OFFSET__b);}
    public void b(short value) {this._ptr.set(LAYOUT__b, OFFSET__b, value);}
    public java.lang.foreign.MemorySegment $b() {return this._ptr.asSlice(OFFSET__b, LAYOUT__b);}
}
