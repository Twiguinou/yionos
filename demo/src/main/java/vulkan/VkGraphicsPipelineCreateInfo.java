package vulkan;

public record VkGraphicsPipelineCreateInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__flags = java.lang.foreign.ValueLayout.JAVA_INT.withName("flags");
    public static final long OFFSET__flags = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__stageCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("stageCount");
    public static final long OFFSET__stageCount = 20;
    public static final java.lang.foreign.AddressLayout LAYOUT__pStages = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pStages");
    public static final long OFFSET__pStages = 24;
    public static final java.lang.foreign.AddressLayout LAYOUT__pVertexInputState = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pVertexInputState");
    public static final long OFFSET__pVertexInputState = 32;
    public static final java.lang.foreign.AddressLayout LAYOUT__pInputAssemblyState = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pInputAssemblyState");
    public static final long OFFSET__pInputAssemblyState = 40;
    public static final java.lang.foreign.AddressLayout LAYOUT__pTessellationState = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pTessellationState");
    public static final long OFFSET__pTessellationState = 48;
    public static final java.lang.foreign.AddressLayout LAYOUT__pViewportState = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pViewportState");
    public static final long OFFSET__pViewportState = 56;
    public static final java.lang.foreign.AddressLayout LAYOUT__pRasterizationState = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pRasterizationState");
    public static final long OFFSET__pRasterizationState = 64;
    public static final java.lang.foreign.AddressLayout LAYOUT__pMultisampleState = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pMultisampleState");
    public static final long OFFSET__pMultisampleState = 72;
    public static final java.lang.foreign.AddressLayout LAYOUT__pDepthStencilState = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pDepthStencilState");
    public static final long OFFSET__pDepthStencilState = 80;
    public static final java.lang.foreign.AddressLayout LAYOUT__pColorBlendState = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pColorBlendState");
    public static final long OFFSET__pColorBlendState = 88;
    public static final java.lang.foreign.AddressLayout LAYOUT__pDynamicState = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pDynamicState");
    public static final long OFFSET__pDynamicState = 96;
    public static final java.lang.foreign.AddressLayout LAYOUT__layout = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("layout");
    public static final long OFFSET__layout = 104;
    public static final java.lang.foreign.AddressLayout LAYOUT__renderPass = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("renderPass");
    public static final long OFFSET__renderPass = 112;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__subpass = java.lang.foreign.ValueLayout.JAVA_INT.withName("subpass");
    public static final long OFFSET__subpass = 120;
    public static final java.lang.foreign.AddressLayout LAYOUT__basePipelineHandle = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("basePipelineHandle");
    public static final long OFFSET__basePipelineHandle = 128;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__basePipelineIndex = java.lang.foreign.ValueLayout.JAVA_INT.withName("basePipelineIndex");
    public static final long OFFSET__basePipelineIndex = 136;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__flags,
            LAYOUT__stageCount,
            LAYOUT__pStages,
            LAYOUT__pVertexInputState,
            LAYOUT__pInputAssemblyState,
            LAYOUT__pTessellationState,
            LAYOUT__pViewportState,
            LAYOUT__pRasterizationState,
            LAYOUT__pMultisampleState,
            LAYOUT__pDepthStencilState,
            LAYOUT__pColorBlendState,
            LAYOUT__pDynamicState,
            LAYOUT__layout,
            LAYOUT__renderPass,
            LAYOUT__subpass,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__basePipelineHandle,
            LAYOUT__basePipelineIndex,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkGraphicsPipelineCreateInfo");

    public VkGraphicsPipelineCreateInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkGraphicsPipelineCreateInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkGraphicsPipelineCreateInfo(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkGraphicsPipelineCreateInfo value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int flags() {return this.ptr.get(LAYOUT__flags, OFFSET__flags);}
    public void flags(int value) {this.ptr.set(LAYOUT__flags, OFFSET__flags, value);}
    public java.lang.foreign.MemorySegment $flags() {return this.ptr.asSlice(OFFSET__flags, LAYOUT__flags);}

    public int stageCount() {return this.ptr.get(LAYOUT__stageCount, OFFSET__stageCount);}
    public void stageCount(int value) {this.ptr.set(LAYOUT__stageCount, OFFSET__stageCount, value);}
    public java.lang.foreign.MemorySegment $stageCount() {return this.ptr.asSlice(OFFSET__stageCount, LAYOUT__stageCount);}

    public java.lang.foreign.MemorySegment pStages() {return this.ptr.get(LAYOUT__pStages, OFFSET__pStages);}
    public void pStages(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pStages, OFFSET__pStages, value);}
    public java.lang.foreign.MemorySegment $pStages() {return this.ptr.asSlice(OFFSET__pStages, LAYOUT__pStages);}

    public java.lang.foreign.MemorySegment pVertexInputState() {return this.ptr.get(LAYOUT__pVertexInputState, OFFSET__pVertexInputState);}
    public void pVertexInputState(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pVertexInputState, OFFSET__pVertexInputState, value);}
    public java.lang.foreign.MemorySegment $pVertexInputState() {return this.ptr.asSlice(OFFSET__pVertexInputState, LAYOUT__pVertexInputState);}

    public java.lang.foreign.MemorySegment pInputAssemblyState() {return this.ptr.get(LAYOUT__pInputAssemblyState, OFFSET__pInputAssemblyState);}
    public void pInputAssemblyState(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pInputAssemblyState, OFFSET__pInputAssemblyState, value);}
    public java.lang.foreign.MemorySegment $pInputAssemblyState() {return this.ptr.asSlice(OFFSET__pInputAssemblyState, LAYOUT__pInputAssemblyState);}

    public java.lang.foreign.MemorySegment pTessellationState() {return this.ptr.get(LAYOUT__pTessellationState, OFFSET__pTessellationState);}
    public void pTessellationState(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pTessellationState, OFFSET__pTessellationState, value);}
    public java.lang.foreign.MemorySegment $pTessellationState() {return this.ptr.asSlice(OFFSET__pTessellationState, LAYOUT__pTessellationState);}

    public java.lang.foreign.MemorySegment pViewportState() {return this.ptr.get(LAYOUT__pViewportState, OFFSET__pViewportState);}
    public void pViewportState(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pViewportState, OFFSET__pViewportState, value);}
    public java.lang.foreign.MemorySegment $pViewportState() {return this.ptr.asSlice(OFFSET__pViewportState, LAYOUT__pViewportState);}

    public java.lang.foreign.MemorySegment pRasterizationState() {return this.ptr.get(LAYOUT__pRasterizationState, OFFSET__pRasterizationState);}
    public void pRasterizationState(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pRasterizationState, OFFSET__pRasterizationState, value);}
    public java.lang.foreign.MemorySegment $pRasterizationState() {return this.ptr.asSlice(OFFSET__pRasterizationState, LAYOUT__pRasterizationState);}

    public java.lang.foreign.MemorySegment pMultisampleState() {return this.ptr.get(LAYOUT__pMultisampleState, OFFSET__pMultisampleState);}
    public void pMultisampleState(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pMultisampleState, OFFSET__pMultisampleState, value);}
    public java.lang.foreign.MemorySegment $pMultisampleState() {return this.ptr.asSlice(OFFSET__pMultisampleState, LAYOUT__pMultisampleState);}

    public java.lang.foreign.MemorySegment pDepthStencilState() {return this.ptr.get(LAYOUT__pDepthStencilState, OFFSET__pDepthStencilState);}
    public void pDepthStencilState(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pDepthStencilState, OFFSET__pDepthStencilState, value);}
    public java.lang.foreign.MemorySegment $pDepthStencilState() {return this.ptr.asSlice(OFFSET__pDepthStencilState, LAYOUT__pDepthStencilState);}

    public java.lang.foreign.MemorySegment pColorBlendState() {return this.ptr.get(LAYOUT__pColorBlendState, OFFSET__pColorBlendState);}
    public void pColorBlendState(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pColorBlendState, OFFSET__pColorBlendState, value);}
    public java.lang.foreign.MemorySegment $pColorBlendState() {return this.ptr.asSlice(OFFSET__pColorBlendState, LAYOUT__pColorBlendState);}

    public java.lang.foreign.MemorySegment pDynamicState() {return this.ptr.get(LAYOUT__pDynamicState, OFFSET__pDynamicState);}
    public void pDynamicState(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pDynamicState, OFFSET__pDynamicState, value);}
    public java.lang.foreign.MemorySegment $pDynamicState() {return this.ptr.asSlice(OFFSET__pDynamicState, LAYOUT__pDynamicState);}

    public java.lang.foreign.MemorySegment layout() {return this.ptr.get(LAYOUT__layout, OFFSET__layout);}
    public void layout(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__layout, OFFSET__layout, value);}
    public java.lang.foreign.MemorySegment $layout() {return this.ptr.asSlice(OFFSET__layout, LAYOUT__layout);}

    public java.lang.foreign.MemorySegment renderPass() {return this.ptr.get(LAYOUT__renderPass, OFFSET__renderPass);}
    public void renderPass(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__renderPass, OFFSET__renderPass, value);}
    public java.lang.foreign.MemorySegment $renderPass() {return this.ptr.asSlice(OFFSET__renderPass, LAYOUT__renderPass);}

    public int subpass() {return this.ptr.get(LAYOUT__subpass, OFFSET__subpass);}
    public void subpass(int value) {this.ptr.set(LAYOUT__subpass, OFFSET__subpass, value);}
    public java.lang.foreign.MemorySegment $subpass() {return this.ptr.asSlice(OFFSET__subpass, LAYOUT__subpass);}

    public java.lang.foreign.MemorySegment basePipelineHandle() {return this.ptr.get(LAYOUT__basePipelineHandle, OFFSET__basePipelineHandle);}
    public void basePipelineHandle(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__basePipelineHandle, OFFSET__basePipelineHandle, value);}
    public java.lang.foreign.MemorySegment $basePipelineHandle() {return this.ptr.asSlice(OFFSET__basePipelineHandle, LAYOUT__basePipelineHandle);}

    public int basePipelineIndex() {return this.ptr.get(LAYOUT__basePipelineIndex, OFFSET__basePipelineIndex);}
    public void basePipelineIndex(int value) {this.ptr.set(LAYOUT__basePipelineIndex, OFFSET__basePipelineIndex, value);}
    public java.lang.foreign.MemorySegment $basePipelineIndex() {return this.ptr.asSlice(OFFSET__basePipelineIndex, LAYOUT__basePipelineIndex);}
}
