package nuklear;

public record nk_command_arc(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT__header = nuklear.nk_command.gRecordLayout.withName("header");
    public static final long OFFSET__header = 0;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT__cx = java.lang.foreign.ValueLayout.JAVA_SHORT.withName("cx");
    public static final long OFFSET__cx = 16;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT__cy = java.lang.foreign.ValueLayout.JAVA_SHORT.withName("cy");
    public static final long OFFSET__cy = 18;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT__r = java.lang.foreign.ValueLayout.JAVA_SHORT.withName("r");
    public static final long OFFSET__r = 20;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT__line_thickness = java.lang.foreign.ValueLayout.JAVA_SHORT.withName("line_thickness");
    public static final long OFFSET__line_thickness = 22;
    public static final java.lang.foreign.SequenceLayout LAYOUT__a = java.lang.foreign.MemoryLayout.sequenceLayout(2, java.lang.foreign.ValueLayout.JAVA_FLOAT).withName("a");
    public static final long OFFSET__a = 24;
    public static final java.lang.foreign.StructLayout LAYOUT__color = nuklear.nk_color.gRecordLayout.withName("color");
    public static final long OFFSET__color = 32;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__header,
            LAYOUT__cx,
            LAYOUT__cy,
            LAYOUT__r,
            LAYOUT__line_thickness,
            LAYOUT__a,
            LAYOUT__color,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("nk_command_arc");

    public nk_command_arc(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static nk_command_arc getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new nk_command_arc(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, nk_command_arc value)
    {
        java.lang.foreign.MemorySegment.copy(value._ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public nuklear.nk_command header() {return new nuklear.nk_command(this._ptr.asSlice(OFFSET__header, LAYOUT__header));}
    public void header(java.util.function.Consumer<nuklear.nk_command> consumer) {consumer.accept(this.header());}
    public void header(nuklear.nk_command value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__header, LAYOUT__header.byteSize());}

    public short cx() {return this._ptr.get(LAYOUT__cx, OFFSET__cx);}
    public void cx(short value) {this._ptr.set(LAYOUT__cx, OFFSET__cx, value);}
    public java.lang.foreign.MemorySegment $cx() {return this._ptr.asSlice(OFFSET__cx, LAYOUT__cx);}

    public short cy() {return this._ptr.get(LAYOUT__cy, OFFSET__cy);}
    public void cy(short value) {this._ptr.set(LAYOUT__cy, OFFSET__cy, value);}
    public java.lang.foreign.MemorySegment $cy() {return this._ptr.asSlice(OFFSET__cy, LAYOUT__cy);}

    public short r() {return this._ptr.get(LAYOUT__r, OFFSET__r);}
    public void r(short value) {this._ptr.set(LAYOUT__r, OFFSET__r, value);}
    public java.lang.foreign.MemorySegment $r() {return this._ptr.asSlice(OFFSET__r, LAYOUT__r);}

    public short line_thickness() {return this._ptr.get(LAYOUT__line_thickness, OFFSET__line_thickness);}
    public void line_thickness(short value) {this._ptr.set(LAYOUT__line_thickness, OFFSET__line_thickness, value);}
    public java.lang.foreign.MemorySegment $line_thickness() {return this._ptr.asSlice(OFFSET__line_thickness, LAYOUT__line_thickness);}

    public java.lang.foreign.MemorySegment a() {return this._ptr.asSlice(OFFSET__a, LAYOUT__a);}
    public float a(int index) {return this.a().getAtIndex(java.lang.foreign.ValueLayout.JAVA_FLOAT, index);}
    public void a(int index, float value) {this.a().setAtIndex(java.lang.foreign.ValueLayout.JAVA_FLOAT, index, value);}

    public nuklear.nk_color color() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET__color, LAYOUT__color));}
    public void color(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.color());}
    public void color(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__color, LAYOUT__color.byteSize());}
}
