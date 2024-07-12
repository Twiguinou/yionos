package yionos.demo.app.data;

import assimp.*;
import jpgen.NativeTypes;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.joml.Vector3f;
import org.joml.Vector3i;

import java.io.IOException;
import java.io.InputStream;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import static assimp.Assimp.*;
import static assimp.aiOrigin.*;
import static assimp.aiReturn.*;
import static assimp.aiPostProcessSteps.*;
import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemorySegment.NULL;

public record OBJLoader(String workingDirectory, int flags)
{
    private static final Logger gLoaderLogger = LogManager.getLogger("Model Loader");

    public OBJLoader(String workingDirectory)
    {
        this(workingDirectory, aiProcess_GenNormals | aiProcess_GenSmoothNormals | aiProcess_CalcTangentSpace | aiProcess_ImproveCacheLocality | aiProcess_OptimizeMeshes | aiProcess_FixInfacingNormals
                | aiProcess_FindDegenerates | aiProcess_FindInvalidData | aiProcess_GenUVCoords | aiProcess_TransformUVCoords | aiProcess_JoinIdenticalVertices | aiProcess_Triangulate | aiProcess_FlipUVs);
    }

    private aiFileIO createIoReadingProvider(Arena arena)
    {
        Map<Long, Arena> fileArenas = new HashMap<>();
        aiFileIO ioProvider = new aiFileIO(arena);

        ioProvider.OpenProc(((aiFileOpenProc) (_, cPath, _) ->
        {
            Arena fileArena = Arena.ofConfined();
            String path = cPath.getString(0);
            try (InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream(String.format("%s/%s", this.workingDirectory, path)))
            {
                if (inputStream == null)
                {
                    throw new RuntimeException(String.format("Failed to access resource: %s", path));
                }

                MemorySegment data = fileArena.allocateFrom(JAVA_BYTE, inputStream.readAllBytes());
                AtomicLong filePosition = new AtomicLong(0);

                aiFile file = new aiFile(fileArena);
                file.FileSizeProc(((aiFileTellProc) _ -> data.byteSize()).makeHandle(fileArena));
                file.TellProc(((aiFileTellProc) _ -> filePosition.get()).makeHandle(fileArena));
                file.SeekProc(((aiFileSeek) (_, offset, origin) ->
                {
                    long currentPosition = filePosition.get();

                    long newPosition = switch (origin)
                    {
                        case aiOrigin_SET -> offset;
                        case aiOrigin_CUR, aiOrigin_END -> currentPosition + offset;
                        default -> -1;
                    };

                    if (newPosition < 0 || newPosition >= data.byteSize())
                    {
                        return aiReturn_FAILURE;
                    }

                    filePosition.set(newPosition);
                    return aiReturn_SUCCESS;
                }).makeHandle(fileArena));
                file.ReadProc(((aiFileReadProc) (_, buffer, size, count) ->
                {
                    MemorySegment writableBuffer = buffer.reinterpret(size * count);

                    long numRegions = Math.min((data.byteSize() - filePosition.get()) / size, count);
                    long bytes = numRegions * size;

                    MemorySegment.copy(data, filePosition.get(), writableBuffer, 0, bytes);
                    filePosition.addAndGet(bytes);

                    return numRegions;
                }).makeHandle(fileArena));
                file.UserData(data);

                fileArenas.put(data.address(), fileArena);

                return file.ptr();
            }
            catch (IOException e)
            {
                fileArena.close();
                gLoaderLogger.error(e);
                return NULL;
            }
        }).makeHandle(arena));

        ioProvider.CloseProc(((aiFileCloseProc) (_, pFile) ->
        {
            aiFile file = new aiFile(pFile);
            fileArenas.get(file.UserData().address()).close();
        }).makeHandle(arena));

        return ioProvider;
    }

    public OBJModel parseGeometry(String mainFile)
    {
        try (Arena arena = Arena.ofConfined())
        {
            aiFileIO ioProvider = createIoReadingProvider(arena);

            aiScene scene = new aiScene(aiImportFileEx(arena.allocateFrom(mainFile), this.flags, ioProvider.ptr()));
            if (scene.ptr().equals(NULL) || (scene.mFlags() & AI_SCENE_FLAGS_INCOMPLETE) != 0 || scene.mRootNode().equals(NULL))
            {
                String error = aiGetErrorString().getString(0);
                throw new IllegalStateException(String.format("Failed to load model properly using Assimp: %s", error));
            }

            OBJModel.Mesh[] meshes = new OBJModel.Mesh[scene.mNumMeshes()];

            MemorySegment pMeshes = scene.mMeshes();
            for (int i = 0; i < meshes.length; i++)
            {
                aiMesh mesh = new aiMesh(pMeshes.getAtIndex(NativeTypes.UNBOUNDED_POINTER, i));

                Vector3f[] vertices = new Vector3f[mesh.mNumVertices()];
                Vector3f[] normals = new Vector3f[mesh.mNumVertices()];
                Vector3i[] faces = new Vector3i[mesh.mNumFaces()];

                MemorySegment pVertices = mesh.mVertices();
                MemorySegment pNormals = mesh.mNormals();
                MemorySegment pFaces = mesh.mFaces();

                for (int j = 0; j < vertices.length; j++)
                {
                    aiVector3D vertex = aiVector3D.getAtIndex(pVertices, j);
                    vertices[j] = new Vector3f(vertex.x(), vertex.y(), vertex.z());

                    aiVector3D normal = aiVector3D.getAtIndex(pNormals, j);
                    normals[j] = new Vector3f(normal.x(), normal.y(), normal.z());
                }

                for (int j = 0; j < faces.length; j++)
                {
                    aiFace face = aiFace.getAtIndex(pFaces, j);
                    assert face.mNumIndices() == 3;
                    MemorySegment pIndices = face.mIndices().reinterpret(JAVA_INT.byteSize() * 3);

                    faces[j] = new Vector3i(pIndices.getAtIndex(JAVA_INT, 0), pIndices.getAtIndex(JAVA_INT, 1), pIndices.getAtIndex(JAVA_INT, 2));
                }

                meshes[i] = new OBJModel.Mesh(vertices, normals, faces);
            }

            aiReleaseImport(scene.ptr());
            return new OBJModel(meshes);
        }
    }
}
