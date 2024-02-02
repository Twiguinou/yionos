package vma;

public record VmaVulkanFunctions(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.AddressLayout LAYOUT$vkGetInstanceProcAddr = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$vkGetInstanceProcAddr = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$vkGetDeviceProcAddr = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$vkGetDeviceProcAddr = 8L;
    public static final java.lang.foreign.AddressLayout LAYOUT$vkGetPhysicalDeviceProperties = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$vkGetPhysicalDeviceProperties = 16L;
    public static final java.lang.foreign.AddressLayout LAYOUT$vkGetPhysicalDeviceMemoryProperties = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$vkGetPhysicalDeviceMemoryProperties = 24L;
    public static final java.lang.foreign.AddressLayout LAYOUT$vkAllocateMemory = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$vkAllocateMemory = 32L;
    public static final java.lang.foreign.AddressLayout LAYOUT$vkFreeMemory = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$vkFreeMemory = 40L;
    public static final java.lang.foreign.AddressLayout LAYOUT$vkMapMemory = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$vkMapMemory = 48L;
    public static final java.lang.foreign.AddressLayout LAYOUT$vkUnmapMemory = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$vkUnmapMemory = 56L;
    public static final java.lang.foreign.AddressLayout LAYOUT$vkFlushMappedMemoryRanges = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$vkFlushMappedMemoryRanges = 64L;
    public static final java.lang.foreign.AddressLayout LAYOUT$vkInvalidateMappedMemoryRanges = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$vkInvalidateMappedMemoryRanges = 72L;
    public static final java.lang.foreign.AddressLayout LAYOUT$vkBindBufferMemory = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$vkBindBufferMemory = 80L;
    public static final java.lang.foreign.AddressLayout LAYOUT$vkBindImageMemory = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$vkBindImageMemory = 88L;
    public static final java.lang.foreign.AddressLayout LAYOUT$vkGetBufferMemoryRequirements = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$vkGetBufferMemoryRequirements = 96L;
    public static final java.lang.foreign.AddressLayout LAYOUT$vkGetImageMemoryRequirements = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$vkGetImageMemoryRequirements = 104L;
    public static final java.lang.foreign.AddressLayout LAYOUT$vkCreateBuffer = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$vkCreateBuffer = 112L;
    public static final java.lang.foreign.AddressLayout LAYOUT$vkDestroyBuffer = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$vkDestroyBuffer = 120L;
    public static final java.lang.foreign.AddressLayout LAYOUT$vkCreateImage = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$vkCreateImage = 128L;
    public static final java.lang.foreign.AddressLayout LAYOUT$vkDestroyImage = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$vkDestroyImage = 136L;
    public static final java.lang.foreign.AddressLayout LAYOUT$vkCmdCopyBuffer = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$vkCmdCopyBuffer = 144L;
    public static final java.lang.foreign.AddressLayout LAYOUT$vkGetBufferMemoryRequirements2KHR = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$vkGetBufferMemoryRequirements2KHR = 152L;
    public static final java.lang.foreign.AddressLayout LAYOUT$vkGetImageMemoryRequirements2KHR = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$vkGetImageMemoryRequirements2KHR = 160L;
    public static final java.lang.foreign.AddressLayout LAYOUT$vkBindBufferMemory2KHR = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$vkBindBufferMemory2KHR = 168L;
    public static final java.lang.foreign.AddressLayout LAYOUT$vkBindImageMemory2KHR = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$vkBindImageMemory2KHR = 176L;
    public static final java.lang.foreign.AddressLayout LAYOUT$vkGetPhysicalDeviceMemoryProperties2KHR = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$vkGetPhysicalDeviceMemoryProperties2KHR = 184L;
    public static final java.lang.foreign.AddressLayout LAYOUT$vkGetDeviceBufferMemoryRequirements = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$vkGetDeviceBufferMemoryRequirements = 192L;
    public static final java.lang.foreign.AddressLayout LAYOUT$vkGetDeviceImageMemoryRequirements = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$vkGetDeviceImageMemoryRequirements = 200L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$vkGetInstanceProcAddr,
            LAYOUT$vkGetDeviceProcAddr,
            LAYOUT$vkGetPhysicalDeviceProperties,
            LAYOUT$vkGetPhysicalDeviceMemoryProperties,
            LAYOUT$vkAllocateMemory,
            LAYOUT$vkFreeMemory,
            LAYOUT$vkMapMemory,
            LAYOUT$vkUnmapMemory,
            LAYOUT$vkFlushMappedMemoryRanges,
            LAYOUT$vkInvalidateMappedMemoryRanges,
            LAYOUT$vkBindBufferMemory,
            LAYOUT$vkBindImageMemory,
            LAYOUT$vkGetBufferMemoryRequirements,
            LAYOUT$vkGetImageMemoryRequirements,
            LAYOUT$vkCreateBuffer,
            LAYOUT$vkDestroyBuffer,
            LAYOUT$vkCreateImage,
            LAYOUT$vkDestroyImage,
            LAYOUT$vkCmdCopyBuffer,
            LAYOUT$vkGetBufferMemoryRequirements2KHR,
            LAYOUT$vkGetImageMemoryRequirements2KHR,
            LAYOUT$vkBindBufferMemory2KHR,
            LAYOUT$vkBindImageMemory2KHR,
            LAYOUT$vkGetPhysicalDeviceMemoryProperties2KHR,
            LAYOUT$vkGetDeviceBufferMemoryRequirements,
            LAYOUT$vkGetDeviceImageMemoryRequirements
    ).withName("VmaVulkanFunctions");

    public VmaVulkanFunctions(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VmaVulkanFunctions getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VmaVulkanFunctions(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public java.lang.foreign.MemorySegment vkGetInstanceProcAddr() {return this.ptr.get(LAYOUT$vkGetInstanceProcAddr, OFFSET$vkGetInstanceProcAddr);}
    public void vkGetInstanceProcAddr(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$vkGetInstanceProcAddr, OFFSET$vkGetInstanceProcAddr, value);}
    public java.lang.foreign.MemorySegment vkGetInstanceProcAddr_ptr() {return this.ptr.asSlice(OFFSET$vkGetInstanceProcAddr, LAYOUT$vkGetInstanceProcAddr);}

    public java.lang.foreign.MemorySegment vkGetDeviceProcAddr() {return this.ptr.get(LAYOUT$vkGetDeviceProcAddr, OFFSET$vkGetDeviceProcAddr);}
    public void vkGetDeviceProcAddr(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$vkGetDeviceProcAddr, OFFSET$vkGetDeviceProcAddr, value);}
    public java.lang.foreign.MemorySegment vkGetDeviceProcAddr_ptr() {return this.ptr.asSlice(OFFSET$vkGetDeviceProcAddr, LAYOUT$vkGetDeviceProcAddr);}

    public java.lang.foreign.MemorySegment vkGetPhysicalDeviceProperties() {return this.ptr.get(LAYOUT$vkGetPhysicalDeviceProperties, OFFSET$vkGetPhysicalDeviceProperties);}
    public void vkGetPhysicalDeviceProperties(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$vkGetPhysicalDeviceProperties, OFFSET$vkGetPhysicalDeviceProperties, value);}
    public java.lang.foreign.MemorySegment vkGetPhysicalDeviceProperties_ptr() {return this.ptr.asSlice(OFFSET$vkGetPhysicalDeviceProperties, LAYOUT$vkGetPhysicalDeviceProperties);}

    public java.lang.foreign.MemorySegment vkGetPhysicalDeviceMemoryProperties() {return this.ptr.get(LAYOUT$vkGetPhysicalDeviceMemoryProperties, OFFSET$vkGetPhysicalDeviceMemoryProperties);}
    public void vkGetPhysicalDeviceMemoryProperties(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$vkGetPhysicalDeviceMemoryProperties, OFFSET$vkGetPhysicalDeviceMemoryProperties, value);}
    public java.lang.foreign.MemorySegment vkGetPhysicalDeviceMemoryProperties_ptr() {return this.ptr.asSlice(OFFSET$vkGetPhysicalDeviceMemoryProperties, LAYOUT$vkGetPhysicalDeviceMemoryProperties);}

    public java.lang.foreign.MemorySegment vkAllocateMemory() {return this.ptr.get(LAYOUT$vkAllocateMemory, OFFSET$vkAllocateMemory);}
    public void vkAllocateMemory(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$vkAllocateMemory, OFFSET$vkAllocateMemory, value);}
    public java.lang.foreign.MemorySegment vkAllocateMemory_ptr() {return this.ptr.asSlice(OFFSET$vkAllocateMemory, LAYOUT$vkAllocateMemory);}

    public java.lang.foreign.MemorySegment vkFreeMemory() {return this.ptr.get(LAYOUT$vkFreeMemory, OFFSET$vkFreeMemory);}
    public void vkFreeMemory(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$vkFreeMemory, OFFSET$vkFreeMemory, value);}
    public java.lang.foreign.MemorySegment vkFreeMemory_ptr() {return this.ptr.asSlice(OFFSET$vkFreeMemory, LAYOUT$vkFreeMemory);}

    public java.lang.foreign.MemorySegment vkMapMemory() {return this.ptr.get(LAYOUT$vkMapMemory, OFFSET$vkMapMemory);}
    public void vkMapMemory(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$vkMapMemory, OFFSET$vkMapMemory, value);}
    public java.lang.foreign.MemorySegment vkMapMemory_ptr() {return this.ptr.asSlice(OFFSET$vkMapMemory, LAYOUT$vkMapMemory);}

    public java.lang.foreign.MemorySegment vkUnmapMemory() {return this.ptr.get(LAYOUT$vkUnmapMemory, OFFSET$vkUnmapMemory);}
    public void vkUnmapMemory(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$vkUnmapMemory, OFFSET$vkUnmapMemory, value);}
    public java.lang.foreign.MemorySegment vkUnmapMemory_ptr() {return this.ptr.asSlice(OFFSET$vkUnmapMemory, LAYOUT$vkUnmapMemory);}

    public java.lang.foreign.MemorySegment vkFlushMappedMemoryRanges() {return this.ptr.get(LAYOUT$vkFlushMappedMemoryRanges, OFFSET$vkFlushMappedMemoryRanges);}
    public void vkFlushMappedMemoryRanges(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$vkFlushMappedMemoryRanges, OFFSET$vkFlushMappedMemoryRanges, value);}
    public java.lang.foreign.MemorySegment vkFlushMappedMemoryRanges_ptr() {return this.ptr.asSlice(OFFSET$vkFlushMappedMemoryRanges, LAYOUT$vkFlushMappedMemoryRanges);}

    public java.lang.foreign.MemorySegment vkInvalidateMappedMemoryRanges() {return this.ptr.get(LAYOUT$vkInvalidateMappedMemoryRanges, OFFSET$vkInvalidateMappedMemoryRanges);}
    public void vkInvalidateMappedMemoryRanges(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$vkInvalidateMappedMemoryRanges, OFFSET$vkInvalidateMappedMemoryRanges, value);}
    public java.lang.foreign.MemorySegment vkInvalidateMappedMemoryRanges_ptr() {return this.ptr.asSlice(OFFSET$vkInvalidateMappedMemoryRanges, LAYOUT$vkInvalidateMappedMemoryRanges);}

    public java.lang.foreign.MemorySegment vkBindBufferMemory() {return this.ptr.get(LAYOUT$vkBindBufferMemory, OFFSET$vkBindBufferMemory);}
    public void vkBindBufferMemory(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$vkBindBufferMemory, OFFSET$vkBindBufferMemory, value);}
    public java.lang.foreign.MemorySegment vkBindBufferMemory_ptr() {return this.ptr.asSlice(OFFSET$vkBindBufferMemory, LAYOUT$vkBindBufferMemory);}

    public java.lang.foreign.MemorySegment vkBindImageMemory() {return this.ptr.get(LAYOUT$vkBindImageMemory, OFFSET$vkBindImageMemory);}
    public void vkBindImageMemory(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$vkBindImageMemory, OFFSET$vkBindImageMemory, value);}
    public java.lang.foreign.MemorySegment vkBindImageMemory_ptr() {return this.ptr.asSlice(OFFSET$vkBindImageMemory, LAYOUT$vkBindImageMemory);}

    public java.lang.foreign.MemorySegment vkGetBufferMemoryRequirements() {return this.ptr.get(LAYOUT$vkGetBufferMemoryRequirements, OFFSET$vkGetBufferMemoryRequirements);}
    public void vkGetBufferMemoryRequirements(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$vkGetBufferMemoryRequirements, OFFSET$vkGetBufferMemoryRequirements, value);}
    public java.lang.foreign.MemorySegment vkGetBufferMemoryRequirements_ptr() {return this.ptr.asSlice(OFFSET$vkGetBufferMemoryRequirements, LAYOUT$vkGetBufferMemoryRequirements);}

    public java.lang.foreign.MemorySegment vkGetImageMemoryRequirements() {return this.ptr.get(LAYOUT$vkGetImageMemoryRequirements, OFFSET$vkGetImageMemoryRequirements);}
    public void vkGetImageMemoryRequirements(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$vkGetImageMemoryRequirements, OFFSET$vkGetImageMemoryRequirements, value);}
    public java.lang.foreign.MemorySegment vkGetImageMemoryRequirements_ptr() {return this.ptr.asSlice(OFFSET$vkGetImageMemoryRequirements, LAYOUT$vkGetImageMemoryRequirements);}

    public java.lang.foreign.MemorySegment vkCreateBuffer() {return this.ptr.get(LAYOUT$vkCreateBuffer, OFFSET$vkCreateBuffer);}
    public void vkCreateBuffer(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$vkCreateBuffer, OFFSET$vkCreateBuffer, value);}
    public java.lang.foreign.MemorySegment vkCreateBuffer_ptr() {return this.ptr.asSlice(OFFSET$vkCreateBuffer, LAYOUT$vkCreateBuffer);}

    public java.lang.foreign.MemorySegment vkDestroyBuffer() {return this.ptr.get(LAYOUT$vkDestroyBuffer, OFFSET$vkDestroyBuffer);}
    public void vkDestroyBuffer(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$vkDestroyBuffer, OFFSET$vkDestroyBuffer, value);}
    public java.lang.foreign.MemorySegment vkDestroyBuffer_ptr() {return this.ptr.asSlice(OFFSET$vkDestroyBuffer, LAYOUT$vkDestroyBuffer);}

    public java.lang.foreign.MemorySegment vkCreateImage() {return this.ptr.get(LAYOUT$vkCreateImage, OFFSET$vkCreateImage);}
    public void vkCreateImage(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$vkCreateImage, OFFSET$vkCreateImage, value);}
    public java.lang.foreign.MemorySegment vkCreateImage_ptr() {return this.ptr.asSlice(OFFSET$vkCreateImage, LAYOUT$vkCreateImage);}

    public java.lang.foreign.MemorySegment vkDestroyImage() {return this.ptr.get(LAYOUT$vkDestroyImage, OFFSET$vkDestroyImage);}
    public void vkDestroyImage(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$vkDestroyImage, OFFSET$vkDestroyImage, value);}
    public java.lang.foreign.MemorySegment vkDestroyImage_ptr() {return this.ptr.asSlice(OFFSET$vkDestroyImage, LAYOUT$vkDestroyImage);}

    public java.lang.foreign.MemorySegment vkCmdCopyBuffer() {return this.ptr.get(LAYOUT$vkCmdCopyBuffer, OFFSET$vkCmdCopyBuffer);}
    public void vkCmdCopyBuffer(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$vkCmdCopyBuffer, OFFSET$vkCmdCopyBuffer, value);}
    public java.lang.foreign.MemorySegment vkCmdCopyBuffer_ptr() {return this.ptr.asSlice(OFFSET$vkCmdCopyBuffer, LAYOUT$vkCmdCopyBuffer);}

    public java.lang.foreign.MemorySegment vkGetBufferMemoryRequirements2KHR() {return this.ptr.get(LAYOUT$vkGetBufferMemoryRequirements2KHR, OFFSET$vkGetBufferMemoryRequirements2KHR);}
    public void vkGetBufferMemoryRequirements2KHR(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$vkGetBufferMemoryRequirements2KHR, OFFSET$vkGetBufferMemoryRequirements2KHR, value);}
    public java.lang.foreign.MemorySegment vkGetBufferMemoryRequirements2KHR_ptr() {return this.ptr.asSlice(OFFSET$vkGetBufferMemoryRequirements2KHR, LAYOUT$vkGetBufferMemoryRequirements2KHR);}

    public java.lang.foreign.MemorySegment vkGetImageMemoryRequirements2KHR() {return this.ptr.get(LAYOUT$vkGetImageMemoryRequirements2KHR, OFFSET$vkGetImageMemoryRequirements2KHR);}
    public void vkGetImageMemoryRequirements2KHR(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$vkGetImageMemoryRequirements2KHR, OFFSET$vkGetImageMemoryRequirements2KHR, value);}
    public java.lang.foreign.MemorySegment vkGetImageMemoryRequirements2KHR_ptr() {return this.ptr.asSlice(OFFSET$vkGetImageMemoryRequirements2KHR, LAYOUT$vkGetImageMemoryRequirements2KHR);}

    public java.lang.foreign.MemorySegment vkBindBufferMemory2KHR() {return this.ptr.get(LAYOUT$vkBindBufferMemory2KHR, OFFSET$vkBindBufferMemory2KHR);}
    public void vkBindBufferMemory2KHR(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$vkBindBufferMemory2KHR, OFFSET$vkBindBufferMemory2KHR, value);}
    public java.lang.foreign.MemorySegment vkBindBufferMemory2KHR_ptr() {return this.ptr.asSlice(OFFSET$vkBindBufferMemory2KHR, LAYOUT$vkBindBufferMemory2KHR);}

    public java.lang.foreign.MemorySegment vkBindImageMemory2KHR() {return this.ptr.get(LAYOUT$vkBindImageMemory2KHR, OFFSET$vkBindImageMemory2KHR);}
    public void vkBindImageMemory2KHR(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$vkBindImageMemory2KHR, OFFSET$vkBindImageMemory2KHR, value);}
    public java.lang.foreign.MemorySegment vkBindImageMemory2KHR_ptr() {return this.ptr.asSlice(OFFSET$vkBindImageMemory2KHR, LAYOUT$vkBindImageMemory2KHR);}

    public java.lang.foreign.MemorySegment vkGetPhysicalDeviceMemoryProperties2KHR() {return this.ptr.get(LAYOUT$vkGetPhysicalDeviceMemoryProperties2KHR, OFFSET$vkGetPhysicalDeviceMemoryProperties2KHR);}
    public void vkGetPhysicalDeviceMemoryProperties2KHR(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$vkGetPhysicalDeviceMemoryProperties2KHR, OFFSET$vkGetPhysicalDeviceMemoryProperties2KHR, value);}
    public java.lang.foreign.MemorySegment vkGetPhysicalDeviceMemoryProperties2KHR_ptr() {return this.ptr.asSlice(OFFSET$vkGetPhysicalDeviceMemoryProperties2KHR, LAYOUT$vkGetPhysicalDeviceMemoryProperties2KHR);}

    public java.lang.foreign.MemorySegment vkGetDeviceBufferMemoryRequirements() {return this.ptr.get(LAYOUT$vkGetDeviceBufferMemoryRequirements, OFFSET$vkGetDeviceBufferMemoryRequirements);}
    public void vkGetDeviceBufferMemoryRequirements(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$vkGetDeviceBufferMemoryRequirements, OFFSET$vkGetDeviceBufferMemoryRequirements, value);}
    public java.lang.foreign.MemorySegment vkGetDeviceBufferMemoryRequirements_ptr() {return this.ptr.asSlice(OFFSET$vkGetDeviceBufferMemoryRequirements, LAYOUT$vkGetDeviceBufferMemoryRequirements);}

    public java.lang.foreign.MemorySegment vkGetDeviceImageMemoryRequirements() {return this.ptr.get(LAYOUT$vkGetDeviceImageMemoryRequirements, OFFSET$vkGetDeviceImageMemoryRequirements);}
    public void vkGetDeviceImageMemoryRequirements(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$vkGetDeviceImageMemoryRequirements, OFFSET$vkGetDeviceImageMemoryRequirements, value);}
    public java.lang.foreign.MemorySegment vkGetDeviceImageMemoryRequirements_ptr() {return this.ptr.asSlice(OFFSET$vkGetDeviceImageMemoryRequirements, LAYOUT$vkGetDeviceImageMemoryRequirements);}
}
