package vulkan;

public record VkPipelineCacheHeaderVersionOne(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__headerSize = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__headerSize = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__headerVersion = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__headerVersion = 4;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__vendorID = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__vendorID = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__deviceID = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__deviceID = 12;
    public static final java.lang.foreign.SequenceLayout LAYOUT__pipelineCacheUUID = java.lang.foreign.MemoryLayout.sequenceLayout(16, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET__pipelineCacheUUID = 16;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__headerSize,
            LAYOUT__headerVersion,
            LAYOUT__vendorID,
            LAYOUT__deviceID,
            LAYOUT__pipelineCacheUUID
    ).withByteAlignment(4).withName("VkPipelineCacheHeaderVersionOne");

    public VkPipelineCacheHeaderVersionOne(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPipelineCacheHeaderVersionOne getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPipelineCacheHeaderVersionOne(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPipelineCacheHeaderVersionOne value)
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

    public java.lang.foreign.MemorySegment pipelineCacheUUID() {return this.ptr.asSlice(OFFSET__pipelineCacheUUID, LAYOUT__pipelineCacheUUID);}
    public byte pipelineCacheUUID(int index) {return this.pipelineCacheUUID().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index);}
    public void pipelineCacheUUID(int index, byte value) {this.pipelineCacheUUID().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index, value);}
}
