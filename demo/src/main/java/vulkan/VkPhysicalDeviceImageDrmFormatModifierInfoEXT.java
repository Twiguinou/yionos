package vulkan;

public record VkPhysicalDeviceImageDrmFormatModifierInfoEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__drmFormatModifier = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__drmFormatModifier = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sharingMode = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sharingMode = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__queueFamilyIndexCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__queueFamilyIndexCount = 28;
    public static final java.lang.foreign.AddressLayout LAYOUT__pQueueFamilyIndices = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pQueueFamilyIndices = 32;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__drmFormatModifier,
            LAYOUT__sharingMode,
            LAYOUT__queueFamilyIndexCount,
            LAYOUT__pQueueFamilyIndices
    ).withByteAlignment(8).withName("VkPhysicalDeviceImageDrmFormatModifierInfoEXT");

    public VkPhysicalDeviceImageDrmFormatModifierInfoEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceImageDrmFormatModifierInfoEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceImageDrmFormatModifierInfoEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceImageDrmFormatModifierInfoEXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public long drmFormatModifier() {return this.ptr.get(LAYOUT__drmFormatModifier, OFFSET__drmFormatModifier);}
    public void drmFormatModifier(long value) {this.ptr.set(LAYOUT__drmFormatModifier, OFFSET__drmFormatModifier, value);}
    public java.lang.foreign.MemorySegment $drmFormatModifier() {return this.ptr.asSlice(OFFSET__drmFormatModifier, LAYOUT__drmFormatModifier);}

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
