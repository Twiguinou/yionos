package vulkan;

public record VkExtensionProperties(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.SequenceLayout LAYOUT__extensionName = java.lang.foreign.MemoryLayout.sequenceLayout(256, java.lang.foreign.ValueLayout.JAVA_BYTE).withName("extensionName");
    public static final long OFFSET__extensionName = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__specVersion = java.lang.foreign.ValueLayout.JAVA_INT.withName("specVersion");
    public static final long OFFSET__specVersion = 256;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__extensionName,
            LAYOUT__specVersion
    ).withByteAlignment(4).withName("VkExtensionProperties");

    public VkExtensionProperties(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkExtensionProperties getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkExtensionProperties(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkExtensionProperties value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public java.lang.foreign.MemorySegment extensionName() {return this.ptr.asSlice(OFFSET__extensionName, LAYOUT__extensionName);}
    public byte extensionName(int index) {return this.extensionName().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index);}
    public void extensionName(int index, byte value) {this.extensionName().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index, value);}

    public int specVersion() {return this.ptr.get(LAYOUT__specVersion, OFFSET__specVersion);}
    public void specVersion(int value) {this.ptr.set(LAYOUT__specVersion, OFFSET__specVersion, value);}
    public java.lang.foreign.MemorySegment $specVersion() {return this.ptr.asSlice(OFFSET__specVersion, LAYOUT__specVersion);}
}
