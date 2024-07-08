package nuklear;

public record nk_chart(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__slot = java.lang.foreign.ValueLayout.JAVA_INT.withName("slot");
    public static final long OFFSET__slot = 0;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__x = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("x");
    public static final long OFFSET__x = 4;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__y = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("y");
    public static final long OFFSET__y = 8;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__w = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("w");
    public static final long OFFSET__w = 12;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__h = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("h");
    public static final long OFFSET__h = 16;
    public static final java.lang.foreign.SequenceLayout LAYOUT__slots = java.lang.foreign.MemoryLayout.sequenceLayout(4, nuklear.nk_chart_slot.gRecordLayout).withName("slots");
    public static final long OFFSET__slots = 20;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__slot,
            LAYOUT__x,
            LAYOUT__y,
            LAYOUT__w,
            LAYOUT__h,
            LAYOUT__slots
    ).withByteAlignment(4).withName("nk_chart");

    public nk_chart(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static nk_chart getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new nk_chart(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, nk_chart value)
    {
        java.lang.foreign.MemorySegment.copy(value._ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int slot() {return this._ptr.get(LAYOUT__slot, OFFSET__slot);}
    public void slot(int value) {this._ptr.set(LAYOUT__slot, OFFSET__slot, value);}
    public java.lang.foreign.MemorySegment $slot() {return this._ptr.asSlice(OFFSET__slot, LAYOUT__slot);}

    public float x() {return this._ptr.get(LAYOUT__x, OFFSET__x);}
    public void x(float value) {this._ptr.set(LAYOUT__x, OFFSET__x, value);}
    public java.lang.foreign.MemorySegment $x() {return this._ptr.asSlice(OFFSET__x, LAYOUT__x);}

    public float y() {return this._ptr.get(LAYOUT__y, OFFSET__y);}
    public void y(float value) {this._ptr.set(LAYOUT__y, OFFSET__y, value);}
    public java.lang.foreign.MemorySegment $y() {return this._ptr.asSlice(OFFSET__y, LAYOUT__y);}

    public float w() {return this._ptr.get(LAYOUT__w, OFFSET__w);}
    public void w(float value) {this._ptr.set(LAYOUT__w, OFFSET__w, value);}
    public java.lang.foreign.MemorySegment $w() {return this._ptr.asSlice(OFFSET__w, LAYOUT__w);}

    public float h() {return this._ptr.get(LAYOUT__h, OFFSET__h);}
    public void h(float value) {this._ptr.set(LAYOUT__h, OFFSET__h, value);}
    public java.lang.foreign.MemorySegment $h() {return this._ptr.asSlice(OFFSET__h, LAYOUT__h);}

    public java.lang.foreign.MemorySegment slots() {return this._ptr.asSlice(OFFSET__slots, LAYOUT__slots);}
    public nuklear.nk_chart_slot slots(int index) {return nuklear.nk_chart_slot.getAtIndex(this.slots(), index);}
    public void slots(int index, java.util.function.Consumer<nuklear.nk_chart_slot> consumer) {consumer.accept(this.slots(index));}
    public void slots(int index, nuklear.nk_chart_slot value) {nuklear.nk_chart_slot.setAtIndex(this.slots(), index, value);}
}
