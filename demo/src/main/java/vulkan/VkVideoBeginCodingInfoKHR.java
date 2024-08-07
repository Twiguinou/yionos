package vulkan;

public record VkVideoBeginCodingInfoKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__flags = java.lang.foreign.ValueLayout.JAVA_INT.withName("flags");
    public static final long OFFSET__flags = 16;
    public static final java.lang.foreign.AddressLayout LAYOUT__videoSession = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("videoSession");
    public static final long OFFSET__videoSession = 24;
    public static final java.lang.foreign.AddressLayout LAYOUT__videoSessionParameters = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("videoSessionParameters");
    public static final long OFFSET__videoSessionParameters = 32;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__referenceSlotCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("referenceSlotCount");
    public static final long OFFSET__referenceSlotCount = 40;
    public static final java.lang.foreign.AddressLayout LAYOUT__pReferenceSlots = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pReferenceSlots");
    public static final long OFFSET__pReferenceSlots = 48;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__flags,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__videoSession,
            LAYOUT__videoSessionParameters,
            LAYOUT__referenceSlotCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pReferenceSlots
    ).withByteAlignment(8).withName("VkVideoBeginCodingInfoKHR");

    public VkVideoBeginCodingInfoKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkVideoBeginCodingInfoKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkVideoBeginCodingInfoKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkVideoBeginCodingInfoKHR value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int flags() {return this.ptr.get(LAYOUT__flags, OFFSET__flags);}
    public void flags(int value) {this.ptr.set(LAYOUT__flags, OFFSET__flags, value);}
    public java.lang.foreign.MemorySegment $flags() {return this.ptr.asSlice(OFFSET__flags, LAYOUT__flags);}

    public java.lang.foreign.MemorySegment videoSession() {return this.ptr.get(LAYOUT__videoSession, OFFSET__videoSession);}
    public void videoSession(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__videoSession, OFFSET__videoSession, value);}
    public java.lang.foreign.MemorySegment $videoSession() {return this.ptr.asSlice(OFFSET__videoSession, LAYOUT__videoSession);}

    public java.lang.foreign.MemorySegment videoSessionParameters() {return this.ptr.get(LAYOUT__videoSessionParameters, OFFSET__videoSessionParameters);}
    public void videoSessionParameters(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__videoSessionParameters, OFFSET__videoSessionParameters, value);}
    public java.lang.foreign.MemorySegment $videoSessionParameters() {return this.ptr.asSlice(OFFSET__videoSessionParameters, LAYOUT__videoSessionParameters);}

    public int referenceSlotCount() {return this.ptr.get(LAYOUT__referenceSlotCount, OFFSET__referenceSlotCount);}
    public void referenceSlotCount(int value) {this.ptr.set(LAYOUT__referenceSlotCount, OFFSET__referenceSlotCount, value);}
    public java.lang.foreign.MemorySegment $referenceSlotCount() {return this.ptr.asSlice(OFFSET__referenceSlotCount, LAYOUT__referenceSlotCount);}

    public java.lang.foreign.MemorySegment pReferenceSlots() {return this.ptr.get(LAYOUT__pReferenceSlots, OFFSET__pReferenceSlots);}
    public void pReferenceSlots(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pReferenceSlots, OFFSET__pReferenceSlots, value);}
    public java.lang.foreign.MemorySegment $pReferenceSlots() {return this.ptr.asSlice(OFFSET__pReferenceSlots, LAYOUT__pReferenceSlots);}
}
