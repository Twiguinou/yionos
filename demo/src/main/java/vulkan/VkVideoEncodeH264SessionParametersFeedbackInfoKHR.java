package vulkan;

public record VkVideoEncodeH264SessionParametersFeedbackInfoKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$hasStdSPSOverrides = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$hasStdSPSOverrides = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$hasStdPPSOverrides = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$hasStdPPSOverrides = 20L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$hasStdSPSOverrides,
            LAYOUT$hasStdPPSOverrides
    ).withName("VkVideoEncodeH264SessionParametersFeedbackInfoKHR");

    public VkVideoEncodeH264SessionParametersFeedbackInfoKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VkVideoEncodeH264SessionParametersFeedbackInfoKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VkVideoEncodeH264SessionParametersFeedbackInfoKHR(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int hasStdSPSOverrides() {return this.ptr.get(LAYOUT$hasStdSPSOverrides, OFFSET$hasStdSPSOverrides);}
    public void hasStdSPSOverrides(int value) {this.ptr.set(LAYOUT$hasStdSPSOverrides, OFFSET$hasStdSPSOverrides, value);}
    public java.lang.foreign.MemorySegment hasStdSPSOverrides_ptr() {return this.ptr.asSlice(OFFSET$hasStdSPSOverrides, LAYOUT$hasStdSPSOverrides);}

    public int hasStdPPSOverrides() {return this.ptr.get(LAYOUT$hasStdPPSOverrides, OFFSET$hasStdPPSOverrides);}
    public void hasStdPPSOverrides(int value) {this.ptr.set(LAYOUT$hasStdPPSOverrides, OFFSET$hasStdPPSOverrides, value);}
    public java.lang.foreign.MemorySegment hasStdPPSOverrides_ptr() {return this.ptr.asSlice(OFFSET$hasStdPPSOverrides, LAYOUT$hasStdPPSOverrides);}
}
