package nuklear;

public record nk_keyboard(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.SequenceLayout LAYOUT$keys = java.lang.foreign.MemoryLayout.sequenceLayout(30, nuklear.nk_key.gStructLayout);
    public static final long OFFSET$keys = 0L;
    public static final java.lang.foreign.SequenceLayout LAYOUT$text = java.lang.foreign.MemoryLayout.sequenceLayout(16, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET$text = 240L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$text_len = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$text_len = 256L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$keys,
            LAYOUT$text,
            LAYOUT$text_len
    ).withName("nk_keyboard");

    public nk_keyboard(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static nk_keyboard getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new nk_keyboard(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public java.lang.foreign.MemorySegment keys() {return this._ptr.asSlice(OFFSET$keys, LAYOUT$keys);}
    public nuklear.nk_key keys(int i) {return new nuklear.nk_key(this._ptr.asSlice(OFFSET$keys + i * LAYOUT$keys.byteSize(), LAYOUT$keys));}
    public void keys(int i, java.util.function.Consumer<nuklear.nk_key> consumer) {consumer.accept(this.keys(i));}
    public void keys(int i, nuklear.nk_key value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$keys + i * LAYOUT$keys.byteSize(), LAYOUT$keys.byteSize());}

    public java.lang.foreign.MemorySegment text() {return this._ptr.asSlice(OFFSET$text, LAYOUT$text);}
    public char text(int i) {return (char)this.text().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i);}
    public void text(int i, char value) {this.text().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i, (byte)value);}

    public int text_len() {return this._ptr.get(LAYOUT$text_len, OFFSET$text_len);}
    public void text_len(int value) {this._ptr.set(LAYOUT$text_len, OFFSET$text_len, value);}
    public java.lang.foreign.MemorySegment text_len_ptr() {return this._ptr.asSlice(OFFSET$text_len, LAYOUT$text_len);}
}
