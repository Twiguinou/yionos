package yionos.demo.app.data;

import assimp.aiFace;
import assimp.aiMesh;
import assimp.aiScene;
import assimp.aiVector3D;
import jpgen.NativeTypes;
import org.joml.Vector3f;
import org.joml.Vector3i;

import java.io.File;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

import static assimp.Assimp.*;
import static assimp.aiPostProcessSteps.*;
import static java.lang.foreign.MemorySegment.NULL;

public class OBJLoader
{
    public static OBJModel parseGeometry(File workingDirectory, File mainFile)
    {
        try (Arena arena = Arena.ofConfined())
        {
            int flags = aiProcess_GenNormals | aiProcess_GenSmoothNormals | aiProcess_CalcTangentSpace | aiProcess_ImproveCacheLocality | aiProcess_OptimizeMeshes | aiProcess_FixInfacingNormals
                    | aiProcess_FindDegenerates | aiProcess_FindInvalidData | aiProcess_GenUVCoords | aiProcess_TransformUVCoords | aiProcess_JoinIdenticalVertices | aiProcess_Triangulate | aiProcess_FlipUVs;

            aiScene scene = new aiScene(aiImportFile(arena.allocateUtf8String(mainFile.getAbsolutePath()), flags).reinterpret(aiScene.gStructLayout.byteSize()));
            if (scene.ptr().equals(NULL) || (scene.mFlags() & AI_SCENE_FLAGS_INCOMPLETE) != 0 || scene.mRootNode().equals(NULL))
            {
                String error = aiGetErrorString().reinterpret(NativeTypes.UNCHECKED_CHAR_PTR.byteSize()).getUtf8String(0);
                throw new IllegalStateException(STR."Failed to load model properly using Assimp: \{error}");
            }

            OBJModel.Mesh[] meshes = new OBJModel.Mesh[scene.mNumMeshes()];

            MemorySegment pMeshes = scene.mMeshes().reinterpret(ValueLayout.ADDRESS.byteSize() * meshes.length);
            for (int i = 0; i < meshes.length; i++)
            {
                aiMesh mesh = new aiMesh(pMeshes.getAtIndex(ValueLayout.ADDRESS, i).reinterpret(aiMesh.gStructLayout.byteSize()));

                Vector3f[] vertices = new Vector3f[mesh.mNumVertices()];
                Vector3f[] normals = new Vector3f[mesh.mNumVertices()];
                Vector3i[] faces = new Vector3i[mesh.mNumFaces()];

                MemorySegment pVertices = mesh.mVertices().reinterpret(aiVector3D.gStructLayout.byteSize() * vertices.length);
                MemorySegment pNormals = mesh.mNormals().reinterpret(aiVector3D.gStructLayout.byteSize() * normals.length);
                MemorySegment pFaces = mesh.mFaces().reinterpret(aiFace.gStructLayout.byteSize() * faces.length);

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
                    MemorySegment pIndices = face.mIndices().reinterpret(ValueLayout.JAVA_INT.byteSize() * 3);

                    faces[j] = new Vector3i(pIndices.getAtIndex(ValueLayout.JAVA_INT, 0), pIndices.getAtIndex(ValueLayout.JAVA_INT, 1), pIndices.getAtIndex(ValueLayout.JAVA_INT, 2));
                }

                meshes[i] = new OBJModel.Mesh(vertices, normals, faces);
            }

            aiReleaseImport(scene.ptr());
            return new OBJModel(meshes);
        }
    }
}
