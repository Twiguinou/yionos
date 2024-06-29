package nuklear;

public record nk_config_stack_user_font(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__head = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__head = 0;
    public static final java.lang.foreign.SequenceLayout LAYOUT__elements = java.lang.foreign.MemoryLayout.sequenceLayout(8, nuklear.nk_config_stack_user_font_element.gRecordLayout);
    public static final long OFFSET__elements = 8;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__head,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__elements
    ).withByteAlignment(8).withName("nk_config_stack_user_font");

    public nk_config_stack_user_font(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static nk_config_stack_user_font getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new nk_config_stack_user_font(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, nk_config_stack_user_font value)
    {
        java.lang.foreign.MemorySegment.copy(value._ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int head() {return this._ptr.get(LAYOUT__head, OFFSET__head);}
    public void head(int value) {this._ptr.set(LAYOUT__head, OFFSET__head, value);}
    public java.lang.foreign.MemorySegment $head() {return this._ptr.asSlice(OFFSET__head, LAYOUT__head);}

    public java.lang.foreign.MemorySegment elements() {return this._ptr.asSlice(OFFSET__elements, LAYOUT__elements);}
    public nuklear.nk_config_stack_user_font_element elements(int index) {return nuklear.nk_config_stack_user_font_element.getAtIndex(this.elements(), index);}
    public void elements(int index, java.util.function.Consumer<nuklear.nk_config_stack_user_font_element> consumer) {consumer.accept(this.elements(index));}
    public void elements(int index, nuklear.nk_config_stack_user_font_element value) {nuklear.nk_config_stack_user_font_element.setAtIndex(this.elements(), index, value);}
}
