package vulkan;

public record VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__clustercullingShader = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__clustercullingShader = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__multiviewClusterCullingShader = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__multiviewClusterCullingShader = 20;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__clustercullingShader,
            LAYOUT__multiviewClusterCullingShader
    ).withByteAlignment(8).withName("VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI");

    public VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int clustercullingShader() {return this.ptr.get(LAYOUT__clustercullingShader, OFFSET__clustercullingShader);}
    public void clustercullingShader(int value) {this.ptr.set(LAYOUT__clustercullingShader, OFFSET__clustercullingShader, value);}
    public java.lang.foreign.MemorySegment $clustercullingShader() {return this.ptr.asSlice(OFFSET__clustercullingShader, LAYOUT__clustercullingShader);}

    public int multiviewClusterCullingShader() {return this.ptr.get(LAYOUT__multiviewClusterCullingShader, OFFSET__multiviewClusterCullingShader);}
    public void multiviewClusterCullingShader(int value) {this.ptr.set(LAYOUT__multiviewClusterCullingShader, OFFSET__multiviewClusterCullingShader, value);}
    public java.lang.foreign.MemorySegment $multiviewClusterCullingShader() {return this.ptr.asSlice(OFFSET__multiviewClusterCullingShader, LAYOUT__multiviewClusterCullingShader);}
}
