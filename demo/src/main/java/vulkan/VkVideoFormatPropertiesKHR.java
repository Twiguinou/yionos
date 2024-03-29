package vulkan;

public record VkVideoFormatPropertiesKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$format = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$format = 16L;
    public static final java.lang.foreign.GroupLayout LAYOUT$componentMapping = vulkan.VkComponentMapping.gStructLayout;
    public static final long OFFSET$componentMapping = 20L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$imageCreateFlags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$imageCreateFlags = 36L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$imageType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$imageType = 40L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$imageTiling = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$imageTiling = 44L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$imageUsageFlags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$imageUsageFlags = 48L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$format,
            LAYOUT$componentMapping,
            LAYOUT$imageCreateFlags,
            LAYOUT$imageType,
            LAYOUT$imageTiling,
            LAYOUT$imageUsageFlags,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("VkVideoFormatPropertiesKHR");

    public VkVideoFormatPropertiesKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VkVideoFormatPropertiesKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VkVideoFormatPropertiesKHR(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int format() {return this.ptr.get(LAYOUT$format, OFFSET$format);}
    public void format(int value) {this.ptr.set(LAYOUT$format, OFFSET$format, value);}
    public java.lang.foreign.MemorySegment format_ptr() {return this.ptr.asSlice(OFFSET$format, LAYOUT$format);}

    public vulkan.VkComponentMapping componentMapping() {return new vulkan.VkComponentMapping(this.ptr.asSlice(OFFSET$componentMapping, LAYOUT$componentMapping));}
    public void componentMapping(java.util.function.Consumer<vulkan.VkComponentMapping> consumer) {consumer.accept(this.componentMapping());}
    public void componentMapping(vulkan.VkComponentMapping value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$componentMapping, LAYOUT$componentMapping.byteSize());}

    public int imageCreateFlags() {return this.ptr.get(LAYOUT$imageCreateFlags, OFFSET$imageCreateFlags);}
    public void imageCreateFlags(int value) {this.ptr.set(LAYOUT$imageCreateFlags, OFFSET$imageCreateFlags, value);}
    public java.lang.foreign.MemorySegment imageCreateFlags_ptr() {return this.ptr.asSlice(OFFSET$imageCreateFlags, LAYOUT$imageCreateFlags);}

    public int imageType() {return this.ptr.get(LAYOUT$imageType, OFFSET$imageType);}
    public void imageType(int value) {this.ptr.set(LAYOUT$imageType, OFFSET$imageType, value);}
    public java.lang.foreign.MemorySegment imageType_ptr() {return this.ptr.asSlice(OFFSET$imageType, LAYOUT$imageType);}

    public int imageTiling() {return this.ptr.get(LAYOUT$imageTiling, OFFSET$imageTiling);}
    public void imageTiling(int value) {this.ptr.set(LAYOUT$imageTiling, OFFSET$imageTiling, value);}
    public java.lang.foreign.MemorySegment imageTiling_ptr() {return this.ptr.asSlice(OFFSET$imageTiling, LAYOUT$imageTiling);}

    public int imageUsageFlags() {return this.ptr.get(LAYOUT$imageUsageFlags, OFFSET$imageUsageFlags);}
    public void imageUsageFlags(int value) {this.ptr.set(LAYOUT$imageUsageFlags, OFFSET$imageUsageFlags, value);}
    public java.lang.foreign.MemorySegment imageUsageFlags_ptr() {return this.ptr.asSlice(OFFSET$imageUsageFlags, LAYOUT$imageUsageFlags);}
}
