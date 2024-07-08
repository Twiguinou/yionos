package vulkan;

public record VkPhysicalDeviceSparseProperties(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__residencyStandard2DBlockShape = java.lang.foreign.ValueLayout.JAVA_INT.withName("residencyStandard2DBlockShape");
    public static final long OFFSET__residencyStandard2DBlockShape = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__residencyStandard2DMultisampleBlockShape = java.lang.foreign.ValueLayout.JAVA_INT.withName("residencyStandard2DMultisampleBlockShape");
    public static final long OFFSET__residencyStandard2DMultisampleBlockShape = 4;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__residencyStandard3DBlockShape = java.lang.foreign.ValueLayout.JAVA_INT.withName("residencyStandard3DBlockShape");
    public static final long OFFSET__residencyStandard3DBlockShape = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__residencyAlignedMipSize = java.lang.foreign.ValueLayout.JAVA_INT.withName("residencyAlignedMipSize");
    public static final long OFFSET__residencyAlignedMipSize = 12;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__residencyNonResidentStrict = java.lang.foreign.ValueLayout.JAVA_INT.withName("residencyNonResidentStrict");
    public static final long OFFSET__residencyNonResidentStrict = 16;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__residencyStandard2DBlockShape,
            LAYOUT__residencyStandard2DMultisampleBlockShape,
            LAYOUT__residencyStandard3DBlockShape,
            LAYOUT__residencyAlignedMipSize,
            LAYOUT__residencyNonResidentStrict
    ).withByteAlignment(4).withName("VkPhysicalDeviceSparseProperties");

    public VkPhysicalDeviceSparseProperties(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceSparseProperties getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceSparseProperties(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceSparseProperties value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int residencyStandard2DBlockShape() {return this.ptr.get(LAYOUT__residencyStandard2DBlockShape, OFFSET__residencyStandard2DBlockShape);}
    public void residencyStandard2DBlockShape(int value) {this.ptr.set(LAYOUT__residencyStandard2DBlockShape, OFFSET__residencyStandard2DBlockShape, value);}
    public java.lang.foreign.MemorySegment $residencyStandard2DBlockShape() {return this.ptr.asSlice(OFFSET__residencyStandard2DBlockShape, LAYOUT__residencyStandard2DBlockShape);}

    public int residencyStandard2DMultisampleBlockShape() {return this.ptr.get(LAYOUT__residencyStandard2DMultisampleBlockShape, OFFSET__residencyStandard2DMultisampleBlockShape);}
    public void residencyStandard2DMultisampleBlockShape(int value) {this.ptr.set(LAYOUT__residencyStandard2DMultisampleBlockShape, OFFSET__residencyStandard2DMultisampleBlockShape, value);}
    public java.lang.foreign.MemorySegment $residencyStandard2DMultisampleBlockShape() {return this.ptr.asSlice(OFFSET__residencyStandard2DMultisampleBlockShape, LAYOUT__residencyStandard2DMultisampleBlockShape);}

    public int residencyStandard3DBlockShape() {return this.ptr.get(LAYOUT__residencyStandard3DBlockShape, OFFSET__residencyStandard3DBlockShape);}
    public void residencyStandard3DBlockShape(int value) {this.ptr.set(LAYOUT__residencyStandard3DBlockShape, OFFSET__residencyStandard3DBlockShape, value);}
    public java.lang.foreign.MemorySegment $residencyStandard3DBlockShape() {return this.ptr.asSlice(OFFSET__residencyStandard3DBlockShape, LAYOUT__residencyStandard3DBlockShape);}

    public int residencyAlignedMipSize() {return this.ptr.get(LAYOUT__residencyAlignedMipSize, OFFSET__residencyAlignedMipSize);}
    public void residencyAlignedMipSize(int value) {this.ptr.set(LAYOUT__residencyAlignedMipSize, OFFSET__residencyAlignedMipSize, value);}
    public java.lang.foreign.MemorySegment $residencyAlignedMipSize() {return this.ptr.asSlice(OFFSET__residencyAlignedMipSize, LAYOUT__residencyAlignedMipSize);}

    public int residencyNonResidentStrict() {return this.ptr.get(LAYOUT__residencyNonResidentStrict, OFFSET__residencyNonResidentStrict);}
    public void residencyNonResidentStrict(int value) {this.ptr.set(LAYOUT__residencyNonResidentStrict, OFFSET__residencyNonResidentStrict, value);}
    public java.lang.foreign.MemorySegment $residencyNonResidentStrict() {return this.ptr.asSlice(OFFSET__residencyNonResidentStrict, LAYOUT__residencyNonResidentStrict);}
}
