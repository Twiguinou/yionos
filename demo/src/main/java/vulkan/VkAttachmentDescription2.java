package vulkan;

public record VkAttachmentDescription2(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__flags = java.lang.foreign.ValueLayout.JAVA_INT.withName("flags");
    public static final long OFFSET__flags = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__format = java.lang.foreign.ValueLayout.JAVA_INT.withName("format");
    public static final long OFFSET__format = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__samples = java.lang.foreign.ValueLayout.JAVA_INT.withName("samples");
    public static final long OFFSET__samples = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__loadOp = java.lang.foreign.ValueLayout.JAVA_INT.withName("loadOp");
    public static final long OFFSET__loadOp = 28;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__storeOp = java.lang.foreign.ValueLayout.JAVA_INT.withName("storeOp");
    public static final long OFFSET__storeOp = 32;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__stencilLoadOp = java.lang.foreign.ValueLayout.JAVA_INT.withName("stencilLoadOp");
    public static final long OFFSET__stencilLoadOp = 36;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__stencilStoreOp = java.lang.foreign.ValueLayout.JAVA_INT.withName("stencilStoreOp");
    public static final long OFFSET__stencilStoreOp = 40;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__initialLayout = java.lang.foreign.ValueLayout.JAVA_INT.withName("initialLayout");
    public static final long OFFSET__initialLayout = 44;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__finalLayout = java.lang.foreign.ValueLayout.JAVA_INT.withName("finalLayout");
    public static final long OFFSET__finalLayout = 48;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__flags,
            LAYOUT__format,
            LAYOUT__samples,
            LAYOUT__loadOp,
            LAYOUT__storeOp,
            LAYOUT__stencilLoadOp,
            LAYOUT__stencilStoreOp,
            LAYOUT__initialLayout,
            LAYOUT__finalLayout,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkAttachmentDescription2");

    public VkAttachmentDescription2(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkAttachmentDescription2 getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkAttachmentDescription2(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkAttachmentDescription2 value)
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
