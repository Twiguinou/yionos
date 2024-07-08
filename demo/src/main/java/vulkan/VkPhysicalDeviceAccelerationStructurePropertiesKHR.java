package vulkan;

public record VkPhysicalDeviceAccelerationStructurePropertiesKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__maxGeometryCount = java.lang.foreign.ValueLayout.JAVA_LONG.withName("maxGeometryCount");
    public static final long OFFSET__maxGeometryCount = 16;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__maxInstanceCount = java.lang.foreign.ValueLayout.JAVA_LONG.withName("maxInstanceCount");
    public static final long OFFSET__maxInstanceCount = 24;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__maxPrimitiveCount = java.lang.foreign.ValueLayout.JAVA_LONG.withName("maxPrimitiveCount");
    public static final long OFFSET__maxPrimitiveCount = 32;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxPerStageDescriptorAccelerationStructures = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxPerStageDescriptorAccelerationStructures");
    public static final long OFFSET__maxPerStageDescriptorAccelerationStructures = 40;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxPerStageDescriptorUpdateAfterBindAccelerationStructures = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxPerStageDescriptorUpdateAfterBindAccelerationStructures");
    public static final long OFFSET__maxPerStageDescriptorUpdateAfterBindAccelerationStructures = 44;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxDescriptorSetAccelerationStructures = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxDescriptorSetAccelerationStructures");
    public static final long OFFSET__maxDescriptorSetAccelerationStructures = 48;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxDescriptorSetUpdateAfterBindAccelerationStructures = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxDescriptorSetUpdateAfterBindAccelerationStructures");
    public static final long OFFSET__maxDescriptorSetUpdateAfterBindAccelerationStructures = 52;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__minAccelerationStructureScratchOffsetAlignment = java.lang.foreign.ValueLayout.JAVA_INT.withName("minAccelerationStructureScratchOffsetAlignment");
    public static final long OFFSET__minAccelerationStructureScratchOffsetAlignment = 56;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__maxGeometryCount,
            LAYOUT__maxInstanceCount,
            LAYOUT__maxPrimitiveCount,
            LAYOUT__maxPerStageDescriptorAccelerationStructures,
            LAYOUT__maxPerStageDescriptorUpdateAfterBindAccelerationStructures,
            LAYOUT__maxDescriptorSetAccelerationStructures,
            LAYOUT__maxDescriptorSetUpdateAfterBindAccelerationStructures,
            LAYOUT__minAccelerationStructureScratchOffsetAlignment,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkPhysicalDeviceAccelerationStructurePropertiesKHR");

    public VkPhysicalDeviceAccelerationStructurePropertiesKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceAccelerationStructurePropertiesKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceAccelerationStructurePropertiesKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceAccelerationStructurePropertiesKHR value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public long maxGeometryCount() {return this.ptr.get(LAYOUT__maxGeometryCount, OFFSET__maxGeometryCount);}
    public void maxGeometryCount(long value) {this.ptr.set(LAYOUT__maxGeometryCount, OFFSET__maxGeometryCount, value);}
    public java.lang.foreign.MemorySegment $maxGeometryCount() {return this.ptr.asSlice(OFFSET__maxGeometryCount, LAYOUT__maxGeometryCount);}

    public long maxInstanceCount() {return this.ptr.get(LAYOUT__maxInstanceCount, OFFSET__maxInstanceCount);}
    public void maxInstanceCount(long value) {this.ptr.set(LAYOUT__maxInstanceCount, OFFSET__maxInstanceCount, value);}
    public java.lang.foreign.MemorySegment $maxInstanceCount() {return this.ptr.asSlice(OFFSET__maxInstanceCount, LAYOUT__maxInstanceCount);}

    public long maxPrimitiveCount() {return this.ptr.get(LAYOUT__maxPrimitiveCount, OFFSET__maxPrimitiveCount);}
    public void maxPrimitiveCount(long value) {this.ptr.set(LAYOUT__maxPrimitiveCount, OFFSET__maxPrimitiveCount, value);}
    public java.lang.foreign.MemorySegment $maxPrimitiveCount() {return this.ptr.asSlice(OFFSET__maxPrimitiveCount, LAYOUT__maxPrimitiveCount);}

    public int maxPerStageDescriptorAccelerationStructures() {return this.ptr.get(LAYOUT__maxPerStageDescriptorAccelerationStructures, OFFSET__maxPerStageDescriptorAccelerationStructures);}
    public void maxPerStageDescriptorAccelerationStructures(int value) {this.ptr.set(LAYOUT__maxPerStageDescriptorAccelerationStructures, OFFSET__maxPerStageDescriptorAccelerationStructures, value);}
    public java.lang.foreign.MemorySegment $maxPerStageDescriptorAccelerationStructures() {return this.ptr.asSlice(OFFSET__maxPerStageDescriptorAccelerationStructures, LAYOUT__maxPerStageDescriptorAccelerationStructures);}

    public int maxPerStageDescriptorUpdateAfterBindAccelerationStructures() {return this.ptr.get(LAYOUT__maxPerStageDescriptorUpdateAfterBindAccelerationStructures, OFFSET__maxPerStageDescriptorUpdateAfterBindAccelerationStructures);}
    public void maxPerStageDescriptorUpdateAfterBindAccelerationStructures(int value) {this.ptr.set(LAYOUT__maxPerStageDescriptorUpdateAfterBindAccelerationStructures, OFFSET__maxPerStageDescriptorUpdateAfterBindAccelerationStructures, value);}
    public java.lang.foreign.MemorySegment $maxPerStageDescriptorUpdateAfterBindAccelerationStructures() {return this.ptr.asSlice(OFFSET__maxPerStageDescriptorUpdateAfterBindAccelerationStructures, LAYOUT__maxPerStageDescriptorUpdateAfterBindAccelerationStructures);}

    public int maxDescriptorSetAccelerationStructures() {return this.ptr.get(LAYOUT__maxDescriptorSetAccelerationStructures, OFFSET__maxDescriptorSetAccelerationStructures);}
    public void maxDescriptorSetAccelerationStructures(int value) {this.ptr.set(LAYOUT__maxDescriptorSetAccelerationStructures, OFFSET__maxDescriptorSetAccelerationStructures, value);}
    public java.lang.foreign.MemorySegment $maxDescriptorSetAccelerationStructures() {return this.ptr.asSlice(OFFSET__maxDescriptorSetAccelerationStructures, LAYOUT__maxDescriptorSetAccelerationStructures);}

    public int maxDescriptorSetUpdateAfterBindAccelerationStructures() {return this.ptr.get(LAYOUT__maxDescriptorSetUpdateAfterBindAccelerationStructures, OFFSET__maxDescriptorSetUpdateAfterBindAccelerationStructures);}
    public void maxDescriptorSetUpdateAfterBindAccelerationStructures(int value) {this.ptr.set(LAYOUT__maxDescriptorSetUpdateAfterBindAccelerationStructures, OFFSET__maxDescriptorSetUpdateAfterBindAccelerationStructures, value);}
    public java.lang.foreign.MemorySegment $maxDescriptorSetUpdateAfterBindAccelerationStructures() {return this.ptr.asSlice(OFFSET__maxDescriptorSetUpdateAfterBindAccelerationStructures, LAYOUT__maxDescriptorSetUpdateAfterBindAccelerationStructures);}

    public int minAccelerationStructureScratchOffsetAlignment() {return this.ptr.get(LAYOUT__minAccelerationStructureScratchOffsetAlignment, OFFSET__minAccelerationStructureScratchOffsetAlignment);}
    public void minAccelerationStructureScratchOffsetAlignment(int value) {this.ptr.set(LAYOUT__minAccelerationStructureScratchOffsetAlignment, OFFSET__minAccelerationStructureScratchOffsetAlignment, value);}
    public java.lang.foreign.MemorySegment $minAccelerationStructureScratchOffsetAlignment() {return this.ptr.asSlice(OFFSET__minAccelerationStructureScratchOffsetAlignment, LAYOUT__minAccelerationStructureScratchOffsetAlignment);}
}
