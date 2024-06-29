package vulkan;

public record VkAccelerationStructureCaptureDescriptorDataInfoEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.AddressLayout LAYOUT__accelerationStructure = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__accelerationStructure = 16;
    public static final java.lang.foreign.AddressLayout LAYOUT__accelerationStructureNV = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__accelerationStructureNV = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__accelerationStructure,
            LAYOUT__accelerationStructureNV
    ).withByteAlignment(8).withName("VkAccelerationStructureCaptureDescriptorDataInfoEXT");

    public VkAccelerationStructureCaptureDescriptorDataInfoEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkAccelerationStructureCaptureDescriptorDataInfoEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkAccelerationStructureCaptureDescriptorDataInfoEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkAccelerationStructureCaptureDescriptorDataInfoEXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public java.lang.foreign.MemorySegment accelerationStructure() {return this.ptr.get(LAYOUT__accelerationStructure, OFFSET__accelerationStructure);}
    public void accelerationStructure(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__accelerationStructure, OFFSET__accelerationStructure, value);}
    public java.lang.foreign.MemorySegment $accelerationStructure() {return this.ptr.asSlice(OFFSET__accelerationStructure, LAYOUT__accelerationStructure);}

    public java.lang.foreign.MemorySegment accelerationStructureNV() {return this.ptr.get(LAYOUT__accelerationStructureNV, OFFSET__accelerationStructureNV);}
    public void accelerationStructureNV(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__accelerationStructureNV, OFFSET__accelerationStructureNV, value);}
    public java.lang.foreign.MemorySegment $accelerationStructureNV() {return this.ptr.asSlice(OFFSET__accelerationStructureNV, LAYOUT__accelerationStructureNV);}
}
