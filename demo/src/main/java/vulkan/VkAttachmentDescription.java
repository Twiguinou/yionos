package vulkan;

public record VkAttachmentDescription(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__flags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__flags = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__format = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__format = 4;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__samples = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__samples = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__loadOp = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__loadOp = 12;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__storeOp = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__storeOp = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__stencilLoadOp = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__stencilLoadOp = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__stencilStoreOp = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__stencilStoreOp = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__initialLayout = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__initialLayout = 28;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__finalLayout = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__finalLayout = 32;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__flags,
            LAYOUT__format,
            LAYOUT__samples,
            LAYOUT__loadOp,
            LAYOUT__storeOp,
            LAYOUT__stencilLoadOp,
            LAYOUT__stencilStoreOp,
            LAYOUT__initialLayout,
            LAYOUT__finalLayout
    ).withByteAlignment(4).withName("VkAttachmentDescription");

    public VkAttachmentDescription(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkAttachmentDescription getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkAttachmentDescription(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkAttachmentDescription value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int flags() {return this.ptr.get(LAYOUT__flags, OFFSET__flags);}
    public void flags(int value) {this.ptr.set(LAYOUT__flags, OFFSET__flags, value);}
    public java.lang.foreign.MemorySegment $flags() {return this.ptr.asSlice(OFFSET__flags, LAYOUT__flags);}

    public int format() {return this.ptr.get(LAYOUT__format, OFFSET__format);}
    public void format(int value) {this.ptr.set(LAYOUT__format, OFFSET__format, value);}
    public java.lang.foreign.MemorySegment $format() {return this.ptr.asSlice(OFFSET__format, LAYOUT__format);}

    public int samples() {return this.ptr.get(LAYOUT__samples, OFFSET__samples);}
    public void samples(int value) {this.ptr.set(LAYOUT__samples, OFFSET__samples, value);}
    public java.lang.foreign.MemorySegment $samples() {return this.ptr.asSlice(OFFSET__samples, LAYOUT__samples);}

    public int loadOp() {return this.ptr.get(LAYOUT__loadOp, OFFSET__loadOp);}
    public void loadOp(int value) {this.ptr.set(LAYOUT__loadOp, OFFSET__loadOp, value);}
    public java.lang.foreign.MemorySegment $loadOp() {return this.ptr.asSlice(OFFSET__loadOp, LAYOUT__loadOp);}

    public int storeOp() {return this.ptr.get(LAYOUT__storeOp, OFFSET__storeOp);}
    public void storeOp(int value) {this.ptr.set(LAYOUT__storeOp, OFFSET__storeOp, value);}
    public java.lang.foreign.MemorySegment $storeOp() {return this.ptr.asSlice(OFFSET__storeOp, LAYOUT__storeOp);}

    public int stencilLoadOp() {return this.ptr.get(LAYOUT__stencilLoadOp, OFFSET__stencilLoadOp);}
    public void stencilLoadOp(int value) {this.ptr.set(LAYOUT__stencilLoadOp, OFFSET__stencilLoadOp, value);}
    public java.lang.foreign.MemorySegment $stencilLoadOp() {return this.ptr.asSlice(OFFSET__stencilLoadOp, LAYOUT__stencilLoadOp);}

    public int stencilStoreOp() {return this.ptr.get(LAYOUT__stencilStoreOp, OFFSET__stencilStoreOp);}
    public void stencilStoreOp(int value) {this.ptr.set(LAYOUT__stencilStoreOp, OFFSET__stencilStoreOp, value);}
    public java.lang.foreign.MemorySegment $stencilStoreOp() {return this.ptr.asSlice(OFFSET__stencilStoreOp, LAYOUT__stencilStoreOp);}

    public int initialLayout() {return this.ptr.get(LAYOUT__initialLayout, OFFSET__initialLayout);}
    public void initialLayout(int value) {this.ptr.set(LAYOUT__initialLayout, OFFSET__initialLayout, value);}
    public java.lang.foreign.MemorySegment $initialLayout() {return this.ptr.asSlice(OFFSET__initialLayout, LAYOUT__initialLayout);}

    public int finalLayout() {return this.ptr.get(LAYOUT__finalLayout, OFFSET__finalLayout);}
    public void finalLayout(int value) {this.ptr.set(LAYOUT__finalLayout, OFFSET__finalLayout, value);}
    public java.lang.foreign.MemorySegment $finalLayout() {return this.ptr.asSlice(OFFSET__finalLayout, LAYOUT__finalLayout);}
}
