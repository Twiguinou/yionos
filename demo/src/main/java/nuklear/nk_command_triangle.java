package nuklear;

public record nk_command_triangle(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.GroupLayout LAYOUT$header = nuklear.nk_command.gStructLayout;
    public static final long OFFSET$header = 0L;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT$line_thickness = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET$line_thickness = 16L;
    public static final java.lang.foreign.GroupLayout LAYOUT$a = nuklear.nk_vec2i.gStructLayout;
    public static final long OFFSET$a = 18L;
    public static final java.lang.foreign.GroupLayout LAYOUT$b = nuklear.nk_vec2i.gStructLayout;
    public static final long OFFSET$b = 22L;
    public static final java.lang.foreign.GroupLayout LAYOUT$c = nuklear.nk_vec2i.gStructLayout;
    public static final long OFFSET$c = 26L;
    public static final java.lang.foreign.GroupLayout LAYOUT$color = nuklear.nk_color.gStructLayout;
    public static final long OFFSET$color = 30L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$header,
            LAYOUT$line_thickness,
            LAYOUT$a,
            LAYOUT$b,
            LAYOUT$c,
            LAYOUT$color,
            java.lang.foreign.MemoryLayout.paddingLayout(6)
    ).withName("nk_command_triangle");

    public nk_command_triangle(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static nk_command_triangle getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new nk_command_triangle(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public nuklear.nk_command header() {return new nuklear.nk_command(this._ptr.asSlice(OFFSET$header, LAYOUT$header));}
    public void header(java.util.function.Consumer<nuklear.nk_command> consumer) {consumer.accept(this.header());}
    public void header(nuklear.nk_command value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$header, LAYOUT$header.byteSize());}

    public short line_thickness() {return this._ptr.get(LAYOUT$line_thickness, OFFSET$line_thickness);}
    public void line_thickness(short value) {this._ptr.set(LAYOUT$line_thickness, OFFSET$line_thickness, value);}
    public java.lang.foreign.MemorySegment line_thickness_ptr() {return this._ptr.asSlice(OFFSET$line_thickness, LAYOUT$line_thickness);}

    public nuklear.nk_vec2i a() {return new nuklear.nk_vec2i(this._ptr.asSlice(OFFSET$a, LAYOUT$a));}
    public void a(java.util.function.Consumer<nuklear.nk_vec2i> consumer) {consumer.accept(this.a());}
    public void a(nuklear.nk_vec2i value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$a, LAYOUT$a.byteSize());}

    public nuklear.nk_vec2i b() {return new nuklear.nk_vec2i(this._ptr.asSlice(OFFSET$b, LAYOUT$b));}
    public void b(java.util.function.Consumer<nuklear.nk_vec2i> consumer) {consumer.accept(this.b());}
    public void b(nuklear.nk_vec2i value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$b, LAYOUT$b.byteSize());}

    public nuklear.nk_vec2i c() {return new nuklear.nk_vec2i(this._ptr.asSlice(OFFSET$c, LAYOUT$c));}
    public void c(java.util.function.Consumer<nuklear.nk_vec2i> consumer) {consumer.accept(this.c());}
    public void c(nuklear.nk_vec2i value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$c, LAYOUT$c.byteSize());}

    public nuklear.nk_color color() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET$color, LAYOUT$color));}
    public void color(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.color());}
    public void color(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$color, LAYOUT$color.byteSize());}
}
