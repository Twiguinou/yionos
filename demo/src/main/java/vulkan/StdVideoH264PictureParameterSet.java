package vulkan;

public record StdVideoH264PictureParameterSet(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT__flags = vulkan.StdVideoH264PpsFlags.gRecordLayout;
    public static final long OFFSET__flags = 0;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__seq_parameter_set_id = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__seq_parameter_set_id = 4;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__pic_parameter_set_id = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__pic_parameter_set_id = 5;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__num_ref_idx_l0_default_active_minus1 = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__num_ref_idx_l0_default_active_minus1 = 6;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__num_ref_idx_l1_default_active_minus1 = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__num_ref_idx_l1_default_active_minus1 = 7;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__weighted_bipred_idc = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__weighted_bipred_idc = 8;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__pic_init_qp_minus26 = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__pic_init_qp_minus26 = 12;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__pic_init_qs_minus26 = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__pic_init_qs_minus26 = 13;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__chroma_qp_index_offset = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__chroma_qp_index_offset = 14;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__second_chroma_qp_index_offset = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__second_chroma_qp_index_offset = 15;
    public static final java.lang.foreign.AddressLayout LAYOUT__pScalingLists = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pScalingLists = 16;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__flags,
            LAYOUT__seq_parameter_set_id,
            LAYOUT__pic_parameter_set_id,
            LAYOUT__num_ref_idx_l0_default_active_minus1,
            LAYOUT__num_ref_idx_l1_default_active_minus1,
            LAYOUT__weighted_bipred_idc,
            LAYOUT__pic_init_qp_minus26,
            LAYOUT__pic_init_qs_minus26,
            LAYOUT__chroma_qp_index_offset,
            LAYOUT__second_chroma_qp_index_offset,
            LAYOUT__pScalingLists
    ).withByteAlignment(8).withName("StdVideoH264PictureParameterSet");

    public StdVideoH264PictureParameterSet(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static StdVideoH264PictureParameterSet getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new StdVideoH264PictureParameterSet(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, StdVideoH264PictureParameterSet value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public vulkan.StdVideoH264PpsFlags flags() {return new vulkan.StdVideoH264PpsFlags(this.ptr.asSlice(OFFSET__flags, LAYOUT__flags));}
    public void flags(java.util.function.Consumer<vulkan.StdVideoH264PpsFlags> consumer) {consumer.accept(this.flags());}
    public void flags(vulkan.StdVideoH264PpsFlags value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__flags, LAYOUT__flags.byteSize());}

    public byte seq_parameter_set_id() {return this.ptr.get(LAYOUT__seq_parameter_set_id, OFFSET__seq_parameter_set_id);}
    public void seq_parameter_set_id(byte value) {this.ptr.set(LAYOUT__seq_parameter_set_id, OFFSET__seq_parameter_set_id, value);}
    public java.lang.foreign.MemorySegment $seq_parameter_set_id() {return this.ptr.asSlice(OFFSET__seq_parameter_set_id, LAYOUT__seq_parameter_set_id);}

    public byte pic_parameter_set_id() {return this.ptr.get(LAYOUT__pic_parameter_set_id, OFFSET__pic_parameter_set_id);}
    public void pic_parameter_set_id(byte value) {this.ptr.set(LAYOUT__pic_parameter_set_id, OFFSET__pic_parameter_set_id, value);}
    public java.lang.foreign.MemorySegment $pic_parameter_set_id() {return this.ptr.asSlice(OFFSET__pic_parameter_set_id, LAYOUT__pic_parameter_set_id);}

    public byte num_ref_idx_l0_default_active_minus1() {return this.ptr.get(LAYOUT__num_ref_idx_l0_default_active_minus1, OFFSET__num_ref_idx_l0_default_active_minus1);}
    public void num_ref_idx_l0_default_active_minus1(byte value) {this.ptr.set(LAYOUT__num_ref_idx_l0_default_active_minus1, OFFSET__num_ref_idx_l0_default_active_minus1, value);}
    public java.lang.foreign.MemorySegment $num_ref_idx_l0_default_active_minus1() {return this.ptr.asSlice(OFFSET__num_ref_idx_l0_default_active_minus1, LAYOUT__num_ref_idx_l0_default_active_minus1);}

    public byte num_ref_idx_l1_default_active_minus1() {return this.ptr.get(LAYOUT__num_ref_idx_l1_default_active_minus1, OFFSET__num_ref_idx_l1_default_active_minus1);}
    public void num_ref_idx_l1_default_active_minus1(byte value) {this.ptr.set(LAYOUT__num_ref_idx_l1_default_active_minus1, OFFSET__num_ref_idx_l1_default_active_minus1, value);}
    public java.lang.foreign.MemorySegment $num_ref_idx_l1_default_active_minus1() {return this.ptr.asSlice(OFFSET__num_ref_idx_l1_default_active_minus1, LAYOUT__num_ref_idx_l1_default_active_minus1);}

    public int weighted_bipred_idc() {return this.ptr.get(LAYOUT__weighted_bipred_idc, OFFSET__weighted_bipred_idc);}
    public void weighted_bipred_idc(int value) {this.ptr.set(LAYOUT__weighted_bipred_idc, OFFSET__weighted_bipred_idc, value);}
    public java.lang.foreign.MemorySegment $weighted_bipred_idc() {return this.ptr.asSlice(OFFSET__weighted_bipred_idc, LAYOUT__weighted_bipred_idc);}

    public byte pic_init_qp_minus26() {return this.ptr.get(LAYOUT__pic_init_qp_minus26, OFFSET__pic_init_qp_minus26);}
    public void pic_init_qp_minus26(byte value) {this.ptr.set(LAYOUT__pic_init_qp_minus26, OFFSET__pic_init_qp_minus26, value);}
    public java.lang.foreign.MemorySegment $pic_init_qp_minus26() {return this.ptr.asSlice(OFFSET__pic_init_qp_minus26, LAYOUT__pic_init_qp_minus26);}

    public byte pic_init_qs_minus26() {return this.ptr.get(LAYOUT__pic_init_qs_minus26, OFFSET__pic_init_qs_minus26);}
    public void pic_init_qs_minus26(byte value) {this.ptr.set(LAYOUT__pic_init_qs_minus26, OFFSET__pic_init_qs_minus26, value);}
    public java.lang.foreign.MemorySegment $pic_init_qs_minus26() {return this.ptr.asSlice(OFFSET__pic_init_qs_minus26, LAYOUT__pic_init_qs_minus26);}

    public byte chroma_qp_index_offset() {return this.ptr.get(LAYOUT__chroma_qp_index_offset, OFFSET__chroma_qp_index_offset);}
    public void chroma_qp_index_offset(byte value) {this.ptr.set(LAYOUT__chroma_qp_index_offset, OFFSET__chroma_qp_index_offset, value);}
    public java.lang.foreign.MemorySegment $chroma_qp_index_offset() {return this.ptr.asSlice(OFFSET__chroma_qp_index_offset, LAYOUT__chroma_qp_index_offset);}

    public byte second_chroma_qp_index_offset() {return this.ptr.get(LAYOUT__second_chroma_qp_index_offset, OFFSET__second_chroma_qp_index_offset);}
    public void second_chroma_qp_index_offset(byte value) {this.ptr.set(LAYOUT__second_chroma_qp_index_offset, OFFSET__second_chroma_qp_index_offset, value);}
    public java.lang.foreign.MemorySegment $second_chroma_qp_index_offset() {return this.ptr.asSlice(OFFSET__second_chroma_qp_index_offset, LAYOUT__second_chroma_qp_index_offset);}

    public java.lang.foreign.MemorySegment pScalingLists() {return this.ptr.get(LAYOUT__pScalingLists, OFFSET__pScalingLists);}
    public void pScalingLists(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pScalingLists, OFFSET__pScalingLists, value);}
    public java.lang.foreign.MemorySegment $pScalingLists() {return this.ptr.asSlice(OFFSET__pScalingLists, LAYOUT__pScalingLists);}
}
