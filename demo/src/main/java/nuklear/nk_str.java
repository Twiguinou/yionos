package nuklear;

public record nk_str(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT__buffer = nuklear.nk_buffer.gRecordLayout.withName("buffer");
    public static final long OFFSET__buffer = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__len = java.lang.foreign.ValueLayout.JAVA_INT.withName("len");
    public static final long OFFSET__len = 120;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__buffer,
            LAYOUT__len,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("nk_str");

    public nk_str(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static nk_str getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new nk_str(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, nk_str value)
    {
        java.lang.foreign.MemorySegment.copy(value._ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public nuklear.nk_buffer buffer() {return new nuklear.nk_buffer(this._ptr.asSlice(OFFSET__buffer, LAYOUT__buffer));}
    public void buffer(java.util.function.Consumer<nuklear.nk_buffer> consumer) {consumer.accept(this.buffer());}
    public void buffer(nuklear.nk_buffer value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__buffer, LAYOUT__buffer.byteSize());}

    public int len() {return this._ptr.get(LAYOUT__len, OFFSET__len);}
    public void len(int value) {this._ptr.set(LAYOUT__len, OFFSET__len, value);}
    public java.lang.foreign.MemorySegment $len() {return this._ptr.asSlice(OFFSET__len, LAYOUT__len);}
}
