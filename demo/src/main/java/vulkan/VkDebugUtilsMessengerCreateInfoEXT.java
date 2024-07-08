package vulkan;

public record VkDebugUtilsMessengerCreateInfoEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__flags = java.lang.foreign.ValueLayout.JAVA_INT.withName("flags");
    public static final long OFFSET__flags = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__messageSeverity = java.lang.foreign.ValueLayout.JAVA_INT.withName("messageSeverity");
    public static final long OFFSET__messageSeverity = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__messageType = java.lang.foreign.ValueLayout.JAVA_INT.withName("messageType");
    public static final long OFFSET__messageType = 24;
    public static final java.lang.foreign.AddressLayout LAYOUT__pfnUserCallback = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pfnUserCallback");
    public static final long OFFSET__pfnUserCallback = 32;
    public static final java.lang.foreign.AddressLayout LAYOUT__pUserData = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pUserData");
    public static final long OFFSET__pUserData = 40;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__flags,
            LAYOUT__messageSeverity,
            LAYOUT__messageType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pfnUserCallback,
            LAYOUT__pUserData
    ).withByteAlignment(8).withName("VkDebugUtilsMessengerCreateInfoEXT");

    public VkDebugUtilsMessengerCreateInfoEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkDebugUtilsMessengerCreateInfoEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkDebugUtilsMessengerCreateInfoEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkDebugUtilsMessengerCreateInfoEXT value)
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

    public int messageSeverity() {return this.ptr.get(LAYOUT__messageSeverity, OFFSET__messageSeverity);}
    public void messageSeverity(int value) {this.ptr.set(LAYOUT__messageSeverity, OFFSET__messageSeverity, value);}
    public java.lang.foreign.MemorySegment $messageSeverity() {return this.ptr.asSlice(OFFSET__messageSeverity, LAYOUT__messageSeverity);}

    public int messageType() {return this.ptr.get(LAYOUT__messageType, OFFSET__messageType);}
    public void messageType(int value) {this.ptr.set(LAYOUT__messageType, OFFSET__messageType, value);}
    public java.lang.foreign.MemorySegment $messageType() {return this.ptr.asSlice(OFFSET__messageType, LAYOUT__messageType);}

    public java.lang.foreign.MemorySegment pfnUserCallback() {return this.ptr.get(LAYOUT__pfnUserCallback, OFFSET__pfnUserCallback);}
    public void pfnUserCallback(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pfnUserCallback, OFFSET__pfnUserCallback, value);}
    public java.lang.foreign.MemorySegment $pfnUserCallback() {return this.ptr.asSlice(OFFSET__pfnUserCallback, LAYOUT__pfnUserCallback);}

    public java.lang.foreign.MemorySegment pUserData() {return this.ptr.get(LAYOUT__pUserData, OFFSET__pUserData);}
    public void pUserData(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pUserData, OFFSET__pUserData, value);}
    public java.lang.foreign.MemorySegment $pUserData() {return this.ptr.asSlice(OFFSET__pUserData, LAYOUT__pUserData);}
}
