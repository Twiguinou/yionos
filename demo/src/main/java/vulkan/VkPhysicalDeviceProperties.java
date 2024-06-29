package vulkan;

public record VkPhysicalDeviceProperties(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__apiVersion = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__apiVersion = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__driverVersion = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__driverVersion = 4;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__vendorID = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__vendorID = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__deviceID = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__deviceID = 12;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__deviceType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__deviceType = 16;
    public static final java.lang.foreign.SequenceLayout LAYOUT__deviceName = java.lang.foreign.MemoryLayout.sequenceLayout(256, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET__deviceName = 20;
    public static final java.lang.foreign.SequenceLayout LAYOUT__pipelineCacheUUID = java.lang.foreign.MemoryLayout.sequenceLayout(16, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET__pipelineCacheUUID = 276;
    public static final java.lang.foreign.StructLayout LAYOUT__limits = vulkan.VkPhysicalDeviceLimits.gRecordLayout;
    public static final long OFFSET__limits = 296;
    public static final java.lang.foreign.StructLayout LAYOUT__sparseProperties = vulkan.VkPhysicalDeviceSparseProperties.gRecordLayout;
    public static final long OFFSET__sparseProperties = 800;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__apiVersion,
            LAYOUT__driverVersion,
            LAYOUT__vendorID,
            LAYOUT__deviceID,
            LAYOUT__deviceType,
            LAYOUT__deviceName,
            LAYOUT__pipelineCacheUUID,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__limits,
            LAYOUT__sparseProperties,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkPhysicalDeviceProperties");

    public VkPhysicalDeviceProperties(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceProperties getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceProperties(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceProperties value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int apiVersion() {return this.ptr.get(LAYOUT__apiVersion, OFFSET__apiVersion);}
    public void apiVersion(int value) {this.ptr.set(LAYOUT__apiVersion, OFFSET__apiVersion, value);}
    public java.lang.foreign.MemorySegment $apiVersion() {return this.ptr.asSlice(OFFSET__apiVersion, LAYOUT__apiVersion);}

    public int driverVersion() {return this.ptr.get(LAYOUT__driverVersion, OFFSET__driverVersion);}
    public void driverVersion(int value) {this.ptr.set(LAYOUT__driverVersion, OFFSET__driverVersion, value);}
    public java.lang.foreign.MemorySegment $driverVersion() {return this.ptr.asSlice(OFFSET__driverVersion, LAYOUT__driverVersion);}

    public int vendorID() {return this.ptr.get(LAYOUT__vendorID, OFFSET__vendorID);}
    public void vendorID(int value) {this.ptr.set(LAYOUT__vendorID, OFFSET__vendorID, value);}
    public java.lang.foreign.MemorySegment $vendorID() {return this.ptr.asSlice(OFFSET__vendorID, LAYOUT__vendorID);}

    public int deviceID() {return this.ptr.get(LAYOUT__deviceID, OFFSET__deviceID);}
    public void deviceID(int value) {this.ptr.set(LAYOUT__deviceID, OFFSET__deviceID, value);}
    public java.lang.foreign.MemorySegment $deviceID() {return this.ptr.asSlice(OFFSET__deviceID, LAYOUT__deviceID);}

    public int deviceType() {return this.ptr.get(LAYOUT__deviceType, OFFSET__deviceType);}
    public void deviceType(int value) {this.ptr.set(LAYOUT__deviceType, OFFSET__deviceType, value);}
    public java.lang.foreign.MemorySegment $deviceType() {return this.ptr.asSlice(OFFSET__deviceType, LAYOUT__deviceType);}

    public java.lang.foreign.MemorySegment deviceName() {return this.ptr.asSlice(OFFSET__deviceName, LAYOUT__deviceName);}
    public byte deviceName(int index) {return this.deviceName().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index);}
    public void deviceName(int index, byte value) {this.deviceName().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index, value);}

    public java.lang.foreign.MemorySegment pipelineCacheUUID() {return this.ptr.asSlice(OFFSET__pipelineCacheUUID, LAYOUT__pipelineCacheUUID);}
    public byte pipelineCacheUUID(int index) {return this.pipelineCacheUUID().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index);}
    public void pipelineCacheUUID(int index, byte value) {this.pipelineCacheUUID().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index, value);}

    public vulkan.VkPhysicalDeviceLimits limits() {return new vulkan.VkPhysicalDeviceLimits(this.ptr.asSlice(OFFSET__limits, LAYOUT__limits));}
    public void limits(java.util.function.Consumer<vulkan.VkPhysicalDeviceLimits> consumer) {consumer.accept(this.limits());}
    public void limits(vulkan.VkPhysicalDeviceLimits value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__limits, LAYOUT__limits.byteSize());}

    public vulkan.VkPhysicalDeviceSparseProperties sparseProperties() {return new vulkan.VkPhysicalDeviceSparseProperties(this.ptr.asSlice(OFFSET__sparseProperties, LAYOUT__sparseProperties));}
    public void sparseProperties(java.util.function.Consumer<vulkan.VkPhysicalDeviceSparseProperties> consumer) {consumer.accept(this.sparseProperties());}
    public void sparseProperties(vulkan.VkPhysicalDeviceSparseProperties value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__sparseProperties, LAYOUT__sparseProperties.byteSize());}
}
