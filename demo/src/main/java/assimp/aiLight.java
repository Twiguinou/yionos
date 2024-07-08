package assimp;

public record aiLight(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT__mName = assimp.aiString.gRecordLayout.withName("mName");
    public static final long OFFSET__mName = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__mType = java.lang.foreign.ValueLayout.JAVA_INT.withName("mType");
    public static final long OFFSET__mType = 1028;
    public static final java.lang.foreign.StructLayout LAYOUT__mPosition = assimp.aiVector3D.gRecordLayout.withName("mPosition");
    public static final long OFFSET__mPosition = 1032;
    public static final java.lang.foreign.StructLayout LAYOUT__mDirection = assimp.aiVector3D.gRecordLayout.withName("mDirection");
    public static final long OFFSET__mDirection = 1044;
    public static final java.lang.foreign.StructLayout LAYOUT__mUp = assimp.aiVector3D.gRecordLayout.withName("mUp");
    public static final long OFFSET__mUp = 1056;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__mAttenuationConstant = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("mAttenuationConstant");
    public static final long OFFSET__mAttenuationConstant = 1068;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__mAttenuationLinear = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("mAttenuationLinear");
    public static final long OFFSET__mAttenuationLinear = 1072;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__mAttenuationQuadratic = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("mAttenuationQuadratic");
    public static final long OFFSET__mAttenuationQuadratic = 1076;
    public static final java.lang.foreign.StructLayout LAYOUT__mColorDiffuse = assimp.aiColor3D.gRecordLayout.withName("mColorDiffuse");
    public static final long OFFSET__mColorDiffuse = 1080;
    public static final java.lang.foreign.StructLayout LAYOUT__mColorSpecular = assimp.aiColor3D.gRecordLayout.withName("mColorSpecular");
    public static final long OFFSET__mColorSpecular = 1092;
    public static final java.lang.foreign.StructLayout LAYOUT__mColorAmbient = assimp.aiColor3D.gRecordLayout.withName("mColorAmbient");
    public static final long OFFSET__mColorAmbient = 1104;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__mAngleInnerCone = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("mAngleInnerCone");
    public static final long OFFSET__mAngleInnerCone = 1116;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__mAngleOuterCone = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("mAngleOuterCone");
    public static final long OFFSET__mAngleOuterCone = 1120;
    public static final java.lang.foreign.StructLayout LAYOUT__mSize = assimp.aiVector2D.gRecordLayout.withName("mSize");
    public static final long OFFSET__mSize = 1124;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__mName,
            LAYOUT__mType,
            LAYOUT__mPosition,
            LAYOUT__mDirection,
            LAYOUT__mUp,
            LAYOUT__mAttenuationConstant,
            LAYOUT__mAttenuationLinear,
            LAYOUT__mAttenuationQuadratic,
            LAYOUT__mColorDiffuse,
            LAYOUT__mColorSpecular,
            LAYOUT__mColorAmbient,
            LAYOUT__mAngleInnerCone,
            LAYOUT__mAngleOuterCone,
            LAYOUT__mSize
    ).withByteAlignment(4).withName("aiLight");

    public aiLight(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static aiLight getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new aiLight(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, aiLight value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public assimp.aiString mName() {return new assimp.aiString(this.ptr.asSlice(OFFSET__mName, LAYOUT__mName));}
    public void mName(java.util.function.Consumer<assimp.aiString> consumer) {consumer.accept(this.mName());}
    public void mName(assimp.aiString value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__mName, LAYOUT__mName.byteSize());}

    public int mType() {return this.ptr.get(LAYOUT__mType, OFFSET__mType);}
    public void mType(int value) {this.ptr.set(LAYOUT__mType, OFFSET__mType, value);}
    public java.lang.foreign.MemorySegment $mType() {return this.ptr.asSlice(OFFSET__mType, LAYOUT__mType);}

    public assimp.aiVector3D mPosition() {return new assimp.aiVector3D(this.ptr.asSlice(OFFSET__mPosition, LAYOUT__mPosition));}
    public void mPosition(java.util.function.Consumer<assimp.aiVector3D> consumer) {consumer.accept(this.mPosition());}
    public void mPosition(assimp.aiVector3D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__mPosition, LAYOUT__mPosition.byteSize());}

    public assimp.aiVector3D mDirection() {return new assimp.aiVector3D(this.ptr.asSlice(OFFSET__mDirection, LAYOUT__mDirection));}
    public void mDirection(java.util.function.Consumer<assimp.aiVector3D> consumer) {consumer.accept(this.mDirection());}
    public void mDirection(assimp.aiVector3D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__mDirection, LAYOUT__mDirection.byteSize());}

    public assimp.aiVector3D mUp() {return new assimp.aiVector3D(this.ptr.asSlice(OFFSET__mUp, LAYOUT__mUp));}
    public void mUp(java.util.function.Consumer<assimp.aiVector3D> consumer) {consumer.accept(this.mUp());}
    public void mUp(assimp.aiVector3D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__mUp, LAYOUT__mUp.byteSize());}

    public float mAttenuationConstant() {return this.ptr.get(LAYOUT__mAttenuationConstant, OFFSET__mAttenuationConstant);}
    public void mAttenuationConstant(float value) {this.ptr.set(LAYOUT__mAttenuationConstant, OFFSET__mAttenuationConstant, value);}
    public java.lang.foreign.MemorySegment $mAttenuationConstant() {return this.ptr.asSlice(OFFSET__mAttenuationConstant, LAYOUT__mAttenuationConstant);}

    public float mAttenuationLinear() {return this.ptr.get(LAYOUT__mAttenuationLinear, OFFSET__mAttenuationLinear);}
    public void mAttenuationLinear(float value) {this.ptr.set(LAYOUT__mAttenuationLinear, OFFSET__mAttenuationLinear, value);}
    public java.lang.foreign.MemorySegment $mAttenuationLinear() {return this.ptr.asSlice(OFFSET__mAttenuationLinear, LAYOUT__mAttenuationLinear);}

    public float mAttenuationQuadratic() {return this.ptr.get(LAYOUT__mAttenuationQuadratic, OFFSET__mAttenuationQuadratic);}
    public void mAttenuationQuadratic(float value) {this.ptr.set(LAYOUT__mAttenuationQuadratic, OFFSET__mAttenuationQuadratic, value);}
    public java.lang.foreign.MemorySegment $mAttenuationQuadratic() {return this.ptr.asSlice(OFFSET__mAttenuationQuadratic, LAYOUT__mAttenuationQuadratic);}

    public assimp.aiColor3D mColorDiffuse() {return new assimp.aiColor3D(this.ptr.asSlice(OFFSET__mColorDiffuse, LAYOUT__mColorDiffuse));}
    public void mColorDiffuse(java.util.function.Consumer<assimp.aiColor3D> consumer) {consumer.accept(this.mColorDiffuse());}
    public void mColorDiffuse(assimp.aiColor3D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__mColorDiffuse, LAYOUT__mColorDiffuse.byteSize());}

    public assimp.aiColor3D mColorSpecular() {return new assimp.aiColor3D(this.ptr.asSlice(OFFSET__mColorSpecular, LAYOUT__mColorSpecular));}
    public void mColorSpecular(java.util.function.Consumer<assimp.aiColor3D> consumer) {consumer.accept(this.mColorSpecular());}
    public void mColorSpecular(assimp.aiColor3D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__mColorSpecular, LAYOUT__mColorSpecular.byteSize());}

    public assimp.aiColor3D mColorAmbient() {return new assimp.aiColor3D(this.ptr.asSlice(OFFSET__mColorAmbient, LAYOUT__mColorAmbient));}
    public void mColorAmbient(java.util.function.Consumer<assimp.aiColor3D> consumer) {consumer.accept(this.mColorAmbient());}
    public void mColorAmbient(assimp.aiColor3D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__mColorAmbient, LAYOUT__mColorAmbient.byteSize());}

    public float mAngleInnerCone() {return this.ptr.get(LAYOUT__mAngleInnerCone, OFFSET__mAngleInnerCone);}
    public void mAngleInnerCone(float value) {this.ptr.set(LAYOUT__mAngleInnerCone, OFFSET__mAngleInnerCone, value);}
    public java.lang.foreign.MemorySegment $mAngleInnerCone() {return this.ptr.asSlice(OFFSET__mAngleInnerCone, LAYOUT__mAngleInnerCone);}

    public float mAngleOuterCone() {return this.ptr.get(LAYOUT__mAngleOuterCone, OFFSET__mAngleOuterCone);}
    public void mAngleOuterCone(float value) {this.ptr.set(LAYOUT__mAngleOuterCone, OFFSET__mAngleOuterCone, value);}
    public java.lang.foreign.MemorySegment $mAngleOuterCone() {return this.ptr.asSlice(OFFSET__mAngleOuterCone, LAYOUT__mAngleOuterCone);}

    public assimp.aiVector2D mSize() {return new assimp.aiVector2D(this.ptr.asSlice(OFFSET__mSize, LAYOUT__mSize));}
    public void mSize(java.util.function.Consumer<assimp.aiVector2D> consumer) {consumer.accept(this.mSize());}
    public void mSize(assimp.aiVector2D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__mSize, LAYOUT__mSize.byteSize());}
}
