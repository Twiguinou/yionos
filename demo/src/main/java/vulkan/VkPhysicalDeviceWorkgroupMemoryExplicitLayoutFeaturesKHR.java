package vulkan;

public record VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__workgroupMemoryExplicitLayout = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__workgroupMemoryExplicitLayout = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__workgroupMemoryExplicitLayoutScalarBlockLayout = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__workgroupMemoryExplicitLayoutScalarBlockLayout = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__workgroupMemoryExplicitLayout8BitAccess = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__workgroupMemoryExplicitLayout8BitAccess = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__workgroupMemoryExplicitLayout16BitAccess = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__workgroupMemoryExplicitLayout16BitAccess = 28;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__workgroupMemoryExplicitLayout,
            LAYOUT__workgroupMemoryExplicitLayoutScalarBlockLayout,
            LAYOUT__workgroupMemoryExplicitLayout8BitAccess,
            LAYOUT__workgroupMemoryExplicitLayout16BitAccess
    ).withByteAlignment(8).withName("VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR");

    public VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int workgroupMemoryExplicitLayout() {return this.ptr.get(LAYOUT__workgroupMemoryExplicitLayout, OFFSET__workgroupMemoryExplicitLayout);}
    public void workgroupMemoryExplicitLayout(int value) {this.ptr.set(LAYOUT__workgroupMemoryExplicitLayout, OFFSET__workgroupMemoryExplicitLayout, value);}
    public java.lang.foreign.MemorySegment $workgroupMemoryExplicitLayout() {return this.ptr.asSlice(OFFSET__workgroupMemoryExplicitLayout, LAYOUT__workgroupMemoryExplicitLayout);}

    public int workgroupMemoryExplicitLayoutScalarBlockLayout() {return this.ptr.get(LAYOUT__workgroupMemoryExplicitLayoutScalarBlockLayout, OFFSET__workgroupMemoryExplicitLayoutScalarBlockLayout);}
    public void workgroupMemoryExplicitLayoutScalarBlockLayout(int value) {this.ptr.set(LAYOUT__workgroupMemoryExplicitLayoutScalarBlockLayout, OFFSET__workgroupMemoryExplicitLayoutScalarBlockLayout, value);}
    public java.lang.foreign.MemorySegment $workgroupMemoryExplicitLayoutScalarBlockLayout() {return this.ptr.asSlice(OFFSET__workgroupMemoryExplicitLayoutScalarBlockLayout, LAYOUT__workgroupMemoryExplicitLayoutScalarBlockLayout);}

    public int workgroupMemoryExplicitLayout8BitAccess() {return this.ptr.get(LAYOUT__workgroupMemoryExplicitLayout8BitAccess, OFFSET__workgroupMemoryExplicitLayout8BitAccess);}
    public void workgroupMemoryExplicitLayout8BitAccess(int value) {this.ptr.set(LAYOUT__workgroupMemoryExplicitLayout8BitAccess, OFFSET__workgroupMemoryExplicitLayout8BitAccess, value);}
    public java.lang.foreign.MemorySegment $workgroupMemoryExplicitLayout8BitAccess() {return this.ptr.asSlice(OFFSET__workgroupMemoryExplicitLayout8BitAccess, LAYOUT__workgroupMemoryExplicitLayout8BitAccess);}

    public int workgroupMemoryExplicitLayout16BitAccess() {return this.ptr.get(LAYOUT__workgroupMemoryExplicitLayout16BitAccess, OFFSET__workgroupMemoryExplicitLayout16BitAccess);}
    public void workgroupMemoryExplicitLayout16BitAccess(int value) {this.ptr.set(LAYOUT__workgroupMemoryExplicitLayout16BitAccess, OFFSET__workgroupMemoryExplicitLayout16BitAccess, value);}
    public java.lang.foreign.MemorySegment $workgroupMemoryExplicitLayout16BitAccess() {return this.ptr.asSlice(OFFSET__workgroupMemoryExplicitLayout16BitAccess, LAYOUT__workgroupMemoryExplicitLayout16BitAccess);}
}
