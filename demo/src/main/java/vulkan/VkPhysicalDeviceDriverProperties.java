package vulkan;

public record VkPhysicalDeviceDriverProperties(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__driverID = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__driverID = 16;
    public static final java.lang.foreign.SequenceLayout LAYOUT__driverName = java.lang.foreign.MemoryLayout.sequenceLayout(256, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET__driverName = 20;
    public static final java.lang.foreign.SequenceLayout LAYOUT__driverInfo = java.lang.foreign.MemoryLayout.sequenceLayout(256, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET__driverInfo = 276;
    public static final java.lang.foreign.StructLayout LAYOUT__conformanceVersion = vulkan.VkConformanceVersion.gRecordLayout;
    public static final long OFFSET__conformanceVersion = 532;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__driverID,
            LAYOUT__driverName,
            LAYOUT__driverInfo,
            LAYOUT__conformanceVersion
    ).withByteAlignment(8).withName("VkPhysicalDeviceDriverProperties");

    public VkPhysicalDeviceDriverProperties(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceDriverProperties getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceDriverProperties(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceDriverProperties value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int driverID() {return this.ptr.get(LAYOUT__driverID, OFFSET__driverID);}
    public void driverID(int value) {this.ptr.set(LAYOUT__driverID, OFFSET__driverID, value);}
    public java.lang.foreign.MemorySegment $driverID() {return this.ptr.asSlice(OFFSET__driverID, LAYOUT__driverID);}

    public java.lang.foreign.MemorySegment driverName() {return this.ptr.asSlice(OFFSET__driverName, LAYOUT__driverName);}
    public byte driverName(int index) {return this.driverName().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index);}
    public void driverName(int index, byte value) {this.driverName().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index, value);}

    public java.lang.foreign.MemorySegment driverInfo() {return this.ptr.asSlice(OFFSET__driverInfo, LAYOUT__driverInfo);}
    public byte driverInfo(int index) {return this.driverInfo().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index);}
    public void driverInfo(int index, byte value) {this.driverInfo().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index, value);}

    public vulkan.VkConformanceVersion conformanceVersion() {return new vulkan.VkConformanceVersion(this.ptr.asSlice(OFFSET__conformanceVersion, LAYOUT__conformanceVersion));}
    public void conformanceVersion(java.util.function.Consumer<vulkan.VkConformanceVersion> consumer) {consumer.accept(this.conformanceVersion());}
    public void conformanceVersion(vulkan.VkConformanceVersion value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__conformanceVersion, LAYOUT__conformanceVersion.byteSize());}
}
