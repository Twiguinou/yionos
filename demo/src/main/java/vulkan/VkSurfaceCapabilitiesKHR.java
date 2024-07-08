package vulkan;

public record VkSurfaceCapabilitiesKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__minImageCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("minImageCount");
    public static final long OFFSET__minImageCount = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxImageCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxImageCount");
    public static final long OFFSET__maxImageCount = 4;
    public static final java.lang.foreign.StructLayout LAYOUT__currentExtent = vulkan.VkExtent2D.gRecordLayout.withName("currentExtent");
    public static final long OFFSET__currentExtent = 8;
    public static final java.lang.foreign.StructLayout LAYOUT__minImageExtent = vulkan.VkExtent2D.gRecordLayout.withName("minImageExtent");
    public static final long OFFSET__minImageExtent = 16;
    public static final java.lang.foreign.StructLayout LAYOUT__maxImageExtent = vulkan.VkExtent2D.gRecordLayout.withName("maxImageExtent");
    public static final long OFFSET__maxImageExtent = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxImageArrayLayers = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxImageArrayLayers");
    public static final long OFFSET__maxImageArrayLayers = 32;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__supportedTransforms = java.lang.foreign.ValueLayout.JAVA_INT.withName("supportedTransforms");
    public static final long OFFSET__supportedTransforms = 36;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__currentTransform = java.lang.foreign.ValueLayout.JAVA_INT.withName("currentTransform");
    public static final long OFFSET__currentTransform = 40;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__supportedCompositeAlpha = java.lang.foreign.ValueLayout.JAVA_INT.withName("supportedCompositeAlpha");
    public static final long OFFSET__supportedCompositeAlpha = 44;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__supportedUsageFlags = java.lang.foreign.ValueLayout.JAVA_INT.withName("supportedUsageFlags");
    public static final long OFFSET__supportedUsageFlags = 48;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__minImageCount,
            LAYOUT__maxImageCount,
            LAYOUT__currentExtent,
            LAYOUT__minImageExtent,
            LAYOUT__maxImageExtent,
            LAYOUT__maxImageArrayLayers,
            LAYOUT__supportedTransforms,
            LAYOUT__currentTransform,
            LAYOUT__supportedCompositeAlpha,
            LAYOUT__supportedUsageFlags
    ).withByteAlignment(4).withName("VkSurfaceCapabilitiesKHR");

    public VkSurfaceCapabilitiesKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkSurfaceCapabilitiesKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkSurfaceCapabilitiesKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkSurfaceCapabilitiesKHR value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int minImageCount() {return this.ptr.get(LAYOUT__minImageCount, OFFSET__minImageCount);}
    public void minImageCount(int value) {this.ptr.set(LAYOUT__minImageCount, OFFSET__minImageCount, value);}
    public java.lang.foreign.MemorySegment $minImageCount() {return this.ptr.asSlice(OFFSET__minImageCount, LAYOUT__minImageCount);}

    public int maxImageCount() {return this.ptr.get(LAYOUT__maxImageCount, OFFSET__maxImageCount);}
    public void maxImageCount(int value) {this.ptr.set(LAYOUT__maxImageCount, OFFSET__maxImageCount, value);}
    public java.lang.foreign.MemorySegment $maxImageCount() {return this.ptr.asSlice(OFFSET__maxImageCount, LAYOUT__maxImageCount);}

    public vulkan.VkExtent2D currentExtent() {return new vulkan.VkExtent2D(this.ptr.asSlice(OFFSET__currentExtent, LAYOUT__currentExtent));}
    public void currentExtent(java.util.function.Consumer<vulkan.VkExtent2D> consumer) {consumer.accept(this.currentExtent());}
    public void currentExtent(vulkan.VkExtent2D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__currentExtent, LAYOUT__currentExtent.byteSize());}

    public vulkan.VkExtent2D minImageExtent() {return new vulkan.VkExtent2D(this.ptr.asSlice(OFFSET__minImageExtent, LAYOUT__minImageExtent));}
    public void minImageExtent(java.util.function.Consumer<vulkan.VkExtent2D> consumer) {consumer.accept(this.minImageExtent());}
    public void minImageExtent(vulkan.VkExtent2D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__minImageExtent, LAYOUT__minImageExtent.byteSize());}

    public vulkan.VkExtent2D maxImageExtent() {return new vulkan.VkExtent2D(this.ptr.asSlice(OFFSET__maxImageExtent, LAYOUT__maxImageExtent));}
    public void maxImageExtent(java.util.function.Consumer<vulkan.VkExtent2D> consumer) {consumer.accept(this.maxImageExtent());}
    public void maxImageExtent(vulkan.VkExtent2D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__maxImageExtent, LAYOUT__maxImageExtent.byteSize());}

    public int maxImageArrayLayers() {return this.ptr.get(LAYOUT__maxImageArrayLayers, OFFSET__maxImageArrayLayers);}
    public void maxImageArrayLayers(int value) {this.ptr.set(LAYOUT__maxImageArrayLayers, OFFSET__maxImageArrayLayers, value);}
    public java.lang.foreign.MemorySegment $maxImageArrayLayers() {return this.ptr.asSlice(OFFSET__maxImageArrayLayers, LAYOUT__maxImageArrayLayers);}

    public int supportedTransforms() {return this.ptr.get(LAYOUT__supportedTransforms, OFFSET__supportedTransforms);}
    public void supportedTransforms(int value) {this.ptr.set(LAYOUT__supportedTransforms, OFFSET__supportedTransforms, value);}
    public java.lang.foreign.MemorySegment $supportedTransforms() {return this.ptr.asSlice(OFFSET__supportedTransforms, LAYOUT__supportedTransforms);}

    public int currentTransform() {return this.ptr.get(LAYOUT__currentTransform, OFFSET__currentTransform);}
    public void currentTransform(int value) {this.ptr.set(LAYOUT__currentTransform, OFFSET__currentTransform, value);}
    public java.lang.foreign.MemorySegment $currentTransform() {return this.ptr.asSlice(OFFSET__currentTransform, LAYOUT__currentTransform);}

    public int supportedCompositeAlpha() {return this.ptr.get(LAYOUT__supportedCompositeAlpha, OFFSET__supportedCompositeAlpha);}
    public void supportedCompositeAlpha(int value) {this.ptr.set(LAYOUT__supportedCompositeAlpha, OFFSET__supportedCompositeAlpha, value);}
    public java.lang.foreign.MemorySegment $supportedCompositeAlpha() {return this.ptr.asSlice(OFFSET__supportedCompositeAlpha, LAYOUT__supportedCompositeAlpha);}

    public int supportedUsageFlags() {return this.ptr.get(LAYOUT__supportedUsageFlags, OFFSET__supportedUsageFlags);}
    public void supportedUsageFlags(int value) {this.ptr.set(LAYOUT__supportedUsageFlags, OFFSET__supportedUsageFlags, value);}
    public java.lang.foreign.MemorySegment $supportedUsageFlags() {return this.ptr.asSlice(OFFSET__supportedUsageFlags, LAYOUT__supportedUsageFlags);}
}
