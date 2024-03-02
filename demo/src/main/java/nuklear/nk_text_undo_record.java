package nuklear;

public record nk_text_undo_record(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$where = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$where = 0L;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT$insert_length = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET$insert_length = 4L;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT$delete_length = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET$delete_length = 6L;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT$char_storage = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET$char_storage = 8L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$where,
            LAYOUT$insert_length,
            LAYOUT$delete_length,
            LAYOUT$char_storage,
            java.lang.foreign.MemoryLayout.paddingLayout(2)
    ).withName("nk_text_undo_record");

    public nk_text_undo_record(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static nk_text_undo_record getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new nk_text_undo_record(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int where() {return this._ptr.get(LAYOUT$where, OFFSET$where);}
    public void where(int value) {this._ptr.set(LAYOUT$where, OFFSET$where, value);}
    public java.lang.foreign.MemorySegment where_ptr() {return this._ptr.asSlice(OFFSET$where, LAYOUT$where);}

    public short insert_length() {return this._ptr.get(LAYOUT$insert_length, OFFSET$insert_length);}
    public void insert_length(short value) {this._ptr.set(LAYOUT$insert_length, OFFSET$insert_length, value);}
    public java.lang.foreign.MemorySegment insert_length_ptr() {return this._ptr.asSlice(OFFSET$insert_length, LAYOUT$insert_length);}

    public short delete_length() {return this._ptr.get(LAYOUT$delete_length, OFFSET$delete_length);}
    public void delete_length(short value) {this._ptr.set(LAYOUT$delete_length, OFFSET$delete_length, value);}
    public java.lang.foreign.MemorySegment delete_length_ptr() {return this._ptr.asSlice(OFFSET$delete_length, LAYOUT$delete_length);}

    public short char_storage() {return this._ptr.get(LAYOUT$char_storage, OFFSET$char_storage);}
    public void char_storage(short value) {this._ptr.set(LAYOUT$char_storage, OFFSET$char_storage, value);}
    public java.lang.foreign.MemorySegment char_storage_ptr() {return this._ptr.asSlice(OFFSET$char_storage, LAYOUT$char_storage);}
}
