package vulkan;

public record VkPhysicalDeviceAccelerationStructureFeaturesKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__accelerationStructure = java.lang.foreign.ValueLayout.JAVA_INT.withName("accelerationStructure");
    public static final long OFFSET__accelerationStructure = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__accelerationStructureCaptureReplay = java.lang.foreign.ValueLayout.JAVA_INT.withName("accelerationStructureCaptureReplay");
    public static final long OFFSET__accelerationStructureCaptureReplay = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__accelerationStructureIndirectBuild = java.lang.foreign.ValueLayout.JAVA_INT.withName("accelerationStructureIndirectBuild");
    public static final long OFFSET__accelerationStructureIndirectBuild = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__accelerationStructureHostCommands = java.lang.foreign.ValueLayout.JAVA_INT.withName("accelerationStructureHostCommands");
    public static final long OFFSET__accelerationStructureHostCommands = 28;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__descriptorBindingAccelerationStructureUpdateAfterBind = java.lang.foreign.ValueLayout.JAVA_INT.withName("descriptorBindingAccelerationStructureUpdateAfterBind");
    public static final long OFFSET__descriptorBindingAccelerationStructureUpdateAfterBind = 32;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__accelerationStructure,
            LAYOUT__accelerationStructureCaptureReplay,
            LAYOUT__accelerationStructureIndirectBuild,
            LAYOUT__accelerationStructureHostCommands,
            LAYOUT__descriptorBindingAccelerationStructureUpdateAfterBind,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkPhysicalDeviceAccelerationStructureFeaturesKHR");

    public VkPhysicalDeviceAccelerationStructureFeaturesKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceAccelerationStructureFeaturesKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceAccelerationStructureFeaturesKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceAccelerationStructureFeaturesKHR value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int accelerationStructure() {return this.ptr.get(LAYOUT__accelerationStructure, OFFSET__accelerationStructure);}
    public void accelerationStructure(int value) {this.ptr.set(LAYOUT__accelerationStructure, OFFSET__accelerationStructure, value);}
    public java.lang.foreign.MemorySegment $accelerationStructure() {return this.ptr.asSlice(OFFSET__accelerationStructure, LAYOUT__accelerationStructure);}

    public int accelerationStructureCaptureReplay() {return this.ptr.get(LAYOUT__accelerationStructureCaptureReplay, OFFSET__accelerationStructureCaptureReplay);}
    public void accelerationStructureCaptureReplay(int value) {this.ptr.set(LAYOUT__accelerationStructureCaptureReplay, OFFSET__accelerationStructureCaptureReplay, value);}
    public java.lang.foreign.MemorySegment $accelerationStructureCaptureReplay() {return this.ptr.asSlice(OFFSET__accelerationStructureCaptureReplay, LAYOUT__accelerationStructureCaptureReplay);}

    public int accelerationStructureIndirectBuild() {return this.ptr.get(LAYOUT__accelerationStructureIndirectBuild, OFFSET__accelerationStructureIndirectBuild);}
    public void accelerationStructureIndirectBuild(int value) {this.ptr.set(LAYOUT__accelerationStructureIndirectBuild, OFFSET__accelerationStructureIndirectBuild, value);}
    public java.lang.foreign.MemorySegment $accelerationStructureIndirectBuild() {return this.ptr.asSlice(OFFSET__accelerationStructureIndirectBuild, LAYOUT__accelerationStructureIndirectBuild);}

    public int accelerationStructureHostCommands() {return this.ptr.get(LAYOUT__accelerationStructureHostCommands, OFFSET__accelerationStructureHostCommands);}
    public void accelerationStructureHostCommands(int value) {this.ptr.set(LAYOUT__accelerationStructureHostCommands, OFFSET__accelerationStructureHostCommands, value);}
    public java.lang.foreign.MemorySegment $accelerationStructureHostCommands() {return this.ptr.asSlice(OFFSET__accelerationStructureHostCommands, LAYOUT__accelerationStructureHostCommands);}

    public int descriptorBindingAccelerationStructureUpdateAfterBind() {return this.ptr.get(LAYOUT__descriptorBindingAccelerationStructureUpdateAfterBind, OFFSET__descriptorBindingAccelerationStructureUpdateAfterBind);}
    public void descriptorBindingAccelerationStructureUpdateAfterBind(int value) {this.ptr.set(LAYOUT__descriptorBindingAccelerationStructureUpdateAfterBind, OFFSET__descriptorBindingAccelerationStructureUpdateAfterBind, value);}
    public java.lang.foreign.MemorySegment $descriptorBindingAccelerationStructureUpdateAfterBind() {return this.ptr.asSlice(OFFSET__descriptorBindingAccelerationStructureUpdateAfterBind, LAYOUT__descriptorBindingAccelerationStructureUpdateAfterBind);}
}
