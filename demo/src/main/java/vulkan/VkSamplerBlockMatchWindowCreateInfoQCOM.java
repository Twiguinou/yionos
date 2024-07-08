package vulkan;

public record VkSamplerBlockMatchWindowCreateInfoQCOM(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.StructLayout LAYOUT__windowExtent = vulkan.VkExtent2D.gRecordLayout.withName("windowExtent");
    public static final long OFFSET__windowExtent = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__windowCompareMode = java.lang.foreign.ValueLayout.JAVA_INT.withName("windowCompareMode");
    public static final long OFFSET__windowCompareMode = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__windowExtent,
            LAYOUT__windowCompareMode,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkSamplerBlockMatchWindowCreateInfoQCOM");

    public VkSamplerBlockMatchWindowCreateInfoQCOM(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkSamplerBlockMatchWindowCreateInfoQCOM getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkSamplerBlockMatchWindowCreateInfoQCOM(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkSamplerBlockMatchWindowCreateInfoQCOM value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public vulkan.VkExtent2D windowExtent() {return new vulkan.VkExtent2D(this.ptr.asSlice(OFFSET__windowExtent, LAYOUT__windowExtent));}
    public void windowExtent(java.util.function.Consumer<vulkan.VkExtent2D> consumer) {consumer.accept(this.windowExtent());}
    public void windowExtent(vulkan.VkExtent2D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__windowExtent, LAYOUT__windowExtent.byteSize());}

    public int windowCompareMode() {return this.ptr.get(LAYOUT__windowCompareMode, OFFSET__windowCompareMode);}
    public void windowCompareMode(int value) {this.ptr.set(LAYOUT__windowCompareMode, OFFSET__windowCompareMode, value);}
    public java.lang.foreign.MemorySegment $windowCompareMode() {return this.ptr.asSlice(OFFSET__windowCompareMode, LAYOUT__windowCompareMode);}
}
