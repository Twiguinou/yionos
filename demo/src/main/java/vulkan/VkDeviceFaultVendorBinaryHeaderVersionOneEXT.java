package vulkan;

public record VkDeviceFaultVendorBinaryHeaderVersionOneEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__headerSize = java.lang.foreign.ValueLayout.JAVA_INT.withName("headerSize");
    public static final long OFFSET__headerSize = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__headerVersion = java.lang.foreign.ValueLayout.JAVA_INT.withName("headerVersion");
    public static final long OFFSET__headerVersion = 4;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__vendorID = java.lang.foreign.ValueLayout.JAVA_INT.withName("vendorID");
    public static final long OFFSET__vendorID = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__deviceID = java.lang.foreign.ValueLayout.JAVA_INT.withName("deviceID");
    public static final long OFFSET__deviceID = 12;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__driverVersion = java.lang.foreign.ValueLayout.JAVA_INT.withName("driverVersion");
    public static final long OFFSET__driverVersion = 16;
    public static final java.lang.foreign.SequenceLayout LAYOUT__pipelineCacheUUID = java.lang.foreign.MemoryLayout.sequenceLayout(16, java.lang.foreign.ValueLayout.JAVA_BYTE).withName("pipelineCacheUUID");
    public static final long OFFSET__pipelineCacheUUID = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__applicationNameOffset = java.lang.foreign.ValueLayout.JAVA_INT.withName("applicationNameOffset");
    public static final long OFFSET__applicationNameOffset = 36;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__applicationVersion = java.lang.foreign.ValueLayout.JAVA_INT.withName("applicationVersion");
    public static final long OFFSET__applicationVersion = 40;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__engineNameOffset = java.lang.foreign.ValueLayout.JAVA_INT.withName("engineNameOffset");
    public static final long OFFSET__engineNameOffset = 44;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__engineVersion = java.lang.foreign.ValueLayout.JAVA_INT.withName("engineVersion");
    public static final long OFFSET__engineVersion = 48;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__apiVersion = java.lang.foreign.ValueLayout.JAVA_INT.withName("apiVersion");
    public static final long OFFSET__apiVersion = 52;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__headerSize,
            LAYOUT__headerVersion,
            LAYOUT__vendorID,
            LAYOUT__deviceID,
            LAYOUT__driverVersion,
            LAYOUT__pipelineCacheUUID,
            LAYOUT__applicationNameOffset,
            LAYOUT__applicationVersion,
            LAYOUT__engineNameOffset,
            LAYOUT__engineVersion,
            LAYOUT__apiVersion
    ).withByteAlignment(4).withName("VkDeviceFaultVendorBinaryHeaderVersionOneEXT");

    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkDeviceFaultVendorBinaryHeaderVersionOneEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkDeviceFaultVendorBinaryHeaderVersionOneEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkDeviceFaultVendorBinaryHeaderVersionOneEXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int headerSize() {return this.ptr.get(LAYOUT__headerSize, OFFSET__headerSize);}
    public void headerSize(int value) {this.ptr.set(LAYOUT__headerSize, OFFSET__headerSize, value);}
    public java.lang.foreign.MemorySegment $headerSize() {return this.ptr.asSlice(OFFSET__headerSize, LAYOUT__headerSize);}

    public int headerVersion() {return this.ptr.get(LAYOUT__headerVersion, OFFSET__headerVersion);}
    public void headerVersion(int value) {this.ptr.set(LAYOUT__headerVersion, OFFSET__headerVersion, value);}
    public java.lang.foreign.MemorySegment $headerVersion() {return this.ptr.asSlice(OFFSET__headerVersion, LAYOUT__headerVersion);}

    public int vendorID() {return this.ptr.get(LAYOUT__vendorID, OFFSET__vendorID);}
    public void vendorID(int value) {this.ptr.set(LAYOUT__vendorID, OFFSET__vendorID, value);}
    public java.lang.foreign.MemorySegment $vendorID() {return this.ptr.asSlice(OFFSET__vendorID, LAYOUT__vendorID);}

    public int deviceID() {return this.ptr.get(LAYOUT__deviceID, OFFSET__deviceID);}
    public void deviceID(int value) {this.ptr.set(LAYOUT__deviceID, OFFSET__deviceID, value);}
    public java.lang.foreign.MemorySegment $deviceID() {return this.ptr.asSlice(OFFSET__deviceID, LAYOUT__deviceID);}

    public int driverVersion() {return this.ptr.get(LAYOUT__driverVersion, OFFSET__driverVersion);}
    public void driverVersion(int value) {this.ptr.set(LAYOUT__driverVersion, OFFSET__driverVersion, value);}
    public java.lang.foreign.MemorySegment $driverVersion() {return this.ptr.asSlice(OFFSET__driverVersion, LAYOUT__driverVersion);}

    public java.lang.foreign.MemorySegment pipelineCacheUUID() {return this.ptr.asSlice(OFFSET__pipelineCacheUUID, LAYOUT__pipelineCacheUUID);}
    public byte pipelineCacheUUID(int index) {return this.pipelineCacheUUID().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index);}
    public void pipelineCacheUUID(int index, byte value) {this.pipelineCacheUUID().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index, value);}

    public int applicationNameOffset() {return this.ptr.get(LAYOUT__applicationNameOffset, OFFSET__applicationNameOffset);}
    public void applicationNameOffset(int value) {this.ptr.set(LAYOUT__applicationNameOffset, OFFSET__applicationNameOffset, value);}
    public java.lang.foreign.MemorySegment $applicationNameOffset() {return this.ptr.asSlice(OFFSET__applicationNameOffset, LAYOUT__applicationNameOffset);}

    public int applicationVersion() {return this.ptr.get(LAYOUT__applicationVersion, OFFSET__applicationVersion);}
    public void applicationVersion(int value) {this.ptr.set(LAYOUT__applicationVersion, OFFSET__applicationVersion, value);}
    public java.lang.foreign.MemorySegment $applicationVersion() {return this.ptr.asSlice(OFFSET__applicationVersion, LAYOUT__applicationVersion);}

    public int engineNameOffset() {return this.ptr.get(LAYOUT__engineNameOffset, OFFSET__engineNameOffset);}
    public void engineNameOffset(int value) {this.ptr.set(LAYOUT__engineNameOffset, OFFSET__engineNameOffset, value);}
    public java.lang.foreign.MemorySegment $engineNameOffset() {return this.ptr.asSlice(OFFSET__engineNameOffset, LAYOUT__engineNameOffset);}

    public int engineVersion() {return this.ptr.get(LAYOUT__engineVersion, OFFSET__engineVersion);}
    public void engineVersion(int value) {this.ptr.set(LAYOUT__engineVersion, OFFSET__engineVersion, value);}
    public java.lang.foreign.MemorySegment $engineVersion() {return this.ptr.asSlice(OFFSET__engineVersion, LAYOUT__engineVersion);}

    public int apiVersion() {return this.ptr.get(LAYOUT__apiVersion, OFFSET__apiVersion);}
    public void apiVersion(int value) {this.ptr.set(LAYOUT__apiVersion, OFFSET__apiVersion, value);}
    public java.lang.foreign.MemorySegment $apiVersion() {return this.ptr.asSlice(OFFSET__apiVersion, LAYOUT__apiVersion);}
}
