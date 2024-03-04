package yionos.dynamics.geometries;

import org.joml.Matrix3d;
import org.joml.Quaterniond;
import org.joml.Vector3d;

import static yionos.utils.MathDefinitions.*;

public record ConvexHullGeometry(Vector3d[] vertices) implements RigidGeometry
{
    @Override
    public void computeBoundingBox(Quaterniond rotation, Vector3d min, Vector3d max)
    {
        double maxRadiusSquared = 0.0;
        for (Vector3d vertex : this.vertices)
        {
            double c = vertex.lengthSquared();
            if (c > maxRadiusSquared)
            {
                maxRadiusSquared = c;
            }
        }

        double radius = sqrt(maxRadiusSquared);
        max.set(radius);
        max.negate(min);
    }

    @Override
    public void computeInertiaTensor(double mass, Matrix3d inertiaTensor)
    {
        double unitMass = mass / (double) this.vertices.length;

        inertiaTensor.zero();
        for (Vector3d vertex : this.vertices)
        {
            double x2 = vertex.x * vertex.x,  y2 = vertex.y * vertex.y, z2 = vertex.z * vertex.z;
            double xy = vertex.x * vertex.y, xz = vertex.x * vertex.z, yz = vertex.y * vertex.z;

            inertiaTensor.m00 += y2 + z2;
            inertiaTensor.m01 += xy;
            inertiaTensor.m02 += xz;
            inertiaTensor.m10 += xy;
            inertiaTensor.m11 += x2 + z2;
            inertiaTensor.m12 += yz;
            inertiaTensor.m20 += xz;
            inertiaTensor.m21 += yz;
            inertiaTensor.m22 += x2 + y2;
        }

        inertiaTensor.scale(unitMass);
    }
}
