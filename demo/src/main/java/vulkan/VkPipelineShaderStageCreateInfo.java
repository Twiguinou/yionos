package vulkan;

public record VkPipelineShaderStageCreateInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__flags = java.lang.foreign.ValueLayout.JAVA_INT.withName("flags");
    public static final long OFFSET__flags = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__stage = java.lang.foreign.ValueLayout.JAVA_INT.withName("stage");
    public static final long OFFSET__stage = 20;
    public static final java.lang.foreign.AddressLayout LAYOUT__module = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("module");
    public static final long OFFSET__module = 24;
    public static final java.lang.foreign.AddressLayout LAYOUT__pName = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pName");
    public static final long OFFSET__pName = 32;
    public static final java.lang.foreign.AddressLayout LAYOUT__pSpecializationInfo = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pSpecializationInfo");
    public static final long OFFSET__pSpecializationInfo = 40;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__flags,
            LAYOUT__stage,
            LAYOUT__module,
            LAYOUT__pName,
            LAYOUT__pSpecializationInfo
    ).withByteAlignment(8).withName("VkPipelineShaderStageCreateInfo");

    public VkPipelineShaderStageCreateInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPipelineShaderStageCreateInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPipelineShaderStageCreateInfo(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPipelineShaderStageCreateInfo value)
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

    public int stage() {return this.ptr.get(LAYOUT__stage, OFFSET__stage);}
    public void stage(int value) {this.ptr.set(LAYOUT__stage, OFFSET__stage, value);}
    public java.lang.foreign.MemorySegment $stage() {return this.ptr.asSlice(OFFSET__stage, LAYOUT__stage);}

    public java.lang.foreign.MemorySegment module() {return this.ptr.get(LAYOUT__module, OFFSET__module);}
    public void module(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__module, OFFSET__module, value);}
    public java.lang.foreign.MemorySegment $module() {return this.ptr.asSlice(OFFSET__module, LAYOUT__module);}

    public java.lang.foreign.MemorySegment pName() {return this.ptr.get(LAYOUT__pName, OFFSET__pName);}
    public void pName(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pName, OFFSET__pName, value);}
    public java.lang.foreign.MemorySegment $pName() {return this.ptr.asSlice(OFFSET__pName, LAYOUT__pName);}

    public java.lang.foreign.MemorySegment pSpecializationInfo() {return this.ptr.get(LAYOUT__pSpecializationInfo, OFFSET__pSpecializationInfo);}
    public void pSpecializationInfo(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pSpecializationInfo, OFFSET__pSpecializationInfo, value);}
    public java.lang.foreign.MemorySegment $pSpecializationInfo() {return this.ptr.asSlice(OFFSET__pSpecializationInfo, LAYOUT__pSpecializationInfo);}
}
