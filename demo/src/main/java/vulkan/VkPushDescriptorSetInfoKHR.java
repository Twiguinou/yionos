package vulkan;

public record VkPushDescriptorSetInfoKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__stageFlags = java.lang.foreign.ValueLayout.JAVA_INT.withName("stageFlags");
    public static final long OFFSET__stageFlags = 16;
    public static final java.lang.foreign.AddressLayout LAYOUT__layout = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("layout");
    public static final long OFFSET__layout = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__set = java.lang.foreign.ValueLayout.JAVA_INT.withName("set");
    public static final long OFFSET__set = 32;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__descriptorWriteCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("descriptorWriteCount");
    public static final long OFFSET__descriptorWriteCount = 36;
    public static final java.lang.foreign.AddressLayout LAYOUT__pDescriptorWrites = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pDescriptorWrites");
    public static final long OFFSET__pDescriptorWrites = 40;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__stageFlags,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__layout,
            LAYOUT__set,
            LAYOUT__descriptorWriteCount,
            LAYOUT__pDescriptorWrites
    ).withByteAlignment(8).withName("VkPushDescriptorSetInfoKHR");

    public VkPushDescriptorSetInfoKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPushDescriptorSetInfoKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPushDescriptorSetInfoKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPushDescriptorSetInfoKHR value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int stageFlags() {return this.ptr.get(LAYOUT__stageFlags, OFFSET__stageFlags);}
    public void stageFlags(int value) {this.ptr.set(LAYOUT__stageFlags, OFFSET__stageFlags, value);}
    public java.lang.foreign.MemorySegment $stageFlags() {return this.ptr.asSlice(OFFSET__stageFlags, LAYOUT__stageFlags);}

    public java.lang.foreign.MemorySegment layout() {return this.ptr.get(LAYOUT__layout, OFFSET__layout);}
    public void layout(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__layout, OFFSET__layout, value);}
    public java.lang.foreign.MemorySegment $layout() {return this.ptr.asSlice(OFFSET__layout, LAYOUT__layout);}

    public int set() {return this.ptr.get(LAYOUT__set, OFFSET__set);}
    public void set(int value) {this.ptr.set(LAYOUT__set, OFFSET__set, value);}
    public java.lang.foreign.MemorySegment $set() {return this.ptr.asSlice(OFFSET__set, LAYOUT__set);}

    public int descriptorWriteCount() {return this.ptr.get(LAYOUT__descriptorWriteCount, OFFSET__descriptorWriteCount);}
    public void descriptorWriteCount(int value) {this.ptr.set(LAYOUT__descriptorWriteCount, OFFSET__descriptorWriteCount, value);}
    public java.lang.foreign.MemorySegment $descriptorWriteCount() {return this.ptr.asSlice(OFFSET__descriptorWriteCount, LAYOUT__descriptorWriteCount);}

    public java.lang.foreign.MemorySegment pDescriptorWrites() {return this.ptr.get(LAYOUT__pDescriptorWrites, OFFSET__pDescriptorWrites);}
    public void pDescriptorWrites(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pDescriptorWrites, OFFSET__pDescriptorWrites, value);}
    public java.lang.foreign.MemorySegment $pDescriptorWrites() {return this.ptr.asSlice(OFFSET__pDescriptorWrites, LAYOUT__pDescriptorWrites);}
}
