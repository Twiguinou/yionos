package vulkan;

public record StdVideoEncodeH265ReferenceListsInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.GroupLayout LAYOUT$flags = vulkan.StdVideoEncodeH265ReferenceListsInfoFlags.gStructLayout;
    public static final long OFFSET$flags = 0L;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$num_ref_idx_l0_active_minus1 = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET$num_ref_idx_l0_active_minus1 = 4L;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$num_ref_idx_l1_active_minus1 = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET$num_ref_idx_l1_active_minus1 = 5L;
    public static final java.lang.foreign.SequenceLayout LAYOUT$RefPicList0 = java.lang.foreign.MemoryLayout.sequenceLayout(15, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET$RefPicList0 = 6L;
    public static final java.lang.foreign.SequenceLayout LAYOUT$RefPicList1 = java.lang.foreign.MemoryLayout.sequenceLayout(15, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET$RefPicList1 = 21L;
    public static final java.lang.foreign.SequenceLayout LAYOUT$list_entry_l0 = java.lang.foreign.MemoryLayout.sequenceLayout(15, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET$list_entry_l0 = 36L;
    public static final java.lang.foreign.SequenceLayout LAYOUT$list_entry_l1 = java.lang.foreign.MemoryLayout.sequenceLayout(15, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET$list_entry_l1 = 51L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$flags,
            LAYOUT$num_ref_idx_l0_active_minus1,
            LAYOUT$num_ref_idx_l1_active_minus1,
            LAYOUT$RefPicList0,
            LAYOUT$RefPicList1,
            LAYOUT$list_entry_l0,
            LAYOUT$list_entry_l1,
            java.lang.foreign.MemoryLayout.paddingLayout(2)
    ).withName("StdVideoEncodeH265ReferenceListsInfo");

    public StdVideoEncodeH265ReferenceListsInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static StdVideoEncodeH265ReferenceListsInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new StdVideoEncodeH265ReferenceListsInfo(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public vulkan.StdVideoEncodeH265ReferenceListsInfoFlags flags() {return new vulkan.StdVideoEncodeH265ReferenceListsInfoFlags(this.ptr.asSlice(OFFSET$flags, LAYOUT$flags));}
    public void flags(java.util.function.Consumer<vulkan.StdVideoEncodeH265ReferenceListsInfoFlags> consumer) {consumer.accept(this.flags());}
    public void flags(vulkan.StdVideoEncodeH265ReferenceListsInfoFlags value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$flags, LAYOUT$flags.byteSize());}

    public char num_ref_idx_l0_active_minus1() {return (char)this.ptr.get(LAYOUT$num_ref_idx_l0_active_minus1, OFFSET$num_ref_idx_l0_active_minus1);}
    public void num_ref_idx_l0_active_minus1(char value) {this.ptr.set(LAYOUT$num_ref_idx_l0_active_minus1, OFFSET$num_ref_idx_l0_active_minus1, (byte)value);}
    public java.lang.foreign.MemorySegment num_ref_idx_l0_active_minus1_ptr() {return this.ptr.asSlice(OFFSET$num_ref_idx_l0_active_minus1, LAYOUT$num_ref_idx_l0_active_minus1);}

    public char num_ref_idx_l1_active_minus1() {return (char)this.ptr.get(LAYOUT$num_ref_idx_l1_active_minus1, OFFSET$num_ref_idx_l1_active_minus1);}
    public void num_ref_idx_l1_active_minus1(char value) {this.ptr.set(LAYOUT$num_ref_idx_l1_active_minus1, OFFSET$num_ref_idx_l1_active_minus1, (byte)value);}
    public java.lang.foreign.MemorySegment num_ref_idx_l1_active_minus1_ptr() {return this.ptr.asSlice(OFFSET$num_ref_idx_l1_active_minus1, LAYOUT$num_ref_idx_l1_active_minus1);}

    public java.lang.foreign.MemorySegment RefPicList0() {return this.ptr.asSlice(OFFSET$RefPicList0, LAYOUT$RefPicList0);}
    public char RefPicList0(int i) {return (char)this.RefPicList0().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i);}
    public void RefPicList0(int i, char value) {this.RefPicList0().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i, (byte)value);}

    public java.lang.foreign.MemorySegment RefPicList1() {return this.ptr.asSlice(OFFSET$RefPicList1, LAYOUT$RefPicList1);}
    public char RefPicList1(int i) {return (char)this.RefPicList1().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i);}
    public void RefPicList1(int i, char value) {this.RefPicList1().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i, (byte)value);}

    public java.lang.foreign.MemorySegment list_entry_l0() {return this.ptr.asSlice(OFFSET$list_entry_l0, LAYOUT$list_entry_l0);}
    public char list_entry_l0(int i) {return (char)this.list_entry_l0().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i);}
    public void list_entry_l0(int i, char value) {this.list_entry_l0().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i, (byte)value);}

    public java.lang.foreign.MemorySegment list_entry_l1() {return this.ptr.asSlice(OFFSET$list_entry_l1, LAYOUT$list_entry_l1);}
    public char list_entry_l1(int i) {return (char)this.list_entry_l1().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i);}
    public void list_entry_l1(int i, char value) {this.list_entry_l1().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i, (byte)value);}
}
