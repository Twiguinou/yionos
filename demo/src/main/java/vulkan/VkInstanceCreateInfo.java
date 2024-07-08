package vulkan;

public record VkInstanceCreateInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__flags = java.lang.foreign.ValueLayout.JAVA_INT.withName("flags");
    public static final long OFFSET__flags = 16;
    public static final java.lang.foreign.AddressLayout LAYOUT__pApplicationInfo = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pApplicationInfo");
    public static final long OFFSET__pApplicationInfo = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__enabledLayerCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("enabledLayerCount");
    public static final long OFFSET__enabledLayerCount = 32;
    public static final java.lang.foreign.AddressLayout LAYOUT__ppEnabledLayerNames = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("ppEnabledLayerNames");
    public static final long OFFSET__ppEnabledLayerNames = 40;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__enabledExtensionCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("enabledExtensionCount");
    public static final long OFFSET__enabledExtensionCount = 48;
    public static final java.lang.foreign.AddressLayout LAYOUT__ppEnabledExtensionNames = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("ppEnabledExtensionNames");
    public static final long OFFSET__ppEnabledExtensionNames = 56;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__flags,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pApplicationInfo,
            LAYOUT__enabledLayerCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__ppEnabledLayerNames,
            LAYOUT__enabledExtensionCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__ppEnabledExtensionNames
    ).withByteAlignment(8).withName("VkInstanceCreateInfo");

    public VkInstanceCreateInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkInstanceCreateInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkInstanceCreateInfo(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkInstanceCreateInfo value)
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

    public java.lang.foreign.MemorySegment pApplicationInfo() {return this.ptr.get(LAYOUT__pApplicationInfo, OFFSET__pApplicationInfo);}
    public void pApplicationInfo(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pApplicationInfo, OFFSET__pApplicationInfo, value);}
    public java.lang.foreign.MemorySegment $pApplicationInfo() {return this.ptr.asSlice(OFFSET__pApplicationInfo, LAYOUT__pApplicationInfo);}

    public int enabledLayerCount() {return this.ptr.get(LAYOUT__enabledLayerCount, OFFSET__enabledLayerCount);}
    public void enabledLayerCount(int value) {this.ptr.set(LAYOUT__enabledLayerCount, OFFSET__enabledLayerCount, value);}
    public java.lang.foreign.MemorySegment $enabledLayerCount() {return this.ptr.asSlice(OFFSET__enabledLayerCount, LAYOUT__enabledLayerCount);}

    public java.lang.foreign.MemorySegment ppEnabledLayerNames() {return this.ptr.get(LAYOUT__ppEnabledLayerNames, OFFSET__ppEnabledLayerNames);}
    public void ppEnabledLayerNames(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__ppEnabledLayerNames, OFFSET__ppEnabledLayerNames, value);}
    public java.lang.foreign.MemorySegment $ppEnabledLayerNames() {return this.ptr.asSlice(OFFSET__ppEnabledLayerNames, LAYOUT__ppEnabledLayerNames);}

    public int enabledExtensionCount() {return this.ptr.get(LAYOUT__enabledExtensionCount, OFFSET__enabledExtensionCount);}
    public void enabledExtensionCount(int value) {this.ptr.set(LAYOUT__enabledExtensionCount, OFFSET__enabledExtensionCount, value);}
    public java.lang.foreign.MemorySegment $enabledExtensionCount() {return this.ptr.asSlice(OFFSET__enabledExtensionCount, LAYOUT__enabledExtensionCount);}

    public java.lang.foreign.MemorySegment ppEnabledExtensionNames() {return this.ptr.get(LAYOUT__ppEnabledExtensionNames, OFFSET__ppEnabledExtensionNames);}
    public void ppEnabledExtensionNames(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__ppEnabledExtensionNames, OFFSET__ppEnabledExtensionNames, value);}
    public java.lang.foreign.MemorySegment $ppEnabledExtensionNames() {return this.ptr.asSlice(OFFSET__ppEnabledExtensionNames, LAYOUT__ppEnabledExtensionNames);}
}
