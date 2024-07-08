package vulkan;

public record VkMemoryGetFdInfoKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.AddressLayout LAYOUT__memory = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("memory");
    public static final long OFFSET__memory = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__handleType = java.lang.foreign.ValueLayout.JAVA_INT.withName("handleType");
    public static final long OFFSET__handleType = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__memory,
            LAYOUT__handleType,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkMemoryGetFdInfoKHR");

    public VkMemoryGetFdInfoKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkMemoryGetFdInfoKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkMemoryGetFdInfoKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkMemoryGetFdInfoKHR value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public java.lang.foreign.MemorySegment memory() {return this.ptr.get(LAYOUT__memory, OFFSET__memory);}
    public void memory(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__memory, OFFSET__memory, value);}
    public java.lang.foreign.MemorySegment $memory() {return this.ptr.asSlice(OFFSET__memory, LAYOUT__memory);}

    public int handleType() {return this.ptr.get(LAYOUT__handleType, OFFSET__handleType);}
    public void handleType(int value) {this.ptr.set(LAYOUT__handleType, OFFSET__handleType, value);}
    public java.lang.foreign.MemorySegment $handleType() {return this.ptr.asSlice(OFFSET__handleType, LAYOUT__handleType);}
}
