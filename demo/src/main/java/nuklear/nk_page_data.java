package nuklear;

public record nk_page_data(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT__tbl = nuklear.nk_table.gRecordLayout;
    public static final java.lang.foreign.StructLayout LAYOUT__pan = nuklear.nk_panel.gRecordLayout;
    public static final java.lang.foreign.StructLayout LAYOUT__win = nuklear.nk_window.gRecordLayout;

    public static final java.lang.foreign.UnionLayout gRecordLayout = java.lang.foreign.MemoryLayout.unionLayout(
            LAYOUT__tbl,
            LAYOUT__pan,
            LAYOUT__win
    ).withByteAlignment(8).withName("nk_page_data");

    public nk_page_data(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static nk_page_data getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new nk_page_data(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, nk_page_data value)
    {
        java.lang.foreign.MemorySegment.copy(value._ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public nuklear.nk_table tbl() {return new nuklear.nk_table(this._ptr.asSlice(0, LAYOUT__tbl));}
    public void tbl(java.util.function.Consumer<nuklear.nk_table> consumer) {consumer.accept(this.tbl());}
    public void tbl(nuklear.nk_table value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, 0, LAYOUT__tbl.byteSize());}

    public nuklear.nk_panel pan() {return new nuklear.nk_panel(this._ptr.asSlice(0, LAYOUT__pan));}
    public void pan(java.util.function.Consumer<nuklear.nk_panel> consumer) {consumer.accept(this.pan());}
    public void pan(nuklear.nk_panel value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, 0, LAYOUT__pan.byteSize());}

    public nuklear.nk_window win() {return new nuklear.nk_window(this._ptr.asSlice(0, LAYOUT__win));}
    public void win(java.util.function.Consumer<nuklear.nk_window> consumer) {consumer.accept(this.win());}
    public void win(nuklear.nk_window value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, 0, LAYOUT__win.byteSize());}
}
