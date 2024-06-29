package vulkan;

public record VkDeviceGroupRenderPassBeginInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__deviceMask = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__deviceMask = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__deviceRenderAreaCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__deviceRenderAreaCount = 20;
    public static final java.lang.foreign.AddressLayout LAYOUT__pDeviceRenderAreas = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pDeviceRenderAreas = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__deviceMask,
            LAYOUT__deviceRenderAreaCount,
            LAYOUT__pDeviceRenderAreas
    ).withByteAlignment(8).withName("VkDeviceGroupRenderPassBeginInfo");

    public VkDeviceGroupRenderPassBeginInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkDeviceGroupRenderPassBeginInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkDeviceGroupRenderPassBeginInfo(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkDeviceGroupRenderPassBeginInfo value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int deviceMask() {return this.ptr.get(LAYOUT__deviceMask, OFFSET__deviceMask);}
    public void deviceMask(int value) {this.ptr.set(LAYOUT__deviceMask, OFFSET__deviceMask, value);}
    public java.lang.foreign.MemorySegment $deviceMask() {return this.ptr.asSlice(OFFSET__deviceMask, LAYOUT__deviceMask);}

    public int deviceRenderAreaCount() {return this.ptr.get(LAYOUT__deviceRenderAreaCount, OFFSET__deviceRenderAreaCount);}
    public void deviceRenderAreaCount(int value) {this.ptr.set(LAYOUT__deviceRenderAreaCount, OFFSET__deviceRenderAreaCount, value);}
    public java.lang.foreign.MemorySegment $deviceRenderAreaCount() {return this.ptr.asSlice(OFFSET__deviceRenderAreaCount, LAYOUT__deviceRenderAreaCount);}

    public java.lang.foreign.MemorySegment pDeviceRenderAreas() {return this.ptr.get(LAYOUT__pDeviceRenderAreas, OFFSET__pDeviceRenderAreas);}
    public void pDeviceRenderAreas(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pDeviceRenderAreas, OFFSET__pDeviceRenderAreas, value);}
    public java.lang.foreign.MemorySegment $pDeviceRenderAreas() {return this.ptr.asSlice(OFFSET__pDeviceRenderAreas, LAYOUT__pDeviceRenderAreas);}
}
