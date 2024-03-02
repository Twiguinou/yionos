package nuklear;

public record nk_command_curve(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.GroupLayout LAYOUT$header = nuklear.nk_command.gStructLayout;
    public static final long OFFSET$header = 0L;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT$line_thickness = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET$line_thickness = 16L;
    public static final java.lang.foreign.GroupLayout LAYOUT$begin = nuklear.nk_vec2i.gStructLayout;
    public static final long OFFSET$begin = 18L;
    public static final java.lang.foreign.GroupLayout LAYOUT$end = nuklear.nk_vec2i.gStructLayout;
    public static final long OFFSET$end = 22L;
    public static final java.lang.foreign.SequenceLayout LAYOUT$ctrl = java.lang.foreign.MemoryLayout.sequenceLayout(2, nuklear.nk_vec2i.gStructLayout);
    public static final long OFFSET$ctrl = 26L;
    public static final java.lang.foreign.GroupLayout LAYOUT$color = nuklear.nk_color.gStructLayout;
    public static final long OFFSET$color = 34L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$header,
            LAYOUT$line_thickness,
            LAYOUT$begin,
            LAYOUT$end,
            LAYOUT$ctrl,
            LAYOUT$color,
            java.lang.foreign.MemoryLayout.paddingLayout(2)
    ).withName("nk_command_curve");

    public nk_command_curve(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static nk_command_curve getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new nk_command_curve(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public nuklear.nk_command header() {return new nuklear.nk_command(this._ptr.asSlice(OFFSET$header, LAYOUT$header));}
    public void header(java.util.function.Consumer<nuklear.nk_command> consumer) {consumer.accept(this.header());}
    public void header(nuklear.nk_command value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$header, LAYOUT$header.byteSize());}

    public short line_thickness() {return this._ptr.get(LAYOUT$line_thickness, OFFSET$line_thickness);}
    public void line_thickness(short value) {this._ptr.set(LAYOUT$line_thickness, OFFSET$line_thickness, value);}
    public java.lang.foreign.MemorySegment line_thickness_ptr() {return this._ptr.asSlice(OFFSET$line_thickness, LAYOUT$line_thickness);}

    public nuklear.nk_vec2i begin() {return new nuklear.nk_vec2i(this._ptr.asSlice(OFFSET$begin, LAYOUT$begin));}
    public void begin(java.util.function.Consumer<nuklear.nk_vec2i> consumer) {consumer.accept(this.begin());}
    public void begin(nuklear.nk_vec2i value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$begin, LAYOUT$begin.byteSize());}

    public nuklear.nk_vec2i end() {return new nuklear.nk_vec2i(this._ptr.asSlice(OFFSET$end, LAYOUT$end));}
    public void end(java.util.function.Consumer<nuklear.nk_vec2i> consumer) {consumer.accept(this.end());}
    public void end(nuklear.nk_vec2i value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$end, LAYOUT$end.byteSize());}

    public java.lang.foreign.MemorySegment ctrl() {return this._ptr.asSlice(OFFSET$ctrl, LAYOUT$ctrl);}
    public nuklear.nk_vec2i ctrl(int i) {return new nuklear.nk_vec2i(this._ptr.asSlice(OFFSET$ctrl + i * LAYOUT$ctrl.byteSize(), LAYOUT$ctrl));}
    public void ctrl(int i, java.util.function.Consumer<nuklear.nk_vec2i> consumer) {consumer.accept(this.ctrl(i));}
    public void ctrl(int i, nuklear.nk_vec2i value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$ctrl + i * LAYOUT$ctrl.byteSize(), LAYOUT$ctrl.byteSize());}

    public nuklear.nk_color color() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET$color, LAYOUT$color));}
    public void color(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.color());}
    public void color(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$color, LAYOUT$color.byteSize());}
}
