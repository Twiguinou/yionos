package vulkan;

public record VkSubpassDependency2(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__srcSubpass = java.lang.foreign.ValueLayout.JAVA_INT.withName("srcSubpass");
    public static final long OFFSET__srcSubpass = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__dstSubpass = java.lang.foreign.ValueLayout.JAVA_INT.withName("dstSubpass");
    public static final long OFFSET__dstSubpass = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__srcStageMask = java.lang.foreign.ValueLayout.JAVA_INT.withName("srcStageMask");
    public static final long OFFSET__srcStageMask = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__dstStageMask = java.lang.foreign.ValueLayout.JAVA_INT.withName("dstStageMask");
    public static final long OFFSET__dstStageMask = 28;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__srcAccessMask = java.lang.foreign.ValueLayout.JAVA_INT.withName("srcAccessMask");
    public static final long OFFSET__srcAccessMask = 32;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__dstAccessMask = java.lang.foreign.ValueLayout.JAVA_INT.withName("dstAccessMask");
    public static final long OFFSET__dstAccessMask = 36;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__dependencyFlags = java.lang.foreign.ValueLayout.JAVA_INT.withName("dependencyFlags");
    public static final long OFFSET__dependencyFlags = 40;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__viewOffset = java.lang.foreign.ValueLayout.JAVA_INT.withName("viewOffset");
    public static final long OFFSET__viewOffset = 44;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__srcSubpass,
            LAYOUT__dstSubpass,
            LAYOUT__srcStageMask,
            LAYOUT__dstStageMask,
            LAYOUT__srcAccessMask,
            LAYOUT__dstAccessMask,
            LAYOUT__dependencyFlags,
            LAYOUT__viewOffset
    ).withByteAlignment(8).withName("VkSubpassDependency2");

    public VkSubpassDependency2(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkSubpassDependency2 getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkSubpassDependency2(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkSubpassDependency2 value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int srcSubpass() {return this.ptr.get(LAYOUT__srcSubpass, OFFSET__srcSubpass);}
    public void srcSubpass(int value) {this.ptr.set(LAYOUT__srcSubpass, OFFSET__srcSubpass, value);}
    public java.lang.foreign.MemorySegment $srcSubpass() {return this.ptr.asSlice(OFFSET__srcSubpass, LAYOUT__srcSubpass);}

    public int dstSubpass() {return this.ptr.get(LAYOUT__dstSubpass, OFFSET__dstSubpass);}
    public void dstSubpass(int value) {this.ptr.set(LAYOUT__dstSubpass, OFFSET__dstSubpass, value);}
    public java.lang.foreign.MemorySegment $dstSubpass() {return this.ptr.asSlice(OFFSET__dstSubpass, LAYOUT__dstSubpass);}

    public int srcStageMask() {return this.ptr.get(LAYOUT__srcStageMask, OFFSET__srcStageMask);}
    public void srcStageMask(int value) {this.ptr.set(LAYOUT__srcStageMask, OFFSET__srcStageMask, value);}
    public java.lang.foreign.MemorySegment $srcStageMask() {return this.ptr.asSlice(OFFSET__srcStageMask, LAYOUT__srcStageMask);}

    public int dstStageMask() {return this.ptr.get(LAYOUT__dstStageMask, OFFSET__dstStageMask);}
    public void dstStageMask(int value) {this.ptr.set(LAYOUT__dstStageMask, OFFSET__dstStageMask, value);}
    public java.lang.foreign.MemorySegment $dstStageMask() {return this.ptr.asSlice(OFFSET__dstStageMask, LAYOUT__dstStageMask);}

    public int srcAccessMask() {return this.ptr.get(LAYOUT__srcAccessMask, OFFSET__srcAccessMask);}
    public void srcAccessMask(int value) {this.ptr.set(LAYOUT__srcAccessMask, OFFSET__srcAccessMask, value);}
    public java.lang.foreign.MemorySegment $srcAccessMask() {return this.ptr.asSlice(OFFSET__srcAccessMask, LAYOUT__srcAccessMask);}

    public int dstAccessMask() {return this.ptr.get(LAYOUT__dstAccessMask, OFFSET__dstAccessMask);}
    public void dstAccessMask(int value) {this.ptr.set(LAYOUT__dstAccessMask, OFFSET__dstAccessMask, value);}
    public java.lang.foreign.MemorySegment $dstAccessMask() {return this.ptr.asSlice(OFFSET__dstAccessMask, LAYOUT__dstAccessMask);}

    public int dependencyFlags() {return this.ptr.get(LAYOUT__dependencyFlags, OFFSET__dependencyFlags);}
    public void dependencyFlags(int value) {this.ptr.set(LAYOUT__dependencyFlags, OFFSET__dependencyFlags, value);}
    public java.lang.foreign.MemorySegment $dependencyFlags() {return this.ptr.asSlice(OFFSET__dependencyFlags, LAYOUT__dependencyFlags);}

    public int viewOffset() {return this.ptr.get(LAYOUT__viewOffset, OFFSET__viewOffset);}
    public void viewOffset(int value) {this.ptr.set(LAYOUT__viewOffset, OFFSET__viewOffset, value);}
    public java.lang.foreign.MemorySegment $viewOffset() {return this.ptr.asSlice(OFFSET__viewOffset, LAYOUT__viewOffset);}
}
