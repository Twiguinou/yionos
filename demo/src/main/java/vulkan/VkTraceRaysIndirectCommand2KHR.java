package vulkan;

public record VkTraceRaysIndirectCommand2KHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__raygenShaderRecordAddress = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__raygenShaderRecordAddress = 0;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__raygenShaderRecordSize = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__raygenShaderRecordSize = 8;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__missShaderBindingTableAddress = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__missShaderBindingTableAddress = 16;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__missShaderBindingTableSize = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__missShaderBindingTableSize = 24;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__missShaderBindingTableStride = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__missShaderBindingTableStride = 32;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__hitShaderBindingTableAddress = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__hitShaderBindingTableAddress = 40;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__hitShaderBindingTableSize = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__hitShaderBindingTableSize = 48;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__hitShaderBindingTableStride = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__hitShaderBindingTableStride = 56;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__callableShaderBindingTableAddress = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__callableShaderBindingTableAddress = 64;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__callableShaderBindingTableSize = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__callableShaderBindingTableSize = 72;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__callableShaderBindingTableStride = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__callableShaderBindingTableStride = 80;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__width = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__width = 88;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__height = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__height = 92;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__depth = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__depth = 96;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__raygenShaderRecordAddress,
            LAYOUT__raygenShaderRecordSize,
            LAYOUT__missShaderBindingTableAddress,
            LAYOUT__missShaderBindingTableSize,
            LAYOUT__missShaderBindingTableStride,
            LAYOUT__hitShaderBindingTableAddress,
            LAYOUT__hitShaderBindingTableSize,
            LAYOUT__hitShaderBindingTableStride,
            LAYOUT__callableShaderBindingTableAddress,
            LAYOUT__callableShaderBindingTableSize,
            LAYOUT__callableShaderBindingTableStride,
            LAYOUT__width,
            LAYOUT__height,
            LAYOUT__depth,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkTraceRaysIndirectCommand2KHR");

    public VkTraceRaysIndirectCommand2KHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkTraceRaysIndirectCommand2KHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkTraceRaysIndirectCommand2KHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkTraceRaysIndirectCommand2KHR value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public long raygenShaderRecordAddress() {return this.ptr.get(LAYOUT__raygenShaderRecordAddress, OFFSET__raygenShaderRecordAddress);}
    public void raygenShaderRecordAddress(long value) {this.ptr.set(LAYOUT__raygenShaderRecordAddress, OFFSET__raygenShaderRecordAddress, value);}
    public java.lang.foreign.MemorySegment $raygenShaderRecordAddress() {return this.ptr.asSlice(OFFSET__raygenShaderRecordAddress, LAYOUT__raygenShaderRecordAddress);}

    public long raygenShaderRecordSize() {return this.ptr.get(LAYOUT__raygenShaderRecordSize, OFFSET__raygenShaderRecordSize);}
    public void raygenShaderRecordSize(long value) {this.ptr.set(LAYOUT__raygenShaderRecordSize, OFFSET__raygenShaderRecordSize, value);}
    public java.lang.foreign.MemorySegment $raygenShaderRecordSize() {return this.ptr.asSlice(OFFSET__raygenShaderRecordSize, LAYOUT__raygenShaderRecordSize);}

    public long missShaderBindingTableAddress() {return this.ptr.get(LAYOUT__missShaderBindingTableAddress, OFFSET__missShaderBindingTableAddress);}
    public void missShaderBindingTableAddress(long value) {this.ptr.set(LAYOUT__missShaderBindingTableAddress, OFFSET__missShaderBindingTableAddress, value);}
    public java.lang.foreign.MemorySegment $missShaderBindingTableAddress() {return this.ptr.asSlice(OFFSET__missShaderBindingTableAddress, LAYOUT__missShaderBindingTableAddress);}

    public long missShaderBindingTableSize() {return this.ptr.get(LAYOUT__missShaderBindingTableSize, OFFSET__missShaderBindingTableSize);}
    public void missShaderBindingTableSize(long value) {this.ptr.set(LAYOUT__missShaderBindingTableSize, OFFSET__missShaderBindingTableSize, value);}
    public java.lang.foreign.MemorySegment $missShaderBindingTableSize() {return this.ptr.asSlice(OFFSET__missShaderBindingTableSize, LAYOUT__missShaderBindingTableSize);}

    public long missShaderBindingTableStride() {return this.ptr.get(LAYOUT__missShaderBindingTableStride, OFFSET__missShaderBindingTableStride);}
    public void missShaderBindingTableStride(long value) {this.ptr.set(LAYOUT__missShaderBindingTableStride, OFFSET__missShaderBindingTableStride, value);}
    public java.lang.foreign.MemorySegment $missShaderBindingTableStride() {return this.ptr.asSlice(OFFSET__missShaderBindingTableStride, LAYOUT__missShaderBindingTableStride);}

    public long hitShaderBindingTableAddress() {return this.ptr.get(LAYOUT__hitShaderBindingTableAddress, OFFSET__hitShaderBindingTableAddress);}
    public void hitShaderBindingTableAddress(long value) {this.ptr.set(LAYOUT__hitShaderBindingTableAddress, OFFSET__hitShaderBindingTableAddress, value);}
    public java.lang.foreign.MemorySegment $hitShaderBindingTableAddress() {return this.ptr.asSlice(OFFSET__hitShaderBindingTableAddress, LAYOUT__hitShaderBindingTableAddress);}

    public long hitShaderBindingTableSize() {return this.ptr.get(LAYOUT__hitShaderBindingTableSize, OFFSET__hitShaderBindingTableSize);}
    public void hitShaderBindingTableSize(long value) {this.ptr.set(LAYOUT__hitShaderBindingTableSize, OFFSET__hitShaderBindingTableSize, value);}
    public java.lang.foreign.MemorySegment $hitShaderBindingTableSize() {return this.ptr.asSlice(OFFSET__hitShaderBindingTableSize, LAYOUT__hitShaderBindingTableSize);}

    public long hitShaderBindingTableStride() {return this.ptr.get(LAYOUT__hitShaderBindingTableStride, OFFSET__hitShaderBindingTableStride);}
    public void hitShaderBindingTableStride(long value) {this.ptr.set(LAYOUT__hitShaderBindingTableStride, OFFSET__hitShaderBindingTableStride, value);}
    public java.lang.foreign.MemorySegment $hitShaderBindingTableStride() {return this.ptr.asSlice(OFFSET__hitShaderBindingTableStride, LAYOUT__hitShaderBindingTableStride);}

    public long callableShaderBindingTableAddress() {return this.ptr.get(LAYOUT__callableShaderBindingTableAddress, OFFSET__callableShaderBindingTableAddress);}
    public void callableShaderBindingTableAddress(long value) {this.ptr.set(LAYOUT__callableShaderBindingTableAddress, OFFSET__callableShaderBindingTableAddress, value);}
    public java.lang.foreign.MemorySegment $callableShaderBindingTableAddress() {return this.ptr.asSlice(OFFSET__callableShaderBindingTableAddress, LAYOUT__callableShaderBindingTableAddress);}

    public long callableShaderBindingTableSize() {return this.ptr.get(LAYOUT__callableShaderBindingTableSize, OFFSET__callableShaderBindingTableSize);}
    public void callableShaderBindingTableSize(long value) {this.ptr.set(LAYOUT__callableShaderBindingTableSize, OFFSET__callableShaderBindingTableSize, value);}
    public java.lang.foreign.MemorySegment $callableShaderBindingTableSize() {return this.ptr.asSlice(OFFSET__callableShaderBindingTableSize, LAYOUT__callableShaderBindingTableSize);}

    public long callableShaderBindingTableStride() {return this.ptr.get(LAYOUT__callableShaderBindingTableStride, OFFSET__callableShaderBindingTableStride);}
    public void callableShaderBindingTableStride(long value) {this.ptr.set(LAYOUT__callableShaderBindingTableStride, OFFSET__callableShaderBindingTableStride, value);}
    public java.lang.foreign.MemorySegment $callableShaderBindingTableStride() {return this.ptr.asSlice(OFFSET__callableShaderBindingTableStride, LAYOUT__callableShaderBindingTableStride);}

    public int width() {return this.ptr.get(LAYOUT__width, OFFSET__width);}
    public void width(int value) {this.ptr.set(LAYOUT__width, OFFSET__width, value);}
    public java.lang.foreign.MemorySegment $width() {return this.ptr.asSlice(OFFSET__width, LAYOUT__width);}

    public int height() {return this.ptr.get(LAYOUT__height, OFFSET__height);}
    public void height(int value) {this.ptr.set(LAYOUT__height, OFFSET__height, value);}
    public java.lang.foreign.MemorySegment $height() {return this.ptr.asSlice(OFFSET__height, LAYOUT__height);}

    public int depth() {return this.ptr.get(LAYOUT__depth, OFFSET__depth);}
    public void depth(int value) {this.ptr.set(LAYOUT__depth, OFFSET__depth, value);}
    public java.lang.foreign.MemorySegment $depth() {return this.ptr.asSlice(OFFSET__depth, LAYOUT__depth);}
}
