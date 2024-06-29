package vulkan;

public record StdVideoH264ScalingLists(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT__scaling_list_present_mask = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET__scaling_list_present_mask = 0;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT__use_default_scaling_matrix_mask = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET__use_default_scaling_matrix_mask = 2;
    public static final java.lang.foreign.SequenceLayout LAYOUT__ScalingList4x4 = java.lang.foreign.MemoryLayout.sequenceLayout(6, java.lang.foreign.MemoryLayout.sequenceLayout(16, java.lang.foreign.ValueLayout.JAVA_BYTE));
    public static final long OFFSET__ScalingList4x4 = 4;
    public static final java.lang.foreign.SequenceLayout LAYOUT__ScalingList8x8 = java.lang.foreign.MemoryLayout.sequenceLayout(6, java.lang.foreign.MemoryLayout.sequenceLayout(64, java.lang.foreign.ValueLayout.JAVA_BYTE));
    public static final long OFFSET__ScalingList8x8 = 100;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__scaling_list_present_mask,
            LAYOUT__use_default_scaling_matrix_mask,
            LAYOUT__ScalingList4x4,
            LAYOUT__ScalingList8x8
    ).withByteAlignment(2).withName("StdVideoH264ScalingLists");

    public StdVideoH264ScalingLists(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static StdVideoH264ScalingLists getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new StdVideoH264ScalingLists(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, StdVideoH264ScalingLists value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public short scaling_list_present_mask() {return this.ptr.get(LAYOUT__scaling_list_present_mask, OFFSET__scaling_list_present_mask);}
    public void scaling_list_present_mask(short value) {this.ptr.set(LAYOUT__scaling_list_present_mask, OFFSET__scaling_list_present_mask, value);}
    public java.lang.foreign.MemorySegment $scaling_list_present_mask() {return this.ptr.asSlice(OFFSET__scaling_list_present_mask, LAYOUT__scaling_list_present_mask);}

    public short use_default_scaling_matrix_mask() {return this.ptr.get(LAYOUT__use_default_scaling_matrix_mask, OFFSET__use_default_scaling_matrix_mask);}
    public void use_default_scaling_matrix_mask(short value) {this.ptr.set(LAYOUT__use_default_scaling_matrix_mask, OFFSET__use_default_scaling_matrix_mask, value);}
    public java.lang.foreign.MemorySegment $use_default_scaling_matrix_mask() {return this.ptr.asSlice(OFFSET__use_default_scaling_matrix_mask, LAYOUT__use_default_scaling_matrix_mask);}

    public java.lang.foreign.MemorySegment ScalingList4x4() {return this.ptr.asSlice(OFFSET__ScalingList4x4, LAYOUT__ScalingList4x4);}

    public java.lang.foreign.MemorySegment ScalingList8x8() {return this.ptr.asSlice(OFFSET__ScalingList8x8, LAYOUT__ScalingList8x8);}
}
