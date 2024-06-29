package vulkan;

public record VkPhysicalDeviceDrmPropertiesEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__hasPrimary = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__hasPrimary = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__hasRender = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__hasRender = 20;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__primaryMajor = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__primaryMajor = 24;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__primaryMinor = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__primaryMinor = 32;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__renderMajor = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__renderMajor = 40;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__renderMinor = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__renderMinor = 48;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__hasPrimary,
            LAYOUT__hasRender,
            LAYOUT__primaryMajor,
            LAYOUT__primaryMinor,
            LAYOUT__renderMajor,
            LAYOUT__renderMinor
    ).withByteAlignment(8).withName("VkPhysicalDeviceDrmPropertiesEXT");

    public VkPhysicalDeviceDrmPropertiesEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceDrmPropertiesEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceDrmPropertiesEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceDrmPropertiesEXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int hasPrimary() {return this.ptr.get(LAYOUT__hasPrimary, OFFSET__hasPrimary);}
    public void hasPrimary(int value) {this.ptr.set(LAYOUT__hasPrimary, OFFSET__hasPrimary, value);}
    public java.lang.foreign.MemorySegment $hasPrimary() {return this.ptr.asSlice(OFFSET__hasPrimary, LAYOUT__hasPrimary);}

    public int hasRender() {return this.ptr.get(LAYOUT__hasRender, OFFSET__hasRender);}
    public void hasRender(int value) {this.ptr.set(LAYOUT__hasRender, OFFSET__hasRender, value);}
    public java.lang.foreign.MemorySegment $hasRender() {return this.ptr.asSlice(OFFSET__hasRender, LAYOUT__hasRender);}

    public long primaryMajor() {return this.ptr.get(LAYOUT__primaryMajor, OFFSET__primaryMajor);}
    public void primaryMajor(long value) {this.ptr.set(LAYOUT__primaryMajor, OFFSET__primaryMajor, value);}
    public java.lang.foreign.MemorySegment $primaryMajor() {return this.ptr.asSlice(OFFSET__primaryMajor, LAYOUT__primaryMajor);}

    public long primaryMinor() {return this.ptr.get(LAYOUT__primaryMinor, OFFSET__primaryMinor);}
    public void primaryMinor(long value) {this.ptr.set(LAYOUT__primaryMinor, OFFSET__primaryMinor, value);}
    public java.lang.foreign.MemorySegment $primaryMinor() {return this.ptr.asSlice(OFFSET__primaryMinor, LAYOUT__primaryMinor);}

    public long renderMajor() {return this.ptr.get(LAYOUT__renderMajor, OFFSET__renderMajor);}
    public void renderMajor(long value) {this.ptr.set(LAYOUT__renderMajor, OFFSET__renderMajor, value);}
    public java.lang.foreign.MemorySegment $renderMajor() {return this.ptr.asSlice(OFFSET__renderMajor, LAYOUT__renderMajor);}

    public long renderMinor() {return this.ptr.get(LAYOUT__renderMinor, OFFSET__renderMinor);}
    public void renderMinor(long value) {this.ptr.set(LAYOUT__renderMinor, OFFSET__renderMinor, value);}
    public java.lang.foreign.MemorySegment $renderMinor() {return this.ptr.asSlice(OFFSET__renderMinor, LAYOUT__renderMinor);}
}
