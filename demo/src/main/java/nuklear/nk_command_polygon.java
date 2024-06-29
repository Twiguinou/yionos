package nuklear;

public record nk_command_polygon(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT__header = nuklear.nk_command.gRecordLayout;
    public static final long OFFSET__header = 0;
    public static final java.lang.foreign.StructLayout LAYOUT__color = nuklear.nk_color.gRecordLayout;
    public static final long OFFSET__color = 16;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT__line_thickness = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET__line_thickness = 20;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT__point_count = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET__point_count = 22;
    public static final java.lang.foreign.SequenceLayout LAYOUT__points = java.lang.foreign.MemoryLayout.sequenceLayout(1, nuklear.nk_vec2i.gRecordLayout);
    public static final long OFFSET__points = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__header,
            LAYOUT__color,
            LAYOUT__line_thickness,
            LAYOUT__point_count,
            LAYOUT__points,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("nk_command_polygon");

    public nk_command_polygon(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static nk_command_polygon getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new nk_command_polygon(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, nk_command_polygon value)
    {
        java.lang.foreign.MemorySegment.copy(value._ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public nuklear.nk_command header() {return new nuklear.nk_command(this._ptr.asSlice(OFFSET__header, LAYOUT__header));}
    public void header(java.util.function.Consumer<nuklear.nk_command> consumer) {consumer.accept(this.header());}
    public void header(nuklear.nk_command value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__header, LAYOUT__header.byteSize());}

    public nuklear.nk_color color() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET__color, LAYOUT__color));}
    public void color(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.color());}
    public void color(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__color, LAYOUT__color.byteSize());}

    public short line_thickness() {return this._ptr.get(LAYOUT__line_thickness, OFFSET__line_thickness);}
    public void line_thickness(short value) {this._ptr.set(LAYOUT__line_thickness, OFFSET__line_thickness, value);}
    public java.lang.foreign.MemorySegment $line_thickness() {return this._ptr.asSlice(OFFSET__line_thickness, LAYOUT__line_thickness);}

    public short point_count() {return this._ptr.get(LAYOUT__point_count, OFFSET__point_count);}
    public void point_count(short value) {this._ptr.set(LAYOUT__point_count, OFFSET__point_count, value);}
    public java.lang.foreign.MemorySegment $point_count() {return this._ptr.asSlice(OFFSET__point_count, LAYOUT__point_count);}

    public java.lang.foreign.MemorySegment points() {return this._ptr.asSlice(OFFSET__points, LAYOUT__points);}
    public nuklear.nk_vec2i points(int index) {return nuklear.nk_vec2i.getAtIndex(this.points(), index);}
    public void points(int index, java.util.function.Consumer<nuklear.nk_vec2i> consumer) {consumer.accept(this.points(index));}
    public void points(int index, nuklear.nk_vec2i value) {nuklear.nk_vec2i.setAtIndex(this.points(), index, value);}
}
