package vulkan;

public record VkAccelerationStructureCreateInfoNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__compactedSize = java.lang.foreign.ValueLayout.JAVA_LONG.withName("compactedSize");
    public static final long OFFSET__compactedSize = 16;
    public static final java.lang.foreign.StructLayout LAYOUT__info = vulkan.VkAccelerationStructureInfoNV.gRecordLayout.withName("info");
    public static final long OFFSET__info = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__compactedSize,
            LAYOUT__info
    ).withByteAlignment(8).withName("VkAccelerationStructureCreateInfoNV");

    public VkAccelerationStructureCreateInfoNV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkAccelerationStructureCreateInfoNV getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkAccelerationStructureCreateInfoNV(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkAccelerationStructureCreateInfoNV value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public long compactedSize() {return this.ptr.get(LAYOUT__compactedSize, OFFSET__compactedSize);}
    public void compactedSize(long value) {this.ptr.set(LAYOUT__compactedSize, OFFSET__compactedSize, value);}
    public java.lang.foreign.MemorySegment $compactedSize() {return this.ptr.asSlice(OFFSET__compactedSize, LAYOUT__compactedSize);}

    public vulkan.VkAccelerationStructureInfoNV info() {return new vulkan.VkAccelerationStructureInfoNV(this.ptr.asSlice(OFFSET__info, LAYOUT__info));}
    public void info(java.util.function.Consumer<vulkan.VkAccelerationStructureInfoNV> consumer) {consumer.accept(this.info());}
    public void info(vulkan.VkAccelerationStructureInfoNV value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__info, LAYOUT__info.byteSize());}
}
