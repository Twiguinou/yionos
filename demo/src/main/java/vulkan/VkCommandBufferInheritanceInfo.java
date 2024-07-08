package vulkan;

public record VkCommandBufferInheritanceInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.AddressLayout LAYOUT__renderPass = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("renderPass");
    public static final long OFFSET__renderPass = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__subpass = java.lang.foreign.ValueLayout.JAVA_INT.withName("subpass");
    public static final long OFFSET__subpass = 24;
    public static final java.lang.foreign.AddressLayout LAYOUT__framebuffer = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("framebuffer");
    public static final long OFFSET__framebuffer = 32;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__occlusionQueryEnable = java.lang.foreign.ValueLayout.JAVA_INT.withName("occlusionQueryEnable");
    public static final long OFFSET__occlusionQueryEnable = 40;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__queryFlags = java.lang.foreign.ValueLayout.JAVA_INT.withName("queryFlags");
    public static final long OFFSET__queryFlags = 44;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__pipelineStatistics = java.lang.foreign.ValueLayout.JAVA_INT.withName("pipelineStatistics");
    public static final long OFFSET__pipelineStatistics = 48;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__renderPass,
            LAYOUT__subpass,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__framebuffer,
            LAYOUT__occlusionQueryEnable,
            LAYOUT__queryFlags,
            LAYOUT__pipelineStatistics,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkCommandBufferInheritanceInfo");

    public VkCommandBufferInheritanceInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkCommandBufferInheritanceInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkCommandBufferInheritanceInfo(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkCommandBufferInheritanceInfo value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public java.lang.foreign.MemorySegment renderPass() {return this.ptr.get(LAYOUT__renderPass, OFFSET__renderPass);}
    public void renderPass(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__renderPass, OFFSET__renderPass, value);}
    public java.lang.foreign.MemorySegment $renderPass() {return this.ptr.asSlice(OFFSET__renderPass, LAYOUT__renderPass);}

    public int subpass() {return this.ptr.get(LAYOUT__subpass, OFFSET__subpass);}
    public void subpass(int value) {this.ptr.set(LAYOUT__subpass, OFFSET__subpass, value);}
    public java.lang.foreign.MemorySegment $subpass() {return this.ptr.asSlice(OFFSET__subpass, LAYOUT__subpass);}

    public java.lang.foreign.MemorySegment framebuffer() {return this.ptr.get(LAYOUT__framebuffer, OFFSET__framebuffer);}
    public void framebuffer(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__framebuffer, OFFSET__framebuffer, value);}
    public java.lang.foreign.MemorySegment $framebuffer() {return this.ptr.asSlice(OFFSET__framebuffer, LAYOUT__framebuffer);}

    public int occlusionQueryEnable() {return this.ptr.get(LAYOUT__occlusionQueryEnable, OFFSET__occlusionQueryEnable);}
    public void occlusionQueryEnable(int value) {this.ptr.set(LAYOUT__occlusionQueryEnable, OFFSET__occlusionQueryEnable, value);}
    public java.lang.foreign.MemorySegment $occlusionQueryEnable() {return this.ptr.asSlice(OFFSET__occlusionQueryEnable, LAYOUT__occlusionQueryEnable);}

    public int queryFlags() {return this.ptr.get(LAYOUT__queryFlags, OFFSET__queryFlags);}
    public void queryFlags(int value) {this.ptr.set(LAYOUT__queryFlags, OFFSET__queryFlags, value);}
    public java.lang.foreign.MemorySegment $queryFlags() {return this.ptr.asSlice(OFFSET__queryFlags, LAYOUT__queryFlags);}

    public int pipelineStatistics() {return this.ptr.get(LAYOUT__pipelineStatistics, OFFSET__pipelineStatistics);}
    public void pipelineStatistics(int value) {this.ptr.set(LAYOUT__pipelineStatistics, OFFSET__pipelineStatistics, value);}
    public java.lang.foreign.MemorySegment $pipelineStatistics() {return this.ptr.asSlice(OFFSET__pipelineStatistics, LAYOUT__pipelineStatistics);}
}
