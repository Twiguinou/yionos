package nuklear;

public record nk_style(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.AddressLayout LAYOUT__font = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__font = 0;
    public static final java.lang.foreign.SequenceLayout LAYOUT__cursors = java.lang.foreign.MemoryLayout.sequenceLayout(7, jpgen.NativeTypes.UNBOUNDED_POINTER);
    public static final long OFFSET__cursors = 8;
    public static final java.lang.foreign.AddressLayout LAYOUT__cursor_active = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__cursor_active = 64;
    public static final java.lang.foreign.AddressLayout LAYOUT__cursor_last = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__cursor_last = 72;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__cursor_visible = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__cursor_visible = 80;
    public static final java.lang.foreign.StructLayout LAYOUT__text = nuklear.nk_style_text.gRecordLayout;
    public static final long OFFSET__text = 84;
    public static final java.lang.foreign.StructLayout LAYOUT__button = nuklear.nk_style_button.gRecordLayout;
    public static final long OFFSET__button = 104;
    public static final java.lang.foreign.StructLayout LAYOUT__contextual_button = nuklear.nk_style_button.gRecordLayout;
    public static final long OFFSET__contextual_button = 320;
    public static final java.lang.foreign.StructLayout LAYOUT__menu_button = nuklear.nk_style_button.gRecordLayout;
    public static final long OFFSET__menu_button = 536;
    public static final java.lang.foreign.StructLayout LAYOUT__option = nuklear.nk_style_toggle.gRecordLayout;
    public static final long OFFSET__option = 752;
    public static final java.lang.foreign.StructLayout LAYOUT__checkbox = nuklear.nk_style_toggle.gRecordLayout;
    public static final long OFFSET__checkbox = 1040;
    public static final java.lang.foreign.StructLayout LAYOUT__selectable = nuklear.nk_style_selectable.gRecordLayout;
    public static final long OFFSET__selectable = 1328;
    public static final java.lang.foreign.StructLayout LAYOUT__slider = nuklear.nk_style_slider.gRecordLayout;
    public static final long OFFSET__slider = 1664;
    public static final java.lang.foreign.StructLayout LAYOUT__progress = nuklear.nk_style_progress.gRecordLayout;
    public static final long OFFSET__progress = 2440;
    public static final java.lang.foreign.StructLayout LAYOUT__property = nuklear.nk_style_property.gRecordLayout;
    public static final long OFFSET__property = 2752;
    public static final java.lang.foreign.StructLayout LAYOUT__edit = nuklear.nk_style_edit.gRecordLayout;
    public static final long OFFSET__edit = 4344;
    public static final java.lang.foreign.StructLayout LAYOUT__chart = nuklear.nk_style_chart.gRecordLayout;
    public static final long OFFSET__chart = 5312;
    public static final java.lang.foreign.StructLayout LAYOUT__scrollh = nuklear.nk_style_scrollbar.gRecordLayout;
    public static final long OFFSET__scrollh = 5392;
    public static final java.lang.foreign.StructLayout LAYOUT__scrollv = nuklear.nk_style_scrollbar.gRecordLayout;
    public static final long OFFSET__scrollv = 6144;
    public static final java.lang.foreign.StructLayout LAYOUT__tab = nuklear.nk_style_tab.gRecordLayout;
    public static final long OFFSET__tab = 6896;
    public static final java.lang.foreign.StructLayout LAYOUT__combo = nuklear.nk_style_combo.gRecordLayout;
    public static final long OFFSET__combo = 7856;
    public static final java.lang.foreign.StructLayout LAYOUT__window = nuklear.nk_style_window.gRecordLayout;
    public static final long OFFSET__window = 8280;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__font,
            LAYOUT__cursors,
            LAYOUT__cursor_active,
            LAYOUT__cursor_last,
            LAYOUT__cursor_visible,
            LAYOUT__text,
            LAYOUT__button,
            LAYOUT__contextual_button,
            LAYOUT__menu_button,
            LAYOUT__option,
            LAYOUT__checkbox,
            LAYOUT__selectable,
            LAYOUT__slider,
            LAYOUT__progress,
            LAYOUT__property,
            LAYOUT__edit,
            LAYOUT__chart,
            LAYOUT__scrollh,
            LAYOUT__scrollv,
            LAYOUT__tab,
            LAYOUT__combo,
            LAYOUT__window
    ).withByteAlignment(8).withName("nk_style");

    public nk_style(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static nk_style getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new nk_style(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, nk_style value)
    {
        java.lang.foreign.MemorySegment.copy(value._ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public java.lang.foreign.MemorySegment font() {return this._ptr.get(LAYOUT__font, OFFSET__font);}
    public void font(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT__font, OFFSET__font, value);}
    public java.lang.foreign.MemorySegment $font() {return this._ptr.asSlice(OFFSET__font, LAYOUT__font);}

    public java.lang.foreign.MemorySegment cursors() {return this._ptr.asSlice(OFFSET__cursors, LAYOUT__cursors);}
    public java.lang.foreign.MemorySegment cursors(int index) {return this.cursors().getAtIndex(jpgen.NativeTypes.UNBOUNDED_POINTER, index);}
    public void cursors(int index, java.lang.foreign.MemorySegment value) {this.cursors().setAtIndex(jpgen.NativeTypes.UNBOUNDED_POINTER, index, value);}

    public java.lang.foreign.MemorySegment cursor_active() {return this._ptr.get(LAYOUT__cursor_active, OFFSET__cursor_active);}
    public void cursor_active(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT__cursor_active, OFFSET__cursor_active, value);}
    public java.lang.foreign.MemorySegment $cursor_active() {return this._ptr.asSlice(OFFSET__cursor_active, LAYOUT__cursor_active);}

    public java.lang.foreign.MemorySegment cursor_last() {return this._ptr.get(LAYOUT__cursor_last, OFFSET__cursor_last);}
    public void cursor_last(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT__cursor_last, OFFSET__cursor_last, value);}
    public java.lang.foreign.MemorySegment $cursor_last() {return this._ptr.asSlice(OFFSET__cursor_last, LAYOUT__cursor_last);}

    public int cursor_visible() {return this._ptr.get(LAYOUT__cursor_visible, OFFSET__cursor_visible);}
    public void cursor_visible(int value) {this._ptr.set(LAYOUT__cursor_visible, OFFSET__cursor_visible, value);}
    public java.lang.foreign.MemorySegment $cursor_visible() {return this._ptr.asSlice(OFFSET__cursor_visible, LAYOUT__cursor_visible);}

    public nuklear.nk_style_text text() {return new nuklear.nk_style_text(this._ptr.asSlice(OFFSET__text, LAYOUT__text));}
    public void text(java.util.function.Consumer<nuklear.nk_style_text> consumer) {consumer.accept(this.text());}
    public void text(nuklear.nk_style_text value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__text, LAYOUT__text.byteSize());}

    public nuklear.nk_style_button button() {return new nuklear.nk_style_button(this._ptr.asSlice(OFFSET__button, LAYOUT__button));}
    public void button(java.util.function.Consumer<nuklear.nk_style_button> consumer) {consumer.accept(this.button());}
    public void button(nuklear.nk_style_button value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__button, LAYOUT__button.byteSize());}

    public nuklear.nk_style_button contextual_button() {return new nuklear.nk_style_button(this._ptr.asSlice(OFFSET__contextual_button, LAYOUT__contextual_button));}
    public void contextual_button(java.util.function.Consumer<nuklear.nk_style_button> consumer) {consumer.accept(this.contextual_button());}
    public void contextual_button(nuklear.nk_style_button value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__contextual_button, LAYOUT__contextual_button.byteSize());}

    public nuklear.nk_style_button menu_button() {return new nuklear.nk_style_button(this._ptr.asSlice(OFFSET__menu_button, LAYOUT__menu_button));}
    public void menu_button(java.util.function.Consumer<nuklear.nk_style_button> consumer) {consumer.accept(this.menu_button());}
    public void menu_button(nuklear.nk_style_button value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__menu_button, LAYOUT__menu_button.byteSize());}

    public nuklear.nk_style_toggle option() {return new nuklear.nk_style_toggle(this._ptr.asSlice(OFFSET__option, LAYOUT__option));}
    public void option(java.util.function.Consumer<nuklear.nk_style_toggle> consumer) {consumer.accept(this.option());}
    public void option(nuklear.nk_style_toggle value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__option, LAYOUT__option.byteSize());}

    public nuklear.nk_style_toggle checkbox() {return new nuklear.nk_style_toggle(this._ptr.asSlice(OFFSET__checkbox, LAYOUT__checkbox));}
    public void checkbox(java.util.function.Consumer<nuklear.nk_style_toggle> consumer) {consumer.accept(this.checkbox());}
    public void checkbox(nuklear.nk_style_toggle value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__checkbox, LAYOUT__checkbox.byteSize());}

    public nuklear.nk_style_selectable selectable() {return new nuklear.nk_style_selectable(this._ptr.asSlice(OFFSET__selectable, LAYOUT__selectable));}
    public void selectable(java.util.function.Consumer<nuklear.nk_style_selectable> consumer) {consumer.accept(this.selectable());}
    public void selectable(nuklear.nk_style_selectable value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__selectable, LAYOUT__selectable.byteSize());}

    public nuklear.nk_style_slider slider() {return new nuklear.nk_style_slider(this._ptr.asSlice(OFFSET__slider, LAYOUT__slider));}
    public void slider(java.util.function.Consumer<nuklear.nk_style_slider> consumer) {consumer.accept(this.slider());}
    public void slider(nuklear.nk_style_slider value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__slider, LAYOUT__slider.byteSize());}

    public nuklear.nk_style_progress progress() {return new nuklear.nk_style_progress(this._ptr.asSlice(OFFSET__progress, LAYOUT__progress));}
    public void progress(java.util.function.Consumer<nuklear.nk_style_progress> consumer) {consumer.accept(this.progress());}
    public void progress(nuklear.nk_style_progress value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__progress, LAYOUT__progress.byteSize());}

    public nuklear.nk_style_property property() {return new nuklear.nk_style_property(this._ptr.asSlice(OFFSET__property, LAYOUT__property));}
    public void property(java.util.function.Consumer<nuklear.nk_style_property> consumer) {consumer.accept(this.property());}
    public void property(nuklear.nk_style_property value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__property, LAYOUT__property.byteSize());}

    public nuklear.nk_style_edit edit() {return new nuklear.nk_style_edit(this._ptr.asSlice(OFFSET__edit, LAYOUT__edit));}
    public void edit(java.util.function.Consumer<nuklear.nk_style_edit> consumer) {consumer.accept(this.edit());}
    public void edit(nuklear.nk_style_edit value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__edit, LAYOUT__edit.byteSize());}

    public nuklear.nk_style_chart chart() {return new nuklear.nk_style_chart(this._ptr.asSlice(OFFSET__chart, LAYOUT__chart));}
    public void chart(java.util.function.Consumer<nuklear.nk_style_chart> consumer) {consumer.accept(this.chart());}
    public void chart(nuklear.nk_style_chart value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__chart, LAYOUT__chart.byteSize());}

    public nuklear.nk_style_scrollbar scrollh() {return new nuklear.nk_style_scrollbar(this._ptr.asSlice(OFFSET__scrollh, LAYOUT__scrollh));}
    public void scrollh(java.util.function.Consumer<nuklear.nk_style_scrollbar> consumer) {consumer.accept(this.scrollh());}
    public void scrollh(nuklear.nk_style_scrollbar value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__scrollh, LAYOUT__scrollh.byteSize());}

    public nuklear.nk_style_scrollbar scrollv() {return new nuklear.nk_style_scrollbar(this._ptr.asSlice(OFFSET__scrollv, LAYOUT__scrollv));}
    public void scrollv(java.util.function.Consumer<nuklear.nk_style_scrollbar> consumer) {consumer.accept(this.scrollv());}
    public void scrollv(nuklear.nk_style_scrollbar value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__scrollv, LAYOUT__scrollv.byteSize());}

    public nuklear.nk_style_tab tab() {return new nuklear.nk_style_tab(this._ptr.asSlice(OFFSET__tab, LAYOUT__tab));}
    public void tab(java.util.function.Consumer<nuklear.nk_style_tab> consumer) {consumer.accept(this.tab());}
    public void tab(nuklear.nk_style_tab value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__tab, LAYOUT__tab.byteSize());}

    public nuklear.nk_style_combo combo() {return new nuklear.nk_style_combo(this._ptr.asSlice(OFFSET__combo, LAYOUT__combo));}
    public void combo(java.util.function.Consumer<nuklear.nk_style_combo> consumer) {consumer.accept(this.combo());}
    public void combo(nuklear.nk_style_combo value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__combo, LAYOUT__combo.byteSize());}

    public nuklear.nk_style_window window() {return new nuklear.nk_style_window(this._ptr.asSlice(OFFSET__window, LAYOUT__window));}
    public void window(java.util.function.Consumer<nuklear.nk_style_window> consumer) {consumer.accept(this.window());}
    public void window(nuklear.nk_style_window value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__window, LAYOUT__window.byteSize());}
}
