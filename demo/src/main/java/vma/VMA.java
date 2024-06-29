package vma;

public final class VMA
{private VMA() {}

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__vmaCreateAllocator;
    public static final java.lang.invoke.MethodHandle MTD__vmaCreateAllocator;
    public static int vmaCreateAllocator(java.lang.foreign.MemorySegment pCreateInfo, java.lang.foreign.MemorySegment pAllocator)
    {
        try {return (int)MTD__vmaCreateAllocator.invokeExact(pCreateInfo, pAllocator);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__vmaDestroyAllocator;
    public static final java.lang.invoke.MethodHandle MTD__vmaDestroyAllocator;
    public static void vmaDestroyAllocator(java.lang.foreign.MemorySegment allocator)
    {
        try {MTD__vmaDestroyAllocator.invokeExact(allocator);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__vmaGetAllocatorInfo;
    public static final java.lang.invoke.MethodHandle MTD__vmaGetAllocatorInfo;
    public static void vmaGetAllocatorInfo(java.lang.foreign.MemorySegment allocator, java.lang.foreign.MemorySegment pAllocatorInfo)
    {
        try {MTD__vmaGetAllocatorInfo.invokeExact(allocator, pAllocatorInfo);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__vmaGetPhysicalDeviceProperties;
    public static final java.lang.invoke.MethodHandle MTD__vmaGetPhysicalDeviceProperties;
    public static void vmaGetPhysicalDeviceProperties(java.lang.foreign.MemorySegment allocator, java.lang.foreign.MemorySegment ppPhysicalDeviceProperties)
    {
        try {MTD__vmaGetPhysicalDeviceProperties.invokeExact(allocator, ppPhysicalDeviceProperties);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__vmaGetMemoryProperties;
    public static final java.lang.invoke.MethodHandle MTD__vmaGetMemoryProperties;
    public static void vmaGetMemoryProperties(java.lang.foreign.MemorySegment allocator, java.lang.foreign.MemorySegment ppPhysicalDeviceMemoryProperties)
    {
        try {MTD__vmaGetMemoryProperties.invokeExact(allocator, ppPhysicalDeviceMemoryProperties);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__vmaGetMemoryTypeProperties;
    public static final java.lang.invoke.MethodHandle MTD__vmaGetMemoryTypeProperties;
    public static void vmaGetMemoryTypeProperties(java.lang.foreign.MemorySegment allocator, int memoryTypeIndex, java.lang.foreign.MemorySegment pFlags)
    {
        try {MTD__vmaGetMemoryTypeProperties.invokeExact(allocator, memoryTypeIndex, pFlags);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__vmaSetCurrentFrameIndex;
    public static final java.lang.invoke.MethodHandle MTD__vmaSetCurrentFrameIndex;
    public static void vmaSetCurrentFrameIndex(java.lang.foreign.MemorySegment allocator, int frameIndex)
    {
        try {MTD__vmaSetCurrentFrameIndex.invokeExact(allocator, frameIndex);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__vmaCalculateStatistics;
    public static final java.lang.invoke.MethodHandle MTD__vmaCalculateStatistics;
    public static void vmaCalculateStatistics(java.lang.foreign.MemorySegment allocator, java.lang.foreign.MemorySegment pStats)
    {
        try {MTD__vmaCalculateStatistics.invokeExact(allocator, pStats);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__vmaGetHeapBudgets;
    public static final java.lang.invoke.MethodHandle MTD__vmaGetHeapBudgets;
    public static void vmaGetHeapBudgets(java.lang.foreign.MemorySegment allocator, java.lang.foreign.MemorySegment pBudgets)
    {
        try {MTD__vmaGetHeapBudgets.invokeExact(allocator, pBudgets);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__vmaFindMemoryTypeIndex;
    public static final java.lang.invoke.MethodHandle MTD__vmaFindMemoryTypeIndex;
    public static int vmaFindMemoryTypeIndex(java.lang.foreign.MemorySegment allocator, int memoryTypeBits, java.lang.foreign.MemorySegment pAllocationCreateInfo, java.lang.foreign.MemorySegment pMemoryTypeIndex)
    {
        try {return (int)MTD__vmaFindMemoryTypeIndex.invokeExact(allocator, memoryTypeBits, pAllocationCreateInfo, pMemoryTypeIndex);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__vmaFindMemoryTypeIndexForBufferInfo;
    public static final java.lang.invoke.MethodHandle MTD__vmaFindMemoryTypeIndexForBufferInfo;
    public static int vmaFindMemoryTypeIndexForBufferInfo(java.lang.foreign.MemorySegment allocator, java.lang.foreign.MemorySegment pBufferCreateInfo, java.lang.foreign.MemorySegment pAllocationCreateInfo, java.lang.foreign.MemorySegment pMemoryTypeIndex)
    {
        try {return (int)MTD__vmaFindMemoryTypeIndexForBufferInfo.invokeExact(allocator, pBufferCreateInfo, pAllocationCreateInfo, pMemoryTypeIndex);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__vmaFindMemoryTypeIndexForImageInfo;
    public static final java.lang.invoke.MethodHandle MTD__vmaFindMemoryTypeIndexForImageInfo;
    public static int vmaFindMemoryTypeIndexForImageInfo(java.lang.foreign.MemorySegment allocator, java.lang.foreign.MemorySegment pImageCreateInfo, java.lang.foreign.MemorySegment pAllocationCreateInfo, java.lang.foreign.MemorySegment pMemoryTypeIndex)
    {
        try {return (int)MTD__vmaFindMemoryTypeIndexForImageInfo.invokeExact(allocator, pImageCreateInfo, pAllocationCreateInfo, pMemoryTypeIndex);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__vmaCreatePool;
    public static final java.lang.invoke.MethodHandle MTD__vmaCreatePool;
    public static int vmaCreatePool(java.lang.foreign.MemorySegment allocator, java.lang.foreign.MemorySegment pCreateInfo, java.lang.foreign.MemorySegment pPool)
    {
        try {return (int)MTD__vmaCreatePool.invokeExact(allocator, pCreateInfo, pPool);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__vmaDestroyPool;
    public static final java.lang.invoke.MethodHandle MTD__vmaDestroyPool;
    public static void vmaDestroyPool(java.lang.foreign.MemorySegment allocator, java.lang.foreign.MemorySegment pool)
    {
        try {MTD__vmaDestroyPool.invokeExact(allocator, pool);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__vmaGetPoolStatistics;
    public static final java.lang.invoke.MethodHandle MTD__vmaGetPoolStatistics;
    public static void vmaGetPoolStatistics(java.lang.foreign.MemorySegment allocator, java.lang.foreign.MemorySegment pool, java.lang.foreign.MemorySegment pPoolStats)
    {
        try {MTD__vmaGetPoolStatistics.invokeExact(allocator, pool, pPoolStats);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__vmaCalculatePoolStatistics;
    public static final java.lang.invoke.MethodHandle MTD__vmaCalculatePoolStatistics;
    public static void vmaCalculatePoolStatistics(java.lang.foreign.MemorySegment allocator, java.lang.foreign.MemorySegment pool, java.lang.foreign.MemorySegment pPoolStats)
    {
        try {MTD__vmaCalculatePoolStatistics.invokeExact(allocator, pool, pPoolStats);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__vmaCheckPoolCorruption;
    public static final java.lang.invoke.MethodHandle MTD__vmaCheckPoolCorruption;
    public static int vmaCheckPoolCorruption(java.lang.foreign.MemorySegment allocator, java.lang.foreign.MemorySegment pool)
    {
        try {return (int)MTD__vmaCheckPoolCorruption.invokeExact(allocator, pool);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__vmaGetPoolName;
    public static final java.lang.invoke.MethodHandle MTD__vmaGetPoolName;
    public static void vmaGetPoolName(java.lang.foreign.MemorySegment allocator, java.lang.foreign.MemorySegment pool, java.lang.foreign.MemorySegment ppName)
    {
        try {MTD__vmaGetPoolName.invokeExact(allocator, pool, ppName);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__vmaSetPoolName;
    public static final java.lang.invoke.MethodHandle MTD__vmaSetPoolName;
    public static void vmaSetPoolName(java.lang.foreign.MemorySegment allocator, java.lang.foreign.MemorySegment pool, java.lang.foreign.MemorySegment pName)
    {
        try {MTD__vmaSetPoolName.invokeExact(allocator, pool, pName);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__vmaAllocateMemory;
    public static final java.lang.invoke.MethodHandle MTD__vmaAllocateMemory;
    public static int vmaAllocateMemory(java.lang.foreign.MemorySegment allocator, java.lang.foreign.MemorySegment pVkMemoryRequirements, java.lang.foreign.MemorySegment pCreateInfo, java.lang.foreign.MemorySegment pAllocation, java.lang.foreign.MemorySegment pAllocationInfo)
    {
        try {return (int)MTD__vmaAllocateMemory.invokeExact(allocator, pVkMemoryRequirements, pCreateInfo, pAllocation, pAllocationInfo);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__vmaAllocateMemoryPages;
    public static final java.lang.invoke.MethodHandle MTD__vmaAllocateMemoryPages;
    public static int vmaAllocateMemoryPages(java.lang.foreign.MemorySegment allocator, java.lang.foreign.MemorySegment pVkMemoryRequirements, java.lang.foreign.MemorySegment pCreateInfo, long allocationCount, java.lang.foreign.MemorySegment pAllocations, java.lang.foreign.MemorySegment pAllocationInfo)
    {
        try {return (int)MTD__vmaAllocateMemoryPages.invokeExact(allocator, pVkMemoryRequirements, pCreateInfo, allocationCount, pAllocations, pAllocationInfo);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__vmaAllocateMemoryForBuffer;
    public static final java.lang.invoke.MethodHandle MTD__vmaAllocateMemoryForBuffer;
    public static int vmaAllocateMemoryForBuffer(java.lang.foreign.MemorySegment allocator, java.lang.foreign.MemorySegment buffer, java.lang.foreign.MemorySegment pCreateInfo, java.lang.foreign.MemorySegment pAllocation, java.lang.foreign.MemorySegment pAllocationInfo)
    {
        try {return (int)MTD__vmaAllocateMemoryForBuffer.invokeExact(allocator, buffer, pCreateInfo, pAllocation, pAllocationInfo);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__vmaAllocateMemoryForImage;
    public static final java.lang.invoke.MethodHandle MTD__vmaAllocateMemoryForImage;
    public static int vmaAllocateMemoryForImage(java.lang.foreign.MemorySegment allocator, java.lang.foreign.MemorySegment image, java.lang.foreign.MemorySegment pCreateInfo, java.lang.foreign.MemorySegment pAllocation, java.lang.foreign.MemorySegment pAllocationInfo)
    {
        try {return (int)MTD__vmaAllocateMemoryForImage.invokeExact(allocator, image, pCreateInfo, pAllocation, pAllocationInfo);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__vmaFreeMemory;
    public static final java.lang.invoke.MethodHandle MTD__vmaFreeMemory;
    public static void vmaFreeMemory(java.lang.foreign.MemorySegment allocator, java.lang.foreign.MemorySegment allocation)
    {
        try {MTD__vmaFreeMemory.invokeExact(allocator, allocation);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__vmaFreeMemoryPages;
    public static final java.lang.invoke.MethodHandle MTD__vmaFreeMemoryPages;
    public static void vmaFreeMemoryPages(java.lang.foreign.MemorySegment allocator, long allocationCount, java.lang.foreign.MemorySegment pAllocations)
    {
        try {MTD__vmaFreeMemoryPages.invokeExact(allocator, allocationCount, pAllocations);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__vmaGetAllocationInfo;
    public static final java.lang.invoke.MethodHandle MTD__vmaGetAllocationInfo;
    public static void vmaGetAllocationInfo(java.lang.foreign.MemorySegment allocator, java.lang.foreign.MemorySegment allocation, java.lang.foreign.MemorySegment pAllocationInfo)
    {
        try {MTD__vmaGetAllocationInfo.invokeExact(allocator, allocation, pAllocationInfo);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__vmaGetAllocationInfo2;
    public static final java.lang.invoke.MethodHandle MTD__vmaGetAllocationInfo2;
    public static void vmaGetAllocationInfo2(java.lang.foreign.MemorySegment allocator, java.lang.foreign.MemorySegment allocation, java.lang.foreign.MemorySegment pAllocationInfo)
    {
        try {MTD__vmaGetAllocationInfo2.invokeExact(allocator, allocation, pAllocationInfo);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__vmaSetAllocationUserData;
    public static final java.lang.invoke.MethodHandle MTD__vmaSetAllocationUserData;
    public static void vmaSetAllocationUserData(java.lang.foreign.MemorySegment allocator, java.lang.foreign.MemorySegment allocation, java.lang.foreign.MemorySegment pUserData)
    {
        try {MTD__vmaSetAllocationUserData.invokeExact(allocator, allocation, pUserData);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__vmaSetAllocationName;
    public static final java.lang.invoke.MethodHandle MTD__vmaSetAllocationName;
    public static void vmaSetAllocationName(java.lang.foreign.MemorySegment allocator, java.lang.foreign.MemorySegment allocation, java.lang.foreign.MemorySegment pName)
    {
        try {MTD__vmaSetAllocationName.invokeExact(allocator, allocation, pName);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__vmaGetAllocationMemoryProperties;
    public static final java.lang.invoke.MethodHandle MTD__vmaGetAllocationMemoryProperties;
    public static void vmaGetAllocationMemoryProperties(java.lang.foreign.MemorySegment allocator, java.lang.foreign.MemorySegment allocation, java.lang.foreign.MemorySegment pFlags)
    {
        try {MTD__vmaGetAllocationMemoryProperties.invokeExact(allocator, allocation, pFlags);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__vmaMapMemory;
    public static final java.lang.invoke.MethodHandle MTD__vmaMapMemory;
    public static int vmaMapMemory(java.lang.foreign.MemorySegment allocator, java.lang.foreign.MemorySegment allocation, java.lang.foreign.MemorySegment ppData)
    {
        try {return (int)MTD__vmaMapMemory.invokeExact(allocator, allocation, ppData);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__vmaUnmapMemory;
    public static final java.lang.invoke.MethodHandle MTD__vmaUnmapMemory;
    public static void vmaUnmapMemory(java.lang.foreign.MemorySegment allocator, java.lang.foreign.MemorySegment allocation)
    {
        try {MTD__vmaUnmapMemory.invokeExact(allocator, allocation);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__vmaFlushAllocation;
    public static final java.lang.invoke.MethodHandle MTD__vmaFlushAllocation;
    public static int vmaFlushAllocation(java.lang.foreign.MemorySegment allocator, java.lang.foreign.MemorySegment allocation, long offset, long size)
    {
        try {return (int)MTD__vmaFlushAllocation.invokeExact(allocator, allocation, offset, size);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__vmaInvalidateAllocation;
    public static final java.lang.invoke.MethodHandle MTD__vmaInvalidateAllocation;
    public static int vmaInvalidateAllocation(java.lang.foreign.MemorySegment allocator, java.lang.foreign.MemorySegment allocation, long offset, long size)
    {
        try {return (int)MTD__vmaInvalidateAllocation.invokeExact(allocator, allocation, offset, size);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__vmaFlushAllocations;
    public static final java.lang.invoke.MethodHandle MTD__vmaFlushAllocations;
    public static int vmaFlushAllocations(java.lang.foreign.MemorySegment allocator, int allocationCount, java.lang.foreign.MemorySegment allocations, java.lang.foreign.MemorySegment offsets, java.lang.foreign.MemorySegment sizes)
    {
        try {return (int)MTD__vmaFlushAllocations.invokeExact(allocator, allocationCount, allocations, offsets, sizes);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__vmaInvalidateAllocations;
    public static final java.lang.invoke.MethodHandle MTD__vmaInvalidateAllocations;
    public static int vmaInvalidateAllocations(java.lang.foreign.MemorySegment allocator, int allocationCount, java.lang.foreign.MemorySegment allocations, java.lang.foreign.MemorySegment offsets, java.lang.foreign.MemorySegment sizes)
    {
        try {return (int)MTD__vmaInvalidateAllocations.invokeExact(allocator, allocationCount, allocations, offsets, sizes);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__vmaCopyMemoryToAllocation;
    public static final java.lang.invoke.MethodHandle MTD__vmaCopyMemoryToAllocation;
    public static int vmaCopyMemoryToAllocation(java.lang.foreign.MemorySegment allocator, java.lang.foreign.MemorySegment pSrcHostPointer, java.lang.foreign.MemorySegment dstAllocation, long dstAllocationLocalOffset, long size)
    {
        try {return (int)MTD__vmaCopyMemoryToAllocation.invokeExact(allocator, pSrcHostPointer, dstAllocation, dstAllocationLocalOffset, size);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__vmaCopyAllocationToMemory;
    public static final java.lang.invoke.MethodHandle MTD__vmaCopyAllocationToMemory;
    public static int vmaCopyAllocationToMemory(java.lang.foreign.MemorySegment allocator, java.lang.foreign.MemorySegment srcAllocation, long srcAllocationLocalOffset, java.lang.foreign.MemorySegment pDstHostPointer, long size)
    {
        try {return (int)MTD__vmaCopyAllocationToMemory.invokeExact(allocator, srcAllocation, srcAllocationLocalOffset, pDstHostPointer, size);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__vmaCheckCorruption;
    public static final java.lang.invoke.MethodHandle MTD__vmaCheckCorruption;
    public static int vmaCheckCorruption(java.lang.foreign.MemorySegment allocator, int memoryTypeBits)
    {
        try {return (int)MTD__vmaCheckCorruption.invokeExact(allocator, memoryTypeBits);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__vmaBeginDefragmentation;
    public static final java.lang.invoke.MethodHandle MTD__vmaBeginDefragmentation;
    public static int vmaBeginDefragmentation(java.lang.foreign.MemorySegment allocator, java.lang.foreign.MemorySegment pInfo, java.lang.foreign.MemorySegment pContext)
    {
        try {return (int)MTD__vmaBeginDefragmentation.invokeExact(allocator, pInfo, pContext);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__vmaEndDefragmentation;
    public static final java.lang.invoke.MethodHandle MTD__vmaEndDefragmentation;
    public static void vmaEndDefragmentation(java.lang.foreign.MemorySegment allocator, java.lang.foreign.MemorySegment context, java.lang.foreign.MemorySegment pStats)
    {
        try {MTD__vmaEndDefragmentation.invokeExact(allocator, context, pStats);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__vmaBeginDefragmentationPass;
    public static final java.lang.invoke.MethodHandle MTD__vmaBeginDefragmentationPass;
    public static int vmaBeginDefragmentationPass(java.lang.foreign.MemorySegment allocator, java.lang.foreign.MemorySegment context, java.lang.foreign.MemorySegment pPassInfo)
    {
        try {return (int)MTD__vmaBeginDefragmentationPass.invokeExact(allocator, context, pPassInfo);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__vmaEndDefragmentationPass;
    public static final java.lang.invoke.MethodHandle MTD__vmaEndDefragmentationPass;
    public static int vmaEndDefragmentationPass(java.lang.foreign.MemorySegment allocator, java.lang.foreign.MemorySegment context, java.lang.foreign.MemorySegment pPassInfo)
    {
        try {return (int)MTD__vmaEndDefragmentationPass.invokeExact(allocator, context, pPassInfo);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__vmaBindBufferMemory;
    public static final java.lang.invoke.MethodHandle MTD__vmaBindBufferMemory;
    public static int vmaBindBufferMemory(java.lang.foreign.MemorySegment allocator, java.lang.foreign.MemorySegment allocation, java.lang.foreign.MemorySegment buffer)
    {
        try {return (int)MTD__vmaBindBufferMemory.invokeExact(allocator, allocation, buffer);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__vmaBindBufferMemory2;
    public static final java.lang.invoke.MethodHandle MTD__vmaBindBufferMemory2;
    public static int vmaBindBufferMemory2(java.lang.foreign.MemorySegment allocator, java.lang.foreign.MemorySegment allocation, long allocationLocalOffset, java.lang.foreign.MemorySegment buffer, java.lang.foreign.MemorySegment pNext)
    {
        try {return (int)MTD__vmaBindBufferMemory2.invokeExact(allocator, allocation, allocationLocalOffset, buffer, pNext);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__vmaBindImageMemory;
    public static final java.lang.invoke.MethodHandle MTD__vmaBindImageMemory;
    public static int vmaBindImageMemory(java.lang.foreign.MemorySegment allocator, java.lang.foreign.MemorySegment allocation, java.lang.foreign.MemorySegment image)
    {
        try {return (int)MTD__vmaBindImageMemory.invokeExact(allocator, allocation, image);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__vmaBindImageMemory2;
    public static final java.lang.invoke.MethodHandle MTD__vmaBindImageMemory2;
    public static int vmaBindImageMemory2(java.lang.foreign.MemorySegment allocator, java.lang.foreign.MemorySegment allocation, long allocationLocalOffset, java.lang.foreign.MemorySegment image, java.lang.foreign.MemorySegment pNext)
    {
        try {return (int)MTD__vmaBindImageMemory2.invokeExact(allocator, allocation, allocationLocalOffset, image, pNext);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__vmaCreateBuffer;
    public static final java.lang.invoke.MethodHandle MTD__vmaCreateBuffer;
    public static int vmaCreateBuffer(java.lang.foreign.MemorySegment allocator, java.lang.foreign.MemorySegment pBufferCreateInfo, java.lang.foreign.MemorySegment pAllocationCreateInfo, java.lang.foreign.MemorySegment pBuffer, java.lang.foreign.MemorySegment pAllocation, java.lang.foreign.MemorySegment pAllocationInfo)
    {
        try {return (int)MTD__vmaCreateBuffer.invokeExact(allocator, pBufferCreateInfo, pAllocationCreateInfo, pBuffer, pAllocation, pAllocationInfo);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__vmaCreateBufferWithAlignment;
    public static final java.lang.invoke.MethodHandle MTD__vmaCreateBufferWithAlignment;
    public static int vmaCreateBufferWithAlignment(java.lang.foreign.MemorySegment allocator, java.lang.foreign.MemorySegment pBufferCreateInfo, java.lang.foreign.MemorySegment pAllocationCreateInfo, long minAlignment, java.lang.foreign.MemorySegment pBuffer, java.lang.foreign.MemorySegment pAllocation, java.lang.foreign.MemorySegment pAllocationInfo)
    {
        try {return (int)MTD__vmaCreateBufferWithAlignment.invokeExact(allocator, pBufferCreateInfo, pAllocationCreateInfo, minAlignment, pBuffer, pAllocation, pAllocationInfo);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__vmaCreateAliasingBuffer;
    public static final java.lang.invoke.MethodHandle MTD__vmaCreateAliasingBuffer;
    public static int vmaCreateAliasingBuffer(java.lang.foreign.MemorySegment allocator, java.lang.foreign.MemorySegment allocation, java.lang.foreign.MemorySegment pBufferCreateInfo, java.lang.foreign.MemorySegment pBuffer)
    {
        try {return (int)MTD__vmaCreateAliasingBuffer.invokeExact(allocator, allocation, pBufferCreateInfo, pBuffer);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__vmaCreateAliasingBuffer2;
    public static final java.lang.invoke.MethodHandle MTD__vmaCreateAliasingBuffer2;
    public static int vmaCreateAliasingBuffer2(java.lang.foreign.MemorySegment allocator, java.lang.foreign.MemorySegment allocation, long allocationLocalOffset, java.lang.foreign.MemorySegment pBufferCreateInfo, java.lang.foreign.MemorySegment pBuffer)
    {
        try {return (int)MTD__vmaCreateAliasingBuffer2.invokeExact(allocator, allocation, allocationLocalOffset, pBufferCreateInfo, pBuffer);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__vmaDestroyBuffer;
    public static final java.lang.invoke.MethodHandle MTD__vmaDestroyBuffer;
    public static void vmaDestroyBuffer(java.lang.foreign.MemorySegment allocator, java.lang.foreign.MemorySegment buffer, java.lang.foreign.MemorySegment allocation)
    {
        try {MTD__vmaDestroyBuffer.invokeExact(allocator, buffer, allocation);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__vmaCreateImage;
    public static final java.lang.invoke.MethodHandle MTD__vmaCreateImage;
    public static int vmaCreateImage(java.lang.foreign.MemorySegment allocator, java.lang.foreign.MemorySegment pImageCreateInfo, java.lang.foreign.MemorySegment pAllocationCreateInfo, java.lang.foreign.MemorySegment pImage, java.lang.foreign.MemorySegment pAllocation, java.lang.foreign.MemorySegment pAllocationInfo)
    {
        try {return (int)MTD__vmaCreateImage.invokeExact(allocator, pImageCreateInfo, pAllocationCreateInfo, pImage, pAllocation, pAllocationInfo);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__vmaCreateAliasingImage;
    public static final java.lang.invoke.MethodHandle MTD__vmaCreateAliasingImage;
    public static int vmaCreateAliasingImage(java.lang.foreign.MemorySegment allocator, java.lang.foreign.MemorySegment allocation, java.lang.foreign.MemorySegment pImageCreateInfo, java.lang.foreign.MemorySegment pImage)
    {
        try {return (int)MTD__vmaCreateAliasingImage.invokeExact(allocator, allocation, pImageCreateInfo, pImage);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__vmaCreateAliasingImage2;
    public static final java.lang.invoke.MethodHandle MTD__vmaCreateAliasingImage2;
    public static int vmaCreateAliasingImage2(java.lang.foreign.MemorySegment allocator, java.lang.foreign.MemorySegment allocation, long allocationLocalOffset, java.lang.foreign.MemorySegment pImageCreateInfo, java.lang.foreign.MemorySegment pImage)
    {
        try {return (int)MTD__vmaCreateAliasingImage2.invokeExact(allocator, allocation, allocationLocalOffset, pImageCreateInfo, pImage);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__vmaDestroyImage;
    public static final java.lang.invoke.MethodHandle MTD__vmaDestroyImage;
    public static void vmaDestroyImage(java.lang.foreign.MemorySegment allocator, java.lang.foreign.MemorySegment image, java.lang.foreign.MemorySegment allocation)
    {
        try {MTD__vmaDestroyImage.invokeExact(allocator, image, allocation);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__vmaCreateVirtualBlock;
    public static final java.lang.invoke.MethodHandle MTD__vmaCreateVirtualBlock;
    public static int vmaCreateVirtualBlock(java.lang.foreign.MemorySegment pCreateInfo, java.lang.foreign.MemorySegment pVirtualBlock)
    {
        try {return (int)MTD__vmaCreateVirtualBlock.invokeExact(pCreateInfo, pVirtualBlock);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__vmaDestroyVirtualBlock;
    public static final java.lang.invoke.MethodHandle MTD__vmaDestroyVirtualBlock;
    public static void vmaDestroyVirtualBlock(java.lang.foreign.MemorySegment virtualBlock)
    {
        try {MTD__vmaDestroyVirtualBlock.invokeExact(virtualBlock);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__vmaIsVirtualBlockEmpty;
    public static final java.lang.invoke.MethodHandle MTD__vmaIsVirtualBlockEmpty;
    public static int vmaIsVirtualBlockEmpty(java.lang.foreign.MemorySegment virtualBlock)
    {
        try {return (int)MTD__vmaIsVirtualBlockEmpty.invokeExact(virtualBlock);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__vmaGetVirtualAllocationInfo;
    public static final java.lang.invoke.MethodHandle MTD__vmaGetVirtualAllocationInfo;
    public static void vmaGetVirtualAllocationInfo(java.lang.foreign.MemorySegment virtualBlock, java.lang.foreign.MemorySegment allocation, java.lang.foreign.MemorySegment pVirtualAllocInfo)
    {
        try {MTD__vmaGetVirtualAllocationInfo.invokeExact(virtualBlock, allocation, pVirtualAllocInfo);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__vmaVirtualAllocate;
    public static final java.lang.invoke.MethodHandle MTD__vmaVirtualAllocate;
    public static int vmaVirtualAllocate(java.lang.foreign.MemorySegment virtualBlock, java.lang.foreign.MemorySegment pCreateInfo, java.lang.foreign.MemorySegment pAllocation, java.lang.foreign.MemorySegment pOffset)
    {
        try {return (int)MTD__vmaVirtualAllocate.invokeExact(virtualBlock, pCreateInfo, pAllocation, pOffset);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__vmaVirtualFree;
    public static final java.lang.invoke.MethodHandle MTD__vmaVirtualFree;
    public static void vmaVirtualFree(java.lang.foreign.MemorySegment virtualBlock, java.lang.foreign.MemorySegment allocation)
    {
        try {MTD__vmaVirtualFree.invokeExact(virtualBlock, allocation);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__vmaClearVirtualBlock;
    public static final java.lang.invoke.MethodHandle MTD__vmaClearVirtualBlock;
    public static void vmaClearVirtualBlock(java.lang.foreign.MemorySegment virtualBlock)
    {
        try {MTD__vmaClearVirtualBlock.invokeExact(virtualBlock);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__vmaSetVirtualAllocationUserData;
    public static final java.lang.invoke.MethodHandle MTD__vmaSetVirtualAllocationUserData;
    public static void vmaSetVirtualAllocationUserData(java.lang.foreign.MemorySegment virtualBlock, java.lang.foreign.MemorySegment allocation, java.lang.foreign.MemorySegment pUserData)
    {
        try {MTD__vmaSetVirtualAllocationUserData.invokeExact(virtualBlock, allocation, pUserData);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__vmaGetVirtualBlockStatistics;
    public static final java.lang.invoke.MethodHandle MTD__vmaGetVirtualBlockStatistics;
    public static void vmaGetVirtualBlockStatistics(java.lang.foreign.MemorySegment virtualBlock, java.lang.foreign.MemorySegment pStats)
    {
        try {MTD__vmaGetVirtualBlockStatistics.invokeExact(virtualBlock, pStats);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__vmaCalculateVirtualBlockStatistics;
    public static final java.lang.invoke.MethodHandle MTD__vmaCalculateVirtualBlockStatistics;
    public static void vmaCalculateVirtualBlockStatistics(java.lang.foreign.MemorySegment virtualBlock, java.lang.foreign.MemorySegment pStats)
    {
        try {MTD__vmaCalculateVirtualBlockStatistics.invokeExact(virtualBlock, pStats);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__vmaBuildVirtualBlockStatsString;
    public static final java.lang.invoke.MethodHandle MTD__vmaBuildVirtualBlockStatsString;
    public static void vmaBuildVirtualBlockStatsString(java.lang.foreign.MemorySegment virtualBlock, java.lang.foreign.MemorySegment ppStatsString, int detailedMap)
    {
        try {MTD__vmaBuildVirtualBlockStatsString.invokeExact(virtualBlock, ppStatsString, detailedMap);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__vmaFreeVirtualBlockStatsString;
    public static final java.lang.invoke.MethodHandle MTD__vmaFreeVirtualBlockStatsString;
    public static void vmaFreeVirtualBlockStatsString(java.lang.foreign.MemorySegment virtualBlock, java.lang.foreign.MemorySegment pStatsString)
    {
        try {MTD__vmaFreeVirtualBlockStatsString.invokeExact(virtualBlock, pStatsString);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__vmaBuildStatsString;
    public static final java.lang.invoke.MethodHandle MTD__vmaBuildStatsString;
    public static void vmaBuildStatsString(java.lang.foreign.MemorySegment allocator, java.lang.foreign.MemorySegment ppStatsString, int detailedMap)
    {
        try {MTD__vmaBuildStatsString.invokeExact(allocator, ppStatsString, detailedMap);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__vmaFreeStatsString;
    public static final java.lang.invoke.MethodHandle MTD__vmaFreeStatsString;
    public static void vmaFreeStatsString(java.lang.foreign.MemorySegment allocator, java.lang.foreign.MemorySegment pStatsString)
    {
        try {MTD__vmaFreeStatsString.invokeExact(allocator, pStatsString);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    static
    {
        java.lang.foreign.SymbolLookup lookup = name -> java.lang.foreign.SymbolLookup.loaderLookup().find(name).or(() -> jpgen.NativeTypes.SYSTEM_LINKER.defaultLookup().find(name));

        MTD_ADDRESS__vmaCreateAllocator = lookup.find("vmaCreateAllocator").orElseThrow();
        MTD__vmaCreateAllocator = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__vmaCreateAllocator, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__vmaDestroyAllocator = lookup.find("vmaDestroyAllocator").orElseThrow();
        MTD__vmaDestroyAllocator = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__vmaDestroyAllocator, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__vmaGetAllocatorInfo = lookup.find("vmaGetAllocatorInfo").orElseThrow();
        MTD__vmaGetAllocatorInfo = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__vmaGetAllocatorInfo, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__vmaGetPhysicalDeviceProperties = lookup.find("vmaGetPhysicalDeviceProperties").orElseThrow();
        MTD__vmaGetPhysicalDeviceProperties = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__vmaGetPhysicalDeviceProperties, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__vmaGetMemoryProperties = lookup.find("vmaGetMemoryProperties").orElseThrow();
        MTD__vmaGetMemoryProperties = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__vmaGetMemoryProperties, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__vmaGetMemoryTypeProperties = lookup.find("vmaGetMemoryTypeProperties").orElseThrow();
        MTD__vmaGetMemoryTypeProperties = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__vmaGetMemoryTypeProperties, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__vmaSetCurrentFrameIndex = lookup.find("vmaSetCurrentFrameIndex").orElseThrow();
        MTD__vmaSetCurrentFrameIndex = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__vmaSetCurrentFrameIndex, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__vmaCalculateStatistics = lookup.find("vmaCalculateStatistics").orElseThrow();
        MTD__vmaCalculateStatistics = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__vmaCalculateStatistics, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__vmaGetHeapBudgets = lookup.find("vmaGetHeapBudgets").orElseThrow();
        MTD__vmaGetHeapBudgets = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__vmaGetHeapBudgets, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__vmaFindMemoryTypeIndex = lookup.find("vmaFindMemoryTypeIndex").orElseThrow();
        MTD__vmaFindMemoryTypeIndex = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__vmaFindMemoryTypeIndex, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__vmaFindMemoryTypeIndexForBufferInfo = lookup.find("vmaFindMemoryTypeIndexForBufferInfo").orElseThrow();
        MTD__vmaFindMemoryTypeIndexForBufferInfo = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__vmaFindMemoryTypeIndexForBufferInfo, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__vmaFindMemoryTypeIndexForImageInfo = lookup.find("vmaFindMemoryTypeIndexForImageInfo").orElseThrow();
        MTD__vmaFindMemoryTypeIndexForImageInfo = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__vmaFindMemoryTypeIndexForImageInfo, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__vmaCreatePool = lookup.find("vmaCreatePool").orElseThrow();
        MTD__vmaCreatePool = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__vmaCreatePool, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__vmaDestroyPool = lookup.find("vmaDestroyPool").orElseThrow();
        MTD__vmaDestroyPool = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__vmaDestroyPool, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__vmaGetPoolStatistics = lookup.find("vmaGetPoolStatistics").orElseThrow();
        MTD__vmaGetPoolStatistics = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__vmaGetPoolStatistics, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__vmaCalculatePoolStatistics = lookup.find("vmaCalculatePoolStatistics").orElseThrow();
        MTD__vmaCalculatePoolStatistics = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__vmaCalculatePoolStatistics, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__vmaCheckPoolCorruption = lookup.find("vmaCheckPoolCorruption").orElseThrow();
        MTD__vmaCheckPoolCorruption = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__vmaCheckPoolCorruption, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__vmaGetPoolName = lookup.find("vmaGetPoolName").orElseThrow();
        MTD__vmaGetPoolName = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__vmaGetPoolName, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__vmaSetPoolName = lookup.find("vmaSetPoolName").orElseThrow();
        MTD__vmaSetPoolName = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__vmaSetPoolName, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__vmaAllocateMemory = lookup.find("vmaAllocateMemory").orElseThrow();
        MTD__vmaAllocateMemory = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__vmaAllocateMemory, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__vmaAllocateMemoryPages = lookup.find("vmaAllocateMemoryPages").orElseThrow();
        MTD__vmaAllocateMemoryPages = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__vmaAllocateMemoryPages, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_LONG, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__vmaAllocateMemoryForBuffer = lookup.find("vmaAllocateMemoryForBuffer").orElseThrow();
        MTD__vmaAllocateMemoryForBuffer = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__vmaAllocateMemoryForBuffer, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__vmaAllocateMemoryForImage = lookup.find("vmaAllocateMemoryForImage").orElseThrow();
        MTD__vmaAllocateMemoryForImage = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__vmaAllocateMemoryForImage, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__vmaFreeMemory = lookup.find("vmaFreeMemory").orElseThrow();
        MTD__vmaFreeMemory = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__vmaFreeMemory, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__vmaFreeMemoryPages = lookup.find("vmaFreeMemoryPages").orElseThrow();
        MTD__vmaFreeMemoryPages = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__vmaFreeMemoryPages, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_LONG, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__vmaGetAllocationInfo = lookup.find("vmaGetAllocationInfo").orElseThrow();
        MTD__vmaGetAllocationInfo = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__vmaGetAllocationInfo, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__vmaGetAllocationInfo2 = lookup.find("vmaGetAllocationInfo2").orElseThrow();
        MTD__vmaGetAllocationInfo2 = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__vmaGetAllocationInfo2, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__vmaSetAllocationUserData = lookup.find("vmaSetAllocationUserData").orElseThrow();
        MTD__vmaSetAllocationUserData = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__vmaSetAllocationUserData, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__vmaSetAllocationName = lookup.find("vmaSetAllocationName").orElseThrow();
        MTD__vmaSetAllocationName = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__vmaSetAllocationName, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__vmaGetAllocationMemoryProperties = lookup.find("vmaGetAllocationMemoryProperties").orElseThrow();
        MTD__vmaGetAllocationMemoryProperties = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__vmaGetAllocationMemoryProperties, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__vmaMapMemory = lookup.find("vmaMapMemory").orElseThrow();
        MTD__vmaMapMemory = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__vmaMapMemory, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__vmaUnmapMemory = lookup.find("vmaUnmapMemory").orElseThrow();
        MTD__vmaUnmapMemory = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__vmaUnmapMemory, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__vmaFlushAllocation = lookup.find("vmaFlushAllocation").orElseThrow();
        MTD__vmaFlushAllocation = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__vmaFlushAllocation, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.JAVA_LONG));
        MTD_ADDRESS__vmaInvalidateAllocation = lookup.find("vmaInvalidateAllocation").orElseThrow();
        MTD__vmaInvalidateAllocation = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__vmaInvalidateAllocation, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.JAVA_LONG));
        MTD_ADDRESS__vmaFlushAllocations = lookup.find("vmaFlushAllocations").orElseThrow();
        MTD__vmaFlushAllocations = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__vmaFlushAllocations, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__vmaInvalidateAllocations = lookup.find("vmaInvalidateAllocations").orElseThrow();
        MTD__vmaInvalidateAllocations = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__vmaInvalidateAllocations, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__vmaCopyMemoryToAllocation = lookup.find("vmaCopyMemoryToAllocation").orElseThrow();
        MTD__vmaCopyMemoryToAllocation = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__vmaCopyMemoryToAllocation, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.JAVA_LONG));
        MTD_ADDRESS__vmaCopyAllocationToMemory = lookup.find("vmaCopyAllocationToMemory").orElseThrow();
        MTD__vmaCopyAllocationToMemory = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__vmaCopyAllocationToMemory, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_LONG, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_LONG));
        MTD_ADDRESS__vmaCheckCorruption = lookup.find("vmaCheckCorruption").orElseThrow();
        MTD__vmaCheckCorruption = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__vmaCheckCorruption, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__vmaBeginDefragmentation = lookup.find("vmaBeginDefragmentation").orElseThrow();
        MTD__vmaBeginDefragmentation = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__vmaBeginDefragmentation, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__vmaEndDefragmentation = lookup.find("vmaEndDefragmentation").orElseThrow();
        MTD__vmaEndDefragmentation = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__vmaEndDefragmentation, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__vmaBeginDefragmentationPass = lookup.find("vmaBeginDefragmentationPass").orElseThrow();
        MTD__vmaBeginDefragmentationPass = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__vmaBeginDefragmentationPass, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__vmaEndDefragmentationPass = lookup.find("vmaEndDefragmentationPass").orElseThrow();
        MTD__vmaEndDefragmentationPass = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__vmaEndDefragmentationPass, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__vmaBindBufferMemory = lookup.find("vmaBindBufferMemory").orElseThrow();
        MTD__vmaBindBufferMemory = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__vmaBindBufferMemory, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__vmaBindBufferMemory2 = lookup.find("vmaBindBufferMemory2").orElseThrow();
        MTD__vmaBindBufferMemory2 = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__vmaBindBufferMemory2, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_LONG, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__vmaBindImageMemory = lookup.find("vmaBindImageMemory").orElseThrow();
        MTD__vmaBindImageMemory = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__vmaBindImageMemory, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__vmaBindImageMemory2 = lookup.find("vmaBindImageMemory2").orElseThrow();
        MTD__vmaBindImageMemory2 = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__vmaBindImageMemory2, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_LONG, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__vmaCreateBuffer = lookup.find("vmaCreateBuffer").orElseThrow();
        MTD__vmaCreateBuffer = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__vmaCreateBuffer, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__vmaCreateBufferWithAlignment = lookup.find("vmaCreateBufferWithAlignment").orElseThrow();
        MTD__vmaCreateBufferWithAlignment = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__vmaCreateBufferWithAlignment, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_LONG, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__vmaCreateAliasingBuffer = lookup.find("vmaCreateAliasingBuffer").orElseThrow();
        MTD__vmaCreateAliasingBuffer = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__vmaCreateAliasingBuffer, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__vmaCreateAliasingBuffer2 = lookup.find("vmaCreateAliasingBuffer2").orElseThrow();
        MTD__vmaCreateAliasingBuffer2 = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__vmaCreateAliasingBuffer2, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_LONG, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__vmaDestroyBuffer = lookup.find("vmaDestroyBuffer").orElseThrow();
        MTD__vmaDestroyBuffer = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__vmaDestroyBuffer, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__vmaCreateImage = lookup.find("vmaCreateImage").orElseThrow();
        MTD__vmaCreateImage = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__vmaCreateImage, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__vmaCreateAliasingImage = lookup.find("vmaCreateAliasingImage").orElseThrow();
        MTD__vmaCreateAliasingImage = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__vmaCreateAliasingImage, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__vmaCreateAliasingImage2 = lookup.find("vmaCreateAliasingImage2").orElseThrow();
        MTD__vmaCreateAliasingImage2 = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__vmaCreateAliasingImage2, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_LONG, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__vmaDestroyImage = lookup.find("vmaDestroyImage").orElseThrow();
        MTD__vmaDestroyImage = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__vmaDestroyImage, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__vmaCreateVirtualBlock = lookup.find("vmaCreateVirtualBlock").orElseThrow();
        MTD__vmaCreateVirtualBlock = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__vmaCreateVirtualBlock, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__vmaDestroyVirtualBlock = lookup.find("vmaDestroyVirtualBlock").orElseThrow();
        MTD__vmaDestroyVirtualBlock = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__vmaDestroyVirtualBlock, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__vmaIsVirtualBlockEmpty = lookup.find("vmaIsVirtualBlockEmpty").orElseThrow();
        MTD__vmaIsVirtualBlockEmpty = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__vmaIsVirtualBlockEmpty, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__vmaGetVirtualAllocationInfo = lookup.find("vmaGetVirtualAllocationInfo").orElseThrow();
        MTD__vmaGetVirtualAllocationInfo = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__vmaGetVirtualAllocationInfo, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__vmaVirtualAllocate = lookup.find("vmaVirtualAllocate").orElseThrow();
        MTD__vmaVirtualAllocate = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__vmaVirtualAllocate, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__vmaVirtualFree = lookup.find("vmaVirtualFree").orElseThrow();
        MTD__vmaVirtualFree = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__vmaVirtualFree, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__vmaClearVirtualBlock = lookup.find("vmaClearVirtualBlock").orElseThrow();
        MTD__vmaClearVirtualBlock = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__vmaClearVirtualBlock, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__vmaSetVirtualAllocationUserData = lookup.find("vmaSetVirtualAllocationUserData").orElseThrow();
        MTD__vmaSetVirtualAllocationUserData = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__vmaSetVirtualAllocationUserData, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__vmaGetVirtualBlockStatistics = lookup.find("vmaGetVirtualBlockStatistics").orElseThrow();
        MTD__vmaGetVirtualBlockStatistics = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__vmaGetVirtualBlockStatistics, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__vmaCalculateVirtualBlockStatistics = lookup.find("vmaCalculateVirtualBlockStatistics").orElseThrow();
        MTD__vmaCalculateVirtualBlockStatistics = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__vmaCalculateVirtualBlockStatistics, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__vmaBuildVirtualBlockStatsString = lookup.find("vmaBuildVirtualBlockStatsString").orElseThrow();
        MTD__vmaBuildVirtualBlockStatsString = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__vmaBuildVirtualBlockStatsString, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__vmaFreeVirtualBlockStatsString = lookup.find("vmaFreeVirtualBlockStatsString").orElseThrow();
        MTD__vmaFreeVirtualBlockStatsString = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__vmaFreeVirtualBlockStatsString, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__vmaBuildStatsString = lookup.find("vmaBuildStatsString").orElseThrow();
        MTD__vmaBuildStatsString = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__vmaBuildStatsString, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__vmaFreeStatsString = lookup.find("vmaFreeStatsString").orElseThrow();
        MTD__vmaFreeStatsString = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__vmaFreeStatsString, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
    }
}
