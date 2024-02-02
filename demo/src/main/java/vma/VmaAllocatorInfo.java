package vma;

public record VmaAllocatorInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.AddressLayout LAYOUT$instance = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$instance = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$physicalDevice = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$physicalDevice = 8L;
    public static final java.lang.foreign.AddressLayout LAYOUT$device = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$device = 16L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$instance,
            LAYOUT$physicalDevice,
            LAYOUT$device
    ).withName("VmaAllocatorInfo");

    public VmaAllocatorInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VmaAllocatorInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VmaAllocatorInfo(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public java.lang.foreign.MemorySegment instance() {return this.ptr.get(LAYOUT$instance, OFFSET$instance);}
    public void instance(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$instance, OFFSET$instance, value);}
    public java.lang.foreign.MemorySegment instance_ptr() {return this.ptr.asSlice(OFFSET$instance, LAYOUT$instance);}

    public java.lang.foreign.MemorySegment physicalDevice() {return this.ptr.get(LAYOUT$physicalDevice, OFFSET$physicalDevice);}
    public void physicalDevice(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$physicalDevice, OFFSET$physicalDevice, value);}
    public java.lang.foreign.MemorySegment physicalDevice_ptr() {return this.ptr.asSlice(OFFSET$physicalDevice, LAYOUT$physicalDevice);}

    public java.lang.foreign.MemorySegment device() {return this.ptr.get(LAYOUT$device, OFFSET$device);}
    public void device(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$device, OFFSET$device, value);}
    public java.lang.foreign.MemorySegment device_ptr() {return this.ptr.asSlice(OFFSET$device, LAYOUT$device);}
}
