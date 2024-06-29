package vulkan;

public record VkShaderStatisticsInfoAMD(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderStageMask = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__shaderStageMask = 0;
    public static final java.lang.foreign.StructLayout LAYOUT__resourceUsage = vulkan.VkShaderResourceUsageAMD.gRecordLayout;
    public static final long OFFSET__resourceUsage = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__numPhysicalVgprs = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__numPhysicalVgprs = 40;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__numPhysicalSgprs = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__numPhysicalSgprs = 44;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__numAvailableVgprs = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__numAvailableVgprs = 48;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__numAvailableSgprs = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__numAvailableSgprs = 52;
    public static final java.lang.foreign.SequenceLayout LAYOUT__computeWorkGroupSize = java.lang.foreign.MemoryLayout.sequenceLayout(3, java.lang.foreign.ValueLayout.JAVA_INT);
    public static final long OFFSET__computeWorkGroupSize = 56;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__shaderStageMask,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__resourceUsage,
            LAYOUT__numPhysicalVgprs,
            LAYOUT__numPhysicalSgprs,
            LAYOUT__numAvailableVgprs,
            LAYOUT__numAvailableSgprs,
            LAYOUT__computeWorkGroupSize,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkShaderStatisticsInfoAMD");

    public VkShaderStatisticsInfoAMD(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkShaderStatisticsInfoAMD getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkShaderStatisticsInfoAMD(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkShaderStatisticsInfoAMD value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int shaderStageMask() {return this.ptr.get(LAYOUT__shaderStageMask, OFFSET__shaderStageMask);}
    public void shaderStageMask(int value) {this.ptr.set(LAYOUT__shaderStageMask, OFFSET__shaderStageMask, value);}
    public java.lang.foreign.MemorySegment $shaderStageMask() {return this.ptr.asSlice(OFFSET__shaderStageMask, LAYOUT__shaderStageMask);}

    public vulkan.VkShaderResourceUsageAMD resourceUsage() {return new vulkan.VkShaderResourceUsageAMD(this.ptr.asSlice(OFFSET__resourceUsage, LAYOUT__resourceUsage));}
    public void resourceUsage(java.util.function.Consumer<vulkan.VkShaderResourceUsageAMD> consumer) {consumer.accept(this.resourceUsage());}
    public void resourceUsage(vulkan.VkShaderResourceUsageAMD value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__resourceUsage, LAYOUT__resourceUsage.byteSize());}

    public int numPhysicalVgprs() {return this.ptr.get(LAYOUT__numPhysicalVgprs, OFFSET__numPhysicalVgprs);}
    public void numPhysicalVgprs(int value) {this.ptr.set(LAYOUT__numPhysicalVgprs, OFFSET__numPhysicalVgprs, value);}
    public java.lang.foreign.MemorySegment $numPhysicalVgprs() {return this.ptr.asSlice(OFFSET__numPhysicalVgprs, LAYOUT__numPhysicalVgprs);}

    public int numPhysicalSgprs() {return this.ptr.get(LAYOUT__numPhysicalSgprs, OFFSET__numPhysicalSgprs);}
    public void numPhysicalSgprs(int value) {this.ptr.set(LAYOUT__numPhysicalSgprs, OFFSET__numPhysicalSgprs, value);}
    public java.lang.foreign.MemorySegment $numPhysicalSgprs() {return this.ptr.asSlice(OFFSET__numPhysicalSgprs, LAYOUT__numPhysicalSgprs);}

    public int numAvailableVgprs() {return this.ptr.get(LAYOUT__numAvailableVgprs, OFFSET__numAvailableVgprs);}
    public void numAvailableVgprs(int value) {this.ptr.set(LAYOUT__numAvailableVgprs, OFFSET__numAvailableVgprs, value);}
    public java.lang.foreign.MemorySegment $numAvailableVgprs() {return this.ptr.asSlice(OFFSET__numAvailableVgprs, LAYOUT__numAvailableVgprs);}

    public int numAvailableSgprs() {return this.ptr.get(LAYOUT__numAvailableSgprs, OFFSET__numAvailableSgprs);}
    public void numAvailableSgprs(int value) {this.ptr.set(LAYOUT__numAvailableSgprs, OFFSET__numAvailableSgprs, value);}
    public java.lang.foreign.MemorySegment $numAvailableSgprs() {return this.ptr.asSlice(OFFSET__numAvailableSgprs, LAYOUT__numAvailableSgprs);}

    public java.lang.foreign.MemorySegment computeWorkGroupSize() {return this.ptr.asSlice(OFFSET__computeWorkGroupSize, LAYOUT__computeWorkGroupSize);}
    public int computeWorkGroupSize(int index) {return this.computeWorkGroupSize().getAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, index);}
    public void computeWorkGroupSize(int index, int value) {this.computeWorkGroupSize().setAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, index, value);}
}
