package vulkan;

public record VkBindVideoSessionMemoryInfoKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__memoryBindIndex = java.lang.foreign.ValueLayout.JAVA_INT.withName("memoryBindIndex");
    public static final long OFFSET__memoryBindIndex = 16;
    public static final java.lang.foreign.AddressLayout LAYOUT__memory = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("memory");
    public static final long OFFSET__memory = 24;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__memoryOffset = java.lang.foreign.ValueLayout.JAVA_LONG.withName("memoryOffset");
    public static final long OFFSET__memoryOffset = 32;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__memorySize = java.lang.foreign.ValueLayout.JAVA_LONG.withName("memorySize");
    public static final long OFFSET__memorySize = 40;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__memoryBindIndex,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__memory,
            LAYOUT__memoryOffset,
            LAYOUT__memorySize
    ).withByteAlignment(8).withName("VkBindVideoSessionMemoryInfoKHR");

    public VkBindVideoSessionMemoryInfoKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkBindVideoSessionMemoryInfoKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkBindVideoSessionMemoryInfoKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkBindVideoSessionMemoryInfoKHR value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int memoryBindIndex() {return this.ptr.get(LAYOUT__memoryBindIndex, OFFSET__memoryBindIndex);}
    public void memoryBindIndex(int value) {this.ptr.set(LAYOUT__memoryBindIndex, OFFSET__memoryBindIndex, value);}
    public java.lang.foreign.MemorySegment $memoryBindIndex() {return this.ptr.asSlice(OFFSET__memoryBindIndex, LAYOUT__memoryBindIndex);}

    public java.lang.foreign.MemorySegment memory() {return this.ptr.get(LAYOUT__memory, OFFSET__memory);}
    public void memory(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__memory, OFFSET__memory, value);}
    public java.lang.foreign.MemorySegment $memory() {return this.ptr.asSlice(OFFSET__memory, LAYOUT__memory);}

    public long memoryOffset() {return this.ptr.get(LAYOUT__memoryOffset, OFFSET__memoryOffset);}
    public void memoryOffset(long value) {this.ptr.set(LAYOUT__memoryOffset, OFFSET__memoryOffset, value);}
    public java.lang.foreign.MemorySegment $memoryOffset() {return this.ptr.asSlice(OFFSET__memoryOffset, LAYOUT__memoryOffset);}

    public long memorySize() {return this.ptr.get(LAYOUT__memorySize, OFFSET__memorySize);}
    public void memorySize(long value) {this.ptr.set(LAYOUT__memorySize, OFFSET__memorySize, value);}
    public java.lang.foreign.MemorySegment $memorySize() {return this.ptr.asSlice(OFFSET__memorySize, LAYOUT__memorySize);}
}
