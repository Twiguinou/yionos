package vulkan;

public record VkCopyMemoryToMicromapInfoEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.GroupLayout LAYOUT$src = vulkan.VkDeviceOrHostAddressConstKHR.gStructLayout;
    public static final long OFFSET$src = 16L;
    public static final java.lang.foreign.AddressLayout LAYOUT$dst = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$dst = 24L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$mode = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$mode = 32L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$src,
            LAYOUT$dst,
            LAYOUT$mode,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("VkCopyMemoryToMicromapInfoEXT");

    public VkCopyMemoryToMicromapInfoEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VkCopyMemoryToMicromapInfoEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VkCopyMemoryToMicromapInfoEXT(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public vulkan.VkDeviceOrHostAddressConstKHR src() {return new vulkan.VkDeviceOrHostAddressConstKHR(this.ptr.asSlice(OFFSET$src, LAYOUT$src));}
    public void src(java.util.function.Consumer<vulkan.VkDeviceOrHostAddressConstKHR> consumer) {consumer.accept(this.src());}
    public void src(vulkan.VkDeviceOrHostAddressConstKHR value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$src, LAYOUT$src.byteSize());}

    public java.lang.foreign.MemorySegment dst() {return this.ptr.get(LAYOUT$dst, OFFSET$dst);}
    public void dst(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$dst, OFFSET$dst, value);}
    public java.lang.foreign.MemorySegment dst_ptr() {return this.ptr.asSlice(OFFSET$dst, LAYOUT$dst);}

    public int mode() {return this.ptr.get(LAYOUT$mode, OFFSET$mode);}
    public void mode(int value) {this.ptr.set(LAYOUT$mode, OFFSET$mode, value);}
    public java.lang.foreign.MemorySegment mode_ptr() {return this.ptr.asSlice(OFFSET$mode, LAYOUT$mode);}
}
