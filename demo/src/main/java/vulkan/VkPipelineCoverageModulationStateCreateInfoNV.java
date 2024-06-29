package vulkan;

public record VkPipelineCoverageModulationStateCreateInfoNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__flags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__flags = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__coverageModulationMode = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__coverageModulationMode = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__coverageModulationTableEnable = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__coverageModulationTableEnable = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__coverageModulationTableCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__coverageModulationTableCount = 28;
    public static final java.lang.foreign.AddressLayout LAYOUT__pCoverageModulationTable = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pCoverageModulationTable = 32;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__flags,
            LAYOUT__coverageModulationMode,
            LAYOUT__coverageModulationTableEnable,
            LAYOUT__coverageModulationTableCount,
            LAYOUT__pCoverageModulationTable
    ).withByteAlignment(8).withName("VkPipelineCoverageModulationStateCreateInfoNV");

    public VkPipelineCoverageModulationStateCreateInfoNV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPipelineCoverageModulationStateCreateInfoNV getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPipelineCoverageModulationStateCreateInfoNV(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPipelineCoverageModulationStateCreateInfoNV value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int flags() {return this.ptr.get(LAYOUT__flags, OFFSET__flags);}
    public void flags(int value) {this.ptr.set(LAYOUT__flags, OFFSET__flags, value);}
    public java.lang.foreign.MemorySegment $flags() {return this.ptr.asSlice(OFFSET__flags, LAYOUT__flags);}

    public int coverageModulationMode() {return this.ptr.get(LAYOUT__coverageModulationMode, OFFSET__coverageModulationMode);}
    public void coverageModulationMode(int value) {this.ptr.set(LAYOUT__coverageModulationMode, OFFSET__coverageModulationMode, value);}
    public java.lang.foreign.MemorySegment $coverageModulationMode() {return this.ptr.asSlice(OFFSET__coverageModulationMode, LAYOUT__coverageModulationMode);}

    public int coverageModulationTableEnable() {return this.ptr.get(LAYOUT__coverageModulationTableEnable, OFFSET__coverageModulationTableEnable);}
    public void coverageModulationTableEnable(int value) {this.ptr.set(LAYOUT__coverageModulationTableEnable, OFFSET__coverageModulationTableEnable, value);}
    public java.lang.foreign.MemorySegment $coverageModulationTableEnable() {return this.ptr.asSlice(OFFSET__coverageModulationTableEnable, LAYOUT__coverageModulationTableEnable);}

    public int coverageModulationTableCount() {return this.ptr.get(LAYOUT__coverageModulationTableCount, OFFSET__coverageModulationTableCount);}
    public void coverageModulationTableCount(int value) {this.ptr.set(LAYOUT__coverageModulationTableCount, OFFSET__coverageModulationTableCount, value);}
    public java.lang.foreign.MemorySegment $coverageModulationTableCount() {return this.ptr.asSlice(OFFSET__coverageModulationTableCount, LAYOUT__coverageModulationTableCount);}

    public java.lang.foreign.MemorySegment pCoverageModulationTable() {return this.ptr.get(LAYOUT__pCoverageModulationTable, OFFSET__pCoverageModulationTable);}
    public void pCoverageModulationTable(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pCoverageModulationTable, OFFSET__pCoverageModulationTable, value);}
    public java.lang.foreign.MemorySegment $pCoverageModulationTable() {return this.ptr.asSlice(OFFSET__pCoverageModulationTable, LAYOUT__pCoverageModulationTable);}
}
