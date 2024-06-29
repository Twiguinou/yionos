package nuklear;

public record nk_mouse(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.SequenceLayout LAYOUT__buttons = java.lang.foreign.MemoryLayout.sequenceLayout(4, nuklear.nk_mouse_button.gRecordLayout);
    public static final long OFFSET__buttons = 0;
    public static final java.lang.foreign.StructLayout LAYOUT__pos = nuklear.nk_vec2.gRecordLayout;
    public static final long OFFSET__pos = 64;
    public static final java.lang.foreign.StructLayout LAYOUT__prev = nuklear.nk_vec2.gRecordLayout;
    public static final long OFFSET__prev = 72;
    public static final java.lang.foreign.StructLayout LAYOUT__delta = nuklear.nk_vec2.gRecordLayout;
    public static final long OFFSET__delta = 80;
    public static final java.lang.foreign.StructLayout LAYOUT__scroll_delta = nuklear.nk_vec2.gRecordLayout;
    public static final long OFFSET__scroll_delta = 88;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__grab = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__grab = 96;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__grabbed = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__grabbed = 97;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__ungrab = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__ungrab = 98;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__buttons,
            LAYOUT__pos,
            LAYOUT__prev,
            LAYOUT__delta,
            LAYOUT__scroll_delta,
            LAYOUT__grab,
            LAYOUT__grabbed,
            LAYOUT__ungrab,
            java.lang.foreign.MemoryLayout.paddingLayout(1)
    ).withByteAlignment(4).withName("nk_mouse");

    public nk_mouse(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static nk_mouse getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new nk_mouse(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, nk_mouse value)
    {
        java.lang.foreign.MemorySegment.copy(value._ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public java.lang.foreign.MemorySegment buttons() {return this._ptr.asSlice(OFFSET__buttons, LAYOUT__buttons);}
    public nuklear.nk_mouse_button buttons(int index) {return nuklear.nk_mouse_button.getAtIndex(this.buttons(), index);}
    public void buttons(int index, java.util.function.Consumer<nuklear.nk_mouse_button> consumer) {consumer.accept(this.buttons(index));}
    public void buttons(int index, nuklear.nk_mouse_button value) {nuklear.nk_mouse_button.setAtIndex(this.buttons(), index, value);}

    public nuklear.nk_vec2 pos() {return new nuklear.nk_vec2(this._ptr.asSlice(OFFSET__pos, LAYOUT__pos));}
    public void pos(java.util.function.Consumer<nuklear.nk_vec2> consumer) {consumer.accept(this.pos());}
    public void pos(nuklear.nk_vec2 value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__pos, LAYOUT__pos.byteSize());}

    public nuklear.nk_vec2 prev() {return new nuklear.nk_vec2(this._ptr.asSlice(OFFSET__prev, LAYOUT__prev));}
    public void prev(java.util.function.Consumer<nuklear.nk_vec2> consumer) {consumer.accept(this.prev());}
    public void prev(nuklear.nk_vec2 value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__prev, LAYOUT__prev.byteSize());}

    public nuklear.nk_vec2 delta() {return new nuklear.nk_vec2(this._ptr.asSlice(OFFSET__delta, LAYOUT__delta));}
    public void delta(java.util.function.Consumer<nuklear.nk_vec2> consumer) {consumer.accept(this.delta());}
    public void delta(nuklear.nk_vec2 value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__delta, LAYOUT__delta.byteSize());}

    public nuklear.nk_vec2 scroll_delta() {return new nuklear.nk_vec2(this._ptr.asSlice(OFFSET__scroll_delta, LAYOUT__scroll_delta));}
    public void scroll_delta(java.util.function.Consumer<nuklear.nk_vec2> consumer) {consumer.accept(this.scroll_delta());}
    public void scroll_delta(nuklear.nk_vec2 value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__scroll_delta, LAYOUT__scroll_delta.byteSize());}

    public byte grab() {return this._ptr.get(LAYOUT__grab, OFFSET__grab);}
    public void grab(byte value) {this._ptr.set(LAYOUT__grab, OFFSET__grab, value);}
    public java.lang.foreign.MemorySegment $grab() {return this._ptr.asSlice(OFFSET__grab, LAYOUT__grab);}

    public byte grabbed() {return this._ptr.get(LAYOUT__grabbed, OFFSET__grabbed);}
    public void grabbed(byte value) {this._ptr.set(LAYOUT__grabbed, OFFSET__grabbed, value);}
    public java.lang.foreign.MemorySegment $grabbed() {return this._ptr.asSlice(OFFSET__grabbed, LAYOUT__grabbed);}

    public byte ungrab() {return this._ptr.get(LAYOUT__ungrab, OFFSET__ungrab);}
    public void ungrab(byte value) {this._ptr.set(LAYOUT__ungrab, OFFSET__ungrab, value);}
    public java.lang.foreign.MemorySegment $ungrab() {return this._ptr.asSlice(OFFSET__ungrab, LAYOUT__ungrab);}
}
