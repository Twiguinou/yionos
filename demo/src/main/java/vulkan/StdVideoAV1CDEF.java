package vulkan;

public record StdVideoAV1CDEF(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__cdef_damping_minus_3 = java.lang.foreign.ValueLayout.JAVA_BYTE.withName("cdef_damping_minus_3");
    public static final long OFFSET__cdef_damping_minus_3 = 0;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__cdef_bits = java.lang.foreign.ValueLayout.JAVA_BYTE.withName("cdef_bits");
    public static final long OFFSET__cdef_bits = 1;
    public static final java.lang.foreign.SequenceLayout LAYOUT__cdef_y_pri_strength = java.lang.foreign.MemoryLayout.sequenceLayout(8, java.lang.foreign.ValueLayout.JAVA_BYTE).withName("cdef_y_pri_strength");
    public static final long OFFSET__cdef_y_pri_strength = 2;
    public static final java.lang.foreign.SequenceLayout LAYOUT__cdef_y_sec_strength = java.lang.foreign.MemoryLayout.sequenceLayout(8, java.lang.foreign.ValueLayout.JAVA_BYTE).withName("cdef_y_sec_strength");
    public static final long OFFSET__cdef_y_sec_strength = 10;
    public static final java.lang.foreign.SequenceLayout LAYOUT__cdef_uv_pri_strength = java.lang.foreign.MemoryLayout.sequenceLayout(8, java.lang.foreign.ValueLayout.JAVA_BYTE).withName("cdef_uv_pri_strength");
    public static final long OFFSET__cdef_uv_pri_strength = 18;
    public static final java.lang.foreign.SequenceLayout LAYOUT__cdef_uv_sec_strength = java.lang.foreign.MemoryLayout.sequenceLayout(8, java.lang.foreign.ValueLayout.JAVA_BYTE).withName("cdef_uv_sec_strength");
    public static final long OFFSET__cdef_uv_sec_strength = 26;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__cdef_damping_minus_3,
            LAYOUT__cdef_bits,
            LAYOUT__cdef_y_pri_strength,
            LAYOUT__cdef_y_sec_strength,
            LAYOUT__cdef_uv_pri_strength,
            LAYOUT__cdef_uv_sec_strength
    ).withByteAlignment(1).withName("StdVideoAV1CDEF");

    public StdVideoAV1CDEF(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static StdVideoAV1CDEF getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new StdVideoAV1CDEF(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, StdVideoAV1CDEF value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public byte cdef_damping_minus_3() {return this.ptr.get(LAYOUT__cdef_damping_minus_3, OFFSET__cdef_damping_minus_3);}
    public void cdef_damping_minus_3(byte value) {this.ptr.set(LAYOUT__cdef_damping_minus_3, OFFSET__cdef_damping_minus_3, value);}
    public java.lang.foreign.MemorySegment $cdef_damping_minus_3() {return this.ptr.asSlice(OFFSET__cdef_damping_minus_3, LAYOUT__cdef_damping_minus_3);}

    public byte cdef_bits() {return this.ptr.get(LAYOUT__cdef_bits, OFFSET__cdef_bits);}
    public void cdef_bits(byte value) {this.ptr.set(LAYOUT__cdef_bits, OFFSET__cdef_bits, value);}
    public java.lang.foreign.MemorySegment $cdef_bits() {return this.ptr.asSlice(OFFSET__cdef_bits, LAYOUT__cdef_bits);}

    public java.lang.foreign.MemorySegment cdef_y_pri_strength() {return this.ptr.asSlice(OFFSET__cdef_y_pri_strength, LAYOUT__cdef_y_pri_strength);}
    public byte cdef_y_pri_strength(int index) {return this.cdef_y_pri_strength().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index);}
    public void cdef_y_pri_strength(int index, byte value) {this.cdef_y_pri_strength().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index, value);}

    public java.lang.foreign.MemorySegment cdef_y_sec_strength() {return this.ptr.asSlice(OFFSET__cdef_y_sec_strength, LAYOUT__cdef_y_sec_strength);}
    public byte cdef_y_sec_strength(int index) {return this.cdef_y_sec_strength().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index);}
    public void cdef_y_sec_strength(int index, byte value) {this.cdef_y_sec_strength().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index, value);}

    public java.lang.foreign.MemorySegment cdef_uv_pri_strength() {return this.ptr.asSlice(OFFSET__cdef_uv_pri_strength, LAYOUT__cdef_uv_pri_strength);}
    public byte cdef_uv_pri_strength(int index) {return this.cdef_uv_pri_strength().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index);}
    public void cdef_uv_pri_strength(int index, byte value) {this.cdef_uv_pri_strength().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index, value);}

    public java.lang.foreign.MemorySegment cdef_uv_sec_strength() {return this.ptr.asSlice(OFFSET__cdef_uv_sec_strength, LAYOUT__cdef_uv_sec_strength);}
    public byte cdef_uv_sec_strength(int index) {return this.cdef_uv_sec_strength().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index);}
    public void cdef_uv_sec_strength(int index, byte value) {this.cdef_uv_sec_strength().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index, value);}
}
