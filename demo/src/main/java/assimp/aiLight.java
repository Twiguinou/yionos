package assimp;

public record aiLight(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.GroupLayout LAYOUT$mName = assimp.aiString.gStructLayout;
    public static final long OFFSET$mName = 0L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$mType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$mType = 1028L;
    public static final java.lang.foreign.GroupLayout LAYOUT$mPosition = assimp.aiVector3D.gStructLayout;
    public static final long OFFSET$mPosition = 1032L;
    public static final java.lang.foreign.GroupLayout LAYOUT$mDirection = assimp.aiVector3D.gStructLayout;
    public static final long OFFSET$mDirection = 1044L;
    public static final java.lang.foreign.GroupLayout LAYOUT$mUp = assimp.aiVector3D.gStructLayout;
    public static final long OFFSET$mUp = 1056L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$mAttenuationConstant = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$mAttenuationConstant = 1068L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$mAttenuationLinear = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$mAttenuationLinear = 1072L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$mAttenuationQuadratic = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$mAttenuationQuadratic = 1076L;
    public static final java.lang.foreign.GroupLayout LAYOUT$mColorDiffuse = assimp.aiColor3D.gStructLayout;
    public static final long OFFSET$mColorDiffuse = 1080L;
    public static final java.lang.foreign.GroupLayout LAYOUT$mColorSpecular = assimp.aiColor3D.gStructLayout;
    public static final long OFFSET$mColorSpecular = 1092L;
    public static final java.lang.foreign.GroupLayout LAYOUT$mColorAmbient = assimp.aiColor3D.gStructLayout;
    public static final long OFFSET$mColorAmbient = 1104L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$mAngleInnerCone = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$mAngleInnerCone = 1116L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$mAngleOuterCone = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$mAngleOuterCone = 1120L;
    public static final java.lang.foreign.GroupLayout LAYOUT$mSize = assimp.aiVector2D.gStructLayout;
    public static final long OFFSET$mSize = 1124L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$mName,
            LAYOUT$mType,
            LAYOUT$mPosition,
            LAYOUT$mDirection,
            LAYOUT$mUp,
            LAYOUT$mAttenuationConstant,
            LAYOUT$mAttenuationLinear,
            LAYOUT$mAttenuationQuadratic,
            LAYOUT$mColorDiffuse,
            LAYOUT$mColorSpecular,
            LAYOUT$mColorAmbient,
            LAYOUT$mAngleInnerCone,
            LAYOUT$mAngleOuterCone,
            LAYOUT$mSize
    ).withName("aiLight");

    public aiLight(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static aiLight getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new aiLight(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public assimp.aiString mName() {return new assimp.aiString(this.ptr.asSlice(OFFSET$mName, LAYOUT$mName));}
    public void mName(java.util.function.Consumer<assimp.aiString> consumer) {consumer.accept(this.mName());}
    public void mName(assimp.aiString value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$mName, LAYOUT$mName.byteSize());}

    public int mType() {return this.ptr.get(LAYOUT$mType, OFFSET$mType);}
    public void mType(int value) {this.ptr.set(LAYOUT$mType, OFFSET$mType, value);}
    public java.lang.foreign.MemorySegment mType_ptr() {return this.ptr.asSlice(OFFSET$mType, LAYOUT$mType);}

    public assimp.aiVector3D mPosition() {return new assimp.aiVector3D(this.ptr.asSlice(OFFSET$mPosition, LAYOUT$mPosition));}
    public void mPosition(java.util.function.Consumer<assimp.aiVector3D> consumer) {consumer.accept(this.mPosition());}
    public void mPosition(assimp.aiVector3D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$mPosition, LAYOUT$mPosition.byteSize());}

    public assimp.aiVector3D mDirection() {return new assimp.aiVector3D(this.ptr.asSlice(OFFSET$mDirection, LAYOUT$mDirection));}
    public void mDirection(java.util.function.Consumer<assimp.aiVector3D> consumer) {consumer.accept(this.mDirection());}
    public void mDirection(assimp.aiVector3D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$mDirection, LAYOUT$mDirection.byteSize());}

    public assimp.aiVector3D mUp() {return new assimp.aiVector3D(this.ptr.asSlice(OFFSET$mUp, LAYOUT$mUp));}
    public void mUp(java.util.function.Consumer<assimp.aiVector3D> consumer) {consumer.accept(this.mUp());}
    public void mUp(assimp.aiVector3D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$mUp, LAYOUT$mUp.byteSize());}

    public float mAttenuationConstant() {return this.ptr.get(LAYOUT$mAttenuationConstant, OFFSET$mAttenuationConstant);}
    public void mAttenuationConstant(float value) {this.ptr.set(LAYOUT$mAttenuationConstant, OFFSET$mAttenuationConstant, value);}
    public java.lang.foreign.MemorySegment mAttenuationConstant_ptr() {return this.ptr.asSlice(OFFSET$mAttenuationConstant, LAYOUT$mAttenuationConstant);}

    public float mAttenuationLinear() {return this.ptr.get(LAYOUT$mAttenuationLinear, OFFSET$mAttenuationLinear);}
    public void mAttenuationLinear(float value) {this.ptr.set(LAYOUT$mAttenuationLinear, OFFSET$mAttenuationLinear, value);}
    public java.lang.foreign.MemorySegment mAttenuationLinear_ptr() {return this.ptr.asSlice(OFFSET$mAttenuationLinear, LAYOUT$mAttenuationLinear);}

    public float mAttenuationQuadratic() {return this.ptr.get(LAYOUT$mAttenuationQuadratic, OFFSET$mAttenuationQuadratic);}
    public void mAttenuationQuadratic(float value) {this.ptr.set(LAYOUT$mAttenuationQuadratic, OFFSET$mAttenuationQuadratic, value);}
    public java.lang.foreign.MemorySegment mAttenuationQuadratic_ptr() {return this.ptr.asSlice(OFFSET$mAttenuationQuadratic, LAYOUT$mAttenuationQuadratic);}

    public assimp.aiColor3D mColorDiffuse() {return new assimp.aiColor3D(this.ptr.asSlice(OFFSET$mColorDiffuse, LAYOUT$mColorDiffuse));}
    public void mColorDiffuse(java.util.function.Consumer<assimp.aiColor3D> consumer) {consumer.accept(this.mColorDiffuse());}
    public void mColorDiffuse(assimp.aiColor3D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$mColorDiffuse, LAYOUT$mColorDiffuse.byteSize());}

    public assimp.aiColor3D mColorSpecular() {return new assimp.aiColor3D(this.ptr.asSlice(OFFSET$mColorSpecular, LAYOUT$mColorSpecular));}
    public void mColorSpecular(java.util.function.Consumer<assimp.aiColor3D> consumer) {consumer.accept(this.mColorSpecular());}
    public void mColorSpecular(assimp.aiColor3D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$mColorSpecular, LAYOUT$mColorSpecular.byteSize());}

    public assimp.aiColor3D mColorAmbient() {return new assimp.aiColor3D(this.ptr.asSlice(OFFSET$mColorAmbient, LAYOUT$mColorAmbient));}
    public void mColorAmbient(java.util.function.Consumer<assimp.aiColor3D> consumer) {consumer.accept(this.mColorAmbient());}
    public void mColorAmbient(assimp.aiColor3D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$mColorAmbient, LAYOUT$mColorAmbient.byteSize());}

    public float mAngleInnerCone() {return this.ptr.get(LAYOUT$mAngleInnerCone, OFFSET$mAngleInnerCone);}
    public void mAngleInnerCone(float value) {this.ptr.set(LAYOUT$mAngleInnerCone, OFFSET$mAngleInnerCone, value);}
    public java.lang.foreign.MemorySegment mAngleInnerCone_ptr() {return this.ptr.asSlice(OFFSET$mAngleInnerCone, LAYOUT$mAngleInnerCone);}

    public float mAngleOuterCone() {return this.ptr.get(LAYOUT$mAngleOuterCone, OFFSET$mAngleOuterCone);}
    public void mAngleOuterCone(float value) {this.ptr.set(LAYOUT$mAngleOuterCone, OFFSET$mAngleOuterCone, value);}
    public java.lang.foreign.MemorySegment mAngleOuterCone_ptr() {return this.ptr.asSlice(OFFSET$mAngleOuterCone, LAYOUT$mAngleOuterCone);}

    public assimp.aiVector2D mSize() {return new assimp.aiVector2D(this.ptr.asSlice(OFFSET$mSize, LAYOUT$mSize));}
    public void mSize(java.util.function.Consumer<assimp.aiVector2D> consumer) {consumer.accept(this.mSize());}
    public void mSize(assimp.aiVector2D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$mSize, LAYOUT$mSize.byteSize());}
}
