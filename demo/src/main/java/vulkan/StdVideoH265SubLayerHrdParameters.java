package vulkan;

public record StdVideoH265SubLayerHrdParameters(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.SequenceLayout LAYOUT__bit_rate_value_minus1 = java.lang.foreign.MemoryLayout.sequenceLayout(32, java.lang.foreign.ValueLayout.JAVA_INT);
    public static final long OFFSET__bit_rate_value_minus1 = 0;
    public static final java.lang.foreign.SequenceLayout LAYOUT__cpb_size_value_minus1 = java.lang.foreign.MemoryLayout.sequenceLayout(32, java.lang.foreign.ValueLayout.JAVA_INT);
    public static final long OFFSET__cpb_size_value_minus1 = 128;
    public static final java.lang.foreign.SequenceLayout LAYOUT__cpb_size_du_value_minus1 = java.lang.foreign.MemoryLayout.sequenceLayout(32, java.lang.foreign.ValueLayout.JAVA_INT);
    public static final long OFFSET__cpb_size_du_value_minus1 = 256;
    public static final java.lang.foreign.SequenceLayout LAYOUT__bit_rate_du_value_minus1 = java.lang.foreign.MemoryLayout.sequenceLayout(32, java.lang.foreign.ValueLayout.JAVA_INT);
    public static final long OFFSET__bit_rate_du_value_minus1 = 384;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__cbr_flag = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__cbr_flag = 512;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__bit_rate_value_minus1,
            LAYOUT__cpb_size_value_minus1,
            LAYOUT__cpb_size_du_value_minus1,
            LAYOUT__bit_rate_du_value_minus1,
            LAYOUT__cbr_flag
    ).withByteAlignment(4).withName("StdVideoH265SubLayerHrdParameters");

    public StdVideoH265SubLayerHrdParameters(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static StdVideoH265SubLayerHrdParameters getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new StdVideoH265SubLayerHrdParameters(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, StdVideoH265SubLayerHrdParameters value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public java.lang.foreign.MemorySegment bit_rate_value_minus1() {return this.ptr.asSlice(OFFSET__bit_rate_value_minus1, LAYOUT__bit_rate_value_minus1);}
    public int bit_rate_value_minus1(int index) {return this.bit_rate_value_minus1().getAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, index);}
    public void bit_rate_value_minus1(int index, int value) {this.bit_rate_value_minus1().setAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, index, value);}

    public java.lang.foreign.MemorySegment cpb_size_value_minus1() {return this.ptr.asSlice(OFFSET__cpb_size_value_minus1, LAYOUT__cpb_size_value_minus1);}
    public int cpb_size_value_minus1(int index) {return this.cpb_size_value_minus1().getAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, index);}
    public void cpb_size_value_minus1(int index, int value) {this.cpb_size_value_minus1().setAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, index, value);}

    public java.lang.foreign.MemorySegment cpb_size_du_value_minus1() {return this.ptr.asSlice(OFFSET__cpb_size_du_value_minus1, LAYOUT__cpb_size_du_value_minus1);}
    public int cpb_size_du_value_minus1(int index) {return this.cpb_size_du_value_minus1().getAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, index);}
    public void cpb_size_du_value_minus1(int index, int value) {this.cpb_size_du_value_minus1().setAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, index, value);}

    public java.lang.foreign.MemorySegment bit_rate_du_value_minus1() {return this.ptr.asSlice(OFFSET__bit_rate_du_value_minus1, LAYOUT__bit_rate_du_value_minus1);}
    public int bit_rate_du_value_minus1(int index) {return this.bit_rate_du_value_minus1().getAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, index);}
    public void bit_rate_du_value_minus1(int index, int value) {this.bit_rate_du_value_minus1().setAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, index, value);}

    public int cbr_flag() {return this.ptr.get(LAYOUT__cbr_flag, OFFSET__cbr_flag);}
    public void cbr_flag(int value) {this.ptr.set(LAYOUT__cbr_flag, OFFSET__cbr_flag, value);}
    public java.lang.foreign.MemorySegment $cbr_flag() {return this.ptr.asSlice(OFFSET__cbr_flag, LAYOUT__cbr_flag);}
}
