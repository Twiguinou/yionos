package vulkan;

public record VkPhysicalDeviceDescriptorBufferFeaturesEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__descriptorBuffer = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__descriptorBuffer = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__descriptorBufferCaptureReplay = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__descriptorBufferCaptureReplay = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__descriptorBufferImageLayoutIgnored = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__descriptorBufferImageLayoutIgnored = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__descriptorBufferPushDescriptors = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__descriptorBufferPushDescriptors = 28;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__descriptorBuffer,
            LAYOUT__descriptorBufferCaptureReplay,
            LAYOUT__descriptorBufferImageLayoutIgnored,
            LAYOUT__descriptorBufferPushDescriptors
    ).withByteAlignment(8).withName("VkPhysicalDeviceDescriptorBufferFeaturesEXT");

    public VkPhysicalDeviceDescriptorBufferFeaturesEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceDescriptorBufferFeaturesEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceDescriptorBufferFeaturesEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceDescriptorBufferFeaturesEXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int descriptorBuffer() {return this.ptr.get(LAYOUT__descriptorBuffer, OFFSET__descriptorBuffer);}
    public void descriptorBuffer(int value) {this.ptr.set(LAYOUT__descriptorBuffer, OFFSET__descriptorBuffer, value);}
    public java.lang.foreign.MemorySegment $descriptorBuffer() {return this.ptr.asSlice(OFFSET__descriptorBuffer, LAYOUT__descriptorBuffer);}

    public int descriptorBufferCaptureReplay() {return this.ptr.get(LAYOUT__descriptorBufferCaptureReplay, OFFSET__descriptorBufferCaptureReplay);}
    public void descriptorBufferCaptureReplay(int value) {this.ptr.set(LAYOUT__descriptorBufferCaptureReplay, OFFSET__descriptorBufferCaptureReplay, value);}
    public java.lang.foreign.MemorySegment $descriptorBufferCaptureReplay() {return this.ptr.asSlice(OFFSET__descriptorBufferCaptureReplay, LAYOUT__descriptorBufferCaptureReplay);}

    public int descriptorBufferImageLayoutIgnored() {return this.ptr.get(LAYOUT__descriptorBufferImageLayoutIgnored, OFFSET__descriptorBufferImageLayoutIgnored);}
    public void descriptorBufferImageLayoutIgnored(int value) {this.ptr.set(LAYOUT__descriptorBufferImageLayoutIgnored, OFFSET__descriptorBufferImageLayoutIgnored, value);}
    public java.lang.foreign.MemorySegment $descriptorBufferImageLayoutIgnored() {return this.ptr.asSlice(OFFSET__descriptorBufferImageLayoutIgnored, LAYOUT__descriptorBufferImageLayoutIgnored);}

    public int descriptorBufferPushDescriptors() {return this.ptr.get(LAYOUT__descriptorBufferPushDescriptors, OFFSET__descriptorBufferPushDescriptors);}
    public void descriptorBufferPushDescriptors(int value) {this.ptr.set(LAYOUT__descriptorBufferPushDescriptors, OFFSET__descriptorBufferPushDescriptors, value);}
    public java.lang.foreign.MemorySegment $descriptorBufferPushDescriptors() {return this.ptr.asSlice(OFFSET__descriptorBufferPushDescriptors, LAYOUT__descriptorBufferPushDescriptors);}
}
