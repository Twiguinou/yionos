package nuklear;

public record nk_user_font(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.GroupLayout LAYOUT$userdata = nuklear.nk_handle.gStructLayout;
    public static final long OFFSET$userdata = 0L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$height = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$height = 8L;
    public static final java.lang.foreign.AddressLayout LAYOUT$width = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$width = 16L;
    public static final java.lang.foreign.AddressLayout LAYOUT$query = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$query = 24L;
    public static final java.lang.foreign.GroupLayout LAYOUT$texture = nuklear.nk_handle.gStructLayout;
    public static final long OFFSET$texture = 32L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$userdata,
            LAYOUT$height,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$width,
            LAYOUT$query,
            LAYOUT$texture
    ).withName("nk_user_font");

    public nk_user_font(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static nk_user_font getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new nk_user_font(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public nuklear.nk_handle userdata() {return new nuklear.nk_handle(this._ptr.asSlice(OFFSET$userdata, LAYOUT$userdata));}
    public void userdata(java.util.function.Consumer<nuklear.nk_handle> consumer) {consumer.accept(this.userdata());}
    public void userdata(nuklear.nk_handle value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$userdata, LAYOUT$userdata.byteSize());}

    public float height() {return this._ptr.get(LAYOUT$height, OFFSET$height);}
    public void height(float value) {this._ptr.set(LAYOUT$height, OFFSET$height, value);}
    public java.lang.foreign.MemorySegment height_ptr() {return this._ptr.asSlice(OFFSET$height, LAYOUT$height);}

    public java.lang.foreign.MemorySegment width() {return this._ptr.get(LAYOUT$width, OFFSET$width);}
    public void width(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT$width, OFFSET$width, value);}
    public java.lang.foreign.MemorySegment width_ptr() {return this._ptr.asSlice(OFFSET$width, LAYOUT$width);}

    public java.lang.foreign.MemorySegment query() {return this._ptr.get(LAYOUT$query, OFFSET$query);}
    public void query(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT$query, OFFSET$query, value);}
    public java.lang.foreign.MemorySegment query_ptr() {return this._ptr.asSlice(OFFSET$query, LAYOUT$query);}

    public nuklear.nk_handle texture() {return new nuklear.nk_handle(this._ptr.asSlice(OFFSET$texture, LAYOUT$texture));}
    public void texture(java.util.function.Consumer<nuklear.nk_handle> consumer) {consumer.accept(this.texture());}
    public void texture(nuklear.nk_handle value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$texture, LAYOUT$texture.byteSize());}
}
