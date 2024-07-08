package vulkan;

public record VkVideoEncodeH264SessionParametersCreateInfoKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxStdSPSCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxStdSPSCount");
    public static final long OFFSET__maxStdSPSCount = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxStdPPSCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxStdPPSCount");
    public static final long OFFSET__maxStdPPSCount = 20;
    public static final java.lang.foreign.AddressLayout LAYOUT__pParametersAddInfo = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pParametersAddInfo");
    public static final long OFFSET__pParametersAddInfo = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__maxStdSPSCount,
            LAYOUT__maxStdPPSCount,
            LAYOUT__pParametersAddInfo
    ).withByteAlignment(8).withName("VkVideoEncodeH264SessionParametersCreateInfoKHR");

    public VkVideoEncodeH264SessionParametersCreateInfoKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkVideoEncodeH264SessionParametersCreateInfoKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkVideoEncodeH264SessionParametersCreateInfoKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkVideoEncodeH264SessionParametersCreateInfoKHR value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int maxStdSPSCount() {return this.ptr.get(LAYOUT__maxStdSPSCount, OFFSET__maxStdSPSCount);}
    public void maxStdSPSCount(int value) {this.ptr.set(LAYOUT__maxStdSPSCount, OFFSET__maxStdSPSCount, value);}
    public java.lang.foreign.MemorySegment $maxStdSPSCount() {return this.ptr.asSlice(OFFSET__maxStdSPSCount, LAYOUT__maxStdSPSCount);}

    public int maxStdPPSCount() {return this.ptr.get(LAYOUT__maxStdPPSCount, OFFSET__maxStdPPSCount);}
    public void maxStdPPSCount(int value) {this.ptr.set(LAYOUT__maxStdPPSCount, OFFSET__maxStdPPSCount, value);}
    public java.lang.foreign.MemorySegment $maxStdPPSCount() {return this.ptr.asSlice(OFFSET__maxStdPPSCount, LAYOUT__maxStdPPSCount);}

    public java.lang.foreign.MemorySegment pParametersAddInfo() {return this.ptr.get(LAYOUT__pParametersAddInfo, OFFSET__pParametersAddInfo);}
    public void pParametersAddInfo(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pParametersAddInfo, OFFSET__pParametersAddInfo, value);}
    public java.lang.foreign.MemorySegment $pParametersAddInfo() {return this.ptr.asSlice(OFFSET__pParametersAddInfo, LAYOUT__pParametersAddInfo);}
}
