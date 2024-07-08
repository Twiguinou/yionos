package nuklear;

public record nk_command_line(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT__header = nuklear.nk_command.gRecordLayout.withName("header");
    public static final long OFFSET__header = 0;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT__line_thickness = java.lang.foreign.ValueLayout.JAVA_SHORT.withName("line_thickness");
    public static final long OFFSET__line_thickness = 16;
    public static final java.lang.foreign.StructLayout LAYOUT__begin = nuklear.nk_vec2i.gRecordLayout.withName("begin");
    public static final long OFFSET__begin = 18;
    public static final java.lang.foreign.StructLayout LAYOUT__end = nuklear.nk_vec2i.gRecordLayout.withName("end");
    public static final long OFFSET__end = 22;
    public static final java.lang.foreign.StructLayout LAYOUT__color = nuklear.nk_color.gRecordLayout.withName("color");
    public static final long OFFSET__color = 26;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__header,
            LAYOUT__line_thickness,
            LAYOUT__begin,
            LAYOUT__end,
            LAYOUT__color,
            java.lang.foreign.MemoryLayout.paddingLayout(2)
    ).withByteAlignment(8).withName("nk_command_line");

    public nk_command_line(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static nk_command_line getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new nk_command_line(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, nk_command_line value)
    {
        java.lang.foreign.MemorySegment.copy(value._ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public nuklear.nk_command header() {return new nuklear.nk_command(this._ptr.asSlice(OFFSET__header, LAYOUT__header));}
    public void header(java.util.function.Consumer<nuklear.nk_command> consumer) {consumer.accept(this.header());}
    public void header(nuklear.nk_command value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__header, LAYOUT__header.byteSize());}

    public short line_thickness() {return this._ptr.get(LAYOUT__line_thickness, OFFSET__line_thickness);}
    public void line_thickness(short value) {this._ptr.set(LAYOUT__line_thickness, OFFSET__line_thickness, value);}
    public java.lang.foreign.MemorySegment $line_thickness() {return this._ptr.asSlice(OFFSET__line_thickness, LAYOUT__line_thickness);}

    public nuklear.nk_vec2i begin() {return new nuklear.nk_vec2i(this._ptr.asSlice(OFFSET__begin, LAYOUT__begin));}
    public void begin(java.util.function.Consumer<nuklear.nk_vec2i> consumer) {consumer.accept(this.begin());}
    public void begin(nuklear.nk_vec2i value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__begin, LAYOUT__begin.byteSize());}

    public nuklear.nk_vec2i end() {return new nuklear.nk_vec2i(this._ptr.asSlice(OFFSET__end, LAYOUT__end));}
    public void end(java.util.function.Consumer<nuklear.nk_vec2i> consumer) {consumer.accept(this.end());}
    public void end(nuklear.nk_vec2i value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__end, LAYOUT__end.byteSize());}

    public nuklear.nk_color color() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET__color, LAYOUT__color));}
    public void color(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.color());}
    public void color(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__color, LAYOUT__color.byteSize());}
}
