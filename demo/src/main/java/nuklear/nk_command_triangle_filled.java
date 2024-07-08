package nuklear;

public record nk_command_triangle_filled(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT__header = nuklear.nk_command.gRecordLayout.withName("header");
    public static final long OFFSET__header = 0;
    public static final java.lang.foreign.StructLayout LAYOUT__a = nuklear.nk_vec2i.gRecordLayout.withName("a");
    public static final long OFFSET__a = 16;
    public static final java.lang.foreign.StructLayout LAYOUT__b = nuklear.nk_vec2i.gRecordLayout.withName("b");
    public static final long OFFSET__b = 20;
    public static final java.lang.foreign.StructLayout LAYOUT__c = nuklear.nk_vec2i.gRecordLayout.withName("c");
    public static final long OFFSET__c = 24;
    public static final java.lang.foreign.StructLayout LAYOUT__color = nuklear.nk_color.gRecordLayout.withName("color");
    public static final long OFFSET__color = 28;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__header,
            LAYOUT__a,
            LAYOUT__b,
            LAYOUT__c,
            LAYOUT__color
    ).withByteAlignment(8).withName("nk_command_triangle_filled");

    public nk_command_triangle_filled(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static nk_command_triangle_filled getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new nk_command_triangle_filled(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, nk_command_triangle_filled value)
    {
        java.lang.foreign.MemorySegment.copy(value._ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public nuklear.nk_command header() {return new nuklear.nk_command(this._ptr.asSlice(OFFSET__header, LAYOUT__header));}
    public void header(java.util.function.Consumer<nuklear.nk_command> consumer) {consumer.accept(this.header());}
    public void header(nuklear.nk_command value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__header, LAYOUT__header.byteSize());}

    public nuklear.nk_vec2i a() {return new nuklear.nk_vec2i(this._ptr.asSlice(OFFSET__a, LAYOUT__a));}
    public void a(java.util.function.Consumer<nuklear.nk_vec2i> consumer) {consumer.accept(this.a());}
    public void a(nuklear.nk_vec2i value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__a, LAYOUT__a.byteSize());}

    public nuklear.nk_vec2i b() {return new nuklear.nk_vec2i(this._ptr.asSlice(OFFSET__b, LAYOUT__b));}
    public void b(java.util.function.Consumer<nuklear.nk_vec2i> consumer) {consumer.accept(this.b());}
    public void b(nuklear.nk_vec2i value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__b, LAYOUT__b.byteSize());}

    public nuklear.nk_vec2i c() {return new nuklear.nk_vec2i(this._ptr.asSlice(OFFSET__c, LAYOUT__c));}
    public void c(java.util.function.Consumer<nuklear.nk_vec2i> consumer) {consumer.accept(this.c());}
    public void c(nuklear.nk_vec2i value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__c, LAYOUT__c.byteSize());}

    public nuklear.nk_color color() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET__color, LAYOUT__color));}
    public void color(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.color());}
    public void color(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__color, LAYOUT__color.byteSize());}
}
