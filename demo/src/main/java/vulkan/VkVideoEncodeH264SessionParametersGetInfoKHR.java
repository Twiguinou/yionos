package vulkan;

public record VkVideoEncodeH264SessionParametersGetInfoKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__writeStdSPS = java.lang.foreign.ValueLayout.JAVA_INT.withName("writeStdSPS");
    public static final long OFFSET__writeStdSPS = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__writeStdPPS = java.lang.foreign.ValueLayout.JAVA_INT.withName("writeStdPPS");
    public static final long OFFSET__writeStdPPS = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__stdSPSId = java.lang.foreign.ValueLayout.JAVA_INT.withName("stdSPSId");
    public static final long OFFSET__stdSPSId = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__stdPPSId = java.lang.foreign.ValueLayout.JAVA_INT.withName("stdPPSId");
    public static final long OFFSET__stdPPSId = 28;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__writeStdSPS,
            LAYOUT__writeStdPPS,
            LAYOUT__stdSPSId,
            LAYOUT__stdPPSId
    ).withByteAlignment(8).withName("VkVideoEncodeH264SessionParametersGetInfoKHR");

    public VkVideoEncodeH264SessionParametersGetInfoKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkVideoEncodeH264SessionParametersGetInfoKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkVideoEncodeH264SessionParametersGetInfoKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkVideoEncodeH264SessionParametersGetInfoKHR value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int writeStdSPS() {return this.ptr.get(LAYOUT__writeStdSPS, OFFSET__writeStdSPS);}
    public void writeStdSPS(int value) {this.ptr.set(LAYOUT__writeStdSPS, OFFSET__writeStdSPS, value);}
    public java.lang.foreign.MemorySegment $writeStdSPS() {return this.ptr.asSlice(OFFSET__writeStdSPS, LAYOUT__writeStdSPS);}

    public int writeStdPPS() {return this.ptr.get(LAYOUT__writeStdPPS, OFFSET__writeStdPPS);}
    public void writeStdPPS(int value) {this.ptr.set(LAYOUT__writeStdPPS, OFFSET__writeStdPPS, value);}
    public java.lang.foreign.MemorySegment $writeStdPPS() {return this.ptr.asSlice(OFFSET__writeStdPPS, LAYOUT__writeStdPPS);}

    public int stdSPSId() {return this.ptr.get(LAYOUT__stdSPSId, OFFSET__stdSPSId);}
    public void stdSPSId(int value) {this.ptr.set(LAYOUT__stdSPSId, OFFSET__stdSPSId, value);}
    public java.lang.foreign.MemorySegment $stdSPSId() {return this.ptr.asSlice(OFFSET__stdSPSId, LAYOUT__stdSPSId);}

    public int stdPPSId() {return this.ptr.get(LAYOUT__stdPPSId, OFFSET__stdPPSId);}
    public void stdPPSId(int value) {this.ptr.set(LAYOUT__stdPPSId, OFFSET__stdPPSId, value);}
    public java.lang.foreign.MemorySegment $stdPPSId() {return this.ptr.asSlice(OFFSET__stdPPSId, LAYOUT__stdPPSId);}
}
