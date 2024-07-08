package vulkan;

public record VkDescriptorPoolCreateInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__flags = java.lang.foreign.ValueLayout.JAVA_INT.withName("flags");
    public static final long OFFSET__flags = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxSets = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxSets");
    public static final long OFFSET__maxSets = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__poolSizeCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("poolSizeCount");
    public static final long OFFSET__poolSizeCount = 24;
    public static final java.lang.foreign.AddressLayout LAYOUT__pPoolSizes = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pPoolSizes");
    public static final long OFFSET__pPoolSizes = 32;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__flags,
            LAYOUT__maxSets,
            LAYOUT__poolSizeCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pPoolSizes
    ).withByteAlignment(8).withName("VkDescriptorPoolCreateInfo");

    public VkDescriptorPoolCreateInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkDescriptorPoolCreateInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkDescriptorPoolCreateInfo(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkDescriptorPoolCreateInfo value)
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

    public int maxSets() {return this.ptr.get(LAYOUT__maxSets, OFFSET__maxSets);}
    public void maxSets(int value) {this.ptr.set(LAYOUT__maxSets, OFFSET__maxSets, value);}
    public java.lang.foreign.MemorySegment $maxSets() {return this.ptr.asSlice(OFFSET__maxSets, LAYOUT__maxSets);}

    public int poolSizeCount() {return this.ptr.get(LAYOUT__poolSizeCount, OFFSET__poolSizeCount);}
    public void poolSizeCount(int value) {this.ptr.set(LAYOUT__poolSizeCount, OFFSET__poolSizeCount, value);}
    public java.lang.foreign.MemorySegment $poolSizeCount() {return this.ptr.asSlice(OFFSET__poolSizeCount, LAYOUT__poolSizeCount);}

    public java.lang.foreign.MemorySegment pPoolSizes() {return this.ptr.get(LAYOUT__pPoolSizes, OFFSET__pPoolSizes);}
    public void pPoolSizes(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pPoolSizes, OFFSET__pPoolSizes, value);}
    public java.lang.foreign.MemorySegment $pPoolSizes() {return this.ptr.asSlice(OFFSET__pPoolSizes, LAYOUT__pPoolSizes);}
}
