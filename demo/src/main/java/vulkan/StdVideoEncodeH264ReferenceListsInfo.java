package vulkan;

public record StdVideoEncodeH264ReferenceListsInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.GroupLayout LAYOUT$flags = vulkan.StdVideoEncodeH264ReferenceListsInfoFlags.gStructLayout;
    public static final long OFFSET$flags = 0L;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$num_ref_idx_l0_active_minus1 = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET$num_ref_idx_l0_active_minus1 = 4L;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$num_ref_idx_l1_active_minus1 = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET$num_ref_idx_l1_active_minus1 = 5L;
    public static final java.lang.foreign.SequenceLayout LAYOUT$RefPicList0 = java.lang.foreign.MemoryLayout.sequenceLayout(32, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET$RefPicList0 = 6L;
    public static final java.lang.foreign.SequenceLayout LAYOUT$RefPicList1 = java.lang.foreign.MemoryLayout.sequenceLayout(32, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET$RefPicList1 = 38L;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$refList0ModOpCount = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET$refList0ModOpCount = 70L;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$refList1ModOpCount = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET$refList1ModOpCount = 71L;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$refPicMarkingOpCount = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET$refPicMarkingOpCount = 72L;
    public static final java.lang.foreign.SequenceLayout LAYOUT$reserved1 = java.lang.foreign.MemoryLayout.sequenceLayout(7, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET$reserved1 = 73L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pRefList0ModOperations = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pRefList0ModOperations = 80L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pRefList1ModOperations = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pRefList1ModOperations = 88L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pRefPicMarkingOperations = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pRefPicMarkingOperations = 96L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$flags,
            LAYOUT$num_ref_idx_l0_active_minus1,
            LAYOUT$num_ref_idx_l1_active_minus1,
            LAYOUT$RefPicList0,
            LAYOUT$RefPicList1,
            LAYOUT$refList0ModOpCount,
            LAYOUT$refList1ModOpCount,
            LAYOUT$refPicMarkingOpCount,
            LAYOUT$reserved1,
            LAYOUT$pRefList0ModOperations,
            LAYOUT$pRefList1ModOperations,
            LAYOUT$pRefPicMarkingOperations
    ).withName("StdVideoEncodeH264ReferenceListsInfo");

    public StdVideoEncodeH264ReferenceListsInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static StdVideoEncodeH264ReferenceListsInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new StdVideoEncodeH264ReferenceListsInfo(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public vulkan.StdVideoEncodeH264ReferenceListsInfoFlags flags() {return new vulkan.StdVideoEncodeH264ReferenceListsInfoFlags(this.ptr.asSlice(OFFSET$flags, LAYOUT$flags));}
    public void flags(java.util.function.Consumer<vulkan.StdVideoEncodeH264ReferenceListsInfoFlags> consumer) {consumer.accept(this.flags());}
    public void flags(vulkan.StdVideoEncodeH264ReferenceListsInfoFlags value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$flags, LAYOUT$flags.byteSize());}

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

    public char refList0ModOpCount() {return (char)this.ptr.get(LAYOUT$refList0ModOpCount, OFFSET$refList0ModOpCount);}
    public void refList0ModOpCount(char value) {this.ptr.set(LAYOUT$refList0ModOpCount, OFFSET$refList0ModOpCount, (byte)value);}
    public java.lang.foreign.MemorySegment refList0ModOpCount_ptr() {return this.ptr.asSlice(OFFSET$refList0ModOpCount, LAYOUT$refList0ModOpCount);}

    public char refList1ModOpCount() {return (char)this.ptr.get(LAYOUT$refList1ModOpCount, OFFSET$refList1ModOpCount);}
    public void refList1ModOpCount(char value) {this.ptr.set(LAYOUT$refList1ModOpCount, OFFSET$refList1ModOpCount, (byte)value);}
    public java.lang.foreign.MemorySegment refList1ModOpCount_ptr() {return this.ptr.asSlice(OFFSET$refList1ModOpCount, LAYOUT$refList1ModOpCount);}

    public char refPicMarkingOpCount() {return (char)this.ptr.get(LAYOUT$refPicMarkingOpCount, OFFSET$refPicMarkingOpCount);}
    public void refPicMarkingOpCount(char value) {this.ptr.set(LAYOUT$refPicMarkingOpCount, OFFSET$refPicMarkingOpCount, (byte)value);}
    public java.lang.foreign.MemorySegment refPicMarkingOpCount_ptr() {return this.ptr.asSlice(OFFSET$refPicMarkingOpCount, LAYOUT$refPicMarkingOpCount);}

    public java.lang.foreign.MemorySegment reserved1() {return this.ptr.asSlice(OFFSET$reserved1, LAYOUT$reserved1);}
    public char reserved1(int i) {return (char)this.reserved1().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i);}
    public void reserved1(int i, char value) {this.reserved1().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i, (byte)value);}

    public java.lang.foreign.MemorySegment pRefList0ModOperations() {return this.ptr.get(LAYOUT$pRefList0ModOperations, OFFSET$pRefList0ModOperations);}
    public void pRefList0ModOperations(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pRefList0ModOperations, OFFSET$pRefList0ModOperations, value);}
    public java.lang.foreign.MemorySegment pRefList0ModOperations_ptr() {return this.ptr.asSlice(OFFSET$pRefList0ModOperations, LAYOUT$pRefList0ModOperations);}

    public java.lang.foreign.MemorySegment pRefList1ModOperations() {return this.ptr.get(LAYOUT$pRefList1ModOperations, OFFSET$pRefList1ModOperations);}
    public void pRefList1ModOperations(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pRefList1ModOperations, OFFSET$pRefList1ModOperations, value);}
    public java.lang.foreign.MemorySegment pRefList1ModOperations_ptr() {return this.ptr.asSlice(OFFSET$pRefList1ModOperations, LAYOUT$pRefList1ModOperations);}

    public java.lang.foreign.MemorySegment pRefPicMarkingOperations() {return this.ptr.get(LAYOUT$pRefPicMarkingOperations, OFFSET$pRefPicMarkingOperations);}
    public void pRefPicMarkingOperations(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pRefPicMarkingOperations, OFFSET$pRefPicMarkingOperations, value);}
    public java.lang.foreign.MemorySegment pRefPicMarkingOperations_ptr() {return this.ptr.asSlice(OFFSET$pRefPicMarkingOperations, LAYOUT$pRefPicMarkingOperations);}
}
