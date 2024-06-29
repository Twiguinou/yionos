package vulkan;

public record VkVideoEncodeUsageInfoKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__videoUsageHints = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__videoUsageHints = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__videoContentHints = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__videoContentHints = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__tuningMode = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__tuningMode = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__videoUsageHints,
            LAYOUT__videoContentHints,
            LAYOUT__tuningMode,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkVideoEncodeUsageInfoKHR");

    public VkVideoEncodeUsageInfoKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkVideoEncodeUsageInfoKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkVideoEncodeUsageInfoKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkVideoEncodeUsageInfoKHR value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int videoUsageHints() {return this.ptr.get(LAYOUT__videoUsageHints, OFFSET__videoUsageHints);}
    public void videoUsageHints(int value) {this.ptr.set(LAYOUT__videoUsageHints, OFFSET__videoUsageHints, value);}
    public java.lang.foreign.MemorySegment $videoUsageHints() {return this.ptr.asSlice(OFFSET__videoUsageHints, LAYOUT__videoUsageHints);}

    public int videoContentHints() {return this.ptr.get(LAYOUT__videoContentHints, OFFSET__videoContentHints);}
    public void videoContentHints(int value) {this.ptr.set(LAYOUT__videoContentHints, OFFSET__videoContentHints, value);}
    public java.lang.foreign.MemorySegment $videoContentHints() {return this.ptr.asSlice(OFFSET__videoContentHints, LAYOUT__videoContentHints);}

    public int tuningMode() {return this.ptr.get(LAYOUT__tuningMode, OFFSET__tuningMode);}
    public void tuningMode(int value) {this.ptr.set(LAYOUT__tuningMode, OFFSET__tuningMode, value);}
    public java.lang.foreign.MemorySegment $tuningMode() {return this.ptr.asSlice(OFFSET__tuningMode, LAYOUT__tuningMode);}
}
