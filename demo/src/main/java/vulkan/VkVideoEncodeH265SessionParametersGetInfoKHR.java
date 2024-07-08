package vulkan;

public record VkVideoEncodeH265SessionParametersGetInfoKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__writeStdVPS = java.lang.foreign.ValueLayout.JAVA_INT.withName("writeStdVPS");
    public static final long OFFSET__writeStdVPS = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__writeStdSPS = java.lang.foreign.ValueLayout.JAVA_INT.withName("writeStdSPS");
    public static final long OFFSET__writeStdSPS = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__writeStdPPS = java.lang.foreign.ValueLayout.JAVA_INT.withName("writeStdPPS");
    public static final long OFFSET__writeStdPPS = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__stdVPSId = java.lang.foreign.ValueLayout.JAVA_INT.withName("stdVPSId");
    public static final long OFFSET__stdVPSId = 28;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__stdSPSId = java.lang.foreign.ValueLayout.JAVA_INT.withName("stdSPSId");
    public static final long OFFSET__stdSPSId = 32;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__stdPPSId = java.lang.foreign.ValueLayout.JAVA_INT.withName("stdPPSId");
    public static final long OFFSET__stdPPSId = 36;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__writeStdVPS,
            LAYOUT__writeStdSPS,
            LAYOUT__writeStdPPS,
            LAYOUT__stdVPSId,
            LAYOUT__stdSPSId,
            LAYOUT__stdPPSId
    ).withByteAlignment(8).withName("VkVideoEncodeH265SessionParametersGetInfoKHR");

    public VkVideoEncodeH265SessionParametersGetInfoKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkVideoEncodeH265SessionParametersGetInfoKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkVideoEncodeH265SessionParametersGetInfoKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkVideoEncodeH265SessionParametersGetInfoKHR value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int writeStdVPS() {return this.ptr.get(LAYOUT__writeStdVPS, OFFSET__writeStdVPS);}
    public void writeStdVPS(int value) {this.ptr.set(LAYOUT__writeStdVPS, OFFSET__writeStdVPS, value);}
    public java.lang.foreign.MemorySegment $writeStdVPS() {return this.ptr.asSlice(OFFSET__writeStdVPS, LAYOUT__writeStdVPS);}

    public int writeStdSPS() {return this.ptr.get(LAYOUT__writeStdSPS, OFFSET__writeStdSPS);}
    public void writeStdSPS(int value) {this.ptr.set(LAYOUT__writeStdSPS, OFFSET__writeStdSPS, value);}
    public java.lang.foreign.MemorySegment $writeStdSPS() {return this.ptr.asSlice(OFFSET__writeStdSPS, LAYOUT__writeStdSPS);}

    public int writeStdPPS() {return this.ptr.get(LAYOUT__writeStdPPS, OFFSET__writeStdPPS);}
    public void writeStdPPS(int value) {this.ptr.set(LAYOUT__writeStdPPS, OFFSET__writeStdPPS, value);}
    public java.lang.foreign.MemorySegment $writeStdPPS() {return this.ptr.asSlice(OFFSET__writeStdPPS, LAYOUT__writeStdPPS);}

    public int stdVPSId() {return this.ptr.get(LAYOUT__stdVPSId, OFFSET__stdVPSId);}
    public void stdVPSId(int value) {this.ptr.set(LAYOUT__stdVPSId, OFFSET__stdVPSId, value);}
    public java.lang.foreign.MemorySegment $stdVPSId() {return this.ptr.asSlice(OFFSET__stdVPSId, LAYOUT__stdVPSId);}

    public int stdSPSId() {return this.ptr.get(LAYOUT__stdSPSId, OFFSET__stdSPSId);}
    public void stdSPSId(int value) {this.ptr.set(LAYOUT__stdSPSId, OFFSET__stdSPSId, value);}
    public java.lang.foreign.MemorySegment $stdSPSId() {return this.ptr.asSlice(OFFSET__stdSPSId, LAYOUT__stdSPSId);}

    public int stdPPSId() {return this.ptr.get(LAYOUT__stdPPSId, OFFSET__stdPPSId);}
    public void stdPPSId(int value) {this.ptr.set(LAYOUT__stdPPSId, OFFSET__stdPPSId, value);}
    public java.lang.foreign.MemorySegment $stdPPSId() {return this.ptr.asSlice(OFFSET__stdPPSId, LAYOUT__stdPPSId);}
}
