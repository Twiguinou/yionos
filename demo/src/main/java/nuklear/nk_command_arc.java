package nuklear;

public record nk_command_arc(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.GroupLayout LAYOUT$header = nuklear.nk_command.gStructLayout;
    public static final long OFFSET$header = 0L;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT$cx = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET$cx = 16L;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT$cy = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET$cy = 18L;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT$r = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET$r = 20L;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT$line_thickness = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET$line_thickness = 22L;
    public static final java.lang.foreign.SequenceLayout LAYOUT$a = java.lang.foreign.MemoryLayout.sequenceLayout(2, java.lang.foreign.ValueLayout.JAVA_FLOAT);
    public static final long OFFSET$a = 24L;
    public static final java.lang.foreign.GroupLayout LAYOUT$color = nuklear.nk_color.gStructLayout;
    public static final long OFFSET$color = 32L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$header,
            LAYOUT$cx,
            LAYOUT$cy,
            LAYOUT$r,
            LAYOUT$line_thickness,
            LAYOUT$a,
            LAYOUT$color,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("nk_command_arc");

    public nk_command_arc(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static nk_command_arc getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new nk_command_arc(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public nuklear.nk_command header() {return new nuklear.nk_command(this._ptr.asSlice(OFFSET$header, LAYOUT$header));}
    public void header(java.util.function.Consumer<nuklear.nk_command> consumer) {consumer.accept(this.header());}
    public void header(nuklear.nk_command value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$header, LAYOUT$header.byteSize());}

    public short cx() {return this._ptr.get(LAYOUT$cx, OFFSET$cx);}
    public void cx(short value) {this._ptr.set(LAYOUT$cx, OFFSET$cx, value);}
    public java.lang.foreign.MemorySegment cx_ptr() {return this._ptr.asSlice(OFFSET$cx, LAYOUT$cx);}

    public short cy() {return this._ptr.get(LAYOUT$cy, OFFSET$cy);}
    public void cy(short value) {this._ptr.set(LAYOUT$cy, OFFSET$cy, value);}
    public java.lang.foreign.MemorySegment cy_ptr() {return this._ptr.asSlice(OFFSET$cy, LAYOUT$cy);}

    public short r() {return this._ptr.get(LAYOUT$r, OFFSET$r);}
    public void r(short value) {this._ptr.set(LAYOUT$r, OFFSET$r, value);}
    public java.lang.foreign.MemorySegment r_ptr() {return this._ptr.asSlice(OFFSET$r, LAYOUT$r);}

    public short line_thickness() {return this._ptr.get(LAYOUT$line_thickness, OFFSET$line_thickness);}
    public void line_thickness(short value) {this._ptr.set(LAYOUT$line_thickness, OFFSET$line_thickness, value);}
    public java.lang.foreign.MemorySegment line_thickness_ptr() {return this._ptr.asSlice(OFFSET$line_thickness, LAYOUT$line_thickness);}

    public java.lang.foreign.MemorySegment a() {return this._ptr.asSlice(OFFSET$a, LAYOUT$a);}
    public float a(int i) {return this.a().getAtIndex(java.lang.foreign.ValueLayout.JAVA_FLOAT, i);}
    public void a(int i, float value) {this.a().setAtIndex(java.lang.foreign.ValueLayout.JAVA_FLOAT, i, value);}

    public nuklear.nk_color color() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET$color, LAYOUT$color));}
    public void color(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.color());}
    public void color(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$color, LAYOUT$color.byteSize());}
}
