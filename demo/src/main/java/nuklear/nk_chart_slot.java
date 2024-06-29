package nuklear;

public record nk_chart_slot(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__type = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__type = 0;
    public static final java.lang.foreign.StructLayout LAYOUT__color = nuklear.nk_color.gRecordLayout;
    public static final long OFFSET__color = 4;
    public static final java.lang.foreign.StructLayout LAYOUT__highlight = nuklear.nk_color.gRecordLayout;
    public static final long OFFSET__highlight = 8;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__min = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET__min = 12;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__max = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET__max = 16;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__range = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET__range = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__count = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__count = 24;
    public static final java.lang.foreign.StructLayout LAYOUT__last = nuklear.nk_vec2.gRecordLayout;
    public static final long OFFSET__last = 28;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__index = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__index = 36;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__show_markers = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__show_markers = 40;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__type,
            LAYOUT__color,
            LAYOUT__highlight,
            LAYOUT__min,
            LAYOUT__max,
            LAYOUT__range,
            LAYOUT__count,
            LAYOUT__last,
            LAYOUT__index,
            LAYOUT__show_markers
    ).withByteAlignment(4).withName("nk_chart_slot");

    public nk_chart_slot(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static nk_chart_slot getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new nk_chart_slot(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, nk_chart_slot value)
    {
        java.lang.foreign.MemorySegment.copy(value._ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int type() {return this._ptr.get(LAYOUT__type, OFFSET__type);}
    public void type(int value) {this._ptr.set(LAYOUT__type, OFFSET__type, value);}
    public java.lang.foreign.MemorySegment $type() {return this._ptr.asSlice(OFFSET__type, LAYOUT__type);}

    public nuklear.nk_color color() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET__color, LAYOUT__color));}
    public void color(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.color());}
    public void color(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__color, LAYOUT__color.byteSize());}

    public nuklear.nk_color highlight() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET__highlight, LAYOUT__highlight));}
    public void highlight(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.highlight());}
    public void highlight(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__highlight, LAYOUT__highlight.byteSize());}

    public float min() {return this._ptr.get(LAYOUT__min, OFFSET__min);}
    public void min(float value) {this._ptr.set(LAYOUT__min, OFFSET__min, value);}
    public java.lang.foreign.MemorySegment $min() {return this._ptr.asSlice(OFFSET__min, LAYOUT__min);}

    public float max() {return this._ptr.get(LAYOUT__max, OFFSET__max);}
    public void max(float value) {this._ptr.set(LAYOUT__max, OFFSET__max, value);}
    public java.lang.foreign.MemorySegment $max() {return this._ptr.asSlice(OFFSET__max, LAYOUT__max);}

    public float range() {return this._ptr.get(LAYOUT__range, OFFSET__range);}
    public void range(float value) {this._ptr.set(LAYOUT__range, OFFSET__range, value);}
    public java.lang.foreign.MemorySegment $range() {return this._ptr.asSlice(OFFSET__range, LAYOUT__range);}

    public int count() {return this._ptr.get(LAYOUT__count, OFFSET__count);}
    public void count(int value) {this._ptr.set(LAYOUT__count, OFFSET__count, value);}
    public java.lang.foreign.MemorySegment $count() {return this._ptr.asSlice(OFFSET__count, LAYOUT__count);}

    public nuklear.nk_vec2 last() {return new nuklear.nk_vec2(this._ptr.asSlice(OFFSET__last, LAYOUT__last));}
    public void last(java.util.function.Consumer<nuklear.nk_vec2> consumer) {consumer.accept(this.last());}
    public void last(nuklear.nk_vec2 value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__last, LAYOUT__last.byteSize());}

    public int index() {return this._ptr.get(LAYOUT__index, OFFSET__index);}
    public void index(int value) {this._ptr.set(LAYOUT__index, OFFSET__index, value);}
    public java.lang.foreign.MemorySegment $index() {return this._ptr.asSlice(OFFSET__index, LAYOUT__index);}

    public int show_markers() {return this._ptr.get(LAYOUT__show_markers, OFFSET__show_markers);}
    public void show_markers(int value) {this._ptr.set(LAYOUT__show_markers, OFFSET__show_markers, value);}
    public java.lang.foreign.MemorySegment $show_markers() {return this._ptr.asSlice(OFFSET__show_markers, LAYOUT__show_markers);}
}
