package vulkan;

public record VkVideoEncodeH264SessionParametersAddInfoKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__stdSPSCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__stdSPSCount = 16;
    public static final java.lang.foreign.AddressLayout LAYOUT__pStdSPSs = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pStdSPSs = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__stdPPSCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__stdPPSCount = 32;
    public static final java.lang.foreign.AddressLayout LAYOUT__pStdPPSs = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pStdPPSs = 40;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__stdSPSCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pStdSPSs,
            LAYOUT__stdPPSCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pStdPPSs
    ).withByteAlignment(8).withName("VkVideoEncodeH264SessionParametersAddInfoKHR");

    public VkVideoEncodeH264SessionParametersAddInfoKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkVideoEncodeH264SessionParametersAddInfoKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkVideoEncodeH264SessionParametersAddInfoKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkVideoEncodeH264SessionParametersAddInfoKHR value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int stdSPSCount() {return this.ptr.get(LAYOUT__stdSPSCount, OFFSET__stdSPSCount);}
    public void stdSPSCount(int value) {this.ptr.set(LAYOUT__stdSPSCount, OFFSET__stdSPSCount, value);}
    public java.lang.foreign.MemorySegment $stdSPSCount() {return this.ptr.asSlice(OFFSET__stdSPSCount, LAYOUT__stdSPSCount);}

    public java.lang.foreign.MemorySegment pStdSPSs() {return this.ptr.get(LAYOUT__pStdSPSs, OFFSET__pStdSPSs);}
    public void pStdSPSs(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pStdSPSs, OFFSET__pStdSPSs, value);}
    public java.lang.foreign.MemorySegment $pStdSPSs() {return this.ptr.asSlice(OFFSET__pStdSPSs, LAYOUT__pStdSPSs);}

    public int stdPPSCount() {return this.ptr.get(LAYOUT__stdPPSCount, OFFSET__stdPPSCount);}
    public void stdPPSCount(int value) {this.ptr.set(LAYOUT__stdPPSCount, OFFSET__stdPPSCount, value);}
    public java.lang.foreign.MemorySegment $stdPPSCount() {return this.ptr.asSlice(OFFSET__stdPPSCount, LAYOUT__stdPPSCount);}

    public java.lang.foreign.MemorySegment pStdPPSs() {return this.ptr.get(LAYOUT__pStdPPSs, OFFSET__pStdPPSs);}
    public void pStdPPSs(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pStdPPSs, OFFSET__pStdPPSs, value);}
    public java.lang.foreign.MemorySegment $pStdPPSs() {return this.ptr.asSlice(OFFSET__pStdPPSs, LAYOUT__pStdPPSs);}
}
