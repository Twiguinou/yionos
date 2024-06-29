package vulkan;

public record VkPerformanceCounterKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__unit = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__unit = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__scope = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__scope = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__storage = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__storage = 24;
    public static final java.lang.foreign.SequenceLayout LAYOUT__uuid = java.lang.foreign.MemoryLayout.sequenceLayout(16, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET__uuid = 28;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__unit,
            LAYOUT__scope,
            LAYOUT__storage,
            LAYOUT__uuid,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkPerformanceCounterKHR");

    public VkPerformanceCounterKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPerformanceCounterKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPerformanceCounterKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPerformanceCounterKHR value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int unit() {return this.ptr.get(LAYOUT__unit, OFFSET__unit);}
    public void unit(int value) {this.ptr.set(LAYOUT__unit, OFFSET__unit, value);}
    public java.lang.foreign.MemorySegment $unit() {return this.ptr.asSlice(OFFSET__unit, LAYOUT__unit);}

    public int scope() {return this.ptr.get(LAYOUT__scope, OFFSET__scope);}
    public void scope(int value) {this.ptr.set(LAYOUT__scope, OFFSET__scope, value);}
    public java.lang.foreign.MemorySegment $scope() {return this.ptr.asSlice(OFFSET__scope, LAYOUT__scope);}

    public int storage() {return this.ptr.get(LAYOUT__storage, OFFSET__storage);}
    public void storage(int value) {this.ptr.set(LAYOUT__storage, OFFSET__storage, value);}
    public java.lang.foreign.MemorySegment $storage() {return this.ptr.asSlice(OFFSET__storage, LAYOUT__storage);}

    public java.lang.foreign.MemorySegment uuid() {return this.ptr.asSlice(OFFSET__uuid, LAYOUT__uuid);}
    public byte uuid(int index) {return this.uuid().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index);}
    public void uuid(int index, byte value) {this.uuid().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index, value);}
}
