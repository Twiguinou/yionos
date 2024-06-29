package vulkan;

public record VkDirectDriverLoadingListLUNARG(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__mode = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__mode = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__driverCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__driverCount = 20;
    public static final java.lang.foreign.AddressLayout LAYOUT__pDrivers = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pDrivers = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__mode,
            LAYOUT__driverCount,
            LAYOUT__pDrivers
    ).withByteAlignment(8).withName("VkDirectDriverLoadingListLUNARG");

    public VkDirectDriverLoadingListLUNARG(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkDirectDriverLoadingListLUNARG getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkDirectDriverLoadingListLUNARG(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkDirectDriverLoadingListLUNARG value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int mode() {return this.ptr.get(LAYOUT__mode, OFFSET__mode);}
    public void mode(int value) {this.ptr.set(LAYOUT__mode, OFFSET__mode, value);}
    public java.lang.foreign.MemorySegment $mode() {return this.ptr.asSlice(OFFSET__mode, LAYOUT__mode);}

    public int driverCount() {return this.ptr.get(LAYOUT__driverCount, OFFSET__driverCount);}
    public void driverCount(int value) {this.ptr.set(LAYOUT__driverCount, OFFSET__driverCount, value);}
    public java.lang.foreign.MemorySegment $driverCount() {return this.ptr.asSlice(OFFSET__driverCount, LAYOUT__driverCount);}

    public java.lang.foreign.MemorySegment pDrivers() {return this.ptr.get(LAYOUT__pDrivers, OFFSET__pDrivers);}
    public void pDrivers(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pDrivers, OFFSET__pDrivers, value);}
    public java.lang.foreign.MemorySegment $pDrivers() {return this.ptr.asSlice(OFFSET__pDrivers, LAYOUT__pDrivers);}
}
