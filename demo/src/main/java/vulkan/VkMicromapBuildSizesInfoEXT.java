package vulkan;

public record VkMicromapBuildSizesInfoEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__micromapSize = java.lang.foreign.ValueLayout.JAVA_LONG.withName("micromapSize");
    public static final long OFFSET__micromapSize = 16;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__buildScratchSize = java.lang.foreign.ValueLayout.JAVA_LONG.withName("buildScratchSize");
    public static final long OFFSET__buildScratchSize = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__discardable = java.lang.foreign.ValueLayout.JAVA_INT.withName("discardable");
    public static final long OFFSET__discardable = 32;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__micromapSize,
            LAYOUT__buildScratchSize,
            LAYOUT__discardable,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkMicromapBuildSizesInfoEXT");

    public VkMicromapBuildSizesInfoEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkMicromapBuildSizesInfoEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkMicromapBuildSizesInfoEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkMicromapBuildSizesInfoEXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public long micromapSize() {return this.ptr.get(LAYOUT__micromapSize, OFFSET__micromapSize);}
    public void micromapSize(long value) {this.ptr.set(LAYOUT__micromapSize, OFFSET__micromapSize, value);}
    public java.lang.foreign.MemorySegment $micromapSize() {return this.ptr.asSlice(OFFSET__micromapSize, LAYOUT__micromapSize);}

    public long buildScratchSize() {return this.ptr.get(LAYOUT__buildScratchSize, OFFSET__buildScratchSize);}
    public void buildScratchSize(long value) {this.ptr.set(LAYOUT__buildScratchSize, OFFSET__buildScratchSize, value);}
    public java.lang.foreign.MemorySegment $buildScratchSize() {return this.ptr.asSlice(OFFSET__buildScratchSize, LAYOUT__buildScratchSize);}

    public int discardable() {return this.ptr.get(LAYOUT__discardable, OFFSET__discardable);}
    public void discardable(int value) {this.ptr.set(LAYOUT__discardable, OFFSET__discardable, value);}
    public java.lang.foreign.MemorySegment $discardable() {return this.ptr.asSlice(OFFSET__discardable, LAYOUT__discardable);}
}
