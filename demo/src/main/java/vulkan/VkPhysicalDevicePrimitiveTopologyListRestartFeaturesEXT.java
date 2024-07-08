package vulkan;

public record VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__primitiveTopologyListRestart = java.lang.foreign.ValueLayout.JAVA_INT.withName("primitiveTopologyListRestart");
    public static final long OFFSET__primitiveTopologyListRestart = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__primitiveTopologyPatchListRestart = java.lang.foreign.ValueLayout.JAVA_INT.withName("primitiveTopologyPatchListRestart");
    public static final long OFFSET__primitiveTopologyPatchListRestart = 20;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__primitiveTopologyListRestart,
            LAYOUT__primitiveTopologyPatchListRestart
    ).withByteAlignment(8).withName("VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT");

    public VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int primitiveTopologyListRestart() {return this.ptr.get(LAYOUT__primitiveTopologyListRestart, OFFSET__primitiveTopologyListRestart);}
    public void primitiveTopologyListRestart(int value) {this.ptr.set(LAYOUT__primitiveTopologyListRestart, OFFSET__primitiveTopologyListRestart, value);}
    public java.lang.foreign.MemorySegment $primitiveTopologyListRestart() {return this.ptr.asSlice(OFFSET__primitiveTopologyListRestart, LAYOUT__primitiveTopologyListRestart);}

    public int primitiveTopologyPatchListRestart() {return this.ptr.get(LAYOUT__primitiveTopologyPatchListRestart, OFFSET__primitiveTopologyPatchListRestart);}
    public void primitiveTopologyPatchListRestart(int value) {this.ptr.set(LAYOUT__primitiveTopologyPatchListRestart, OFFSET__primitiveTopologyPatchListRestart, value);}
    public java.lang.foreign.MemorySegment $primitiveTopologyPatchListRestart() {return this.ptr.asSlice(OFFSET__primitiveTopologyPatchListRestart, LAYOUT__primitiveTopologyPatchListRestart);}
}
