package assimp;

public record aiCamera(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT__mName = assimp.aiString.gRecordLayout.withName("mName");
    public static final long OFFSET__mName = 0;
    public static final java.lang.foreign.StructLayout LAYOUT__mPosition = assimp.aiVector3D.gRecordLayout.withName("mPosition");
    public static final long OFFSET__mPosition = 1028;
    public static final java.lang.foreign.StructLayout LAYOUT__mUp = assimp.aiVector3D.gRecordLayout.withName("mUp");
    public static final long OFFSET__mUp = 1040;
    public static final java.lang.foreign.StructLayout LAYOUT__mLookAt = assimp.aiVector3D.gRecordLayout.withName("mLookAt");
    public static final long OFFSET__mLookAt = 1052;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__mHorizontalFOV = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("mHorizontalFOV");
    public static final long OFFSET__mHorizontalFOV = 1064;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__mClipPlaneNear = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("mClipPlaneNear");
    public static final long OFFSET__mClipPlaneNear = 1068;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__mClipPlaneFar = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("mClipPlaneFar");
    public static final long OFFSET__mClipPlaneFar = 1072;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__mAspect = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("mAspect");
    public static final long OFFSET__mAspect = 1076;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__mOrthographicWidth = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("mOrthographicWidth");
    public static final long OFFSET__mOrthographicWidth = 1080;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__mName,
            LAYOUT__mPosition,
            LAYOUT__mUp,
            LAYOUT__mLookAt,
            LAYOUT__mHorizontalFOV,
            LAYOUT__mClipPlaneNear,
            LAYOUT__mClipPlaneFar,
            LAYOUT__mAspect,
            LAYOUT__mOrthographicWidth
    ).withByteAlignment(4).withName("aiCamera");

    public aiCamera(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static aiCamera getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new aiCamera(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, aiCamera value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public assimp.aiString mName() {return new assimp.aiString(this.ptr.asSlice(OFFSET__mName, LAYOUT__mName));}
    public void mName(java.util.function.Consumer<assimp.aiString> consumer) {consumer.accept(this.mName());}
    public void mName(assimp.aiString value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__mName, LAYOUT__mName.byteSize());}

    public assimp.aiVector3D mPosition() {return new assimp.aiVector3D(this.ptr.asSlice(OFFSET__mPosition, LAYOUT__mPosition));}
    public void mPosition(java.util.function.Consumer<assimp.aiVector3D> consumer) {consumer.accept(this.mPosition());}
    public void mPosition(assimp.aiVector3D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__mPosition, LAYOUT__mPosition.byteSize());}

    public assimp.aiVector3D mUp() {return new assimp.aiVector3D(this.ptr.asSlice(OFFSET__mUp, LAYOUT__mUp));}
    public void mUp(java.util.function.Consumer<assimp.aiVector3D> consumer) {consumer.accept(this.mUp());}
    public void mUp(assimp.aiVector3D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__mUp, LAYOUT__mUp.byteSize());}

    public assimp.aiVector3D mLookAt() {return new assimp.aiVector3D(this.ptr.asSlice(OFFSET__mLookAt, LAYOUT__mLookAt));}
    public void mLookAt(java.util.function.Consumer<assimp.aiVector3D> consumer) {consumer.accept(this.mLookAt());}
    public void mLookAt(assimp.aiVector3D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__mLookAt, LAYOUT__mLookAt.byteSize());}

    public float mHorizontalFOV() {return this.ptr.get(LAYOUT__mHorizontalFOV, OFFSET__mHorizontalFOV);}
    public void mHorizontalFOV(float value) {this.ptr.set(LAYOUT__mHorizontalFOV, OFFSET__mHorizontalFOV, value);}
    public java.lang.foreign.MemorySegment $mHorizontalFOV() {return this.ptr.asSlice(OFFSET__mHorizontalFOV, LAYOUT__mHorizontalFOV);}

    public float mClipPlaneNear() {return this.ptr.get(LAYOUT__mClipPlaneNear, OFFSET__mClipPlaneNear);}
    public void mClipPlaneNear(float value) {this.ptr.set(LAYOUT__mClipPlaneNear, OFFSET__mClipPlaneNear, value);}
    public java.lang.foreign.MemorySegment $mClipPlaneNear() {return this.ptr.asSlice(OFFSET__mClipPlaneNear, LAYOUT__mClipPlaneNear);}

    public float mClipPlaneFar() {return this.ptr.get(LAYOUT__mClipPlaneFar, OFFSET__mClipPlaneFar);}
    public void mClipPlaneFar(float value) {this.ptr.set(LAYOUT__mClipPlaneFar, OFFSET__mClipPlaneFar, value);}
    public java.lang.foreign.MemorySegment $mClipPlaneFar() {return this.ptr.asSlice(OFFSET__mClipPlaneFar, LAYOUT__mClipPlaneFar);}

    public float mAspect() {return this.ptr.get(LAYOUT__mAspect, OFFSET__mAspect);}
    public void mAspect(float value) {this.ptr.set(LAYOUT__mAspect, OFFSET__mAspect, value);}
    public java.lang.foreign.MemorySegment $mAspect() {return this.ptr.asSlice(OFFSET__mAspect, LAYOUT__mAspect);}

    public float mOrthographicWidth() {return this.ptr.get(LAYOUT__mOrthographicWidth, OFFSET__mOrthographicWidth);}
    public void mOrthographicWidth(float value) {this.ptr.set(LAYOUT__mOrthographicWidth, OFFSET__mOrthographicWidth, value);}
    public java.lang.foreign.MemorySegment $mOrthographicWidth() {return this.ptr.asSlice(OFFSET__mOrthographicWidth, LAYOUT__mOrthographicWidth);}
}
