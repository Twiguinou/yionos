package vulkan;

public record VkLatencySleepModeInfoNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__lowLatencyMode = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__lowLatencyMode = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__lowLatencyBoost = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__lowLatencyBoost = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__minimumIntervalUs = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__minimumIntervalUs = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__lowLatencyMode,
            LAYOUT__lowLatencyBoost,
            LAYOUT__minimumIntervalUs,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkLatencySleepModeInfoNV");

    public VkLatencySleepModeInfoNV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkLatencySleepModeInfoNV getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkLatencySleepModeInfoNV(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkLatencySleepModeInfoNV value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int lowLatencyMode() {return this.ptr.get(LAYOUT__lowLatencyMode, OFFSET__lowLatencyMode);}
    public void lowLatencyMode(int value) {this.ptr.set(LAYOUT__lowLatencyMode, OFFSET__lowLatencyMode, value);}
    public java.lang.foreign.MemorySegment $lowLatencyMode() {return this.ptr.asSlice(OFFSET__lowLatencyMode, LAYOUT__lowLatencyMode);}

    public int lowLatencyBoost() {return this.ptr.get(LAYOUT__lowLatencyBoost, OFFSET__lowLatencyBoost);}
    public void lowLatencyBoost(int value) {this.ptr.set(LAYOUT__lowLatencyBoost, OFFSET__lowLatencyBoost, value);}
    public java.lang.foreign.MemorySegment $lowLatencyBoost() {return this.ptr.asSlice(OFFSET__lowLatencyBoost, LAYOUT__lowLatencyBoost);}

    public int minimumIntervalUs() {return this.ptr.get(LAYOUT__minimumIntervalUs, OFFSET__minimumIntervalUs);}
    public void minimumIntervalUs(int value) {this.ptr.set(LAYOUT__minimumIntervalUs, OFFSET__minimumIntervalUs, value);}
    public java.lang.foreign.MemorySegment $minimumIntervalUs() {return this.ptr.asSlice(OFFSET__minimumIntervalUs, LAYOUT__minimumIntervalUs);}
}
