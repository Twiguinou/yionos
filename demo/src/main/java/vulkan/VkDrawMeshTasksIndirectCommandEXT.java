package vulkan;

public record VkDrawMeshTasksIndirectCommandEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__groupCountX = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__groupCountX = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__groupCountY = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__groupCountY = 4;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__groupCountZ = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__groupCountZ = 8;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__groupCountX,
            LAYOUT__groupCountY,
            LAYOUT__groupCountZ
    ).withByteAlignment(4).withName("VkDrawMeshTasksIndirectCommandEXT");

    public VkDrawMeshTasksIndirectCommandEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkDrawMeshTasksIndirectCommandEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkDrawMeshTasksIndirectCommandEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkDrawMeshTasksIndirectCommandEXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int groupCountX() {return this.ptr.get(LAYOUT__groupCountX, OFFSET__groupCountX);}
    public void groupCountX(int value) {this.ptr.set(LAYOUT__groupCountX, OFFSET__groupCountX, value);}
    public java.lang.foreign.MemorySegment $groupCountX() {return this.ptr.asSlice(OFFSET__groupCountX, LAYOUT__groupCountX);}

    public int groupCountY() {return this.ptr.get(LAYOUT__groupCountY, OFFSET__groupCountY);}
    public void groupCountY(int value) {this.ptr.set(LAYOUT__groupCountY, OFFSET__groupCountY, value);}
    public java.lang.foreign.MemorySegment $groupCountY() {return this.ptr.asSlice(OFFSET__groupCountY, LAYOUT__groupCountY);}

    public int groupCountZ() {return this.ptr.get(LAYOUT__groupCountZ, OFFSET__groupCountZ);}
    public void groupCountZ(int value) {this.ptr.set(LAYOUT__groupCountZ, OFFSET__groupCountZ, value);}
    public java.lang.foreign.MemorySegment $groupCountZ() {return this.ptr.asSlice(OFFSET__groupCountZ, LAYOUT__groupCountZ);}
}
