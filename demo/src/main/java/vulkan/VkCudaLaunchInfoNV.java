package vulkan;

public record VkCudaLaunchInfoNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.AddressLayout LAYOUT__function = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__function = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__gridDimX = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__gridDimX = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__gridDimY = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__gridDimY = 28;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__gridDimZ = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__gridDimZ = 32;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__blockDimX = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__blockDimX = 36;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__blockDimY = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__blockDimY = 40;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__blockDimZ = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__blockDimZ = 44;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sharedMemBytes = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sharedMemBytes = 48;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__paramCount = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__paramCount = 56;
    public static final java.lang.foreign.AddressLayout LAYOUT__pParams = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pParams = 64;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__extraCount = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__extraCount = 72;
    public static final java.lang.foreign.AddressLayout LAYOUT__pExtras = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pExtras = 80;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__function,
            LAYOUT__gridDimX,
            LAYOUT__gridDimY,
            LAYOUT__gridDimZ,
            LAYOUT__blockDimX,
            LAYOUT__blockDimY,
            LAYOUT__blockDimZ,
            LAYOUT__sharedMemBytes,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__paramCount,
            LAYOUT__pParams,
            LAYOUT__extraCount,
            LAYOUT__pExtras
    ).withByteAlignment(8).withName("VkCudaLaunchInfoNV");

    public VkCudaLaunchInfoNV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkCudaLaunchInfoNV getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkCudaLaunchInfoNV(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkCudaLaunchInfoNV value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public java.lang.foreign.MemorySegment function() {return this.ptr.get(LAYOUT__function, OFFSET__function);}
    public void function(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__function, OFFSET__function, value);}
    public java.lang.foreign.MemorySegment $function() {return this.ptr.asSlice(OFFSET__function, LAYOUT__function);}

    public int gridDimX() {return this.ptr.get(LAYOUT__gridDimX, OFFSET__gridDimX);}
    public void gridDimX(int value) {this.ptr.set(LAYOUT__gridDimX, OFFSET__gridDimX, value);}
    public java.lang.foreign.MemorySegment $gridDimX() {return this.ptr.asSlice(OFFSET__gridDimX, LAYOUT__gridDimX);}

    public int gridDimY() {return this.ptr.get(LAYOUT__gridDimY, OFFSET__gridDimY);}
    public void gridDimY(int value) {this.ptr.set(LAYOUT__gridDimY, OFFSET__gridDimY, value);}
    public java.lang.foreign.MemorySegment $gridDimY() {return this.ptr.asSlice(OFFSET__gridDimY, LAYOUT__gridDimY);}

    public int gridDimZ() {return this.ptr.get(LAYOUT__gridDimZ, OFFSET__gridDimZ);}
    public void gridDimZ(int value) {this.ptr.set(LAYOUT__gridDimZ, OFFSET__gridDimZ, value);}
    public java.lang.foreign.MemorySegment $gridDimZ() {return this.ptr.asSlice(OFFSET__gridDimZ, LAYOUT__gridDimZ);}

    public int blockDimX() {return this.ptr.get(LAYOUT__blockDimX, OFFSET__blockDimX);}
    public void blockDimX(int value) {this.ptr.set(LAYOUT__blockDimX, OFFSET__blockDimX, value);}
    public java.lang.foreign.MemorySegment $blockDimX() {return this.ptr.asSlice(OFFSET__blockDimX, LAYOUT__blockDimX);}

    public int blockDimY() {return this.ptr.get(LAYOUT__blockDimY, OFFSET__blockDimY);}
    public void blockDimY(int value) {this.ptr.set(LAYOUT__blockDimY, OFFSET__blockDimY, value);}
    public java.lang.foreign.MemorySegment $blockDimY() {return this.ptr.asSlice(OFFSET__blockDimY, LAYOUT__blockDimY);}

    public int blockDimZ() {return this.ptr.get(LAYOUT__blockDimZ, OFFSET__blockDimZ);}
    public void blockDimZ(int value) {this.ptr.set(LAYOUT__blockDimZ, OFFSET__blockDimZ, value);}
    public java.lang.foreign.MemorySegment $blockDimZ() {return this.ptr.asSlice(OFFSET__blockDimZ, LAYOUT__blockDimZ);}

    public int sharedMemBytes() {return this.ptr.get(LAYOUT__sharedMemBytes, OFFSET__sharedMemBytes);}
    public void sharedMemBytes(int value) {this.ptr.set(LAYOUT__sharedMemBytes, OFFSET__sharedMemBytes, value);}
    public java.lang.foreign.MemorySegment $sharedMemBytes() {return this.ptr.asSlice(OFFSET__sharedMemBytes, LAYOUT__sharedMemBytes);}

    public long paramCount() {return this.ptr.get(LAYOUT__paramCount, OFFSET__paramCount);}
    public void paramCount(long value) {this.ptr.set(LAYOUT__paramCount, OFFSET__paramCount, value);}
    public java.lang.foreign.MemorySegment $paramCount() {return this.ptr.asSlice(OFFSET__paramCount, LAYOUT__paramCount);}

    public java.lang.foreign.MemorySegment pParams() {return this.ptr.get(LAYOUT__pParams, OFFSET__pParams);}
    public void pParams(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pParams, OFFSET__pParams, value);}
    public java.lang.foreign.MemorySegment $pParams() {return this.ptr.asSlice(OFFSET__pParams, LAYOUT__pParams);}

    public long extraCount() {return this.ptr.get(LAYOUT__extraCount, OFFSET__extraCount);}
    public void extraCount(long value) {this.ptr.set(LAYOUT__extraCount, OFFSET__extraCount, value);}
    public java.lang.foreign.MemorySegment $extraCount() {return this.ptr.asSlice(OFFSET__extraCount, LAYOUT__extraCount);}

    public java.lang.foreign.MemorySegment pExtras() {return this.ptr.get(LAYOUT__pExtras, OFFSET__pExtras);}
    public void pExtras(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pExtras, OFFSET__pExtras, value);}
    public java.lang.foreign.MemorySegment $pExtras() {return this.ptr.asSlice(OFFSET__pExtras, LAYOUT__pExtras);}
}
