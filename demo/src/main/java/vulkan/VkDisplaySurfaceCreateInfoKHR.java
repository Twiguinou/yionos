package vulkan;

public record VkDisplaySurfaceCreateInfoKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__flags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__flags = 16;
    public static final java.lang.foreign.AddressLayout LAYOUT__displayMode = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__displayMode = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__planeIndex = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__planeIndex = 32;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__planeStackIndex = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__planeStackIndex = 36;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__transform = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__transform = 40;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__globalAlpha = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET__globalAlpha = 44;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__alphaMode = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__alphaMode = 48;
    public static final java.lang.foreign.StructLayout LAYOUT__imageExtent = vulkan.VkExtent2D.gRecordLayout;
    public static final long OFFSET__imageExtent = 52;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__flags,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__displayMode,
            LAYOUT__planeIndex,
            LAYOUT__planeStackIndex,
            LAYOUT__transform,
            LAYOUT__globalAlpha,
            LAYOUT__alphaMode,
            LAYOUT__imageExtent,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkDisplaySurfaceCreateInfoKHR");

    public VkDisplaySurfaceCreateInfoKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkDisplaySurfaceCreateInfoKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkDisplaySurfaceCreateInfoKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkDisplaySurfaceCreateInfoKHR value)
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

    public java.lang.foreign.MemorySegment displayMode() {return this.ptr.get(LAYOUT__displayMode, OFFSET__displayMode);}
    public void displayMode(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__displayMode, OFFSET__displayMode, value);}
    public java.lang.foreign.MemorySegment $displayMode() {return this.ptr.asSlice(OFFSET__displayMode, LAYOUT__displayMode);}

    public int planeIndex() {return this.ptr.get(LAYOUT__planeIndex, OFFSET__planeIndex);}
    public void planeIndex(int value) {this.ptr.set(LAYOUT__planeIndex, OFFSET__planeIndex, value);}
    public java.lang.foreign.MemorySegment $planeIndex() {return this.ptr.asSlice(OFFSET__planeIndex, LAYOUT__planeIndex);}

    public int planeStackIndex() {return this.ptr.get(LAYOUT__planeStackIndex, OFFSET__planeStackIndex);}
    public void planeStackIndex(int value) {this.ptr.set(LAYOUT__planeStackIndex, OFFSET__planeStackIndex, value);}
    public java.lang.foreign.MemorySegment $planeStackIndex() {return this.ptr.asSlice(OFFSET__planeStackIndex, LAYOUT__planeStackIndex);}

    public int transform() {return this.ptr.get(LAYOUT__transform, OFFSET__transform);}
    public void transform(int value) {this.ptr.set(LAYOUT__transform, OFFSET__transform, value);}
    public java.lang.foreign.MemorySegment $transform() {return this.ptr.asSlice(OFFSET__transform, LAYOUT__transform);}

    public float globalAlpha() {return this.ptr.get(LAYOUT__globalAlpha, OFFSET__globalAlpha);}
    public void globalAlpha(float value) {this.ptr.set(LAYOUT__globalAlpha, OFFSET__globalAlpha, value);}
    public java.lang.foreign.MemorySegment $globalAlpha() {return this.ptr.asSlice(OFFSET__globalAlpha, LAYOUT__globalAlpha);}

    public int alphaMode() {return this.ptr.get(LAYOUT__alphaMode, OFFSET__alphaMode);}
    public void alphaMode(int value) {this.ptr.set(LAYOUT__alphaMode, OFFSET__alphaMode, value);}
    public java.lang.foreign.MemorySegment $alphaMode() {return this.ptr.asSlice(OFFSET__alphaMode, LAYOUT__alphaMode);}

    public vulkan.VkExtent2D imageExtent() {return new vulkan.VkExtent2D(this.ptr.asSlice(OFFSET__imageExtent, LAYOUT__imageExtent));}
    public void imageExtent(java.util.function.Consumer<vulkan.VkExtent2D> consumer) {consumer.accept(this.imageExtent());}
    public void imageExtent(vulkan.VkExtent2D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__imageExtent, LAYOUT__imageExtent.byteSize());}
}
