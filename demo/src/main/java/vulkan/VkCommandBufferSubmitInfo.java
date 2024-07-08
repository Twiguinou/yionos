package vulkan;

public record VkCommandBufferSubmitInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.AddressLayout LAYOUT__commandBuffer = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("commandBuffer");
    public static final long OFFSET__commandBuffer = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__deviceMask = java.lang.foreign.ValueLayout.JAVA_INT.withName("deviceMask");
    public static final long OFFSET__deviceMask = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__commandBuffer,
            LAYOUT__deviceMask,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkCommandBufferSubmitInfo");

    public VkCommandBufferSubmitInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkCommandBufferSubmitInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkCommandBufferSubmitInfo(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkCommandBufferSubmitInfo value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public java.lang.foreign.MemorySegment commandBuffer() {return this.ptr.get(LAYOUT__commandBuffer, OFFSET__commandBuffer);}
    public void commandBuffer(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__commandBuffer, OFFSET__commandBuffer, value);}
    public java.lang.foreign.MemorySegment $commandBuffer() {return this.ptr.asSlice(OFFSET__commandBuffer, LAYOUT__commandBuffer);}

    public int deviceMask() {return this.ptr.get(LAYOUT__deviceMask, OFFSET__deviceMask);}
    public void deviceMask(int value) {this.ptr.set(LAYOUT__deviceMask, OFFSET__deviceMask, value);}
    public java.lang.foreign.MemorySegment $deviceMask() {return this.ptr.asSlice(OFFSET__deviceMask, LAYOUT__deviceMask);}
}
