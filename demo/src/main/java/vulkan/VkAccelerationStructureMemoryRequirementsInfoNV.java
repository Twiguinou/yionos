package vulkan;

public record VkAccelerationStructureMemoryRequirementsInfoNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$type = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$type = 16L;
    public static final java.lang.foreign.AddressLayout LAYOUT$accelerationStructure = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$accelerationStructure = 24L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$type,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$accelerationStructure
    ).withName("VkAccelerationStructureMemoryRequirementsInfoNV");

    public VkAccelerationStructureMemoryRequirementsInfoNV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VkAccelerationStructureMemoryRequirementsInfoNV getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VkAccelerationStructureMemoryRequirementsInfoNV(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int type() {return this.ptr.get(LAYOUT$type, OFFSET$type);}
    public void type(int value) {this.ptr.set(LAYOUT$type, OFFSET$type, value);}
    public java.lang.foreign.MemorySegment type_ptr() {return this.ptr.asSlice(OFFSET$type, LAYOUT$type);}

    public java.lang.foreign.MemorySegment accelerationStructure() {return this.ptr.get(LAYOUT$accelerationStructure, OFFSET$accelerationStructure);}
    public void accelerationStructure(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$accelerationStructure, OFFSET$accelerationStructure, value);}
    public java.lang.foreign.MemorySegment accelerationStructure_ptr() {return this.ptr.asSlice(OFFSET$accelerationStructure, LAYOUT$accelerationStructure);}
}
