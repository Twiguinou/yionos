package vma;

public record VmaAllocatorInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.AddressLayout LAYOUT__instance = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("instance");
    public static final long OFFSET__instance = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__physicalDevice = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("physicalDevice");
    public static final long OFFSET__physicalDevice = 8;
    public static final java.lang.foreign.AddressLayout LAYOUT__device = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("device");
    public static final long OFFSET__device = 16;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__instance,
            LAYOUT__physicalDevice,
            LAYOUT__device
    ).withByteAlignment(8).withName("VmaAllocatorInfo");

    public VmaAllocatorInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VmaAllocatorInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VmaAllocatorInfo(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VmaAllocatorInfo value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public java.lang.foreign.MemorySegment instance() {return this.ptr.get(LAYOUT__instance, OFFSET__instance);}
    public void instance(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__instance, OFFSET__instance, value);}
    public java.lang.foreign.MemorySegment $instance() {return this.ptr.asSlice(OFFSET__instance, LAYOUT__instance);}

    public java.lang.foreign.MemorySegment physicalDevice() {return this.ptr.get(LAYOUT__physicalDevice, OFFSET__physicalDevice);}
    public void physicalDevice(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__physicalDevice, OFFSET__physicalDevice, value);}
    public java.lang.foreign.MemorySegment $physicalDevice() {return this.ptr.asSlice(OFFSET__physicalDevice, LAYOUT__physicalDevice);}

    public java.lang.foreign.MemorySegment device() {return this.ptr.get(LAYOUT__device, OFFSET__device);}
    public void device(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__device, OFFSET__device, value);}
    public java.lang.foreign.MemorySegment $device() {return this.ptr.asSlice(OFFSET__device, LAYOUT__device);}
}
