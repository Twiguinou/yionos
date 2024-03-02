package nuklear;

public record nk_row_layout(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$type = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$type = 0L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$index = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$index = 4L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$height = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$height = 8L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$min_height = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$min_height = 12L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$columns = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$columns = 16L;
    public static final java.lang.foreign.AddressLayout LAYOUT$ratio = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$ratio = 24L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$item_width = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$item_width = 32L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$item_height = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$item_height = 36L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$item_offset = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$item_offset = 40L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$filled = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$filled = 44L;
    public static final java.lang.foreign.GroupLayout LAYOUT$item = nuklear.nk_rect.gStructLayout;
    public static final long OFFSET$item = 48L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$tree_depth = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$tree_depth = 64L;
    public static final java.lang.foreign.SequenceLayout LAYOUT$templates = java.lang.foreign.MemoryLayout.sequenceLayout(16, java.lang.foreign.ValueLayout.JAVA_FLOAT);
    public static final long OFFSET$templates = 68L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$type,
            LAYOUT$index,
            LAYOUT$height,
            LAYOUT$min_height,
            LAYOUT$columns,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$ratio,
            LAYOUT$item_width,
            LAYOUT$item_height,
            LAYOUT$item_offset,
            LAYOUT$filled,
            LAYOUT$item,
            LAYOUT$tree_depth,
            LAYOUT$templates,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("nk_row_layout");

    public nk_row_layout(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static nk_row_layout getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new nk_row_layout(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int type() {return this._ptr.get(LAYOUT$type, OFFSET$type);}
    public void type(int value) {this._ptr.set(LAYOUT$type, OFFSET$type, value);}
    public java.lang.foreign.MemorySegment type_ptr() {return this._ptr.asSlice(OFFSET$type, LAYOUT$type);}

    public int index() {return this._ptr.get(LAYOUT$index, OFFSET$index);}
    public void index(int value) {this._ptr.set(LAYOUT$index, OFFSET$index, value);}
    public java.lang.foreign.MemorySegment index_ptr() {return this._ptr.asSlice(OFFSET$index, LAYOUT$index);}

    public float height() {return this._ptr.get(LAYOUT$height, OFFSET$height);}
    public void height(float value) {this._ptr.set(LAYOUT$height, OFFSET$height, value);}
    public java.lang.foreign.MemorySegment height_ptr() {return this._ptr.asSlice(OFFSET$height, LAYOUT$height);}

    public float min_height() {return this._ptr.get(LAYOUT$min_height, OFFSET$min_height);}
    public void min_height(float value) {this._ptr.set(LAYOUT$min_height, OFFSET$min_height, value);}
    public java.lang.foreign.MemorySegment min_height_ptr() {return this._ptr.asSlice(OFFSET$min_height, LAYOUT$min_height);}

    public int columns() {return this._ptr.get(LAYOUT$columns, OFFSET$columns);}
    public void columns(int value) {this._ptr.set(LAYOUT$columns, OFFSET$columns, value);}
    public java.lang.foreign.MemorySegment columns_ptr() {return this._ptr.asSlice(OFFSET$columns, LAYOUT$columns);}

    public java.lang.foreign.MemorySegment ratio() {return this._ptr.get(LAYOUT$ratio, OFFSET$ratio);}
    public void ratio(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT$ratio, OFFSET$ratio, value);}
    public java.lang.foreign.MemorySegment ratio_ptr() {return this._ptr.asSlice(OFFSET$ratio, LAYOUT$ratio);}

    public float item_width() {return this._ptr.get(LAYOUT$item_width, OFFSET$item_width);}
    public void item_width(float value) {this._ptr.set(LAYOUT$item_width, OFFSET$item_width, value);}
    public java.lang.foreign.MemorySegment item_width_ptr() {return this._ptr.asSlice(OFFSET$item_width, LAYOUT$item_width);}

    public float item_height() {return this._ptr.get(LAYOUT$item_height, OFFSET$item_height);}
    public void item_height(float value) {this._ptr.set(LAYOUT$item_height, OFFSET$item_height, value);}
    public java.lang.foreign.MemorySegment item_height_ptr() {return this._ptr.asSlice(OFFSET$item_height, LAYOUT$item_height);}

    public float item_offset() {return this._ptr.get(LAYOUT$item_offset, OFFSET$item_offset);}
    public void item_offset(float value) {this._ptr.set(LAYOUT$item_offset, OFFSET$item_offset, value);}
    public java.lang.foreign.MemorySegment item_offset_ptr() {return this._ptr.asSlice(OFFSET$item_offset, LAYOUT$item_offset);}

    public float filled() {return this._ptr.get(LAYOUT$filled, OFFSET$filled);}
    public void filled(float value) {this._ptr.set(LAYOUT$filled, OFFSET$filled, value);}
    public java.lang.foreign.MemorySegment filled_ptr() {return this._ptr.asSlice(OFFSET$filled, LAYOUT$filled);}

    public nuklear.nk_rect item() {return new nuklear.nk_rect(this._ptr.asSlice(OFFSET$item, LAYOUT$item));}
    public void item(java.util.function.Consumer<nuklear.nk_rect> consumer) {consumer.accept(this.item());}
    public void item(nuklear.nk_rect value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$item, LAYOUT$item.byteSize());}

    public int tree_depth() {return this._ptr.get(LAYOUT$tree_depth, OFFSET$tree_depth);}
    public void tree_depth(int value) {this._ptr.set(LAYOUT$tree_depth, OFFSET$tree_depth, value);}
    public java.lang.foreign.MemorySegment tree_depth_ptr() {return this._ptr.asSlice(OFFSET$tree_depth, LAYOUT$tree_depth);}

    public java.lang.foreign.MemorySegment templates() {return this._ptr.asSlice(OFFSET$templates, LAYOUT$templates);}
    public float templates(int i) {return this.templates().getAtIndex(java.lang.foreign.ValueLayout.JAVA_FLOAT, i);}
    public void templates(int i, float value) {this.templates().setAtIndex(java.lang.foreign.ValueLayout.JAVA_FLOAT, i, value);}
}
