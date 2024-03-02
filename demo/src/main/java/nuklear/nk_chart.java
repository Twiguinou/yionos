package nuklear;

public record nk_chart(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$slot = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$slot = 0L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$x = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$x = 4L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$y = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$y = 8L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$w = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$w = 12L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$h = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$h = 16L;
    public static final java.lang.foreign.SequenceLayout LAYOUT$slots = java.lang.foreign.MemoryLayout.sequenceLayout(4, nuklear.nk_chart_slot.gStructLayout);
    public static final long OFFSET$slots = 20L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$slot,
            LAYOUT$x,
            LAYOUT$y,
            LAYOUT$w,
            LAYOUT$h,
            LAYOUT$slots
    ).withName("nk_chart");

    public nk_chart(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static nk_chart getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new nk_chart(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int slot() {return this._ptr.get(LAYOUT$slot, OFFSET$slot);}
    public void slot(int value) {this._ptr.set(LAYOUT$slot, OFFSET$slot, value);}
    public java.lang.foreign.MemorySegment slot_ptr() {return this._ptr.asSlice(OFFSET$slot, LAYOUT$slot);}

    public float x() {return this._ptr.get(LAYOUT$x, OFFSET$x);}
    public void x(float value) {this._ptr.set(LAYOUT$x, OFFSET$x, value);}
    public java.lang.foreign.MemorySegment x_ptr() {return this._ptr.asSlice(OFFSET$x, LAYOUT$x);}

    public float y() {return this._ptr.get(LAYOUT$y, OFFSET$y);}
    public void y(float value) {this._ptr.set(LAYOUT$y, OFFSET$y, value);}
    public java.lang.foreign.MemorySegment y_ptr() {return this._ptr.asSlice(OFFSET$y, LAYOUT$y);}

    public float w() {return this._ptr.get(LAYOUT$w, OFFSET$w);}
    public void w(float value) {this._ptr.set(LAYOUT$w, OFFSET$w, value);}
    public java.lang.foreign.MemorySegment w_ptr() {return this._ptr.asSlice(OFFSET$w, LAYOUT$w);}

    public float h() {return this._ptr.get(LAYOUT$h, OFFSET$h);}
    public void h(float value) {this._ptr.set(LAYOUT$h, OFFSET$h, value);}
    public java.lang.foreign.MemorySegment h_ptr() {return this._ptr.asSlice(OFFSET$h, LAYOUT$h);}

    public java.lang.foreign.MemorySegment slots() {return this._ptr.asSlice(OFFSET$slots, LAYOUT$slots);}
    public nuklear.nk_chart_slot slots(int i) {return new nuklear.nk_chart_slot(this._ptr.asSlice(OFFSET$slots + i * LAYOUT$slots.byteSize(), LAYOUT$slots));}
    public void slots(int i, java.util.function.Consumer<nuklear.nk_chart_slot> consumer) {consumer.accept(this.slots(i));}
    public void slots(int i, nuklear.nk_chart_slot value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$slots + i * LAYOUT$slots.byteSize(), LAYOUT$slots.byteSize());}
}
