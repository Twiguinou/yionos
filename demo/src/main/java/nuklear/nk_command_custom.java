package nuklear;

public record nk_command_custom(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.GroupLayout LAYOUT$header = nuklear.nk_command.gStructLayout;
    public static final long OFFSET$header = 0L;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT$x = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET$x = 16L;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT$y = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET$y = 18L;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT$w = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET$w = 20L;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT$h = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET$h = 22L;
    public static final java.lang.foreign.GroupLayout LAYOUT$callback_data = nuklear.nk_handle.gStructLayout;
    public static final long OFFSET$callback_data = 24L;
    public static final java.lang.foreign.AddressLayout LAYOUT$callback = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$callback = 32L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$header,
            LAYOUT$x,
            LAYOUT$y,
            LAYOUT$w,
            LAYOUT$h,
            LAYOUT$callback_data,
            LAYOUT$callback
    ).withName("nk_command_custom");

    public nk_command_custom(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static nk_command_custom getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new nk_command_custom(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public nuklear.nk_command header() {return new nuklear.nk_command(this._ptr.asSlice(OFFSET$header, LAYOUT$header));}
    public void header(java.util.function.Consumer<nuklear.nk_command> consumer) {consumer.accept(this.header());}
    public void header(nuklear.nk_command value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$header, LAYOUT$header.byteSize());}

    public short x() {return this._ptr.get(LAYOUT$x, OFFSET$x);}
    public void x(short value) {this._ptr.set(LAYOUT$x, OFFSET$x, value);}
    public java.lang.foreign.MemorySegment x_ptr() {return this._ptr.asSlice(OFFSET$x, LAYOUT$x);}

    public short y() {return this._ptr.get(LAYOUT$y, OFFSET$y);}
    public void y(short value) {this._ptr.set(LAYOUT$y, OFFSET$y, value);}
    public java.lang.foreign.MemorySegment y_ptr() {return this._ptr.asSlice(OFFSET$y, LAYOUT$y);}

    public short w() {return this._ptr.get(LAYOUT$w, OFFSET$w);}
    public void w(short value) {this._ptr.set(LAYOUT$w, OFFSET$w, value);}
    public java.lang.foreign.MemorySegment w_ptr() {return this._ptr.asSlice(OFFSET$w, LAYOUT$w);}

    public short h() {return this._ptr.get(LAYOUT$h, OFFSET$h);}
    public void h(short value) {this._ptr.set(LAYOUT$h, OFFSET$h, value);}
    public java.lang.foreign.MemorySegment h_ptr() {return this._ptr.asSlice(OFFSET$h, LAYOUT$h);}

    public nuklear.nk_handle callback_data() {return new nuklear.nk_handle(this._ptr.asSlice(OFFSET$callback_data, LAYOUT$callback_data));}
    public void callback_data(java.util.function.Consumer<nuklear.nk_handle> consumer) {consumer.accept(this.callback_data());}
    public void callback_data(nuklear.nk_handle value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$callback_data, LAYOUT$callback_data.byteSize());}

    public java.lang.foreign.MemorySegment callback() {return this._ptr.get(LAYOUT$callback, OFFSET$callback);}
    public void callback(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT$callback, OFFSET$callback, value);}
    public java.lang.foreign.MemorySegment callback_ptr() {return this._ptr.asSlice(OFFSET$callback, LAYOUT$callback);}
}
