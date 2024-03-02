package nuklear;

public record nk_convert_config(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$global_alpha = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$global_alpha = 0L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$line_AA = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$line_AA = 4L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shape_AA = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$shape_AA = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$circle_segment_count = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$circle_segment_count = 12L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$arc_segment_count = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$arc_segment_count = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$curve_segment_count = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$curve_segment_count = 20L;
    public static final java.lang.foreign.GroupLayout LAYOUT$tex_null = nuklear.nk_draw_null_texture.gStructLayout;
    public static final long OFFSET$tex_null = 24L;
    public static final java.lang.foreign.AddressLayout LAYOUT$vertex_layout = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$vertex_layout = 40L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$vertex_size = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$vertex_size = 48L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$vertex_alignment = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$vertex_alignment = 56L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$global_alpha,
            LAYOUT$line_AA,
            LAYOUT$shape_AA,
            LAYOUT$circle_segment_count,
            LAYOUT$arc_segment_count,
            LAYOUT$curve_segment_count,
            LAYOUT$tex_null,
            LAYOUT$vertex_layout,
            LAYOUT$vertex_size,
            LAYOUT$vertex_alignment
    ).withName("nk_convert_config");

    public nk_convert_config(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static nk_convert_config getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new nk_convert_config(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public float global_alpha() {return this._ptr.get(LAYOUT$global_alpha, OFFSET$global_alpha);}
    public void global_alpha(float value) {this._ptr.set(LAYOUT$global_alpha, OFFSET$global_alpha, value);}
    public java.lang.foreign.MemorySegment global_alpha_ptr() {return this._ptr.asSlice(OFFSET$global_alpha, LAYOUT$global_alpha);}

    public int line_AA() {return this._ptr.get(LAYOUT$line_AA, OFFSET$line_AA);}
    public void line_AA(int value) {this._ptr.set(LAYOUT$line_AA, OFFSET$line_AA, value);}
    public java.lang.foreign.MemorySegment line_AA_ptr() {return this._ptr.asSlice(OFFSET$line_AA, LAYOUT$line_AA);}

    public int shape_AA() {return this._ptr.get(LAYOUT$shape_AA, OFFSET$shape_AA);}
    public void shape_AA(int value) {this._ptr.set(LAYOUT$shape_AA, OFFSET$shape_AA, value);}
    public java.lang.foreign.MemorySegment shape_AA_ptr() {return this._ptr.asSlice(OFFSET$shape_AA, LAYOUT$shape_AA);}

    public int circle_segment_count() {return this._ptr.get(LAYOUT$circle_segment_count, OFFSET$circle_segment_count);}
    public void circle_segment_count(int value) {this._ptr.set(LAYOUT$circle_segment_count, OFFSET$circle_segment_count, value);}
    public java.lang.foreign.MemorySegment circle_segment_count_ptr() {return this._ptr.asSlice(OFFSET$circle_segment_count, LAYOUT$circle_segment_count);}

    public int arc_segment_count() {return this._ptr.get(LAYOUT$arc_segment_count, OFFSET$arc_segment_count);}
    public void arc_segment_count(int value) {this._ptr.set(LAYOUT$arc_segment_count, OFFSET$arc_segment_count, value);}
    public java.lang.foreign.MemorySegment arc_segment_count_ptr() {return this._ptr.asSlice(OFFSET$arc_segment_count, LAYOUT$arc_segment_count);}

    public int curve_segment_count() {return this._ptr.get(LAYOUT$curve_segment_count, OFFSET$curve_segment_count);}
    public void curve_segment_count(int value) {this._ptr.set(LAYOUT$curve_segment_count, OFFSET$curve_segment_count, value);}
    public java.lang.foreign.MemorySegment curve_segment_count_ptr() {return this._ptr.asSlice(OFFSET$curve_segment_count, LAYOUT$curve_segment_count);}

    public nuklear.nk_draw_null_texture tex_null() {return new nuklear.nk_draw_null_texture(this._ptr.asSlice(OFFSET$tex_null, LAYOUT$tex_null));}
    public void tex_null(java.util.function.Consumer<nuklear.nk_draw_null_texture> consumer) {consumer.accept(this.tex_null());}
    public void tex_null(nuklear.nk_draw_null_texture value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$tex_null, LAYOUT$tex_null.byteSize());}

    public java.lang.foreign.MemorySegment vertex_layout() {return this._ptr.get(LAYOUT$vertex_layout, OFFSET$vertex_layout);}
    public void vertex_layout(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT$vertex_layout, OFFSET$vertex_layout, value);}
    public java.lang.foreign.MemorySegment vertex_layout_ptr() {return this._ptr.asSlice(OFFSET$vertex_layout, LAYOUT$vertex_layout);}

    public long vertex_size() {return this._ptr.get(LAYOUT$vertex_size, OFFSET$vertex_size);}
    public void vertex_size(long value) {this._ptr.set(LAYOUT$vertex_size, OFFSET$vertex_size, value);}
    public java.lang.foreign.MemorySegment vertex_size_ptr() {return this._ptr.asSlice(OFFSET$vertex_size, LAYOUT$vertex_size);}

    public long vertex_alignment() {return this._ptr.get(LAYOUT$vertex_alignment, OFFSET$vertex_alignment);}
    public void vertex_alignment(long value) {this._ptr.set(LAYOUT$vertex_alignment, OFFSET$vertex_alignment, value);}
    public java.lang.foreign.MemorySegment vertex_alignment_ptr() {return this._ptr.asSlice(OFFSET$vertex_alignment, LAYOUT$vertex_alignment);}
}
