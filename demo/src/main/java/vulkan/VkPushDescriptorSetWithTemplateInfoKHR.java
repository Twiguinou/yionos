package vulkan;

public record VkPushDescriptorSetWithTemplateInfoKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.AddressLayout LAYOUT__descriptorUpdateTemplate = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("descriptorUpdateTemplate");
    public static final long OFFSET__descriptorUpdateTemplate = 16;
    public static final java.lang.foreign.AddressLayout LAYOUT__layout = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("layout");
    public static final long OFFSET__layout = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__set = java.lang.foreign.ValueLayout.JAVA_INT.withName("set");
    public static final long OFFSET__set = 32;
    public static final java.lang.foreign.AddressLayout LAYOUT__pData = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pData");
    public static final long OFFSET__pData = 40;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__descriptorUpdateTemplate,
            LAYOUT__layout,
            LAYOUT__set,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pData
    ).withByteAlignment(8).withName("VkPushDescriptorSetWithTemplateInfoKHR");

    public VkPushDescriptorSetWithTemplateInfoKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPushDescriptorSetWithTemplateInfoKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPushDescriptorSetWithTemplateInfoKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPushDescriptorSetWithTemplateInfoKHR value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public java.lang.foreign.MemorySegment descriptorUpdateTemplate() {return this.ptr.get(LAYOUT__descriptorUpdateTemplate, OFFSET__descriptorUpdateTemplate);}
    public void descriptorUpdateTemplate(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__descriptorUpdateTemplate, OFFSET__descriptorUpdateTemplate, value);}
    public java.lang.foreign.MemorySegment $descriptorUpdateTemplate() {return this.ptr.asSlice(OFFSET__descriptorUpdateTemplate, LAYOUT__descriptorUpdateTemplate);}

    public java.lang.foreign.MemorySegment layout() {return this.ptr.get(LAYOUT__layout, OFFSET__layout);}
    public void layout(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__layout, OFFSET__layout, value);}
    public java.lang.foreign.MemorySegment $layout() {return this.ptr.asSlice(OFFSET__layout, LAYOUT__layout);}

    public int set() {return this.ptr.get(LAYOUT__set, OFFSET__set);}
    public void set(int value) {this.ptr.set(LAYOUT__set, OFFSET__set, value);}
    public java.lang.foreign.MemorySegment $set() {return this.ptr.asSlice(OFFSET__set, LAYOUT__set);}

    public java.lang.foreign.MemorySegment pData() {return this.ptr.get(LAYOUT__pData, OFFSET__pData);}
    public void pData(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pData, OFFSET__pData, value);}
    public java.lang.foreign.MemorySegment $pData() {return this.ptr.asSlice(OFFSET__pData, LAYOUT__pData);}
}
