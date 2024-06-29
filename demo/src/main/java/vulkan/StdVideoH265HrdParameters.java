package vulkan;

public record StdVideoH265HrdParameters(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT__flags = vulkan.StdVideoH265HrdFlags.gRecordLayout;
    public static final long OFFSET__flags = 0;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__tick_divisor_minus2 = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__tick_divisor_minus2 = 4;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__du_cpb_removal_delay_increment_length_minus1 = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__du_cpb_removal_delay_increment_length_minus1 = 5;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__dpb_output_delay_du_length_minus1 = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__dpb_output_delay_du_length_minus1 = 6;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__bit_rate_scale = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__bit_rate_scale = 7;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__cpb_size_scale = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__cpb_size_scale = 8;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__cpb_size_du_scale = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__cpb_size_du_scale = 9;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__initial_cpb_removal_delay_length_minus1 = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__initial_cpb_removal_delay_length_minus1 = 10;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__au_cpb_removal_delay_length_minus1 = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__au_cpb_removal_delay_length_minus1 = 11;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__dpb_output_delay_length_minus1 = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__dpb_output_delay_length_minus1 = 12;
    public static final java.lang.foreign.SequenceLayout LAYOUT__cpb_cnt_minus1 = java.lang.foreign.MemoryLayout.sequenceLayout(7, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET__cpb_cnt_minus1 = 13;
    public static final java.lang.foreign.SequenceLayout LAYOUT__elemental_duration_in_tc_minus1 = java.lang.foreign.MemoryLayout.sequenceLayout(7, java.lang.foreign.ValueLayout.JAVA_SHORT);
    public static final long OFFSET__elemental_duration_in_tc_minus1 = 20;
    public static final java.lang.foreign.SequenceLayout LAYOUT__reserved = java.lang.foreign.MemoryLayout.sequenceLayout(3, java.lang.foreign.ValueLayout.JAVA_SHORT);
    public static final long OFFSET__reserved = 34;
    public static final java.lang.foreign.AddressLayout LAYOUT__pSubLayerHrdParametersNal = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pSubLayerHrdParametersNal = 40;
    public static final java.lang.foreign.AddressLayout LAYOUT__pSubLayerHrdParametersVcl = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pSubLayerHrdParametersVcl = 48;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__flags,
            LAYOUT__tick_divisor_minus2,
            LAYOUT__du_cpb_removal_delay_increment_length_minus1,
            LAYOUT__dpb_output_delay_du_length_minus1,
            LAYOUT__bit_rate_scale,
            LAYOUT__cpb_size_scale,
            LAYOUT__cpb_size_du_scale,
            LAYOUT__initial_cpb_removal_delay_length_minus1,
            LAYOUT__au_cpb_removal_delay_length_minus1,
            LAYOUT__dpb_output_delay_length_minus1,
            LAYOUT__cpb_cnt_minus1,
            LAYOUT__elemental_duration_in_tc_minus1,
            LAYOUT__reserved,
            LAYOUT__pSubLayerHrdParametersNal,
            LAYOUT__pSubLayerHrdParametersVcl
    ).withByteAlignment(8).withName("StdVideoH265HrdParameters");

    public StdVideoH265HrdParameters(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static StdVideoH265HrdParameters getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new StdVideoH265HrdParameters(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, StdVideoH265HrdParameters value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public vulkan.StdVideoH265HrdFlags flags() {return new vulkan.StdVideoH265HrdFlags(this.ptr.asSlice(OFFSET__flags, LAYOUT__flags));}
    public void flags(java.util.function.Consumer<vulkan.StdVideoH265HrdFlags> consumer) {consumer.accept(this.flags());}
    public void flags(vulkan.StdVideoH265HrdFlags value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__flags, LAYOUT__flags.byteSize());}

    public byte tick_divisor_minus2() {return this.ptr.get(LAYOUT__tick_divisor_minus2, OFFSET__tick_divisor_minus2);}
    public void tick_divisor_minus2(byte value) {this.ptr.set(LAYOUT__tick_divisor_minus2, OFFSET__tick_divisor_minus2, value);}
    public java.lang.foreign.MemorySegment $tick_divisor_minus2() {return this.ptr.asSlice(OFFSET__tick_divisor_minus2, LAYOUT__tick_divisor_minus2);}

    public byte du_cpb_removal_delay_increment_length_minus1() {return this.ptr.get(LAYOUT__du_cpb_removal_delay_increment_length_minus1, OFFSET__du_cpb_removal_delay_increment_length_minus1);}
    public void du_cpb_removal_delay_increment_length_minus1(byte value) {this.ptr.set(LAYOUT__du_cpb_removal_delay_increment_length_minus1, OFFSET__du_cpb_removal_delay_increment_length_minus1, value);}
    public java.lang.foreign.MemorySegment $du_cpb_removal_delay_increment_length_minus1() {return this.ptr.asSlice(OFFSET__du_cpb_removal_delay_increment_length_minus1, LAYOUT__du_cpb_removal_delay_increment_length_minus1);}

    public byte dpb_output_delay_du_length_minus1() {return this.ptr.get(LAYOUT__dpb_output_delay_du_length_minus1, OFFSET__dpb_output_delay_du_length_minus1);}
    public void dpb_output_delay_du_length_minus1(byte value) {this.ptr.set(LAYOUT__dpb_output_delay_du_length_minus1, OFFSET__dpb_output_delay_du_length_minus1, value);}
    public java.lang.foreign.MemorySegment $dpb_output_delay_du_length_minus1() {return this.ptr.asSlice(OFFSET__dpb_output_delay_du_length_minus1, LAYOUT__dpb_output_delay_du_length_minus1);}

    public byte bit_rate_scale() {return this.ptr.get(LAYOUT__bit_rate_scale, OFFSET__bit_rate_scale);}
    public void bit_rate_scale(byte value) {this.ptr.set(LAYOUT__bit_rate_scale, OFFSET__bit_rate_scale, value);}
    public java.lang.foreign.MemorySegment $bit_rate_scale() {return this.ptr.asSlice(OFFSET__bit_rate_scale, LAYOUT__bit_rate_scale);}

    public byte cpb_size_scale() {return this.ptr.get(LAYOUT__cpb_size_scale, OFFSET__cpb_size_scale);}
    public void cpb_size_scale(byte value) {this.ptr.set(LAYOUT__cpb_size_scale, OFFSET__cpb_size_scale, value);}
    public java.lang.foreign.MemorySegment $cpb_size_scale() {return this.ptr.asSlice(OFFSET__cpb_size_scale, LAYOUT__cpb_size_scale);}

    public byte cpb_size_du_scale() {return this.ptr.get(LAYOUT__cpb_size_du_scale, OFFSET__cpb_size_du_scale);}
    public void cpb_size_du_scale(byte value) {this.ptr.set(LAYOUT__cpb_size_du_scale, OFFSET__cpb_size_du_scale, value);}
    public java.lang.foreign.MemorySegment $cpb_size_du_scale() {return this.ptr.asSlice(OFFSET__cpb_size_du_scale, LAYOUT__cpb_size_du_scale);}

    public byte initial_cpb_removal_delay_length_minus1() {return this.ptr.get(LAYOUT__initial_cpb_removal_delay_length_minus1, OFFSET__initial_cpb_removal_delay_length_minus1);}
    public void initial_cpb_removal_delay_length_minus1(byte value) {this.ptr.set(LAYOUT__initial_cpb_removal_delay_length_minus1, OFFSET__initial_cpb_removal_delay_length_minus1, value);}
    public java.lang.foreign.MemorySegment $initial_cpb_removal_delay_length_minus1() {return this.ptr.asSlice(OFFSET__initial_cpb_removal_delay_length_minus1, LAYOUT__initial_cpb_removal_delay_length_minus1);}

    public byte au_cpb_removal_delay_length_minus1() {return this.ptr.get(LAYOUT__au_cpb_removal_delay_length_minus1, OFFSET__au_cpb_removal_delay_length_minus1);}
    public void au_cpb_removal_delay_length_minus1(byte value) {this.ptr.set(LAYOUT__au_cpb_removal_delay_length_minus1, OFFSET__au_cpb_removal_delay_length_minus1, value);}
    public java.lang.foreign.MemorySegment $au_cpb_removal_delay_length_minus1() {return this.ptr.asSlice(OFFSET__au_cpb_removal_delay_length_minus1, LAYOUT__au_cpb_removal_delay_length_minus1);}

    public byte dpb_output_delay_length_minus1() {return this.ptr.get(LAYOUT__dpb_output_delay_length_minus1, OFFSET__dpb_output_delay_length_minus1);}
    public void dpb_output_delay_length_minus1(byte value) {this.ptr.set(LAYOUT__dpb_output_delay_length_minus1, OFFSET__dpb_output_delay_length_minus1, value);}
    public java.lang.foreign.MemorySegment $dpb_output_delay_length_minus1() {return this.ptr.asSlice(OFFSET__dpb_output_delay_length_minus1, LAYOUT__dpb_output_delay_length_minus1);}

    public java.lang.foreign.MemorySegment cpb_cnt_minus1() {return this.ptr.asSlice(OFFSET__cpb_cnt_minus1, LAYOUT__cpb_cnt_minus1);}
    public byte cpb_cnt_minus1(int index) {return this.cpb_cnt_minus1().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index);}
    public void cpb_cnt_minus1(int index, byte value) {this.cpb_cnt_minus1().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index, value);}

    public java.lang.foreign.MemorySegment elemental_duration_in_tc_minus1() {return this.ptr.asSlice(OFFSET__elemental_duration_in_tc_minus1, LAYOUT__elemental_duration_in_tc_minus1);}
    public short elemental_duration_in_tc_minus1(int index) {return this.elemental_duration_in_tc_minus1().getAtIndex(java.lang.foreign.ValueLayout.JAVA_SHORT, index);}
    public void elemental_duration_in_tc_minus1(int index, short value) {this.elemental_duration_in_tc_minus1().setAtIndex(java.lang.foreign.ValueLayout.JAVA_SHORT, index, value);}

    public java.lang.foreign.MemorySegment reserved() {return this.ptr.asSlice(OFFSET__reserved, LAYOUT__reserved);}
    public short reserved(int index) {return this.reserved().getAtIndex(java.lang.foreign.ValueLayout.JAVA_SHORT, index);}
    public void reserved(int index, short value) {this.reserved().setAtIndex(java.lang.foreign.ValueLayout.JAVA_SHORT, index, value);}

    public java.lang.foreign.MemorySegment pSubLayerHrdParametersNal() {return this.ptr.get(LAYOUT__pSubLayerHrdParametersNal, OFFSET__pSubLayerHrdParametersNal);}
    public void pSubLayerHrdParametersNal(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pSubLayerHrdParametersNal, OFFSET__pSubLayerHrdParametersNal, value);}
    public java.lang.foreign.MemorySegment $pSubLayerHrdParametersNal() {return this.ptr.asSlice(OFFSET__pSubLayerHrdParametersNal, LAYOUT__pSubLayerHrdParametersNal);}

    public java.lang.foreign.MemorySegment pSubLayerHrdParametersVcl() {return this.ptr.get(LAYOUT__pSubLayerHrdParametersVcl, OFFSET__pSubLayerHrdParametersVcl);}
    public void pSubLayerHrdParametersVcl(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pSubLayerHrdParametersVcl, OFFSET__pSubLayerHrdParametersVcl, value);}
    public java.lang.foreign.MemorySegment $pSubLayerHrdParametersVcl() {return this.ptr.asSlice(OFFSET__pSubLayerHrdParametersVcl, LAYOUT__pSubLayerHrdParametersVcl);}
}
