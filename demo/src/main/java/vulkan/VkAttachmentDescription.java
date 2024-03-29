package vulkan;

public record VkAttachmentDescription(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$flags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$flags = 0L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$format = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$format = 4L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$samples = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$samples = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$loadOp = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$loadOp = 12L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$storeOp = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$storeOp = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$stencilLoadOp = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$stencilLoadOp = 20L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$stencilStoreOp = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$stencilStoreOp = 24L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$initialLayout = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$initialLayout = 28L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$finalLayout = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$finalLayout = 32L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$flags,
            LAYOUT$format,
            LAYOUT$samples,
            LAYOUT$loadOp,
            LAYOUT$storeOp,
            LAYOUT$stencilLoadOp,
            LAYOUT$stencilStoreOp,
            LAYOUT$initialLayout,
            LAYOUT$finalLayout
    ).withName("VkAttachmentDescription");

    public VkAttachmentDescription(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VkAttachmentDescription getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VkAttachmentDescription(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int flags() {return this.ptr.get(LAYOUT$flags, OFFSET$flags);}
    public void flags(int value) {this.ptr.set(LAYOUT$flags, OFFSET$flags, value);}
    public java.lang.foreign.MemorySegment flags_ptr() {return this.ptr.asSlice(OFFSET$flags, LAYOUT$flags);}

    public int format() {return this.ptr.get(LAYOUT$format, OFFSET$format);}
    public void format(int value) {this.ptr.set(LAYOUT$format, OFFSET$format, value);}
    public java.lang.foreign.MemorySegment format_ptr() {return this.ptr.asSlice(OFFSET$format, LAYOUT$format);}

    public int samples() {return this.ptr.get(LAYOUT$samples, OFFSET$samples);}
    public void samples(int value) {this.ptr.set(LAYOUT$samples, OFFSET$samples, value);}
    public java.lang.foreign.MemorySegment samples_ptr() {return this.ptr.asSlice(OFFSET$samples, LAYOUT$samples);}

    public int loadOp() {return this.ptr.get(LAYOUT$loadOp, OFFSET$loadOp);}
    public void loadOp(int value) {this.ptr.set(LAYOUT$loadOp, OFFSET$loadOp, value);}
    public java.lang.foreign.MemorySegment loadOp_ptr() {return this.ptr.asSlice(OFFSET$loadOp, LAYOUT$loadOp);}

    public int storeOp() {return this.ptr.get(LAYOUT$storeOp, OFFSET$storeOp);}
    public void storeOp(int value) {this.ptr.set(LAYOUT$storeOp, OFFSET$storeOp, value);}
    public java.lang.foreign.MemorySegment storeOp_ptr() {return this.ptr.asSlice(OFFSET$storeOp, LAYOUT$storeOp);}

    public int stencilLoadOp() {return this.ptr.get(LAYOUT$stencilLoadOp, OFFSET$stencilLoadOp);}
    public void stencilLoadOp(int value) {this.ptr.set(LAYOUT$stencilLoadOp, OFFSET$stencilLoadOp, value);}
    public java.lang.foreign.MemorySegment stencilLoadOp_ptr() {return this.ptr.asSlice(OFFSET$stencilLoadOp, LAYOUT$stencilLoadOp);}

    public int stencilStoreOp() {return this.ptr.get(LAYOUT$stencilStoreOp, OFFSET$stencilStoreOp);}
    public void stencilStoreOp(int value) {this.ptr.set(LAYOUT$stencilStoreOp, OFFSET$stencilStoreOp, value);}
    public java.lang.foreign.MemorySegment stencilStoreOp_ptr() {return this.ptr.asSlice(OFFSET$stencilStoreOp, LAYOUT$stencilStoreOp);}

    public int initialLayout() {return this.ptr.get(LAYOUT$initialLayout, OFFSET$initialLayout);}
    public void initialLayout(int value) {this.ptr.set(LAYOUT$initialLayout, OFFSET$initialLayout, value);}
    public java.lang.foreign.MemorySegment initialLayout_ptr() {return this.ptr.asSlice(OFFSET$initialLayout, LAYOUT$initialLayout);}

    public int finalLayout() {return this.ptr.get(LAYOUT$finalLayout, OFFSET$finalLayout);}
    public void finalLayout(int value) {this.ptr.set(LAYOUT$finalLayout, OFFSET$finalLayout, value);}
    public java.lang.foreign.MemorySegment finalLayout_ptr() {return this.ptr.asSlice(OFFSET$finalLayout, LAYOUT$finalLayout);}
}
