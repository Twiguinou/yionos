package vulkan;

public record VkAccelerationStructureBuildGeometryInfoKHR(java.lang.foreign.MemorySegment ptr)
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
    public static final java.lang.foreign.AddressLayout LAYOUT__srcAccelerationStructure = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("srcAccelerationStructure");
    public static final long OFFSET__srcAccelerationStructure = 32;
    public static final java.lang.foreign.AddressLayout LAYOUT__dstAccelerationStructure = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("dstAccelerationStructure");
    public static final long OFFSET__dstAccelerationStructure = 40;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__geometryCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("geometryCount");
    public static final long OFFSET__geometryCount = 48;
    public static final java.lang.foreign.AddressLayout LAYOUT__pGeometries = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pGeometries");
    public static final long OFFSET__pGeometries = 56;
    public static final java.lang.foreign.AddressLayout LAYOUT__ppGeometries = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("ppGeometries");
    public static final long OFFSET__ppGeometries = 64;
    public static final java.lang.foreign.UnionLayout LAYOUT__scratchData = vulkan.VkDeviceOrHostAddressKHR.gRecordLayout.withName("scratchData");
    public static final long OFFSET__scratchData = 72;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__type,
            LAYOUT__flags,
            LAYOUT__mode,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__srcAccelerationStructure,
            LAYOUT__dstAccelerationStructure,
            LAYOUT__geometryCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pGeometries,
            LAYOUT__ppGeometries,
            LAYOUT__scratchData
    ).withByteAlignment(8).withName("VkAccelerationStructureBuildGeometryInfoKHR");

    public VkAccelerationStructureBuildGeometryInfoKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkAccelerationStructureBuildGeometryInfoKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkAccelerationStructureBuildGeometryInfoKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkAccelerationStructureBuildGeometryInfoKHR value)
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

    public java.lang.foreign.MemorySegment srcAccelerationStructure() {return this.ptr.get(LAYOUT__srcAccelerationStructure, OFFSET__srcAccelerationStructure);}
    public void srcAccelerationStructure(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__srcAccelerationStructure, OFFSET__srcAccelerationStructure, value);}
    public java.lang.foreign.MemorySegment $srcAccelerationStructure() {return this.ptr.asSlice(OFFSET__srcAccelerationStructure, LAYOUT__srcAccelerationStructure);}

    public java.lang.foreign.MemorySegment dstAccelerationStructure() {return this.ptr.get(LAYOUT__dstAccelerationStructure, OFFSET__dstAccelerationStructure);}
    public void dstAccelerationStructure(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__dstAccelerationStructure, OFFSET__dstAccelerationStructure, value);}
    public java.lang.foreign.MemorySegment $dstAccelerationStructure() {return this.ptr.asSlice(OFFSET__dstAccelerationStructure, LAYOUT__dstAccelerationStructure);}

    public int geometryCount() {return this.ptr.get(LAYOUT__geometryCount, OFFSET__geometryCount);}
    public void geometryCount(int value) {this.ptr.set(LAYOUT__geometryCount, OFFSET__geometryCount, value);}
    public java.lang.foreign.MemorySegment $geometryCount() {return this.ptr.asSlice(OFFSET__geometryCount, LAYOUT__geometryCount);}

    public java.lang.foreign.MemorySegment pGeometries() {return this.ptr.get(LAYOUT__pGeometries, OFFSET__pGeometries);}
    public void pGeometries(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pGeometries, OFFSET__pGeometries, value);}
    public java.lang.foreign.MemorySegment $pGeometries() {return this.ptr.asSlice(OFFSET__pGeometries, LAYOUT__pGeometries);}

    public java.lang.foreign.MemorySegment ppGeometries() {return this.ptr.get(LAYOUT__ppGeometries, OFFSET__ppGeometries);}
    public void ppGeometries(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__ppGeometries, OFFSET__ppGeometries, value);}
    public java.lang.foreign.MemorySegment $ppGeometries() {return this.ptr.asSlice(OFFSET__ppGeometries, LAYOUT__ppGeometries);}

    public vulkan.VkDeviceOrHostAddressKHR scratchData() {return new vulkan.VkDeviceOrHostAddressKHR(this.ptr.asSlice(OFFSET__scratchData, LAYOUT__scratchData));}
    public void scratchData(java.util.function.Consumer<vulkan.VkDeviceOrHostAddressKHR> consumer) {consumer.accept(this.scratchData());}
    public void scratchData(vulkan.VkDeviceOrHostAddressKHR value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__scratchData, LAYOUT__scratchData.byteSize());}
}
