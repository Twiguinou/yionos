package assimp;

public final class Assimp
{private Assimp() {}

    public static final int ASSIMP_CFLAGS_SINGLETHREADED = 16;
    public static final int AI_FALSE = 0;
    public static final int AI_SCENE_FLAGS_NON_VERBOSE_FORMAT = 8;
    public static final int AI_MAX_FACES = 2147483647;
    public static final int AI_MAX_NUMBER_OF_TEXTURECOORDS = 8;
    public static final int ASSIMP_CFLAGS_DOUBLE_SUPPORT = 32;
    public static final int AI_TRUE = 1;
    public static final int AI_MAX_BONE_WEIGHTS = 2147483647;
    public static final int AI_MAX_FACE_INDICES = 32767;
    public static final int AI_SCENE_FLAGS_ALLOW_SHARED = 32;
    public static final int AI_MAX_VERTICES = 2147483647;
    public static final int ASSIMP_CFLAGS_SHARED = 1;
    public static final int AI_SCENE_FLAGS_VALIDATION_WARNING = 4;
    public static final int MAXLEN = 1024;
    public static final int AI_SCENE_FLAGS_VALIDATED = 2;
    public static final int AI_MAX_NUMBER_OF_COLOR_SETS = 8;
    public static final int HINTMAXTEXTURELEN = 9;
    public static final int ASSIMP_CFLAGS_STLPORT = 2;
    public static final int ASSIMP_CFLAGS_DEBUG = 4;
    public static final int ASSIMP_CFLAGS_NOBOOST = 8;
    public static final int AI_SCENE_FLAGS_INCOMPLETE = 1;
    public static final int AI_SCENE_FLAGS_TERRAIN = 16;

    public static final java.lang.foreign.Linker gSystemLinker;
    public static final java.lang.foreign.SymbolLookup gLibLookup;

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiImportFile;
    public static final java.lang.invoke.MethodHandle MTD$aiImportFile;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiImportFileEx;
    public static final java.lang.invoke.MethodHandle MTD$aiImportFileEx;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiImportFileExWithProperties;
    public static final java.lang.invoke.MethodHandle MTD$aiImportFileExWithProperties;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiImportFileFromMemory;
    public static final java.lang.invoke.MethodHandle MTD$aiImportFileFromMemory;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiImportFileFromMemoryWithProperties;
    public static final java.lang.invoke.MethodHandle MTD$aiImportFileFromMemoryWithProperties;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiApplyPostProcessing;
    public static final java.lang.invoke.MethodHandle MTD$aiApplyPostProcessing;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiGetPredefinedLogStream;
    public static final java.lang.invoke.MethodHandle MTD$aiGetPredefinedLogStream;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiAttachLogStream;
    public static final java.lang.invoke.MethodHandle MTD$aiAttachLogStream;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiEnableVerboseLogging;
    public static final java.lang.invoke.MethodHandle MTD$aiEnableVerboseLogging;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiDetachLogStream;
    public static final java.lang.invoke.MethodHandle MTD$aiDetachLogStream;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiDetachAllLogStreams;
    public static final java.lang.invoke.MethodHandle MTD$aiDetachAllLogStreams;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiReleaseImport;
    public static final java.lang.invoke.MethodHandle MTD$aiReleaseImport;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiGetErrorString;
    public static final java.lang.invoke.MethodHandle MTD$aiGetErrorString;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiIsExtensionSupported;
    public static final java.lang.invoke.MethodHandle MTD$aiIsExtensionSupported;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiGetExtensionList;
    public static final java.lang.invoke.MethodHandle MTD$aiGetExtensionList;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiGetMemoryRequirements;
    public static final java.lang.invoke.MethodHandle MTD$aiGetMemoryRequirements;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiCreatePropertyStore;
    public static final java.lang.invoke.MethodHandle MTD$aiCreatePropertyStore;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiReleasePropertyStore;
    public static final java.lang.invoke.MethodHandle MTD$aiReleasePropertyStore;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiSetImportPropertyInteger;
    public static final java.lang.invoke.MethodHandle MTD$aiSetImportPropertyInteger;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiSetImportPropertyFloat;
    public static final java.lang.invoke.MethodHandle MTD$aiSetImportPropertyFloat;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiSetImportPropertyString;
    public static final java.lang.invoke.MethodHandle MTD$aiSetImportPropertyString;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiSetImportPropertyMatrix;
    public static final java.lang.invoke.MethodHandle MTD$aiSetImportPropertyMatrix;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiCreateQuaternionFromMatrix;
    public static final java.lang.invoke.MethodHandle MTD$aiCreateQuaternionFromMatrix;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiDecomposeMatrix;
    public static final java.lang.invoke.MethodHandle MTD$aiDecomposeMatrix;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiTransposeMatrix4;
    public static final java.lang.invoke.MethodHandle MTD$aiTransposeMatrix4;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiTransposeMatrix3;
    public static final java.lang.invoke.MethodHandle MTD$aiTransposeMatrix3;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiTransformVecByMatrix3;
    public static final java.lang.invoke.MethodHandle MTD$aiTransformVecByMatrix3;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiTransformVecByMatrix4;
    public static final java.lang.invoke.MethodHandle MTD$aiTransformVecByMatrix4;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiMultiplyMatrix4;
    public static final java.lang.invoke.MethodHandle MTD$aiMultiplyMatrix4;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiMultiplyMatrix3;
    public static final java.lang.invoke.MethodHandle MTD$aiMultiplyMatrix3;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiIdentityMatrix3;
    public static final java.lang.invoke.MethodHandle MTD$aiIdentityMatrix3;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiIdentityMatrix4;
    public static final java.lang.invoke.MethodHandle MTD$aiIdentityMatrix4;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiGetImportFormatCount;
    public static final java.lang.invoke.MethodHandle MTD$aiGetImportFormatCount;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiGetImportFormatDescription;
    public static final java.lang.invoke.MethodHandle MTD$aiGetImportFormatDescription;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiVector2AreEqual;
    public static final java.lang.invoke.MethodHandle MTD$aiVector2AreEqual;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiVector2AreEqualEpsilon;
    public static final java.lang.invoke.MethodHandle MTD$aiVector2AreEqualEpsilon;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiVector2Add;
    public static final java.lang.invoke.MethodHandle MTD$aiVector2Add;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiVector2Subtract;
    public static final java.lang.invoke.MethodHandle MTD$aiVector2Subtract;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiVector2Scale;
    public static final java.lang.invoke.MethodHandle MTD$aiVector2Scale;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiVector2SymMul;
    public static final java.lang.invoke.MethodHandle MTD$aiVector2SymMul;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiVector2DivideByScalar;
    public static final java.lang.invoke.MethodHandle MTD$aiVector2DivideByScalar;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiVector2DivideByVector;
    public static final java.lang.invoke.MethodHandle MTD$aiVector2DivideByVector;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiVector2Length;
    public static final java.lang.invoke.MethodHandle MTD$aiVector2Length;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiVector2SquareLength;
    public static final java.lang.invoke.MethodHandle MTD$aiVector2SquareLength;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiVector2Negate;
    public static final java.lang.invoke.MethodHandle MTD$aiVector2Negate;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiVector2DotProduct;
    public static final java.lang.invoke.MethodHandle MTD$aiVector2DotProduct;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiVector2Normalize;
    public static final java.lang.invoke.MethodHandle MTD$aiVector2Normalize;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiVector3AreEqual;
    public static final java.lang.invoke.MethodHandle MTD$aiVector3AreEqual;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiVector3AreEqualEpsilon;
    public static final java.lang.invoke.MethodHandle MTD$aiVector3AreEqualEpsilon;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiVector3LessThan;
    public static final java.lang.invoke.MethodHandle MTD$aiVector3LessThan;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiVector3Add;
    public static final java.lang.invoke.MethodHandle MTD$aiVector3Add;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiVector3Subtract;
    public static final java.lang.invoke.MethodHandle MTD$aiVector3Subtract;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiVector3Scale;
    public static final java.lang.invoke.MethodHandle MTD$aiVector3Scale;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiVector3SymMul;
    public static final java.lang.invoke.MethodHandle MTD$aiVector3SymMul;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiVector3DivideByScalar;
    public static final java.lang.invoke.MethodHandle MTD$aiVector3DivideByScalar;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiVector3DivideByVector;
    public static final java.lang.invoke.MethodHandle MTD$aiVector3DivideByVector;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiVector3Length;
    public static final java.lang.invoke.MethodHandle MTD$aiVector3Length;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiVector3SquareLength;
    public static final java.lang.invoke.MethodHandle MTD$aiVector3SquareLength;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiVector3Negate;
    public static final java.lang.invoke.MethodHandle MTD$aiVector3Negate;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiVector3DotProduct;
    public static final java.lang.invoke.MethodHandle MTD$aiVector3DotProduct;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiVector3CrossProduct;
    public static final java.lang.invoke.MethodHandle MTD$aiVector3CrossProduct;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiVector3Normalize;
    public static final java.lang.invoke.MethodHandle MTD$aiVector3Normalize;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiVector3NormalizeSafe;
    public static final java.lang.invoke.MethodHandle MTD$aiVector3NormalizeSafe;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiVector3RotateByQuaternion;
    public static final java.lang.invoke.MethodHandle MTD$aiVector3RotateByQuaternion;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiMatrix3FromMatrix4;
    public static final java.lang.invoke.MethodHandle MTD$aiMatrix3FromMatrix4;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiMatrix3FromQuaternion;
    public static final java.lang.invoke.MethodHandle MTD$aiMatrix3FromQuaternion;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiMatrix3AreEqual;
    public static final java.lang.invoke.MethodHandle MTD$aiMatrix3AreEqual;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiMatrix3AreEqualEpsilon;
    public static final java.lang.invoke.MethodHandle MTD$aiMatrix3AreEqualEpsilon;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiMatrix3Inverse;
    public static final java.lang.invoke.MethodHandle MTD$aiMatrix3Inverse;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiMatrix3Determinant;
    public static final java.lang.invoke.MethodHandle MTD$aiMatrix3Determinant;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiMatrix3RotationZ;
    public static final java.lang.invoke.MethodHandle MTD$aiMatrix3RotationZ;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiMatrix3FromRotationAroundAxis;
    public static final java.lang.invoke.MethodHandle MTD$aiMatrix3FromRotationAroundAxis;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiMatrix3Translation;
    public static final java.lang.invoke.MethodHandle MTD$aiMatrix3Translation;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiMatrix3FromTo;
    public static final java.lang.invoke.MethodHandle MTD$aiMatrix3FromTo;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiMatrix4FromMatrix3;
    public static final java.lang.invoke.MethodHandle MTD$aiMatrix4FromMatrix3;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiMatrix4FromScalingQuaternionPosition;
    public static final java.lang.invoke.MethodHandle MTD$aiMatrix4FromScalingQuaternionPosition;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiMatrix4Add;
    public static final java.lang.invoke.MethodHandle MTD$aiMatrix4Add;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiMatrix4AreEqual;
    public static final java.lang.invoke.MethodHandle MTD$aiMatrix4AreEqual;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiMatrix4AreEqualEpsilon;
    public static final java.lang.invoke.MethodHandle MTD$aiMatrix4AreEqualEpsilon;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiMatrix4Inverse;
    public static final java.lang.invoke.MethodHandle MTD$aiMatrix4Inverse;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiMatrix4Determinant;
    public static final java.lang.invoke.MethodHandle MTD$aiMatrix4Determinant;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiMatrix4IsIdentity;
    public static final java.lang.invoke.MethodHandle MTD$aiMatrix4IsIdentity;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiMatrix4DecomposeIntoScalingEulerAnglesPosition;
    public static final java.lang.invoke.MethodHandle MTD$aiMatrix4DecomposeIntoScalingEulerAnglesPosition;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiMatrix4DecomposeIntoScalingAxisAnglePosition;
    public static final java.lang.invoke.MethodHandle MTD$aiMatrix4DecomposeIntoScalingAxisAnglePosition;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiMatrix4DecomposeNoScaling;
    public static final java.lang.invoke.MethodHandle MTD$aiMatrix4DecomposeNoScaling;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiMatrix4FromEulerAngles;
    public static final java.lang.invoke.MethodHandle MTD$aiMatrix4FromEulerAngles;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiMatrix4RotationX;
    public static final java.lang.invoke.MethodHandle MTD$aiMatrix4RotationX;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiMatrix4RotationY;
    public static final java.lang.invoke.MethodHandle MTD$aiMatrix4RotationY;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiMatrix4RotationZ;
    public static final java.lang.invoke.MethodHandle MTD$aiMatrix4RotationZ;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiMatrix4FromRotationAroundAxis;
    public static final java.lang.invoke.MethodHandle MTD$aiMatrix4FromRotationAroundAxis;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiMatrix4Translation;
    public static final java.lang.invoke.MethodHandle MTD$aiMatrix4Translation;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiMatrix4Scaling;
    public static final java.lang.invoke.MethodHandle MTD$aiMatrix4Scaling;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiMatrix4FromTo;
    public static final java.lang.invoke.MethodHandle MTD$aiMatrix4FromTo;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiQuaternionFromEulerAngles;
    public static final java.lang.invoke.MethodHandle MTD$aiQuaternionFromEulerAngles;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiQuaternionFromAxisAngle;
    public static final java.lang.invoke.MethodHandle MTD$aiQuaternionFromAxisAngle;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiQuaternionFromNormalizedQuaternion;
    public static final java.lang.invoke.MethodHandle MTD$aiQuaternionFromNormalizedQuaternion;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiQuaternionAreEqual;
    public static final java.lang.invoke.MethodHandle MTD$aiQuaternionAreEqual;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiQuaternionAreEqualEpsilon;
    public static final java.lang.invoke.MethodHandle MTD$aiQuaternionAreEqualEpsilon;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiQuaternionNormalize;
    public static final java.lang.invoke.MethodHandle MTD$aiQuaternionNormalize;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiQuaternionConjugate;
    public static final java.lang.invoke.MethodHandle MTD$aiQuaternionConjugate;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiQuaternionMultiply;
    public static final java.lang.invoke.MethodHandle MTD$aiQuaternionMultiply;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiQuaternionInterpolate;
    public static final java.lang.invoke.MethodHandle MTD$aiQuaternionInterpolate;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiGetExportFormatCount;
    public static final java.lang.invoke.MethodHandle MTD$aiGetExportFormatCount;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiGetExportFormatDescription;
    public static final java.lang.invoke.MethodHandle MTD$aiGetExportFormatDescription;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiReleaseExportFormatDescription;
    public static final java.lang.invoke.MethodHandle MTD$aiReleaseExportFormatDescription;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiCopyScene;
    public static final java.lang.invoke.MethodHandle MTD$aiCopyScene;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiFreeScene;
    public static final java.lang.invoke.MethodHandle MTD$aiFreeScene;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiExportScene;
    public static final java.lang.invoke.MethodHandle MTD$aiExportScene;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiExportSceneEx;
    public static final java.lang.invoke.MethodHandle MTD$aiExportSceneEx;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiExportSceneToBlob;
    public static final java.lang.invoke.MethodHandle MTD$aiExportSceneToBlob;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiReleaseExportBlob;
    public static final java.lang.invoke.MethodHandle MTD$aiReleaseExportBlob;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiGetImporterDesc;
    public static final java.lang.invoke.MethodHandle MTD$aiGetImporterDesc;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiTextureTypeToString;
    public static final java.lang.invoke.MethodHandle MTD$aiTextureTypeToString;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiGetMaterialProperty;
    public static final java.lang.invoke.MethodHandle MTD$aiGetMaterialProperty;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiGetMaterialFloatArray;
    public static final java.lang.invoke.MethodHandle MTD$aiGetMaterialFloatArray;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiGetMaterialIntegerArray;
    public static final java.lang.invoke.MethodHandle MTD$aiGetMaterialIntegerArray;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiGetMaterialColor;
    public static final java.lang.invoke.MethodHandle MTD$aiGetMaterialColor;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiGetMaterialUVTransform;
    public static final java.lang.invoke.MethodHandle MTD$aiGetMaterialUVTransform;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiGetMaterialString;
    public static final java.lang.invoke.MethodHandle MTD$aiGetMaterialString;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiGetMaterialTextureCount;
    public static final java.lang.invoke.MethodHandle MTD$aiGetMaterialTextureCount;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiGetMaterialTexture;
    public static final java.lang.invoke.MethodHandle MTD$aiGetMaterialTexture;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiGetLegalString;
    public static final java.lang.invoke.MethodHandle MTD$aiGetLegalString;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiGetVersionPatch;
    public static final java.lang.invoke.MethodHandle MTD$aiGetVersionPatch;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiGetVersionMinor;
    public static final java.lang.invoke.MethodHandle MTD$aiGetVersionMinor;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiGetVersionMajor;
    public static final java.lang.invoke.MethodHandle MTD$aiGetVersionMajor;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiGetVersionRevision;
    public static final java.lang.invoke.MethodHandle MTD$aiGetVersionRevision;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiGetBranchName;
    public static final java.lang.invoke.MethodHandle MTD$aiGetBranchName;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$aiGetCompileFlags;
    public static final java.lang.invoke.MethodHandle MTD$aiGetCompileFlags;

    // --------------------------------------------------------------------------------
    /** Reads the given file and returns its content.
     *
     * If the call succeeds, the imported data is returned in an aiScene structure.
     * The data is intended to be read-only, it stays property of the ASSIMP
     * library and will be stable until aiReleaseImport() is called. After you're
     * done with it, call aiReleaseImport() to free the resources associated with
     * this file. If the import fails, NULL is returned instead. Call
     * aiGetErrorString() to retrieve a human-readable error text.
     * @param pFile Path and filename of the file to be imported,
     *   expected to be a null-terminated c-string. NULL is not a valid value.
     * @param pFlags Optional post processing steps to be executed after
     *   a successful import. Provide a bitwise combination of the
     *   #aiPostProcessSteps flags.
     * @return Pointer to the imported data or NULL if the import failed.
     */
    public static java.lang.foreign.MemorySegment aiImportFile(java.lang.foreign.MemorySegment pFile, int pFlags)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$aiImportFile.invokeExact(pFile, pFlags);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Reads the given file using user-defined I/O functions and returns
     *   its content.
     *
     * If the call succeeds, the imported data is returned in an aiScene structure.
     * The data is intended to be read-only, it stays property of the ASSIMP
     * library and will be stable until aiReleaseImport() is called. After you're
     * done with it, call aiReleaseImport() to free the resources associated with
     * this file. If the import fails, NULL is returned instead. Call
     * aiGetErrorString() to retrieve a human-readable error text.
     * @param pFile Path and filename of the file to be imported,
     *   expected to be a null-terminated c-string. NULL is not a valid value.
     * @param pFlags Optional post processing steps to be executed after
     *   a successful import. Provide a bitwise combination of the
     *   #aiPostProcessSteps flags.
     * @param pFS aiFileIO structure. Will be used to open the model file itself
     *   and any other files the loader needs to open.  Pass NULL to use the default
     *   implementation.
     * @return Pointer to the imported data or NULL if the import failed.
     * @note Include <aiFileIO.h> for the definition of #aiFileIO.
     */
    public static java.lang.foreign.MemorySegment aiImportFileEx(java.lang.foreign.MemorySegment pFile, int pFlags, java.lang.foreign.MemorySegment pFS)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$aiImportFileEx.invokeExact(pFile, pFlags, pFS);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Same as #aiImportFileEx, but adds an extra parameter containing importer settings.
     *
     * @param pFile Path and filename of the file to be imported,
     *   expected to be a null-terminated c-string. NULL is not a valid value.
     * @param pFlags Optional post processing steps to be executed after
     *   a successful import. Provide a bitwise combination of the
     *   #aiPostProcessSteps flags.
     * @param pFS aiFileIO structure. Will be used to open the model file itself
     *   and any other files the loader needs to open.  Pass NULL to use the default
     *   implementation.
     * @param pProps #aiPropertyStore instance containing import settings.
     * @return Pointer to the imported data or NULL if the import failed.
     * @note Include <aiFileIO.h> for the definition of #aiFileIO.
     * @see aiImportFileEx
     */
    public static java.lang.foreign.MemorySegment aiImportFileExWithProperties(java.lang.foreign.MemorySegment pFile, int pFlags, java.lang.foreign.MemorySegment pFS, java.lang.foreign.MemorySegment pProps)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$aiImportFileExWithProperties.invokeExact(pFile, pFlags, pFS, pProps);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Reads the given file from a given memory buffer,
     *
     * If the call succeeds, the contents of the file are returned as a pointer to an
     * aiScene object. The returned data is intended to be read-only, the importer keeps
     * ownership of the data and will destroy it upon destruction. If the import fails,
     * NULL is returned.
     * A human-readable error description can be retrieved by calling aiGetErrorString().
     * @param pBuffer Pointer to the file data
     * @param pLength Length of pBuffer, in bytes
     * @param pFlags Optional post processing steps to be executed after
     *   a successful import. Provide a bitwise combination of the
     *   #aiPostProcessSteps flags. If you wish to inspect the imported
     *   scene first in order to fine-tune your post-processing setup,
     *   consider to use #aiApplyPostProcessing().
     * @param pHint An additional hint to the library. If this is a non empty string,
     *   the library looks for a loader to support the file extension specified by pHint
     *   and passes the file to the first matching loader. If this loader is unable to
     *   completely the request, the library continues and tries to determine the file
     *   format on its own, a task that may or may not be successful.
     *   Check the return value, and you'll know ...
     * @return A pointer to the imported data, NULL if the import failed.
     *
     * @note This is a straightforward way to decode models from memory
     * buffers, but it doesn't handle model formats that spread their
     * data across multiple files or even directories. Examples include
     * OBJ or MD3, which outsource parts of their material info into
     * external scripts. If you need full functionality, provide
     * a custom IOSystem to make Assimp find these files and use
     * the regular aiImportFileEx()/aiImportFileExWithProperties() API.
     */
    public static java.lang.foreign.MemorySegment aiImportFileFromMemory(java.lang.foreign.MemorySegment pBuffer, int pLength, int pFlags, java.lang.foreign.MemorySegment pHint)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$aiImportFileFromMemory.invokeExact(pBuffer, pLength, pFlags, pHint);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Same as #aiImportFileFromMemory, but adds an extra parameter containing importer settings.
     *
     * @param pBuffer Pointer to the file data
     * @param pLength Length of pBuffer, in bytes
     * @param pFlags Optional post processing steps to be executed after
     *   a successful import. Provide a bitwise combination of the
     *   #aiPostProcessSteps flags. If you wish to inspect the imported
     *   scene first in order to fine-tune your post-processing setup,
     *   consider to use #aiApplyPostProcessing().
     * @param pHint An additional hint to the library. If this is a non empty string,
     *   the library looks for a loader to support the file extension specified by pHint
     *   and passes the file to the first matching loader. If this loader is unable to
     *   completely the request, the library continues and tries to determine the file
     *   format on its own, a task that may or may not be successful.
     *   Check the return value, and you'll know ...
     * @param pProps #aiPropertyStore instance containing import settings.
     * @return A pointer to the imported data, NULL if the import failed.
     *
     * @note This is a straightforward way to decode models from memory
     * buffers, but it doesn't handle model formats that spread their
     * data across multiple files or even directories. Examples include
     * OBJ or MD3, which outsource parts of their material info into
     * external scripts. If you need full functionality, provide
     * a custom IOSystem to make Assimp find these files and use
     * the regular aiImportFileEx()/aiImportFileExWithProperties() API.
     * @see aiImportFileFromMemory
     */
    public static java.lang.foreign.MemorySegment aiImportFileFromMemoryWithProperties(java.lang.foreign.MemorySegment pBuffer, int pLength, int pFlags, java.lang.foreign.MemorySegment pHint, java.lang.foreign.MemorySegment pProps)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$aiImportFileFromMemoryWithProperties.invokeExact(pBuffer, pLength, pFlags, pHint, pProps);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Apply post-processing to an already-imported scene.
     *
     * This is strictly equivalent to calling #aiImportFile()/#aiImportFileEx with the
     * same flags. However, you can use this separate function to inspect the imported
     * scene first to fine-tune your post-processing setup.
     * @param pScene Scene to work on.
     * @param pFlags Provide a bitwise combination of the #aiPostProcessSteps flags.
     * @return A pointer to the post-processed data. Post processing is done in-place,
     *   meaning this is still the same #aiScene which you passed for pScene. However,
     *   _if_ post-processing failed, the scene could now be NULL. That's quite a rare
     *   case, post processing steps are not really designed to 'fail'. To be exact,
     *   the #aiProcess_ValidateDataStructure flag is currently the only post processing step
     *   which can actually cause the scene to be reset to NULL.
     */
    public static java.lang.foreign.MemorySegment aiApplyPostProcessing(java.lang.foreign.MemorySegment pScene, int pFlags)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$aiApplyPostProcessing.invokeExact(pScene, pFlags);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Get one of the predefine log streams. This is the quick'n'easy solution to
     *  access Assimp's log system. Attaching a log stream can slightly reduce Assimp's
     *  overall import performance.
     *
     *  Usage is rather simple (this will stream the log to a file, named log.txt, and
     *  the stdout stream of the process:
     *  @code
     *    struct aiLogStream c;
     *    c = aiGetPredefinedLogStream(aiDefaultLogStream_FILE,"log.txt");
     *    aiAttachLogStream(&c);
     *    c = aiGetPredefinedLogStream(aiDefaultLogStream_STDOUT,NULL);
     *    aiAttachLogStream(&c);
     *  @endcode
     *
     *  @param pStreams One of the #aiDefaultLogStream enumerated values.
     *  @param file Solely for the #aiDefaultLogStream_FILE flag: specifies the file to write to.
     *    Pass NULL for all other flags.
     *  @return The log stream. callback is set to NULL if something went wrong.
     */
    public static assimp.aiLogStream aiGetPredefinedLogStream(java.lang.foreign.SegmentAllocator allocator, int pStreams, java.lang.foreign.MemorySegment file)
    {
        try {return new assimp.aiLogStream((java.lang.foreign.MemorySegment)MTD$aiGetPredefinedLogStream.invokeExact(allocator, pStreams, file));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Attach a custom log stream to the libraries' logging system.
     *
     *  Attaching a log stream can slightly reduce Assimp's overall import
     *  performance. Multiple log-streams can be attached.
     *  @param stream Describes the new log stream.
     *  @note To ensure proper destruction of the logging system, you need to manually
     *    call aiDetachLogStream() on every single log stream you attach.
     *    Alternatively (for the lazy folks) #aiDetachAllLogStreams is provided.
     */
    public static void aiAttachLogStream(java.lang.foreign.MemorySegment stream)
    {
        try {MTD$aiAttachLogStream.invokeExact(stream);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Enable verbose logging. Verbose logging includes debug-related stuff and
     *  detailed import statistics. This can have severe impact on import performance
     *  and memory consumption. However, it might be useful to find out why a file
     *  didn't read correctly.
     *  @param d AI_TRUE or AI_FALSE, your decision.
     */
    public static void aiEnableVerboseLogging(int d)
    {
        try {MTD$aiEnableVerboseLogging.invokeExact(d);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Detach a custom log stream from the libraries' logging system.
     *
     *  This is the counterpart of #aiAttachLogStream. If you attached a stream,
     *  don't forget to detach it again.
     *  @param stream The log stream to be detached.
     *  @return AI_SUCCESS if the log stream has been detached successfully.
     *  @see aiDetachAllLogStreams
     */
    public static int aiDetachLogStream(java.lang.foreign.MemorySegment stream)
    {
        try {return (int)MTD$aiDetachLogStream.invokeExact(stream);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Detach all active log streams from the libraries' logging system.
     *  This ensures that the logging system is terminated properly and all
     *  resources allocated by it are actually freed. If you attached a stream,
     *  don't forget to detach it again.
     *  @see aiAttachLogStream
     *  @see aiDetachLogStream
     */
    public static void aiDetachAllLogStreams()
    {
        try {MTD$aiDetachAllLogStreams.invokeExact();}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Releases all resources associated with the given import process.
     *
     * Call this function after you're done with the imported data.
     * @param pScene The imported data to release. NULL is a valid value.
     */
    public static void aiReleaseImport(java.lang.foreign.MemorySegment pScene)
    {
        try {MTD$aiReleaseImport.invokeExact(pScene);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Returns the error text of the last failed import process.
     *
     * @return A textual description of the error that occurred at the last
     * import process. NULL if there was no error. There can't be an error if you
     * got a non-NULL #aiScene from #aiImportFile/#aiImportFileEx/#aiApplyPostProcessing.
     */
    public static java.lang.foreign.MemorySegment aiGetErrorString()
    {
        try {return (java.lang.foreign.MemorySegment)MTD$aiGetErrorString.invokeExact();}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Returns whether a given file extension is supported by ASSIMP
     *
     * @param szExtension Extension for which the function queries support for.
     * Must include a leading dot '.'. Example: ".3ds", ".md3"
     * @return AI_TRUE if the file extension is supported.
     */
    public static int aiIsExtensionSupported(java.lang.foreign.MemorySegment szExtension)
    {
        try {return (int)MTD$aiIsExtensionSupported.invokeExact(szExtension);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Get a list of all file extensions supported by ASSIMP.
     *
     * If a file extension is contained in the list this does, of course, not
     * mean that ASSIMP is able to load all files with this extension.
     * @param szOut String to receive the extension list.
     * Format of the list: "*.3ds;*.obj;*.dae". NULL is not a valid parameter.
     */
    public static void aiGetExtensionList(java.lang.foreign.MemorySegment szOut)
    {
        try {MTD$aiGetExtensionList.invokeExact(szOut);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Get the approximated storage required by an imported asset
     * @param pIn Input asset.
     * @param in Data structure to be filled.
     */
    public static void aiGetMemoryRequirements(java.lang.foreign.MemorySegment pIn, java.lang.foreign.MemorySegment in)
    {
        try {MTD$aiGetMemoryRequirements.invokeExact(pIn, in);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Create an empty property store. Property stores are used to collect import
     *  settings.
     * @return New property store. Property stores need to be manually destroyed using
     *   the #aiReleasePropertyStore API function.
     */
    public static java.lang.foreign.MemorySegment aiCreatePropertyStore()
    {
        try {return (java.lang.foreign.MemorySegment)MTD$aiCreatePropertyStore.invokeExact();}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Delete a property store.
     * @param p Property store to be deleted.
     */
    public static void aiReleasePropertyStore(java.lang.foreign.MemorySegment p)
    {
        try {MTD$aiReleasePropertyStore.invokeExact(p);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Set an integer property.
     *
     *  This is the C-version of #Assimp::Importer::SetPropertyInteger(). In the C
     *  interface, properties are always shared by all imports. It is not possible to
     *  specify them per import.
     *
     * @param store Store to modify. Use #aiCreatePropertyStore to obtain a store.
     * @param szName Name of the configuration property to be set. All supported
     *   public properties are defined in the config.h header file (AI_CONFIG_XXX).
     * @param value New value for the property
     */
    public static void aiSetImportPropertyInteger(java.lang.foreign.MemorySegment store, java.lang.foreign.MemorySegment szName, int value)
    {
        try {MTD$aiSetImportPropertyInteger.invokeExact(store, szName, value);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Set a floating-point property.
     *
     *  This is the C-version of #Assimp::Importer::SetPropertyFloat(). In the C
     *  interface, properties are always shared by all imports. It is not possible to
     *  specify them per import.
     *
     * @param store Store to modify. Use #aiCreatePropertyStore to obtain a store.
     * @param szName Name of the configuration property to be set. All supported
     *   public properties are defined in the config.h header file (AI_CONFIG_XXX).
     * @param value New value for the property
     */
    public static void aiSetImportPropertyFloat(java.lang.foreign.MemorySegment store, java.lang.foreign.MemorySegment szName, float value)
    {
        try {MTD$aiSetImportPropertyFloat.invokeExact(store, szName, value);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Set a string property.
     *
     *  This is the C-version of #Assimp::Importer::SetPropertyString(). In the C
     *  interface, properties are always shared by all imports. It is not possible to
     *  specify them per import.
     *
     * @param store Store to modify. Use #aiCreatePropertyStore to obtain a store.
     * @param szName Name of the configuration property to be set. All supported
     *   public properties are defined in the config.h header file (AI_CONFIG_XXX).
     * @param st New value for the property
     */
    public static void aiSetImportPropertyString(java.lang.foreign.MemorySegment store, java.lang.foreign.MemorySegment szName, java.lang.foreign.MemorySegment st)
    {
        try {MTD$aiSetImportPropertyString.invokeExact(store, szName, st);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Set a matrix property.
     *
     *  This is the C-version of #Assimp::Importer::SetPropertyMatrix(). In the C
     *  interface, properties are always shared by all imports. It is not possible to
     *  specify them per import.
     *
     * @param store Store to modify. Use #aiCreatePropertyStore to obtain a store.
     * @param szName Name of the configuration property to be set. All supported
     *   public properties are defined in the config.h header file (AI_CONFIG_XXX).
     * @param mat New value for the property
     */
    public static void aiSetImportPropertyMatrix(java.lang.foreign.MemorySegment store, java.lang.foreign.MemorySegment szName, java.lang.foreign.MemorySegment mat)
    {
        try {MTD$aiSetImportPropertyMatrix.invokeExact(store, szName, mat);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Construct a quaternion from a 3x3 rotation matrix.
     *  @param quat Receives the output quaternion.
     *  @param mat Matrix to 'quaternionize'.
     *  @see aiQuaternion(const aiMatrix3x3& pRotMatrix)
     */
    public static void aiCreateQuaternionFromMatrix(java.lang.foreign.MemorySegment quat, java.lang.foreign.MemorySegment mat)
    {
        try {MTD$aiCreateQuaternionFromMatrix.invokeExact(quat, mat);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Decompose a transformation matrix into its rotational, translational and
     *  scaling components.
     *
     * @param mat Matrix to decompose
     * @param scaling Receives the scaling component
     * @param rotation Receives the rotational component
     * @param position Receives the translational component.
     * @see aiMatrix4x4::Decompose (aiVector3D&, aiQuaternion&, aiVector3D&) const;
     */
    public static void aiDecomposeMatrix(java.lang.foreign.MemorySegment mat, java.lang.foreign.MemorySegment scaling, java.lang.foreign.MemorySegment rotation, java.lang.foreign.MemorySegment position)
    {
        try {MTD$aiDecomposeMatrix.invokeExact(mat, scaling, rotation, position);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Transpose a 4x4 matrix.
     *  @param mat Pointer to the matrix to be transposed
     */
    public static void aiTransposeMatrix4(java.lang.foreign.MemorySegment mat)
    {
        try {MTD$aiTransposeMatrix4.invokeExact(mat);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Transpose a 3x3 matrix.
     *  @param mat Pointer to the matrix to be transposed
     */
    public static void aiTransposeMatrix3(java.lang.foreign.MemorySegment mat)
    {
        try {MTD$aiTransposeMatrix3.invokeExact(mat);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Transform a vector by a 3x3 matrix
     *  @param vec Vector to be transformed.
     *  @param mat Matrix to transform the vector with.
     */
    public static void aiTransformVecByMatrix3(java.lang.foreign.MemorySegment vec, java.lang.foreign.MemorySegment mat)
    {
        try {MTD$aiTransformVecByMatrix3.invokeExact(vec, mat);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Transform a vector by a 4x4 matrix
     *  @param vec Vector to be transformed.
     *  @param mat Matrix to transform the vector with.
     */
    public static void aiTransformVecByMatrix4(java.lang.foreign.MemorySegment vec, java.lang.foreign.MemorySegment mat)
    {
        try {MTD$aiTransformVecByMatrix4.invokeExact(vec, mat);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Multiply two 4x4 matrices.
     *  @param dst First factor, receives result.
     *  @param src Matrix to be multiplied with 'dst'.
     */
    public static void aiMultiplyMatrix4(java.lang.foreign.MemorySegment dst, java.lang.foreign.MemorySegment src)
    {
        try {MTD$aiMultiplyMatrix4.invokeExact(dst, src);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Multiply two 3x3 matrices.
     *  @param dst First factor, receives result.
     *  @param src Matrix to be multiplied with 'dst'.
     */
    public static void aiMultiplyMatrix3(java.lang.foreign.MemorySegment dst, java.lang.foreign.MemorySegment src)
    {
        try {MTD$aiMultiplyMatrix3.invokeExact(dst, src);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Get a 3x3 identity matrix.
     *  @param mat Matrix to receive its personal identity
     */
    public static void aiIdentityMatrix3(java.lang.foreign.MemorySegment mat)
    {
        try {MTD$aiIdentityMatrix3.invokeExact(mat);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Get a 4x4 identity matrix.
     *  @param mat Matrix to receive its personal identity
     */
    public static void aiIdentityMatrix4(java.lang.foreign.MemorySegment mat)
    {
        try {MTD$aiIdentityMatrix4.invokeExact(mat);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Returns the number of import file formats available in the current Assimp build.
     * Use aiGetImportFormatDescription() to retrieve infos of a specific import format.
     */
    public static long aiGetImportFormatCount()
    {
        try {return (long)MTD$aiGetImportFormatCount.invokeExact();}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Returns a description of the nth import file format. Use #aiGetImportFormatCount()
     * to learn how many import formats are supported.
     * @param pIndex Index of the import format to retrieve information for. Valid range is
     *    0 to #aiGetImportFormatCount()
     * @return A description of that specific import format. NULL if pIndex is out of range.
     */
    public static java.lang.foreign.MemorySegment aiGetImportFormatDescription(long pIndex)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$aiGetImportFormatDescription.invokeExact(pIndex);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Check if 2D vectors are equal.
     *  @param a First vector to compare
     *  @param b Second vector to compare
     *  @return 1 if the vectors are equal
     *  @return 0 if the vectors are not equal
     */
    public static int aiVector2AreEqual(java.lang.foreign.MemorySegment a, java.lang.foreign.MemorySegment b)
    {
        try {return (int)MTD$aiVector2AreEqual.invokeExact(a, b);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Check if 2D vectors are equal using epsilon.
     *  @param a First vector to compare
     *  @param b Second vector to compare
     *  @param epsilon Epsilon
     *  @return 1 if the vectors are equal
     *  @return 0 if the vectors are not equal
     */
    public static int aiVector2AreEqualEpsilon(java.lang.foreign.MemorySegment a, java.lang.foreign.MemorySegment b, float epsilon)
    {
        try {return (int)MTD$aiVector2AreEqualEpsilon.invokeExact(a, b, epsilon);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Add 2D vectors.
     *  @param dst First addend, receives result.
     *  @param src Vector to be added to 'dst'.
     */
    public static void aiVector2Add(java.lang.foreign.MemorySegment dst, java.lang.foreign.MemorySegment src)
    {
        try {MTD$aiVector2Add.invokeExact(dst, src);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Subtract 2D vectors.
     *  @param dst Minuend, receives result.
     *  @param src Vector to be subtracted from 'dst'.
     */
    public static void aiVector2Subtract(java.lang.foreign.MemorySegment dst, java.lang.foreign.MemorySegment src)
    {
        try {MTD$aiVector2Subtract.invokeExact(dst, src);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Multiply a 2D vector by a scalar.
     *  @param dst Vector to be scaled by \p s
     *  @param s Scale factor
     */
    public static void aiVector2Scale(java.lang.foreign.MemorySegment dst, float s)
    {
        try {MTD$aiVector2Scale.invokeExact(dst, s);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Multiply each component of a 2D vector with
     *  the components of another vector.
     *  @param dst First vector, receives result
     *  @param other Second vector
     */
    public static void aiVector2SymMul(java.lang.foreign.MemorySegment dst, java.lang.foreign.MemorySegment other)
    {
        try {MTD$aiVector2SymMul.invokeExact(dst, other);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Divide a 2D vector by a scalar.
     *  @param dst Vector to be divided by \p s
     *  @param s Scalar divisor
     */
    public static void aiVector2DivideByScalar(java.lang.foreign.MemorySegment dst, float s)
    {
        try {MTD$aiVector2DivideByScalar.invokeExact(dst, s);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Divide each component of a 2D vector by
     *  the components of another vector.
     *  @param dst Vector as the dividend
     *  @param v Vector as the divisor
     */
    public static void aiVector2DivideByVector(java.lang.foreign.MemorySegment dst, java.lang.foreign.MemorySegment v)
    {
        try {MTD$aiVector2DivideByVector.invokeExact(dst, v);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Get the length of a 2D vector.
     *  @return v Vector to evaluate
     */
    public static float aiVector2Length(java.lang.foreign.MemorySegment v)
    {
        try {return (float)MTD$aiVector2Length.invokeExact(v);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Get the squared length of a 2D vector.
     *  @return v Vector to evaluate
     */
    public static float aiVector2SquareLength(java.lang.foreign.MemorySegment v)
    {
        try {return (float)MTD$aiVector2SquareLength.invokeExact(v);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Negate a 2D vector.
     *  @param dst Vector to be negated
     */
    public static void aiVector2Negate(java.lang.foreign.MemorySegment dst)
    {
        try {MTD$aiVector2Negate.invokeExact(dst);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Get the dot product of 2D vectors.
     *  @param a First vector
     *  @param b Second vector
     *  @return The dot product of vectors
     */
    public static float aiVector2DotProduct(java.lang.foreign.MemorySegment a, java.lang.foreign.MemorySegment b)
    {
        try {return (float)MTD$aiVector2DotProduct.invokeExact(a, b);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Normalize a 2D vector.
     *  @param v Vector to normalize
     */
    public static void aiVector2Normalize(java.lang.foreign.MemorySegment v)
    {
        try {MTD$aiVector2Normalize.invokeExact(v);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Check if 3D vectors are equal.
     *  @param a First vector to compare
     *  @param b Second vector to compare
     *  @return 1 if the vectors are equal
     *  @return 0 if the vectors are not equal
     */
    public static int aiVector3AreEqual(java.lang.foreign.MemorySegment a, java.lang.foreign.MemorySegment b)
    {
        try {return (int)MTD$aiVector3AreEqual.invokeExact(a, b);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Check if 3D vectors are equal using epsilon.
     *  @param a First vector to compare
     *  @param b Second vector to compare
     *  @param epsilon Epsilon
     *  @return 1 if the vectors are equal
     *  @return 0 if the vectors are not equal
     */
    public static int aiVector3AreEqualEpsilon(java.lang.foreign.MemorySegment a, java.lang.foreign.MemorySegment b, float epsilon)
    {
        try {return (int)MTD$aiVector3AreEqualEpsilon.invokeExact(a, b, epsilon);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Check if vector \p a is less than vector \p b.
     *  @param a First vector to compare
     *  @param b Second vector to compare
     *  @param epsilon Epsilon
     *  @return 1 if \p a is less than \p b
     *  @return 0 if \p a is equal or greater than \p b
     */
    public static int aiVector3LessThan(java.lang.foreign.MemorySegment a, java.lang.foreign.MemorySegment b)
    {
        try {return (int)MTD$aiVector3LessThan.invokeExact(a, b);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Add 3D vectors.
     *  @param dst First addend, receives result.
     *  @param src Vector to be added to 'dst'.
     */
    public static void aiVector3Add(java.lang.foreign.MemorySegment dst, java.lang.foreign.MemorySegment src)
    {
        try {MTD$aiVector3Add.invokeExact(dst, src);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Subtract 3D vectors.
     *  @param dst Minuend, receives result.
     *  @param src Vector to be subtracted from 'dst'.
     */
    public static void aiVector3Subtract(java.lang.foreign.MemorySegment dst, java.lang.foreign.MemorySegment src)
    {
        try {MTD$aiVector3Subtract.invokeExact(dst, src);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Multiply a 3D vector by a scalar.
     *  @param dst Vector to be scaled by \p s
     *  @param s Scale factor
     */
    public static void aiVector3Scale(java.lang.foreign.MemorySegment dst, float s)
    {
        try {MTD$aiVector3Scale.invokeExact(dst, s);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Multiply each component of a 3D vector with
     *  the components of another vector.
     *  @param dst First vector, receives result
     *  @param other Second vector
     */
    public static void aiVector3SymMul(java.lang.foreign.MemorySegment dst, java.lang.foreign.MemorySegment other)
    {
        try {MTD$aiVector3SymMul.invokeExact(dst, other);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Divide a 3D vector by a scalar.
     *  @param dst Vector to be divided by \p s
     *  @param s Scalar divisor
     */
    public static void aiVector3DivideByScalar(java.lang.foreign.MemorySegment dst, float s)
    {
        try {MTD$aiVector3DivideByScalar.invokeExact(dst, s);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Divide each component of a 3D vector by
     *  the components of another vector.
     *  @param dst Vector as the dividend
     *  @param v Vector as the divisor
     */
    public static void aiVector3DivideByVector(java.lang.foreign.MemorySegment dst, java.lang.foreign.MemorySegment v)
    {
        try {MTD$aiVector3DivideByVector.invokeExact(dst, v);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Get the length of a 3D vector.
     *  @return v Vector to evaluate
     */
    public static float aiVector3Length(java.lang.foreign.MemorySegment v)
    {
        try {return (float)MTD$aiVector3Length.invokeExact(v);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Get the squared length of a 3D vector.
     *  @return v Vector to evaluate
     */
    public static float aiVector3SquareLength(java.lang.foreign.MemorySegment v)
    {
        try {return (float)MTD$aiVector3SquareLength.invokeExact(v);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Negate a 3D vector.
     *  @param dst Vector to be negated
     */
    public static void aiVector3Negate(java.lang.foreign.MemorySegment dst)
    {
        try {MTD$aiVector3Negate.invokeExact(dst);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Get the dot product of 3D vectors.
     *  @param a First vector
     *  @param b Second vector
     *  @return The dot product of vectors
     */
    public static float aiVector3DotProduct(java.lang.foreign.MemorySegment a, java.lang.foreign.MemorySegment b)
    {
        try {return (float)MTD$aiVector3DotProduct.invokeExact(a, b);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Get cross product of 3D vectors.
     *  @param dst Vector to receive the result.
     *  @param a First vector
     *  @param b Second vector
     *  @return The dot product of vectors
     */
    public static void aiVector3CrossProduct(java.lang.foreign.MemorySegment dst, java.lang.foreign.MemorySegment a, java.lang.foreign.MemorySegment b)
    {
        try {MTD$aiVector3CrossProduct.invokeExact(dst, a, b);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Normalize a 3D vector.
     *  @param v Vector to normalize
     */
    public static void aiVector3Normalize(java.lang.foreign.MemorySegment v)
    {
        try {MTD$aiVector3Normalize.invokeExact(v);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Check for division by zero and normalize a 3D vector.
     *  @param v Vector to normalize
     */
    public static void aiVector3NormalizeSafe(java.lang.foreign.MemorySegment v)
    {
        try {MTD$aiVector3NormalizeSafe.invokeExact(v);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Rotate a 3D vector by a quaternion.
     *  @param v The vector to rotate by \p q
     *  @param q Quaternion to use to rotate \p v
     */
    public static void aiVector3RotateByQuaternion(java.lang.foreign.MemorySegment v, java.lang.foreign.MemorySegment q)
    {
        try {MTD$aiVector3RotateByQuaternion.invokeExact(v, q);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Construct a 3x3 matrix from a 4x4 matrix.
     *  @param dst Receives the output matrix
     *  @param mat The 4x4 matrix to use
     */
    public static void aiMatrix3FromMatrix4(java.lang.foreign.MemorySegment dst, java.lang.foreign.MemorySegment mat)
    {
        try {MTD$aiMatrix3FromMatrix4.invokeExact(dst, mat);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Construct a 3x3 matrix from a quaternion.
     *  @param mat Receives the output matrix
     *  @param q The quaternion matrix to use
     */
    public static void aiMatrix3FromQuaternion(java.lang.foreign.MemorySegment mat, java.lang.foreign.MemorySegment q)
    {
        try {MTD$aiMatrix3FromQuaternion.invokeExact(mat, q);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Check if 3x3 matrices are equal.
     *  @param a First matrix to compare
     *  @param b Second matrix to compare
     *  @return 1 if the matrices are equal
     *  @return 0 if the matrices are not equal
     */
    public static int aiMatrix3AreEqual(java.lang.foreign.MemorySegment a, java.lang.foreign.MemorySegment b)
    {
        try {return (int)MTD$aiMatrix3AreEqual.invokeExact(a, b);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Check if 3x3 matrices are equal.
     *  @param a First matrix to compare
     *  @param b Second matrix to compare
     *  @param epsilon Epsilon
     *  @return 1 if the matrices are equal
     *  @return 0 if the matrices are not equal
     */
    public static int aiMatrix3AreEqualEpsilon(java.lang.foreign.MemorySegment a, java.lang.foreign.MemorySegment b, float epsilon)
    {
        try {return (int)MTD$aiMatrix3AreEqualEpsilon.invokeExact(a, b, epsilon);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Invert a 3x3 matrix.
     *  @param mat Matrix to invert
     */
    public static void aiMatrix3Inverse(java.lang.foreign.MemorySegment mat)
    {
        try {MTD$aiMatrix3Inverse.invokeExact(mat);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Get the determinant of a 3x3 matrix.
     *  @param mat Matrix to get the determinant from
     */
    public static float aiMatrix3Determinant(java.lang.foreign.MemorySegment mat)
    {
        try {return (float)MTD$aiMatrix3Determinant.invokeExact(mat);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Get a 3x3 rotation matrix around the Z axis.
     *  @param mat Receives the output matrix
     *  @param angle Rotation angle, in radians
     */
    public static void aiMatrix3RotationZ(java.lang.foreign.MemorySegment mat, float angle)
    {
        try {MTD$aiMatrix3RotationZ.invokeExact(mat, angle);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Returns a 3x3 rotation matrix for a rotation around an arbitrary axis.
     *  @param mat Receives the output matrix
     *  @param axis Rotation axis, should be a normalized vector
     *  @param angle Rotation angle, in radians
     */
    public static void aiMatrix3FromRotationAroundAxis(java.lang.foreign.MemorySegment mat, java.lang.foreign.MemorySegment axis, float angle)
    {
        try {MTD$aiMatrix3FromRotationAroundAxis.invokeExact(mat, axis, angle);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Get a 3x3 translation matrix.
     *  @param mat Receives the output matrix
     *  @param translation The translation vector
     */
    public static void aiMatrix3Translation(java.lang.foreign.MemorySegment mat, java.lang.foreign.MemorySegment translation)
    {
        try {MTD$aiMatrix3Translation.invokeExact(mat, translation);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Create a 3x3 matrix that rotates one vector to another vector.
     *  @param mat Receives the output matrix
     *  @param from Vector to rotate from
     *  @param to Vector to rotate to
     */
    public static void aiMatrix3FromTo(java.lang.foreign.MemorySegment mat, java.lang.foreign.MemorySegment from, java.lang.foreign.MemorySegment to)
    {
        try {MTD$aiMatrix3FromTo.invokeExact(mat, from, to);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Construct a 4x4 matrix from a 3x3 matrix.
     *  @param dst Receives the output matrix
     *  @param mat The 3x3 matrix to use
     */
    public static void aiMatrix4FromMatrix3(java.lang.foreign.MemorySegment dst, java.lang.foreign.MemorySegment mat)
    {
        try {MTD$aiMatrix4FromMatrix3.invokeExact(dst, mat);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Construct a 4x4 matrix from scaling, rotation and position.
     *  @param mat Receives the output matrix.
     *  @param scaling The scaling for the x,y,z axes
     *  @param rotation The rotation as a hamilton quaternion
     *  @param position The position for the x,y,z axes
     */
    public static void aiMatrix4FromScalingQuaternionPosition(java.lang.foreign.MemorySegment mat, java.lang.foreign.MemorySegment scaling, java.lang.foreign.MemorySegment rotation, java.lang.foreign.MemorySegment position)
    {
        try {MTD$aiMatrix4FromScalingQuaternionPosition.invokeExact(mat, scaling, rotation, position);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Add 4x4 matrices.
     *  @param dst First addend, receives result.
     *  @param src Matrix to be added to 'dst'.
     */
    public static void aiMatrix4Add(java.lang.foreign.MemorySegment dst, java.lang.foreign.MemorySegment src)
    {
        try {MTD$aiMatrix4Add.invokeExact(dst, src);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Check if 4x4 matrices are equal.
     *  @param a First matrix to compare
     *  @param b Second matrix to compare
     *  @return 1 if the matrices are equal
     *  @return 0 if the matrices are not equal
     */
    public static int aiMatrix4AreEqual(java.lang.foreign.MemorySegment a, java.lang.foreign.MemorySegment b)
    {
        try {return (int)MTD$aiMatrix4AreEqual.invokeExact(a, b);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Check if 4x4 matrices are equal.
     *  @param a First matrix to compare
     *  @param b Second matrix to compare
     *  @param epsilon Epsilon
     *  @return 1 if the matrices are equal
     *  @return 0 if the matrices are not equal
     */
    public static int aiMatrix4AreEqualEpsilon(java.lang.foreign.MemorySegment a, java.lang.foreign.MemorySegment b, float epsilon)
    {
        try {return (int)MTD$aiMatrix4AreEqualEpsilon.invokeExact(a, b, epsilon);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Invert a 4x4 matrix.
     *  @param result Matrix to invert
     */
    public static void aiMatrix4Inverse(java.lang.foreign.MemorySegment mat)
    {
        try {MTD$aiMatrix4Inverse.invokeExact(mat);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Get the determinant of a 4x4 matrix.
     *  @param mat Matrix to get the determinant from
     *  @return The determinant of the matrix
     */
    public static float aiMatrix4Determinant(java.lang.foreign.MemorySegment mat)
    {
        try {return (float)MTD$aiMatrix4Determinant.invokeExact(mat);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Returns true of the matrix is the identity matrix.
     *  @param mat Matrix to get the determinant from
     *  @return 1 if \p mat is an identity matrix.
     *  @return 0 if \p mat is not an identity matrix.
     */
    public static int aiMatrix4IsIdentity(java.lang.foreign.MemorySegment mat)
    {
        try {return (int)MTD$aiMatrix4IsIdentity.invokeExact(mat);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Decompose a transformation matrix into its scaling,
     *  rotational as euler angles, and translational components.
     *
     * @param mat Matrix to decompose
     * @param scaling Receives the output scaling for the x,y,z axes
     * @param rotation Receives the output rotation as a Euler angles
     * @param position Receives the output position for the x,y,z axes
     */
    public static void aiMatrix4DecomposeIntoScalingEulerAnglesPosition(java.lang.foreign.MemorySegment mat, java.lang.foreign.MemorySegment scaling, java.lang.foreign.MemorySegment rotation, java.lang.foreign.MemorySegment position)
    {
        try {MTD$aiMatrix4DecomposeIntoScalingEulerAnglesPosition.invokeExact(mat, scaling, rotation, position);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Decompose a transformation matrix into its scaling,
     *  rotational split into an axis and rotational angle,
     *  and it's translational components.
     *
     * @param mat Matrix to decompose
     * @param rotation Receives the rotational component
     * @param axis Receives the output rotation axis
     * @param angle Receives the output rotation angle
     * @param position Receives the output position for the x,y,z axes.
     */
    public static void aiMatrix4DecomposeIntoScalingAxisAnglePosition(java.lang.foreign.MemorySegment mat, java.lang.foreign.MemorySegment scaling, java.lang.foreign.MemorySegment axis, java.lang.foreign.MemorySegment angle, java.lang.foreign.MemorySegment position)
    {
        try {MTD$aiMatrix4DecomposeIntoScalingAxisAnglePosition.invokeExact(mat, scaling, axis, angle, position);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Decompose a transformation matrix into its rotational and
     *  translational components.
     *
     * @param mat Matrix to decompose
     * @param rotation Receives the rotational component
     * @param position Receives the translational component.
     */
    public static void aiMatrix4DecomposeNoScaling(java.lang.foreign.MemorySegment mat, java.lang.foreign.MemorySegment rotation, java.lang.foreign.MemorySegment position)
    {
        try {MTD$aiMatrix4DecomposeNoScaling.invokeExact(mat, rotation, position);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Creates a 4x4 matrix from a set of euler angles.
     *  @param mat Receives the output matrix
     *  @param x Rotation angle for the x-axis, in radians
     *  @param y Rotation angle for the y-axis, in radians
     *  @param z Rotation angle for the z-axis, in radians
     */
    public static void aiMatrix4FromEulerAngles(java.lang.foreign.MemorySegment mat, float x, float y, float z)
    {
        try {MTD$aiMatrix4FromEulerAngles.invokeExact(mat, x, y, z);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Get a 4x4 rotation matrix around the X axis.
     *  @param mat Receives the output matrix
     *  @param angle Rotation angle, in radians
     */
    public static void aiMatrix4RotationX(java.lang.foreign.MemorySegment mat, float angle)
    {
        try {MTD$aiMatrix4RotationX.invokeExact(mat, angle);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Get a 4x4 rotation matrix around the Y axis.
     *  @param mat Receives the output matrix
     *  @param angle Rotation angle, in radians
     */
    public static void aiMatrix4RotationY(java.lang.foreign.MemorySegment mat, float angle)
    {
        try {MTD$aiMatrix4RotationY.invokeExact(mat, angle);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Get a 4x4 rotation matrix around the Z axis.
     *  @param mat Receives the output matrix
     *  @param angle Rotation angle, in radians
     */
    public static void aiMatrix4RotationZ(java.lang.foreign.MemorySegment mat, float angle)
    {
        try {MTD$aiMatrix4RotationZ.invokeExact(mat, angle);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Returns a 4x4 rotation matrix for a rotation around an arbitrary axis.
     *  @param mat Receives the output matrix
     *  @param axis Rotation axis, should be a normalized vector
     *  @param angle Rotation angle, in radians
     */
    public static void aiMatrix4FromRotationAroundAxis(java.lang.foreign.MemorySegment mat, java.lang.foreign.MemorySegment axis, float angle)
    {
        try {MTD$aiMatrix4FromRotationAroundAxis.invokeExact(mat, axis, angle);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Get a 4x4 translation matrix.
     *  @param mat Receives the output matrix
     *  @param translation The translation vector
     */
    public static void aiMatrix4Translation(java.lang.foreign.MemorySegment mat, java.lang.foreign.MemorySegment translation)
    {
        try {MTD$aiMatrix4Translation.invokeExact(mat, translation);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Get a 4x4 scaling matrix.
     *  @param mat Receives the output matrix
     *  @param scaling The scaling vector
     */
    public static void aiMatrix4Scaling(java.lang.foreign.MemorySegment mat, java.lang.foreign.MemorySegment scaling)
    {
        try {MTD$aiMatrix4Scaling.invokeExact(mat, scaling);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Create a 4x4 matrix that rotates one vector to another vector.
     *  @param mat Receives the output matrix
     *  @param from Vector to rotate from
     *  @param to Vector to rotate to
     */
    public static void aiMatrix4FromTo(java.lang.foreign.MemorySegment mat, java.lang.foreign.MemorySegment from, java.lang.foreign.MemorySegment to)
    {
        try {MTD$aiMatrix4FromTo.invokeExact(mat, from, to);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Create a Quaternion from euler angles.
     *  @param q Receives the output quaternion
     *  @param x Rotation angle for the x-axis, in radians
     *  @param y Rotation angle for the y-axis, in radians
     *  @param z Rotation angle for the z-axis, in radians
     */
    public static void aiQuaternionFromEulerAngles(java.lang.foreign.MemorySegment q, float x, float y, float z)
    {
        try {MTD$aiQuaternionFromEulerAngles.invokeExact(q, x, y, z);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Create a Quaternion from an axis angle pair.
     *  @param q Receives the output quaternion
     *  @param axis The orientation axis
     *  @param angle The rotation angle, in radians
     */
    public static void aiQuaternionFromAxisAngle(java.lang.foreign.MemorySegment q, java.lang.foreign.MemorySegment axis, float angle)
    {
        try {MTD$aiQuaternionFromAxisAngle.invokeExact(q, axis, angle);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Create a Quaternion from a normalized quaternion stored
     *  in a 3D vector.
     *  @param q Receives the output quaternion
     *  @param normalized The vector that stores the quaternion
     */
    public static void aiQuaternionFromNormalizedQuaternion(java.lang.foreign.MemorySegment q, java.lang.foreign.MemorySegment normalized)
    {
        try {MTD$aiQuaternionFromNormalizedQuaternion.invokeExact(q, normalized);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Check if quaternions are equal.
     *  @param a First quaternion to compare
     *  @param b Second quaternion to compare
     *  @return 1 if the quaternions are equal
     *  @return 0 if the quaternions are not equal
     */
    public static int aiQuaternionAreEqual(java.lang.foreign.MemorySegment a, java.lang.foreign.MemorySegment b)
    {
        try {return (int)MTD$aiQuaternionAreEqual.invokeExact(a, b);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Check if quaternions are equal using epsilon.
     *  @param a First quaternion to compare
     *  @param b Second quaternion to compare
     *  @param epsilon Epsilon
     *  @return 1 if the quaternions are equal
     *  @return 0 if the quaternions are not equal
     */
    public static int aiQuaternionAreEqualEpsilon(java.lang.foreign.MemorySegment a, java.lang.foreign.MemorySegment b, float epsilon)
    {
        try {return (int)MTD$aiQuaternionAreEqualEpsilon.invokeExact(a, b, epsilon);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Normalize a quaternion.
     *  @param q Quaternion to normalize
     */
    public static void aiQuaternionNormalize(java.lang.foreign.MemorySegment q)
    {
        try {MTD$aiQuaternionNormalize.invokeExact(q);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Compute quaternion conjugate.
     *  @param q Quaternion to compute conjugate,
     *           receives the output quaternion
     */
    public static void aiQuaternionConjugate(java.lang.foreign.MemorySegment q)
    {
        try {MTD$aiQuaternionConjugate.invokeExact(q);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Multiply quaternions.
     *  @param dst First quaternion, receives the output quaternion
     *  @param q Second quaternion
     */
    public static void aiQuaternionMultiply(java.lang.foreign.MemorySegment dst, java.lang.foreign.MemorySegment q)
    {
        try {MTD$aiQuaternionMultiply.invokeExact(dst, q);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Performs a spherical interpolation between two quaternions.
     * @param dst Receives the quaternion resulting from the interpolation.
     * @param start Quaternion when factor == 0
     * @param end Quaternion when factor == 1
     * @param factor Interpolation factor between 0 and 1
     */
    public static void aiQuaternionInterpolate(java.lang.foreign.MemorySegment dst, java.lang.foreign.MemorySegment start, java.lang.foreign.MemorySegment end, float factor)
    {
        try {MTD$aiQuaternionInterpolate.invokeExact(dst, start, end, factor);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Returns the number of export file formats available in the current Assimp build.
     * Use aiGetExportFormatDescription() to retrieve infos of a specific export format.
     */
    public static long aiGetExportFormatCount()
    {
        try {return (long)MTD$aiGetExportFormatCount.invokeExact();}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Returns a description of the nth export file format. Use #aiGetExportFormatCount()
     * to learn how many export formats are supported. The description must be released by
     * calling aiReleaseExportFormatDescription afterwards.
     * @param pIndex Index of the export format to retrieve information for. Valid range is
     *    0 to #aiGetExportFormatCount()
     * @return A description of that specific export format. NULL if pIndex is out of range.
     */
    public static java.lang.foreign.MemorySegment aiGetExportFormatDescription(long pIndex)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$aiGetExportFormatDescription.invokeExact(pIndex);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Release a description of the nth export file format. Must be returned by
    * aiGetExportFormatDescription
    * @param desc Pointer to the description
    */
    public static void aiReleaseExportFormatDescription(java.lang.foreign.MemorySegment desc)
    {
        try {MTD$aiReleaseExportFormatDescription.invokeExact(desc);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Create a modifiable copy of a scene.
     *  This is useful to import files via Assimp, change their topology and
     *  export them again. Since the scene returned by the various importer functions
     *  is const, a modifiable copy is needed.
     *  @param pIn Valid scene to be copied
     *  @param pOut Receives a modifiable copy of the scene. Use aiFreeScene() to
     *    delete it again.
     */
    public static void aiCopyScene(java.lang.foreign.MemorySegment pIn, java.lang.foreign.MemorySegment pOut)
    {
        try {MTD$aiCopyScene.invokeExact(pIn, pOut);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Frees a scene copy created using aiCopyScene() */
    public static void aiFreeScene(java.lang.foreign.MemorySegment pIn)
    {
        try {MTD$aiFreeScene.invokeExact(pIn);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Exports the given scene to a chosen file format and writes the result file(s) to disk.
    * @param pScene The scene to export. Stays in possession of the caller, is not changed by the function.
    *   The scene is expected to conform to Assimp's Importer output format as specified
    *   in the @link data Data Structures Page @endlink. In short, this means the model data
    *   should use a right-handed coordinate systems, face winding should be counter-clockwise
    *   and the UV coordinate origin is assumed to be in the upper left. If your input data
    *   uses different conventions, have a look at the last parameter.
    * @param pFormatId ID string to specify to which format you want to export to. Use
    * aiGetExportFormatCount() / aiGetExportFormatDescription() to learn which export formats are available.
    * @param pFileName Output file to write
    * @param pPreprocessing Accepts any choice of the #aiPostProcessSteps enumerated
    *   flags, but in reality only a subset of them makes sense here. Specifying
    *   'preprocessing' flags is useful if the input scene does not conform to
    *   Assimp's default conventions as specified in the @link data Data Structures Page @endlink.
    *   In short, this means the geometry data should use a right-handed coordinate systems, face
    *   winding should be counter-clockwise and the UV coordinate origin is assumed to be in
    *   the upper left. The #aiProcess_MakeLeftHanded, #aiProcess_FlipUVs and
    *   #aiProcess_FlipWindingOrder flags are used in the import side to allow users
    *   to have those defaults automatically adapted to their conventions. Specifying those flags
    *   for exporting has the opposite effect, respectively. Some other of the
    *   #aiPostProcessSteps enumerated values may be useful as well, but you'll need
    *   to try out what their effect on the exported file is. Many formats impose
    *   their own restrictions on the structure of the geometry stored therein,
    *   so some preprocessing may have little or no effect at all, or may be
    *   redundant as exporters would apply them anyhow. A good example
    *   is triangulation - whilst you can enforce it by specifying
    *   the #aiProcess_Triangulate flag, most export formats support only
    *   triangulate data so they would run the step anyway.
    *
    *   If assimp detects that the input scene was directly taken from the importer side of
    *   the library (i.e. not copied using aiCopyScene and potentially modified afterwards),
    *   any post-processing steps already applied to the scene will not be applied again, unless
    *   they show non-idempotent behavior (#aiProcess_MakeLeftHanded, #aiProcess_FlipUVs and
    *   #aiProcess_FlipWindingOrder).
    * @return a status code indicating the result of the export
    * @note Use aiCopyScene() to get a modifiable copy of a previously
    *   imported scene.
    */
    public static int aiExportScene(java.lang.foreign.MemorySegment pScene, java.lang.foreign.MemorySegment pFormatId, java.lang.foreign.MemorySegment pFileName, int pPreprocessing)
    {
        try {return (int)MTD$aiExportScene.invokeExact(pScene, pFormatId, pFileName, pPreprocessing);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Exports the given scene to a chosen file format using custom IO logic supplied by you.
    * @param pScene The scene to export. Stays in possession of the caller, is not changed by the function.
    * @param pFormatId ID string to specify to which format you want to export to. Use
    * aiGetExportFormatCount() / aiGetExportFormatDescription() to learn which export formats are available.
    * @param pFileName Output file to write
    * @param pIO custom IO implementation to be used. Use this if you use your own storage methods.
    *   If none is supplied, a default implementation using standard file IO is used. Note that
    *   #aiExportSceneToBlob is provided as convenience function to export to memory buffers.
    * @param pPreprocessing Please see the documentation for #aiExportScene
    * @return a status code indicating the result of the export
    * @note Include <aiFileIO.h> for the definition of #aiFileIO.
    * @note Use aiCopyScene() to get a modifiable copy of a previously
    *   imported scene.
    */
    public static int aiExportSceneEx(java.lang.foreign.MemorySegment pScene, java.lang.foreign.MemorySegment pFormatId, java.lang.foreign.MemorySegment pFileName, java.lang.foreign.MemorySegment pIO, int pPreprocessing)
    {
        try {return (int)MTD$aiExportSceneEx.invokeExact(pScene, pFormatId, pFileName, pIO, pPreprocessing);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Exports the given scene to a chosen file format. Returns the exported data as a binary blob which
    * you can write into a file or something. When you're done with the data, use #aiReleaseExportBlob()
    * to free the resources associated with the export.
    * @param pScene The scene to export. Stays in possession of the caller, is not changed by the function.
    * @param pFormatId ID string to specify to which format you want to export to. Use
    * #aiGetExportFormatCount() / #aiGetExportFormatDescription() to learn which export formats are available.
    * @param pPreprocessing Please see the documentation for #aiExportScene
    * @return the exported data or NULL in case of error
    */
    public static java.lang.foreign.MemorySegment aiExportSceneToBlob(java.lang.foreign.MemorySegment pScene, java.lang.foreign.MemorySegment pFormatId, int pPreprocessing)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$aiExportSceneToBlob.invokeExact(pScene, pFormatId, pPreprocessing);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // --------------------------------------------------------------------------------
    /** Releases the memory associated with the given exported data. Use this function to free a data blob
    * returned by aiExportScene().
    * @param pData the data blob returned by #aiExportSceneToBlob
    */
    public static void aiReleaseExportBlob(java.lang.foreign.MemorySegment pData)
    {
        try {MTD$aiReleaseExportBlob.invokeExact(pData);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /** \brief  Returns the Importer description for a given extension.
    
    Will return a nullptr if no assigned importer desc. was found for the given extension
        \param  extension   [in] The extension to look for
        \return A pointer showing to the ImporterDesc, \see aiImporterDesc.
    */
    public static java.lang.foreign.MemorySegment aiGetImporterDesc(java.lang.foreign.MemorySegment extension)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$aiGetImporterDesc.invokeExact(extension);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // -------------------------------------------------------------------------------
    // Get a string for a given aiTextureType
    public static java.lang.foreign.MemorySegment aiTextureTypeToString(int in)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$aiTextureTypeToString.invokeExact(in);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    //! @endcond
    //!
    // ---------------------------------------------------------------------------
    /** @brief Retrieve a material property with a specific key from the material
     *
     * @param pMat Pointer to the input material. May not be NULL
     * @param pKey Key to search for. One of the AI_MATKEY_XXX constants.
     * @param type Specifies the type of the texture to be retrieved (
     *    e.g. diffuse, specular, height map ...)
     * @param index Index of the texture to be retrieved.
     * @param pPropOut Pointer to receive a pointer to a valid aiMaterialProperty
     *        structure or NULL if the key has not been found. */
    // ---------------------------------------------------------------------------
    public static int aiGetMaterialProperty(java.lang.foreign.MemorySegment pMat, java.lang.foreign.MemorySegment pKey, int type, int index, java.lang.foreign.MemorySegment pPropOut)
    {
        try {return (int)MTD$aiGetMaterialProperty.invokeExact(pMat, pKey, type, index, pPropOut);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // ---------------------------------------------------------------------------
    /** @brief Retrieve an array of float values with a specific key
     *  from the material
     *
     * Pass one of the AI_MATKEY_XXX constants for the last three parameters (the
     * example reads the #AI_MATKEY_UVTRANSFORM property of the first diffuse texture)
     * @code
     * aiUVTransform trafo;
     * unsigned int max = sizeof(aiUVTransform);
     * if (AI_SUCCESS != aiGetMaterialFloatArray(mat, AI_MATKEY_UVTRANSFORM(aiTextureType_DIFFUSE,0),
     *    (float*)&trafo, &max) || sizeof(aiUVTransform) != max)
     * {
     *   // error handling
     * }
     * @endcode
     *
     * @param pMat Pointer to the input material. May not be NULL
     * @param pKey Key to search for. One of the AI_MATKEY_XXX constants.
     * @param pOut Pointer to a buffer to receive the result.
     * @param pMax Specifies the size of the given buffer, in float's.
     *        Receives the number of values (not bytes!) read.
     * @param type (see the code sample above)
     * @param index (see the code sample above)
     * @return Specifies whether the key has been found. If not, the output
     *   arrays remains unmodified and pMax is set to 0.*/
    // ---------------------------------------------------------------------------
    public static int aiGetMaterialFloatArray(java.lang.foreign.MemorySegment pMat, java.lang.foreign.MemorySegment pKey, int type, int index, java.lang.foreign.MemorySegment pOut, java.lang.foreign.MemorySegment pMax)
    {
        try {return (int)MTD$aiGetMaterialFloatArray.invokeExact(pMat, pKey, type, index, pOut, pMax);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // ---------------------------------------------------------------------------
    /** @brief Retrieve an array of integer values with a specific key
     *  from a material
     *
     * See the sample for aiGetMaterialFloatArray for more information.*/
    public static int aiGetMaterialIntegerArray(java.lang.foreign.MemorySegment pMat, java.lang.foreign.MemorySegment pKey, int type, int index, java.lang.foreign.MemorySegment pOut, java.lang.foreign.MemorySegment pMax)
    {
        try {return (int)MTD$aiGetMaterialIntegerArray.invokeExact(pMat, pKey, type, index, pOut, pMax);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // ---------------------------------------------------------------------------
    /** @brief Retrieve a color value from the material property table
    *
    * See the sample for aiGetMaterialFloat for more information*/
    // ---------------------------------------------------------------------------
    public static int aiGetMaterialColor(java.lang.foreign.MemorySegment pMat, java.lang.foreign.MemorySegment pKey, int type, int index, java.lang.foreign.MemorySegment pOut)
    {
        try {return (int)MTD$aiGetMaterialColor.invokeExact(pMat, pKey, type, index, pOut);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // ---------------------------------------------------------------------------
    /** @brief Retrieve a aiUVTransform value from the material property table
    *
    * See the sample for aiGetMaterialFloat for more information*/
    // ---------------------------------------------------------------------------
    public static int aiGetMaterialUVTransform(java.lang.foreign.MemorySegment pMat, java.lang.foreign.MemorySegment pKey, int type, int index, java.lang.foreign.MemorySegment pOut)
    {
        try {return (int)MTD$aiGetMaterialUVTransform.invokeExact(pMat, pKey, type, index, pOut);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // ---------------------------------------------------------------------------
    /** @brief Retrieve a string from the material property table
    *
    * See the sample for aiGetMaterialFloat for more information.*/
    // ---------------------------------------------------------------------------
    public static int aiGetMaterialString(java.lang.foreign.MemorySegment pMat, java.lang.foreign.MemorySegment pKey, int type, int index, java.lang.foreign.MemorySegment pOut)
    {
        try {return (int)MTD$aiGetMaterialString.invokeExact(pMat, pKey, type, index, pOut);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // ---------------------------------------------------------------------------
    /** Get the number of textures for a particular texture type.
     *  @param[in] pMat Pointer to the input material. May not be NULL
     *  @param type Texture type to check for
     *  @return Number of textures for this type.
     *  @note A texture can be easily queried using #aiGetMaterialTexture() */
    // ---------------------------------------------------------------------------
    public static int aiGetMaterialTextureCount(java.lang.foreign.MemorySegment pMat, int type)
    {
        try {return (int)MTD$aiGetMaterialTextureCount.invokeExact(pMat, type);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int aiGetMaterialTexture(java.lang.foreign.MemorySegment mat, int type, int index, java.lang.foreign.MemorySegment path, java.lang.foreign.MemorySegment mapping, java.lang.foreign.MemorySegment uvindex, java.lang.foreign.MemorySegment blend, java.lang.foreign.MemorySegment op, java.lang.foreign.MemorySegment mapmode, java.lang.foreign.MemorySegment flags)
    {
        try {return (int)MTD$aiGetMaterialTexture.invokeExact(mat, type, index, path, mapping, uvindex, blend, op, mapmode, flags);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // ---------------------------------------------------------------------------
    /** @brief Returns a string with legal copyright and licensing information
     *  about Assimp. The string may include multiple lines.
     *  @return Pointer to static string.
     */
    public static java.lang.foreign.MemorySegment aiGetLegalString()
    {
        try {return (java.lang.foreign.MemorySegment)MTD$aiGetLegalString.invokeExact();}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // ---------------------------------------------------------------------------
    /** @brief Returns the current patch version number of Assimp.
     *  @return Patch version of the Assimp runtime the application was
     *    linked/built against
     */
    public static int aiGetVersionPatch()
    {
        try {return (int)MTD$aiGetVersionPatch.invokeExact();}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // ---------------------------------------------------------------------------
    /** @brief Returns the current minor version number of Assimp.
     *  @return Minor version of the Assimp runtime the application was
     *    linked/built against
     */
    public static int aiGetVersionMinor()
    {
        try {return (int)MTD$aiGetVersionMinor.invokeExact();}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // ---------------------------------------------------------------------------
    /** @brief Returns the current major version number of Assimp.
     *  @return Major version of the Assimp runtime the application was
     *    linked/built against
     */
    public static int aiGetVersionMajor()
    {
        try {return (int)MTD$aiGetVersionMajor.invokeExact();}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // ---------------------------------------------------------------------------
    /** @brief Returns the repository revision of the Assimp runtime.
     *  @return SVN Repository revision number of the Assimp runtime the
     *          application was linked/built against.
     */
    public static int aiGetVersionRevision()
    {
        try {return (int)MTD$aiGetVersionRevision.invokeExact();}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // ---------------------------------------------------------------------------
    /** @brief Returns the branch-name of the Assimp runtime.
     *  @return The current branch name.
     */
    public static java.lang.foreign.MemorySegment aiGetBranchName()
    {
        try {return (java.lang.foreign.MemorySegment)MTD$aiGetBranchName.invokeExact();}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // ---------------------------------------------------------------------------
    /** @brief Returns assimp's compile flags
     *  @return Any bitwise combination of the ASSIMP_CFLAGS_xxx constants.
     */
    public static int aiGetCompileFlags()
    {
        try {return (int)MTD$aiGetCompileFlags.invokeExact();}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    static
    {
        java.lang.System.loadLibrary("libassimp-5");
        gSystemLinker = java.lang.foreign.Linker.nativeLinker();
        gLibLookup = name -> java.lang.foreign.SymbolLookup.loaderLookup().find(name).or(() -> gSystemLinker.defaultLookup().find(name));

        MTD_ADDRESS$aiImportFile = gLibLookup.find("aiImportFile").orElseThrow();
        MTD$aiImportFile = gSystemLinker.downcallHandle(MTD_ADDRESS$aiImportFile, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$aiImportFileEx = gLibLookup.find("aiImportFileEx").orElseThrow();
        MTD$aiImportFileEx = gSystemLinker.downcallHandle(MTD_ADDRESS$aiImportFileEx, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$aiImportFileExWithProperties = gLibLookup.find("aiImportFileExWithProperties").orElseThrow();
        MTD$aiImportFileExWithProperties = gSystemLinker.downcallHandle(MTD_ADDRESS$aiImportFileExWithProperties, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$aiImportFileFromMemory = gLibLookup.find("aiImportFileFromMemory").orElseThrow();
        MTD$aiImportFileFromMemory = gSystemLinker.downcallHandle(MTD_ADDRESS$aiImportFileFromMemory, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$aiImportFileFromMemoryWithProperties = gLibLookup.find("aiImportFileFromMemoryWithProperties").orElseThrow();
        MTD$aiImportFileFromMemoryWithProperties = gSystemLinker.downcallHandle(MTD_ADDRESS$aiImportFileFromMemoryWithProperties, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$aiApplyPostProcessing = gLibLookup.find("aiApplyPostProcessing").orElseThrow();
        MTD$aiApplyPostProcessing = gSystemLinker.downcallHandle(MTD_ADDRESS$aiApplyPostProcessing, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$aiGetPredefinedLogStream = gLibLookup.find("aiGetPredefinedLogStream").orElseThrow();
        MTD$aiGetPredefinedLogStream = gSystemLinker.downcallHandle(MTD_ADDRESS$aiGetPredefinedLogStream, java.lang.foreign.FunctionDescriptor.of(assimp.aiLogStream.gStructLayout, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$aiAttachLogStream = gLibLookup.find("aiAttachLogStream").orElseThrow();
        MTD$aiAttachLogStream = gSystemLinker.downcallHandle(MTD_ADDRESS$aiAttachLogStream, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$aiEnableVerboseLogging = gLibLookup.find("aiEnableVerboseLogging").orElseThrow();
        MTD$aiEnableVerboseLogging = gSystemLinker.downcallHandle(MTD_ADDRESS$aiEnableVerboseLogging, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$aiDetachLogStream = gLibLookup.find("aiDetachLogStream").orElseThrow();
        MTD$aiDetachLogStream = gSystemLinker.downcallHandle(MTD_ADDRESS$aiDetachLogStream, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$aiDetachAllLogStreams = gLibLookup.find("aiDetachAllLogStreams").orElseThrow();
        MTD$aiDetachAllLogStreams = gSystemLinker.downcallHandle(MTD_ADDRESS$aiDetachAllLogStreams, java.lang.foreign.FunctionDescriptor.ofVoid());
        MTD_ADDRESS$aiReleaseImport = gLibLookup.find("aiReleaseImport").orElseThrow();
        MTD$aiReleaseImport = gSystemLinker.downcallHandle(MTD_ADDRESS$aiReleaseImport, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$aiGetErrorString = gLibLookup.find("aiGetErrorString").orElseThrow();
        MTD$aiGetErrorString = gSystemLinker.downcallHandle(MTD_ADDRESS$aiGetErrorString, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$aiIsExtensionSupported = gLibLookup.find("aiIsExtensionSupported").orElseThrow();
        MTD$aiIsExtensionSupported = gSystemLinker.downcallHandle(MTD_ADDRESS$aiIsExtensionSupported, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$aiGetExtensionList = gLibLookup.find("aiGetExtensionList").orElseThrow();
        MTD$aiGetExtensionList = gSystemLinker.downcallHandle(MTD_ADDRESS$aiGetExtensionList, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$aiGetMemoryRequirements = gLibLookup.find("aiGetMemoryRequirements").orElseThrow();
        MTD$aiGetMemoryRequirements = gSystemLinker.downcallHandle(MTD_ADDRESS$aiGetMemoryRequirements, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$aiCreatePropertyStore = gLibLookup.find("aiCreatePropertyStore").orElseThrow();
        MTD$aiCreatePropertyStore = gSystemLinker.downcallHandle(MTD_ADDRESS$aiCreatePropertyStore, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$aiReleasePropertyStore = gLibLookup.find("aiReleasePropertyStore").orElseThrow();
        MTD$aiReleasePropertyStore = gSystemLinker.downcallHandle(MTD_ADDRESS$aiReleasePropertyStore, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$aiSetImportPropertyInteger = gLibLookup.find("aiSetImportPropertyInteger").orElseThrow();
        MTD$aiSetImportPropertyInteger = gSystemLinker.downcallHandle(MTD_ADDRESS$aiSetImportPropertyInteger, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$aiSetImportPropertyFloat = gLibLookup.find("aiSetImportPropertyFloat").orElseThrow();
        MTD$aiSetImportPropertyFloat = gSystemLinker.downcallHandle(MTD_ADDRESS$aiSetImportPropertyFloat, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS$aiSetImportPropertyString = gLibLookup.find("aiSetImportPropertyString").orElseThrow();
        MTD$aiSetImportPropertyString = gSystemLinker.downcallHandle(MTD_ADDRESS$aiSetImportPropertyString, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$aiSetImportPropertyMatrix = gLibLookup.find("aiSetImportPropertyMatrix").orElseThrow();
        MTD$aiSetImportPropertyMatrix = gSystemLinker.downcallHandle(MTD_ADDRESS$aiSetImportPropertyMatrix, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$aiCreateQuaternionFromMatrix = gLibLookup.find("aiCreateQuaternionFromMatrix").orElseThrow();
        MTD$aiCreateQuaternionFromMatrix = gSystemLinker.downcallHandle(MTD_ADDRESS$aiCreateQuaternionFromMatrix, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$aiDecomposeMatrix = gLibLookup.find("aiDecomposeMatrix").orElseThrow();
        MTD$aiDecomposeMatrix = gSystemLinker.downcallHandle(MTD_ADDRESS$aiDecomposeMatrix, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$aiTransposeMatrix4 = gLibLookup.find("aiTransposeMatrix4").orElseThrow();
        MTD$aiTransposeMatrix4 = gSystemLinker.downcallHandle(MTD_ADDRESS$aiTransposeMatrix4, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$aiTransposeMatrix3 = gLibLookup.find("aiTransposeMatrix3").orElseThrow();
        MTD$aiTransposeMatrix3 = gSystemLinker.downcallHandle(MTD_ADDRESS$aiTransposeMatrix3, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$aiTransformVecByMatrix3 = gLibLookup.find("aiTransformVecByMatrix3").orElseThrow();
        MTD$aiTransformVecByMatrix3 = gSystemLinker.downcallHandle(MTD_ADDRESS$aiTransformVecByMatrix3, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$aiTransformVecByMatrix4 = gLibLookup.find("aiTransformVecByMatrix4").orElseThrow();
        MTD$aiTransformVecByMatrix4 = gSystemLinker.downcallHandle(MTD_ADDRESS$aiTransformVecByMatrix4, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$aiMultiplyMatrix4 = gLibLookup.find("aiMultiplyMatrix4").orElseThrow();
        MTD$aiMultiplyMatrix4 = gSystemLinker.downcallHandle(MTD_ADDRESS$aiMultiplyMatrix4, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$aiMultiplyMatrix3 = gLibLookup.find("aiMultiplyMatrix3").orElseThrow();
        MTD$aiMultiplyMatrix3 = gSystemLinker.downcallHandle(MTD_ADDRESS$aiMultiplyMatrix3, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$aiIdentityMatrix3 = gLibLookup.find("aiIdentityMatrix3").orElseThrow();
        MTD$aiIdentityMatrix3 = gSystemLinker.downcallHandle(MTD_ADDRESS$aiIdentityMatrix3, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$aiIdentityMatrix4 = gLibLookup.find("aiIdentityMatrix4").orElseThrow();
        MTD$aiIdentityMatrix4 = gSystemLinker.downcallHandle(MTD_ADDRESS$aiIdentityMatrix4, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$aiGetImportFormatCount = gLibLookup.find("aiGetImportFormatCount").orElseThrow();
        MTD$aiGetImportFormatCount = gSystemLinker.downcallHandle(MTD_ADDRESS$aiGetImportFormatCount, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_LONG));
        MTD_ADDRESS$aiGetImportFormatDescription = gLibLookup.find("aiGetImportFormatDescription").orElseThrow();
        MTD$aiGetImportFormatDescription = gSystemLinker.downcallHandle(MTD_ADDRESS$aiGetImportFormatDescription, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_LONG));
        MTD_ADDRESS$aiVector2AreEqual = gLibLookup.find("aiVector2AreEqual").orElseThrow();
        MTD$aiVector2AreEqual = gSystemLinker.downcallHandle(MTD_ADDRESS$aiVector2AreEqual, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$aiVector2AreEqualEpsilon = gLibLookup.find("aiVector2AreEqualEpsilon").orElseThrow();
        MTD$aiVector2AreEqualEpsilon = gSystemLinker.downcallHandle(MTD_ADDRESS$aiVector2AreEqualEpsilon, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS$aiVector2Add = gLibLookup.find("aiVector2Add").orElseThrow();
        MTD$aiVector2Add = gSystemLinker.downcallHandle(MTD_ADDRESS$aiVector2Add, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$aiVector2Subtract = gLibLookup.find("aiVector2Subtract").orElseThrow();
        MTD$aiVector2Subtract = gSystemLinker.downcallHandle(MTD_ADDRESS$aiVector2Subtract, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$aiVector2Scale = gLibLookup.find("aiVector2Scale").orElseThrow();
        MTD$aiVector2Scale = gSystemLinker.downcallHandle(MTD_ADDRESS$aiVector2Scale, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS$aiVector2SymMul = gLibLookup.find("aiVector2SymMul").orElseThrow();
        MTD$aiVector2SymMul = gSystemLinker.downcallHandle(MTD_ADDRESS$aiVector2SymMul, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$aiVector2DivideByScalar = gLibLookup.find("aiVector2DivideByScalar").orElseThrow();
        MTD$aiVector2DivideByScalar = gSystemLinker.downcallHandle(MTD_ADDRESS$aiVector2DivideByScalar, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS$aiVector2DivideByVector = gLibLookup.find("aiVector2DivideByVector").orElseThrow();
        MTD$aiVector2DivideByVector = gSystemLinker.downcallHandle(MTD_ADDRESS$aiVector2DivideByVector, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$aiVector2Length = gLibLookup.find("aiVector2Length").orElseThrow();
        MTD$aiVector2Length = gSystemLinker.downcallHandle(MTD_ADDRESS$aiVector2Length, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$aiVector2SquareLength = gLibLookup.find("aiVector2SquareLength").orElseThrow();
        MTD$aiVector2SquareLength = gSystemLinker.downcallHandle(MTD_ADDRESS$aiVector2SquareLength, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$aiVector2Negate = gLibLookup.find("aiVector2Negate").orElseThrow();
        MTD$aiVector2Negate = gSystemLinker.downcallHandle(MTD_ADDRESS$aiVector2Negate, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$aiVector2DotProduct = gLibLookup.find("aiVector2DotProduct").orElseThrow();
        MTD$aiVector2DotProduct = gSystemLinker.downcallHandle(MTD_ADDRESS$aiVector2DotProduct, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$aiVector2Normalize = gLibLookup.find("aiVector2Normalize").orElseThrow();
        MTD$aiVector2Normalize = gSystemLinker.downcallHandle(MTD_ADDRESS$aiVector2Normalize, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$aiVector3AreEqual = gLibLookup.find("aiVector3AreEqual").orElseThrow();
        MTD$aiVector3AreEqual = gSystemLinker.downcallHandle(MTD_ADDRESS$aiVector3AreEqual, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$aiVector3AreEqualEpsilon = gLibLookup.find("aiVector3AreEqualEpsilon").orElseThrow();
        MTD$aiVector3AreEqualEpsilon = gSystemLinker.downcallHandle(MTD_ADDRESS$aiVector3AreEqualEpsilon, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS$aiVector3LessThan = gLibLookup.find("aiVector3LessThan").orElseThrow();
        MTD$aiVector3LessThan = gSystemLinker.downcallHandle(MTD_ADDRESS$aiVector3LessThan, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$aiVector3Add = gLibLookup.find("aiVector3Add").orElseThrow();
        MTD$aiVector3Add = gSystemLinker.downcallHandle(MTD_ADDRESS$aiVector3Add, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$aiVector3Subtract = gLibLookup.find("aiVector3Subtract").orElseThrow();
        MTD$aiVector3Subtract = gSystemLinker.downcallHandle(MTD_ADDRESS$aiVector3Subtract, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$aiVector3Scale = gLibLookup.find("aiVector3Scale").orElseThrow();
        MTD$aiVector3Scale = gSystemLinker.downcallHandle(MTD_ADDRESS$aiVector3Scale, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS$aiVector3SymMul = gLibLookup.find("aiVector3SymMul").orElseThrow();
        MTD$aiVector3SymMul = gSystemLinker.downcallHandle(MTD_ADDRESS$aiVector3SymMul, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$aiVector3DivideByScalar = gLibLookup.find("aiVector3DivideByScalar").orElseThrow();
        MTD$aiVector3DivideByScalar = gSystemLinker.downcallHandle(MTD_ADDRESS$aiVector3DivideByScalar, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS$aiVector3DivideByVector = gLibLookup.find("aiVector3DivideByVector").orElseThrow();
        MTD$aiVector3DivideByVector = gSystemLinker.downcallHandle(MTD_ADDRESS$aiVector3DivideByVector, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$aiVector3Length = gLibLookup.find("aiVector3Length").orElseThrow();
        MTD$aiVector3Length = gSystemLinker.downcallHandle(MTD_ADDRESS$aiVector3Length, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$aiVector3SquareLength = gLibLookup.find("aiVector3SquareLength").orElseThrow();
        MTD$aiVector3SquareLength = gSystemLinker.downcallHandle(MTD_ADDRESS$aiVector3SquareLength, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$aiVector3Negate = gLibLookup.find("aiVector3Negate").orElseThrow();
        MTD$aiVector3Negate = gSystemLinker.downcallHandle(MTD_ADDRESS$aiVector3Negate, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$aiVector3DotProduct = gLibLookup.find("aiVector3DotProduct").orElseThrow();
        MTD$aiVector3DotProduct = gSystemLinker.downcallHandle(MTD_ADDRESS$aiVector3DotProduct, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$aiVector3CrossProduct = gLibLookup.find("aiVector3CrossProduct").orElseThrow();
        MTD$aiVector3CrossProduct = gSystemLinker.downcallHandle(MTD_ADDRESS$aiVector3CrossProduct, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$aiVector3Normalize = gLibLookup.find("aiVector3Normalize").orElseThrow();
        MTD$aiVector3Normalize = gSystemLinker.downcallHandle(MTD_ADDRESS$aiVector3Normalize, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$aiVector3NormalizeSafe = gLibLookup.find("aiVector3NormalizeSafe").orElseThrow();
        MTD$aiVector3NormalizeSafe = gSystemLinker.downcallHandle(MTD_ADDRESS$aiVector3NormalizeSafe, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$aiVector3RotateByQuaternion = gLibLookup.find("aiVector3RotateByQuaternion").orElseThrow();
        MTD$aiVector3RotateByQuaternion = gSystemLinker.downcallHandle(MTD_ADDRESS$aiVector3RotateByQuaternion, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$aiMatrix3FromMatrix4 = gLibLookup.find("aiMatrix3FromMatrix4").orElseThrow();
        MTD$aiMatrix3FromMatrix4 = gSystemLinker.downcallHandle(MTD_ADDRESS$aiMatrix3FromMatrix4, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$aiMatrix3FromQuaternion = gLibLookup.find("aiMatrix3FromQuaternion").orElseThrow();
        MTD$aiMatrix3FromQuaternion = gSystemLinker.downcallHandle(MTD_ADDRESS$aiMatrix3FromQuaternion, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$aiMatrix3AreEqual = gLibLookup.find("aiMatrix3AreEqual").orElseThrow();
        MTD$aiMatrix3AreEqual = gSystemLinker.downcallHandle(MTD_ADDRESS$aiMatrix3AreEqual, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$aiMatrix3AreEqualEpsilon = gLibLookup.find("aiMatrix3AreEqualEpsilon").orElseThrow();
        MTD$aiMatrix3AreEqualEpsilon = gSystemLinker.downcallHandle(MTD_ADDRESS$aiMatrix3AreEqualEpsilon, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS$aiMatrix3Inverse = gLibLookup.find("aiMatrix3Inverse").orElseThrow();
        MTD$aiMatrix3Inverse = gSystemLinker.downcallHandle(MTD_ADDRESS$aiMatrix3Inverse, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$aiMatrix3Determinant = gLibLookup.find("aiMatrix3Determinant").orElseThrow();
        MTD$aiMatrix3Determinant = gSystemLinker.downcallHandle(MTD_ADDRESS$aiMatrix3Determinant, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$aiMatrix3RotationZ = gLibLookup.find("aiMatrix3RotationZ").orElseThrow();
        MTD$aiMatrix3RotationZ = gSystemLinker.downcallHandle(MTD_ADDRESS$aiMatrix3RotationZ, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS$aiMatrix3FromRotationAroundAxis = gLibLookup.find("aiMatrix3FromRotationAroundAxis").orElseThrow();
        MTD$aiMatrix3FromRotationAroundAxis = gSystemLinker.downcallHandle(MTD_ADDRESS$aiMatrix3FromRotationAroundAxis, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS$aiMatrix3Translation = gLibLookup.find("aiMatrix3Translation").orElseThrow();
        MTD$aiMatrix3Translation = gSystemLinker.downcallHandle(MTD_ADDRESS$aiMatrix3Translation, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$aiMatrix3FromTo = gLibLookup.find("aiMatrix3FromTo").orElseThrow();
        MTD$aiMatrix3FromTo = gSystemLinker.downcallHandle(MTD_ADDRESS$aiMatrix3FromTo, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$aiMatrix4FromMatrix3 = gLibLookup.find("aiMatrix4FromMatrix3").orElseThrow();
        MTD$aiMatrix4FromMatrix3 = gSystemLinker.downcallHandle(MTD_ADDRESS$aiMatrix4FromMatrix3, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$aiMatrix4FromScalingQuaternionPosition = gLibLookup.find("aiMatrix4FromScalingQuaternionPosition").orElseThrow();
        MTD$aiMatrix4FromScalingQuaternionPosition = gSystemLinker.downcallHandle(MTD_ADDRESS$aiMatrix4FromScalingQuaternionPosition, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$aiMatrix4Add = gLibLookup.find("aiMatrix4Add").orElseThrow();
        MTD$aiMatrix4Add = gSystemLinker.downcallHandle(MTD_ADDRESS$aiMatrix4Add, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$aiMatrix4AreEqual = gLibLookup.find("aiMatrix4AreEqual").orElseThrow();
        MTD$aiMatrix4AreEqual = gSystemLinker.downcallHandle(MTD_ADDRESS$aiMatrix4AreEqual, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$aiMatrix4AreEqualEpsilon = gLibLookup.find("aiMatrix4AreEqualEpsilon").orElseThrow();
        MTD$aiMatrix4AreEqualEpsilon = gSystemLinker.downcallHandle(MTD_ADDRESS$aiMatrix4AreEqualEpsilon, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS$aiMatrix4Inverse = gLibLookup.find("aiMatrix4Inverse").orElseThrow();
        MTD$aiMatrix4Inverse = gSystemLinker.downcallHandle(MTD_ADDRESS$aiMatrix4Inverse, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$aiMatrix4Determinant = gLibLookup.find("aiMatrix4Determinant").orElseThrow();
        MTD$aiMatrix4Determinant = gSystemLinker.downcallHandle(MTD_ADDRESS$aiMatrix4Determinant, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$aiMatrix4IsIdentity = gLibLookup.find("aiMatrix4IsIdentity").orElseThrow();
        MTD$aiMatrix4IsIdentity = gSystemLinker.downcallHandle(MTD_ADDRESS$aiMatrix4IsIdentity, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$aiMatrix4DecomposeIntoScalingEulerAnglesPosition = gLibLookup.find("aiMatrix4DecomposeIntoScalingEulerAnglesPosition").orElseThrow();
        MTD$aiMatrix4DecomposeIntoScalingEulerAnglesPosition = gSystemLinker.downcallHandle(MTD_ADDRESS$aiMatrix4DecomposeIntoScalingEulerAnglesPosition, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$aiMatrix4DecomposeIntoScalingAxisAnglePosition = gLibLookup.find("aiMatrix4DecomposeIntoScalingAxisAnglePosition").orElseThrow();
        MTD$aiMatrix4DecomposeIntoScalingAxisAnglePosition = gSystemLinker.downcallHandle(MTD_ADDRESS$aiMatrix4DecomposeIntoScalingAxisAnglePosition, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$aiMatrix4DecomposeNoScaling = gLibLookup.find("aiMatrix4DecomposeNoScaling").orElseThrow();
        MTD$aiMatrix4DecomposeNoScaling = gSystemLinker.downcallHandle(MTD_ADDRESS$aiMatrix4DecomposeNoScaling, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$aiMatrix4FromEulerAngles = gLibLookup.find("aiMatrix4FromEulerAngles").orElseThrow();
        MTD$aiMatrix4FromEulerAngles = gSystemLinker.downcallHandle(MTD_ADDRESS$aiMatrix4FromEulerAngles, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS$aiMatrix4RotationX = gLibLookup.find("aiMatrix4RotationX").orElseThrow();
        MTD$aiMatrix4RotationX = gSystemLinker.downcallHandle(MTD_ADDRESS$aiMatrix4RotationX, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS$aiMatrix4RotationY = gLibLookup.find("aiMatrix4RotationY").orElseThrow();
        MTD$aiMatrix4RotationY = gSystemLinker.downcallHandle(MTD_ADDRESS$aiMatrix4RotationY, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS$aiMatrix4RotationZ = gLibLookup.find("aiMatrix4RotationZ").orElseThrow();
        MTD$aiMatrix4RotationZ = gSystemLinker.downcallHandle(MTD_ADDRESS$aiMatrix4RotationZ, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS$aiMatrix4FromRotationAroundAxis = gLibLookup.find("aiMatrix4FromRotationAroundAxis").orElseThrow();
        MTD$aiMatrix4FromRotationAroundAxis = gSystemLinker.downcallHandle(MTD_ADDRESS$aiMatrix4FromRotationAroundAxis, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS$aiMatrix4Translation = gLibLookup.find("aiMatrix4Translation").orElseThrow();
        MTD$aiMatrix4Translation = gSystemLinker.downcallHandle(MTD_ADDRESS$aiMatrix4Translation, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$aiMatrix4Scaling = gLibLookup.find("aiMatrix4Scaling").orElseThrow();
        MTD$aiMatrix4Scaling = gSystemLinker.downcallHandle(MTD_ADDRESS$aiMatrix4Scaling, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$aiMatrix4FromTo = gLibLookup.find("aiMatrix4FromTo").orElseThrow();
        MTD$aiMatrix4FromTo = gSystemLinker.downcallHandle(MTD_ADDRESS$aiMatrix4FromTo, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$aiQuaternionFromEulerAngles = gLibLookup.find("aiQuaternionFromEulerAngles").orElseThrow();
        MTD$aiQuaternionFromEulerAngles = gSystemLinker.downcallHandle(MTD_ADDRESS$aiQuaternionFromEulerAngles, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS$aiQuaternionFromAxisAngle = gLibLookup.find("aiQuaternionFromAxisAngle").orElseThrow();
        MTD$aiQuaternionFromAxisAngle = gSystemLinker.downcallHandle(MTD_ADDRESS$aiQuaternionFromAxisAngle, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS$aiQuaternionFromNormalizedQuaternion = gLibLookup.find("aiQuaternionFromNormalizedQuaternion").orElseThrow();
        MTD$aiQuaternionFromNormalizedQuaternion = gSystemLinker.downcallHandle(MTD_ADDRESS$aiQuaternionFromNormalizedQuaternion, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$aiQuaternionAreEqual = gLibLookup.find("aiQuaternionAreEqual").orElseThrow();
        MTD$aiQuaternionAreEqual = gSystemLinker.downcallHandle(MTD_ADDRESS$aiQuaternionAreEqual, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$aiQuaternionAreEqualEpsilon = gLibLookup.find("aiQuaternionAreEqualEpsilon").orElseThrow();
        MTD$aiQuaternionAreEqualEpsilon = gSystemLinker.downcallHandle(MTD_ADDRESS$aiQuaternionAreEqualEpsilon, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS$aiQuaternionNormalize = gLibLookup.find("aiQuaternionNormalize").orElseThrow();
        MTD$aiQuaternionNormalize = gSystemLinker.downcallHandle(MTD_ADDRESS$aiQuaternionNormalize, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$aiQuaternionConjugate = gLibLookup.find("aiQuaternionConjugate").orElseThrow();
        MTD$aiQuaternionConjugate = gSystemLinker.downcallHandle(MTD_ADDRESS$aiQuaternionConjugate, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$aiQuaternionMultiply = gLibLookup.find("aiQuaternionMultiply").orElseThrow();
        MTD$aiQuaternionMultiply = gSystemLinker.downcallHandle(MTD_ADDRESS$aiQuaternionMultiply, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$aiQuaternionInterpolate = gLibLookup.find("aiQuaternionInterpolate").orElseThrow();
        MTD$aiQuaternionInterpolate = gSystemLinker.downcallHandle(MTD_ADDRESS$aiQuaternionInterpolate, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS$aiGetExportFormatCount = gLibLookup.find("aiGetExportFormatCount").orElseThrow();
        MTD$aiGetExportFormatCount = gSystemLinker.downcallHandle(MTD_ADDRESS$aiGetExportFormatCount, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_LONG));
        MTD_ADDRESS$aiGetExportFormatDescription = gLibLookup.find("aiGetExportFormatDescription").orElseThrow();
        MTD$aiGetExportFormatDescription = gSystemLinker.downcallHandle(MTD_ADDRESS$aiGetExportFormatDescription, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_LONG));
        MTD_ADDRESS$aiReleaseExportFormatDescription = gLibLookup.find("aiReleaseExportFormatDescription").orElseThrow();
        MTD$aiReleaseExportFormatDescription = gSystemLinker.downcallHandle(MTD_ADDRESS$aiReleaseExportFormatDescription, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$aiCopyScene = gLibLookup.find("aiCopyScene").orElseThrow();
        MTD$aiCopyScene = gSystemLinker.downcallHandle(MTD_ADDRESS$aiCopyScene, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$aiFreeScene = gLibLookup.find("aiFreeScene").orElseThrow();
        MTD$aiFreeScene = gSystemLinker.downcallHandle(MTD_ADDRESS$aiFreeScene, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$aiExportScene = gLibLookup.find("aiExportScene").orElseThrow();
        MTD$aiExportScene = gSystemLinker.downcallHandle(MTD_ADDRESS$aiExportScene, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$aiExportSceneEx = gLibLookup.find("aiExportSceneEx").orElseThrow();
        MTD$aiExportSceneEx = gSystemLinker.downcallHandle(MTD_ADDRESS$aiExportSceneEx, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$aiExportSceneToBlob = gLibLookup.find("aiExportSceneToBlob").orElseThrow();
        MTD$aiExportSceneToBlob = gSystemLinker.downcallHandle(MTD_ADDRESS$aiExportSceneToBlob, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$aiReleaseExportBlob = gLibLookup.find("aiReleaseExportBlob").orElseThrow();
        MTD$aiReleaseExportBlob = gSystemLinker.downcallHandle(MTD_ADDRESS$aiReleaseExportBlob, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$aiGetImporterDesc = gLibLookup.find("aiGetImporterDesc").orElseThrow();
        MTD$aiGetImporterDesc = gSystemLinker.downcallHandle(MTD_ADDRESS$aiGetImporterDesc, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$aiTextureTypeToString = gLibLookup.find("aiTextureTypeToString").orElseThrow();
        MTD$aiTextureTypeToString = gSystemLinker.downcallHandle(MTD_ADDRESS$aiTextureTypeToString, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$aiGetMaterialProperty = gLibLookup.find("aiGetMaterialProperty").orElseThrow();
        MTD$aiGetMaterialProperty = gSystemLinker.downcallHandle(MTD_ADDRESS$aiGetMaterialProperty, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$aiGetMaterialFloatArray = gLibLookup.find("aiGetMaterialFloatArray").orElseThrow();
        MTD$aiGetMaterialFloatArray = gSystemLinker.downcallHandle(MTD_ADDRESS$aiGetMaterialFloatArray, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$aiGetMaterialIntegerArray = gLibLookup.find("aiGetMaterialIntegerArray").orElseThrow();
        MTD$aiGetMaterialIntegerArray = gSystemLinker.downcallHandle(MTD_ADDRESS$aiGetMaterialIntegerArray, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$aiGetMaterialColor = gLibLookup.find("aiGetMaterialColor").orElseThrow();
        MTD$aiGetMaterialColor = gSystemLinker.downcallHandle(MTD_ADDRESS$aiGetMaterialColor, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$aiGetMaterialUVTransform = gLibLookup.find("aiGetMaterialUVTransform").orElseThrow();
        MTD$aiGetMaterialUVTransform = gSystemLinker.downcallHandle(MTD_ADDRESS$aiGetMaterialUVTransform, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$aiGetMaterialString = gLibLookup.find("aiGetMaterialString").orElseThrow();
        MTD$aiGetMaterialString = gSystemLinker.downcallHandle(MTD_ADDRESS$aiGetMaterialString, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$aiGetMaterialTextureCount = gLibLookup.find("aiGetMaterialTextureCount").orElseThrow();
        MTD$aiGetMaterialTextureCount = gSystemLinker.downcallHandle(MTD_ADDRESS$aiGetMaterialTextureCount, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$aiGetMaterialTexture = gLibLookup.find("aiGetMaterialTexture").orElseThrow();
        MTD$aiGetMaterialTexture = gSystemLinker.downcallHandle(MTD_ADDRESS$aiGetMaterialTexture, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$aiGetLegalString = gLibLookup.find("aiGetLegalString").orElseThrow();
        MTD$aiGetLegalString = gSystemLinker.downcallHandle(MTD_ADDRESS$aiGetLegalString, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$aiGetVersionPatch = gLibLookup.find("aiGetVersionPatch").orElseThrow();
        MTD$aiGetVersionPatch = gSystemLinker.downcallHandle(MTD_ADDRESS$aiGetVersionPatch, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$aiGetVersionMinor = gLibLookup.find("aiGetVersionMinor").orElseThrow();
        MTD$aiGetVersionMinor = gSystemLinker.downcallHandle(MTD_ADDRESS$aiGetVersionMinor, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$aiGetVersionMajor = gLibLookup.find("aiGetVersionMajor").orElseThrow();
        MTD$aiGetVersionMajor = gSystemLinker.downcallHandle(MTD_ADDRESS$aiGetVersionMajor, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$aiGetVersionRevision = gLibLookup.find("aiGetVersionRevision").orElseThrow();
        MTD$aiGetVersionRevision = gSystemLinker.downcallHandle(MTD_ADDRESS$aiGetVersionRevision, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$aiGetBranchName = gLibLookup.find("aiGetBranchName").orElseThrow();
        MTD$aiGetBranchName = gSystemLinker.downcallHandle(MTD_ADDRESS$aiGetBranchName, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$aiGetCompileFlags = gLibLookup.find("aiGetCompileFlags").orElseThrow();
        MTD$aiGetCompileFlags = gSystemLinker.downcallHandle(MTD_ADDRESS$aiGetCompileFlags, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT));
    }
}
