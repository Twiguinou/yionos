package vulkan;

public record VkPushDescriptorSetWithTemplateInfoKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.AddressLayout LAYOUT$descriptorUpdateTemplate = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$descriptorUpdateTemplate = 16L;
    public static final java.lang.foreign.AddressLayout LAYOUT$layout = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$layout = 24L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$set = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$set = 32L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pData = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pData = 40L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$descriptorUpdateTemplate,
            LAYOUT$layout,
            LAYOUT$set,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pData
    ).withName("VkPushDescriptorSetWithTemplateInfoKHR");

    public VkPushDescriptorSetWithTemplateInfoKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VkPushDescriptorSetWithTemplateInfoKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VkPushDescriptorSetWithTemplateInfoKHR(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public java.lang.foreign.MemorySegment descriptorUpdateTemplate() {return this.ptr.get(LAYOUT$descriptorUpdateTemplate, OFFSET$descriptorUpdateTemplate);}
    public void descriptorUpdateTemplate(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$descriptorUpdateTemplate, OFFSET$descriptorUpdateTemplate, value);}
    public java.lang.foreign.MemorySegment descriptorUpdateTemplate_ptr() {return this.ptr.asSlice(OFFSET$descriptorUpdateTemplate, LAYOUT$descriptorUpdateTemplate);}

    public java.lang.foreign.MemorySegment layout() {return this.ptr.get(LAYOUT$layout, OFFSET$layout);}
    public void layout(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$layout, OFFSET$layout, value);}
    public java.lang.foreign.MemorySegment layout_ptr() {return this.ptr.asSlice(OFFSET$layout, LAYOUT$layout);}

    public int set() {return this.ptr.get(LAYOUT$set, OFFSET$set);}
    public void set(int value) {this.ptr.set(LAYOUT$set, OFFSET$set, value);}
    public java.lang.foreign.MemorySegment set_ptr() {return this.ptr.asSlice(OFFSET$set, LAYOUT$set);}

    public java.lang.foreign.MemorySegment pData() {return this.ptr.get(LAYOUT$pData, OFFSET$pData);}
    public void pData(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pData, OFFSET$pData, value);}
    public java.lang.foreign.MemorySegment pData_ptr() {return this.ptr.asSlice(OFFSET$pData, LAYOUT$pData);}
}
