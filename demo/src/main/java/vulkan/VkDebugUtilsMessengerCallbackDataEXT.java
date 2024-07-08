package vulkan;

public record VkDebugUtilsMessengerCallbackDataEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__flags = java.lang.foreign.ValueLayout.JAVA_INT.withName("flags");
    public static final long OFFSET__flags = 16;
    public static final java.lang.foreign.AddressLayout LAYOUT__pMessageIdName = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pMessageIdName");
    public static final long OFFSET__pMessageIdName = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__messageIdNumber = java.lang.foreign.ValueLayout.JAVA_INT.withName("messageIdNumber");
    public static final long OFFSET__messageIdNumber = 32;
    public static final java.lang.foreign.AddressLayout LAYOUT__pMessage = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pMessage");
    public static final long OFFSET__pMessage = 40;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__queueLabelCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("queueLabelCount");
    public static final long OFFSET__queueLabelCount = 48;
    public static final java.lang.foreign.AddressLayout LAYOUT__pQueueLabels = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pQueueLabels");
    public static final long OFFSET__pQueueLabels = 56;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__cmdBufLabelCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("cmdBufLabelCount");
    public static final long OFFSET__cmdBufLabelCount = 64;
    public static final java.lang.foreign.AddressLayout LAYOUT__pCmdBufLabels = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pCmdBufLabels");
    public static final long OFFSET__pCmdBufLabels = 72;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__objectCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("objectCount");
    public static final long OFFSET__objectCount = 80;
    public static final java.lang.foreign.AddressLayout LAYOUT__pObjects = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pObjects");
    public static final long OFFSET__pObjects = 88;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__flags,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pMessageIdName,
            LAYOUT__messageIdNumber,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pMessage,
            LAYOUT__queueLabelCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pQueueLabels,
            LAYOUT__cmdBufLabelCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pCmdBufLabels,
            LAYOUT__objectCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pObjects
    ).withByteAlignment(8).withName("VkDebugUtilsMessengerCallbackDataEXT");

    public VkDebugUtilsMessengerCallbackDataEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkDebugUtilsMessengerCallbackDataEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkDebugUtilsMessengerCallbackDataEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkDebugUtilsMessengerCallbackDataEXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int flags() {return this.ptr.get(LAYOUT__flags, OFFSET__flags);}
    public void flags(int value) {this.ptr.set(LAYOUT__flags, OFFSET__flags, value);}
    public java.lang.foreign.MemorySegment $flags() {return this.ptr.asSlice(OFFSET__flags, LAYOUT__flags);}

    public java.lang.foreign.MemorySegment pMessageIdName() {return this.ptr.get(LAYOUT__pMessageIdName, OFFSET__pMessageIdName);}
    public void pMessageIdName(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pMessageIdName, OFFSET__pMessageIdName, value);}
    public java.lang.foreign.MemorySegment $pMessageIdName() {return this.ptr.asSlice(OFFSET__pMessageIdName, LAYOUT__pMessageIdName);}

    public int messageIdNumber() {return this.ptr.get(LAYOUT__messageIdNumber, OFFSET__messageIdNumber);}
    public void messageIdNumber(int value) {this.ptr.set(LAYOUT__messageIdNumber, OFFSET__messageIdNumber, value);}
    public java.lang.foreign.MemorySegment $messageIdNumber() {return this.ptr.asSlice(OFFSET__messageIdNumber, LAYOUT__messageIdNumber);}

    public java.lang.foreign.MemorySegment pMessage() {return this.ptr.get(LAYOUT__pMessage, OFFSET__pMessage);}
    public void pMessage(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pMessage, OFFSET__pMessage, value);}
    public java.lang.foreign.MemorySegment $pMessage() {return this.ptr.asSlice(OFFSET__pMessage, LAYOUT__pMessage);}

    public int queueLabelCount() {return this.ptr.get(LAYOUT__queueLabelCount, OFFSET__queueLabelCount);}
    public void queueLabelCount(int value) {this.ptr.set(LAYOUT__queueLabelCount, OFFSET__queueLabelCount, value);}
    public java.lang.foreign.MemorySegment $queueLabelCount() {return this.ptr.asSlice(OFFSET__queueLabelCount, LAYOUT__queueLabelCount);}

    public java.lang.foreign.MemorySegment pQueueLabels() {return this.ptr.get(LAYOUT__pQueueLabels, OFFSET__pQueueLabels);}
    public void pQueueLabels(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pQueueLabels, OFFSET__pQueueLabels, value);}
    public java.lang.foreign.MemorySegment $pQueueLabels() {return this.ptr.asSlice(OFFSET__pQueueLabels, LAYOUT__pQueueLabels);}

    public int cmdBufLabelCount() {return this.ptr.get(LAYOUT__cmdBufLabelCount, OFFSET__cmdBufLabelCount);}
    public void cmdBufLabelCount(int value) {this.ptr.set(LAYOUT__cmdBufLabelCount, OFFSET__cmdBufLabelCount, value);}
    public java.lang.foreign.MemorySegment $cmdBufLabelCount() {return this.ptr.asSlice(OFFSET__cmdBufLabelCount, LAYOUT__cmdBufLabelCount);}

    public java.lang.foreign.MemorySegment pCmdBufLabels() {return this.ptr.get(LAYOUT__pCmdBufLabels, OFFSET__pCmdBufLabels);}
    public void pCmdBufLabels(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pCmdBufLabels, OFFSET__pCmdBufLabels, value);}
    public java.lang.foreign.MemorySegment $pCmdBufLabels() {return this.ptr.asSlice(OFFSET__pCmdBufLabels, LAYOUT__pCmdBufLabels);}

    public int objectCount() {return this.ptr.get(LAYOUT__objectCount, OFFSET__objectCount);}
    public void objectCount(int value) {this.ptr.set(LAYOUT__objectCount, OFFSET__objectCount, value);}
    public java.lang.foreign.MemorySegment $objectCount() {return this.ptr.asSlice(OFFSET__objectCount, LAYOUT__objectCount);}

    public java.lang.foreign.MemorySegment pObjects() {return this.ptr.get(LAYOUT__pObjects, OFFSET__pObjects);}
    public void pObjects(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pObjects, OFFSET__pObjects, value);}
    public java.lang.foreign.MemorySegment $pObjects() {return this.ptr.asSlice(OFFSET__pObjects, LAYOUT__pObjects);}
}
