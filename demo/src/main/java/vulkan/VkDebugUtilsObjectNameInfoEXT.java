package vulkan;

public record VkDebugUtilsObjectNameInfoEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__objectType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__objectType = 16;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__objectHandle = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__objectHandle = 24;
    public static final java.lang.foreign.AddressLayout LAYOUT__pObjectName = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pObjectName = 32;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__objectType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__objectHandle,
            LAYOUT__pObjectName
    ).withByteAlignment(8).withName("VkDebugUtilsObjectNameInfoEXT");

    public VkDebugUtilsObjectNameInfoEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkDebugUtilsObjectNameInfoEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkDebugUtilsObjectNameInfoEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkDebugUtilsObjectNameInfoEXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int objectType() {return this.ptr.get(LAYOUT__objectType, OFFSET__objectType);}
    public void objectType(int value) {this.ptr.set(LAYOUT__objectType, OFFSET__objectType, value);}
    public java.lang.foreign.MemorySegment $objectType() {return this.ptr.asSlice(OFFSET__objectType, LAYOUT__objectType);}

    public long objectHandle() {return this.ptr.get(LAYOUT__objectHandle, OFFSET__objectHandle);}
    public void objectHandle(long value) {this.ptr.set(LAYOUT__objectHandle, OFFSET__objectHandle, value);}
    public java.lang.foreign.MemorySegment $objectHandle() {return this.ptr.asSlice(OFFSET__objectHandle, LAYOUT__objectHandle);}

    public java.lang.foreign.MemorySegment pObjectName() {return this.ptr.get(LAYOUT__pObjectName, OFFSET__pObjectName);}
    public void pObjectName(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pObjectName, OFFSET__pObjectName, value);}
    public java.lang.foreign.MemorySegment $pObjectName() {return this.ptr.asSlice(OFFSET__pObjectName, LAYOUT__pObjectName);}
}
