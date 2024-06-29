package vulkan;

public record VkPhysicalDevicePCIBusInfoPropertiesEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__pciDomain = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__pciDomain = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__pciBus = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__pciBus = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__pciDevice = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__pciDevice = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__pciFunction = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__pciFunction = 28;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__pciDomain,
            LAYOUT__pciBus,
            LAYOUT__pciDevice,
            LAYOUT__pciFunction
    ).withByteAlignment(8).withName("VkPhysicalDevicePCIBusInfoPropertiesEXT");

    public VkPhysicalDevicePCIBusInfoPropertiesEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDevicePCIBusInfoPropertiesEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDevicePCIBusInfoPropertiesEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDevicePCIBusInfoPropertiesEXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int pciDomain() {return this.ptr.get(LAYOUT__pciDomain, OFFSET__pciDomain);}
    public void pciDomain(int value) {this.ptr.set(LAYOUT__pciDomain, OFFSET__pciDomain, value);}
    public java.lang.foreign.MemorySegment $pciDomain() {return this.ptr.asSlice(OFFSET__pciDomain, LAYOUT__pciDomain);}

    public int pciBus() {return this.ptr.get(LAYOUT__pciBus, OFFSET__pciBus);}
    public void pciBus(int value) {this.ptr.set(LAYOUT__pciBus, OFFSET__pciBus, value);}
    public java.lang.foreign.MemorySegment $pciBus() {return this.ptr.asSlice(OFFSET__pciBus, LAYOUT__pciBus);}

    public int pciDevice() {return this.ptr.get(LAYOUT__pciDevice, OFFSET__pciDevice);}
    public void pciDevice(int value) {this.ptr.set(LAYOUT__pciDevice, OFFSET__pciDevice, value);}
    public java.lang.foreign.MemorySegment $pciDevice() {return this.ptr.asSlice(OFFSET__pciDevice, LAYOUT__pciDevice);}

    public int pciFunction() {return this.ptr.get(LAYOUT__pciFunction, OFFSET__pciFunction);}
    public void pciFunction(int value) {this.ptr.set(LAYOUT__pciFunction, OFFSET__pciFunction, value);}
    public java.lang.foreign.MemorySegment $pciFunction() {return this.ptr.asSlice(OFFSET__pciFunction, LAYOUT__pciFunction);}
}
