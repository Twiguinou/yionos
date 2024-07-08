package vulkan;

public record StdVideoAV1SequenceHeader(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT__flags = vulkan.StdVideoAV1SequenceHeaderFlags.gRecordLayout.withName("flags");
    public static final long OFFSET__flags = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__seq_profile = java.lang.foreign.ValueLayout.JAVA_INT.withName("seq_profile");
    public static final long OFFSET__seq_profile = 4;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__frame_width_bits_minus_1 = java.lang.foreign.ValueLayout.JAVA_BYTE.withName("frame_width_bits_minus_1");
    public static final long OFFSET__frame_width_bits_minus_1 = 8;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__frame_height_bits_minus_1 = java.lang.foreign.ValueLayout.JAVA_BYTE.withName("frame_height_bits_minus_1");
    public static final long OFFSET__frame_height_bits_minus_1 = 9;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT__max_frame_width_minus_1 = java.lang.foreign.ValueLayout.JAVA_SHORT.withName("max_frame_width_minus_1");
    public static final long OFFSET__max_frame_width_minus_1 = 10;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT__max_frame_height_minus_1 = java.lang.foreign.ValueLayout.JAVA_SHORT.withName("max_frame_height_minus_1");
    public static final long OFFSET__max_frame_height_minus_1 = 12;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__delta_frame_id_length_minus_2 = java.lang.foreign.ValueLayout.JAVA_BYTE.withName("delta_frame_id_length_minus_2");
    public static final long OFFSET__delta_frame_id_length_minus_2 = 14;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__additional_frame_id_length_minus_1 = java.lang.foreign.ValueLayout.JAVA_BYTE.withName("additional_frame_id_length_minus_1");
    public static final long OFFSET__additional_frame_id_length_minus_1 = 15;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__order_hint_bits_minus_1 = java.lang.foreign.ValueLayout.JAVA_BYTE.withName("order_hint_bits_minus_1");
    public static final long OFFSET__order_hint_bits_minus_1 = 16;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__seq_force_integer_mv = java.lang.foreign.ValueLayout.JAVA_BYTE.withName("seq_force_integer_mv");
    public static final long OFFSET__seq_force_integer_mv = 17;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__seq_force_screen_content_tools = java.lang.foreign.ValueLayout.JAVA_BYTE.withName("seq_force_screen_content_tools");
    public static final long OFFSET__seq_force_screen_content_tools = 18;
    public static final java.lang.foreign.SequenceLayout LAYOUT__reserved1 = java.lang.foreign.MemoryLayout.sequenceLayout(5, java.lang.foreign.ValueLayout.JAVA_BYTE).withName("reserved1");
    public static final long OFFSET__reserved1 = 19;
    public static final java.lang.foreign.AddressLayout LAYOUT__pColorConfig = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pColorConfig");
    public static final long OFFSET__pColorConfig = 24;
    public static final java.lang.foreign.AddressLayout LAYOUT__pTimingInfo = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pTimingInfo");
    public static final long OFFSET__pTimingInfo = 32;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__flags,
            LAYOUT__seq_profile,
            LAYOUT__frame_width_bits_minus_1,
            LAYOUT__frame_height_bits_minus_1,
            LAYOUT__max_frame_width_minus_1,
            LAYOUT__max_frame_height_minus_1,
            LAYOUT__delta_frame_id_length_minus_2,
            LAYOUT__additional_frame_id_length_minus_1,
            LAYOUT__order_hint_bits_minus_1,
            LAYOUT__seq_force_integer_mv,
            LAYOUT__seq_force_screen_content_tools,
            LAYOUT__reserved1,
            LAYOUT__pColorConfig,
            LAYOUT__pTimingInfo
    ).withByteAlignment(8).withName("StdVideoAV1SequenceHeader");

    public StdVideoAV1SequenceHeader(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static StdVideoAV1SequenceHeader getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new StdVideoAV1SequenceHeader(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, StdVideoAV1SequenceHeader value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public vulkan.StdVideoAV1SequenceHeaderFlags flags() {return new vulkan.StdVideoAV1SequenceHeaderFlags(this.ptr.asSlice(OFFSET__flags, LAYOUT__flags));}
    public void flags(java.util.function.Consumer<vulkan.StdVideoAV1SequenceHeaderFlags> consumer) {consumer.accept(this.flags());}
    public void flags(vulkan.StdVideoAV1SequenceHeaderFlags value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__flags, LAYOUT__flags.byteSize());}

    public int seq_profile() {return this.ptr.get(LAYOUT__seq_profile, OFFSET__seq_profile);}
    public void seq_profile(int value) {this.ptr.set(LAYOUT__seq_profile, OFFSET__seq_profile, value);}
    public java.lang.foreign.MemorySegment $seq_profile() {return this.ptr.asSlice(OFFSET__seq_profile, LAYOUT__seq_profile);}

    public byte frame_width_bits_minus_1() {return this.ptr.get(LAYOUT__frame_width_bits_minus_1, OFFSET__frame_width_bits_minus_1);}
    public void frame_width_bits_minus_1(byte value) {this.ptr.set(LAYOUT__frame_width_bits_minus_1, OFFSET__frame_width_bits_minus_1, value);}
    public java.lang.foreign.MemorySegment $frame_width_bits_minus_1() {return this.ptr.asSlice(OFFSET__frame_width_bits_minus_1, LAYOUT__frame_width_bits_minus_1);}

    public byte frame_height_bits_minus_1() {return this.ptr.get(LAYOUT__frame_height_bits_minus_1, OFFSET__frame_height_bits_minus_1);}
    public void frame_height_bits_minus_1(byte value) {this.ptr.set(LAYOUT__frame_height_bits_minus_1, OFFSET__frame_height_bits_minus_1, value);}
    public java.lang.foreign.MemorySegment $frame_height_bits_minus_1() {return this.ptr.asSlice(OFFSET__frame_height_bits_minus_1, LAYOUT__frame_height_bits_minus_1);}

    public short max_frame_width_minus_1() {return this.ptr.get(LAYOUT__max_frame_width_minus_1, OFFSET__max_frame_width_minus_1);}
    public void max_frame_width_minus_1(short value) {this.ptr.set(LAYOUT__max_frame_width_minus_1, OFFSET__max_frame_width_minus_1, value);}
    public java.lang.foreign.MemorySegment $max_frame_width_minus_1() {return this.ptr.asSlice(OFFSET__max_frame_width_minus_1, LAYOUT__max_frame_width_minus_1);}

    public short max_frame_height_minus_1() {return this.ptr.get(LAYOUT__max_frame_height_minus_1, OFFSET__max_frame_height_minus_1);}
    public void max_frame_height_minus_1(short value) {this.ptr.set(LAYOUT__max_frame_height_minus_1, OFFSET__max_frame_height_minus_1, value);}
    public java.lang.foreign.MemorySegment $max_frame_height_minus_1() {return this.ptr.asSlice(OFFSET__max_frame_height_minus_1, LAYOUT__max_frame_height_minus_1);}

    public byte delta_frame_id_length_minus_2() {return this.ptr.get(LAYOUT__delta_frame_id_length_minus_2, OFFSET__delta_frame_id_length_minus_2);}
    public void delta_frame_id_length_minus_2(byte value) {this.ptr.set(LAYOUT__delta_frame_id_length_minus_2, OFFSET__delta_frame_id_length_minus_2, value);}
    public java.lang.foreign.MemorySegment $delta_frame_id_length_minus_2() {return this.ptr.asSlice(OFFSET__delta_frame_id_length_minus_2, LAYOUT__delta_frame_id_length_minus_2);}

    public byte additional_frame_id_length_minus_1() {return this.ptr.get(LAYOUT__additional_frame_id_length_minus_1, OFFSET__additional_frame_id_length_minus_1);}
    public void additional_frame_id_length_minus_1(byte value) {this.ptr.set(LAYOUT__additional_frame_id_length_minus_1, OFFSET__additional_frame_id_length_minus_1, value);}
    public java.lang.foreign.MemorySegment $additional_frame_id_length_minus_1() {return this.ptr.asSlice(OFFSET__additional_frame_id_length_minus_1, LAYOUT__additional_frame_id_length_minus_1);}

    public byte order_hint_bits_minus_1() {return this.ptr.get(LAYOUT__order_hint_bits_minus_1, OFFSET__order_hint_bits_minus_1);}
    public void order_hint_bits_minus_1(byte value) {this.ptr.set(LAYOUT__order_hint_bits_minus_1, OFFSET__order_hint_bits_minus_1, value);}
    public java.lang.foreign.MemorySegment $order_hint_bits_minus_1() {return this.ptr.asSlice(OFFSET__order_hint_bits_minus_1, LAYOUT__order_hint_bits_minus_1);}

    public byte seq_force_integer_mv() {return this.ptr.get(LAYOUT__seq_force_integer_mv, OFFSET__seq_force_integer_mv);}
    public void seq_force_integer_mv(byte value) {this.ptr.set(LAYOUT__seq_force_integer_mv, OFFSET__seq_force_integer_mv, value);}
    public java.lang.foreign.MemorySegment $seq_force_integer_mv() {return this.ptr.asSlice(OFFSET__seq_force_integer_mv, LAYOUT__seq_force_integer_mv);}

    public byte seq_force_screen_content_tools() {return this.ptr.get(LAYOUT__seq_force_screen_content_tools, OFFSET__seq_force_screen_content_tools);}
    public void seq_force_screen_content_tools(byte value) {this.ptr.set(LAYOUT__seq_force_screen_content_tools, OFFSET__seq_force_screen_content_tools, value);}
    public java.lang.foreign.MemorySegment $seq_force_screen_content_tools() {return this.ptr.asSlice(OFFSET__seq_force_screen_content_tools, LAYOUT__seq_force_screen_content_tools);}

    public java.lang.foreign.MemorySegment reserved1() {return this.ptr.asSlice(OFFSET__reserved1, LAYOUT__reserved1);}
    public byte reserved1(int index) {return this.reserved1().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index);}
    public void reserved1(int index, byte value) {this.reserved1().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index, value);}

    public java.lang.foreign.MemorySegment pColorConfig() {return this.ptr.get(LAYOUT__pColorConfig, OFFSET__pColorConfig);}
    public void pColorConfig(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pColorConfig, OFFSET__pColorConfig, value);}
    public java.lang.foreign.MemorySegment $pColorConfig() {return this.ptr.asSlice(OFFSET__pColorConfig, LAYOUT__pColorConfig);}

    public java.lang.foreign.MemorySegment pTimingInfo() {return this.ptr.get(LAYOUT__pTimingInfo, OFFSET__pTimingInfo);}
    public void pTimingInfo(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pTimingInfo, OFFSET__pTimingInfo, value);}
    public java.lang.foreign.MemorySegment $pTimingInfo() {return this.ptr.asSlice(OFFSET__pTimingInfo, LAYOUT__pTimingInfo);}
}
