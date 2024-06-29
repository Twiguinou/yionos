package vulkan;

public record VkSubpassDependency(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__srcSubpass = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__srcSubpass = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__dstSubpass = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__dstSubpass = 4;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__srcStageMask = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__srcStageMask = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__dstStageMask = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__dstStageMask = 12;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__srcAccessMask = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__srcAccessMask = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__dstAccessMask = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__dstAccessMask = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__dependencyFlags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__dependencyFlags = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__srcSubpass,
            LAYOUT__dstSubpass,
            LAYOUT__srcStageMask,
            LAYOUT__dstStageMask,
            LAYOUT__srcAccessMask,
            LAYOUT__dstAccessMask,
            LAYOUT__dependencyFlags
    ).withByteAlignment(4).withName("VkSubpassDependency");

    public VkSubpassDependency(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkSubpassDependency getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkSubpassDependency(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkSubpassDependency value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

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
}
