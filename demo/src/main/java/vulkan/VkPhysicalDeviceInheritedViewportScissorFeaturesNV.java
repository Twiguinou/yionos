package vulkan;

public record VkPhysicalDeviceInheritedViewportScissorFeaturesNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$inheritedViewportScissor2D = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$inheritedViewportScissor2D = 16L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$inheritedViewportScissor2D,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("VkPhysicalDeviceInheritedViewportScissorFeaturesNV");

    public VkPhysicalDeviceInheritedViewportScissorFeaturesNV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VkPhysicalDeviceInheritedViewportScissorFeaturesNV getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VkPhysicalDeviceInheritedViewportScissorFeaturesNV(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int inheritedViewportScissor2D() {return this.ptr.get(LAYOUT$inheritedViewportScissor2D, OFFSET$inheritedViewportScissor2D);}
    public void inheritedViewportScissor2D(int value) {this.ptr.set(LAYOUT$inheritedViewportScissor2D, OFFSET$inheritedViewportScissor2D, value);}
    public java.lang.foreign.MemorySegment inheritedViewportScissor2D_ptr() {return this.ptr.asSlice(OFFSET$inheritedViewportScissor2D, LAYOUT$inheritedViewportScissor2D);}
}
