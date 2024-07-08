package vma;

public record VkBufferCreateInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__flags = java.lang.foreign.ValueLayout.JAVA_INT.withName("flags");
    public static final long OFFSET__flags = 16;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__size = java.lang.foreign.ValueLayout.JAVA_LONG.withName("size");
    public static final long OFFSET__size = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__usage = java.lang.foreign.ValueLayout.JAVA_INT.withName("usage");
    public static final long OFFSET__usage = 32;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sharingMode = java.lang.foreign.ValueLayout.JAVA_INT.withName("sharingMode");
    public static final long OFFSET__sharingMode = 36;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__queueFamilyIndexCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("queueFamilyIndexCount");
    public static final long OFFSET__queueFamilyIndexCount = 40;
    public static final java.lang.foreign.AddressLayout LAYOUT__pQueueFamilyIndices = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pQueueFamilyIndices");
    public static final long OFFSET__pQueueFamilyIndices = 48;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__flags,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__size,
            LAYOUT__usage,
            LAYOUT__sharingMode,
            LAYOUT__queueFamilyIndexCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pQueueFamilyIndices
    ).withByteAlignment(8).withName("VkBufferCreateInfo");

    public VkBufferCreateInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkBufferCreateInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkBufferCreateInfo(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkBufferCreateInfo value)
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

    public long size() {return this.ptr.get(LAYOUT__size, OFFSET__size);}
    public void size(long value) {this.ptr.set(LAYOUT__size, OFFSET__size, value);}
    public java.lang.foreign.MemorySegment $size() {return this.ptr.asSlice(OFFSET__size, LAYOUT__size);}

    public int usage() {return this.ptr.get(LAYOUT__usage, OFFSET__usage);}
    public void usage(int value) {this.ptr.set(LAYOUT__usage, OFFSET__usage, value);}
    public java.lang.foreign.MemorySegment $usage() {return this.ptr.asSlice(OFFSET__usage, LAYOUT__usage);}

    public int sharingMode() {return this.ptr.get(LAYOUT__sharingMode, OFFSET__sharingMode);}
    public void sharingMode(int value) {this.ptr.set(LAYOUT__sharingMode, OFFSET__sharingMode, value);}
    public java.lang.foreign.MemorySegment $sharingMode() {return this.ptr.asSlice(OFFSET__sharingMode, LAYOUT__sharingMode);}

    public int queueFamilyIndexCount() {return this.ptr.get(LAYOUT__queueFamilyIndexCount, OFFSET__queueFamilyIndexCount);}
    public void queueFamilyIndexCount(int value) {this.ptr.set(LAYOUT__queueFamilyIndexCount, OFFSET__queueFamilyIndexCount, value);}
    public java.lang.foreign.MemorySegment $queueFamilyIndexCount() {return this.ptr.asSlice(OFFSET__queueFamilyIndexCount, LAYOUT__queueFamilyIndexCount);}

    public java.lang.foreign.MemorySegment pQueueFamilyIndices() {return this.ptr.get(LAYOUT__pQueueFamilyIndices, OFFSET__pQueueFamilyIndices);}
    public void pQueueFamilyIndices(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pQueueFamilyIndices, OFFSET__pQueueFamilyIndices, value);}
    public java.lang.foreign.MemorySegment $pQueueFamilyIndices() {return this.ptr.asSlice(OFFSET__pQueueFamilyIndices, LAYOUT__pQueueFamilyIndices);}
}