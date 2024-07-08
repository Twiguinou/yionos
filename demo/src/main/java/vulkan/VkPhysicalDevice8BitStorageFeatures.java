package vulkan;

public record VkPhysicalDevice8BitStorageFeatures(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__storageBuffer8BitAccess = java.lang.foreign.ValueLayout.JAVA_INT.withName("storageBuffer8BitAccess");
    public static final long OFFSET__storageBuffer8BitAccess = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__uniformAndStorageBuffer8BitAccess = java.lang.foreign.ValueLayout.JAVA_INT.withName("uniformAndStorageBuffer8BitAccess");
    public static final long OFFSET__uniformAndStorageBuffer8BitAccess = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__storagePushConstant8 = java.lang.foreign.ValueLayout.JAVA_INT.withName("storagePushConstant8");
    public static final long OFFSET__storagePushConstant8 = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__storageBuffer8BitAccess,
            LAYOUT__uniformAndStorageBuffer8BitAccess,
            LAYOUT__storagePushConstant8,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkPhysicalDevice8BitStorageFeatures");

    public VkPhysicalDevice8BitStorageFeatures(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDevice8BitStorageFeatures getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDevice8BitStorageFeatures(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDevice8BitStorageFeatures value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int storageBuffer8BitAccess() {return this.ptr.get(LAYOUT__storageBuffer8BitAccess, OFFSET__storageBuffer8BitAccess);}
    public void storageBuffer8BitAccess(int value) {this.ptr.set(LAYOUT__storageBuffer8BitAccess, OFFSET__storageBuffer8BitAccess, value);}
    public java.lang.foreign.MemorySegment $storageBuffer8BitAccess() {return this.ptr.asSlice(OFFSET__storageBuffer8BitAccess, LAYOUT__storageBuffer8BitAccess);}

    public int uniformAndStorageBuffer8BitAccess() {return this.ptr.get(LAYOUT__uniformAndStorageBuffer8BitAccess, OFFSET__uniformAndStorageBuffer8BitAccess);}
    public void uniformAndStorageBuffer8BitAccess(int value) {this.ptr.set(LAYOUT__uniformAndStorageBuffer8BitAccess, OFFSET__uniformAndStorageBuffer8BitAccess, value);}
    public java.lang.foreign.MemorySegment $uniformAndStorageBuffer8BitAccess() {return this.ptr.asSlice(OFFSET__uniformAndStorageBuffer8BitAccess, LAYOUT__uniformAndStorageBuffer8BitAccess);}

    public int storagePushConstant8() {return this.ptr.get(LAYOUT__storagePushConstant8, OFFSET__storagePushConstant8);}
    public void storagePushConstant8(int value) {this.ptr.set(LAYOUT__storagePushConstant8, OFFSET__storagePushConstant8, value);}
    public java.lang.foreign.MemorySegment $storagePushConstant8() {return this.ptr.asSlice(OFFSET__storagePushConstant8, LAYOUT__storagePushConstant8);}
}
