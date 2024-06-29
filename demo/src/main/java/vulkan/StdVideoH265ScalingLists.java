package vulkan;

public record StdVideoH265ScalingLists(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.SequenceLayout LAYOUT__ScalingList4x4 = java.lang.foreign.MemoryLayout.sequenceLayout(6, java.lang.foreign.MemoryLayout.sequenceLayout(16, java.lang.foreign.ValueLayout.JAVA_BYTE));
    public static final long OFFSET__ScalingList4x4 = 0;
    public static final java.lang.foreign.SequenceLayout LAYOUT__ScalingList8x8 = java.lang.foreign.MemoryLayout.sequenceLayout(6, java.lang.foreign.MemoryLayout.sequenceLayout(64, java.lang.foreign.ValueLayout.JAVA_BYTE));
    public static final long OFFSET__ScalingList8x8 = 96;
    public static final java.lang.foreign.SequenceLayout LAYOUT__ScalingList16x16 = java.lang.foreign.MemoryLayout.sequenceLayout(6, java.lang.foreign.MemoryLayout.sequenceLayout(64, java.lang.foreign.ValueLayout.JAVA_BYTE));
    public static final long OFFSET__ScalingList16x16 = 480;
    public static final java.lang.foreign.SequenceLayout LAYOUT__ScalingList32x32 = java.lang.foreign.MemoryLayout.sequenceLayout(2, java.lang.foreign.MemoryLayout.sequenceLayout(64, java.lang.foreign.ValueLayout.JAVA_BYTE));
    public static final long OFFSET__ScalingList32x32 = 864;
    public static final java.lang.foreign.SequenceLayout LAYOUT__ScalingListDCCoef16x16 = java.lang.foreign.MemoryLayout.sequenceLayout(6, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET__ScalingListDCCoef16x16 = 992;
    public static final java.lang.foreign.SequenceLayout LAYOUT__ScalingListDCCoef32x32 = java.lang.foreign.MemoryLayout.sequenceLayout(2, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET__ScalingListDCCoef32x32 = 998;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__ScalingList4x4,
            LAYOUT__ScalingList8x8,
            LAYOUT__ScalingList16x16,
            LAYOUT__ScalingList32x32,
            LAYOUT__ScalingListDCCoef16x16,
            LAYOUT__ScalingListDCCoef32x32
    ).withByteAlignment(1).withName("StdVideoH265ScalingLists");

    public StdVideoH265ScalingLists(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static StdVideoH265ScalingLists getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new StdVideoH265ScalingLists(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, StdVideoH265ScalingLists value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public java.lang.foreign.MemorySegment ScalingList4x4() {return this.ptr.asSlice(OFFSET__ScalingList4x4, LAYOUT__ScalingList4x4);}

    public java.lang.foreign.MemorySegment ScalingList8x8() {return this.ptr.asSlice(OFFSET__ScalingList8x8, LAYOUT__ScalingList8x8);}

    public java.lang.foreign.MemorySegment ScalingList16x16() {return this.ptr.asSlice(OFFSET__ScalingList16x16, LAYOUT__ScalingList16x16);}

    public java.lang.foreign.MemorySegment ScalingList32x32() {return this.ptr.asSlice(OFFSET__ScalingList32x32, LAYOUT__ScalingList32x32);}

    public java.lang.foreign.MemorySegment ScalingListDCCoef16x16() {return this.ptr.asSlice(OFFSET__ScalingListDCCoef16x16, LAYOUT__ScalingListDCCoef16x16);}
    public byte ScalingListDCCoef16x16(int index) {return this.ScalingListDCCoef16x16().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index);}
    public void ScalingListDCCoef16x16(int index, byte value) {this.ScalingListDCCoef16x16().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index, value);}

    public java.lang.foreign.MemorySegment ScalingListDCCoef32x32() {return this.ptr.asSlice(OFFSET__ScalingListDCCoef32x32, LAYOUT__ScalingListDCCoef32x32);}
    public byte ScalingListDCCoef32x32(int index) {return this.ScalingListDCCoef32x32().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index);}
    public void ScalingListDCCoef32x32(int index, byte value) {this.ScalingListDCCoef32x32().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index, value);}
}
