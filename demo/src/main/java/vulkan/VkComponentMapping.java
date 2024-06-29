package vulkan;

public record VkComponentMapping(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__r = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__r = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__g = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__g = 4;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__b = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__b = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__a = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__a = 12;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__r,
            LAYOUT__g,
            LAYOUT__b,
            LAYOUT__a
    ).withByteAlignment(4).withName("VkComponentMapping");

    public VkComponentMapping(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkComponentMapping getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkComponentMapping(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkComponentMapping value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int r() {return this.ptr.get(LAYOUT__r, OFFSET__r);}
    public void r(int value) {this.ptr.set(LAYOUT__r, OFFSET__r, value);}
    public java.lang.foreign.MemorySegment $r() {return this.ptr.asSlice(OFFSET__r, LAYOUT__r);}

    public int g() {return this.ptr.get(LAYOUT__g, OFFSET__g);}
    public void g(int value) {this.ptr.set(LAYOUT__g, OFFSET__g, value);}
    public java.lang.foreign.MemorySegment $g() {return this.ptr.asSlice(OFFSET__g, LAYOUT__g);}

    public int b() {return this.ptr.get(LAYOUT__b, OFFSET__b);}
    public void b(int value) {this.ptr.set(LAYOUT__b, OFFSET__b, value);}
    public java.lang.foreign.MemorySegment $b() {return this.ptr.asSlice(OFFSET__b, LAYOUT__b);}

    public int a() {return this.ptr.get(LAYOUT__a, OFFSET__a);}
    public void a(int value) {this.ptr.set(LAYOUT__a, OFFSET__a, value);}
    public java.lang.foreign.MemorySegment $a() {return this.ptr.asSlice(OFFSET__a, LAYOUT__a);}
}
