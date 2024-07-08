package vulkan;

public record VkPipelineExecutablePropertiesKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__stages = java.lang.foreign.ValueLayout.JAVA_INT.withName("stages");
    public static final long OFFSET__stages = 16;
    public static final java.lang.foreign.SequenceLayout LAYOUT__name = java.lang.foreign.MemoryLayout.sequenceLayout(256, java.lang.foreign.ValueLayout.JAVA_BYTE).withName("name");
    public static final long OFFSET__name = 20;
    public static final java.lang.foreign.SequenceLayout LAYOUT__description = java.lang.foreign.MemoryLayout.sequenceLayout(256, java.lang.foreign.ValueLayout.JAVA_BYTE).withName("description");
    public static final long OFFSET__description = 276;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__subgroupSize = java.lang.foreign.ValueLayout.JAVA_INT.withName("subgroupSize");
    public static final long OFFSET__subgroupSize = 532;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__stages,
            LAYOUT__name,
            LAYOUT__description,
            LAYOUT__subgroupSize
    ).withByteAlignment(8).withName("VkPipelineExecutablePropertiesKHR");

    public VkPipelineExecutablePropertiesKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPipelineExecutablePropertiesKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPipelineExecutablePropertiesKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPipelineExecutablePropertiesKHR value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int stages() {return this.ptr.get(LAYOUT__stages, OFFSET__stages);}
    public void stages(int value) {this.ptr.set(LAYOUT__stages, OFFSET__stages, value);}
    public java.lang.foreign.MemorySegment $stages() {return this.ptr.asSlice(OFFSET__stages, LAYOUT__stages);}

    public java.lang.foreign.MemorySegment name() {return this.ptr.asSlice(OFFSET__name, LAYOUT__name);}
    public byte name(int index) {return this.name().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index);}
    public void name(int index, byte value) {this.name().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index, value);}

    public java.lang.foreign.MemorySegment description() {return this.ptr.asSlice(OFFSET__description, LAYOUT__description);}
    public byte description(int index) {return this.description().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index);}
    public void description(int index, byte value) {this.description().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index, value);}

    public int subgroupSize() {return this.ptr.get(LAYOUT__subgroupSize, OFFSET__subgroupSize);}
    public void subgroupSize(int value) {this.ptr.set(LAYOUT__subgroupSize, OFFSET__subgroupSize, value);}
    public java.lang.foreign.MemorySegment $subgroupSize() {return this.ptr.asSlice(OFFSET__subgroupSize, LAYOUT__subgroupSize);}
}
