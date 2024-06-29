package vulkan;

public record VkVideoDecodeAV1ProfileInfoKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__stdProfile = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__stdProfile = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__filmGrainSupport = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__filmGrainSupport = 20;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__stdProfile,
            LAYOUT__filmGrainSupport
    ).withByteAlignment(8).withName("VkVideoDecodeAV1ProfileInfoKHR");

    public VkVideoDecodeAV1ProfileInfoKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkVideoDecodeAV1ProfileInfoKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkVideoDecodeAV1ProfileInfoKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkVideoDecodeAV1ProfileInfoKHR value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int stdProfile() {return this.ptr.get(LAYOUT__stdProfile, OFFSET__stdProfile);}
    public void stdProfile(int value) {this.ptr.set(LAYOUT__stdProfile, OFFSET__stdProfile, value);}
    public java.lang.foreign.MemorySegment $stdProfile() {return this.ptr.asSlice(OFFSET__stdProfile, LAYOUT__stdProfile);}

    public int filmGrainSupport() {return this.ptr.get(LAYOUT__filmGrainSupport, OFFSET__filmGrainSupport);}
    public void filmGrainSupport(int value) {this.ptr.set(LAYOUT__filmGrainSupport, OFFSET__filmGrainSupport, value);}
    public java.lang.foreign.MemorySegment $filmGrainSupport() {return this.ptr.asSlice(OFFSET__filmGrainSupport, LAYOUT__filmGrainSupport);}
}
