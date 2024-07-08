package vulkan;

public record VkSurfacePresentScalingCapabilitiesEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__supportedPresentScaling = java.lang.foreign.ValueLayout.JAVA_INT.withName("supportedPresentScaling");
    public static final long OFFSET__supportedPresentScaling = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__supportedPresentGravityX = java.lang.foreign.ValueLayout.JAVA_INT.withName("supportedPresentGravityX");
    public static final long OFFSET__supportedPresentGravityX = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__supportedPresentGravityY = java.lang.foreign.ValueLayout.JAVA_INT.withName("supportedPresentGravityY");
    public static final long OFFSET__supportedPresentGravityY = 24;
    public static final java.lang.foreign.StructLayout LAYOUT__minScaledImageExtent = vulkan.VkExtent2D.gRecordLayout.withName("minScaledImageExtent");
    public static final long OFFSET__minScaledImageExtent = 28;
    public static final java.lang.foreign.StructLayout LAYOUT__maxScaledImageExtent = vulkan.VkExtent2D.gRecordLayout.withName("maxScaledImageExtent");
    public static final long OFFSET__maxScaledImageExtent = 36;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__supportedPresentScaling,
            LAYOUT__supportedPresentGravityX,
            LAYOUT__supportedPresentGravityY,
            LAYOUT__minScaledImageExtent,
            LAYOUT__maxScaledImageExtent,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkSurfacePresentScalingCapabilitiesEXT");

    public VkSurfacePresentScalingCapabilitiesEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkSurfacePresentScalingCapabilitiesEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkSurfacePresentScalingCapabilitiesEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkSurfacePresentScalingCapabilitiesEXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int supportedPresentScaling() {return this.ptr.get(LAYOUT__supportedPresentScaling, OFFSET__supportedPresentScaling);}
    public void supportedPresentScaling(int value) {this.ptr.set(LAYOUT__supportedPresentScaling, OFFSET__supportedPresentScaling, value);}
    public java.lang.foreign.MemorySegment $supportedPresentScaling() {return this.ptr.asSlice(OFFSET__supportedPresentScaling, LAYOUT__supportedPresentScaling);}

    public int supportedPresentGravityX() {return this.ptr.get(LAYOUT__supportedPresentGravityX, OFFSET__supportedPresentGravityX);}
    public void supportedPresentGravityX(int value) {this.ptr.set(LAYOUT__supportedPresentGravityX, OFFSET__supportedPresentGravityX, value);}
    public java.lang.foreign.MemorySegment $supportedPresentGravityX() {return this.ptr.asSlice(OFFSET__supportedPresentGravityX, LAYOUT__supportedPresentGravityX);}

    public int supportedPresentGravityY() {return this.ptr.get(LAYOUT__supportedPresentGravityY, OFFSET__supportedPresentGravityY);}
    public void supportedPresentGravityY(int value) {this.ptr.set(LAYOUT__supportedPresentGravityY, OFFSET__supportedPresentGravityY, value);}
    public java.lang.foreign.MemorySegment $supportedPresentGravityY() {return this.ptr.asSlice(OFFSET__supportedPresentGravityY, LAYOUT__supportedPresentGravityY);}

    public vulkan.VkExtent2D minScaledImageExtent() {return new vulkan.VkExtent2D(this.ptr.asSlice(OFFSET__minScaledImageExtent, LAYOUT__minScaledImageExtent));}
    public void minScaledImageExtent(java.util.function.Consumer<vulkan.VkExtent2D> consumer) {consumer.accept(this.minScaledImageExtent());}
    public void minScaledImageExtent(vulkan.VkExtent2D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__minScaledImageExtent, LAYOUT__minScaledImageExtent.byteSize());}

    public vulkan.VkExtent2D maxScaledImageExtent() {return new vulkan.VkExtent2D(this.ptr.asSlice(OFFSET__maxScaledImageExtent, LAYOUT__maxScaledImageExtent));}
    public void maxScaledImageExtent(java.util.function.Consumer<vulkan.VkExtent2D> consumer) {consumer.accept(this.maxScaledImageExtent());}
    public void maxScaledImageExtent(vulkan.VkExtent2D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__maxScaledImageExtent, LAYOUT__maxScaledImageExtent.byteSize());}
}
