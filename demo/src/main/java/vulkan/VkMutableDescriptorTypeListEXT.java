package vulkan;

public record VkMutableDescriptorTypeListEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__descriptorTypeCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("descriptorTypeCount");
    public static final long OFFSET__descriptorTypeCount = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pDescriptorTypes = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pDescriptorTypes");
    public static final long OFFSET__pDescriptorTypes = 8;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__descriptorTypeCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pDescriptorTypes
    ).withByteAlignment(8).withName("VkMutableDescriptorTypeListEXT");

    public VkMutableDescriptorTypeListEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkMutableDescriptorTypeListEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkMutableDescriptorTypeListEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkMutableDescriptorTypeListEXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int descriptorTypeCount() {return this.ptr.get(LAYOUT__descriptorTypeCount, OFFSET__descriptorTypeCount);}
    public void descriptorTypeCount(int value) {this.ptr.set(LAYOUT__descriptorTypeCount, OFFSET__descriptorTypeCount, value);}
    public java.lang.foreign.MemorySegment $descriptorTypeCount() {return this.ptr.asSlice(OFFSET__descriptorTypeCount, LAYOUT__descriptorTypeCount);}

    public java.lang.foreign.MemorySegment pDescriptorTypes() {return this.ptr.get(LAYOUT__pDescriptorTypes, OFFSET__pDescriptorTypes);}
    public void pDescriptorTypes(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pDescriptorTypes, OFFSET__pDescriptorTypes, value);}
    public java.lang.foreign.MemorySegment $pDescriptorTypes() {return this.ptr.asSlice(OFFSET__pDescriptorTypes, LAYOUT__pDescriptorTypes);}
}
