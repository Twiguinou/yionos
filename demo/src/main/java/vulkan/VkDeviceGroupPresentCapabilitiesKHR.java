package vulkan;

public record VkDeviceGroupPresentCapabilitiesKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.SequenceLayout LAYOUT__presentMask = java.lang.foreign.MemoryLayout.sequenceLayout(32, java.lang.foreign.ValueLayout.JAVA_INT).withName("presentMask");
    public static final long OFFSET__presentMask = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__modes = java.lang.foreign.ValueLayout.JAVA_INT.withName("modes");
    public static final long OFFSET__modes = 144;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__presentMask,
            LAYOUT__modes,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkDeviceGroupPresentCapabilitiesKHR");

    public VkDeviceGroupPresentCapabilitiesKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkDeviceGroupPresentCapabilitiesKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkDeviceGroupPresentCapabilitiesKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkDeviceGroupPresentCapabilitiesKHR value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public java.lang.foreign.MemorySegment presentMask() {return this.ptr.asSlice(OFFSET__presentMask, LAYOUT__presentMask);}
    public int presentMask(int index) {return this.presentMask().getAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, index);}
    public void presentMask(int index, int value) {this.presentMask().setAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, index, value);}

    public int modes() {return this.ptr.get(LAYOUT__modes, OFFSET__modes);}
    public void modes(int value) {this.ptr.set(LAYOUT__modes, OFFSET__modes, value);}
    public java.lang.foreign.MemorySegment $modes() {return this.ptr.asSlice(OFFSET__modes, LAYOUT__modes);}
}
