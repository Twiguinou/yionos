package vulkan;

public record VkPhysicalDeviceVulkan11Features(java.lang.foreign.MemorySegment ptr)
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
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__multiview = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__multiview = 32;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__multiviewGeometryShader = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__multiviewGeometryShader = 36;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__multiviewTessellationShader = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__multiviewTessellationShader = 40;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__variablePointersStorageBuffer = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__variablePointersStorageBuffer = 44;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__variablePointers = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__variablePointers = 48;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__protectedMemory = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__protectedMemory = 52;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__samplerYcbcrConversion = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__samplerYcbcrConversion = 56;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderDrawParameters = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__shaderDrawParameters = 60;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__storageBuffer16BitAccess,
            LAYOUT__uniformAndStorageBuffer16BitAccess,
            LAYOUT__storagePushConstant16,
            LAYOUT__storageInputOutput16,
            LAYOUT__multiview,
            LAYOUT__multiviewGeometryShader,
            LAYOUT__multiviewTessellationShader,
            LAYOUT__variablePointersStorageBuffer,
            LAYOUT__variablePointers,
            LAYOUT__protectedMemory,
            LAYOUT__samplerYcbcrConversion,
            LAYOUT__shaderDrawParameters
    ).withByteAlignment(8).withName("VkPhysicalDeviceVulkan11Features");

    public VkPhysicalDeviceVulkan11Features(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceVulkan11Features getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceVulkan11Features(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceVulkan11Features value)
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

    public int multiview() {return this.ptr.get(LAYOUT__multiview, OFFSET__multiview);}
    public void multiview(int value) {this.ptr.set(LAYOUT__multiview, OFFSET__multiview, value);}
    public java.lang.foreign.MemorySegment $multiview() {return this.ptr.asSlice(OFFSET__multiview, LAYOUT__multiview);}

    public int multiviewGeometryShader() {return this.ptr.get(LAYOUT__multiviewGeometryShader, OFFSET__multiviewGeometryShader);}
    public void multiviewGeometryShader(int value) {this.ptr.set(LAYOUT__multiviewGeometryShader, OFFSET__multiviewGeometryShader, value);}
    public java.lang.foreign.MemorySegment $multiviewGeometryShader() {return this.ptr.asSlice(OFFSET__multiviewGeometryShader, LAYOUT__multiviewGeometryShader);}

    public int multiviewTessellationShader() {return this.ptr.get(LAYOUT__multiviewTessellationShader, OFFSET__multiviewTessellationShader);}
    public void multiviewTessellationShader(int value) {this.ptr.set(LAYOUT__multiviewTessellationShader, OFFSET__multiviewTessellationShader, value);}
    public java.lang.foreign.MemorySegment $multiviewTessellationShader() {return this.ptr.asSlice(OFFSET__multiviewTessellationShader, LAYOUT__multiviewTessellationShader);}

    public int variablePointersStorageBuffer() {return this.ptr.get(LAYOUT__variablePointersStorageBuffer, OFFSET__variablePointersStorageBuffer);}
    public void variablePointersStorageBuffer(int value) {this.ptr.set(LAYOUT__variablePointersStorageBuffer, OFFSET__variablePointersStorageBuffer, value);}
    public java.lang.foreign.MemorySegment $variablePointersStorageBuffer() {return this.ptr.asSlice(OFFSET__variablePointersStorageBuffer, LAYOUT__variablePointersStorageBuffer);}

    public int variablePointers() {return this.ptr.get(LAYOUT__variablePointers, OFFSET__variablePointers);}
    public void variablePointers(int value) {this.ptr.set(LAYOUT__variablePointers, OFFSET__variablePointers, value);}
    public java.lang.foreign.MemorySegment $variablePointers() {return this.ptr.asSlice(OFFSET__variablePointers, LAYOUT__variablePointers);}

    public int protectedMemory() {return this.ptr.get(LAYOUT__protectedMemory, OFFSET__protectedMemory);}
    public void protectedMemory(int value) {this.ptr.set(LAYOUT__protectedMemory, OFFSET__protectedMemory, value);}
    public java.lang.foreign.MemorySegment $protectedMemory() {return this.ptr.asSlice(OFFSET__protectedMemory, LAYOUT__protectedMemory);}

    public int samplerYcbcrConversion() {return this.ptr.get(LAYOUT__samplerYcbcrConversion, OFFSET__samplerYcbcrConversion);}
    public void samplerYcbcrConversion(int value) {this.ptr.set(LAYOUT__samplerYcbcrConversion, OFFSET__samplerYcbcrConversion, value);}
    public java.lang.foreign.MemorySegment $samplerYcbcrConversion() {return this.ptr.asSlice(OFFSET__samplerYcbcrConversion, LAYOUT__samplerYcbcrConversion);}

    public int shaderDrawParameters() {return this.ptr.get(LAYOUT__shaderDrawParameters, OFFSET__shaderDrawParameters);}
    public void shaderDrawParameters(int value) {this.ptr.set(LAYOUT__shaderDrawParameters, OFFSET__shaderDrawParameters, value);}
    public java.lang.foreign.MemorySegment $shaderDrawParameters() {return this.ptr.asSlice(OFFSET__shaderDrawParameters, LAYOUT__shaderDrawParameters);}
}
