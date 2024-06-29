package vulkan;

public record VkPhysicalDeviceVulkan12Features(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__samplerMirrorClampToEdge = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__samplerMirrorClampToEdge = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__drawIndirectCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__drawIndirectCount = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__storageBuffer8BitAccess = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__storageBuffer8BitAccess = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__uniformAndStorageBuffer8BitAccess = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__uniformAndStorageBuffer8BitAccess = 28;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__storagePushConstant8 = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__storagePushConstant8 = 32;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderBufferInt64Atomics = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__shaderBufferInt64Atomics = 36;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderSharedInt64Atomics = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__shaderSharedInt64Atomics = 40;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderFloat16 = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__shaderFloat16 = 44;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderInt8 = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__shaderInt8 = 48;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__descriptorIndexing = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__descriptorIndexing = 52;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderInputAttachmentArrayDynamicIndexing = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__shaderInputAttachmentArrayDynamicIndexing = 56;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderUniformTexelBufferArrayDynamicIndexing = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__shaderUniformTexelBufferArrayDynamicIndexing = 60;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderStorageTexelBufferArrayDynamicIndexing = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__shaderStorageTexelBufferArrayDynamicIndexing = 64;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderUniformBufferArrayNonUniformIndexing = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__shaderUniformBufferArrayNonUniformIndexing = 68;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderSampledImageArrayNonUniformIndexing = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__shaderSampledImageArrayNonUniformIndexing = 72;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderStorageBufferArrayNonUniformIndexing = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__shaderStorageBufferArrayNonUniformIndexing = 76;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderStorageImageArrayNonUniformIndexing = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__shaderStorageImageArrayNonUniformIndexing = 80;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderInputAttachmentArrayNonUniformIndexing = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__shaderInputAttachmentArrayNonUniformIndexing = 84;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderUniformTexelBufferArrayNonUniformIndexing = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__shaderUniformTexelBufferArrayNonUniformIndexing = 88;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderStorageTexelBufferArrayNonUniformIndexing = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__shaderStorageTexelBufferArrayNonUniformIndexing = 92;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__descriptorBindingUniformBufferUpdateAfterBind = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__descriptorBindingUniformBufferUpdateAfterBind = 96;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__descriptorBindingSampledImageUpdateAfterBind = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__descriptorBindingSampledImageUpdateAfterBind = 100;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__descriptorBindingStorageImageUpdateAfterBind = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__descriptorBindingStorageImageUpdateAfterBind = 104;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__descriptorBindingStorageBufferUpdateAfterBind = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__descriptorBindingStorageBufferUpdateAfterBind = 108;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__descriptorBindingUniformTexelBufferUpdateAfterBind = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__descriptorBindingUniformTexelBufferUpdateAfterBind = 112;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__descriptorBindingStorageTexelBufferUpdateAfterBind = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__descriptorBindingStorageTexelBufferUpdateAfterBind = 116;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__descriptorBindingUpdateUnusedWhilePending = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__descriptorBindingUpdateUnusedWhilePending = 120;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__descriptorBindingPartiallyBound = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__descriptorBindingPartiallyBound = 124;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__descriptorBindingVariableDescriptorCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__descriptorBindingVariableDescriptorCount = 128;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__runtimeDescriptorArray = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__runtimeDescriptorArray = 132;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__samplerFilterMinmax = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__samplerFilterMinmax = 136;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__scalarBlockLayout = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__scalarBlockLayout = 140;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__imagelessFramebuffer = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__imagelessFramebuffer = 144;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__uniformBufferStandardLayout = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__uniformBufferStandardLayout = 148;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderSubgroupExtendedTypes = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__shaderSubgroupExtendedTypes = 152;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__separateDepthStencilLayouts = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__separateDepthStencilLayouts = 156;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__hostQueryReset = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__hostQueryReset = 160;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__timelineSemaphore = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__timelineSemaphore = 164;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__bufferDeviceAddress = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__bufferDeviceAddress = 168;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__bufferDeviceAddressCaptureReplay = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__bufferDeviceAddressCaptureReplay = 172;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__bufferDeviceAddressMultiDevice = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__bufferDeviceAddressMultiDevice = 176;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__vulkanMemoryModel = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__vulkanMemoryModel = 180;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__vulkanMemoryModelDeviceScope = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__vulkanMemoryModelDeviceScope = 184;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__vulkanMemoryModelAvailabilityVisibilityChains = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__vulkanMemoryModelAvailabilityVisibilityChains = 188;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderOutputViewportIndex = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__shaderOutputViewportIndex = 192;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderOutputLayer = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__shaderOutputLayer = 196;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__subgroupBroadcastDynamicId = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__subgroupBroadcastDynamicId = 200;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__samplerMirrorClampToEdge,
            LAYOUT__drawIndirectCount,
            LAYOUT__storageBuffer8BitAccess,
            LAYOUT__uniformAndStorageBuffer8BitAccess,
            LAYOUT__storagePushConstant8,
            LAYOUT__shaderBufferInt64Atomics,
            LAYOUT__shaderSharedInt64Atomics,
            LAYOUT__shaderFloat16,
            LAYOUT__shaderInt8,
            LAYOUT__descriptorIndexing,
            LAYOUT__shaderInputAttachmentArrayDynamicIndexing,
            LAYOUT__shaderUniformTexelBufferArrayDynamicIndexing,
            LAYOUT__shaderStorageTexelBufferArrayDynamicIndexing,
            LAYOUT__shaderUniformBufferArrayNonUniformIndexing,
            LAYOUT__shaderSampledImageArrayNonUniformIndexing,
            LAYOUT__shaderStorageBufferArrayNonUniformIndexing,
            LAYOUT__shaderStorageImageArrayNonUniformIndexing,
            LAYOUT__shaderInputAttachmentArrayNonUniformIndexing,
            LAYOUT__shaderUniformTexelBufferArrayNonUniformIndexing,
            LAYOUT__shaderStorageTexelBufferArrayNonUniformIndexing,
            LAYOUT__descriptorBindingUniformBufferUpdateAfterBind,
            LAYOUT__descriptorBindingSampledImageUpdateAfterBind,
            LAYOUT__descriptorBindingStorageImageUpdateAfterBind,
            LAYOUT__descriptorBindingStorageBufferUpdateAfterBind,
            LAYOUT__descriptorBindingUniformTexelBufferUpdateAfterBind,
            LAYOUT__descriptorBindingStorageTexelBufferUpdateAfterBind,
            LAYOUT__descriptorBindingUpdateUnusedWhilePending,
            LAYOUT__descriptorBindingPartiallyBound,
            LAYOUT__descriptorBindingVariableDescriptorCount,
            LAYOUT__runtimeDescriptorArray,
            LAYOUT__samplerFilterMinmax,
            LAYOUT__scalarBlockLayout,
            LAYOUT__imagelessFramebuffer,
            LAYOUT__uniformBufferStandardLayout,
            LAYOUT__shaderSubgroupExtendedTypes,
            LAYOUT__separateDepthStencilLayouts,
            LAYOUT__hostQueryReset,
            LAYOUT__timelineSemaphore,
            LAYOUT__bufferDeviceAddress,
            LAYOUT__bufferDeviceAddressCaptureReplay,
            LAYOUT__bufferDeviceAddressMultiDevice,
            LAYOUT__vulkanMemoryModel,
            LAYOUT__vulkanMemoryModelDeviceScope,
            LAYOUT__vulkanMemoryModelAvailabilityVisibilityChains,
            LAYOUT__shaderOutputViewportIndex,
            LAYOUT__shaderOutputLayer,
            LAYOUT__subgroupBroadcastDynamicId,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkPhysicalDeviceVulkan12Features");

    public VkPhysicalDeviceVulkan12Features(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceVulkan12Features getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceVulkan12Features(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceVulkan12Features value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int samplerMirrorClampToEdge() {return this.ptr.get(LAYOUT__samplerMirrorClampToEdge, OFFSET__samplerMirrorClampToEdge);}
    public void samplerMirrorClampToEdge(int value) {this.ptr.set(LAYOUT__samplerMirrorClampToEdge, OFFSET__samplerMirrorClampToEdge, value);}
    public java.lang.foreign.MemorySegment $samplerMirrorClampToEdge() {return this.ptr.asSlice(OFFSET__samplerMirrorClampToEdge, LAYOUT__samplerMirrorClampToEdge);}

    public int drawIndirectCount() {return this.ptr.get(LAYOUT__drawIndirectCount, OFFSET__drawIndirectCount);}
    public void drawIndirectCount(int value) {this.ptr.set(LAYOUT__drawIndirectCount, OFFSET__drawIndirectCount, value);}
    public java.lang.foreign.MemorySegment $drawIndirectCount() {return this.ptr.asSlice(OFFSET__drawIndirectCount, LAYOUT__drawIndirectCount);}

    public int storageBuffer8BitAccess() {return this.ptr.get(LAYOUT__storageBuffer8BitAccess, OFFSET__storageBuffer8BitAccess);}
    public void storageBuffer8BitAccess(int value) {this.ptr.set(LAYOUT__storageBuffer8BitAccess, OFFSET__storageBuffer8BitAccess, value);}
    public java.lang.foreign.MemorySegment $storageBuffer8BitAccess() {return this.ptr.asSlice(OFFSET__storageBuffer8BitAccess, LAYOUT__storageBuffer8BitAccess);}

    public int uniformAndStorageBuffer8BitAccess() {return this.ptr.get(LAYOUT__uniformAndStorageBuffer8BitAccess, OFFSET__uniformAndStorageBuffer8BitAccess);}
    public void uniformAndStorageBuffer8BitAccess(int value) {this.ptr.set(LAYOUT__uniformAndStorageBuffer8BitAccess, OFFSET__uniformAndStorageBuffer8BitAccess, value);}
    public java.lang.foreign.MemorySegment $uniformAndStorageBuffer8BitAccess() {return this.ptr.asSlice(OFFSET__uniformAndStorageBuffer8BitAccess, LAYOUT__uniformAndStorageBuffer8BitAccess);}

    public int storagePushConstant8() {return this.ptr.get(LAYOUT__storagePushConstant8, OFFSET__storagePushConstant8);}
    public void storagePushConstant8(int value) {this.ptr.set(LAYOUT__storagePushConstant8, OFFSET__storagePushConstant8, value);}
    public java.lang.foreign.MemorySegment $storagePushConstant8() {return this.ptr.asSlice(OFFSET__storagePushConstant8, LAYOUT__storagePushConstant8);}

    public int shaderBufferInt64Atomics() {return this.ptr.get(LAYOUT__shaderBufferInt64Atomics, OFFSET__shaderBufferInt64Atomics);}
    public void shaderBufferInt64Atomics(int value) {this.ptr.set(LAYOUT__shaderBufferInt64Atomics, OFFSET__shaderBufferInt64Atomics, value);}
    public java.lang.foreign.MemorySegment $shaderBufferInt64Atomics() {return this.ptr.asSlice(OFFSET__shaderBufferInt64Atomics, LAYOUT__shaderBufferInt64Atomics);}

    public int shaderSharedInt64Atomics() {return this.ptr.get(LAYOUT__shaderSharedInt64Atomics, OFFSET__shaderSharedInt64Atomics);}
    public void shaderSharedInt64Atomics(int value) {this.ptr.set(LAYOUT__shaderSharedInt64Atomics, OFFSET__shaderSharedInt64Atomics, value);}
    public java.lang.foreign.MemorySegment $shaderSharedInt64Atomics() {return this.ptr.asSlice(OFFSET__shaderSharedInt64Atomics, LAYOUT__shaderSharedInt64Atomics);}

    public int shaderFloat16() {return this.ptr.get(LAYOUT__shaderFloat16, OFFSET__shaderFloat16);}
    public void shaderFloat16(int value) {this.ptr.set(LAYOUT__shaderFloat16, OFFSET__shaderFloat16, value);}
    public java.lang.foreign.MemorySegment $shaderFloat16() {return this.ptr.asSlice(OFFSET__shaderFloat16, LAYOUT__shaderFloat16);}

    public int shaderInt8() {return this.ptr.get(LAYOUT__shaderInt8, OFFSET__shaderInt8);}
    public void shaderInt8(int value) {this.ptr.set(LAYOUT__shaderInt8, OFFSET__shaderInt8, value);}
    public java.lang.foreign.MemorySegment $shaderInt8() {return this.ptr.asSlice(OFFSET__shaderInt8, LAYOUT__shaderInt8);}

    public int descriptorIndexing() {return this.ptr.get(LAYOUT__descriptorIndexing, OFFSET__descriptorIndexing);}
    public void descriptorIndexing(int value) {this.ptr.set(LAYOUT__descriptorIndexing, OFFSET__descriptorIndexing, value);}
    public java.lang.foreign.MemorySegment $descriptorIndexing() {return this.ptr.asSlice(OFFSET__descriptorIndexing, LAYOUT__descriptorIndexing);}

    public int shaderInputAttachmentArrayDynamicIndexing() {return this.ptr.get(LAYOUT__shaderInputAttachmentArrayDynamicIndexing, OFFSET__shaderInputAttachmentArrayDynamicIndexing);}
    public void shaderInputAttachmentArrayDynamicIndexing(int value) {this.ptr.set(LAYOUT__shaderInputAttachmentArrayDynamicIndexing, OFFSET__shaderInputAttachmentArrayDynamicIndexing, value);}
    public java.lang.foreign.MemorySegment $shaderInputAttachmentArrayDynamicIndexing() {return this.ptr.asSlice(OFFSET__shaderInputAttachmentArrayDynamicIndexing, LAYOUT__shaderInputAttachmentArrayDynamicIndexing);}

    public int shaderUniformTexelBufferArrayDynamicIndexing() {return this.ptr.get(LAYOUT__shaderUniformTexelBufferArrayDynamicIndexing, OFFSET__shaderUniformTexelBufferArrayDynamicIndexing);}
    public void shaderUniformTexelBufferArrayDynamicIndexing(int value) {this.ptr.set(LAYOUT__shaderUniformTexelBufferArrayDynamicIndexing, OFFSET__shaderUniformTexelBufferArrayDynamicIndexing, value);}
    public java.lang.foreign.MemorySegment $shaderUniformTexelBufferArrayDynamicIndexing() {return this.ptr.asSlice(OFFSET__shaderUniformTexelBufferArrayDynamicIndexing, LAYOUT__shaderUniformTexelBufferArrayDynamicIndexing);}

    public int shaderStorageTexelBufferArrayDynamicIndexing() {return this.ptr.get(LAYOUT__shaderStorageTexelBufferArrayDynamicIndexing, OFFSET__shaderStorageTexelBufferArrayDynamicIndexing);}
    public void shaderStorageTexelBufferArrayDynamicIndexing(int value) {this.ptr.set(LAYOUT__shaderStorageTexelBufferArrayDynamicIndexing, OFFSET__shaderStorageTexelBufferArrayDynamicIndexing, value);}
    public java.lang.foreign.MemorySegment $shaderStorageTexelBufferArrayDynamicIndexing() {return this.ptr.asSlice(OFFSET__shaderStorageTexelBufferArrayDynamicIndexing, LAYOUT__shaderStorageTexelBufferArrayDynamicIndexing);}

    public int shaderUniformBufferArrayNonUniformIndexing() {return this.ptr.get(LAYOUT__shaderUniformBufferArrayNonUniformIndexing, OFFSET__shaderUniformBufferArrayNonUniformIndexing);}
    public void shaderUniformBufferArrayNonUniformIndexing(int value) {this.ptr.set(LAYOUT__shaderUniformBufferArrayNonUniformIndexing, OFFSET__shaderUniformBufferArrayNonUniformIndexing, value);}
    public java.lang.foreign.MemorySegment $shaderUniformBufferArrayNonUniformIndexing() {return this.ptr.asSlice(OFFSET__shaderUniformBufferArrayNonUniformIndexing, LAYOUT__shaderUniformBufferArrayNonUniformIndexing);}

    public int shaderSampledImageArrayNonUniformIndexing() {return this.ptr.get(LAYOUT__shaderSampledImageArrayNonUniformIndexing, OFFSET__shaderSampledImageArrayNonUniformIndexing);}
    public void shaderSampledImageArrayNonUniformIndexing(int value) {this.ptr.set(LAYOUT__shaderSampledImageArrayNonUniformIndexing, OFFSET__shaderSampledImageArrayNonUniformIndexing, value);}
    public java.lang.foreign.MemorySegment $shaderSampledImageArrayNonUniformIndexing() {return this.ptr.asSlice(OFFSET__shaderSampledImageArrayNonUniformIndexing, LAYOUT__shaderSampledImageArrayNonUniformIndexing);}

    public int shaderStorageBufferArrayNonUniformIndexing() {return this.ptr.get(LAYOUT__shaderStorageBufferArrayNonUniformIndexing, OFFSET__shaderStorageBufferArrayNonUniformIndexing);}
    public void shaderStorageBufferArrayNonUniformIndexing(int value) {this.ptr.set(LAYOUT__shaderStorageBufferArrayNonUniformIndexing, OFFSET__shaderStorageBufferArrayNonUniformIndexing, value);}
    public java.lang.foreign.MemorySegment $shaderStorageBufferArrayNonUniformIndexing() {return this.ptr.asSlice(OFFSET__shaderStorageBufferArrayNonUniformIndexing, LAYOUT__shaderStorageBufferArrayNonUniformIndexing);}

    public int shaderStorageImageArrayNonUniformIndexing() {return this.ptr.get(LAYOUT__shaderStorageImageArrayNonUniformIndexing, OFFSET__shaderStorageImageArrayNonUniformIndexing);}
    public void shaderStorageImageArrayNonUniformIndexing(int value) {this.ptr.set(LAYOUT__shaderStorageImageArrayNonUniformIndexing, OFFSET__shaderStorageImageArrayNonUniformIndexing, value);}
    public java.lang.foreign.MemorySegment $shaderStorageImageArrayNonUniformIndexing() {return this.ptr.asSlice(OFFSET__shaderStorageImageArrayNonUniformIndexing, LAYOUT__shaderStorageImageArrayNonUniformIndexing);}

    public int shaderInputAttachmentArrayNonUniformIndexing() {return this.ptr.get(LAYOUT__shaderInputAttachmentArrayNonUniformIndexing, OFFSET__shaderInputAttachmentArrayNonUniformIndexing);}
    public void shaderInputAttachmentArrayNonUniformIndexing(int value) {this.ptr.set(LAYOUT__shaderInputAttachmentArrayNonUniformIndexing, OFFSET__shaderInputAttachmentArrayNonUniformIndexing, value);}
    public java.lang.foreign.MemorySegment $shaderInputAttachmentArrayNonUniformIndexing() {return this.ptr.asSlice(OFFSET__shaderInputAttachmentArrayNonUniformIndexing, LAYOUT__shaderInputAttachmentArrayNonUniformIndexing);}

    public int shaderUniformTexelBufferArrayNonUniformIndexing() {return this.ptr.get(LAYOUT__shaderUniformTexelBufferArrayNonUniformIndexing, OFFSET__shaderUniformTexelBufferArrayNonUniformIndexing);}
    public void shaderUniformTexelBufferArrayNonUniformIndexing(int value) {this.ptr.set(LAYOUT__shaderUniformTexelBufferArrayNonUniformIndexing, OFFSET__shaderUniformTexelBufferArrayNonUniformIndexing, value);}
    public java.lang.foreign.MemorySegment $shaderUniformTexelBufferArrayNonUniformIndexing() {return this.ptr.asSlice(OFFSET__shaderUniformTexelBufferArrayNonUniformIndexing, LAYOUT__shaderUniformTexelBufferArrayNonUniformIndexing);}

    public int shaderStorageTexelBufferArrayNonUniformIndexing() {return this.ptr.get(LAYOUT__shaderStorageTexelBufferArrayNonUniformIndexing, OFFSET__shaderStorageTexelBufferArrayNonUniformIndexing);}
    public void shaderStorageTexelBufferArrayNonUniformIndexing(int value) {this.ptr.set(LAYOUT__shaderStorageTexelBufferArrayNonUniformIndexing, OFFSET__shaderStorageTexelBufferArrayNonUniformIndexing, value);}
    public java.lang.foreign.MemorySegment $shaderStorageTexelBufferArrayNonUniformIndexing() {return this.ptr.asSlice(OFFSET__shaderStorageTexelBufferArrayNonUniformIndexing, LAYOUT__shaderStorageTexelBufferArrayNonUniformIndexing);}

    public int descriptorBindingUniformBufferUpdateAfterBind() {return this.ptr.get(LAYOUT__descriptorBindingUniformBufferUpdateAfterBind, OFFSET__descriptorBindingUniformBufferUpdateAfterBind);}
    public void descriptorBindingUniformBufferUpdateAfterBind(int value) {this.ptr.set(LAYOUT__descriptorBindingUniformBufferUpdateAfterBind, OFFSET__descriptorBindingUniformBufferUpdateAfterBind, value);}
    public java.lang.foreign.MemorySegment $descriptorBindingUniformBufferUpdateAfterBind() {return this.ptr.asSlice(OFFSET__descriptorBindingUniformBufferUpdateAfterBind, LAYOUT__descriptorBindingUniformBufferUpdateAfterBind);}

    public int descriptorBindingSampledImageUpdateAfterBind() {return this.ptr.get(LAYOUT__descriptorBindingSampledImageUpdateAfterBind, OFFSET__descriptorBindingSampledImageUpdateAfterBind);}
    public void descriptorBindingSampledImageUpdateAfterBind(int value) {this.ptr.set(LAYOUT__descriptorBindingSampledImageUpdateAfterBind, OFFSET__descriptorBindingSampledImageUpdateAfterBind, value);}
    public java.lang.foreign.MemorySegment $descriptorBindingSampledImageUpdateAfterBind() {return this.ptr.asSlice(OFFSET__descriptorBindingSampledImageUpdateAfterBind, LAYOUT__descriptorBindingSampledImageUpdateAfterBind);}

    public int descriptorBindingStorageImageUpdateAfterBind() {return this.ptr.get(LAYOUT__descriptorBindingStorageImageUpdateAfterBind, OFFSET__descriptorBindingStorageImageUpdateAfterBind);}
    public void descriptorBindingStorageImageUpdateAfterBind(int value) {this.ptr.set(LAYOUT__descriptorBindingStorageImageUpdateAfterBind, OFFSET__descriptorBindingStorageImageUpdateAfterBind, value);}
    public java.lang.foreign.MemorySegment $descriptorBindingStorageImageUpdateAfterBind() {return this.ptr.asSlice(OFFSET__descriptorBindingStorageImageUpdateAfterBind, LAYOUT__descriptorBindingStorageImageUpdateAfterBind);}

    public int descriptorBindingStorageBufferUpdateAfterBind() {return this.ptr.get(LAYOUT__descriptorBindingStorageBufferUpdateAfterBind, OFFSET__descriptorBindingStorageBufferUpdateAfterBind);}
    public void descriptorBindingStorageBufferUpdateAfterBind(int value) {this.ptr.set(LAYOUT__descriptorBindingStorageBufferUpdateAfterBind, OFFSET__descriptorBindingStorageBufferUpdateAfterBind, value);}
    public java.lang.foreign.MemorySegment $descriptorBindingStorageBufferUpdateAfterBind() {return this.ptr.asSlice(OFFSET__descriptorBindingStorageBufferUpdateAfterBind, LAYOUT__descriptorBindingStorageBufferUpdateAfterBind);}

    public int descriptorBindingUniformTexelBufferUpdateAfterBind() {return this.ptr.get(LAYOUT__descriptorBindingUniformTexelBufferUpdateAfterBind, OFFSET__descriptorBindingUniformTexelBufferUpdateAfterBind);}
    public void descriptorBindingUniformTexelBufferUpdateAfterBind(int value) {this.ptr.set(LAYOUT__descriptorBindingUniformTexelBufferUpdateAfterBind, OFFSET__descriptorBindingUniformTexelBufferUpdateAfterBind, value);}
    public java.lang.foreign.MemorySegment $descriptorBindingUniformTexelBufferUpdateAfterBind() {return this.ptr.asSlice(OFFSET__descriptorBindingUniformTexelBufferUpdateAfterBind, LAYOUT__descriptorBindingUniformTexelBufferUpdateAfterBind);}

    public int descriptorBindingStorageTexelBufferUpdateAfterBind() {return this.ptr.get(LAYOUT__descriptorBindingStorageTexelBufferUpdateAfterBind, OFFSET__descriptorBindingStorageTexelBufferUpdateAfterBind);}
    public void descriptorBindingStorageTexelBufferUpdateAfterBind(int value) {this.ptr.set(LAYOUT__descriptorBindingStorageTexelBufferUpdateAfterBind, OFFSET__descriptorBindingStorageTexelBufferUpdateAfterBind, value);}
    public java.lang.foreign.MemorySegment $descriptorBindingStorageTexelBufferUpdateAfterBind() {return this.ptr.asSlice(OFFSET__descriptorBindingStorageTexelBufferUpdateAfterBind, LAYOUT__descriptorBindingStorageTexelBufferUpdateAfterBind);}

    public int descriptorBindingUpdateUnusedWhilePending() {return this.ptr.get(LAYOUT__descriptorBindingUpdateUnusedWhilePending, OFFSET__descriptorBindingUpdateUnusedWhilePending);}
    public void descriptorBindingUpdateUnusedWhilePending(int value) {this.ptr.set(LAYOUT__descriptorBindingUpdateUnusedWhilePending, OFFSET__descriptorBindingUpdateUnusedWhilePending, value);}
    public java.lang.foreign.MemorySegment $descriptorBindingUpdateUnusedWhilePending() {return this.ptr.asSlice(OFFSET__descriptorBindingUpdateUnusedWhilePending, LAYOUT__descriptorBindingUpdateUnusedWhilePending);}

    public int descriptorBindingPartiallyBound() {return this.ptr.get(LAYOUT__descriptorBindingPartiallyBound, OFFSET__descriptorBindingPartiallyBound);}
    public void descriptorBindingPartiallyBound(int value) {this.ptr.set(LAYOUT__descriptorBindingPartiallyBound, OFFSET__descriptorBindingPartiallyBound, value);}
    public java.lang.foreign.MemorySegment $descriptorBindingPartiallyBound() {return this.ptr.asSlice(OFFSET__descriptorBindingPartiallyBound, LAYOUT__descriptorBindingPartiallyBound);}

    public int descriptorBindingVariableDescriptorCount() {return this.ptr.get(LAYOUT__descriptorBindingVariableDescriptorCount, OFFSET__descriptorBindingVariableDescriptorCount);}
    public void descriptorBindingVariableDescriptorCount(int value) {this.ptr.set(LAYOUT__descriptorBindingVariableDescriptorCount, OFFSET__descriptorBindingVariableDescriptorCount, value);}
    public java.lang.foreign.MemorySegment $descriptorBindingVariableDescriptorCount() {return this.ptr.asSlice(OFFSET__descriptorBindingVariableDescriptorCount, LAYOUT__descriptorBindingVariableDescriptorCount);}

    public int runtimeDescriptorArray() {return this.ptr.get(LAYOUT__runtimeDescriptorArray, OFFSET__runtimeDescriptorArray);}
    public void runtimeDescriptorArray(int value) {this.ptr.set(LAYOUT__runtimeDescriptorArray, OFFSET__runtimeDescriptorArray, value);}
    public java.lang.foreign.MemorySegment $runtimeDescriptorArray() {return this.ptr.asSlice(OFFSET__runtimeDescriptorArray, LAYOUT__runtimeDescriptorArray);}

    public int samplerFilterMinmax() {return this.ptr.get(LAYOUT__samplerFilterMinmax, OFFSET__samplerFilterMinmax);}
    public void samplerFilterMinmax(int value) {this.ptr.set(LAYOUT__samplerFilterMinmax, OFFSET__samplerFilterMinmax, value);}
    public java.lang.foreign.MemorySegment $samplerFilterMinmax() {return this.ptr.asSlice(OFFSET__samplerFilterMinmax, LAYOUT__samplerFilterMinmax);}

    public int scalarBlockLayout() {return this.ptr.get(LAYOUT__scalarBlockLayout, OFFSET__scalarBlockLayout);}
    public void scalarBlockLayout(int value) {this.ptr.set(LAYOUT__scalarBlockLayout, OFFSET__scalarBlockLayout, value);}
    public java.lang.foreign.MemorySegment $scalarBlockLayout() {return this.ptr.asSlice(OFFSET__scalarBlockLayout, LAYOUT__scalarBlockLayout);}

    public int imagelessFramebuffer() {return this.ptr.get(LAYOUT__imagelessFramebuffer, OFFSET__imagelessFramebuffer);}
    public void imagelessFramebuffer(int value) {this.ptr.set(LAYOUT__imagelessFramebuffer, OFFSET__imagelessFramebuffer, value);}
    public java.lang.foreign.MemorySegment $imagelessFramebuffer() {return this.ptr.asSlice(OFFSET__imagelessFramebuffer, LAYOUT__imagelessFramebuffer);}

    public int uniformBufferStandardLayout() {return this.ptr.get(LAYOUT__uniformBufferStandardLayout, OFFSET__uniformBufferStandardLayout);}
    public void uniformBufferStandardLayout(int value) {this.ptr.set(LAYOUT__uniformBufferStandardLayout, OFFSET__uniformBufferStandardLayout, value);}
    public java.lang.foreign.MemorySegment $uniformBufferStandardLayout() {return this.ptr.asSlice(OFFSET__uniformBufferStandardLayout, LAYOUT__uniformBufferStandardLayout);}

    public int shaderSubgroupExtendedTypes() {return this.ptr.get(LAYOUT__shaderSubgroupExtendedTypes, OFFSET__shaderSubgroupExtendedTypes);}
    public void shaderSubgroupExtendedTypes(int value) {this.ptr.set(LAYOUT__shaderSubgroupExtendedTypes, OFFSET__shaderSubgroupExtendedTypes, value);}
    public java.lang.foreign.MemorySegment $shaderSubgroupExtendedTypes() {return this.ptr.asSlice(OFFSET__shaderSubgroupExtendedTypes, LAYOUT__shaderSubgroupExtendedTypes);}

    public int separateDepthStencilLayouts() {return this.ptr.get(LAYOUT__separateDepthStencilLayouts, OFFSET__separateDepthStencilLayouts);}
    public void separateDepthStencilLayouts(int value) {this.ptr.set(LAYOUT__separateDepthStencilLayouts, OFFSET__separateDepthStencilLayouts, value);}
    public java.lang.foreign.MemorySegment $separateDepthStencilLayouts() {return this.ptr.asSlice(OFFSET__separateDepthStencilLayouts, LAYOUT__separateDepthStencilLayouts);}

    public int hostQueryReset() {return this.ptr.get(LAYOUT__hostQueryReset, OFFSET__hostQueryReset);}
    public void hostQueryReset(int value) {this.ptr.set(LAYOUT__hostQueryReset, OFFSET__hostQueryReset, value);}
    public java.lang.foreign.MemorySegment $hostQueryReset() {return this.ptr.asSlice(OFFSET__hostQueryReset, LAYOUT__hostQueryReset);}

    public int timelineSemaphore() {return this.ptr.get(LAYOUT__timelineSemaphore, OFFSET__timelineSemaphore);}
    public void timelineSemaphore(int value) {this.ptr.set(LAYOUT__timelineSemaphore, OFFSET__timelineSemaphore, value);}
    public java.lang.foreign.MemorySegment $timelineSemaphore() {return this.ptr.asSlice(OFFSET__timelineSemaphore, LAYOUT__timelineSemaphore);}

    public int bufferDeviceAddress() {return this.ptr.get(LAYOUT__bufferDeviceAddress, OFFSET__bufferDeviceAddress);}
    public void bufferDeviceAddress(int value) {this.ptr.set(LAYOUT__bufferDeviceAddress, OFFSET__bufferDeviceAddress, value);}
    public java.lang.foreign.MemorySegment $bufferDeviceAddress() {return this.ptr.asSlice(OFFSET__bufferDeviceAddress, LAYOUT__bufferDeviceAddress);}

    public int bufferDeviceAddressCaptureReplay() {return this.ptr.get(LAYOUT__bufferDeviceAddressCaptureReplay, OFFSET__bufferDeviceAddressCaptureReplay);}
    public void bufferDeviceAddressCaptureReplay(int value) {this.ptr.set(LAYOUT__bufferDeviceAddressCaptureReplay, OFFSET__bufferDeviceAddressCaptureReplay, value);}
    public java.lang.foreign.MemorySegment $bufferDeviceAddressCaptureReplay() {return this.ptr.asSlice(OFFSET__bufferDeviceAddressCaptureReplay, LAYOUT__bufferDeviceAddressCaptureReplay);}

    public int bufferDeviceAddressMultiDevice() {return this.ptr.get(LAYOUT__bufferDeviceAddressMultiDevice, OFFSET__bufferDeviceAddressMultiDevice);}
    public void bufferDeviceAddressMultiDevice(int value) {this.ptr.set(LAYOUT__bufferDeviceAddressMultiDevice, OFFSET__bufferDeviceAddressMultiDevice, value);}
    public java.lang.foreign.MemorySegment $bufferDeviceAddressMultiDevice() {return this.ptr.asSlice(OFFSET__bufferDeviceAddressMultiDevice, LAYOUT__bufferDeviceAddressMultiDevice);}

    public int vulkanMemoryModel() {return this.ptr.get(LAYOUT__vulkanMemoryModel, OFFSET__vulkanMemoryModel);}
    public void vulkanMemoryModel(int value) {this.ptr.set(LAYOUT__vulkanMemoryModel, OFFSET__vulkanMemoryModel, value);}
    public java.lang.foreign.MemorySegment $vulkanMemoryModel() {return this.ptr.asSlice(OFFSET__vulkanMemoryModel, LAYOUT__vulkanMemoryModel);}

    public int vulkanMemoryModelDeviceScope() {return this.ptr.get(LAYOUT__vulkanMemoryModelDeviceScope, OFFSET__vulkanMemoryModelDeviceScope);}
    public void vulkanMemoryModelDeviceScope(int value) {this.ptr.set(LAYOUT__vulkanMemoryModelDeviceScope, OFFSET__vulkanMemoryModelDeviceScope, value);}
    public java.lang.foreign.MemorySegment $vulkanMemoryModelDeviceScope() {return this.ptr.asSlice(OFFSET__vulkanMemoryModelDeviceScope, LAYOUT__vulkanMemoryModelDeviceScope);}

    public int vulkanMemoryModelAvailabilityVisibilityChains() {return this.ptr.get(LAYOUT__vulkanMemoryModelAvailabilityVisibilityChains, OFFSET__vulkanMemoryModelAvailabilityVisibilityChains);}
    public void vulkanMemoryModelAvailabilityVisibilityChains(int value) {this.ptr.set(LAYOUT__vulkanMemoryModelAvailabilityVisibilityChains, OFFSET__vulkanMemoryModelAvailabilityVisibilityChains, value);}
    public java.lang.foreign.MemorySegment $vulkanMemoryModelAvailabilityVisibilityChains() {return this.ptr.asSlice(OFFSET__vulkanMemoryModelAvailabilityVisibilityChains, LAYOUT__vulkanMemoryModelAvailabilityVisibilityChains);}

    public int shaderOutputViewportIndex() {return this.ptr.get(LAYOUT__shaderOutputViewportIndex, OFFSET__shaderOutputViewportIndex);}
    public void shaderOutputViewportIndex(int value) {this.ptr.set(LAYOUT__shaderOutputViewportIndex, OFFSET__shaderOutputViewportIndex, value);}
    public java.lang.foreign.MemorySegment $shaderOutputViewportIndex() {return this.ptr.asSlice(OFFSET__shaderOutputViewportIndex, LAYOUT__shaderOutputViewportIndex);}

    public int shaderOutputLayer() {return this.ptr.get(LAYOUT__shaderOutputLayer, OFFSET__shaderOutputLayer);}
    public void shaderOutputLayer(int value) {this.ptr.set(LAYOUT__shaderOutputLayer, OFFSET__shaderOutputLayer, value);}
    public java.lang.foreign.MemorySegment $shaderOutputLayer() {return this.ptr.asSlice(OFFSET__shaderOutputLayer, LAYOUT__shaderOutputLayer);}

    public int subgroupBroadcastDynamicId() {return this.ptr.get(LAYOUT__subgroupBroadcastDynamicId, OFFSET__subgroupBroadcastDynamicId);}
    public void subgroupBroadcastDynamicId(int value) {this.ptr.set(LAYOUT__subgroupBroadcastDynamicId, OFFSET__subgroupBroadcastDynamicId, value);}
    public java.lang.foreign.MemorySegment $subgroupBroadcastDynamicId() {return this.ptr.asSlice(OFFSET__subgroupBroadcastDynamicId, LAYOUT__subgroupBroadcastDynamicId);}
}
