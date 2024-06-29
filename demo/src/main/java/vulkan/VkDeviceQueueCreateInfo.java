package vulkan;

public record VkDeviceQueueCreateInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__flags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__flags = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__queueFamilyIndex = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__queueFamilyIndex = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__queueCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__queueCount = 24;
    public static final java.lang.foreign.AddressLayout LAYOUT__pQueuePriorities = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pQueuePriorities = 32;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__flags,
            LAYOUT__queueFamilyIndex,
            LAYOUT__queueCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pQueuePriorities
    ).withByteAlignment(8).withName("VkDeviceQueueCreateInfo");

    public VkDeviceQueueCreateInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkDeviceQueueCreateInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkDeviceQueueCreateInfo(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkDeviceQueueCreateInfo value)
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

    public int queueFamilyIndex() {return this.ptr.get(LAYOUT__queueFamilyIndex, OFFSET__queueFamilyIndex);}
    public void queueFamilyIndex(int value) {this.ptr.set(LAYOUT__queueFamilyIndex, OFFSET__queueFamilyIndex, value);}
    public java.lang.foreign.MemorySegment $queueFamilyIndex() {return this.ptr.asSlice(OFFSET__queueFamilyIndex, LAYOUT__queueFamilyIndex);}

    public int queueCount() {return this.ptr.get(LAYOUT__queueCount, OFFSET__queueCount);}
    public void queueCount(int value) {this.ptr.set(LAYOUT__queueCount, OFFSET__queueCount, value);}
    public java.lang.foreign.MemorySegment $queueCount() {return this.ptr.asSlice(OFFSET__queueCount, LAYOUT__queueCount);}

    public java.lang.foreign.MemorySegment pQueuePriorities() {return this.ptr.get(LAYOUT__pQueuePriorities, OFFSET__pQueuePriorities);}
    public void pQueuePriorities(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pQueuePriorities, OFFSET__pQueuePriorities, value);}
    public java.lang.foreign.MemorySegment $pQueuePriorities() {return this.ptr.asSlice(OFFSET__pQueuePriorities, LAYOUT__pQueuePriorities);}
}
