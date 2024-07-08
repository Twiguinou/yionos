package vulkan;

public record VkVertexInputAttributeDescription2EXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__location = java.lang.foreign.ValueLayout.JAVA_INT.withName("location");
    public static final long OFFSET__location = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__binding = java.lang.foreign.ValueLayout.JAVA_INT.withName("binding");
    public static final long OFFSET__binding = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__format = java.lang.foreign.ValueLayout.JAVA_INT.withName("format");
    public static final long OFFSET__format = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__offset = java.lang.foreign.ValueLayout.JAVA_INT.withName("offset");
    public static final long OFFSET__offset = 28;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__location,
            LAYOUT__binding,
            LAYOUT__format,
            LAYOUT__offset
    ).withByteAlignment(8).withName("VkVertexInputAttributeDescription2EXT");

    public VkVertexInputAttributeDescription2EXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkVertexInputAttributeDescription2EXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkVertexInputAttributeDescription2EXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkVertexInputAttributeDescription2EXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int location() {return this.ptr.get(LAYOUT__location, OFFSET__location);}
    public void location(int value) {this.ptr.set(LAYOUT__location, OFFSET__location, value);}
    public java.lang.foreign.MemorySegment $location() {return this.ptr.asSlice(OFFSET__location, LAYOUT__location);}

    public int binding() {return this.ptr.get(LAYOUT__binding, OFFSET__binding);}
    public void binding(int value) {this.ptr.set(LAYOUT__binding, OFFSET__binding, value);}
    public java.lang.foreign.MemorySegment $binding() {return this.ptr.asSlice(OFFSET__binding, LAYOUT__binding);}

    public int format() {return this.ptr.get(LAYOUT__format, OFFSET__format);}
    public void format(int value) {this.ptr.set(LAYOUT__format, OFFSET__format, value);}
    public java.lang.foreign.MemorySegment $format() {return this.ptr.asSlice(OFFSET__format, LAYOUT__format);}

    public int offset() {return this.ptr.get(LAYOUT__offset, OFFSET__offset);}
    public void offset(int value) {this.ptr.set(LAYOUT__offset, OFFSET__offset, value);}
    public java.lang.foreign.MemorySegment $offset() {return this.ptr.asSlice(OFFSET__offset, LAYOUT__offset);}
}
