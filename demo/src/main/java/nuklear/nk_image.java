package nuklear;

public record nk_image(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.GroupLayout LAYOUT$handle = nuklear.nk_handle.gStructLayout;
    public static final long OFFSET$handle = 0L;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT$w = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET$w = 8L;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT$h = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET$h = 10L;
    public static final java.lang.foreign.SequenceLayout LAYOUT$region = java.lang.foreign.MemoryLayout.sequenceLayout(4, java.lang.foreign.ValueLayout.JAVA_SHORT);
    public static final long OFFSET$region = 12L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$handle,
            LAYOUT$w,
            LAYOUT$h,
            LAYOUT$region,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("nk_image");

    public nk_image(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static nk_image getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new nk_image(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public nuklear.nk_handle handle() {return new nuklear.nk_handle(this._ptr.asSlice(OFFSET$handle, LAYOUT$handle));}
    public void handle(java.util.function.Consumer<nuklear.nk_handle> consumer) {consumer.accept(this.handle());}
    public void handle(nuklear.nk_handle value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$handle, LAYOUT$handle.byteSize());}

    public short w() {return this._ptr.get(LAYOUT$w, OFFSET$w);}
    public void w(short value) {this._ptr.set(LAYOUT$w, OFFSET$w, value);}
    public java.lang.foreign.MemorySegment w_ptr() {return this._ptr.asSlice(OFFSET$w, LAYOUT$w);}

    public short h() {return this._ptr.get(LAYOUT$h, OFFSET$h);}
    public void h(short value) {this._ptr.set(LAYOUT$h, OFFSET$h, value);}
    public java.lang.foreign.MemorySegment h_ptr() {return this._ptr.asSlice(OFFSET$h, LAYOUT$h);}

    public java.lang.foreign.MemorySegment region() {return this._ptr.asSlice(OFFSET$region, LAYOUT$region);}
    public short region(int i) {return this.region().getAtIndex(java.lang.foreign.ValueLayout.JAVA_SHORT, i);}
    public void region(int i, short value) {this.region().setAtIndex(java.lang.foreign.ValueLayout.JAVA_SHORT, i, value);}
}
