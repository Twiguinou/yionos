package nuklear;

public record nk_style(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.AddressLayout LAYOUT$font = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$font = 0L;
    public static final java.lang.foreign.SequenceLayout LAYOUT$cursors = java.lang.foreign.MemoryLayout.sequenceLayout(7, java.lang.foreign.ValueLayout.ADDRESS);
    public static final long OFFSET$cursors = 8L;
    public static final java.lang.foreign.AddressLayout LAYOUT$cursor_active = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$cursor_active = 64L;
    public static final java.lang.foreign.AddressLayout LAYOUT$cursor_last = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$cursor_last = 72L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$cursor_visible = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$cursor_visible = 80L;
    public static final java.lang.foreign.GroupLayout LAYOUT$text = nuklear.nk_style_text.gStructLayout;
    public static final long OFFSET$text = 84L;
    public static final java.lang.foreign.GroupLayout LAYOUT$button = nuklear.nk_style_button.gStructLayout;
    public static final long OFFSET$button = 104L;
    public static final java.lang.foreign.GroupLayout LAYOUT$contextual_button = nuklear.nk_style_button.gStructLayout;
    public static final long OFFSET$contextual_button = 320L;
    public static final java.lang.foreign.GroupLayout LAYOUT$menu_button = nuklear.nk_style_button.gStructLayout;
    public static final long OFFSET$menu_button = 536L;
    public static final java.lang.foreign.GroupLayout LAYOUT$option = nuklear.nk_style_toggle.gStructLayout;
    public static final long OFFSET$option = 752L;
    public static final java.lang.foreign.GroupLayout LAYOUT$checkbox = nuklear.nk_style_toggle.gStructLayout;
    public static final long OFFSET$checkbox = 1040L;
    public static final java.lang.foreign.GroupLayout LAYOUT$selectable = nuklear.nk_style_selectable.gStructLayout;
    public static final long OFFSET$selectable = 1328L;
    public static final java.lang.foreign.GroupLayout LAYOUT$slider = nuklear.nk_style_slider.gStructLayout;
    public static final long OFFSET$slider = 1664L;
    public static final java.lang.foreign.GroupLayout LAYOUT$progress = nuklear.nk_style_progress.gStructLayout;
    public static final long OFFSET$progress = 2440L;
    public static final java.lang.foreign.GroupLayout LAYOUT$property = nuklear.nk_style_property.gStructLayout;
    public static final long OFFSET$property = 2752L;
    public static final java.lang.foreign.GroupLayout LAYOUT$edit = nuklear.nk_style_edit.gStructLayout;
    public static final long OFFSET$edit = 4344L;
    public static final java.lang.foreign.GroupLayout LAYOUT$chart = nuklear.nk_style_chart.gStructLayout;
    public static final long OFFSET$chart = 5312L;
    public static final java.lang.foreign.GroupLayout LAYOUT$scrollh = nuklear.nk_style_scrollbar.gStructLayout;
    public static final long OFFSET$scrollh = 5392L;
    public static final java.lang.foreign.GroupLayout LAYOUT$scrollv = nuklear.nk_style_scrollbar.gStructLayout;
    public static final long OFFSET$scrollv = 6144L;
    public static final java.lang.foreign.GroupLayout LAYOUT$tab = nuklear.nk_style_tab.gStructLayout;
    public static final long OFFSET$tab = 6896L;
    public static final java.lang.foreign.GroupLayout LAYOUT$combo = nuklear.nk_style_combo.gStructLayout;
    public static final long OFFSET$combo = 7856L;
    public static final java.lang.foreign.GroupLayout LAYOUT$window = nuklear.nk_style_window.gStructLayout;
    public static final long OFFSET$window = 8280L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$font,
            LAYOUT$cursors,
            LAYOUT$cursor_active,
            LAYOUT$cursor_last,
            LAYOUT$cursor_visible,
            LAYOUT$text,
            LAYOUT$button,
            LAYOUT$contextual_button,
            LAYOUT$menu_button,
            LAYOUT$option,
            LAYOUT$checkbox,
            LAYOUT$selectable,
            LAYOUT$slider,
            LAYOUT$progress,
            LAYOUT$property,
            LAYOUT$edit,
            LAYOUT$chart,
            LAYOUT$scrollh,
            LAYOUT$scrollv,
            LAYOUT$tab,
            LAYOUT$combo,
            LAYOUT$window
    ).withName("nk_style");

    public nk_style(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static nk_style getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new nk_style(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public java.lang.foreign.MemorySegment font() {return this._ptr.get(LAYOUT$font, OFFSET$font);}
    public void font(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT$font, OFFSET$font, value);}
    public java.lang.foreign.MemorySegment font_ptr() {return this._ptr.asSlice(OFFSET$font, LAYOUT$font);}

    public java.lang.foreign.MemorySegment cursors() {return this._ptr.asSlice(OFFSET$cursors, LAYOUT$cursors);}
    public java.lang.foreign.MemorySegment cursors(int i) {return this.cursors().getAtIndex(java.lang.foreign.ValueLayout.ADDRESS, i);}
    public void cursors(int i, java.lang.foreign.MemorySegment value) {this.cursors().setAtIndex(java.lang.foreign.ValueLayout.ADDRESS, i, value);}

    public java.lang.foreign.MemorySegment cursor_active() {return this._ptr.get(LAYOUT$cursor_active, OFFSET$cursor_active);}
    public void cursor_active(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT$cursor_active, OFFSET$cursor_active, value);}
    public java.lang.foreign.MemorySegment cursor_active_ptr() {return this._ptr.asSlice(OFFSET$cursor_active, LAYOUT$cursor_active);}

    public java.lang.foreign.MemorySegment cursor_last() {return this._ptr.get(LAYOUT$cursor_last, OFFSET$cursor_last);}
    public void cursor_last(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT$cursor_last, OFFSET$cursor_last, value);}
    public java.lang.foreign.MemorySegment cursor_last_ptr() {return this._ptr.asSlice(OFFSET$cursor_last, LAYOUT$cursor_last);}

    public int cursor_visible() {return this._ptr.get(LAYOUT$cursor_visible, OFFSET$cursor_visible);}
    public void cursor_visible(int value) {this._ptr.set(LAYOUT$cursor_visible, OFFSET$cursor_visible, value);}
    public java.lang.foreign.MemorySegment cursor_visible_ptr() {return this._ptr.asSlice(OFFSET$cursor_visible, LAYOUT$cursor_visible);}

    public nuklear.nk_style_text text() {return new nuklear.nk_style_text(this._ptr.asSlice(OFFSET$text, LAYOUT$text));}
    public void text(java.util.function.Consumer<nuklear.nk_style_text> consumer) {consumer.accept(this.text());}
    public void text(nuklear.nk_style_text value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$text, LAYOUT$text.byteSize());}

    public nuklear.nk_style_button button() {return new nuklear.nk_style_button(this._ptr.asSlice(OFFSET$button, LAYOUT$button));}
    public void button(java.util.function.Consumer<nuklear.nk_style_button> consumer) {consumer.accept(this.button());}
    public void button(nuklear.nk_style_button value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$button, LAYOUT$button.byteSize());}

    public nuklear.nk_style_button contextual_button() {return new nuklear.nk_style_button(this._ptr.asSlice(OFFSET$contextual_button, LAYOUT$contextual_button));}
    public void contextual_button(java.util.function.Consumer<nuklear.nk_style_button> consumer) {consumer.accept(this.contextual_button());}
    public void contextual_button(nuklear.nk_style_button value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$contextual_button, LAYOUT$contextual_button.byteSize());}

    public nuklear.nk_style_button menu_button() {return new nuklear.nk_style_button(this._ptr.asSlice(OFFSET$menu_button, LAYOUT$menu_button));}
    public void menu_button(java.util.function.Consumer<nuklear.nk_style_button> consumer) {consumer.accept(this.menu_button());}
    public void menu_button(nuklear.nk_style_button value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$menu_button, LAYOUT$menu_button.byteSize());}

    public nuklear.nk_style_toggle option() {return new nuklear.nk_style_toggle(this._ptr.asSlice(OFFSET$option, LAYOUT$option));}
    public void option(java.util.function.Consumer<nuklear.nk_style_toggle> consumer) {consumer.accept(this.option());}
    public void option(nuklear.nk_style_toggle value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$option, LAYOUT$option.byteSize());}

    public nuklear.nk_style_toggle checkbox() {return new nuklear.nk_style_toggle(this._ptr.asSlice(OFFSET$checkbox, LAYOUT$checkbox));}
    public void checkbox(java.util.function.Consumer<nuklear.nk_style_toggle> consumer) {consumer.accept(this.checkbox());}
    public void checkbox(nuklear.nk_style_toggle value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$checkbox, LAYOUT$checkbox.byteSize());}

    public nuklear.nk_style_selectable selectable() {return new nuklear.nk_style_selectable(this._ptr.asSlice(OFFSET$selectable, LAYOUT$selectable));}
    public void selectable(java.util.function.Consumer<nuklear.nk_style_selectable> consumer) {consumer.accept(this.selectable());}
    public void selectable(nuklear.nk_style_selectable value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$selectable, LAYOUT$selectable.byteSize());}

    public nuklear.nk_style_slider slider() {return new nuklear.nk_style_slider(this._ptr.asSlice(OFFSET$slider, LAYOUT$slider));}
    public void slider(java.util.function.Consumer<nuklear.nk_style_slider> consumer) {consumer.accept(this.slider());}
    public void slider(nuklear.nk_style_slider value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$slider, LAYOUT$slider.byteSize());}

    public nuklear.nk_style_progress progress() {return new nuklear.nk_style_progress(this._ptr.asSlice(OFFSET$progress, LAYOUT$progress));}
    public void progress(java.util.function.Consumer<nuklear.nk_style_progress> consumer) {consumer.accept(this.progress());}
    public void progress(nuklear.nk_style_progress value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$progress, LAYOUT$progress.byteSize());}

    public nuklear.nk_style_property property() {return new nuklear.nk_style_property(this._ptr.asSlice(OFFSET$property, LAYOUT$property));}
    public void property(java.util.function.Consumer<nuklear.nk_style_property> consumer) {consumer.accept(this.property());}
    public void property(nuklear.nk_style_property value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$property, LAYOUT$property.byteSize());}

    public nuklear.nk_style_edit edit() {return new nuklear.nk_style_edit(this._ptr.asSlice(OFFSET$edit, LAYOUT$edit));}
    public void edit(java.util.function.Consumer<nuklear.nk_style_edit> consumer) {consumer.accept(this.edit());}
    public void edit(nuklear.nk_style_edit value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$edit, LAYOUT$edit.byteSize());}

    public nuklear.nk_style_chart chart() {return new nuklear.nk_style_chart(this._ptr.asSlice(OFFSET$chart, LAYOUT$chart));}
    public void chart(java.util.function.Consumer<nuklear.nk_style_chart> consumer) {consumer.accept(this.chart());}
    public void chart(nuklear.nk_style_chart value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$chart, LAYOUT$chart.byteSize());}

    public nuklear.nk_style_scrollbar scrollh() {return new nuklear.nk_style_scrollbar(this._ptr.asSlice(OFFSET$scrollh, LAYOUT$scrollh));}
    public void scrollh(java.util.function.Consumer<nuklear.nk_style_scrollbar> consumer) {consumer.accept(this.scrollh());}
    public void scrollh(nuklear.nk_style_scrollbar value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$scrollh, LAYOUT$scrollh.byteSize());}

    public nuklear.nk_style_scrollbar scrollv() {return new nuklear.nk_style_scrollbar(this._ptr.asSlice(OFFSET$scrollv, LAYOUT$scrollv));}
    public void scrollv(java.util.function.Consumer<nuklear.nk_style_scrollbar> consumer) {consumer.accept(this.scrollv());}
    public void scrollv(nuklear.nk_style_scrollbar value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$scrollv, LAYOUT$scrollv.byteSize());}

    public nuklear.nk_style_tab tab() {return new nuklear.nk_style_tab(this._ptr.asSlice(OFFSET$tab, LAYOUT$tab));}
    public void tab(java.util.function.Consumer<nuklear.nk_style_tab> consumer) {consumer.accept(this.tab());}
    public void tab(nuklear.nk_style_tab value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$tab, LAYOUT$tab.byteSize());}

    public nuklear.nk_style_combo combo() {return new nuklear.nk_style_combo(this._ptr.asSlice(OFFSET$combo, LAYOUT$combo));}
    public void combo(java.util.function.Consumer<nuklear.nk_style_combo> consumer) {consumer.accept(this.combo());}
    public void combo(nuklear.nk_style_combo value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$combo, LAYOUT$combo.byteSize());}

    public nuklear.nk_style_window window() {return new nuklear.nk_style_window(this._ptr.asSlice(OFFSET$window, LAYOUT$window));}
    public void window(java.util.function.Consumer<nuklear.nk_style_window> consumer) {consumer.accept(this.window());}
    public void window(nuklear.nk_style_window value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$window, LAYOUT$window.byteSize());}
}
