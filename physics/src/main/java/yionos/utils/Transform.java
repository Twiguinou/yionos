package yionos.utils;

import org.joml.Matrix4d;
import org.joml.Quaterniond;
import org.joml.Vector3d;

public record Transform(Vector3d position, Quaterniond rotation)
{
    public Transform()
    {
        this(new Vector3d(), new Quaterniond());
    }

    public void computeModelMatrix(Matrix4d modelMatrix)
    {
        modelMatrix.translationRotate(this.position, this.rotation);
    }

    public void set(Transform transform)
    {
        this.position.set(transform.position);
        this.rotation.set(transform.rotation);
    }

    @Override
    public String toString()
    {
        return STR."Transform[pos:\{this.position}, rot:\{this.rotation}]";
    }
}
