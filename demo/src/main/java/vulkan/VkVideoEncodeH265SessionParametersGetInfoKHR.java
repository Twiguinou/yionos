package vulkan;

public record VkVideoEncodeH265SessionParametersGetInfoKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$writeStdVPS = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$writeStdVPS = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$writeStdSPS = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$writeStdSPS = 20L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$writeStdPPS = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$writeStdPPS = 24L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$stdVPSId = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$stdVPSId = 28L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$stdSPSId = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$stdSPSId = 32L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$stdPPSId = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$stdPPSId = 36L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$writeStdVPS,
            LAYOUT$writeStdSPS,
            LAYOUT$writeStdPPS,
            LAYOUT$stdVPSId,
            LAYOUT$stdSPSId,
            LAYOUT$stdPPSId
    ).withName("VkVideoEncodeH265SessionParametersGetInfoKHR");

    public VkVideoEncodeH265SessionParametersGetInfoKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VkVideoEncodeH265SessionParametersGetInfoKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VkVideoEncodeH265SessionParametersGetInfoKHR(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int writeStdVPS() {return this.ptr.get(LAYOUT$writeStdVPS, OFFSET$writeStdVPS);}
    public void writeStdVPS(int value) {this.ptr.set(LAYOUT$writeStdVPS, OFFSET$writeStdVPS, value);}
    public java.lang.foreign.MemorySegment writeStdVPS_ptr() {return this.ptr.asSlice(OFFSET$writeStdVPS, LAYOUT$writeStdVPS);}

    public int writeStdSPS() {return this.ptr.get(LAYOUT$writeStdSPS, OFFSET$writeStdSPS);}
    public void writeStdSPS(int value) {this.ptr.set(LAYOUT$writeStdSPS, OFFSET$writeStdSPS, value);}
    public java.lang.foreign.MemorySegment writeStdSPS_ptr() {return this.ptr.asSlice(OFFSET$writeStdSPS, LAYOUT$writeStdSPS);}

    public int writeStdPPS() {return this.ptr.get(LAYOUT$writeStdPPS, OFFSET$writeStdPPS);}
    public void writeStdPPS(int value) {this.ptr.set(LAYOUT$writeStdPPS, OFFSET$writeStdPPS, value);}
    public java.lang.foreign.MemorySegment writeStdPPS_ptr() {return this.ptr.asSlice(OFFSET$writeStdPPS, LAYOUT$writeStdPPS);}

    public int stdVPSId() {return this.ptr.get(LAYOUT$stdVPSId, OFFSET$stdVPSId);}
    public void stdVPSId(int value) {this.ptr.set(LAYOUT$stdVPSId, OFFSET$stdVPSId, value);}
    public java.lang.foreign.MemorySegment stdVPSId_ptr() {return this.ptr.asSlice(OFFSET$stdVPSId, LAYOUT$stdVPSId);}

    public int stdSPSId() {return this.ptr.get(LAYOUT$stdSPSId, OFFSET$stdSPSId);}
    public void stdSPSId(int value) {this.ptr.set(LAYOUT$stdSPSId, OFFSET$stdSPSId, value);}
    public java.lang.foreign.MemorySegment stdSPSId_ptr() {return this.ptr.asSlice(OFFSET$stdSPSId, LAYOUT$stdSPSId);}

    public int stdPPSId() {return this.ptr.get(LAYOUT$stdPPSId, OFFSET$stdPPSId);}
    public void stdPPSId(int value) {this.ptr.set(LAYOUT$stdPPSId, OFFSET$stdPPSId, value);}
    public java.lang.foreign.MemorySegment stdPPSId_ptr() {return this.ptr.asSlice(OFFSET$stdPPSId, LAYOUT$stdPPSId);}
}
