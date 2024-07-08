package nuklear;

public record nk_input(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT__keyboard = nuklear.nk_keyboard.gRecordLayout.withName("keyboard");
    public static final long OFFSET__keyboard = 0;
    public static final java.lang.foreign.StructLayout LAYOUT__mouse = nuklear.nk_mouse.gRecordLayout.withName("mouse");
    public static final long OFFSET__mouse = 260;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__keyboard,
            LAYOUT__mouse
    ).withByteAlignment(4).withName("nk_input");

    public nk_input(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static nk_input getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new nk_input(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, nk_input value)
    {
        java.lang.foreign.MemorySegment.copy(value._ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public nuklear.nk_keyboard keyboard() {return new nuklear.nk_keyboard(this._ptr.asSlice(OFFSET__keyboard, LAYOUT__keyboard));}
    public void keyboard(java.util.function.Consumer<nuklear.nk_keyboard> consumer) {consumer.accept(this.keyboard());}
    public void keyboard(nuklear.nk_keyboard value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__keyboard, LAYOUT__keyboard.byteSize());}

    public nuklear.nk_mouse mouse() {return new nuklear.nk_mouse(this._ptr.asSlice(OFFSET__mouse, LAYOUT__mouse));}
    public void mouse(java.util.function.Consumer<nuklear.nk_mouse> consumer) {consumer.accept(this.mouse());}
    public void mouse(nuklear.nk_mouse value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__mouse, LAYOUT__mouse.byteSize());}
}
