package vulkan;

public record VkPipelineViewportStateCreateInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$flags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$flags = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$viewportCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$viewportCount = 20L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pViewports = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pViewports = 24L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$scissorCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$scissorCount = 32L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pScissors = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pScissors = 40L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$flags,
            LAYOUT$viewportCount,
            LAYOUT$pViewports,
            LAYOUT$scissorCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pScissors
    ).withName("VkPipelineViewportStateCreateInfo");

    public VkPipelineViewportStateCreateInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VkPipelineViewportStateCreateInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VkPipelineViewportStateCreateInfo(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
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

    public int viewportCount() {return this.ptr.get(LAYOUT$viewportCount, OFFSET$viewportCount);}
    public void viewportCount(int value) {this.ptr.set(LAYOUT$viewportCount, OFFSET$viewportCount, value);}
    public java.lang.foreign.MemorySegment viewportCount_ptr() {return this.ptr.asSlice(OFFSET$viewportCount, LAYOUT$viewportCount);}

    public java.lang.foreign.MemorySegment pViewports() {return this.ptr.get(LAYOUT$pViewports, OFFSET$pViewports);}
    public void pViewports(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pViewports, OFFSET$pViewports, value);}
    public java.lang.foreign.MemorySegment pViewports_ptr() {return this.ptr.asSlice(OFFSET$pViewports, LAYOUT$pViewports);}

    public int scissorCount() {return this.ptr.get(LAYOUT$scissorCount, OFFSET$scissorCount);}
    public void scissorCount(int value) {this.ptr.set(LAYOUT$scissorCount, OFFSET$scissorCount, value);}
    public java.lang.foreign.MemorySegment scissorCount_ptr() {return this.ptr.asSlice(OFFSET$scissorCount, LAYOUT$scissorCount);}

    public java.lang.foreign.MemorySegment pScissors() {return this.ptr.get(LAYOUT$pScissors, OFFSET$pScissors);}
    public void pScissors(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pScissors, OFFSET$pScissors, value);}
    public java.lang.foreign.MemorySegment pScissors_ptr() {return this.ptr.asSlice(OFFSET$pScissors, LAYOUT$pScissors);}
}
