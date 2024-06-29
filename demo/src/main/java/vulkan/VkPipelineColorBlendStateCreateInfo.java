package vulkan;

public record VkPipelineColorBlendStateCreateInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__flags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__flags = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__logicOpEnable = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__logicOpEnable = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__logicOp = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__logicOp = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__attachmentCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__attachmentCount = 28;
    public static final java.lang.foreign.AddressLayout LAYOUT__pAttachments = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pAttachments = 32;
    public static final java.lang.foreign.SequenceLayout LAYOUT__blendConstants = java.lang.foreign.MemoryLayout.sequenceLayout(4, java.lang.foreign.ValueLayout.JAVA_FLOAT);
    public static final long OFFSET__blendConstants = 40;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__flags,
            LAYOUT__logicOpEnable,
            LAYOUT__logicOp,
            LAYOUT__attachmentCount,
            LAYOUT__pAttachments,
            LAYOUT__blendConstants
    ).withByteAlignment(8).withName("VkPipelineColorBlendStateCreateInfo");

    public VkPipelineColorBlendStateCreateInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPipelineColorBlendStateCreateInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPipelineColorBlendStateCreateInfo(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPipelineColorBlendStateCreateInfo value)
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

    public int logicOpEnable() {return this.ptr.get(LAYOUT__logicOpEnable, OFFSET__logicOpEnable);}
    public void logicOpEnable(int value) {this.ptr.set(LAYOUT__logicOpEnable, OFFSET__logicOpEnable, value);}
    public java.lang.foreign.MemorySegment $logicOpEnable() {return this.ptr.asSlice(OFFSET__logicOpEnable, LAYOUT__logicOpEnable);}

    public int logicOp() {return this.ptr.get(LAYOUT__logicOp, OFFSET__logicOp);}
    public void logicOp(int value) {this.ptr.set(LAYOUT__logicOp, OFFSET__logicOp, value);}
    public java.lang.foreign.MemorySegment $logicOp() {return this.ptr.asSlice(OFFSET__logicOp, LAYOUT__logicOp);}

    public int attachmentCount() {return this.ptr.get(LAYOUT__attachmentCount, OFFSET__attachmentCount);}
    public void attachmentCount(int value) {this.ptr.set(LAYOUT__attachmentCount, OFFSET__attachmentCount, value);}
    public java.lang.foreign.MemorySegment $attachmentCount() {return this.ptr.asSlice(OFFSET__attachmentCount, LAYOUT__attachmentCount);}

    public java.lang.foreign.MemorySegment pAttachments() {return this.ptr.get(LAYOUT__pAttachments, OFFSET__pAttachments);}
    public void pAttachments(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pAttachments, OFFSET__pAttachments, value);}
    public java.lang.foreign.MemorySegment $pAttachments() {return this.ptr.asSlice(OFFSET__pAttachments, LAYOUT__pAttachments);}

    public java.lang.foreign.MemorySegment blendConstants() {return this.ptr.asSlice(OFFSET__blendConstants, LAYOUT__blendConstants);}
    public float blendConstants(int index) {return this.blendConstants().getAtIndex(java.lang.foreign.ValueLayout.JAVA_FLOAT, index);}
    public void blendConstants(int index, float value) {this.blendConstants().setAtIndex(java.lang.foreign.ValueLayout.JAVA_FLOAT, index, value);}
}
