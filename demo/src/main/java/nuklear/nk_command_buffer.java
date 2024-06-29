package nuklear;

public record nk_command_buffer(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.AddressLayout LAYOUT__base = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__base = 0;
    public static final java.lang.foreign.StructLayout LAYOUT__clip = nuklear.nk_rect.gRecordLayout;
    public static final long OFFSET__clip = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__use_clipping = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__use_clipping = 24;
    public static final java.lang.foreign.UnionLayout LAYOUT__userdata = nuklear.nk_handle.gRecordLayout;
    public static final long OFFSET__userdata = 32;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__begin = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__begin = 40;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__end = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__end = 48;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__last = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__last = 56;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__base,
            LAYOUT__clip,
            LAYOUT__use_clipping,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__userdata,
            LAYOUT__begin,
            LAYOUT__end,
            LAYOUT__last
    ).withByteAlignment(8).withName("nk_command_buffer");

    public nk_command_buffer(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static nk_command_buffer getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new nk_command_buffer(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, nk_command_buffer value)
    {
        java.lang.foreign.MemorySegment.copy(value._ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public java.lang.foreign.MemorySegment base() {return this._ptr.get(LAYOUT__base, OFFSET__base);}
    public void base(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT__base, OFFSET__base, value);}
    public java.lang.foreign.MemorySegment $base() {return this._ptr.asSlice(OFFSET__base, LAYOUT__base);}

    public nuklear.nk_rect clip() {return new nuklear.nk_rect(this._ptr.asSlice(OFFSET__clip, LAYOUT__clip));}
    public void clip(java.util.function.Consumer<nuklear.nk_rect> consumer) {consumer.accept(this.clip());}
    public void clip(nuklear.nk_rect value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__clip, LAYOUT__clip.byteSize());}

    public int use_clipping() {return this._ptr.get(LAYOUT__use_clipping, OFFSET__use_clipping);}
    public void use_clipping(int value) {this._ptr.set(LAYOUT__use_clipping, OFFSET__use_clipping, value);}
    public java.lang.foreign.MemorySegment $use_clipping() {return this._ptr.asSlice(OFFSET__use_clipping, LAYOUT__use_clipping);}

    public nuklear.nk_handle userdata() {return new nuklear.nk_handle(this._ptr.asSlice(OFFSET__userdata, LAYOUT__userdata));}
    public void userdata(java.util.function.Consumer<nuklear.nk_handle> consumer) {consumer.accept(this.userdata());}
    public void userdata(nuklear.nk_handle value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__userdata, LAYOUT__userdata.byteSize());}

    public long begin() {return this._ptr.get(LAYOUT__begin, OFFSET__begin);}
    public void begin(long value) {this._ptr.set(LAYOUT__begin, OFFSET__begin, value);}
    public java.lang.foreign.MemorySegment $begin() {return this._ptr.asSlice(OFFSET__begin, LAYOUT__begin);}

    public long end() {return this._ptr.get(LAYOUT__end, OFFSET__end);}
    public void end(long value) {this._ptr.set(LAYOUT__end, OFFSET__end, value);}
    public java.lang.foreign.MemorySegment $end() {return this._ptr.asSlice(OFFSET__end, LAYOUT__end);}

    public long last() {return this._ptr.get(LAYOUT__last, OFFSET__last);}
    public void last(long value) {this._ptr.set(LAYOUT__last, OFFSET__last, value);}
    public java.lang.foreign.MemorySegment $last() {return this._ptr.asSlice(OFFSET__last, LAYOUT__last);}
}
