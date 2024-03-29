package vulkan;

public record VkPhysicalDeviceShaderTileImagePropertiesEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderTileImageCoherentReadAccelerated = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$shaderTileImageCoherentReadAccelerated = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderTileImageReadSampleFromPixelRateInvocation = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$shaderTileImageReadSampleFromPixelRateInvocation = 20L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderTileImageReadFromHelperInvocation = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$shaderTileImageReadFromHelperInvocation = 24L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$shaderTileImageCoherentReadAccelerated,
            LAYOUT$shaderTileImageReadSampleFromPixelRateInvocation,
            LAYOUT$shaderTileImageReadFromHelperInvocation,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("VkPhysicalDeviceShaderTileImagePropertiesEXT");

    public VkPhysicalDeviceShaderTileImagePropertiesEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VkPhysicalDeviceShaderTileImagePropertiesEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VkPhysicalDeviceShaderTileImagePropertiesEXT(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int shaderTileImageCoherentReadAccelerated() {return this.ptr.get(LAYOUT$shaderTileImageCoherentReadAccelerated, OFFSET$shaderTileImageCoherentReadAccelerated);}
    public void shaderTileImageCoherentReadAccelerated(int value) {this.ptr.set(LAYOUT$shaderTileImageCoherentReadAccelerated, OFFSET$shaderTileImageCoherentReadAccelerated, value);}
    public java.lang.foreign.MemorySegment shaderTileImageCoherentReadAccelerated_ptr() {return this.ptr.asSlice(OFFSET$shaderTileImageCoherentReadAccelerated, LAYOUT$shaderTileImageCoherentReadAccelerated);}

    public int shaderTileImageReadSampleFromPixelRateInvocation() {return this.ptr.get(LAYOUT$shaderTileImageReadSampleFromPixelRateInvocation, OFFSET$shaderTileImageReadSampleFromPixelRateInvocation);}
    public void shaderTileImageReadSampleFromPixelRateInvocation(int value) {this.ptr.set(LAYOUT$shaderTileImageReadSampleFromPixelRateInvocation, OFFSET$shaderTileImageReadSampleFromPixelRateInvocation, value);}
    public java.lang.foreign.MemorySegment shaderTileImageReadSampleFromPixelRateInvocation_ptr() {return this.ptr.asSlice(OFFSET$shaderTileImageReadSampleFromPixelRateInvocation, LAYOUT$shaderTileImageReadSampleFromPixelRateInvocation);}

    public int shaderTileImageReadFromHelperInvocation() {return this.ptr.get(LAYOUT$shaderTileImageReadFromHelperInvocation, OFFSET$shaderTileImageReadFromHelperInvocation);}
    public void shaderTileImageReadFromHelperInvocation(int value) {this.ptr.set(LAYOUT$shaderTileImageReadFromHelperInvocation, OFFSET$shaderTileImageReadFromHelperInvocation, value);}
    public java.lang.foreign.MemorySegment shaderTileImageReadFromHelperInvocation_ptr() {return this.ptr.asSlice(OFFSET$shaderTileImageReadFromHelperInvocation, LAYOUT$shaderTileImageReadFromHelperInvocation);}
}
