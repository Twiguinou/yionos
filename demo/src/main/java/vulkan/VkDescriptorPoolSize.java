package vulkan;

public record VkDescriptorPoolSize(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__type = java.lang.foreign.ValueLayout.JAVA_INT.withName("type");
    public static final long OFFSET__type = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__descriptorCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("descriptorCount");
    public static final long OFFSET__descriptorCount = 4;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__type,
            LAYOUT__descriptorCount
    ).withByteAlignment(4).withName("VkDescriptorPoolSize");

    public VkDescriptorPoolSize(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkDescriptorPoolSize getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkDescriptorPoolSize(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkDescriptorPoolSize value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int type() {return this.ptr.get(LAYOUT__type, OFFSET__type);}
    public void type(int value) {this.ptr.set(LAYOUT__type, OFFSET__type, value);}
    public java.lang.foreign.MemorySegment $type() {return this.ptr.asSlice(OFFSET__type, LAYOUT__type);}

    public int descriptorCount() {return this.ptr.get(LAYOUT__descriptorCount, OFFSET__descriptorCount);}
    public void descriptorCount(int value) {this.ptr.set(LAYOUT__descriptorCount, OFFSET__descriptorCount, value);}
    public java.lang.foreign.MemorySegment $descriptorCount() {return this.ptr.asSlice(OFFSET__descriptorCount, LAYOUT__descriptorCount);}
}
