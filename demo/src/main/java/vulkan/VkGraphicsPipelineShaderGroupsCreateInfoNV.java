package vulkan;

public record VkGraphicsPipelineShaderGroupsCreateInfoNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__groupCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("groupCount");
    public static final long OFFSET__groupCount = 16;
    public static final java.lang.foreign.AddressLayout LAYOUT__pGroups = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pGroups");
    public static final long OFFSET__pGroups = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__pipelineCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("pipelineCount");
    public static final long OFFSET__pipelineCount = 32;
    public static final java.lang.foreign.AddressLayout LAYOUT__pPipelines = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pPipelines");
    public static final long OFFSET__pPipelines = 40;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__groupCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pGroups,
            LAYOUT__pipelineCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pPipelines
    ).withByteAlignment(8).withName("VkGraphicsPipelineShaderGroupsCreateInfoNV");

    public VkGraphicsPipelineShaderGroupsCreateInfoNV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkGraphicsPipelineShaderGroupsCreateInfoNV getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkGraphicsPipelineShaderGroupsCreateInfoNV(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkGraphicsPipelineShaderGroupsCreateInfoNV value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int groupCount() {return this.ptr.get(LAYOUT__groupCount, OFFSET__groupCount);}
    public void groupCount(int value) {this.ptr.set(LAYOUT__groupCount, OFFSET__groupCount, value);}
    public java.lang.foreign.MemorySegment $groupCount() {return this.ptr.asSlice(OFFSET__groupCount, LAYOUT__groupCount);}

    public java.lang.foreign.MemorySegment pGroups() {return this.ptr.get(LAYOUT__pGroups, OFFSET__pGroups);}
    public void pGroups(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pGroups, OFFSET__pGroups, value);}
    public java.lang.foreign.MemorySegment $pGroups() {return this.ptr.asSlice(OFFSET__pGroups, LAYOUT__pGroups);}

    public int pipelineCount() {return this.ptr.get(LAYOUT__pipelineCount, OFFSET__pipelineCount);}
    public void pipelineCount(int value) {this.ptr.set(LAYOUT__pipelineCount, OFFSET__pipelineCount, value);}
    public java.lang.foreign.MemorySegment $pipelineCount() {return this.ptr.asSlice(OFFSET__pipelineCount, LAYOUT__pipelineCount);}

    public java.lang.foreign.MemorySegment pPipelines() {return this.ptr.get(LAYOUT__pPipelines, OFFSET__pPipelines);}
    public void pPipelines(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pPipelines, OFFSET__pPipelines, value);}
    public java.lang.foreign.MemorySegment $pPipelines() {return this.ptr.asSlice(OFFSET__pPipelines, LAYOUT__pPipelines);}
}
