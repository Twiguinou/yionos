package nuklear;

public record nk_font(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.AddressLayout LAYOUT$next = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$next = 0L;
    public static final java.lang.foreign.GroupLayout LAYOUT$handle = nuklear.nk_user_font.gStructLayout;
    public static final long OFFSET$handle = 8L;
    public static final java.lang.foreign.GroupLayout LAYOUT$info = nuklear.nk_baked_font.gStructLayout;
    public static final long OFFSET$info = 48L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$scale = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$scale = 80L;
    public static final java.lang.foreign.AddressLayout LAYOUT$glyphs = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$glyphs = 88L;
    public static final java.lang.foreign.AddressLayout LAYOUT$fallback = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$fallback = 96L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$fallback_codepoint = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$fallback_codepoint = 104L;
    public static final java.lang.foreign.GroupLayout LAYOUT$texture = nuklear.nk_handle.gStructLayout;
    public static final long OFFSET$texture = 112L;
    public static final java.lang.foreign.AddressLayout LAYOUT$config = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$config = 120L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$next,
            LAYOUT$handle,
            LAYOUT$info,
            LAYOUT$scale,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$glyphs,
            LAYOUT$fallback,
            LAYOUT$fallback_codepoint,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$texture,
            LAYOUT$config
    ).withName("nk_font");

    public nk_font(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static nk_font getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new nk_font(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public java.lang.foreign.MemorySegment next() {return this._ptr.get(LAYOUT$next, OFFSET$next);}
    public void next(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT$next, OFFSET$next, value);}
    public java.lang.foreign.MemorySegment next_ptr() {return this._ptr.asSlice(OFFSET$next, LAYOUT$next);}

    public nuklear.nk_user_font handle() {return new nuklear.nk_user_font(this._ptr.asSlice(OFFSET$handle, LAYOUT$handle));}
    public void handle(java.util.function.Consumer<nuklear.nk_user_font> consumer) {consumer.accept(this.handle());}
    public void handle(nuklear.nk_user_font value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$handle, LAYOUT$handle.byteSize());}

    public nuklear.nk_baked_font info() {return new nuklear.nk_baked_font(this._ptr.asSlice(OFFSET$info, LAYOUT$info));}
    public void info(java.util.function.Consumer<nuklear.nk_baked_font> consumer) {consumer.accept(this.info());}
    public void info(nuklear.nk_baked_font value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$info, LAYOUT$info.byteSize());}

    public float scale() {return this._ptr.get(LAYOUT$scale, OFFSET$scale);}
    public void scale(float value) {this._ptr.set(LAYOUT$scale, OFFSET$scale, value);}
    public java.lang.foreign.MemorySegment scale_ptr() {return this._ptr.asSlice(OFFSET$scale, LAYOUT$scale);}

    public java.lang.foreign.MemorySegment glyphs() {return this._ptr.get(LAYOUT$glyphs, OFFSET$glyphs);}
    public void glyphs(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT$glyphs, OFFSET$glyphs, value);}
    public java.lang.foreign.MemorySegment glyphs_ptr() {return this._ptr.asSlice(OFFSET$glyphs, LAYOUT$glyphs);}

    public java.lang.foreign.MemorySegment fallback() {return this._ptr.get(LAYOUT$fallback, OFFSET$fallback);}
    public void fallback(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT$fallback, OFFSET$fallback, value);}
    public java.lang.foreign.MemorySegment fallback_ptr() {return this._ptr.asSlice(OFFSET$fallback, LAYOUT$fallback);}

    public int fallback_codepoint() {return this._ptr.get(LAYOUT$fallback_codepoint, OFFSET$fallback_codepoint);}
    public void fallback_codepoint(int value) {this._ptr.set(LAYOUT$fallback_codepoint, OFFSET$fallback_codepoint, value);}
    public java.lang.foreign.MemorySegment fallback_codepoint_ptr() {return this._ptr.asSlice(OFFSET$fallback_codepoint, LAYOUT$fallback_codepoint);}

    public nuklear.nk_handle texture() {return new nuklear.nk_handle(this._ptr.asSlice(OFFSET$texture, LAYOUT$texture));}
    public void texture(java.util.function.Consumer<nuklear.nk_handle> consumer) {consumer.accept(this.texture());}
    public void texture(nuklear.nk_handle value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$texture, LAYOUT$texture.byteSize());}

    public java.lang.foreign.MemorySegment config() {return this._ptr.get(LAYOUT$config, OFFSET$config);}
    public void config(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT$config, OFFSET$config, value);}
    public java.lang.foreign.MemorySegment config_ptr() {return this._ptr.asSlice(OFFSET$config, LAYOUT$config);}
}
