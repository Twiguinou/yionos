package vulkan;

public record VkPhysicalDeviceFaultFeaturesEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__deviceFault = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__deviceFault = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__deviceFaultVendorBinary = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__deviceFaultVendorBinary = 20;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__deviceFault,
            LAYOUT__deviceFaultVendorBinary
    ).withByteAlignment(8).withName("VkPhysicalDeviceFaultFeaturesEXT");

    public VkPhysicalDeviceFaultFeaturesEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceFaultFeaturesEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceFaultFeaturesEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceFaultFeaturesEXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int deviceFault() {return this.ptr.get(LAYOUT__deviceFault, OFFSET__deviceFault);}
    public void deviceFault(int value) {this.ptr.set(LAYOUT__deviceFault, OFFSET__deviceFault, value);}
    public java.lang.foreign.MemorySegment $deviceFault() {return this.ptr.asSlice(OFFSET__deviceFault, LAYOUT__deviceFault);}

    public int deviceFaultVendorBinary() {return this.ptr.get(LAYOUT__deviceFaultVendorBinary, OFFSET__deviceFaultVendorBinary);}
    public void deviceFaultVendorBinary(int value) {this.ptr.set(LAYOUT__deviceFaultVendorBinary, OFFSET__deviceFaultVendorBinary, value);}
    public java.lang.foreign.MemorySegment $deviceFaultVendorBinary() {return this.ptr.asSlice(OFFSET__deviceFaultVendorBinary, LAYOUT__deviceFaultVendorBinary);}
}
