package nuklear;

public record nk_draw_list(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.GroupLayout LAYOUT$clip_rect = nuklear.nk_rect.gStructLayout;
    public static final long OFFSET$clip_rect = 0L;
    public static final java.lang.foreign.SequenceLayout LAYOUT$circle_vtx = java.lang.foreign.MemoryLayout.sequenceLayout(12, nuklear.nk_vec2.gStructLayout);
    public static final long OFFSET$circle_vtx = 16L;
    public static final java.lang.foreign.GroupLayout LAYOUT$config = nuklear.nk_convert_config.gStructLayout;
    public static final long OFFSET$config = 112L;
    public static final java.lang.foreign.AddressLayout LAYOUT$buffer = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$buffer = 176L;
    public static final java.lang.foreign.AddressLayout LAYOUT$vertices = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$vertices = 184L;
    public static final java.lang.foreign.AddressLayout LAYOUT$elements = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$elements = 192L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$element_count = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$element_count = 200L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$vertex_count = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$vertex_count = 204L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$cmd_count = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$cmd_count = 208L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$cmd_offset = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$cmd_offset = 216L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$path_count = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$path_count = 224L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$path_offset = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$path_offset = 228L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$line_AA = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$line_AA = 232L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shape_AA = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$shape_AA = 236L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$clip_rect,
            LAYOUT$circle_vtx,
            LAYOUT$config,
            LAYOUT$buffer,
            LAYOUT$vertices,
            LAYOUT$elements,
            LAYOUT$element_count,
            LAYOUT$vertex_count,
            LAYOUT$cmd_count,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$cmd_offset,
            LAYOUT$path_count,
            LAYOUT$path_offset,
            LAYOUT$line_AA,
            LAYOUT$shape_AA
    ).withName("nk_draw_list");

    public nk_draw_list(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static nk_draw_list getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new nk_draw_list(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public nuklear.nk_rect clip_rect() {return new nuklear.nk_rect(this._ptr.asSlice(OFFSET$clip_rect, LAYOUT$clip_rect));}
    public void clip_rect(java.util.function.Consumer<nuklear.nk_rect> consumer) {consumer.accept(this.clip_rect());}
    public void clip_rect(nuklear.nk_rect value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$clip_rect, LAYOUT$clip_rect.byteSize());}

    public java.lang.foreign.MemorySegment circle_vtx() {return this._ptr.asSlice(OFFSET$circle_vtx, LAYOUT$circle_vtx);}
    public nuklear.nk_vec2 circle_vtx(int i) {return new nuklear.nk_vec2(this._ptr.asSlice(OFFSET$circle_vtx + i * LAYOUT$circle_vtx.byteSize(), LAYOUT$circle_vtx));}
    public void circle_vtx(int i, java.util.function.Consumer<nuklear.nk_vec2> consumer) {consumer.accept(this.circle_vtx(i));}
    public void circle_vtx(int i, nuklear.nk_vec2 value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$circle_vtx + i * LAYOUT$circle_vtx.byteSize(), LAYOUT$circle_vtx.byteSize());}

    public nuklear.nk_convert_config config() {return new nuklear.nk_convert_config(this._ptr.asSlice(OFFSET$config, LAYOUT$config));}
    public void config(java.util.function.Consumer<nuklear.nk_convert_config> consumer) {consumer.accept(this.config());}
    public void config(nuklear.nk_convert_config value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$config, LAYOUT$config.byteSize());}

    public java.lang.foreign.MemorySegment buffer() {return this._ptr.get(LAYOUT$buffer, OFFSET$buffer);}
    public void buffer(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT$buffer, OFFSET$buffer, value);}
    public java.lang.foreign.MemorySegment buffer_ptr() {return this._ptr.asSlice(OFFSET$buffer, LAYOUT$buffer);}

    public java.lang.foreign.MemorySegment vertices() {return this._ptr.get(LAYOUT$vertices, OFFSET$vertices);}
    public void vertices(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT$vertices, OFFSET$vertices, value);}
    public java.lang.foreign.MemorySegment vertices_ptr() {return this._ptr.asSlice(OFFSET$vertices, LAYOUT$vertices);}

    public java.lang.foreign.MemorySegment elements() {return this._ptr.get(LAYOUT$elements, OFFSET$elements);}
    public void elements(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT$elements, OFFSET$elements, value);}
    public java.lang.foreign.MemorySegment elements_ptr() {return this._ptr.asSlice(OFFSET$elements, LAYOUT$elements);}

    public int element_count() {return this._ptr.get(LAYOUT$element_count, OFFSET$element_count);}
    public void element_count(int value) {this._ptr.set(LAYOUT$element_count, OFFSET$element_count, value);}
    public java.lang.foreign.MemorySegment element_count_ptr() {return this._ptr.asSlice(OFFSET$element_count, LAYOUT$element_count);}

    public int vertex_count() {return this._ptr.get(LAYOUT$vertex_count, OFFSET$vertex_count);}
    public void vertex_count(int value) {this._ptr.set(LAYOUT$vertex_count, OFFSET$vertex_count, value);}
    public java.lang.foreign.MemorySegment vertex_count_ptr() {return this._ptr.asSlice(OFFSET$vertex_count, LAYOUT$vertex_count);}

    public int cmd_count() {return this._ptr.get(LAYOUT$cmd_count, OFFSET$cmd_count);}
    public void cmd_count(int value) {this._ptr.set(LAYOUT$cmd_count, OFFSET$cmd_count, value);}
    public java.lang.foreign.MemorySegment cmd_count_ptr() {return this._ptr.asSlice(OFFSET$cmd_count, LAYOUT$cmd_count);}

    public long cmd_offset() {return this._ptr.get(LAYOUT$cmd_offset, OFFSET$cmd_offset);}
    public void cmd_offset(long value) {this._ptr.set(LAYOUT$cmd_offset, OFFSET$cmd_offset, value);}
    public java.lang.foreign.MemorySegment cmd_offset_ptr() {return this._ptr.asSlice(OFFSET$cmd_offset, LAYOUT$cmd_offset);}

    public int path_count() {return this._ptr.get(LAYOUT$path_count, OFFSET$path_count);}
    public void path_count(int value) {this._ptr.set(LAYOUT$path_count, OFFSET$path_count, value);}
    public java.lang.foreign.MemorySegment path_count_ptr() {return this._ptr.asSlice(OFFSET$path_count, LAYOUT$path_count);}

    public int path_offset() {return this._ptr.get(LAYOUT$path_offset, OFFSET$path_offset);}
    public void path_offset(int value) {this._ptr.set(LAYOUT$path_offset, OFFSET$path_offset, value);}
    public java.lang.foreign.MemorySegment path_offset_ptr() {return this._ptr.asSlice(OFFSET$path_offset, LAYOUT$path_offset);}

    public int line_AA() {return this._ptr.get(LAYOUT$line_AA, OFFSET$line_AA);}
    public void line_AA(int value) {this._ptr.set(LAYOUT$line_AA, OFFSET$line_AA, value);}
    public java.lang.foreign.MemorySegment line_AA_ptr() {return this._ptr.asSlice(OFFSET$line_AA, LAYOUT$line_AA);}

    public int shape_AA() {return this._ptr.get(LAYOUT$shape_AA, OFFSET$shape_AA);}
    public void shape_AA(int value) {this._ptr.set(LAYOUT$shape_AA, OFFSET$shape_AA, value);}
    public java.lang.foreign.MemorySegment shape_AA_ptr() {return this._ptr.asSlice(OFFSET$shape_AA, LAYOUT$shape_AA);}
}
