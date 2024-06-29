package vulkan;

public record VkSubpassFragmentDensityMapOffsetEndInfoQCOM(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__fragmentDensityOffsetCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__fragmentDensityOffsetCount = 16;
    public static final java.lang.foreign.AddressLayout LAYOUT__pFragmentDensityOffsets = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pFragmentDensityOffsets = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__fragmentDensityOffsetCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pFragmentDensityOffsets
    ).withByteAlignment(8).withName("VkSubpassFragmentDensityMapOffsetEndInfoQCOM");

    public VkSubpassFragmentDensityMapOffsetEndInfoQCOM(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkSubpassFragmentDensityMapOffsetEndInfoQCOM getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkSubpassFragmentDensityMapOffsetEndInfoQCOM(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkSubpassFragmentDensityMapOffsetEndInfoQCOM value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int fragmentDensityOffsetCount() {return this.ptr.get(LAYOUT__fragmentDensityOffsetCount, OFFSET__fragmentDensityOffsetCount);}
    public void fragmentDensityOffsetCount(int value) {this.ptr.set(LAYOUT__fragmentDensityOffsetCount, OFFSET__fragmentDensityOffsetCount, value);}
    public java.lang.foreign.MemorySegment $fragmentDensityOffsetCount() {return this.ptr.asSlice(OFFSET__fragmentDensityOffsetCount, LAYOUT__fragmentDensityOffsetCount);}

    public java.lang.foreign.MemorySegment pFragmentDensityOffsets() {return this.ptr.get(LAYOUT__pFragmentDensityOffsets, OFFSET__pFragmentDensityOffsets);}
    public void pFragmentDensityOffsets(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pFragmentDensityOffsets, OFFSET__pFragmentDensityOffsets, value);}
    public java.lang.foreign.MemorySegment $pFragmentDensityOffsets() {return this.ptr.asSlice(OFFSET__pFragmentDensityOffsets, LAYOUT__pFragmentDensityOffsets);}
}
