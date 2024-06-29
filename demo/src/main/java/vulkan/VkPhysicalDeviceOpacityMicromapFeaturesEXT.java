package vulkan;

public record VkPhysicalDeviceOpacityMicromapFeaturesEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__micromap = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__micromap = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__micromapCaptureReplay = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__micromapCaptureReplay = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__micromapHostCommands = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__micromapHostCommands = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__micromap,
            LAYOUT__micromapCaptureReplay,
            LAYOUT__micromapHostCommands,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkPhysicalDeviceOpacityMicromapFeaturesEXT");

    public VkPhysicalDeviceOpacityMicromapFeaturesEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceOpacityMicromapFeaturesEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceOpacityMicromapFeaturesEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceOpacityMicromapFeaturesEXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int micromap() {return this.ptr.get(LAYOUT__micromap, OFFSET__micromap);}
    public void micromap(int value) {this.ptr.set(LAYOUT__micromap, OFFSET__micromap, value);}
    public java.lang.foreign.MemorySegment $micromap() {return this.ptr.asSlice(OFFSET__micromap, LAYOUT__micromap);}

    public int micromapCaptureReplay() {return this.ptr.get(LAYOUT__micromapCaptureReplay, OFFSET__micromapCaptureReplay);}
    public void micromapCaptureReplay(int value) {this.ptr.set(LAYOUT__micromapCaptureReplay, OFFSET__micromapCaptureReplay, value);}
    public java.lang.foreign.MemorySegment $micromapCaptureReplay() {return this.ptr.asSlice(OFFSET__micromapCaptureReplay, LAYOUT__micromapCaptureReplay);}

    public int micromapHostCommands() {return this.ptr.get(LAYOUT__micromapHostCommands, OFFSET__micromapHostCommands);}
    public void micromapHostCommands(int value) {this.ptr.set(LAYOUT__micromapHostCommands, OFFSET__micromapHostCommands, value);}
    public java.lang.foreign.MemorySegment $micromapHostCommands() {return this.ptr.asSlice(OFFSET__micromapHostCommands, LAYOUT__micromapHostCommands);}
}
