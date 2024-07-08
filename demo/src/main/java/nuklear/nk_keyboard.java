package nuklear;

public record nk_keyboard(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.SequenceLayout LAYOUT__keys = java.lang.foreign.MemoryLayout.sequenceLayout(30, nuklear.nk_key.gRecordLayout).withName("keys");
    public static final long OFFSET__keys = 0;
    public static final java.lang.foreign.SequenceLayout LAYOUT__text = java.lang.foreign.MemoryLayout.sequenceLayout(16, java.lang.foreign.ValueLayout.JAVA_BYTE).withName("text");
    public static final long OFFSET__text = 240;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__text_len = java.lang.foreign.ValueLayout.JAVA_INT.withName("text_len");
    public static final long OFFSET__text_len = 256;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__keys,
            LAYOUT__text,
            LAYOUT__text_len
    ).withByteAlignment(4).withName("nk_keyboard");

    public nk_keyboard(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static nk_keyboard getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new nk_keyboard(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, nk_keyboard value)
    {
        java.lang.foreign.MemorySegment.copy(value._ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public java.lang.foreign.MemorySegment keys() {return this._ptr.asSlice(OFFSET__keys, LAYOUT__keys);}
    public nuklear.nk_key keys(int index) {return nuklear.nk_key.getAtIndex(this.keys(), index);}
    public void keys(int index, java.util.function.Consumer<nuklear.nk_key> consumer) {consumer.accept(this.keys(index));}
    public void keys(int index, nuklear.nk_key value) {nuklear.nk_key.setAtIndex(this.keys(), index, value);}

    public java.lang.foreign.MemorySegment text() {return this._ptr.asSlice(OFFSET__text, LAYOUT__text);}
    public byte text(int index) {return this.text().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index);}
    public void text(int index, byte value) {this.text().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index, value);}

    public int text_len() {return this._ptr.get(LAYOUT__text_len, OFFSET__text_len);}
    public void text_len(int value) {this._ptr.set(LAYOUT__text_len, OFFSET__text_len, value);}
    public java.lang.foreign.MemorySegment $text_len() {return this._ptr.asSlice(OFFSET__text_len, LAYOUT__text_len);}
}
