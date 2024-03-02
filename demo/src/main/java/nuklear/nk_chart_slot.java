package nuklear;

public record nk_chart_slot(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$type = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$type = 0L;
    public static final java.lang.foreign.GroupLayout LAYOUT$color = nuklear.nk_color.gStructLayout;
    public static final long OFFSET$color = 4L;
    public static final java.lang.foreign.GroupLayout LAYOUT$highlight = nuklear.nk_color.gStructLayout;
    public static final long OFFSET$highlight = 8L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$min = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$min = 12L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$max = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$max = 16L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$range = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$range = 20L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$count = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$count = 24L;
    public static final java.lang.foreign.GroupLayout LAYOUT$last = nuklear.nk_vec2.gStructLayout;
    public static final long OFFSET$last = 28L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$index = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$index = 36L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$type,
            LAYOUT$color,
            LAYOUT$highlight,
            LAYOUT$min,
            LAYOUT$max,
            LAYOUT$range,
            LAYOUT$count,
            LAYOUT$last,
            LAYOUT$index
    ).withName("nk_chart_slot");

    public nk_chart_slot(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static nk_chart_slot getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new nk_chart_slot(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int type() {return this._ptr.get(LAYOUT$type, OFFSET$type);}
    public void type(int value) {this._ptr.set(LAYOUT$type, OFFSET$type, value);}
    public java.lang.foreign.MemorySegment type_ptr() {return this._ptr.asSlice(OFFSET$type, LAYOUT$type);}

    public nuklear.nk_color color() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET$color, LAYOUT$color));}
    public void color(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.color());}
    public void color(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$color, LAYOUT$color.byteSize());}

    public nuklear.nk_color highlight() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET$highlight, LAYOUT$highlight));}
    public void highlight(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.highlight());}
    public void highlight(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$highlight, LAYOUT$highlight.byteSize());}

    public float min() {return this._ptr.get(LAYOUT$min, OFFSET$min);}
    public void min(float value) {this._ptr.set(LAYOUT$min, OFFSET$min, value);}
    public java.lang.foreign.MemorySegment min_ptr() {return this._ptr.asSlice(OFFSET$min, LAYOUT$min);}

    public float max() {return this._ptr.get(LAYOUT$max, OFFSET$max);}
    public void max(float value) {this._ptr.set(LAYOUT$max, OFFSET$max, value);}
    public java.lang.foreign.MemorySegment max_ptr() {return this._ptr.asSlice(OFFSET$max, LAYOUT$max);}

    public float range() {return this._ptr.get(LAYOUT$range, OFFSET$range);}
    public void range(float value) {this._ptr.set(LAYOUT$range, OFFSET$range, value);}
    public java.lang.foreign.MemorySegment range_ptr() {return this._ptr.asSlice(OFFSET$range, LAYOUT$range);}

    public int count() {return this._ptr.get(LAYOUT$count, OFFSET$count);}
    public void count(int value) {this._ptr.set(LAYOUT$count, OFFSET$count, value);}
    public java.lang.foreign.MemorySegment count_ptr() {return this._ptr.asSlice(OFFSET$count, LAYOUT$count);}

    public nuklear.nk_vec2 last() {return new nuklear.nk_vec2(this._ptr.asSlice(OFFSET$last, LAYOUT$last));}
    public void last(java.util.function.Consumer<nuklear.nk_vec2> consumer) {consumer.accept(this.last());}
    public void last(nuklear.nk_vec2 value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$last, LAYOUT$last.byteSize());}

    public int index() {return this._ptr.get(LAYOUT$index, OFFSET$index);}
    public void index(int value) {this._ptr.set(LAYOUT$index, OFFSET$index, value);}
    public java.lang.foreign.MemorySegment index_ptr() {return this._ptr.asSlice(OFFSET$index, LAYOUT$index);}
}
