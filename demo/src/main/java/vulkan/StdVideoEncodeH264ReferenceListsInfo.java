package vulkan;

public record StdVideoEncodeH264ReferenceListsInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT__flags = vulkan.StdVideoEncodeH264ReferenceListsInfoFlags.gRecordLayout.withName("flags");
    public static final long OFFSET__flags = 0;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__num_ref_idx_l0_active_minus1 = java.lang.foreign.ValueLayout.JAVA_BYTE.withName("num_ref_idx_l0_active_minus1");
    public static final long OFFSET__num_ref_idx_l0_active_minus1 = 4;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__num_ref_idx_l1_active_minus1 = java.lang.foreign.ValueLayout.JAVA_BYTE.withName("num_ref_idx_l1_active_minus1");
    public static final long OFFSET__num_ref_idx_l1_active_minus1 = 5;
    public static final java.lang.foreign.SequenceLayout LAYOUT__RefPicList0 = java.lang.foreign.MemoryLayout.sequenceLayout(32, java.lang.foreign.ValueLayout.JAVA_BYTE).withName("RefPicList0");
    public static final long OFFSET__RefPicList0 = 6;
    public static final java.lang.foreign.SequenceLayout LAYOUT__RefPicList1 = java.lang.foreign.MemoryLayout.sequenceLayout(32, java.lang.foreign.ValueLayout.JAVA_BYTE).withName("RefPicList1");
    public static final long OFFSET__RefPicList1 = 38;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__refList0ModOpCount = java.lang.foreign.ValueLayout.JAVA_BYTE.withName("refList0ModOpCount");
    public static final long OFFSET__refList0ModOpCount = 70;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__refList1ModOpCount = java.lang.foreign.ValueLayout.JAVA_BYTE.withName("refList1ModOpCount");
    public static final long OFFSET__refList1ModOpCount = 71;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__refPicMarkingOpCount = java.lang.foreign.ValueLayout.JAVA_BYTE.withName("refPicMarkingOpCount");
    public static final long OFFSET__refPicMarkingOpCount = 72;
    public static final java.lang.foreign.SequenceLayout LAYOUT__reserved1 = java.lang.foreign.MemoryLayout.sequenceLayout(7, java.lang.foreign.ValueLayout.JAVA_BYTE).withName("reserved1");
    public static final long OFFSET__reserved1 = 73;
    public static final java.lang.foreign.AddressLayout LAYOUT__pRefList0ModOperations = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pRefList0ModOperations");
    public static final long OFFSET__pRefList0ModOperations = 80;
    public static final java.lang.foreign.AddressLayout LAYOUT__pRefList1ModOperations = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pRefList1ModOperations");
    public static final long OFFSET__pRefList1ModOperations = 88;
    public static final java.lang.foreign.AddressLayout LAYOUT__pRefPicMarkingOperations = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pRefPicMarkingOperations");
    public static final long OFFSET__pRefPicMarkingOperations = 96;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__flags,
            LAYOUT__num_ref_idx_l0_active_minus1,
            LAYOUT__num_ref_idx_l1_active_minus1,
            LAYOUT__RefPicList0,
            LAYOUT__RefPicList1,
            LAYOUT__refList0ModOpCount,
            LAYOUT__refList1ModOpCount,
            LAYOUT__refPicMarkingOpCount,
            LAYOUT__reserved1,
            LAYOUT__pRefList0ModOperations,
            LAYOUT__pRefList1ModOperations,
            LAYOUT__pRefPicMarkingOperations
    ).withByteAlignment(8).withName("StdVideoEncodeH264ReferenceListsInfo");

    public StdVideoEncodeH264ReferenceListsInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static StdVideoEncodeH264ReferenceListsInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new StdVideoEncodeH264ReferenceListsInfo(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, StdVideoEncodeH264ReferenceListsInfo value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public vulkan.StdVideoEncodeH264ReferenceListsInfoFlags flags() {return new vulkan.StdVideoEncodeH264ReferenceListsInfoFlags(this.ptr.asSlice(OFFSET__flags, LAYOUT__flags));}
    public void flags(java.util.function.Consumer<vulkan.StdVideoEncodeH264ReferenceListsInfoFlags> consumer) {consumer.accept(this.flags());}
    public void flags(vulkan.StdVideoEncodeH264ReferenceListsInfoFlags value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__flags, LAYOUT__flags.byteSize());}

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

    public byte refList0ModOpCount() {return this.ptr.get(LAYOUT__refList0ModOpCount, OFFSET__refList0ModOpCount);}
    public void refList0ModOpCount(byte value) {this.ptr.set(LAYOUT__refList0ModOpCount, OFFSET__refList0ModOpCount, value);}
    public java.lang.foreign.MemorySegment $refList0ModOpCount() {return this.ptr.asSlice(OFFSET__refList0ModOpCount, LAYOUT__refList0ModOpCount);}

    public byte refList1ModOpCount() {return this.ptr.get(LAYOUT__refList1ModOpCount, OFFSET__refList1ModOpCount);}
    public void refList1ModOpCount(byte value) {this.ptr.set(LAYOUT__refList1ModOpCount, OFFSET__refList1ModOpCount, value);}
    public java.lang.foreign.MemorySegment $refList1ModOpCount() {return this.ptr.asSlice(OFFSET__refList1ModOpCount, LAYOUT__refList1ModOpCount);}

    public byte refPicMarkingOpCount() {return this.ptr.get(LAYOUT__refPicMarkingOpCount, OFFSET__refPicMarkingOpCount);}
    public void refPicMarkingOpCount(byte value) {this.ptr.set(LAYOUT__refPicMarkingOpCount, OFFSET__refPicMarkingOpCount, value);}
    public java.lang.foreign.MemorySegment $refPicMarkingOpCount() {return this.ptr.asSlice(OFFSET__refPicMarkingOpCount, LAYOUT__refPicMarkingOpCount);}

    public java.lang.foreign.MemorySegment reserved1() {return this.ptr.asSlice(OFFSET__reserved1, LAYOUT__reserved1);}
    public byte reserved1(int index) {return this.reserved1().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index);}
    public void reserved1(int index, byte value) {this.reserved1().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index, value);}

    public java.lang.foreign.MemorySegment pRefList0ModOperations() {return this.ptr.get(LAYOUT__pRefList0ModOperations, OFFSET__pRefList0ModOperations);}
    public void pRefList0ModOperations(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pRefList0ModOperations, OFFSET__pRefList0ModOperations, value);}
    public java.lang.foreign.MemorySegment $pRefList0ModOperations() {return this.ptr.asSlice(OFFSET__pRefList0ModOperations, LAYOUT__pRefList0ModOperations);}

    public java.lang.foreign.MemorySegment pRefList1ModOperations() {return this.ptr.get(LAYOUT__pRefList1ModOperations, OFFSET__pRefList1ModOperations);}
    public void pRefList1ModOperations(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pRefList1ModOperations, OFFSET__pRefList1ModOperations, value);}
    public java.lang.foreign.MemorySegment $pRefList1ModOperations() {return this.ptr.asSlice(OFFSET__pRefList1ModOperations, LAYOUT__pRefList1ModOperations);}

    public java.lang.foreign.MemorySegment pRefPicMarkingOperations() {return this.ptr.get(LAYOUT__pRefPicMarkingOperations, OFFSET__pRefPicMarkingOperations);}
    public void pRefPicMarkingOperations(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pRefPicMarkingOperations, OFFSET__pRefPicMarkingOperations, value);}
    public java.lang.foreign.MemorySegment $pRefPicMarkingOperations() {return this.ptr.asSlice(OFFSET__pRefPicMarkingOperations, LAYOUT__pRefPicMarkingOperations);}
}
