package vulkan;

public record VkPhysicalDeviceShaderCorePropertiesARM(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__pixelRate = java.lang.foreign.ValueLayout.JAVA_INT.withName("pixelRate");
    public static final long OFFSET__pixelRate = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__texelRate = java.lang.foreign.ValueLayout.JAVA_INT.withName("texelRate");
    public static final long OFFSET__texelRate = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__fmaRate = java.lang.foreign.ValueLayout.JAVA_INT.withName("fmaRate");
    public static final long OFFSET__fmaRate = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__pixelRate,
            LAYOUT__texelRate,
            LAYOUT__fmaRate,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkPhysicalDeviceShaderCorePropertiesARM");

    public VkPhysicalDeviceShaderCorePropertiesARM(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceShaderCorePropertiesARM getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceShaderCorePropertiesARM(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceShaderCorePropertiesARM value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int pixelRate() {return this.ptr.get(LAYOUT__pixelRate, OFFSET__pixelRate);}
    public void pixelRate(int value) {this.ptr.set(LAYOUT__pixelRate, OFFSET__pixelRate, value);}
    public java.lang.foreign.MemorySegment $pixelRate() {return this.ptr.asSlice(OFFSET__pixelRate, LAYOUT__pixelRate);}

    public int texelRate() {return this.ptr.get(LAYOUT__texelRate, OFFSET__texelRate);}
    public void texelRate(int value) {this.ptr.set(LAYOUT__texelRate, OFFSET__texelRate, value);}
    public java.lang.foreign.MemorySegment $texelRate() {return this.ptr.asSlice(OFFSET__texelRate, LAYOUT__texelRate);}

    public int fmaRate() {return this.ptr.get(LAYOUT__fmaRate, OFFSET__fmaRate);}
    public void fmaRate(int value) {this.ptr.set(LAYOUT__fmaRate, OFFSET__fmaRate, value);}
    public java.lang.foreign.MemorySegment $fmaRate() {return this.ptr.asSlice(OFFSET__fmaRate, LAYOUT__fmaRate);}
}
