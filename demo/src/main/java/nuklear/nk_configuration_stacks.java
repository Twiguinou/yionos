package nuklear;

public record nk_configuration_stacks(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.GroupLayout LAYOUT$style_items = nuklear.nk_config_stack_style_item.gStructLayout;
    public static final long OFFSET$style_items = 0L;
    public static final java.lang.foreign.GroupLayout LAYOUT$floats = nuklear.nk_config_stack_float.gStructLayout;
    public static final long OFFSET$floats = 776L;
    public static final java.lang.foreign.GroupLayout LAYOUT$vectors = nuklear.nk_config_stack_vec2.gStructLayout;
    public static final long OFFSET$vectors = 1296L;
    public static final java.lang.foreign.GroupLayout LAYOUT$flags = nuklear.nk_config_stack_flags.gStructLayout;
    public static final long OFFSET$flags = 1560L;
    public static final java.lang.foreign.GroupLayout LAYOUT$colors = nuklear.nk_config_stack_color.gStructLayout;
    public static final long OFFSET$colors = 2080L;
    public static final java.lang.foreign.GroupLayout LAYOUT$fonts = nuklear.nk_config_stack_user_font.gStructLayout;
    public static final long OFFSET$fonts = 2600L;
    public static final java.lang.foreign.GroupLayout LAYOUT$button_behaviors = nuklear.nk_config_stack_button_behavior.gStructLayout;
    public static final long OFFSET$button_behaviors = 2736L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$style_items,
            LAYOUT$floats,
            LAYOUT$vectors,
            LAYOUT$flags,
            LAYOUT$colors,
            LAYOUT$fonts,
            LAYOUT$button_behaviors
    ).withName("nk_configuration_stacks");

    public nk_configuration_stacks(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static nk_configuration_stacks getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new nk_configuration_stacks(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public nuklear.nk_config_stack_style_item style_items() {return new nuklear.nk_config_stack_style_item(this._ptr.asSlice(OFFSET$style_items, LAYOUT$style_items));}
    public void style_items(java.util.function.Consumer<nuklear.nk_config_stack_style_item> consumer) {consumer.accept(this.style_items());}
    public void style_items(nuklear.nk_config_stack_style_item value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$style_items, LAYOUT$style_items.byteSize());}

    public nuklear.nk_config_stack_float floats() {return new nuklear.nk_config_stack_float(this._ptr.asSlice(OFFSET$floats, LAYOUT$floats));}
    public void floats(java.util.function.Consumer<nuklear.nk_config_stack_float> consumer) {consumer.accept(this.floats());}
    public void floats(nuklear.nk_config_stack_float value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$floats, LAYOUT$floats.byteSize());}

    public nuklear.nk_config_stack_vec2 vectors() {return new nuklear.nk_config_stack_vec2(this._ptr.asSlice(OFFSET$vectors, LAYOUT$vectors));}
    public void vectors(java.util.function.Consumer<nuklear.nk_config_stack_vec2> consumer) {consumer.accept(this.vectors());}
    public void vectors(nuklear.nk_config_stack_vec2 value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$vectors, LAYOUT$vectors.byteSize());}

    public nuklear.nk_config_stack_flags flags() {return new nuklear.nk_config_stack_flags(this._ptr.asSlice(OFFSET$flags, LAYOUT$flags));}
    public void flags(java.util.function.Consumer<nuklear.nk_config_stack_flags> consumer) {consumer.accept(this.flags());}
    public void flags(nuklear.nk_config_stack_flags value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$flags, LAYOUT$flags.byteSize());}

    public nuklear.nk_config_stack_color colors() {return new nuklear.nk_config_stack_color(this._ptr.asSlice(OFFSET$colors, LAYOUT$colors));}
    public void colors(java.util.function.Consumer<nuklear.nk_config_stack_color> consumer) {consumer.accept(this.colors());}
    public void colors(nuklear.nk_config_stack_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$colors, LAYOUT$colors.byteSize());}

    public nuklear.nk_config_stack_user_font fonts() {return new nuklear.nk_config_stack_user_font(this._ptr.asSlice(OFFSET$fonts, LAYOUT$fonts));}
    public void fonts(java.util.function.Consumer<nuklear.nk_config_stack_user_font> consumer) {consumer.accept(this.fonts());}
    public void fonts(nuklear.nk_config_stack_user_font value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$fonts, LAYOUT$fonts.byteSize());}

    public nuklear.nk_config_stack_button_behavior button_behaviors() {return new nuklear.nk_config_stack_button_behavior(this._ptr.asSlice(OFFSET$button_behaviors, LAYOUT$button_behaviors));}
    public void button_behaviors(java.util.function.Consumer<nuklear.nk_config_stack_button_behavior> consumer) {consumer.accept(this.button_behaviors());}
    public void button_behaviors(nuklear.nk_config_stack_button_behavior value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$button_behaviors, LAYOUT$button_behaviors.byteSize());}
}
