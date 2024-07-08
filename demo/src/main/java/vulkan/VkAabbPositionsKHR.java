package vulkan;

public record VkAabbPositionsKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__minX = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("minX");
    public static final long OFFSET__minX = 0;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__minY = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("minY");
    public static final long OFFSET__minY = 4;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__minZ = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("minZ");
    public static final long OFFSET__minZ = 8;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__maxX = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("maxX");
    public static final long OFFSET__maxX = 12;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__maxY = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("maxY");
    public static final long OFFSET__maxY = 16;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__maxZ = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("maxZ");
    public static final long OFFSET__maxZ = 20;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__minX,
            LAYOUT__minY,
            LAYOUT__minZ,
            LAYOUT__maxX,
            LAYOUT__maxY,
            LAYOUT__maxZ
    ).withByteAlignment(4).withName("VkAabbPositionsKHR");

    public VkAabbPositionsKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkAabbPositionsKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkAabbPositionsKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkAabbPositionsKHR value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public float minX() {return this.ptr.get(LAYOUT__minX, OFFSET__minX);}
    public void minX(float value) {this.ptr.set(LAYOUT__minX, OFFSET__minX, value);}
    public java.lang.foreign.MemorySegment $minX() {return this.ptr.asSlice(OFFSET__minX, LAYOUT__minX);}

    public float minY() {return this.ptr.get(LAYOUT__minY, OFFSET__minY);}
    public void minY(float value) {this.ptr.set(LAYOUT__minY, OFFSET__minY, value);}
    public java.lang.foreign.MemorySegment $minY() {return this.ptr.asSlice(OFFSET__minY, LAYOUT__minY);}

    public float minZ() {return this.ptr.get(LAYOUT__minZ, OFFSET__minZ);}
    public void minZ(float value) {this.ptr.set(LAYOUT__minZ, OFFSET__minZ, value);}
    public java.lang.foreign.MemorySegment $minZ() {return this.ptr.asSlice(OFFSET__minZ, LAYOUT__minZ);}

    public float maxX() {return this.ptr.get(LAYOUT__maxX, OFFSET__maxX);}
    public void maxX(float value) {this.ptr.set(LAYOUT__maxX, OFFSET__maxX, value);}
    public java.lang.foreign.MemorySegment $maxX() {return this.ptr.asSlice(OFFSET__maxX, LAYOUT__maxX);}

    public float maxY() {return this.ptr.get(LAYOUT__maxY, OFFSET__maxY);}
    public void maxY(float value) {this.ptr.set(LAYOUT__maxY, OFFSET__maxY, value);}
    public java.lang.foreign.MemorySegment $maxY() {return this.ptr.asSlice(OFFSET__maxY, LAYOUT__maxY);}

    public float maxZ() {return this.ptr.get(LAYOUT__maxZ, OFFSET__maxZ);}
    public void maxZ(float value) {this.ptr.set(LAYOUT__maxZ, OFFSET__maxZ, value);}
    public java.lang.foreign.MemorySegment $maxZ() {return this.ptr.asSlice(OFFSET__maxZ, LAYOUT__maxZ);}
}
