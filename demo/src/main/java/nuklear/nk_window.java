package nuklear;

public record nk_window(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__seq = java.lang.foreign.ValueLayout.JAVA_INT.withName("seq");
    public static final long OFFSET__seq = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__name = java.lang.foreign.ValueLayout.JAVA_INT.withName("name");
    public static final long OFFSET__name = 4;
    public static final java.lang.foreign.SequenceLayout LAYOUT__name_string = java.lang.foreign.MemoryLayout.sequenceLayout(64, java.lang.foreign.ValueLayout.JAVA_BYTE).withName("name_string");
    public static final long OFFSET__name_string = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__flags = java.lang.foreign.ValueLayout.JAVA_INT.withName("flags");
    public static final long OFFSET__flags = 72;
    public static final java.lang.foreign.StructLayout LAYOUT__bounds = nuklear.nk_rect.gRecordLayout.withName("bounds");
    public static final long OFFSET__bounds = 76;
    public static final java.lang.foreign.StructLayout LAYOUT__scrollbar = nuklear.nk_scroll.gRecordLayout.withName("scrollbar");
    public static final long OFFSET__scrollbar = 92;
    public static final java.lang.foreign.StructLayout LAYOUT__buffer = nuklear.nk_command_buffer.gRecordLayout.withName("buffer");
    public static final long OFFSET__buffer = 104;
    public static final java.lang.foreign.AddressLayout LAYOUT__layout = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("layout");
    public static final long OFFSET__layout = 168;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__scrollbar_hiding_timer = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("scrollbar_hiding_timer");
    public static final long OFFSET__scrollbar_hiding_timer = 176;
    public static final java.lang.foreign.StructLayout LAYOUT__property = nuklear.nk_property_state.gRecordLayout.withName("property");
    public static final long OFFSET__property = 180;
    public static final java.lang.foreign.StructLayout LAYOUT__popup = nuklear.nk_popup_state.gRecordLayout.withName("popup");
    public static final long OFFSET__popup = 288;
    public static final java.lang.foreign.StructLayout LAYOUT__edit = nuklear.nk_edit_state.gRecordLayout.withName("edit");
    public static final long OFFSET__edit = 384;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__scrolled = java.lang.foreign.ValueLayout.JAVA_INT.withName("scrolled");
    public static final long OFFSET__scrolled = 428;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__widgets_disabled = java.lang.foreign.ValueLayout.JAVA_INT.withName("widgets_disabled");
    public static final long OFFSET__widgets_disabled = 432;
    public static final java.lang.foreign.AddressLayout LAYOUT__tables = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("tables");
    public static final long OFFSET__tables = 440;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__table_count = java.lang.foreign.ValueLayout.JAVA_INT.withName("table_count");
    public static final long OFFSET__table_count = 448;
    public static final java.lang.foreign.AddressLayout LAYOUT__next = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("next");
    public static final long OFFSET__next = 456;
    public static final java.lang.foreign.AddressLayout LAYOUT__prev = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("prev");
    public static final long OFFSET__prev = 464;
    public static final java.lang.foreign.AddressLayout LAYOUT__parent = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("parent");
    public static final long OFFSET__parent = 472;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__seq,
            LAYOUT__name,
            LAYOUT__name_string,
            LAYOUT__flags,
            LAYOUT__bounds,
            LAYOUT__scrollbar,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__buffer,
            LAYOUT__layout,
            LAYOUT__scrollbar_hiding_timer,
            LAYOUT__property,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__popup,
            LAYOUT__edit,
            LAYOUT__scrolled,
            LAYOUT__widgets_disabled,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__tables,
            LAYOUT__table_count,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__next,
            LAYOUT__prev,
            LAYOUT__parent
    ).withByteAlignment(8).withName("nk_window");

    public nk_window(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static nk_window getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new nk_window(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, nk_window value)
    {
        java.lang.foreign.MemorySegment.copy(value._ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int seq() {return this._ptr.get(LAYOUT__seq, OFFSET__seq);}
    public void seq(int value) {this._ptr.set(LAYOUT__seq, OFFSET__seq, value);}
    public java.lang.foreign.MemorySegment $seq() {return this._ptr.asSlice(OFFSET__seq, LAYOUT__seq);}

    public int name() {return this._ptr.get(LAYOUT__name, OFFSET__name);}
    public void name(int value) {this._ptr.set(LAYOUT__name, OFFSET__name, value);}
    public java.lang.foreign.MemorySegment $name() {return this._ptr.asSlice(OFFSET__name, LAYOUT__name);}

    public java.lang.foreign.MemorySegment name_string() {return this._ptr.asSlice(OFFSET__name_string, LAYOUT__name_string);}
    public byte name_string(int index) {return this.name_string().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index);}
    public void name_string(int index, byte value) {this.name_string().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index, value);}

    public int flags() {return this._ptr.get(LAYOUT__flags, OFFSET__flags);}
    public void flags(int value) {this._ptr.set(LAYOUT__flags, OFFSET__flags, value);}
    public java.lang.foreign.MemorySegment $flags() {return this._ptr.asSlice(OFFSET__flags, LAYOUT__flags);}

    public nuklear.nk_rect bounds() {return new nuklear.nk_rect(this._ptr.asSlice(OFFSET__bounds, LAYOUT__bounds));}
    public void bounds(java.util.function.Consumer<nuklear.nk_rect> consumer) {consumer.accept(this.bounds());}
    public void bounds(nuklear.nk_rect value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__bounds, LAYOUT__bounds.byteSize());}

    public nuklear.nk_scroll scrollbar() {return new nuklear.nk_scroll(this._ptr.asSlice(OFFSET__scrollbar, LAYOUT__scrollbar));}
    public void scrollbar(java.util.function.Consumer<nuklear.nk_scroll> consumer) {consumer.accept(this.scrollbar());}
    public void scrollbar(nuklear.nk_scroll value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__scrollbar, LAYOUT__scrollbar.byteSize());}

    public nuklear.nk_command_buffer buffer() {return new nuklear.nk_command_buffer(this._ptr.asSlice(OFFSET__buffer, LAYOUT__buffer));}
    public void buffer(java.util.function.Consumer<nuklear.nk_command_buffer> consumer) {consumer.accept(this.buffer());}
    public void buffer(nuklear.nk_command_buffer value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__buffer, LAYOUT__buffer.byteSize());}

    public java.lang.foreign.MemorySegment layout() {return this._ptr.get(LAYOUT__layout, OFFSET__layout);}
    public void layout(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT__layout, OFFSET__layout, value);}
    public java.lang.foreign.MemorySegment $layout() {return this._ptr.asSlice(OFFSET__layout, LAYOUT__layout);}

    public float scrollbar_hiding_timer() {return this._ptr.get(LAYOUT__scrollbar_hiding_timer, OFFSET__scrollbar_hiding_timer);}
    public void scrollbar_hiding_timer(float value) {this._ptr.set(LAYOUT__scrollbar_hiding_timer, OFFSET__scrollbar_hiding_timer, value);}
    public java.lang.foreign.MemorySegment $scrollbar_hiding_timer() {return this._ptr.asSlice(OFFSET__scrollbar_hiding_timer, LAYOUT__scrollbar_hiding_timer);}

    public nuklear.nk_property_state property() {return new nuklear.nk_property_state(this._ptr.asSlice(OFFSET__property, LAYOUT__property));}
    public void property(java.util.function.Consumer<nuklear.nk_property_state> consumer) {consumer.accept(this.property());}
    public void property(nuklear.nk_property_state value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__property, LAYOUT__property.byteSize());}

    public nuklear.nk_popup_state popup() {return new nuklear.nk_popup_state(this._ptr.asSlice(OFFSET__popup, LAYOUT__popup));}
    public void popup(java.util.function.Consumer<nuklear.nk_popup_state> consumer) {consumer.accept(this.popup());}
    public void popup(nuklear.nk_popup_state value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__popup, LAYOUT__popup.byteSize());}

    public nuklear.nk_edit_state edit() {return new nuklear.nk_edit_state(this._ptr.asSlice(OFFSET__edit, LAYOUT__edit));}
    public void edit(java.util.function.Consumer<nuklear.nk_edit_state> consumer) {consumer.accept(this.edit());}
    public void edit(nuklear.nk_edit_state value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__edit, LAYOUT__edit.byteSize());}

    public int scrolled() {return this._ptr.get(LAYOUT__scrolled, OFFSET__scrolled);}
    public void scrolled(int value) {this._ptr.set(LAYOUT__scrolled, OFFSET__scrolled, value);}
    public java.lang.foreign.MemorySegment $scrolled() {return this._ptr.asSlice(OFFSET__scrolled, LAYOUT__scrolled);}

    public int widgets_disabled() {return this._ptr.get(LAYOUT__widgets_disabled, OFFSET__widgets_disabled);}
    public void widgets_disabled(int value) {this._ptr.set(LAYOUT__widgets_disabled, OFFSET__widgets_disabled, value);}
    public java.lang.foreign.MemorySegment $widgets_disabled() {return this._ptr.asSlice(OFFSET__widgets_disabled, LAYOUT__widgets_disabled);}

    public java.lang.foreign.MemorySegment tables() {return this._ptr.get(LAYOUT__tables, OFFSET__tables);}
    public void tables(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT__tables, OFFSET__tables, value);}
    public java.lang.foreign.MemorySegment $tables() {return this._ptr.asSlice(OFFSET__tables, LAYOUT__tables);}

    public int table_count() {return this._ptr.get(LAYOUT__table_count, OFFSET__table_count);}
    public void table_count(int value) {this._ptr.set(LAYOUT__table_count, OFFSET__table_count, value);}
    public java.lang.foreign.MemorySegment $table_count() {return this._ptr.asSlice(OFFSET__table_count, LAYOUT__table_count);}

    public java.lang.foreign.MemorySegment next() {return this._ptr.get(LAYOUT__next, OFFSET__next);}
    public void next(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT__next, OFFSET__next, value);}
    public java.lang.foreign.MemorySegment $next() {return this._ptr.asSlice(OFFSET__next, LAYOUT__next);}

    public java.lang.foreign.MemorySegment prev() {return this._ptr.get(LAYOUT__prev, OFFSET__prev);}
    public void prev(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT__prev, OFFSET__prev, value);}
    public java.lang.foreign.MemorySegment $prev() {return this._ptr.asSlice(OFFSET__prev, LAYOUT__prev);}

    public java.lang.foreign.MemorySegment parent() {return this._ptr.get(LAYOUT__parent, OFFSET__parent);}
    public void parent(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT__parent, OFFSET__parent, value);}
    public java.lang.foreign.MemorySegment $parent() {return this._ptr.asSlice(OFFSET__parent, LAYOUT__parent);}
}
