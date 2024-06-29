package vulkan;

public record VkCopyDescriptorSet(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.AddressLayout LAYOUT__srcSet = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__srcSet = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__srcBinding = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__srcBinding = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__srcArrayElement = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__srcArrayElement = 28;
    public static final java.lang.foreign.AddressLayout LAYOUT__dstSet = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__dstSet = 32;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__dstBinding = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__dstBinding = 40;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__dstArrayElement = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__dstArrayElement = 44;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__descriptorCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__descriptorCount = 48;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__srcSet,
            LAYOUT__srcBinding,
            LAYOUT__srcArrayElement,
            LAYOUT__dstSet,
            LAYOUT__dstBinding,
            LAYOUT__dstArrayElement,
            LAYOUT__descriptorCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkCopyDescriptorSet");

    public VkCopyDescriptorSet(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkCopyDescriptorSet getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkCopyDescriptorSet(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkCopyDescriptorSet value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public java.lang.foreign.MemorySegment srcSet() {return this.ptr.get(LAYOUT__srcSet, OFFSET__srcSet);}
    public void srcSet(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__srcSet, OFFSET__srcSet, value);}
    public java.lang.foreign.MemorySegment $srcSet() {return this.ptr.asSlice(OFFSET__srcSet, LAYOUT__srcSet);}

    public int srcBinding() {return this.ptr.get(LAYOUT__srcBinding, OFFSET__srcBinding);}
    public void srcBinding(int value) {this.ptr.set(LAYOUT__srcBinding, OFFSET__srcBinding, value);}
    public java.lang.foreign.MemorySegment $srcBinding() {return this.ptr.asSlice(OFFSET__srcBinding, LAYOUT__srcBinding);}

    public int srcArrayElement() {return this.ptr.get(LAYOUT__srcArrayElement, OFFSET__srcArrayElement);}
    public void srcArrayElement(int value) {this.ptr.set(LAYOUT__srcArrayElement, OFFSET__srcArrayElement, value);}
    public java.lang.foreign.MemorySegment $srcArrayElement() {return this.ptr.asSlice(OFFSET__srcArrayElement, LAYOUT__srcArrayElement);}

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
}
