package nuklear;

public record nk_window(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$seq = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$seq = 0L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$name = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$name = 4L;
    public static final java.lang.foreign.SequenceLayout LAYOUT$name_string = java.lang.foreign.MemoryLayout.sequenceLayout(64, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET$name_string = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$flags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$flags = 72L;
    public static final java.lang.foreign.GroupLayout LAYOUT$bounds = nuklear.nk_rect.gStructLayout;
    public static final long OFFSET$bounds = 76L;
    public static final java.lang.foreign.GroupLayout LAYOUT$scrollbar = nuklear.nk_scroll.gStructLayout;
    public static final long OFFSET$scrollbar = 92L;
    public static final java.lang.foreign.GroupLayout LAYOUT$buffer = nuklear.nk_command_buffer.gStructLayout;
    public static final long OFFSET$buffer = 104L;
    public static final java.lang.foreign.AddressLayout LAYOUT$layout = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$layout = 168L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$scrollbar_hiding_timer = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$scrollbar_hiding_timer = 176L;
    public static final java.lang.foreign.GroupLayout LAYOUT$property = nuklear.nk_property_state.gStructLayout;
    public static final long OFFSET$property = 180L;
    public static final java.lang.foreign.GroupLayout LAYOUT$popup = nuklear.nk_popup_state.gStructLayout;
    public static final long OFFSET$popup = 288L;
    public static final java.lang.foreign.GroupLayout LAYOUT$edit = nuklear.nk_edit_state.gStructLayout;
    public static final long OFFSET$edit = 384L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$scrolled = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$scrolled = 428L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$widgets_disabled = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$widgets_disabled = 432L;
    public static final java.lang.foreign.AddressLayout LAYOUT$tables = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$tables = 440L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$table_count = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$table_count = 448L;
    public static final java.lang.foreign.AddressLayout LAYOUT$next = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$next = 456L;
    public static final java.lang.foreign.AddressLayout LAYOUT$prev = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$prev = 464L;
    public static final java.lang.foreign.AddressLayout LAYOUT$parent = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$parent = 472L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$seq,
            LAYOUT$name,
            LAYOUT$name_string,
            LAYOUT$flags,
            LAYOUT$bounds,
            LAYOUT$scrollbar,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$buffer,
            LAYOUT$layout,
            LAYOUT$scrollbar_hiding_timer,
            LAYOUT$property,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$popup,
            LAYOUT$edit,
            LAYOUT$scrolled,
            LAYOUT$widgets_disabled,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$tables,
            LAYOUT$table_count,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$next,
            LAYOUT$prev,
            LAYOUT$parent
    ).withName("nk_window");

    public nk_window(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static nk_window getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new nk_window(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int seq() {return this._ptr.get(LAYOUT$seq, OFFSET$seq);}
    public void seq(int value) {this._ptr.set(LAYOUT$seq, OFFSET$seq, value);}
    public java.lang.foreign.MemorySegment seq_ptr() {return this._ptr.asSlice(OFFSET$seq, LAYOUT$seq);}

    public int name() {return this._ptr.get(LAYOUT$name, OFFSET$name);}
    public void name(int value) {this._ptr.set(LAYOUT$name, OFFSET$name, value);}
    public java.lang.foreign.MemorySegment name_ptr() {return this._ptr.asSlice(OFFSET$name, LAYOUT$name);}

    public java.lang.foreign.MemorySegment name_string() {return this._ptr.asSlice(OFFSET$name_string, LAYOUT$name_string);}
    public char name_string(int i) {return (char)this.name_string().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i);}
    public void name_string(int i, char value) {this.name_string().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i, (byte)value);}

    public int flags() {return this._ptr.get(LAYOUT$flags, OFFSET$flags);}
    public void flags(int value) {this._ptr.set(LAYOUT$flags, OFFSET$flags, value);}
    public java.lang.foreign.MemorySegment flags_ptr() {return this._ptr.asSlice(OFFSET$flags, LAYOUT$flags);}

    public nuklear.nk_rect bounds() {return new nuklear.nk_rect(this._ptr.asSlice(OFFSET$bounds, LAYOUT$bounds));}
    public void bounds(java.util.function.Consumer<nuklear.nk_rect> consumer) {consumer.accept(this.bounds());}
    public void bounds(nuklear.nk_rect value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$bounds, LAYOUT$bounds.byteSize());}

    public nuklear.nk_scroll scrollbar() {return new nuklear.nk_scroll(this._ptr.asSlice(OFFSET$scrollbar, LAYOUT$scrollbar));}
    public void scrollbar(java.util.function.Consumer<nuklear.nk_scroll> consumer) {consumer.accept(this.scrollbar());}
    public void scrollbar(nuklear.nk_scroll value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$scrollbar, LAYOUT$scrollbar.byteSize());}

    public nuklear.nk_command_buffer buffer() {return new nuklear.nk_command_buffer(this._ptr.asSlice(OFFSET$buffer, LAYOUT$buffer));}
    public void buffer(java.util.function.Consumer<nuklear.nk_command_buffer> consumer) {consumer.accept(this.buffer());}
    public void buffer(nuklear.nk_command_buffer value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$buffer, LAYOUT$buffer.byteSize());}

    public java.lang.foreign.MemorySegment layout() {return this._ptr.get(LAYOUT$layout, OFFSET$layout);}
    public void layout(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT$layout, OFFSET$layout, value);}
    public java.lang.foreign.MemorySegment layout_ptr() {return this._ptr.asSlice(OFFSET$layout, LAYOUT$layout);}

    public float scrollbar_hiding_timer() {return this._ptr.get(LAYOUT$scrollbar_hiding_timer, OFFSET$scrollbar_hiding_timer);}
    public void scrollbar_hiding_timer(float value) {this._ptr.set(LAYOUT$scrollbar_hiding_timer, OFFSET$scrollbar_hiding_timer, value);}
    public java.lang.foreign.MemorySegment scrollbar_hiding_timer_ptr() {return this._ptr.asSlice(OFFSET$scrollbar_hiding_timer, LAYOUT$scrollbar_hiding_timer);}

    public nuklear.nk_property_state property() {return new nuklear.nk_property_state(this._ptr.asSlice(OFFSET$property, LAYOUT$property));}
    public void property(java.util.function.Consumer<nuklear.nk_property_state> consumer) {consumer.accept(this.property());}
    public void property(nuklear.nk_property_state value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$property, LAYOUT$property.byteSize());}

    public nuklear.nk_popup_state popup() {return new nuklear.nk_popup_state(this._ptr.asSlice(OFFSET$popup, LAYOUT$popup));}
    public void popup(java.util.function.Consumer<nuklear.nk_popup_state> consumer) {consumer.accept(this.popup());}
    public void popup(nuklear.nk_popup_state value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$popup, LAYOUT$popup.byteSize());}

    public nuklear.nk_edit_state edit() {return new nuklear.nk_edit_state(this._ptr.asSlice(OFFSET$edit, LAYOUT$edit));}
    public void edit(java.util.function.Consumer<nuklear.nk_edit_state> consumer) {consumer.accept(this.edit());}
    public void edit(nuklear.nk_edit_state value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$edit, LAYOUT$edit.byteSize());}

    public int scrolled() {return this._ptr.get(LAYOUT$scrolled, OFFSET$scrolled);}
    public void scrolled(int value) {this._ptr.set(LAYOUT$scrolled, OFFSET$scrolled, value);}
    public java.lang.foreign.MemorySegment scrolled_ptr() {return this._ptr.asSlice(OFFSET$scrolled, LAYOUT$scrolled);}

    public int widgets_disabled() {return this._ptr.get(LAYOUT$widgets_disabled, OFFSET$widgets_disabled);}
    public void widgets_disabled(int value) {this._ptr.set(LAYOUT$widgets_disabled, OFFSET$widgets_disabled, value);}
    public java.lang.foreign.MemorySegment widgets_disabled_ptr() {return this._ptr.asSlice(OFFSET$widgets_disabled, LAYOUT$widgets_disabled);}

    public java.lang.foreign.MemorySegment tables() {return this._ptr.get(LAYOUT$tables, OFFSET$tables);}
    public void tables(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT$tables, OFFSET$tables, value);}
    public java.lang.foreign.MemorySegment tables_ptr() {return this._ptr.asSlice(OFFSET$tables, LAYOUT$tables);}

    public int table_count() {return this._ptr.get(LAYOUT$table_count, OFFSET$table_count);}
    public void table_count(int value) {this._ptr.set(LAYOUT$table_count, OFFSET$table_count, value);}
    public java.lang.foreign.MemorySegment table_count_ptr() {return this._ptr.asSlice(OFFSET$table_count, LAYOUT$table_count);}

    public java.lang.foreign.MemorySegment next() {return this._ptr.get(LAYOUT$next, OFFSET$next);}
    public void next(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT$next, OFFSET$next, value);}
    public java.lang.foreign.MemorySegment next_ptr() {return this._ptr.asSlice(OFFSET$next, LAYOUT$next);}

    public java.lang.foreign.MemorySegment prev() {return this._ptr.get(LAYOUT$prev, OFFSET$prev);}
    public void prev(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT$prev, OFFSET$prev, value);}
    public java.lang.foreign.MemorySegment prev_ptr() {return this._ptr.asSlice(OFFSET$prev, LAYOUT$prev);}

    public java.lang.foreign.MemorySegment parent() {return this._ptr.get(LAYOUT$parent, OFFSET$parent);}
    public void parent(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT$parent, OFFSET$parent, value);}
    public java.lang.foreign.MemorySegment parent_ptr() {return this._ptr.asSlice(OFFSET$parent, LAYOUT$parent);}
}
