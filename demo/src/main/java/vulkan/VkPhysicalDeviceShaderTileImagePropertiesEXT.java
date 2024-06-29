package vulkan;

public record VkPhysicalDeviceShaderTileImagePropertiesEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderTileImageCoherentReadAccelerated = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__shaderTileImageCoherentReadAccelerated = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderTileImageReadSampleFromPixelRateInvocation = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__shaderTileImageReadSampleFromPixelRateInvocation = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderTileImageReadFromHelperInvocation = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__shaderTileImageReadFromHelperInvocation = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__shaderTileImageCoherentReadAccelerated,
            LAYOUT__shaderTileImageReadSampleFromPixelRateInvocation,
            LAYOUT__shaderTileImageReadFromHelperInvocation,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkPhysicalDeviceShaderTileImagePropertiesEXT");

    public VkPhysicalDeviceShaderTileImagePropertiesEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceShaderTileImagePropertiesEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceShaderTileImagePropertiesEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceShaderTileImagePropertiesEXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int shaderTileImageCoherentReadAccelerated() {return this.ptr.get(LAYOUT__shaderTileImageCoherentReadAccelerated, OFFSET__shaderTileImageCoherentReadAccelerated);}
    public void shaderTileImageCoherentReadAccelerated(int value) {this.ptr.set(LAYOUT__shaderTileImageCoherentReadAccelerated, OFFSET__shaderTileImageCoherentReadAccelerated, value);}
    public java.lang.foreign.MemorySegment $shaderTileImageCoherentReadAccelerated() {return this.ptr.asSlice(OFFSET__shaderTileImageCoherentReadAccelerated, LAYOUT__shaderTileImageCoherentReadAccelerated);}

    public int shaderTileImageReadSampleFromPixelRateInvocation() {return this.ptr.get(LAYOUT__shaderTileImageReadSampleFromPixelRateInvocation, OFFSET__shaderTileImageReadSampleFromPixelRateInvocation);}
    public void shaderTileImageReadSampleFromPixelRateInvocation(int value) {this.ptr.set(LAYOUT__shaderTileImageReadSampleFromPixelRateInvocation, OFFSET__shaderTileImageReadSampleFromPixelRateInvocation, value);}
    public java.lang.foreign.MemorySegment $shaderTileImageReadSampleFromPixelRateInvocation() {return this.ptr.asSlice(OFFSET__shaderTileImageReadSampleFromPixelRateInvocation, LAYOUT__shaderTileImageReadSampleFromPixelRateInvocation);}

    public int shaderTileImageReadFromHelperInvocation() {return this.ptr.get(LAYOUT__shaderTileImageReadFromHelperInvocation, OFFSET__shaderTileImageReadFromHelperInvocation);}
    public void shaderTileImageReadFromHelperInvocation(int value) {this.ptr.set(LAYOUT__shaderTileImageReadFromHelperInvocation, OFFSET__shaderTileImageReadFromHelperInvocation, value);}
    public java.lang.foreign.MemorySegment $shaderTileImageReadFromHelperInvocation() {return this.ptr.asSlice(OFFSET__shaderTileImageReadFromHelperInvocation, LAYOUT__shaderTileImageReadFromHelperInvocation);}
}
