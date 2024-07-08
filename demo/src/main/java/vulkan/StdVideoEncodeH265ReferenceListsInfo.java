package vulkan;

public record StdVideoEncodeH265ReferenceListsInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT__flags = vulkan.StdVideoEncodeH265ReferenceListsInfoFlags.gRecordLayout.withName("flags");
    public static final long OFFSET__flags = 0;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__num_ref_idx_l0_active_minus1 = java.lang.foreign.ValueLayout.JAVA_BYTE.withName("num_ref_idx_l0_active_minus1");
    public static final long OFFSET__num_ref_idx_l0_active_minus1 = 4;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__num_ref_idx_l1_active_minus1 = java.lang.foreign.ValueLayout.JAVA_BYTE.withName("num_ref_idx_l1_active_minus1");
    public static final long OFFSET__num_ref_idx_l1_active_minus1 = 5;
    public static final java.lang.foreign.SequenceLayout LAYOUT__RefPicList0 = java.lang.foreign.MemoryLayout.sequenceLayout(15, java.lang.foreign.ValueLayout.JAVA_BYTE).withName("RefPicList0");
    public static final long OFFSET__RefPicList0 = 6;
    public static final java.lang.foreign.SequenceLayout LAYOUT__RefPicList1 = java.lang.foreign.MemoryLayout.sequenceLayout(15, java.lang.foreign.ValueLayout.JAVA_BYTE).withName("RefPicList1");
    public static final long OFFSET__RefPicList1 = 21;
    public static final java.lang.foreign.SequenceLayout LAYOUT__list_entry_l0 = java.lang.foreign.MemoryLayout.sequenceLayout(15, java.lang.foreign.ValueLayout.JAVA_BYTE).withName("list_entry_l0");
    public static final long OFFSET__list_entry_l0 = 36;
    public static final java.lang.foreign.SequenceLayout LAYOUT__list_entry_l1 = java.lang.foreign.MemoryLayout.sequenceLayout(15, java.lang.foreign.ValueLayout.JAVA_BYTE).withName("list_entry_l1");
    public static final long OFFSET__list_entry_l1 = 51;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__flags,
            LAYOUT__num_ref_idx_l0_active_minus1,
            LAYOUT__num_ref_idx_l1_active_minus1,
            LAYOUT__RefPicList0,
            LAYOUT__RefPicList1,
            LAYOUT__list_entry_l0,
            LAYOUT__list_entry_l1,
            java.lang.foreign.MemoryLayout.paddingLayout(2)
    ).withByteAlignment(4).withName("StdVideoEncodeH265ReferenceListsInfo");

    public StdVideoEncodeH265ReferenceListsInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static StdVideoEncodeH265ReferenceListsInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new StdVideoEncodeH265ReferenceListsInfo(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, StdVideoEncodeH265ReferenceListsInfo value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public vulkan.StdVideoEncodeH265ReferenceListsInfoFlags flags() {return new vulkan.StdVideoEncodeH265ReferenceListsInfoFlags(this.ptr.asSlice(OFFSET__flags, LAYOUT__flags));}
    public void flags(java.util.function.Consumer<vulkan.StdVideoEncodeH265ReferenceListsInfoFlags> consumer) {consumer.accept(this.flags());}
    public void flags(vulkan.StdVideoEncodeH265ReferenceListsInfoFlags value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__flags, LAYOUT__flags.byteSize());}

    public byte num_ref_idx_l0_active_minus1() {return this.ptr.get(LAYOUT__num_ref_idx_l0_active_minus1, OFFSET__num_ref_idx_l0_active_minus1);}
    public void num_ref_idx_l0_active_minus1(byte value) {this.ptr.set(LAYOUT__num_ref_idx_l0_active_minus1, OFFSET__num_ref_idx_l0_active_minus1, value);}
    public java.lang.foreign.MemorySegment $num_ref_idx_l0_active_minus1() {return this.ptr.asSlice(OFFSET__num_ref_idx_l0_active_minus1, LAYOUT__num_ref_idx_l0_active_minus1);}

    public byte num_ref_idx_l1_active_minus1() {return this.ptr.get(LAYOUT__num_ref_idx_l1_active_minus1, OFFSET__num_ref_idx_l1_active_minus1);}
    public void num_ref_idx_l1_active_minus1(byte value) {this.ptr.set(LAYOUT__num_ref_idx_l1_active_minus1, OFFSET__num_ref_idx_l1_active_minus1, value);}
    public java.lang.foreign.MemorySegment $num_ref_idx_l1_active_minus1() {return this.ptr.asSlice(OFFSET__num_ref_idx_l1_active_minus1, LAYOUT__num_ref_idx_l1_active_minus1);}

    public java.lang.foreign.MemorySegment RefPicList0() {return this.ptr.asSlice(OFFSET__RefPicList0, LAYOUT__RefPicList0);}
    public byte RefPicList0(int index) {return this.RefPicList0().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index);}
    public void RefPicList0(int index, byte value) {this.RefPicList0().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index, value);}

    public java.lang.foreign.MemorySegment RefPicList1() {return this.ptr.asSlice(OFFSET__RefPicList1, LAYOUT__RefPicList1);}
    public byte RefPicList1(int index) {return this.RefPicList1().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index);}
    public void RefPicList1(int index, byte value) {this.RefPicList1().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index, value);}

    public java.lang.foreign.MemorySegment list_entry_l0() {return this.ptr.asSlice(OFFSET__list_entry_l0, LAYOUT__list_entry_l0);}
    public byte list_entry_l0(int index) {return this.list_entry_l0().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index);}
    public void list_entry_l0(int index, byte value) {this.list_entry_l0().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index, value);}

    public java.lang.foreign.MemorySegment list_entry_l1() {return this.ptr.asSlice(OFFSET__list_entry_l1, LAYOUT__list_entry_l1);}
    public byte list_entry_l1(int index) {return this.list_entry_l1().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index);}
    public void list_entry_l1(int index, byte value) {this.list_entry_l1().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index, value);}
}
