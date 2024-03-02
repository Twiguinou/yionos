package nuklear;

public record nk_popup_state(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.AddressLayout LAYOUT$win = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$win = 0L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$type = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$type = 8L;
    public static final java.lang.foreign.GroupLayout LAYOUT$buf = nuklear.nk_popup_buffer.gStructLayout;
    public static final long OFFSET$buf = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$name = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$name = 56L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$active = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$active = 60L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$combo_count = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$combo_count = 64L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$con_count = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$con_count = 68L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$con_old = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$con_old = 72L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$active_con = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$active_con = 76L;
    public static final java.lang.foreign.GroupLayout LAYOUT$header = nuklear.nk_rect.gStructLayout;
    public static final long OFFSET$header = 80L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$win,
            LAYOUT$type,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$buf,
            LAYOUT$name,
            LAYOUT$active,
            LAYOUT$combo_count,
            LAYOUT$con_count,
            LAYOUT$con_old,
            LAYOUT$active_con,
            LAYOUT$header
    ).withName("nk_popup_state");

    public nk_popup_state(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static nk_popup_state getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new nk_popup_state(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public java.lang.foreign.MemorySegment win() {return this._ptr.get(LAYOUT$win, OFFSET$win);}
    public void win(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT$win, OFFSET$win, value);}
    public java.lang.foreign.MemorySegment win_ptr() {return this._ptr.asSlice(OFFSET$win, LAYOUT$win);}

    public int type() {return this._ptr.get(LAYOUT$type, OFFSET$type);}
    public void type(int value) {this._ptr.set(LAYOUT$type, OFFSET$type, value);}
    public java.lang.foreign.MemorySegment type_ptr() {return this._ptr.asSlice(OFFSET$type, LAYOUT$type);}

    public nuklear.nk_popup_buffer buf() {return new nuklear.nk_popup_buffer(this._ptr.asSlice(OFFSET$buf, LAYOUT$buf));}
    public void buf(java.util.function.Consumer<nuklear.nk_popup_buffer> consumer) {consumer.accept(this.buf());}
    public void buf(nuklear.nk_popup_buffer value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$buf, LAYOUT$buf.byteSize());}

    public int name() {return this._ptr.get(LAYOUT$name, OFFSET$name);}
    public void name(int value) {this._ptr.set(LAYOUT$name, OFFSET$name, value);}
    public java.lang.foreign.MemorySegment name_ptr() {return this._ptr.asSlice(OFFSET$name, LAYOUT$name);}

    public int active() {return this._ptr.get(LAYOUT$active, OFFSET$active);}
    public void active(int value) {this._ptr.set(LAYOUT$active, OFFSET$active, value);}
    public java.lang.foreign.MemorySegment active_ptr() {return this._ptr.asSlice(OFFSET$active, LAYOUT$active);}

    public int combo_count() {return this._ptr.get(LAYOUT$combo_count, OFFSET$combo_count);}
    public void combo_count(int value) {this._ptr.set(LAYOUT$combo_count, OFFSET$combo_count, value);}
    public java.lang.foreign.MemorySegment combo_count_ptr() {return this._ptr.asSlice(OFFSET$combo_count, LAYOUT$combo_count);}

    public int con_count() {return this._ptr.get(LAYOUT$con_count, OFFSET$con_count);}
    public void con_count(int value) {this._ptr.set(LAYOUT$con_count, OFFSET$con_count, value);}
    public java.lang.foreign.MemorySegment con_count_ptr() {return this._ptr.asSlice(OFFSET$con_count, LAYOUT$con_count);}

    public int con_old() {return this._ptr.get(LAYOUT$con_old, OFFSET$con_old);}
    public void con_old(int value) {this._ptr.set(LAYOUT$con_old, OFFSET$con_old, value);}
    public java.lang.foreign.MemorySegment con_old_ptr() {return this._ptr.asSlice(OFFSET$con_old, LAYOUT$con_old);}

    public int active_con() {return this._ptr.get(LAYOUT$active_con, OFFSET$active_con);}
    public void active_con(int value) {this._ptr.set(LAYOUT$active_con, OFFSET$active_con, value);}
    public java.lang.foreign.MemorySegment active_con_ptr() {return this._ptr.asSlice(OFFSET$active_con, LAYOUT$active_con);}

    public nuklear.nk_rect header() {return new nuklear.nk_rect(this._ptr.asSlice(OFFSET$header, LAYOUT$header));}
    public void header(java.util.function.Consumer<nuklear.nk_rect> consumer) {consumer.accept(this.header());}
    public void header(nuklear.nk_rect value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$header, LAYOUT$header.byteSize());}
}
