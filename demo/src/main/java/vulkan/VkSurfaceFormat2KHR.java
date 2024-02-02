package vulkan;

public record VkSurfaceFormat2KHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.GroupLayout LAYOUT$surfaceFormat = vulkan.VkSurfaceFormatKHR.gStructLayout;
    public static final long OFFSET$surfaceFormat = 16L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$surfaceFormat
    ).withName("VkSurfaceFormat2KHR");

    public VkSurfaceFormat2KHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VkSurfaceFormat2KHR getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VkSurfaceFormat2KHR(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public vulkan.VkSurfaceFormatKHR surfaceFormat() {return new vulkan.VkSurfaceFormatKHR(this.ptr.asSlice(OFFSET$surfaceFormat, LAYOUT$surfaceFormat));}
    public void surfaceFormat(java.util.function.Consumer<vulkan.VkSurfaceFormatKHR> consumer) {consumer.accept(this.surfaceFormat());}
    public void surfaceFormat(vulkan.VkSurfaceFormatKHR value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$surfaceFormat, LAYOUT$surfaceFormat.byteSize());}
}
