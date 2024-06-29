package vulkan;

public record VkDescriptorUpdateTemplateEntry(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__dstBinding = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__dstBinding = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__dstArrayElement = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__dstArrayElement = 4;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__descriptorCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__descriptorCount = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__descriptorType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__descriptorType = 12;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__offset = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__offset = 16;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__stride = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__stride = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__dstBinding,
            LAYOUT__dstArrayElement,
            LAYOUT__descriptorCount,
            LAYOUT__descriptorType,
            LAYOUT__offset,
            LAYOUT__stride
    ).withByteAlignment(8).withName("VkDescriptorUpdateTemplateEntry");

    public VkDescriptorUpdateTemplateEntry(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkDescriptorUpdateTemplateEntry getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkDescriptorUpdateTemplateEntry(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkDescriptorUpdateTemplateEntry value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

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

    public long offset() {return this.ptr.get(LAYOUT__offset, OFFSET__offset);}
    public void offset(long value) {this.ptr.set(LAYOUT__offset, OFFSET__offset, value);}
    public java.lang.foreign.MemorySegment $offset() {return this.ptr.asSlice(OFFSET__offset, LAYOUT__offset);}

    public long stride() {return this.ptr.get(LAYOUT__stride, OFFSET__stride);}
    public void stride(long value) {this.ptr.set(LAYOUT__stride, OFFSET__stride, value);}
    public java.lang.foreign.MemorySegment $stride() {return this.ptr.asSlice(OFFSET__stride, LAYOUT__stride);}
}
