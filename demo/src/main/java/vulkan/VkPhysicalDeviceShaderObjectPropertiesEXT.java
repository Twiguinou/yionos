package vulkan;

public record VkPhysicalDeviceShaderObjectPropertiesEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.SequenceLayout LAYOUT__shaderBinaryUUID = java.lang.foreign.MemoryLayout.sequenceLayout(16, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET__shaderBinaryUUID = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderBinaryVersion = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__shaderBinaryVersion = 32;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__shaderBinaryUUID,
            LAYOUT__shaderBinaryVersion,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkPhysicalDeviceShaderObjectPropertiesEXT");

    public VkPhysicalDeviceShaderObjectPropertiesEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceShaderObjectPropertiesEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceShaderObjectPropertiesEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceShaderObjectPropertiesEXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public java.lang.foreign.MemorySegment shaderBinaryUUID() {return this.ptr.asSlice(OFFSET__shaderBinaryUUID, LAYOUT__shaderBinaryUUID);}
    public byte shaderBinaryUUID(int index) {return this.shaderBinaryUUID().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index);}
    public void shaderBinaryUUID(int index, byte value) {this.shaderBinaryUUID().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index, value);}

    public int shaderBinaryVersion() {return this.ptr.get(LAYOUT__shaderBinaryVersion, OFFSET__shaderBinaryVersion);}
    public void shaderBinaryVersion(int value) {this.ptr.set(LAYOUT__shaderBinaryVersion, OFFSET__shaderBinaryVersion, value);}
    public java.lang.foreign.MemorySegment $shaderBinaryVersion() {return this.ptr.asSlice(OFFSET__shaderBinaryVersion, LAYOUT__shaderBinaryVersion);}
}
