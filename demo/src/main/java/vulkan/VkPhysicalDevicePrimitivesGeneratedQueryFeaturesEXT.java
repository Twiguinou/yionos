package vulkan;

public record VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__primitivesGeneratedQuery = java.lang.foreign.ValueLayout.JAVA_INT.withName("primitivesGeneratedQuery");
    public static final long OFFSET__primitivesGeneratedQuery = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__primitivesGeneratedQueryWithRasterizerDiscard = java.lang.foreign.ValueLayout.JAVA_INT.withName("primitivesGeneratedQueryWithRasterizerDiscard");
    public static final long OFFSET__primitivesGeneratedQueryWithRasterizerDiscard = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__primitivesGeneratedQueryWithNonZeroStreams = java.lang.foreign.ValueLayout.JAVA_INT.withName("primitivesGeneratedQueryWithNonZeroStreams");
    public static final long OFFSET__primitivesGeneratedQueryWithNonZeroStreams = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__primitivesGeneratedQuery,
            LAYOUT__primitivesGeneratedQueryWithRasterizerDiscard,
            LAYOUT__primitivesGeneratedQueryWithNonZeroStreams,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT");

    public VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int primitivesGeneratedQuery() {return this.ptr.get(LAYOUT__primitivesGeneratedQuery, OFFSET__primitivesGeneratedQuery);}
    public void primitivesGeneratedQuery(int value) {this.ptr.set(LAYOUT__primitivesGeneratedQuery, OFFSET__primitivesGeneratedQuery, value);}
    public java.lang.foreign.MemorySegment $primitivesGeneratedQuery() {return this.ptr.asSlice(OFFSET__primitivesGeneratedQuery, LAYOUT__primitivesGeneratedQuery);}

    public int primitivesGeneratedQueryWithRasterizerDiscard() {return this.ptr.get(LAYOUT__primitivesGeneratedQueryWithRasterizerDiscard, OFFSET__primitivesGeneratedQueryWithRasterizerDiscard);}
    public void primitivesGeneratedQueryWithRasterizerDiscard(int value) {this.ptr.set(LAYOUT__primitivesGeneratedQueryWithRasterizerDiscard, OFFSET__primitivesGeneratedQueryWithRasterizerDiscard, value);}
    public java.lang.foreign.MemorySegment $primitivesGeneratedQueryWithRasterizerDiscard() {return this.ptr.asSlice(OFFSET__primitivesGeneratedQueryWithRasterizerDiscard, LAYOUT__primitivesGeneratedQueryWithRasterizerDiscard);}

    public int primitivesGeneratedQueryWithNonZeroStreams() {return this.ptr.get(LAYOUT__primitivesGeneratedQueryWithNonZeroStreams, OFFSET__primitivesGeneratedQueryWithNonZeroStreams);}
    public void primitivesGeneratedQueryWithNonZeroStreams(int value) {this.ptr.set(LAYOUT__primitivesGeneratedQueryWithNonZeroStreams, OFFSET__primitivesGeneratedQueryWithNonZeroStreams, value);}
    public java.lang.foreign.MemorySegment $primitivesGeneratedQueryWithNonZeroStreams() {return this.ptr.asSlice(OFFSET__primitivesGeneratedQueryWithNonZeroStreams, LAYOUT__primitivesGeneratedQueryWithNonZeroStreams);}
}
