package nuklear;

public record nk_mouse(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.SequenceLayout LAYOUT$buttons = java.lang.foreign.MemoryLayout.sequenceLayout(4, nuklear.nk_mouse_button.gStructLayout);
    public static final long OFFSET$buttons = 0L;
    public static final java.lang.foreign.GroupLayout LAYOUT$pos = nuklear.nk_vec2.gStructLayout;
    public static final long OFFSET$pos = 64L;
    public static final java.lang.foreign.GroupLayout LAYOUT$prev = nuklear.nk_vec2.gStructLayout;
    public static final long OFFSET$prev = 72L;
    public static final java.lang.foreign.GroupLayout LAYOUT$delta = nuklear.nk_vec2.gStructLayout;
    public static final long OFFSET$delta = 80L;
    public static final java.lang.foreign.GroupLayout LAYOUT$scroll_delta = nuklear.nk_vec2.gStructLayout;
    public static final long OFFSET$scroll_delta = 88L;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$grab = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET$grab = 96L;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$grabbed = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET$grabbed = 97L;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$ungrab = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET$ungrab = 98L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$buttons,
            LAYOUT$pos,
            LAYOUT$prev,
            LAYOUT$delta,
            LAYOUT$scroll_delta,
            LAYOUT$grab,
            LAYOUT$grabbed,
            LAYOUT$ungrab,
            java.lang.foreign.MemoryLayout.paddingLayout(1)
    ).withName("nk_mouse");

    public nk_mouse(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static nk_mouse getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new nk_mouse(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public java.lang.foreign.MemorySegment buttons() {return this._ptr.asSlice(OFFSET$buttons, LAYOUT$buttons);}
    public nuklear.nk_mouse_button buttons(int i) {return new nuklear.nk_mouse_button(this._ptr.asSlice(OFFSET$buttons + i * LAYOUT$buttons.byteSize(), LAYOUT$buttons));}
    public void buttons(int i, java.util.function.Consumer<nuklear.nk_mouse_button> consumer) {consumer.accept(this.buttons(i));}
    public void buttons(int i, nuklear.nk_mouse_button value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$buttons + i * LAYOUT$buttons.byteSize(), LAYOUT$buttons.byteSize());}

    public nuklear.nk_vec2 pos() {return new nuklear.nk_vec2(this._ptr.asSlice(OFFSET$pos, LAYOUT$pos));}
    public void pos(java.util.function.Consumer<nuklear.nk_vec2> consumer) {consumer.accept(this.pos());}
    public void pos(nuklear.nk_vec2 value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$pos, LAYOUT$pos.byteSize());}

    public nuklear.nk_vec2 prev() {return new nuklear.nk_vec2(this._ptr.asSlice(OFFSET$prev, LAYOUT$prev));}
    public void prev(java.util.function.Consumer<nuklear.nk_vec2> consumer) {consumer.accept(this.prev());}
    public void prev(nuklear.nk_vec2 value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$prev, LAYOUT$prev.byteSize());}

    public nuklear.nk_vec2 delta() {return new nuklear.nk_vec2(this._ptr.asSlice(OFFSET$delta, LAYOUT$delta));}
    public void delta(java.util.function.Consumer<nuklear.nk_vec2> consumer) {consumer.accept(this.delta());}
    public void delta(nuklear.nk_vec2 value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$delta, LAYOUT$delta.byteSize());}

    public nuklear.nk_vec2 scroll_delta() {return new nuklear.nk_vec2(this._ptr.asSlice(OFFSET$scroll_delta, LAYOUT$scroll_delta));}
    public void scroll_delta(java.util.function.Consumer<nuklear.nk_vec2> consumer) {consumer.accept(this.scroll_delta());}
    public void scroll_delta(nuklear.nk_vec2 value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$scroll_delta, LAYOUT$scroll_delta.byteSize());}

    public char grab() {return (char)this._ptr.get(LAYOUT$grab, OFFSET$grab);}
    public void grab(char value) {this._ptr.set(LAYOUT$grab, OFFSET$grab, (byte)value);}
    public java.lang.foreign.MemorySegment grab_ptr() {return this._ptr.asSlice(OFFSET$grab, LAYOUT$grab);}

    public char grabbed() {return (char)this._ptr.get(LAYOUT$grabbed, OFFSET$grabbed);}
    public void grabbed(char value) {this._ptr.set(LAYOUT$grabbed, OFFSET$grabbed, (byte)value);}
    public java.lang.foreign.MemorySegment grabbed_ptr() {return this._ptr.asSlice(OFFSET$grabbed, LAYOUT$grabbed);}

    public char ungrab() {return (char)this._ptr.get(LAYOUT$ungrab, OFFSET$ungrab);}
    public void ungrab(char value) {this._ptr.set(LAYOUT$ungrab, OFFSET$ungrab, (byte)value);}
    public java.lang.foreign.MemorySegment ungrab_ptr() {return this._ptr.asSlice(OFFSET$ungrab, LAYOUT$ungrab);}
}
