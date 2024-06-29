package vulkan;

public record VkHdrMetadataEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.StructLayout LAYOUT__displayPrimaryRed = vulkan.VkXYColorEXT.gRecordLayout;
    public static final long OFFSET__displayPrimaryRed = 16;
    public static final java.lang.foreign.StructLayout LAYOUT__displayPrimaryGreen = vulkan.VkXYColorEXT.gRecordLayout;
    public static final long OFFSET__displayPrimaryGreen = 24;
    public static final java.lang.foreign.StructLayout LAYOUT__displayPrimaryBlue = vulkan.VkXYColorEXT.gRecordLayout;
    public static final long OFFSET__displayPrimaryBlue = 32;
    public static final java.lang.foreign.StructLayout LAYOUT__whitePoint = vulkan.VkXYColorEXT.gRecordLayout;
    public static final long OFFSET__whitePoint = 40;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__maxLuminance = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET__maxLuminance = 48;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__minLuminance = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET__minLuminance = 52;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__maxContentLightLevel = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET__maxContentLightLevel = 56;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__maxFrameAverageLightLevel = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET__maxFrameAverageLightLevel = 60;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__displayPrimaryRed,
            LAYOUT__displayPrimaryGreen,
            LAYOUT__displayPrimaryBlue,
            LAYOUT__whitePoint,
            LAYOUT__maxLuminance,
            LAYOUT__minLuminance,
            LAYOUT__maxContentLightLevel,
            LAYOUT__maxFrameAverageLightLevel
    ).withByteAlignment(8).withName("VkHdrMetadataEXT");

    public VkHdrMetadataEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkHdrMetadataEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkHdrMetadataEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkHdrMetadataEXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public vulkan.VkXYColorEXT displayPrimaryRed() {return new vulkan.VkXYColorEXT(this.ptr.asSlice(OFFSET__displayPrimaryRed, LAYOUT__displayPrimaryRed));}
    public void displayPrimaryRed(java.util.function.Consumer<vulkan.VkXYColorEXT> consumer) {consumer.accept(this.displayPrimaryRed());}
    public void displayPrimaryRed(vulkan.VkXYColorEXT value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__displayPrimaryRed, LAYOUT__displayPrimaryRed.byteSize());}

    public vulkan.VkXYColorEXT displayPrimaryGreen() {return new vulkan.VkXYColorEXT(this.ptr.asSlice(OFFSET__displayPrimaryGreen, LAYOUT__displayPrimaryGreen));}
    public void displayPrimaryGreen(java.util.function.Consumer<vulkan.VkXYColorEXT> consumer) {consumer.accept(this.displayPrimaryGreen());}
    public void displayPrimaryGreen(vulkan.VkXYColorEXT value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__displayPrimaryGreen, LAYOUT__displayPrimaryGreen.byteSize());}

    public vulkan.VkXYColorEXT displayPrimaryBlue() {return new vulkan.VkXYColorEXT(this.ptr.asSlice(OFFSET__displayPrimaryBlue, LAYOUT__displayPrimaryBlue));}
    public void displayPrimaryBlue(java.util.function.Consumer<vulkan.VkXYColorEXT> consumer) {consumer.accept(this.displayPrimaryBlue());}
    public void displayPrimaryBlue(vulkan.VkXYColorEXT value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__displayPrimaryBlue, LAYOUT__displayPrimaryBlue.byteSize());}

    public vulkan.VkXYColorEXT whitePoint() {return new vulkan.VkXYColorEXT(this.ptr.asSlice(OFFSET__whitePoint, LAYOUT__whitePoint));}
    public void whitePoint(java.util.function.Consumer<vulkan.VkXYColorEXT> consumer) {consumer.accept(this.whitePoint());}
    public void whitePoint(vulkan.VkXYColorEXT value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__whitePoint, LAYOUT__whitePoint.byteSize());}

    public float maxLuminance() {return this.ptr.get(LAYOUT__maxLuminance, OFFSET__maxLuminance);}
    public void maxLuminance(float value) {this.ptr.set(LAYOUT__maxLuminance, OFFSET__maxLuminance, value);}
    public java.lang.foreign.MemorySegment $maxLuminance() {return this.ptr.asSlice(OFFSET__maxLuminance, LAYOUT__maxLuminance);}

    public float minLuminance() {return this.ptr.get(LAYOUT__minLuminance, OFFSET__minLuminance);}
    public void minLuminance(float value) {this.ptr.set(LAYOUT__minLuminance, OFFSET__minLuminance, value);}
    public java.lang.foreign.MemorySegment $minLuminance() {return this.ptr.asSlice(OFFSET__minLuminance, LAYOUT__minLuminance);}

    public float maxContentLightLevel() {return this.ptr.get(LAYOUT__maxContentLightLevel, OFFSET__maxContentLightLevel);}
    public void maxContentLightLevel(float value) {this.ptr.set(LAYOUT__maxContentLightLevel, OFFSET__maxContentLightLevel, value);}
    public java.lang.foreign.MemorySegment $maxContentLightLevel() {return this.ptr.asSlice(OFFSET__maxContentLightLevel, LAYOUT__maxContentLightLevel);}

    public float maxFrameAverageLightLevel() {return this.ptr.get(LAYOUT__maxFrameAverageLightLevel, OFFSET__maxFrameAverageLightLevel);}
    public void maxFrameAverageLightLevel(float value) {this.ptr.set(LAYOUT__maxFrameAverageLightLevel, OFFSET__maxFrameAverageLightLevel, value);}
    public java.lang.foreign.MemorySegment $maxFrameAverageLightLevel() {return this.ptr.asSlice(OFFSET__maxFrameAverageLightLevel, LAYOUT__maxFrameAverageLightLevel);}
}
