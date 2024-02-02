package vma;

public final class VMA
{private VMA() {}

    public static final java.lang.foreign.Linker gSystemLinker;
    public static final java.lang.foreign.SymbolLookup gLibLookup;

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$vmaCreateAllocator;
    public static final java.lang.invoke.MethodHandle MTD$vmaCreateAllocator;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$vmaDestroyAllocator;
    public static final java.lang.invoke.MethodHandle MTD$vmaDestroyAllocator;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$vmaGetAllocatorInfo;
    public static final java.lang.invoke.MethodHandle MTD$vmaGetAllocatorInfo;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$vmaGetPhysicalDeviceProperties;
    public static final java.lang.invoke.MethodHandle MTD$vmaGetPhysicalDeviceProperties;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$vmaGetMemoryProperties;
    public static final java.lang.invoke.MethodHandle MTD$vmaGetMemoryProperties;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$vmaGetMemoryTypeProperties;
    public static final java.lang.invoke.MethodHandle MTD$vmaGetMemoryTypeProperties;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$vmaSetCurrentFrameIndex;
    public static final java.lang.invoke.MethodHandle MTD$vmaSetCurrentFrameIndex;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$vmaCalculateStatistics;
    public static final java.lang.invoke.MethodHandle MTD$vmaCalculateStatistics;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$vmaGetHeapBudgets;
    public static final java.lang.invoke.MethodHandle MTD$vmaGetHeapBudgets;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$vmaFindMemoryTypeIndex;
    public static final java.lang.invoke.MethodHandle MTD$vmaFindMemoryTypeIndex;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$vmaFindMemoryTypeIndexForBufferInfo;
    public static final java.lang.invoke.MethodHandle MTD$vmaFindMemoryTypeIndexForBufferInfo;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$vmaFindMemoryTypeIndexForImageInfo;
    public static final java.lang.invoke.MethodHandle MTD$vmaFindMemoryTypeIndexForImageInfo;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$vmaCreatePool;
    public static final java.lang.invoke.MethodHandle MTD$vmaCreatePool;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$vmaDestroyPool;
    public static final java.lang.invoke.MethodHandle MTD$vmaDestroyPool;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$vmaGetPoolStatistics;
    public static final java.lang.invoke.MethodHandle MTD$vmaGetPoolStatistics;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$vmaCalculatePoolStatistics;
    public static final java.lang.invoke.MethodHandle MTD$vmaCalculatePoolStatistics;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$vmaCheckPoolCorruption;
    public static final java.lang.invoke.MethodHandle MTD$vmaCheckPoolCorruption;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$vmaGetPoolName;
    public static final java.lang.invoke.MethodHandle MTD$vmaGetPoolName;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$vmaSetPoolName;
    public static final java.lang.invoke.MethodHandle MTD$vmaSetPoolName;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$vmaAllocateMemory;
    public static final java.lang.invoke.MethodHandle MTD$vmaAllocateMemory;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$vmaAllocateMemoryPages;
    public static final java.lang.invoke.MethodHandle MTD$vmaAllocateMemoryPages;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$vmaAllocateMemoryForBuffer;
    public static final java.lang.invoke.MethodHandle MTD$vmaAllocateMemoryForBuffer;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$vmaAllocateMemoryForImage;
    public static final java.lang.invoke.MethodHandle MTD$vmaAllocateMemoryForImage;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$vmaFreeMemory;
    public static final java.lang.invoke.MethodHandle MTD$vmaFreeMemory;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$vmaFreeMemoryPages;
    public static final java.lang.invoke.MethodHandle MTD$vmaFreeMemoryPages;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$vmaGetAllocationInfo;
    public static final java.lang.invoke.MethodHandle MTD$vmaGetAllocationInfo;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$vmaGetAllocationInfo2;
    public static final java.lang.invoke.MethodHandle MTD$vmaGetAllocationInfo2;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$vmaSetAllocationUserData;
    public static final java.lang.invoke.MethodHandle MTD$vmaSetAllocationUserData;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$vmaSetAllocationName;
    public static final java.lang.invoke.MethodHandle MTD$vmaSetAllocationName;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$vmaGetAllocationMemoryProperties;
    public static final java.lang.invoke.MethodHandle MTD$vmaGetAllocationMemoryProperties;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$vmaMapMemory;
    public static final java.lang.invoke.MethodHandle MTD$vmaMapMemory;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$vmaUnmapMemory;
    public static final java.lang.invoke.MethodHandle MTD$vmaUnmapMemory;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$vmaFlushAllocation;
    public static final java.lang.invoke.MethodHandle MTD$vmaFlushAllocation;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$vmaInvalidateAllocation;
    public static final java.lang.invoke.MethodHandle MTD$vmaInvalidateAllocation;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$vmaFlushAllocations;
    public static final java.lang.invoke.MethodHandle MTD$vmaFlushAllocations;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$vmaInvalidateAllocations;
    public static final java.lang.invoke.MethodHandle MTD$vmaInvalidateAllocations;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$vmaCheckCorruption;
    public static final java.lang.invoke.MethodHandle MTD$vmaCheckCorruption;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$vmaBeginDefragmentation;
    public static final java.lang.invoke.MethodHandle MTD$vmaBeginDefragmentation;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$vmaEndDefragmentation;
    public static final java.lang.invoke.MethodHandle MTD$vmaEndDefragmentation;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$vmaBeginDefragmentationPass;
    public static final java.lang.invoke.MethodHandle MTD$vmaBeginDefragmentationPass;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$vmaEndDefragmentationPass;
    public static final java.lang.invoke.MethodHandle MTD$vmaEndDefragmentationPass;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$vmaBindBufferMemory;
    public static final java.lang.invoke.MethodHandle MTD$vmaBindBufferMemory;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$vmaBindBufferMemory2;
    public static final java.lang.invoke.MethodHandle MTD$vmaBindBufferMemory2;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$vmaBindImageMemory;
    public static final java.lang.invoke.MethodHandle MTD$vmaBindImageMemory;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$vmaBindImageMemory2;
    public static final java.lang.invoke.MethodHandle MTD$vmaBindImageMemory2;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$vmaCreateBuffer;
    public static final java.lang.invoke.MethodHandle MTD$vmaCreateBuffer;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$vmaCreateBufferWithAlignment;
    public static final java.lang.invoke.MethodHandle MTD$vmaCreateBufferWithAlignment;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$vmaCreateAliasingBuffer;
    public static final java.lang.invoke.MethodHandle MTD$vmaCreateAliasingBuffer;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$vmaCreateAliasingBuffer2;
    public static final java.lang.invoke.MethodHandle MTD$vmaCreateAliasingBuffer2;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$vmaDestroyBuffer;
    public static final java.lang.invoke.MethodHandle MTD$vmaDestroyBuffer;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$vmaCreateImage;
    public static final java.lang.invoke.MethodHandle MTD$vmaCreateImage;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$vmaCreateAliasingImage;
    public static final java.lang.invoke.MethodHandle MTD$vmaCreateAliasingImage;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$vmaCreateAliasingImage2;
    public static final java.lang.invoke.MethodHandle MTD$vmaCreateAliasingImage2;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$vmaDestroyImage;
    public static final java.lang.invoke.MethodHandle MTD$vmaDestroyImage;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$vmaCreateVirtualBlock;
    public static final java.lang.invoke.MethodHandle MTD$vmaCreateVirtualBlock;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$vmaDestroyVirtualBlock;
    public static final java.lang.invoke.MethodHandle MTD$vmaDestroyVirtualBlock;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$vmaIsVirtualBlockEmpty;
    public static final java.lang.invoke.MethodHandle MTD$vmaIsVirtualBlockEmpty;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$vmaGetVirtualAllocationInfo;
    public static final java.lang.invoke.MethodHandle MTD$vmaGetVirtualAllocationInfo;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$vmaVirtualAllocate;
    public static final java.lang.invoke.MethodHandle MTD$vmaVirtualAllocate;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$vmaVirtualFree;
    public static final java.lang.invoke.MethodHandle MTD$vmaVirtualFree;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$vmaClearVirtualBlock;
    public static final java.lang.invoke.MethodHandle MTD$vmaClearVirtualBlock;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$vmaSetVirtualAllocationUserData;
    public static final java.lang.invoke.MethodHandle MTD$vmaSetVirtualAllocationUserData;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$vmaGetVirtualBlockStatistics;
    public static final java.lang.invoke.MethodHandle MTD$vmaGetVirtualBlockStatistics;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$vmaCalculateVirtualBlockStatistics;
    public static final java.lang.invoke.MethodHandle MTD$vmaCalculateVirtualBlockStatistics;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$vmaBuildVirtualBlockStatsString;
    public static final java.lang.invoke.MethodHandle MTD$vmaBuildVirtualBlockStatsString;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$vmaFreeVirtualBlockStatsString;
    public static final java.lang.invoke.MethodHandle MTD$vmaFreeVirtualBlockStatsString;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$vmaBuildStatsString;
    public static final java.lang.invoke.MethodHandle MTD$vmaBuildStatsString;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$vmaFreeStatsString;
    public static final java.lang.invoke.MethodHandle MTD$vmaFreeStatsString;

    /// Creates #VmaAllocator object.
    public static int vmaCreateAllocator(java.lang.foreign.MemorySegment pCreateInfo, java.lang.foreign.MemorySegment pAllocator)
    {
        try {return (int)MTD$vmaCreateAllocator.invokeExact(pCreateInfo, pAllocator);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /// Destroys allocator object.
    public static void vmaDestroyAllocator(java.lang.foreign.MemorySegment allocator)
    {
        try {MTD$vmaDestroyAllocator.invokeExact(allocator);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /** \brief Returns information about existing #VmaAllocator object - handle to Vulkan device etc.
    
    It might be useful if you want to keep just the #VmaAllocator handle and fetch other required handles to
    `VkPhysicalDevice`, `VkDevice` etc. every time using this function.
    */
    public static void vmaGetAllocatorInfo(java.lang.foreign.MemorySegment allocator, java.lang.foreign.MemorySegment pAllocatorInfo)
    {
        try {MTD$vmaGetAllocatorInfo.invokeExact(allocator, pAllocatorInfo);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
    PhysicalDeviceProperties are fetched from physicalDevice by the allocator.
    You can access it here, without fetching it again on your own.
    */
    public static void vmaGetPhysicalDeviceProperties(java.lang.foreign.MemorySegment allocator, java.lang.foreign.MemorySegment ppPhysicalDeviceProperties)
    {
        try {MTD$vmaGetPhysicalDeviceProperties.invokeExact(allocator, ppPhysicalDeviceProperties);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
    PhysicalDeviceMemoryProperties are fetched from physicalDevice by the allocator.
    You can access it here, without fetching it again on your own.
    */
    public static void vmaGetMemoryProperties(java.lang.foreign.MemorySegment allocator, java.lang.foreign.MemorySegment ppPhysicalDeviceMemoryProperties)
    {
        try {MTD$vmaGetMemoryProperties.invokeExact(allocator, ppPhysicalDeviceMemoryProperties);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
    \brief Given Memory Type Index, returns Property Flags of this memory type.
    
    This is just a convenience function. Same information can be obtained using
    vmaGetMemoryProperties().
    */
    public static void vmaGetMemoryTypeProperties(java.lang.foreign.MemorySegment allocator, int memoryTypeIndex, java.lang.foreign.MemorySegment pFlags)
    {
        try {MTD$vmaGetMemoryTypeProperties.invokeExact(allocator, memoryTypeIndex, pFlags);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /** \brief Sets index of the current frame.
    */
    public static void vmaSetCurrentFrameIndex(java.lang.foreign.MemorySegment allocator, int frameIndex)
    {
        try {MTD$vmaSetCurrentFrameIndex.invokeExact(allocator, frameIndex);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /** \brief Retrieves statistics from current state of the Allocator.
    
    This function is called "calculate" not "get" because it has to traverse all
    internal data structures, so it may be quite slow. Use it for debugging purposes.
    For faster but more brief statistics suitable to be called every frame or every allocation,
    use vmaGetHeapBudgets().
    
    Note that when using allocator from multiple threads, returned information may immediately
    become outdated.
    */
    public static void vmaCalculateStatistics(java.lang.foreign.MemorySegment allocator, java.lang.foreign.MemorySegment pStats)
    {
        try {MTD$vmaCalculateStatistics.invokeExact(allocator, pStats);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /** \brief Retrieves information about current memory usage and budget for all memory heaps.
    
    \param allocator
    \param[out] pBudgets Must point to array with number of elements at least equal to number of memory heaps in physical device used.
    
    This function is called "get" not "calculate" because it is very fast, suitable to be called
    every frame or every allocation. For more detailed statistics use vmaCalculateStatistics().
    
    Note that when using allocator from multiple threads, returned information may immediately
    become outdated.
    */
    public static void vmaGetHeapBudgets(java.lang.foreign.MemorySegment allocator, java.lang.foreign.MemorySegment pBudgets)
    {
        try {MTD$vmaGetHeapBudgets.invokeExact(allocator, pBudgets);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
    \brief Helps to find memoryTypeIndex, given memoryTypeBits and VmaAllocationCreateInfo.
    
    This algorithm tries to find a memory type that:
    
    - Is allowed by memoryTypeBits.
    - Contains all the flags from pAllocationCreateInfo->requiredFlags.
    - Matches intended usage.
    - Has as many flags from pAllocationCreateInfo->preferredFlags as possible.
    
    \return Returns VK_ERROR_FEATURE_NOT_PRESENT if not found. Receiving such result
    from this function or any other allocating function probably means that your
    device doesn't support any memory type with requested features for the specific
    type of resource you want to use it for. Please check parameters of your
    resource, like image layout (OPTIMAL versus LINEAR) or mip level count.
    */
    public static int vmaFindMemoryTypeIndex(java.lang.foreign.MemorySegment allocator, int memoryTypeBits, java.lang.foreign.MemorySegment pAllocationCreateInfo, java.lang.foreign.MemorySegment pMemoryTypeIndex)
    {
        try {return (int)MTD$vmaFindMemoryTypeIndex.invokeExact(allocator, memoryTypeBits, pAllocationCreateInfo, pMemoryTypeIndex);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
    \brief Helps to find memoryTypeIndex, given VkBufferCreateInfo and VmaAllocationCreateInfo.
    
    It can be useful e.g. to determine value to be used as VmaPoolCreateInfo::memoryTypeIndex.
    It internally creates a temporary, dummy buffer that never has memory bound.
    */
    public static int vmaFindMemoryTypeIndexForBufferInfo(java.lang.foreign.MemorySegment allocator, java.lang.foreign.MemorySegment pBufferCreateInfo, java.lang.foreign.MemorySegment pAllocationCreateInfo, java.lang.foreign.MemorySegment pMemoryTypeIndex)
    {
        try {return (int)MTD$vmaFindMemoryTypeIndexForBufferInfo.invokeExact(allocator, pBufferCreateInfo, pAllocationCreateInfo, pMemoryTypeIndex);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
    \brief Helps to find memoryTypeIndex, given VkImageCreateInfo and VmaAllocationCreateInfo.
    
    It can be useful e.g. to determine value to be used as VmaPoolCreateInfo::memoryTypeIndex.
    It internally creates a temporary, dummy image that never has memory bound.
    */
    public static int vmaFindMemoryTypeIndexForImageInfo(java.lang.foreign.MemorySegment allocator, java.lang.foreign.MemorySegment pImageCreateInfo, java.lang.foreign.MemorySegment pAllocationCreateInfo, java.lang.foreign.MemorySegment pMemoryTypeIndex)
    {
        try {return (int)MTD$vmaFindMemoryTypeIndexForImageInfo.invokeExact(allocator, pImageCreateInfo, pAllocationCreateInfo, pMemoryTypeIndex);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /** \brief Allocates Vulkan device memory and creates #VmaPool object.
    
    \param allocator Allocator object.
    \param pCreateInfo Parameters of pool to create.
    \param[out] pPool Handle to created pool.
    */
    public static int vmaCreatePool(java.lang.foreign.MemorySegment allocator, java.lang.foreign.MemorySegment pCreateInfo, java.lang.foreign.MemorySegment pPool)
    {
        try {return (int)MTD$vmaCreatePool.invokeExact(allocator, pCreateInfo, pPool);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /** \brief Destroys #VmaPool object and frees Vulkan device memory.
    */
    public static void vmaDestroyPool(java.lang.foreign.MemorySegment allocator, java.lang.foreign.MemorySegment pool)
    {
        try {MTD$vmaDestroyPool.invokeExact(allocator, pool);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /** \brief Retrieves statistics of existing #VmaPool object.
    
    \param allocator Allocator object.
    \param pool Pool object.
    \param[out] pPoolStats Statistics of specified pool.
    */
    public static void vmaGetPoolStatistics(java.lang.foreign.MemorySegment allocator, java.lang.foreign.MemorySegment pool, java.lang.foreign.MemorySegment pPoolStats)
    {
        try {MTD$vmaGetPoolStatistics.invokeExact(allocator, pool, pPoolStats);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /** \brief Retrieves detailed statistics of existing #VmaPool object.
    
    \param allocator Allocator object.
    \param pool Pool object.
    \param[out] pPoolStats Statistics of specified pool.
    */
    public static void vmaCalculatePoolStatistics(java.lang.foreign.MemorySegment allocator, java.lang.foreign.MemorySegment pool, java.lang.foreign.MemorySegment pPoolStats)
    {
        try {MTD$vmaCalculatePoolStatistics.invokeExact(allocator, pool, pPoolStats);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /** \brief Checks magic number in margins around all allocations in given memory pool in search for corruptions.
    
    Corruption detection is enabled only when `VMA_DEBUG_DETECT_CORRUPTION` macro is defined to nonzero,
    `VMA_DEBUG_MARGIN` is defined to nonzero and the pool is created in memory type that is
    `HOST_VISIBLE` and `HOST_COHERENT`. For more information, see [Corruption detection](@ref debugging_memory_usage_corruption_detection).
    
    Possible return values:
    
    - `VK_ERROR_FEATURE_NOT_PRESENT` - corruption detection is not enabled for specified pool.
    - `VK_SUCCESS` - corruption detection has been performed and succeeded.
    - `VK_ERROR_UNKNOWN` - corruption detection has been performed and found memory corruptions around one of the allocations.
      `VMA_ASSERT` is also fired in that case.
    - Other value: Error returned by Vulkan, e.g. memory mapping failure.
    */
    public static int vmaCheckPoolCorruption(java.lang.foreign.MemorySegment allocator, java.lang.foreign.MemorySegment pool)
    {
        try {return (int)MTD$vmaCheckPoolCorruption.invokeExact(allocator, pool);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /** \brief Retrieves name of a custom pool.
    
    After the call `ppName` is either null or points to an internally-owned null-terminated string
    containing name of the pool that was previously set. The pointer becomes invalid when the pool is
    destroyed or its name is changed using vmaSetPoolName().
    */
    public static void vmaGetPoolName(java.lang.foreign.MemorySegment allocator, java.lang.foreign.MemorySegment pool, java.lang.foreign.MemorySegment ppName)
    {
        try {MTD$vmaGetPoolName.invokeExact(allocator, pool, ppName);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /** \brief Sets name of a custom pool.
    
    `pName` can be either null or pointer to a null-terminated string with new name for the pool.
    Function makes internal copy of the string, so it can be changed or freed immediately after this call.
    */
    public static void vmaSetPoolName(java.lang.foreign.MemorySegment allocator, java.lang.foreign.MemorySegment pool, java.lang.foreign.MemorySegment pName)
    {
        try {MTD$vmaSetPoolName.invokeExact(allocator, pool, pName);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /** \brief General purpose memory allocation.
    
    \param allocator
    \param pVkMemoryRequirements
    \param pCreateInfo
    \param[out] pAllocation Handle to allocated memory.
    \param[out] pAllocationInfo Optional. Information about allocated memory. It can be later fetched using function vmaGetAllocationInfo().
    
    You should free the memory using vmaFreeMemory() or vmaFreeMemoryPages().
    
    It is recommended to use vmaAllocateMemoryForBuffer(), vmaAllocateMemoryForImage(),
    vmaCreateBuffer(), vmaCreateImage() instead whenever possible.
    */
    public static int vmaAllocateMemory(java.lang.foreign.MemorySegment allocator, java.lang.foreign.MemorySegment pVkMemoryRequirements, java.lang.foreign.MemorySegment pCreateInfo, java.lang.foreign.MemorySegment pAllocation, java.lang.foreign.MemorySegment pAllocationInfo)
    {
        try {return (int)MTD$vmaAllocateMemory.invokeExact(allocator, pVkMemoryRequirements, pCreateInfo, pAllocation, pAllocationInfo);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /** \brief General purpose memory allocation for multiple allocation objects at once.
    
    \param allocator Allocator object.
    \param pVkMemoryRequirements Memory requirements for each allocation.
    \param pCreateInfo Creation parameters for each allocation.
    \param allocationCount Number of allocations to make.
    \param[out] pAllocations Pointer to array that will be filled with handles to created allocations.
    \param[out] pAllocationInfo Optional. Pointer to array that will be filled with parameters of created allocations.
    
    You should free the memory using vmaFreeMemory() or vmaFreeMemoryPages().
    
    Word "pages" is just a suggestion to use this function to allocate pieces of memory needed for sparse binding.
    It is just a general purpose allocation function able to make multiple allocations at once.
    It may be internally optimized to be more efficient than calling vmaAllocateMemory() `allocationCount` times.
    
    All allocations are made using same parameters. All of them are created out of the same memory pool and type.
    If any allocation fails, all allocations already made within this function call are also freed, so that when
    returned result is not `VK_SUCCESS`, `pAllocation` array is always entirely filled with `VK_NULL_HANDLE`.
    */
    public static int vmaAllocateMemoryPages(java.lang.foreign.MemorySegment allocator, java.lang.foreign.MemorySegment pVkMemoryRequirements, java.lang.foreign.MemorySegment pCreateInfo, long allocationCount, java.lang.foreign.MemorySegment pAllocations, java.lang.foreign.MemorySegment pAllocationInfo)
    {
        try {return (int)MTD$vmaAllocateMemoryPages.invokeExact(allocator, pVkMemoryRequirements, pCreateInfo, allocationCount, pAllocations, pAllocationInfo);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /** \brief Allocates memory suitable for given `VkBuffer`.
    
    \param allocator
    \param buffer
    \param pCreateInfo
    \param[out] pAllocation Handle to allocated memory.
    \param[out] pAllocationInfo Optional. Information about allocated memory. It can be later fetched using function vmaGetAllocationInfo().
    
    It only creates #VmaAllocation. To bind the memory to the buffer, use vmaBindBufferMemory().
    
    This is a special-purpose function. In most cases you should use vmaCreateBuffer().
    
    You must free the allocation using vmaFreeMemory() when no longer needed.
    */
    public static int vmaAllocateMemoryForBuffer(java.lang.foreign.MemorySegment allocator, java.lang.foreign.MemorySegment buffer, java.lang.foreign.MemorySegment pCreateInfo, java.lang.foreign.MemorySegment pAllocation, java.lang.foreign.MemorySegment pAllocationInfo)
    {
        try {return (int)MTD$vmaAllocateMemoryForBuffer.invokeExact(allocator, buffer, pCreateInfo, pAllocation, pAllocationInfo);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /** \brief Allocates memory suitable for given `VkImage`.
    
    \param allocator
    \param image
    \param pCreateInfo
    \param[out] pAllocation Handle to allocated memory.
    \param[out] pAllocationInfo Optional. Information about allocated memory. It can be later fetched using function vmaGetAllocationInfo().
    
    It only creates #VmaAllocation. To bind the memory to the buffer, use vmaBindImageMemory().
    
    This is a special-purpose function. In most cases you should use vmaCreateImage().
    
    You must free the allocation using vmaFreeMemory() when no longer needed.
    */
    public static int vmaAllocateMemoryForImage(java.lang.foreign.MemorySegment allocator, java.lang.foreign.MemorySegment image, java.lang.foreign.MemorySegment pCreateInfo, java.lang.foreign.MemorySegment pAllocation, java.lang.foreign.MemorySegment pAllocationInfo)
    {
        try {return (int)MTD$vmaAllocateMemoryForImage.invokeExact(allocator, image, pCreateInfo, pAllocation, pAllocationInfo);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /** \brief Frees memory previously allocated using vmaAllocateMemory(), vmaAllocateMemoryForBuffer(), or vmaAllocateMemoryForImage().
    
    Passing `VK_NULL_HANDLE` as `allocation` is valid. Such function call is just skipped.
    */
    public static void vmaFreeMemory(java.lang.foreign.MemorySegment allocator, java.lang.foreign.MemorySegment allocation)
    {
        try {MTD$vmaFreeMemory.invokeExact(allocator, allocation);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /** \brief Frees memory and destroys multiple allocations.
    
    Word "pages" is just a suggestion to use this function to free pieces of memory used for sparse binding.
    It is just a general purpose function to free memory and destroy allocations made using e.g. vmaAllocateMemory(),
    vmaAllocateMemoryPages() and other functions.
    It may be internally optimized to be more efficient than calling vmaFreeMemory() `allocationCount` times.
    
    Allocations in `pAllocations` array can come from any memory pools and types.
    Passing `VK_NULL_HANDLE` as elements of `pAllocations` array is valid. Such entries are just skipped.
    */
    public static void vmaFreeMemoryPages(java.lang.foreign.MemorySegment allocator, long allocationCount, java.lang.foreign.MemorySegment pAllocations)
    {
        try {MTD$vmaFreeMemoryPages.invokeExact(allocator, allocationCount, pAllocations);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /** \brief Returns current information about specified allocation.
    
    Current parameters of given allocation are returned in `pAllocationInfo`.
    
    Although this function doesn't lock any mutex, so it should be quite efficient,
    you should avoid calling it too often.
    You can retrieve same VmaAllocationInfo structure while creating your resource, from function
    vmaCreateBuffer(), vmaCreateImage(). You can remember it if you are sure parameters don't change
    (e.g. due to defragmentation).
    
    There is also a new function vmaGetAllocationInfo2() that offers extended information
    about the allocation, returned using new structure #VmaAllocationInfo2.
    */
    public static void vmaGetAllocationInfo(java.lang.foreign.MemorySegment allocator, java.lang.foreign.MemorySegment allocation, java.lang.foreign.MemorySegment pAllocationInfo)
    {
        try {MTD$vmaGetAllocationInfo.invokeExact(allocator, allocation, pAllocationInfo);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /** \brief Returns extended information about specified allocation.
    
    Current parameters of given allocation are returned in `pAllocationInfo`.
    Extended parameters in structure #VmaAllocationInfo2 include memory block size
    and a flag telling whether the allocation has dedicated memory.
    It can be useful e.g. for interop with OpenGL.
    */
    public static void vmaGetAllocationInfo2(java.lang.foreign.MemorySegment allocator, java.lang.foreign.MemorySegment allocation, java.lang.foreign.MemorySegment pAllocationInfo)
    {
        try {MTD$vmaGetAllocationInfo2.invokeExact(allocator, allocation, pAllocationInfo);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /** \brief Sets pUserData in given allocation to new value.
    
    The value of pointer `pUserData` is copied to allocation's `pUserData`.
    It is opaque, so you can use it however you want - e.g.
    as a pointer, ordinal number or some handle to you own data.
    */
    public static void vmaSetAllocationUserData(java.lang.foreign.MemorySegment allocator, java.lang.foreign.MemorySegment allocation, java.lang.foreign.MemorySegment pUserData)
    {
        try {MTD$vmaSetAllocationUserData.invokeExact(allocator, allocation, pUserData);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /** \brief Sets pName in given allocation to new value.
    
    `pName` must be either null, or pointer to a null-terminated string. The function
    makes local copy of the string and sets it as allocation's `pName`. String
    passed as pName doesn't need to be valid for whole lifetime of the allocation -
    you can free it after this call. String previously pointed by allocation's
    `pName` is freed from memory.
    */
    public static void vmaSetAllocationName(java.lang.foreign.MemorySegment allocator, java.lang.foreign.MemorySegment allocation, java.lang.foreign.MemorySegment pName)
    {
        try {MTD$vmaSetAllocationName.invokeExact(allocator, allocation, pName);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /**
    \brief Given an allocation, returns Property Flags of its memory type.
    
    This is just a convenience function. Same information can be obtained using
    vmaGetAllocationInfo() + vmaGetMemoryProperties().
    */
    public static void vmaGetAllocationMemoryProperties(java.lang.foreign.MemorySegment allocator, java.lang.foreign.MemorySegment allocation, java.lang.foreign.MemorySegment pFlags)
    {
        try {MTD$vmaGetAllocationMemoryProperties.invokeExact(allocator, allocation, pFlags);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /** \brief Maps memory represented by given allocation and returns pointer to it.
    
    Maps memory represented by given allocation to make it accessible to CPU code.
    When succeeded, `*ppData` contains pointer to first byte of this memory.
    
    \warning
    If the allocation is part of a bigger `VkDeviceMemory` block, returned pointer is
    correctly offsetted to the beginning of region assigned to this particular allocation.
    Unlike the result of `vkMapMemory`, it points to the allocation, not to the beginning of the whole block.
    You should not add VmaAllocationInfo::offset to it!
    
    Mapping is internally reference-counted and synchronized, so despite raw Vulkan
    function `vkMapMemory()` cannot be used to map same block of `VkDeviceMemory`
    multiple times simultaneously, it is safe to call this function on allocations
    assigned to the same memory block. Actual Vulkan memory will be mapped on first
    mapping and unmapped on last unmapping.
    
    If the function succeeded, you must call vmaUnmapMemory() to unmap the
    allocation when mapping is no longer needed or before freeing the allocation, at
    the latest.
    
    It also safe to call this function multiple times on the same allocation. You
    must call vmaUnmapMemory() same number of times as you called vmaMapMemory().
    
    It is also safe to call this function on allocation created with
    #VMA_ALLOCATION_CREATE_MAPPED_BIT flag. Its memory stays mapped all the time.
    You must still call vmaUnmapMemory() same number of times as you called
    vmaMapMemory(). You must not call vmaUnmapMemory() additional time to free the
    "0-th" mapping made automatically due to #VMA_ALLOCATION_CREATE_MAPPED_BIT flag.
    
    This function fails when used on allocation made in memory type that is not
    `HOST_VISIBLE`.
    
    This function doesn't automatically flush or invalidate caches.
    If the allocation is made from a memory types that is not `HOST_COHERENT`,
    you also need to use vmaInvalidateAllocation() / vmaFlushAllocation(), as required by Vulkan specification.
    */
    public static int vmaMapMemory(java.lang.foreign.MemorySegment allocator, java.lang.foreign.MemorySegment allocation, java.lang.foreign.MemorySegment ppData)
    {
        try {return (int)MTD$vmaMapMemory.invokeExact(allocator, allocation, ppData);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /** \brief Unmaps memory represented by given allocation, mapped previously using vmaMapMemory().
    
    For details, see description of vmaMapMemory().
    
    This function doesn't automatically flush or invalidate caches.
    If the allocation is made from a memory types that is not `HOST_COHERENT`,
    you also need to use vmaInvalidateAllocation() / vmaFlushAllocation(), as required by Vulkan specification.
    */
    public static void vmaUnmapMemory(java.lang.foreign.MemorySegment allocator, java.lang.foreign.MemorySegment allocation)
    {
        try {MTD$vmaUnmapMemory.invokeExact(allocator, allocation);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /** \brief Flushes memory of given allocation.
    
    Calls `vkFlushMappedMemoryRanges()` for memory associated with given range of given allocation.
    It needs to be called after writing to a mapped memory for memory types that are not `HOST_COHERENT`.
    Unmap operation doesn't do that automatically.
    
    - `offset` must be relative to the beginning of allocation.
    - `size` can be `VK_WHOLE_SIZE`. It means all memory from `offset` the the end of given allocation.
    - `offset` and `size` don't have to be aligned.
      They are internally rounded down/up to multiply of `nonCoherentAtomSize`.
    - If `size` is 0, this call is ignored.
    - If memory type that the `allocation` belongs to is not `HOST_VISIBLE` or it is `HOST_COHERENT`,
      this call is ignored.
    
    Warning! `offset` and `size` are relative to the contents of given `allocation`.
    If you mean whole allocation, you can pass 0 and `VK_WHOLE_SIZE`, respectively.
    Do not pass allocation's offset as `offset`!!!
    
    This function returns the `VkResult` from `vkFlushMappedMemoryRanges` if it is
    called, otherwise `VK_SUCCESS`.
    */
    public static int vmaFlushAllocation(java.lang.foreign.MemorySegment allocator, java.lang.foreign.MemorySegment allocation, long offset, long size)
    {
        try {return (int)MTD$vmaFlushAllocation.invokeExact(allocator, allocation, offset, size);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /** \brief Invalidates memory of given allocation.
    
    Calls `vkInvalidateMappedMemoryRanges()` for memory associated with given range of given allocation.
    It needs to be called before reading from a mapped memory for memory types that are not `HOST_COHERENT`.
    Map operation doesn't do that automatically.
    
    - `offset` must be relative to the beginning of allocation.
    - `size` can be `VK_WHOLE_SIZE`. It means all memory from `offset` the the end of given allocation.
    - `offset` and `size` don't have to be aligned.
      They are internally rounded down/up to multiply of `nonCoherentAtomSize`.
    - If `size` is 0, this call is ignored.
    - If memory type that the `allocation` belongs to is not `HOST_VISIBLE` or it is `HOST_COHERENT`,
      this call is ignored.
    
    Warning! `offset` and `size` are relative to the contents of given `allocation`.
    If you mean whole allocation, you can pass 0 and `VK_WHOLE_SIZE`, respectively.
    Do not pass allocation's offset as `offset`!!!
    
    This function returns the `VkResult` from `vkInvalidateMappedMemoryRanges` if
    it is called, otherwise `VK_SUCCESS`.
    */
    public static int vmaInvalidateAllocation(java.lang.foreign.MemorySegment allocator, java.lang.foreign.MemorySegment allocation, long offset, long size)
    {
        try {return (int)MTD$vmaInvalidateAllocation.invokeExact(allocator, allocation, offset, size);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /** \brief Flushes memory of given set of allocations.
    
    Calls `vkFlushMappedMemoryRanges()` for memory associated with given ranges of given allocations.
    For more information, see documentation of vmaFlushAllocation().
    
    \param allocator
    \param allocationCount
    \param allocations
    \param offsets If not null, it must point to an array of offsets of regions to flush, relative to the beginning of respective allocations. Null means all ofsets are zero.
    \param sizes If not null, it must point to an array of sizes of regions to flush in respective allocations. Null means `VK_WHOLE_SIZE` for all allocations.
    
    This function returns the `VkResult` from `vkFlushMappedMemoryRanges` if it is
    called, otherwise `VK_SUCCESS`.
    */
    public static int vmaFlushAllocations(java.lang.foreign.MemorySegment allocator, int allocationCount, java.lang.foreign.MemorySegment allocations, java.lang.foreign.MemorySegment offsets, java.lang.foreign.MemorySegment sizes)
    {
        try {return (int)MTD$vmaFlushAllocations.invokeExact(allocator, allocationCount, allocations, offsets, sizes);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /** \brief Invalidates memory of given set of allocations.
    
    Calls `vkInvalidateMappedMemoryRanges()` for memory associated with given ranges of given allocations.
    For more information, see documentation of vmaInvalidateAllocation().
    
    \param allocator
    \param allocationCount
    \param allocations
    \param offsets If not null, it must point to an array of offsets of regions to flush, relative to the beginning of respective allocations. Null means all ofsets are zero.
    \param sizes If not null, it must point to an array of sizes of regions to flush in respective allocations. Null means `VK_WHOLE_SIZE` for all allocations.
    
    This function returns the `VkResult` from `vkInvalidateMappedMemoryRanges` if it is
    called, otherwise `VK_SUCCESS`.
    */
    public static int vmaInvalidateAllocations(java.lang.foreign.MemorySegment allocator, int allocationCount, java.lang.foreign.MemorySegment allocations, java.lang.foreign.MemorySegment offsets, java.lang.foreign.MemorySegment sizes)
    {
        try {return (int)MTD$vmaInvalidateAllocations.invokeExact(allocator, allocationCount, allocations, offsets, sizes);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /** \brief Checks magic number in margins around all allocations in given memory types (in both default and custom pools) in search for corruptions.
    
    \param allocator
    \param memoryTypeBits Bit mask, where each bit set means that a memory type with that index should be checked.
    
    Corruption detection is enabled only when `VMA_DEBUG_DETECT_CORRUPTION` macro is defined to nonzero,
    `VMA_DEBUG_MARGIN` is defined to nonzero and only for memory types that are
    `HOST_VISIBLE` and `HOST_COHERENT`. For more information, see [Corruption detection](@ref debugging_memory_usage_corruption_detection).
    
    Possible return values:
    
    - `VK_ERROR_FEATURE_NOT_PRESENT` - corruption detection is not enabled for any of specified memory types.
    - `VK_SUCCESS` - corruption detection has been performed and succeeded.
    - `VK_ERROR_UNKNOWN` - corruption detection has been performed and found memory corruptions around one of the allocations.
      `VMA_ASSERT` is also fired in that case.
    - Other value: Error returned by Vulkan, e.g. memory mapping failure.
    */
    public static int vmaCheckCorruption(java.lang.foreign.MemorySegment allocator, int memoryTypeBits)
    {
        try {return (int)MTD$vmaCheckCorruption.invokeExact(allocator, memoryTypeBits);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /** \brief Begins defragmentation process.
    
    \param allocator Allocator object.
    \param pInfo Structure filled with parameters of defragmentation.
    \param[out] pContext Context object that must be passed to vmaEndDefragmentation() to finish defragmentation.
    \returns
    - `VK_SUCCESS` if defragmentation can begin.
    - `VK_ERROR_FEATURE_NOT_PRESENT` if defragmentation is not supported.
    
    For more information about defragmentation, see documentation chapter:
    [Defragmentation](@ref defragmentation).
    */
    public static int vmaBeginDefragmentation(java.lang.foreign.MemorySegment allocator, java.lang.foreign.MemorySegment pInfo, java.lang.foreign.MemorySegment pContext)
    {
        try {return (int)MTD$vmaBeginDefragmentation.invokeExact(allocator, pInfo, pContext);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /** \brief Ends defragmentation process.
    
    \param allocator Allocator object.
    \param context Context object that has been created by vmaBeginDefragmentation().
    \param[out] pStats Optional stats for the defragmentation. Can be null.
    
    Use this function to finish defragmentation started by vmaBeginDefragmentation().
    */
    public static void vmaEndDefragmentation(java.lang.foreign.MemorySegment allocator, java.lang.foreign.MemorySegment context, java.lang.foreign.MemorySegment pStats)
    {
        try {MTD$vmaEndDefragmentation.invokeExact(allocator, context, pStats);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /** \brief Starts single defragmentation pass.
    
    \param allocator Allocator object.
    \param context Context object that has been created by vmaBeginDefragmentation().
    \param[out] pPassInfo Computed information for current pass.
    \returns
    - `VK_SUCCESS` if no more moves are possible. Then you can omit call to vmaEndDefragmentationPass() and simply end whole defragmentation.
    - `VK_INCOMPLETE` if there are pending moves returned in `pPassInfo`. You need to perform them, call vmaEndDefragmentationPass(),
      and then preferably try another pass with vmaBeginDefragmentationPass().
    */
    public static int vmaBeginDefragmentationPass(java.lang.foreign.MemorySegment allocator, java.lang.foreign.MemorySegment context, java.lang.foreign.MemorySegment pPassInfo)
    {
        try {return (int)MTD$vmaBeginDefragmentationPass.invokeExact(allocator, context, pPassInfo);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /** \brief Ends single defragmentation pass.
    
    \param allocator Allocator object.
    \param context Context object that has been created by vmaBeginDefragmentation().
    \param pPassInfo Computed information for current pass filled by vmaBeginDefragmentationPass() and possibly modified by you.
    
    Returns `VK_SUCCESS` if no more moves are possible or `VK_INCOMPLETE` if more defragmentations are possible.
    
    Ends incremental defragmentation pass and commits all defragmentation moves from `pPassInfo`.
    After this call:
    
    - Allocations at `pPassInfo[i].srcAllocation` that had `pPassInfo[i].operation ==` #VMA_DEFRAGMENTATION_MOVE_OPERATION_COPY
      (which is the default) will be pointing to the new destination place.
    - Allocation at `pPassInfo[i].srcAllocation` that had `pPassInfo[i].operation ==` #VMA_DEFRAGMENTATION_MOVE_OPERATION_DESTROY
      will be freed.
    
    If no more moves are possible you can end whole defragmentation.
    */
    public static int vmaEndDefragmentationPass(java.lang.foreign.MemorySegment allocator, java.lang.foreign.MemorySegment context, java.lang.foreign.MemorySegment pPassInfo)
    {
        try {return (int)MTD$vmaEndDefragmentationPass.invokeExact(allocator, context, pPassInfo);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /** \brief Binds buffer to allocation.
    
    Binds specified buffer to region of memory represented by specified allocation.
    Gets `VkDeviceMemory` handle and offset from the allocation.
    If you want to create a buffer, allocate memory for it and bind them together separately,
    you should use this function for binding instead of standard `vkBindBufferMemory()`,
    because it ensures proper synchronization so that when a `VkDeviceMemory` object is used by multiple
    allocations, calls to `vkBind*Memory()` or `vkMapMemory()` won't happen from multiple threads simultaneously
    (which is illegal in Vulkan).
    
    It is recommended to use function vmaCreateBuffer() instead of this one.
    */
    public static int vmaBindBufferMemory(java.lang.foreign.MemorySegment allocator, java.lang.foreign.MemorySegment allocation, java.lang.foreign.MemorySegment buffer)
    {
        try {return (int)MTD$vmaBindBufferMemory.invokeExact(allocator, allocation, buffer);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /** \brief Binds buffer to allocation with additional parameters.
    
    \param allocator
    \param allocation
    \param allocationLocalOffset Additional offset to be added while binding, relative to the beginning of the `allocation`. Normally it should be 0.
    \param buffer
    \param pNext A chain of structures to be attached to `VkBindBufferMemoryInfoKHR` structure used internally. Normally it should be null.
    
    This function is similar to vmaBindBufferMemory(), but it provides additional parameters.
    
    If `pNext` is not null, #VmaAllocator object must have been created with #VMA_ALLOCATOR_CREATE_KHR_BIND_MEMORY2_BIT flag
    or with VmaAllocatorCreateInfo::vulkanApiVersion `>= VK_API_VERSION_1_1`. Otherwise the call fails.
    */
    public static int vmaBindBufferMemory2(java.lang.foreign.MemorySegment allocator, java.lang.foreign.MemorySegment allocation, long allocationLocalOffset, java.lang.foreign.MemorySegment buffer, java.lang.foreign.MemorySegment pNext)
    {
        try {return (int)MTD$vmaBindBufferMemory2.invokeExact(allocator, allocation, allocationLocalOffset, buffer, pNext);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /** \brief Binds image to allocation.
    
    Binds specified image to region of memory represented by specified allocation.
    Gets `VkDeviceMemory` handle and offset from the allocation.
    If you want to create an image, allocate memory for it and bind them together separately,
    you should use this function for binding instead of standard `vkBindImageMemory()`,
    because it ensures proper synchronization so that when a `VkDeviceMemory` object is used by multiple
    allocations, calls to `vkBind*Memory()` or `vkMapMemory()` won't happen from multiple threads simultaneously
    (which is illegal in Vulkan).
    
    It is recommended to use function vmaCreateImage() instead of this one.
    */
    public static int vmaBindImageMemory(java.lang.foreign.MemorySegment allocator, java.lang.foreign.MemorySegment allocation, java.lang.foreign.MemorySegment image)
    {
        try {return (int)MTD$vmaBindImageMemory.invokeExact(allocator, allocation, image);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /** \brief Binds image to allocation with additional parameters.
    
    \param allocator
    \param allocation
    \param allocationLocalOffset Additional offset to be added while binding, relative to the beginning of the `allocation`. Normally it should be 0.
    \param image
    \param pNext A chain of structures to be attached to `VkBindImageMemoryInfoKHR` structure used internally. Normally it should be null.
    
    This function is similar to vmaBindImageMemory(), but it provides additional parameters.
    
    If `pNext` is not null, #VmaAllocator object must have been created with #VMA_ALLOCATOR_CREATE_KHR_BIND_MEMORY2_BIT flag
    or with VmaAllocatorCreateInfo::vulkanApiVersion `>= VK_API_VERSION_1_1`. Otherwise the call fails.
    */
    public static int vmaBindImageMemory2(java.lang.foreign.MemorySegment allocator, java.lang.foreign.MemorySegment allocation, long allocationLocalOffset, java.lang.foreign.MemorySegment image, java.lang.foreign.MemorySegment pNext)
    {
        try {return (int)MTD$vmaBindImageMemory2.invokeExact(allocator, allocation, allocationLocalOffset, image, pNext);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /** \brief Creates a new `VkBuffer`, allocates and binds memory for it.
    
    \param allocator
    \param pBufferCreateInfo
    \param pAllocationCreateInfo
    \param[out] pBuffer Buffer that was created.
    \param[out] pAllocation Allocation that was created.
    \param[out] pAllocationInfo Optional. Information about allocated memory. It can be later fetched using function vmaGetAllocationInfo().
    
    This function automatically:
    
    -# Creates buffer.
    -# Allocates appropriate memory for it.
    -# Binds the buffer with the memory.
    
    If any of these operations fail, buffer and allocation are not created,
    returned value is negative error code, `*pBuffer` and `*pAllocation` are null.
    
    If the function succeeded, you must destroy both buffer and allocation when you
    no longer need them using either convenience function vmaDestroyBuffer() or
    separately, using `vkDestroyBuffer()` and vmaFreeMemory().
    
    If #VMA_ALLOCATOR_CREATE_KHR_DEDICATED_ALLOCATION_BIT flag was used,
    VK_KHR_dedicated_allocation extension is used internally to query driver whether
    it requires or prefers the new buffer to have dedicated allocation. If yes,
    and if dedicated allocation is possible
    (#VMA_ALLOCATION_CREATE_NEVER_ALLOCATE_BIT is not used), it creates dedicated
    allocation for this buffer, just like when using
    #VMA_ALLOCATION_CREATE_DEDICATED_MEMORY_BIT.
    
    \note This function creates a new `VkBuffer`. Sub-allocation of parts of one large buffer,
    although recommended as a good practice, is out of scope of this library and could be implemented
    by the user as a higher-level logic on top of VMA.
    */
    public static int vmaCreateBuffer(java.lang.foreign.MemorySegment allocator, java.lang.foreign.MemorySegment pBufferCreateInfo, java.lang.foreign.MemorySegment pAllocationCreateInfo, java.lang.foreign.MemorySegment pBuffer, java.lang.foreign.MemorySegment pAllocation, java.lang.foreign.MemorySegment pAllocationInfo)
    {
        try {return (int)MTD$vmaCreateBuffer.invokeExact(allocator, pBufferCreateInfo, pAllocationCreateInfo, pBuffer, pAllocation, pAllocationInfo);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /** \brief Creates a buffer with additional minimum alignment.
    
    Similar to vmaCreateBuffer() but provides additional parameter `minAlignment` which allows to specify custom,
    minimum alignment to be used when placing the buffer inside a larger memory block, which may be needed e.g.
    for interop with OpenGL.
    */
    public static int vmaCreateBufferWithAlignment(java.lang.foreign.MemorySegment allocator, java.lang.foreign.MemorySegment pBufferCreateInfo, java.lang.foreign.MemorySegment pAllocationCreateInfo, long minAlignment, java.lang.foreign.MemorySegment pBuffer, java.lang.foreign.MemorySegment pAllocation, java.lang.foreign.MemorySegment pAllocationInfo)
    {
        try {return (int)MTD$vmaCreateBufferWithAlignment.invokeExact(allocator, pBufferCreateInfo, pAllocationCreateInfo, minAlignment, pBuffer, pAllocation, pAllocationInfo);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /** \brief Creates a new `VkBuffer`, binds already created memory for it.
    
    \param allocator
    \param allocation Allocation that provides memory to be used for binding new buffer to it.
    \param pBufferCreateInfo
    \param[out] pBuffer Buffer that was created.
    
    This function automatically:
    
    -# Creates buffer.
    -# Binds the buffer with the supplied memory.
    
    If any of these operations fail, buffer is not created,
    returned value is negative error code and `*pBuffer` is null.
    
    If the function succeeded, you must destroy the buffer when you
    no longer need it using `vkDestroyBuffer()`. If you want to also destroy the corresponding
    allocation you can use convenience function vmaDestroyBuffer().
    
    \note There is a new version of this function augmented with parameter `allocationLocalOffset` - see vmaCreateAliasingBuffer2().
    */
    public static int vmaCreateAliasingBuffer(java.lang.foreign.MemorySegment allocator, java.lang.foreign.MemorySegment allocation, java.lang.foreign.MemorySegment pBufferCreateInfo, java.lang.foreign.MemorySegment pBuffer)
    {
        try {return (int)MTD$vmaCreateAliasingBuffer.invokeExact(allocator, allocation, pBufferCreateInfo, pBuffer);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /** \brief Creates a new `VkBuffer`, binds already created memory for it.
    
    \param allocator
    \param allocation Allocation that provides memory to be used for binding new buffer to it.
    \param allocationLocalOffset Additional offset to be added while binding, relative to the beginning of the allocation. Normally it should be 0.
    \param pBufferCreateInfo 
    \param[out] pBuffer Buffer that was created.
    
    This function automatically:
    
    -# Creates buffer.
    -# Binds the buffer with the supplied memory.
    
    If any of these operations fail, buffer is not created,
    returned value is negative error code and `*pBuffer` is null.
    
    If the function succeeded, you must destroy the buffer when you
    no longer need it using `vkDestroyBuffer()`. If you want to also destroy the corresponding
    allocation you can use convenience function vmaDestroyBuffer().
    
    \note This is a new version of the function augmented with parameter `allocationLocalOffset`.
    */
    public static int vmaCreateAliasingBuffer2(java.lang.foreign.MemorySegment allocator, java.lang.foreign.MemorySegment allocation, long allocationLocalOffset, java.lang.foreign.MemorySegment pBufferCreateInfo, java.lang.foreign.MemorySegment pBuffer)
    {
        try {return (int)MTD$vmaCreateAliasingBuffer2.invokeExact(allocator, allocation, allocationLocalOffset, pBufferCreateInfo, pBuffer);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /** \brief Destroys Vulkan buffer and frees allocated memory.
    
    This is just a convenience function equivalent to:
    
    \code
    vkDestroyBuffer(device, buffer, allocationCallbacks);
    vmaFreeMemory(allocator, allocation);
    \endcode
    
    It is safe to pass null as buffer and/or allocation.
    */
    public static void vmaDestroyBuffer(java.lang.foreign.MemorySegment allocator, java.lang.foreign.MemorySegment buffer, java.lang.foreign.MemorySegment allocation)
    {
        try {MTD$vmaDestroyBuffer.invokeExact(allocator, buffer, allocation);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /// Function similar to vmaCreateBuffer().
    public static int vmaCreateImage(java.lang.foreign.MemorySegment allocator, java.lang.foreign.MemorySegment pImageCreateInfo, java.lang.foreign.MemorySegment pAllocationCreateInfo, java.lang.foreign.MemorySegment pImage, java.lang.foreign.MemorySegment pAllocation, java.lang.foreign.MemorySegment pAllocationInfo)
    {
        try {return (int)MTD$vmaCreateImage.invokeExact(allocator, pImageCreateInfo, pAllocationCreateInfo, pImage, pAllocation, pAllocationInfo);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /// Function similar to vmaCreateAliasingBuffer() but for images.
    public static int vmaCreateAliasingImage(java.lang.foreign.MemorySegment allocator, java.lang.foreign.MemorySegment allocation, java.lang.foreign.MemorySegment pImageCreateInfo, java.lang.foreign.MemorySegment pImage)
    {
        try {return (int)MTD$vmaCreateAliasingImage.invokeExact(allocator, allocation, pImageCreateInfo, pImage);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /// Function similar to vmaCreateAliasingBuffer2() but for images.
    public static int vmaCreateAliasingImage2(java.lang.foreign.MemorySegment allocator, java.lang.foreign.MemorySegment allocation, long allocationLocalOffset, java.lang.foreign.MemorySegment pImageCreateInfo, java.lang.foreign.MemorySegment pImage)
    {
        try {return (int)MTD$vmaCreateAliasingImage2.invokeExact(allocator, allocation, allocationLocalOffset, pImageCreateInfo, pImage);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /** \brief Destroys Vulkan image and frees allocated memory.
    
    This is just a convenience function equivalent to:
    
    \code
    vkDestroyImage(device, image, allocationCallbacks);
    vmaFreeMemory(allocator, allocation);
    \endcode
    
    It is safe to pass null as image and/or allocation.
    */
    public static void vmaDestroyImage(java.lang.foreign.MemorySegment allocator, java.lang.foreign.MemorySegment image, java.lang.foreign.MemorySegment allocation)
    {
        try {MTD$vmaDestroyImage.invokeExact(allocator, image, allocation);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /** \brief Creates new #VmaVirtualBlock object.
    
    \param pCreateInfo Parameters for creation.
    \param[out] pVirtualBlock Returned virtual block object or `VMA_NULL` if creation failed.
    */
    public static int vmaCreateVirtualBlock(java.lang.foreign.MemorySegment pCreateInfo, java.lang.foreign.MemorySegment pVirtualBlock)
    {
        try {return (int)MTD$vmaCreateVirtualBlock.invokeExact(pCreateInfo, pVirtualBlock);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /** \brief Destroys #VmaVirtualBlock object.
    
    Please note that you should consciously handle virtual allocations that could remain unfreed in the block.
    You should either free them individually using vmaVirtualFree() or call vmaClearVirtualBlock()
    if you are sure this is what you want. If you do neither, an assert is called.
    
    If you keep pointers to some additional metadata associated with your virtual allocations in their `pUserData`,
    don't forget to free them.
    */
    public static void vmaDestroyVirtualBlock(java.lang.foreign.MemorySegment virtualBlock)
    {
        try {MTD$vmaDestroyVirtualBlock.invokeExact(virtualBlock);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /** \brief Returns true of the #VmaVirtualBlock is empty - contains 0 virtual allocations and has all its space available for new allocations.
    */
    public static int vmaIsVirtualBlockEmpty(java.lang.foreign.MemorySegment virtualBlock)
    {
        try {return (int)MTD$vmaIsVirtualBlockEmpty.invokeExact(virtualBlock);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /** \brief Returns information about a specific virtual allocation within a virtual block, like its size and `pUserData` pointer.
    */
    public static void vmaGetVirtualAllocationInfo(java.lang.foreign.MemorySegment virtualBlock, java.lang.foreign.MemorySegment allocation, java.lang.foreign.MemorySegment pVirtualAllocInfo)
    {
        try {MTD$vmaGetVirtualAllocationInfo.invokeExact(virtualBlock, allocation, pVirtualAllocInfo);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /** \brief Allocates new virtual allocation inside given #VmaVirtualBlock.
    
    If the allocation fails due to not enough free space available, `VK_ERROR_OUT_OF_DEVICE_MEMORY` is returned
    (despite the function doesn't ever allocate actual GPU memory).
    `pAllocation` is then set to `VK_NULL_HANDLE` and `pOffset`, if not null, it set to `UINT64_MAX`.
    
    \param virtualBlock Virtual block
    \param pCreateInfo Parameters for the allocation
    \param[out] pAllocation Returned handle of the new allocation
    \param[out] pOffset Returned offset of the new allocation. Optional, can be null.
    */
    public static int vmaVirtualAllocate(java.lang.foreign.MemorySegment virtualBlock, java.lang.foreign.MemorySegment pCreateInfo, java.lang.foreign.MemorySegment pAllocation, java.lang.foreign.MemorySegment pOffset)
    {
        try {return (int)MTD$vmaVirtualAllocate.invokeExact(virtualBlock, pCreateInfo, pAllocation, pOffset);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /** \brief Frees virtual allocation inside given #VmaVirtualBlock.
    
    It is correct to call this function with `allocation == VK_NULL_HANDLE` - it does nothing.
    */
    public static void vmaVirtualFree(java.lang.foreign.MemorySegment virtualBlock, java.lang.foreign.MemorySegment allocation)
    {
        try {MTD$vmaVirtualFree.invokeExact(virtualBlock, allocation);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /** \brief Frees all virtual allocations inside given #VmaVirtualBlock.
    
    You must either call this function or free each virtual allocation individually with vmaVirtualFree()
    before destroying a virtual block. Otherwise, an assert is called.
    
    If you keep pointer to some additional metadata associated with your virtual allocation in its `pUserData`,
    don't forget to free it as well.
    */
    public static void vmaClearVirtualBlock(java.lang.foreign.MemorySegment virtualBlock)
    {
        try {MTD$vmaClearVirtualBlock.invokeExact(virtualBlock);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /** \brief Changes custom pointer associated with given virtual allocation.
    */
    public static void vmaSetVirtualAllocationUserData(java.lang.foreign.MemorySegment virtualBlock, java.lang.foreign.MemorySegment allocation, java.lang.foreign.MemorySegment pUserData)
    {
        try {MTD$vmaSetVirtualAllocationUserData.invokeExact(virtualBlock, allocation, pUserData);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /** \brief Calculates and returns statistics about virtual allocations and memory usage in given #VmaVirtualBlock.
    
    This function is fast to call. For more detailed statistics, see vmaCalculateVirtualBlockStatistics().
    */
    public static void vmaGetVirtualBlockStatistics(java.lang.foreign.MemorySegment virtualBlock, java.lang.foreign.MemorySegment pStats)
    {
        try {MTD$vmaGetVirtualBlockStatistics.invokeExact(virtualBlock, pStats);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /** \brief Calculates and returns detailed statistics about virtual allocations and memory usage in given #VmaVirtualBlock.
    
    This function is slow to call. Use for debugging purposes.
    For less detailed statistics, see vmaGetVirtualBlockStatistics().
    */
    public static void vmaCalculateVirtualBlockStatistics(java.lang.foreign.MemorySegment virtualBlock, java.lang.foreign.MemorySegment pStats)
    {
        try {MTD$vmaCalculateVirtualBlockStatistics.invokeExact(virtualBlock, pStats);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /** \brief Builds and returns a null-terminated string in JSON format with information about given #VmaVirtualBlock.
    \param virtualBlock Virtual block.
    \param[out] ppStatsString Returned string.
    \param detailedMap Pass `VK_FALSE` to only obtain statistics as returned by vmaCalculateVirtualBlockStatistics(). Pass `VK_TRUE` to also obtain full list of allocations and free spaces.
    
    Returned string must be freed using vmaFreeVirtualBlockStatsString().
    */
    public static void vmaBuildVirtualBlockStatsString(java.lang.foreign.MemorySegment virtualBlock, java.lang.foreign.MemorySegment ppStatsString, int detailedMap)
    {
        try {MTD$vmaBuildVirtualBlockStatsString.invokeExact(virtualBlock, ppStatsString, detailedMap);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /// Frees a string returned by vmaBuildVirtualBlockStatsString().
    public static void vmaFreeVirtualBlockStatsString(java.lang.foreign.MemorySegment virtualBlock, java.lang.foreign.MemorySegment pStatsString)
    {
        try {MTD$vmaFreeVirtualBlockStatsString.invokeExact(virtualBlock, pStatsString);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /** \brief Builds and returns statistics as a null-terminated string in JSON format.
    \param allocator
    \param[out] ppStatsString Must be freed using vmaFreeStatsString() function.
    \param detailedMap
    */
    public static void vmaBuildStatsString(java.lang.foreign.MemorySegment allocator, java.lang.foreign.MemorySegment ppStatsString, int detailedMap)
    {
        try {MTD$vmaBuildStatsString.invokeExact(allocator, ppStatsString, detailedMap);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void vmaFreeStatsString(java.lang.foreign.MemorySegment allocator, java.lang.foreign.MemorySegment pStatsString)
    {
        try {MTD$vmaFreeStatsString.invokeExact(allocator, pStatsString);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    static
    {
        java.lang.System.loadLibrary("libvma");
        gSystemLinker = java.lang.foreign.Linker.nativeLinker();
        gLibLookup = name -> java.lang.foreign.SymbolLookup.loaderLookup().find(name).or(() -> gSystemLinker.defaultLookup().find(name));

        MTD_ADDRESS$vmaCreateAllocator = gLibLookup.find("vmaCreateAllocator").orElseThrow();
        MTD$vmaCreateAllocator = gSystemLinker.downcallHandle(MTD_ADDRESS$vmaCreateAllocator, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$vmaDestroyAllocator = gLibLookup.find("vmaDestroyAllocator").orElseThrow();
        MTD$vmaDestroyAllocator = gSystemLinker.downcallHandle(MTD_ADDRESS$vmaDestroyAllocator, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$vmaGetAllocatorInfo = gLibLookup.find("vmaGetAllocatorInfo").orElseThrow();
        MTD$vmaGetAllocatorInfo = gSystemLinker.downcallHandle(MTD_ADDRESS$vmaGetAllocatorInfo, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$vmaGetPhysicalDeviceProperties = gLibLookup.find("vmaGetPhysicalDeviceProperties").orElseThrow();
        MTD$vmaGetPhysicalDeviceProperties = gSystemLinker.downcallHandle(MTD_ADDRESS$vmaGetPhysicalDeviceProperties, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$vmaGetMemoryProperties = gLibLookup.find("vmaGetMemoryProperties").orElseThrow();
        MTD$vmaGetMemoryProperties = gSystemLinker.downcallHandle(MTD_ADDRESS$vmaGetMemoryProperties, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$vmaGetMemoryTypeProperties = gLibLookup.find("vmaGetMemoryTypeProperties").orElseThrow();
        MTD$vmaGetMemoryTypeProperties = gSystemLinker.downcallHandle(MTD_ADDRESS$vmaGetMemoryTypeProperties, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$vmaSetCurrentFrameIndex = gLibLookup.find("vmaSetCurrentFrameIndex").orElseThrow();
        MTD$vmaSetCurrentFrameIndex = gSystemLinker.downcallHandle(MTD_ADDRESS$vmaSetCurrentFrameIndex, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$vmaCalculateStatistics = gLibLookup.find("vmaCalculateStatistics").orElseThrow();
        MTD$vmaCalculateStatistics = gSystemLinker.downcallHandle(MTD_ADDRESS$vmaCalculateStatistics, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$vmaGetHeapBudgets = gLibLookup.find("vmaGetHeapBudgets").orElseThrow();
        MTD$vmaGetHeapBudgets = gSystemLinker.downcallHandle(MTD_ADDRESS$vmaGetHeapBudgets, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$vmaFindMemoryTypeIndex = gLibLookup.find("vmaFindMemoryTypeIndex").orElseThrow();
        MTD$vmaFindMemoryTypeIndex = gSystemLinker.downcallHandle(MTD_ADDRESS$vmaFindMemoryTypeIndex, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$vmaFindMemoryTypeIndexForBufferInfo = gLibLookup.find("vmaFindMemoryTypeIndexForBufferInfo").orElseThrow();
        MTD$vmaFindMemoryTypeIndexForBufferInfo = gSystemLinker.downcallHandle(MTD_ADDRESS$vmaFindMemoryTypeIndexForBufferInfo, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$vmaFindMemoryTypeIndexForImageInfo = gLibLookup.find("vmaFindMemoryTypeIndexForImageInfo").orElseThrow();
        MTD$vmaFindMemoryTypeIndexForImageInfo = gSystemLinker.downcallHandle(MTD_ADDRESS$vmaFindMemoryTypeIndexForImageInfo, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$vmaCreatePool = gLibLookup.find("vmaCreatePool").orElseThrow();
        MTD$vmaCreatePool = gSystemLinker.downcallHandle(MTD_ADDRESS$vmaCreatePool, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$vmaDestroyPool = gLibLookup.find("vmaDestroyPool").orElseThrow();
        MTD$vmaDestroyPool = gSystemLinker.downcallHandle(MTD_ADDRESS$vmaDestroyPool, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$vmaGetPoolStatistics = gLibLookup.find("vmaGetPoolStatistics").orElseThrow();
        MTD$vmaGetPoolStatistics = gSystemLinker.downcallHandle(MTD_ADDRESS$vmaGetPoolStatistics, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$vmaCalculatePoolStatistics = gLibLookup.find("vmaCalculatePoolStatistics").orElseThrow();
        MTD$vmaCalculatePoolStatistics = gSystemLinker.downcallHandle(MTD_ADDRESS$vmaCalculatePoolStatistics, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$vmaCheckPoolCorruption = gLibLookup.find("vmaCheckPoolCorruption").orElseThrow();
        MTD$vmaCheckPoolCorruption = gSystemLinker.downcallHandle(MTD_ADDRESS$vmaCheckPoolCorruption, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$vmaGetPoolName = gLibLookup.find("vmaGetPoolName").orElseThrow();
        MTD$vmaGetPoolName = gSystemLinker.downcallHandle(MTD_ADDRESS$vmaGetPoolName, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$vmaSetPoolName = gLibLookup.find("vmaSetPoolName").orElseThrow();
        MTD$vmaSetPoolName = gSystemLinker.downcallHandle(MTD_ADDRESS$vmaSetPoolName, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$vmaAllocateMemory = gLibLookup.find("vmaAllocateMemory").orElseThrow();
        MTD$vmaAllocateMemory = gSystemLinker.downcallHandle(MTD_ADDRESS$vmaAllocateMemory, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$vmaAllocateMemoryPages = gLibLookup.find("vmaAllocateMemoryPages").orElseThrow();
        MTD$vmaAllocateMemoryPages = gSystemLinker.downcallHandle(MTD_ADDRESS$vmaAllocateMemoryPages, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$vmaAllocateMemoryForBuffer = gLibLookup.find("vmaAllocateMemoryForBuffer").orElseThrow();
        MTD$vmaAllocateMemoryForBuffer = gSystemLinker.downcallHandle(MTD_ADDRESS$vmaAllocateMemoryForBuffer, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$vmaAllocateMemoryForImage = gLibLookup.find("vmaAllocateMemoryForImage").orElseThrow();
        MTD$vmaAllocateMemoryForImage = gSystemLinker.downcallHandle(MTD_ADDRESS$vmaAllocateMemoryForImage, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$vmaFreeMemory = gLibLookup.find("vmaFreeMemory").orElseThrow();
        MTD$vmaFreeMemory = gSystemLinker.downcallHandle(MTD_ADDRESS$vmaFreeMemory, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$vmaFreeMemoryPages = gLibLookup.find("vmaFreeMemoryPages").orElseThrow();
        MTD$vmaFreeMemoryPages = gSystemLinker.downcallHandle(MTD_ADDRESS$vmaFreeMemoryPages, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$vmaGetAllocationInfo = gLibLookup.find("vmaGetAllocationInfo").orElseThrow();
        MTD$vmaGetAllocationInfo = gSystemLinker.downcallHandle(MTD_ADDRESS$vmaGetAllocationInfo, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$vmaGetAllocationInfo2 = gLibLookup.find("vmaGetAllocationInfo2").orElseThrow();
        MTD$vmaGetAllocationInfo2 = gSystemLinker.downcallHandle(MTD_ADDRESS$vmaGetAllocationInfo2, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$vmaSetAllocationUserData = gLibLookup.find("vmaSetAllocationUserData").orElseThrow();
        MTD$vmaSetAllocationUserData = gSystemLinker.downcallHandle(MTD_ADDRESS$vmaSetAllocationUserData, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$vmaSetAllocationName = gLibLookup.find("vmaSetAllocationName").orElseThrow();
        MTD$vmaSetAllocationName = gSystemLinker.downcallHandle(MTD_ADDRESS$vmaSetAllocationName, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$vmaGetAllocationMemoryProperties = gLibLookup.find("vmaGetAllocationMemoryProperties").orElseThrow();
        MTD$vmaGetAllocationMemoryProperties = gSystemLinker.downcallHandle(MTD_ADDRESS$vmaGetAllocationMemoryProperties, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$vmaMapMemory = gLibLookup.find("vmaMapMemory").orElseThrow();
        MTD$vmaMapMemory = gSystemLinker.downcallHandle(MTD_ADDRESS$vmaMapMemory, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$vmaUnmapMemory = gLibLookup.find("vmaUnmapMemory").orElseThrow();
        MTD$vmaUnmapMemory = gSystemLinker.downcallHandle(MTD_ADDRESS$vmaUnmapMemory, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$vmaFlushAllocation = gLibLookup.find("vmaFlushAllocation").orElseThrow();
        MTD$vmaFlushAllocation = gSystemLinker.downcallHandle(MTD_ADDRESS$vmaFlushAllocation, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.JAVA_LONG));
        MTD_ADDRESS$vmaInvalidateAllocation = gLibLookup.find("vmaInvalidateAllocation").orElseThrow();
        MTD$vmaInvalidateAllocation = gSystemLinker.downcallHandle(MTD_ADDRESS$vmaInvalidateAllocation, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.JAVA_LONG));
        MTD_ADDRESS$vmaFlushAllocations = gLibLookup.find("vmaFlushAllocations").orElseThrow();
        MTD$vmaFlushAllocations = gSystemLinker.downcallHandle(MTD_ADDRESS$vmaFlushAllocations, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$vmaInvalidateAllocations = gLibLookup.find("vmaInvalidateAllocations").orElseThrow();
        MTD$vmaInvalidateAllocations = gSystemLinker.downcallHandle(MTD_ADDRESS$vmaInvalidateAllocations, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$vmaCheckCorruption = gLibLookup.find("vmaCheckCorruption").orElseThrow();
        MTD$vmaCheckCorruption = gSystemLinker.downcallHandle(MTD_ADDRESS$vmaCheckCorruption, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$vmaBeginDefragmentation = gLibLookup.find("vmaBeginDefragmentation").orElseThrow();
        MTD$vmaBeginDefragmentation = gSystemLinker.downcallHandle(MTD_ADDRESS$vmaBeginDefragmentation, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$vmaEndDefragmentation = gLibLookup.find("vmaEndDefragmentation").orElseThrow();
        MTD$vmaEndDefragmentation = gSystemLinker.downcallHandle(MTD_ADDRESS$vmaEndDefragmentation, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$vmaBeginDefragmentationPass = gLibLookup.find("vmaBeginDefragmentationPass").orElseThrow();
        MTD$vmaBeginDefragmentationPass = gSystemLinker.downcallHandle(MTD_ADDRESS$vmaBeginDefragmentationPass, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$vmaEndDefragmentationPass = gLibLookup.find("vmaEndDefragmentationPass").orElseThrow();
        MTD$vmaEndDefragmentationPass = gSystemLinker.downcallHandle(MTD_ADDRESS$vmaEndDefragmentationPass, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$vmaBindBufferMemory = gLibLookup.find("vmaBindBufferMemory").orElseThrow();
        MTD$vmaBindBufferMemory = gSystemLinker.downcallHandle(MTD_ADDRESS$vmaBindBufferMemory, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$vmaBindBufferMemory2 = gLibLookup.find("vmaBindBufferMemory2").orElseThrow();
        MTD$vmaBindBufferMemory2 = gSystemLinker.downcallHandle(MTD_ADDRESS$vmaBindBufferMemory2, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$vmaBindImageMemory = gLibLookup.find("vmaBindImageMemory").orElseThrow();
        MTD$vmaBindImageMemory = gSystemLinker.downcallHandle(MTD_ADDRESS$vmaBindImageMemory, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$vmaBindImageMemory2 = gLibLookup.find("vmaBindImageMemory2").orElseThrow();
        MTD$vmaBindImageMemory2 = gSystemLinker.downcallHandle(MTD_ADDRESS$vmaBindImageMemory2, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$vmaCreateBuffer = gLibLookup.find("vmaCreateBuffer").orElseThrow();
        MTD$vmaCreateBuffer = gSystemLinker.downcallHandle(MTD_ADDRESS$vmaCreateBuffer, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$vmaCreateBufferWithAlignment = gLibLookup.find("vmaCreateBufferWithAlignment").orElseThrow();
        MTD$vmaCreateBufferWithAlignment = gSystemLinker.downcallHandle(MTD_ADDRESS$vmaCreateBufferWithAlignment, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$vmaCreateAliasingBuffer = gLibLookup.find("vmaCreateAliasingBuffer").orElseThrow();
        MTD$vmaCreateAliasingBuffer = gSystemLinker.downcallHandle(MTD_ADDRESS$vmaCreateAliasingBuffer, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$vmaCreateAliasingBuffer2 = gLibLookup.find("vmaCreateAliasingBuffer2").orElseThrow();
        MTD$vmaCreateAliasingBuffer2 = gSystemLinker.downcallHandle(MTD_ADDRESS$vmaCreateAliasingBuffer2, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$vmaDestroyBuffer = gLibLookup.find("vmaDestroyBuffer").orElseThrow();
        MTD$vmaDestroyBuffer = gSystemLinker.downcallHandle(MTD_ADDRESS$vmaDestroyBuffer, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$vmaCreateImage = gLibLookup.find("vmaCreateImage").orElseThrow();
        MTD$vmaCreateImage = gSystemLinker.downcallHandle(MTD_ADDRESS$vmaCreateImage, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$vmaCreateAliasingImage = gLibLookup.find("vmaCreateAliasingImage").orElseThrow();
        MTD$vmaCreateAliasingImage = gSystemLinker.downcallHandle(MTD_ADDRESS$vmaCreateAliasingImage, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$vmaCreateAliasingImage2 = gLibLookup.find("vmaCreateAliasingImage2").orElseThrow();
        MTD$vmaCreateAliasingImage2 = gSystemLinker.downcallHandle(MTD_ADDRESS$vmaCreateAliasingImage2, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$vmaDestroyImage = gLibLookup.find("vmaDestroyImage").orElseThrow();
        MTD$vmaDestroyImage = gSystemLinker.downcallHandle(MTD_ADDRESS$vmaDestroyImage, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$vmaCreateVirtualBlock = gLibLookup.find("vmaCreateVirtualBlock").orElseThrow();
        MTD$vmaCreateVirtualBlock = gSystemLinker.downcallHandle(MTD_ADDRESS$vmaCreateVirtualBlock, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$vmaDestroyVirtualBlock = gLibLookup.find("vmaDestroyVirtualBlock").orElseThrow();
        MTD$vmaDestroyVirtualBlock = gSystemLinker.downcallHandle(MTD_ADDRESS$vmaDestroyVirtualBlock, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$vmaIsVirtualBlockEmpty = gLibLookup.find("vmaIsVirtualBlockEmpty").orElseThrow();
        MTD$vmaIsVirtualBlockEmpty = gSystemLinker.downcallHandle(MTD_ADDRESS$vmaIsVirtualBlockEmpty, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$vmaGetVirtualAllocationInfo = gLibLookup.find("vmaGetVirtualAllocationInfo").orElseThrow();
        MTD$vmaGetVirtualAllocationInfo = gSystemLinker.downcallHandle(MTD_ADDRESS$vmaGetVirtualAllocationInfo, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$vmaVirtualAllocate = gLibLookup.find("vmaVirtualAllocate").orElseThrow();
        MTD$vmaVirtualAllocate = gSystemLinker.downcallHandle(MTD_ADDRESS$vmaVirtualAllocate, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$vmaVirtualFree = gLibLookup.find("vmaVirtualFree").orElseThrow();
        MTD$vmaVirtualFree = gSystemLinker.downcallHandle(MTD_ADDRESS$vmaVirtualFree, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$vmaClearVirtualBlock = gLibLookup.find("vmaClearVirtualBlock").orElseThrow();
        MTD$vmaClearVirtualBlock = gSystemLinker.downcallHandle(MTD_ADDRESS$vmaClearVirtualBlock, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$vmaSetVirtualAllocationUserData = gLibLookup.find("vmaSetVirtualAllocationUserData").orElseThrow();
        MTD$vmaSetVirtualAllocationUserData = gSystemLinker.downcallHandle(MTD_ADDRESS$vmaSetVirtualAllocationUserData, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$vmaGetVirtualBlockStatistics = gLibLookup.find("vmaGetVirtualBlockStatistics").orElseThrow();
        MTD$vmaGetVirtualBlockStatistics = gSystemLinker.downcallHandle(MTD_ADDRESS$vmaGetVirtualBlockStatistics, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$vmaCalculateVirtualBlockStatistics = gLibLookup.find("vmaCalculateVirtualBlockStatistics").orElseThrow();
        MTD$vmaCalculateVirtualBlockStatistics = gSystemLinker.downcallHandle(MTD_ADDRESS$vmaCalculateVirtualBlockStatistics, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$vmaBuildVirtualBlockStatsString = gLibLookup.find("vmaBuildVirtualBlockStatsString").orElseThrow();
        MTD$vmaBuildVirtualBlockStatsString = gSystemLinker.downcallHandle(MTD_ADDRESS$vmaBuildVirtualBlockStatsString, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$vmaFreeVirtualBlockStatsString = gLibLookup.find("vmaFreeVirtualBlockStatsString").orElseThrow();
        MTD$vmaFreeVirtualBlockStatsString = gSystemLinker.downcallHandle(MTD_ADDRESS$vmaFreeVirtualBlockStatsString, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$vmaBuildStatsString = gLibLookup.find("vmaBuildStatsString").orElseThrow();
        MTD$vmaBuildStatsString = gSystemLinker.downcallHandle(MTD_ADDRESS$vmaBuildStatsString, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$vmaFreeStatsString = gLibLookup.find("vmaFreeStatsString").orElseThrow();
        MTD$vmaFreeStatsString = gSystemLinker.downcallHandle(MTD_ADDRESS$vmaFreeStatsString, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
    }
}
