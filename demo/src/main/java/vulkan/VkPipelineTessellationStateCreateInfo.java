package vulkan;

public record VkPipelineTessellationStateCreateInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$flags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$flags = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$patchControlPoints = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$patchControlPoints = 20L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$flags,
            LAYOUT$patchControlPoints
    ).withName("VkPipelineTessellationStateCreateInfo");

    public VkPipelineTessellationStateCreateInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VkPipelineTessellationStateCreateInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VkPipelineTessellationStateCreateInfo(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int flags() {return this.ptr.get(LAYOUT$flags, OFFSET$flags);}
    public void flags(int value) {this.ptr.set(LAYOUT$flags, OFFSET$flags, value);}
    public java.lang.foreign.MemorySegment flags_ptr() {return this.ptr.asSlice(OFFSET$flags, LAYOUT$flags);}

    public int patchControlPoints() {return this.ptr.get(LAYOUT$patchControlPoints, OFFSET$patchControlPoints);}
    public void patchControlPoints(int value) {this.ptr.set(LAYOUT$patchControlPoints, OFFSET$patchControlPoints, value);}
    public java.lang.foreign.MemorySegment patchControlPoints_ptr() {return this.ptr.asSlice(OFFSET$patchControlPoints, LAYOUT$patchControlPoints);}
}
