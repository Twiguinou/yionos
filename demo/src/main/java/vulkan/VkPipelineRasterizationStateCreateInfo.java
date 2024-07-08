package vulkan;

public record VkPipelineRasterizationStateCreateInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__flags = java.lang.foreign.ValueLayout.JAVA_INT.withName("flags");
    public static final long OFFSET__flags = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__depthClampEnable = java.lang.foreign.ValueLayout.JAVA_INT.withName("depthClampEnable");
    public static final long OFFSET__depthClampEnable = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__rasterizerDiscardEnable = java.lang.foreign.ValueLayout.JAVA_INT.withName("rasterizerDiscardEnable");
    public static final long OFFSET__rasterizerDiscardEnable = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__polygonMode = java.lang.foreign.ValueLayout.JAVA_INT.withName("polygonMode");
    public static final long OFFSET__polygonMode = 28;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__cullMode = java.lang.foreign.ValueLayout.JAVA_INT.withName("cullMode");
    public static final long OFFSET__cullMode = 32;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__frontFace = java.lang.foreign.ValueLayout.JAVA_INT.withName("frontFace");
    public static final long OFFSET__frontFace = 36;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__depthBiasEnable = java.lang.foreign.ValueLayout.JAVA_INT.withName("depthBiasEnable");
    public static final long OFFSET__depthBiasEnable = 40;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__depthBiasConstantFactor = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("depthBiasConstantFactor");
    public static final long OFFSET__depthBiasConstantFactor = 44;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__depthBiasClamp = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("depthBiasClamp");
    public static final long OFFSET__depthBiasClamp = 48;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__depthBiasSlopeFactor = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("depthBiasSlopeFactor");
    public static final long OFFSET__depthBiasSlopeFactor = 52;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__lineWidth = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("lineWidth");
    public static final long OFFSET__lineWidth = 56;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__flags,
            LAYOUT__depthClampEnable,
            LAYOUT__rasterizerDiscardEnable,
            LAYOUT__polygonMode,
            LAYOUT__cullMode,
            LAYOUT__frontFace,
            LAYOUT__depthBiasEnable,
            LAYOUT__depthBiasConstantFactor,
            LAYOUT__depthBiasClamp,
            LAYOUT__depthBiasSlopeFactor,
            LAYOUT__lineWidth,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkPipelineRasterizationStateCreateInfo");

    public VkPipelineRasterizationStateCreateInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPipelineRasterizationStateCreateInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPipelineRasterizationStateCreateInfo(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPipelineRasterizationStateCreateInfo value)
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

    public int depthClampEnable() {return this.ptr.get(LAYOUT__depthClampEnable, OFFSET__depthClampEnable);}
    public void depthClampEnable(int value) {this.ptr.set(LAYOUT__depthClampEnable, OFFSET__depthClampEnable, value);}
    public java.lang.foreign.MemorySegment $depthClampEnable() {return this.ptr.asSlice(OFFSET__depthClampEnable, LAYOUT__depthClampEnable);}

    public int rasterizerDiscardEnable() {return this.ptr.get(LAYOUT__rasterizerDiscardEnable, OFFSET__rasterizerDiscardEnable);}
    public void rasterizerDiscardEnable(int value) {this.ptr.set(LAYOUT__rasterizerDiscardEnable, OFFSET__rasterizerDiscardEnable, value);}
    public java.lang.foreign.MemorySegment $rasterizerDiscardEnable() {return this.ptr.asSlice(OFFSET__rasterizerDiscardEnable, LAYOUT__rasterizerDiscardEnable);}

    public int polygonMode() {return this.ptr.get(LAYOUT__polygonMode, OFFSET__polygonMode);}
    public void polygonMode(int value) {this.ptr.set(LAYOUT__polygonMode, OFFSET__polygonMode, value);}
    public java.lang.foreign.MemorySegment $polygonMode() {return this.ptr.asSlice(OFFSET__polygonMode, LAYOUT__polygonMode);}

    public int cullMode() {return this.ptr.get(LAYOUT__cullMode, OFFSET__cullMode);}
    public void cullMode(int value) {this.ptr.set(LAYOUT__cullMode, OFFSET__cullMode, value);}
    public java.lang.foreign.MemorySegment $cullMode() {return this.ptr.asSlice(OFFSET__cullMode, LAYOUT__cullMode);}

    public int frontFace() {return this.ptr.get(LAYOUT__frontFace, OFFSET__frontFace);}
    public void frontFace(int value) {this.ptr.set(LAYOUT__frontFace, OFFSET__frontFace, value);}
    public java.lang.foreign.MemorySegment $frontFace() {return this.ptr.asSlice(OFFSET__frontFace, LAYOUT__frontFace);}

    public int depthBiasEnable() {return this.ptr.get(LAYOUT__depthBiasEnable, OFFSET__depthBiasEnable);}
    public void depthBiasEnable(int value) {this.ptr.set(LAYOUT__depthBiasEnable, OFFSET__depthBiasEnable, value);}
    public java.lang.foreign.MemorySegment $depthBiasEnable() {return this.ptr.asSlice(OFFSET__depthBiasEnable, LAYOUT__depthBiasEnable);}

    public float depthBiasConstantFactor() {return this.ptr.get(LAYOUT__depthBiasConstantFactor, OFFSET__depthBiasConstantFactor);}
    public void depthBiasConstantFactor(float value) {this.ptr.set(LAYOUT__depthBiasConstantFactor, OFFSET__depthBiasConstantFactor, value);}
    public java.lang.foreign.MemorySegment $depthBiasConstantFactor() {return this.ptr.asSlice(OFFSET__depthBiasConstantFactor, LAYOUT__depthBiasConstantFactor);}

    public float depthBiasClamp() {return this.ptr.get(LAYOUT__depthBiasClamp, OFFSET__depthBiasClamp);}
    public void depthBiasClamp(float value) {this.ptr.set(LAYOUT__depthBiasClamp, OFFSET__depthBiasClamp, value);}
    public java.lang.foreign.MemorySegment $depthBiasClamp() {return this.ptr.asSlice(OFFSET__depthBiasClamp, LAYOUT__depthBiasClamp);}

    public float depthBiasSlopeFactor() {return this.ptr.get(LAYOUT__depthBiasSlopeFactor, OFFSET__depthBiasSlopeFactor);}
    public void depthBiasSlopeFactor(float value) {this.ptr.set(LAYOUT__depthBiasSlopeFactor, OFFSET__depthBiasSlopeFactor, value);}
    public java.lang.foreign.MemorySegment $depthBiasSlopeFactor() {return this.ptr.asSlice(OFFSET__depthBiasSlopeFactor, LAYOUT__depthBiasSlopeFactor);}

    public float lineWidth() {return this.ptr.get(LAYOUT__lineWidth, OFFSET__lineWidth);}
    public void lineWidth(float value) {this.ptr.set(LAYOUT__lineWidth, OFFSET__lineWidth, value);}
    public java.lang.foreign.MemorySegment $lineWidth() {return this.ptr.asSlice(OFFSET__lineWidth, LAYOUT__lineWidth);}
}
