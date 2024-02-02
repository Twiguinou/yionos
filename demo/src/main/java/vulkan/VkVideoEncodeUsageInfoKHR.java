package vulkan;

public record VkVideoEncodeUsageInfoKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$videoUsageHints = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$videoUsageHints = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$videoContentHints = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$videoContentHints = 20L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$tuningMode = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$tuningMode = 24L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$videoUsageHints,
            LAYOUT$videoContentHints,
            LAYOUT$tuningMode,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("VkVideoEncodeUsageInfoKHR");

    public VkVideoEncodeUsageInfoKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VkVideoEncodeUsageInfoKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VkVideoEncodeUsageInfoKHR(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int videoUsageHints() {return this.ptr.get(LAYOUT$videoUsageHints, OFFSET$videoUsageHints);}
    public void videoUsageHints(int value) {this.ptr.set(LAYOUT$videoUsageHints, OFFSET$videoUsageHints, value);}
    public java.lang.foreign.MemorySegment videoUsageHints_ptr() {return this.ptr.asSlice(OFFSET$videoUsageHints, LAYOUT$videoUsageHints);}

    public int videoContentHints() {return this.ptr.get(LAYOUT$videoContentHints, OFFSET$videoContentHints);}
    public void videoContentHints(int value) {this.ptr.set(LAYOUT$videoContentHints, OFFSET$videoContentHints, value);}
    public java.lang.foreign.MemorySegment videoContentHints_ptr() {return this.ptr.asSlice(OFFSET$videoContentHints, LAYOUT$videoContentHints);}

    public int tuningMode() {return this.ptr.get(LAYOUT$tuningMode, OFFSET$tuningMode);}
    public void tuningMode(int value) {this.ptr.set(LAYOUT$tuningMode, OFFSET$tuningMode, value);}
    public java.lang.foreign.MemorySegment tuningMode_ptr() {return this.ptr.asSlice(OFFSET$tuningMode, LAYOUT$tuningMode);}
}
