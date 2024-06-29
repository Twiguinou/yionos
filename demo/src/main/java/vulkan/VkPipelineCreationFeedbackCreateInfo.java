package vulkan;

public record VkPipelineCreationFeedbackCreateInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.AddressLayout LAYOUT__pPipelineCreationFeedback = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pPipelineCreationFeedback = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__pipelineStageCreationFeedbackCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__pipelineStageCreationFeedbackCount = 24;
    public static final java.lang.foreign.AddressLayout LAYOUT__pPipelineStageCreationFeedbacks = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pPipelineStageCreationFeedbacks = 32;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__pPipelineCreationFeedback,
            LAYOUT__pipelineStageCreationFeedbackCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pPipelineStageCreationFeedbacks
    ).withByteAlignment(8).withName("VkPipelineCreationFeedbackCreateInfo");

    public VkPipelineCreationFeedbackCreateInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPipelineCreationFeedbackCreateInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPipelineCreationFeedbackCreateInfo(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPipelineCreationFeedbackCreateInfo value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public java.lang.foreign.MemorySegment pPipelineCreationFeedback() {return this.ptr.get(LAYOUT__pPipelineCreationFeedback, OFFSET__pPipelineCreationFeedback);}
    public void pPipelineCreationFeedback(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pPipelineCreationFeedback, OFFSET__pPipelineCreationFeedback, value);}
    public java.lang.foreign.MemorySegment $pPipelineCreationFeedback() {return this.ptr.asSlice(OFFSET__pPipelineCreationFeedback, LAYOUT__pPipelineCreationFeedback);}

    public int pipelineStageCreationFeedbackCount() {return this.ptr.get(LAYOUT__pipelineStageCreationFeedbackCount, OFFSET__pipelineStageCreationFeedbackCount);}
    public void pipelineStageCreationFeedbackCount(int value) {this.ptr.set(LAYOUT__pipelineStageCreationFeedbackCount, OFFSET__pipelineStageCreationFeedbackCount, value);}
    public java.lang.foreign.MemorySegment $pipelineStageCreationFeedbackCount() {return this.ptr.asSlice(OFFSET__pipelineStageCreationFeedbackCount, LAYOUT__pipelineStageCreationFeedbackCount);}

    public java.lang.foreign.MemorySegment pPipelineStageCreationFeedbacks() {return this.ptr.get(LAYOUT__pPipelineStageCreationFeedbacks, OFFSET__pPipelineStageCreationFeedbacks);}
    public void pPipelineStageCreationFeedbacks(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pPipelineStageCreationFeedbacks, OFFSET__pPipelineStageCreationFeedbacks, value);}
    public java.lang.foreign.MemorySegment $pPipelineStageCreationFeedbacks() {return this.ptr.asSlice(OFFSET__pPipelineStageCreationFeedbacks, LAYOUT__pPipelineStageCreationFeedbacks);}
}
