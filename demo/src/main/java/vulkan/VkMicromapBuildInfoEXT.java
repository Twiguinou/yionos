package vulkan;

public record VkMicromapBuildInfoEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__type = java.lang.foreign.ValueLayout.JAVA_INT.withName("type");
    public static final long OFFSET__type = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__flags = java.lang.foreign.ValueLayout.JAVA_INT.withName("flags");
    public static final long OFFSET__flags = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__mode = java.lang.foreign.ValueLayout.JAVA_INT.withName("mode");
    public static final long OFFSET__mode = 24;
    public static final java.lang.foreign.AddressLayout LAYOUT__dstMicromap = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("dstMicromap");
    public static final long OFFSET__dstMicromap = 32;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__usageCountsCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("usageCountsCount");
    public static final long OFFSET__usageCountsCount = 40;
    public static final java.lang.foreign.AddressLayout LAYOUT__pUsageCounts = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pUsageCounts");
    public static final long OFFSET__pUsageCounts = 48;
    public static final java.lang.foreign.AddressLayout LAYOUT__ppUsageCounts = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("ppUsageCounts");
    public static final long OFFSET__ppUsageCounts = 56;
    public static final java.lang.foreign.UnionLayout LAYOUT__data = vulkan.VkDeviceOrHostAddressConstKHR.gRecordLayout.withName("data");
    public static final long OFFSET__data = 64;
    public static final java.lang.foreign.UnionLayout LAYOUT__scratchData = vulkan.VkDeviceOrHostAddressKHR.gRecordLayout.withName("scratchData");
    public static final long OFFSET__scratchData = 72;
    public static final java.lang.foreign.UnionLayout LAYOUT__triangleArray = vulkan.VkDeviceOrHostAddressConstKHR.gRecordLayout.withName("triangleArray");
    public static final long OFFSET__triangleArray = 80;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__triangleArrayStride = java.lang.foreign.ValueLayout.JAVA_LONG.withName("triangleArrayStride");
    public static final long OFFSET__triangleArrayStride = 88;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__type,
            LAYOUT__flags,
            LAYOUT__mode,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__dstMicromap,
            LAYOUT__usageCountsCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pUsageCounts,
            LAYOUT__ppUsageCounts,
            LAYOUT__data,
            LAYOUT__scratchData,
            LAYOUT__triangleArray,
            LAYOUT__triangleArrayStride
    ).withByteAlignment(8).withName("VkMicromapBuildInfoEXT");

    public VkMicromapBuildInfoEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkMicromapBuildInfoEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkMicromapBuildInfoEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkMicromapBuildInfoEXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int type() {return this.ptr.get(LAYOUT__type, OFFSET__type);}
    public void type(int value) {this.ptr.set(LAYOUT__type, OFFSET__type, value);}
    public java.lang.foreign.MemorySegment $type() {return this.ptr.asSlice(OFFSET__type, LAYOUT__type);}

    public int flags() {return this.ptr.get(LAYOUT__flags, OFFSET__flags);}
    public void flags(int value) {this.ptr.set(LAYOUT__flags, OFFSET__flags, value);}
    public java.lang.foreign.MemorySegment $flags() {return this.ptr.asSlice(OFFSET__flags, LAYOUT__flags);}

    public int mode() {return this.ptr.get(LAYOUT__mode, OFFSET__mode);}
    public void mode(int value) {this.ptr.set(LAYOUT__mode, OFFSET__mode, value);}
    public java.lang.foreign.MemorySegment $mode() {return this.ptr.asSlice(OFFSET__mode, LAYOUT__mode);}

    public java.lang.foreign.MemorySegment dstMicromap() {return this.ptr.get(LAYOUT__dstMicromap, OFFSET__dstMicromap);}
    public void dstMicromap(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__dstMicromap, OFFSET__dstMicromap, value);}
    public java.lang.foreign.MemorySegment $dstMicromap() {return this.ptr.asSlice(OFFSET__dstMicromap, LAYOUT__dstMicromap);}

    public int usageCountsCount() {return this.ptr.get(LAYOUT__usageCountsCount, OFFSET__usageCountsCount);}
    public void usageCountsCount(int value) {this.ptr.set(LAYOUT__usageCountsCount, OFFSET__usageCountsCount, value);}
    public java.lang.foreign.MemorySegment $usageCountsCount() {return this.ptr.asSlice(OFFSET__usageCountsCount, LAYOUT__usageCountsCount);}

    public java.lang.foreign.MemorySegment pUsageCounts() {return this.ptr.get(LAYOUT__pUsageCounts, OFFSET__pUsageCounts);}
    public void pUsageCounts(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pUsageCounts, OFFSET__pUsageCounts, value);}
    public java.lang.foreign.MemorySegment $pUsageCounts() {return this.ptr.asSlice(OFFSET__pUsageCounts, LAYOUT__pUsageCounts);}

    public java.lang.foreign.MemorySegment ppUsageCounts() {return this.ptr.get(LAYOUT__ppUsageCounts, OFFSET__ppUsageCounts);}
    public void ppUsageCounts(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__ppUsageCounts, OFFSET__ppUsageCounts, value);}
    public java.lang.foreign.MemorySegment $ppUsageCounts() {return this.ptr.asSlice(OFFSET__ppUsageCounts, LAYOUT__ppUsageCounts);}

    public vulkan.VkDeviceOrHostAddressConstKHR data() {return new vulkan.VkDeviceOrHostAddressConstKHR(this.ptr.asSlice(OFFSET__data, LAYOUT__data));}
    public void data(java.util.function.Consumer<vulkan.VkDeviceOrHostAddressConstKHR> consumer) {consumer.accept(this.data());}
    public void data(vulkan.VkDeviceOrHostAddressConstKHR value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__data, LAYOUT__data.byteSize());}

    public vulkan.VkDeviceOrHostAddressKHR scratchData() {return new vulkan.VkDeviceOrHostAddressKHR(this.ptr.asSlice(OFFSET__scratchData, LAYOUT__scratchData));}
    public void scratchData(java.util.function.Consumer<vulkan.VkDeviceOrHostAddressKHR> consumer) {consumer.accept(this.scratchData());}
    public void scratchData(vulkan.VkDeviceOrHostAddressKHR value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__scratchData, LAYOUT__scratchData.byteSize());}

    public vulkan.VkDeviceOrHostAddressConstKHR triangleArray() {return new vulkan.VkDeviceOrHostAddressConstKHR(this.ptr.asSlice(OFFSET__triangleArray, LAYOUT__triangleArray));}
    public void triangleArray(java.util.function.Consumer<vulkan.VkDeviceOrHostAddressConstKHR> consumer) {consumer.accept(this.triangleArray());}
    public void triangleArray(vulkan.VkDeviceOrHostAddressConstKHR value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__triangleArray, LAYOUT__triangleArray.byteSize());}

    public long triangleArrayStride() {return this.ptr.get(LAYOUT__triangleArrayStride, OFFSET__triangleArrayStride);}
    public void triangleArrayStride(long value) {this.ptr.set(LAYOUT__triangleArrayStride, OFFSET__triangleArrayStride, value);}
    public java.lang.foreign.MemorySegment $triangleArrayStride() {return this.ptr.asSlice(OFFSET__triangleArrayStride, LAYOUT__triangleArrayStride);}
}
