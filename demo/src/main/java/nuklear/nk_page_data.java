package nuklear;

public record nk_page_data(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.GroupLayout LAYOUT$tbl = nuklear.nk_table.gStructLayout;
    public static final long OFFSET$tbl = 0L;
    public static final java.lang.foreign.GroupLayout LAYOUT$pan = nuklear.nk_panel.gStructLayout;
    public static final long OFFSET$pan = 0L;
    public static final java.lang.foreign.GroupLayout LAYOUT$win = nuklear.nk_window.gStructLayout;
    public static final long OFFSET$win = 0L;

    public static final java.lang.foreign.UnionLayout gStructLayout = java.lang.foreign.MemoryLayout.unionLayout(
            LAYOUT$tbl,
            LAYOUT$pan,
            LAYOUT$win
    ).withName("nk_page_data");

    public nk_page_data(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static nk_page_data getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new nk_page_data(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public nuklear.nk_table tbl() {return new nuklear.nk_table(this._ptr.asSlice(OFFSET$tbl, LAYOUT$tbl));}
    public void tbl(java.util.function.Consumer<nuklear.nk_table> consumer) {consumer.accept(this.tbl());}
    public void tbl(nuklear.nk_table value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$tbl, LAYOUT$tbl.byteSize());}

    public nuklear.nk_panel pan() {return new nuklear.nk_panel(this._ptr.asSlice(OFFSET$pan, LAYOUT$pan));}
    public void pan(java.util.function.Consumer<nuklear.nk_panel> consumer) {consumer.accept(this.pan());}
    public void pan(nuklear.nk_panel value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$pan, LAYOUT$pan.byteSize());}

    public nuklear.nk_window win() {return new nuklear.nk_window(this._ptr.asSlice(OFFSET$win, LAYOUT$win));}
    public void win(java.util.function.Consumer<nuklear.nk_window> consumer) {consumer.accept(this.win());}
    public void win(nuklear.nk_window value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$win, LAYOUT$win.byteSize());}
}
