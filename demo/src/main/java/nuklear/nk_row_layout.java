package nuklear;

public record nk_row_layout(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__type = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__type = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__index = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__index = 4;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__height = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET__height = 8;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__min_height = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET__min_height = 12;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__columns = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__columns = 16;
    public static final java.lang.foreign.AddressLayout LAYOUT__ratio = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__ratio = 24;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__item_width = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET__item_width = 32;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__item_height = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET__item_height = 36;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__item_offset = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET__item_offset = 40;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__filled = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET__filled = 44;
    public static final java.lang.foreign.StructLayout LAYOUT__item = nuklear.nk_rect.gRecordLayout;
    public static final long OFFSET__item = 48;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__tree_depth = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__tree_depth = 64;
    public static final java.lang.foreign.SequenceLayout LAYOUT__templates = java.lang.foreign.MemoryLayout.sequenceLayout(16, java.lang.foreign.ValueLayout.JAVA_FLOAT);
    public static final long OFFSET__templates = 68;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__type,
            LAYOUT__index,
            LAYOUT__height,
            LAYOUT__min_height,
            LAYOUT__columns,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__ratio,
            LAYOUT__item_width,
            LAYOUT__item_height,
            LAYOUT__item_offset,
            LAYOUT__filled,
            LAYOUT__item,
            LAYOUT__tree_depth,
            LAYOUT__templates,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("nk_row_layout");

    public nk_row_layout(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static nk_row_layout getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new nk_row_layout(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, nk_row_layout value)
    {
        java.lang.foreign.MemorySegment.copy(value._ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int type() {return this._ptr.get(LAYOUT__type, OFFSET__type);}
    public void type(int value) {this._ptr.set(LAYOUT__type, OFFSET__type, value);}
    public java.lang.foreign.MemorySegment $type() {return this._ptr.asSlice(OFFSET__type, LAYOUT__type);}

    public int index() {return this._ptr.get(LAYOUT__index, OFFSET__index);}
    public void index(int value) {this._ptr.set(LAYOUT__index, OFFSET__index, value);}
    public java.lang.foreign.MemorySegment $index() {return this._ptr.asSlice(OFFSET__index, LAYOUT__index);}

    public float height() {return this._ptr.get(LAYOUT__height, OFFSET__height);}
    public void height(float value) {this._ptr.set(LAYOUT__height, OFFSET__height, value);}
    public java.lang.foreign.MemorySegment $height() {return this._ptr.asSlice(OFFSET__height, LAYOUT__height);}

    public float min_height() {return this._ptr.get(LAYOUT__min_height, OFFSET__min_height);}
    public void min_height(float value) {this._ptr.set(LAYOUT__min_height, OFFSET__min_height, value);}
    public java.lang.foreign.MemorySegment $min_height() {return this._ptr.asSlice(OFFSET__min_height, LAYOUT__min_height);}

    public int columns() {return this._ptr.get(LAYOUT__columns, OFFSET__columns);}
    public void columns(int value) {this._ptr.set(LAYOUT__columns, OFFSET__columns, value);}
    public java.lang.foreign.MemorySegment $columns() {return this._ptr.asSlice(OFFSET__columns, LAYOUT__columns);}

    public java.lang.foreign.MemorySegment ratio() {return this._ptr.get(LAYOUT__ratio, OFFSET__ratio);}
    public void ratio(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT__ratio, OFFSET__ratio, value);}
    public java.lang.foreign.MemorySegment $ratio() {return this._ptr.asSlice(OFFSET__ratio, LAYOUT__ratio);}

    public float item_width() {return this._ptr.get(LAYOUT__item_width, OFFSET__item_width);}
    public void item_width(float value) {this._ptr.set(LAYOUT__item_width, OFFSET__item_width, value);}
    public java.lang.foreign.MemorySegment $item_width() {return this._ptr.asSlice(OFFSET__item_width, LAYOUT__item_width);}

    public float item_height() {return this._ptr.get(LAYOUT__item_height, OFFSET__item_height);}
    public void item_height(float value) {this._ptr.set(LAYOUT__item_height, OFFSET__item_height, value);}
    public java.lang.foreign.MemorySegment $item_height() {return this._ptr.asSlice(OFFSET__item_height, LAYOUT__item_height);}

    public float item_offset() {return this._ptr.get(LAYOUT__item_offset, OFFSET__item_offset);}
    public void item_offset(float value) {this._ptr.set(LAYOUT__item_offset, OFFSET__item_offset, value);}
    public java.lang.foreign.MemorySegment $item_offset() {return this._ptr.asSlice(OFFSET__item_offset, LAYOUT__item_offset);}

    public float filled() {return this._ptr.get(LAYOUT__filled, OFFSET__filled);}
    public void filled(float value) {this._ptr.set(LAYOUT__filled, OFFSET__filled, value);}
    public java.lang.foreign.MemorySegment $filled() {return this._ptr.asSlice(OFFSET__filled, LAYOUT__filled);}

    public nuklear.nk_rect item() {return new nuklear.nk_rect(this._ptr.asSlice(OFFSET__item, LAYOUT__item));}
    public void item(java.util.function.Consumer<nuklear.nk_rect> consumer) {consumer.accept(this.item());}
    public void item(nuklear.nk_rect value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__item, LAYOUT__item.byteSize());}

    public int tree_depth() {return this._ptr.get(LAYOUT__tree_depth, OFFSET__tree_depth);}
    public void tree_depth(int value) {this._ptr.set(LAYOUT__tree_depth, OFFSET__tree_depth, value);}
    public java.lang.foreign.MemorySegment $tree_depth() {return this._ptr.asSlice(OFFSET__tree_depth, LAYOUT__tree_depth);}

    public java.lang.foreign.MemorySegment templates() {return this._ptr.asSlice(OFFSET__templates, LAYOUT__templates);}
    public float templates(int index) {return this.templates().getAtIndex(java.lang.foreign.ValueLayout.JAVA_FLOAT, index);}
    public void templates(int index, float value) {this.templates().setAtIndex(java.lang.foreign.ValueLayout.JAVA_FLOAT, index, value);}
}
