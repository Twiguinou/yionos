package vulkan;

public record VkDeviceFaultInfoEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.SequenceLayout LAYOUT__description = java.lang.foreign.MemoryLayout.sequenceLayout(256, java.lang.foreign.ValueLayout.JAVA_BYTE).withName("description");
    public static final long OFFSET__description = 16;
    public static final java.lang.foreign.AddressLayout LAYOUT__pAddressInfos = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pAddressInfos");
    public static final long OFFSET__pAddressInfos = 272;
    public static final java.lang.foreign.AddressLayout LAYOUT__pVendorInfos = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pVendorInfos");
    public static final long OFFSET__pVendorInfos = 280;
    public static final java.lang.foreign.AddressLayout LAYOUT__pVendorBinaryData = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pVendorBinaryData");
    public static final long OFFSET__pVendorBinaryData = 288;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__description,
            LAYOUT__pAddressInfos,
            LAYOUT__pVendorInfos,
            LAYOUT__pVendorBinaryData
    ).withByteAlignment(8).withName("VkDeviceFaultInfoEXT");

    public VkDeviceFaultInfoEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkDeviceFaultInfoEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkDeviceFaultInfoEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkDeviceFaultInfoEXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public java.lang.foreign.MemorySegment description() {return this.ptr.asSlice(OFFSET__description, LAYOUT__description);}
    public byte description(int index) {return this.description().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index);}
    public void description(int index, byte value) {this.description().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index, value);}

    public java.lang.foreign.MemorySegment pAddressInfos() {return this.ptr.get(LAYOUT__pAddressInfos, OFFSET__pAddressInfos);}
    public void pAddressInfos(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pAddressInfos, OFFSET__pAddressInfos, value);}
    public java.lang.foreign.MemorySegment $pAddressInfos() {return this.ptr.asSlice(OFFSET__pAddressInfos, LAYOUT__pAddressInfos);}

    public java.lang.foreign.MemorySegment pVendorInfos() {return this.ptr.get(LAYOUT__pVendorInfos, OFFSET__pVendorInfos);}
    public void pVendorInfos(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pVendorInfos, OFFSET__pVendorInfos, value);}
    public java.lang.foreign.MemorySegment $pVendorInfos() {return this.ptr.asSlice(OFFSET__pVendorInfos, LAYOUT__pVendorInfos);}

    public java.lang.foreign.MemorySegment pVendorBinaryData() {return this.ptr.get(LAYOUT__pVendorBinaryData, OFFSET__pVendorBinaryData);}
    public void pVendorBinaryData(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pVendorBinaryData, OFFSET__pVendorBinaryData, value);}
    public java.lang.foreign.MemorySegment $pVendorBinaryData() {return this.ptr.asSlice(OFFSET__pVendorBinaryData, LAYOUT__pVendorBinaryData);}
}
