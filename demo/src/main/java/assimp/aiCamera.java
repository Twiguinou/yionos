package assimp;

public record aiCamera(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.GroupLayout LAYOUT$mName = assimp.aiString.gStructLayout;
    public static final long OFFSET$mName = 0L;
    public static final java.lang.foreign.GroupLayout LAYOUT$mPosition = assimp.aiVector3D.gStructLayout;
    public static final long OFFSET$mPosition = 1028L;
    public static final java.lang.foreign.GroupLayout LAYOUT$mUp = assimp.aiVector3D.gStructLayout;
    public static final long OFFSET$mUp = 1040L;
    public static final java.lang.foreign.GroupLayout LAYOUT$mLookAt = assimp.aiVector3D.gStructLayout;
    public static final long OFFSET$mLookAt = 1052L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$mHorizontalFOV = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$mHorizontalFOV = 1064L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$mClipPlaneNear = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$mClipPlaneNear = 1068L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$mClipPlaneFar = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$mClipPlaneFar = 1072L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$mAspect = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$mAspect = 1076L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$mOrthographicWidth = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$mOrthographicWidth = 1080L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$mName,
            LAYOUT$mPosition,
            LAYOUT$mUp,
            LAYOUT$mLookAt,
            LAYOUT$mHorizontalFOV,
            LAYOUT$mClipPlaneNear,
            LAYOUT$mClipPlaneFar,
            LAYOUT$mAspect,
            LAYOUT$mOrthographicWidth
    ).withName("aiCamera");

    public aiCamera(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static aiCamera getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new aiCamera(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public assimp.aiString mName() {return new assimp.aiString(this.ptr.asSlice(OFFSET$mName, LAYOUT$mName));}
    public void mName(java.util.function.Consumer<assimp.aiString> consumer) {consumer.accept(this.mName());}
    public void mName(assimp.aiString value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$mName, LAYOUT$mName.byteSize());}

    public assimp.aiVector3D mPosition() {return new assimp.aiVector3D(this.ptr.asSlice(OFFSET$mPosition, LAYOUT$mPosition));}
    public void mPosition(java.util.function.Consumer<assimp.aiVector3D> consumer) {consumer.accept(this.mPosition());}
    public void mPosition(assimp.aiVector3D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$mPosition, LAYOUT$mPosition.byteSize());}

    public assimp.aiVector3D mUp() {return new assimp.aiVector3D(this.ptr.asSlice(OFFSET$mUp, LAYOUT$mUp));}
    public void mUp(java.util.function.Consumer<assimp.aiVector3D> consumer) {consumer.accept(this.mUp());}
    public void mUp(assimp.aiVector3D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$mUp, LAYOUT$mUp.byteSize());}

    public assimp.aiVector3D mLookAt() {return new assimp.aiVector3D(this.ptr.asSlice(OFFSET$mLookAt, LAYOUT$mLookAt));}
    public void mLookAt(java.util.function.Consumer<assimp.aiVector3D> consumer) {consumer.accept(this.mLookAt());}
    public void mLookAt(assimp.aiVector3D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$mLookAt, LAYOUT$mLookAt.byteSize());}

    public float mHorizontalFOV() {return this.ptr.get(LAYOUT$mHorizontalFOV, OFFSET$mHorizontalFOV);}
    public void mHorizontalFOV(float value) {this.ptr.set(LAYOUT$mHorizontalFOV, OFFSET$mHorizontalFOV, value);}
    public java.lang.foreign.MemorySegment mHorizontalFOV_ptr() {return this.ptr.asSlice(OFFSET$mHorizontalFOV, LAYOUT$mHorizontalFOV);}

    public float mClipPlaneNear() {return this.ptr.get(LAYOUT$mClipPlaneNear, OFFSET$mClipPlaneNear);}
    public void mClipPlaneNear(float value) {this.ptr.set(LAYOUT$mClipPlaneNear, OFFSET$mClipPlaneNear, value);}
    public java.lang.foreign.MemorySegment mClipPlaneNear_ptr() {return this.ptr.asSlice(OFFSET$mClipPlaneNear, LAYOUT$mClipPlaneNear);}

    public float mClipPlaneFar() {return this.ptr.get(LAYOUT$mClipPlaneFar, OFFSET$mClipPlaneFar);}
    public void mClipPlaneFar(float value) {this.ptr.set(LAYOUT$mClipPlaneFar, OFFSET$mClipPlaneFar, value);}
    public java.lang.foreign.MemorySegment mClipPlaneFar_ptr() {return this.ptr.asSlice(OFFSET$mClipPlaneFar, LAYOUT$mClipPlaneFar);}

    public float mAspect() {return this.ptr.get(LAYOUT$mAspect, OFFSET$mAspect);}
    public void mAspect(float value) {this.ptr.set(LAYOUT$mAspect, OFFSET$mAspect, value);}
    public java.lang.foreign.MemorySegment mAspect_ptr() {return this.ptr.asSlice(OFFSET$mAspect, LAYOUT$mAspect);}

    public float mOrthographicWidth() {return this.ptr.get(LAYOUT$mOrthographicWidth, OFFSET$mOrthographicWidth);}
    public void mOrthographicWidth(float value) {this.ptr.set(LAYOUT$mOrthographicWidth, OFFSET$mOrthographicWidth, value);}
    public java.lang.foreign.MemorySegment mOrthographicWidth_ptr() {return this.ptr.asSlice(OFFSET$mOrthographicWidth, LAYOUT$mOrthographicWidth);}
}
