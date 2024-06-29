package vulkan;

public record VkPhysicalDeviceVulkan11Properties(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.SequenceLayout LAYOUT__deviceUUID = java.lang.foreign.MemoryLayout.sequenceLayout(16, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET__deviceUUID = 16;
    public static final java.lang.foreign.SequenceLayout LAYOUT__driverUUID = java.lang.foreign.MemoryLayout.sequenceLayout(16, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET__driverUUID = 32;
    public static final java.lang.foreign.SequenceLayout LAYOUT__deviceLUID = java.lang.foreign.MemoryLayout.sequenceLayout(8, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET__deviceLUID = 48;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__deviceNodeMask = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__deviceNodeMask = 56;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__deviceLUIDValid = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__deviceLUIDValid = 60;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__subgroupSize = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__subgroupSize = 64;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__subgroupSupportedStages = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__subgroupSupportedStages = 68;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__subgroupSupportedOperations = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__subgroupSupportedOperations = 72;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__subgroupQuadOperationsInAllStages = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__subgroupQuadOperationsInAllStages = 76;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__pointClippingBehavior = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__pointClippingBehavior = 80;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxMultiviewViewCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__maxMultiviewViewCount = 84;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxMultiviewInstanceIndex = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__maxMultiviewInstanceIndex = 88;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__protectedNoFault = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__protectedNoFault = 92;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxPerSetDescriptors = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__maxPerSetDescriptors = 96;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__maxMemoryAllocationSize = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__maxMemoryAllocationSize = 104;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__deviceUUID,
            LAYOUT__driverUUID,
            LAYOUT__deviceLUID,
            LAYOUT__deviceNodeMask,
            LAYOUT__deviceLUIDValid,
            LAYOUT__subgroupSize,
            LAYOUT__subgroupSupportedStages,
            LAYOUT__subgroupSupportedOperations,
            LAYOUT__subgroupQuadOperationsInAllStages,
            LAYOUT__pointClippingBehavior,
            LAYOUT__maxMultiviewViewCount,
            LAYOUT__maxMultiviewInstanceIndex,
            LAYOUT__protectedNoFault,
            LAYOUT__maxPerSetDescriptors,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__maxMemoryAllocationSize
    ).withByteAlignment(8).withName("VkPhysicalDeviceVulkan11Properties");

    public VkPhysicalDeviceVulkan11Properties(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceVulkan11Properties getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceVulkan11Properties(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceVulkan11Properties value)
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

    public int subgroupSize() {return this.ptr.get(LAYOUT__subgroupSize, OFFSET__subgroupSize);}
    public void subgroupSize(int value) {this.ptr.set(LAYOUT__subgroupSize, OFFSET__subgroupSize, value);}
    public java.lang.foreign.MemorySegment $subgroupSize() {return this.ptr.asSlice(OFFSET__subgroupSize, LAYOUT__subgroupSize);}

    public int subgroupSupportedStages() {return this.ptr.get(LAYOUT__subgroupSupportedStages, OFFSET__subgroupSupportedStages);}
    public void subgroupSupportedStages(int value) {this.ptr.set(LAYOUT__subgroupSupportedStages, OFFSET__subgroupSupportedStages, value);}
    public java.lang.foreign.MemorySegment $subgroupSupportedStages() {return this.ptr.asSlice(OFFSET__subgroupSupportedStages, LAYOUT__subgroupSupportedStages);}

    public int subgroupSupportedOperations() {return this.ptr.get(LAYOUT__subgroupSupportedOperations, OFFSET__subgroupSupportedOperations);}
    public void subgroupSupportedOperations(int value) {this.ptr.set(LAYOUT__subgroupSupportedOperations, OFFSET__subgroupSupportedOperations, value);}
    public java.lang.foreign.MemorySegment $subgroupSupportedOperations() {return this.ptr.asSlice(OFFSET__subgroupSupportedOperations, LAYOUT__subgroupSupportedOperations);}

    public int subgroupQuadOperationsInAllStages() {return this.ptr.get(LAYOUT__subgroupQuadOperationsInAllStages, OFFSET__subgroupQuadOperationsInAllStages);}
    public void subgroupQuadOperationsInAllStages(int value) {this.ptr.set(LAYOUT__subgroupQuadOperationsInAllStages, OFFSET__subgroupQuadOperationsInAllStages, value);}
    public java.lang.foreign.MemorySegment $subgroupQuadOperationsInAllStages() {return this.ptr.asSlice(OFFSET__subgroupQuadOperationsInAllStages, LAYOUT__subgroupQuadOperationsInAllStages);}

    public int pointClippingBehavior() {return this.ptr.get(LAYOUT__pointClippingBehavior, OFFSET__pointClippingBehavior);}
    public void pointClippingBehavior(int value) {this.ptr.set(LAYOUT__pointClippingBehavior, OFFSET__pointClippingBehavior, value);}
    public java.lang.foreign.MemorySegment $pointClippingBehavior() {return this.ptr.asSlice(OFFSET__pointClippingBehavior, LAYOUT__pointClippingBehavior);}

    public int maxMultiviewViewCount() {return this.ptr.get(LAYOUT__maxMultiviewViewCount, OFFSET__maxMultiviewViewCount);}
    public void maxMultiviewViewCount(int value) {this.ptr.set(LAYOUT__maxMultiviewViewCount, OFFSET__maxMultiviewViewCount, value);}
    public java.lang.foreign.MemorySegment $maxMultiviewViewCount() {return this.ptr.asSlice(OFFSET__maxMultiviewViewCount, LAYOUT__maxMultiviewViewCount);}

    public int maxMultiviewInstanceIndex() {return this.ptr.get(LAYOUT__maxMultiviewInstanceIndex, OFFSET__maxMultiviewInstanceIndex);}
    public void maxMultiviewInstanceIndex(int value) {this.ptr.set(LAYOUT__maxMultiviewInstanceIndex, OFFSET__maxMultiviewInstanceIndex, value);}
    public java.lang.foreign.MemorySegment $maxMultiviewInstanceIndex() {return this.ptr.asSlice(OFFSET__maxMultiviewInstanceIndex, LAYOUT__maxMultiviewInstanceIndex);}

    public int protectedNoFault() {return this.ptr.get(LAYOUT__protectedNoFault, OFFSET__protectedNoFault);}
    public void protectedNoFault(int value) {this.ptr.set(LAYOUT__protectedNoFault, OFFSET__protectedNoFault, value);}
    public java.lang.foreign.MemorySegment $protectedNoFault() {return this.ptr.asSlice(OFFSET__protectedNoFault, LAYOUT__protectedNoFault);}

    public int maxPerSetDescriptors() {return this.ptr.get(LAYOUT__maxPerSetDescriptors, OFFSET__maxPerSetDescriptors);}
    public void maxPerSetDescriptors(int value) {this.ptr.set(LAYOUT__maxPerSetDescriptors, OFFSET__maxPerSetDescriptors, value);}
    public java.lang.foreign.MemorySegment $maxPerSetDescriptors() {return this.ptr.asSlice(OFFSET__maxPerSetDescriptors, LAYOUT__maxPerSetDescriptors);}

    public long maxMemoryAllocationSize() {return this.ptr.get(LAYOUT__maxMemoryAllocationSize, OFFSET__maxMemoryAllocationSize);}
    public void maxMemoryAllocationSize(long value) {this.ptr.set(LAYOUT__maxMemoryAllocationSize, OFFSET__maxMemoryAllocationSize, value);}
    public java.lang.foreign.MemorySegment $maxMemoryAllocationSize() {return this.ptr.asSlice(OFFSET__maxMemoryAllocationSize, LAYOUT__maxMemoryAllocationSize);}
}
