package vulkan;

public record VkPhysicalDeviceDescriptorIndexingFeatures(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderInputAttachmentArrayDynamicIndexing = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__shaderInputAttachmentArrayDynamicIndexing = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderUniformTexelBufferArrayDynamicIndexing = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__shaderUniformTexelBufferArrayDynamicIndexing = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderStorageTexelBufferArrayDynamicIndexing = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__shaderStorageTexelBufferArrayDynamicIndexing = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderUniformBufferArrayNonUniformIndexing = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__shaderUniformBufferArrayNonUniformIndexing = 28;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderSampledImageArrayNonUniformIndexing = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__shaderSampledImageArrayNonUniformIndexing = 32;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderStorageBufferArrayNonUniformIndexing = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__shaderStorageBufferArrayNonUniformIndexing = 36;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderStorageImageArrayNonUniformIndexing = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__shaderStorageImageArrayNonUniformIndexing = 40;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderInputAttachmentArrayNonUniformIndexing = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__shaderInputAttachmentArrayNonUniformIndexing = 44;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderUniformTexelBufferArrayNonUniformIndexing = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__shaderUniformTexelBufferArrayNonUniformIndexing = 48;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderStorageTexelBufferArrayNonUniformIndexing = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__shaderStorageTexelBufferArrayNonUniformIndexing = 52;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__descriptorBindingUniformBufferUpdateAfterBind = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__descriptorBindingUniformBufferUpdateAfterBind = 56;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__descriptorBindingSampledImageUpdateAfterBind = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__descriptorBindingSampledImageUpdateAfterBind = 60;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__descriptorBindingStorageImageUpdateAfterBind = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__descriptorBindingStorageImageUpdateAfterBind = 64;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__descriptorBindingStorageBufferUpdateAfterBind = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__descriptorBindingStorageBufferUpdateAfterBind = 68;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__descriptorBindingUniformTexelBufferUpdateAfterBind = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__descriptorBindingUniformTexelBufferUpdateAfterBind = 72;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__descriptorBindingStorageTexelBufferUpdateAfterBind = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__descriptorBindingStorageTexelBufferUpdateAfterBind = 76;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__descriptorBindingUpdateUnusedWhilePending = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__descriptorBindingUpdateUnusedWhilePending = 80;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__descriptorBindingPartiallyBound = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__descriptorBindingPartiallyBound = 84;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__descriptorBindingVariableDescriptorCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__descriptorBindingVariableDescriptorCount = 88;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__runtimeDescriptorArray = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__runtimeDescriptorArray = 92;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
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
            LAYOUT__runtimeDescriptorArray
    ).withByteAlignment(8).withName("VkPhysicalDeviceDescriptorIndexingFeatures");

    public VkPhysicalDeviceDescriptorIndexingFeatures(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceDescriptorIndexingFeatures getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceDescriptorIndexingFeatures(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceDescriptorIndexingFeatures value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

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
}
