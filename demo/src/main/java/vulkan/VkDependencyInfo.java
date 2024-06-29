package vulkan;

public record VkDependencyInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__dependencyFlags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__dependencyFlags = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__memoryBarrierCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__memoryBarrierCount = 20;
    public static final java.lang.foreign.AddressLayout LAYOUT__pMemoryBarriers = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pMemoryBarriers = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__bufferMemoryBarrierCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__bufferMemoryBarrierCount = 32;
    public static final java.lang.foreign.AddressLayout LAYOUT__pBufferMemoryBarriers = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pBufferMemoryBarriers = 40;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__imageMemoryBarrierCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__imageMemoryBarrierCount = 48;
    public static final java.lang.foreign.AddressLayout LAYOUT__pImageMemoryBarriers = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pImageMemoryBarriers = 56;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__dependencyFlags,
            LAYOUT__memoryBarrierCount,
            LAYOUT__pMemoryBarriers,
            LAYOUT__bufferMemoryBarrierCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pBufferMemoryBarriers,
            LAYOUT__imageMemoryBarrierCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pImageMemoryBarriers
    ).withByteAlignment(8).withName("VkDependencyInfo");

    public VkDependencyInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkDependencyInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkDependencyInfo(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkDependencyInfo value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int dependencyFlags() {return this.ptr.get(LAYOUT__dependencyFlags, OFFSET__dependencyFlags);}
    public void dependencyFlags(int value) {this.ptr.set(LAYOUT__dependencyFlags, OFFSET__dependencyFlags, value);}
    public java.lang.foreign.MemorySegment $dependencyFlags() {return this.ptr.asSlice(OFFSET__dependencyFlags, LAYOUT__dependencyFlags);}

    public int memoryBarrierCount() {return this.ptr.get(LAYOUT__memoryBarrierCount, OFFSET__memoryBarrierCount);}
    public void memoryBarrierCount(int value) {this.ptr.set(LAYOUT__memoryBarrierCount, OFFSET__memoryBarrierCount, value);}
    public java.lang.foreign.MemorySegment $memoryBarrierCount() {return this.ptr.asSlice(OFFSET__memoryBarrierCount, LAYOUT__memoryBarrierCount);}

    public java.lang.foreign.MemorySegment pMemoryBarriers() {return this.ptr.get(LAYOUT__pMemoryBarriers, OFFSET__pMemoryBarriers);}
    public void pMemoryBarriers(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pMemoryBarriers, OFFSET__pMemoryBarriers, value);}
    public java.lang.foreign.MemorySegment $pMemoryBarriers() {return this.ptr.asSlice(OFFSET__pMemoryBarriers, LAYOUT__pMemoryBarriers);}

    public int bufferMemoryBarrierCount() {return this.ptr.get(LAYOUT__bufferMemoryBarrierCount, OFFSET__bufferMemoryBarrierCount);}
    public void bufferMemoryBarrierCount(int value) {this.ptr.set(LAYOUT__bufferMemoryBarrierCount, OFFSET__bufferMemoryBarrierCount, value);}
    public java.lang.foreign.MemorySegment $bufferMemoryBarrierCount() {return this.ptr.asSlice(OFFSET__bufferMemoryBarrierCount, LAYOUT__bufferMemoryBarrierCount);}

    public java.lang.foreign.MemorySegment pBufferMemoryBarriers() {return this.ptr.get(LAYOUT__pBufferMemoryBarriers, OFFSET__pBufferMemoryBarriers);}
    public void pBufferMemoryBarriers(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pBufferMemoryBarriers, OFFSET__pBufferMemoryBarriers, value);}
    public java.lang.foreign.MemorySegment $pBufferMemoryBarriers() {return this.ptr.asSlice(OFFSET__pBufferMemoryBarriers, LAYOUT__pBufferMemoryBarriers);}

    public int imageMemoryBarrierCount() {return this.ptr.get(LAYOUT__imageMemoryBarrierCount, OFFSET__imageMemoryBarrierCount);}
    public void imageMemoryBarrierCount(int value) {this.ptr.set(LAYOUT__imageMemoryBarrierCount, OFFSET__imageMemoryBarrierCount, value);}
    public java.lang.foreign.MemorySegment $imageMemoryBarrierCount() {return this.ptr.asSlice(OFFSET__imageMemoryBarrierCount, LAYOUT__imageMemoryBarrierCount);}

    public java.lang.foreign.MemorySegment pImageMemoryBarriers() {return this.ptr.get(LAYOUT__pImageMemoryBarriers, OFFSET__pImageMemoryBarriers);}
    public void pImageMemoryBarriers(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pImageMemoryBarriers, OFFSET__pImageMemoryBarriers, value);}
    public java.lang.foreign.MemorySegment $pImageMemoryBarriers() {return this.ptr.asSlice(OFFSET__pImageMemoryBarriers, LAYOUT__pImageMemoryBarriers);}
}
