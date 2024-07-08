package vulkan;

public record VkPhysicalDeviceTexelBufferAlignmentProperties(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__storageTexelBufferOffsetAlignmentBytes = java.lang.foreign.ValueLayout.JAVA_LONG.withName("storageTexelBufferOffsetAlignmentBytes");
    public static final long OFFSET__storageTexelBufferOffsetAlignmentBytes = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__storageTexelBufferOffsetSingleTexelAlignment = java.lang.foreign.ValueLayout.JAVA_INT.withName("storageTexelBufferOffsetSingleTexelAlignment");
    public static final long OFFSET__storageTexelBufferOffsetSingleTexelAlignment = 24;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__uniformTexelBufferOffsetAlignmentBytes = java.lang.foreign.ValueLayout.JAVA_LONG.withName("uniformTexelBufferOffsetAlignmentBytes");
    public static final long OFFSET__uniformTexelBufferOffsetAlignmentBytes = 32;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__uniformTexelBufferOffsetSingleTexelAlignment = java.lang.foreign.ValueLayout.JAVA_INT.withName("uniformTexelBufferOffsetSingleTexelAlignment");
    public static final long OFFSET__uniformTexelBufferOffsetSingleTexelAlignment = 40;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__storageTexelBufferOffsetAlignmentBytes,
            LAYOUT__storageTexelBufferOffsetSingleTexelAlignment,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__uniformTexelBufferOffsetAlignmentBytes,
            LAYOUT__uniformTexelBufferOffsetSingleTexelAlignment,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkPhysicalDeviceTexelBufferAlignmentProperties");

    public VkPhysicalDeviceTexelBufferAlignmentProperties(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceTexelBufferAlignmentProperties getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceTexelBufferAlignmentProperties(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceTexelBufferAlignmentProperties value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public long storageTexelBufferOffsetAlignmentBytes() {return this.ptr.get(LAYOUT__storageTexelBufferOffsetAlignmentBytes, OFFSET__storageTexelBufferOffsetAlignmentBytes);}
    public void storageTexelBufferOffsetAlignmentBytes(long value) {this.ptr.set(LAYOUT__storageTexelBufferOffsetAlignmentBytes, OFFSET__storageTexelBufferOffsetAlignmentBytes, value);}
    public java.lang.foreign.MemorySegment $storageTexelBufferOffsetAlignmentBytes() {return this.ptr.asSlice(OFFSET__storageTexelBufferOffsetAlignmentBytes, LAYOUT__storageTexelBufferOffsetAlignmentBytes);}

    public int storageTexelBufferOffsetSingleTexelAlignment() {return this.ptr.get(LAYOUT__storageTexelBufferOffsetSingleTexelAlignment, OFFSET__storageTexelBufferOffsetSingleTexelAlignment);}
    public void storageTexelBufferOffsetSingleTexelAlignment(int value) {this.ptr.set(LAYOUT__storageTexelBufferOffsetSingleTexelAlignment, OFFSET__storageTexelBufferOffsetSingleTexelAlignment, value);}
    public java.lang.foreign.MemorySegment $storageTexelBufferOffsetSingleTexelAlignment() {return this.ptr.asSlice(OFFSET__storageTexelBufferOffsetSingleTexelAlignment, LAYOUT__storageTexelBufferOffsetSingleTexelAlignment);}

    public long uniformTexelBufferOffsetAlignmentBytes() {return this.ptr.get(LAYOUT__uniformTexelBufferOffsetAlignmentBytes, OFFSET__uniformTexelBufferOffsetAlignmentBytes);}
    public void uniformTexelBufferOffsetAlignmentBytes(long value) {this.ptr.set(LAYOUT__uniformTexelBufferOffsetAlignmentBytes, OFFSET__uniformTexelBufferOffsetAlignmentBytes, value);}
    public java.lang.foreign.MemorySegment $uniformTexelBufferOffsetAlignmentBytes() {return this.ptr.asSlice(OFFSET__uniformTexelBufferOffsetAlignmentBytes, LAYOUT__uniformTexelBufferOffsetAlignmentBytes);}

    public int uniformTexelBufferOffsetSingleTexelAlignment() {return this.ptr.get(LAYOUT__uniformTexelBufferOffsetSingleTexelAlignment, OFFSET__uniformTexelBufferOffsetSingleTexelAlignment);}
    public void uniformTexelBufferOffsetSingleTexelAlignment(int value) {this.ptr.set(LAYOUT__uniformTexelBufferOffsetSingleTexelAlignment, OFFSET__uniformTexelBufferOffsetSingleTexelAlignment, value);}
    public java.lang.foreign.MemorySegment $uniformTexelBufferOffsetSingleTexelAlignment() {return this.ptr.asSlice(OFFSET__uniformTexelBufferOffsetSingleTexelAlignment, LAYOUT__uniformTexelBufferOffsetSingleTexelAlignment);}
}
