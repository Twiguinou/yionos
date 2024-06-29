package vulkan;

public record StdVideoH265VideoParameterSet(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT__flags = vulkan.StdVideoH265VpsFlags.gRecordLayout;
    public static final long OFFSET__flags = 0;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__vps_video_parameter_set_id = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__vps_video_parameter_set_id = 4;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__vps_max_sub_layers_minus1 = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__vps_max_sub_layers_minus1 = 5;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__reserved1 = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__reserved1 = 6;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__reserved2 = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__reserved2 = 7;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__vps_num_units_in_tick = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__vps_num_units_in_tick = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__vps_time_scale = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__vps_time_scale = 12;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__vps_num_ticks_poc_diff_one_minus1 = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__vps_num_ticks_poc_diff_one_minus1 = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__reserved3 = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__reserved3 = 20;
    public static final java.lang.foreign.AddressLayout LAYOUT__pDecPicBufMgr = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pDecPicBufMgr = 24;
    public static final java.lang.foreign.AddressLayout LAYOUT__pHrdParameters = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pHrdParameters = 32;
    public static final java.lang.foreign.AddressLayout LAYOUT__pProfileTierLevel = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pProfileTierLevel = 40;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__flags,
            LAYOUT__vps_video_parameter_set_id,
            LAYOUT__vps_max_sub_layers_minus1,
            LAYOUT__reserved1,
            LAYOUT__reserved2,
            LAYOUT__vps_num_units_in_tick,
            LAYOUT__vps_time_scale,
            LAYOUT__vps_num_ticks_poc_diff_one_minus1,
            LAYOUT__reserved3,
            LAYOUT__pDecPicBufMgr,
            LAYOUT__pHrdParameters,
            LAYOUT__pProfileTierLevel
    ).withByteAlignment(8).withName("StdVideoH265VideoParameterSet");

    public StdVideoH265VideoParameterSet(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static StdVideoH265VideoParameterSet getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new StdVideoH265VideoParameterSet(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, StdVideoH265VideoParameterSet value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public vulkan.StdVideoH265VpsFlags flags() {return new vulkan.StdVideoH265VpsFlags(this.ptr.asSlice(OFFSET__flags, LAYOUT__flags));}
    public void flags(java.util.function.Consumer<vulkan.StdVideoH265VpsFlags> consumer) {consumer.accept(this.flags());}
    public void flags(vulkan.StdVideoH265VpsFlags value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__flags, LAYOUT__flags.byteSize());}

    public byte vps_video_parameter_set_id() {return this.ptr.get(LAYOUT__vps_video_parameter_set_id, OFFSET__vps_video_parameter_set_id);}
    public void vps_video_parameter_set_id(byte value) {this.ptr.set(LAYOUT__vps_video_parameter_set_id, OFFSET__vps_video_parameter_set_id, value);}
    public java.lang.foreign.MemorySegment $vps_video_parameter_set_id() {return this.ptr.asSlice(OFFSET__vps_video_parameter_set_id, LAYOUT__vps_video_parameter_set_id);}

    public byte vps_max_sub_layers_minus1() {return this.ptr.get(LAYOUT__vps_max_sub_layers_minus1, OFFSET__vps_max_sub_layers_minus1);}
    public void vps_max_sub_layers_minus1(byte value) {this.ptr.set(LAYOUT__vps_max_sub_layers_minus1, OFFSET__vps_max_sub_layers_minus1, value);}
    public java.lang.foreign.MemorySegment $vps_max_sub_layers_minus1() {return this.ptr.asSlice(OFFSET__vps_max_sub_layers_minus1, LAYOUT__vps_max_sub_layers_minus1);}

    public byte reserved1() {return this.ptr.get(LAYOUT__reserved1, OFFSET__reserved1);}
    public void reserved1(byte value) {this.ptr.set(LAYOUT__reserved1, OFFSET__reserved1, value);}
    public java.lang.foreign.MemorySegment $reserved1() {return this.ptr.asSlice(OFFSET__reserved1, LAYOUT__reserved1);}

    public byte reserved2() {return this.ptr.get(LAYOUT__reserved2, OFFSET__reserved2);}
    public void reserved2(byte value) {this.ptr.set(LAYOUT__reserved2, OFFSET__reserved2, value);}
    public java.lang.foreign.MemorySegment $reserved2() {return this.ptr.asSlice(OFFSET__reserved2, LAYOUT__reserved2);}

    public int vps_num_units_in_tick() {return this.ptr.get(LAYOUT__vps_num_units_in_tick, OFFSET__vps_num_units_in_tick);}
    public void vps_num_units_in_tick(int value) {this.ptr.set(LAYOUT__vps_num_units_in_tick, OFFSET__vps_num_units_in_tick, value);}
    public java.lang.foreign.MemorySegment $vps_num_units_in_tick() {return this.ptr.asSlice(OFFSET__vps_num_units_in_tick, LAYOUT__vps_num_units_in_tick);}

    public int vps_time_scale() {return this.ptr.get(LAYOUT__vps_time_scale, OFFSET__vps_time_scale);}
    public void vps_time_scale(int value) {this.ptr.set(LAYOUT__vps_time_scale, OFFSET__vps_time_scale, value);}
    public java.lang.foreign.MemorySegment $vps_time_scale() {return this.ptr.asSlice(OFFSET__vps_time_scale, LAYOUT__vps_time_scale);}

    public int vps_num_ticks_poc_diff_one_minus1() {return this.ptr.get(LAYOUT__vps_num_ticks_poc_diff_one_minus1, OFFSET__vps_num_ticks_poc_diff_one_minus1);}
    public void vps_num_ticks_poc_diff_one_minus1(int value) {this.ptr.set(LAYOUT__vps_num_ticks_poc_diff_one_minus1, OFFSET__vps_num_ticks_poc_diff_one_minus1, value);}
    public java.lang.foreign.MemorySegment $vps_num_ticks_poc_diff_one_minus1() {return this.ptr.asSlice(OFFSET__vps_num_ticks_poc_diff_one_minus1, LAYOUT__vps_num_ticks_poc_diff_one_minus1);}

    public int reserved3() {return this.ptr.get(LAYOUT__reserved3, OFFSET__reserved3);}
    public void reserved3(int value) {this.ptr.set(LAYOUT__reserved3, OFFSET__reserved3, value);}
    public java.lang.foreign.MemorySegment $reserved3() {return this.ptr.asSlice(OFFSET__reserved3, LAYOUT__reserved3);}

    public java.lang.foreign.MemorySegment pDecPicBufMgr() {return this.ptr.get(LAYOUT__pDecPicBufMgr, OFFSET__pDecPicBufMgr);}
    public void pDecPicBufMgr(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pDecPicBufMgr, OFFSET__pDecPicBufMgr, value);}
    public java.lang.foreign.MemorySegment $pDecPicBufMgr() {return this.ptr.asSlice(OFFSET__pDecPicBufMgr, LAYOUT__pDecPicBufMgr);}

    public java.lang.foreign.MemorySegment pHrdParameters() {return this.ptr.get(LAYOUT__pHrdParameters, OFFSET__pHrdParameters);}
    public void pHrdParameters(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pHrdParameters, OFFSET__pHrdParameters, value);}
    public java.lang.foreign.MemorySegment $pHrdParameters() {return this.ptr.asSlice(OFFSET__pHrdParameters, LAYOUT__pHrdParameters);}

    public java.lang.foreign.MemorySegment pProfileTierLevel() {return this.ptr.get(LAYOUT__pProfileTierLevel, OFFSET__pProfileTierLevel);}
    public void pProfileTierLevel(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pProfileTierLevel, OFFSET__pProfileTierLevel, value);}
    public java.lang.foreign.MemorySegment $pProfileTierLevel() {return this.ptr.asSlice(OFFSET__pProfileTierLevel, LAYOUT__pProfileTierLevel);}
}
