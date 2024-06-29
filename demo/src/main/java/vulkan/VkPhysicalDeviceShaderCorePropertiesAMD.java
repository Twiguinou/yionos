package vulkan;

public record VkPhysicalDeviceShaderCorePropertiesAMD(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderEngineCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__shaderEngineCount = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderArraysPerEngineCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__shaderArraysPerEngineCount = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__computeUnitsPerShaderArray = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__computeUnitsPerShaderArray = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__simdPerComputeUnit = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__simdPerComputeUnit = 28;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__wavefrontsPerSimd = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__wavefrontsPerSimd = 32;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__wavefrontSize = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__wavefrontSize = 36;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sgprsPerSimd = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sgprsPerSimd = 40;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__minSgprAllocation = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__minSgprAllocation = 44;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxSgprAllocation = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__maxSgprAllocation = 48;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sgprAllocationGranularity = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sgprAllocationGranularity = 52;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__vgprsPerSimd = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__vgprsPerSimd = 56;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__minVgprAllocation = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__minVgprAllocation = 60;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxVgprAllocation = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__maxVgprAllocation = 64;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__vgprAllocationGranularity = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__vgprAllocationGranularity = 68;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__shaderEngineCount,
            LAYOUT__shaderArraysPerEngineCount,
            LAYOUT__computeUnitsPerShaderArray,
            LAYOUT__simdPerComputeUnit,
            LAYOUT__wavefrontsPerSimd,
            LAYOUT__wavefrontSize,
            LAYOUT__sgprsPerSimd,
            LAYOUT__minSgprAllocation,
            LAYOUT__maxSgprAllocation,
            LAYOUT__sgprAllocationGranularity,
            LAYOUT__vgprsPerSimd,
            LAYOUT__minVgprAllocation,
            LAYOUT__maxVgprAllocation,
            LAYOUT__vgprAllocationGranularity
    ).withByteAlignment(8).withName("VkPhysicalDeviceShaderCorePropertiesAMD");

    public VkPhysicalDeviceShaderCorePropertiesAMD(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceShaderCorePropertiesAMD getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceShaderCorePropertiesAMD(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceShaderCorePropertiesAMD value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int shaderEngineCount() {return this.ptr.get(LAYOUT__shaderEngineCount, OFFSET__shaderEngineCount);}
    public void shaderEngineCount(int value) {this.ptr.set(LAYOUT__shaderEngineCount, OFFSET__shaderEngineCount, value);}
    public java.lang.foreign.MemorySegment $shaderEngineCount() {return this.ptr.asSlice(OFFSET__shaderEngineCount, LAYOUT__shaderEngineCount);}

    public int shaderArraysPerEngineCount() {return this.ptr.get(LAYOUT__shaderArraysPerEngineCount, OFFSET__shaderArraysPerEngineCount);}
    public void shaderArraysPerEngineCount(int value) {this.ptr.set(LAYOUT__shaderArraysPerEngineCount, OFFSET__shaderArraysPerEngineCount, value);}
    public java.lang.foreign.MemorySegment $shaderArraysPerEngineCount() {return this.ptr.asSlice(OFFSET__shaderArraysPerEngineCount, LAYOUT__shaderArraysPerEngineCount);}

    public int computeUnitsPerShaderArray() {return this.ptr.get(LAYOUT__computeUnitsPerShaderArray, OFFSET__computeUnitsPerShaderArray);}
    public void computeUnitsPerShaderArray(int value) {this.ptr.set(LAYOUT__computeUnitsPerShaderArray, OFFSET__computeUnitsPerShaderArray, value);}
    public java.lang.foreign.MemorySegment $computeUnitsPerShaderArray() {return this.ptr.asSlice(OFFSET__computeUnitsPerShaderArray, LAYOUT__computeUnitsPerShaderArray);}

    public int simdPerComputeUnit() {return this.ptr.get(LAYOUT__simdPerComputeUnit, OFFSET__simdPerComputeUnit);}
    public void simdPerComputeUnit(int value) {this.ptr.set(LAYOUT__simdPerComputeUnit, OFFSET__simdPerComputeUnit, value);}
    public java.lang.foreign.MemorySegment $simdPerComputeUnit() {return this.ptr.asSlice(OFFSET__simdPerComputeUnit, LAYOUT__simdPerComputeUnit);}

    public int wavefrontsPerSimd() {return this.ptr.get(LAYOUT__wavefrontsPerSimd, OFFSET__wavefrontsPerSimd);}
    public void wavefrontsPerSimd(int value) {this.ptr.set(LAYOUT__wavefrontsPerSimd, OFFSET__wavefrontsPerSimd, value);}
    public java.lang.foreign.MemorySegment $wavefrontsPerSimd() {return this.ptr.asSlice(OFFSET__wavefrontsPerSimd, LAYOUT__wavefrontsPerSimd);}

    public int wavefrontSize() {return this.ptr.get(LAYOUT__wavefrontSize, OFFSET__wavefrontSize);}
    public void wavefrontSize(int value) {this.ptr.set(LAYOUT__wavefrontSize, OFFSET__wavefrontSize, value);}
    public java.lang.foreign.MemorySegment $wavefrontSize() {return this.ptr.asSlice(OFFSET__wavefrontSize, LAYOUT__wavefrontSize);}

    public int sgprsPerSimd() {return this.ptr.get(LAYOUT__sgprsPerSimd, OFFSET__sgprsPerSimd);}
    public void sgprsPerSimd(int value) {this.ptr.set(LAYOUT__sgprsPerSimd, OFFSET__sgprsPerSimd, value);}
    public java.lang.foreign.MemorySegment $sgprsPerSimd() {return this.ptr.asSlice(OFFSET__sgprsPerSimd, LAYOUT__sgprsPerSimd);}

    public int minSgprAllocation() {return this.ptr.get(LAYOUT__minSgprAllocation, OFFSET__minSgprAllocation);}
    public void minSgprAllocation(int value) {this.ptr.set(LAYOUT__minSgprAllocation, OFFSET__minSgprAllocation, value);}
    public java.lang.foreign.MemorySegment $minSgprAllocation() {return this.ptr.asSlice(OFFSET__minSgprAllocation, LAYOUT__minSgprAllocation);}

    public int maxSgprAllocation() {return this.ptr.get(LAYOUT__maxSgprAllocation, OFFSET__maxSgprAllocation);}
    public void maxSgprAllocation(int value) {this.ptr.set(LAYOUT__maxSgprAllocation, OFFSET__maxSgprAllocation, value);}
    public java.lang.foreign.MemorySegment $maxSgprAllocation() {return this.ptr.asSlice(OFFSET__maxSgprAllocation, LAYOUT__maxSgprAllocation);}

    public int sgprAllocationGranularity() {return this.ptr.get(LAYOUT__sgprAllocationGranularity, OFFSET__sgprAllocationGranularity);}
    public void sgprAllocationGranularity(int value) {this.ptr.set(LAYOUT__sgprAllocationGranularity, OFFSET__sgprAllocationGranularity, value);}
    public java.lang.foreign.MemorySegment $sgprAllocationGranularity() {return this.ptr.asSlice(OFFSET__sgprAllocationGranularity, LAYOUT__sgprAllocationGranularity);}

    public int vgprsPerSimd() {return this.ptr.get(LAYOUT__vgprsPerSimd, OFFSET__vgprsPerSimd);}
    public void vgprsPerSimd(int value) {this.ptr.set(LAYOUT__vgprsPerSimd, OFFSET__vgprsPerSimd, value);}
    public java.lang.foreign.MemorySegment $vgprsPerSimd() {return this.ptr.asSlice(OFFSET__vgprsPerSimd, LAYOUT__vgprsPerSimd);}

    public int minVgprAllocation() {return this.ptr.get(LAYOUT__minVgprAllocation, OFFSET__minVgprAllocation);}
    public void minVgprAllocation(int value) {this.ptr.set(LAYOUT__minVgprAllocation, OFFSET__minVgprAllocation, value);}
    public java.lang.foreign.MemorySegment $minVgprAllocation() {return this.ptr.asSlice(OFFSET__minVgprAllocation, LAYOUT__minVgprAllocation);}

    public int maxVgprAllocation() {return this.ptr.get(LAYOUT__maxVgprAllocation, OFFSET__maxVgprAllocation);}
    public void maxVgprAllocation(int value) {this.ptr.set(LAYOUT__maxVgprAllocation, OFFSET__maxVgprAllocation, value);}
    public java.lang.foreign.MemorySegment $maxVgprAllocation() {return this.ptr.asSlice(OFFSET__maxVgprAllocation, LAYOUT__maxVgprAllocation);}

    public int vgprAllocationGranularity() {return this.ptr.get(LAYOUT__vgprAllocationGranularity, OFFSET__vgprAllocationGranularity);}
    public void vgprAllocationGranularity(int value) {this.ptr.set(LAYOUT__vgprAllocationGranularity, OFFSET__vgprAllocationGranularity, value);}
    public java.lang.foreign.MemorySegment $vgprAllocationGranularity() {return this.ptr.asSlice(OFFSET__vgprAllocationGranularity, LAYOUT__vgprAllocationGranularity);}
}
