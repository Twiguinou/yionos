package vulkan;

public record VkVideoSessionCreateInfoKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__queueFamilyIndex = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__queueFamilyIndex = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__flags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__flags = 20;
    public static final java.lang.foreign.AddressLayout LAYOUT__pVideoProfile = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pVideoProfile = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__pictureFormat = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__pictureFormat = 32;
    public static final java.lang.foreign.StructLayout LAYOUT__maxCodedExtent = vulkan.VkExtent2D.gRecordLayout;
    public static final long OFFSET__maxCodedExtent = 36;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__referencePictureFormat = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__referencePictureFormat = 44;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxDpbSlots = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__maxDpbSlots = 48;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxActiveReferencePictures = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__maxActiveReferencePictures = 52;
    public static final java.lang.foreign.AddressLayout LAYOUT__pStdHeaderVersion = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pStdHeaderVersion = 56;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__queueFamilyIndex,
            LAYOUT__flags,
            LAYOUT__pVideoProfile,
            LAYOUT__pictureFormat,
            LAYOUT__maxCodedExtent,
            LAYOUT__referencePictureFormat,
            LAYOUT__maxDpbSlots,
            LAYOUT__maxActiveReferencePictures,
            LAYOUT__pStdHeaderVersion
    ).withByteAlignment(8).withName("VkVideoSessionCreateInfoKHR");

    public VkVideoSessionCreateInfoKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkVideoSessionCreateInfoKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkVideoSessionCreateInfoKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkVideoSessionCreateInfoKHR value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int queueFamilyIndex() {return this.ptr.get(LAYOUT__queueFamilyIndex, OFFSET__queueFamilyIndex);}
    public void queueFamilyIndex(int value) {this.ptr.set(LAYOUT__queueFamilyIndex, OFFSET__queueFamilyIndex, value);}
    public java.lang.foreign.MemorySegment $queueFamilyIndex() {return this.ptr.asSlice(OFFSET__queueFamilyIndex, LAYOUT__queueFamilyIndex);}

    public int flags() {return this.ptr.get(LAYOUT__flags, OFFSET__flags);}
    public void flags(int value) {this.ptr.set(LAYOUT__flags, OFFSET__flags, value);}
    public java.lang.foreign.MemorySegment $flags() {return this.ptr.asSlice(OFFSET__flags, LAYOUT__flags);}

    public java.lang.foreign.MemorySegment pVideoProfile() {return this.ptr.get(LAYOUT__pVideoProfile, OFFSET__pVideoProfile);}
    public void pVideoProfile(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pVideoProfile, OFFSET__pVideoProfile, value);}
    public java.lang.foreign.MemorySegment $pVideoProfile() {return this.ptr.asSlice(OFFSET__pVideoProfile, LAYOUT__pVideoProfile);}

    public int pictureFormat() {return this.ptr.get(LAYOUT__pictureFormat, OFFSET__pictureFormat);}
    public void pictureFormat(int value) {this.ptr.set(LAYOUT__pictureFormat, OFFSET__pictureFormat, value);}
    public java.lang.foreign.MemorySegment $pictureFormat() {return this.ptr.asSlice(OFFSET__pictureFormat, LAYOUT__pictureFormat);}

    public vulkan.VkExtent2D maxCodedExtent() {return new vulkan.VkExtent2D(this.ptr.asSlice(OFFSET__maxCodedExtent, LAYOUT__maxCodedExtent));}
    public void maxCodedExtent(java.util.function.Consumer<vulkan.VkExtent2D> consumer) {consumer.accept(this.maxCodedExtent());}
    public void maxCodedExtent(vulkan.VkExtent2D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__maxCodedExtent, LAYOUT__maxCodedExtent.byteSize());}

    public int referencePictureFormat() {return this.ptr.get(LAYOUT__referencePictureFormat, OFFSET__referencePictureFormat);}
    public void referencePictureFormat(int value) {this.ptr.set(LAYOUT__referencePictureFormat, OFFSET__referencePictureFormat, value);}
    public java.lang.foreign.MemorySegment $referencePictureFormat() {return this.ptr.asSlice(OFFSET__referencePictureFormat, LAYOUT__referencePictureFormat);}

    public int maxDpbSlots() {return this.ptr.get(LAYOUT__maxDpbSlots, OFFSET__maxDpbSlots);}
    public void maxDpbSlots(int value) {this.ptr.set(LAYOUT__maxDpbSlots, OFFSET__maxDpbSlots, value);}
    public java.lang.foreign.MemorySegment $maxDpbSlots() {return this.ptr.asSlice(OFFSET__maxDpbSlots, LAYOUT__maxDpbSlots);}

    public int maxActiveReferencePictures() {return this.ptr.get(LAYOUT__maxActiveReferencePictures, OFFSET__maxActiveReferencePictures);}
    public void maxActiveReferencePictures(int value) {this.ptr.set(LAYOUT__maxActiveReferencePictures, OFFSET__maxActiveReferencePictures, value);}
    public java.lang.foreign.MemorySegment $maxActiveReferencePictures() {return this.ptr.asSlice(OFFSET__maxActiveReferencePictures, LAYOUT__maxActiveReferencePictures);}

    public java.lang.foreign.MemorySegment pStdHeaderVersion() {return this.ptr.get(LAYOUT__pStdHeaderVersion, OFFSET__pStdHeaderVersion);}
    public void pStdHeaderVersion(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pStdHeaderVersion, OFFSET__pStdHeaderVersion, value);}
    public java.lang.foreign.MemorySegment $pStdHeaderVersion() {return this.ptr.asSlice(OFFSET__pStdHeaderVersion, LAYOUT__pStdHeaderVersion);}
}
