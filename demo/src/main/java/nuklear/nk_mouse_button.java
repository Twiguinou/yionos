package nuklear;

public record nk_mouse_button(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$down = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$down = 0L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$clicked = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$clicked = 4L;
    public static final java.lang.foreign.GroupLayout LAYOUT$clicked_pos = nuklear.nk_vec2.gStructLayout;
    public static final long OFFSET$clicked_pos = 8L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$down,
            LAYOUT$clicked,
            LAYOUT$clicked_pos
    ).withName("nk_mouse_button");

    public nk_mouse_button(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static nk_mouse_button getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new nk_mouse_button(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int down() {return this._ptr.get(LAYOUT$down, OFFSET$down);}
    public void down(int value) {this._ptr.set(LAYOUT$down, OFFSET$down, value);}
    public java.lang.foreign.MemorySegment down_ptr() {return this._ptr.asSlice(OFFSET$down, LAYOUT$down);}

    public int clicked() {return this._ptr.get(LAYOUT$clicked, OFFSET$clicked);}
    public void clicked(int value) {this._ptr.set(LAYOUT$clicked, OFFSET$clicked, value);}
    public java.lang.foreign.MemorySegment clicked_ptr() {return this._ptr.asSlice(OFFSET$clicked, LAYOUT$clicked);}

    public nuklear.nk_vec2 clicked_pos() {return new nuklear.nk_vec2(this._ptr.asSlice(OFFSET$clicked_pos, LAYOUT$clicked_pos));}
    public void clicked_pos(java.util.function.Consumer<nuklear.nk_vec2> consumer) {consumer.accept(this.clicked_pos());}
    public void clicked_pos(nuklear.nk_vec2 value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$clicked_pos, LAYOUT$clicked_pos.byteSize());}
}
