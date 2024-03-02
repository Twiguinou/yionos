package nuklear;

public record nk_text_edit(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.GroupLayout LAYOUT$clip = nuklear.nk_clipboard.gStructLayout;
    public static final long OFFSET$clip = 0L;
    public static final java.lang.foreign.GroupLayout LAYOUT$string = nuklear.nk_str.gStructLayout;
    public static final long OFFSET$string = 24L;
    public static final java.lang.foreign.AddressLayout LAYOUT$filter = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$filter = 152L;
    public static final java.lang.foreign.GroupLayout LAYOUT$scrollbar = nuklear.nk_vec2.gStructLayout;
    public static final long OFFSET$scrollbar = 160L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$cursor = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$cursor = 168L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$select_start = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$select_start = 172L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$select_end = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$select_end = 176L;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$mode = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET$mode = 180L;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$cursor_at_end_of_line = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET$cursor_at_end_of_line = 181L;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$initialized = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET$initialized = 182L;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$has_preferred_x = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET$has_preferred_x = 183L;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$single_line = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET$single_line = 184L;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$active = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET$active = 185L;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$padding1 = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET$padding1 = 186L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$preferred_x = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$preferred_x = 188L;
    public static final java.lang.foreign.GroupLayout LAYOUT$undo = nuklear.nk_text_undo_state.gStructLayout;
    public static final long OFFSET$undo = 192L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$clip,
            LAYOUT$string,
            LAYOUT$filter,
            LAYOUT$scrollbar,
            LAYOUT$cursor,
            LAYOUT$select_start,
            LAYOUT$select_end,
            LAYOUT$mode,
            LAYOUT$cursor_at_end_of_line,
            LAYOUT$initialized,
            LAYOUT$has_preferred_x,
            LAYOUT$single_line,
            LAYOUT$active,
            LAYOUT$padding1,
            java.lang.foreign.MemoryLayout.paddingLayout(1),
            LAYOUT$preferred_x,
            LAYOUT$undo
    ).withName("nk_text_edit");

    public nk_text_edit(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static nk_text_edit getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new nk_text_edit(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public nuklear.nk_clipboard clip() {return new nuklear.nk_clipboard(this._ptr.asSlice(OFFSET$clip, LAYOUT$clip));}
    public void clip(java.util.function.Consumer<nuklear.nk_clipboard> consumer) {consumer.accept(this.clip());}
    public void clip(nuklear.nk_clipboard value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$clip, LAYOUT$clip.byteSize());}

    public nuklear.nk_str string() {return new nuklear.nk_str(this._ptr.asSlice(OFFSET$string, LAYOUT$string));}
    public void string(java.util.function.Consumer<nuklear.nk_str> consumer) {consumer.accept(this.string());}
    public void string(nuklear.nk_str value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$string, LAYOUT$string.byteSize());}

    public java.lang.foreign.MemorySegment filter() {return this._ptr.get(LAYOUT$filter, OFFSET$filter);}
    public void filter(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT$filter, OFFSET$filter, value);}
    public java.lang.foreign.MemorySegment filter_ptr() {return this._ptr.asSlice(OFFSET$filter, LAYOUT$filter);}

    public nuklear.nk_vec2 scrollbar() {return new nuklear.nk_vec2(this._ptr.asSlice(OFFSET$scrollbar, LAYOUT$scrollbar));}
    public void scrollbar(java.util.function.Consumer<nuklear.nk_vec2> consumer) {consumer.accept(this.scrollbar());}
    public void scrollbar(nuklear.nk_vec2 value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$scrollbar, LAYOUT$scrollbar.byteSize());}

    public int cursor() {return this._ptr.get(LAYOUT$cursor, OFFSET$cursor);}
    public void cursor(int value) {this._ptr.set(LAYOUT$cursor, OFFSET$cursor, value);}
    public java.lang.foreign.MemorySegment cursor_ptr() {return this._ptr.asSlice(OFFSET$cursor, LAYOUT$cursor);}

    public int select_start() {return this._ptr.get(LAYOUT$select_start, OFFSET$select_start);}
    public void select_start(int value) {this._ptr.set(LAYOUT$select_start, OFFSET$select_start, value);}
    public java.lang.foreign.MemorySegment select_start_ptr() {return this._ptr.asSlice(OFFSET$select_start, LAYOUT$select_start);}

    public int select_end() {return this._ptr.get(LAYOUT$select_end, OFFSET$select_end);}
    public void select_end(int value) {this._ptr.set(LAYOUT$select_end, OFFSET$select_end, value);}
    public java.lang.foreign.MemorySegment select_end_ptr() {return this._ptr.asSlice(OFFSET$select_end, LAYOUT$select_end);}

    public char mode() {return (char)this._ptr.get(LAYOUT$mode, OFFSET$mode);}
    public void mode(char value) {this._ptr.set(LAYOUT$mode, OFFSET$mode, (byte)value);}
    public java.lang.foreign.MemorySegment mode_ptr() {return this._ptr.asSlice(OFFSET$mode, LAYOUT$mode);}

    public char cursor_at_end_of_line() {return (char)this._ptr.get(LAYOUT$cursor_at_end_of_line, OFFSET$cursor_at_end_of_line);}
    public void cursor_at_end_of_line(char value) {this._ptr.set(LAYOUT$cursor_at_end_of_line, OFFSET$cursor_at_end_of_line, (byte)value);}
    public java.lang.foreign.MemorySegment cursor_at_end_of_line_ptr() {return this._ptr.asSlice(OFFSET$cursor_at_end_of_line, LAYOUT$cursor_at_end_of_line);}

    public char initialized() {return (char)this._ptr.get(LAYOUT$initialized, OFFSET$initialized);}
    public void initialized(char value) {this._ptr.set(LAYOUT$initialized, OFFSET$initialized, (byte)value);}
    public java.lang.foreign.MemorySegment initialized_ptr() {return this._ptr.asSlice(OFFSET$initialized, LAYOUT$initialized);}

    public char has_preferred_x() {return (char)this._ptr.get(LAYOUT$has_preferred_x, OFFSET$has_preferred_x);}
    public void has_preferred_x(char value) {this._ptr.set(LAYOUT$has_preferred_x, OFFSET$has_preferred_x, (byte)value);}
    public java.lang.foreign.MemorySegment has_preferred_x_ptr() {return this._ptr.asSlice(OFFSET$has_preferred_x, LAYOUT$has_preferred_x);}

    public char single_line() {return (char)this._ptr.get(LAYOUT$single_line, OFFSET$single_line);}
    public void single_line(char value) {this._ptr.set(LAYOUT$single_line, OFFSET$single_line, (byte)value);}
    public java.lang.foreign.MemorySegment single_line_ptr() {return this._ptr.asSlice(OFFSET$single_line, LAYOUT$single_line);}

    public char active() {return (char)this._ptr.get(LAYOUT$active, OFFSET$active);}
    public void active(char value) {this._ptr.set(LAYOUT$active, OFFSET$active, (byte)value);}
    public java.lang.foreign.MemorySegment active_ptr() {return this._ptr.asSlice(OFFSET$active, LAYOUT$active);}

    public char padding1() {return (char)this._ptr.get(LAYOUT$padding1, OFFSET$padding1);}
    public void padding1(char value) {this._ptr.set(LAYOUT$padding1, OFFSET$padding1, (byte)value);}
    public java.lang.foreign.MemorySegment padding1_ptr() {return this._ptr.asSlice(OFFSET$padding1, LAYOUT$padding1);}

    public float preferred_x() {return this._ptr.get(LAYOUT$preferred_x, OFFSET$preferred_x);}
    public void preferred_x(float value) {this._ptr.set(LAYOUT$preferred_x, OFFSET$preferred_x, value);}
    public java.lang.foreign.MemorySegment preferred_x_ptr() {return this._ptr.asSlice(OFFSET$preferred_x, LAYOUT$preferred_x);}

    public nuklear.nk_text_undo_state undo() {return new nuklear.nk_text_undo_state(this._ptr.asSlice(OFFSET$undo, LAYOUT$undo));}
    public void undo(java.util.function.Consumer<nuklear.nk_text_undo_state> consumer) {consumer.accept(this.undo());}
    public void undo(nuklear.nk_text_undo_state value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$undo, LAYOUT$undo.byteSize());}
}
