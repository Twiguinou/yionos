package vulkan;

public record VkShaderResourceUsageAMD(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__numUsedVgprs = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__numUsedVgprs = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__numUsedSgprs = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__numUsedSgprs = 4;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__ldsSizePerLocalWorkGroup = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__ldsSizePerLocalWorkGroup = 8;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__ldsUsageSizeInBytes = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__ldsUsageSizeInBytes = 16;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__scratchMemUsageInBytes = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__scratchMemUsageInBytes = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__numUsedVgprs,
            LAYOUT__numUsedSgprs,
            LAYOUT__ldsSizePerLocalWorkGroup,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__ldsUsageSizeInBytes,
            LAYOUT__scratchMemUsageInBytes
    ).withByteAlignment(8).withName("VkShaderResourceUsageAMD");

    public VkShaderResourceUsageAMD(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkShaderResourceUsageAMD getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkShaderResourceUsageAMD(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkShaderResourceUsageAMD value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int numUsedVgprs() {return this.ptr.get(LAYOUT__numUsedVgprs, OFFSET__numUsedVgprs);}
    public void numUsedVgprs(int value) {this.ptr.set(LAYOUT__numUsedVgprs, OFFSET__numUsedVgprs, value);}
    public java.lang.foreign.MemorySegment $numUsedVgprs() {return this.ptr.asSlice(OFFSET__numUsedVgprs, LAYOUT__numUsedVgprs);}

    public int numUsedSgprs() {return this.ptr.get(LAYOUT__numUsedSgprs, OFFSET__numUsedSgprs);}
    public void numUsedSgprs(int value) {this.ptr.set(LAYOUT__numUsedSgprs, OFFSET__numUsedSgprs, value);}
    public java.lang.foreign.MemorySegment $numUsedSgprs() {return this.ptr.asSlice(OFFSET__numUsedSgprs, LAYOUT__numUsedSgprs);}

    public int ldsSizePerLocalWorkGroup() {return this.ptr.get(LAYOUT__ldsSizePerLocalWorkGroup, OFFSET__ldsSizePerLocalWorkGroup);}
    public void ldsSizePerLocalWorkGroup(int value) {this.ptr.set(LAYOUT__ldsSizePerLocalWorkGroup, OFFSET__ldsSizePerLocalWorkGroup, value);}
    public java.lang.foreign.MemorySegment $ldsSizePerLocalWorkGroup() {return this.ptr.asSlice(OFFSET__ldsSizePerLocalWorkGroup, LAYOUT__ldsSizePerLocalWorkGroup);}

    public long ldsUsageSizeInBytes() {return this.ptr.get(LAYOUT__ldsUsageSizeInBytes, OFFSET__ldsUsageSizeInBytes);}
    public void ldsUsageSizeInBytes(long value) {this.ptr.set(LAYOUT__ldsUsageSizeInBytes, OFFSET__ldsUsageSizeInBytes, value);}
    public java.lang.foreign.MemorySegment $ldsUsageSizeInBytes() {return this.ptr.asSlice(OFFSET__ldsUsageSizeInBytes, LAYOUT__ldsUsageSizeInBytes);}

    public long scratchMemUsageInBytes() {return this.ptr.get(LAYOUT__scratchMemUsageInBytes, OFFSET__scratchMemUsageInBytes);}
    public void scratchMemUsageInBytes(long value) {this.ptr.set(LAYOUT__scratchMemUsageInBytes, OFFSET__scratchMemUsageInBytes, value);}
    public java.lang.foreign.MemorySegment $scratchMemUsageInBytes() {return this.ptr.asSlice(OFFSET__scratchMemUsageInBytes, LAYOUT__scratchMemUsageInBytes);}
}
