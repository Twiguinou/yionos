package vulkan;

public record VkExternalMemoryProperties(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__externalMemoryFeatures = java.lang.foreign.ValueLayout.JAVA_INT.withName("externalMemoryFeatures");
    public static final long OFFSET__externalMemoryFeatures = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__exportFromImportedHandleTypes = java.lang.foreign.ValueLayout.JAVA_INT.withName("exportFromImportedHandleTypes");
    public static final long OFFSET__exportFromImportedHandleTypes = 4;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__compatibleHandleTypes = java.lang.foreign.ValueLayout.JAVA_INT.withName("compatibleHandleTypes");
    public static final long OFFSET__compatibleHandleTypes = 8;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__externalMemoryFeatures,
            LAYOUT__exportFromImportedHandleTypes,
            LAYOUT__compatibleHandleTypes
    ).withByteAlignment(4).withName("VkExternalMemoryProperties");

    public VkExternalMemoryProperties(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkExternalMemoryProperties getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkExternalMemoryProperties(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkExternalMemoryProperties value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int externalMemoryFeatures() {return this.ptr.get(LAYOUT__externalMemoryFeatures, OFFSET__externalMemoryFeatures);}
    public void externalMemoryFeatures(int value) {this.ptr.set(LAYOUT__externalMemoryFeatures, OFFSET__externalMemoryFeatures, value);}
    public java.lang.foreign.MemorySegment $externalMemoryFeatures() {return this.ptr.asSlice(OFFSET__externalMemoryFeatures, LAYOUT__externalMemoryFeatures);}

    public int exportFromImportedHandleTypes() {return this.ptr.get(LAYOUT__exportFromImportedHandleTypes, OFFSET__exportFromImportedHandleTypes);}
    public void exportFromImportedHandleTypes(int value) {this.ptr.set(LAYOUT__exportFromImportedHandleTypes, OFFSET__exportFromImportedHandleTypes, value);}
    public java.lang.foreign.MemorySegment $exportFromImportedHandleTypes() {return this.ptr.asSlice(OFFSET__exportFromImportedHandleTypes, LAYOUT__exportFromImportedHandleTypes);}

    public int compatibleHandleTypes() {return this.ptr.get(LAYOUT__compatibleHandleTypes, OFFSET__compatibleHandleTypes);}
    public void compatibleHandleTypes(int value) {this.ptr.set(LAYOUT__compatibleHandleTypes, OFFSET__compatibleHandleTypes, value);}
    public java.lang.foreign.MemorySegment $compatibleHandleTypes() {return this.ptr.asSlice(OFFSET__compatibleHandleTypes, LAYOUT__compatibleHandleTypes);}
}
