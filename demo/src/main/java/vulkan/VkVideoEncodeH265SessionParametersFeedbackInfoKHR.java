package vulkan;

public record VkVideoEncodeH265SessionParametersFeedbackInfoKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__hasStdVPSOverrides = java.lang.foreign.ValueLayout.JAVA_INT.withName("hasStdVPSOverrides");
    public static final long OFFSET__hasStdVPSOverrides = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__hasStdSPSOverrides = java.lang.foreign.ValueLayout.JAVA_INT.withName("hasStdSPSOverrides");
    public static final long OFFSET__hasStdSPSOverrides = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__hasStdPPSOverrides = java.lang.foreign.ValueLayout.JAVA_INT.withName("hasStdPPSOverrides");
    public static final long OFFSET__hasStdPPSOverrides = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__hasStdVPSOverrides,
            LAYOUT__hasStdSPSOverrides,
            LAYOUT__hasStdPPSOverrides,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkVideoEncodeH265SessionParametersFeedbackInfoKHR");

    public VkVideoEncodeH265SessionParametersFeedbackInfoKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkVideoEncodeH265SessionParametersFeedbackInfoKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkVideoEncodeH265SessionParametersFeedbackInfoKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkVideoEncodeH265SessionParametersFeedbackInfoKHR value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int hasStdVPSOverrides() {return this.ptr.get(LAYOUT__hasStdVPSOverrides, OFFSET__hasStdVPSOverrides);}
    public void hasStdVPSOverrides(int value) {this.ptr.set(LAYOUT__hasStdVPSOverrides, OFFSET__hasStdVPSOverrides, value);}
    public java.lang.foreign.MemorySegment $hasStdVPSOverrides() {return this.ptr.asSlice(OFFSET__hasStdVPSOverrides, LAYOUT__hasStdVPSOverrides);}

    public int hasStdSPSOverrides() {return this.ptr.get(LAYOUT__hasStdSPSOverrides, OFFSET__hasStdSPSOverrides);}
    public void hasStdSPSOverrides(int value) {this.ptr.set(LAYOUT__hasStdSPSOverrides, OFFSET__hasStdSPSOverrides, value);}
    public java.lang.foreign.MemorySegment $hasStdSPSOverrides() {return this.ptr.asSlice(OFFSET__hasStdSPSOverrides, LAYOUT__hasStdSPSOverrides);}

    public int hasStdPPSOverrides() {return this.ptr.get(LAYOUT__hasStdPPSOverrides, OFFSET__hasStdPPSOverrides);}
    public void hasStdPPSOverrides(int value) {this.ptr.set(LAYOUT__hasStdPPSOverrides, OFFSET__hasStdPPSOverrides, value);}
    public java.lang.foreign.MemorySegment $hasStdPPSOverrides() {return this.ptr.asSlice(OFFSET__hasStdPPSOverrides, LAYOUT__hasStdPPSOverrides);}
}
