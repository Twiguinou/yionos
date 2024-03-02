package nuklear;

public record nk_command_buffer(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.AddressLayout LAYOUT$base = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$base = 0L;
    public static final java.lang.foreign.GroupLayout LAYOUT$clip = nuklear.nk_rect.gStructLayout;
    public static final long OFFSET$clip = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$use_clipping = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$use_clipping = 24L;
    public static final java.lang.foreign.GroupLayout LAYOUT$userdata = nuklear.nk_handle.gStructLayout;
    public static final long OFFSET$userdata = 32L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$begin = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$begin = 40L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$end = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$end = 48L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$last = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$last = 56L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$base,
            LAYOUT$clip,
            LAYOUT$use_clipping,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$userdata,
            LAYOUT$begin,
            LAYOUT$end,
            LAYOUT$last
    ).withName("nk_command_buffer");

    public nk_command_buffer(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static nk_command_buffer getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new nk_command_buffer(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public java.lang.foreign.MemorySegment base() {return this._ptr.get(LAYOUT$base, OFFSET$base);}
    public void base(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT$base, OFFSET$base, value);}
    public java.lang.foreign.MemorySegment base_ptr() {return this._ptr.asSlice(OFFSET$base, LAYOUT$base);}

    public nuklear.nk_rect clip() {return new nuklear.nk_rect(this._ptr.asSlice(OFFSET$clip, LAYOUT$clip));}
    public void clip(java.util.function.Consumer<nuklear.nk_rect> consumer) {consumer.accept(this.clip());}
    public void clip(nuklear.nk_rect value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$clip, LAYOUT$clip.byteSize());}

    public int use_clipping() {return this._ptr.get(LAYOUT$use_clipping, OFFSET$use_clipping);}
    public void use_clipping(int value) {this._ptr.set(LAYOUT$use_clipping, OFFSET$use_clipping, value);}
    public java.lang.foreign.MemorySegment use_clipping_ptr() {return this._ptr.asSlice(OFFSET$use_clipping, LAYOUT$use_clipping);}

    public nuklear.nk_handle userdata() {return new nuklear.nk_handle(this._ptr.asSlice(OFFSET$userdata, LAYOUT$userdata));}
    public void userdata(java.util.function.Consumer<nuklear.nk_handle> consumer) {consumer.accept(this.userdata());}
    public void userdata(nuklear.nk_handle value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$userdata, LAYOUT$userdata.byteSize());}

    public long begin() {return this._ptr.get(LAYOUT$begin, OFFSET$begin);}
    public void begin(long value) {this._ptr.set(LAYOUT$begin, OFFSET$begin, value);}
    public java.lang.foreign.MemorySegment begin_ptr() {return this._ptr.asSlice(OFFSET$begin, LAYOUT$begin);}

    public long end() {return this._ptr.get(LAYOUT$end, OFFSET$end);}
    public void end(long value) {this._ptr.set(LAYOUT$end, OFFSET$end, value);}
    public java.lang.foreign.MemorySegment end_ptr() {return this._ptr.asSlice(OFFSET$end, LAYOUT$end);}

    public long last() {return this._ptr.get(LAYOUT$last, OFFSET$last);}
    public void last(long value) {this._ptr.set(LAYOUT$last, OFFSET$last, value);}
    public java.lang.foreign.MemorySegment last_ptr() {return this._ptr.asSlice(OFFSET$last, LAYOUT$last);}
}
