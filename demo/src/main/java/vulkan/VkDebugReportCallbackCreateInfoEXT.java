package vulkan;

public record VkDebugReportCallbackCreateInfoEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$flags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$flags = 16L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pfnCallback = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pfnCallback = 24L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pUserData = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pUserData = 32L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$flags,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pfnCallback,
            LAYOUT$pUserData
    ).withName("VkDebugReportCallbackCreateInfoEXT");

    public VkDebugReportCallbackCreateInfoEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VkDebugReportCallbackCreateInfoEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VkDebugReportCallbackCreateInfoEXT(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int flags() {return this.ptr.get(LAYOUT$flags, OFFSET$flags);}
    public void flags(int value) {this.ptr.set(LAYOUT$flags, OFFSET$flags, value);}
    public java.lang.foreign.MemorySegment flags_ptr() {return this.ptr.asSlice(OFFSET$flags, LAYOUT$flags);}

    public java.lang.foreign.MemorySegment pfnCallback() {return this.ptr.get(LAYOUT$pfnCallback, OFFSET$pfnCallback);}
    public void pfnCallback(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pfnCallback, OFFSET$pfnCallback, value);}
    public java.lang.foreign.MemorySegment pfnCallback_ptr() {return this.ptr.asSlice(OFFSET$pfnCallback, LAYOUT$pfnCallback);}

    public java.lang.foreign.MemorySegment pUserData() {return this.ptr.get(LAYOUT$pUserData, OFFSET$pUserData);}
    public void pUserData(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pUserData, OFFSET$pUserData, value);}
    public java.lang.foreign.MemorySegment pUserData_ptr() {return this.ptr.asSlice(OFFSET$pUserData, LAYOUT$pUserData);}
}
