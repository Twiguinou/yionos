package vulkan;

public record VkDescriptorUpdateTemplateCreateInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__flags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__flags = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__descriptorUpdateEntryCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__descriptorUpdateEntryCount = 20;
    public static final java.lang.foreign.AddressLayout LAYOUT__pDescriptorUpdateEntries = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pDescriptorUpdateEntries = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__templateType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__templateType = 32;
    public static final java.lang.foreign.AddressLayout LAYOUT__descriptorSetLayout = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__descriptorSetLayout = 40;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__pipelineBindPoint = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__pipelineBindPoint = 48;
    public static final java.lang.foreign.AddressLayout LAYOUT__pipelineLayout = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pipelineLayout = 56;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__set = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__set = 64;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__flags,
            LAYOUT__descriptorUpdateEntryCount,
            LAYOUT__pDescriptorUpdateEntries,
            LAYOUT__templateType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__descriptorSetLayout,
            LAYOUT__pipelineBindPoint,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pipelineLayout,
            LAYOUT__set,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkDescriptorUpdateTemplateCreateInfo");

    public VkDescriptorUpdateTemplateCreateInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkDescriptorUpdateTemplateCreateInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkDescriptorUpdateTemplateCreateInfo(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkDescriptorUpdateTemplateCreateInfo value)
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

    public int descriptorUpdateEntryCount() {return this.ptr.get(LAYOUT__descriptorUpdateEntryCount, OFFSET__descriptorUpdateEntryCount);}
    public void descriptorUpdateEntryCount(int value) {this.ptr.set(LAYOUT__descriptorUpdateEntryCount, OFFSET__descriptorUpdateEntryCount, value);}
    public java.lang.foreign.MemorySegment $descriptorUpdateEntryCount() {return this.ptr.asSlice(OFFSET__descriptorUpdateEntryCount, LAYOUT__descriptorUpdateEntryCount);}

    public java.lang.foreign.MemorySegment pDescriptorUpdateEntries() {return this.ptr.get(LAYOUT__pDescriptorUpdateEntries, OFFSET__pDescriptorUpdateEntries);}
    public void pDescriptorUpdateEntries(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pDescriptorUpdateEntries, OFFSET__pDescriptorUpdateEntries, value);}
    public java.lang.foreign.MemorySegment $pDescriptorUpdateEntries() {return this.ptr.asSlice(OFFSET__pDescriptorUpdateEntries, LAYOUT__pDescriptorUpdateEntries);}

    public int templateType() {return this.ptr.get(LAYOUT__templateType, OFFSET__templateType);}
    public void templateType(int value) {this.ptr.set(LAYOUT__templateType, OFFSET__templateType, value);}
    public java.lang.foreign.MemorySegment $templateType() {return this.ptr.asSlice(OFFSET__templateType, LAYOUT__templateType);}

    public java.lang.foreign.MemorySegment descriptorSetLayout() {return this.ptr.get(LAYOUT__descriptorSetLayout, OFFSET__descriptorSetLayout);}
    public void descriptorSetLayout(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__descriptorSetLayout, OFFSET__descriptorSetLayout, value);}
    public java.lang.foreign.MemorySegment $descriptorSetLayout() {return this.ptr.asSlice(OFFSET__descriptorSetLayout, LAYOUT__descriptorSetLayout);}

    public int pipelineBindPoint() {return this.ptr.get(LAYOUT__pipelineBindPoint, OFFSET__pipelineBindPoint);}
    public void pipelineBindPoint(int value) {this.ptr.set(LAYOUT__pipelineBindPoint, OFFSET__pipelineBindPoint, value);}
    public java.lang.foreign.MemorySegment $pipelineBindPoint() {return this.ptr.asSlice(OFFSET__pipelineBindPoint, LAYOUT__pipelineBindPoint);}

    public java.lang.foreign.MemorySegment pipelineLayout() {return this.ptr.get(LAYOUT__pipelineLayout, OFFSET__pipelineLayout);}
    public void pipelineLayout(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pipelineLayout, OFFSET__pipelineLayout, value);}
    public java.lang.foreign.MemorySegment $pipelineLayout() {return this.ptr.asSlice(OFFSET__pipelineLayout, LAYOUT__pipelineLayout);}

    public int set() {return this.ptr.get(LAYOUT__set, OFFSET__set);}
    public void set(int value) {this.ptr.set(LAYOUT__set, OFFSET__set, value);}
    public java.lang.foreign.MemorySegment $set() {return this.ptr.asSlice(OFFSET__set, LAYOUT__set);}
}
