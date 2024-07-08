package nuklear;

public record nk_text_undo_record(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__where = java.lang.foreign.ValueLayout.JAVA_INT.withName("where");
    public static final long OFFSET__where = 0;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT__insert_length = java.lang.foreign.ValueLayout.JAVA_SHORT.withName("insert_length");
    public static final long OFFSET__insert_length = 4;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT__delete_length = java.lang.foreign.ValueLayout.JAVA_SHORT.withName("delete_length");
    public static final long OFFSET__delete_length = 6;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT__char_storage = java.lang.foreign.ValueLayout.JAVA_SHORT.withName("char_storage");
    public static final long OFFSET__char_storage = 8;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__where,
            LAYOUT__insert_length,
            LAYOUT__delete_length,
            LAYOUT__char_storage,
            java.lang.foreign.MemoryLayout.paddingLayout(2)
    ).withByteAlignment(4).withName("nk_text_undo_record");

    public nk_text_undo_record(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static nk_text_undo_record getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new nk_text_undo_record(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, nk_text_undo_record value)
    {
        java.lang.foreign.MemorySegment.copy(value._ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int where() {return this._ptr.get(LAYOUT__where, OFFSET__where);}
    public void where(int value) {this._ptr.set(LAYOUT__where, OFFSET__where, value);}
    public java.lang.foreign.MemorySegment $where() {return this._ptr.asSlice(OFFSET__where, LAYOUT__where);}

    public short insert_length() {return this._ptr.get(LAYOUT__insert_length, OFFSET__insert_length);}
    public void insert_length(short value) {this._ptr.set(LAYOUT__insert_length, OFFSET__insert_length, value);}
    public java.lang.foreign.MemorySegment $insert_length() {return this._ptr.asSlice(OFFSET__insert_length, LAYOUT__insert_length);}

    public short delete_length() {return this._ptr.get(LAYOUT__delete_length, OFFSET__delete_length);}
    public void delete_length(short value) {this._ptr.set(LAYOUT__delete_length, OFFSET__delete_length, value);}
    public java.lang.foreign.MemorySegment $delete_length() {return this._ptr.asSlice(OFFSET__delete_length, LAYOUT__delete_length);}

    public short char_storage() {return this._ptr.get(LAYOUT__char_storage, OFFSET__char_storage);}
    public void char_storage(short value) {this._ptr.set(LAYOUT__char_storage, OFFSET__char_storage, value);}
    public java.lang.foreign.MemorySegment $char_storage() {return this._ptr.asSlice(OFFSET__char_storage, LAYOUT__char_storage);}
}
