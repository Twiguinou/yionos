package vulkan;

public record VkPhysicalDeviceShaderTileImageFeaturesEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderTileImageColorReadAccess = java.lang.foreign.ValueLayout.JAVA_INT.withName("shaderTileImageColorReadAccess");
    public static final long OFFSET__shaderTileImageColorReadAccess = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderTileImageDepthReadAccess = java.lang.foreign.ValueLayout.JAVA_INT.withName("shaderTileImageDepthReadAccess");
    public static final long OFFSET__shaderTileImageDepthReadAccess = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderTileImageStencilReadAccess = java.lang.foreign.ValueLayout.JAVA_INT.withName("shaderTileImageStencilReadAccess");
    public static final long OFFSET__shaderTileImageStencilReadAccess = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__shaderTileImageColorReadAccess,
            LAYOUT__shaderTileImageDepthReadAccess,
            LAYOUT__shaderTileImageStencilReadAccess,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkPhysicalDeviceShaderTileImageFeaturesEXT");

    public VkPhysicalDeviceShaderTileImageFeaturesEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceShaderTileImageFeaturesEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceShaderTileImageFeaturesEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceShaderTileImageFeaturesEXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int shaderTileImageColorReadAccess() {return this.ptr.get(LAYOUT__shaderTileImageColorReadAccess, OFFSET__shaderTileImageColorReadAccess);}
    public void shaderTileImageColorReadAccess(int value) {this.ptr.set(LAYOUT__shaderTileImageColorReadAccess, OFFSET__shaderTileImageColorReadAccess, value);}
    public java.lang.foreign.MemorySegment $shaderTileImageColorReadAccess() {return this.ptr.asSlice(OFFSET__shaderTileImageColorReadAccess, LAYOUT__shaderTileImageColorReadAccess);}

    public int shaderTileImageDepthReadAccess() {return this.ptr.get(LAYOUT__shaderTileImageDepthReadAccess, OFFSET__shaderTileImageDepthReadAccess);}
    public void shaderTileImageDepthReadAccess(int value) {this.ptr.set(LAYOUT__shaderTileImageDepthReadAccess, OFFSET__shaderTileImageDepthReadAccess, value);}
    public java.lang.foreign.MemorySegment $shaderTileImageDepthReadAccess() {return this.ptr.asSlice(OFFSET__shaderTileImageDepthReadAccess, LAYOUT__shaderTileImageDepthReadAccess);}

    public int shaderTileImageStencilReadAccess() {return this.ptr.get(LAYOUT__shaderTileImageStencilReadAccess, OFFSET__shaderTileImageStencilReadAccess);}
    public void shaderTileImageStencilReadAccess(int value) {this.ptr.set(LAYOUT__shaderTileImageStencilReadAccess, OFFSET__shaderTileImageStencilReadAccess, value);}
    public java.lang.foreign.MemorySegment $shaderTileImageStencilReadAccess() {return this.ptr.asSlice(OFFSET__shaderTileImageStencilReadAccess, LAYOUT__shaderTileImageStencilReadAccess);}
}
