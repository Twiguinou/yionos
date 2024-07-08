package vulkan;

public record VkDrawMeshTasksIndirectCommandNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__taskCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("taskCount");
    public static final long OFFSET__taskCount = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__firstTask = java.lang.foreign.ValueLayout.JAVA_INT.withName("firstTask");
    public static final long OFFSET__firstTask = 4;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__taskCount,
            LAYOUT__firstTask
    ).withByteAlignment(4).withName("VkDrawMeshTasksIndirectCommandNV");

    public VkDrawMeshTasksIndirectCommandNV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkDrawMeshTasksIndirectCommandNV getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkDrawMeshTasksIndirectCommandNV(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkDrawMeshTasksIndirectCommandNV value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int taskCount() {return this.ptr.get(LAYOUT__taskCount, OFFSET__taskCount);}
    public void taskCount(int value) {this.ptr.set(LAYOUT__taskCount, OFFSET__taskCount, value);}
    public java.lang.foreign.MemorySegment $taskCount() {return this.ptr.asSlice(OFFSET__taskCount, LAYOUT__taskCount);}

    public int firstTask() {return this.ptr.get(LAYOUT__firstTask, OFFSET__firstTask);}
    public void firstTask(int value) {this.ptr.set(LAYOUT__firstTask, OFFSET__firstTask, value);}
    public java.lang.foreign.MemorySegment $firstTask() {return this.ptr.asSlice(OFFSET__firstTask, LAYOUT__firstTask);}
}
