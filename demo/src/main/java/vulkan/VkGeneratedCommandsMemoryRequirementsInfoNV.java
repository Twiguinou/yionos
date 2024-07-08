package vulkan;

public record VkGeneratedCommandsMemoryRequirementsInfoNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__pipelineBindPoint = java.lang.foreign.ValueLayout.JAVA_INT.withName("pipelineBindPoint");
    public static final long OFFSET__pipelineBindPoint = 16;
    public static final java.lang.foreign.AddressLayout LAYOUT__pipeline = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pipeline");
    public static final long OFFSET__pipeline = 24;
    public static final java.lang.foreign.AddressLayout LAYOUT__indirectCommandsLayout = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("indirectCommandsLayout");
    public static final long OFFSET__indirectCommandsLayout = 32;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxSequencesCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxSequencesCount");
    public static final long OFFSET__maxSequencesCount = 40;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__pipelineBindPoint,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pipeline,
            LAYOUT__indirectCommandsLayout,
            LAYOUT__maxSequencesCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkGeneratedCommandsMemoryRequirementsInfoNV");

    public VkGeneratedCommandsMemoryRequirementsInfoNV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkGeneratedCommandsMemoryRequirementsInfoNV getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkGeneratedCommandsMemoryRequirementsInfoNV(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkGeneratedCommandsMemoryRequirementsInfoNV value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int pipelineBindPoint() {return this.ptr.get(LAYOUT__pipelineBindPoint, OFFSET__pipelineBindPoint);}
    public void pipelineBindPoint(int value) {this.ptr.set(LAYOUT__pipelineBindPoint, OFFSET__pipelineBindPoint, value);}
    public java.lang.foreign.MemorySegment $pipelineBindPoint() {return this.ptr.asSlice(OFFSET__pipelineBindPoint, LAYOUT__pipelineBindPoint);}

    public java.lang.foreign.MemorySegment pipeline() {return this.ptr.get(LAYOUT__pipeline, OFFSET__pipeline);}
    public void pipeline(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pipeline, OFFSET__pipeline, value);}
    public java.lang.foreign.MemorySegment $pipeline() {return this.ptr.asSlice(OFFSET__pipeline, LAYOUT__pipeline);}

    public java.lang.foreign.MemorySegment indirectCommandsLayout() {return this.ptr.get(LAYOUT__indirectCommandsLayout, OFFSET__indirectCommandsLayout);}
    public void indirectCommandsLayout(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__indirectCommandsLayout, OFFSET__indirectCommandsLayout, value);}
    public java.lang.foreign.MemorySegment $indirectCommandsLayout() {return this.ptr.asSlice(OFFSET__indirectCommandsLayout, LAYOUT__indirectCommandsLayout);}

    public int maxSequencesCount() {return this.ptr.get(LAYOUT__maxSequencesCount, OFFSET__maxSequencesCount);}
    public void maxSequencesCount(int value) {this.ptr.set(LAYOUT__maxSequencesCount, OFFSET__maxSequencesCount, value);}
    public java.lang.foreign.MemorySegment $maxSequencesCount() {return this.ptr.asSlice(OFFSET__maxSequencesCount, LAYOUT__maxSequencesCount);}
}
