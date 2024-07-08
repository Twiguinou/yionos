package vulkan;

public record VkWriteDescriptorSet(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.AddressLayout LAYOUT__dstSet = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("dstSet");
    public static final long OFFSET__dstSet = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__dstBinding = java.lang.foreign.ValueLayout.JAVA_INT.withName("dstBinding");
    public static final long OFFSET__dstBinding = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__dstArrayElement = java.lang.foreign.ValueLayout.JAVA_INT.withName("dstArrayElement");
    public static final long OFFSET__dstArrayElement = 28;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__descriptorCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("descriptorCount");
    public static final long OFFSET__descriptorCount = 32;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__descriptorType = java.lang.foreign.ValueLayout.JAVA_INT.withName("descriptorType");
    public static final long OFFSET__descriptorType = 36;
    public static final java.lang.foreign.AddressLayout LAYOUT__pImageInfo = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pImageInfo");
    public static final long OFFSET__pImageInfo = 40;
    public static final java.lang.foreign.AddressLayout LAYOUT__pBufferInfo = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pBufferInfo");
    public static final long OFFSET__pBufferInfo = 48;
    public static final java.lang.foreign.AddressLayout LAYOUT__pTexelBufferView = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pTexelBufferView");
    public static final long OFFSET__pTexelBufferView = 56;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__dstSet,
            LAYOUT__dstBinding,
            LAYOUT__dstArrayElement,
            LAYOUT__descriptorCount,
            LAYOUT__descriptorType,
            LAYOUT__pImageInfo,
            LAYOUT__pBufferInfo,
            LAYOUT__pTexelBufferView
    ).withByteAlignment(8).withName("VkWriteDescriptorSet");

    public VkWriteDescriptorSet(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkWriteDescriptorSet getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkWriteDescriptorSet(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkWriteDescriptorSet value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public java.lang.foreign.MemorySegment dstSet() {return this.ptr.get(LAYOUT__dstSet, OFFSET__dstSet);}
    public void dstSet(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__dstSet, OFFSET__dstSet, value);}
    public java.lang.foreign.MemorySegment $dstSet() {return this.ptr.asSlice(OFFSET__dstSet, LAYOUT__dstSet);}

    public int dstBinding() {return this.ptr.get(LAYOUT__dstBinding, OFFSET__dstBinding);}
    public void dstBinding(int value) {this.ptr.set(LAYOUT__dstBinding, OFFSET__dstBinding, value);}
    public java.lang.foreign.MemorySegment $dstBinding() {return this.ptr.asSlice(OFFSET__dstBinding, LAYOUT__dstBinding);}

    public int dstArrayElement() {return this.ptr.get(LAYOUT__dstArrayElement, OFFSET__dstArrayElement);}
    public void dstArrayElement(int value) {this.ptr.set(LAYOUT__dstArrayElement, OFFSET__dstArrayElement, value);}
    public java.lang.foreign.MemorySegment $dstArrayElement() {return this.ptr.asSlice(OFFSET__dstArrayElement, LAYOUT__dstArrayElement);}

    public int descriptorCount() {return this.ptr.get(LAYOUT__descriptorCount, OFFSET__descriptorCount);}
    public void descriptorCount(int value) {this.ptr.set(LAYOUT__descriptorCount, OFFSET__descriptorCount, value);}
    public java.lang.foreign.MemorySegment $descriptorCount() {return this.ptr.asSlice(OFFSET__descriptorCount, LAYOUT__descriptorCount);}

    public int descriptorType() {return this.ptr.get(LAYOUT__descriptorType, OFFSET__descriptorType);}
    public void descriptorType(int value) {this.ptr.set(LAYOUT__descriptorType, OFFSET__descriptorType, value);}
    public java.lang.foreign.MemorySegment $descriptorType() {return this.ptr.asSlice(OFFSET__descriptorType, LAYOUT__descriptorType);}

    public java.lang.foreign.MemorySegment pImageInfo() {return this.ptr.get(LAYOUT__pImageInfo, OFFSET__pImageInfo);}
    public void pImageInfo(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pImageInfo, OFFSET__pImageInfo, value);}
    public java.lang.foreign.MemorySegment $pImageInfo() {return this.ptr.asSlice(OFFSET__pImageInfo, LAYOUT__pImageInfo);}

    public java.lang.foreign.MemorySegment pBufferInfo() {return this.ptr.get(LAYOUT__pBufferInfo, OFFSET__pBufferInfo);}
    public void pBufferInfo(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pBufferInfo, OFFSET__pBufferInfo, value);}
    public java.lang.foreign.MemorySegment $pBufferInfo() {return this.ptr.asSlice(OFFSET__pBufferInfo, LAYOUT__pBufferInfo);}

    public java.lang.foreign.MemorySegment pTexelBufferView() {return this.ptr.get(LAYOUT__pTexelBufferView, OFFSET__pTexelBufferView);}
    public void pTexelBufferView(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pTexelBufferView, OFFSET__pTexelBufferView, value);}
    public java.lang.foreign.MemorySegment $pTexelBufferView() {return this.ptr.asSlice(OFFSET__pTexelBufferView, LAYOUT__pTexelBufferView);}
}
