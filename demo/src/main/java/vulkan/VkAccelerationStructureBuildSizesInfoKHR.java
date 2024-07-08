package vulkan;

public record VkAccelerationStructureBuildSizesInfoKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__accelerationStructureSize = java.lang.foreign.ValueLayout.JAVA_LONG.withName("accelerationStructureSize");
    public static final long OFFSET__accelerationStructureSize = 16;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__updateScratchSize = java.lang.foreign.ValueLayout.JAVA_LONG.withName("updateScratchSize");
    public static final long OFFSET__updateScratchSize = 24;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__buildScratchSize = java.lang.foreign.ValueLayout.JAVA_LONG.withName("buildScratchSize");
    public static final long OFFSET__buildScratchSize = 32;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__accelerationStructureSize,
            LAYOUT__updateScratchSize,
            LAYOUT__buildScratchSize
    ).withByteAlignment(8).withName("VkAccelerationStructureBuildSizesInfoKHR");

    public VkAccelerationStructureBuildSizesInfoKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkAccelerationStructureBuildSizesInfoKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkAccelerationStructureBuildSizesInfoKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkAccelerationStructureBuildSizesInfoKHR value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public long accelerationStructureSize() {return this.ptr.get(LAYOUT__accelerationStructureSize, OFFSET__accelerationStructureSize);}
    public void accelerationStructureSize(long value) {this.ptr.set(LAYOUT__accelerationStructureSize, OFFSET__accelerationStructureSize, value);}
    public java.lang.foreign.MemorySegment $accelerationStructureSize() {return this.ptr.asSlice(OFFSET__accelerationStructureSize, LAYOUT__accelerationStructureSize);}

    public long updateScratchSize() {return this.ptr.get(LAYOUT__updateScratchSize, OFFSET__updateScratchSize);}
    public void updateScratchSize(long value) {this.ptr.set(LAYOUT__updateScratchSize, OFFSET__updateScratchSize, value);}
    public java.lang.foreign.MemorySegment $updateScratchSize() {return this.ptr.asSlice(OFFSET__updateScratchSize, LAYOUT__updateScratchSize);}

    public long buildScratchSize() {return this.ptr.get(LAYOUT__buildScratchSize, OFFSET__buildScratchSize);}
    public void buildScratchSize(long value) {this.ptr.set(LAYOUT__buildScratchSize, OFFSET__buildScratchSize, value);}
    public java.lang.foreign.MemorySegment $buildScratchSize() {return this.ptr.asSlice(OFFSET__buildScratchSize, LAYOUT__buildScratchSize);}
}
