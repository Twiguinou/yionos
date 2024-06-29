package vulkan;

public record VkExternalImageFormatPropertiesNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT__imageFormatProperties = vulkan.VkImageFormatProperties.gRecordLayout;
    public static final long OFFSET__imageFormatProperties = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__externalMemoryFeatures = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__externalMemoryFeatures = 32;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__exportFromImportedHandleTypes = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__exportFromImportedHandleTypes = 36;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__compatibleHandleTypes = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__compatibleHandleTypes = 40;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__imageFormatProperties,
            LAYOUT__externalMemoryFeatures,
            LAYOUT__exportFromImportedHandleTypes,
            LAYOUT__compatibleHandleTypes,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkExternalImageFormatPropertiesNV");

    public VkExternalImageFormatPropertiesNV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkExternalImageFormatPropertiesNV getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkExternalImageFormatPropertiesNV(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkExternalImageFormatPropertiesNV value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public vulkan.VkImageFormatProperties imageFormatProperties() {return new vulkan.VkImageFormatProperties(this.ptr.asSlice(OFFSET__imageFormatProperties, LAYOUT__imageFormatProperties));}
    public void imageFormatProperties(java.util.function.Consumer<vulkan.VkImageFormatProperties> consumer) {consumer.accept(this.imageFormatProperties());}
    public void imageFormatProperties(vulkan.VkImageFormatProperties value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__imageFormatProperties, LAYOUT__imageFormatProperties.byteSize());}

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
