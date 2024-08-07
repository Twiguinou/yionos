package vulkan;

public record VkCooperativeMatrixPropertiesNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__MSize = java.lang.foreign.ValueLayout.JAVA_INT.withName("MSize");
    public static final long OFFSET__MSize = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__NSize = java.lang.foreign.ValueLayout.JAVA_INT.withName("NSize");
    public static final long OFFSET__NSize = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__KSize = java.lang.foreign.ValueLayout.JAVA_INT.withName("KSize");
    public static final long OFFSET__KSize = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__AType = java.lang.foreign.ValueLayout.JAVA_INT.withName("AType");
    public static final long OFFSET__AType = 28;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__BType = java.lang.foreign.ValueLayout.JAVA_INT.withName("BType");
    public static final long OFFSET__BType = 32;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__CType = java.lang.foreign.ValueLayout.JAVA_INT.withName("CType");
    public static final long OFFSET__CType = 36;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__DType = java.lang.foreign.ValueLayout.JAVA_INT.withName("DType");
    public static final long OFFSET__DType = 40;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__scope = java.lang.foreign.ValueLayout.JAVA_INT.withName("scope");
    public static final long OFFSET__scope = 44;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__MSize,
            LAYOUT__NSize,
            LAYOUT__KSize,
            LAYOUT__AType,
            LAYOUT__BType,
            LAYOUT__CType,
            LAYOUT__DType,
            LAYOUT__scope
    ).withByteAlignment(8).withName("VkCooperativeMatrixPropertiesNV");

    public VkCooperativeMatrixPropertiesNV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkCooperativeMatrixPropertiesNV getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkCooperativeMatrixPropertiesNV(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkCooperativeMatrixPropertiesNV value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int MSize() {return this.ptr.get(LAYOUT__MSize, OFFSET__MSize);}
    public void MSize(int value) {this.ptr.set(LAYOUT__MSize, OFFSET__MSize, value);}
    public java.lang.foreign.MemorySegment $MSize() {return this.ptr.asSlice(OFFSET__MSize, LAYOUT__MSize);}

    public int NSize() {return this.ptr.get(LAYOUT__NSize, OFFSET__NSize);}
    public void NSize(int value) {this.ptr.set(LAYOUT__NSize, OFFSET__NSize, value);}
    public java.lang.foreign.MemorySegment $NSize() {return this.ptr.asSlice(OFFSET__NSize, LAYOUT__NSize);}

    public int KSize() {return this.ptr.get(LAYOUT__KSize, OFFSET__KSize);}
    public void KSize(int value) {this.ptr.set(LAYOUT__KSize, OFFSET__KSize, value);}
    public java.lang.foreign.MemorySegment $KSize() {return this.ptr.asSlice(OFFSET__KSize, LAYOUT__KSize);}

    public int AType() {return this.ptr.get(LAYOUT__AType, OFFSET__AType);}
    public void AType(int value) {this.ptr.set(LAYOUT__AType, OFFSET__AType, value);}
    public java.lang.foreign.MemorySegment $AType() {return this.ptr.asSlice(OFFSET__AType, LAYOUT__AType);}

    public int BType() {return this.ptr.get(LAYOUT__BType, OFFSET__BType);}
    public void BType(int value) {this.ptr.set(LAYOUT__BType, OFFSET__BType, value);}
    public java.lang.foreign.MemorySegment $BType() {return this.ptr.asSlice(OFFSET__BType, LAYOUT__BType);}

    public int CType() {return this.ptr.get(LAYOUT__CType, OFFSET__CType);}
    public void CType(int value) {this.ptr.set(LAYOUT__CType, OFFSET__CType, value);}
    public java.lang.foreign.MemorySegment $CType() {return this.ptr.asSlice(OFFSET__CType, LAYOUT__CType);}

    public int DType() {return this.ptr.get(LAYOUT__DType, OFFSET__DType);}
    public void DType(int value) {this.ptr.set(LAYOUT__DType, OFFSET__DType, value);}
    public java.lang.foreign.MemorySegment $DType() {return this.ptr.asSlice(OFFSET__DType, LAYOUT__DType);}

    public int scope() {return this.ptr.get(LAYOUT__scope, OFFSET__scope);}
    public void scope(int value) {this.ptr.set(LAYOUT__scope, OFFSET__scope, value);}
    public java.lang.foreign.MemorySegment $scope() {return this.ptr.asSlice(OFFSET__scope, LAYOUT__scope);}
}
