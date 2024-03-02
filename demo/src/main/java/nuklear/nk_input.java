package nuklear;

public record nk_input(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.GroupLayout LAYOUT$keyboard = nuklear.nk_keyboard.gStructLayout;
    public static final long OFFSET$keyboard = 0L;
    public static final java.lang.foreign.GroupLayout LAYOUT$mouse = nuklear.nk_mouse.gStructLayout;
    public static final long OFFSET$mouse = 260L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$keyboard,
            LAYOUT$mouse
    ).withName("nk_input");

    public nk_input(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static nk_input getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new nk_input(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public nuklear.nk_keyboard keyboard() {return new nuklear.nk_keyboard(this._ptr.asSlice(OFFSET$keyboard, LAYOUT$keyboard));}
    public void keyboard(java.util.function.Consumer<nuklear.nk_keyboard> consumer) {consumer.accept(this.keyboard());}
    public void keyboard(nuklear.nk_keyboard value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$keyboard, LAYOUT$keyboard.byteSize());}

    public nuklear.nk_mouse mouse() {return new nuklear.nk_mouse(this._ptr.asSlice(OFFSET$mouse, LAYOUT$mouse));}
    public void mouse(java.util.function.Consumer<nuklear.nk_mouse> consumer) {consumer.accept(this.mouse());}
    public void mouse(nuklear.nk_mouse value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$mouse, LAYOUT$mouse.byteSize());}
}
