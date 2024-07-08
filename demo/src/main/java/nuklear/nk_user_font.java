package nuklear;

public record nk_user_font(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.UnionLayout LAYOUT__userdata = nuklear.nk_handle.gRecordLayout.withName("userdata");
    public static final long OFFSET__userdata = 0;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__height = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("height");
    public static final long OFFSET__height = 8;
    public static final java.lang.foreign.AddressLayout LAYOUT__width = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("width");
    public static final long OFFSET__width = 16;
    public static final java.lang.foreign.AddressLayout LAYOUT__query = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("query");
    public static final long OFFSET__query = 24;
    public static final java.lang.foreign.UnionLayout LAYOUT__texture = nuklear.nk_handle.gRecordLayout.withName("texture");
    public static final long OFFSET__texture = 32;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__userdata,
            LAYOUT__height,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__width,
            LAYOUT__query,
            LAYOUT__texture
    ).withByteAlignment(8).withName("nk_user_font");

    public nk_user_font(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static nk_user_font getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new nk_user_font(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, nk_user_font value)
    {
        java.lang.foreign.MemorySegment.copy(value._ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public nuklear.nk_handle userdata() {return new nuklear.nk_handle(this._ptr.asSlice(OFFSET__userdata, LAYOUT__userdata));}
    public void userdata(java.util.function.Consumer<nuklear.nk_handle> consumer) {consumer.accept(this.userdata());}
    public void userdata(nuklear.nk_handle value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__userdata, LAYOUT__userdata.byteSize());}

    public float height() {return this._ptr.get(LAYOUT__height, OFFSET__height);}
    public void height(float value) {this._ptr.set(LAYOUT__height, OFFSET__height, value);}
    public java.lang.foreign.MemorySegment $height() {return this._ptr.asSlice(OFFSET__height, LAYOUT__height);}

    public java.lang.foreign.MemorySegment width() {return this._ptr.get(LAYOUT__width, OFFSET__width);}
    public void width(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT__width, OFFSET__width, value);}
    public java.lang.foreign.MemorySegment $width() {return this._ptr.asSlice(OFFSET__width, LAYOUT__width);}

    public java.lang.foreign.MemorySegment query() {return this._ptr.get(LAYOUT__query, OFFSET__query);}
    public void query(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT__query, OFFSET__query, value);}
    public java.lang.foreign.MemorySegment $query() {return this._ptr.asSlice(OFFSET__query, LAYOUT__query);}

    public nuklear.nk_handle texture() {return new nuklear.nk_handle(this._ptr.asSlice(OFFSET__texture, LAYOUT__texture));}
    public void texture(java.util.function.Consumer<nuklear.nk_handle> consumer) {consumer.accept(this.texture());}
    public void texture(nuklear.nk_handle value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__texture, LAYOUT__texture.byteSize());}
}
