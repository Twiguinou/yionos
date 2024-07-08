package nuklear;

public record nk_font(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.AddressLayout LAYOUT__next = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("next");
    public static final long OFFSET__next = 0;
    public static final java.lang.foreign.StructLayout LAYOUT__handle = nuklear.nk_user_font.gRecordLayout.withName("handle");
    public static final long OFFSET__handle = 8;
    public static final java.lang.foreign.StructLayout LAYOUT__info = nuklear.nk_baked_font.gRecordLayout.withName("info");
    public static final long OFFSET__info = 48;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__scale = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("scale");
    public static final long OFFSET__scale = 80;
    public static final java.lang.foreign.AddressLayout LAYOUT__glyphs = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("glyphs");
    public static final long OFFSET__glyphs = 88;
    public static final java.lang.foreign.AddressLayout LAYOUT__fallback = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("fallback");
    public static final long OFFSET__fallback = 96;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__fallback_codepoint = java.lang.foreign.ValueLayout.JAVA_INT.withName("fallback_codepoint");
    public static final long OFFSET__fallback_codepoint = 104;
    public static final java.lang.foreign.UnionLayout LAYOUT__texture = nuklear.nk_handle.gRecordLayout.withName("texture");
    public static final long OFFSET__texture = 112;
    public static final java.lang.foreign.AddressLayout LAYOUT__config = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("config");
    public static final long OFFSET__config = 120;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__next,
            LAYOUT__handle,
            LAYOUT__info,
            LAYOUT__scale,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__glyphs,
            LAYOUT__fallback,
            LAYOUT__fallback_codepoint,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__texture,
            LAYOUT__config
    ).withByteAlignment(8).withName("nk_font");

    public nk_font(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static nk_font getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new nk_font(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, nk_font value)
    {
        java.lang.foreign.MemorySegment.copy(value._ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public java.lang.foreign.MemorySegment next() {return this._ptr.get(LAYOUT__next, OFFSET__next);}
    public void next(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT__next, OFFSET__next, value);}
    public java.lang.foreign.MemorySegment $next() {return this._ptr.asSlice(OFFSET__next, LAYOUT__next);}

    public nuklear.nk_user_font handle() {return new nuklear.nk_user_font(this._ptr.asSlice(OFFSET__handle, LAYOUT__handle));}
    public void handle(java.util.function.Consumer<nuklear.nk_user_font> consumer) {consumer.accept(this.handle());}
    public void handle(nuklear.nk_user_font value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__handle, LAYOUT__handle.byteSize());}

    public nuklear.nk_baked_font info() {return new nuklear.nk_baked_font(this._ptr.asSlice(OFFSET__info, LAYOUT__info));}
    public void info(java.util.function.Consumer<nuklear.nk_baked_font> consumer) {consumer.accept(this.info());}
    public void info(nuklear.nk_baked_font value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__info, LAYOUT__info.byteSize());}

    public float scale() {return this._ptr.get(LAYOUT__scale, OFFSET__scale);}
    public void scale(float value) {this._ptr.set(LAYOUT__scale, OFFSET__scale, value);}
    public java.lang.foreign.MemorySegment $scale() {return this._ptr.asSlice(OFFSET__scale, LAYOUT__scale);}

    public java.lang.foreign.MemorySegment glyphs() {return this._ptr.get(LAYOUT__glyphs, OFFSET__glyphs);}
    public void glyphs(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT__glyphs, OFFSET__glyphs, value);}
    public java.lang.foreign.MemorySegment $glyphs() {return this._ptr.asSlice(OFFSET__glyphs, LAYOUT__glyphs);}

    public java.lang.foreign.MemorySegment fallback() {return this._ptr.get(LAYOUT__fallback, OFFSET__fallback);}
    public void fallback(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT__fallback, OFFSET__fallback, value);}
    public java.lang.foreign.MemorySegment $fallback() {return this._ptr.asSlice(OFFSET__fallback, LAYOUT__fallback);}

    public int fallback_codepoint() {return this._ptr.get(LAYOUT__fallback_codepoint, OFFSET__fallback_codepoint);}
    public void fallback_codepoint(int value) {this._ptr.set(LAYOUT__fallback_codepoint, OFFSET__fallback_codepoint, value);}
    public java.lang.foreign.MemorySegment $fallback_codepoint() {return this._ptr.asSlice(OFFSET__fallback_codepoint, LAYOUT__fallback_codepoint);}

    public nuklear.nk_handle texture() {return new nuklear.nk_handle(this._ptr.asSlice(OFFSET__texture, LAYOUT__texture));}
    public void texture(java.util.function.Consumer<nuklear.nk_handle> consumer) {consumer.accept(this.texture());}
    public void texture(nuklear.nk_handle value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__texture, LAYOUT__texture.byteSize());}

    public java.lang.foreign.MemorySegment config() {return this._ptr.get(LAYOUT__config, OFFSET__config);}
    public void config(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT__config, OFFSET__config, value);}
    public java.lang.foreign.MemorySegment $config() {return this._ptr.asSlice(OFFSET__config, LAYOUT__config);}
}
