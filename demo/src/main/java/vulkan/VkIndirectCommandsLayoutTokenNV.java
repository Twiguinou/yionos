package vulkan;

public record VkIndirectCommandsLayoutTokenNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__tokenType = java.lang.foreign.ValueLayout.JAVA_INT.withName("tokenType");
    public static final long OFFSET__tokenType = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__stream = java.lang.foreign.ValueLayout.JAVA_INT.withName("stream");
    public static final long OFFSET__stream = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__offset = java.lang.foreign.ValueLayout.JAVA_INT.withName("offset");
    public static final long OFFSET__offset = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__vertexBindingUnit = java.lang.foreign.ValueLayout.JAVA_INT.withName("vertexBindingUnit");
    public static final long OFFSET__vertexBindingUnit = 28;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__vertexDynamicStride = java.lang.foreign.ValueLayout.JAVA_INT.withName("vertexDynamicStride");
    public static final long OFFSET__vertexDynamicStride = 32;
    public static final java.lang.foreign.AddressLayout LAYOUT__pushconstantPipelineLayout = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pushconstantPipelineLayout");
    public static final long OFFSET__pushconstantPipelineLayout = 40;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__pushconstantShaderStageFlags = java.lang.foreign.ValueLayout.JAVA_INT.withName("pushconstantShaderStageFlags");
    public static final long OFFSET__pushconstantShaderStageFlags = 48;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__pushconstantOffset = java.lang.foreign.ValueLayout.JAVA_INT.withName("pushconstantOffset");
    public static final long OFFSET__pushconstantOffset = 52;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__pushconstantSize = java.lang.foreign.ValueLayout.JAVA_INT.withName("pushconstantSize");
    public static final long OFFSET__pushconstantSize = 56;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__indirectStateFlags = java.lang.foreign.ValueLayout.JAVA_INT.withName("indirectStateFlags");
    public static final long OFFSET__indirectStateFlags = 60;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__indexTypeCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("indexTypeCount");
    public static final long OFFSET__indexTypeCount = 64;
    public static final java.lang.foreign.AddressLayout LAYOUT__pIndexTypes = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pIndexTypes");
    public static final long OFFSET__pIndexTypes = 72;
    public static final java.lang.foreign.AddressLayout LAYOUT__pIndexTypeValues = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pIndexTypeValues");
    public static final long OFFSET__pIndexTypeValues = 80;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__tokenType,
            LAYOUT__stream,
            LAYOUT__offset,
            LAYOUT__vertexBindingUnit,
            LAYOUT__vertexDynamicStride,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pushconstantPipelineLayout,
            LAYOUT__pushconstantShaderStageFlags,
            LAYOUT__pushconstantOffset,
            LAYOUT__pushconstantSize,
            LAYOUT__indirectStateFlags,
            LAYOUT__indexTypeCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pIndexTypes,
            LAYOUT__pIndexTypeValues
    ).withByteAlignment(8).withName("VkIndirectCommandsLayoutTokenNV");

    public VkIndirectCommandsLayoutTokenNV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkIndirectCommandsLayoutTokenNV getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkIndirectCommandsLayoutTokenNV(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkIndirectCommandsLayoutTokenNV value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int tokenType() {return this.ptr.get(LAYOUT__tokenType, OFFSET__tokenType);}
    public void tokenType(int value) {this.ptr.set(LAYOUT__tokenType, OFFSET__tokenType, value);}
    public java.lang.foreign.MemorySegment $tokenType() {return this.ptr.asSlice(OFFSET__tokenType, LAYOUT__tokenType);}

    public int stream() {return this.ptr.get(LAYOUT__stream, OFFSET__stream);}
    public void stream(int value) {this.ptr.set(LAYOUT__stream, OFFSET__stream, value);}
    public java.lang.foreign.MemorySegment $stream() {return this.ptr.asSlice(OFFSET__stream, LAYOUT__stream);}

    public int offset() {return this.ptr.get(LAYOUT__offset, OFFSET__offset);}
    public void offset(int value) {this.ptr.set(LAYOUT__offset, OFFSET__offset, value);}
    public java.lang.foreign.MemorySegment $offset() {return this.ptr.asSlice(OFFSET__offset, LAYOUT__offset);}

    public int vertexBindingUnit() {return this.ptr.get(LAYOUT__vertexBindingUnit, OFFSET__vertexBindingUnit);}
    public void vertexBindingUnit(int value) {this.ptr.set(LAYOUT__vertexBindingUnit, OFFSET__vertexBindingUnit, value);}
    public java.lang.foreign.MemorySegment $vertexBindingUnit() {return this.ptr.asSlice(OFFSET__vertexBindingUnit, LAYOUT__vertexBindingUnit);}

    public int vertexDynamicStride() {return this.ptr.get(LAYOUT__vertexDynamicStride, OFFSET__vertexDynamicStride);}
    public void vertexDynamicStride(int value) {this.ptr.set(LAYOUT__vertexDynamicStride, OFFSET__vertexDynamicStride, value);}
    public java.lang.foreign.MemorySegment $vertexDynamicStride() {return this.ptr.asSlice(OFFSET__vertexDynamicStride, LAYOUT__vertexDynamicStride);}

    public java.lang.foreign.MemorySegment pushconstantPipelineLayout() {return this.ptr.get(LAYOUT__pushconstantPipelineLayout, OFFSET__pushconstantPipelineLayout);}
    public void pushconstantPipelineLayout(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pushconstantPipelineLayout, OFFSET__pushconstantPipelineLayout, value);}
    public java.lang.foreign.MemorySegment $pushconstantPipelineLayout() {return this.ptr.asSlice(OFFSET__pushconstantPipelineLayout, LAYOUT__pushconstantPipelineLayout);}

    public int pushconstantShaderStageFlags() {return this.ptr.get(LAYOUT__pushconstantShaderStageFlags, OFFSET__pushconstantShaderStageFlags);}
    public void pushconstantShaderStageFlags(int value) {this.ptr.set(LAYOUT__pushconstantShaderStageFlags, OFFSET__pushconstantShaderStageFlags, value);}
    public java.lang.foreign.MemorySegment $pushconstantShaderStageFlags() {return this.ptr.asSlice(OFFSET__pushconstantShaderStageFlags, LAYOUT__pushconstantShaderStageFlags);}

    public int pushconstantOffset() {return this.ptr.get(LAYOUT__pushconstantOffset, OFFSET__pushconstantOffset);}
    public void pushconstantOffset(int value) {this.ptr.set(LAYOUT__pushconstantOffset, OFFSET__pushconstantOffset, value);}
    public java.lang.foreign.MemorySegment $pushconstantOffset() {return this.ptr.asSlice(OFFSET__pushconstantOffset, LAYOUT__pushconstantOffset);}

    public int pushconstantSize() {return this.ptr.get(LAYOUT__pushconstantSize, OFFSET__pushconstantSize);}
    public void pushconstantSize(int value) {this.ptr.set(LAYOUT__pushconstantSize, OFFSET__pushconstantSize, value);}
    public java.lang.foreign.MemorySegment $pushconstantSize() {return this.ptr.asSlice(OFFSET__pushconstantSize, LAYOUT__pushconstantSize);}

    public int indirectStateFlags() {return this.ptr.get(LAYOUT__indirectStateFlags, OFFSET__indirectStateFlags);}
    public void indirectStateFlags(int value) {this.ptr.set(LAYOUT__indirectStateFlags, OFFSET__indirectStateFlags, value);}
    public java.lang.foreign.MemorySegment $indirectStateFlags() {return this.ptr.asSlice(OFFSET__indirectStateFlags, LAYOUT__indirectStateFlags);}

    public int indexTypeCount() {return this.ptr.get(LAYOUT__indexTypeCount, OFFSET__indexTypeCount);}
    public void indexTypeCount(int value) {this.ptr.set(LAYOUT__indexTypeCount, OFFSET__indexTypeCount, value);}
    public java.lang.foreign.MemorySegment $indexTypeCount() {return this.ptr.asSlice(OFFSET__indexTypeCount, LAYOUT__indexTypeCount);}

    public java.lang.foreign.MemorySegment pIndexTypes() {return this.ptr.get(LAYOUT__pIndexTypes, OFFSET__pIndexTypes);}
    public void pIndexTypes(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pIndexTypes, OFFSET__pIndexTypes, value);}
    public java.lang.foreign.MemorySegment $pIndexTypes() {return this.ptr.asSlice(OFFSET__pIndexTypes, LAYOUT__pIndexTypes);}

    public java.lang.foreign.MemorySegment pIndexTypeValues() {return this.ptr.get(LAYOUT__pIndexTypeValues, OFFSET__pIndexTypeValues);}
    public void pIndexTypeValues(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pIndexTypeValues, OFFSET__pIndexTypeValues, value);}
    public java.lang.foreign.MemorySegment $pIndexTypeValues() {return this.ptr.asSlice(OFFSET__pIndexTypeValues, LAYOUT__pIndexTypeValues);}
}
