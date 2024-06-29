package vulkan;

public record VkVideoReferenceSlotInfoKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__slotIndex = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__slotIndex = 16;
    public static final java.lang.foreign.AddressLayout LAYOUT__pPictureResource = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pPictureResource = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__slotIndex,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pPictureResource
    ).withByteAlignment(8).withName("VkVideoReferenceSlotInfoKHR");

    public VkVideoReferenceSlotInfoKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkVideoReferenceSlotInfoKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkVideoReferenceSlotInfoKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkVideoReferenceSlotInfoKHR value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int slotIndex() {return this.ptr.get(LAYOUT__slotIndex, OFFSET__slotIndex);}
    public void slotIndex(int value) {this.ptr.set(LAYOUT__slotIndex, OFFSET__slotIndex, value);}
    public java.lang.foreign.MemorySegment $slotIndex() {return this.ptr.asSlice(OFFSET__slotIndex, LAYOUT__slotIndex);}

    public java.lang.foreign.MemorySegment pPictureResource() {return this.ptr.get(LAYOUT__pPictureResource, OFFSET__pPictureResource);}
    public void pPictureResource(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pPictureResource, OFFSET__pPictureResource, value);}
    public java.lang.foreign.MemorySegment $pPictureResource() {return this.ptr.asSlice(OFFSET__pPictureResource, LAYOUT__pPictureResource);}
}
