package vulkan;

public record VkPhysicalDeviceShaderObjectPropertiesEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.SequenceLayout LAYOUT$shaderBinaryUUID = java.lang.foreign.MemoryLayout.sequenceLayout(16, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET$shaderBinaryUUID = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderBinaryVersion = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$shaderBinaryVersion = 32L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$shaderBinaryUUID,
            LAYOUT$shaderBinaryVersion,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("VkPhysicalDeviceShaderObjectPropertiesEXT");

    public VkPhysicalDeviceShaderObjectPropertiesEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VkPhysicalDeviceShaderObjectPropertiesEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VkPhysicalDeviceShaderObjectPropertiesEXT(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public java.lang.foreign.MemorySegment shaderBinaryUUID() {return this.ptr.asSlice(OFFSET$shaderBinaryUUID, LAYOUT$shaderBinaryUUID);}
    public char shaderBinaryUUID(int i) {return (char)this.shaderBinaryUUID().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i);}
    public void shaderBinaryUUID(int i, char value) {this.shaderBinaryUUID().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i, (byte)value);}

    public int shaderBinaryVersion() {return this.ptr.get(LAYOUT$shaderBinaryVersion, OFFSET$shaderBinaryVersion);}
    public void shaderBinaryVersion(int value) {this.ptr.set(LAYOUT$shaderBinaryVersion, OFFSET$shaderBinaryVersion, value);}
    public java.lang.foreign.MemorySegment shaderBinaryVersion_ptr() {return this.ptr.asSlice(OFFSET$shaderBinaryVersion, LAYOUT$shaderBinaryVersion);}
}
