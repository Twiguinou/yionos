package vulkan;

public record VkWriteDescriptorSetAccelerationStructureKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__accelerationStructureCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__accelerationStructureCount = 16;
    public static final java.lang.foreign.AddressLayout LAYOUT__pAccelerationStructures = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pAccelerationStructures = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__accelerationStructureCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pAccelerationStructures
    ).withByteAlignment(8).withName("VkWriteDescriptorSetAccelerationStructureKHR");

    public VkWriteDescriptorSetAccelerationStructureKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkWriteDescriptorSetAccelerationStructureKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkWriteDescriptorSetAccelerationStructureKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkWriteDescriptorSetAccelerationStructureKHR value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int accelerationStructureCount() {return this.ptr.get(LAYOUT__accelerationStructureCount, OFFSET__accelerationStructureCount);}
    public void accelerationStructureCount(int value) {this.ptr.set(LAYOUT__accelerationStructureCount, OFFSET__accelerationStructureCount, value);}
    public java.lang.foreign.MemorySegment $accelerationStructureCount() {return this.ptr.asSlice(OFFSET__accelerationStructureCount, LAYOUT__accelerationStructureCount);}

    public java.lang.foreign.MemorySegment pAccelerationStructures() {return this.ptr.get(LAYOUT__pAccelerationStructures, OFFSET__pAccelerationStructures);}
    public void pAccelerationStructures(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pAccelerationStructures, OFFSET__pAccelerationStructures, value);}
    public java.lang.foreign.MemorySegment $pAccelerationStructures() {return this.ptr.asSlice(OFFSET__pAccelerationStructures, LAYOUT__pAccelerationStructures);}
}
