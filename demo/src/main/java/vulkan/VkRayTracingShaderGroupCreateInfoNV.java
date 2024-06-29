package vulkan;

public record VkRayTracingShaderGroupCreateInfoNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__type = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__type = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__generalShader = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__generalShader = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__closestHitShader = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__closestHitShader = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__anyHitShader = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__anyHitShader = 28;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__intersectionShader = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__intersectionShader = 32;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__type,
            LAYOUT__generalShader,
            LAYOUT__closestHitShader,
            LAYOUT__anyHitShader,
            LAYOUT__intersectionShader,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkRayTracingShaderGroupCreateInfoNV");

    public VkRayTracingShaderGroupCreateInfoNV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkRayTracingShaderGroupCreateInfoNV getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkRayTracingShaderGroupCreateInfoNV(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkRayTracingShaderGroupCreateInfoNV value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int type() {return this.ptr.get(LAYOUT__type, OFFSET__type);}
    public void type(int value) {this.ptr.set(LAYOUT__type, OFFSET__type, value);}
    public java.lang.foreign.MemorySegment $type() {return this.ptr.asSlice(OFFSET__type, LAYOUT__type);}

    public int generalShader() {return this.ptr.get(LAYOUT__generalShader, OFFSET__generalShader);}
    public void generalShader(int value) {this.ptr.set(LAYOUT__generalShader, OFFSET__generalShader, value);}
    public java.lang.foreign.MemorySegment $generalShader() {return this.ptr.asSlice(OFFSET__generalShader, LAYOUT__generalShader);}

    public int closestHitShader() {return this.ptr.get(LAYOUT__closestHitShader, OFFSET__closestHitShader);}
    public void closestHitShader(int value) {this.ptr.set(LAYOUT__closestHitShader, OFFSET__closestHitShader, value);}
    public java.lang.foreign.MemorySegment $closestHitShader() {return this.ptr.asSlice(OFFSET__closestHitShader, LAYOUT__closestHitShader);}

    public int anyHitShader() {return this.ptr.get(LAYOUT__anyHitShader, OFFSET__anyHitShader);}
    public void anyHitShader(int value) {this.ptr.set(LAYOUT__anyHitShader, OFFSET__anyHitShader, value);}
    public java.lang.foreign.MemorySegment $anyHitShader() {return this.ptr.asSlice(OFFSET__anyHitShader, LAYOUT__anyHitShader);}

    public int intersectionShader() {return this.ptr.get(LAYOUT__intersectionShader, OFFSET__intersectionShader);}
    public void intersectionShader(int value) {this.ptr.set(LAYOUT__intersectionShader, OFFSET__intersectionShader, value);}
    public java.lang.foreign.MemorySegment $intersectionShader() {return this.ptr.asSlice(OFFSET__intersectionShader, LAYOUT__intersectionShader);}
}
