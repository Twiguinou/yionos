package vulkan;

public record VkPhysicalDeviceFragmentDensityMap2PropertiesEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__subsampledLoads = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__subsampledLoads = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__subsampledCoarseReconstructionEarlyAccess = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__subsampledCoarseReconstructionEarlyAccess = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxSubsampledArrayLayers = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__maxSubsampledArrayLayers = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxDescriptorSetSubsampledSamplers = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__maxDescriptorSetSubsampledSamplers = 28;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__subsampledLoads,
            LAYOUT__subsampledCoarseReconstructionEarlyAccess,
            LAYOUT__maxSubsampledArrayLayers,
            LAYOUT__maxDescriptorSetSubsampledSamplers
    ).withByteAlignment(8).withName("VkPhysicalDeviceFragmentDensityMap2PropertiesEXT");

    public VkPhysicalDeviceFragmentDensityMap2PropertiesEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceFragmentDensityMap2PropertiesEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceFragmentDensityMap2PropertiesEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceFragmentDensityMap2PropertiesEXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int subsampledLoads() {return this.ptr.get(LAYOUT__subsampledLoads, OFFSET__subsampledLoads);}
    public void subsampledLoads(int value) {this.ptr.set(LAYOUT__subsampledLoads, OFFSET__subsampledLoads, value);}
    public java.lang.foreign.MemorySegment $subsampledLoads() {return this.ptr.asSlice(OFFSET__subsampledLoads, LAYOUT__subsampledLoads);}

    public int subsampledCoarseReconstructionEarlyAccess() {return this.ptr.get(LAYOUT__subsampledCoarseReconstructionEarlyAccess, OFFSET__subsampledCoarseReconstructionEarlyAccess);}
    public void subsampledCoarseReconstructionEarlyAccess(int value) {this.ptr.set(LAYOUT__subsampledCoarseReconstructionEarlyAccess, OFFSET__subsampledCoarseReconstructionEarlyAccess, value);}
    public java.lang.foreign.MemorySegment $subsampledCoarseReconstructionEarlyAccess() {return this.ptr.asSlice(OFFSET__subsampledCoarseReconstructionEarlyAccess, LAYOUT__subsampledCoarseReconstructionEarlyAccess);}

    public int maxSubsampledArrayLayers() {return this.ptr.get(LAYOUT__maxSubsampledArrayLayers, OFFSET__maxSubsampledArrayLayers);}
    public void maxSubsampledArrayLayers(int value) {this.ptr.set(LAYOUT__maxSubsampledArrayLayers, OFFSET__maxSubsampledArrayLayers, value);}
    public java.lang.foreign.MemorySegment $maxSubsampledArrayLayers() {return this.ptr.asSlice(OFFSET__maxSubsampledArrayLayers, LAYOUT__maxSubsampledArrayLayers);}

    public int maxDescriptorSetSubsampledSamplers() {return this.ptr.get(LAYOUT__maxDescriptorSetSubsampledSamplers, OFFSET__maxDescriptorSetSubsampledSamplers);}
    public void maxDescriptorSetSubsampledSamplers(int value) {this.ptr.set(LAYOUT__maxDescriptorSetSubsampledSamplers, OFFSET__maxDescriptorSetSubsampledSamplers, value);}
    public java.lang.foreign.MemorySegment $maxDescriptorSetSubsampledSamplers() {return this.ptr.asSlice(OFFSET__maxDescriptorSetSubsampledSamplers, LAYOUT__maxDescriptorSetSubsampledSamplers);}
}
