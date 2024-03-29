package vulkan;

public record VkDebugUtilsObjectNameInfoEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$objectType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$objectType = 16L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$objectHandle = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$objectHandle = 24L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pObjectName = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pObjectName = 32L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$objectType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$objectHandle,
            LAYOUT$pObjectName
    ).withName("VkDebugUtilsObjectNameInfoEXT");

    public VkDebugUtilsObjectNameInfoEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VkDebugUtilsObjectNameInfoEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VkDebugUtilsObjectNameInfoEXT(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int objectType() {return this.ptr.get(LAYOUT$objectType, OFFSET$objectType);}
    public void objectType(int value) {this.ptr.set(LAYOUT$objectType, OFFSET$objectType, value);}
    public java.lang.foreign.MemorySegment objectType_ptr() {return this.ptr.asSlice(OFFSET$objectType, LAYOUT$objectType);}

    public long objectHandle() {return this.ptr.get(LAYOUT$objectHandle, OFFSET$objectHandle);}
    public void objectHandle(long value) {this.ptr.set(LAYOUT$objectHandle, OFFSET$objectHandle, value);}
    public java.lang.foreign.MemorySegment objectHandle_ptr() {return this.ptr.asSlice(OFFSET$objectHandle, LAYOUT$objectHandle);}

    public java.lang.foreign.MemorySegment pObjectName() {return this.ptr.get(LAYOUT$pObjectName, OFFSET$pObjectName);}
    public void pObjectName(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pObjectName, OFFSET$pObjectName, value);}
    public java.lang.foreign.MemorySegment pObjectName_ptr() {return this.ptr.asSlice(OFFSET$pObjectName, LAYOUT$pObjectName);}
}
