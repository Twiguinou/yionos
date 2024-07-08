package vulkan;

public record VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.SequenceLayout LAYOUT__shaderModuleIdentifierAlgorithmUUID = java.lang.foreign.MemoryLayout.sequenceLayout(16, java.lang.foreign.ValueLayout.JAVA_BYTE).withName("shaderModuleIdentifierAlgorithmUUID");
    public static final long OFFSET__shaderModuleIdentifierAlgorithmUUID = 16;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__shaderModuleIdentifierAlgorithmUUID
    ).withByteAlignment(8).withName("VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT");

    public VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public java.lang.foreign.MemorySegment shaderModuleIdentifierAlgorithmUUID() {return this.ptr.asSlice(OFFSET__shaderModuleIdentifierAlgorithmUUID, LAYOUT__shaderModuleIdentifierAlgorithmUUID);}
    public byte shaderModuleIdentifierAlgorithmUUID(int index) {return this.shaderModuleIdentifierAlgorithmUUID().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index);}
    public void shaderModuleIdentifierAlgorithmUUID(int index, byte value) {this.shaderModuleIdentifierAlgorithmUUID().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index, value);}
}
