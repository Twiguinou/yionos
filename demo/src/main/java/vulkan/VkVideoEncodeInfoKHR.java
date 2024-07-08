package vulkan;

public record VkVideoEncodeInfoKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__flags = java.lang.foreign.ValueLayout.JAVA_INT.withName("flags");
    public static final long OFFSET__flags = 16;
    public static final java.lang.foreign.AddressLayout LAYOUT__dstBuffer = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("dstBuffer");
    public static final long OFFSET__dstBuffer = 24;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__dstBufferOffset = java.lang.foreign.ValueLayout.JAVA_LONG.withName("dstBufferOffset");
    public static final long OFFSET__dstBufferOffset = 32;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__dstBufferRange = java.lang.foreign.ValueLayout.JAVA_LONG.withName("dstBufferRange");
    public static final long OFFSET__dstBufferRange = 40;
    public static final java.lang.foreign.StructLayout LAYOUT__srcPictureResource = vulkan.VkVideoPictureResourceInfoKHR.gRecordLayout.withName("srcPictureResource");
    public static final long OFFSET__srcPictureResource = 48;
    public static final java.lang.foreign.AddressLayout LAYOUT__pSetupReferenceSlot = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pSetupReferenceSlot");
    public static final long OFFSET__pSetupReferenceSlot = 96;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__referenceSlotCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("referenceSlotCount");
    public static final long OFFSET__referenceSlotCount = 104;
    public static final java.lang.foreign.AddressLayout LAYOUT__pReferenceSlots = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pReferenceSlots");
    public static final long OFFSET__pReferenceSlots = 112;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__precedingExternallyEncodedBytes = java.lang.foreign.ValueLayout.JAVA_INT.withName("precedingExternallyEncodedBytes");
    public static final long OFFSET__precedingExternallyEncodedBytes = 120;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__flags,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__dstBuffer,
            LAYOUT__dstBufferOffset,
            LAYOUT__dstBufferRange,
            LAYOUT__srcPictureResource,
            LAYOUT__pSetupReferenceSlot,
            LAYOUT__referenceSlotCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pReferenceSlots,
            LAYOUT__precedingExternallyEncodedBytes,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkVideoEncodeInfoKHR");

    public VkVideoEncodeInfoKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkVideoEncodeInfoKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkVideoEncodeInfoKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkVideoEncodeInfoKHR value)
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

    public java.lang.foreign.MemorySegment dstBuffer() {return this.ptr.get(LAYOUT__dstBuffer, OFFSET__dstBuffer);}
    public void dstBuffer(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__dstBuffer, OFFSET__dstBuffer, value);}
    public java.lang.foreign.MemorySegment $dstBuffer() {return this.ptr.asSlice(OFFSET__dstBuffer, LAYOUT__dstBuffer);}

    public long dstBufferOffset() {return this.ptr.get(LAYOUT__dstBufferOffset, OFFSET__dstBufferOffset);}
    public void dstBufferOffset(long value) {this.ptr.set(LAYOUT__dstBufferOffset, OFFSET__dstBufferOffset, value);}
    public java.lang.foreign.MemorySegment $dstBufferOffset() {return this.ptr.asSlice(OFFSET__dstBufferOffset, LAYOUT__dstBufferOffset);}

    public long dstBufferRange() {return this.ptr.get(LAYOUT__dstBufferRange, OFFSET__dstBufferRange);}
    public void dstBufferRange(long value) {this.ptr.set(LAYOUT__dstBufferRange, OFFSET__dstBufferRange, value);}
    public java.lang.foreign.MemorySegment $dstBufferRange() {return this.ptr.asSlice(OFFSET__dstBufferRange, LAYOUT__dstBufferRange);}

    public vulkan.VkVideoPictureResourceInfoKHR srcPictureResource() {return new vulkan.VkVideoPictureResourceInfoKHR(this.ptr.asSlice(OFFSET__srcPictureResource, LAYOUT__srcPictureResource));}
    public void srcPictureResource(java.util.function.Consumer<vulkan.VkVideoPictureResourceInfoKHR> consumer) {consumer.accept(this.srcPictureResource());}
    public void srcPictureResource(vulkan.VkVideoPictureResourceInfoKHR value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__srcPictureResource, LAYOUT__srcPictureResource.byteSize());}

    public java.lang.foreign.MemorySegment pSetupReferenceSlot() {return this.ptr.get(LAYOUT__pSetupReferenceSlot, OFFSET__pSetupReferenceSlot);}
    public void pSetupReferenceSlot(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pSetupReferenceSlot, OFFSET__pSetupReferenceSlot, value);}
    public java.lang.foreign.MemorySegment $pSetupReferenceSlot() {return this.ptr.asSlice(OFFSET__pSetupReferenceSlot, LAYOUT__pSetupReferenceSlot);}

    public int referenceSlotCount() {return this.ptr.get(LAYOUT__referenceSlotCount, OFFSET__referenceSlotCount);}
    public void referenceSlotCount(int value) {this.ptr.set(LAYOUT__referenceSlotCount, OFFSET__referenceSlotCount, value);}
    public java.lang.foreign.MemorySegment $referenceSlotCount() {return this.ptr.asSlice(OFFSET__referenceSlotCount, LAYOUT__referenceSlotCount);}

    public java.lang.foreign.MemorySegment pReferenceSlots() {return this.ptr.get(LAYOUT__pReferenceSlots, OFFSET__pReferenceSlots);}
    public void pReferenceSlots(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pReferenceSlots, OFFSET__pReferenceSlots, value);}
    public java.lang.foreign.MemorySegment $pReferenceSlots() {return this.ptr.asSlice(OFFSET__pReferenceSlots, LAYOUT__pReferenceSlots);}

    public int precedingExternallyEncodedBytes() {return this.ptr.get(LAYOUT__precedingExternallyEncodedBytes, OFFSET__precedingExternallyEncodedBytes);}
    public void precedingExternallyEncodedBytes(int value) {this.ptr.set(LAYOUT__precedingExternallyEncodedBytes, OFFSET__precedingExternallyEncodedBytes, value);}
    public java.lang.foreign.MemorySegment $precedingExternallyEncodedBytes() {return this.ptr.asSlice(OFFSET__precedingExternallyEncodedBytes, LAYOUT__precedingExternallyEncodedBytes);}
}
