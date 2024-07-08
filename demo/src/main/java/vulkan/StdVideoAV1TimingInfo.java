package vulkan;

public record StdVideoAV1TimingInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT__flags = vulkan.StdVideoAV1TimingInfoFlags.gRecordLayout.withName("flags");
    public static final long OFFSET__flags = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__num_units_in_display_tick = java.lang.foreign.ValueLayout.JAVA_INT.withName("num_units_in_display_tick");
    public static final long OFFSET__num_units_in_display_tick = 4;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__time_scale = java.lang.foreign.ValueLayout.JAVA_INT.withName("time_scale");
    public static final long OFFSET__time_scale = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__num_ticks_per_picture_minus_1 = java.lang.foreign.ValueLayout.JAVA_INT.withName("num_ticks_per_picture_minus_1");
    public static final long OFFSET__num_ticks_per_picture_minus_1 = 12;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__flags,
            LAYOUT__num_units_in_display_tick,
            LAYOUT__time_scale,
            LAYOUT__num_ticks_per_picture_minus_1
    ).withByteAlignment(4).withName("StdVideoAV1TimingInfo");

    public StdVideoAV1TimingInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static StdVideoAV1TimingInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new StdVideoAV1TimingInfo(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, StdVideoAV1TimingInfo value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public vulkan.StdVideoAV1TimingInfoFlags flags() {return new vulkan.StdVideoAV1TimingInfoFlags(this.ptr.asSlice(OFFSET__flags, LAYOUT__flags));}
    public void flags(java.util.function.Consumer<vulkan.StdVideoAV1TimingInfoFlags> consumer) {consumer.accept(this.flags());}
    public void flags(vulkan.StdVideoAV1TimingInfoFlags value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__flags, LAYOUT__flags.byteSize());}

    public int num_units_in_display_tick() {return this.ptr.get(LAYOUT__num_units_in_display_tick, OFFSET__num_units_in_display_tick);}
    public void num_units_in_display_tick(int value) {this.ptr.set(LAYOUT__num_units_in_display_tick, OFFSET__num_units_in_display_tick, value);}
    public java.lang.foreign.MemorySegment $num_units_in_display_tick() {return this.ptr.asSlice(OFFSET__num_units_in_display_tick, LAYOUT__num_units_in_display_tick);}

    public int time_scale() {return this.ptr.get(LAYOUT__time_scale, OFFSET__time_scale);}
    public void time_scale(int value) {this.ptr.set(LAYOUT__time_scale, OFFSET__time_scale, value);}
    public java.lang.foreign.MemorySegment $time_scale() {return this.ptr.asSlice(OFFSET__time_scale, LAYOUT__time_scale);}

    public int num_ticks_per_picture_minus_1() {return this.ptr.get(LAYOUT__num_ticks_per_picture_minus_1, OFFSET__num_ticks_per_picture_minus_1);}
    public void num_ticks_per_picture_minus_1(int value) {this.ptr.set(LAYOUT__num_ticks_per_picture_minus_1, OFFSET__num_ticks_per_picture_minus_1, value);}
    public java.lang.foreign.MemorySegment $num_ticks_per_picture_minus_1() {return this.ptr.asSlice(OFFSET__num_ticks_per_picture_minus_1, LAYOUT__num_ticks_per_picture_minus_1);}
}
