package vulkan;

public record VkPhysicalDeviceRobustness2FeaturesEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__robustBufferAccess2 = java.lang.foreign.ValueLayout.JAVA_INT.withName("robustBufferAccess2");
    public static final long OFFSET__robustBufferAccess2 = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__robustImageAccess2 = java.lang.foreign.ValueLayout.JAVA_INT.withName("robustImageAccess2");
    public static final long OFFSET__robustImageAccess2 = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__nullDescriptor = java.lang.foreign.ValueLayout.JAVA_INT.withName("nullDescriptor");
    public static final long OFFSET__nullDescriptor = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__robustBufferAccess2,
            LAYOUT__robustImageAccess2,
            LAYOUT__nullDescriptor,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkPhysicalDeviceRobustness2FeaturesEXT");

    public VkPhysicalDeviceRobustness2FeaturesEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceRobustness2FeaturesEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceRobustness2FeaturesEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceRobustness2FeaturesEXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int robustBufferAccess2() {return this.ptr.get(LAYOUT__robustBufferAccess2, OFFSET__robustBufferAccess2);}
    public void robustBufferAccess2(int value) {this.ptr.set(LAYOUT__robustBufferAccess2, OFFSET__robustBufferAccess2, value);}
    public java.lang.foreign.MemorySegment $robustBufferAccess2() {return this.ptr.asSlice(OFFSET__robustBufferAccess2, LAYOUT__robustBufferAccess2);}

    public int robustImageAccess2() {return this.ptr.get(LAYOUT__robustImageAccess2, OFFSET__robustImageAccess2);}
    public void robustImageAccess2(int value) {this.ptr.set(LAYOUT__robustImageAccess2, OFFSET__robustImageAccess2, value);}
    public java.lang.foreign.MemorySegment $robustImageAccess2() {return this.ptr.asSlice(OFFSET__robustImageAccess2, LAYOUT__robustImageAccess2);}

    public int nullDescriptor() {return this.ptr.get(LAYOUT__nullDescriptor, OFFSET__nullDescriptor);}
    public void nullDescriptor(int value) {this.ptr.set(LAYOUT__nullDescriptor, OFFSET__nullDescriptor, value);}
    public java.lang.foreign.MemorySegment $nullDescriptor() {return this.ptr.asSlice(OFFSET__nullDescriptor, LAYOUT__nullDescriptor);}
}
