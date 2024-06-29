package vulkan;

public record VkShaderCreateInfoEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__flags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__flags = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__stage = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__stage = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__nextStage = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__nextStage = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__codeType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__codeType = 28;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__codeSize = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__codeSize = 32;
    public static final java.lang.foreign.AddressLayout LAYOUT__pCode = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pCode = 40;
    public static final java.lang.foreign.AddressLayout LAYOUT__pName = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pName = 48;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__setLayoutCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__setLayoutCount = 56;
    public static final java.lang.foreign.AddressLayout LAYOUT__pSetLayouts = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pSetLayouts = 64;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__pushConstantRangeCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__pushConstantRangeCount = 72;
    public static final java.lang.foreign.AddressLayout LAYOUT__pPushConstantRanges = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pPushConstantRanges = 80;
    public static final java.lang.foreign.AddressLayout LAYOUT__pSpecializationInfo = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pSpecializationInfo = 88;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__flags,
            LAYOUT__stage,
            LAYOUT__nextStage,
            LAYOUT__codeType,
            LAYOUT__codeSize,
            LAYOUT__pCode,
            LAYOUT__pName,
            LAYOUT__setLayoutCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pSetLayouts,
            LAYOUT__pushConstantRangeCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pPushConstantRanges,
            LAYOUT__pSpecializationInfo
    ).withByteAlignment(8).withName("VkShaderCreateInfoEXT");

    public VkShaderCreateInfoEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkShaderCreateInfoEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkShaderCreateInfoEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkShaderCreateInfoEXT value)
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

    public int stage() {return this.ptr.get(LAYOUT__stage, OFFSET__stage);}
    public void stage(int value) {this.ptr.set(LAYOUT__stage, OFFSET__stage, value);}
    public java.lang.foreign.MemorySegment $stage() {return this.ptr.asSlice(OFFSET__stage, LAYOUT__stage);}

    public int nextStage() {return this.ptr.get(LAYOUT__nextStage, OFFSET__nextStage);}
    public void nextStage(int value) {this.ptr.set(LAYOUT__nextStage, OFFSET__nextStage, value);}
    public java.lang.foreign.MemorySegment $nextStage() {return this.ptr.asSlice(OFFSET__nextStage, LAYOUT__nextStage);}

    public int codeType() {return this.ptr.get(LAYOUT__codeType, OFFSET__codeType);}
    public void codeType(int value) {this.ptr.set(LAYOUT__codeType, OFFSET__codeType, value);}
    public java.lang.foreign.MemorySegment $codeType() {return this.ptr.asSlice(OFFSET__codeType, LAYOUT__codeType);}

    public long codeSize() {return this.ptr.get(LAYOUT__codeSize, OFFSET__codeSize);}
    public void codeSize(long value) {this.ptr.set(LAYOUT__codeSize, OFFSET__codeSize, value);}
    public java.lang.foreign.MemorySegment $codeSize() {return this.ptr.asSlice(OFFSET__codeSize, LAYOUT__codeSize);}

    public java.lang.foreign.MemorySegment pCode() {return this.ptr.get(LAYOUT__pCode, OFFSET__pCode);}
    public void pCode(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pCode, OFFSET__pCode, value);}
    public java.lang.foreign.MemorySegment $pCode() {return this.ptr.asSlice(OFFSET__pCode, LAYOUT__pCode);}

    public java.lang.foreign.MemorySegment pName() {return this.ptr.get(LAYOUT__pName, OFFSET__pName);}
    public void pName(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pName, OFFSET__pName, value);}
    public java.lang.foreign.MemorySegment $pName() {return this.ptr.asSlice(OFFSET__pName, LAYOUT__pName);}

    public int setLayoutCount() {return this.ptr.get(LAYOUT__setLayoutCount, OFFSET__setLayoutCount);}
    public void setLayoutCount(int value) {this.ptr.set(LAYOUT__setLayoutCount, OFFSET__setLayoutCount, value);}
    public java.lang.foreign.MemorySegment $setLayoutCount() {return this.ptr.asSlice(OFFSET__setLayoutCount, LAYOUT__setLayoutCount);}

    public java.lang.foreign.MemorySegment pSetLayouts() {return this.ptr.get(LAYOUT__pSetLayouts, OFFSET__pSetLayouts);}
    public void pSetLayouts(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pSetLayouts, OFFSET__pSetLayouts, value);}
    public java.lang.foreign.MemorySegment $pSetLayouts() {return this.ptr.asSlice(OFFSET__pSetLayouts, LAYOUT__pSetLayouts);}

    public int pushConstantRangeCount() {return this.ptr.get(LAYOUT__pushConstantRangeCount, OFFSET__pushConstantRangeCount);}
    public void pushConstantRangeCount(int value) {this.ptr.set(LAYOUT__pushConstantRangeCount, OFFSET__pushConstantRangeCount, value);}
    public java.lang.foreign.MemorySegment $pushConstantRangeCount() {return this.ptr.asSlice(OFFSET__pushConstantRangeCount, LAYOUT__pushConstantRangeCount);}

    public java.lang.foreign.MemorySegment pPushConstantRanges() {return this.ptr.get(LAYOUT__pPushConstantRanges, OFFSET__pPushConstantRanges);}
    public void pPushConstantRanges(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pPushConstantRanges, OFFSET__pPushConstantRanges, value);}
    public java.lang.foreign.MemorySegment $pPushConstantRanges() {return this.ptr.asSlice(OFFSET__pPushConstantRanges, LAYOUT__pPushConstantRanges);}

    public java.lang.foreign.MemorySegment pSpecializationInfo() {return this.ptr.get(LAYOUT__pSpecializationInfo, OFFSET__pSpecializationInfo);}
    public void pSpecializationInfo(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pSpecializationInfo, OFFSET__pSpecializationInfo, value);}
    public java.lang.foreign.MemorySegment $pSpecializationInfo() {return this.ptr.asSlice(OFFSET__pSpecializationInfo, LAYOUT__pSpecializationInfo);}
}
