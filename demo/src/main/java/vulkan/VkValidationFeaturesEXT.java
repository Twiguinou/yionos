package vulkan;

public record VkValidationFeaturesEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__enabledValidationFeatureCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("enabledValidationFeatureCount");
    public static final long OFFSET__enabledValidationFeatureCount = 16;
    public static final java.lang.foreign.AddressLayout LAYOUT__pEnabledValidationFeatures = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pEnabledValidationFeatures");
    public static final long OFFSET__pEnabledValidationFeatures = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__disabledValidationFeatureCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("disabledValidationFeatureCount");
    public static final long OFFSET__disabledValidationFeatureCount = 32;
    public static final java.lang.foreign.AddressLayout LAYOUT__pDisabledValidationFeatures = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pDisabledValidationFeatures");
    public static final long OFFSET__pDisabledValidationFeatures = 40;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__enabledValidationFeatureCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pEnabledValidationFeatures,
            LAYOUT__disabledValidationFeatureCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pDisabledValidationFeatures
    ).withByteAlignment(8).withName("VkValidationFeaturesEXT");

    public VkValidationFeaturesEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkValidationFeaturesEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkValidationFeaturesEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkValidationFeaturesEXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int enabledValidationFeatureCount() {return this.ptr.get(LAYOUT__enabledValidationFeatureCount, OFFSET__enabledValidationFeatureCount);}
    public void enabledValidationFeatureCount(int value) {this.ptr.set(LAYOUT__enabledValidationFeatureCount, OFFSET__enabledValidationFeatureCount, value);}
    public java.lang.foreign.MemorySegment $enabledValidationFeatureCount() {return this.ptr.asSlice(OFFSET__enabledValidationFeatureCount, LAYOUT__enabledValidationFeatureCount);}

    public java.lang.foreign.MemorySegment pEnabledValidationFeatures() {return this.ptr.get(LAYOUT__pEnabledValidationFeatures, OFFSET__pEnabledValidationFeatures);}
    public void pEnabledValidationFeatures(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pEnabledValidationFeatures, OFFSET__pEnabledValidationFeatures, value);}
    public java.lang.foreign.MemorySegment $pEnabledValidationFeatures() {return this.ptr.asSlice(OFFSET__pEnabledValidationFeatures, LAYOUT__pEnabledValidationFeatures);}

    public int disabledValidationFeatureCount() {return this.ptr.get(LAYOUT__disabledValidationFeatureCount, OFFSET__disabledValidationFeatureCount);}
    public void disabledValidationFeatureCount(int value) {this.ptr.set(LAYOUT__disabledValidationFeatureCount, OFFSET__disabledValidationFeatureCount, value);}
    public java.lang.foreign.MemorySegment $disabledValidationFeatureCount() {return this.ptr.asSlice(OFFSET__disabledValidationFeatureCount, LAYOUT__disabledValidationFeatureCount);}

    public java.lang.foreign.MemorySegment pDisabledValidationFeatures() {return this.ptr.get(LAYOUT__pDisabledValidationFeatures, OFFSET__pDisabledValidationFeatures);}
    public void pDisabledValidationFeatures(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pDisabledValidationFeatures, OFFSET__pDisabledValidationFeatures, value);}
    public java.lang.foreign.MemorySegment $pDisabledValidationFeatures() {return this.ptr.asSlice(OFFSET__pDisabledValidationFeatures, LAYOUT__pDisabledValidationFeatures);}
}
