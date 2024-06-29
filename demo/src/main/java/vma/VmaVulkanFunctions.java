package vma;

public record VmaVulkanFunctions(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.AddressLayout LAYOUT__vkGetInstanceProcAddr = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__vkGetInstanceProcAddr = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__vkGetDeviceProcAddr = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__vkGetDeviceProcAddr = 8;
    public static final java.lang.foreign.AddressLayout LAYOUT__vkGetPhysicalDeviceProperties = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__vkGetPhysicalDeviceProperties = 16;
    public static final java.lang.foreign.AddressLayout LAYOUT__vkGetPhysicalDeviceMemoryProperties = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__vkGetPhysicalDeviceMemoryProperties = 24;
    public static final java.lang.foreign.AddressLayout LAYOUT__vkAllocateMemory = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__vkAllocateMemory = 32;
    public static final java.lang.foreign.AddressLayout LAYOUT__vkFreeMemory = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__vkFreeMemory = 40;
    public static final java.lang.foreign.AddressLayout LAYOUT__vkMapMemory = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__vkMapMemory = 48;
    public static final java.lang.foreign.AddressLayout LAYOUT__vkUnmapMemory = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__vkUnmapMemory = 56;
    public static final java.lang.foreign.AddressLayout LAYOUT__vkFlushMappedMemoryRanges = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__vkFlushMappedMemoryRanges = 64;
    public static final java.lang.foreign.AddressLayout LAYOUT__vkInvalidateMappedMemoryRanges = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__vkInvalidateMappedMemoryRanges = 72;
    public static final java.lang.foreign.AddressLayout LAYOUT__vkBindBufferMemory = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__vkBindBufferMemory = 80;
    public static final java.lang.foreign.AddressLayout LAYOUT__vkBindImageMemory = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__vkBindImageMemory = 88;
    public static final java.lang.foreign.AddressLayout LAYOUT__vkGetBufferMemoryRequirements = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__vkGetBufferMemoryRequirements = 96;
    public static final java.lang.foreign.AddressLayout LAYOUT__vkGetImageMemoryRequirements = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__vkGetImageMemoryRequirements = 104;
    public static final java.lang.foreign.AddressLayout LAYOUT__vkCreateBuffer = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__vkCreateBuffer = 112;
    public static final java.lang.foreign.AddressLayout LAYOUT__vkDestroyBuffer = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__vkDestroyBuffer = 120;
    public static final java.lang.foreign.AddressLayout LAYOUT__vkCreateImage = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__vkCreateImage = 128;
    public static final java.lang.foreign.AddressLayout LAYOUT__vkDestroyImage = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__vkDestroyImage = 136;
    public static final java.lang.foreign.AddressLayout LAYOUT__vkCmdCopyBuffer = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__vkCmdCopyBuffer = 144;
    public static final java.lang.foreign.AddressLayout LAYOUT__vkGetBufferMemoryRequirements2KHR = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__vkGetBufferMemoryRequirements2KHR = 152;
    public static final java.lang.foreign.AddressLayout LAYOUT__vkGetImageMemoryRequirements2KHR = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__vkGetImageMemoryRequirements2KHR = 160;
    public static final java.lang.foreign.AddressLayout LAYOUT__vkBindBufferMemory2KHR = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__vkBindBufferMemory2KHR = 168;
    public static final java.lang.foreign.AddressLayout LAYOUT__vkBindImageMemory2KHR = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__vkBindImageMemory2KHR = 176;
    public static final java.lang.foreign.AddressLayout LAYOUT__vkGetPhysicalDeviceMemoryProperties2KHR = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__vkGetPhysicalDeviceMemoryProperties2KHR = 184;
    public static final java.lang.foreign.AddressLayout LAYOUT__vkGetDeviceBufferMemoryRequirements = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__vkGetDeviceBufferMemoryRequirements = 192;
    public static final java.lang.foreign.AddressLayout LAYOUT__vkGetDeviceImageMemoryRequirements = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__vkGetDeviceImageMemoryRequirements = 200;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__vkGetInstanceProcAddr,
            LAYOUT__vkGetDeviceProcAddr,
            LAYOUT__vkGetPhysicalDeviceProperties,
            LAYOUT__vkGetPhysicalDeviceMemoryProperties,
            LAYOUT__vkAllocateMemory,
            LAYOUT__vkFreeMemory,
            LAYOUT__vkMapMemory,
            LAYOUT__vkUnmapMemory,
            LAYOUT__vkFlushMappedMemoryRanges,
            LAYOUT__vkInvalidateMappedMemoryRanges,
            LAYOUT__vkBindBufferMemory,
            LAYOUT__vkBindImageMemory,
            LAYOUT__vkGetBufferMemoryRequirements,
            LAYOUT__vkGetImageMemoryRequirements,
            LAYOUT__vkCreateBuffer,
            LAYOUT__vkDestroyBuffer,
            LAYOUT__vkCreateImage,
            LAYOUT__vkDestroyImage,
            LAYOUT__vkCmdCopyBuffer,
            LAYOUT__vkGetBufferMemoryRequirements2KHR,
            LAYOUT__vkGetImageMemoryRequirements2KHR,
            LAYOUT__vkBindBufferMemory2KHR,
            LAYOUT__vkBindImageMemory2KHR,
            LAYOUT__vkGetPhysicalDeviceMemoryProperties2KHR,
            LAYOUT__vkGetDeviceBufferMemoryRequirements,
            LAYOUT__vkGetDeviceImageMemoryRequirements
    ).withByteAlignment(8).withName("VmaVulkanFunctions");

    public VmaVulkanFunctions(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VmaVulkanFunctions getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VmaVulkanFunctions(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VmaVulkanFunctions value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public java.lang.foreign.MemorySegment vkGetInstanceProcAddr() {return this.ptr.get(LAYOUT__vkGetInstanceProcAddr, OFFSET__vkGetInstanceProcAddr);}
    public void vkGetInstanceProcAddr(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__vkGetInstanceProcAddr, OFFSET__vkGetInstanceProcAddr, value);}
    public java.lang.foreign.MemorySegment $vkGetInstanceProcAddr() {return this.ptr.asSlice(OFFSET__vkGetInstanceProcAddr, LAYOUT__vkGetInstanceProcAddr);}

    public java.lang.foreign.MemorySegment vkGetDeviceProcAddr() {return this.ptr.get(LAYOUT__vkGetDeviceProcAddr, OFFSET__vkGetDeviceProcAddr);}
    public void vkGetDeviceProcAddr(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__vkGetDeviceProcAddr, OFFSET__vkGetDeviceProcAddr, value);}
    public java.lang.foreign.MemorySegment $vkGetDeviceProcAddr() {return this.ptr.asSlice(OFFSET__vkGetDeviceProcAddr, LAYOUT__vkGetDeviceProcAddr);}

    public java.lang.foreign.MemorySegment vkGetPhysicalDeviceProperties() {return this.ptr.get(LAYOUT__vkGetPhysicalDeviceProperties, OFFSET__vkGetPhysicalDeviceProperties);}
    public void vkGetPhysicalDeviceProperties(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__vkGetPhysicalDeviceProperties, OFFSET__vkGetPhysicalDeviceProperties, value);}
    public java.lang.foreign.MemorySegment $vkGetPhysicalDeviceProperties() {return this.ptr.asSlice(OFFSET__vkGetPhysicalDeviceProperties, LAYOUT__vkGetPhysicalDeviceProperties);}

    public java.lang.foreign.MemorySegment vkGetPhysicalDeviceMemoryProperties() {return this.ptr.get(LAYOUT__vkGetPhysicalDeviceMemoryProperties, OFFSET__vkGetPhysicalDeviceMemoryProperties);}
    public void vkGetPhysicalDeviceMemoryProperties(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__vkGetPhysicalDeviceMemoryProperties, OFFSET__vkGetPhysicalDeviceMemoryProperties, value);}
    public java.lang.foreign.MemorySegment $vkGetPhysicalDeviceMemoryProperties() {return this.ptr.asSlice(OFFSET__vkGetPhysicalDeviceMemoryProperties, LAYOUT__vkGetPhysicalDeviceMemoryProperties);}

    public java.lang.foreign.MemorySegment vkAllocateMemory() {return this.ptr.get(LAYOUT__vkAllocateMemory, OFFSET__vkAllocateMemory);}
    public void vkAllocateMemory(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__vkAllocateMemory, OFFSET__vkAllocateMemory, value);}
    public java.lang.foreign.MemorySegment $vkAllocateMemory() {return this.ptr.asSlice(OFFSET__vkAllocateMemory, LAYOUT__vkAllocateMemory);}

    public java.lang.foreign.MemorySegment vkFreeMemory() {return this.ptr.get(LAYOUT__vkFreeMemory, OFFSET__vkFreeMemory);}
    public void vkFreeMemory(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__vkFreeMemory, OFFSET__vkFreeMemory, value);}
    public java.lang.foreign.MemorySegment $vkFreeMemory() {return this.ptr.asSlice(OFFSET__vkFreeMemory, LAYOUT__vkFreeMemory);}

    public java.lang.foreign.MemorySegment vkMapMemory() {return this.ptr.get(LAYOUT__vkMapMemory, OFFSET__vkMapMemory);}
    public void vkMapMemory(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__vkMapMemory, OFFSET__vkMapMemory, value);}
    public java.lang.foreign.MemorySegment $vkMapMemory() {return this.ptr.asSlice(OFFSET__vkMapMemory, LAYOUT__vkMapMemory);}

    public java.lang.foreign.MemorySegment vkUnmapMemory() {return this.ptr.get(LAYOUT__vkUnmapMemory, OFFSET__vkUnmapMemory);}
    public void vkUnmapMemory(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__vkUnmapMemory, OFFSET__vkUnmapMemory, value);}
    public java.lang.foreign.MemorySegment $vkUnmapMemory() {return this.ptr.asSlice(OFFSET__vkUnmapMemory, LAYOUT__vkUnmapMemory);}

    public java.lang.foreign.MemorySegment vkFlushMappedMemoryRanges() {return this.ptr.get(LAYOUT__vkFlushMappedMemoryRanges, OFFSET__vkFlushMappedMemoryRanges);}
    public void vkFlushMappedMemoryRanges(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__vkFlushMappedMemoryRanges, OFFSET__vkFlushMappedMemoryRanges, value);}
    public java.lang.foreign.MemorySegment $vkFlushMappedMemoryRanges() {return this.ptr.asSlice(OFFSET__vkFlushMappedMemoryRanges, LAYOUT__vkFlushMappedMemoryRanges);}

    public java.lang.foreign.MemorySegment vkInvalidateMappedMemoryRanges() {return this.ptr.get(LAYOUT__vkInvalidateMappedMemoryRanges, OFFSET__vkInvalidateMappedMemoryRanges);}
    public void vkInvalidateMappedMemoryRanges(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__vkInvalidateMappedMemoryRanges, OFFSET__vkInvalidateMappedMemoryRanges, value);}
    public java.lang.foreign.MemorySegment $vkInvalidateMappedMemoryRanges() {return this.ptr.asSlice(OFFSET__vkInvalidateMappedMemoryRanges, LAYOUT__vkInvalidateMappedMemoryRanges);}

    public java.lang.foreign.MemorySegment vkBindBufferMemory() {return this.ptr.get(LAYOUT__vkBindBufferMemory, OFFSET__vkBindBufferMemory);}
    public void vkBindBufferMemory(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__vkBindBufferMemory, OFFSET__vkBindBufferMemory, value);}
    public java.lang.foreign.MemorySegment $vkBindBufferMemory() {return this.ptr.asSlice(OFFSET__vkBindBufferMemory, LAYOUT__vkBindBufferMemory);}

    public java.lang.foreign.MemorySegment vkBindImageMemory() {return this.ptr.get(LAYOUT__vkBindImageMemory, OFFSET__vkBindImageMemory);}
    public void vkBindImageMemory(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__vkBindImageMemory, OFFSET__vkBindImageMemory, value);}
    public java.lang.foreign.MemorySegment $vkBindImageMemory() {return this.ptr.asSlice(OFFSET__vkBindImageMemory, LAYOUT__vkBindImageMemory);}

    public java.lang.foreign.MemorySegment vkGetBufferMemoryRequirements() {return this.ptr.get(LAYOUT__vkGetBufferMemoryRequirements, OFFSET__vkGetBufferMemoryRequirements);}
    public void vkGetBufferMemoryRequirements(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__vkGetBufferMemoryRequirements, OFFSET__vkGetBufferMemoryRequirements, value);}
    public java.lang.foreign.MemorySegment $vkGetBufferMemoryRequirements() {return this.ptr.asSlice(OFFSET__vkGetBufferMemoryRequirements, LAYOUT__vkGetBufferMemoryRequirements);}

    public java.lang.foreign.MemorySegment vkGetImageMemoryRequirements() {return this.ptr.get(LAYOUT__vkGetImageMemoryRequirements, OFFSET__vkGetImageMemoryRequirements);}
    public void vkGetImageMemoryRequirements(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__vkGetImageMemoryRequirements, OFFSET__vkGetImageMemoryRequirements, value);}
    public java.lang.foreign.MemorySegment $vkGetImageMemoryRequirements() {return this.ptr.asSlice(OFFSET__vkGetImageMemoryRequirements, LAYOUT__vkGetImageMemoryRequirements);}

    public java.lang.foreign.MemorySegment vkCreateBuffer() {return this.ptr.get(LAYOUT__vkCreateBuffer, OFFSET__vkCreateBuffer);}
    public void vkCreateBuffer(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__vkCreateBuffer, OFFSET__vkCreateBuffer, value);}
    public java.lang.foreign.MemorySegment $vkCreateBuffer() {return this.ptr.asSlice(OFFSET__vkCreateBuffer, LAYOUT__vkCreateBuffer);}

    public java.lang.foreign.MemorySegment vkDestroyBuffer() {return this.ptr.get(LAYOUT__vkDestroyBuffer, OFFSET__vkDestroyBuffer);}
    public void vkDestroyBuffer(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__vkDestroyBuffer, OFFSET__vkDestroyBuffer, value);}
    public java.lang.foreign.MemorySegment $vkDestroyBuffer() {return this.ptr.asSlice(OFFSET__vkDestroyBuffer, LAYOUT__vkDestroyBuffer);}

    public java.lang.foreign.MemorySegment vkCreateImage() {return this.ptr.get(LAYOUT__vkCreateImage, OFFSET__vkCreateImage);}
    public void vkCreateImage(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__vkCreateImage, OFFSET__vkCreateImage, value);}
    public java.lang.foreign.MemorySegment $vkCreateImage() {return this.ptr.asSlice(OFFSET__vkCreateImage, LAYOUT__vkCreateImage);}

    public java.lang.foreign.MemorySegment vkDestroyImage() {return this.ptr.get(LAYOUT__vkDestroyImage, OFFSET__vkDestroyImage);}
    public void vkDestroyImage(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__vkDestroyImage, OFFSET__vkDestroyImage, value);}
    public java.lang.foreign.MemorySegment $vkDestroyImage() {return this.ptr.asSlice(OFFSET__vkDestroyImage, LAYOUT__vkDestroyImage);}

    public java.lang.foreign.MemorySegment vkCmdCopyBuffer() {return this.ptr.get(LAYOUT__vkCmdCopyBuffer, OFFSET__vkCmdCopyBuffer);}
    public void vkCmdCopyBuffer(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__vkCmdCopyBuffer, OFFSET__vkCmdCopyBuffer, value);}
    public java.lang.foreign.MemorySegment $vkCmdCopyBuffer() {return this.ptr.asSlice(OFFSET__vkCmdCopyBuffer, LAYOUT__vkCmdCopyBuffer);}

    public java.lang.foreign.MemorySegment vkGetBufferMemoryRequirements2KHR() {return this.ptr.get(LAYOUT__vkGetBufferMemoryRequirements2KHR, OFFSET__vkGetBufferMemoryRequirements2KHR);}
    public void vkGetBufferMemoryRequirements2KHR(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__vkGetBufferMemoryRequirements2KHR, OFFSET__vkGetBufferMemoryRequirements2KHR, value);}
    public java.lang.foreign.MemorySegment $vkGetBufferMemoryRequirements2KHR() {return this.ptr.asSlice(OFFSET__vkGetBufferMemoryRequirements2KHR, LAYOUT__vkGetBufferMemoryRequirements2KHR);}

    public java.lang.foreign.MemorySegment vkGetImageMemoryRequirements2KHR() {return this.ptr.get(LAYOUT__vkGetImageMemoryRequirements2KHR, OFFSET__vkGetImageMemoryRequirements2KHR);}
    public void vkGetImageMemoryRequirements2KHR(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__vkGetImageMemoryRequirements2KHR, OFFSET__vkGetImageMemoryRequirements2KHR, value);}
    public java.lang.foreign.MemorySegment $vkGetImageMemoryRequirements2KHR() {return this.ptr.asSlice(OFFSET__vkGetImageMemoryRequirements2KHR, LAYOUT__vkGetImageMemoryRequirements2KHR);}

    public java.lang.foreign.MemorySegment vkBindBufferMemory2KHR() {return this.ptr.get(LAYOUT__vkBindBufferMemory2KHR, OFFSET__vkBindBufferMemory2KHR);}
    public void vkBindBufferMemory2KHR(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__vkBindBufferMemory2KHR, OFFSET__vkBindBufferMemory2KHR, value);}
    public java.lang.foreign.MemorySegment $vkBindBufferMemory2KHR() {return this.ptr.asSlice(OFFSET__vkBindBufferMemory2KHR, LAYOUT__vkBindBufferMemory2KHR);}

    public java.lang.foreign.MemorySegment vkBindImageMemory2KHR() {return this.ptr.get(LAYOUT__vkBindImageMemory2KHR, OFFSET__vkBindImageMemory2KHR);}
    public void vkBindImageMemory2KHR(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__vkBindImageMemory2KHR, OFFSET__vkBindImageMemory2KHR, value);}
    public java.lang.foreign.MemorySegment $vkBindImageMemory2KHR() {return this.ptr.asSlice(OFFSET__vkBindImageMemory2KHR, LAYOUT__vkBindImageMemory2KHR);}

    public java.lang.foreign.MemorySegment vkGetPhysicalDeviceMemoryProperties2KHR() {return this.ptr.get(LAYOUT__vkGetPhysicalDeviceMemoryProperties2KHR, OFFSET__vkGetPhysicalDeviceMemoryProperties2KHR);}
    public void vkGetPhysicalDeviceMemoryProperties2KHR(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__vkGetPhysicalDeviceMemoryProperties2KHR, OFFSET__vkGetPhysicalDeviceMemoryProperties2KHR, value);}
    public java.lang.foreign.MemorySegment $vkGetPhysicalDeviceMemoryProperties2KHR() {return this.ptr.asSlice(OFFSET__vkGetPhysicalDeviceMemoryProperties2KHR, LAYOUT__vkGetPhysicalDeviceMemoryProperties2KHR);}

    public java.lang.foreign.MemorySegment vkGetDeviceBufferMemoryRequirements() {return this.ptr.get(LAYOUT__vkGetDeviceBufferMemoryRequirements, OFFSET__vkGetDeviceBufferMemoryRequirements);}
    public void vkGetDeviceBufferMemoryRequirements(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__vkGetDeviceBufferMemoryRequirements, OFFSET__vkGetDeviceBufferMemoryRequirements, value);}
    public java.lang.foreign.MemorySegment $vkGetDeviceBufferMemoryRequirements() {return this.ptr.asSlice(OFFSET__vkGetDeviceBufferMemoryRequirements, LAYOUT__vkGetDeviceBufferMemoryRequirements);}

    public java.lang.foreign.MemorySegment vkGetDeviceImageMemoryRequirements() {return this.ptr.get(LAYOUT__vkGetDeviceImageMemoryRequirements, OFFSET__vkGetDeviceImageMemoryRequirements);}
    public void vkGetDeviceImageMemoryRequirements(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__vkGetDeviceImageMemoryRequirements, OFFSET__vkGetDeviceImageMemoryRequirements, value);}
    public java.lang.foreign.MemorySegment $vkGetDeviceImageMemoryRequirements() {return this.ptr.asSlice(OFFSET__vkGetDeviceImageMemoryRequirements, LAYOUT__vkGetDeviceImageMemoryRequirements);}
}
