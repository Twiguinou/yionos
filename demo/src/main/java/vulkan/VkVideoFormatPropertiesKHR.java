package vulkan;

public record VkVideoFormatPropertiesKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__format = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__format = 16;
    public static final java.lang.foreign.StructLayout LAYOUT__componentMapping = vulkan.VkComponentMapping.gRecordLayout;
    public static final long OFFSET__componentMapping = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__imageCreateFlags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__imageCreateFlags = 36;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__imageType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__imageType = 40;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__imageTiling = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__imageTiling = 44;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__imageUsageFlags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__imageUsageFlags = 48;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__format,
            LAYOUT__componentMapping,
            LAYOUT__imageCreateFlags,
            LAYOUT__imageType,
            LAYOUT__imageTiling,
            LAYOUT__imageUsageFlags,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkVideoFormatPropertiesKHR");

    public VkVideoFormatPropertiesKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkVideoFormatPropertiesKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkVideoFormatPropertiesKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkVideoFormatPropertiesKHR value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int format() {return this.ptr.get(LAYOUT__format, OFFSET__format);}
    public void format(int value) {this.ptr.set(LAYOUT__format, OFFSET__format, value);}
    public java.lang.foreign.MemorySegment $format() {return this.ptr.asSlice(OFFSET__format, LAYOUT__format);}

    public vulkan.VkComponentMapping componentMapping() {return new vulkan.VkComponentMapping(this.ptr.asSlice(OFFSET__componentMapping, LAYOUT__componentMapping));}
    public void componentMapping(java.util.function.Consumer<vulkan.VkComponentMapping> consumer) {consumer.accept(this.componentMapping());}
    public void componentMapping(vulkan.VkComponentMapping value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__componentMapping, LAYOUT__componentMapping.byteSize());}

    public int imageCreateFlags() {return this.ptr.get(LAYOUT__imageCreateFlags, OFFSET__imageCreateFlags);}
    public void imageCreateFlags(int value) {this.ptr.set(LAYOUT__imageCreateFlags, OFFSET__imageCreateFlags, value);}
    public java.lang.foreign.MemorySegment $imageCreateFlags() {return this.ptr.asSlice(OFFSET__imageCreateFlags, LAYOUT__imageCreateFlags);}

    public int imageType() {return this.ptr.get(LAYOUT__imageType, OFFSET__imageType);}
    public void imageType(int value) {this.ptr.set(LAYOUT__imageType, OFFSET__imageType, value);}
    public java.lang.foreign.MemorySegment $imageType() {return this.ptr.asSlice(OFFSET__imageType, LAYOUT__imageType);}

    public int imageTiling() {return this.ptr.get(LAYOUT__imageTiling, OFFSET__imageTiling);}
    public void imageTiling(int value) {this.ptr.set(LAYOUT__imageTiling, OFFSET__imageTiling, value);}
    public java.lang.foreign.MemorySegment $imageTiling() {return this.ptr.asSlice(OFFSET__imageTiling, LAYOUT__imageTiling);}

    public int imageUsageFlags() {return this.ptr.get(LAYOUT__imageUsageFlags, OFFSET__imageUsageFlags);}
    public void imageUsageFlags(int value) {this.ptr.set(LAYOUT__imageUsageFlags, OFFSET__imageUsageFlags, value);}
    public java.lang.foreign.MemorySegment $imageUsageFlags() {return this.ptr.asSlice(OFFSET__imageUsageFlags, LAYOUT__imageUsageFlags);}
}
