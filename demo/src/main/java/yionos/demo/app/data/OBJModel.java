package yionos.demo.app.data;

import org.joml.Vector3f;
import org.joml.Vector3i;

public record OBJModel(Mesh[] meshes)
{
    public record Mesh(Vector3f[] vertices, Vector3f[] normals, Vector3i[] faces) {}
}
