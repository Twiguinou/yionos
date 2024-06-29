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

    public static void computeRelative(Transform transform1, Transform transform2, Transform dest)
    {
        Quaterniond conjugate = transform1.rotation.conjugate(new Quaterniond());

        transform2.position.sub(transform1.position, dest.position);
        dest.position.rotate(conjugate);
        conjugate.mul(transform2.rotation, dest.rotation);
    }

    public static void computeInverse(Transform transform, Transform dest)
    {
        transform.rotation.conjugate(dest.rotation);
        transform.position.negate(dest.position).rotate(dest.rotation);
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
        return String.format("Transform[pos:%s, rot:%s]", this.position, this.rotation);
    }
}
