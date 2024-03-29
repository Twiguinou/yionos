package vulkan;

public record VkExternalMemoryProperties(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$externalMemoryFeatures = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$externalMemoryFeatures = 0L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$exportFromImportedHandleTypes = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$exportFromImportedHandleTypes = 4L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$compatibleHandleTypes = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$compatibleHandleTypes = 8L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$externalMemoryFeatures,
            LAYOUT$exportFromImportedHandleTypes,
            LAYOUT$compatibleHandleTypes
    ).withName("VkExternalMemoryProperties");

    public VkExternalMemoryProperties(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VkExternalMemoryProperties getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VkExternalMemoryProperties(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int externalMemoryFeatures() {return this.ptr.get(LAYOUT$externalMemoryFeatures, OFFSET$externalMemoryFeatures);}
    public void externalMemoryFeatures(int value) {this.ptr.set(LAYOUT$externalMemoryFeatures, OFFSET$externalMemoryFeatures, value);}
    public java.lang.foreign.MemorySegment externalMemoryFeatures_ptr() {return this.ptr.asSlice(OFFSET$externalMemoryFeatures, LAYOUT$externalMemoryFeatures);}

    public int exportFromImportedHandleTypes() {return this.ptr.get(LAYOUT$exportFromImportedHandleTypes, OFFSET$exportFromImportedHandleTypes);}
    public void exportFromImportedHandleTypes(int value) {this.ptr.set(LAYOUT$exportFromImportedHandleTypes, OFFSET$exportFromImportedHandleTypes, value);}
    public java.lang.foreign.MemorySegment exportFromImportedHandleTypes_ptr() {return this.ptr.asSlice(OFFSET$exportFromImportedHandleTypes, LAYOUT$exportFromImportedHandleTypes);}

    public int compatibleHandleTypes() {return this.ptr.get(LAYOUT$compatibleHandleTypes, OFFSET$compatibleHandleTypes);}
    public void compatibleHandleTypes(int value) {this.ptr.set(LAYOUT$compatibleHandleTypes, OFFSET$compatibleHandleTypes, value);}
    public java.lang.foreign.MemorySegment compatibleHandleTypes_ptr() {return this.ptr.asSlice(OFFSET$compatibleHandleTypes, LAYOUT$compatibleHandleTypes);}
}
