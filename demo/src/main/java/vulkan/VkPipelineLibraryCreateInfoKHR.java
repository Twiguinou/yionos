package vulkan;

public record VkPipelineLibraryCreateInfoKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__libraryCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__libraryCount = 16;
    public static final java.lang.foreign.AddressLayout LAYOUT__pLibraries = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pLibraries = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__libraryCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pLibraries
    ).withByteAlignment(8).withName("VkPipelineLibraryCreateInfoKHR");

    public VkPipelineLibraryCreateInfoKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPipelineLibraryCreateInfoKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPipelineLibraryCreateInfoKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPipelineLibraryCreateInfoKHR value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int libraryCount() {return this.ptr.get(LAYOUT__libraryCount, OFFSET__libraryCount);}
    public void libraryCount(int value) {this.ptr.set(LAYOUT__libraryCount, OFFSET__libraryCount, value);}
    public java.lang.foreign.MemorySegment $libraryCount() {return this.ptr.asSlice(OFFSET__libraryCount, LAYOUT__libraryCount);}

    public java.lang.foreign.MemorySegment pLibraries() {return this.ptr.get(LAYOUT__pLibraries, OFFSET__pLibraries);}
    public void pLibraries(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pLibraries, OFFSET__pLibraries, value);}
    public java.lang.foreign.MemorySegment $pLibraries() {return this.ptr.asSlice(OFFSET__pLibraries, LAYOUT__pLibraries);}
}
