package vulkan;

public record VkPhysicalDeviceIDProperties(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.SequenceLayout LAYOUT__deviceUUID = java.lang.foreign.MemoryLayout.sequenceLayout(16, java.lang.foreign.ValueLayout.JAVA_BYTE).withName("deviceUUID");
    public static final long OFFSET__deviceUUID = 16;
    public static final java.lang.foreign.SequenceLayout LAYOUT__driverUUID = java.lang.foreign.MemoryLayout.sequenceLayout(16, java.lang.foreign.ValueLayout.JAVA_BYTE).withName("driverUUID");
    public static final long OFFSET__driverUUID = 32;
    public static final java.lang.foreign.SequenceLayout LAYOUT__deviceLUID = java.lang.foreign.MemoryLayout.sequenceLayout(8, java.lang.foreign.ValueLayout.JAVA_BYTE).withName("deviceLUID");
    public static final long OFFSET__deviceLUID = 48;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__deviceNodeMask = java.lang.foreign.ValueLayout.JAVA_INT.withName("deviceNodeMask");
    public static final long OFFSET__deviceNodeMask = 56;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__deviceLUIDValid = java.lang.foreign.ValueLayout.JAVA_INT.withName("deviceLUIDValid");
    public static final long OFFSET__deviceLUIDValid = 60;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__deviceUUID,
            LAYOUT__driverUUID,
            LAYOUT__deviceLUID,
            LAYOUT__deviceNodeMask,
            LAYOUT__deviceLUIDValid
    ).withByteAlignment(8).withName("VkPhysicalDeviceIDProperties");

    public VkPhysicalDeviceIDProperties(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceIDProperties getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceIDProperties(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceIDProperties value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public java.lang.foreign.MemorySegment deviceUUID() {return this.ptr.asSlice(OFFSET__deviceUUID, LAYOUT__deviceUUID);}
    public byte deviceUUID(int index) {return this.deviceUUID().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index);}
    public void deviceUUID(int index, byte value) {this.deviceUUID().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index, value);}

    public java.lang.foreign.MemorySegment driverUUID() {return this.ptr.asSlice(OFFSET__driverUUID, LAYOUT__driverUUID);}
    public byte driverUUID(int index) {return this.driverUUID().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index);}
    public void driverUUID(int index, byte value) {this.driverUUID().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index, value);}

    public java.lang.foreign.MemorySegment deviceLUID() {return this.ptr.asSlice(OFFSET__deviceLUID, LAYOUT__deviceLUID);}
    public byte deviceLUID(int index) {return this.deviceLUID().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index);}
    public void deviceLUID(int index, byte value) {this.deviceLUID().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index, value);}

    public int deviceNodeMask() {return this.ptr.get(LAYOUT__deviceNodeMask, OFFSET__deviceNodeMask);}
    public void deviceNodeMask(int value) {this.ptr.set(LAYOUT__deviceNodeMask, OFFSET__deviceNodeMask, value);}
    public java.lang.foreign.MemorySegment $deviceNodeMask() {return this.ptr.asSlice(OFFSET__deviceNodeMask, LAYOUT__deviceNodeMask);}

    public int deviceLUIDValid() {return this.ptr.get(LAYOUT__deviceLUIDValid, OFFSET__deviceLUIDValid);}
    public void deviceLUIDValid(int value) {this.ptr.set(LAYOUT__deviceLUIDValid, OFFSET__deviceLUIDValid, value);}
    public java.lang.foreign.MemorySegment $deviceLUIDValid() {return this.ptr.asSlice(OFFSET__deviceLUIDValid, LAYOUT__deviceLUIDValid);}
}
