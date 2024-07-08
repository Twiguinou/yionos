package vulkan;

public record VkPhysicalDeviceExtendedDynamicState2FeaturesEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__extendedDynamicState2 = java.lang.foreign.ValueLayout.JAVA_INT.withName("extendedDynamicState2");
    public static final long OFFSET__extendedDynamicState2 = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__extendedDynamicState2LogicOp = java.lang.foreign.ValueLayout.JAVA_INT.withName("extendedDynamicState2LogicOp");
    public static final long OFFSET__extendedDynamicState2LogicOp = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__extendedDynamicState2PatchControlPoints = java.lang.foreign.ValueLayout.JAVA_INT.withName("extendedDynamicState2PatchControlPoints");
    public static final long OFFSET__extendedDynamicState2PatchControlPoints = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__extendedDynamicState2,
            LAYOUT__extendedDynamicState2LogicOp,
            LAYOUT__extendedDynamicState2PatchControlPoints,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkPhysicalDeviceExtendedDynamicState2FeaturesEXT");

    public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceExtendedDynamicState2FeaturesEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceExtendedDynamicState2FeaturesEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceExtendedDynamicState2FeaturesEXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int extendedDynamicState2() {return this.ptr.get(LAYOUT__extendedDynamicState2, OFFSET__extendedDynamicState2);}
    public void extendedDynamicState2(int value) {this.ptr.set(LAYOUT__extendedDynamicState2, OFFSET__extendedDynamicState2, value);}
    public java.lang.foreign.MemorySegment $extendedDynamicState2() {return this.ptr.asSlice(OFFSET__extendedDynamicState2, LAYOUT__extendedDynamicState2);}

    public int extendedDynamicState2LogicOp() {return this.ptr.get(LAYOUT__extendedDynamicState2LogicOp, OFFSET__extendedDynamicState2LogicOp);}
    public void extendedDynamicState2LogicOp(int value) {this.ptr.set(LAYOUT__extendedDynamicState2LogicOp, OFFSET__extendedDynamicState2LogicOp, value);}
    public java.lang.foreign.MemorySegment $extendedDynamicState2LogicOp() {return this.ptr.asSlice(OFFSET__extendedDynamicState2LogicOp, LAYOUT__extendedDynamicState2LogicOp);}

    public int extendedDynamicState2PatchControlPoints() {return this.ptr.get(LAYOUT__extendedDynamicState2PatchControlPoints, OFFSET__extendedDynamicState2PatchControlPoints);}
    public void extendedDynamicState2PatchControlPoints(int value) {this.ptr.set(LAYOUT__extendedDynamicState2PatchControlPoints, OFFSET__extendedDynamicState2PatchControlPoints, value);}
    public java.lang.foreign.MemorySegment $extendedDynamicState2PatchControlPoints() {return this.ptr.asSlice(OFFSET__extendedDynamicState2PatchControlPoints, LAYOUT__extendedDynamicState2PatchControlPoints);}
}
