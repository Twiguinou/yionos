package assimp;

public final class aiPostProcessSteps
{private aiPostProcessSteps() {}

    public static final int aiProcess_CalcTangentSpace = 1;
    public static final int aiProcess_JoinIdenticalVertices = 2;
    public static final int aiProcess_MakeLeftHanded = 4;
    public static final int aiProcess_Triangulate = 8;
    public static final int aiProcess_RemoveComponent = 16;
    public static final int aiProcess_GenNormals = 32;
    public static final int aiProcess_GenSmoothNormals = 64;
    public static final int aiProcess_SplitLargeMeshes = 128;
    public static final int aiProcess_PreTransformVertices = 256;
    public static final int aiProcess_LimitBoneWeights = 512;
    public static final int aiProcess_ValidateDataStructure = 1024;
    public static final int aiProcess_ImproveCacheLocality = 2048;
    public static final int aiProcess_RemoveRedundantMaterials = 4096;
    public static final int aiProcess_FixInfacingNormals = 8192;
    public static final int aiProcess_PopulateArmatureData = 16384;
    public static final int aiProcess_SortByPType = 32768;
    public static final int aiProcess_FindDegenerates = 65536;
    public static final int aiProcess_FindInvalidData = 131072;
    public static final int aiProcess_GenUVCoords = 262144;
    public static final int aiProcess_TransformUVCoords = 524288;
    public static final int aiProcess_FindInstances = 1048576;
    public static final int aiProcess_OptimizeMeshes = 2097152;
    public static final int aiProcess_OptimizeGraph = 4194304;
    public static final int aiProcess_FlipUVs = 8388608;
    public static final int aiProcess_FlipWindingOrder = 16777216;
    public static final int aiProcess_SplitByBoneCount = 33554432;
    public static final int aiProcess_Debone = 67108864;
    public static final int aiProcess_GlobalScale = 134217728;
    public static final int aiProcess_EmbedTextures = 268435456;
    public static final int aiProcess_ForceGenNormals = 536870912;
    public static final int aiProcess_DropNormals = 1073741824;
    public static final int aiProcess_GenBoundingBoxes = -2147483648;
}
