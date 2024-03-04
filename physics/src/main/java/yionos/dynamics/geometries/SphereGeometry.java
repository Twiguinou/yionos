package yionos.dynamics.geometries;

import org.joml.Matrix3d;
import org.joml.Quaterniond;
import org.joml.Vector3d;

public record SphereGeometry(double radius, double radiusSquared) implements RigidGeometry
{
    public SphereGeometry(double radius)
    {
        this(radius, radius * radius);
    }

    @Override
    public void computeBoundingBox(Quaterniond rotation, Vector3d min, Vector3d max)
    {
        min.set(-this.radius);
        max.set(this.radius);
    }

    @Override
    public void computeInertiaTensor(double mass, Matrix3d inertiaTensor)
    {
        inertiaTensor.zero();
        double i = mass * this.radiusSquared * 0.4;
        inertiaTensor.m00 = i;
        inertiaTensor.m11 = i;
        inertiaTensor.m22 = i;
    }
}
