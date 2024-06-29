package nuklear;

public record nk_mouse_button(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__down = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__down = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__clicked = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__clicked = 4;
    public static final java.lang.foreign.StructLayout LAYOUT__clicked_pos = nuklear.nk_vec2.gRecordLayout;
    public static final long OFFSET__clicked_pos = 8;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__down,
            LAYOUT__clicked,
            LAYOUT__clicked_pos
    ).withByteAlignment(4).withName("nk_mouse_button");

    public nk_mouse_button(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static nk_mouse_button getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new nk_mouse_button(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, nk_mouse_button value)
    {
        java.lang.foreign.MemorySegment.copy(value._ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int down() {return this._ptr.get(LAYOUT__down, OFFSET__down);}
    public void down(int value) {this._ptr.set(LAYOUT__down, OFFSET__down, value);}
    public java.lang.foreign.MemorySegment $down() {return this._ptr.asSlice(OFFSET__down, LAYOUT__down);}

    public int clicked() {return this._ptr.get(LAYOUT__clicked, OFFSET__clicked);}
    public void clicked(int value) {this._ptr.set(LAYOUT__clicked, OFFSET__clicked, value);}
    public java.lang.foreign.MemorySegment $clicked() {return this._ptr.asSlice(OFFSET__clicked, LAYOUT__clicked);}

    public nuklear.nk_vec2 clicked_pos() {return new nuklear.nk_vec2(this._ptr.asSlice(OFFSET__clicked_pos, LAYOUT__clicked_pos));}
    public void clicked_pos(java.util.function.Consumer<nuklear.nk_vec2> consumer) {consumer.accept(this.clicked_pos());}
    public void clicked_pos(nuklear.nk_vec2 value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__clicked_pos, LAYOUT__clicked_pos.byteSize());}
}
