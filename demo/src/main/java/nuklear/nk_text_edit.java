package nuklear;

public record nk_text_edit(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT__clip = nuklear.nk_clipboard.gRecordLayout;
    public static final long OFFSET__clip = 0;
    public static final java.lang.foreign.StructLayout LAYOUT__string = nuklear.nk_str.gRecordLayout;
    public static final long OFFSET__string = 24;
    public static final java.lang.foreign.AddressLayout LAYOUT__filter = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__filter = 152;
    public static final java.lang.foreign.StructLayout LAYOUT__scrollbar = nuklear.nk_vec2.gRecordLayout;
    public static final long OFFSET__scrollbar = 160;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__cursor = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__cursor = 168;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__select_start = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__select_start = 172;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__select_end = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__select_end = 176;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__mode = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__mode = 180;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__cursor_at_end_of_line = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__cursor_at_end_of_line = 181;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__initialized = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__initialized = 182;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__has_preferred_x = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__has_preferred_x = 183;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__single_line = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__single_line = 184;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__active = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__active = 185;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__padding1 = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__padding1 = 186;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__preferred_x = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET__preferred_x = 188;
    public static final java.lang.foreign.StructLayout LAYOUT__undo = nuklear.nk_text_undo_state.gRecordLayout;
    public static final long OFFSET__undo = 192;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__clip,
            LAYOUT__string,
            LAYOUT__filter,
            LAYOUT__scrollbar,
            LAYOUT__cursor,
            LAYOUT__select_start,
            LAYOUT__select_end,
            LAYOUT__mode,
            LAYOUT__cursor_at_end_of_line,
            LAYOUT__initialized,
            LAYOUT__has_preferred_x,
            LAYOUT__single_line,
            LAYOUT__active,
            LAYOUT__padding1,
            java.lang.foreign.MemoryLayout.paddingLayout(1),
            LAYOUT__preferred_x,
            LAYOUT__undo
    ).withByteAlignment(8).withName("nk_text_edit");

    public nk_text_edit(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static nk_text_edit getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new nk_text_edit(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, nk_text_edit value)
    {
        java.lang.foreign.MemorySegment.copy(value._ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public nuklear.nk_clipboard clip() {return new nuklear.nk_clipboard(this._ptr.asSlice(OFFSET__clip, LAYOUT__clip));}
    public void clip(java.util.function.Consumer<nuklear.nk_clipboard> consumer) {consumer.accept(this.clip());}
    public void clip(nuklear.nk_clipboard value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__clip, LAYOUT__clip.byteSize());}

    public nuklear.nk_str string() {return new nuklear.nk_str(this._ptr.asSlice(OFFSET__string, LAYOUT__string));}
    public void string(java.util.function.Consumer<nuklear.nk_str> consumer) {consumer.accept(this.string());}
    public void string(nuklear.nk_str value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__string, LAYOUT__string.byteSize());}

    public java.lang.foreign.MemorySegment filter() {return this._ptr.get(LAYOUT__filter, OFFSET__filter);}
    public void filter(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT__filter, OFFSET__filter, value);}
    public java.lang.foreign.MemorySegment $filter() {return this._ptr.asSlice(OFFSET__filter, LAYOUT__filter);}

    public nuklear.nk_vec2 scrollbar() {return new nuklear.nk_vec2(this._ptr.asSlice(OFFSET__scrollbar, LAYOUT__scrollbar));}
    public void scrollbar(java.util.function.Consumer<nuklear.nk_vec2> consumer) {consumer.accept(this.scrollbar());}
    public void scrollbar(nuklear.nk_vec2 value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__scrollbar, LAYOUT__scrollbar.byteSize());}

    public int cursor() {return this._ptr.get(LAYOUT__cursor, OFFSET__cursor);}
    public void cursor(int value) {this._ptr.set(LAYOUT__cursor, OFFSET__cursor, value);}
    public java.lang.foreign.MemorySegment $cursor() {return this._ptr.asSlice(OFFSET__cursor, LAYOUT__cursor);}

    public int select_start() {return this._ptr.get(LAYOUT__select_start, OFFSET__select_start);}
    public void select_start(int value) {this._ptr.set(LAYOUT__select_start, OFFSET__select_start, value);}
    public java.lang.foreign.MemorySegment $select_start() {return this._ptr.asSlice(OFFSET__select_start, LAYOUT__select_start);}

    public int select_end() {return this._ptr.get(LAYOUT__select_end, OFFSET__select_end);}
    public void select_end(int value) {this._ptr.set(LAYOUT__select_end, OFFSET__select_end, value);}
    public java.lang.foreign.MemorySegment $select_end() {return this._ptr.asSlice(OFFSET__select_end, LAYOUT__select_end);}

    public byte mode() {return this._ptr.get(LAYOUT__mode, OFFSET__mode);}
    public void mode(byte value) {this._ptr.set(LAYOUT__mode, OFFSET__mode, value);}
    public java.lang.foreign.MemorySegment $mode() {return this._ptr.asSlice(OFFSET__mode, LAYOUT__mode);}

    public byte cursor_at_end_of_line() {return this._ptr.get(LAYOUT__cursor_at_end_of_line, OFFSET__cursor_at_end_of_line);}
    public void cursor_at_end_of_line(byte value) {this._ptr.set(LAYOUT__cursor_at_end_of_line, OFFSET__cursor_at_end_of_line, value);}
    public java.lang.foreign.MemorySegment $cursor_at_end_of_line() {return this._ptr.asSlice(OFFSET__cursor_at_end_of_line, LAYOUT__cursor_at_end_of_line);}

    public byte initialized() {return this._ptr.get(LAYOUT__initialized, OFFSET__initialized);}
    public void initialized(byte value) {this._ptr.set(LAYOUT__initialized, OFFSET__initialized, value);}
    public java.lang.foreign.MemorySegment $initialized() {return this._ptr.asSlice(OFFSET__initialized, LAYOUT__initialized);}

    public byte has_preferred_x() {return this._ptr.get(LAYOUT__has_preferred_x, OFFSET__has_preferred_x);}
    public void has_preferred_x(byte value) {this._ptr.set(LAYOUT__has_preferred_x, OFFSET__has_preferred_x, value);}
    public java.lang.foreign.MemorySegment $has_preferred_x() {return this._ptr.asSlice(OFFSET__has_preferred_x, LAYOUT__has_preferred_x);}

    public byte single_line() {return this._ptr.get(LAYOUT__single_line, OFFSET__single_line);}
    public void single_line(byte value) {this._ptr.set(LAYOUT__single_line, OFFSET__single_line, value);}
    public java.lang.foreign.MemorySegment $single_line() {return this._ptr.asSlice(OFFSET__single_line, LAYOUT__single_line);}

    public byte active() {return this._ptr.get(LAYOUT__active, OFFSET__active);}
    public void active(byte value) {this._ptr.set(LAYOUT__active, OFFSET__active, value);}
    public java.lang.foreign.MemorySegment $active() {return this._ptr.asSlice(OFFSET__active, LAYOUT__active);}

    public byte padding1() {return this._ptr.get(LAYOUT__padding1, OFFSET__padding1);}
    public void padding1(byte value) {this._ptr.set(LAYOUT__padding1, OFFSET__padding1, value);}
    public java.lang.foreign.MemorySegment $padding1() {return this._ptr.asSlice(OFFSET__padding1, LAYOUT__padding1);}

    public float preferred_x() {return this._ptr.get(LAYOUT__preferred_x, OFFSET__preferred_x);}
    public void preferred_x(float value) {this._ptr.set(LAYOUT__preferred_x, OFFSET__preferred_x, value);}
    public java.lang.foreign.MemorySegment $preferred_x() {return this._ptr.asSlice(OFFSET__preferred_x, LAYOUT__preferred_x);}

    public nuklear.nk_text_undo_state undo() {return new nuklear.nk_text_undo_state(this._ptr.asSlice(OFFSET__undo, LAYOUT__undo));}
    public void undo(java.util.function.Consumer<nuklear.nk_text_undo_state> consumer) {consumer.accept(this.undo());}
    public void undo(nuklear.nk_text_undo_state value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__undo, LAYOUT__undo.byteSize());}
}
