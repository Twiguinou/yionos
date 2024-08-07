package vulkan;

public record VkPhysicalDeviceImage2DViewOf3DFeaturesEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__image2DViewOf3D = java.lang.foreign.ValueLayout.JAVA_INT.withName("image2DViewOf3D");
    public static final long OFFSET__image2DViewOf3D = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sampler2DViewOf3D = java.lang.foreign.ValueLayout.JAVA_INT.withName("sampler2DViewOf3D");
    public static final long OFFSET__sampler2DViewOf3D = 20;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__image2DViewOf3D,
            LAYOUT__sampler2DViewOf3D
    ).withByteAlignment(8).withName("VkPhysicalDeviceImage2DViewOf3DFeaturesEXT");

    public VkPhysicalDeviceImage2DViewOf3DFeaturesEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceImage2DViewOf3DFeaturesEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceImage2DViewOf3DFeaturesEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceImage2DViewOf3DFeaturesEXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int image2DViewOf3D() {return this.ptr.get(LAYOUT__image2DViewOf3D, OFFSET__image2DViewOf3D);}
    public void image2DViewOf3D(int value) {this.ptr.set(LAYOUT__image2DViewOf3D, OFFSET__image2DViewOf3D, value);}
    public java.lang.foreign.MemorySegment $image2DViewOf3D() {return this.ptr.asSlice(OFFSET__image2DViewOf3D, LAYOUT__image2DViewOf3D);}

    public int sampler2DViewOf3D() {return this.ptr.get(LAYOUT__sampler2DViewOf3D, OFFSET__sampler2DViewOf3D);}
    public void sampler2DViewOf3D(int value) {this.ptr.set(LAYOUT__sampler2DViewOf3D, OFFSET__sampler2DViewOf3D, value);}
    public java.lang.foreign.MemorySegment $sampler2DViewOf3D() {return this.ptr.asSlice(OFFSET__sampler2DViewOf3D, LAYOUT__sampler2DViewOf3D);}
}
