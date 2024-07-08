package vulkan;

public record VkApplicationInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.AddressLayout LAYOUT__pApplicationName = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pApplicationName");
    public static final long OFFSET__pApplicationName = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__applicationVersion = java.lang.foreign.ValueLayout.JAVA_INT.withName("applicationVersion");
    public static final long OFFSET__applicationVersion = 24;
    public static final java.lang.foreign.AddressLayout LAYOUT__pEngineName = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pEngineName");
    public static final long OFFSET__pEngineName = 32;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__engineVersion = java.lang.foreign.ValueLayout.JAVA_INT.withName("engineVersion");
    public static final long OFFSET__engineVersion = 40;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__apiVersion = java.lang.foreign.ValueLayout.JAVA_INT.withName("apiVersion");
    public static final long OFFSET__apiVersion = 44;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__pApplicationName,
            LAYOUT__applicationVersion,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pEngineName,
            LAYOUT__engineVersion,
            LAYOUT__apiVersion
    ).withByteAlignment(8).withName("VkApplicationInfo");

    public VkApplicationInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkApplicationInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkApplicationInfo(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkApplicationInfo value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public java.lang.foreign.MemorySegment pApplicationName() {return this.ptr.get(LAYOUT__pApplicationName, OFFSET__pApplicationName);}
    public void pApplicationName(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pApplicationName, OFFSET__pApplicationName, value);}
    public java.lang.foreign.MemorySegment $pApplicationName() {return this.ptr.asSlice(OFFSET__pApplicationName, LAYOUT__pApplicationName);}

    public int applicationVersion() {return this.ptr.get(LAYOUT__applicationVersion, OFFSET__applicationVersion);}
    public void applicationVersion(int value) {this.ptr.set(LAYOUT__applicationVersion, OFFSET__applicationVersion, value);}
    public java.lang.foreign.MemorySegment $applicationVersion() {return this.ptr.asSlice(OFFSET__applicationVersion, LAYOUT__applicationVersion);}

    public java.lang.foreign.MemorySegment pEngineName() {return this.ptr.get(LAYOUT__pEngineName, OFFSET__pEngineName);}
    public void pEngineName(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pEngineName, OFFSET__pEngineName, value);}
    public java.lang.foreign.MemorySegment $pEngineName() {return this.ptr.asSlice(OFFSET__pEngineName, LAYOUT__pEngineName);}

    public int engineVersion() {return this.ptr.get(LAYOUT__engineVersion, OFFSET__engineVersion);}
    public void engineVersion(int value) {this.ptr.set(LAYOUT__engineVersion, OFFSET__engineVersion, value);}
    public java.lang.foreign.MemorySegment $engineVersion() {return this.ptr.asSlice(OFFSET__engineVersion, LAYOUT__engineVersion);}

    public int apiVersion() {return this.ptr.get(LAYOUT__apiVersion, OFFSET__apiVersion);}
    public void apiVersion(int value) {this.ptr.set(LAYOUT__apiVersion, OFFSET__apiVersion, value);}
    public java.lang.foreign.MemorySegment $apiVersion() {return this.ptr.asSlice(OFFSET__apiVersion, LAYOUT__apiVersion);}
}
