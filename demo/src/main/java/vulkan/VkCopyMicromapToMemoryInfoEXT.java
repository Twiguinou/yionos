package vulkan;

public record VkCopyMicromapToMemoryInfoEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.AddressLayout LAYOUT__src = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("src");
    public static final long OFFSET__src = 16;
    public static final java.lang.foreign.UnionLayout LAYOUT__dst = vulkan.VkDeviceOrHostAddressKHR.gRecordLayout.withName("dst");
    public static final long OFFSET__dst = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__mode = java.lang.foreign.ValueLayout.JAVA_INT.withName("mode");
    public static final long OFFSET__mode = 32;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__src,
            LAYOUT__dst,
            LAYOUT__mode,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkCopyMicromapToMemoryInfoEXT");

    public VkCopyMicromapToMemoryInfoEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkCopyMicromapToMemoryInfoEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkCopyMicromapToMemoryInfoEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkCopyMicromapToMemoryInfoEXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public java.lang.foreign.MemorySegment src() {return this.ptr.get(LAYOUT__src, OFFSET__src);}
    public void src(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__src, OFFSET__src, value);}
    public java.lang.foreign.MemorySegment $src() {return this.ptr.asSlice(OFFSET__src, LAYOUT__src);}

    public vulkan.VkDeviceOrHostAddressKHR dst() {return new vulkan.VkDeviceOrHostAddressKHR(this.ptr.asSlice(OFFSET__dst, LAYOUT__dst));}
    public void dst(java.util.function.Consumer<vulkan.VkDeviceOrHostAddressKHR> consumer) {consumer.accept(this.dst());}
    public void dst(vulkan.VkDeviceOrHostAddressKHR value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__dst, LAYOUT__dst.byteSize());}

    public int mode() {return this.ptr.get(LAYOUT__mode, OFFSET__mode);}
    public void mode(int value) {this.ptr.set(LAYOUT__mode, OFFSET__mode, value);}
    public java.lang.foreign.MemorySegment $mode() {return this.ptr.asSlice(OFFSET__mode, LAYOUT__mode);}
}
