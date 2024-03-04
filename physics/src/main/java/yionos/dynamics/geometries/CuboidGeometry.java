package yionos.dynamics.geometries;

import org.joml.Matrix3d;
import org.joml.Quaterniond;
import org.joml.Vector3d;

public record CuboidGeometry(Vector3d halfExtents) implements RigidGeometry
{
    @Override
    public void computeBoundingBox(Quaterniond rotation, Vector3d min, Vector3d max)
    {
        Matrix3d rotationMatrix = new Matrix3d();
        rotationMatrix.rotation(rotation);

        this.halfExtents.mul(rotationMatrix, max);
        max.absolute();

        max.negate(min);
    }

    @Override
    public void computeInertiaTensor(double mass, Matrix3d inertiaTensor)
    {
        inertiaTensor.zero();

        double i = 3.0 / mass;

        double he2_x = this.halfExtents.x * this.halfExtents.x;
        double he2_y = this.halfExtents.y * this.halfExtents.y;
        double he2_z = this.halfExtents.z * this.halfExtents.z;

        inertiaTensor.m00 = i / (he2_y + he2_z);
        inertiaTensor.m11 = i / (he2_x + he2_z);
        inertiaTensor.m22 = i / (he2_x + he2_y);
    }
}
