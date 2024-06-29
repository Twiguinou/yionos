package vulkan;

public record VkBindSparseInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__waitSemaphoreCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__waitSemaphoreCount = 16;
    public static final java.lang.foreign.AddressLayout LAYOUT__pWaitSemaphores = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pWaitSemaphores = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__bufferBindCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__bufferBindCount = 32;
    public static final java.lang.foreign.AddressLayout LAYOUT__pBufferBinds = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pBufferBinds = 40;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__imageOpaqueBindCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__imageOpaqueBindCount = 48;
    public static final java.lang.foreign.AddressLayout LAYOUT__pImageOpaqueBinds = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pImageOpaqueBinds = 56;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__imageBindCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__imageBindCount = 64;
    public static final java.lang.foreign.AddressLayout LAYOUT__pImageBinds = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pImageBinds = 72;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__signalSemaphoreCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__signalSemaphoreCount = 80;
    public static final java.lang.foreign.AddressLayout LAYOUT__pSignalSemaphores = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pSignalSemaphores = 88;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__waitSemaphoreCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pWaitSemaphores,
            LAYOUT__bufferBindCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pBufferBinds,
            LAYOUT__imageOpaqueBindCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pImageOpaqueBinds,
            LAYOUT__imageBindCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pImageBinds,
            LAYOUT__signalSemaphoreCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pSignalSemaphores
    ).withByteAlignment(8).withName("VkBindSparseInfo");

    public VkBindSparseInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkBindSparseInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkBindSparseInfo(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkBindSparseInfo value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int waitSemaphoreCount() {return this.ptr.get(LAYOUT__waitSemaphoreCount, OFFSET__waitSemaphoreCount);}
    public void waitSemaphoreCount(int value) {this.ptr.set(LAYOUT__waitSemaphoreCount, OFFSET__waitSemaphoreCount, value);}
    public java.lang.foreign.MemorySegment $waitSemaphoreCount() {return this.ptr.asSlice(OFFSET__waitSemaphoreCount, LAYOUT__waitSemaphoreCount);}

    public java.lang.foreign.MemorySegment pWaitSemaphores() {return this.ptr.get(LAYOUT__pWaitSemaphores, OFFSET__pWaitSemaphores);}
    public void pWaitSemaphores(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pWaitSemaphores, OFFSET__pWaitSemaphores, value);}
    public java.lang.foreign.MemorySegment $pWaitSemaphores() {return this.ptr.asSlice(OFFSET__pWaitSemaphores, LAYOUT__pWaitSemaphores);}

    public int bufferBindCount() {return this.ptr.get(LAYOUT__bufferBindCount, OFFSET__bufferBindCount);}
    public void bufferBindCount(int value) {this.ptr.set(LAYOUT__bufferBindCount, OFFSET__bufferBindCount, value);}
    public java.lang.foreign.MemorySegment $bufferBindCount() {return this.ptr.asSlice(OFFSET__bufferBindCount, LAYOUT__bufferBindCount);}

    public java.lang.foreign.MemorySegment pBufferBinds() {return this.ptr.get(LAYOUT__pBufferBinds, OFFSET__pBufferBinds);}
    public void pBufferBinds(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pBufferBinds, OFFSET__pBufferBinds, value);}
    public java.lang.foreign.MemorySegment $pBufferBinds() {return this.ptr.asSlice(OFFSET__pBufferBinds, LAYOUT__pBufferBinds);}

    public int imageOpaqueBindCount() {return this.ptr.get(LAYOUT__imageOpaqueBindCount, OFFSET__imageOpaqueBindCount);}
    public void imageOpaqueBindCount(int value) {this.ptr.set(LAYOUT__imageOpaqueBindCount, OFFSET__imageOpaqueBindCount, value);}
    public java.lang.foreign.MemorySegment $imageOpaqueBindCount() {return this.ptr.asSlice(OFFSET__imageOpaqueBindCount, LAYOUT__imageOpaqueBindCount);}

    public java.lang.foreign.MemorySegment pImageOpaqueBinds() {return this.ptr.get(LAYOUT__pImageOpaqueBinds, OFFSET__pImageOpaqueBinds);}
    public void pImageOpaqueBinds(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pImageOpaqueBinds, OFFSET__pImageOpaqueBinds, value);}
    public java.lang.foreign.MemorySegment $pImageOpaqueBinds() {return this.ptr.asSlice(OFFSET__pImageOpaqueBinds, LAYOUT__pImageOpaqueBinds);}

    public int imageBindCount() {return this.ptr.get(LAYOUT__imageBindCount, OFFSET__imageBindCount);}
    public void imageBindCount(int value) {this.ptr.set(LAYOUT__imageBindCount, OFFSET__imageBindCount, value);}
    public java.lang.foreign.MemorySegment $imageBindCount() {return this.ptr.asSlice(OFFSET__imageBindCount, LAYOUT__imageBindCount);}

    public java.lang.foreign.MemorySegment pImageBinds() {return this.ptr.get(LAYOUT__pImageBinds, OFFSET__pImageBinds);}
    public void pImageBinds(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pImageBinds, OFFSET__pImageBinds, value);}
    public java.lang.foreign.MemorySegment $pImageBinds() {return this.ptr.asSlice(OFFSET__pImageBinds, LAYOUT__pImageBinds);}

    public int signalSemaphoreCount() {return this.ptr.get(LAYOUT__signalSemaphoreCount, OFFSET__signalSemaphoreCount);}
    public void signalSemaphoreCount(int value) {this.ptr.set(LAYOUT__signalSemaphoreCount, OFFSET__signalSemaphoreCount, value);}
    public java.lang.foreign.MemorySegment $signalSemaphoreCount() {return this.ptr.asSlice(OFFSET__signalSemaphoreCount, LAYOUT__signalSemaphoreCount);}

    public java.lang.foreign.MemorySegment pSignalSemaphores() {return this.ptr.get(LAYOUT__pSignalSemaphores, OFFSET__pSignalSemaphores);}
    public void pSignalSemaphores(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pSignalSemaphores, OFFSET__pSignalSemaphores, value);}
    public java.lang.foreign.MemorySegment $pSignalSemaphores() {return this.ptr.asSlice(OFFSET__pSignalSemaphores, LAYOUT__pSignalSemaphores);}
}
