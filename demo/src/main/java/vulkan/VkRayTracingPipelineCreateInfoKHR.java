package vulkan;

public record VkRayTracingPipelineCreateInfoKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__flags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__flags = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__stageCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__stageCount = 20;
    public static final java.lang.foreign.AddressLayout LAYOUT__pStages = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pStages = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__groupCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__groupCount = 32;
    public static final java.lang.foreign.AddressLayout LAYOUT__pGroups = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pGroups = 40;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxPipelineRayRecursionDepth = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__maxPipelineRayRecursionDepth = 48;
    public static final java.lang.foreign.AddressLayout LAYOUT__pLibraryInfo = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pLibraryInfo = 56;
    public static final java.lang.foreign.AddressLayout LAYOUT__pLibraryInterface = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pLibraryInterface = 64;
    public static final java.lang.foreign.AddressLayout LAYOUT__pDynamicState = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pDynamicState = 72;
    public static final java.lang.foreign.AddressLayout LAYOUT__layout = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__layout = 80;
    public static final java.lang.foreign.AddressLayout LAYOUT__basePipelineHandle = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__basePipelineHandle = 88;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__basePipelineIndex = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__basePipelineIndex = 96;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__flags,
            LAYOUT__stageCount,
            LAYOUT__pStages,
            LAYOUT__groupCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pGroups,
            LAYOUT__maxPipelineRayRecursionDepth,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pLibraryInfo,
            LAYOUT__pLibraryInterface,
            LAYOUT__pDynamicState,
            LAYOUT__layout,
            LAYOUT__basePipelineHandle,
            LAYOUT__basePipelineIndex,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkRayTracingPipelineCreateInfoKHR");

    public VkRayTracingPipelineCreateInfoKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkRayTracingPipelineCreateInfoKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkRayTracingPipelineCreateInfoKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkRayTracingPipelineCreateInfoKHR value)
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

    public int stageCount() {return this.ptr.get(LAYOUT__stageCount, OFFSET__stageCount);}
    public void stageCount(int value) {this.ptr.set(LAYOUT__stageCount, OFFSET__stageCount, value);}
    public java.lang.foreign.MemorySegment $stageCount() {return this.ptr.asSlice(OFFSET__stageCount, LAYOUT__stageCount);}

    public java.lang.foreign.MemorySegment pStages() {return this.ptr.get(LAYOUT__pStages, OFFSET__pStages);}
    public void pStages(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pStages, OFFSET__pStages, value);}
    public java.lang.foreign.MemorySegment $pStages() {return this.ptr.asSlice(OFFSET__pStages, LAYOUT__pStages);}

    public int groupCount() {return this.ptr.get(LAYOUT__groupCount, OFFSET__groupCount);}
    public void groupCount(int value) {this.ptr.set(LAYOUT__groupCount, OFFSET__groupCount, value);}
    public java.lang.foreign.MemorySegment $groupCount() {return this.ptr.asSlice(OFFSET__groupCount, LAYOUT__groupCount);}

    public java.lang.foreign.MemorySegment pGroups() {return this.ptr.get(LAYOUT__pGroups, OFFSET__pGroups);}
    public void pGroups(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pGroups, OFFSET__pGroups, value);}
    public java.lang.foreign.MemorySegment $pGroups() {return this.ptr.asSlice(OFFSET__pGroups, LAYOUT__pGroups);}

    public int maxPipelineRayRecursionDepth() {return this.ptr.get(LAYOUT__maxPipelineRayRecursionDepth, OFFSET__maxPipelineRayRecursionDepth);}
    public void maxPipelineRayRecursionDepth(int value) {this.ptr.set(LAYOUT__maxPipelineRayRecursionDepth, OFFSET__maxPipelineRayRecursionDepth, value);}
    public java.lang.foreign.MemorySegment $maxPipelineRayRecursionDepth() {return this.ptr.asSlice(OFFSET__maxPipelineRayRecursionDepth, LAYOUT__maxPipelineRayRecursionDepth);}

    public java.lang.foreign.MemorySegment pLibraryInfo() {return this.ptr.get(LAYOUT__pLibraryInfo, OFFSET__pLibraryInfo);}
    public void pLibraryInfo(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pLibraryInfo, OFFSET__pLibraryInfo, value);}
    public java.lang.foreign.MemorySegment $pLibraryInfo() {return this.ptr.asSlice(OFFSET__pLibraryInfo, LAYOUT__pLibraryInfo);}

    public java.lang.foreign.MemorySegment pLibraryInterface() {return this.ptr.get(LAYOUT__pLibraryInterface, OFFSET__pLibraryInterface);}
    public void pLibraryInterface(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pLibraryInterface, OFFSET__pLibraryInterface, value);}
    public java.lang.foreign.MemorySegment $pLibraryInterface() {return this.ptr.asSlice(OFFSET__pLibraryInterface, LAYOUT__pLibraryInterface);}

    public java.lang.foreign.MemorySegment pDynamicState() {return this.ptr.get(LAYOUT__pDynamicState, OFFSET__pDynamicState);}
    public void pDynamicState(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pDynamicState, OFFSET__pDynamicState, value);}
    public java.lang.foreign.MemorySegment $pDynamicState() {return this.ptr.asSlice(OFFSET__pDynamicState, LAYOUT__pDynamicState);}

    public java.lang.foreign.MemorySegment layout() {return this.ptr.get(LAYOUT__layout, OFFSET__layout);}
    public void layout(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__layout, OFFSET__layout, value);}
    public java.lang.foreign.MemorySegment $layout() {return this.ptr.asSlice(OFFSET__layout, LAYOUT__layout);}

    public java.lang.foreign.MemorySegment basePipelineHandle() {return this.ptr.get(LAYOUT__basePipelineHandle, OFFSET__basePipelineHandle);}
    public void basePipelineHandle(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__basePipelineHandle, OFFSET__basePipelineHandle, value);}
    public java.lang.foreign.MemorySegment $basePipelineHandle() {return this.ptr.asSlice(OFFSET__basePipelineHandle, LAYOUT__basePipelineHandle);}

    public int basePipelineIndex() {return this.ptr.get(LAYOUT__basePipelineIndex, OFFSET__basePipelineIndex);}
    public void basePipelineIndex(int value) {this.ptr.set(LAYOUT__basePipelineIndex, OFFSET__basePipelineIndex, value);}
    public java.lang.foreign.MemorySegment $basePipelineIndex() {return this.ptr.asSlice(OFFSET__basePipelineIndex, LAYOUT__basePipelineIndex);}
}
