package nuklear;

public record nk_text_undo_state(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.SequenceLayout LAYOUT__undo_rec = java.lang.foreign.MemoryLayout.sequenceLayout(99, nuklear.nk_text_undo_record.gRecordLayout).withName("undo_rec");
    public static final long OFFSET__undo_rec = 0;
    public static final java.lang.foreign.SequenceLayout LAYOUT__undo_char = java.lang.foreign.MemoryLayout.sequenceLayout(999, java.lang.foreign.ValueLayout.JAVA_INT).withName("undo_char");
    public static final long OFFSET__undo_char = 1188;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT__undo_point = java.lang.foreign.ValueLayout.JAVA_SHORT.withName("undo_point");
    public static final long OFFSET__undo_point = 5184;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT__redo_point = java.lang.foreign.ValueLayout.JAVA_SHORT.withName("redo_point");
    public static final long OFFSET__redo_point = 5186;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT__undo_char_point = java.lang.foreign.ValueLayout.JAVA_SHORT.withName("undo_char_point");
    public static final long OFFSET__undo_char_point = 5188;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT__redo_char_point = java.lang.foreign.ValueLayout.JAVA_SHORT.withName("redo_char_point");
    public static final long OFFSET__redo_char_point = 5190;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__undo_rec,
            LAYOUT__undo_char,
            LAYOUT__undo_point,
            LAYOUT__redo_point,
            LAYOUT__undo_char_point,
            LAYOUT__redo_char_point
    ).withByteAlignment(4).withName("nk_text_undo_state");

    public nk_text_undo_state(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static nk_text_undo_state getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new nk_text_undo_state(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, nk_text_undo_state value)
    {
        java.lang.foreign.MemorySegment.copy(value._ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public java.lang.foreign.MemorySegment undo_rec() {return this._ptr.asSlice(OFFSET__undo_rec, LAYOUT__undo_rec);}
    public nuklear.nk_text_undo_record undo_rec(int index) {return nuklear.nk_text_undo_record.getAtIndex(this.undo_rec(), index);}
    public void undo_rec(int index, java.util.function.Consumer<nuklear.nk_text_undo_record> consumer) {consumer.accept(this.undo_rec(index));}
    public void undo_rec(int index, nuklear.nk_text_undo_record value) {nuklear.nk_text_undo_record.setAtIndex(this.undo_rec(), index, value);}

    public java.lang.foreign.MemorySegment undo_char() {return this._ptr.asSlice(OFFSET__undo_char, LAYOUT__undo_char);}
    public int undo_char(int index) {return this.undo_char().getAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, index);}
    public void undo_char(int index, int value) {this.undo_char().setAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, index, value);}

    public short undo_point() {return this._ptr.get(LAYOUT__undo_point, OFFSET__undo_point);}
    public void undo_point(short value) {this._ptr.set(LAYOUT__undo_point, OFFSET__undo_point, value);}
    public java.lang.foreign.MemorySegment $undo_point() {return this._ptr.asSlice(OFFSET__undo_point, LAYOUT__undo_point);}

    public short redo_point() {return this._ptr.get(LAYOUT__redo_point, OFFSET__redo_point);}
    public void redo_point(short value) {this._ptr.set(LAYOUT__redo_point, OFFSET__redo_point, value);}
    public java.lang.foreign.MemorySegment $redo_point() {return this._ptr.asSlice(OFFSET__redo_point, LAYOUT__redo_point);}

    public short undo_char_point() {return this._ptr.get(LAYOUT__undo_char_point, OFFSET__undo_char_point);}
    public void undo_char_point(short value) {this._ptr.set(LAYOUT__undo_char_point, OFFSET__undo_char_point, value);}
    public java.lang.foreign.MemorySegment $undo_char_point() {return this._ptr.asSlice(OFFSET__undo_char_point, LAYOUT__undo_char_point);}

    public short redo_char_point() {return this._ptr.get(LAYOUT__redo_char_point, OFFSET__redo_char_point);}
    public void redo_char_point(short value) {this._ptr.set(LAYOUT__redo_char_point, OFFSET__redo_char_point, value);}
    public java.lang.foreign.MemorySegment $redo_char_point() {return this._ptr.asSlice(OFFSET__redo_char_point, LAYOUT__redo_char_point);}
}
