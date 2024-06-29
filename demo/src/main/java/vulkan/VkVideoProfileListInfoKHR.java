package vulkan;

public record VkVideoProfileListInfoKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__profileCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__profileCount = 16;
    public static final java.lang.foreign.AddressLayout LAYOUT__pProfiles = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pProfiles = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__profileCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pProfiles
    ).withByteAlignment(8).withName("VkVideoProfileListInfoKHR");

    public VkVideoProfileListInfoKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkVideoProfileListInfoKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkVideoProfileListInfoKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkVideoProfileListInfoKHR value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int profileCount() {return this.ptr.get(LAYOUT__profileCount, OFFSET__profileCount);}
    public void profileCount(int value) {this.ptr.set(LAYOUT__profileCount, OFFSET__profileCount, value);}
    public java.lang.foreign.MemorySegment $profileCount() {return this.ptr.asSlice(OFFSET__profileCount, LAYOUT__profileCount);}

    public java.lang.foreign.MemorySegment pProfiles() {return this.ptr.get(LAYOUT__pProfiles, OFFSET__pProfiles);}
    public void pProfiles(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pProfiles, OFFSET__pProfiles, value);}
    public java.lang.foreign.MemorySegment $pProfiles() {return this.ptr.asSlice(OFFSET__pProfiles, LAYOUT__pProfiles);}
}
