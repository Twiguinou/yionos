package nuklear;

public record nk_text_undo_state(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.SequenceLayout LAYOUT$undo_rec = java.lang.foreign.MemoryLayout.sequenceLayout(99, nuklear.nk_text_undo_record.gStructLayout);
    public static final long OFFSET$undo_rec = 0L;
    public static final java.lang.foreign.SequenceLayout LAYOUT$undo_char = java.lang.foreign.MemoryLayout.sequenceLayout(999, java.lang.foreign.ValueLayout.JAVA_INT);
    public static final long OFFSET$undo_char = 1188L;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT$undo_point = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET$undo_point = 5184L;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT$redo_point = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET$redo_point = 5186L;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT$undo_char_point = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET$undo_char_point = 5188L;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT$redo_char_point = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET$redo_char_point = 5190L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$undo_rec,
            LAYOUT$undo_char,
            LAYOUT$undo_point,
            LAYOUT$redo_point,
            LAYOUT$undo_char_point,
            LAYOUT$redo_char_point
    ).withName("nk_text_undo_state");

    public nk_text_undo_state(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static nk_text_undo_state getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new nk_text_undo_state(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public java.lang.foreign.MemorySegment undo_rec() {return this._ptr.asSlice(OFFSET$undo_rec, LAYOUT$undo_rec);}
    public nuklear.nk_text_undo_record undo_rec(int i) {return new nuklear.nk_text_undo_record(this._ptr.asSlice(OFFSET$undo_rec + i * LAYOUT$undo_rec.byteSize(), LAYOUT$undo_rec));}
    public void undo_rec(int i, java.util.function.Consumer<nuklear.nk_text_undo_record> consumer) {consumer.accept(this.undo_rec(i));}
    public void undo_rec(int i, nuklear.nk_text_undo_record value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$undo_rec + i * LAYOUT$undo_rec.byteSize(), LAYOUT$undo_rec.byteSize());}

    public java.lang.foreign.MemorySegment undo_char() {return this._ptr.asSlice(OFFSET$undo_char, LAYOUT$undo_char);}
    public int undo_char(int i) {return this.undo_char().getAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, i);}
    public void undo_char(int i, int value) {this.undo_char().setAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, i, value);}

    public short undo_point() {return this._ptr.get(LAYOUT$undo_point, OFFSET$undo_point);}
    public void undo_point(short value) {this._ptr.set(LAYOUT$undo_point, OFFSET$undo_point, value);}
    public java.lang.foreign.MemorySegment undo_point_ptr() {return this._ptr.asSlice(OFFSET$undo_point, LAYOUT$undo_point);}

    public short redo_point() {return this._ptr.get(LAYOUT$redo_point, OFFSET$redo_point);}
    public void redo_point(short value) {this._ptr.set(LAYOUT$redo_point, OFFSET$redo_point, value);}
    public java.lang.foreign.MemorySegment redo_point_ptr() {return this._ptr.asSlice(OFFSET$redo_point, LAYOUT$redo_point);}

    public short undo_char_point() {return this._ptr.get(LAYOUT$undo_char_point, OFFSET$undo_char_point);}
    public void undo_char_point(short value) {this._ptr.set(LAYOUT$undo_char_point, OFFSET$undo_char_point, value);}
    public java.lang.foreign.MemorySegment undo_char_point_ptr() {return this._ptr.asSlice(OFFSET$undo_char_point, LAYOUT$undo_char_point);}

    public short redo_char_point() {return this._ptr.get(LAYOUT$redo_char_point, OFFSET$redo_char_point);}
    public void redo_char_point(short value) {this._ptr.set(LAYOUT$redo_char_point, OFFSET$redo_char_point, value);}
    public java.lang.foreign.MemorySegment redo_char_point_ptr() {return this._ptr.asSlice(OFFSET$redo_char_point, LAYOUT$redo_char_point);}
}
