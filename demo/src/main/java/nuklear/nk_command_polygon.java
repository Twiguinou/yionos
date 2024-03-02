package nuklear;

public record nk_command_polygon(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.GroupLayout LAYOUT$header = nuklear.nk_command.gStructLayout;
    public static final long OFFSET$header = 0L;
    public static final java.lang.foreign.GroupLayout LAYOUT$color = nuklear.nk_color.gStructLayout;
    public static final long OFFSET$color = 16L;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT$line_thickness = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET$line_thickness = 20L;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT$point_count = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET$point_count = 22L;
    public static final java.lang.foreign.SequenceLayout LAYOUT$points = java.lang.foreign.MemoryLayout.sequenceLayout(1, nuklear.nk_vec2i.gStructLayout);
    public static final long OFFSET$points = 24L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$header,
            LAYOUT$color,
            LAYOUT$line_thickness,
            LAYOUT$point_count,
            LAYOUT$points,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("nk_command_polygon");

    public nk_command_polygon(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static nk_command_polygon getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new nk_command_polygon(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public nuklear.nk_command header() {return new nuklear.nk_command(this._ptr.asSlice(OFFSET$header, LAYOUT$header));}
    public void header(java.util.function.Consumer<nuklear.nk_command> consumer) {consumer.accept(this.header());}
    public void header(nuklear.nk_command value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$header, LAYOUT$header.byteSize());}

    public nuklear.nk_color color() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET$color, LAYOUT$color));}
    public void color(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.color());}
    public void color(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$color, LAYOUT$color.byteSize());}

    public short line_thickness() {return this._ptr.get(LAYOUT$line_thickness, OFFSET$line_thickness);}
    public void line_thickness(short value) {this._ptr.set(LAYOUT$line_thickness, OFFSET$line_thickness, value);}
    public java.lang.foreign.MemorySegment line_thickness_ptr() {return this._ptr.asSlice(OFFSET$line_thickness, LAYOUT$line_thickness);}

    public short point_count() {return this._ptr.get(LAYOUT$point_count, OFFSET$point_count);}
    public void point_count(short value) {this._ptr.set(LAYOUT$point_count, OFFSET$point_count, value);}
    public java.lang.foreign.MemorySegment point_count_ptr() {return this._ptr.asSlice(OFFSET$point_count, LAYOUT$point_count);}

    public java.lang.foreign.MemorySegment points() {return this._ptr.asSlice(OFFSET$points, LAYOUT$points);}
    public nuklear.nk_vec2i points(int i) {return new nuklear.nk_vec2i(this._ptr.asSlice(OFFSET$points + i * LAYOUT$points.byteSize(), LAYOUT$points));}
    public void points(int i, java.util.function.Consumer<nuklear.nk_vec2i> consumer) {consumer.accept(this.points(i));}
    public void points(int i, nuklear.nk_vec2i value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$points + i * LAYOUT$points.byteSize(), LAYOUT$points.byteSize());}
}
