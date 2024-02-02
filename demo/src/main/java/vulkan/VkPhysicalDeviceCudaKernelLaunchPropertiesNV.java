package vulkan;

public record VkPhysicalDeviceCudaKernelLaunchPropertiesNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$computeCapabilityMinor = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$computeCapabilityMinor = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$computeCapabilityMajor = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$computeCapabilityMajor = 20L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$computeCapabilityMinor,
            LAYOUT$computeCapabilityMajor
    ).withName("VkPhysicalDeviceCudaKernelLaunchPropertiesNV");

    public VkPhysicalDeviceCudaKernelLaunchPropertiesNV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VkPhysicalDeviceCudaKernelLaunchPropertiesNV getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VkPhysicalDeviceCudaKernelLaunchPropertiesNV(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int computeCapabilityMinor() {return this.ptr.get(LAYOUT$computeCapabilityMinor, OFFSET$computeCapabilityMinor);}
    public void computeCapabilityMinor(int value) {this.ptr.set(LAYOUT$computeCapabilityMinor, OFFSET$computeCapabilityMinor, value);}
    public java.lang.foreign.MemorySegment computeCapabilityMinor_ptr() {return this.ptr.asSlice(OFFSET$computeCapabilityMinor, LAYOUT$computeCapabilityMinor);}

    public int computeCapabilityMajor() {return this.ptr.get(LAYOUT$computeCapabilityMajor, OFFSET$computeCapabilityMajor);}
    public void computeCapabilityMajor(int value) {this.ptr.set(LAYOUT$computeCapabilityMajor, OFFSET$computeCapabilityMajor, value);}
    public java.lang.foreign.MemorySegment computeCapabilityMajor_ptr() {return this.ptr.asSlice(OFFSET$computeCapabilityMajor, LAYOUT$computeCapabilityMajor);}
}
