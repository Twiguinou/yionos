package nuklear;

public record nk_convert_config(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__global_alpha = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("global_alpha");
    public static final long OFFSET__global_alpha = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__line_AA = java.lang.foreign.ValueLayout.JAVA_INT.withName("line_AA");
    public static final long OFFSET__line_AA = 4;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shape_AA = java.lang.foreign.ValueLayout.JAVA_INT.withName("shape_AA");
    public static final long OFFSET__shape_AA = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__circle_segment_count = java.lang.foreign.ValueLayout.JAVA_INT.withName("circle_segment_count");
    public static final long OFFSET__circle_segment_count = 12;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__arc_segment_count = java.lang.foreign.ValueLayout.JAVA_INT.withName("arc_segment_count");
    public static final long OFFSET__arc_segment_count = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__curve_segment_count = java.lang.foreign.ValueLayout.JAVA_INT.withName("curve_segment_count");
    public static final long OFFSET__curve_segment_count = 20;
    public static final java.lang.foreign.StructLayout LAYOUT__tex_null = nuklear.nk_draw_null_texture.gRecordLayout.withName("tex_null");
    public static final long OFFSET__tex_null = 24;
    public static final java.lang.foreign.AddressLayout LAYOUT__vertex_layout = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("vertex_layout");
    public static final long OFFSET__vertex_layout = 40;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__vertex_size = java.lang.foreign.ValueLayout.JAVA_LONG.withName("vertex_size");
    public static final long OFFSET__vertex_size = 48;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__vertex_alignment = java.lang.foreign.ValueLayout.JAVA_LONG.withName("vertex_alignment");
    public static final long OFFSET__vertex_alignment = 56;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__global_alpha,
            LAYOUT__line_AA,
            LAYOUT__shape_AA,
            LAYOUT__circle_segment_count,
            LAYOUT__arc_segment_count,
            LAYOUT__curve_segment_count,
            LAYOUT__tex_null,
            LAYOUT__vertex_layout,
            LAYOUT__vertex_size,
            LAYOUT__vertex_alignment
    ).withByteAlignment(8).withName("nk_convert_config");

    public nk_convert_config(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static nk_convert_config getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new nk_convert_config(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, nk_convert_config value)
    {
        java.lang.foreign.MemorySegment.copy(value._ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public float global_alpha() {return this._ptr.get(LAYOUT__global_alpha, OFFSET__global_alpha);}
    public void global_alpha(float value) {this._ptr.set(LAYOUT__global_alpha, OFFSET__global_alpha, value);}
    public java.lang.foreign.MemorySegment $global_alpha() {return this._ptr.asSlice(OFFSET__global_alpha, LAYOUT__global_alpha);}

    public int line_AA() {return this._ptr.get(LAYOUT__line_AA, OFFSET__line_AA);}
    public void line_AA(int value) {this._ptr.set(LAYOUT__line_AA, OFFSET__line_AA, value);}
    public java.lang.foreign.MemorySegment $line_AA() {return this._ptr.asSlice(OFFSET__line_AA, LAYOUT__line_AA);}

    public int shape_AA() {return this._ptr.get(LAYOUT__shape_AA, OFFSET__shape_AA);}
    public void shape_AA(int value) {this._ptr.set(LAYOUT__shape_AA, OFFSET__shape_AA, value);}
    public java.lang.foreign.MemorySegment $shape_AA() {return this._ptr.asSlice(OFFSET__shape_AA, LAYOUT__shape_AA);}

    public int circle_segment_count() {return this._ptr.get(LAYOUT__circle_segment_count, OFFSET__circle_segment_count);}
    public void circle_segment_count(int value) {this._ptr.set(LAYOUT__circle_segment_count, OFFSET__circle_segment_count, value);}
    public java.lang.foreign.MemorySegment $circle_segment_count() {return this._ptr.asSlice(OFFSET__circle_segment_count, LAYOUT__circle_segment_count);}

    public int arc_segment_count() {return this._ptr.get(LAYOUT__arc_segment_count, OFFSET__arc_segment_count);}
    public void arc_segment_count(int value) {this._ptr.set(LAYOUT__arc_segment_count, OFFSET__arc_segment_count, value);}
    public java.lang.foreign.MemorySegment $arc_segment_count() {return this._ptr.asSlice(OFFSET__arc_segment_count, LAYOUT__arc_segment_count);}

    public int curve_segment_count() {return this._ptr.get(LAYOUT__curve_segment_count, OFFSET__curve_segment_count);}
    public void curve_segment_count(int value) {this._ptr.set(LAYOUT__curve_segment_count, OFFSET__curve_segment_count, value);}
    public java.lang.foreign.MemorySegment $curve_segment_count() {return this._ptr.asSlice(OFFSET__curve_segment_count, LAYOUT__curve_segment_count);}

    public nuklear.nk_draw_null_texture tex_null() {return new nuklear.nk_draw_null_texture(this._ptr.asSlice(OFFSET__tex_null, LAYOUT__tex_null));}
    public void tex_null(java.util.function.Consumer<nuklear.nk_draw_null_texture> consumer) {consumer.accept(this.tex_null());}
    public void tex_null(nuklear.nk_draw_null_texture value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__tex_null, LAYOUT__tex_null.byteSize());}

    public java.lang.foreign.MemorySegment vertex_layout() {return this._ptr.get(LAYOUT__vertex_layout, OFFSET__vertex_layout);}
    public void vertex_layout(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT__vertex_layout, OFFSET__vertex_layout, value);}
    public java.lang.foreign.MemorySegment $vertex_layout() {return this._ptr.asSlice(OFFSET__vertex_layout, LAYOUT__vertex_layout);}

    public long vertex_size() {return this._ptr.get(LAYOUT__vertex_size, OFFSET__vertex_size);}
    public void vertex_size(long value) {this._ptr.set(LAYOUT__vertex_size, OFFSET__vertex_size, value);}
    public java.lang.foreign.MemorySegment $vertex_size() {return this._ptr.asSlice(OFFSET__vertex_size, LAYOUT__vertex_size);}

    public long vertex_alignment() {return this._ptr.get(LAYOUT__vertex_alignment, OFFSET__vertex_alignment);}
    public void vertex_alignment(long value) {this._ptr.set(LAYOUT__vertex_alignment, OFFSET__vertex_alignment, value);}
    public java.lang.foreign.MemorySegment $vertex_alignment() {return this._ptr.asSlice(OFFSET__vertex_alignment, LAYOUT__vertex_alignment);}
}
