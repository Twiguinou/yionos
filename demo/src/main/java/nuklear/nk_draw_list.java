package nuklear;

public record nk_draw_list(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT__clip_rect = nuklear.nk_rect.gRecordLayout;
    public static final long OFFSET__clip_rect = 0;
    public static final java.lang.foreign.SequenceLayout LAYOUT__circle_vtx = java.lang.foreign.MemoryLayout.sequenceLayout(12, nuklear.nk_vec2.gRecordLayout);
    public static final long OFFSET__circle_vtx = 16;
    public static final java.lang.foreign.StructLayout LAYOUT__config = nuklear.nk_convert_config.gRecordLayout;
    public static final long OFFSET__config = 112;
    public static final java.lang.foreign.AddressLayout LAYOUT__buffer = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__buffer = 176;
    public static final java.lang.foreign.AddressLayout LAYOUT__vertices = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__vertices = 184;
    public static final java.lang.foreign.AddressLayout LAYOUT__elements = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__elements = 192;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__element_count = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__element_count = 200;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__vertex_count = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__vertex_count = 204;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__cmd_count = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__cmd_count = 208;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__cmd_offset = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__cmd_offset = 216;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__path_count = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__path_count = 224;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__path_offset = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__path_offset = 228;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__line_AA = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__line_AA = 232;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shape_AA = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__shape_AA = 236;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__clip_rect,
            LAYOUT__circle_vtx,
            LAYOUT__config,
            LAYOUT__buffer,
            LAYOUT__vertices,
            LAYOUT__elements,
            LAYOUT__element_count,
            LAYOUT__vertex_count,
            LAYOUT__cmd_count,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__cmd_offset,
            LAYOUT__path_count,
            LAYOUT__path_offset,
            LAYOUT__line_AA,
            LAYOUT__shape_AA
    ).withByteAlignment(8).withName("nk_draw_list");

    public nk_draw_list(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static nk_draw_list getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new nk_draw_list(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, nk_draw_list value)
    {
        java.lang.foreign.MemorySegment.copy(value._ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public nuklear.nk_rect clip_rect() {return new nuklear.nk_rect(this._ptr.asSlice(OFFSET__clip_rect, LAYOUT__clip_rect));}
    public void clip_rect(java.util.function.Consumer<nuklear.nk_rect> consumer) {consumer.accept(this.clip_rect());}
    public void clip_rect(nuklear.nk_rect value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__clip_rect, LAYOUT__clip_rect.byteSize());}

    public java.lang.foreign.MemorySegment circle_vtx() {return this._ptr.asSlice(OFFSET__circle_vtx, LAYOUT__circle_vtx);}
    public nuklear.nk_vec2 circle_vtx(int index) {return nuklear.nk_vec2.getAtIndex(this.circle_vtx(), index);}
    public void circle_vtx(int index, java.util.function.Consumer<nuklear.nk_vec2> consumer) {consumer.accept(this.circle_vtx(index));}
    public void circle_vtx(int index, nuklear.nk_vec2 value) {nuklear.nk_vec2.setAtIndex(this.circle_vtx(), index, value);}

    public nuklear.nk_convert_config config() {return new nuklear.nk_convert_config(this._ptr.asSlice(OFFSET__config, LAYOUT__config));}
    public void config(java.util.function.Consumer<nuklear.nk_convert_config> consumer) {consumer.accept(this.config());}
    public void config(nuklear.nk_convert_config value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__config, LAYOUT__config.byteSize());}

    public java.lang.foreign.MemorySegment buffer() {return this._ptr.get(LAYOUT__buffer, OFFSET__buffer);}
    public void buffer(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT__buffer, OFFSET__buffer, value);}
    public java.lang.foreign.MemorySegment $buffer() {return this._ptr.asSlice(OFFSET__buffer, LAYOUT__buffer);}

    public java.lang.foreign.MemorySegment vertices() {return this._ptr.get(LAYOUT__vertices, OFFSET__vertices);}
    public void vertices(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT__vertices, OFFSET__vertices, value);}
    public java.lang.foreign.MemorySegment $vertices() {return this._ptr.asSlice(OFFSET__vertices, LAYOUT__vertices);}

    public java.lang.foreign.MemorySegment elements() {return this._ptr.get(LAYOUT__elements, OFFSET__elements);}
    public void elements(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT__elements, OFFSET__elements, value);}
    public java.lang.foreign.MemorySegment $elements() {return this._ptr.asSlice(OFFSET__elements, LAYOUT__elements);}

    public int element_count() {return this._ptr.get(LAYOUT__element_count, OFFSET__element_count);}
    public void element_count(int value) {this._ptr.set(LAYOUT__element_count, OFFSET__element_count, value);}
    public java.lang.foreign.MemorySegment $element_count() {return this._ptr.asSlice(OFFSET__element_count, LAYOUT__element_count);}

    public int vertex_count() {return this._ptr.get(LAYOUT__vertex_count, OFFSET__vertex_count);}
    public void vertex_count(int value) {this._ptr.set(LAYOUT__vertex_count, OFFSET__vertex_count, value);}
    public java.lang.foreign.MemorySegment $vertex_count() {return this._ptr.asSlice(OFFSET__vertex_count, LAYOUT__vertex_count);}

    public int cmd_count() {return this._ptr.get(LAYOUT__cmd_count, OFFSET__cmd_count);}
    public void cmd_count(int value) {this._ptr.set(LAYOUT__cmd_count, OFFSET__cmd_count, value);}
    public java.lang.foreign.MemorySegment $cmd_count() {return this._ptr.asSlice(OFFSET__cmd_count, LAYOUT__cmd_count);}

    public long cmd_offset() {return this._ptr.get(LAYOUT__cmd_offset, OFFSET__cmd_offset);}
    public void cmd_offset(long value) {this._ptr.set(LAYOUT__cmd_offset, OFFSET__cmd_offset, value);}
    public java.lang.foreign.MemorySegment $cmd_offset() {return this._ptr.asSlice(OFFSET__cmd_offset, LAYOUT__cmd_offset);}

    public int path_count() {return this._ptr.get(LAYOUT__path_count, OFFSET__path_count);}
    public void path_count(int value) {this._ptr.set(LAYOUT__path_count, OFFSET__path_count, value);}
    public java.lang.foreign.MemorySegment $path_count() {return this._ptr.asSlice(OFFSET__path_count, LAYOUT__path_count);}

    public int path_offset() {return this._ptr.get(LAYOUT__path_offset, OFFSET__path_offset);}
    public void path_offset(int value) {this._ptr.set(LAYOUT__path_offset, OFFSET__path_offset, value);}
    public java.lang.foreign.MemorySegment $path_offset() {return this._ptr.asSlice(OFFSET__path_offset, LAYOUT__path_offset);}

    public int line_AA() {return this._ptr.get(LAYOUT__line_AA, OFFSET__line_AA);}
    public void line_AA(int value) {this._ptr.set(LAYOUT__line_AA, OFFSET__line_AA, value);}
    public java.lang.foreign.MemorySegment $line_AA() {return this._ptr.asSlice(OFFSET__line_AA, LAYOUT__line_AA);}

    public int shape_AA() {return this._ptr.get(LAYOUT__shape_AA, OFFSET__shape_AA);}
    public void shape_AA(int value) {this._ptr.set(LAYOUT__shape_AA, OFFSET__shape_AA, value);}
    public java.lang.foreign.MemorySegment $shape_AA() {return this._ptr.asSlice(OFFSET__shape_AA, LAYOUT__shape_AA);}
}
