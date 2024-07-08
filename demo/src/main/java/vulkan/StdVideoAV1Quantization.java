package vulkan;

public record StdVideoAV1Quantization(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT__flags = vulkan.StdVideoAV1QuantizationFlags.gRecordLayout.withName("flags");
    public static final long OFFSET__flags = 0;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__base_q_idx = java.lang.foreign.ValueLayout.JAVA_BYTE.withName("base_q_idx");
    public static final long OFFSET__base_q_idx = 4;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__DeltaQYDc = java.lang.foreign.ValueLayout.JAVA_BYTE.withName("DeltaQYDc");
    public static final long OFFSET__DeltaQYDc = 5;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__DeltaQUDc = java.lang.foreign.ValueLayout.JAVA_BYTE.withName("DeltaQUDc");
    public static final long OFFSET__DeltaQUDc = 6;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__DeltaQUAc = java.lang.foreign.ValueLayout.JAVA_BYTE.withName("DeltaQUAc");
    public static final long OFFSET__DeltaQUAc = 7;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__DeltaQVDc = java.lang.foreign.ValueLayout.JAVA_BYTE.withName("DeltaQVDc");
    public static final long OFFSET__DeltaQVDc = 8;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__DeltaQVAc = java.lang.foreign.ValueLayout.JAVA_BYTE.withName("DeltaQVAc");
    public static final long OFFSET__DeltaQVAc = 9;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__qm_y = java.lang.foreign.ValueLayout.JAVA_BYTE.withName("qm_y");
    public static final long OFFSET__qm_y = 10;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__qm_u = java.lang.foreign.ValueLayout.JAVA_BYTE.withName("qm_u");
    public static final long OFFSET__qm_u = 11;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__qm_v = java.lang.foreign.ValueLayout.JAVA_BYTE.withName("qm_v");
    public static final long OFFSET__qm_v = 12;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__flags,
            LAYOUT__base_q_idx,
            LAYOUT__DeltaQYDc,
            LAYOUT__DeltaQUDc,
            LAYOUT__DeltaQUAc,
            LAYOUT__DeltaQVDc,
            LAYOUT__DeltaQVAc,
            LAYOUT__qm_y,
            LAYOUT__qm_u,
            LAYOUT__qm_v,
            java.lang.foreign.MemoryLayout.paddingLayout(3)
    ).withByteAlignment(4).withName("StdVideoAV1Quantization");

    public StdVideoAV1Quantization(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static StdVideoAV1Quantization getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new StdVideoAV1Quantization(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, StdVideoAV1Quantization value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public vulkan.StdVideoAV1QuantizationFlags flags() {return new vulkan.StdVideoAV1QuantizationFlags(this.ptr.asSlice(OFFSET__flags, LAYOUT__flags));}
    public void flags(java.util.function.Consumer<vulkan.StdVideoAV1QuantizationFlags> consumer) {consumer.accept(this.flags());}
    public void flags(vulkan.StdVideoAV1QuantizationFlags value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__flags, LAYOUT__flags.byteSize());}

    public byte base_q_idx() {return this.ptr.get(LAYOUT__base_q_idx, OFFSET__base_q_idx);}
    public void base_q_idx(byte value) {this.ptr.set(LAYOUT__base_q_idx, OFFSET__base_q_idx, value);}
    public java.lang.foreign.MemorySegment $base_q_idx() {return this.ptr.asSlice(OFFSET__base_q_idx, LAYOUT__base_q_idx);}

    public byte DeltaQYDc() {return this.ptr.get(LAYOUT__DeltaQYDc, OFFSET__DeltaQYDc);}
    public void DeltaQYDc(byte value) {this.ptr.set(LAYOUT__DeltaQYDc, OFFSET__DeltaQYDc, value);}
    public java.lang.foreign.MemorySegment $DeltaQYDc() {return this.ptr.asSlice(OFFSET__DeltaQYDc, LAYOUT__DeltaQYDc);}

    public byte DeltaQUDc() {return this.ptr.get(LAYOUT__DeltaQUDc, OFFSET__DeltaQUDc);}
    public void DeltaQUDc(byte value) {this.ptr.set(LAYOUT__DeltaQUDc, OFFSET__DeltaQUDc, value);}
    public java.lang.foreign.MemorySegment $DeltaQUDc() {return this.ptr.asSlice(OFFSET__DeltaQUDc, LAYOUT__DeltaQUDc);}

    public byte DeltaQUAc() {return this.ptr.get(LAYOUT__DeltaQUAc, OFFSET__DeltaQUAc);}
    public void DeltaQUAc(byte value) {this.ptr.set(LAYOUT__DeltaQUAc, OFFSET__DeltaQUAc, value);}
    public java.lang.foreign.MemorySegment $DeltaQUAc() {return this.ptr.asSlice(OFFSET__DeltaQUAc, LAYOUT__DeltaQUAc);}

    public byte DeltaQVDc() {return this.ptr.get(LAYOUT__DeltaQVDc, OFFSET__DeltaQVDc);}
    public void DeltaQVDc(byte value) {this.ptr.set(LAYOUT__DeltaQVDc, OFFSET__DeltaQVDc, value);}
    public java.lang.foreign.MemorySegment $DeltaQVDc() {return this.ptr.asSlice(OFFSET__DeltaQVDc, LAYOUT__DeltaQVDc);}

    public byte DeltaQVAc() {return this.ptr.get(LAYOUT__DeltaQVAc, OFFSET__DeltaQVAc);}
    public void DeltaQVAc(byte value) {this.ptr.set(LAYOUT__DeltaQVAc, OFFSET__DeltaQVAc, value);}
    public java.lang.foreign.MemorySegment $DeltaQVAc() {return this.ptr.asSlice(OFFSET__DeltaQVAc, LAYOUT__DeltaQVAc);}

    public byte qm_y() {return this.ptr.get(LAYOUT__qm_y, OFFSET__qm_y);}
    public void qm_y(byte value) {this.ptr.set(LAYOUT__qm_y, OFFSET__qm_y, value);}
    public java.lang.foreign.MemorySegment $qm_y() {return this.ptr.asSlice(OFFSET__qm_y, LAYOUT__qm_y);}

    public byte qm_u() {return this.ptr.get(LAYOUT__qm_u, OFFSET__qm_u);}
    public void qm_u(byte value) {this.ptr.set(LAYOUT__qm_u, OFFSET__qm_u, value);}
    public java.lang.foreign.MemorySegment $qm_u() {return this.ptr.asSlice(OFFSET__qm_u, LAYOUT__qm_u);}

    public byte qm_v() {return this.ptr.get(LAYOUT__qm_v, OFFSET__qm_v);}
    public void qm_v(byte value) {this.ptr.set(LAYOUT__qm_v, OFFSET__qm_v, value);}
    public java.lang.foreign.MemorySegment $qm_v() {return this.ptr.asSlice(OFFSET__qm_v, LAYOUT__qm_v);}
}
