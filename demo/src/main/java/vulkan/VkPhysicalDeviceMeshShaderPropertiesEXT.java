package vulkan;

public record VkPhysicalDeviceMeshShaderPropertiesEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxTaskWorkGroupTotalCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxTaskWorkGroupTotalCount");
    public static final long OFFSET__maxTaskWorkGroupTotalCount = 16;
    public static final java.lang.foreign.SequenceLayout LAYOUT__maxTaskWorkGroupCount = java.lang.foreign.MemoryLayout.sequenceLayout(3, java.lang.foreign.ValueLayout.JAVA_INT).withName("maxTaskWorkGroupCount");
    public static final long OFFSET__maxTaskWorkGroupCount = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxTaskWorkGroupInvocations = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxTaskWorkGroupInvocations");
    public static final long OFFSET__maxTaskWorkGroupInvocations = 32;
    public static final java.lang.foreign.SequenceLayout LAYOUT__maxTaskWorkGroupSize = java.lang.foreign.MemoryLayout.sequenceLayout(3, java.lang.foreign.ValueLayout.JAVA_INT).withName("maxTaskWorkGroupSize");
    public static final long OFFSET__maxTaskWorkGroupSize = 36;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxTaskPayloadSize = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxTaskPayloadSize");
    public static final long OFFSET__maxTaskPayloadSize = 48;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxTaskSharedMemorySize = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxTaskSharedMemorySize");
    public static final long OFFSET__maxTaskSharedMemorySize = 52;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxTaskPayloadAndSharedMemorySize = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxTaskPayloadAndSharedMemorySize");
    public static final long OFFSET__maxTaskPayloadAndSharedMemorySize = 56;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxMeshWorkGroupTotalCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxMeshWorkGroupTotalCount");
    public static final long OFFSET__maxMeshWorkGroupTotalCount = 60;
    public static final java.lang.foreign.SequenceLayout LAYOUT__maxMeshWorkGroupCount = java.lang.foreign.MemoryLayout.sequenceLayout(3, java.lang.foreign.ValueLayout.JAVA_INT).withName("maxMeshWorkGroupCount");
    public static final long OFFSET__maxMeshWorkGroupCount = 64;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxMeshWorkGroupInvocations = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxMeshWorkGroupInvocations");
    public static final long OFFSET__maxMeshWorkGroupInvocations = 76;
    public static final java.lang.foreign.SequenceLayout LAYOUT__maxMeshWorkGroupSize = java.lang.foreign.MemoryLayout.sequenceLayout(3, java.lang.foreign.ValueLayout.JAVA_INT).withName("maxMeshWorkGroupSize");
    public static final long OFFSET__maxMeshWorkGroupSize = 80;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxMeshSharedMemorySize = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxMeshSharedMemorySize");
    public static final long OFFSET__maxMeshSharedMemorySize = 92;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxMeshPayloadAndSharedMemorySize = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxMeshPayloadAndSharedMemorySize");
    public static final long OFFSET__maxMeshPayloadAndSharedMemorySize = 96;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxMeshOutputMemorySize = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxMeshOutputMemorySize");
    public static final long OFFSET__maxMeshOutputMemorySize = 100;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxMeshPayloadAndOutputMemorySize = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxMeshPayloadAndOutputMemorySize");
    public static final long OFFSET__maxMeshPayloadAndOutputMemorySize = 104;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxMeshOutputComponents = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxMeshOutputComponents");
    public static final long OFFSET__maxMeshOutputComponents = 108;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxMeshOutputVertices = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxMeshOutputVertices");
    public static final long OFFSET__maxMeshOutputVertices = 112;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxMeshOutputPrimitives = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxMeshOutputPrimitives");
    public static final long OFFSET__maxMeshOutputPrimitives = 116;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxMeshOutputLayers = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxMeshOutputLayers");
    public static final long OFFSET__maxMeshOutputLayers = 120;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxMeshMultiviewViewCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxMeshMultiviewViewCount");
    public static final long OFFSET__maxMeshMultiviewViewCount = 124;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__meshOutputPerVertexGranularity = java.lang.foreign.ValueLayout.JAVA_INT.withName("meshOutputPerVertexGranularity");
    public static final long OFFSET__meshOutputPerVertexGranularity = 128;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__meshOutputPerPrimitiveGranularity = java.lang.foreign.ValueLayout.JAVA_INT.withName("meshOutputPerPrimitiveGranularity");
    public static final long OFFSET__meshOutputPerPrimitiveGranularity = 132;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxPreferredTaskWorkGroupInvocations = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxPreferredTaskWorkGroupInvocations");
    public static final long OFFSET__maxPreferredTaskWorkGroupInvocations = 136;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxPreferredMeshWorkGroupInvocations = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxPreferredMeshWorkGroupInvocations");
    public static final long OFFSET__maxPreferredMeshWorkGroupInvocations = 140;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__prefersLocalInvocationVertexOutput = java.lang.foreign.ValueLayout.JAVA_INT.withName("prefersLocalInvocationVertexOutput");
    public static final long OFFSET__prefersLocalInvocationVertexOutput = 144;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__prefersLocalInvocationPrimitiveOutput = java.lang.foreign.ValueLayout.JAVA_INT.withName("prefersLocalInvocationPrimitiveOutput");
    public static final long OFFSET__prefersLocalInvocationPrimitiveOutput = 148;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__prefersCompactVertexOutput = java.lang.foreign.ValueLayout.JAVA_INT.withName("prefersCompactVertexOutput");
    public static final long OFFSET__prefersCompactVertexOutput = 152;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__prefersCompactPrimitiveOutput = java.lang.foreign.ValueLayout.JAVA_INT.withName("prefersCompactPrimitiveOutput");
    public static final long OFFSET__prefersCompactPrimitiveOutput = 156;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__maxTaskWorkGroupTotalCount,
            LAYOUT__maxTaskWorkGroupCount,
            LAYOUT__maxTaskWorkGroupInvocations,
            LAYOUT__maxTaskWorkGroupSize,
            LAYOUT__maxTaskPayloadSize,
            LAYOUT__maxTaskSharedMemorySize,
            LAYOUT__maxTaskPayloadAndSharedMemorySize,
            LAYOUT__maxMeshWorkGroupTotalCount,
            LAYOUT__maxMeshWorkGroupCount,
            LAYOUT__maxMeshWorkGroupInvocations,
            LAYOUT__maxMeshWorkGroupSize,
            LAYOUT__maxMeshSharedMemorySize,
            LAYOUT__maxMeshPayloadAndSharedMemorySize,
            LAYOUT__maxMeshOutputMemorySize,
            LAYOUT__maxMeshPayloadAndOutputMemorySize,
            LAYOUT__maxMeshOutputComponents,
            LAYOUT__maxMeshOutputVertices,
            LAYOUT__maxMeshOutputPrimitives,
            LAYOUT__maxMeshOutputLayers,
            LAYOUT__maxMeshMultiviewViewCount,
            LAYOUT__meshOutputPerVertexGranularity,
            LAYOUT__meshOutputPerPrimitiveGranularity,
            LAYOUT__maxPreferredTaskWorkGroupInvocations,
            LAYOUT__maxPreferredMeshWorkGroupInvocations,
            LAYOUT__prefersLocalInvocationVertexOutput,
            LAYOUT__prefersLocalInvocationPrimitiveOutput,
            LAYOUT__prefersCompactVertexOutput,
            LAYOUT__prefersCompactPrimitiveOutput
    ).withByteAlignment(8).withName("VkPhysicalDeviceMeshShaderPropertiesEXT");

    public VkPhysicalDeviceMeshShaderPropertiesEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceMeshShaderPropertiesEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceMeshShaderPropertiesEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceMeshShaderPropertiesEXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int maxTaskWorkGroupTotalCount() {return this.ptr.get(LAYOUT__maxTaskWorkGroupTotalCount, OFFSET__maxTaskWorkGroupTotalCount);}
    public void maxTaskWorkGroupTotalCount(int value) {this.ptr.set(LAYOUT__maxTaskWorkGroupTotalCount, OFFSET__maxTaskWorkGroupTotalCount, value);}
    public java.lang.foreign.MemorySegment $maxTaskWorkGroupTotalCount() {return this.ptr.asSlice(OFFSET__maxTaskWorkGroupTotalCount, LAYOUT__maxTaskWorkGroupTotalCount);}

    public java.lang.foreign.MemorySegment maxTaskWorkGroupCount() {return this.ptr.asSlice(OFFSET__maxTaskWorkGroupCount, LAYOUT__maxTaskWorkGroupCount);}
    public int maxTaskWorkGroupCount(int index) {return this.maxTaskWorkGroupCount().getAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, index);}
    public void maxTaskWorkGroupCount(int index, int value) {this.maxTaskWorkGroupCount().setAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, index, value);}

    public int maxTaskWorkGroupInvocations() {return this.ptr.get(LAYOUT__maxTaskWorkGroupInvocations, OFFSET__maxTaskWorkGroupInvocations);}
    public void maxTaskWorkGroupInvocations(int value) {this.ptr.set(LAYOUT__maxTaskWorkGroupInvocations, OFFSET__maxTaskWorkGroupInvocations, value);}
    public java.lang.foreign.MemorySegment $maxTaskWorkGroupInvocations() {return this.ptr.asSlice(OFFSET__maxTaskWorkGroupInvocations, LAYOUT__maxTaskWorkGroupInvocations);}

    public java.lang.foreign.MemorySegment maxTaskWorkGroupSize() {return this.ptr.asSlice(OFFSET__maxTaskWorkGroupSize, LAYOUT__maxTaskWorkGroupSize);}
    public int maxTaskWorkGroupSize(int index) {return this.maxTaskWorkGroupSize().getAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, index);}
    public void maxTaskWorkGroupSize(int index, int value) {this.maxTaskWorkGroupSize().setAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, index, value);}

    public int maxTaskPayloadSize() {return this.ptr.get(LAYOUT__maxTaskPayloadSize, OFFSET__maxTaskPayloadSize);}
    public void maxTaskPayloadSize(int value) {this.ptr.set(LAYOUT__maxTaskPayloadSize, OFFSET__maxTaskPayloadSize, value);}
    public java.lang.foreign.MemorySegment $maxTaskPayloadSize() {return this.ptr.asSlice(OFFSET__maxTaskPayloadSize, LAYOUT__maxTaskPayloadSize);}

    public int maxTaskSharedMemorySize() {return this.ptr.get(LAYOUT__maxTaskSharedMemorySize, OFFSET__maxTaskSharedMemorySize);}
    public void maxTaskSharedMemorySize(int value) {this.ptr.set(LAYOUT__maxTaskSharedMemorySize, OFFSET__maxTaskSharedMemorySize, value);}
    public java.lang.foreign.MemorySegment $maxTaskSharedMemorySize() {return this.ptr.asSlice(OFFSET__maxTaskSharedMemorySize, LAYOUT__maxTaskSharedMemorySize);}

    public int maxTaskPayloadAndSharedMemorySize() {return this.ptr.get(LAYOUT__maxTaskPayloadAndSharedMemorySize, OFFSET__maxTaskPayloadAndSharedMemorySize);}
    public void maxTaskPayloadAndSharedMemorySize(int value) {this.ptr.set(LAYOUT__maxTaskPayloadAndSharedMemorySize, OFFSET__maxTaskPayloadAndSharedMemorySize, value);}
    public java.lang.foreign.MemorySegment $maxTaskPayloadAndSharedMemorySize() {return this.ptr.asSlice(OFFSET__maxTaskPayloadAndSharedMemorySize, LAYOUT__maxTaskPayloadAndSharedMemorySize);}

    public int maxMeshWorkGroupTotalCount() {return this.ptr.get(LAYOUT__maxMeshWorkGroupTotalCount, OFFSET__maxMeshWorkGroupTotalCount);}
    public void maxMeshWorkGroupTotalCount(int value) {this.ptr.set(LAYOUT__maxMeshWorkGroupTotalCount, OFFSET__maxMeshWorkGroupTotalCount, value);}
    public java.lang.foreign.MemorySegment $maxMeshWorkGroupTotalCount() {return this.ptr.asSlice(OFFSET__maxMeshWorkGroupTotalCount, LAYOUT__maxMeshWorkGroupTotalCount);}

    public java.lang.foreign.MemorySegment maxMeshWorkGroupCount() {return this.ptr.asSlice(OFFSET__maxMeshWorkGroupCount, LAYOUT__maxMeshWorkGroupCount);}
    public int maxMeshWorkGroupCount(int index) {return this.maxMeshWorkGroupCount().getAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, index);}
    public void maxMeshWorkGroupCount(int index, int value) {this.maxMeshWorkGroupCount().setAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, index, value);}

    public int maxMeshWorkGroupInvocations() {return this.ptr.get(LAYOUT__maxMeshWorkGroupInvocations, OFFSET__maxMeshWorkGroupInvocations);}
    public void maxMeshWorkGroupInvocations(int value) {this.ptr.set(LAYOUT__maxMeshWorkGroupInvocations, OFFSET__maxMeshWorkGroupInvocations, value);}
    public java.lang.foreign.MemorySegment $maxMeshWorkGroupInvocations() {return this.ptr.asSlice(OFFSET__maxMeshWorkGroupInvocations, LAYOUT__maxMeshWorkGroupInvocations);}

    public java.lang.foreign.MemorySegment maxMeshWorkGroupSize() {return this.ptr.asSlice(OFFSET__maxMeshWorkGroupSize, LAYOUT__maxMeshWorkGroupSize);}
    public int maxMeshWorkGroupSize(int index) {return this.maxMeshWorkGroupSize().getAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, index);}
    public void maxMeshWorkGroupSize(int index, int value) {this.maxMeshWorkGroupSize().setAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, index, value);}

    public int maxMeshSharedMemorySize() {return this.ptr.get(LAYOUT__maxMeshSharedMemorySize, OFFSET__maxMeshSharedMemorySize);}
    public void maxMeshSharedMemorySize(int value) {this.ptr.set(LAYOUT__maxMeshSharedMemorySize, OFFSET__maxMeshSharedMemorySize, value);}
    public java.lang.foreign.MemorySegment $maxMeshSharedMemorySize() {return this.ptr.asSlice(OFFSET__maxMeshSharedMemorySize, LAYOUT__maxMeshSharedMemorySize);}

    public int maxMeshPayloadAndSharedMemorySize() {return this.ptr.get(LAYOUT__maxMeshPayloadAndSharedMemorySize, OFFSET__maxMeshPayloadAndSharedMemorySize);}
    public void maxMeshPayloadAndSharedMemorySize(int value) {this.ptr.set(LAYOUT__maxMeshPayloadAndSharedMemorySize, OFFSET__maxMeshPayloadAndSharedMemorySize, value);}
    public java.lang.foreign.MemorySegment $maxMeshPayloadAndSharedMemorySize() {return this.ptr.asSlice(OFFSET__maxMeshPayloadAndSharedMemorySize, LAYOUT__maxMeshPayloadAndSharedMemorySize);}

    public int maxMeshOutputMemorySize() {return this.ptr.get(LAYOUT__maxMeshOutputMemorySize, OFFSET__maxMeshOutputMemorySize);}
    public void maxMeshOutputMemorySize(int value) {this.ptr.set(LAYOUT__maxMeshOutputMemorySize, OFFSET__maxMeshOutputMemorySize, value);}
    public java.lang.foreign.MemorySegment $maxMeshOutputMemorySize() {return this.ptr.asSlice(OFFSET__maxMeshOutputMemorySize, LAYOUT__maxMeshOutputMemorySize);}

    public int maxMeshPayloadAndOutputMemorySize() {return this.ptr.get(LAYOUT__maxMeshPayloadAndOutputMemorySize, OFFSET__maxMeshPayloadAndOutputMemorySize);}
    public void maxMeshPayloadAndOutputMemorySize(int value) {this.ptr.set(LAYOUT__maxMeshPayloadAndOutputMemorySize, OFFSET__maxMeshPayloadAndOutputMemorySize, value);}
    public java.lang.foreign.MemorySegment $maxMeshPayloadAndOutputMemorySize() {return this.ptr.asSlice(OFFSET__maxMeshPayloadAndOutputMemorySize, LAYOUT__maxMeshPayloadAndOutputMemorySize);}

    public int maxMeshOutputComponents() {return this.ptr.get(LAYOUT__maxMeshOutputComponents, OFFSET__maxMeshOutputComponents);}
    public void maxMeshOutputComponents(int value) {this.ptr.set(LAYOUT__maxMeshOutputComponents, OFFSET__maxMeshOutputComponents, value);}
    public java.lang.foreign.MemorySegment $maxMeshOutputComponents() {return this.ptr.asSlice(OFFSET__maxMeshOutputComponents, LAYOUT__maxMeshOutputComponents);}

    public int maxMeshOutputVertices() {return this.ptr.get(LAYOUT__maxMeshOutputVertices, OFFSET__maxMeshOutputVertices);}
    public void maxMeshOutputVertices(int value) {this.ptr.set(LAYOUT__maxMeshOutputVertices, OFFSET__maxMeshOutputVertices, value);}
    public java.lang.foreign.MemorySegment $maxMeshOutputVertices() {return this.ptr.asSlice(OFFSET__maxMeshOutputVertices, LAYOUT__maxMeshOutputVertices);}

    public int maxMeshOutputPrimitives() {return this.ptr.get(LAYOUT__maxMeshOutputPrimitives, OFFSET__maxMeshOutputPrimitives);}
    public void maxMeshOutputPrimitives(int value) {this.ptr.set(LAYOUT__maxMeshOutputPrimitives, OFFSET__maxMeshOutputPrimitives, value);}
    public java.lang.foreign.MemorySegment $maxMeshOutputPrimitives() {return this.ptr.asSlice(OFFSET__maxMeshOutputPrimitives, LAYOUT__maxMeshOutputPrimitives);}

    public int maxMeshOutputLayers() {return this.ptr.get(LAYOUT__maxMeshOutputLayers, OFFSET__maxMeshOutputLayers);}
    public void maxMeshOutputLayers(int value) {this.ptr.set(LAYOUT__maxMeshOutputLayers, OFFSET__maxMeshOutputLayers, value);}
    public java.lang.foreign.MemorySegment $maxMeshOutputLayers() {return this.ptr.asSlice(OFFSET__maxMeshOutputLayers, LAYOUT__maxMeshOutputLayers);}

    public int maxMeshMultiviewViewCount() {return this.ptr.get(LAYOUT__maxMeshMultiviewViewCount, OFFSET__maxMeshMultiviewViewCount);}
    public void maxMeshMultiviewViewCount(int value) {this.ptr.set(LAYOUT__maxMeshMultiviewViewCount, OFFSET__maxMeshMultiviewViewCount, value);}
    public java.lang.foreign.MemorySegment $maxMeshMultiviewViewCount() {return this.ptr.asSlice(OFFSET__maxMeshMultiviewViewCount, LAYOUT__maxMeshMultiviewViewCount);}

    public int meshOutputPerVertexGranularity() {return this.ptr.get(LAYOUT__meshOutputPerVertexGranularity, OFFSET__meshOutputPerVertexGranularity);}
    public void meshOutputPerVertexGranularity(int value) {this.ptr.set(LAYOUT__meshOutputPerVertexGranularity, OFFSET__meshOutputPerVertexGranularity, value);}
    public java.lang.foreign.MemorySegment $meshOutputPerVertexGranularity() {return this.ptr.asSlice(OFFSET__meshOutputPerVertexGranularity, LAYOUT__meshOutputPerVertexGranularity);}

    public int meshOutputPerPrimitiveGranularity() {return this.ptr.get(LAYOUT__meshOutputPerPrimitiveGranularity, OFFSET__meshOutputPerPrimitiveGranularity);}
    public void meshOutputPerPrimitiveGranularity(int value) {this.ptr.set(LAYOUT__meshOutputPerPrimitiveGranularity, OFFSET__meshOutputPerPrimitiveGranularity, value);}
    public java.lang.foreign.MemorySegment $meshOutputPerPrimitiveGranularity() {return this.ptr.asSlice(OFFSET__meshOutputPerPrimitiveGranularity, LAYOUT__meshOutputPerPrimitiveGranularity);}

    public int maxPreferredTaskWorkGroupInvocations() {return this.ptr.get(LAYOUT__maxPreferredTaskWorkGroupInvocations, OFFSET__maxPreferredTaskWorkGroupInvocations);}
    public void maxPreferredTaskWorkGroupInvocations(int value) {this.ptr.set(LAYOUT__maxPreferredTaskWorkGroupInvocations, OFFSET__maxPreferredTaskWorkGroupInvocations, value);}
    public java.lang.foreign.MemorySegment $maxPreferredTaskWorkGroupInvocations() {return this.ptr.asSlice(OFFSET__maxPreferredTaskWorkGroupInvocations, LAYOUT__maxPreferredTaskWorkGroupInvocations);}

    public int maxPreferredMeshWorkGroupInvocations() {return this.ptr.get(LAYOUT__maxPreferredMeshWorkGroupInvocations, OFFSET__maxPreferredMeshWorkGroupInvocations);}
    public void maxPreferredMeshWorkGroupInvocations(int value) {this.ptr.set(LAYOUT__maxPreferredMeshWorkGroupInvocations, OFFSET__maxPreferredMeshWorkGroupInvocations, value);}
    public java.lang.foreign.MemorySegment $maxPreferredMeshWorkGroupInvocations() {return this.ptr.asSlice(OFFSET__maxPreferredMeshWorkGroupInvocations, LAYOUT__maxPreferredMeshWorkGroupInvocations);}

    public int prefersLocalInvocationVertexOutput() {return this.ptr.get(LAYOUT__prefersLocalInvocationVertexOutput, OFFSET__prefersLocalInvocationVertexOutput);}
    public void prefersLocalInvocationVertexOutput(int value) {this.ptr.set(LAYOUT__prefersLocalInvocationVertexOutput, OFFSET__prefersLocalInvocationVertexOutput, value);}
    public java.lang.foreign.MemorySegment $prefersLocalInvocationVertexOutput() {return this.ptr.asSlice(OFFSET__prefersLocalInvocationVertexOutput, LAYOUT__prefersLocalInvocationVertexOutput);}

    public int prefersLocalInvocationPrimitiveOutput() {return this.ptr.get(LAYOUT__prefersLocalInvocationPrimitiveOutput, OFFSET__prefersLocalInvocationPrimitiveOutput);}
    public void prefersLocalInvocationPrimitiveOutput(int value) {this.ptr.set(LAYOUT__prefersLocalInvocationPrimitiveOutput, OFFSET__prefersLocalInvocationPrimitiveOutput, value);}
    public java.lang.foreign.MemorySegment $prefersLocalInvocationPrimitiveOutput() {return this.ptr.asSlice(OFFSET__prefersLocalInvocationPrimitiveOutput, LAYOUT__prefersLocalInvocationPrimitiveOutput);}

    public int prefersCompactVertexOutput() {return this.ptr.get(LAYOUT__prefersCompactVertexOutput, OFFSET__prefersCompactVertexOutput);}
    public void prefersCompactVertexOutput(int value) {this.ptr.set(LAYOUT__prefersCompactVertexOutput, OFFSET__prefersCompactVertexOutput, value);}
    public java.lang.foreign.MemorySegment $prefersCompactVertexOutput() {return this.ptr.asSlice(OFFSET__prefersCompactVertexOutput, LAYOUT__prefersCompactVertexOutput);}

    public int prefersCompactPrimitiveOutput() {return this.ptr.get(LAYOUT__prefersCompactPrimitiveOutput, OFFSET__prefersCompactPrimitiveOutput);}
    public void prefersCompactPrimitiveOutput(int value) {this.ptr.set(LAYOUT__prefersCompactPrimitiveOutput, OFFSET__prefersCompactPrimitiveOutput, value);}
    public java.lang.foreign.MemorySegment $prefersCompactPrimitiveOutput() {return this.ptr.asSlice(OFFSET__prefersCompactPrimitiveOutput, LAYOUT__prefersCompactPrimitiveOutput);}
}
