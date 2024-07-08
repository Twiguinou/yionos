package vulkan;

public record VkDeviceFaultVendorInfoEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.SequenceLayout LAYOUT__description = java.lang.foreign.MemoryLayout.sequenceLayout(256, java.lang.foreign.ValueLayout.JAVA_BYTE).withName("description");
    public static final long OFFSET__description = 0;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__vendorFaultCode = java.lang.foreign.ValueLayout.JAVA_LONG.withName("vendorFaultCode");
    public static final long OFFSET__vendorFaultCode = 256;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__vendorFaultData = java.lang.foreign.ValueLayout.JAVA_LONG.withName("vendorFaultData");
    public static final long OFFSET__vendorFaultData = 264;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__description,
            LAYOUT__vendorFaultCode,
            LAYOUT__vendorFaultData
    ).withByteAlignment(8).withName("VkDeviceFaultVendorInfoEXT");

    public VkDeviceFaultVendorInfoEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkDeviceFaultVendorInfoEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkDeviceFaultVendorInfoEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkDeviceFaultVendorInfoEXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public java.lang.foreign.MemorySegment description() {return this.ptr.asSlice(OFFSET__description, LAYOUT__description);}
    public byte description(int index) {return this.description().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index);}
    public void description(int index, byte value) {this.description().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index, value);}

    public long vendorFaultCode() {return this.ptr.get(LAYOUT__vendorFaultCode, OFFSET__vendorFaultCode);}
    public void vendorFaultCode(long value) {this.ptr.set(LAYOUT__vendorFaultCode, OFFSET__vendorFaultCode, value);}
    public java.lang.foreign.MemorySegment $vendorFaultCode() {return this.ptr.asSlice(OFFSET__vendorFaultCode, LAYOUT__vendorFaultCode);}

    public long vendorFaultData() {return this.ptr.get(LAYOUT__vendorFaultData, OFFSET__vendorFaultData);}
    public void vendorFaultData(long value) {this.ptr.set(LAYOUT__vendorFaultData, OFFSET__vendorFaultData, value);}
    public java.lang.foreign.MemorySegment $vendorFaultData() {return this.ptr.asSlice(OFFSET__vendorFaultData, LAYOUT__vendorFaultData);}
}
