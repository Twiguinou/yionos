package nuklear;

public record nk_command_polygon_filled(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT__header = nuklear.nk_command.gRecordLayout.withName("header");
    public static final long OFFSET__header = 0;
    public static final java.lang.foreign.StructLayout LAYOUT__color = nuklear.nk_color.gRecordLayout.withName("color");
    public static final long OFFSET__color = 16;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT__point_count = java.lang.foreign.ValueLayout.JAVA_SHORT.withName("point_count");
    public static final long OFFSET__point_count = 20;
    public static final java.lang.foreign.SequenceLayout LAYOUT__points = java.lang.foreign.MemoryLayout.sequenceLayout(1, nuklear.nk_vec2i.gRecordLayout).withName("points");
    public static final long OFFSET__points = 22;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__header,
            LAYOUT__color,
            LAYOUT__point_count,
            LAYOUT__points,
            java.lang.foreign.MemoryLayout.paddingLayout(6)
    ).withByteAlignment(8).withName("nk_command_polygon_filled");

    public nk_command_polygon_filled(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static nk_command_polygon_filled getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new nk_command_polygon_filled(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, nk_command_polygon_filled value)
    {
        java.lang.foreign.MemorySegment.copy(value._ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public nuklear.nk_command header() {return new nuklear.nk_command(this._ptr.asSlice(OFFSET__header, LAYOUT__header));}
    public void header(java.util.function.Consumer<nuklear.nk_command> consumer) {consumer.accept(this.header());}
    public void header(nuklear.nk_command value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__header, LAYOUT__header.byteSize());}

    public nuklear.nk_color color() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET__color, LAYOUT__color));}
    public void color(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.color());}
    public void color(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__color, LAYOUT__color.byteSize());}

    public short point_count() {return this._ptr.get(LAYOUT__point_count, OFFSET__point_count);}
    public void point_count(short value) {this._ptr.set(LAYOUT__point_count, OFFSET__point_count, value);}
    public java.lang.foreign.MemorySegment $point_count() {return this._ptr.asSlice(OFFSET__point_count, LAYOUT__point_count);}

    public java.lang.foreign.MemorySegment points() {return this._ptr.asSlice(OFFSET__points, LAYOUT__points);}
    public nuklear.nk_vec2i points(int index) {return nuklear.nk_vec2i.getAtIndex(this.points(), index);}
    public void points(int index, java.util.function.Consumer<nuklear.nk_vec2i> consumer) {consumer.accept(this.points(index));}
    public void points(int index, nuklear.nk_vec2i value) {nuklear.nk_vec2i.setAtIndex(this.points(), index, value);}
}
