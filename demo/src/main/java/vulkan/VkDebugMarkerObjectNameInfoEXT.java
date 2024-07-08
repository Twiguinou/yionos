package vulkan;

public record VkDebugMarkerObjectNameInfoEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__objectType = java.lang.foreign.ValueLayout.JAVA_INT.withName("objectType");
    public static final long OFFSET__objectType = 16;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__object = java.lang.foreign.ValueLayout.JAVA_LONG.withName("object");
    public static final long OFFSET__object = 24;
    public static final java.lang.foreign.AddressLayout LAYOUT__pObjectName = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pObjectName");
    public static final long OFFSET__pObjectName = 32;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__objectType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__object,
            LAYOUT__pObjectName
    ).withByteAlignment(8).withName("VkDebugMarkerObjectNameInfoEXT");

    public VkDebugMarkerObjectNameInfoEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkDebugMarkerObjectNameInfoEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkDebugMarkerObjectNameInfoEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkDebugMarkerObjectNameInfoEXT value)
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

    public long object() {return this.ptr.get(LAYOUT__object, OFFSET__object);}
    public void object(long value) {this.ptr.set(LAYOUT__object, OFFSET__object, value);}
    public java.lang.foreign.MemorySegment $object() {return this.ptr.asSlice(OFFSET__object, LAYOUT__object);}

    public java.lang.foreign.MemorySegment pObjectName() {return this.ptr.get(LAYOUT__pObjectName, OFFSET__pObjectName);}
    public void pObjectName(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pObjectName, OFFSET__pObjectName, value);}
    public java.lang.foreign.MemorySegment $pObjectName() {return this.ptr.asSlice(OFFSET__pObjectName, LAYOUT__pObjectName);}
}
