package nuklear;

public record nk_image(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.UnionLayout LAYOUT__handle = nuklear.nk_handle.gRecordLayout.withName("handle");
    public static final long OFFSET__handle = 0;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT__w = java.lang.foreign.ValueLayout.JAVA_SHORT.withName("w");
    public static final long OFFSET__w = 8;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT__h = java.lang.foreign.ValueLayout.JAVA_SHORT.withName("h");
    public static final long OFFSET__h = 10;
    public static final java.lang.foreign.SequenceLayout LAYOUT__region = java.lang.foreign.MemoryLayout.sequenceLayout(4, java.lang.foreign.ValueLayout.JAVA_SHORT).withName("region");
    public static final long OFFSET__region = 12;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__handle,
            LAYOUT__w,
            LAYOUT__h,
            LAYOUT__region,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("nk_image");

    public nk_image(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static nk_image getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new nk_image(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, nk_image value)
    {
        java.lang.foreign.MemorySegment.copy(value._ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public nuklear.nk_handle handle() {return new nuklear.nk_handle(this._ptr.asSlice(OFFSET__handle, LAYOUT__handle));}
    public void handle(java.util.function.Consumer<nuklear.nk_handle> consumer) {consumer.accept(this.handle());}
    public void handle(nuklear.nk_handle value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__handle, LAYOUT__handle.byteSize());}

    public short w() {return this._ptr.get(LAYOUT__w, OFFSET__w);}
    public void w(short value) {this._ptr.set(LAYOUT__w, OFFSET__w, value);}
    public java.lang.foreign.MemorySegment $w() {return this._ptr.asSlice(OFFSET__w, LAYOUT__w);}

    public short h() {return this._ptr.get(LAYOUT__h, OFFSET__h);}
    public void h(short value) {this._ptr.set(LAYOUT__h, OFFSET__h, value);}
    public java.lang.foreign.MemorySegment $h() {return this._ptr.asSlice(OFFSET__h, LAYOUT__h);}

    public java.lang.foreign.MemorySegment region() {return this._ptr.asSlice(OFFSET__region, LAYOUT__region);}
    public short region(int index) {return this.region().getAtIndex(java.lang.foreign.ValueLayout.JAVA_SHORT, index);}
    public void region(int index, short value) {this.region().setAtIndex(java.lang.foreign.ValueLayout.JAVA_SHORT, index, value);}
}
