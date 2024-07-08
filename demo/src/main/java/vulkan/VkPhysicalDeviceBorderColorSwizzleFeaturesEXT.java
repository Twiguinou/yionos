package vulkan;

public record VkPhysicalDeviceBorderColorSwizzleFeaturesEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__borderColorSwizzle = java.lang.foreign.ValueLayout.JAVA_INT.withName("borderColorSwizzle");
    public static final long OFFSET__borderColorSwizzle = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__borderColorSwizzleFromImage = java.lang.foreign.ValueLayout.JAVA_INT.withName("borderColorSwizzleFromImage");
    public static final long OFFSET__borderColorSwizzleFromImage = 20;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__borderColorSwizzle,
            LAYOUT__borderColorSwizzleFromImage
    ).withByteAlignment(8).withName("VkPhysicalDeviceBorderColorSwizzleFeaturesEXT");

    public VkPhysicalDeviceBorderColorSwizzleFeaturesEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceBorderColorSwizzleFeaturesEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceBorderColorSwizzleFeaturesEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceBorderColorSwizzleFeaturesEXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int borderColorSwizzle() {return this.ptr.get(LAYOUT__borderColorSwizzle, OFFSET__borderColorSwizzle);}
    public void borderColorSwizzle(int value) {this.ptr.set(LAYOUT__borderColorSwizzle, OFFSET__borderColorSwizzle, value);}
    public java.lang.foreign.MemorySegment $borderColorSwizzle() {return this.ptr.asSlice(OFFSET__borderColorSwizzle, LAYOUT__borderColorSwizzle);}

    public int borderColorSwizzleFromImage() {return this.ptr.get(LAYOUT__borderColorSwizzleFromImage, OFFSET__borderColorSwizzleFromImage);}
    public void borderColorSwizzleFromImage(int value) {this.ptr.set(LAYOUT__borderColorSwizzleFromImage, OFFSET__borderColorSwizzleFromImage, value);}
    public java.lang.foreign.MemorySegment $borderColorSwizzleFromImage() {return this.ptr.asSlice(OFFSET__borderColorSwizzleFromImage, LAYOUT__borderColorSwizzleFromImage);}
}
