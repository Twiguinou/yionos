package vulkan;

public record StdVideoH264HrdParameters(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__cpb_cnt_minus1 = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__cpb_cnt_minus1 = 0;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__bit_rate_scale = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__bit_rate_scale = 1;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__cpb_size_scale = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__cpb_size_scale = 2;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__reserved1 = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__reserved1 = 3;
    public static final java.lang.foreign.SequenceLayout LAYOUT__bit_rate_value_minus1 = java.lang.foreign.MemoryLayout.sequenceLayout(32, java.lang.foreign.ValueLayout.JAVA_INT);
    public static final long OFFSET__bit_rate_value_minus1 = 4;
    public static final java.lang.foreign.SequenceLayout LAYOUT__cpb_size_value_minus1 = java.lang.foreign.MemoryLayout.sequenceLayout(32, java.lang.foreign.ValueLayout.JAVA_INT);
    public static final long OFFSET__cpb_size_value_minus1 = 132;
    public static final java.lang.foreign.SequenceLayout LAYOUT__cbr_flag = java.lang.foreign.MemoryLayout.sequenceLayout(32, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET__cbr_flag = 260;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__initial_cpb_removal_delay_length_minus1 = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__initial_cpb_removal_delay_length_minus1 = 292;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__cpb_removal_delay_length_minus1 = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__cpb_removal_delay_length_minus1 = 296;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__dpb_output_delay_length_minus1 = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__dpb_output_delay_length_minus1 = 300;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__time_offset_length = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__time_offset_length = 304;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__cpb_cnt_minus1,
            LAYOUT__bit_rate_scale,
            LAYOUT__cpb_size_scale,
            LAYOUT__reserved1,
            LAYOUT__bit_rate_value_minus1,
            LAYOUT__cpb_size_value_minus1,
            LAYOUT__cbr_flag,
            LAYOUT__initial_cpb_removal_delay_length_minus1,
            LAYOUT__cpb_removal_delay_length_minus1,
            LAYOUT__dpb_output_delay_length_minus1,
            LAYOUT__time_offset_length
    ).withByteAlignment(4).withName("StdVideoH264HrdParameters");

    public StdVideoH264HrdParameters(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static StdVideoH264HrdParameters getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new StdVideoH264HrdParameters(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, StdVideoH264HrdParameters value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public byte cpb_cnt_minus1() {return this.ptr.get(LAYOUT__cpb_cnt_minus1, OFFSET__cpb_cnt_minus1);}
    public void cpb_cnt_minus1(byte value) {this.ptr.set(LAYOUT__cpb_cnt_minus1, OFFSET__cpb_cnt_minus1, value);}
    public java.lang.foreign.MemorySegment $cpb_cnt_minus1() {return this.ptr.asSlice(OFFSET__cpb_cnt_minus1, LAYOUT__cpb_cnt_minus1);}

    public byte bit_rate_scale() {return this.ptr.get(LAYOUT__bit_rate_scale, OFFSET__bit_rate_scale);}
    public void bit_rate_scale(byte value) {this.ptr.set(LAYOUT__bit_rate_scale, OFFSET__bit_rate_scale, value);}
    public java.lang.foreign.MemorySegment $bit_rate_scale() {return this.ptr.asSlice(OFFSET__bit_rate_scale, LAYOUT__bit_rate_scale);}

    public byte cpb_size_scale() {return this.ptr.get(LAYOUT__cpb_size_scale, OFFSET__cpb_size_scale);}
    public void cpb_size_scale(byte value) {this.ptr.set(LAYOUT__cpb_size_scale, OFFSET__cpb_size_scale, value);}
    public java.lang.foreign.MemorySegment $cpb_size_scale() {return this.ptr.asSlice(OFFSET__cpb_size_scale, LAYOUT__cpb_size_scale);}

    public byte reserved1() {return this.ptr.get(LAYOUT__reserved1, OFFSET__reserved1);}
    public void reserved1(byte value) {this.ptr.set(LAYOUT__reserved1, OFFSET__reserved1, value);}
    public java.lang.foreign.MemorySegment $reserved1() {return this.ptr.asSlice(OFFSET__reserved1, LAYOUT__reserved1);}

    public java.lang.foreign.MemorySegment bit_rate_value_minus1() {return this.ptr.asSlice(OFFSET__bit_rate_value_minus1, LAYOUT__bit_rate_value_minus1);}
    public int bit_rate_value_minus1(int index) {return this.bit_rate_value_minus1().getAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, index);}
    public void bit_rate_value_minus1(int index, int value) {this.bit_rate_value_minus1().setAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, index, value);}

    public java.lang.foreign.MemorySegment cpb_size_value_minus1() {return this.ptr.asSlice(OFFSET__cpb_size_value_minus1, LAYOUT__cpb_size_value_minus1);}
    public int cpb_size_value_minus1(int index) {return this.cpb_size_value_minus1().getAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, index);}
    public void cpb_size_value_minus1(int index, int value) {this.cpb_size_value_minus1().setAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, index, value);}

    public java.lang.foreign.MemorySegment cbr_flag() {return this.ptr.asSlice(OFFSET__cbr_flag, LAYOUT__cbr_flag);}
    public byte cbr_flag(int index) {return this.cbr_flag().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index);}
    public void cbr_flag(int index, byte value) {this.cbr_flag().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index, value);}

    public int initial_cpb_removal_delay_length_minus1() {return this.ptr.get(LAYOUT__initial_cpb_removal_delay_length_minus1, OFFSET__initial_cpb_removal_delay_length_minus1);}
    public void initial_cpb_removal_delay_length_minus1(int value) {this.ptr.set(LAYOUT__initial_cpb_removal_delay_length_minus1, OFFSET__initial_cpb_removal_delay_length_minus1, value);}
    public java.lang.foreign.MemorySegment $initial_cpb_removal_delay_length_minus1() {return this.ptr.asSlice(OFFSET__initial_cpb_removal_delay_length_minus1, LAYOUT__initial_cpb_removal_delay_length_minus1);}

    public int cpb_removal_delay_length_minus1() {return this.ptr.get(LAYOUT__cpb_removal_delay_length_minus1, OFFSET__cpb_removal_delay_length_minus1);}
    public void cpb_removal_delay_length_minus1(int value) {this.ptr.set(LAYOUT__cpb_removal_delay_length_minus1, OFFSET__cpb_removal_delay_length_minus1, value);}
    public java.lang.foreign.MemorySegment $cpb_removal_delay_length_minus1() {return this.ptr.asSlice(OFFSET__cpb_removal_delay_length_minus1, LAYOUT__cpb_removal_delay_length_minus1);}

    public int dpb_output_delay_length_minus1() {return this.ptr.get(LAYOUT__dpb_output_delay_length_minus1, OFFSET__dpb_output_delay_length_minus1);}
    public void dpb_output_delay_length_minus1(int value) {this.ptr.set(LAYOUT__dpb_output_delay_length_minus1, OFFSET__dpb_output_delay_length_minus1, value);}
    public java.lang.foreign.MemorySegment $dpb_output_delay_length_minus1() {return this.ptr.asSlice(OFFSET__dpb_output_delay_length_minus1, LAYOUT__dpb_output_delay_length_minus1);}

    public int time_offset_length() {return this.ptr.get(LAYOUT__time_offset_length, OFFSET__time_offset_length);}
    public void time_offset_length(int value) {this.ptr.set(LAYOUT__time_offset_length, OFFSET__time_offset_length, value);}
    public java.lang.foreign.MemorySegment $time_offset_length() {return this.ptr.asSlice(OFFSET__time_offset_length, LAYOUT__time_offset_length);}
}
