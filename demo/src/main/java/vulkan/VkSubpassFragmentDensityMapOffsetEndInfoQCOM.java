package vulkan;

public record VkSubpassFragmentDensityMapOffsetEndInfoQCOM(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$fragmentDensityOffsetCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$fragmentDensityOffsetCount = 16L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pFragmentDensityOffsets = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pFragmentDensityOffsets = 24L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$fragmentDensityOffsetCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pFragmentDensityOffsets
    ).withName("VkSubpassFragmentDensityMapOffsetEndInfoQCOM");

    public VkSubpassFragmentDensityMapOffsetEndInfoQCOM(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VkSubpassFragmentDensityMapOffsetEndInfoQCOM getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VkSubpassFragmentDensityMapOffsetEndInfoQCOM(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int fragmentDensityOffsetCount() {return this.ptr.get(LAYOUT$fragmentDensityOffsetCount, OFFSET$fragmentDensityOffsetCount);}
    public void fragmentDensityOffsetCount(int value) {this.ptr.set(LAYOUT$fragmentDensityOffsetCount, OFFSET$fragmentDensityOffsetCount, value);}
    public java.lang.foreign.MemorySegment fragmentDensityOffsetCount_ptr() {return this.ptr.asSlice(OFFSET$fragmentDensityOffsetCount, LAYOUT$fragmentDensityOffsetCount);}

    public java.lang.foreign.MemorySegment pFragmentDensityOffsets() {return this.ptr.get(LAYOUT$pFragmentDensityOffsets, OFFSET$pFragmentDensityOffsets);}
    public void pFragmentDensityOffsets(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pFragmentDensityOffsets, OFFSET$pFragmentDensityOffsets, value);}
    public java.lang.foreign.MemorySegment pFragmentDensityOffsets_ptr() {return this.ptr.asSlice(OFFSET$pFragmentDensityOffsets, LAYOUT$pFragmentDensityOffsets);}
}
