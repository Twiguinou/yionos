package vulkan;

public record VkSwapchainCreateInfoKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__flags = java.lang.foreign.ValueLayout.JAVA_INT.withName("flags");
    public static final long OFFSET__flags = 16;
    public static final java.lang.foreign.AddressLayout LAYOUT__surface = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("surface");
    public static final long OFFSET__surface = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__minImageCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("minImageCount");
    public static final long OFFSET__minImageCount = 32;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__imageFormat = java.lang.foreign.ValueLayout.JAVA_INT.withName("imageFormat");
    public static final long OFFSET__imageFormat = 36;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__imageColorSpace = java.lang.foreign.ValueLayout.JAVA_INT.withName("imageColorSpace");
    public static final long OFFSET__imageColorSpace = 40;
    public static final java.lang.foreign.StructLayout LAYOUT__imageExtent = vulkan.VkExtent2D.gRecordLayout.withName("imageExtent");
    public static final long OFFSET__imageExtent = 44;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__imageArrayLayers = java.lang.foreign.ValueLayout.JAVA_INT.withName("imageArrayLayers");
    public static final long OFFSET__imageArrayLayers = 52;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__imageUsage = java.lang.foreign.ValueLayout.JAVA_INT.withName("imageUsage");
    public static final long OFFSET__imageUsage = 56;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__imageSharingMode = java.lang.foreign.ValueLayout.JAVA_INT.withName("imageSharingMode");
    public static final long OFFSET__imageSharingMode = 60;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__queueFamilyIndexCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("queueFamilyIndexCount");
    public static final long OFFSET__queueFamilyIndexCount = 64;
    public static final java.lang.foreign.AddressLayout LAYOUT__pQueueFamilyIndices = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pQueueFamilyIndices");
    public static final long OFFSET__pQueueFamilyIndices = 72;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__preTransform = java.lang.foreign.ValueLayout.JAVA_INT.withName("preTransform");
    public static final long OFFSET__preTransform = 80;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__compositeAlpha = java.lang.foreign.ValueLayout.JAVA_INT.withName("compositeAlpha");
    public static final long OFFSET__compositeAlpha = 84;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__presentMode = java.lang.foreign.ValueLayout.JAVA_INT.withName("presentMode");
    public static final long OFFSET__presentMode = 88;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__clipped = java.lang.foreign.ValueLayout.JAVA_INT.withName("clipped");
    public static final long OFFSET__clipped = 92;
    public static final java.lang.foreign.AddressLayout LAYOUT__oldSwapchain = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("oldSwapchain");
    public static final long OFFSET__oldSwapchain = 96;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__flags,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__surface,
            LAYOUT__minImageCount,
            LAYOUT__imageFormat,
            LAYOUT__imageColorSpace,
            LAYOUT__imageExtent,
            LAYOUT__imageArrayLayers,
            LAYOUT__imageUsage,
            LAYOUT__imageSharingMode,
            LAYOUT__queueFamilyIndexCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pQueueFamilyIndices,
            LAYOUT__preTransform,
            LAYOUT__compositeAlpha,
            LAYOUT__presentMode,
            LAYOUT__clipped,
            LAYOUT__oldSwapchain
    ).withByteAlignment(8).withName("VkSwapchainCreateInfoKHR");

    public VkSwapchainCreateInfoKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkSwapchainCreateInfoKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkSwapchainCreateInfoKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkSwapchainCreateInfoKHR value)
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

    public java.lang.foreign.MemorySegment surface() {return this.ptr.get(LAYOUT__surface, OFFSET__surface);}
    public void surface(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__surface, OFFSET__surface, value);}
    public java.lang.foreign.MemorySegment $surface() {return this.ptr.asSlice(OFFSET__surface, LAYOUT__surface);}

    public int minImageCount() {return this.ptr.get(LAYOUT__minImageCount, OFFSET__minImageCount);}
    public void minImageCount(int value) {this.ptr.set(LAYOUT__minImageCount, OFFSET__minImageCount, value);}
    public java.lang.foreign.MemorySegment $minImageCount() {return this.ptr.asSlice(OFFSET__minImageCount, LAYOUT__minImageCount);}

    public int imageFormat() {return this.ptr.get(LAYOUT__imageFormat, OFFSET__imageFormat);}
    public void imageFormat(int value) {this.ptr.set(LAYOUT__imageFormat, OFFSET__imageFormat, value);}
    public java.lang.foreign.MemorySegment $imageFormat() {return this.ptr.asSlice(OFFSET__imageFormat, LAYOUT__imageFormat);}

    public int imageColorSpace() {return this.ptr.get(LAYOUT__imageColorSpace, OFFSET__imageColorSpace);}
    public void imageColorSpace(int value) {this.ptr.set(LAYOUT__imageColorSpace, OFFSET__imageColorSpace, value);}
    public java.lang.foreign.MemorySegment $imageColorSpace() {return this.ptr.asSlice(OFFSET__imageColorSpace, LAYOUT__imageColorSpace);}

    public vulkan.VkExtent2D imageExtent() {return new vulkan.VkExtent2D(this.ptr.asSlice(OFFSET__imageExtent, LAYOUT__imageExtent));}
    public void imageExtent(java.util.function.Consumer<vulkan.VkExtent2D> consumer) {consumer.accept(this.imageExtent());}
    public void imageExtent(vulkan.VkExtent2D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__imageExtent, LAYOUT__imageExtent.byteSize());}

    public int imageArrayLayers() {return this.ptr.get(LAYOUT__imageArrayLayers, OFFSET__imageArrayLayers);}
    public void imageArrayLayers(int value) {this.ptr.set(LAYOUT__imageArrayLayers, OFFSET__imageArrayLayers, value);}
    public java.lang.foreign.MemorySegment $imageArrayLayers() {return this.ptr.asSlice(OFFSET__imageArrayLayers, LAYOUT__imageArrayLayers);}

    public int imageUsage() {return this.ptr.get(LAYOUT__imageUsage, OFFSET__imageUsage);}
    public void imageUsage(int value) {this.ptr.set(LAYOUT__imageUsage, OFFSET__imageUsage, value);}
    public java.lang.foreign.MemorySegment $imageUsage() {return this.ptr.asSlice(OFFSET__imageUsage, LAYOUT__imageUsage);}

    public int imageSharingMode() {return this.ptr.get(LAYOUT__imageSharingMode, OFFSET__imageSharingMode);}
    public void imageSharingMode(int value) {this.ptr.set(LAYOUT__imageSharingMode, OFFSET__imageSharingMode, value);}
    public java.lang.foreign.MemorySegment $imageSharingMode() {return this.ptr.asSlice(OFFSET__imageSharingMode, LAYOUT__imageSharingMode);}

    public int queueFamilyIndexCount() {return this.ptr.get(LAYOUT__queueFamilyIndexCount, OFFSET__queueFamilyIndexCount);}
    public void queueFamilyIndexCount(int value) {this.ptr.set(LAYOUT__queueFamilyIndexCount, OFFSET__queueFamilyIndexCount, value);}
    public java.lang.foreign.MemorySegment $queueFamilyIndexCount() {return this.ptr.asSlice(OFFSET__queueFamilyIndexCount, LAYOUT__queueFamilyIndexCount);}

    public java.lang.foreign.MemorySegment pQueueFamilyIndices() {return this.ptr.get(LAYOUT__pQueueFamilyIndices, OFFSET__pQueueFamilyIndices);}
    public void pQueueFamilyIndices(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pQueueFamilyIndices, OFFSET__pQueueFamilyIndices, value);}
    public java.lang.foreign.MemorySegment $pQueueFamilyIndices() {return this.ptr.asSlice(OFFSET__pQueueFamilyIndices, LAYOUT__pQueueFamilyIndices);}

    public int preTransform() {return this.ptr.get(LAYOUT__preTransform, OFFSET__preTransform);}
    public void preTransform(int value) {this.ptr.set(LAYOUT__preTransform, OFFSET__preTransform, value);}
    public java.lang.foreign.MemorySegment $preTransform() {return this.ptr.asSlice(OFFSET__preTransform, LAYOUT__preTransform);}

    public int compositeAlpha() {return this.ptr.get(LAYOUT__compositeAlpha, OFFSET__compositeAlpha);}
    public void compositeAlpha(int value) {this.ptr.set(LAYOUT__compositeAlpha, OFFSET__compositeAlpha, value);}
    public java.lang.foreign.MemorySegment $compositeAlpha() {return this.ptr.asSlice(OFFSET__compositeAlpha, LAYOUT__compositeAlpha);}

    public int presentMode() {return this.ptr.get(LAYOUT__presentMode, OFFSET__presentMode);}
    public void presentMode(int value) {this.ptr.set(LAYOUT__presentMode, OFFSET__presentMode, value);}
    public java.lang.foreign.MemorySegment $presentMode() {return this.ptr.asSlice(OFFSET__presentMode, LAYOUT__presentMode);}

    public int clipped() {return this.ptr.get(LAYOUT__clipped, OFFSET__clipped);}
    public void clipped(int value) {this.ptr.set(LAYOUT__clipped, OFFSET__clipped, value);}
    public java.lang.foreign.MemorySegment $clipped() {return this.ptr.asSlice(OFFSET__clipped, LAYOUT__clipped);}

    public java.lang.foreign.MemorySegment oldSwapchain() {return this.ptr.get(LAYOUT__oldSwapchain, OFFSET__oldSwapchain);}
    public void oldSwapchain(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__oldSwapchain, OFFSET__oldSwapchain, value);}
    public java.lang.foreign.MemorySegment $oldSwapchain() {return this.ptr.asSlice(OFFSET__oldSwapchain, LAYOUT__oldSwapchain);}
}
