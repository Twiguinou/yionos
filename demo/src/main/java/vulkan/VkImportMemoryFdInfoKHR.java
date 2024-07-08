package vulkan;

public record VkImportMemoryFdInfoKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__handleType = java.lang.foreign.ValueLayout.JAVA_INT.withName("handleType");
    public static final long OFFSET__handleType = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__fd = java.lang.foreign.ValueLayout.JAVA_INT.withName("fd");
    public static final long OFFSET__fd = 20;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__handleType,
            LAYOUT__fd
    ).withByteAlignment(8).withName("VkImportMemoryFdInfoKHR");

    public VkImportMemoryFdInfoKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkImportMemoryFdInfoKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkImportMemoryFdInfoKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkImportMemoryFdInfoKHR value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int handleType() {return this.ptr.get(LAYOUT__handleType, OFFSET__handleType);}
    public void handleType(int value) {this.ptr.set(LAYOUT__handleType, OFFSET__handleType, value);}
    public java.lang.foreign.MemorySegment $handleType() {return this.ptr.asSlice(OFFSET__handleType, LAYOUT__handleType);}

    public int fd() {return this.ptr.get(LAYOUT__fd, OFFSET__fd);}
    public void fd(int value) {this.ptr.set(LAYOUT__fd, OFFSET__fd, value);}
    public java.lang.foreign.MemorySegment $fd() {return this.ptr.asSlice(OFFSET__fd, LAYOUT__fd);}
}
