package nuklear;

public record nk_configuration_stacks(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT__style_items = nuklear.nk_config_stack_style_item.gRecordLayout;
    public static final long OFFSET__style_items = 0;
    public static final java.lang.foreign.StructLayout LAYOUT__floats = nuklear.nk_config_stack_float.gRecordLayout;
    public static final long OFFSET__floats = 776;
    public static final java.lang.foreign.StructLayout LAYOUT__vectors = nuklear.nk_config_stack_vec2.gRecordLayout;
    public static final long OFFSET__vectors = 1296;
    public static final java.lang.foreign.StructLayout LAYOUT__flags = nuklear.nk_config_stack_flags.gRecordLayout;
    public static final long OFFSET__flags = 1560;
    public static final java.lang.foreign.StructLayout LAYOUT__colors = nuklear.nk_config_stack_color.gRecordLayout;
    public static final long OFFSET__colors = 2080;
    public static final java.lang.foreign.StructLayout LAYOUT__fonts = nuklear.nk_config_stack_user_font.gRecordLayout;
    public static final long OFFSET__fonts = 2600;
    public static final java.lang.foreign.StructLayout LAYOUT__button_behaviors = nuklear.nk_config_stack_button_behavior.gRecordLayout;
    public static final long OFFSET__button_behaviors = 2736;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__style_items,
            LAYOUT__floats,
            LAYOUT__vectors,
            LAYOUT__flags,
            LAYOUT__colors,
            LAYOUT__fonts,
            LAYOUT__button_behaviors
    ).withByteAlignment(8).withName("nk_configuration_stacks");

    public nk_configuration_stacks(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static nk_configuration_stacks getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new nk_configuration_stacks(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, nk_configuration_stacks value)
    {
        java.lang.foreign.MemorySegment.copy(value._ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public nuklear.nk_config_stack_style_item style_items() {return new nuklear.nk_config_stack_style_item(this._ptr.asSlice(OFFSET__style_items, LAYOUT__style_items));}
    public void style_items(java.util.function.Consumer<nuklear.nk_config_stack_style_item> consumer) {consumer.accept(this.style_items());}
    public void style_items(nuklear.nk_config_stack_style_item value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__style_items, LAYOUT__style_items.byteSize());}

    public nuklear.nk_config_stack_float floats() {return new nuklear.nk_config_stack_float(this._ptr.asSlice(OFFSET__floats, LAYOUT__floats));}
    public void floats(java.util.function.Consumer<nuklear.nk_config_stack_float> consumer) {consumer.accept(this.floats());}
    public void floats(nuklear.nk_config_stack_float value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__floats, LAYOUT__floats.byteSize());}

    public nuklear.nk_config_stack_vec2 vectors() {return new nuklear.nk_config_stack_vec2(this._ptr.asSlice(OFFSET__vectors, LAYOUT__vectors));}
    public void vectors(java.util.function.Consumer<nuklear.nk_config_stack_vec2> consumer) {consumer.accept(this.vectors());}
    public void vectors(nuklear.nk_config_stack_vec2 value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__vectors, LAYOUT__vectors.byteSize());}

    public nuklear.nk_config_stack_flags flags() {return new nuklear.nk_config_stack_flags(this._ptr.asSlice(OFFSET__flags, LAYOUT__flags));}
    public void flags(java.util.function.Consumer<nuklear.nk_config_stack_flags> consumer) {consumer.accept(this.flags());}
    public void flags(nuklear.nk_config_stack_flags value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__flags, LAYOUT__flags.byteSize());}

    public nuklear.nk_config_stack_color colors() {return new nuklear.nk_config_stack_color(this._ptr.asSlice(OFFSET__colors, LAYOUT__colors));}
    public void colors(java.util.function.Consumer<nuklear.nk_config_stack_color> consumer) {consumer.accept(this.colors());}
    public void colors(nuklear.nk_config_stack_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__colors, LAYOUT__colors.byteSize());}

    public nuklear.nk_config_stack_user_font fonts() {return new nuklear.nk_config_stack_user_font(this._ptr.asSlice(OFFSET__fonts, LAYOUT__fonts));}
    public void fonts(java.util.function.Consumer<nuklear.nk_config_stack_user_font> consumer) {consumer.accept(this.fonts());}
    public void fonts(nuklear.nk_config_stack_user_font value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__fonts, LAYOUT__fonts.byteSize());}

    public nuklear.nk_config_stack_button_behavior button_behaviors() {return new nuklear.nk_config_stack_button_behavior(this._ptr.asSlice(OFFSET__button_behaviors, LAYOUT__button_behaviors));}
    public void button_behaviors(java.util.function.Consumer<nuklear.nk_config_stack_button_behavior> consumer) {consumer.accept(this.button_behaviors());}
    public void button_behaviors(nuklear.nk_config_stack_button_behavior value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__button_behaviors, LAYOUT__button_behaviors.byteSize());}
}
