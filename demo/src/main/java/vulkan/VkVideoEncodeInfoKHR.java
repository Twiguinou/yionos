package vulkan;

public record VkVideoEncodeInfoKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$flags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$flags = 16L;
    public static final java.lang.foreign.AddressLayout LAYOUT$dstBuffer = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$dstBuffer = 24L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$dstBufferOffset = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$dstBufferOffset = 32L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$dstBufferRange = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$dstBufferRange = 40L;
    public static final java.lang.foreign.GroupLayout LAYOUT$srcPictureResource = vulkan.VkVideoPictureResourceInfoKHR.gStructLayout;
    public static final long OFFSET$srcPictureResource = 48L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pSetupReferenceSlot = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pSetupReferenceSlot = 96L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$referenceSlotCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$referenceSlotCount = 104L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pReferenceSlots = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pReferenceSlots = 112L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$precedingExternallyEncodedBytes = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$precedingExternallyEncodedBytes = 120L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$flags,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$dstBuffer,
            LAYOUT$dstBufferOffset,
            LAYOUT$dstBufferRange,
            LAYOUT$srcPictureResource,
            LAYOUT$pSetupReferenceSlot,
            LAYOUT$referenceSlotCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pReferenceSlots,
            LAYOUT$precedingExternallyEncodedBytes,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("VkVideoEncodeInfoKHR");

    public VkVideoEncodeInfoKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VkVideoEncodeInfoKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VkVideoEncodeInfoKHR(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int flags() {return this.ptr.get(LAYOUT$flags, OFFSET$flags);}
    public void flags(int value) {this.ptr.set(LAYOUT$flags, OFFSET$flags, value);}
    public java.lang.foreign.MemorySegment flags_ptr() {return this.ptr.asSlice(OFFSET$flags, LAYOUT$flags);}

    public java.lang.foreign.MemorySegment dstBuffer() {return this.ptr.get(LAYOUT$dstBuffer, OFFSET$dstBuffer);}
    public void dstBuffer(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$dstBuffer, OFFSET$dstBuffer, value);}
    public java.lang.foreign.MemorySegment dstBuffer_ptr() {return this.ptr.asSlice(OFFSET$dstBuffer, LAYOUT$dstBuffer);}

    public long dstBufferOffset() {return this.ptr.get(LAYOUT$dstBufferOffset, OFFSET$dstBufferOffset);}
    public void dstBufferOffset(long value) {this.ptr.set(LAYOUT$dstBufferOffset, OFFSET$dstBufferOffset, value);}
    public java.lang.foreign.MemorySegment dstBufferOffset_ptr() {return this.ptr.asSlice(OFFSET$dstBufferOffset, LAYOUT$dstBufferOffset);}

    public long dstBufferRange() {return this.ptr.get(LAYOUT$dstBufferRange, OFFSET$dstBufferRange);}
    public void dstBufferRange(long value) {this.ptr.set(LAYOUT$dstBufferRange, OFFSET$dstBufferRange, value);}
    public java.lang.foreign.MemorySegment dstBufferRange_ptr() {return this.ptr.asSlice(OFFSET$dstBufferRange, LAYOUT$dstBufferRange);}

    public vulkan.VkVideoPictureResourceInfoKHR srcPictureResource() {return new vulkan.VkVideoPictureResourceInfoKHR(this.ptr.asSlice(OFFSET$srcPictureResource, LAYOUT$srcPictureResource));}
    public void srcPictureResource(java.util.function.Consumer<vulkan.VkVideoPictureResourceInfoKHR> consumer) {consumer.accept(this.srcPictureResource());}
    public void srcPictureResource(vulkan.VkVideoPictureResourceInfoKHR value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$srcPictureResource, LAYOUT$srcPictureResource.byteSize());}

    public java.lang.foreign.MemorySegment pSetupReferenceSlot() {return this.ptr.get(LAYOUT$pSetupReferenceSlot, OFFSET$pSetupReferenceSlot);}
    public void pSetupReferenceSlot(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pSetupReferenceSlot, OFFSET$pSetupReferenceSlot, value);}
    public java.lang.foreign.MemorySegment pSetupReferenceSlot_ptr() {return this.ptr.asSlice(OFFSET$pSetupReferenceSlot, LAYOUT$pSetupReferenceSlot);}

    public int referenceSlotCount() {return this.ptr.get(LAYOUT$referenceSlotCount, OFFSET$referenceSlotCount);}
    public void referenceSlotCount(int value) {this.ptr.set(LAYOUT$referenceSlotCount, OFFSET$referenceSlotCount, value);}
    public java.lang.foreign.MemorySegment referenceSlotCount_ptr() {return this.ptr.asSlice(OFFSET$referenceSlotCount, LAYOUT$referenceSlotCount);}

    public java.lang.foreign.MemorySegment pReferenceSlots() {return this.ptr.get(LAYOUT$pReferenceSlots, OFFSET$pReferenceSlots);}
    public void pReferenceSlots(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pReferenceSlots, OFFSET$pReferenceSlots, value);}
    public java.lang.foreign.MemorySegment pReferenceSlots_ptr() {return this.ptr.asSlice(OFFSET$pReferenceSlots, LAYOUT$pReferenceSlots);}

    public int precedingExternallyEncodedBytes() {return this.ptr.get(LAYOUT$precedingExternallyEncodedBytes, OFFSET$precedingExternallyEncodedBytes);}
    public void precedingExternallyEncodedBytes(int value) {this.ptr.set(LAYOUT$precedingExternallyEncodedBytes, OFFSET$precedingExternallyEncodedBytes, value);}
    public java.lang.foreign.MemorySegment precedingExternallyEncodedBytes_ptr() {return this.ptr.asSlice(OFFSET$precedingExternallyEncodedBytes, LAYOUT$precedingExternallyEncodedBytes);}
}
