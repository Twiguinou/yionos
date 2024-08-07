package vulkan;

public record VkExternalFenceProperties(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__exportFromImportedHandleTypes = java.lang.foreign.ValueLayout.JAVA_INT.withName("exportFromImportedHandleTypes");
    public static final long OFFSET__exportFromImportedHandleTypes = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__compatibleHandleTypes = java.lang.foreign.ValueLayout.JAVA_INT.withName("compatibleHandleTypes");
    public static final long OFFSET__compatibleHandleTypes = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__externalFenceFeatures = java.lang.foreign.ValueLayout.JAVA_INT.withName("externalFenceFeatures");
    public static final long OFFSET__externalFenceFeatures = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__exportFromImportedHandleTypes,
            LAYOUT__compatibleHandleTypes,
            LAYOUT__externalFenceFeatures,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkExternalFenceProperties");

    public VkExternalFenceProperties(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkExternalFenceProperties getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkExternalFenceProperties(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkExternalFenceProperties value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int exportFromImportedHandleTypes() {return this.ptr.get(LAYOUT__exportFromImportedHandleTypes, OFFSET__exportFromImportedHandleTypes);}
    public void exportFromImportedHandleTypes(int value) {this.ptr.set(LAYOUT__exportFromImportedHandleTypes, OFFSET__exportFromImportedHandleTypes, value);}
    public java.lang.foreign.MemorySegment $exportFromImportedHandleTypes() {return this.ptr.asSlice(OFFSET__exportFromImportedHandleTypes, LAYOUT__exportFromImportedHandleTypes);}

    public int compatibleHandleTypes() {return this.ptr.get(LAYOUT__compatibleHandleTypes, OFFSET__compatibleHandleTypes);}
    public void compatibleHandleTypes(int value) {this.ptr.set(LAYOUT__compatibleHandleTypes, OFFSET__compatibleHandleTypes, value);}
    public java.lang.foreign.MemorySegment $compatibleHandleTypes() {return this.ptr.asSlice(OFFSET__compatibleHandleTypes, LAYOUT__compatibleHandleTypes);}

    public int externalFenceFeatures() {return this.ptr.get(LAYOUT__externalFenceFeatures, OFFSET__externalFenceFeatures);}
    public void externalFenceFeatures(int value) {this.ptr.set(LAYOUT__externalFenceFeatures, OFFSET__externalFenceFeatures, value);}
    public java.lang.foreign.MemorySegment $externalFenceFeatures() {return this.ptr.asSlice(OFFSET__externalFenceFeatures, LAYOUT__externalFenceFeatures);}
}
