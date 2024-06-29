package vulkan;

public record VkPhysicalDevice16BitStorageFeatures(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__storageBuffer16BitAccess = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__storageBuffer16BitAccess = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__uniformAndStorageBuffer16BitAccess = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__uniformAndStorageBuffer16BitAccess = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__storagePushConstant16 = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__storagePushConstant16 = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__storageInputOutput16 = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__storageInputOutput16 = 28;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__storageBuffer16BitAccess,
            LAYOUT__uniformAndStorageBuffer16BitAccess,
            LAYOUT__storagePushConstant16,
            LAYOUT__storageInputOutput16
    ).withByteAlignment(8).withName("VkPhysicalDevice16BitStorageFeatures");

    public VkPhysicalDevice16BitStorageFeatures(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDevice16BitStorageFeatures getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDevice16BitStorageFeatures(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDevice16BitStorageFeatures value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int storageBuffer16BitAccess() {return this.ptr.get(LAYOUT__storageBuffer16BitAccess, OFFSET__storageBuffer16BitAccess);}
    public void storageBuffer16BitAccess(int value) {this.ptr.set(LAYOUT__storageBuffer16BitAccess, OFFSET__storageBuffer16BitAccess, value);}
    public java.lang.foreign.MemorySegment $storageBuffer16BitAccess() {return this.ptr.asSlice(OFFSET__storageBuffer16BitAccess, LAYOUT__storageBuffer16BitAccess);}

    public int uniformAndStorageBuffer16BitAccess() {return this.ptr.get(LAYOUT__uniformAndStorageBuffer16BitAccess, OFFSET__uniformAndStorageBuffer16BitAccess);}
    public void uniformAndStorageBuffer16BitAccess(int value) {this.ptr.set(LAYOUT__uniformAndStorageBuffer16BitAccess, OFFSET__uniformAndStorageBuffer16BitAccess, value);}
    public java.lang.foreign.MemorySegment $uniformAndStorageBuffer16BitAccess() {return this.ptr.asSlice(OFFSET__uniformAndStorageBuffer16BitAccess, LAYOUT__uniformAndStorageBuffer16BitAccess);}

    public int storagePushConstant16() {return this.ptr.get(LAYOUT__storagePushConstant16, OFFSET__storagePushConstant16);}
    public void storagePushConstant16(int value) {this.ptr.set(LAYOUT__storagePushConstant16, OFFSET__storagePushConstant16, value);}
    public java.lang.foreign.MemorySegment $storagePushConstant16() {return this.ptr.asSlice(OFFSET__storagePushConstant16, LAYOUT__storagePushConstant16);}

    public int storageInputOutput16() {return this.ptr.get(LAYOUT__storageInputOutput16, OFFSET__storageInputOutput16);}
    public void storageInputOutput16(int value) {this.ptr.set(LAYOUT__storageInputOutput16, OFFSET__storageInputOutput16, value);}
    public java.lang.foreign.MemorySegment $storageInputOutput16() {return this.ptr.asSlice(OFFSET__storageInputOutput16, LAYOUT__storageInputOutput16);}
}
