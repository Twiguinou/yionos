package vulkan;

public record VkPhysicalDeviceMultiviewFeatures(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__multiview = java.lang.foreign.ValueLayout.JAVA_INT.withName("multiview");
    public static final long OFFSET__multiview = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__multiviewGeometryShader = java.lang.foreign.ValueLayout.JAVA_INT.withName("multiviewGeometryShader");
    public static final long OFFSET__multiviewGeometryShader = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__multiviewTessellationShader = java.lang.foreign.ValueLayout.JAVA_INT.withName("multiviewTessellationShader");
    public static final long OFFSET__multiviewTessellationShader = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__multiview,
            LAYOUT__multiviewGeometryShader,
            LAYOUT__multiviewTessellationShader,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkPhysicalDeviceMultiviewFeatures");

    public VkPhysicalDeviceMultiviewFeatures(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceMultiviewFeatures getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceMultiviewFeatures(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceMultiviewFeatures value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int multiview() {return this.ptr.get(LAYOUT__multiview, OFFSET__multiview);}
    public void multiview(int value) {this.ptr.set(LAYOUT__multiview, OFFSET__multiview, value);}
    public java.lang.foreign.MemorySegment $multiview() {return this.ptr.asSlice(OFFSET__multiview, LAYOUT__multiview);}

    public int multiviewGeometryShader() {return this.ptr.get(LAYOUT__multiviewGeometryShader, OFFSET__multiviewGeometryShader);}
    public void multiviewGeometryShader(int value) {this.ptr.set(LAYOUT__multiviewGeometryShader, OFFSET__multiviewGeometryShader, value);}
    public java.lang.foreign.MemorySegment $multiviewGeometryShader() {return this.ptr.asSlice(OFFSET__multiviewGeometryShader, LAYOUT__multiviewGeometryShader);}

    public int multiviewTessellationShader() {return this.ptr.get(LAYOUT__multiviewTessellationShader, OFFSET__multiviewTessellationShader);}
    public void multiviewTessellationShader(int value) {this.ptr.set(LAYOUT__multiviewTessellationShader, OFFSET__multiviewTessellationShader, value);}
    public java.lang.foreign.MemorySegment $multiviewTessellationShader() {return this.ptr.asSlice(OFFSET__multiviewTessellationShader, LAYOUT__multiviewTessellationShader);}
}
