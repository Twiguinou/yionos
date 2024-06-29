package vulkan;

public record StdVideoAV1LoopFilter(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT__flags = vulkan.StdVideoAV1LoopFilterFlags.gRecordLayout;
    public static final long OFFSET__flags = 0;
    public static final java.lang.foreign.SequenceLayout LAYOUT__loop_filter_level = java.lang.foreign.MemoryLayout.sequenceLayout(4, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET__loop_filter_level = 4;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__loop_filter_sharpness = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__loop_filter_sharpness = 8;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__update_ref_delta = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__update_ref_delta = 9;
    public static final java.lang.foreign.SequenceLayout LAYOUT__loop_filter_ref_deltas = java.lang.foreign.MemoryLayout.sequenceLayout(8, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET__loop_filter_ref_deltas = 10;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__update_mode_delta = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__update_mode_delta = 18;
    public static final java.lang.foreign.SequenceLayout LAYOUT__loop_filter_mode_deltas = java.lang.foreign.MemoryLayout.sequenceLayout(2, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET__loop_filter_mode_deltas = 19;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__flags,
            LAYOUT__loop_filter_level,
            LAYOUT__loop_filter_sharpness,
            LAYOUT__update_ref_delta,
            LAYOUT__loop_filter_ref_deltas,
            LAYOUT__update_mode_delta,
            LAYOUT__loop_filter_mode_deltas,
            java.lang.foreign.MemoryLayout.paddingLayout(3)
    ).withByteAlignment(4).withName("StdVideoAV1LoopFilter");

    public StdVideoAV1LoopFilter(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static StdVideoAV1LoopFilter getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new StdVideoAV1LoopFilter(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, StdVideoAV1LoopFilter value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public vulkan.StdVideoAV1LoopFilterFlags flags() {return new vulkan.StdVideoAV1LoopFilterFlags(this.ptr.asSlice(OFFSET__flags, LAYOUT__flags));}
    public void flags(java.util.function.Consumer<vulkan.StdVideoAV1LoopFilterFlags> consumer) {consumer.accept(this.flags());}
    public void flags(vulkan.StdVideoAV1LoopFilterFlags value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__flags, LAYOUT__flags.byteSize());}

    public java.lang.foreign.MemorySegment loop_filter_level() {return this.ptr.asSlice(OFFSET__loop_filter_level, LAYOUT__loop_filter_level);}
    public byte loop_filter_level(int index) {return this.loop_filter_level().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index);}
    public void loop_filter_level(int index, byte value) {this.loop_filter_level().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index, value);}

    public byte loop_filter_sharpness() {return this.ptr.get(LAYOUT__loop_filter_sharpness, OFFSET__loop_filter_sharpness);}
    public void loop_filter_sharpness(byte value) {this.ptr.set(LAYOUT__loop_filter_sharpness, OFFSET__loop_filter_sharpness, value);}
    public java.lang.foreign.MemorySegment $loop_filter_sharpness() {return this.ptr.asSlice(OFFSET__loop_filter_sharpness, LAYOUT__loop_filter_sharpness);}

    public byte update_ref_delta() {return this.ptr.get(LAYOUT__update_ref_delta, OFFSET__update_ref_delta);}
    public void update_ref_delta(byte value) {this.ptr.set(LAYOUT__update_ref_delta, OFFSET__update_ref_delta, value);}
    public java.lang.foreign.MemorySegment $update_ref_delta() {return this.ptr.asSlice(OFFSET__update_ref_delta, LAYOUT__update_ref_delta);}

    public java.lang.foreign.MemorySegment loop_filter_ref_deltas() {return this.ptr.asSlice(OFFSET__loop_filter_ref_deltas, LAYOUT__loop_filter_ref_deltas);}
    public byte loop_filter_ref_deltas(int index) {return this.loop_filter_ref_deltas().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index);}
    public void loop_filter_ref_deltas(int index, byte value) {this.loop_filter_ref_deltas().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index, value);}

    public byte update_mode_delta() {return this.ptr.get(LAYOUT__update_mode_delta, OFFSET__update_mode_delta);}
    public void update_mode_delta(byte value) {this.ptr.set(LAYOUT__update_mode_delta, OFFSET__update_mode_delta, value);}
    public java.lang.foreign.MemorySegment $update_mode_delta() {return this.ptr.asSlice(OFFSET__update_mode_delta, LAYOUT__update_mode_delta);}

    public java.lang.foreign.MemorySegment loop_filter_mode_deltas() {return this.ptr.asSlice(OFFSET__loop_filter_mode_deltas, LAYOUT__loop_filter_mode_deltas);}
    public byte loop_filter_mode_deltas(int index) {return this.loop_filter_mode_deltas().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index);}
    public void loop_filter_mode_deltas(int index, byte value) {this.loop_filter_mode_deltas().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index, value);}
}
