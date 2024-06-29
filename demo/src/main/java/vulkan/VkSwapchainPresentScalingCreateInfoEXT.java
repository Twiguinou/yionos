package vulkan;

public record VkSwapchainPresentScalingCreateInfoEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__scalingBehavior = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__scalingBehavior = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__presentGravityX = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__presentGravityX = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__presentGravityY = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__presentGravityY = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__scalingBehavior,
            LAYOUT__presentGravityX,
            LAYOUT__presentGravityY,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkSwapchainPresentScalingCreateInfoEXT");

    public VkSwapchainPresentScalingCreateInfoEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkSwapchainPresentScalingCreateInfoEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkSwapchainPresentScalingCreateInfoEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkSwapchainPresentScalingCreateInfoEXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int scalingBehavior() {return this.ptr.get(LAYOUT__scalingBehavior, OFFSET__scalingBehavior);}
    public void scalingBehavior(int value) {this.ptr.set(LAYOUT__scalingBehavior, OFFSET__scalingBehavior, value);}
    public java.lang.foreign.MemorySegment $scalingBehavior() {return this.ptr.asSlice(OFFSET__scalingBehavior, LAYOUT__scalingBehavior);}

    public int presentGravityX() {return this.ptr.get(LAYOUT__presentGravityX, OFFSET__presentGravityX);}
    public void presentGravityX(int value) {this.ptr.set(LAYOUT__presentGravityX, OFFSET__presentGravityX, value);}
    public java.lang.foreign.MemorySegment $presentGravityX() {return this.ptr.asSlice(OFFSET__presentGravityX, LAYOUT__presentGravityX);}

    public int presentGravityY() {return this.ptr.get(LAYOUT__presentGravityY, OFFSET__presentGravityY);}
    public void presentGravityY(int value) {this.ptr.set(LAYOUT__presentGravityY, OFFSET__presentGravityY, value);}
    public java.lang.foreign.MemorySegment $presentGravityY() {return this.ptr.asSlice(OFFSET__presentGravityY, LAYOUT__presentGravityY);}
}
