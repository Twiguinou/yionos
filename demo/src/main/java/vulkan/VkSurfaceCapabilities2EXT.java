package vulkan;

public record VkSurfaceCapabilities2EXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__minImageCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__minImageCount = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxImageCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__maxImageCount = 20;
    public static final java.lang.foreign.StructLayout LAYOUT__currentExtent = vulkan.VkExtent2D.gRecordLayout;
    public static final long OFFSET__currentExtent = 24;
    public static final java.lang.foreign.StructLayout LAYOUT__minImageExtent = vulkan.VkExtent2D.gRecordLayout;
    public static final long OFFSET__minImageExtent = 32;
    public static final java.lang.foreign.StructLayout LAYOUT__maxImageExtent = vulkan.VkExtent2D.gRecordLayout;
    public static final long OFFSET__maxImageExtent = 40;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxImageArrayLayers = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__maxImageArrayLayers = 48;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__supportedTransforms = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__supportedTransforms = 52;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__currentTransform = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__currentTransform = 56;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__supportedCompositeAlpha = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__supportedCompositeAlpha = 60;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__supportedUsageFlags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__supportedUsageFlags = 64;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__supportedSurfaceCounters = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__supportedSurfaceCounters = 68;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__minImageCount,
            LAYOUT__maxImageCount,
            LAYOUT__currentExtent,
            LAYOUT__minImageExtent,
            LAYOUT__maxImageExtent,
            LAYOUT__maxImageArrayLayers,
            LAYOUT__supportedTransforms,
            LAYOUT__currentTransform,
            LAYOUT__supportedCompositeAlpha,
            LAYOUT__supportedUsageFlags,
            LAYOUT__supportedSurfaceCounters
    ).withByteAlignment(8).withName("VkSurfaceCapabilities2EXT");

    public VkSurfaceCapabilities2EXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkSurfaceCapabilities2EXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkSurfaceCapabilities2EXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkSurfaceCapabilities2EXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

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

    public int supportedSurfaceCounters() {return this.ptr.get(LAYOUT__supportedSurfaceCounters, OFFSET__supportedSurfaceCounters);}
    public void supportedSurfaceCounters(int value) {this.ptr.set(LAYOUT__supportedSurfaceCounters, OFFSET__supportedSurfaceCounters, value);}
    public java.lang.foreign.MemorySegment $supportedSurfaceCounters() {return this.ptr.asSlice(OFFSET__supportedSurfaceCounters, LAYOUT__supportedSurfaceCounters);}
}
