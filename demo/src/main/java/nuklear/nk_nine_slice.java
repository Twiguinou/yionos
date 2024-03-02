package nuklear;

public record nk_nine_slice(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.GroupLayout LAYOUT$img = nuklear.nk_image.gStructLayout;
    public static final long OFFSET$img = 0L;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT$l = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET$l = 24L;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT$t = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET$t = 26L;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT$r = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET$r = 28L;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT$b = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET$b = 30L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$img,
            LAYOUT$l,
            LAYOUT$t,
            LAYOUT$r,
            LAYOUT$b
    ).withName("nk_nine_slice");

    public nk_nine_slice(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static nk_nine_slice getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new nk_nine_slice(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public nuklear.nk_image img() {return new nuklear.nk_image(this._ptr.asSlice(OFFSET$img, LAYOUT$img));}
    public void img(java.util.function.Consumer<nuklear.nk_image> consumer) {consumer.accept(this.img());}
    public void img(nuklear.nk_image value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$img, LAYOUT$img.byteSize());}

    public short l() {return this._ptr.get(LAYOUT$l, OFFSET$l);}
    public void l(short value) {this._ptr.set(LAYOUT$l, OFFSET$l, value);}
    public java.lang.foreign.MemorySegment l_ptr() {return this._ptr.asSlice(OFFSET$l, LAYOUT$l);}

    public short t() {return this._ptr.get(LAYOUT$t, OFFSET$t);}
    public void t(short value) {this._ptr.set(LAYOUT$t, OFFSET$t, value);}
    public java.lang.foreign.MemorySegment t_ptr() {return this._ptr.asSlice(OFFSET$t, LAYOUT$t);}

    public short r() {return this._ptr.get(LAYOUT$r, OFFSET$r);}
    public void r(short value) {this._ptr.set(LAYOUT$r, OFFSET$r, value);}
    public java.lang.foreign.MemorySegment r_ptr() {return this._ptr.asSlice(OFFSET$r, LAYOUT$r);}

    public short b() {return this._ptr.get(LAYOUT$b, OFFSET$b);}
    public void b(short value) {this._ptr.set(LAYOUT$b, OFFSET$b, value);}
    public java.lang.foreign.MemorySegment b_ptr() {return this._ptr.asSlice(OFFSET$b, LAYOUT$b);}
}
