package vulkan;

public record VkAccelerationStructureGeometryInstancesDataKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__arrayOfPointers = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__arrayOfPointers = 16;
    public static final java.lang.foreign.UnionLayout LAYOUT__data = vulkan.VkDeviceOrHostAddressConstKHR.gRecordLayout;
    public static final long OFFSET__data = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__arrayOfPointers,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__data
    ).withByteAlignment(8).withName("VkAccelerationStructureGeometryInstancesDataKHR");

    public VkAccelerationStructureGeometryInstancesDataKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkAccelerationStructureGeometryInstancesDataKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkAccelerationStructureGeometryInstancesDataKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkAccelerationStructureGeometryInstancesDataKHR value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int arrayOfPointers() {return this.ptr.get(LAYOUT__arrayOfPointers, OFFSET__arrayOfPointers);}
    public void arrayOfPointers(int value) {this.ptr.set(LAYOUT__arrayOfPointers, OFFSET__arrayOfPointers, value);}
    public java.lang.foreign.MemorySegment $arrayOfPointers() {return this.ptr.asSlice(OFFSET__arrayOfPointers, LAYOUT__arrayOfPointers);}

    public vulkan.VkDeviceOrHostAddressConstKHR data() {return new vulkan.VkDeviceOrHostAddressConstKHR(this.ptr.asSlice(OFFSET__data, LAYOUT__data));}
    public void data(java.util.function.Consumer<vulkan.VkDeviceOrHostAddressConstKHR> consumer) {consumer.accept(this.data());}
    public void data(vulkan.VkDeviceOrHostAddressConstKHR value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__data, LAYOUT__data.byteSize());}
}
