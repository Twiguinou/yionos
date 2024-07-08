package vulkan;

public record VkDeviceMemoryReportCallbackDataEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__flags = java.lang.foreign.ValueLayout.JAVA_INT.withName("flags");
    public static final long OFFSET__flags = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__type = java.lang.foreign.ValueLayout.JAVA_INT.withName("type");
    public static final long OFFSET__type = 20;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__memoryObjectId = java.lang.foreign.ValueLayout.JAVA_LONG.withName("memoryObjectId");
    public static final long OFFSET__memoryObjectId = 24;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__size = java.lang.foreign.ValueLayout.JAVA_LONG.withName("size");
    public static final long OFFSET__size = 32;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__objectType = java.lang.foreign.ValueLayout.JAVA_INT.withName("objectType");
    public static final long OFFSET__objectType = 40;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__objectHandle = java.lang.foreign.ValueLayout.JAVA_LONG.withName("objectHandle");
    public static final long OFFSET__objectHandle = 48;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__heapIndex = java.lang.foreign.ValueLayout.JAVA_INT.withName("heapIndex");
    public static final long OFFSET__heapIndex = 56;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__flags,
            LAYOUT__type,
            LAYOUT__memoryObjectId,
            LAYOUT__size,
            LAYOUT__objectType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__objectHandle,
            LAYOUT__heapIndex,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkDeviceMemoryReportCallbackDataEXT");

    public VkDeviceMemoryReportCallbackDataEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkDeviceMemoryReportCallbackDataEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkDeviceMemoryReportCallbackDataEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkDeviceMemoryReportCallbackDataEXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int flags() {return this.ptr.get(LAYOUT__flags, OFFSET__flags);}
    public void flags(int value) {this.ptr.set(LAYOUT__flags, OFFSET__flags, value);}
    public java.lang.foreign.MemorySegment $flags() {return this.ptr.asSlice(OFFSET__flags, LAYOUT__flags);}

    public int type() {return this.ptr.get(LAYOUT__type, OFFSET__type);}
    public void type(int value) {this.ptr.set(LAYOUT__type, OFFSET__type, value);}
    public java.lang.foreign.MemorySegment $type() {return this.ptr.asSlice(OFFSET__type, LAYOUT__type);}

    public long memoryObjectId() {return this.ptr.get(LAYOUT__memoryObjectId, OFFSET__memoryObjectId);}
    public void memoryObjectId(long value) {this.ptr.set(LAYOUT__memoryObjectId, OFFSET__memoryObjectId, value);}
    public java.lang.foreign.MemorySegment $memoryObjectId() {return this.ptr.asSlice(OFFSET__memoryObjectId, LAYOUT__memoryObjectId);}

    public long size() {return this.ptr.get(LAYOUT__size, OFFSET__size);}
    public void size(long value) {this.ptr.set(LAYOUT__size, OFFSET__size, value);}
    public java.lang.foreign.MemorySegment $size() {return this.ptr.asSlice(OFFSET__size, LAYOUT__size);}

    public int objectType() {return this.ptr.get(LAYOUT__objectType, OFFSET__objectType);}
    public void objectType(int value) {this.ptr.set(LAYOUT__objectType, OFFSET__objectType, value);}
    public java.lang.foreign.MemorySegment $objectType() {return this.ptr.asSlice(OFFSET__objectType, LAYOUT__objectType);}

    public long objectHandle() {return this.ptr.get(LAYOUT__objectHandle, OFFSET__objectHandle);}
    public void objectHandle(long value) {this.ptr.set(LAYOUT__objectHandle, OFFSET__objectHandle, value);}
    public java.lang.foreign.MemorySegment $objectHandle() {return this.ptr.asSlice(OFFSET__objectHandle, LAYOUT__objectHandle);}

    public int heapIndex() {return this.ptr.get(LAYOUT__heapIndex, OFFSET__heapIndex);}
    public void heapIndex(int value) {this.ptr.set(LAYOUT__heapIndex, OFFSET__heapIndex, value);}
    public java.lang.foreign.MemorySegment $heapIndex() {return this.ptr.asSlice(OFFSET__heapIndex, LAYOUT__heapIndex);}
}
