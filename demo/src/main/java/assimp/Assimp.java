package assimp;

public final class Assimp
{private Assimp() {}

    public static final int AI_FALSE = 0;
    public static final int AI_IMPORT_IFC_DEFAULT_CYLINDRICAL_TESSELLATION = 32;
    public static final int AI_LMW_MAX_WEIGHTS = 4;
    public static final int AI_MAX_BONE_WEIGHTS = 2147483647;
    public static final int AI_MAX_FACES = 2147483647;
    public static final int AI_MAX_FACE_INDICES = 32767;
    public static final int AI_MAX_NUMBER_OF_COLOR_SETS = 8;
    public static final int AI_MAX_NUMBER_OF_TEXTURECOORDS = 8;
    public static final int AI_MAX_VERTICES = 2147483647;
    public static final int AI_SBBC_DEFAULT_MAX_BONES = 60;
    public static final int AI_SCENE_FLAGS_ALLOW_SHARED = 32;
    public static final int AI_SCENE_FLAGS_INCOMPLETE = 1;
    public static final int AI_SCENE_FLAGS_NON_VERBOSE_FORMAT = 8;
    public static final int AI_SCENE_FLAGS_TERRAIN = 16;
    public static final int AI_SCENE_FLAGS_VALIDATED = 2;
    public static final int AI_SCENE_FLAGS_VALIDATION_WARNING = 4;
    public static final int AI_SLM_DEFAULT_MAX_TRIANGLES = 1000000;
    public static final int AI_SLM_DEFAULT_MAX_VERTICES = 1000000;
    public static final int AI_TRUE = 1;
    public static final int AI_UVTRAFO_ROTATION = 2;
    public static final int AI_UVTRAFO_SCALING = 1;
    public static final int AI_UVTRAFO_TRANSLATION = 4;
    public static final int ASSIMP_AI_REAL_TEXT_PRECISION = 9;
    public static final int HINTMAXTEXTURELEN = 9;
    public static final int MAXLEN = 1024;
    public static final int PP_ICL_PTCACHE_SIZE = 12;

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiGetImporterDesc;
    public static final java.lang.invoke.MethodHandle MTD__aiGetImporterDesc;
    public static java.lang.foreign.MemorySegment aiGetImporterDesc(java.lang.foreign.MemorySegment extension)
    {
        try {return (java.lang.foreign.MemorySegment)MTD__aiGetImporterDesc.invokeExact(extension);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiImportFile;
    public static final java.lang.invoke.MethodHandle MTD__aiImportFile;
    public static java.lang.foreign.MemorySegment aiImportFile(java.lang.foreign.MemorySegment pFile, int pFlags)
    {
        try {return (java.lang.foreign.MemorySegment)MTD__aiImportFile.invokeExact(pFile, pFlags);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiImportFileEx;
    public static final java.lang.invoke.MethodHandle MTD__aiImportFileEx;
    public static java.lang.foreign.MemorySegment aiImportFileEx(java.lang.foreign.MemorySegment pFile, int pFlags, java.lang.foreign.MemorySegment pFS)
    {
        try {return (java.lang.foreign.MemorySegment)MTD__aiImportFileEx.invokeExact(pFile, pFlags, pFS);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiImportFileExWithProperties;
    public static final java.lang.invoke.MethodHandle MTD__aiImportFileExWithProperties;
    public static java.lang.foreign.MemorySegment aiImportFileExWithProperties(java.lang.foreign.MemorySegment pFile, int pFlags, java.lang.foreign.MemorySegment pFS, java.lang.foreign.MemorySegment pProps)
    {
        try {return (java.lang.foreign.MemorySegment)MTD__aiImportFileExWithProperties.invokeExact(pFile, pFlags, pFS, pProps);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiImportFileFromMemory;
    public static final java.lang.invoke.MethodHandle MTD__aiImportFileFromMemory;
    public static java.lang.foreign.MemorySegment aiImportFileFromMemory(java.lang.foreign.MemorySegment pBuffer, int pLength, int pFlags, java.lang.foreign.MemorySegment pHint)
    {
        try {return (java.lang.foreign.MemorySegment)MTD__aiImportFileFromMemory.invokeExact(pBuffer, pLength, pFlags, pHint);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiImportFileFromMemoryWithProperties;
    public static final java.lang.invoke.MethodHandle MTD__aiImportFileFromMemoryWithProperties;
    public static java.lang.foreign.MemorySegment aiImportFileFromMemoryWithProperties(java.lang.foreign.MemorySegment pBuffer, int pLength, int pFlags, java.lang.foreign.MemorySegment pHint, java.lang.foreign.MemorySegment pProps)
    {
        try {return (java.lang.foreign.MemorySegment)MTD__aiImportFileFromMemoryWithProperties.invokeExact(pBuffer, pLength, pFlags, pHint, pProps);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiApplyPostProcessing;
    public static final java.lang.invoke.MethodHandle MTD__aiApplyPostProcessing;
    public static java.lang.foreign.MemorySegment aiApplyPostProcessing(java.lang.foreign.MemorySegment pScene, int pFlags)
    {
        try {return (java.lang.foreign.MemorySegment)MTD__aiApplyPostProcessing.invokeExact(pScene, pFlags);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiGetPredefinedLogStream;
    public static final java.lang.invoke.MethodHandle MTD__aiGetPredefinedLogStream;
    public static assimp.aiLogStream aiGetPredefinedLogStream(java.lang.foreign.SegmentAllocator allocator, int pStreams, java.lang.foreign.MemorySegment file)
    {
        try {return new assimp.aiLogStream((java.lang.foreign.MemorySegment)MTD__aiGetPredefinedLogStream.invokeExact(allocator, pStreams, file));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiAttachLogStream;
    public static final java.lang.invoke.MethodHandle MTD__aiAttachLogStream;
    public static void aiAttachLogStream(java.lang.foreign.MemorySegment stream)
    {
        try {MTD__aiAttachLogStream.invokeExact(stream);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiEnableVerboseLogging;
    public static final java.lang.invoke.MethodHandle MTD__aiEnableVerboseLogging;
    public static void aiEnableVerboseLogging(int d)
    {
        try {MTD__aiEnableVerboseLogging.invokeExact(d);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiDetachLogStream;
    public static final java.lang.invoke.MethodHandle MTD__aiDetachLogStream;
    public static int aiDetachLogStream(java.lang.foreign.MemorySegment stream)
    {
        try {return (int)MTD__aiDetachLogStream.invokeExact(stream);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiDetachAllLogStreams;
    public static final java.lang.invoke.MethodHandle MTD__aiDetachAllLogStreams;
    public static void aiDetachAllLogStreams()
    {
        try {MTD__aiDetachAllLogStreams.invokeExact();}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiReleaseImport;
    public static final java.lang.invoke.MethodHandle MTD__aiReleaseImport;
    public static void aiReleaseImport(java.lang.foreign.MemorySegment pScene)
    {
        try {MTD__aiReleaseImport.invokeExact(pScene);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiGetErrorString;
    public static final java.lang.invoke.MethodHandle MTD__aiGetErrorString;
    public static java.lang.foreign.MemorySegment aiGetErrorString()
    {
        try {return (java.lang.foreign.MemorySegment)MTD__aiGetErrorString.invokeExact();}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiIsExtensionSupported;
    public static final java.lang.invoke.MethodHandle MTD__aiIsExtensionSupported;
    public static int aiIsExtensionSupported(java.lang.foreign.MemorySegment szExtension)
    {
        try {return (int)MTD__aiIsExtensionSupported.invokeExact(szExtension);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiGetExtensionList;
    public static final java.lang.invoke.MethodHandle MTD__aiGetExtensionList;
    public static void aiGetExtensionList(java.lang.foreign.MemorySegment szOut)
    {
        try {MTD__aiGetExtensionList.invokeExact(szOut);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiGetMemoryRequirements;
    public static final java.lang.invoke.MethodHandle MTD__aiGetMemoryRequirements;
    public static void aiGetMemoryRequirements(java.lang.foreign.MemorySegment pIn, java.lang.foreign.MemorySegment in)
    {
        try {MTD__aiGetMemoryRequirements.invokeExact(pIn, in);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiCreatePropertyStore;
    public static final java.lang.invoke.MethodHandle MTD__aiCreatePropertyStore;
    public static java.lang.foreign.MemorySegment aiCreatePropertyStore()
    {
        try {return (java.lang.foreign.MemorySegment)MTD__aiCreatePropertyStore.invokeExact();}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiReleasePropertyStore;
    public static final java.lang.invoke.MethodHandle MTD__aiReleasePropertyStore;
    public static void aiReleasePropertyStore(java.lang.foreign.MemorySegment p)
    {
        try {MTD__aiReleasePropertyStore.invokeExact(p);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiSetImportPropertyInteger;
    public static final java.lang.invoke.MethodHandle MTD__aiSetImportPropertyInteger;
    public static void aiSetImportPropertyInteger(java.lang.foreign.MemorySegment store, java.lang.foreign.MemorySegment szName, int value)
    {
        try {MTD__aiSetImportPropertyInteger.invokeExact(store, szName, value);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiSetImportPropertyFloat;
    public static final java.lang.invoke.MethodHandle MTD__aiSetImportPropertyFloat;
    public static void aiSetImportPropertyFloat(java.lang.foreign.MemorySegment store, java.lang.foreign.MemorySegment szName, float value)
    {
        try {MTD__aiSetImportPropertyFloat.invokeExact(store, szName, value);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiSetImportPropertyString;
    public static final java.lang.invoke.MethodHandle MTD__aiSetImportPropertyString;
    public static void aiSetImportPropertyString(java.lang.foreign.MemorySegment store, java.lang.foreign.MemorySegment szName, java.lang.foreign.MemorySegment st)
    {
        try {MTD__aiSetImportPropertyString.invokeExact(store, szName, st);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiSetImportPropertyMatrix;
    public static final java.lang.invoke.MethodHandle MTD__aiSetImportPropertyMatrix;
    public static void aiSetImportPropertyMatrix(java.lang.foreign.MemorySegment store, java.lang.foreign.MemorySegment szName, java.lang.foreign.MemorySegment mat)
    {
        try {MTD__aiSetImportPropertyMatrix.invokeExact(store, szName, mat);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiCreateQuaternionFromMatrix;
    public static final java.lang.invoke.MethodHandle MTD__aiCreateQuaternionFromMatrix;
    public static void aiCreateQuaternionFromMatrix(java.lang.foreign.MemorySegment quat, java.lang.foreign.MemorySegment mat)
    {
        try {MTD__aiCreateQuaternionFromMatrix.invokeExact(quat, mat);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiDecomposeMatrix;
    public static final java.lang.invoke.MethodHandle MTD__aiDecomposeMatrix;
    public static void aiDecomposeMatrix(java.lang.foreign.MemorySegment mat, java.lang.foreign.MemorySegment scaling, java.lang.foreign.MemorySegment rotation, java.lang.foreign.MemorySegment position)
    {
        try {MTD__aiDecomposeMatrix.invokeExact(mat, scaling, rotation, position);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiTransposeMatrix4;
    public static final java.lang.invoke.MethodHandle MTD__aiTransposeMatrix4;
    public static void aiTransposeMatrix4(java.lang.foreign.MemorySegment mat)
    {
        try {MTD__aiTransposeMatrix4.invokeExact(mat);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiTransposeMatrix3;
    public static final java.lang.invoke.MethodHandle MTD__aiTransposeMatrix3;
    public static void aiTransposeMatrix3(java.lang.foreign.MemorySegment mat)
    {
        try {MTD__aiTransposeMatrix3.invokeExact(mat);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiTransformVecByMatrix3;
    public static final java.lang.invoke.MethodHandle MTD__aiTransformVecByMatrix3;
    public static void aiTransformVecByMatrix3(java.lang.foreign.MemorySegment vec, java.lang.foreign.MemorySegment mat)
    {
        try {MTD__aiTransformVecByMatrix3.invokeExact(vec, mat);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiTransformVecByMatrix4;
    public static final java.lang.invoke.MethodHandle MTD__aiTransformVecByMatrix4;
    public static void aiTransformVecByMatrix4(java.lang.foreign.MemorySegment vec, java.lang.foreign.MemorySegment mat)
    {
        try {MTD__aiTransformVecByMatrix4.invokeExact(vec, mat);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiMultiplyMatrix4;
    public static final java.lang.invoke.MethodHandle MTD__aiMultiplyMatrix4;
    public static void aiMultiplyMatrix4(java.lang.foreign.MemorySegment dst, java.lang.foreign.MemorySegment src)
    {
        try {MTD__aiMultiplyMatrix4.invokeExact(dst, src);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiMultiplyMatrix3;
    public static final java.lang.invoke.MethodHandle MTD__aiMultiplyMatrix3;
    public static void aiMultiplyMatrix3(java.lang.foreign.MemorySegment dst, java.lang.foreign.MemorySegment src)
    {
        try {MTD__aiMultiplyMatrix3.invokeExact(dst, src);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiIdentityMatrix3;
    public static final java.lang.invoke.MethodHandle MTD__aiIdentityMatrix3;
    public static void aiIdentityMatrix3(java.lang.foreign.MemorySegment mat)
    {
        try {MTD__aiIdentityMatrix3.invokeExact(mat);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiIdentityMatrix4;
    public static final java.lang.invoke.MethodHandle MTD__aiIdentityMatrix4;
    public static void aiIdentityMatrix4(java.lang.foreign.MemorySegment mat)
    {
        try {MTD__aiIdentityMatrix4.invokeExact(mat);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiGetImportFormatCount;
    public static final java.lang.invoke.MethodHandle MTD__aiGetImportFormatCount;
    public static long aiGetImportFormatCount()
    {
        try {return (long)MTD__aiGetImportFormatCount.invokeExact();}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiGetImportFormatDescription;
    public static final java.lang.invoke.MethodHandle MTD__aiGetImportFormatDescription;
    public static java.lang.foreign.MemorySegment aiGetImportFormatDescription(long pIndex)
    {
        try {return (java.lang.foreign.MemorySegment)MTD__aiGetImportFormatDescription.invokeExact(pIndex);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiVector2AreEqual;
    public static final java.lang.invoke.MethodHandle MTD__aiVector2AreEqual;
    public static int aiVector2AreEqual(java.lang.foreign.MemorySegment a, java.lang.foreign.MemorySegment b)
    {
        try {return (int)MTD__aiVector2AreEqual.invokeExact(a, b);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiVector2AreEqualEpsilon;
    public static final java.lang.invoke.MethodHandle MTD__aiVector2AreEqualEpsilon;
    public static int aiVector2AreEqualEpsilon(java.lang.foreign.MemorySegment a, java.lang.foreign.MemorySegment b, float epsilon)
    {
        try {return (int)MTD__aiVector2AreEqualEpsilon.invokeExact(a, b, epsilon);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiVector2Add;
    public static final java.lang.invoke.MethodHandle MTD__aiVector2Add;
    public static void aiVector2Add(java.lang.foreign.MemorySegment dst, java.lang.foreign.MemorySegment src)
    {
        try {MTD__aiVector2Add.invokeExact(dst, src);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiVector2Subtract;
    public static final java.lang.invoke.MethodHandle MTD__aiVector2Subtract;
    public static void aiVector2Subtract(java.lang.foreign.MemorySegment dst, java.lang.foreign.MemorySegment src)
    {
        try {MTD__aiVector2Subtract.invokeExact(dst, src);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiVector2Scale;
    public static final java.lang.invoke.MethodHandle MTD__aiVector2Scale;
    public static void aiVector2Scale(java.lang.foreign.MemorySegment dst, float s)
    {
        try {MTD__aiVector2Scale.invokeExact(dst, s);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiVector2SymMul;
    public static final java.lang.invoke.MethodHandle MTD__aiVector2SymMul;
    public static void aiVector2SymMul(java.lang.foreign.MemorySegment dst, java.lang.foreign.MemorySegment other)
    {
        try {MTD__aiVector2SymMul.invokeExact(dst, other);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiVector2DivideByScalar;
    public static final java.lang.invoke.MethodHandle MTD__aiVector2DivideByScalar;
    public static void aiVector2DivideByScalar(java.lang.foreign.MemorySegment dst, float s)
    {
        try {MTD__aiVector2DivideByScalar.invokeExact(dst, s);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiVector2DivideByVector;
    public static final java.lang.invoke.MethodHandle MTD__aiVector2DivideByVector;
    public static void aiVector2DivideByVector(java.lang.foreign.MemorySegment dst, java.lang.foreign.MemorySegment v)
    {
        try {MTD__aiVector2DivideByVector.invokeExact(dst, v);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiVector2Length;
    public static final java.lang.invoke.MethodHandle MTD__aiVector2Length;
    public static float aiVector2Length(java.lang.foreign.MemorySegment v)
    {
        try {return (float)MTD__aiVector2Length.invokeExact(v);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiVector2SquareLength;
    public static final java.lang.invoke.MethodHandle MTD__aiVector2SquareLength;
    public static float aiVector2SquareLength(java.lang.foreign.MemorySegment v)
    {
        try {return (float)MTD__aiVector2SquareLength.invokeExact(v);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiVector2Negate;
    public static final java.lang.invoke.MethodHandle MTD__aiVector2Negate;
    public static void aiVector2Negate(java.lang.foreign.MemorySegment dst)
    {
        try {MTD__aiVector2Negate.invokeExact(dst);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiVector2DotProduct;
    public static final java.lang.invoke.MethodHandle MTD__aiVector2DotProduct;
    public static float aiVector2DotProduct(java.lang.foreign.MemorySegment a, java.lang.foreign.MemorySegment b)
    {
        try {return (float)MTD__aiVector2DotProduct.invokeExact(a, b);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiVector2Normalize;
    public static final java.lang.invoke.MethodHandle MTD__aiVector2Normalize;
    public static void aiVector2Normalize(java.lang.foreign.MemorySegment v)
    {
        try {MTD__aiVector2Normalize.invokeExact(v);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiVector3AreEqual;
    public static final java.lang.invoke.MethodHandle MTD__aiVector3AreEqual;
    public static int aiVector3AreEqual(java.lang.foreign.MemorySegment a, java.lang.foreign.MemorySegment b)
    {
        try {return (int)MTD__aiVector3AreEqual.invokeExact(a, b);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiVector3AreEqualEpsilon;
    public static final java.lang.invoke.MethodHandle MTD__aiVector3AreEqualEpsilon;
    public static int aiVector3AreEqualEpsilon(java.lang.foreign.MemorySegment a, java.lang.foreign.MemorySegment b, float epsilon)
    {
        try {return (int)MTD__aiVector3AreEqualEpsilon.invokeExact(a, b, epsilon);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiVector3LessThan;
    public static final java.lang.invoke.MethodHandle MTD__aiVector3LessThan;
    public static int aiVector3LessThan(java.lang.foreign.MemorySegment a, java.lang.foreign.MemorySegment b)
    {
        try {return (int)MTD__aiVector3LessThan.invokeExact(a, b);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiVector3Add;
    public static final java.lang.invoke.MethodHandle MTD__aiVector3Add;
    public static void aiVector3Add(java.lang.foreign.MemorySegment dst, java.lang.foreign.MemorySegment src)
    {
        try {MTD__aiVector3Add.invokeExact(dst, src);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiVector3Subtract;
    public static final java.lang.invoke.MethodHandle MTD__aiVector3Subtract;
    public static void aiVector3Subtract(java.lang.foreign.MemorySegment dst, java.lang.foreign.MemorySegment src)
    {
        try {MTD__aiVector3Subtract.invokeExact(dst, src);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiVector3Scale;
    public static final java.lang.invoke.MethodHandle MTD__aiVector3Scale;
    public static void aiVector3Scale(java.lang.foreign.MemorySegment dst, float s)
    {
        try {MTD__aiVector3Scale.invokeExact(dst, s);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiVector3SymMul;
    public static final java.lang.invoke.MethodHandle MTD__aiVector3SymMul;
    public static void aiVector3SymMul(java.lang.foreign.MemorySegment dst, java.lang.foreign.MemorySegment other)
    {
        try {MTD__aiVector3SymMul.invokeExact(dst, other);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiVector3DivideByScalar;
    public static final java.lang.invoke.MethodHandle MTD__aiVector3DivideByScalar;
    public static void aiVector3DivideByScalar(java.lang.foreign.MemorySegment dst, float s)
    {
        try {MTD__aiVector3DivideByScalar.invokeExact(dst, s);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiVector3DivideByVector;
    public static final java.lang.invoke.MethodHandle MTD__aiVector3DivideByVector;
    public static void aiVector3DivideByVector(java.lang.foreign.MemorySegment dst, java.lang.foreign.MemorySegment v)
    {
        try {MTD__aiVector3DivideByVector.invokeExact(dst, v);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiVector3Length;
    public static final java.lang.invoke.MethodHandle MTD__aiVector3Length;
    public static float aiVector3Length(java.lang.foreign.MemorySegment v)
    {
        try {return (float)MTD__aiVector3Length.invokeExact(v);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiVector3SquareLength;
    public static final java.lang.invoke.MethodHandle MTD__aiVector3SquareLength;
    public static float aiVector3SquareLength(java.lang.foreign.MemorySegment v)
    {
        try {return (float)MTD__aiVector3SquareLength.invokeExact(v);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiVector3Negate;
    public static final java.lang.invoke.MethodHandle MTD__aiVector3Negate;
    public static void aiVector3Negate(java.lang.foreign.MemorySegment dst)
    {
        try {MTD__aiVector3Negate.invokeExact(dst);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiVector3DotProduct;
    public static final java.lang.invoke.MethodHandle MTD__aiVector3DotProduct;
    public static float aiVector3DotProduct(java.lang.foreign.MemorySegment a, java.lang.foreign.MemorySegment b)
    {
        try {return (float)MTD__aiVector3DotProduct.invokeExact(a, b);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiVector3CrossProduct;
    public static final java.lang.invoke.MethodHandle MTD__aiVector3CrossProduct;
    public static void aiVector3CrossProduct(java.lang.foreign.MemorySegment dst, java.lang.foreign.MemorySegment a, java.lang.foreign.MemorySegment b)
    {
        try {MTD__aiVector3CrossProduct.invokeExact(dst, a, b);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiVector3Normalize;
    public static final java.lang.invoke.MethodHandle MTD__aiVector3Normalize;
    public static void aiVector3Normalize(java.lang.foreign.MemorySegment v)
    {
        try {MTD__aiVector3Normalize.invokeExact(v);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiVector3NormalizeSafe;
    public static final java.lang.invoke.MethodHandle MTD__aiVector3NormalizeSafe;
    public static void aiVector3NormalizeSafe(java.lang.foreign.MemorySegment v)
    {
        try {MTD__aiVector3NormalizeSafe.invokeExact(v);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiVector3RotateByQuaternion;
    public static final java.lang.invoke.MethodHandle MTD__aiVector3RotateByQuaternion;
    public static void aiVector3RotateByQuaternion(java.lang.foreign.MemorySegment v, java.lang.foreign.MemorySegment q)
    {
        try {MTD__aiVector3RotateByQuaternion.invokeExact(v, q);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiMatrix3FromMatrix4;
    public static final java.lang.invoke.MethodHandle MTD__aiMatrix3FromMatrix4;
    public static void aiMatrix3FromMatrix4(java.lang.foreign.MemorySegment dst, java.lang.foreign.MemorySegment mat)
    {
        try {MTD__aiMatrix3FromMatrix4.invokeExact(dst, mat);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiMatrix3FromQuaternion;
    public static final java.lang.invoke.MethodHandle MTD__aiMatrix3FromQuaternion;
    public static void aiMatrix3FromQuaternion(java.lang.foreign.MemorySegment mat, java.lang.foreign.MemorySegment q)
    {
        try {MTD__aiMatrix3FromQuaternion.invokeExact(mat, q);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiMatrix3AreEqual;
    public static final java.lang.invoke.MethodHandle MTD__aiMatrix3AreEqual;
    public static int aiMatrix3AreEqual(java.lang.foreign.MemorySegment a, java.lang.foreign.MemorySegment b)
    {
        try {return (int)MTD__aiMatrix3AreEqual.invokeExact(a, b);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiMatrix3AreEqualEpsilon;
    public static final java.lang.invoke.MethodHandle MTD__aiMatrix3AreEqualEpsilon;
    public static int aiMatrix3AreEqualEpsilon(java.lang.foreign.MemorySegment a, java.lang.foreign.MemorySegment b, float epsilon)
    {
        try {return (int)MTD__aiMatrix3AreEqualEpsilon.invokeExact(a, b, epsilon);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiMatrix3Inverse;
    public static final java.lang.invoke.MethodHandle MTD__aiMatrix3Inverse;
    public static void aiMatrix3Inverse(java.lang.foreign.MemorySegment mat)
    {
        try {MTD__aiMatrix3Inverse.invokeExact(mat);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiMatrix3Determinant;
    public static final java.lang.invoke.MethodHandle MTD__aiMatrix3Determinant;
    public static float aiMatrix3Determinant(java.lang.foreign.MemorySegment mat)
    {
        try {return (float)MTD__aiMatrix3Determinant.invokeExact(mat);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiMatrix3RotationZ;
    public static final java.lang.invoke.MethodHandle MTD__aiMatrix3RotationZ;
    public static void aiMatrix3RotationZ(java.lang.foreign.MemorySegment mat, float angle)
    {
        try {MTD__aiMatrix3RotationZ.invokeExact(mat, angle);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiMatrix3FromRotationAroundAxis;
    public static final java.lang.invoke.MethodHandle MTD__aiMatrix3FromRotationAroundAxis;
    public static void aiMatrix3FromRotationAroundAxis(java.lang.foreign.MemorySegment mat, java.lang.foreign.MemorySegment axis, float angle)
    {
        try {MTD__aiMatrix3FromRotationAroundAxis.invokeExact(mat, axis, angle);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiMatrix3Translation;
    public static final java.lang.invoke.MethodHandle MTD__aiMatrix3Translation;
    public static void aiMatrix3Translation(java.lang.foreign.MemorySegment mat, java.lang.foreign.MemorySegment translation)
    {
        try {MTD__aiMatrix3Translation.invokeExact(mat, translation);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiMatrix3FromTo;
    public static final java.lang.invoke.MethodHandle MTD__aiMatrix3FromTo;
    public static void aiMatrix3FromTo(java.lang.foreign.MemorySegment mat, java.lang.foreign.MemorySegment from, java.lang.foreign.MemorySegment to)
    {
        try {MTD__aiMatrix3FromTo.invokeExact(mat, from, to);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiMatrix4FromMatrix3;
    public static final java.lang.invoke.MethodHandle MTD__aiMatrix4FromMatrix3;
    public static void aiMatrix4FromMatrix3(java.lang.foreign.MemorySegment dst, java.lang.foreign.MemorySegment mat)
    {
        try {MTD__aiMatrix4FromMatrix3.invokeExact(dst, mat);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiMatrix4FromScalingQuaternionPosition;
    public static final java.lang.invoke.MethodHandle MTD__aiMatrix4FromScalingQuaternionPosition;
    public static void aiMatrix4FromScalingQuaternionPosition(java.lang.foreign.MemorySegment mat, java.lang.foreign.MemorySegment scaling, java.lang.foreign.MemorySegment rotation, java.lang.foreign.MemorySegment position)
    {
        try {MTD__aiMatrix4FromScalingQuaternionPosition.invokeExact(mat, scaling, rotation, position);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiMatrix4Add;
    public static final java.lang.invoke.MethodHandle MTD__aiMatrix4Add;
    public static void aiMatrix4Add(java.lang.foreign.MemorySegment dst, java.lang.foreign.MemorySegment src)
    {
        try {MTD__aiMatrix4Add.invokeExact(dst, src);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiMatrix4AreEqual;
    public static final java.lang.invoke.MethodHandle MTD__aiMatrix4AreEqual;
    public static int aiMatrix4AreEqual(java.lang.foreign.MemorySegment a, java.lang.foreign.MemorySegment b)
    {
        try {return (int)MTD__aiMatrix4AreEqual.invokeExact(a, b);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiMatrix4AreEqualEpsilon;
    public static final java.lang.invoke.MethodHandle MTD__aiMatrix4AreEqualEpsilon;
    public static int aiMatrix4AreEqualEpsilon(java.lang.foreign.MemorySegment a, java.lang.foreign.MemorySegment b, float epsilon)
    {
        try {return (int)MTD__aiMatrix4AreEqualEpsilon.invokeExact(a, b, epsilon);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiMatrix4Inverse;
    public static final java.lang.invoke.MethodHandle MTD__aiMatrix4Inverse;
    public static void aiMatrix4Inverse(java.lang.foreign.MemorySegment mat)
    {
        try {MTD__aiMatrix4Inverse.invokeExact(mat);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiMatrix4Determinant;
    public static final java.lang.invoke.MethodHandle MTD__aiMatrix4Determinant;
    public static float aiMatrix4Determinant(java.lang.foreign.MemorySegment mat)
    {
        try {return (float)MTD__aiMatrix4Determinant.invokeExact(mat);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiMatrix4IsIdentity;
    public static final java.lang.invoke.MethodHandle MTD__aiMatrix4IsIdentity;
    public static int aiMatrix4IsIdentity(java.lang.foreign.MemorySegment mat)
    {
        try {return (int)MTD__aiMatrix4IsIdentity.invokeExact(mat);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiMatrix4DecomposeIntoScalingEulerAnglesPosition;
    public static final java.lang.invoke.MethodHandle MTD__aiMatrix4DecomposeIntoScalingEulerAnglesPosition;
    public static void aiMatrix4DecomposeIntoScalingEulerAnglesPosition(java.lang.foreign.MemorySegment mat, java.lang.foreign.MemorySegment scaling, java.lang.foreign.MemorySegment rotation, java.lang.foreign.MemorySegment position)
    {
        try {MTD__aiMatrix4DecomposeIntoScalingEulerAnglesPosition.invokeExact(mat, scaling, rotation, position);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiMatrix4DecomposeIntoScalingAxisAnglePosition;
    public static final java.lang.invoke.MethodHandle MTD__aiMatrix4DecomposeIntoScalingAxisAnglePosition;
    public static void aiMatrix4DecomposeIntoScalingAxisAnglePosition(java.lang.foreign.MemorySegment mat, java.lang.foreign.MemorySegment scaling, java.lang.foreign.MemorySegment axis, java.lang.foreign.MemorySegment angle, java.lang.foreign.MemorySegment position)
    {
        try {MTD__aiMatrix4DecomposeIntoScalingAxisAnglePosition.invokeExact(mat, scaling, axis, angle, position);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiMatrix4DecomposeNoScaling;
    public static final java.lang.invoke.MethodHandle MTD__aiMatrix4DecomposeNoScaling;
    public static void aiMatrix4DecomposeNoScaling(java.lang.foreign.MemorySegment mat, java.lang.foreign.MemorySegment rotation, java.lang.foreign.MemorySegment position)
    {
        try {MTD__aiMatrix4DecomposeNoScaling.invokeExact(mat, rotation, position);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiMatrix4FromEulerAngles;
    public static final java.lang.invoke.MethodHandle MTD__aiMatrix4FromEulerAngles;
    public static void aiMatrix4FromEulerAngles(java.lang.foreign.MemorySegment mat, float x, float y, float z)
    {
        try {MTD__aiMatrix4FromEulerAngles.invokeExact(mat, x, y, z);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiMatrix4RotationX;
    public static final java.lang.invoke.MethodHandle MTD__aiMatrix4RotationX;
    public static void aiMatrix4RotationX(java.lang.foreign.MemorySegment mat, float angle)
    {
        try {MTD__aiMatrix4RotationX.invokeExact(mat, angle);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiMatrix4RotationY;
    public static final java.lang.invoke.MethodHandle MTD__aiMatrix4RotationY;
    public static void aiMatrix4RotationY(java.lang.foreign.MemorySegment mat, float angle)
    {
        try {MTD__aiMatrix4RotationY.invokeExact(mat, angle);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiMatrix4RotationZ;
    public static final java.lang.invoke.MethodHandle MTD__aiMatrix4RotationZ;
    public static void aiMatrix4RotationZ(java.lang.foreign.MemorySegment mat, float angle)
    {
        try {MTD__aiMatrix4RotationZ.invokeExact(mat, angle);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiMatrix4FromRotationAroundAxis;
    public static final java.lang.invoke.MethodHandle MTD__aiMatrix4FromRotationAroundAxis;
    public static void aiMatrix4FromRotationAroundAxis(java.lang.foreign.MemorySegment mat, java.lang.foreign.MemorySegment axis, float angle)
    {
        try {MTD__aiMatrix4FromRotationAroundAxis.invokeExact(mat, axis, angle);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiMatrix4Translation;
    public static final java.lang.invoke.MethodHandle MTD__aiMatrix4Translation;
    public static void aiMatrix4Translation(java.lang.foreign.MemorySegment mat, java.lang.foreign.MemorySegment translation)
    {
        try {MTD__aiMatrix4Translation.invokeExact(mat, translation);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiMatrix4Scaling;
    public static final java.lang.invoke.MethodHandle MTD__aiMatrix4Scaling;
    public static void aiMatrix4Scaling(java.lang.foreign.MemorySegment mat, java.lang.foreign.MemorySegment scaling)
    {
        try {MTD__aiMatrix4Scaling.invokeExact(mat, scaling);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiMatrix4FromTo;
    public static final java.lang.invoke.MethodHandle MTD__aiMatrix4FromTo;
    public static void aiMatrix4FromTo(java.lang.foreign.MemorySegment mat, java.lang.foreign.MemorySegment from, java.lang.foreign.MemorySegment to)
    {
        try {MTD__aiMatrix4FromTo.invokeExact(mat, from, to);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiQuaternionFromEulerAngles;
    public static final java.lang.invoke.MethodHandle MTD__aiQuaternionFromEulerAngles;
    public static void aiQuaternionFromEulerAngles(java.lang.foreign.MemorySegment q, float x, float y, float z)
    {
        try {MTD__aiQuaternionFromEulerAngles.invokeExact(q, x, y, z);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiQuaternionFromAxisAngle;
    public static final java.lang.invoke.MethodHandle MTD__aiQuaternionFromAxisAngle;
    public static void aiQuaternionFromAxisAngle(java.lang.foreign.MemorySegment q, java.lang.foreign.MemorySegment axis, float angle)
    {
        try {MTD__aiQuaternionFromAxisAngle.invokeExact(q, axis, angle);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiQuaternionFromNormalizedQuaternion;
    public static final java.lang.invoke.MethodHandle MTD__aiQuaternionFromNormalizedQuaternion;
    public static void aiQuaternionFromNormalizedQuaternion(java.lang.foreign.MemorySegment q, java.lang.foreign.MemorySegment normalized)
    {
        try {MTD__aiQuaternionFromNormalizedQuaternion.invokeExact(q, normalized);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiQuaternionAreEqual;
    public static final java.lang.invoke.MethodHandle MTD__aiQuaternionAreEqual;
    public static int aiQuaternionAreEqual(java.lang.foreign.MemorySegment a, java.lang.foreign.MemorySegment b)
    {
        try {return (int)MTD__aiQuaternionAreEqual.invokeExact(a, b);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiQuaternionAreEqualEpsilon;
    public static final java.lang.invoke.MethodHandle MTD__aiQuaternionAreEqualEpsilon;
    public static int aiQuaternionAreEqualEpsilon(java.lang.foreign.MemorySegment a, java.lang.foreign.MemorySegment b, float epsilon)
    {
        try {return (int)MTD__aiQuaternionAreEqualEpsilon.invokeExact(a, b, epsilon);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiQuaternionNormalize;
    public static final java.lang.invoke.MethodHandle MTD__aiQuaternionNormalize;
    public static void aiQuaternionNormalize(java.lang.foreign.MemorySegment q)
    {
        try {MTD__aiQuaternionNormalize.invokeExact(q);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiQuaternionConjugate;
    public static final java.lang.invoke.MethodHandle MTD__aiQuaternionConjugate;
    public static void aiQuaternionConjugate(java.lang.foreign.MemorySegment q)
    {
        try {MTD__aiQuaternionConjugate.invokeExact(q);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiQuaternionMultiply;
    public static final java.lang.invoke.MethodHandle MTD__aiQuaternionMultiply;
    public static void aiQuaternionMultiply(java.lang.foreign.MemorySegment dst, java.lang.foreign.MemorySegment q)
    {
        try {MTD__aiQuaternionMultiply.invokeExact(dst, q);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiQuaternionInterpolate;
    public static final java.lang.invoke.MethodHandle MTD__aiQuaternionInterpolate;
    public static void aiQuaternionInterpolate(java.lang.foreign.MemorySegment dst, java.lang.foreign.MemorySegment start, java.lang.foreign.MemorySegment end, float factor)
    {
        try {MTD__aiQuaternionInterpolate.invokeExact(dst, start, end, factor);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiTextureTypeToString;
    public static final java.lang.invoke.MethodHandle MTD__aiTextureTypeToString;
    public static java.lang.foreign.MemorySegment aiTextureTypeToString(int in)
    {
        try {return (java.lang.foreign.MemorySegment)MTD__aiTextureTypeToString.invokeExact(in);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiGetMaterialProperty;
    public static final java.lang.invoke.MethodHandle MTD__aiGetMaterialProperty;
    public static int aiGetMaterialProperty(java.lang.foreign.MemorySegment pMat, java.lang.foreign.MemorySegment pKey, int type, int index, java.lang.foreign.MemorySegment pPropOut)
    {
        try {return (int)MTD__aiGetMaterialProperty.invokeExact(pMat, pKey, type, index, pPropOut);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiGetMaterialFloatArray;
    public static final java.lang.invoke.MethodHandle MTD__aiGetMaterialFloatArray;
    public static int aiGetMaterialFloatArray(java.lang.foreign.MemorySegment pMat, java.lang.foreign.MemorySegment pKey, int type, int index, java.lang.foreign.MemorySegment pOut, java.lang.foreign.MemorySegment pMax)
    {
        try {return (int)MTD__aiGetMaterialFloatArray.invokeExact(pMat, pKey, type, index, pOut, pMax);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiGetMaterialIntegerArray;
    public static final java.lang.invoke.MethodHandle MTD__aiGetMaterialIntegerArray;
    public static int aiGetMaterialIntegerArray(java.lang.foreign.MemorySegment pMat, java.lang.foreign.MemorySegment pKey, int type, int index, java.lang.foreign.MemorySegment pOut, java.lang.foreign.MemorySegment pMax)
    {
        try {return (int)MTD__aiGetMaterialIntegerArray.invokeExact(pMat, pKey, type, index, pOut, pMax);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiGetMaterialColor;
    public static final java.lang.invoke.MethodHandle MTD__aiGetMaterialColor;
    public static int aiGetMaterialColor(java.lang.foreign.MemorySegment pMat, java.lang.foreign.MemorySegment pKey, int type, int index, java.lang.foreign.MemorySegment pOut)
    {
        try {return (int)MTD__aiGetMaterialColor.invokeExact(pMat, pKey, type, index, pOut);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiGetMaterialUVTransform;
    public static final java.lang.invoke.MethodHandle MTD__aiGetMaterialUVTransform;
    public static int aiGetMaterialUVTransform(java.lang.foreign.MemorySegment pMat, java.lang.foreign.MemorySegment pKey, int type, int index, java.lang.foreign.MemorySegment pOut)
    {
        try {return (int)MTD__aiGetMaterialUVTransform.invokeExact(pMat, pKey, type, index, pOut);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiGetMaterialString;
    public static final java.lang.invoke.MethodHandle MTD__aiGetMaterialString;
    public static int aiGetMaterialString(java.lang.foreign.MemorySegment pMat, java.lang.foreign.MemorySegment pKey, int type, int index, java.lang.foreign.MemorySegment pOut)
    {
        try {return (int)MTD__aiGetMaterialString.invokeExact(pMat, pKey, type, index, pOut);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiGetMaterialTextureCount;
    public static final java.lang.invoke.MethodHandle MTD__aiGetMaterialTextureCount;
    public static int aiGetMaterialTextureCount(java.lang.foreign.MemorySegment pMat, int type)
    {
        try {return (int)MTD__aiGetMaterialTextureCount.invokeExact(pMat, type);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__aiGetMaterialTexture;
    public static final java.lang.invoke.MethodHandle MTD__aiGetMaterialTexture;
    public static int aiGetMaterialTexture(java.lang.foreign.MemorySegment mat, int type, int index, java.lang.foreign.MemorySegment path, java.lang.foreign.MemorySegment mapping, java.lang.foreign.MemorySegment uvindex, java.lang.foreign.MemorySegment blend, java.lang.foreign.MemorySegment op, java.lang.foreign.MemorySegment mapmode, java.lang.foreign.MemorySegment flags)
    {
        try {return (int)MTD__aiGetMaterialTexture.invokeExact(mat, type, index, path, mapping, uvindex, blend, op, mapmode, flags);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    static
    {
        java.lang.foreign.SymbolLookup lookup = name -> java.lang.foreign.SymbolLookup.loaderLookup().find(name).or(() -> jpgen.NativeTypes.SYSTEM_LINKER.defaultLookup().find(name));

        MTD_ADDRESS__aiGetImporterDesc = lookup.find("aiGetImporterDesc").orElseThrow();
        MTD__aiGetImporterDesc = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiGetImporterDesc, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__aiImportFile = lookup.find("aiImportFile").orElseThrow();
        MTD__aiImportFile = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiImportFile, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__aiImportFileEx = lookup.find("aiImportFileEx").orElseThrow();
        MTD__aiImportFileEx = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiImportFileEx, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__aiImportFileExWithProperties = lookup.find("aiImportFileExWithProperties").orElseThrow();
        MTD__aiImportFileExWithProperties = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiImportFileExWithProperties, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__aiImportFileFromMemory = lookup.find("aiImportFileFromMemory").orElseThrow();
        MTD__aiImportFileFromMemory = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiImportFileFromMemory, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__aiImportFileFromMemoryWithProperties = lookup.find("aiImportFileFromMemoryWithProperties").orElseThrow();
        MTD__aiImportFileFromMemoryWithProperties = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiImportFileFromMemoryWithProperties, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__aiApplyPostProcessing = lookup.find("aiApplyPostProcessing").orElseThrow();
        MTD__aiApplyPostProcessing = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiApplyPostProcessing, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__aiGetPredefinedLogStream = lookup.find("aiGetPredefinedLogStream").orElseThrow();
        MTD__aiGetPredefinedLogStream = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiGetPredefinedLogStream, java.lang.foreign.FunctionDescriptor.of(assimp.aiLogStream.gRecordLayout, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__aiAttachLogStream = lookup.find("aiAttachLogStream").orElseThrow();
        MTD__aiAttachLogStream = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiAttachLogStream, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__aiEnableVerboseLogging = lookup.find("aiEnableVerboseLogging").orElseThrow();
        MTD__aiEnableVerboseLogging = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiEnableVerboseLogging, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__aiDetachLogStream = lookup.find("aiDetachLogStream").orElseThrow();
        MTD__aiDetachLogStream = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiDetachLogStream, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__aiDetachAllLogStreams = lookup.find("aiDetachAllLogStreams").orElseThrow();
        MTD__aiDetachAllLogStreams = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiDetachAllLogStreams, java.lang.foreign.FunctionDescriptor.ofVoid());
        MTD_ADDRESS__aiReleaseImport = lookup.find("aiReleaseImport").orElseThrow();
        MTD__aiReleaseImport = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiReleaseImport, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__aiGetErrorString = lookup.find("aiGetErrorString").orElseThrow();
        MTD__aiGetErrorString = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiGetErrorString, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__aiIsExtensionSupported = lookup.find("aiIsExtensionSupported").orElseThrow();
        MTD__aiIsExtensionSupported = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiIsExtensionSupported, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__aiGetExtensionList = lookup.find("aiGetExtensionList").orElseThrow();
        MTD__aiGetExtensionList = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiGetExtensionList, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__aiGetMemoryRequirements = lookup.find("aiGetMemoryRequirements").orElseThrow();
        MTD__aiGetMemoryRequirements = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiGetMemoryRequirements, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__aiCreatePropertyStore = lookup.find("aiCreatePropertyStore").orElseThrow();
        MTD__aiCreatePropertyStore = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiCreatePropertyStore, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__aiReleasePropertyStore = lookup.find("aiReleasePropertyStore").orElseThrow();
        MTD__aiReleasePropertyStore = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiReleasePropertyStore, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__aiSetImportPropertyInteger = lookup.find("aiSetImportPropertyInteger").orElseThrow();
        MTD__aiSetImportPropertyInteger = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiSetImportPropertyInteger, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__aiSetImportPropertyFloat = lookup.find("aiSetImportPropertyFloat").orElseThrow();
        MTD__aiSetImportPropertyFloat = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiSetImportPropertyFloat, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS__aiSetImportPropertyString = lookup.find("aiSetImportPropertyString").orElseThrow();
        MTD__aiSetImportPropertyString = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiSetImportPropertyString, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__aiSetImportPropertyMatrix = lookup.find("aiSetImportPropertyMatrix").orElseThrow();
        MTD__aiSetImportPropertyMatrix = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiSetImportPropertyMatrix, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__aiCreateQuaternionFromMatrix = lookup.find("aiCreateQuaternionFromMatrix").orElseThrow();
        MTD__aiCreateQuaternionFromMatrix = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiCreateQuaternionFromMatrix, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__aiDecomposeMatrix = lookup.find("aiDecomposeMatrix").orElseThrow();
        MTD__aiDecomposeMatrix = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiDecomposeMatrix, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__aiTransposeMatrix4 = lookup.find("aiTransposeMatrix4").orElseThrow();
        MTD__aiTransposeMatrix4 = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiTransposeMatrix4, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__aiTransposeMatrix3 = lookup.find("aiTransposeMatrix3").orElseThrow();
        MTD__aiTransposeMatrix3 = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiTransposeMatrix3, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__aiTransformVecByMatrix3 = lookup.find("aiTransformVecByMatrix3").orElseThrow();
        MTD__aiTransformVecByMatrix3 = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiTransformVecByMatrix3, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__aiTransformVecByMatrix4 = lookup.find("aiTransformVecByMatrix4").orElseThrow();
        MTD__aiTransformVecByMatrix4 = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiTransformVecByMatrix4, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__aiMultiplyMatrix4 = lookup.find("aiMultiplyMatrix4").orElseThrow();
        MTD__aiMultiplyMatrix4 = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiMultiplyMatrix4, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__aiMultiplyMatrix3 = lookup.find("aiMultiplyMatrix3").orElseThrow();
        MTD__aiMultiplyMatrix3 = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiMultiplyMatrix3, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__aiIdentityMatrix3 = lookup.find("aiIdentityMatrix3").orElseThrow();
        MTD__aiIdentityMatrix3 = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiIdentityMatrix3, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__aiIdentityMatrix4 = lookup.find("aiIdentityMatrix4").orElseThrow();
        MTD__aiIdentityMatrix4 = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiIdentityMatrix4, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__aiGetImportFormatCount = lookup.find("aiGetImportFormatCount").orElseThrow();
        MTD__aiGetImportFormatCount = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiGetImportFormatCount, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_LONG));
        MTD_ADDRESS__aiGetImportFormatDescription = lookup.find("aiGetImportFormatDescription").orElseThrow();
        MTD__aiGetImportFormatDescription = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiGetImportFormatDescription, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_LONG));
        MTD_ADDRESS__aiVector2AreEqual = lookup.find("aiVector2AreEqual").orElseThrow();
        MTD__aiVector2AreEqual = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiVector2AreEqual, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__aiVector2AreEqualEpsilon = lookup.find("aiVector2AreEqualEpsilon").orElseThrow();
        MTD__aiVector2AreEqualEpsilon = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiVector2AreEqualEpsilon, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS__aiVector2Add = lookup.find("aiVector2Add").orElseThrow();
        MTD__aiVector2Add = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiVector2Add, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__aiVector2Subtract = lookup.find("aiVector2Subtract").orElseThrow();
        MTD__aiVector2Subtract = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiVector2Subtract, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__aiVector2Scale = lookup.find("aiVector2Scale").orElseThrow();
        MTD__aiVector2Scale = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiVector2Scale, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS__aiVector2SymMul = lookup.find("aiVector2SymMul").orElseThrow();
        MTD__aiVector2SymMul = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiVector2SymMul, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__aiVector2DivideByScalar = lookup.find("aiVector2DivideByScalar").orElseThrow();
        MTD__aiVector2DivideByScalar = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiVector2DivideByScalar, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS__aiVector2DivideByVector = lookup.find("aiVector2DivideByVector").orElseThrow();
        MTD__aiVector2DivideByVector = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiVector2DivideByVector, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__aiVector2Length = lookup.find("aiVector2Length").orElseThrow();
        MTD__aiVector2Length = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiVector2Length, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_FLOAT, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__aiVector2SquareLength = lookup.find("aiVector2SquareLength").orElseThrow();
        MTD__aiVector2SquareLength = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiVector2SquareLength, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_FLOAT, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__aiVector2Negate = lookup.find("aiVector2Negate").orElseThrow();
        MTD__aiVector2Negate = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiVector2Negate, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__aiVector2DotProduct = lookup.find("aiVector2DotProduct").orElseThrow();
        MTD__aiVector2DotProduct = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiVector2DotProduct, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_FLOAT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__aiVector2Normalize = lookup.find("aiVector2Normalize").orElseThrow();
        MTD__aiVector2Normalize = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiVector2Normalize, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__aiVector3AreEqual = lookup.find("aiVector3AreEqual").orElseThrow();
        MTD__aiVector3AreEqual = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiVector3AreEqual, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__aiVector3AreEqualEpsilon = lookup.find("aiVector3AreEqualEpsilon").orElseThrow();
        MTD__aiVector3AreEqualEpsilon = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiVector3AreEqualEpsilon, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS__aiVector3LessThan = lookup.find("aiVector3LessThan").orElseThrow();
        MTD__aiVector3LessThan = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiVector3LessThan, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__aiVector3Add = lookup.find("aiVector3Add").orElseThrow();
        MTD__aiVector3Add = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiVector3Add, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__aiVector3Subtract = lookup.find("aiVector3Subtract").orElseThrow();
        MTD__aiVector3Subtract = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiVector3Subtract, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__aiVector3Scale = lookup.find("aiVector3Scale").orElseThrow();
        MTD__aiVector3Scale = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiVector3Scale, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS__aiVector3SymMul = lookup.find("aiVector3SymMul").orElseThrow();
        MTD__aiVector3SymMul = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiVector3SymMul, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__aiVector3DivideByScalar = lookup.find("aiVector3DivideByScalar").orElseThrow();
        MTD__aiVector3DivideByScalar = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiVector3DivideByScalar, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS__aiVector3DivideByVector = lookup.find("aiVector3DivideByVector").orElseThrow();
        MTD__aiVector3DivideByVector = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiVector3DivideByVector, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__aiVector3Length = lookup.find("aiVector3Length").orElseThrow();
        MTD__aiVector3Length = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiVector3Length, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_FLOAT, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__aiVector3SquareLength = lookup.find("aiVector3SquareLength").orElseThrow();
        MTD__aiVector3SquareLength = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiVector3SquareLength, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_FLOAT, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__aiVector3Negate = lookup.find("aiVector3Negate").orElseThrow();
        MTD__aiVector3Negate = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiVector3Negate, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__aiVector3DotProduct = lookup.find("aiVector3DotProduct").orElseThrow();
        MTD__aiVector3DotProduct = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiVector3DotProduct, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_FLOAT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__aiVector3CrossProduct = lookup.find("aiVector3CrossProduct").orElseThrow();
        MTD__aiVector3CrossProduct = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiVector3CrossProduct, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__aiVector3Normalize = lookup.find("aiVector3Normalize").orElseThrow();
        MTD__aiVector3Normalize = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiVector3Normalize, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__aiVector3NormalizeSafe = lookup.find("aiVector3NormalizeSafe").orElseThrow();
        MTD__aiVector3NormalizeSafe = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiVector3NormalizeSafe, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__aiVector3RotateByQuaternion = lookup.find("aiVector3RotateByQuaternion").orElseThrow();
        MTD__aiVector3RotateByQuaternion = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiVector3RotateByQuaternion, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__aiMatrix3FromMatrix4 = lookup.find("aiMatrix3FromMatrix4").orElseThrow();
        MTD__aiMatrix3FromMatrix4 = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiMatrix3FromMatrix4, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__aiMatrix3FromQuaternion = lookup.find("aiMatrix3FromQuaternion").orElseThrow();
        MTD__aiMatrix3FromQuaternion = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiMatrix3FromQuaternion, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__aiMatrix3AreEqual = lookup.find("aiMatrix3AreEqual").orElseThrow();
        MTD__aiMatrix3AreEqual = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiMatrix3AreEqual, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__aiMatrix3AreEqualEpsilon = lookup.find("aiMatrix3AreEqualEpsilon").orElseThrow();
        MTD__aiMatrix3AreEqualEpsilon = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiMatrix3AreEqualEpsilon, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS__aiMatrix3Inverse = lookup.find("aiMatrix3Inverse").orElseThrow();
        MTD__aiMatrix3Inverse = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiMatrix3Inverse, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__aiMatrix3Determinant = lookup.find("aiMatrix3Determinant").orElseThrow();
        MTD__aiMatrix3Determinant = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiMatrix3Determinant, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_FLOAT, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__aiMatrix3RotationZ = lookup.find("aiMatrix3RotationZ").orElseThrow();
        MTD__aiMatrix3RotationZ = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiMatrix3RotationZ, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS__aiMatrix3FromRotationAroundAxis = lookup.find("aiMatrix3FromRotationAroundAxis").orElseThrow();
        MTD__aiMatrix3FromRotationAroundAxis = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiMatrix3FromRotationAroundAxis, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS__aiMatrix3Translation = lookup.find("aiMatrix3Translation").orElseThrow();
        MTD__aiMatrix3Translation = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiMatrix3Translation, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__aiMatrix3FromTo = lookup.find("aiMatrix3FromTo").orElseThrow();
        MTD__aiMatrix3FromTo = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiMatrix3FromTo, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__aiMatrix4FromMatrix3 = lookup.find("aiMatrix4FromMatrix3").orElseThrow();
        MTD__aiMatrix4FromMatrix3 = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiMatrix4FromMatrix3, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__aiMatrix4FromScalingQuaternionPosition = lookup.find("aiMatrix4FromScalingQuaternionPosition").orElseThrow();
        MTD__aiMatrix4FromScalingQuaternionPosition = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiMatrix4FromScalingQuaternionPosition, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__aiMatrix4Add = lookup.find("aiMatrix4Add").orElseThrow();
        MTD__aiMatrix4Add = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiMatrix4Add, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__aiMatrix4AreEqual = lookup.find("aiMatrix4AreEqual").orElseThrow();
        MTD__aiMatrix4AreEqual = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiMatrix4AreEqual, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__aiMatrix4AreEqualEpsilon = lookup.find("aiMatrix4AreEqualEpsilon").orElseThrow();
        MTD__aiMatrix4AreEqualEpsilon = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiMatrix4AreEqualEpsilon, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS__aiMatrix4Inverse = lookup.find("aiMatrix4Inverse").orElseThrow();
        MTD__aiMatrix4Inverse = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiMatrix4Inverse, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__aiMatrix4Determinant = lookup.find("aiMatrix4Determinant").orElseThrow();
        MTD__aiMatrix4Determinant = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiMatrix4Determinant, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_FLOAT, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__aiMatrix4IsIdentity = lookup.find("aiMatrix4IsIdentity").orElseThrow();
        MTD__aiMatrix4IsIdentity = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiMatrix4IsIdentity, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__aiMatrix4DecomposeIntoScalingEulerAnglesPosition = lookup.find("aiMatrix4DecomposeIntoScalingEulerAnglesPosition").orElseThrow();
        MTD__aiMatrix4DecomposeIntoScalingEulerAnglesPosition = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiMatrix4DecomposeIntoScalingEulerAnglesPosition, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__aiMatrix4DecomposeIntoScalingAxisAnglePosition = lookup.find("aiMatrix4DecomposeIntoScalingAxisAnglePosition").orElseThrow();
        MTD__aiMatrix4DecomposeIntoScalingAxisAnglePosition = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiMatrix4DecomposeIntoScalingAxisAnglePosition, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__aiMatrix4DecomposeNoScaling = lookup.find("aiMatrix4DecomposeNoScaling").orElseThrow();
        MTD__aiMatrix4DecomposeNoScaling = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiMatrix4DecomposeNoScaling, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__aiMatrix4FromEulerAngles = lookup.find("aiMatrix4FromEulerAngles").orElseThrow();
        MTD__aiMatrix4FromEulerAngles = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiMatrix4FromEulerAngles, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS__aiMatrix4RotationX = lookup.find("aiMatrix4RotationX").orElseThrow();
        MTD__aiMatrix4RotationX = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiMatrix4RotationX, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS__aiMatrix4RotationY = lookup.find("aiMatrix4RotationY").orElseThrow();
        MTD__aiMatrix4RotationY = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiMatrix4RotationY, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS__aiMatrix4RotationZ = lookup.find("aiMatrix4RotationZ").orElseThrow();
        MTD__aiMatrix4RotationZ = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiMatrix4RotationZ, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS__aiMatrix4FromRotationAroundAxis = lookup.find("aiMatrix4FromRotationAroundAxis").orElseThrow();
        MTD__aiMatrix4FromRotationAroundAxis = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiMatrix4FromRotationAroundAxis, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS__aiMatrix4Translation = lookup.find("aiMatrix4Translation").orElseThrow();
        MTD__aiMatrix4Translation = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiMatrix4Translation, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__aiMatrix4Scaling = lookup.find("aiMatrix4Scaling").orElseThrow();
        MTD__aiMatrix4Scaling = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiMatrix4Scaling, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__aiMatrix4FromTo = lookup.find("aiMatrix4FromTo").orElseThrow();
        MTD__aiMatrix4FromTo = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiMatrix4FromTo, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__aiQuaternionFromEulerAngles = lookup.find("aiQuaternionFromEulerAngles").orElseThrow();
        MTD__aiQuaternionFromEulerAngles = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiQuaternionFromEulerAngles, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS__aiQuaternionFromAxisAngle = lookup.find("aiQuaternionFromAxisAngle").orElseThrow();
        MTD__aiQuaternionFromAxisAngle = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiQuaternionFromAxisAngle, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS__aiQuaternionFromNormalizedQuaternion = lookup.find("aiQuaternionFromNormalizedQuaternion").orElseThrow();
        MTD__aiQuaternionFromNormalizedQuaternion = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiQuaternionFromNormalizedQuaternion, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__aiQuaternionAreEqual = lookup.find("aiQuaternionAreEqual").orElseThrow();
        MTD__aiQuaternionAreEqual = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiQuaternionAreEqual, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__aiQuaternionAreEqualEpsilon = lookup.find("aiQuaternionAreEqualEpsilon").orElseThrow();
        MTD__aiQuaternionAreEqualEpsilon = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiQuaternionAreEqualEpsilon, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS__aiQuaternionNormalize = lookup.find("aiQuaternionNormalize").orElseThrow();
        MTD__aiQuaternionNormalize = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiQuaternionNormalize, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__aiQuaternionConjugate = lookup.find("aiQuaternionConjugate").orElseThrow();
        MTD__aiQuaternionConjugate = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiQuaternionConjugate, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__aiQuaternionMultiply = lookup.find("aiQuaternionMultiply").orElseThrow();
        MTD__aiQuaternionMultiply = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiQuaternionMultiply, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__aiQuaternionInterpolate = lookup.find("aiQuaternionInterpolate").orElseThrow();
        MTD__aiQuaternionInterpolate = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiQuaternionInterpolate, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS__aiTextureTypeToString = lookup.find("aiTextureTypeToString").orElseThrow();
        MTD__aiTextureTypeToString = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiTextureTypeToString, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__aiGetMaterialProperty = lookup.find("aiGetMaterialProperty").orElseThrow();
        MTD__aiGetMaterialProperty = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiGetMaterialProperty, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__aiGetMaterialFloatArray = lookup.find("aiGetMaterialFloatArray").orElseThrow();
        MTD__aiGetMaterialFloatArray = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiGetMaterialFloatArray, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__aiGetMaterialIntegerArray = lookup.find("aiGetMaterialIntegerArray").orElseThrow();
        MTD__aiGetMaterialIntegerArray = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiGetMaterialIntegerArray, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__aiGetMaterialColor = lookup.find("aiGetMaterialColor").orElseThrow();
        MTD__aiGetMaterialColor = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiGetMaterialColor, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__aiGetMaterialUVTransform = lookup.find("aiGetMaterialUVTransform").orElseThrow();
        MTD__aiGetMaterialUVTransform = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiGetMaterialUVTransform, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__aiGetMaterialString = lookup.find("aiGetMaterialString").orElseThrow();
        MTD__aiGetMaterialString = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiGetMaterialString, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__aiGetMaterialTextureCount = lookup.find("aiGetMaterialTextureCount").orElseThrow();
        MTD__aiGetMaterialTextureCount = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiGetMaterialTextureCount, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__aiGetMaterialTexture = lookup.find("aiGetMaterialTexture").orElseThrow();
        MTD__aiGetMaterialTexture = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__aiGetMaterialTexture, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
    }
}
