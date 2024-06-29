package assimp;

public record aiImporterDesc(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.AddressLayout LAYOUT__mName = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__mName = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__mAuthor = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__mAuthor = 8;
    public static final java.lang.foreign.AddressLayout LAYOUT__mMaintainer = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__mMaintainer = 16;
    public static final java.lang.foreign.AddressLayout LAYOUT__mComments = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__mComments = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__mFlags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__mFlags = 32;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__mMinMajor = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__mMinMajor = 36;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__mMinMinor = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__mMinMinor = 40;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__mMaxMajor = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__mMaxMajor = 44;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__mMaxMinor = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__mMaxMinor = 48;
    public static final java.lang.foreign.AddressLayout LAYOUT__mFileExtensions = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__mFileExtensions = 56;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__mName,
            LAYOUT__mAuthor,
            LAYOUT__mMaintainer,
            LAYOUT__mComments,
            LAYOUT__mFlags,
            LAYOUT__mMinMajor,
            LAYOUT__mMinMinor,
            LAYOUT__mMaxMajor,
            LAYOUT__mMaxMinor,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__mFileExtensions
    ).withByteAlignment(8).withName("aiImporterDesc");

    public aiImporterDesc(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static aiImporterDesc getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new aiImporterDesc(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, aiImporterDesc value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public java.lang.foreign.MemorySegment mName() {return this.ptr.get(LAYOUT__mName, OFFSET__mName);}
    public void mName(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__mName, OFFSET__mName, value);}
    public java.lang.foreign.MemorySegment $mName() {return this.ptr.asSlice(OFFSET__mName, LAYOUT__mName);}

    public java.lang.foreign.MemorySegment mAuthor() {return this.ptr.get(LAYOUT__mAuthor, OFFSET__mAuthor);}
    public void mAuthor(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__mAuthor, OFFSET__mAuthor, value);}
    public java.lang.foreign.MemorySegment $mAuthor() {return this.ptr.asSlice(OFFSET__mAuthor, LAYOUT__mAuthor);}

    public java.lang.foreign.MemorySegment mMaintainer() {return this.ptr.get(LAYOUT__mMaintainer, OFFSET__mMaintainer);}
    public void mMaintainer(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__mMaintainer, OFFSET__mMaintainer, value);}
    public java.lang.foreign.MemorySegment $mMaintainer() {return this.ptr.asSlice(OFFSET__mMaintainer, LAYOUT__mMaintainer);}

    public java.lang.foreign.MemorySegment mComments() {return this.ptr.get(LAYOUT__mComments, OFFSET__mComments);}
    public void mComments(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__mComments, OFFSET__mComments, value);}
    public java.lang.foreign.MemorySegment $mComments() {return this.ptr.asSlice(OFFSET__mComments, LAYOUT__mComments);}

    public int mFlags() {return this.ptr.get(LAYOUT__mFlags, OFFSET__mFlags);}
    public void mFlags(int value) {this.ptr.set(LAYOUT__mFlags, OFFSET__mFlags, value);}
    public java.lang.foreign.MemorySegment $mFlags() {return this.ptr.asSlice(OFFSET__mFlags, LAYOUT__mFlags);}

    public int mMinMajor() {return this.ptr.get(LAYOUT__mMinMajor, OFFSET__mMinMajor);}
    public void mMinMajor(int value) {this.ptr.set(LAYOUT__mMinMajor, OFFSET__mMinMajor, value);}
    public java.lang.foreign.MemorySegment $mMinMajor() {return this.ptr.asSlice(OFFSET__mMinMajor, LAYOUT__mMinMajor);}

    public int mMinMinor() {return this.ptr.get(LAYOUT__mMinMinor, OFFSET__mMinMinor);}
    public void mMinMinor(int value) {this.ptr.set(LAYOUT__mMinMinor, OFFSET__mMinMinor, value);}
    public java.lang.foreign.MemorySegment $mMinMinor() {return this.ptr.asSlice(OFFSET__mMinMinor, LAYOUT__mMinMinor);}

    public int mMaxMajor() {return this.ptr.get(LAYOUT__mMaxMajor, OFFSET__mMaxMajor);}
    public void mMaxMajor(int value) {this.ptr.set(LAYOUT__mMaxMajor, OFFSET__mMaxMajor, value);}
    public java.lang.foreign.MemorySegment $mMaxMajor() {return this.ptr.asSlice(OFFSET__mMaxMajor, LAYOUT__mMaxMajor);}

    public int mMaxMinor() {return this.ptr.get(LAYOUT__mMaxMinor, OFFSET__mMaxMinor);}
    public void mMaxMinor(int value) {this.ptr.set(LAYOUT__mMaxMinor, OFFSET__mMaxMinor, value);}
    public java.lang.foreign.MemorySegment $mMaxMinor() {return this.ptr.asSlice(OFFSET__mMaxMinor, LAYOUT__mMaxMinor);}

    public java.lang.foreign.MemorySegment mFileExtensions() {return this.ptr.get(LAYOUT__mFileExtensions, OFFSET__mFileExtensions);}
    public void mFileExtensions(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__mFileExtensions, OFFSET__mFileExtensions, value);}
    public java.lang.foreign.MemorySegment $mFileExtensions() {return this.ptr.asSlice(OFFSET__mFileExtensions, LAYOUT__mFileExtensions);}
}
