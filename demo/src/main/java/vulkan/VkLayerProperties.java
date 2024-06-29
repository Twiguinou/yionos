package vulkan;

public record VkLayerProperties(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.SequenceLayout LAYOUT__layerName = java.lang.foreign.MemoryLayout.sequenceLayout(256, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET__layerName = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__specVersion = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__specVersion = 256;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__implementationVersion = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__implementationVersion = 260;
    public static final java.lang.foreign.SequenceLayout LAYOUT__description = java.lang.foreign.MemoryLayout.sequenceLayout(256, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET__description = 264;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__layerName,
            LAYOUT__specVersion,
            LAYOUT__implementationVersion,
            LAYOUT__description
    ).withByteAlignment(4).withName("VkLayerProperties");

    public VkLayerProperties(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkLayerProperties getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkLayerProperties(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkLayerProperties value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public java.lang.foreign.MemorySegment layerName() {return this.ptr.asSlice(OFFSET__layerName, LAYOUT__layerName);}
    public byte layerName(int index) {return this.layerName().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index);}
    public void layerName(int index, byte value) {this.layerName().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index, value);}

    public int specVersion() {return this.ptr.get(LAYOUT__specVersion, OFFSET__specVersion);}
    public void specVersion(int value) {this.ptr.set(LAYOUT__specVersion, OFFSET__specVersion, value);}
    public java.lang.foreign.MemorySegment $specVersion() {return this.ptr.asSlice(OFFSET__specVersion, LAYOUT__specVersion);}

    public int implementationVersion() {return this.ptr.get(LAYOUT__implementationVersion, OFFSET__implementationVersion);}
    public void implementationVersion(int value) {this.ptr.set(LAYOUT__implementationVersion, OFFSET__implementationVersion, value);}
    public java.lang.foreign.MemorySegment $implementationVersion() {return this.ptr.asSlice(OFFSET__implementationVersion, LAYOUT__implementationVersion);}

    public java.lang.foreign.MemorySegment description() {return this.ptr.asSlice(OFFSET__description, LAYOUT__description);}
    public byte description(int index) {return this.description().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index);}
    public void description(int index, byte value) {this.description().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index, value);}
}
