package vulkan;

public record VkDeviceCreateInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__flags = java.lang.foreign.ValueLayout.JAVA_INT.withName("flags");
    public static final long OFFSET__flags = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__queueCreateInfoCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("queueCreateInfoCount");
    public static final long OFFSET__queueCreateInfoCount = 20;
    public static final java.lang.foreign.AddressLayout LAYOUT__pQueueCreateInfos = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pQueueCreateInfos");
    public static final long OFFSET__pQueueCreateInfos = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__enabledLayerCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("enabledLayerCount");
    public static final long OFFSET__enabledLayerCount = 32;
    public static final java.lang.foreign.AddressLayout LAYOUT__ppEnabledLayerNames = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("ppEnabledLayerNames");
    public static final long OFFSET__ppEnabledLayerNames = 40;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__enabledExtensionCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("enabledExtensionCount");
    public static final long OFFSET__enabledExtensionCount = 48;
    public static final java.lang.foreign.AddressLayout LAYOUT__ppEnabledExtensionNames = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("ppEnabledExtensionNames");
    public static final long OFFSET__ppEnabledExtensionNames = 56;
    public static final java.lang.foreign.AddressLayout LAYOUT__pEnabledFeatures = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pEnabledFeatures");
    public static final long OFFSET__pEnabledFeatures = 64;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__flags,
            LAYOUT__queueCreateInfoCount,
            LAYOUT__pQueueCreateInfos,
            LAYOUT__enabledLayerCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__ppEnabledLayerNames,
            LAYOUT__enabledExtensionCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__ppEnabledExtensionNames,
            LAYOUT__pEnabledFeatures
    ).withByteAlignment(8).withName("VkDeviceCreateInfo");

    public VkDeviceCreateInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkDeviceCreateInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkDeviceCreateInfo(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkDeviceCreateInfo value)
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

    public int queueCreateInfoCount() {return this.ptr.get(LAYOUT__queueCreateInfoCount, OFFSET__queueCreateInfoCount);}
    public void queueCreateInfoCount(int value) {this.ptr.set(LAYOUT__queueCreateInfoCount, OFFSET__queueCreateInfoCount, value);}
    public java.lang.foreign.MemorySegment $queueCreateInfoCount() {return this.ptr.asSlice(OFFSET__queueCreateInfoCount, LAYOUT__queueCreateInfoCount);}

    public java.lang.foreign.MemorySegment pQueueCreateInfos() {return this.ptr.get(LAYOUT__pQueueCreateInfos, OFFSET__pQueueCreateInfos);}
    public void pQueueCreateInfos(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pQueueCreateInfos, OFFSET__pQueueCreateInfos, value);}
    public java.lang.foreign.MemorySegment $pQueueCreateInfos() {return this.ptr.asSlice(OFFSET__pQueueCreateInfos, LAYOUT__pQueueCreateInfos);}

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

    public java.lang.foreign.MemorySegment pEnabledFeatures() {return this.ptr.get(LAYOUT__pEnabledFeatures, OFFSET__pEnabledFeatures);}
    public void pEnabledFeatures(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pEnabledFeatures, OFFSET__pEnabledFeatures, value);}
    public java.lang.foreign.MemorySegment $pEnabledFeatures() {return this.ptr.asSlice(OFFSET__pEnabledFeatures, LAYOUT__pEnabledFeatures);}
}
