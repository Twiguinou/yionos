package vulkan;

public record VkPhysicalDeviceVulkan13Features(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__robustImageAccess = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__robustImageAccess = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__inlineUniformBlock = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__inlineUniformBlock = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__descriptorBindingInlineUniformBlockUpdateAfterBind = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__descriptorBindingInlineUniformBlockUpdateAfterBind = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__pipelineCreationCacheControl = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__pipelineCreationCacheControl = 28;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__privateData = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__privateData = 32;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderDemoteToHelperInvocation = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__shaderDemoteToHelperInvocation = 36;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderTerminateInvocation = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__shaderTerminateInvocation = 40;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__subgroupSizeControl = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__subgroupSizeControl = 44;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__computeFullSubgroups = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__computeFullSubgroups = 48;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__synchronization2 = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__synchronization2 = 52;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__textureCompressionASTC_HDR = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__textureCompressionASTC_HDR = 56;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderZeroInitializeWorkgroupMemory = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__shaderZeroInitializeWorkgroupMemory = 60;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__dynamicRendering = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__dynamicRendering = 64;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderIntegerDotProduct = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__shaderIntegerDotProduct = 68;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maintenance4 = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__maintenance4 = 72;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__robustImageAccess,
            LAYOUT__inlineUniformBlock,
            LAYOUT__descriptorBindingInlineUniformBlockUpdateAfterBind,
            LAYOUT__pipelineCreationCacheControl,
            LAYOUT__privateData,
            LAYOUT__shaderDemoteToHelperInvocation,
            LAYOUT__shaderTerminateInvocation,
            LAYOUT__subgroupSizeControl,
            LAYOUT__computeFullSubgroups,
            LAYOUT__synchronization2,
            LAYOUT__textureCompressionASTC_HDR,
            LAYOUT__shaderZeroInitializeWorkgroupMemory,
            LAYOUT__dynamicRendering,
            LAYOUT__shaderIntegerDotProduct,
            LAYOUT__maintenance4,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkPhysicalDeviceVulkan13Features");

    public VkPhysicalDeviceVulkan13Features(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceVulkan13Features getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceVulkan13Features(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceVulkan13Features value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int robustImageAccess() {return this.ptr.get(LAYOUT__robustImageAccess, OFFSET__robustImageAccess);}
    public void robustImageAccess(int value) {this.ptr.set(LAYOUT__robustImageAccess, OFFSET__robustImageAccess, value);}
    public java.lang.foreign.MemorySegment $robustImageAccess() {return this.ptr.asSlice(OFFSET__robustImageAccess, LAYOUT__robustImageAccess);}

    public int inlineUniformBlock() {return this.ptr.get(LAYOUT__inlineUniformBlock, OFFSET__inlineUniformBlock);}
    public void inlineUniformBlock(int value) {this.ptr.set(LAYOUT__inlineUniformBlock, OFFSET__inlineUniformBlock, value);}
    public java.lang.foreign.MemorySegment $inlineUniformBlock() {return this.ptr.asSlice(OFFSET__inlineUniformBlock, LAYOUT__inlineUniformBlock);}

    public int descriptorBindingInlineUniformBlockUpdateAfterBind() {return this.ptr.get(LAYOUT__descriptorBindingInlineUniformBlockUpdateAfterBind, OFFSET__descriptorBindingInlineUniformBlockUpdateAfterBind);}
    public void descriptorBindingInlineUniformBlockUpdateAfterBind(int value) {this.ptr.set(LAYOUT__descriptorBindingInlineUniformBlockUpdateAfterBind, OFFSET__descriptorBindingInlineUniformBlockUpdateAfterBind, value);}
    public java.lang.foreign.MemorySegment $descriptorBindingInlineUniformBlockUpdateAfterBind() {return this.ptr.asSlice(OFFSET__descriptorBindingInlineUniformBlockUpdateAfterBind, LAYOUT__descriptorBindingInlineUniformBlockUpdateAfterBind);}

    public int pipelineCreationCacheControl() {return this.ptr.get(LAYOUT__pipelineCreationCacheControl, OFFSET__pipelineCreationCacheControl);}
    public void pipelineCreationCacheControl(int value) {this.ptr.set(LAYOUT__pipelineCreationCacheControl, OFFSET__pipelineCreationCacheControl, value);}
    public java.lang.foreign.MemorySegment $pipelineCreationCacheControl() {return this.ptr.asSlice(OFFSET__pipelineCreationCacheControl, LAYOUT__pipelineCreationCacheControl);}

    public int privateData() {return this.ptr.get(LAYOUT__privateData, OFFSET__privateData);}
    public void privateData(int value) {this.ptr.set(LAYOUT__privateData, OFFSET__privateData, value);}
    public java.lang.foreign.MemorySegment $privateData() {return this.ptr.asSlice(OFFSET__privateData, LAYOUT__privateData);}

    public int shaderDemoteToHelperInvocation() {return this.ptr.get(LAYOUT__shaderDemoteToHelperInvocation, OFFSET__shaderDemoteToHelperInvocation);}
    public void shaderDemoteToHelperInvocation(int value) {this.ptr.set(LAYOUT__shaderDemoteToHelperInvocation, OFFSET__shaderDemoteToHelperInvocation, value);}
    public java.lang.foreign.MemorySegment $shaderDemoteToHelperInvocation() {return this.ptr.asSlice(OFFSET__shaderDemoteToHelperInvocation, LAYOUT__shaderDemoteToHelperInvocation);}

    public int shaderTerminateInvocation() {return this.ptr.get(LAYOUT__shaderTerminateInvocation, OFFSET__shaderTerminateInvocation);}
    public void shaderTerminateInvocation(int value) {this.ptr.set(LAYOUT__shaderTerminateInvocation, OFFSET__shaderTerminateInvocation, value);}
    public java.lang.foreign.MemorySegment $shaderTerminateInvocation() {return this.ptr.asSlice(OFFSET__shaderTerminateInvocation, LAYOUT__shaderTerminateInvocation);}

    public int subgroupSizeControl() {return this.ptr.get(LAYOUT__subgroupSizeControl, OFFSET__subgroupSizeControl);}
    public void subgroupSizeControl(int value) {this.ptr.set(LAYOUT__subgroupSizeControl, OFFSET__subgroupSizeControl, value);}
    public java.lang.foreign.MemorySegment $subgroupSizeControl() {return this.ptr.asSlice(OFFSET__subgroupSizeControl, LAYOUT__subgroupSizeControl);}

    public int computeFullSubgroups() {return this.ptr.get(LAYOUT__computeFullSubgroups, OFFSET__computeFullSubgroups);}
    public void computeFullSubgroups(int value) {this.ptr.set(LAYOUT__computeFullSubgroups, OFFSET__computeFullSubgroups, value);}
    public java.lang.foreign.MemorySegment $computeFullSubgroups() {return this.ptr.asSlice(OFFSET__computeFullSubgroups, LAYOUT__computeFullSubgroups);}

    public int synchronization2() {return this.ptr.get(LAYOUT__synchronization2, OFFSET__synchronization2);}
    public void synchronization2(int value) {this.ptr.set(LAYOUT__synchronization2, OFFSET__synchronization2, value);}
    public java.lang.foreign.MemorySegment $synchronization2() {return this.ptr.asSlice(OFFSET__synchronization2, LAYOUT__synchronization2);}

    public int textureCompressionASTC_HDR() {return this.ptr.get(LAYOUT__textureCompressionASTC_HDR, OFFSET__textureCompressionASTC_HDR);}
    public void textureCompressionASTC_HDR(int value) {this.ptr.set(LAYOUT__textureCompressionASTC_HDR, OFFSET__textureCompressionASTC_HDR, value);}
    public java.lang.foreign.MemorySegment $textureCompressionASTC_HDR() {return this.ptr.asSlice(OFFSET__textureCompressionASTC_HDR, LAYOUT__textureCompressionASTC_HDR);}

    public int shaderZeroInitializeWorkgroupMemory() {return this.ptr.get(LAYOUT__shaderZeroInitializeWorkgroupMemory, OFFSET__shaderZeroInitializeWorkgroupMemory);}
    public void shaderZeroInitializeWorkgroupMemory(int value) {this.ptr.set(LAYOUT__shaderZeroInitializeWorkgroupMemory, OFFSET__shaderZeroInitializeWorkgroupMemory, value);}
    public java.lang.foreign.MemorySegment $shaderZeroInitializeWorkgroupMemory() {return this.ptr.asSlice(OFFSET__shaderZeroInitializeWorkgroupMemory, LAYOUT__shaderZeroInitializeWorkgroupMemory);}

    public int dynamicRendering() {return this.ptr.get(LAYOUT__dynamicRendering, OFFSET__dynamicRendering);}
    public void dynamicRendering(int value) {this.ptr.set(LAYOUT__dynamicRendering, OFFSET__dynamicRendering, value);}
    public java.lang.foreign.MemorySegment $dynamicRendering() {return this.ptr.asSlice(OFFSET__dynamicRendering, LAYOUT__dynamicRendering);}

    public int shaderIntegerDotProduct() {return this.ptr.get(LAYOUT__shaderIntegerDotProduct, OFFSET__shaderIntegerDotProduct);}
    public void shaderIntegerDotProduct(int value) {this.ptr.set(LAYOUT__shaderIntegerDotProduct, OFFSET__shaderIntegerDotProduct, value);}
    public java.lang.foreign.MemorySegment $shaderIntegerDotProduct() {return this.ptr.asSlice(OFFSET__shaderIntegerDotProduct, LAYOUT__shaderIntegerDotProduct);}

    public int maintenance4() {return this.ptr.get(LAYOUT__maintenance4, OFFSET__maintenance4);}
    public void maintenance4(int value) {this.ptr.set(LAYOUT__maintenance4, OFFSET__maintenance4, value);}
    public java.lang.foreign.MemorySegment $maintenance4() {return this.ptr.asSlice(OFFSET__maintenance4, LAYOUT__maintenance4);}
}
