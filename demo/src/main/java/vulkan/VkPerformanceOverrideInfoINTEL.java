package vulkan;

public record VkPerformanceOverrideInfoINTEL(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__type = java.lang.foreign.ValueLayout.JAVA_INT.withName("type");
    public static final long OFFSET__type = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__enable = java.lang.foreign.ValueLayout.JAVA_INT.withName("enable");
    public static final long OFFSET__enable = 20;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__parameter = java.lang.foreign.ValueLayout.JAVA_LONG.withName("parameter");
    public static final long OFFSET__parameter = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__type,
            LAYOUT__enable,
            LAYOUT__parameter
    ).withByteAlignment(8).withName("VkPerformanceOverrideInfoINTEL");

    public VkPerformanceOverrideInfoINTEL(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPerformanceOverrideInfoINTEL getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPerformanceOverrideInfoINTEL(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPerformanceOverrideInfoINTEL value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int type() {return this.ptr.get(LAYOUT__type, OFFSET__type);}
    public void type(int value) {this.ptr.set(LAYOUT__type, OFFSET__type, value);}
    public java.lang.foreign.MemorySegment $type() {return this.ptr.asSlice(OFFSET__type, LAYOUT__type);}

    public int enable() {return this.ptr.get(LAYOUT__enable, OFFSET__enable);}
    public void enable(int value) {this.ptr.set(LAYOUT__enable, OFFSET__enable, value);}
    public java.lang.foreign.MemorySegment $enable() {return this.ptr.asSlice(OFFSET__enable, LAYOUT__enable);}

    public long parameter() {return this.ptr.get(LAYOUT__parameter, OFFSET__parameter);}
    public void parameter(long value) {this.ptr.set(LAYOUT__parameter, OFFSET__parameter, value);}
    public java.lang.foreign.MemorySegment $parameter() {return this.ptr.asSlice(OFFSET__parameter, LAYOUT__parameter);}
}
