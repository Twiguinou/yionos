package vulkan;

public record VkVideoEncodeH264GopRemainingFrameInfoKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__useGopRemainingFrames = java.lang.foreign.ValueLayout.JAVA_INT.withName("useGopRemainingFrames");
    public static final long OFFSET__useGopRemainingFrames = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__gopRemainingI = java.lang.foreign.ValueLayout.JAVA_INT.withName("gopRemainingI");
    public static final long OFFSET__gopRemainingI = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__gopRemainingP = java.lang.foreign.ValueLayout.JAVA_INT.withName("gopRemainingP");
    public static final long OFFSET__gopRemainingP = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__gopRemainingB = java.lang.foreign.ValueLayout.JAVA_INT.withName("gopRemainingB");
    public static final long OFFSET__gopRemainingB = 28;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__useGopRemainingFrames,
            LAYOUT__gopRemainingI,
            LAYOUT__gopRemainingP,
            LAYOUT__gopRemainingB
    ).withByteAlignment(8).withName("VkVideoEncodeH264GopRemainingFrameInfoKHR");

    public VkVideoEncodeH264GopRemainingFrameInfoKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkVideoEncodeH264GopRemainingFrameInfoKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkVideoEncodeH264GopRemainingFrameInfoKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkVideoEncodeH264GopRemainingFrameInfoKHR value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int useGopRemainingFrames() {return this.ptr.get(LAYOUT__useGopRemainingFrames, OFFSET__useGopRemainingFrames);}
    public void useGopRemainingFrames(int value) {this.ptr.set(LAYOUT__useGopRemainingFrames, OFFSET__useGopRemainingFrames, value);}
    public java.lang.foreign.MemorySegment $useGopRemainingFrames() {return this.ptr.asSlice(OFFSET__useGopRemainingFrames, LAYOUT__useGopRemainingFrames);}

    public int gopRemainingI() {return this.ptr.get(LAYOUT__gopRemainingI, OFFSET__gopRemainingI);}
    public void gopRemainingI(int value) {this.ptr.set(LAYOUT__gopRemainingI, OFFSET__gopRemainingI, value);}
    public java.lang.foreign.MemorySegment $gopRemainingI() {return this.ptr.asSlice(OFFSET__gopRemainingI, LAYOUT__gopRemainingI);}

    public int gopRemainingP() {return this.ptr.get(LAYOUT__gopRemainingP, OFFSET__gopRemainingP);}
    public void gopRemainingP(int value) {this.ptr.set(LAYOUT__gopRemainingP, OFFSET__gopRemainingP, value);}
    public java.lang.foreign.MemorySegment $gopRemainingP() {return this.ptr.asSlice(OFFSET__gopRemainingP, LAYOUT__gopRemainingP);}

    public int gopRemainingB() {return this.ptr.get(LAYOUT__gopRemainingB, OFFSET__gopRemainingB);}
    public void gopRemainingB(int value) {this.ptr.set(LAYOUT__gopRemainingB, OFFSET__gopRemainingB, value);}
    public java.lang.foreign.MemorySegment $gopRemainingB() {return this.ptr.asSlice(OFFSET__gopRemainingB, LAYOUT__gopRemainingB);}
}
