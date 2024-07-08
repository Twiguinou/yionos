package vulkan;

public record VkOpaqueCaptureDescriptorDataCreateInfoEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.AddressLayout LAYOUT__opaqueCaptureDescriptorData = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("opaqueCaptureDescriptorData");
    public static final long OFFSET__opaqueCaptureDescriptorData = 16;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__opaqueCaptureDescriptorData
    ).withByteAlignment(8).withName("VkOpaqueCaptureDescriptorDataCreateInfoEXT");

    public VkOpaqueCaptureDescriptorDataCreateInfoEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkOpaqueCaptureDescriptorDataCreateInfoEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkOpaqueCaptureDescriptorDataCreateInfoEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkOpaqueCaptureDescriptorDataCreateInfoEXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public java.lang.foreign.MemorySegment opaqueCaptureDescriptorData() {return this.ptr.get(LAYOUT__opaqueCaptureDescriptorData, OFFSET__opaqueCaptureDescriptorData);}
    public void opaqueCaptureDescriptorData(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__opaqueCaptureDescriptorData, OFFSET__opaqueCaptureDescriptorData, value);}
    public java.lang.foreign.MemorySegment $opaqueCaptureDescriptorData() {return this.ptr.asSlice(OFFSET__opaqueCaptureDescriptorData, LAYOUT__opaqueCaptureDescriptorData);}
}
