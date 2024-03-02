package nuklear;

public record nk_config_stack_user_font(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$head = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$head = 0L;
    public static final java.lang.foreign.SequenceLayout LAYOUT$elements = java.lang.foreign.MemoryLayout.sequenceLayout(8, nuklear.nk_config_stack_user_font_element.gStructLayout);
    public static final long OFFSET$elements = 8L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$head,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$elements
    ).withName("nk_config_stack_user_font");

    public nk_config_stack_user_font(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static nk_config_stack_user_font getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new nk_config_stack_user_font(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int head() {return this._ptr.get(LAYOUT$head, OFFSET$head);}
    public void head(int value) {this._ptr.set(LAYOUT$head, OFFSET$head, value);}
    public java.lang.foreign.MemorySegment head_ptr() {return this._ptr.asSlice(OFFSET$head, LAYOUT$head);}

    public java.lang.foreign.MemorySegment elements() {return this._ptr.asSlice(OFFSET$elements, LAYOUT$elements);}
    public nuklear.nk_config_stack_user_font_element elements(int i) {return new nuklear.nk_config_stack_user_font_element(this._ptr.asSlice(OFFSET$elements + i * LAYOUT$elements.byteSize(), LAYOUT$elements));}
    public void elements(int i, java.util.function.Consumer<nuklear.nk_config_stack_user_font_element> consumer) {consumer.accept(this.elements(i));}
    public void elements(int i, nuklear.nk_config_stack_user_font_element value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$elements + i * LAYOUT$elements.byteSize(), LAYOUT$elements.byteSize());}
}
