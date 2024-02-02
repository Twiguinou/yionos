package vulkan;

public record VkPushDescriptorSetInfoKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$stageFlags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$stageFlags = 16L;
    public static final java.lang.foreign.AddressLayout LAYOUT$layout = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$layout = 24L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$set = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$set = 32L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$descriptorWriteCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$descriptorWriteCount = 36L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pDescriptorWrites = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pDescriptorWrites = 40L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$stageFlags,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$layout,
            LAYOUT$set,
            LAYOUT$descriptorWriteCount,
            LAYOUT$pDescriptorWrites
    ).withName("VkPushDescriptorSetInfoKHR");

    public VkPushDescriptorSetInfoKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VkPushDescriptorSetInfoKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VkPushDescriptorSetInfoKHR(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int stageFlags() {return this.ptr.get(LAYOUT$stageFlags, OFFSET$stageFlags);}
    public void stageFlags(int value) {this.ptr.set(LAYOUT$stageFlags, OFFSET$stageFlags, value);}
    public java.lang.foreign.MemorySegment stageFlags_ptr() {return this.ptr.asSlice(OFFSET$stageFlags, LAYOUT$stageFlags);}

    public java.lang.foreign.MemorySegment layout() {return this.ptr.get(LAYOUT$layout, OFFSET$layout);}
    public void layout(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$layout, OFFSET$layout, value);}
    public java.lang.foreign.MemorySegment layout_ptr() {return this.ptr.asSlice(OFFSET$layout, LAYOUT$layout);}

    public int set() {return this.ptr.get(LAYOUT$set, OFFSET$set);}
    public void set(int value) {this.ptr.set(LAYOUT$set, OFFSET$set, value);}
    public java.lang.foreign.MemorySegment set_ptr() {return this.ptr.asSlice(OFFSET$set, LAYOUT$set);}

    public int descriptorWriteCount() {return this.ptr.get(LAYOUT$descriptorWriteCount, OFFSET$descriptorWriteCount);}
    public void descriptorWriteCount(int value) {this.ptr.set(LAYOUT$descriptorWriteCount, OFFSET$descriptorWriteCount, value);}
    public java.lang.foreign.MemorySegment descriptorWriteCount_ptr() {return this.ptr.asSlice(OFFSET$descriptorWriteCount, LAYOUT$descriptorWriteCount);}

    public java.lang.foreign.MemorySegment pDescriptorWrites() {return this.ptr.get(LAYOUT$pDescriptorWrites, OFFSET$pDescriptorWrites);}
    public void pDescriptorWrites(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pDescriptorWrites, OFFSET$pDescriptorWrites, value);}
    public java.lang.foreign.MemorySegment pDescriptorWrites_ptr() {return this.ptr.asSlice(OFFSET$pDescriptorWrites, LAYOUT$pDescriptorWrites);}
}
