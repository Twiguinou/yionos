package vulkan;

public record VkGraphicsShaderGroupCreateInfoNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__stageCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("stageCount");
    public static final long OFFSET__stageCount = 16;
    public static final java.lang.foreign.AddressLayout LAYOUT__pStages = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pStages");
    public static final long OFFSET__pStages = 24;
    public static final java.lang.foreign.AddressLayout LAYOUT__pVertexInputState = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pVertexInputState");
    public static final long OFFSET__pVertexInputState = 32;
    public static final java.lang.foreign.AddressLayout LAYOUT__pTessellationState = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pTessellationState");
    public static final long OFFSET__pTessellationState = 40;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__stageCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pStages,
            LAYOUT__pVertexInputState,
            LAYOUT__pTessellationState
    ).withByteAlignment(8).withName("VkGraphicsShaderGroupCreateInfoNV");

    public VkGraphicsShaderGroupCreateInfoNV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkGraphicsShaderGroupCreateInfoNV getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkGraphicsShaderGroupCreateInfoNV(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkGraphicsShaderGroupCreateInfoNV value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int stageCount() {return this.ptr.get(LAYOUT__stageCount, OFFSET__stageCount);}
    public void stageCount(int value) {this.ptr.set(LAYOUT__stageCount, OFFSET__stageCount, value);}
    public java.lang.foreign.MemorySegment $stageCount() {return this.ptr.asSlice(OFFSET__stageCount, LAYOUT__stageCount);}

    public java.lang.foreign.MemorySegment pStages() {return this.ptr.get(LAYOUT__pStages, OFFSET__pStages);}
    public void pStages(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pStages, OFFSET__pStages, value);}
    public java.lang.foreign.MemorySegment $pStages() {return this.ptr.asSlice(OFFSET__pStages, LAYOUT__pStages);}

    public java.lang.foreign.MemorySegment pVertexInputState() {return this.ptr.get(LAYOUT__pVertexInputState, OFFSET__pVertexInputState);}
    public void pVertexInputState(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pVertexInputState, OFFSET__pVertexInputState, value);}
    public java.lang.foreign.MemorySegment $pVertexInputState() {return this.ptr.asSlice(OFFSET__pVertexInputState, LAYOUT__pVertexInputState);}

    public java.lang.foreign.MemorySegment pTessellationState() {return this.ptr.get(LAYOUT__pTessellationState, OFFSET__pTessellationState);}
    public void pTessellationState(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pTessellationState, OFFSET__pTessellationState, value);}
    public java.lang.foreign.MemorySegment $pTessellationState() {return this.ptr.asSlice(OFFSET__pTessellationState, LAYOUT__pTessellationState);}
}
