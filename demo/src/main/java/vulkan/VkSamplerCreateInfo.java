package vulkan;

public record VkSamplerCreateInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__flags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__flags = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__magFilter = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__magFilter = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__minFilter = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__minFilter = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__mipmapMode = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__mipmapMode = 28;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__addressModeU = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__addressModeU = 32;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__addressModeV = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__addressModeV = 36;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__addressModeW = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__addressModeW = 40;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__mipLodBias = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET__mipLodBias = 44;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__anisotropyEnable = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__anisotropyEnable = 48;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__maxAnisotropy = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET__maxAnisotropy = 52;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__compareEnable = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__compareEnable = 56;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__compareOp = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__compareOp = 60;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__minLod = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET__minLod = 64;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__maxLod = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET__maxLod = 68;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__borderColor = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__borderColor = 72;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__unnormalizedCoordinates = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__unnormalizedCoordinates = 76;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__flags,
            LAYOUT__magFilter,
            LAYOUT__minFilter,
            LAYOUT__mipmapMode,
            LAYOUT__addressModeU,
            LAYOUT__addressModeV,
            LAYOUT__addressModeW,
            LAYOUT__mipLodBias,
            LAYOUT__anisotropyEnable,
            LAYOUT__maxAnisotropy,
            LAYOUT__compareEnable,
            LAYOUT__compareOp,
            LAYOUT__minLod,
            LAYOUT__maxLod,
            LAYOUT__borderColor,
            LAYOUT__unnormalizedCoordinates
    ).withByteAlignment(8).withName("VkSamplerCreateInfo");

    public VkSamplerCreateInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkSamplerCreateInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkSamplerCreateInfo(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkSamplerCreateInfo value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int flags() {return this.ptr.get(LAYOUT__flags, OFFSET__flags);}
    public void flags(int value) {this.ptr.set(LAYOUT__flags, OFFSET__flags, value);}
    public java.lang.foreign.MemorySegment $flags() {return this.ptr.asSlice(OFFSET__flags, LAYOUT__flags);}

    public int magFilter() {return this.ptr.get(LAYOUT__magFilter, OFFSET__magFilter);}
    public void magFilter(int value) {this.ptr.set(LAYOUT__magFilter, OFFSET__magFilter, value);}
    public java.lang.foreign.MemorySegment $magFilter() {return this.ptr.asSlice(OFFSET__magFilter, LAYOUT__magFilter);}

    public int minFilter() {return this.ptr.get(LAYOUT__minFilter, OFFSET__minFilter);}
    public void minFilter(int value) {this.ptr.set(LAYOUT__minFilter, OFFSET__minFilter, value);}
    public java.lang.foreign.MemorySegment $minFilter() {return this.ptr.asSlice(OFFSET__minFilter, LAYOUT__minFilter);}

    public int mipmapMode() {return this.ptr.get(LAYOUT__mipmapMode, OFFSET__mipmapMode);}
    public void mipmapMode(int value) {this.ptr.set(LAYOUT__mipmapMode, OFFSET__mipmapMode, value);}
    public java.lang.foreign.MemorySegment $mipmapMode() {return this.ptr.asSlice(OFFSET__mipmapMode, LAYOUT__mipmapMode);}

    public int addressModeU() {return this.ptr.get(LAYOUT__addressModeU, OFFSET__addressModeU);}
    public void addressModeU(int value) {this.ptr.set(LAYOUT__addressModeU, OFFSET__addressModeU, value);}
    public java.lang.foreign.MemorySegment $addressModeU() {return this.ptr.asSlice(OFFSET__addressModeU, LAYOUT__addressModeU);}

    public int addressModeV() {return this.ptr.get(LAYOUT__addressModeV, OFFSET__addressModeV);}
    public void addressModeV(int value) {this.ptr.set(LAYOUT__addressModeV, OFFSET__addressModeV, value);}
    public java.lang.foreign.MemorySegment $addressModeV() {return this.ptr.asSlice(OFFSET__addressModeV, LAYOUT__addressModeV);}

    public int addressModeW() {return this.ptr.get(LAYOUT__addressModeW, OFFSET__addressModeW);}
    public void addressModeW(int value) {this.ptr.set(LAYOUT__addressModeW, OFFSET__addressModeW, value);}
    public java.lang.foreign.MemorySegment $addressModeW() {return this.ptr.asSlice(OFFSET__addressModeW, LAYOUT__addressModeW);}

    public float mipLodBias() {return this.ptr.get(LAYOUT__mipLodBias, OFFSET__mipLodBias);}
    public void mipLodBias(float value) {this.ptr.set(LAYOUT__mipLodBias, OFFSET__mipLodBias, value);}
    public java.lang.foreign.MemorySegment $mipLodBias() {return this.ptr.asSlice(OFFSET__mipLodBias, LAYOUT__mipLodBias);}

    public int anisotropyEnable() {return this.ptr.get(LAYOUT__anisotropyEnable, OFFSET__anisotropyEnable);}
    public void anisotropyEnable(int value) {this.ptr.set(LAYOUT__anisotropyEnable, OFFSET__anisotropyEnable, value);}
    public java.lang.foreign.MemorySegment $anisotropyEnable() {return this.ptr.asSlice(OFFSET__anisotropyEnable, LAYOUT__anisotropyEnable);}

    public float maxAnisotropy() {return this.ptr.get(LAYOUT__maxAnisotropy, OFFSET__maxAnisotropy);}
    public void maxAnisotropy(float value) {this.ptr.set(LAYOUT__maxAnisotropy, OFFSET__maxAnisotropy, value);}
    public java.lang.foreign.MemorySegment $maxAnisotropy() {return this.ptr.asSlice(OFFSET__maxAnisotropy, LAYOUT__maxAnisotropy);}

    public int compareEnable() {return this.ptr.get(LAYOUT__compareEnable, OFFSET__compareEnable);}
    public void compareEnable(int value) {this.ptr.set(LAYOUT__compareEnable, OFFSET__compareEnable, value);}
    public java.lang.foreign.MemorySegment $compareEnable() {return this.ptr.asSlice(OFFSET__compareEnable, LAYOUT__compareEnable);}

    public int compareOp() {return this.ptr.get(LAYOUT__compareOp, OFFSET__compareOp);}
    public void compareOp(int value) {this.ptr.set(LAYOUT__compareOp, OFFSET__compareOp, value);}
    public java.lang.foreign.MemorySegment $compareOp() {return this.ptr.asSlice(OFFSET__compareOp, LAYOUT__compareOp);}

    public float minLod() {return this.ptr.get(LAYOUT__minLod, OFFSET__minLod);}
    public void minLod(float value) {this.ptr.set(LAYOUT__minLod, OFFSET__minLod, value);}
    public java.lang.foreign.MemorySegment $minLod() {return this.ptr.asSlice(OFFSET__minLod, LAYOUT__minLod);}

    public float maxLod() {return this.ptr.get(LAYOUT__maxLod, OFFSET__maxLod);}
    public void maxLod(float value) {this.ptr.set(LAYOUT__maxLod, OFFSET__maxLod, value);}
    public java.lang.foreign.MemorySegment $maxLod() {return this.ptr.asSlice(OFFSET__maxLod, LAYOUT__maxLod);}

    public int borderColor() {return this.ptr.get(LAYOUT__borderColor, OFFSET__borderColor);}
    public void borderColor(int value) {this.ptr.set(LAYOUT__borderColor, OFFSET__borderColor, value);}
    public java.lang.foreign.MemorySegment $borderColor() {return this.ptr.asSlice(OFFSET__borderColor, LAYOUT__borderColor);}

    public int unnormalizedCoordinates() {return this.ptr.get(LAYOUT__unnormalizedCoordinates, OFFSET__unnormalizedCoordinates);}
    public void unnormalizedCoordinates(int value) {this.ptr.set(LAYOUT__unnormalizedCoordinates, OFFSET__unnormalizedCoordinates, value);}
    public java.lang.foreign.MemorySegment $unnormalizedCoordinates() {return this.ptr.asSlice(OFFSET__unnormalizedCoordinates, LAYOUT__unnormalizedCoordinates);}
}
