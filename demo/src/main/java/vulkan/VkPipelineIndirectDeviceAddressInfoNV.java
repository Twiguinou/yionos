package vulkan;

public record VkPipelineIndirectDeviceAddressInfoNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$pipelineBindPoint = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$pipelineBindPoint = 16L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pipeline = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pipeline = 24L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$pipelineBindPoint,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pipeline
    ).withName("VkPipelineIndirectDeviceAddressInfoNV");

    public VkPipelineIndirectDeviceAddressInfoNV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VkPipelineIndirectDeviceAddressInfoNV getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VkPipelineIndirectDeviceAddressInfoNV(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int pipelineBindPoint() {return this.ptr.get(LAYOUT$pipelineBindPoint, OFFSET$pipelineBindPoint);}
    public void pipelineBindPoint(int value) {this.ptr.set(LAYOUT$pipelineBindPoint, OFFSET$pipelineBindPoint, value);}
    public java.lang.foreign.MemorySegment pipelineBindPoint_ptr() {return this.ptr.asSlice(OFFSET$pipelineBindPoint, LAYOUT$pipelineBindPoint);}

    public java.lang.foreign.MemorySegment pipeline() {return this.ptr.get(LAYOUT$pipeline, OFFSET$pipeline);}
    public void pipeline(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pipeline, OFFSET$pipeline, value);}
    public java.lang.foreign.MemorySegment pipeline_ptr() {return this.ptr.asSlice(OFFSET$pipeline, LAYOUT$pipeline);}
}
