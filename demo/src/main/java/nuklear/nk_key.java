package nuklear;

public record nk_key(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__down = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__down = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__clicked = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__clicked = 4;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__down,
            LAYOUT__clicked
    ).withByteAlignment(4).withName("nk_key");

    public nk_key(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static nk_key getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new nk_key(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, nk_key value)
    {
        java.lang.foreign.MemorySegment.copy(value._ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int down() {return this._ptr.get(LAYOUT__down, OFFSET__down);}
    public void down(int value) {this._ptr.set(LAYOUT__down, OFFSET__down, value);}
    public java.lang.foreign.MemorySegment $down() {return this._ptr.asSlice(OFFSET__down, LAYOUT__down);}

    public int clicked() {return this._ptr.get(LAYOUT__clicked, OFFSET__clicked);}
    public void clicked(int value) {this._ptr.set(LAYOUT__clicked, OFFSET__clicked, value);}
    public java.lang.foreign.MemorySegment $clicked() {return this._ptr.asSlice(OFFSET__clicked, LAYOUT__clicked);}
}
