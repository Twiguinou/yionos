package vulkan;

public record VkVideoDecodeH264CapabilitiesKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxLevelIdc = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxLevelIdc");
    public static final long OFFSET__maxLevelIdc = 16;
    public static final java.lang.foreign.StructLayout LAYOUT__fieldOffsetGranularity = vulkan.VkOffset2D.gRecordLayout.withName("fieldOffsetGranularity");
    public static final long OFFSET__fieldOffsetGranularity = 20;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__maxLevelIdc,
            LAYOUT__fieldOffsetGranularity,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkVideoDecodeH264CapabilitiesKHR");

    public VkVideoDecodeH264CapabilitiesKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkVideoDecodeH264CapabilitiesKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkVideoDecodeH264CapabilitiesKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkVideoDecodeH264CapabilitiesKHR value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int maxLevelIdc() {return this.ptr.get(LAYOUT__maxLevelIdc, OFFSET__maxLevelIdc);}
    public void maxLevelIdc(int value) {this.ptr.set(LAYOUT__maxLevelIdc, OFFSET__maxLevelIdc, value);}
    public java.lang.foreign.MemorySegment $maxLevelIdc() {return this.ptr.asSlice(OFFSET__maxLevelIdc, LAYOUT__maxLevelIdc);}

    public vulkan.VkOffset2D fieldOffsetGranularity() {return new vulkan.VkOffset2D(this.ptr.asSlice(OFFSET__fieldOffsetGranularity, LAYOUT__fieldOffsetGranularity));}
    public void fieldOffsetGranularity(java.util.function.Consumer<vulkan.VkOffset2D> consumer) {consumer.accept(this.fieldOffsetGranularity());}
    public void fieldOffsetGranularity(vulkan.VkOffset2D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__fieldOffsetGranularity, LAYOUT__fieldOffsetGranularity.byteSize());}
}
